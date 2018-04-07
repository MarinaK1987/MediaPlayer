package com.example.android.musicboxproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class PopMusicActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.songs_list);

        final ArrayList<Song> songs = new ArrayList<>();
        songs.add(new Song("Havana", "Camila Cabello", "Camila", "2018", "3:45"));
        songs.add(new Song ("Shape of You", "Ed Shreeran", "Divide","2017", "3:44" ));
        songs.add(new Song ("Perfect", "Ed Shreeran", "Divide", "2017","4:39" ));
        songs.add(new Song ("New Rules", "Dua Lipa", "Dua Lipa","2017", "4:37"));

        ListView listView = (ListView) findViewById(R.id.list);
        SongAdapter adapter = new SongAdapter(this, songs);
        listView.setAdapter(adapter);
    }
}
