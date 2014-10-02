package com.noparticularcompany.musicplayer;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.ImageView;

public class CustomImageView extends ImageView {
    private float mCoordX;
    private float mCoordY;
    private Activity currentActivity;

    public CustomImageView(Context context) {
        super(context);
    }

    public CustomImageView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public CustomImageView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        mCoordX=event.getX();
        mCoordY=event.getY();
        return super.onTouchEvent(event);
    }

    public float getCoordX(){
        return mCoordX;
    }

    public float getCoordY(){
        return mCoordY;
    }
}
