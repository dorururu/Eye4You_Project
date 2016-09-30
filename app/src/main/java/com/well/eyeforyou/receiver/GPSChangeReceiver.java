package com.well.eyeforyou.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

import com.well.eyeforyou.util.ConnectivityUtil;

public class GPSChangeReceiver extends BroadcastReceiver {
    public GPSChangeReceiver() {
    }

    @Override
    public void onReceive(Context context, Intent intent) {
        // TODO: This method is called when the BroadcastReceiver is receiving
        // an Intent broadcast.
        boolean status = ConnectivityUtil.getGPSConnectivityState(context);
        if(status==false){
        }
    }
}
