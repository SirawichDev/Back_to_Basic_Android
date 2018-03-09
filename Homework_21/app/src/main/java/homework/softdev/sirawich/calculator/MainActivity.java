package homework.softdev.sirawich.calculator;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    CheckBox ch;
    CharSequence text = "Clicked";

    Context context = getApplicationContext();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final CheckBox checkBox = (CheckBox) findViewById(R.id.xx);
        checkBox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(((checkBox)v).is
            }
        });

    }
}
}
        }



    public void toCal(View v){
        Intent i = new Intent(this,Calculator.class);
        startActivity(i);

    }


}
