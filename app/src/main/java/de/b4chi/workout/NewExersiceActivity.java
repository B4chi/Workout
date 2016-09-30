package de.b4chi.workout;

import android.graphics.drawable.GradientDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.NumberPicker;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class NewExersiceActivity extends AppCompatActivity {
    RelativeLayout relativeLayoutRoot;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_exersice);
        relativeLayoutRoot = (RelativeLayout) findViewById(R.id.activity_new_exersice);

        TextView[] textViews = new TextView[6];

        int top = 0;
        for (int i = 0; i < textViews.length; i++) {
            textViews[i] = new TextView(getApplicationContext());
            if (i==0) {
                textViews[i].setText("Übungsname: ");
                textViews[i].setTextSize(25);
            }
            if (i==1) textViews[i].setText("Muskelgruppe: ");
            if (i==2) textViews[i].setText("Gewicht: ");
            if (i==3) textViews[i].setText("Wiederholungen: ");
            if (i==4) textViews[i].setText("Sitzhöhe: ");
            if (i==5) textViews[i].setText("Anmerkung: ");
            textViews[i].setTextSize(20);
            textViews[i].setY(top);
            relativeLayoutRoot.addView(textViews[i]);
            top += 100;
        }

        int size = 400;
        String[] nums = new String[size];
        double d = 5;
        for (int i = 0; i < size; i++) {
            nums[i]= String.valueOf(d);
            d+= 0.5;
        }

        NumberPicker np = new NumberPicker(getApplicationContext());
        np.setY(800);

        np.setMaxValue(nums.length-1);
        np.setMinValue(0);
        np.setWrapSelectorWheel(false);
        np.setDisplayedValues(nums);
        np.setDescendantFocusability(NumberPicker.FOCUS_BLOCK_DESCENDANTS);
        relativeLayoutRoot.addView(np);






    }


}
