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

public class Prerequisites_BasicNetworkingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prerequisites_basic_networking);

        ListView myListview = findViewById(R.id.prerequisiteListBasicNetworking);
        ArrayList<String> topicsList = new ArrayList<>();
        topicsList.add("1. Have basic understanding of:\n");
        topicsList.add("How systems communicate\n");
        topicsList.add("How data is being transferred\n");
        topicsList.add("LAN/WAN\n");
        topicsList.add("What are Switch, Router, ISP(Internet Service, Provider)\n");
        topicsList.add("IP address and types\n");
        topicsList.add("OSI Model (and 7 layers of OSI Model)\n");
        topicsList.add("Basic Sub-Netting\n");
        topicsList.add("DNS basics\n");
        topicsList.add("Switching and Routing\n\n");
        topicsList.add("2. Resources:\n");
        topicsList.add("CCNA Part 1");
        topicsList.add("Networking and Kubernetes: A Layered Approach(O'RELLY)");

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, topicsList);
        myListview.setAdapter(arrayAdapter);

        myListview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if(i == 11){
                    Uri uri = Uri.parse( "https://youtu.be/rv3QK2UquxM" );
                    startActivity( new Intent( Intent.ACTION_VIEW, uri ) );
                }
                else if(i == 12){
                    Uri uri = Uri.parse( "https://jp.b-ok.as/book/17296628/8e2f1a" );
                    startActivity( new Intent( Intent.ACTION_VIEW, uri ) );
                }
            }
        });
    }
}