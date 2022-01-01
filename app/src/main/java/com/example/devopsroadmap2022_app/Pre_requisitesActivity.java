package com.example.devopsroadmap2022_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class Pre_requisitesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pre_requisites);

        setTitle("Pre-requisites");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        ListView myListview = findViewById(R.id.prerequisiteList);
        ArrayList<String> topicsList = new ArrayList<>();
        topicsList.add("1. Linux OS");
        topicsList.add("2. Basic Networking");
        topicsList.add("3. YAML");

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this, R.layout.prerequisite_cutom_layout, topicsList);
        myListview.setAdapter(arrayAdapter);

        myListview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i)
                {
                    case 0: startActivity(new Intent(Pre_requisitesActivity.this, Prerequisites_LinuxActivity.class));
                    break;
                    case 1: startActivity(new Intent(Pre_requisitesActivity.this, Prerequisites_BasicNetworkingActivity.class));
                    break;
                    case 2: startActivity(new Intent(Pre_requisitesActivity.this, Prerequisites_YAML.class));
                    break;
                }
            }
        });
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                finish();
                return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        return true;
    }
}