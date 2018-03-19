package com.mcaredemo.mitu.mcaredemoproject;

import android.os.Bundle;
import android.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.Arrays;


public class DetailsFragment extends Fragment {
    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;


    private String[] mDataset = {"একই শব্দের পুনরাবৃতি",
            "অর্থহীন শব্দের ব্যবহার্‌ ",
            "সর্বনাম পদের ভুল ব্যবহার (উদাহরণ স্বরুপ আমি এর পরিবর্তে তুমি ব্যবহার)",
            "অস্বাভাবিক শব্দের প্রয়োগ (তীক্ষ্ণ স্বরে নালিশ করা)",
            "আশে-পাশের সবার সাথে স্বাভাবিক যোগাযোগ করতে পারে কি ?",
            "আশে-পাশের সবার সাথে মেলা মেশা বজায় রাখতে পারে কি?",
            "তার নাম ধরে ডাকলে কি সারা দেয় ?",
            "সামাজিক মেলা মেশা করার সময় কি সে হাসে ?",
            "ডাকলে সারা দিতে দেরি করে কি?",
            "চোখের দিকে তাকিয়ে কথা বলতে ভয় পায় ?",
            "কাউকে অনুস্বরণ করতে ব্যর্থ অথবা কোনো কিছু এক জায়গা থেকে অন্য জায়গায় নিতে  ব্যর্থ",
            "ব্যক্তিগত যত্নের রুটিন টি কি সে বুঝতে পারে ?",
            "মেজাজ মর্জি কত দ্রুত পরিবর্তন হয়?",
            "নিজেকে আহত করে (দিনে কত বারের মত)",
            "নিজেকে কি মারাত্নক ভাবে আহত করে ?",
            "হিংস্র ব্যবহার খুব বেশি কি ?",
            "একটি জিনিসের কোন অংশটির উপর তার বেশি আগ্রহ (উদাহরণ স্বরুপ পুতুলের চোখ অথবা হাত)"
    } ;

    public DetailsFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_details, container, false);



        mRecyclerView = (RecyclerView) view.findViewById(R.id.homeRecycler);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        mAdapter = new AdapterOfDetailsFragment(getActivity(), Arrays.asList(mDataset));
        mRecyclerView.setAdapter(mAdapter);
        mRecyclerView.setNestedScrollingEnabled(false);
        return view;
    }




}
