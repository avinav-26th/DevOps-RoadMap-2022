package com.example.devopsroadmap2022_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
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

        setTitle("Basic Networking");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        ListView myListview = findViewById(R.id.prerequisiteListBasicNetworking);
        ArrayList<String> topicsList = new ArrayList<>();
        topicsList.add("\nHave basic understanding of:\n");
        topicsList.add("1. How systems communicate\n\n2. How data is being transferred\n\n3. LAN/WAN\n\n4. What are Switch, Router, ISP(Internet Service, Provider)\n\n5. IP address and types\n\n6. OSI Model (and 7 layers of OSI Model)\n\n7. Basic Sub-Netting\n\n8. DNS basics\n\n9. Switching and Routing\n\n");
        topicsList.add("\nResources:\n");
        topicsList.add("1. CCNA Part 1");
        topicsList.add("2. Networking and Kubernetes: A Layered Approach(O'RELLY)");

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this, R.layout.content_custom_layout, topicsList);
        myListview.setAdapter(arrayAdapter);

        myListview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if(i == 3){
                    Uri uri = Uri.parse( "https://youtu.be/rv3QK2UquxM" );
                    startActivity( new Intent( Intent.ACTION_VIEW, uri ) );
                }
                else if(i == 4){
                    Uri uri = Uri.parse( "https://jp.b-ok.as/book/17296628/8e2f1a" );
                    startActivity( new Intent( Intent.ACTION_VIEW, uri ) );
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