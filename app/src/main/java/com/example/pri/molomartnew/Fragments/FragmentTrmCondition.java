package com.example.pri.molomartnew.Fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.pri.molomartnew.NewMainActivity;
import com.example.pri.molomartnew.R;
import com.github.clans.fab.FloatingActionMenu;


/**
 * Created by Pri on 9/23/2016.
 */
public class FragmentTrmCondition extends Fragment {
    public FragmentTrmCondition(){

    } Toolbar toolbar;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView=inflater.inflate(R.layout.fragment_trmscndition, container, false);
        final FloatingActionMenu fab = ((NewMainActivity) getActivity()).getFloatingActionMenu();
        if (fab != null) {
            ((NewMainActivity) getActivity()).hideFloatingActionMenu();
        }


        toolbar=(Toolbar)getActivity().findViewById(R.id.toolbar);
        toolbar.setTitle("Terms and Conditions");
        toolbar.setTitleTextColor(getResources().getColor(R.color.white));

        return  rootView;
    }
}
