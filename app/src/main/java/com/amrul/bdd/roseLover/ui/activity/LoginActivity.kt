package com.amrul.bdd.roseLover.ui.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import com.amrul.bdd.roseLover.R
import com.amrul.bdd.roseLover.util.Util
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        Util.blurBackground(this, blurViewLogin, 10f)

//        val test: EditText = findViewById(R.id.username);

        btnLogin.setOnClickListener{
            val detailIntent = Intent(this, MainActivity::class.java)
//            detailIntent.putExtra("HA", test.text.toString())
            startActivity(detailIntent)
        }
    }
}