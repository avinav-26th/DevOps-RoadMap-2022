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

public class Prerequisites_LinuxActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prerequisites_linux);

        ListView myListview = findViewById(R.id.prerequisiteListLinux);
        ArrayList<String> topicsList = new ArrayList<>();
        topicsList.add("1. Become familiar with:");
        topicsList.add("Linux Distributions(ubuntu centos, fedora)\n");
        topicsList.add("Software installs for Linux distributions(eg. for ubuntu-apt, centos-yum)\n");
        topicsList.add("CLI commands (eg. user management, file management, text editor(like vim), systemd, process management)\n");
        topicsList.add("Writing small scripts for automation (learn basics of Shell-scripting)\n");
        topicsList.add("What are Web-Servers (eg. nginx, apache http)\n");
        topicsList.add("What is Proxy, Reverse proxy, HA proxy, Traffic\n");
        topicsList.add("What is SSH(secure-shell) and logging-in in the Cloud virtual machines(VMs)\n\n");
        topicsList.add("2. Resources:\n(click on the tiles below)");
        topicsList.add("Edx Linux Course");
        topicsList.add("DevOps Pre-requisites by freecodecamp.org");

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, topicsList);
        myListview.setAdapter(arrayAdapter);

        myListview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if(i == 9){
                    Uri uri = Uri.parse( "https://www.edx.org/course/introduction-to-linux" );
                    startActivity( new Intent( Intent.ACTION_VIEW, uri ) );
                }
                else if(i == 10){
                    Uri uri = Uri.parse( "https://www.youtube.com/watch?v=Wvf0mBNGjXY" );
                    startActivity( new Intent( Intent.ACTION_VIEW, uri ) );
                }
            }
        });
    }
}
