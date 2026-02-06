package com.google.firebase.iid;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.cloudmessaging.CloudMessage;
import com.google.android.gms.cloudmessaging.CloudMessagingReceiver;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.FcmBroadcastProcessor;
import com.google.firebase.messaging.MessagingAnalytics;
import java.util.concurrent.ExecutionException;
import o.InterfaceC10697xN2;
import o.InterfaceC5670cr1;

/* loaded from: classes3.dex */
public final class FirebaseInstanceIdReceiver extends CloudMessagingReceiver {
    public static final String b = "FirebaseMessaging";

    public static Intent g(@InterfaceC5670cr1 Context context, @InterfaceC5670cr1 String str, @InterfaceC5670cr1 Bundle bundle) {
        return new Intent(str).putExtras(bundle);
    }

    @Override // com.google.android.gms.cloudmessaging.CloudMessagingReceiver
    @InterfaceC10697xN2
    public int b(@InterfaceC5670cr1 Context context, @InterfaceC5670cr1 CloudMessage cloudMessage) {
        try {
            return ((Integer) Tasks.a(new FcmBroadcastProcessor(context).g(cloudMessage.G0()))).intValue();
        } catch (InterruptedException | ExecutionException e) {
            Log.e("FirebaseMessaging", "Failed to send message to service.", e);
            return 500;
        }
    }

    @Override // com.google.android.gms.cloudmessaging.CloudMessagingReceiver
    @InterfaceC10697xN2
    public void c(@InterfaceC5670cr1 Context context, @InterfaceC5670cr1 Bundle bundle) {
        Intent g = g(context, CloudMessagingReceiver.IntentActionKeys.b, bundle);
        if (MessagingAnalytics.E(g)) {
            MessagingAnalytics.v(g);
        }
    }
}
