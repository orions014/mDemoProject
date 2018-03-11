package com.mcaredemo.mitu.mcaredemoproject;


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
public class BiWeeklyFragment extends Fragment {
    private RecyclerView mRecyclerView1,mRecyclerView2;
    private RecyclerView.Adapter mAdapter1,mAdapter2;
    private String[] mDataset = {"একই শব্দের পুনরাবৃতি",
            "অর্থহীন শব্দের ব্যবহার্‌ ",
            "সর্বনাম পদের ভুল ব্যবহার (উদাহরণ স্বরুপ আমি এর পরিবর্তে তুমি ব্যবহার)",
            "অস্বাভাবিক শব্দের প্রয়োগ (তীক্ষ্ণ স্বরে নালিশ করা)",
            "আশে-পাশের সবার সাথে স্বাভাবিক যোগাযোগ করতে পারে কি ?",
            "আশে-পাশের সবার সাথে মেলা মেশা বজায় রাখতে পারে কি?",
            "তার নাম ধরে ডাকলে কি সারা দেয় ?",
            "সামাজিক মেলা মেশা করার সময় কি সে হাসে ?"};

    public BiWeeklyFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_bi_weekly, container, false);

        mRecyclerView1 = (RecyclerView) view.findViewById(R.id.recyclerViewbiweekly);
        mRecyclerView2 = (RecyclerView) view.findViewById(R.id.recyclerViewgoodtoknow);
        mRecyclerView1.setLayoutManager(new LinearLayoutManager(getActivity()));
        mAdapter1 = new BiweeklyAdapter(getActivity(), Arrays.asList(mDataset));
        mRecyclerView1.setAdapter(mAdapter1);
        mRecyclerView1.setNestedScrollingEnabled(false);


        mRecyclerView2.setLayoutManager(new LinearLayoutManager(getActivity()));
        mAdapter2 = new GoodToKnowAdapter(getActivity());
        mRecyclerView2.setAdapter(mAdapter2);
        mRecyclerView2.setNestedScrollingEnabled(false);



        return view;
    }

}
