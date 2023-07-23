package com.example.loginexample

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class SignUpActivity : AppCompatActivity() {
    private lateinit var phoneEditText: EditText
    private lateinit var passwordEditText: EditText
    private lateinit var emailEditText: EditText
    private lateinit var cityEditText: EditText
    private lateinit var signUpButton: Button
    private  lateinit var checkBox: CheckBox
    private lateinit var loginHyperLink: TextView
    private var phone = ""
    private var password = ""
    private var email = ""
    private var city = ""


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)
        initViews()
        clickSignUpBtn()

    }


    private fun getValue() {
         phone = phoneEditText.text.toString()
         password = passwordEditText.text.toString()
         email = emailEditText.text.toString()
         city = cityEditText.text.toString()
    }

    private fun clickSignUpBtn() {
        signUpButton.setOnClickListener {
            getValue()
            if (phone.isEmpty()) {
                Toast.makeText(this, "please enter phone number", Toast.LENGTH_SHORT).show()
            }
           else if (phone.length < 11) {
                Toast.makeText(this, "please enter valid phone number", Toast.LENGTH_SHORT).show()
            }
           else if (password.isEmpty() ) {
                Toast.makeText(this, "please enter password", Toast.LENGTH_SHORT).show()
        }           else if (password.length < 8 ) {
                Toast.makeText(this, "please enter password at least 8 characters", Toast.LENGTH_SHORT).show()
            }
            else if (email.isEmpty()) {
                Toast.makeText(this, "please enter email", Toast.LENGTH_SHORT).show()
            } else if (!email.contains("@") || !email.contains(".")){
                Toast.makeText(this, "please enter valid email", Toast.LENGTH_SHORT).show()
            }

            else if (city.isEmpty()) {
                Toast.makeText(this, "please enter city", Toast.LENGTH_SHORT).show()
            }
            else if (!checkBox.isChecked) {
                Toast.makeText(this, "please Agree to terms and conditions", Toast.LENGTH_SHORT).show()
            }
            else {
                Toast.makeText(this, "Sign up successfully", Toast.LENGTH_SHORT).show()
                val loginIntent = Intent(this, LoginActivity1::class.java)
                startActivity(loginIntent)

            }
        }
    }

    private fun initViews() {
        phoneEditText = findViewById(R.id.phoneNumberText)
        passwordEditText = findViewById(R.id.passwordText)
        emailEditText = findViewById(R.id.emailText)
        cityEditText = findViewById(R.id.cityText)
        signUpButton = findViewById(R.id.signUpButton)
        checkBox = findViewById(R.id.checkBox)
        loginHyperLink = findViewById(R.id.loginHyperLink)
        val loginIntent = Intent(this, LoginActivity1::class.java)
        loginHyperLink.setOnClickListener {
            startActivity(loginIntent)
        }
    }
}