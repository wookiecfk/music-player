package com.noparticularcompany.musicplayer;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.SeekBar;


public class CustomSeekBar extends SeekBar {
    public CustomSeekBar(Context context) {
        super(context);
    }

    public CustomSeekBar(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public CustomSeekBar(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

//    @Override
//    public boolean onTouchEvent(MotionEvent event) {
//        if (!mIsUserSeekable || !isEnabled()) {
//            return false;
//        }
//        switch (event.getAction()) {
//            case MotionEvent.ACTION_DOWN:
//                setPressed(true);
//                onStartTrackingTouch();
//                trackTouchEvent(event);
//                break;
//            case MotionEvent.ACTION_MOVE:
//                trackTouchEvent(event);
//                attemptClaimDrag();
//                break;
//            case MotionEvent.ACTION_UP:
//                trackTouchEvent(event);
//                onStopTrackingTouch();
//                setPressed(false);
//                // ProgressBar doesn't know to repaint the thumb drawable
//                // in its inactive state when the touch stops (because the
//                // value has not apparently changed)
//                invalidate();
//                break;
//            case MotionEvent.ACTION_CANCEL:
//                onStopTrackingTouch();
//                setPressed(false);
//                invalidate(); // see above explanation
//                break;
//        }
//        return true;
//    }
}
