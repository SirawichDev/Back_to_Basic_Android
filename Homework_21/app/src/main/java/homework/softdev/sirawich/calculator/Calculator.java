package homework.softdev.sirawich.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Calculator extends AppCompatActivity {
   private Button one,two,three,four,five,six,seven,eight,nine,zero;
    TextView screen;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
        screen = (EditText)findViewById(R.id.screen);
        one = (Button)findViewById(R.id.one);
        two = (Button)findViewById(R.id.two);
        three = (Button)findViewById(R.id.three);
        four = (Button)findViewById(R.id.four);
        five = (Button)findViewById(R.id.five);
        six = (Button)findViewById(R.id.six);
        seven = (Button)findViewById(R.id.sev);
        eight = (Button)findViewById(R.id.eight);
        nine = (Button)findViewById(R.id.nine);
        zero = (Button)findViewById(R.id.zero);

        one.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View view) {
                int tmp = 1;
                screen.setText(screen.getText()+"1");
            }
        });
        two.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View view) {
                int tmp = 2;
                screen.setText(screen.getText()+"2");
            }
        });
        three.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View view) {
                int tmp = 2;
                screen.setText(screen.getText()+"3");
            }
        });
        four.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View view) {
                int tmp = 2;
                screen.setText(screen.getText()+"4");
            }
        });
        five.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View view) {
                int tmp = 2;
                screen.setText(screen.getText()+"5");
            }
        });
        six.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View view) {
                int tmp = 2;
                screen.setText(screen.getText()+"6");
            }
        });
        seven.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View view) {
                int tmp = 2;
                screen.setText(screen.getText()+"7");
            }
        });
        eight.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View view) {
                int tmp = 2;
                screen.setText(screen.getText()+"8");
            }
        });
        nine.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View view) {
                int tmp = 2;
                screen.setText(screen.getText()+"9");
            }
        });
        zero.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View view) {
                int tmp = 2;
                screen.setText(screen.getText()+"0");
            }
        });
    }



}
