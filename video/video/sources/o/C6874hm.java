package o;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

/* renamed from: o.hm  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C6874hm extends AbstractC2771Dp<Boolean> {
    public static final String i = AbstractC6949i41.f("BatteryChrgTracker");

    public C6874hm(Context context, InterfaceC3748Nl2 taskExecutor) {
        super(context, taskExecutor);
    }

    @Override // o.AbstractC2771Dp
    public IntentFilter g() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.os.action.CHARGING");
        intentFilter.addAction("android.os.action.DISCHARGING");
        return intentFilter;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004e, code lost:
        if (r5.equals("android.intent.action.ACTION_POWER_DISCONNECTED") == false) goto L5;
     */
    @Override // o.AbstractC2771Dp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void h(Context context, Intent intent) {
        String action = intent.getAction();
        if (action != null) {
            char c = 0;
            AbstractC6949i41.c().a(i, String.format("Received %s", action), new Throwable[0]);
            switch (action.hashCode()) {
                case -1886648615:
                    break;
                case -54942926:
                    if (action.equals("android.os.action.DISCHARGING")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case 948344062:
                    if (action.equals("android.os.action.CHARGING")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case 1019184907:
                    if (action.equals("android.intent.action.ACTION_POWER_CONNECTED")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            switch (c) {
                case 0:
                    d(Boolean.FALSE);
                    return;
                case 1:
                    d(Boolean.FALSE);
                    return;
                case 2:
                    d(Boolean.TRUE);
                    return;
                case 3:
                    d(Boolean.TRUE);
                    return;
                default:
                    return;
            }
        }
    }

    @Override // o.TK
    /* renamed from: i */
    public Boolean b() {
        Intent registerReceiver = this.b.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (registerReceiver == null) {
            AbstractC6949i41.c().b(i, "getInitialState - null intent received", new Throwable[0]);
            return null;
        }
        return Boolean.valueOf(j(registerReceiver));
    }

    public final boolean j(Intent intent) {
        int intExtra = intent.getIntExtra("status", -1);
        if (intExtra != 2 && intExtra != 5) {
            return false;
        }
        return true;
    }
}
