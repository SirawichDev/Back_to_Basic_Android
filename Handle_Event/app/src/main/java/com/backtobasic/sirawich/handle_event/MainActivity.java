package com.backtobasic.sirawich.handle_event;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button bx;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bx = (Button) findViewById(R.id.button);

        bx.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View v){
                
            }
        });
    }
}
