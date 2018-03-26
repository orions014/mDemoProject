package com.mcaredemo.mitu.mcaredemoproject;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Mitu on 3/25/2018.
 */

public class AdapterAlertDialog extends RecyclerView.Adapter<AdapterAlertDialog.CustomViewHolder> {

    private List<String> mDataSet;
    private Context mContext;
    DetailsFragment fragmentOne;
    public AdapterAlertDialog(Context context, List mDataSet) {
        mContext  = context;
        this.mDataSet =  mDataSet;


    }

    public static class CustomViewHolder extends RecyclerView.ViewHolder {
        private TextView mNameTextView;


        public CustomViewHolder(View view){
            super(view);
            mNameTextView = (TextView) view.findViewById(R.id.alertscore);
        }


    }
    @Override
    public AdapterAlertDialog.CustomViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.alert_score_layout,parent,false);
        AdapterAlertDialog.CustomViewHolder viewHolder = new AdapterAlertDialog.CustomViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(AdapterAlertDialog.CustomViewHolder holder, final int position) {
        holder.mNameTextView.setText(mDataSet.get(position));




    }


    @Override
    public int getItemCount() {
        return mDataSet.size();
    }
}
