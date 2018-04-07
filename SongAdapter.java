package com.example.android.musicboxproject;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;


public class SongAdapter extends ArrayAdapter<Song>{
    //private int mBackgroundColor;
    private final LayoutInflater inflater;

    public SongAdapter(@NonNull Context context, @NonNull List<Song> objects) {
        super(context, 0, objects);
        this.inflater = LayoutInflater.from(context);
    }

    public LayoutInflater getInflater(){
        return inflater;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View view, @NonNull ViewGroup parent) {
        ViewHolder holder;
        if(view != null) {
            holder = (ViewHolder) view.getTag();
        }
        else {
            view = inflater.inflate(R.layout.list_item, parent,false);
            holder = new ViewHolder(view);
            view.setTag(holder);
                    //LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        Song currentSong = getItem(position);
        holder.songName.setText(currentSong.getmName());
        holder.bandName.setText(currentSong.getmBandName());
//
//        // set this text on the number TextView
//        TextView songNameTest = listItemView.findViewById(R.id.song_name);
//        TextView bandNameTest = listItemView.findViewById(R.id.band_name);
//        songNameTest.setText(currentSong.getmName());
//        bandNameTest.setText(currentSong.getmBandName());
        //publishedDate.setText(currentSong.getmPublishedDate());
      //  length.setText(currentSong.getLength());

        // Return the whole list item layout so that it can be shown in the ListView
       // int color = ContextCompat.getColor(getContext(), mBackgroundColor);
       // textContainer.setBackgroundColor(color);

        return view;
    }
    static final class ViewHolder {
        @BindView(R.id.song_name) TextView songName;
        @BindView(R.id.band_name) TextView bandName;
//        @BindView(R.id.album_name) TextView albumName;
//        @BindView(R.id.length) TextView length;
//        @BindView(R.id.published_year) TextView publishedYear;
        ViewHolder(View view) {
            ButterKnife.bind(this, view);
        }
    }
}


