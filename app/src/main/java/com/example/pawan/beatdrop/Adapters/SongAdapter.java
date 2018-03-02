package com.example.pawan.beatdrop.Adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.pawan.beatdrop.Helpers.SongHolder;
import com.example.pawan.beatdrop.R;
import com.example.pawan.beatdrop.SongInfo;

import java.util.ArrayList;

/**
 * Created by Pawan on 3/3/2018.
 */

public class SongAdapter extends RecyclerView.Adapter<SongHolder> {

    ArrayList<SongInfo> songs;
    Context context;
    OnitemClickListener onitemClickListener;

    public SongAdapter(Context context,ArrayList<SongInfo> songs) {
        this.songs = songs;
        this.context = context;
    }
    public interface OnitemClickListener
    {
        void onitemClick(View v,SongInfo obj,int position);

    }
    public void setOnitemClickListener(OnitemClickListener onitemClickListener)
    {
        this.onitemClickListener=onitemClickListener;
    }

    @Override
    public SongHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View myview= LayoutInflater.from(context).inflate(R.layout.item_songs_list,parent,false);
        return new SongHolder(myview);
    }

    @Override
    public void onBindViewHolder(SongHolder holder, int position) {
    SongInfo c= songs.get(position);
    holder.songName.setText(c.songName);
    holder.artistName.setText(c.artistName);
    holder.songDuration.setText(c.songDuration);
    }

    @Override
    public int getItemCount() {
        return 0;
    }
}

