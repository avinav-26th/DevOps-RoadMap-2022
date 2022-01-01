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

public class KubernetesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kubernetes);
        setTitle("KUBERNETES");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        ListView myListview = findViewById(R.id.kubernetes);
        ArrayList<String> topicsList = new ArrayList<>();
        topicsList.add("\nWe should be knowing:\n");
        topicsList.add("1. What is Kubernetes\n\n2. Architechture\nObjects\nSecrets\nConfiguration Maps\nPV, PVC\nNetworking\nServices\nService Mesh\nCI/CD\nAuto-Scaling\nChaos Engineering\nGitOps\nVelero\n\n3. Infrastructure Provisioning Tools (eg. Terraform, Pulumi, Crossplane, CAPI)\n\n4. How to setup a Kubernetes cluster on a compute node using containerD\n\n5. HA install using HA proxyor Kube VIP\n\n");
        topicsList.add("\nResources:\n");
        topicsList.add("1. Civo Academy");
        topicsList.add("2. Kubernetes course (techworldwithnana)");
        topicsList.add("3. Kube academy");
        topicsList.add("4. Introduction to Kubernetes (edx)");
        topicsList.add("5. KCNA");
        topicsList.add("6. Hands on CKA/CKAD/CKS");
        topicsList.add("7. Certs Magic show");
        topicsList.add("8. CKS book");

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this, R.layout.content_custom_layout, topicsList);
        myListview.setAdapter(arrayAdapter);

        myListview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i)
                {
                    case 3:
                    {
                        Uri uri = Uri.parse( "https://www.civo.com/academy" );
                        startActivity(new Intent(Intent.ACTION_VIEW, uri));
                        break;
                    }
                    case 4:
                    {
                        Uri uri = Uri.parse( "https://youtu.be/X48VuDVv0do" );
                        startActivity(new Intent(Intent.ACTION_VIEW, uri));
                        break;
                    }
                    case 5:
                    {
                        Uri uri = Uri.parse( "https://kube.academy/" );
                        startActivity(new Intent(Intent.ACTION_VIEW, uri));
                        break;
                    }
                    case 6:
                    {
                        Uri uri = Uri.parse( "https://www.edx.org/course/introduction-to-kubernetes" );
                        startActivity(new Intent(Intent.ACTION_VIEW, uri));
                        break;
                    }
                    case 7:
                    {
                        Uri uri = Uri.parse( "https://youtu.be/iGkFHB1kFZ0" );
                        startActivity(new Intent(Intent.ACTION_VIEW, uri));
                        break;
                    }
                    case 8:
                    {
                        Uri uri = Uri.parse( "https://youtu.be/jZOs8Oips7Q" );
                        startActivity(new Intent(Intent.ACTION_VIEW, uri));
                        break;
                    }
                    case 9:
                    {
                        Uri uri = Uri.parse( "https://www.youtube.com/playlist?list=PLj6h78yzYM2MOZst3T8t2qpsdwBpyxWwy" );
                        startActivity(new Intent(Intent.ACTION_VIEW, uri));
                        break;
                    }
                    case 10:
                    {
                        Uri uri = Uri.parse( "https://saiyampathak.gumroad.com/l/cksbook" );
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