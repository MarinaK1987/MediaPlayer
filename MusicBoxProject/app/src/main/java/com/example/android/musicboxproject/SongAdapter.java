package com.example.android.musicboxproject;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.BindViews;

public class SongAdapter extends ArrayAdapter<Song>{
    //private int mBackgroundColor;

    @BindView(R.id.song_name) TextView songName;
    @BindView(R.id.band_name) TextView bandName;
    @BindView(R.id.published_date) TextView publishedDate;
    @BindView(R.id.length) TextView length;

    //@BindView(R.id.text_container) View textContainer;

    public SongAdapter(Activity Activity, ArrayList<Song> songs){
        super (Activity, 0, songs);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        Song currentSong = getItem(position);

        // set this text on the number TextView
        TextView songNameTest = listItemView.findViewById(R.id.song_name);
        TextView bandNameTest = listItemView.findViewById(R.id.band_name);
        songNameTest.setText(currentSong.getmName());
        bandNameTest.setText(currentSong.getmBandName());
        //publishedDate.setText(currentSong.getmPublishedDate());
      //  length.setText(currentSong.getLength());

        // Return the whole list item layout so that it can be shown in the ListView
       // int color = ContextCompat.getColor(getContext(), mBackgroundColor);
       // textContainer.setBackgroundColor(color);

        return listItemView;
    }
}
