package com.mcaredemo.mitu.mcaredemoproject;


import android.app.AlertDialog;
import android.app.Dialog;
import android.support.annotation.NonNull;
import android.support.v4.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;
import android.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.Arrays;


/**
 * A simple {@link Fragment} subclass.
 */
public class MyAlertDialogFragment  extends DialogFragment {


    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private String[] mDataset = {"1","2","3","4","5","6","7","8","9","10"};
    public static MyAlertDialogFragment newInstance() {
        return new MyAlertDialogFragment();
    }

    public MyAlertDialogFragment() {
        // Empty constructor required for DialogFragment
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_my_alert_dialog, container, false);
        getDialog().setTitle("মান নির্ধারন করুন");
/*
        RecyclerView mRecyclerView = (RecyclerView) view.findViewById(R.id.alertRecyclerview);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        mAdapter = new AdapterAlertDialog(getActivity(), Arrays.asList(mDataset));
        mRecyclerView.setAdapter(mAdapter);
        mRecyclerView.setNestedScrollingEnabled(false);*/



        return view;
    }




    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
       // String title = getArguments().getString("title");
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
      //  builder.setTitle(title);



        // Edited: Overriding onCreateView is not necessary in your case
        LayoutInflater inflater = LayoutInflater.from(getContext());
        View newFileView = inflater.inflate(R.layout.fragment_my_alert_dialog, null);
        builder.setView(newFileView);




        RecyclerView mRecyclerView = (RecyclerView) newFileView.findViewById(R.id.alertRecyclerview);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        mAdapter = new AdapterAlertDialog(getActivity(), Arrays.asList(mDataset));
        mRecyclerView.setAdapter(mAdapter);
        mRecyclerView.setNestedScrollingEnabled(false);

        builder.setNegativeButton("ক্যান্সেল", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });

        builder.setPositiveButton("সেইভ",  new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                // on success
            }
        });


        return builder.create();
    }
}
