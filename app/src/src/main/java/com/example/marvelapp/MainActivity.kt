package com.example.marvelapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_login.*

class MainActivity : AppCompatActivity() {
    var titlename: String? = "Avengers"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_heroes)
        if (intent != null) {
            titlename = intent.getStringExtra( name:"Name")
        }
        title = titlename
    }
}

