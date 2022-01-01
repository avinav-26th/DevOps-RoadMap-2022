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

public class ContainersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_containers);
        setTitle("Virtualization & Containerization");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        ListView myListview = findViewById(R.id.containers);
        ArrayList<String> topicsList = new ArrayList<>();
        topicsList.add("We should be knowing:\n");
        topicsList.add("1. What is VM(Virtual Machine) and Container amd what are the differences between them\n\n2. Container Technologies(eg. Docker, Podman+Buildah, Kaniko, KO, Kim)\n\n3. Concepts like : OCI/CRI\n\n");
        topicsList.add("\nResources:\n(We need to learn only docker)");
        topicsList.add("1. Docker playlist by Saloni");
        topicsList.add("2. Docker (freecodecamp)");
        topicsList.add("3. Docker (Techworldwithnana)");
        topicsList.add("4. Docker deep dive by Nigel");
        topicsList.add("5. Dockerfile best practices (Advanced Users)");
        topicsList.add("6. Docker security essentials (Advanced Users)");
        topicsList.add("7. Auditing Docker security (Advanced Users)");
        topicsList.add("8. Docker in a visual way");
        topicsList.add("9. Ivan container articles");

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this, R.layout.content_custom_layout, topicsList);
        myListview.setAdapter(arrayAdapter);

        myListview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i)
                {
                    case 3:
                    {
                        Uri uri = Uri.parse( "https://www.youtube.com/playlist?list=PL5uLNcv9SibBZj30yqG01a7A4_MXSyGK3" );
                        startActivity(new Intent(Intent.ACTION_VIEW, uri));
                        break;
                    }
                    case 4:
                    {
                        Uri uri = Uri.parse( "https://youtu.be/9zUHg7xjIqQk" );
                        startActivity(new Intent(Intent.ACTION_VIEW, uri));
                        break;
                    }
                    case 5:
                    {
                        Uri uri = Uri.parse( "https://youtu.be/3c-iBn73dDE" );
                        startActivity(new Intent(Intent.ACTION_VIEW, uri));
                        break;
                    }
                    case 6:
                    {
                        Uri uri = Uri.parse( "https://youtu.be/GwXLNAcHk-k" );
                        startActivity(new Intent(Intent.ACTION_VIEW, uri));
                        break;
                    }
                    case 7:
                    {
                        Uri uri = Uri.parse( "https://youtu.be/JofsaZ3H1qM" );
                        startActivity(new Intent(Intent.ACTION_VIEW, uri));
                        break;
                    }
                    case 8:
                    {
                        Uri uri = Uri.parse( "https://youtu.be/KINjI1tlo2w" );
                        startActivity(new Intent(Intent.ACTION_VIEW, uri));
                        break;
                    }
                    case 9:
                    {
                        Uri uri = Uri.parse( "https://youtu.be/mQkVB6KMHCg" );
                        startActivity(new Intent(Intent.ACTION_VIEW, uri));
                        break;
                    }
                    case 10:
                    {
                        Uri uri = Uri.parse( "https://aurelievache.gumroad.com/l/understanding-docker-visual-way" );
                        startActivity(new Intent(Intent.ACTION_VIEW, uri));
                        break;
                    }
                    case 11:
                    {
                        Uri uri = Uri.parse( "https://iximiuz.com/en/categories/?category=Containers" );
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


