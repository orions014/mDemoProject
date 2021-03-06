package com.mcaredemo.mitu.mcaredemoproject; /**
 * Created by Mitu on 3/11/2018.
 */

 import android.util.Log;

 import com.google.firebase.messaging.RemoteMessage;
 import android.app.NotificationManager;
 import android.app.PendingIntent;
 import android.content.Context;
 import android.content.Intent;
 import android.media.RingtoneManager;
 import android.net.Uri;
 import android.support.v4.app.NotificationCompat;

public class FbMSG extends  com.google.firebase.messaging.FirebaseMessagingService {

    public FbMSG() {
//সুপ্রিয় কেয়ারগিভার , আজ মাসের শেষ দিন । আপনার সন্তানের  সার্ভে রিপোর্ট দেয়ার সময় হয়েছে । এই জন্য আপনাকে mCare-DMP তে লগিন করে এই মাসে আপনার সন্তানের আচরণ গত সকল প্রশ্নের উত্তর পূরণ করতে হবে ।
    }

    @Override
    public void onMessageReceived(RemoteMessage remoteMessage) {
        String title = remoteMessage.getNotification().getTitle();
        String message  = remoteMessage.getNotification().getBody();

        Log.d("FireBase","title "+title+"message "+message);

        sendNotification(title,message);

    }


    @Override
    public void onDeletedMessages() {
        super.onDeletedMessages();
    }


    private void sendNotification(String title,String messageBody) {
        Intent intent = new Intent(this, MainActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        PendingIntent pendingIntent = PendingIntent.getActivity(this, 0 /* Request code */, intent,
                PendingIntent.FLAG_ONE_SHOT);

        Uri defaultSoundUri= RingtoneManager.getDefaultUri(RingtoneManager.TYPE_NOTIFICATION);
        NotificationCompat.Builder notificationBuilder = new NotificationCompat.Builder(this)
                .setSmallIcon(R.mipmap.ic_launcher)
                .setContentTitle(title)
                .setContentText(messageBody)
                .setAutoCancel(true)
                .setSound(defaultSoundUri)
                .setContentIntent(pendingIntent);

        NotificationManager notificationManager =
                (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);

        notificationManager.notify(0 /* ID of notification */, notificationBuilder.build());
    }
}
