package me.softdev.kate.kate;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    String[] Name = {"Tennis","Basketball","Foor ball","Run","Swim","Hocky"};
    String[] Descr = {"Often","Sometimes","Often","Sometimes","Sometimes","Sometimes"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView Ls = (ListView)findViewById(R.id.Listme);
        CustomAdapter cs = new CustomAdapter();
        Ls.setAdapter(cs);


    }

    class CustomAdapter extends BaseAdapter{

        @Override
        public int getCount() {
            return 1;
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            view = getLayoutInflater().inflate(R.layout.customlayout, null);

            ImageView imgview = (ImageView)view.findViewById(R.id.pic1);
            TextView header = (TextView)view.findViewById(R.id.header);
            TextView description = (TextView)view.findViewById(R.id.Descrip);
            View root = imgview.getRootView();
            if(i%2==0) {
                root.setBackgroundColor(getResources().getColor(android.R.color.holo_blue_dark));
            }else {
                root.setBackgroundColor(getResources().getColor(android.R.color.tertiary_text_dark));
            }

            header.setText(Name[i]);
            description.setText(Descr[i]);
            return view;
        }
    }
}

