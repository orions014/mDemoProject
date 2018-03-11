package com.mcaredemo.mitu.mcaredemoproject;

import android.content.Context;
import android.graphics.Color;
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

public class BiweeklyAdapter extends RecyclerView.Adapter<BiweeklyAdapter.CustomViewHolder> {

    private List<String> mDataSet;
    private Context mContext;
    private ArrayAdapter<String> mArrayAdapter;


    public BiweeklyAdapter(Context context, List<String>mDataSet) {
        this.mDataSet = mDataSet;
        mContext  = context;


    }

    public static class CustomViewHolder extends RecyclerView.ViewHolder {
        private TextView mProblemName;
        private CardView mCArdView;
        // Spinner sp;
        private ImageButton textViewincrease;



        public CustomViewHolder(View view){
            super(view);
            mProblemName = (TextView) view.findViewById(R.id.problemTextViewproblem);
            // sp = (Spinner) view.findViewById(R.id.spinnernumber_1);
            textViewincrease = (ImageButton) view.findViewById(R.id.textViewincrease);



        }


    }
    @Override
    public BiweeklyAdapter.CustomViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.biweekly_list_layout,parent,false);
        BiweeklyAdapter.CustomViewHolder viewHolder = new BiweeklyAdapter.CustomViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(BiweeklyAdapter.CustomViewHolder holder, final int position) {

        holder.mProblemName.setText(mDataSet.get(position));

        if (position %3 == 0){
        holder.textViewincrease.setImageResource(R.drawable.ic_trending_down_black_24dp);

        }
        else {
            holder.textViewincrease.setImageResource(R.drawable.ic_trending_up_black_24dp);
        }





    }




    @Override
    public int getItemCount() {
        return mDataSet.size();
    }
}
