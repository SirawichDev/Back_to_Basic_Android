package me.softdev.sirawich.listview_drawable;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by sirawich on 26/4/2018 AD.
 */

public class PicFragment extends Fragment{
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.show, container, false);
        return view;
    }
}
