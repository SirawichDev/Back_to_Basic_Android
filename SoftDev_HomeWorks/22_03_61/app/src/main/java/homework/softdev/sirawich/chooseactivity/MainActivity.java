package homework.softdev.sirawich.chooseactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    CheckBox ck1,ck2,ck3,ck4;
    RadioGroup radioGroup;
    RadioButton radioButton;
    String radi;
    ArrayList<String> selectedItems = new ArrayList<String>();
    public static String TAG = "FOOOOOOOO";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void Reset(View v){
        ck1 = (CheckBox)findViewById(R.id.ck1);
        ck2 = (CheckBox)findViewById(R.id.ck2);
        ck3 = (CheckBox)findViewById(R.id.ck3);
        ck4 = (CheckBox)findViewById(R.id.ck4);
        radioGroup = (RadioGroup) findViewById(R.id.rad1);
        radioGroup.clearCheck();
        if(ck1.isChecked()) {
          ck1.toggle();
        }if(ck2.isChecked()) {
            ck2.toggle();
        }
        if(ck3.isChecked()) {
            ck3.toggle();
        }
        if(ck4.isChecked()) {
            ck4.toggle();
        }
    }
    public void Result(View v){
        radioGroup = (RadioGroup) findViewById(R.id.rad1);
    ck1 = (CheckBox)findViewById(R.id.ck1);
    ck2 = (CheckBox)findViewById(R.id.ck2);
    ck3 = (CheckBox)findViewById(R.id.ck3);
    ck4 = (CheckBox)findViewById(R.id.ck4);
        int selectedId = radioGroup.getCheckedRadioButtonId();
        radioButton = (RadioButton) findViewById(selectedId);
       radi= (String) radioButton.getText();
        Log.e(TAG,radi);
    if(ck1.isChecked()) {
        String ad = (String) ck1.getText();
        Log.e(TAG,ad);
        selectedItems.add(ad);
    }if(ck2.isChecked()) {
            String ac = (String) ck2.getText();
            Log.e(TAG,ac);
            selectedItems.add(ac);
    }
    if(ck3.isChecked()) {
            String ae = (String) ck3.getText();
         Log.e(TAG,ae);
            selectedItems.add(ae);
    }
    if(ck4.isChecked()) {
            String ag = (String) ck4.getText();
                Log.e(TAG,ag);
            selectedItems.add(ag);
    }
        Intent i = new Intent(this,ShowActivity.class);
        Bundle extras = new Bundle();

        i.putStringArrayListExtra("Data", selectedItems);
        i.putExtra("Radio", radi);
        startActivity(i);
    }
}
