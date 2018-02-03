package com.poc.projectapp.projectapp_poc;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickCinema(View view){
        Context context = this;
        Toast.makeText(context, "You clicked CINEMA!", Toast.LENGTH_SHORT).show();
    }
}
