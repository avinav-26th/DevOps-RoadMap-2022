package com.example.devopsroadmap2022_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView myListview = findViewById(R.id.topics);
        ArrayList<String> topicsList = new ArrayList<>();
        topicsList.add("Pre-requisites");
        topicsList.add("Version Control System - Git");
        topicsList.add("CLOUD");
        topicsList.add("Virtualization & Containerization");
        topicsList.add("KUBERNETES");
        topicsList.add("CI/CD");
        topicsList.add("Infrastructure as Code (IAC)");
        topicsList.add("Observability");
        topicsList.add("Chaos Engineering");
        topicsList.add("Policies");
        topicsList.add("Service Mesh");
        topicsList.add("Others");
        topicsList.add("WE CAN DO IT !!");

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, topicsList);
        myListview.setAdapter(arrayAdapter);

        myListview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i)
                {
                    case 1: startActivity(new Intent(MainActivity.this,Pre_requisitesActivity.class));
                    break;
                    case 2: startActivity(new Intent(MainActivity.this,GItActivity.class));
                    break;
                    case 3: startActivity(new Intent(MainActivity.this,CloudActivity.class));
                    break;
                    case 4: startActivity(new Intent(MainActivity.this,ContainersActivity.class));
                    break;
                    case 5: startActivity(new Intent(MainActivity.this,KubernetesActivity.class));
                    break;
                    case 6: startActivity(new Intent(MainActivity.this,CI_CD_Activity.class));
                    break;
                    case 7: startActivity(new Intent(MainActivity.this,IAC_Activity.class));
                    break;
                    case 8: startActivity(new Intent(MainActivity.this,ObservabilityActivity.class));
                    break;
                    case 9: startActivity(new Intent(MainActivity.this,ChaosEngineeringActivity.class));
                    break;
                    case 10: startActivity(new Intent(MainActivity.this,PolicyActivity.class));
                    break;
                    case 11: startActivity(new Intent(MainActivity.this,Service_MeshActivity.class));
                    break;
                    case 12: startActivity(new Intent(MainActivity.this,OtherActivity.class));
                    break;
                }
            }
        });
    }
}