package com.mcaredemo.mitu.mcaredemoproject;


import android.graphics.Color;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.components.AxisBase;
import com.github.mikephil.charting.components.Legend;
import com.github.mikephil.charting.components.LimitLine;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.data.LineDataSet;
import com.github.mikephil.charting.formatter.IAxisValueFormatter;
import com.github.mikephil.charting.formatter.IndexAxisValueFormatter;
import com.github.mikephil.charting.formatter.LargeValueFormatter;
import com.github.mikephil.charting.interfaces.datasets.ILineDataSet;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class NewSpecificScoreFragment extends Fragment {

    BarChart chart;

    public NewSpecificScoreFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_new_specific_score, container, false);
        chart = (BarChart) view.findViewById(R.id.lineChart_1);


    /*
        setData();
        Legend l = lineChart.getLegend();

        l.setForm(Legend.LegendForm.LINE);
        l.setVerticalAlignment(Legend.LegendVerticalAlignment.TOP);
        l.setHorizontalAlignment(Legend.LegendHorizontalAlignment.RIGHT);



        lineChart.getAxisRight().setEnabled(false);





        lineChart.setDescription(null);
        lineChart.setPinchZoom(false);
        lineChart.setScaleEnabled(false);
        lineChart.setDrawGridBackground(false);
        */
        float barWidth;
        float barSpace;
        float groupSpace;

        barWidth = 0.3f;
        barSpace = 0f;
        groupSpace = 0.4f;

        chart.setDescription(null);
        chart.setPinchZoom(false);
        chart.setScaleEnabled(false);
        chart.setDrawBarShadow(false);
        chart.setDrawGridBackground(false);


        int groupCount = 6;

        ArrayList xVals = new ArrayList();

        xVals.add("January");
        xVals.add("February");
        xVals.add("March");
        xVals.add("April");
        xVals.add("May");
        xVals.add("Jun");


        ArrayList yVals1 = new ArrayList();
        ArrayList yVals2 = new ArrayList();

        yVals1.add(new BarEntry(1, (float) 1));
        yVals2.add(new BarEntry(1, (float) 2));
        yVals1.add(new BarEntry(2, (float) 3));
        yVals2.add(new BarEntry(2, (float) 4));
        yVals1.add(new BarEntry(3, (float) 5));
        yVals2.add(new BarEntry(3, (float) 6));
        yVals1.add(new BarEntry(4, (float) 7));
        yVals2.add(new BarEntry(4, (float) 8));
        yVals1.add(new BarEntry(5, (float) 9));
        yVals2.add(new BarEntry(5, (float) 10));
        yVals1.add(new BarEntry(6, (float) 11));
        yVals2.add(new BarEntry(6, (float) 12));



        BarDataSet set1, set2;
        set1 = new BarDataSet(yVals1, "Use same words");
        set1.setColor(Color.LTGRAY);
        set2 = new BarDataSet(yVals2, "Meaning less used words");
        set2.setColor(Color.GREEN);
        BarData data = new BarData(set1, set2);
        data.setValueFormatter(new LargeValueFormatter());
        chart.setData(data);
        chart.getBarData().setBarWidth(barWidth);
        chart.getXAxis().setAxisMinimum(0);
        chart.getXAxis().setAxisMaximum(0 + chart.getBarData().getGroupWidth(groupSpace, barSpace) * groupCount);
        chart.groupBars(0, groupSpace, barSpace);
        chart.getData().setHighlightEnabled(false);
        chart.invalidate();


        Legend l = chart.getLegend();
        l.setVerticalAlignment(Legend.LegendVerticalAlignment.TOP);
        l.setHorizontalAlignment(Legend.LegendHorizontalAlignment.RIGHT);
        l.setOrientation(Legend.LegendOrientation.HORIZONTAL);
        l.setDrawInside(true);
        l.setYOffset(20f);
        l.setXOffset(0f);
        l.setYEntrySpace(0f);
        l.setTextSize(8f);



        //X-axis
        XAxis xAxis = chart.getXAxis();
        xAxis.setGranularity(1f);
        xAxis.setGranularityEnabled(true);
        xAxis.setCenterAxisLabels(true);
        xAxis.setDrawGridLines(false);
        xAxis.setAxisMaximum(7);

        xAxis.setPosition(XAxis.XAxisPosition.BOTTOM);
        xAxis.setValueFormatter(new IndexAxisValueFormatter(xVals));
//Y-axis
        chart.getAxisRight().setEnabled(false);
        YAxis leftAxis = chart.getAxisLeft();
        leftAxis.setValueFormatter(new LargeValueFormatter());
        leftAxis.setDrawGridLines(true);
        leftAxis.setSpaceTop(35f);
        leftAxis.setAxisMinimum(0f);







        return  view;
    }


    private ArrayList<String> setXAxisValues(){
        ArrayList<String> xVals = new ArrayList<String>();
        xVals.add("10-08-2017");
        xVals.add("20-09-2017");
        xVals.add("30-10-2018");
        xVals.add("30-01-2018");
        xVals.add("02-02-2018");

        return xVals;
    }

    private ArrayList<Entry> setYAxisValues(){
        ArrayList<Entry> yVals = new ArrayList<Entry>();
        yVals.add(new Entry(100, 0));
        yVals.add(new Entry(150, 1));
        yVals.add(new Entry(200, 2));
        yVals.add(new Entry(250, 3));
        yVals.add(new Entry(300, 4));

        return yVals;
    }


    private void setData() {
        final ArrayList<String> xVals = setXAxisValues();

        ArrayList<Entry> yVals = setYAxisValues();

        LineDataSet set1 , set2;

        // create a dataset and give it a type

        ArrayList<Entry> yVals2 = new ArrayList<Entry>();
        yVals2.add(new Entry(50, 0));
        yVals2.add(new Entry(80, 1));
        yVals2.add(new Entry(140, 2));
        yVals2.add(new Entry(220, 3));
        yVals2.add(new Entry(260, 4));

        set1 = new LineDataSet(yVals, "DataSet 1" );

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
       // chart.setData(data);


        //X-axis
        XAxis xAxis = chart.getXAxis();

        xAxis.setDrawGridLines(false);
        xAxis.setGranularity(1f);
        xAxis.setGranularityEnabled(true);
        xAxis.setCenterAxisLabels(true);
        xAxis.setDrawGridLines(false);
        xAxis.setAxisMaximum(2000);
        xAxis.setPosition(XAxis.XAxisPosition.BOTTOM);
        xAxis.setValueFormatter(new IndexAxisValueFormatter(xVals));


    }
}
