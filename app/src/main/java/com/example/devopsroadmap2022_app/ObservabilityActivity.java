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

public class ObservabilityActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_observability);
        setTitle("Observability");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        ListView myListview = findViewById(R.id.observability);
        ArrayList<String> topicsList = new ArrayList<>();
        topicsList.add("\nHave a knowledge about:\n");
        topicsList.add("\n1. What is Observability\n\n2. Observability Pillars\nMonitering {Nagios, Prometheus, Thanos for HA & Grafana for Virtualization}\nLogging (Loki, Elastic)\\nTracing (Jaeger)\nProfiling (Parca)\n\n\n3. Set-up and Configuration of tools\n\n4. OpenTelemetry\n\n5. OpenTracing\n\n");
        topicsList.add("\nResources:\n");
        topicsList.add("1. Getting started with Jaeger");
        topicsList.add("2. Getting dirty with Monitoring and Autoscaling Features for Self Managed Kubernetes cluster");
        topicsList.add("3. Intro to Kubernetes monitoring ");
        topicsList.add("4. Prometheus CNCFMinutes");
        topicsList.add("5. Thanos CNCFMinutes");
        topicsList.add("6. Thanos deep dive");

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this, R.layout.content_custom_layout, topicsList);
        myListview.setAdapter(arrayAdapter);

        myListview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i)
                {
                    case 3:
                    {
                        Uri uri = Uri.parse( "https://youtu.be/aMZoUIG-mgY" );
                        startActivity(new Intent(Intent.ACTION_VIEW, uri));
                        break;
                    }
                    case 4:
                    {
                        Uri uri = Uri.parse( "https://youtu.be/TqfIfUuuPdE" );
                        startActivity(new Intent(Intent.ACTION_VIEW, uri));
                        break;
                    }
                    case 5:
                    {
                        Uri uri = Uri.parse( "https://youtu.be/B5UY-qeW96I" );
                        startActivity(new Intent(Intent.ACTION_VIEW, uri));
                        break;
                    }
                    case 6:
                    {
                        Uri uri = Uri.parse( "https://youtu.be/llwxJ0VdYWY" );
                        startActivity(new Intent(Intent.ACTION_VIEW, uri));
                        break;
                    }
                    case 7:
                    {
                        Uri uri = Uri.parse( "https://youtu.be/Pr3MbsGHljI" );
                        startActivity(new Intent(Intent.ACTION_VIEW, uri));
                        break;
                    }
                    case 8:
                    {
                        Uri uri = Uri.parse( "https://youtu.be/nYV_wU7_Xm0" );
                        startActivity(new Intent(Intent.ACTION_VIEW, uri));
                        break;
                    }

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