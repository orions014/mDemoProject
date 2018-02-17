package com.mcaredemo.mitu.mcaredemoproject;


import android.os.Bundle;
import android.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import java.util.Arrays;


/**
 * A simple {@link Fragment} subclass.
 */
public class ScoreFragment extends Fragment {
    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private String[] mDataset = new String[20] ;
    private ArrayAdapter<String> mArrayAdapter;

    String[] data = {"স্কোর","১","২","৩","৪","৫","৬","৭","৮","৯","১০"};

    public ScoreFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_score, container, false);

        for (int i = 0; i <20 ; i++) {
            mDataset[i] = (i) + " নম্বর সমস্যার অবগতি ";
        }
        mArrayAdapter = new ArrayAdapter<String>(getActivity(),android.R.layout.simple_spinner_item,data);

        mRecyclerView = (RecyclerView) view.findViewById(R.id.recyclerViewScore);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        mAdapter = new AdapterofScoreFragment(getActivity(), Arrays.asList(mDataset),mArrayAdapter);
        mRecyclerView.setAdapter(mAdapter);
        mRecyclerView.setNestedScrollingEnabled(false);


        return view ;
    }



}
