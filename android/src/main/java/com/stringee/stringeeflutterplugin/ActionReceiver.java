package com.stringee.stringeeflutterplugin;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;

public class ActionReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        Handler handler = new Handler(Looper.getMainLooper());
        String actionId = intent.getStringExtra(StringeeNotification.STRINGEE_NOTIFICATION_ACTION_ID);
        if (actionId != null) {
            handler.post(new Runnable() {
                @Override
                public void run() {
                    PacketSenderThread.getInstance().send(actionId);
                }
            });
        }
    }
}