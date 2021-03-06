package me.softdev.sirawich.listview_drawable;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.TaskStackBuilder;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.preference.PreferenceActivity;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.app.NotificationCompat;


import android.support.v4.app.NotificationManagerCompat;
import android.support.v4.view.GravityCompat;
import android.support.v7.app.AlertDialog;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;


public class Drawable extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
    private DrawerLayout mDrawerLayout;
    private ActionBarDrawerToggle mToggle;
     Toolbar mToolbar = null;
   public int NOTIFICATION_ID = 234;
    NavigationView navigationView;
    private RecyclerView recyclerView;
    NotificationCompat.Builder notification;
    private static final int uniqueID = 40111;

    TextView headers;
    Button btn,save;
    ImageView pic;

    private String[] Header_name = {"Picture 1","Picture2","Picture3"};
    private int[] images={R.drawable.sc,R.drawable.sd,R.drawable.ss};
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
        notification = new NotificationCompat.Builder(this);
        notification.setAutoCancel(true);


    }




    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        String v = savedInstanceState.getString("header");


    }

    public class RecyclerViewAdapter extends RecyclerView.Adapter<ViewHolder>{


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
            holder.save.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    AlertDialog.Builder alertDialog = new AlertDialog.Builder(Drawable.this);
                    alertDialog.setMessage("Are You Sure You want to Save");
                    final AlertDialog.Builder builder = alertDialog.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            Toast.makeText(Drawable.this, "Saved", Toast.LENGTH_SHORT).show();
                            notification.setSmallIcon(R.drawable.ic_launcher);
                            notification.setTicker("This is tricker");
                            notification.setWhen(System.currentTimeMillis());
                            notification.setContentTitle("Saved!!");
                            notification.setContentText("<3 <3");

                            Intent intent = new Intent(Drawable.this, Drawable.class);
                            PendingIntent pendingIntent = PendingIntent.getActivity(Drawable.this,0,intent,PendingIntent.FLAG_UPDATE_CURRENT);
                            notification.setContentIntent(pendingIntent);

                            NotificationManager nm = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);

                            nm.notify(uniqueID,notification.build());
                            

                        }

                    });


                    alertDialog.setNegativeButton("No", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            finish();

                        }
                    });
                    AlertDialog ad = alertDialog.create();
                    ad.show();

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
        Button btn,save;
        ImageView pic;


        public ViewHolder(View itemView) {
            super(itemView);

            headers = (TextView) itemView.findViewById(R.id.header);
            btn = (Button) itemView.findViewById(R.id.btn_click);
            pic = (ImageView) itemView.findViewById(R.id.img1);
            save = (Button) itemView.findViewById(R.id.saved);

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
