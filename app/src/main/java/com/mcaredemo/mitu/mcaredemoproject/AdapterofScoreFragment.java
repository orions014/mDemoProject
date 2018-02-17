package com.mcaredemo.mitu.mcaredemoproject;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

/**
 * Created by Mitu on 2/7/2018.
 */

public class AdapterofScoreFragment extends RecyclerView.Adapter<AdapterofScoreFragment.CustomViewHolder> {

    private List<String> mDataSet;
    private Context mContext;
    private ArrayAdapter<String> mArrayAdapter;


    public AdapterofScoreFragment(Context context, List<String>mDataSet, ArrayAdapter<String>mArray) {
        this.mDataSet = mDataSet;
        mContext  = context;
        mArrayAdapter = mArray;


    }

    public static class CustomViewHolder extends RecyclerView.ViewHolder {
        private TextView mNameTextView;
        private CardView mCArdView;
        Spinner sp;



        public CustomViewHolder(View view){
            super(view);
            mNameTextView = (TextView) view.findViewById(R.id.problemTextViewScore);
            mCArdView = (CardView) view.findViewById(R.id.cardViewScore);
            sp = (Spinner) view.findViewById(R.id.spinnernumber);



        }


    }
    @Override
    public AdapterofScoreFragment.CustomViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.scorelist_layout,parent,false);
        AdapterofScoreFragment.CustomViewHolder viewHolder = new AdapterofScoreFragment.CustomViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(CustomViewHolder holder, final int position) {

        holder.mNameTextView.setText(mDataSet.get(position));
        holder.mCArdView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(mContext,mDataSet.get(position),Toast.LENGTH_SHORT).show();
            }
        });


        holder.sp.setAdapter(mArrayAdapter);


        holder.sp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

    }




    @Override
    public int getItemCount() {
        return mDataSet.size();
    }
}
