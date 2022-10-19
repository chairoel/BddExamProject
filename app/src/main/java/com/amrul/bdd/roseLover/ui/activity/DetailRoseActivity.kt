package com.amrul.bdd.roseLover.ui.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import android.widget.Toolbar
import com.amrul.bdd.roseLover.R
import com.amrul.bdd.roseLover.data.Rose
import com.amrul.bdd.roseLover.util.Constant
import kotlinx.android.synthetic.main.activity_detail_rose.*
import kotlinx.android.synthetic.main.custom_app_bar.*

class DetailRoseActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_rose)
        setSupportActionBar(toolbarTitleAppBar)
        btnBackAppBar.setOnClickListener { onBackPressed() }

        val item: Rose = intent.getParcelableExtra<Rose>(Constant.ROSE_ITEM) as Rose

        toolbarTitleAppBar.title = item.name
        tvRoseDetail.text = item.detail
        tvRoseColorDetail.text = item.color
        item.photo.let {
            ivRoseDetail.setImageResource(it)
        }

    }
}