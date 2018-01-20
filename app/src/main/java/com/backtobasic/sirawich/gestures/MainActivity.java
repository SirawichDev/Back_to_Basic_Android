package com.backtobasic.sirawich.gestures;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.GestureDetector;
import android.support.v4.view.GestureDetectorCompat;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.view.MotionEvent;

public class MainActivity extends AppCompatActivity implements GestureDetector.OnGestureListener, GestureDetector.OnDoubleTapListener{


    private TextView tx,mt;
    private GestureDetector Gesture;
    private Button bt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tx = (TextView) findViewById(R.id.firstText);
        mt = (TextView) findViewById(R.id.midText);
        bt = (Button) findViewById(R.id.nextbut);
        this.Gesture = new GestureDetector(this,this);
        Gesture.setOnDoubleTapListener(this);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        this.Gesture.onTouchEvent(event);
        return super.onTouchEvent(event);
    }

    @Override
    public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        tx.setText("Singletap");
        return false;
    }

    @Override
    public boolean onDoubleTap(MotionEvent motionEvent) {
        tx.setText("DoubleTap");
        return false;
    }

    @Override
    public boolean onDoubleTapEvent(MotionEvent motionEvent) {
        tx.setText("DoubleTapEvenr");
        return false;
    }

    @Override
    public boolean onDown(MotionEvent motionEvent) {
        mt.setText("onDown");
        return false;
    }

    @Override
    public void onShowPress(MotionEvent motionEvent) {


    }

    @Override
    public boolean onSingleTapUp(MotionEvent motionEvent) {
        return false;
    }

    @Override
    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent1, float v, float v1) {
        mt.setText("Scolling");
        return false;
    }

    @Override
    public void onLongPress(MotionEvent motionEvent) {
        mt.setText("LongPress");

    }

    @Override
    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent1, float v, float v1) {
        return false;
    }
    public void nextac(View view){
    Intent i = new Intent(this,MyFragment.class);
    startActivity(i);
    }
}
