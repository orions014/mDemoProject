package com.mcaredemo.mitu.mcaredemoproject;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

/**
 * Created by Mitu on 2/17/2018.
 */

public class AdapterAlarmScore extends RecyclerView.Adapter<AdapterAlarmScore.CustomViewHolder> {

    private List<String> mDataSet;
    private Context mContext;
    private ArrayAdapter<String> mArrayAdapter;


    public AdapterAlarmScore(Context context, List<String>mDataSet, ArrayAdapter<String>mArray) {
        this.mDataSet = mDataSet;
        mContext  = context;
        mArrayAdapter = mArray;


    }

    public static class CustomViewHolder extends RecyclerView.ViewHolder {
        private TextView mNameTextView;
        private CardView mCArdView;
       // Spinner sp;
        private ImageButton mButton;



        public CustomViewHolder(View view){
            super(view);
            mNameTextView = (TextView) view.findViewById(R.id.problemTextViewScore_1);
           // sp = (Spinner) view.findViewById(R.id.spinnernumber_1);
            mButton = (ImageButton) view.findViewById(R.id.spinnernumber_1);



        }


    }
    @Override
    public AdapterAlarmScore.CustomViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.newalarm_list_layout,parent,false);
        AdapterAlarmScore.CustomViewHolder viewHolder = new AdapterAlarmScore.CustomViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(AdapterAlarmScore.CustomViewHolder holder, final int position) {

        holder.mNameTextView.setText(mDataSet.get(position));



       /* holder.sp.setAdapter(mArrayAdapter);


        holder.sp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });*/

       holder.mButton.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Toast.makeText(mContext,mDataSet.get(position),Toast.LENGTH_SHORT).show();

           }
       });

    }




    @Override
    public int getItemCount() {
        return mDataSet.size();
    }
}