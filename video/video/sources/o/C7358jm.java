package o;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.google.firebase.analytics.FirebaseAnalytics;

/* renamed from: o.jm  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C7358jm extends AbstractC2771Dp<Boolean> {
    public static final String i = AbstractC6949i41.f("BatteryNotLowTracker");
    public static final float j = 0.15f;

    public C7358jm(Context context, InterfaceC3748Nl2 taskExecutor) {
        super(context, taskExecutor);
    }

    @Override // o.AbstractC2771Dp
    public IntentFilter g() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.BATTERY_OKAY");
        intentFilter.addAction("android.intent.action.BATTERY_LOW");
        return intentFilter;
    }

    @Override // o.AbstractC2771Dp
    public void h(Context context, Intent intent) {
        if (intent.getAction() != null) {
            AbstractC6949i41.c().a(i, String.format("Received %s", intent.getAction()), new Throwable[0]);
            String action = intent.getAction();
            action.getClass();
            if (!action.equals("android.intent.action.BATTERY_OKAY")) {
                if (!action.equals("android.intent.action.BATTERY_LOW")) {
                    return;
                }
                d(Boolean.FALSE);
                return;
            }
            d(Boolean.TRUE);
        }
    }

    @Override // o.TK
    /* renamed from: i */
    public Boolean b() {
        Intent registerReceiver = this.b.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        boolean z = false;
        if (registerReceiver == null) {
            AbstractC6949i41.c().b(i, "getInitialState - null intent received", new Throwable[0]);
            return null;
        }
        float intExtra = registerReceiver.getIntExtra(FirebaseAnalytics.Param.t, -1) / registerReceiver.getIntExtra("scale", -1);
        if (registerReceiver.getIntExtra("status", -1) == 1 || intExtra > 0.15f) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
