package com.amrul.bdd.roseLover.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.amrul.bdd.roseLover.R
import com.amrul.bdd.roseLover.data.Rose
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class ListRoseAdapter(
    private var listHero: ArrayList<Rose>
) : RecyclerView.Adapter<ListRoseAdapter.ListViewHolder>() {

    private lateinit var onItemClickCallback: OnItemClickCallback
    fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_row_rose, parent, false)
        return ListViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val hero = listHero[position]

        Glide.with(holder.itemView.context)
            .load(hero.photo)
            .apply(RequestOptions().fitCenter())
            .into(holder.imgPhoto)

        holder.itemView.setOnClickListener {
            onItemClickCallback.onItemClicked(listHero[position])
        }
    }

    override fun getItemCount(): Int {
        return listHero.size
    }

    fun getItem(index: Int): Rose {
        return listHero[index];
    }

    fun getItems(): List<Rose?> {
        return listHero
    }

    fun setItems(list: List<Rose>) {
        listHero = list as ArrayList<Rose>
        notifyDataSetChanged()
    }

    inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var imgPhoto: ImageView = itemView.findViewById(R.id.imgItemPhoto)
    }
}