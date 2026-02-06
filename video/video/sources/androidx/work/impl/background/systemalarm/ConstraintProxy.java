package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.List;
import o.AbstractC6949i41;
import o.C8501oN2;
import o.EnumC3763Np1;
import o.XK;

/* loaded from: classes.dex */
public abstract class ConstraintProxy extends BroadcastReceiver {
    public static final String a = AbstractC6949i41.f("ConstraintProxy");

    /* loaded from: classes.dex */
    public static class BatteryChargingProxy extends ConstraintProxy {
        @Override // androidx.work.impl.background.systemalarm.ConstraintProxy, android.content.BroadcastReceiver
        public /* bridge */ /* synthetic */ void onReceive(Context context, Intent intent) {
            super.onReceive(context, intent);
        }
    }

    /* loaded from: classes.dex */
    public static class BatteryNotLowProxy extends ConstraintProxy {
        @Override // androidx.work.impl.background.systemalarm.ConstraintProxy, android.content.BroadcastReceiver
        public /* bridge */ /* synthetic */ void onReceive(Context context, Intent intent) {
            super.onReceive(context, intent);
        }
    }

    /* loaded from: classes.dex */
    public static class NetworkStateProxy extends ConstraintProxy {
        @Override // androidx.work.impl.background.systemalarm.ConstraintProxy, android.content.BroadcastReceiver
        public /* bridge */ /* synthetic */ void onReceive(Context context, Intent intent) {
            super.onReceive(context, intent);
        }
    }

    /* loaded from: classes.dex */
    public static class StorageNotLowProxy extends ConstraintProxy {
        @Override // androidx.work.impl.background.systemalarm.ConstraintProxy, android.content.BroadcastReceiver
        public /* bridge */ /* synthetic */ void onReceive(Context context, Intent intent) {
            super.onReceive(context, intent);
        }
    }

    public static void a(Context context, List<C8501oN2> workSpecs) {
        boolean z;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        for (C8501oN2 c8501oN2 : workSpecs) {
            XK xk = c8501oN2.j;
            z2 |= xk.f();
            z3 |= xk.g();
            z4 |= xk.i();
            if (xk.b() != EnumC3763Np1.NOT_REQUIRED) {
                z = true;
            } else {
                z = false;
            }
            z5 |= z;
            if (z2 && z3 && z4 && z5) {
                break;
            }
        }
        context.sendBroadcast(ConstraintProxyUpdateReceiver.a(context, z2, z3, z4, z5));
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        AbstractC6949i41.c().a(a, String.format("onReceive : %s", intent), new Throwable[0]);
        context.startService(a.a(context));
    }
}
