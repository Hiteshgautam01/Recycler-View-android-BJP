package com.example.hitesh.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import Adapter.myadapter;
import Model.ListItem;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private List<ListItem> lsitItems;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView =  findViewById(R.id.recyclerviewid);
        // TODO: Search online
        recyclerView.setHasFixedSize(true);
        // TODO: Why LinearLayoutManager?
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        lsitItems = new ArrayList<>();


        for (int i=0; i<10; i++){
            ListItem item = new ListItem(
                    "Hitesh "+(i+1),
                    "CICian",
                    "2 Star "
            );

            lsitItems.add(item);
        }



        adapter = new myadapter(this, lsitItems);
        recyclerView.setAdapter(adapter);

    }
}
