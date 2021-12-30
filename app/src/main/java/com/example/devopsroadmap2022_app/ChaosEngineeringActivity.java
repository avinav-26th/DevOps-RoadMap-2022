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

public class ChaosEngineeringActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chaos_engineering);

        ListView myListview = findViewById(R.id.chaos);
        ArrayList<String> topicsList = new ArrayList<>();
        topicsList.add("1. Resources:\n");
        topicsList.add("Chaos mesh CNCFMinutes");
        topicsList.add("Chaos mesh 2.0");
        topicsList.add("Litmus CNCFMinutes");
        topicsList.add("Cloud native chaos paradigms");

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, topicsList);
        myListview.setAdapter(arrayAdapter);

        myListview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i)
                {
                    case 1:
                    {
                        Uri uri = Uri.parse( "https://youtu.be/HAU_cjW1bMw" );
                        startActivity(new Intent(Intent.ACTION_VIEW, uri));
                        break;
                    }
                    case 2:
                    {
                        Uri uri = Uri.parse( "https://youtu.be/HmQ9cFwxF7g" );
                        startActivity(new Intent(Intent.ACTION_VIEW, uri));
                        break;
                    }
                    case 3:
                    {
                        Uri uri = Uri.parse( "https://youtu.be/rDQ9XKbSJIc" );
                        startActivity(new Intent(Intent.ACTION_VIEW, uri));
                        break;
                    }
                    case 4:
                    {
                        Uri uri = Uri.parse( "https://youtu.be/uBGPFfTu6TU" );
                        startActivity(new Intent(Intent.ACTION_VIEW, uri));
                        break;
                    }

                }
            }
        });
    }
}