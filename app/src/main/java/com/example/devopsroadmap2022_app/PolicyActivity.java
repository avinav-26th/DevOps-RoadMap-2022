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

public class PolicyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_policy);

        ListView myListview = findViewById(R.id.policy);
        ArrayList<String> topicsList = new ArrayList<>();
        topicsList.add("1. Mojor Projects we should know about:\n");
        topicsList.add("Kubewarden\n");
        topicsList.add("OPA(Open Policy Agent)\n");
        topicsList.add("Kyverno\n");
        topicsList.add("js Policy");
        topicsList.add("2. Resources\n");
        topicsList.add("Kyverno CNCFMinutes");
        topicsList.add("Kyverno deep dive");
        topicsList.add("Kyverno courses ");
        topicsList.add("jsPolicy");
        topicsList.add("Kubewarden");
        topicsList.add("OPA CNCFMinutes");
        topicsList.add("OPA deep dive");
        topicsList.add("Various policy engines for Kubernetes");
        topicsList.add("Styra Academy");

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, topicsList);
        myListview.setAdapter(arrayAdapter);

        myListview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i)
                {
                    case 6:
                    {
                        Uri uri = Uri.parse( "https://youtu.be/Bo8KhWhNY6g" );
                        startActivity(new Intent(Intent.ACTION_VIEW, uri));
                        break;
                    }
                    case 7:
                    {
                        Uri uri = Uri.parse( "https://youtu.be/QR-iBeh9Vy0" );
                        startActivity(new Intent(Intent.ACTION_VIEW, uri));
                        break;
                    }
                    case 8:
                    {
                        Uri uri = Uri.parse( "https://learn.nirmata.com/courses/" );
                        startActivity(new Intent(Intent.ACTION_VIEW, uri));
                        break;
                    }
                    case 9:
                    {
                        Uri uri = Uri.parse( "https://youtu.be/AzPczzKW71A" );
                        startActivity(new Intent(Intent.ACTION_VIEW, uri));
                        break;
                    }
                    case 10:
                    {
                        Uri uri = Uri.parse( "https://youtu.be/b14YkyrLFcs" );
                        startActivity(new Intent(Intent.ACTION_VIEW, uri));
                        break;
                    }
                    case 11:
                    {
                        Uri uri = Uri.parse( "https://youtu.be/49my68py3KY" );
                        startActivity(new Intent(Intent.ACTION_VIEW, uri));
                        break;
                    }
                    case 12:
                    {
                        Uri uri = Uri.parse( "https://youtu.be/J6tM9O-0LvI" );
                        startActivity(new Intent(Intent.ACTION_VIEW, uri));
                        break;
                    }
                    case 13:
                    {
                        Uri uri = Uri.parse( "https://youtu.be/gKQOq7904h8" );
                        startActivity(new Intent(Intent.ACTION_VIEW, uri));
                        break;
                    }
                    case 14:
                    {
                        Uri uri = Uri.parse( "https://academy.styra.com/courses/opa-rego" );
                        startActivity(new Intent(Intent.ACTION_VIEW, uri));
                        break;
                    }

                }
            }
        });
    }
}