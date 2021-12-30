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

public class IAC_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_iac);

        ListView myListview = findViewById(R.id.iac);
        ArrayList<String> topicsList = new ArrayList<>();
        topicsList.add("1. Tools we should know\n");
        topicsList.add("Terraform");
        topicsList.add("Crossplane");
        topicsList.add("Pulumi\nConfiguration Management - Ansible");
        topicsList.add("2. Resources\n(learning Terraform should be Priority)");
        topicsList.add("Terrafrom in 2 hours (freecodecamp)");
        topicsList.add("Hashicorp terraform accociate certification (freecodecamp)");
        topicsList.add("Crossplane CNCFMinutes");
        topicsList.add("Crossplane deep dive");
        topicsList.add("Crossplane composition deepdive");
        topicsList.add("Learn pulumi ");

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, topicsList);
        myListview.setAdapter(arrayAdapter);

        myListview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i)
                {
                    case 5:
                    {
                        Uri uri = Uri.parse( "https://youtu.be/SLB_c_ayRMo" );
                        startActivity(new Intent(Intent.ACTION_VIEW, uri));
                        break;
                    }
                    case 6:
                    {
                        Uri uri = Uri.parse( "https://youtu.be/V4waklkBC38" );
                        startActivity(new Intent(Intent.ACTION_VIEW, uri));
                        break;
                    }
                    case 7:
                    {
                        Uri uri = Uri.parse( "https://youtu.be/NLHmqVUvtkU" );
                        startActivity(new Intent(Intent.ACTION_VIEW, uri));
                        break;
                    }
                    case 8:
                    {
                        Uri uri = Uri.parse( "https://youtu.be/5lWUWat_bbY" );
                        startActivity(new Intent(Intent.ACTION_VIEW, uri));
                        break;
                    }
                    case 9:
                    {
                        Uri uri = Uri.parse( "https://youtu.be/78xR7ypzB4Q" );
                        startActivity(new Intent(Intent.ACTION_VIEW, uri));
                        break;
                    }
                    case 10:
                    {
                        Uri uri = Uri.parse( "https://youtu.be/vIjeiDcsR3Q" );
                        startActivity(new Intent(Intent.ACTION_VIEW, uri));
                        break;
                    }

                }
            }
        });
    }
}