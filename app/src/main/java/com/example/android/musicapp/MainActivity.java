package com.example.android.musicapp;

import android.app.ListActivity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // This ArrayList contains all Songs.
        ArrayList<Song> songs = new ArrayList<>();
        songs.add(new Song("So Far Away", "Brothers In Arms", R.drawable.albumone));
        songs.add(new Song("Money For Nothing", "Brothers In Arms", R.drawable.albumone));
        songs.add(new Song("Walk Of Life", "Brothers In Arms", R.drawable.albumone));
        songs.add(new Song("Sultans Of Swing", "Sultans Of Swing", R.drawable.albumtwo));
        songs.add(new Song("Lady Writer", "Sultans Of Swing", R.drawable.albumtwo));
        songs.add(new Song("Romeo And Juliet", "Sultans Of Swing", R.drawable.albumtwo));
        songs.add(new Song("Down To The Waterline", "Dire Straits", R.drawable.albumthree));
        songs.add(new Song("Setting Me Up", "Dire Straits", R.drawable.albumthree));
        songs.add(new Song("Water Of Love", "Dire Straits", R.drawable.albumthree));
        songs.add(new Song("Tunnel of Love", "Making Movies", R.drawable.albumfour));
        songs.add(new Song("Skateaway", "Making Movies", R.drawable.albumfour));
        songs.add(new Song("Expresso Love", "Making Movies", R.drawable.albumfour));


        SongAdapter Song = new SongAdapter(this, songs);

        // Get a reference to the GridView, and attach the adapter to the gridView.
        final GridView gridView = findViewById(R.id.gridSongs);
        gridView.setAdapter(Song);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(MainActivity.this, PlaySong.class);
                intent.putExtra("vSongTitle", ((Song) gridView.getItemAtPosition(i)).getSongTitle());
                intent.putExtra("vAlbumTitle", ((Song) gridView.getItemAtPosition(i)).getAlbumTitle());
                intent.putExtra("AlbumImage", ((Song) gridView.getItemAtPosition(i)).getAlbumImage());
                startActivity(intent);
            }
        });
        gridView.setAdapter(Song);
    }

}
