package homework.softdev.sirawich.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Calculator extends AppCompatActivity {
    int i=0;
   private Button one,two,three,four,five,six,seven,eight,nine,zero;
   private Button clear,add,equal,sub,cross,div,mod,neg,dot;
   double val,val2;
   boolean wantadd,wantsub,wantcross,first,wantdiv,wantmod,wantneg;
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
        clear = (Button)findViewById(R.id.ac);
        add = (Button)findViewById(R.id.plus);
        equal = (Button)findViewById(R.id.equal);
        sub = (Button)findViewById(R.id.sub);
        cross = (Button)findViewById(R.id.cross);
        div = (Button)findViewById(R.id.divide);
        mod = (Button)findViewById(R.id.mod);
        neg = (Button)findViewById(R.id.neg);
        dot = (Button)findViewById(R.id.dot);

        screen.setText("0");
        first=true;
        one.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View view) {
                if(first==true) {
                    screen.setText("");
                    first=false;
                }
                int tmp = 1;
                screen.setText(screen.getText()+"1");
            }
        });
        two.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View view) {
                if(first==true) {
                    screen.setText("");
                    first=false;
                }
                int tmp = 2;
                screen.setText(screen.getText()+"2");
            }
        });
        three.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View view) {
                if(first==true) {
                    screen.setText("");
                    first=false;
                }
                int tmp = 2;
                screen.setText(screen.getText()+"3");
            }
        });
        four.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View view) {
                if(first==true) {
                    screen.setText("");
                    first=false;
                }
                int tmp = 2;
                screen.setText(screen.getText()+"4");
            }
        });
        five.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View view) {
                if(first==true) {
                    screen.setText("");
                    first=false;
                }
                int tmp = 2;
                screen.setText(screen.getText()+"5");
            }
        });
        six.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View view) {
                if(first==true) {
                    screen.setText("");
                    first=false;
                }

                screen.setText(screen.getText()+"6");
            }
        });
        seven.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View view) {
                if(first==true) {
                    screen.setText("");
                    first=false;
                }

                screen.setText(screen.getText()+"7");
            }
        });
        eight.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View view) {
                if(first==true) {
                    screen.setText("");
                    first=false;
                }

                screen.setText(screen.getText()+"8");
            }
        });
        nine.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View view) {
                if(first==true) {
                    screen.setText("");
                    first=false;
                }

                screen.setText(screen.getText()+"9");
            }
        });
        zero.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View view) {
                if(first==true) {
                    screen.setText("");
                    first=false;
                }

                screen.setText(screen.getText()+"0");
            }
        });
        add.setOnClickListener(new Button.OnClickListener(){
           @Override
            public void onClick(View v){

               if(screen==null){
                   screen.setText("");
               }
               else{
                    val = Float.parseFloat(screen.getText()+"");
                    wantadd=true;
                    screen.setText(null);
               }
           }
        });
        sub.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v){
                if(screen==null){
                    screen.setText("");
                }
                else{
                    val = Float.parseFloat(screen.getText()+"");
                    wantsub=true;
                    screen.setText(null);
                }
            }
        });
        cross.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v){
                if(screen==null){
                    screen.setText("");
                }
                else if(equal!=null){
                    val = Float.parseFloat(screen.getText()+"");
                    wantcross=true;
                    screen.setText(null);
                }else{
                    val = Float.parseFloat(screen.getText()+"");
                    wantcross=true;
                    screen.setText(null);
                }

            }
        });
        div.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v){
                if(screen==null){
                    screen.setText("");
                }
                else if(equal!=null){
                    val = Float.parseFloat(screen.getText()+"");
                    wantdiv=true;
                    screen.setText(null);
                }else{
                    val = Float.parseFloat(screen.getText()+"");
                    wantdiv=true;
                    screen.setText(null);
                }

            }
        });
        dot.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v){
                if(screen==null){
                    screen.setText("");
                }else{
                    val = Float.parseFloat(screen.getText()+"");
                    wantneg=true;
                    screen.setText(Double.valueOf(val).intValue() +".");
                }

            }
        });
        mod.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v){
                if(screen==null){
                    screen.setText("");
                }
                else if(equal!=null){
                    val = Float.parseFloat(screen.getText()+"");
                    wantmod=true;
                    screen.setText(null);
                }else{
                    val = Float.parseFloat(screen.getText()+"");
                    wantmod=true;
                    screen.setText(null);
                }

            }
        });

        neg.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v) {
                if (screen == null) {
                    screen.setText("");

                } else if(i % 2 == 0) {

                    val = Float.parseFloat(screen.getText() + "");
                    wantneg = true;
                    screen.setText("-" + Double.valueOf(val).intValue());
                    i++;
                }
                    else{

                        wantneg = true;
                        screen.setText("" + Double.valueOf(val).intValue());
                        val = Float.parseFloat(screen.getText() + "");
                        i++;
                    }
                }

        });
        clear.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View view) {
                int tmp = 2;
                if(first==false) {
                    screen.setText("");
                    first=true;
                }
                screen.setText("0");
            }
        });

        equal.setOnClickListener(new Button.OnClickListener(){
           @Override
            public void onClick(View v){
               val2 = Double.parseDouble(screen.getText()+"");
               if(wantadd==true) {

                       screen.setText((val + val2 + ""));
                       wantadd = false;

               }
               if(wantsub==true){
                   if(wantneg==true){
                       screen.setText(String.format("%.2f", -val-val2)+"");
                       wantsub=false;
                   }
                   screen.setText(val-val2+"");
                   wantsub=false;
               }
               if(wantcross==true) {
                   if (wantneg == true) {
                       screen.setText(String.format("%.2f", -val * val2) + "");
                       wantcross = false;
                   }
                   screen.setText(val * val2 + "");
                   wantcross = false;
               }
               if(wantdiv==true) {
                   if (wantneg == true) {
                       screen.setText(String.format("%.1f", -val / val2) + "");
                       wantdiv = false;
                   }
                   screen.setText(val/val2+"");
                   wantdiv = false;
               }
               if(wantmod==true){
                   screen.setText(String.format("%.2f", val%val2)+"");
                   wantmod = false;
               }

           }
        });
    }



}
