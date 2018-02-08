package com.backtobasic.sirawich.text_animation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void ChoosingClick (View view){
        TextView Showme = (TextView)findViewById(R.id.showme);
        Spinner atod = (Spinner)findViewById(R.id.sp);
        String show = String.valueOf(atod.getSelectedItem());
        Showme.setText(show);
    }
}
