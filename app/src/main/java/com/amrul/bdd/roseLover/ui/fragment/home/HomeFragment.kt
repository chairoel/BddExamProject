package com.amrul.bdd.roseLover.ui.fragment.home

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.amrul.bdd.roseLover.R
import com.amrul.bdd.roseLover.adapter.ListRoseAdapter
import com.amrul.bdd.roseLover.adapter.OnItemClickCallback
import com.amrul.bdd.roseLover.data.Rose
import com.amrul.bdd.roseLover.data.RosesData
import com.amrul.bdd.roseLover.databinding.FragmentHomeBinding
import com.amrul.bdd.roseLover.util.Util
import kotlinx.android.synthetic.main.fragment_home.*
import java.text.SimpleDateFormat
import java.util.*
import kotlin.collections.ArrayList


class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null
    private var list: ArrayList<Rose> = arrayListOf()
    private val listRoseAdapter: ListRoseAdapter = ListRoseAdapter(ArrayList())
    private lateinit var rvRose: RecyclerView
    private lateinit var name: TextView

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val homeViewModel = ViewModelProvider(this)[HomeViewModel::class.java]

        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        val root: View = binding.root

//        val textView: TextView = binding.textHome
//        homeViewModel.text.observe(viewLifecycleOwner) {
//            textView.text = it
//        }
        rvRose = binding.rvRoses
        rvRose.setHasFixedSize(true)
        list = RosesData.listData
        showRecyclerList(list)
        return root
    }

    override fun onResume() {
        super.onResume()
        setAppBar()
    }
    @SuppressLint("SimpleDateFormat")
    private fun setAppBar() {
        val nameProfile: String = "Chairul Amri"
        if (nameProfile != null) {
            tvProfileName.text = String.format("Hello, %s!", Util.toCamelCase(nameProfile))
        } else {
            tvProfileName.text = getString(R.string.dummy_name)
        }

        val dateNow = Date()
        val simpleDateFormat = SimpleDateFormat("E, MMM dd yyyy")
        tvDateNow.text = simpleDateFormat.format(dateNow)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    private fun showRecyclerList(data: List<Rose>) {
        rvRose.layoutManager = LinearLayoutManager(context)
        rvRose.adapter = listRoseAdapter
        listRoseAdapter.setItems(data)
        listRoseAdapter.setOnItemClickCallback(object : OnItemClickCallback {
            override fun onItemClicked(data: Rose) {
                showSelectedHero(data)
            }
        })
    }

    private fun showSelectedHero(hero: Rose) {
        Toast.makeText(context, "Kamu memilih " + hero.name, Toast.LENGTH_SHORT).show()
    }

}