package com.example.devopsroadmap2022_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class Prerequisites_LinuxActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle("Linux OS");
        setContentView(R.layout.activity_prerequisites_linux);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        ListView myListview = findViewById(R.id.prerequisiteListLinux);
        ArrayList<String> topicsList = new ArrayList<>();
        topicsList.add("\nBecome familiar with:\n");
        topicsList.add("1. Linux Distributions(ubuntu, centos, fedora)\n\n2.Software installs for Linux distributions(eg. for ubuntu-apt, centos-yum)\n\n3. CLI commands (eg. user management, file management, text editor(like Vim), systemD, process management)\n\n4. Writing small scripts for automation (learn basics of Shell-scripting)\n\n5. What are Web-Servers (eg. nginx, apache http)\n\n6. What is Proxy, Reverse proxy, HA proxy, Traffic\n\n7. What is SSH(secure-shell) and logging-in in the Cloud virtual machines(VMs)\n\n");
        topicsList.add("\nResources:\n");
        topicsList.add("1. Edx Linux Course");
        topicsList.add("2. DevOps Pre-requisites by freecodecamp.org");

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this, R.layout.content_custom_layout, topicsList);
        myListview.setAdapter(arrayAdapter);

        myListview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if(i == 3){
                    Uri uri = Uri.parse( "https://www.edx.org/course/introduction-to-linux" );
                    startActivity( new Intent( Intent.ACTION_VIEW, uri ) );
                }
                else if(i == 4){
                    Uri uri = Uri.parse( "https://www.youtube.com/watch?v=Wvf0mBNGjXY" );
                    startActivity( new Intent( Intent.ACTION_VIEW, uri ) );
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