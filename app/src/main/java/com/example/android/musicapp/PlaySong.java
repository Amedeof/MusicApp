package com.example.android.musicapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View.OnKeyListener;
import android.widget.ImageView;
import android.widget.TextView;


public class PlaySong extends AppCompatActivity {

    ImageView AlbumImage;
    TextView SongTitle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent i = getIntent();
        String SongTitle = i.getStringExtra("SongTitle");
        TextView textView = new TextView(this);
        textView.setText(SongTitle);
        setContentView(textView);
    }
}
