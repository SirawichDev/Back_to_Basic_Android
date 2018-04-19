package me.softdev.kate.kate;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

public class Result extends AppCompatActivity {
    ImageView il;
    TextView h;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        il = (ImageView) findViewById(R.id.li);
        h = (TextView)findViewById(R.id.h1);
        Bundle bd = getIntent().getExtras();
        if(bd != null){

            int res = bd.getInt("picture");
            String name = bd.getString("Header");
            h.setText("This Places is "+" "+name);
            il.setImageResource(res);
        }
    }
}
