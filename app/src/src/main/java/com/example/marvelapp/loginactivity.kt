package com.example.marvelapp

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_login.*
import android.widget.Toast.makeText as makeText1

class loginactivity : AppCompatActivity() {
    lateinit var etUsername:EditText
    lateinit var etPassword:EditText
    lateinit var btnlogin:Button
    lateinit var txtforget:TextView
    lateinit var txtsignup:TextView
    val validusername="Avengers"
    val validpassword=arrayOf("tony","thor","widow")
    lateinit var sharedpref:SharedPreferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        sharedpref = getSharedPreferences(getString(R.string.preferencefile), Context.MODE_PRIVATE)
        setContentView(R.layout.activity_login)
        title = "Log In"
        etUsername = findViewById(R.id.username)
        etPassword = findViewById(R.id.password)
        btnlogin = findViewById(R.id.btnLogin)
        txtforget = findViewById(R.id.txtForgotPassword)
        txtsignup = findViewById(R.id.txtSignUp)

        btnlogin.setOnClickListener {

            val user_name = etUsername.text.toString()
            val pass_name = etPassword.text.toString()
            var nameofavenger = "Avenger"


            if ((user_name == validusername)) {
                if (pass_name == validpassword[1]) {
                    nameofavenger = "thor"
                    intent.putExtra(name:"Name", nameofavenger)
                    startActivity(intent)
                }
            } else if (pass_name == validpassword[0]) {
                nameofavenger = "tony"
                intent.putExtra(name:"Name", nameofavenger)
                startActivity(intent)
            } else if (pass_name == validpassword[2]) {
                nameofavenger = "widow"
                intent.putExtra(name:"Name", nameofavenger)
                startActivity(intent)
            } else {
                Toast.makeText( this@loginactivity,"Clicked on About app",Toast.LENGTH_SHORT).show()
            }
        }
    }
override fun onPause() {
    super.onPause()
    finish()
}
}

