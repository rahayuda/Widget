package com.example.widget;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void video(View view) {
        Intent video = new Intent(MainActivity.this, VideoActivity.class);
        startActivity(video);
    }

    public void web(View view) {
        Intent web = new Intent(MainActivity.this, WebActivity.class);
        startActivity(web);
    }

    public void image(View view) {
        Intent image = new Intent(MainActivity.this, ImageActivity.class);
        startActivity(image);
    }

    public void calendar(View view) {
        Intent calendar = new Intent(MainActivity.this, CalendarActivity.class);
        startActivity(calendar);
    }

    public void other(View view) {
        Intent other = new Intent(MainActivity.this, OtherActivity.class);
        startActivity(other);
    }
}