package com.example.menusprog6;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity3 extends AppCompatActivity {

    Button call;
    Button reach;
    Button visit;
    Button mail;
    ImageButton imageButton;

    ImageButton imageButton2;
    ImageButton imageButton3;
    ImageButton imageButton4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        imageButton = (ImageButton) findViewById(R.id.imageButton);
        imageButton2 = (ImageButton) findViewById(R.id.imageButton2);
        imageButton3 = (ImageButton) findViewById(R.id.imageButton3);
        imageButton4 = (ImageButton) findViewById(R.id.imageButton4);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent j = new Intent(Intent.ACTION_SEND);
                j.setData(Uri.parse("email"));
                String[] s = {"dsouzajoswin99@gmail.com"};
                j.putExtra(Intent.EXTRA_EMAIL, s);
                j.putExtra(Intent.EXTRA_SUBJECT, "Complaint register");
                j.putExtra(Intent.EXTRA_TEXT, "");
                j.setType("message/rfc822");
                Intent chooser = Intent.createChooser(j, "Mail Us Via:");
                startActivity(chooser);
            }
        });
        imageButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0)
            {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW,Uri.parse("http://www.facebook.com/joswindsouza"));
                startActivity(browserIntent);

            }
        });

        imageButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(Intent.ACTION_VIEW);
                a.setData(Uri.parse("geo:20.3785761,72.9258047"));
                Intent chooser = Intent.createChooser(a, "Reach us via: ");
                startActivity(chooser);
            }
        });
        imageButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://christuniversity.in/";
                Intent s = new Intent(Intent.ACTION_VIEW);
                s.setData(Uri.parse(url));
                startActivity(s);
            }
        });
    }
}