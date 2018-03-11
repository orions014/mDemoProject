package com.mcaredemo.mitu.mcaredemoproject;


import android.Manifest;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.app.Fragment;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;


import java.util.Arrays;


/**
 * A simple {@link Fragment} subclass.
 */
public class AlarmFragment extends Fragment {

    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;


    Button btnprogress , btnEmergency , btnNewProblem;
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
    private ArrayAdapter<String> mArrayAdapter;

    String[] data = {"স্কোর","১","২","৩","৪","৫","৬","৭","৮","৯","১০"};



    public AlarmFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view = inflater.inflate(R.layout.fragment_alarm, container, false);

        btnprogress = (Button) view.findViewById(R.id.btnprogress);
        btnEmergency = view.findViewById(R.id.btnemergency);
        btnNewProblem = view.findViewById(R.id.btnnewproblem);



        mArrayAdapter = new ArrayAdapter<String>(getActivity(),android.R.layout.simple_spinner_item,data);

        mRecyclerView = (RecyclerView) view.findViewById(R.id.recyclerViewScore_1);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        mAdapter = new AdapterAlarmScore(getActivity(), Arrays.asList(mDataset),mArrayAdapter);
        mRecyclerView.setAdapter(mAdapter);
        mRecyclerView.setNestedScrollingEnabled(false);

        btnprogress.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View view) {

                Fragment fragment = new NewSpecificScoreFragment();
                FragmentTransaction fragmentTransaction = getActivity().getFragmentManager().beginTransaction();
                fragmentTransaction.add(R.id.containerHome, fragment);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();




            }
        });


        btnEmergency.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View view) {

                Fragment fragment = new BiWeeklyFragment();
                FragmentTransaction fragmentTransaction = getActivity().getFragmentManager().beginTransaction();
                fragmentTransaction.add(R.id.containerHome, fragment);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();



            }
        });



        btnNewProblem.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View view) {

//                startActivity(new Intent(getActivity(), LoginActivity.class));

                Fragment fragment = new MessageFragment();
                FragmentTransaction fragmentTransaction = getActivity().getFragmentManager().beginTransaction();
                fragmentTransaction.add(R.id.containerHome, fragment);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();


            }
        });
        return view ;
    }







}
