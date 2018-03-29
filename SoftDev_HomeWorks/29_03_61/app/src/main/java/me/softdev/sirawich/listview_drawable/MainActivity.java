package me.softdev.sirawich.listview_drawable;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    int[] Image = {R.drawable.bo,R.drawable.mo};
    String[] Name = {"Tennis","Basketball"};
    String[] Descr = {"Often","Sometimes"};

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
            return Image.length;
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

            imgview.setImageResource(Image[i]);
            header.setText(Name[i]);
            description.setText(Descr[i]);
            return view;
        }
    }
}

