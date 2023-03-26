package com.example.widget;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class VideoActivity extends AppCompatActivity {

    VideoView videoView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video);

        videoView = (VideoView) findViewById(R.id.videoView);
        videoView.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.video));
        videoView.setMediaController(new MediaController(this));
        videoView.start();

    }
}