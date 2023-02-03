package com.example.buttonplayingapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";

    private Button buttonPlus,buttonMinus;
    private TextView textView;
    int counter= 0;


    @Override
    protected void onStart() {
        Log.d(TAG, "Paragini - onStart in");
        super.onStart();
        Log.d(TAG, "Paragini - onStart out");
    }

    @Override
    protected void onResume() {
        Log.d(TAG, "Paragini - onResume in");
        super.onResume();
        Log.d(TAG, "Paragini - onResume out");
    }

    @Override
    protected void onPause() {
        Log.d(TAG, "Paragini - onPause in");
        super.onPause();
        Log.d(TAG, "Paragini - onPause out");
    }

    @Override
    protected void onStop() {
        Log.d(TAG, "Paragini - onStop in");
        super.onStop();
        Log.d(TAG, "Paragini - onStop out");
    }

    @Override
    protected void onDestroy() {
        Log.d(TAG, "Paragini - onDestroy in");
        super.onDestroy();
        Log.d(TAG, "Paragini - onDestroy out");
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        Log.d(TAG, "Paragini - onSaveInstanceState in");
        super.onSaveInstanceState(outState);
        Log.d(TAG, "Paragini - onSaveInstanceState out");
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    //Link the component
        textView=(TextView) findViewById(R.id.counter);
        buttonMinus=(Button) findViewById(R.id.buttonMinus);
        buttonPlus=(Button) findViewById(R.id.buttonPlus);

        //Button Plus
        buttonPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                counter++; //adding +1 to the counter
                Log.d("BUTTON PLUS","onCreate()"+counter);
                textView.setText(Integer.toString(counter));
            }
        });

        //Button Minus
        buttonMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                counter--; //subtracting -1 from the counter
                Log.d("BUTTON MINUS","onCreate()" +counter);
                textView.setText(Integer.toString(counter));
            }
        });
    }


}