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

public class KubernetesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kubernetes);

        ListView myListview = findViewById(R.id.kubernetes);
        ArrayList<String> topicsList = new ArrayList<>();
        topicsList.add("1. We should be knowing:\n");
        topicsList.add("What is Kubernetes\n");
        topicsList.add("Architechture\nObjects\nSecrets\nConfiguration Maps\nPV, PVC\nNetworking\nServices\nService Mesh\nCI/CD\nAuto-Scaling\nChaos Engineering\nGitOps\nVelero\n");
        topicsList.add("Infrastructure Provisioning Tools (eg. Terraform, Pulumi, Crossplane, CAPI)\n");
        topicsList.add("How to setup a Kubernetes cluster on a compute node using containerD\n");
        topicsList.add("HA install using HA proxyor Kube VIP\n\n");
        topicsList.add("2. Resources:\n");
        topicsList.add("Civo Academy");
        topicsList.add("Kubernetes course (techworldwithnana)");
        topicsList.add("Kube academy");
        topicsList.add("Introduction to Kubernetes (edx)");
        topicsList.add("KCNA");
        topicsList.add("Hands on CKA/CKAD/CKS");
        topicsList.add("Certs Magic show");
        topicsList.add("CKS book");

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, topicsList);
        myListview.setAdapter(arrayAdapter);

        myListview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i)
                {
                    case 7:
                    {
                        Uri uri = Uri.parse( "https://www.civo.com/academy" );
                        startActivity(new Intent(Intent.ACTION_VIEW, uri));
                        break;
                    }
                    case 8:
                    {
                        Uri uri = Uri.parse( "https://youtu.be/X48VuDVv0do" );
                        startActivity(new Intent(Intent.ACTION_VIEW, uri));
                        break;
                    }
                    case 9:
                    {
                        Uri uri = Uri.parse( "https://kube.academy/" );
                        startActivity(new Intent(Intent.ACTION_VIEW, uri));
                        break;
                    }
                    case 10:
                    {
                        Uri uri = Uri.parse( "https://www.edx.org/course/introduction-to-kubernetes" );
                        startActivity(new Intent(Intent.ACTION_VIEW, uri));
                        break;
                    }
                    case 11:
                    {
                        Uri uri = Uri.parse( "https://youtu.be/iGkFHB1kFZ0" );
                        startActivity(new Intent(Intent.ACTION_VIEW, uri));
                        break;
                    }
                    case 12:
                    {
                        Uri uri = Uri.parse( "https://youtu.be/jZOs8Oips7Q" );
                        startActivity(new Intent(Intent.ACTION_VIEW, uri));
                        break;
                    }
                    case 13:
                    {
                        Uri uri = Uri.parse( "https://www.youtube.com/playlist?list=PLj6h78yzYM2MOZst3T8t2qpsdwBpyxWwy" );
                        startActivity(new Intent(Intent.ACTION_VIEW, uri));
                        break;
                    }
                    case 14:
                    {
                        Uri uri = Uri.parse( "https://saiyampathak.gumroad.com/l/cksbook" );
                        startActivity(new Intent(Intent.ACTION_VIEW, uri));
                        break;
                    }
                }
            }
        });
    }
}