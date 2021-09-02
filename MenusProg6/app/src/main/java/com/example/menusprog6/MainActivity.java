package com.example.menusprog6;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ImageView pic;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pic=(ImageView)findViewById(R.id.imageView2);
        registerForContextMenu(pic);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem items){
        Intent i = new Intent(this, MainActivity3.class);
        switch (items.getItemId()) {
            case R.id.context_help:
                Toast.makeText(getApplicationContext(),"Contact us for Help",Toast.LENGTH_SHORT).show();
                startActivity(i);
                finish();
            case R.id.context_logout:
                finish();
                return true;
            case R.id.context_home:
                Toast.makeText(getApplicationContext(),"This is HOME",Toast.LENGTH_SHORT).show();
                return true;
            case R.id.context_contact:
                startActivity(i);
                finish();
            default:
                return super.onOptionsItemSelected(items);
        }
    }
    @Override
    public void onCreateContextMenu(ContextMenu menu, View v,
                                    ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.context, menu);
    }
    public boolean onContextItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.context_save:
                Toast.makeText(getApplicationContext(),"Picture Saved",Toast.LENGTH_SHORT).show();
                return true;
            case R.id.context_sharepic:
                Toast.makeText(getApplicationContext(),"Picture Shared in mail",Toast.LENGTH_SHORT).show();
                return true;
            case R.id.context_copy:
                Toast.makeText(getApplicationContext(),"Copied to Clipboard",Toast.LENGTH_SHORT).show();
                return true;
            default:
                return super.onContextItemSelected(item);
        }
    }

    public void next(View view) {
        Intent i = new Intent(getBaseContext(), MainActivity2.class);
        startActivity(i);
        finish();
    }
}