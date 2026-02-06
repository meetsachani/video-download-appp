package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import o.AbstractC6949i41;
import o.ZM2;

/* loaded from: classes.dex */
public class RescheduleReceiver extends BroadcastReceiver {
    public static final String a = AbstractC6949i41.f("RescheduleReceiver");

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        AbstractC6949i41.c().a(a, String.format("Received intent %s", intent), new Throwable[0]);
        try {
            ZM2.H(context).T(goAsync());
        } catch (IllegalStateException e) {
            AbstractC6949i41.c().b(a, "Cannot reschedule jobs. WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().", e);
        }
    }
}
