package com.mcaredemo.mitu.mcaredemoproject;

import android.app.Activity;
import android.app.DialogFragment;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

/**
 * Created by Mitu on 2/5/2018.
 */


public class AdapterOfDetailsFragment extends RecyclerView.Adapter<AdapterOfDetailsFragment.CustomViewHolder> {

    private List<String> mDataSet;
    private Context mContext;
    DetailsFragment fragmentOne;
    public AdapterOfDetailsFragment(Context context, List<String>mDataSet) {
        this.mDataSet = mDataSet;
        mContext  = context;

    }

    public static class CustomViewHolder extends RecyclerView.ViewHolder {
        private TextView mNameTextView;


        public CustomViewHolder(View view){
            super(view);
            mNameTextView = (TextView) view.findViewById(R.id.problemTextViewScore_11);
        }


    }
    @Override
    public CustomViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.main_list_layout,parent,false);
        CustomViewHolder viewHolder = new CustomViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(CustomViewHolder holder, final int position) {
        holder.mNameTextView.setText(mDataSet.get(position));


        holder.mNameTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {





                MyAlertDialogFragment newFragment = MyAlertDialogFragment.newInstance();
                newFragment.show(((MainActivity)mContext).getSupportFragmentManager(),"Title");

               /* MyAlertDialogFragment newFragment1 = MyAlertDialogFragment.newInstance();
                newFragment1.show(((AppCompatActivity)mContext).getSupportFragmentManager(),"Title");
*/
                //Fragment myFragment = new MyFragment();
                //activity.getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, myFragment).addToBackStack(null).commit();

            }
        });


    }


    @Override
    public int getItemCount() {
        return mDataSet.size();
    }
}