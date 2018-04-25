package me.softdev.sirawich.fragments;

import android.support.v4.app.Fragment;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

public class TopSectionFragment extends Fragment {
    private static  TopSectionFragment topfragment;

    public TopSectionFragment(){

    }
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        String V = getArguments().getString("GG");
        Toast.makeText(getActivity(),V,Toast.LENGTH_LONG).show();
        View view = inflater.inflate(R.layout.top_section_fragments,container,false);
        return view;
    }
    public static Fragment Pass(String value){
        if (topfragment == null)
            topfragment = new TopSectionFragment();
        Bundle bd = new Bundle();
        bd.putString("GG",value);
        topfragment.setArguments(bd);
        return topfragment;


    }
}
