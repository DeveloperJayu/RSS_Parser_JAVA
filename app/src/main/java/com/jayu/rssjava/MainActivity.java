package com.jayu.rssjava;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    String rssLink ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnCinemaBlend = findViewById(R.id.btnCinemaBlend);
        btnCinemaBlend.setOnClickListener(this);

        rssLink ="https://www.rediff.com/rss/moviesreviewsrss.xml";
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.btnCinemaBlend) {
            startActivity(new Intent(MainActivity.this, RSSFeedActivity.class).putExtra("rssLink", rssLink));
        }
    }
}

