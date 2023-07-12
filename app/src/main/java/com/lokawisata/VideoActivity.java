package com.lokawisata;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.MediaController;
import android.widget.VideoView;
import android.app.Activity;

public class VideoActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video);

        String videoLink = getIntent().getStringExtra("videoLink");
        int background = getIntent().getIntExtra("background",0);

        VideoView videoView = findViewById(R.id.videoView);
        View rootLayout = findViewById(R.id.root_video);
        rootLayout.setBackgroundResource(background);

        // Persiapan Video
        MediaController mediaController = new MediaController(this);
        mediaController.setAnchorView(videoView);
        videoView.setMediaController(mediaController);

        // Set tautan video yang akan diputar
        Uri videoUri = Uri.parse(videoLink);
        videoView.setVideoURI(videoUri);

        // Mulai pemutaran video
        videoView.start();
    }
}