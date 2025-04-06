package com.example.widget

import android.net.Uri
import android.os.Bundle
import android.view.View
import android.widget.MediaController
import android.widget.VideoView
import androidx.appcompat.app.AppCompatActivity

class VideoActivity : AppCompatActivity() {
    var videoView: VideoView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_video)

        videoView = findViewById<View>(R.id.videoView) as VideoView
        videoView!!.setVideoURI(Uri.parse("android.resource://" + packageName + "/" + R.raw.video))
        videoView!!.setMediaController(MediaController(this))
        videoView!!.start()
    }
}