package com.amrul.bdd.roseLover.ui.activity

import android.content.DialogInterface
import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.graphics.toColorInt
import com.amrul.bdd.roseLover.R
import com.amrul.bdd.roseLover.util.Constant
import com.amrul.bdd.roseLover.util.Util
import com.google.android.material.dialog.MaterialAlertDialogBuilder
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        Util.blurBackground(this, blurViewLogin, 10f)

        tvCheckMyLoginData.setOnClickListener {
            val message = "Username1: ${resources.getString(R.string.username)}" + "\nUsername2: ${
                resources.getString(R.string.username2)
            }" + "\nPassword: ${resources.getString(R.string.password)}"
            MaterialAlertDialogBuilder(this)
                .setTitle("Informasi Login")
                .setMessage(message)
                .setNegativeButton("OK") { dialog: DialogInterface, _: Int ->
                    dialog.dismiss()
                }.show()
        }

        btnLogin.setOnClickListener {
            val username = etUsername.text.toString()
            val password = etPassword.text.toString()
            validateCredential(username, password)
        }
    }

    private fun validateCredential(username: String, password: String) {

        if (username.isEmpty()) {
            ilUsername.helperText = Constant.MUST_BE_FIELD
        } else {
            ilUsername.isHelperTextEnabled = false
        }

        if (password.isEmpty()) {
            ilPassword.helperText = Constant.MUST_BE_FIELD
        } else {
            ilPassword.isHelperTextEnabled = false
        }

        val trueUsername = username.isNotEmpty() && username == getString(R.string.username)
        val trueUsername2 = username.isNotEmpty() && username == getString(R.string.username2)
        val truePassword = password.isNotEmpty() && password == getString(R.string.password)

        val login1 = username != getString(R.string.username)
        val login2 = username != getString(R.string.username2)

        when {
            username.isNotEmpty() && (login1 && login2)  ->
                Toast.makeText(this, " Username is wrong", Toast.LENGTH_SHORT).show()

            password.isNotEmpty() && password != getString(R.string.password) ->
                Toast.makeText(this, "Password is wrong", Toast.LENGTH_SHORT).show()

            trueUsername && truePassword -> gotoMainActivity(getString(R.string.name))

            trueUsername2 && truePassword -> gotoMainActivity(getString(R.string.name2))
        }
    }

    private fun gotoMainActivity(username: String) {
        val homeIntent = Intent(this, MainActivity::class.java)
        homeIntent.putExtra(Constant.USERNAME_LOGIN, username)
        startActivity(homeIntent)
        finish()
    }
}