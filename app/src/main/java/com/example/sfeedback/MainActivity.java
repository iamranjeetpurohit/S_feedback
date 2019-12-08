package com.example.sfeedback;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button adminButton, studentButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_main);

        adminButton = (Button) findViewById(R.id.admin);
        studentButton = (Button) findViewById(R.id.student);

        adminButton.setOnClickListener(this);
        studentButton.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        if (id == R.id.admin) {
            Intent in = new Intent(MainActivity.this, AdminLogin.class);
            startActivity(in);
        } else if (id == R.id.student) {
            Intent in = new Intent(MainActivity.this, StudentLoginActivity.class);
            startActivity(in);
        }
    }
}
