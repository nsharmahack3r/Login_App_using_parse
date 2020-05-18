package com.tronpc.loginapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.parse.ParseUser;

public class dashboard extends AppCompatActivity {

    TextView name, email;
    ProgressBar progressBar;
    Button logout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        name=findViewById(R.id.student_name);
        email = findViewById(R.id.student_email);
        progressBar = findViewById(R.id.progress);
        progressBar.setVisibility(View.INVISIBLE);

        final ParseUser currentUser = ParseUser.getCurrentUser();
        name.setText(currentUser.get("Name").toString());
        email.setText(currentUser.get("email").toString());
        logout= findViewById(R.id.logout);
        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ParseUser.logOut();
                logout.setVisibility(View.INVISIBLE);
                progressBar.setVisibility(View.VISIBLE);
                Intent intent = new Intent(dashboard.this,MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}