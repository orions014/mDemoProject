package com.mcaredemo.mitu.mcaredemoproject;


import android.graphics.Color;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.components.AxisBase;
import com.github.mikephil.charting.components.Legend;
import com.github.mikephil.charting.components.LimitLine;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.data.LineDataSet;
import com.github.mikephil.charting.formatter.IAxisValueFormatter;
import com.github.mikephil.charting.interfaces.datasets.ILineDataSet;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class NewSpecificScoreFragment extends Fragment {

    LineChart lineChart;

    public NewSpecificScoreFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_new_specific_score, container, false);
        lineChart = (LineChart) view.findViewById(R.id.lineChart_1);


        /*
        ArrayList<Entry> dataset1 = new ArrayList<Entry>();
        dataset1.add(new Entry(1f, 0));
        dataset1.add(new Entry(2f, 1));
        dataset1.add(new Entry(3f, 2));
        dataset1.add(new Entry(4f, 3));
        dataset1.add(new Entry(5f, 4));
        dataset1.add(new Entry(6f, 5));
        dataset1.add(new Entry(7f, 6));

        ArrayList<Entry> dataset2 = new ArrayList<Entry>();
        dataset2.add(new Entry(3f, 0));
        dataset2.add(new Entry(4f, 2));
        dataset2.add(new Entry(5f, 4));
        dataset2.add(new Entry(6f, 5));
        dataset2.add(new Entry(7f, 6));
        dataset2.add(new Entry(8f, 7));
        dataset2.add(new Entry(9f, 8));

//String[] xAxisOne = new String[] {
//      "0", "1", "2", "3", "4", "5", "6"
//};

///String[] xAxisTwo = new String[] {
///     "0", "2", "4", "5", "6", "8", "9"
///};


// Union from xAxisOne and xAxisTwo
        String[] xAxis = new String[] {"0", "1", "2", "3", "4", "5", "6", "8", "9"};


        ArrayList<LineDataSet> lines = new ArrayList<LineDataSet> ();

        LineDataSet lDataSet1 = new LineDataSet(dataset1, "DataSet1");
        lDataSet1.setColor(Color.RED);
        lDataSet1.setCircleColor(Color.RED);
        lines.add(lDataSet1);
        lines.add(new LineDataSet(dataset2, "DataSet2"));

        lineChart.setData(new LineData(xAxis, lines));

        */

        setData();
        Legend l = lineChart.getLegend();

        // modify the legend ...
        // l.setPosition(LegendPosition.LEFT_OF_CHART);
        l.setForm(Legend.LegendForm.LINE);



        lineChart.getAxisRight().setEnabled(false);





        return  view;
    }


    private ArrayList<String> setXAxisValues(){
        ArrayList<String> xVals = new ArrayList<String>();
        xVals.add("10");
        xVals.add("20");
        xVals.add("30");
        xVals.add("30.5");
        xVals.add("40");

        return xVals;
    }

    private ArrayList<Entry> setYAxisValues(){
        ArrayList<Entry> yVals = new ArrayList<Entry>();
        yVals.add(new Entry(60, 0));
        yVals.add(new Entry(48, 1));
        yVals.add(new Entry(70.5f, 2));
        yVals.add(new Entry(100, 3));
        yVals.add(new Entry(180.9f, 4));

        return yVals;
    }


    private void setData() {
        final ArrayList<String> xVals = setXAxisValues();

        ArrayList<Entry> yVals = setYAxisValues();

        LineDataSet set1 , set2;

        // create a dataset and give it a type

        ArrayList<Entry> yVals2 = new ArrayList<Entry>();
        yVals2.add(new Entry(50, 0));
        yVals2.add(new Entry(38, 1));
        yVals2.add(new Entry(60.5f, 2));
        yVals2.add(new Entry(80, 3));
        yVals2.add(new Entry(150.9f, 4));

        set1 = new LineDataSet(yVals, "DataSet 1");
        set1.setFillAlpha(110);
        // set1.setFillColor(Color.RED);

        // set the line to be drawn like this "- - - - - -"
        // set1.enableDashedLine(10f, 5f, 0f);
        // set1.enableDashedHighlightLine(10f, 5f, 0f);
        set1.setColor(Color.BLUE);
        set1.setCircleColor(Color.BLUE);
        set1.setLineWidth(1f);
        set1.setCircleRadius(3f);
        set1.setDrawCircleHole(true);
        set1.setValueTextSize(9f);
        set1.setDrawFilled(false);


        set2 = new LineDataSet(yVals2, "DataSet 2");
        set2.setFillAlpha(90);
        // set1.setFillColor(Color.RED);

        // set the line to be drawn like this "- - - - - -"
        // set1.enableDashedLine(10f, 5f, 0f);
        // set1.enableDashedHighlightLine(10f, 5f, 0f);
        set2.setColor(Color.YELLOW);
        set2.setCircleColor(Color.YELLOW);
        set2.setLineWidth(1f);
        set2.setCircleRadius(3f);
        set2.setDrawCircleHole(true);
        set2.setValueTextSize(9f);
        set2.setDrawFilled(false);

        ArrayList<ILineDataSet> dataSets = new ArrayList<ILineDataSet>();
        dataSets.add(set1); // add the datasets
        dataSets.add(set2);

        // create a data object with the datasets
        LineData data = new LineData(dataSets);

        // set data
        lineChart.setData(data);

    }
}
