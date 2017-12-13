package com.hmrtraintimings;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Routes extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_routes);
    }

    public void traintimings(View view){
        Intent intent = new Intent(this, TrainTimings.class );
        startActivity(intent);
    }

    public void traintimings2(View view){
        Intent intent = new Intent(this, TrainTimings2.class);
        startActivity(intent);
    }

    public void metro(View view){
        Intent intent = new Intent(this, Metro.class);
        startActivity(intent);
    }
}
