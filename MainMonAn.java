package com.example.bttaoapptonghop;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainMonAn extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listview;
        ArrayList<MonAn> arraylist;
        AdapterMonAn adapter;

        listview = findViewById(R.id.listviewmonan);
        arraylist = new ArrayList<>();
        arraylist.add(new MonAn("Phạm Long Uyển","2050531200356", R.drawable.comchien, "20T3"));
        arraylist.add(new MonAn("Phạm Long Uyển","2050531200356", R.drawable.comga, "20T3"));
        arraylist.add(new MonAn("Phạm Long Uyển","2050531200356", R.drawable.raucai, "20T3"));
        arraylist.add(new MonAn("Phạm Long Uyển","2050531200356", R.drawable.comchien1, "20T3"));
        arraylist.add(new MonAn("Phạm Long Uyển","2050531200356", R.drawable.salad, "20T3"));


        adapter = new AdapterMonAn(MainMonAn.this, R.layout.layout_monan, arraylist);
        listview.setAdapter(adapter);

    }
}