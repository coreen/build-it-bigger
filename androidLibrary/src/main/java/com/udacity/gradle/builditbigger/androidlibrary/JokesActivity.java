package com.udacity.gradle.builditbigger.androidlibrary;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class JokesActivity extends AppCompatActivity {
    public static final String JOKE_EXTRA = "joke";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jokes);

        final String joke = getIntent().getStringExtra(JOKE_EXTRA);
        final TextView mJokeText = findViewById(R.id.tv_joke);
        mJokeText.setText(joke);
    }
}
