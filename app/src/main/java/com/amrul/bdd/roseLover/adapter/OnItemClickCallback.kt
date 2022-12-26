package com.amrul.bdd.roseLover.adapter

import com.amrul.bdd.roseLover.data.Rose

interface OnItemClickCallback {
    fun onItemClicked(data: Rose)
    fun onItemLongClicked(data: Rose)
}