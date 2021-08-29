package com.example.intent_lab4;

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
        setContentView(R.layout.activity_main2);
        button2 = (Button) findViewById(R.id.button2);
        textView4 = (TextView) findViewById(R.id.textView4);
        Spinner spinner = (Spinner) findViewById(R.id.planets_spinner);
        RadioGroup radioGroup = (RadioGroup)findViewById(R.id.RGroup);
        RadioButton selectedRadioButton = (RadioButton) findViewById(radioGroup.getCheckedRadioButtonId());
        valFromAct1 = getIntent().getExtras().getString("Value");
        textView4.setText(valFromAct1);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.planets_array, android.R.layout.simple_spinner_item);
        // Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // Apply the adapter to the spinner
        spinner.setAdapter(adapter);
    }

    public void btnClickAct2(View v) {
        Intent i = new Intent(this, MainActivity3.class);
        startActivity(i);
        finish();
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