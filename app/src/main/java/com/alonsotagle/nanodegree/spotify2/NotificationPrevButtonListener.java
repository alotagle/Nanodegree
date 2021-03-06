package com.alonsotagle.nanodegree.spotify2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;

public class NotificationPrevButtonListener extends BroadcastReceiver {

    private SpotifyPlayerService mPlayerService;

    public NotificationPrevButtonListener() {

    }

    @Override
    public void onReceive(Context context, Intent intent) {

        IBinder binder = peekService(context, new Intent(context, SpotifyPlayerService.class));

        if (binder != null) {
            this.mPlayerService = ((SpotifyPlayerService.SpotifyPlayerBinder) binder).getService();
        }

        if(this.mPlayerService != null) {

            this.mPlayerService.playPrev();

        }

    }
}