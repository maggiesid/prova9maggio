package com.example.margheritasidoti.a9maggio;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = (Button)findViewById(R.id.button);
        Log.i("MAIN", "DEVELOP");
        Log.i("MAIN", "DEVELOP 2");
        Log.i("MAIN", "DEVELOP 3");
        Log.i("MAIN", "MASTER 4");
        Log.i("MAIN", "develop-1 5");
        Log.i("MAIN", "develop-1 6");
        Log.i("MAIN", "develop-1 7");

        Log.i("MAIN", "develop-1 8");
        Log.i("MAIN", "task tracked 9");
        Log.i("MAIN", "task tracked 10");
        Log.i("MAIN", "task tracked 2  11");
        Log.i("MAIN", "NON TRACKED 12");

        Log.i("MAIN", "6 giugno");

        Log.i("MAIN", "6 giugno da 2");
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, SecondActivity.class);
                startActivity(i);
                Log.i("MAIN", "6 giugno dal primo");
                Log.i("MAIN", "6 giugno DI NUOVO dal primo");
            }
        });

    }
}
