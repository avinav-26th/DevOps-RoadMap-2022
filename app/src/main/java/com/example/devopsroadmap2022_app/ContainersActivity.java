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

public class ContainersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_containers);

        ListView myListview = findViewById(R.id.containers);
        ArrayList<String> topicsList = new ArrayList<>();
        topicsList.add("1. We should be knowing:\n");
        topicsList.add("What is VM(Virtual Machine) and Container amd what are the differences between them\n");
        topicsList.add("Container Technologies(eg. Docker, Podman+Buildah, Kaniko, KO, Kim)\n");
        topicsList.add("Concepts like : OCI/CRI\n");
        topicsList.add("2. Resources:\n(We need to learn only docker)");
        topicsList.add("Docker playlist by Saloni");
        topicsList.add("Docker ((freecodecamp)");
        topicsList.add("Docker (Techworldwithnana)");
        topicsList.add("Docker deep dive by Nigel");
        topicsList.add("Dockerfile best practices (Advanced Users)");
        topicsList.add("Docker security essentials (Advanced Users)");
        topicsList.add("Auditing Docker security (Advanced Users)");
        topicsList.add("Docker in a visual way");
        topicsList.add("Ivan container articles");

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, topicsList);
        myListview.setAdapter(arrayAdapter);

        myListview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i)
                {
                    case 5:
                    {
                        Uri uri = Uri.parse( "https://www.youtube.com/playlist?list=PL5uLNcv9SibBZj30yqG01a7A4_MXSyGK3" );
                        startActivity(new Intent(Intent.ACTION_VIEW, uri));
                        break;
                    }
                    case 6:
                    {
                        Uri uri = Uri.parse( "https://youtu.be/9zUHg7xjIqQk" );
                        startActivity(new Intent(Intent.ACTION_VIEW, uri));
                        break;
                    }
                    case 7:
                    {
                        Uri uri = Uri.parse( "https://youtu.be/3c-iBn73dDE" );
                        startActivity(new Intent(Intent.ACTION_VIEW, uri));
                        break;
                    }
                    case 8:
                    {
                        Uri uri = Uri.parse( "https://youtu.be/GwXLNAcHk-k" );
                        startActivity(new Intent(Intent.ACTION_VIEW, uri));
                        break;
                    }
                    case 9:
                    {
                        Uri uri = Uri.parse( "https://youtu.be/JofsaZ3H1qM" );
                        startActivity(new Intent(Intent.ACTION_VIEW, uri));
                        break;
                    }
                    case 10:
                    {
                        Uri uri = Uri.parse( "https://youtu.be/KINjI1tlo2w" );
                        startActivity(new Intent(Intent.ACTION_VIEW, uri));
                        break;
                    }
                    case 11:
                    {
                        Uri uri = Uri.parse( "https://youtu.be/mQkVB6KMHCg" );
                        startActivity(new Intent(Intent.ACTION_VIEW, uri));
                        break;
                    }
                    case 12:
                    {
                        Uri uri = Uri.parse( "https://aurelievache.gumroad.com/l/understanding-docker-visual-way" );
                        startActivity(new Intent(Intent.ACTION_VIEW, uri));
                        break;
                    }
                    case 13:
                    {
                        Uri uri = Uri.parse( "https://iximiuz.com/en/categories/?category=Containers" );
                        startActivity(new Intent(Intent.ACTION_VIEW, uri));
                        break;
                    }
                }
            }
        });
    }
}


