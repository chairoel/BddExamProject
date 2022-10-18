package com.amrul.bdd.roseLover.ui.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.amrul.bdd.roseLover.R
import com.amrul.bdd.roseLover.util.Constant

class DetailRoseActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_rose)

        val name = intent.getStringExtra(Constant.ROSE_NAME)
        val detail = intent.getStringExtra(Constant.ROSE_DETAIL)
        val color = intent.getStringExtra(Constant.ROSE_COLOR)

        var popup = "name: $name \ndetail: $detail \ncolor: $color"
        Toast.makeText(this, popup, Toast.LENGTH_SHORT).show()
    }
}