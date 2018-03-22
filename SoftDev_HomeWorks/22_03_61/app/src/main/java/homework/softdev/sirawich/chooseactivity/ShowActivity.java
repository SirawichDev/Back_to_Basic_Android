package homework.softdev.sirawich.chooseactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import java.util.ArrayList;

public class ShowActivity extends AppCompatActivity {

    TextView sh,radio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        ArrayList<String> listItems;
        listItems = getIntent().getStringArrayListExtra("Data");
        String ss=getIntent().getStringExtra("Radio");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show);
        sh = (TextView)findViewById(R.id.Show);
        radio = (TextView)findViewById(R.id.Radio);
        StringBuilder builder = new StringBuilder();
        for (String details : listItems) {
            builder.append(details + ", ");

        }
        sh.setText("You Choose "+listItems.size()+" language: "+builder.toString());
        Log.e("sadas",ss);
        if(ss.contains("Dog")){
            radio.setText("You're Correct!!! It's a "+ss);
        }else{
            radio.setText("You're Wrong!!! It's not a "+ss);
        }

    }
    @Override
    public void onBackPressed() {
        startActivity(new Intent(this, MainActivity.class));
    }
}
