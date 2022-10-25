package com.amrul.bdd.roseLover.ui.fragment.knowledge

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.transition.AutoTransition
import android.transition.TransitionManager
import android.view.LayoutInflater
import android.view.SurfaceControl.Transaction
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import androidx.cardview.widget.CardView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.amrul.bdd.roseLover.R
import com.amrul.bdd.roseLover.databinding.FragmentKnowledgeBinding
import kotlinx.android.synthetic.main.fragment_knowledge.*
import kotlin.properties.Delegates

class KnowledgeFragment : Fragment() {

    private var _binding: FragmentKnowledgeBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val knowledgeViewModel =
            ViewModelProvider(this)[KnowledgeViewModel::class.java]

        _binding = FragmentKnowledgeBinding.inflate(inflater, container, false)
        val root: View = binding.root

//        val textView: TextView = binding.textDashboard
//        knowledgeViewModel.text.observe(viewLifecycleOwner) {
//            textView.text = it
//        }

        binding.tvTitleKnowledge.setOnClickListener {
            expandedView(binding.expandableLayout, binding.cvKnowledge, binding.ivArrow)
        }

        binding.tvTitleKnowledge2.setOnClickListener {
            expandedView(binding.expandableLayout2, binding.cvKnowledge2, binding.ivArrow2)
        }

        binding.tvTitleKnowledge3.setOnClickListener {
            expandedView(binding.expandableLayout3, binding.cvKnowledge3, binding.ivArrow3)
        }

        binding.expandableLayout3.setOnClickListener {
            val url = "https://santaidamai.com/jenis-bunga-mawar/"
            val uriUrl: Uri = Uri.parse(url)
            val launchBrowser = Intent(Intent.ACTION_VIEW, uriUrl)
            startActivity(launchBrowser)
        }

        return root
    }

    private fun expandedView(
        expandableLayout: LinearLayout,
        cvKnowledge: CardView,
        ivArrow: ImageView
    ) {
        if (expandableLayout.visibility == View.VISIBLE) {
            expandableLayout.visibility = View.GONE
            ivArrow.setImageResource(R.drawable.ic_arrow_down_24)
        } else {
            TransitionManager.beginDelayedTransition(cvKnowledge, AutoTransition())
            expandableLayout.visibility = View.VISIBLE
            ivArrow.setImageResource(R.drawable.ic_arrow_right_24)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}