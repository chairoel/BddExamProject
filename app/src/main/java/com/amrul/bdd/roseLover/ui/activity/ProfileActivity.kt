package com.amrul.bdd.roseLover.ui.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.amrul.bdd.roseLover.R
import kotlinx.android.synthetic.main.custom_app_bar.*

class ProfileActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        setSupportActionBar(toolbarTitleAppBar)
        toolbarTitleAppBar.title = "Profile"
        btnBackAppBar.setOnClickListener { onBackPressed() }
    }
}