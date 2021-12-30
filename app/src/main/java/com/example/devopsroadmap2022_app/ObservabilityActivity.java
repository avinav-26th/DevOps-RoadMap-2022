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

public class ObservabilityActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_observability);

        ListView myListview = findViewById(R.id.observability);
        ArrayList<String> topicsList = new ArrayList<>();
        topicsList.add("1. Have a knowledge about:\n");
        topicsList.add("What is Observability\n");
        topicsList.add("Observability Pillars\\nMonitering {Nagios, Prometheus, Thanos for HA & Grafana for Virtualization}\\nLogging (Loki, Elastic)\\nTracing (Jaeger)\\nProfiling (Parca)\\n\n");
        topicsList.add("Set-up and Configuration of tools\n");
        topicsList.add("OpenTelemetry\n");
        topicsList.add("OpenTracing\n\n");
        topicsList.add("2. Resources:\n");
        topicsList.add("Getting started with Jaeger");
        topicsList.add("Getting dirty with Monitoring and Autoscaling Features for Self Managed Kubernetes cluster");
        topicsList.add("Intro to Kubernetes monitoring ");
        topicsList.add("Prometheus CNCFMinutes");
        topicsList.add("Thanos CNCFMinutes");
        topicsList.add("Thanos deep dive");

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, topicsList);
        myListview.setAdapter(arrayAdapter);

        myListview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i)
                {
                    case 7:
                    {
                        Uri uri = Uri.parse( "https://youtu.be/aMZoUIG-mgY" );
                        startActivity(new Intent(Intent.ACTION_VIEW, uri));
                        break;
                    }
                    case 8:
                    {
                        Uri uri = Uri.parse( "https://youtu.be/TqfIfUuuPdE" );
                        startActivity(new Intent(Intent.ACTION_VIEW, uri));
                        break;
                    }
                    case 9:
                    {
                        Uri uri = Uri.parse( "https://youtu.be/B5UY-qeW96I" );
                        startActivity(new Intent(Intent.ACTION_VIEW, uri));
                        break;
                    }
                    case 10:
                    {
                        Uri uri = Uri.parse( "https://youtu.be/llwxJ0VdYWY" );
                        startActivity(new Intent(Intent.ACTION_VIEW, uri));
                        break;
                    }
                    case 11:
                    {
                        Uri uri = Uri.parse( "https://youtu.be/Pr3MbsGHljI" );
                        startActivity(new Intent(Intent.ACTION_VIEW, uri));
                        break;
                    }
                    case 12:
                    {
                        Uri uri = Uri.parse( "https://youtu.be/nYV_wU7_Xm0" );
                        startActivity(new Intent(Intent.ACTION_VIEW, uri));
                        break;
                    }

                }
            }
        });
    }
}