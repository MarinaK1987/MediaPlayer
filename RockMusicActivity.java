package com.example.android.musicboxproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class RockMusicActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.songs_list);

        final ArrayList<Song> songs = new ArrayList<>();
        songs.add(new Song("Don't cry", "Gun's&Roses", "Use Your Illusion", "1991", "4:45"));
        songs.add(new Song ("Bohemian", "Queen", "A Night At The Opera","1975", "6:06" ));
        songs.add(new Song ("Stairway to Heaven", "Led Zeppelin", "Led Zeppelin (Deluxe Edition)", "1971","8:02" ));
        songs.add(new Song ("Smells Like Teen Spirit", "Nirvana", "Nevermind","1991", "4:37"));

        ListView listView = (ListView) findViewById(R.id.list);
        SongAdapter adapter = new SongAdapter(this, songs);
        listView.setAdapter(adapter);
    }
}
