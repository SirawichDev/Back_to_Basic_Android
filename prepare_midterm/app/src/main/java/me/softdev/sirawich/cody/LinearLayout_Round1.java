package me.softdev.sirawich.cody;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class LinearLayout_Round1 extends AppCompatActivity {

    Button ck1,ck2,subm;
    CheckBox jav;
    EditText edt1;
    Toast t,t1;
    public final String TAG="From Check1";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linear_layout__round1);
        ck1 = (Button)findViewById(R.id.check1);
        edt1 = (EditText)findViewById(R.id.edit1);
        subm = (Button)findViewById(R.id.submit);
        jav = (CheckBox) findViewById(R.id.java);
        jav.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {

                                           @Override
                                           public void onCheckedChanged(CompoundButton cb, boolean v) {
                                               if (jav.isChecked()) {
                                                   t1 = Toast.makeText(getApplicationContext(), "Checked JAVA", Toast.LENGTH_SHORT);
                                                   t1.show();
                                                   return;
                                               }
                                               t1 = Toast.makeText(getApplicationContext(), "UnClicked Java", Toast.LENGTH_SHORT);
                                               t1.show();

                                           }
                                       });
        ck1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.i(TAG,"CK_1");
               String x= edt1.getText().toString();
               if(x.contains("@")){
                   Toast t = Toast.makeText(getApplicationContext(),"checked!",Toast.LENGTH_SHORT);
                   t.show();
                   return;

               }
                Toast t = Toast.makeText(getApplicationContext(),"clear!",Toast.LENGTH_SHORT);
                t.show();
                edt1.setText("");
            }

        });
        subm.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent i = new Intent(getApplicationContext(),Relative_Layout.class);
                startActivity(i);
            }
        });
    }
    public void Clear(View v){
        edt1.setText("");
    }
    public void RadG1(View v){
        boolean clicked = ((RadioButton) v).isChecked();

        switch (v.getId()){
            case R.id.rad1:
                if (clicked)
                     t = Toast.makeText(getApplicationContext(),"you choose Male!",Toast.LENGTH_SHORT);
                t.show();
                break;
            case R.id.rad2:
                if(clicked)
                     t = Toast.makeText(getApplicationContext(),"you choose Female!",Toast.LENGTH_SHORT);
                t.show();
                break;

        }

        }


}
