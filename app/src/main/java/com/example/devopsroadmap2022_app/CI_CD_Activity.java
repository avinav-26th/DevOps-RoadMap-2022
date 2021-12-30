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

public class CI_CD_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ci_cd);

        ListView myListview = findViewById(R.id.cicd);
        ArrayList<String> topicsList = new ArrayList<>();
        topicsList.add("1. Tools we should know about:\n");
        topicsList.add("GitHUb actions\n");
        topicsList.add("Jenkins\n");
        topicsList.add("Flux CD\n");
        topicsList.add("Argo CD\n");
        topicsList.add("Fleet\n");
        topicsList.add("2. Resources:\n");
        topicsList.add("Jenkins complete course");
        topicsList.add("Github actions (techworldwithnana)");
        topicsList.add("GitHub actions with cloud run");
        topicsList.add("CI/CD week");
        topicsList.add("Get Certified for GitOps with Argo");

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, topicsList);
        myListview.setAdapter(arrayAdapter);

        myListview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i)
                {
                    case 7:
                    {
                        Uri uri = Uri.parse( "https://youtu.be/FX322RVNGj4" );
                        startActivity(new Intent(Intent.ACTION_VIEW, uri));
                        break;
                    }
                    case 8:
                    {
                        Uri uri = Uri.parse( "https://youtu.be/R8_veQiYBjI" );
                        startActivity(new Intent(Intent.ACTION_VIEW, uri));
                        break;
                    }
                    case 9:
                    {
                        Uri uri = Uri.parse( "https://youtu.be/eooi60Mks_0" );
                        startActivity(new Intent(Intent.ACTION_VIEW, uri));
                        break;
                    }
                    case 10:
                    {
                        Uri uri = Uri.parse( "https://www.youtube.com/playlist?list=PL5uLNcv9SibC0Osfk9Nhf7MgP2UNzZkDR" );
                        startActivity(new Intent(Intent.ACTION_VIEW, uri));
                        break;
                    }
                    case 11:
                    {
                        Uri uri = Uri.parse( "https:codefresh.learnworlds.com/" );
                        startActivity(new Intent(Intent.ACTION_VIEW, uri));
                        break;
                    }

                }
            }
        });
    }
}