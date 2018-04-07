package com.example.android.musicboxproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MetalMusicActivity extends AppCompatActivity {
    //@BindView(R.id.list) ListView list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.songs_list);

        final ArrayList<Song> songs = new ArrayList<>();
        songs.add(new Song("The Number of The beast", "Iron Maiden", "The Number of The beast", "1998", "4:51"));
        songs.add(new Song ("Angel of Death", "Slayer", "Reign in Blood","1986", "4:57" ));
        songs.add(new Song ("One", "Metallica", "...And Justice for all", "1988","7:44" ));
        songs.add(new Song ("Chop Suey!", "System of a Down", "Toxicity","2001", "3:30"));

       ListView listView = (ListView) findViewById(R.id.list);
       SongAdapter adapter = new SongAdapter(this, songs);
       listView.setAdapter(adapter);
    }
}
