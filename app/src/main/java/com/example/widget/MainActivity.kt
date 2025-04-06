package com.example.widget

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun video(view: View?) {
        val video = Intent(this@MainActivity, VideoActivity::class.java)
        startActivity(video)
    }

    fun web(view: View?) {
        val web = Intent(this@MainActivity, WebActivity::class.java)
        startActivity(web)
    }

    fun image(view: View?) {
        val image = Intent(this@MainActivity, ImageActivity::class.java)
        startActivity(image)
    }

    fun calendar(view: View?) {
        val calendar = Intent(this@MainActivity, CalendarActivity::class.java)
        startActivity(calendar)
    }

    fun other(view: View?) {
        val other = Intent(this@MainActivity, OtherActivity::class.java)
        startActivity(other)
    }
}