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

public class Service_MeshActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_service_mesh);

        ListView myListview = findViewById(R.id.service);
        ArrayList<String> topicsList = new ArrayList<>();
        topicsList.add("1. Some service-mesh:\n");
        topicsList.add("Linkerd\n");
        topicsList.add("Istio\n");
        topicsList.add("2. Resources:\n");
        topicsList.add("Introduction to Service mesh with Linkerd");

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, topicsList);
        myListview.setAdapter(arrayAdapter);

        myListview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if (i==4)
                {
                    Uri uri = Uri.parse( "https://www.edx.org/course/introduction-to-service-mesh-with-linkerd" );
                    startActivity(new Intent(Intent.ACTION_VIEW, uri));
                }
            }
        });
    }
}
