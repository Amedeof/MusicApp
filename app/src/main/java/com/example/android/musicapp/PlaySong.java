package com.example.android.musicapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnKeyListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;


public class PlaySong extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play_song);
        Intent i = getIntent();
        String SongTitle = i.getStringExtra("vSongTitle");
        TextView textView = findViewById(R.id.SongTitle);
        textView.setText(SongTitle);
        String AlbumTitle = i.getStringExtra("vAlbumTitle");
        TextView textView2 = findViewById(R.id.AlbumTitle);
        textView2.setText(AlbumTitle);
        Integer AlbumImage = i.getIntExtra("AlbumImage", 1);
        ImageView imageView = findViewById(R.id.Album_Image);
        imageView.setImageResource(AlbumImage);

        Button goBack = (Button) findViewById(R.id.gotosongs);

        goBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent start = (new Intent(PlaySong.this, MainActivity.class));
                startActivity(start);
            }
        });

    }
}