package com.dossmann.broadcast01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView myTextView = findViewById(R.id.isJackOn);

        registerReceiver(new HeadSetReceiver(myTextView), new IntentFilter(Intent.ACTION_HEADSET_PLUG));

    }


    public void onResume() {

        super.onResume();

    }
}
