package com.example.devopsroadmap2022_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class OtherActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_other);

        ListView myListview = findViewById(R.id.others);
        ArrayList<String> topicsList = new ArrayList<>();
        topicsList.add("There are some additional things we should know about:\n");
        topicsList.add("1. Container Security\n");
        topicsList.add("2. Supply Chain Security\n");
        topicsList.add("3. Kubernetes Seurity\n");
        topicsList.add("4. CNCF Landscape\n");
        topicsList.add("5. Operators (how to write an operator, what is operator sdk)\n\n");
        topicsList.add("We can also read a book on Container Security by O'relly");

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, topicsList);
        myListview.setAdapter(arrayAdapter);
    }
}