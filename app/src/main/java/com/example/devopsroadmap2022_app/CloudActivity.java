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

public class CloudActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cloud);

        ListView myListview = findViewById(R.id.cloud);
        ArrayList<String> topicsList = new ArrayList<>();
        topicsList.add("1. Become familiar with:\n");
        topicsList.add("Infrastructure as a Servide(IAAS)\n");
        topicsList.add("Software as a Servide(SAAS)\n");
        topicsList.add("Platform as a Servide(PAAS)\n");
        topicsList.add("What is a Cloud and Data Centre\n");
        topicsList.add("What are the benfits of cloud\n");
        topicsList.add("Cloud Service Providers (eg. GCP, AWS, Azure, Oracle, Civo)\n");
        topicsList.add("Base Terminologies like:- Network, Storage, Compute, IAM, Billing\n");
        topicsList.add("\nNOTE :: We have to learn AWS first\n\n");
        topicsList.add("2. Resources:\n(sirf Aws ka link diya hai...baaki ka bad mein dhund lenge)");
        topicsList.add("AWS cloud practitioner (freecodecamp)");

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, topicsList);
        myListview.setAdapter(arrayAdapter);

        myListview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if (i==10){
                    Uri uri = Uri.parse( "https://youtu.be/SOTamWNgDKc" );
                    startActivity(new Intent(Intent.ACTION_VIEW, uri));
                }
            }
        });
    }
}


