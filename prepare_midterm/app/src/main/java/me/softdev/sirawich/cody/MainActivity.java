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
    private static final String TAG = "From CheckBox 1";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cb1 = (CheckBox)findViewById(R.id.ck1);
        cb1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
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

    }
}
