package com.example.recyclerviewapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rcvThing;
    private ElectricThingAdapter electricThingAdapter;
    private ArrayList<ElectricThing> electricThings;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rcvThing = findViewById(R.id.rcvThing);

        electricThings = new ArrayList<>();
        electricThings.add(
                new ElectricThing("Day cuon",
                        3, 1000, 200,R.drawable.dauchuyendoi,
                        20));
        electricThings.add(
                new ElectricThing("Day cuon",
                        3, 1000, 200,R.drawable.dauchuyendoi,
                        20));

        electricThings.add(
                new ElectricThing("Day cuon",
                        3, 1000, 200,R.drawable.dauchuyendoi,
                        20));

        electricThings.add(
                new ElectricThing("Day cuon",
                        3, 1000, 200,R.drawable.dauchuyendoi,
                        20));

        electricThings.add(
                new ElectricThing("Day cuon",
                        3, 1000, 200,R.drawable.dauchuyendoi,
                        20));

        electricThings.add(
                new ElectricThing("Day cuon",
                        3, 1000, 200,R.drawable.dauchuyendoi,
                        20));

        electricThings.add(
                new ElectricThing("Day cuon",
                        3, 1000, 200,R.drawable.dauchuyendoi,
                        20));


        electricThingAdapter =
                new ElectricThingAdapter(this, electricThings);
        rcvThing.setAdapter(electricThingAdapter);

        //rcvThing.setLayoutManager(new LinearLayoutManager(this));

//        GridLayoutManager gridLayoutManager =
//                new GridLayoutManager(this,2);
//        rcvThing.setLayoutManager(gridLayoutManager);

        LinearLayoutManager linearLayoutManager
                = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        rcvThing.setLayoutManager(linearLayoutManager);


    }
}