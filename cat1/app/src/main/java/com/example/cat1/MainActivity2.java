package com.example.cat1;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {
    private int mCount = 0;
    private TextView mShowCount;
    private TextView mShowCost;
    private String vehType;
    private int mCost = 0;
    private int total = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        mShowCount = (TextView) findViewById(R.id.textView9);
        mShowCost = (TextView) findViewById(R.id.textView10);
    }

    public void vehUpdate(View view) {



        RadioGroup radioGroup = (RadioGroup)findViewById(R.id.RGroup);
        RadioButton selectedRadioButton = (RadioButton) findViewById(radioGroup.getCheckedRadioButtonId());

        String vehClass = selectedRadioButton.getText().toString();


        if(vehClass.equals("Two Wheeler"))
        {
            mCost= 100;
        }
        else if(vehClass.equals("Four Wheeler"))
        {
            mCost= 200;
        }
        else if(vehClass.equals("Truck / Bus"))
        {
            mCost= 400;
        }
        else if(vehClass.equals("VIP/ PASS"))
        {
            mCost= 0;
        }
        else if(vehClass.equals("RFID"))
        {
            mCost= 50;
        }
        mCount++;
        mShowCount.setText(Integer.toString(mCount));
        total += mCost;
        mShowCost.setText(Integer.toString(total));
    }

}