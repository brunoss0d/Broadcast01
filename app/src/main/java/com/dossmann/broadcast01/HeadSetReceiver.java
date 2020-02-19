package com.dossmann.broadcast01;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.TextView;

public class HeadSetReceiver extends BroadcastReceiver {

    private TextView tv;

    public HeadSetReceiver(TextView tv){

        this.tv = tv;
    }

    @Override
    public void onReceive(Context context, Intent intent) {

        if (intent.hasExtra("state")){
            if (intent.getIntExtra("state", 0) ==0){
                tv.setText("HEADSET UNPLUGGED");
            }else {
                tv.setText("HEADSET PLUGGED");
            }

        }
    }
}
