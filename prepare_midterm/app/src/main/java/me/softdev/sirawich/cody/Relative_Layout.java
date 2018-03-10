package me.softdev.sirawich.cody;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Relative_Layout extends AppCompatActivity {
    Button btn1, btn2, btn3, btn4, btn5, btn6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_relative__layout);
        btn1 = (Button) findViewById(R.id.bt1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast t = Toast.makeText(getApplicationContext(), "btn1 clicked", Toast.LENGTH_SHORT);
                t.show();
            }
        });
    }
    public void bt2click(View view){
        Toast t = Toast.makeText(getApplicationContext(), "btn2 clicked", Toast.LENGTH_SHORT);
        t.show();
    }
}
