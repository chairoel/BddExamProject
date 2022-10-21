package com.amrul.bdd.roseLover.ui.activity

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.amrul.bdd.roseLover.R
import kotlinx.android.synthetic.main.activity_profile.*
import kotlinx.android.synthetic.main.custom_app_bar.*


class ProfileActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        setSupportActionBar(toolbarTitleAppBar)
        toolbarTitleAppBar.title = "Profile"
        btnBackAppBar.setOnClickListener { onBackPressed() }

        setProfileUI()
        btnSosMed1.setOnClickListener(this)
        btnSosMed2.setOnClickListener(this)
        btnSosMed3.setOnClickListener(this)
        btnSosMed4.setOnClickListener(this)
    }

    private fun setProfileUI() {
        ivProfile.setImageResource(R.drawable.chairul_photo)
        tvName.text = resources.getString(R.string.full_name_data)
        tvPlaceBirth.text = resources.getString(R.string.place_birth_data)
        tvDateBirth.text = resources.getString(R.string.date_birth_data)
        tvGender.text = resources.getString(R.string.gender_data)
        tvAddress.text = resources.getString(R.string.address_data)
        tvEducation.text = resources.getString(R.string.education_data)
        tvEmail.text = resources.getString(R.string.email_data)
    }

    private fun goToUrl(url: String) {
        val uriUrl: Uri = Uri.parse(url)
        val launchBrowser = Intent(Intent.ACTION_VIEW, uriUrl)
        startActivity(launchBrowser)
    }

    override fun onClick(view: View?) {
        when (view) {
            btnSosMed1 -> {
                goToUrl("https://github.com/chairoel")
            }
            btnSosMed2 -> {
                goToUrl("https://discordapp.com/users/254277499326955520")
            }
            btnSosMed3 -> {
                goToUrl("https://www.linkedin.com/in/chairul-amri-40247116b/")
            }
            btnSosMed4 -> {
                goToUrl("https://www.instagram.com/amrii26/")
            }
        }
    }
}