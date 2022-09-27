package com.example.bttaoapptonghop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class home extends AppCompatActivity {
    Button btntoprofile;
    Button btntodanhsach;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        btntoprofile = (Button)findViewById(R.id.btntoprofile);
        btntoprofile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(home.this, profile.class);
                startActivity(i);
            }
        });

        btntodanhsach = (Button)findViewById(R.id.btntodanhsach);
        btntodanhsach.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(home.this, MainMonAn.class);
                startActivity(i);
            }
        });
    }
}