package com.example.android.musicboxproject;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

public class SongDetalisAdapter extends SongAdapter {
    public SongDetalisAdapter(@NonNull Context context, @NonNull List<Song> objects) {
        super(context, objects);
    }

    public View getView(int position, @Nullable View view, @NonNull ViewGroup parent) {
        ViewHolder holder;
        if(view != null) {
            holder = (ViewHolder) view.getTag();
        }
        else {
            view = getInflater().inflate(R.layout.list_item, parent,false);
            holder = new ViewHolder(view);
            view.setTag(holder);
            //LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        Song currentSong = getItem(position);
        holder.songName.setText(currentSong.getmName());
        holder.bandName.setText(currentSong.getmBandName());
//        holder.albumName.setText(currentSong.getAlbum());
//        holder.publishedYear.setText(currentSong.getmPublishedDate());
//        holder.length.setText(currentSong.getLength());

        return view;
    }
}
