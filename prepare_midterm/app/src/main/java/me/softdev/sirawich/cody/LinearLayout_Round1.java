package me.softdev.sirawich.cody;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LinearLayout_Round1 extends AppCompatActivity {

    Button ck1,ck2;
    EditText edt1;
    public final String TAG="From Check1";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linear_layout__round1);
        ck1 = (Button)findViewById(R.id.check1);
        edt1 = (EditText)findViewById(R.id.edit1);
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
    }
    public void Clear(View v){
        edt1.setText("");
    }
}
