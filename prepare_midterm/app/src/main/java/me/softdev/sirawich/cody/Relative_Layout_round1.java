package me.softdev.sirawich.cody;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class Relative_Layout_round1 extends AppCompatActivity {
    public static String TAG = "From Relative Round1";
    RadioGroup radioGroup;
    Button btnDisplay;
    CheckBox ch1,ch2,ch3;
    RadioButton ch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_relative__layout_round1);
       addListenButt();
    }
    public void addListenButt(){
        radioGroup = (RadioGroup) findViewById(R.id.rg2);
        btnDisplay = (Button)findViewById(R.id.subm);
        ch1 = (CheckBox)findViewById(R.id.php);
        ch2 = (CheckBox)findViewById(R.id.js);
        ch3 = (CheckBox)findViewById(R.id.r);
        final ArrayList<String> n = new ArrayList<String>();
        btnDisplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            if(ch1.isChecked()){
                n.add(ch1.getText().toString());
                Log.i(TAG,"is "+n.get(0));
            }
            if(ch2.isChecked()){
                n.add(ch2.getText().toString());
                Log.i(TAG,"is "+n.get(1));
            }
            }
        });
    }

}
