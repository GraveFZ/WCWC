package com.example.test

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.view.Window
import android.view.WindowManager
import androidx.appcompat.app.AppCompatActivity

class LaunchActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_launch)
        val handler = Handler()
        handler.postDelayed({
            startActivity(Intent(this, SignInActivity::class.java))
            overridePendingTransition(android.R.anim.fade_in,android.R.anim.fade_out)
            finish()
        },2000)
    }

}