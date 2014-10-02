package com.noparticularcompany.musicplayer;

import android.app.Activity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends Activity {

    private TextView mCoordinatesX;
    private TextView mCoordinatesY;
    private float mCoordX;
    private float mCoordY;
    private CustomImageView mMainImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mCoordinatesX = (TextView) findViewById(R.id.coordx);
        mCoordinatesY = (TextView) findViewById(R.id.coordy);
        mMainImage = (CustomImageView) findViewById(R.id.main_image);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
//        mCoordX = mMainImage.getCoordX();
//        mCoordY = mMainImage.getCoordY();
        mCoordX = event.getX();
        mCoordY = event.getY();
        mCoordinatesX.setText(Float.toString(mCoordX));
        mCoordinatesY.setText(Float.toString(mCoordY));

        return false;
    }
}
