package com.example.m457er;

import androidx.appcompat.app.AppCompatActivity;
import android.graphics.Point;
import android.view.Display;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private Boxdrop mBoxdrop;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Display display = getWindowManager().getDefaultDisplay();
        Point size = new Point();
        display.getSize(size);

        mBoxdrop = new Boxdrop(this, size.x, size.y);
        setContentView(mBoxdrop);
    }

    @Override
    protected void onResume() {
        super.onResume();
        mBoxdrop.resume();
    }

    @Override
    protected void onPause() {
        super.onPause();
        mBoxdrop.pause();
    }
}