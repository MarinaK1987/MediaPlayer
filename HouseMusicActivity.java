package com.example.android.musicboxproject;


import android.content.Intent;
import android.content.IntentSender;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.BindViews;
import butterknife.ButterKnife;
import butterknife.OnItemClick;

import java.io.Serializable;
import java.util.ArrayList;

public class HouseMusicActivity extends AppCompatActivity {
    final ArrayList<Song> songs = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.songs_list);

       // final ArrayList<Song> songs = new ArrayList<>();
        songs.add(new Song("Can You Feel It", "Fingers Inc", "Ammnesia", "1988", "1:44"));
        songs.add(new Song ("The Bomb", "The Bucketheads", "The Bomb (These Sounds Fall Into My Mind) - The Complete Mixes","1995", "3:24" ));
        songs.add(new Song ("Cola", "CamelPhat", "Annie Mac Presents 2017", "2017","6:55" ));
        songs.add(new Song ("I'll House You", "Jungle Brothers", "Straight out the Jungle","1988", "4:58"));

        ListView listView = (ListView) findViewById(R.id.list);
        SongAdapter adapter = new SongAdapter(this, songs);
        listView.setAdapter(adapter);
    }
    @BindView(R.id.list) ListView listOfSongs;
    @OnItemClick(R.id.list) void onItemClick(int position) {
        //Toast.makeText(this, "You clicked: " + adapter.getItem(position), LENGTH_SHORT).show();
        Song song = songs.get(position);
        Intent intent = new Intent (HouseMusicActivity.this, SongDetalisActivity.class);
        intent.putExtra("song_name_to_show", (Serializable) song);
        startActivity (intent);
        //startActivity(new Intent(this, SongDetalisActivity.class));
    }
}
