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

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ArrayList<Song> songs = new ArrayList<>();
        songs.add(new Song("AB2C", "dAqqq2qwqwqw", R.drawable.direstraits));
        songs.add(new Song("A3BC", "dAqqq3qwqwqw", R.drawable.direstraits));
        songs.add(new Song("A4BC", "dAqq45qqwqwqw", R.drawable.direstraits));
        songs.add(new Song("A5BC", "dAq5qqqwqwqw", R.drawable.direstraits));

        SongAdapter Song = new SongAdapter(this, songs);

        // Get a reference to the ListView, and attach the adapter to the listView.
        final GridView gridView = (GridView) findViewById(R.id.gridSongs);
        gridView.setAdapter(Song);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(MainActivity.this, PlaySong.class);
                intent.putExtra("vSongTitle", gridView.getItemAtPosition(i).toString());
                intent.putExtra("vAlbumTitle", gridView.getItemAtPosition(i).toString());
                startActivity(intent);
            }
        });
        gridView.setAdapter(Song);
    }

}
