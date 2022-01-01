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

public class IAC_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_iac);
        setTitle("Infrastructure as Code (IAC)");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        ListView myListview = findViewById(R.id.iac);
        ArrayList<String> topicsList = new ArrayList<>();
        topicsList.add("\nTools we should know\n");
        topicsList.add("\n1. Terraform\n\n2. Crossplane\n\n3. Pulumi\n\n4. Configuration Management - Ansible\n");
        topicsList.add("\nResources\n(learning Terraform should be Priority)");
        topicsList.add("1. Terrafrom in 2 hours (freecodecamp)");
        topicsList.add("2. Hashicorp terraform accociate certification (freecodecamp)");
        topicsList.add("3. Crossplane CNCFMinutes");
        topicsList.add("4. Crossplane deep dive");
        topicsList.add("5. Crossplane composition deepdive");
        topicsList.add("6. Learn pulumi");

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this, R.layout.content_custom_layout, topicsList);
        myListview.setAdapter(arrayAdapter);

        myListview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i)
                {
                    case 3:
                    {
                        Uri uri = Uri.parse( "https://youtu.be/SLB_c_ayRMo" );
                        startActivity(new Intent(Intent.ACTION_VIEW, uri));
                        break;
                    }
                    case 4:
                    {
                        Uri uri = Uri.parse( "https://youtu.be/V4waklkBC38" );
                        startActivity(new Intent(Intent.ACTION_VIEW, uri));
                        break;
                    }
                    case 5:
                    {
                        Uri uri = Uri.parse( "https://youtu.be/NLHmqVUvtkU" );
                        startActivity(new Intent(Intent.ACTION_VIEW, uri));
                        break;
                    }
                    case 6:
                    {
                        Uri uri = Uri.parse( "https://youtu.be/5lWUWat_bbY" );
                        startActivity(new Intent(Intent.ACTION_VIEW, uri));
                        break;
                    }
                    case 7:
                    {
                        Uri uri = Uri.parse( "https://youtu.be/78xR7ypzB4Q" );
                        startActivity(new Intent(Intent.ACTION_VIEW, uri));
                        break;
                    }
                    case 8:
                    {
                        Uri uri = Uri.parse( "https://youtu.be/vIjeiDcsR3Q" );
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