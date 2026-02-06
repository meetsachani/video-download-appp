package o;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

/* renamed from: o.hd2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C6841hd2 extends AbstractC2771Dp<Boolean> {
    public static final String i = AbstractC6949i41.f("StorageNotLowTracker");

    public C6841hd2(Context context, InterfaceC3748Nl2 taskExecutor) {
        super(context, taskExecutor);
    }

    @Override // o.AbstractC2771Dp
    public IntentFilter g() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.DEVICE_STORAGE_OK");
        intentFilter.addAction("android.intent.action.DEVICE_STORAGE_LOW");
        return intentFilter;
    }

    @Override // o.AbstractC2771Dp
    public void h(Context context, Intent intent) {
        if (intent.getAction() != null) {
            AbstractC6949i41.c().a(i, String.format("Received %s", intent.getAction()), new Throwable[0]);
            String action = intent.getAction();
            action.getClass();
            if (!action.equals("android.intent.action.DEVICE_STORAGE_LOW")) {
                if (!action.equals("android.intent.action.DEVICE_STORAGE_OK")) {
                    return;
                }
                d(Boolean.TRUE);
                return;
            }
            d(Boolean.FALSE);
        }
    }

    @Override // o.TK
    /* renamed from: i */
    public Boolean b() {
        Intent registerReceiver = this.b.registerReceiver(null, g());
        if (registerReceiver != null && registerReceiver.getAction() != null) {
            String action = registerReceiver.getAction();
            action.getClass();
            if (!action.equals("android.intent.action.DEVICE_STORAGE_LOW")) {
                if (!action.equals("android.intent.action.DEVICE_STORAGE_OK")) {
                    return null;
                }
                return Boolean.TRUE;
            }
            return Boolean.FALSE;
        }
        return Boolean.TRUE;
    }
}
