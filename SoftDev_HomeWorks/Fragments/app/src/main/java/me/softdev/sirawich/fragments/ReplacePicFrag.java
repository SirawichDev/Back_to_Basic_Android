package me.softdev.sirawich.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

/**
 * Created by sirawich on 26/4/2018 AD.
 */

public class ReplacePicFrag extends Fragment {
   private static ReplacePicFrag rpfrag;

   public ReplacePicFrag(){

   }
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.replacepicfrag, container, false);
        return view;
    }
    public static Fragment Pass(String value){
        if (rpfrag == null)
            rpfrag = new ReplacePicFrag();
        Bundle bd = new Bundle();
        bd.putString("GG",value);
        rpfrag.setArguments(bd);
        return rpfrag;


    }
}
