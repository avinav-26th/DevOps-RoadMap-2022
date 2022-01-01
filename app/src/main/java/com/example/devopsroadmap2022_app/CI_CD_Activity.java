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

public class CI_CD_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ci_cd);
        setTitle("CI-CD");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        ListView myListview = findViewById(R.id.cicd);
        ArrayList<String> topicsList = new ArrayList<>();
        topicsList.add("\nTools we should know about:\n");
        topicsList.add("1. GitHub Actions\n\n2. Jenkins\n\n3. Flux CD\n\n4. Argo CD\n\n5. Fleet\n");
        topicsList.add("\nResources:\n");
        topicsList.add("1. Jenkins complete course");
        topicsList.add("2. Github actions (techworldwithnana)");
        topicsList.add("3. GitHub actions with cloud run");
        topicsList.add("4. CI/CD week");
        topicsList.add("5. Get Certified for GitOps with Argo");

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this, R.layout.content_custom_layout, topicsList);
        myListview.setAdapter(arrayAdapter);

        myListview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i)
                {
                    case 3:
                    {
                        Uri uri = Uri.parse( "https://youtu.be/FX322RVNGj4" );
                        startActivity(new Intent(Intent.ACTION_VIEW, uri));
                        break;
                    }
                    case 4:
                    {
                        Uri uri = Uri.parse( "https://youtu.be/R8_veQiYBjI" );
                        startActivity(new Intent(Intent.ACTION_VIEW, uri));
                        break;
                    }
                    case 5:
                    {
                        Uri uri = Uri.parse( "https://youtu.be/eooi60Mks_0" );
                        startActivity(new Intent(Intent.ACTION_VIEW, uri));
                        break;
                    }
                    case 6:
                    {
                        Uri uri = Uri.parse( "https://www.youtube.com/playlist?list=PL5uLNcv9SibC0Osfk9Nhf7MgP2UNzZkDR" );
                        startActivity(new Intent(Intent.ACTION_VIEW, uri));
                        break;
                    }
                    case 7:
                    {
                        Uri uri = Uri.parse( "https:codefresh.learnworlds.com/" );
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