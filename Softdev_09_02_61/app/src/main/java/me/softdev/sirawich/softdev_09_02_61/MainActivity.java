package me.softdev.sirawich.softdev_09_02_61;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.*;
import android.widget.Button;
import android.view.View;
public class MainActivity extends AppCompatActivity {
    private Button bx;
    private Button Long;
    private EditText ed;
    private TextView tx;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Long = (Button) findViewById(R.id.btn1);
        Long.setOnLongClickListener(new Button.OnLongClickListener(){

            @Override
            public boolean onLongClick(View v) {
                tx = (TextView)findViewById(R.id.Fuck);
                tx.setText("MIEW MIEW");
                return true;
            }


        });
    }

    public void Showme(View view){
        tx = (TextView)findViewById(R.id.Fuck);
        tx.setText(" ");

    }

}
