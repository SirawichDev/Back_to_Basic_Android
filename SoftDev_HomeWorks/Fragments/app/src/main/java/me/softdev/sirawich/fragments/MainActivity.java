package me.softdev.sirawich.fragments;

import android.media.Image;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private  Button bt_add,bt_del;
    private String TAG = "Replace With TopSectionFragment";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bt_add = (Button) findViewById(R.id.add);
        bt_del = (Button) findViewById(R.id.delete);

        ShowPic();
        ShowText();

        bt_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getSupportFragmentManager()
                        .beginTransaction()
                        .replace(R.id.fragment_Show,ReplacePicFrag.Pass("From Btn_add"),TAG)
                        .addToBackStack("MyStack")
                        .commit();
            }
        });

        // Delete

    }

    public void ShowPic(){
        FragmentManager fm = getSupportFragmentManager();
        BottomPicFragment bp = (BottomPicFragment) fm.findFragmentById(R.id.pic);
        ImageView im = (ImageView) bp.getView().findViewById(R.id.pu);
        im.setImageResource(R.drawable.dd);
    }
    public void ShowText(){
        BottomPicFragment Ts = new BottomPicFragment();
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ts = fm.beginTransaction();
        ts.replace(R.id.fragment_Show,Ts);
        ts.commit();
    }
}
