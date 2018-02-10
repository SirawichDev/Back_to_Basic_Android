package homework.softdev.sirawich.softdev_homework_1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.util.Log;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.support.design.widget.TextInputLayout;
import android.widget.EditText;
import android.widget.TextView;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button btn1;
    private Button btn2;
    private EditText Edt1;
    private EditText Edt2;
    private TextView status;
    private static final String TAG = "HELLO inp1";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.e(TAG,"First");
        setContentView(R.layout.activity_main);
        btn1 = (Button) findViewById(R.id.btn1);
        btn1.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.e(TAG,"Here is onClick btn1");
                c2finput();
            }
        });
        btn2 = (Button)findViewById(R.id.btn2);
        Log.e(TAG,"test");
        btn2.setOnClickListener(new Button.OnClickListener(){

            public void onClick(View view){
                Log.e(TAG,"Here is onClick btn2");
                f2cinput();
            }
        });
    }

    private void c2finput() {
        if (!input1()) {
            Log.e(TAG,"Go to inp1");
            return;
        }
        Toast.makeText(getApplicationContext(), "Thank You!", Toast.LENGTH_SHORT).show();
    }
    private void f2cinput() {
        if (!input2()) {
            Log.e(TAG,"Go to inp2");
            return;

        }
        Toast.makeText(getApplicationContext(), "Thank You!", Toast.LENGTH_SHORT).show();
    }

    private boolean input1() {
        String regexStr = "^[0-9]*$";
        Log.e(TAG,"Hello inp1");
        Edt1 = (EditText) findViewById(R.id.Editext1);
        while (!Edt1.getText().toString().trim().matches(regexStr)) {
            Toast.makeText(getApplicationContext(), "Sorry you must Input Only The number!!", Toast.LENGTH_LONG).show();
            Edt1.setText("");

        }
        if (Edt1.getText().toString().isEmpty()) {
            Toast.makeText(getApplicationContext(), "Sorry Can't Empty ,Please Enter The number", Toast.LENGTH_LONG).show();
            return false;

        }
        int cal1 = Integer.parseInt(Edt1.getText().toString());
        int conver1= (cal1 * 9/5)+32;
        Edt1.setText(String.valueOf(conver1)+"°F");
        Log.e(TAG,"Go to true");
    return true;
    }

    private boolean input2() {
        String regexStr = "^[0-9]*$";
        Edt2 = (EditText) findViewById(R.id.Editext2);
        if (!Edt2.getText().toString().trim().matches(regexStr)) {
            Toast.makeText(getApplicationContext(), "Sorry you must Input Only The number!!", Toast.LENGTH_LONG).show();
            Edt2.setText("");
            return false;

        }
        if (Edt2.getText().toString().isEmpty()) {
            Toast.makeText(getApplicationContext(), "Sorry Can't Empty ,Please Enter The number", Toast.LENGTH_LONG).show();
            return false;
        }
    return true;
    }
}

