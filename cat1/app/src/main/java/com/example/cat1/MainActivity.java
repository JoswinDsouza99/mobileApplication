package com.example.cat1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button button;
    EditText editText;
    EditText editText2;
    String editTextVal;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=(Button)findViewById(R.id.button);
        editText=(EditText)findViewById(R.id.editTextTextPersonName3);
        editText2=(EditText)findViewById(R.id.editTextTextPassword);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(editText.getText().toString().equals("Joswin") &&
                        editText2.getText().toString().equals("Joswin")) {
                    Intent i = new Intent(getBaseContext(), MainActivity2.class);
                    editTextVal = editText.getText().toString();
                    i.putExtra("Value", editTextVal);
                    startActivity(i);
                    finish();
                }else{
                    Toast.makeText(getApplicationContext(), "Wrong Credentials",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

}