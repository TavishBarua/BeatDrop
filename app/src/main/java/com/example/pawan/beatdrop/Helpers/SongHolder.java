package com.example.pawan.beatdrop.Helpers;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.example.pawan.beatdrop.R;

/**
 * Created by Pawan on 3/3/2018.
 */

public class SongHolder extends RecyclerView.ViewHolder {

    public TextView songName,artistName,url,songDuration;
    public SongHolder(View itemView) {

        super(itemView);
        songName=(TextView) itemView.findViewById(R.id.txt_song_name);
        artistName=(TextView) itemView.findViewById(R.id.txt_artist_name);
        songDuration=(TextView) itemView.findViewById(R.id.song_duration);
    }
}
