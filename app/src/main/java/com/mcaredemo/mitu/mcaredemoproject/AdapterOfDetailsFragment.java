package com.mcaredemo.mitu.mcaredemoproject;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Context;
import android.os.Bundle;
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
    public AdapterOfDetailsFragment(Context context, List<String>mDataSet) {
        this.mDataSet = mDataSet;
        mContext  = context;

    }

    public static class CustomViewHolder extends RecyclerView.ViewHolder {
        private TextView mNameTextView;
        private CardView mCArdView;


        public CustomViewHolder(View view){
            super(view);
            mNameTextView = (TextView) view.findViewById(R.id.problemTextView);
            mCArdView = (CardView) view.findViewById(R.id.cardViewdetails);
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
        holder.mCArdView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(mContext,mDataSet.get(position),Toast.LENGTH_SHORT).show();

                Fragment fragment = new SpecificScoreFragment();
                Bundle bundle = new Bundle();

                bundle.putInt("positionOfProblem",position);
                fragment.setArguments(bundle);
//

               // FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = ((MainActivity) mContext).getFragmentManager().beginTransaction();
                fragmentTransaction.add(R.id.containerHome, fragment);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();




            }
        });

    }


    @Override
    public int getItemCount() {
        return mDataSet.size();
    }
}