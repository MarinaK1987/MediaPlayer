package com.example.android.musicboxproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import butterknife.BindView;

public class SongDetalisActivity extends AppCompatActivity {

    @BindView(R.id.song_name) TextView songName;
    @BindView(R.id.band_name) TextView bandName;
    @BindView(R.id.album_name) TextView albumName;
    @BindView(R.id.length) TextView length;
    @BindView(R.id.published_year) TextView publishedYear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_song_detalis);

       // String s = getIntent().getStringExtra("song_name_to_show");
        Song song = (Song) getIntent().getSerializableExtra("MyClass");

        LinearLayout listView = (LinearLayout) findViewById(R.id.text_detalis);
        songName.setText(song.getmName());
        bandName.setText(song.getmBandName());
        listView.addView(songName);
        listView.addView(bandName);
       // listView.addView


    }


}
