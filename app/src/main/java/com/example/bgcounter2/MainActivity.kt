package com.example.bgcounter2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    // Create an Intent to start the second activity
    fun userList(view: View) {
        val usersIntent = Intent(this, UsersActivity::class.java)
        startActivity(usersIntent)
    }

}