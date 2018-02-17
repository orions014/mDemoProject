package com.mcaredemo.mitu.mcaredemoproject;


import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.data.LineDataSet;
import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.data.PieDataSet;
import com.github.mikephil.charting.data.PieEntry;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class SpecificScoreFragment extends Fragment {

    private Bundle mBundles;
    BarChart lineChart;
    TextView mTextView;
    private String[] mDataset = new String[20] ;

    public SpecificScoreFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_specific_score, container, false);
        lineChart = (BarChart) view.findViewById(R.id.lineChart);
        mTextView = (TextView) view.findViewById(R.id.textViewsepcific);
        for (int i = 0; i <20 ; i++) {
            mDataset[i] = (i) + " নম্বর সমস্যা _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _";
        }
        mBundles = this.getArguments();
        int positionOfProble = mBundles.getInt("positionOfProblem");

        mTextView.setText(mDataset[positionOfProble]);

/*
        List<PieEntry> entries = new ArrayList<>();

        entries.add(new PieEntry(18.5f, "1st week"));
        entries.add(new PieEntry(26.7f, "2nd week"));
        entries.add(new PieEntry(24.0f, "3rd week"));
        entries.add(new PieEntry(30.8f, "4rth week"));

        PieDataSet set = new PieDataSet(entries, "Monthly Results");
        PieData data = new PieData(set);
        lineChart.setData(data);
        lineChart.invalidate();*/



        List<BarEntry> entries = new ArrayList<>();
        entries.add(new BarEntry(0f, 30f));
        entries.add(new BarEntry(1f, 80f));
        entries.add(new BarEntry(2f, 60f));
        entries.add(new BarEntry(3f, 50f));
        // gap of 2f
        entries.add(new BarEntry(5f, 70f));
        entries.add(new BarEntry(6f, 60f));

        BarDataSet set = new BarDataSet(entries, "BarDataSet");

        BarData data = new BarData(set);
        data.setBarWidth(0.9f); // set custom bar width
        lineChart.setData(data);
        lineChart.setFitBars(true); // make the x-axis fit exactly all bars
        lineChart.invalidate(); // refresh



        return view;
    }

}
