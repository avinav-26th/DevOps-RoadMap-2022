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

public class PolicyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_policy);
        setTitle("Policy");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        ListView myListview = findViewById(R.id.policy);
        ArrayList<String> topicsList = new ArrayList<>();
        topicsList.add("\nMojor Projects we should know about:\n");
        topicsList.add("\n1. Kubewarden\n\n2. OPA(Open Policy Agent)\n\n3. Kyverno\n\n4. js Policy\n");
        topicsList.add("\nResources\n");
        topicsList.add("1. Kyverno CNCFMinutes");
        topicsList.add("2. Kyverno deep dive");
        topicsList.add("3. Kyverno courses ");
        topicsList.add("4. jsPolicy");
        topicsList.add("5. Kubewarden");
        topicsList.add("6. OPA CNCFMinutes");
        topicsList.add("7. OPA deep dive");
        topicsList.add("8. Various policy engines for Kubernetes");
        topicsList.add("9. Styra Academy");

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this, R.layout.content_custom_layout, topicsList);
        myListview.setAdapter(arrayAdapter);

        myListview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i)
                {
                    case 3:
                    {
                        Uri uri = Uri.parse( "https://youtu.be/Bo8KhWhNY6g" );
                        startActivity(new Intent(Intent.ACTION_VIEW, uri));
                        break;
                    }
                    case 4:
                    {
                        Uri uri = Uri.parse( "https://youtu.be/QR-iBeh9Vy0" );
                        startActivity(new Intent(Intent.ACTION_VIEW, uri));
                        break;
                    }
                    case 5:
                    {
                        Uri uri = Uri.parse( "https://learn.nirmata.com/courses/" );
                        startActivity(new Intent(Intent.ACTION_VIEW, uri));
                        break;
                    }
                    case 6:
                    {
                        Uri uri = Uri.parse( "https://youtu.be/AzPczzKW71A" );
                        startActivity(new Intent(Intent.ACTION_VIEW, uri));
                        break;
                    }
                    case 7:
                    {
                        Uri uri = Uri.parse( "https://youtu.be/b14YkyrLFcs" );
                        startActivity(new Intent(Intent.ACTION_VIEW, uri));
                        break;
                    }
                    case 8:
                    {
                        Uri uri = Uri.parse( "https://youtu.be/49my68py3KY" );
                        startActivity(new Intent(Intent.ACTION_VIEW, uri));
                        break;
                    }
                    case 9:
                    {
                        Uri uri = Uri.parse( "https://youtu.be/J6tM9O-0LvI" );
                        startActivity(new Intent(Intent.ACTION_VIEW, uri));
                        break;
                    }
                    case 10:
                    {
                        Uri uri = Uri.parse( "https://youtu.be/gKQOq7904h8" );
                        startActivity(new Intent(Intent.ACTION_VIEW, uri));
                        break;
                    }
                    case 11:
                    {
                        Uri uri = Uri.parse( "https://academy.styra.com/courses/opa-rego" );
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