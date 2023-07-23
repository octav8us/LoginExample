package com.example.loginexample

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class LoginActivity1 : AppCompatActivity() {
    private lateinit var signUpHyperLink: TextView
    private lateinit var loginButton : Button

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login1)
        initViews()
    }

    private fun initViews() {
        signUpHyperLink = findViewById(R.id.signUpHyperLink)
        loginButton = findViewById(R.id.loginButton)
        val signUpIntent = Intent(this, SignUpActivity::class.java)
        val homeIntent = Intent(this, MainActivity::class.java)
        loginButton.setOnClickListener {
            startActivity(homeIntent)
        }

        signUpHyperLink.setOnClickListener {
            startActivity(signUpIntent)
        }
    }
}