package com.example.mobilelab;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button next;
    private Button fp;
    private Button ca;
    private EditText name;
    private EditText password;
    private ImageView image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        next = findViewById(R.id.next);
        next.setOnClickListener(this);
        fp = findViewById(R.id.fp);
        fp.setOnClickListener(this);
        ca = findViewById(R.id.ca);
        ca.setOnClickListener(this);
        name = findViewById(R.id.name);
        password = findViewById(R.id.password);


    }


    @Override
    public void onClick(View v) {
        if (v.getId() == next.getId()) {
            Intent intent = new Intent(this, Nextstr.class);
            startActivity(intent);
        }
    }
}
