package de.b4chi.workout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.NumberPicker;
import android.widget.RelativeLayout;
import android.widget.TextView;

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

        NumberPicker numberPicker = new NumberPicker(getApplicationContext());
        numberPicker.setY(800);
        String[] nums = {"1","1.5","2","2.5","3","3.5","4","4.5","5","5.5","6","6.5","7","7.5","8","8.5","9"};
        numberPicker.setDisplayedValues(nums);
        relativeLayoutRoot.addView(numberPicker);
        System.out.println("Test");



    }
}
