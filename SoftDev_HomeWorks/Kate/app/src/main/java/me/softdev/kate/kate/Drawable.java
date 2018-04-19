package me.softdev.kate.kate;

import android.content.Intent;
import android.graphics.drawable.Icon;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;


public class Drawable extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
    private DrawerLayout mDrawerLayout;
    private ActionBarDrawerToggle mToggle;
     Toolbar mToolbar = null;
    NavigationView navigationView;
    private RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drawable);
        recyclerView = (RecyclerView)findViewById(R.id.recycler);
        //set Adapter ลงไปใน recyclerview


        recyclerView.setAdapter(new RecyclerViewAdapter());
        mToolbar = (Toolbar) findViewById(R.id.nav_action);
        setSupportActionBar(mToolbar);
        mDrawerLayout = (DrawerLayout)findViewById(R.id.drawableLayout);
        mToggle = new ActionBarDrawerToggle(this,mDrawerLayout,R.string.opent,R.string.close);
        mDrawerLayout.addDrawerListener(mToggle);
        mToggle.syncState();
        navigationView = (NavigationView)findViewById(R.id.navigation_view);
        navigationView.setNavigationItemSelectedListener(this);
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


    }
    public class RecyclerViewAdapter extends RecyclerView.Adapter<ViewHolder>{

        private String[] Header_name = {"Coffeeshop","My house","Haircut"};
        private int[] images={R.drawable.sc,R.drawable.sd,R.drawable.ss};

        @Override
        public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            //โหลด layout

            View v = LayoutInflater.from(getApplicationContext()).inflate(R.layout.listview,parent,false);

            return new ViewHolder(v);
        }

        @Override
        public void onBindViewHolder(final ViewHolder holder, final int position) {
            //update content

            holder.headers.setText(Header_name[position]);
            holder.pic.setImageResource(images[position]);
            Log.e("TAG", String.valueOf(holder.pic.getId()));
            holder.btn.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View view) {
                    Intent i = new Intent(view.getContext(),Result.class);
                    i.putExtra("Header",Header_name[position]);
                    i.putExtra("picture",images[position]);
                    startActivity(i);
                }
            });
        }

        @Override
        public int getItemCount() {
            return Header_name.length;
        }
    }
    //class view holder เหมือน custom listview

    public class ViewHolder extends RecyclerView.ViewHolder{


        TextView headers;
        Button btn;
        ImageView pic;



        public ViewHolder(View itemView) {
            super(itemView);

            headers = (TextView) itemView.findViewById(R.id.header);
            btn = (Button) itemView.findViewById(R.id.btn_click);
            pic = (ImageView) itemView.findViewById(R.id.img1);


        }
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(mToggle.onOptionsItemSelected(item)){

            return true;

        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        int id = item.getItemId();
        switch (id) {

            case R.id.nav_favor: {
                Intent g = new Intent(Drawable.this,Result.class);
                startActivity(g);
                break;
            }
        }
        //close navigation drawer

        mDrawerLayout.closeDrawer(GravityCompat.START);
        return true;
    }
}
