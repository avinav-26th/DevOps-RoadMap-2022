package com.example.devopsroadmap2022_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class Prerequisites_YAML extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prerequisites_yaml);

        ListView myListview = findViewById(R.id.prerequisiteListYAML);
        ArrayList<String> topicsList = new ArrayList<>();
        topicsList.add("1. Resources:\n");
        topicsList.add("Introduction to YAML");

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, topicsList);
        myListview.setAdapter(arrayAdapter);

        myListview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if(i == 1){
                    Uri uri = Uri.parse( "https://youtu.be/1uFVr15xDGg" );
                    startActivity(new Intent(Intent.ACTION_VIEW, uri));
                }
            }
        });
    }
}