package com.backtobasic.sirawich.handle_event;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    private Button bx;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bx = (Button) findViewById(R.id.button);

        bx.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View v){
                TextView xx = (TextView)findViewById(R.id.LeftText);
                xx.setText("GGWP");
            }
        });

       bx.setOnLongClickListener(
               new Button.OnLongClickListener(){
                   @Override
                   public boolean onLongClick(View v) {
                        TextView gg = (TextView)findViewById(R.id.btleftin);
                        gg.setText("WTF");
                        TextView mm = (TextView)findViewById(R.id.btrightbut);
                        mm.setText("Yo");
                        return true;
                   }
       });
    }
}
