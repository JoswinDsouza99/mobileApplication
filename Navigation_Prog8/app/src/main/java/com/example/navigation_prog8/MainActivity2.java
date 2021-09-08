package com.example.navigation_prog8;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

public class MainActivity2 extends AppCompatActivity {
    Button button2;
    TextView textView4;
    String valFromAct1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_gallery);

        RadioGroup radioGroup = (RadioGroup)findViewById(R.id.RGroup);
        RadioButton selectedRadioButton = (RadioButton) findViewById(radioGroup.getCheckedRadioButtonId());
        valFromAct1 = getIntent().getExtras().getString("Value");
        textView4.setText(valFromAct1);

    }


    public void fabSnackbar(View view) {
        //Get the selected RadioButton
        RadioGroup radioGroup = (RadioGroup)findViewById(R.id.RGroup);
        RadioButton selectedRadioButton = (RadioButton) findViewById(radioGroup.getCheckedRadioButtonId());
        CheckBox cb1 = (CheckBox)findViewById(R.id.checkBox);
        CheckBox cb2 = (CheckBox)findViewById(R.id.checkBox2);
        CheckBox cb3 = (CheckBox)findViewById(R.id.checkBox3);
        CheckBox cb4 = (CheckBox)findViewById(R.id.checkBox4);
        // get RadioButton text
        String yourClass = selectedRadioButton.getText().toString();

        String checkBoxChoices = "";

        if (cb1.isChecked()) {
            checkBoxChoices += cb1.getText().toString() + "\t:YES ";
        }
        else{
            checkBoxChoices += cb1.getText().toString() + "\t:NO ";
        }

        if (cb2.isChecked()) {
            checkBoxChoices += cb2.getText().toString() + "\t:YES ";
        }
        else{
            checkBoxChoices += cb2.getText().toString() + "\t:NO ";
        }

        if (cb3.isChecked()) {
            checkBoxChoices += cb3.getText().toString() + "\t:YES ";
        }
        else{
            checkBoxChoices += cb3.getText().toString() + "\t:NO ";
        }

        if (cb4.isChecked()) {
            checkBoxChoices += cb4.getText().toString() + "\t:YES ";
        }
        else{
            checkBoxChoices += cb4.getText().toString() + "\t:NO ";
        }

        Snackbar.make(view, "Company Choices: \n "+ checkBoxChoices , Snackbar.LENGTH_LONG)
                .setAction("Action", null).show();
    }

}