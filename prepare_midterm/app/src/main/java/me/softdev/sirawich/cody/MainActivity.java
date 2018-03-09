package me.softdev.sirawich.cody;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    CheckBox cb1,cb2;
    Toast t1,t2;
    public static final String TAG = "From CheckBox 1";
    public static final String TAG2 = "From CheckBox 2";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cb1 = (CheckBox)findViewById(R.id.ck1);
        cb1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton cb1, boolean b) {
                if(b == true) {
                    Log.i(TAG, "onCheckedChanged: Click me ");
                    t1 = Toast.makeText(getApplicationContext(),"Clicked",Toast.LENGTH_SHORT);
                    t1.show();
                }
                else
                    Log.i(TAG, "onCheckedChanged: UnClick me ");
                t1 = Toast.makeText(getApplicationContext(),"UnClicked",Toast.LENGTH_SHORT);
                t1.show();
            }
        });

        cb2 = (CheckBox)findViewById(R.id.ck2);
        cb2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton cb2,boolean c) {
                if (c == true) {
                    Log.i(TAG2,"Clicked me");
                    t2 = Toast.makeText(getApplicationContext(), "Clicked", Toast.LENGTH_SHORT);
                    t2.show();
                } else
                    Log.i(TAG2,"UnClicked me");
                    t2 = Toast.makeText(getApplicationContext(), "UnClicked", Toast.LENGTH_SHORT);
                t2.show();

            }
        });
        }

    }

