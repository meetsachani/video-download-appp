package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.background.systemalarm.ConstraintProxy;
import o.AbstractC6949i41;
import o.C3107Gx1;
import o.ZM2;

/* loaded from: classes.dex */
public class ConstraintProxyUpdateReceiver extends BroadcastReceiver {
    public static final String a = AbstractC6949i41.f("ConstrntProxyUpdtRecvr");
    public static final String b = "androidx.work.impl.background.systemalarm.UpdateProxies";
    public static final String c = "KEY_BATTERY_NOT_LOW_PROXY_ENABLED";
    public static final String d = "KEY_BATTERY_CHARGING_PROXY_ENABLED";
    public static final String e = "KEY_STORAGE_NOT_LOW_PROXY_ENABLED";
    public static final String f = "KEY_NETWORK_STATE_PROXY_ENABLED";

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public final /* synthetic */ Intent X;
        public final /* synthetic */ Context Y;
        public final /* synthetic */ BroadcastReceiver.PendingResult Z;

        public a(final Intent val$intent, final Context val$context, final BroadcastReceiver.PendingResult val$pendingResult) {
            this.X = val$intent;
            this.Y = val$context;
            this.Z = val$pendingResult;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                boolean booleanExtra = this.X.getBooleanExtra(ConstraintProxyUpdateReceiver.c, false);
                boolean booleanExtra2 = this.X.getBooleanExtra(ConstraintProxyUpdateReceiver.d, false);
                boolean booleanExtra3 = this.X.getBooleanExtra(ConstraintProxyUpdateReceiver.e, false);
                boolean booleanExtra4 = this.X.getBooleanExtra(ConstraintProxyUpdateReceiver.f, false);
                AbstractC6949i41.c().a(ConstraintProxyUpdateReceiver.a, String.format("Updating proxies: BatteryNotLowProxy enabled (%s), BatteryChargingProxy enabled (%s), StorageNotLowProxy (%s), NetworkStateProxy enabled (%s)", Boolean.valueOf(booleanExtra), Boolean.valueOf(booleanExtra2), Boolean.valueOf(booleanExtra3), Boolean.valueOf(booleanExtra4)), new Throwable[0]);
                C3107Gx1.c(this.Y, ConstraintProxy.BatteryNotLowProxy.class, booleanExtra);
                C3107Gx1.c(this.Y, ConstraintProxy.BatteryChargingProxy.class, booleanExtra2);
                C3107Gx1.c(this.Y, ConstraintProxy.StorageNotLowProxy.class, booleanExtra3);
                C3107Gx1.c(this.Y, ConstraintProxy.NetworkStateProxy.class, booleanExtra4);
            } finally {
                this.Z.finish();
            }
        }
    }

    public static Intent a(Context context, boolean batteryNotLowProxyEnabled, boolean batteryChargingProxyEnabled, boolean storageNotLowProxyEnabled, boolean networkStateProxyEnabled) {
        Intent intent = new Intent(b);
        intent.setComponent(new ComponentName(context, ConstraintProxyUpdateReceiver.class));
        intent.putExtra(c, batteryNotLowProxyEnabled).putExtra(d, batteryChargingProxyEnabled).putExtra(e, storageNotLowProxyEnabled).putExtra(f, networkStateProxyEnabled);
        return intent;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(final Context context, final Intent intent) {
        String str;
        if (intent != null) {
            str = intent.getAction();
        } else {
            str = null;
        }
        if (!b.equals(str)) {
            AbstractC6949i41.c().a(a, String.format("Ignoring unknown action %s", str), new Throwable[0]);
            return;
        }
        ZM2.H(context).O().o(new a(intent, context, goAsync()));
    }
}
