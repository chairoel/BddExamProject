package com.amrul.bdd.roseLover.adapter

import android.annotation.SuppressLint
import android.app.Activity
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.amrul.bdd.roseLover.R
import com.amrul.bdd.roseLover.data.Rose
import com.amrul.bdd.roseLover.util.Util
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import eightbitlab.com.blurview.BlurView

class ListRoseAdapter(
    private var activity: Activity,
    private var listRose: ArrayList<Rose>
) : RecyclerView.Adapter<ListRoseAdapter.ListViewHolder>() {

    private lateinit var onItemClickCallback: OnItemClickCallback
    fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = ListViewHolder(
        LayoutInflater.from(parent.context).inflate(R.layout.item_row_rose, parent, false)
    )

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val rose = listRose[position]

        Glide.with(holder.itemView.context)
            .load(rose.photo)
            .apply(RequestOptions().fitCenter())
            .into(holder.imgPhoto)

        holder.itemView.setOnClickListener {
            onItemClickCallback.onItemClicked(listRose[position])
        }

        holder.itemView.setOnLongClickListener {
            onItemClickCallback.onItemLongClicked(listRose[position])
            return@setOnLongClickListener true
        }

        holder.nameRose.text = rose.name

//        if(holder.nameRose.text == "Red Rose"){
//            holder.nameRose.setTextColor(ContextCompat.getColor(context,R.color.color_red1))
//        }

        Util.blurBackground(activity, holder.blurView, 20f)
    }

    override fun getItemCount(): Int {
        return listRose.size
    }

    fun getItem(index: Int): Rose {
        return listRose[index]
    }

    fun getItems(): List<Rose?> {
        return listRose
    }

    @SuppressLint("NotifyDataSetChanged")
    fun setItems(list: List<Rose>) {
        listRose = list as ArrayList<Rose>
        notifyDataSetChanged()
    }

    inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var imgPhoto: ImageView = itemView.findViewById(R.id.imgItemPhoto)
        var nameRose: TextView = itemView.findViewById(R.id.tvNameRome)
        var blurView: BlurView = itemView.findViewById(R.id.blurView)
    }
}