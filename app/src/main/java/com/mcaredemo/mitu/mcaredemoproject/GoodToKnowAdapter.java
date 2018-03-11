package com.mcaredemo.mitu.mcaredemoproject;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

/**
 * Created by Mitu on 3/11/2018.
 */

public class GoodToKnowAdapter extends RecyclerView.Adapter<GoodToKnowAdapter.CustomViewHolder> {

   // private List<String> mDataSet;
    private Context mContext;
    private ArrayAdapter<String> mArrayAdapter;


    public GoodToKnowAdapter(Context context) {
       // this.mDataSet = mDataSet;
        mContext  = context;



    }

    public static class CustomViewHolder extends RecyclerView.ViewHolder {
        private TextView textviewtitle;
        private CardView mCArdView;
        // Spinner sp;
        private TextView textviewSolution;



        public CustomViewHolder(View view){
            super(view);
            textviewtitle = (TextView) view.findViewById(R.id.TextViewtitleGoodtoknow);
            // sp = (Spinner) view.findViewById(R.id.spinnernumber_1);
            textviewSolution = (TextView) view.findViewById(R.id.textviewSolution);



        }


    }
    @Override
    public GoodToKnowAdapter.CustomViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.good_to_know_list_layout,parent,false);
        GoodToKnowAdapter.CustomViewHolder viewHolder = new GoodToKnowAdapter.CustomViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(GoodToKnowAdapter.CustomViewHolder holder, final int position) {

        holder.textviewtitle.setText("অটিস্টিক শিশু সম্পর্কিত কুসংস্কার");
        holder.textviewSolution.setText("অটিস্টিক শিশু জন্ম দান কোন শাস্তি নয়। চোখের আইরিশের রঙ নীল অথবা মাথার চুল কোকরানো হবার মতই স্বাভাবিক একটি অটিস্টিক শিশু।");




    }




    @Override
    public int getItemCount() {
        return 3;
    }
}
