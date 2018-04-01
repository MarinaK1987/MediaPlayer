package com.example.android.musicboxproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

import butterknife.BindView;

public class MetalMusicActivity extends AppCompatActivity {
    //@BindView(R.id.list) ListView list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.songs_list);

        final ArrayList<Song> songs = new ArrayList<>();
        songs.add(new Song("Don't cry", "Gun's&Roses", "17/09/1991", "4:45"));

       ListView listView = (ListView) findViewById(R.id.list);
       SongAdapter adapter = new SongAdapter(this, songs);
       listView.setAdapter(adapter);
    }
}
