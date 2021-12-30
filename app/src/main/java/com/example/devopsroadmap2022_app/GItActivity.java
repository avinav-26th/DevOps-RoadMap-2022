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

public class GItActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_git);

        ListView myListview = findViewById(R.id.git);
        ArrayList<String> topicsList = new ArrayList<>();
        topicsList.add("1. Resources:\n");
        topicsList.add("Complete Git and GitHub Tutorial (Kunal Kushwaha)");
        topicsList.add("Git and GitHub crash course (freecodecamp)");
        topicsList.add("Git for Professionals (freecodecamp)");

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, topicsList);
        myListview.setAdapter(arrayAdapter);

        myListview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i)
                {
                    case 1:
                    {
                        Uri uri = Uri.parse( "https://www.youtube.com/watch?v=RGOj5yH7evk" );
                        startActivity(new Intent(Intent.ACTION_VIEW, uri));
                        break;
                    }
                    case 2:
                    {
                        Uri uri = Uri.parse( "https://youtu.be/RGOj5yH7evk" );
                        startActivity(new Intent(Intent.ACTION_VIEW, uri));
                        break;
                    }
                    case 3:
                    {
                        Uri uri = Uri.parse( "https://youtu.be/Uszj_k0DGsg" );
                        startActivity(new Intent(Intent.ACTION_VIEW, uri));
                        break;
                    }

                }
            }
        });
    }
}