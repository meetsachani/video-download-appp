package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.app.KeyguardManager;
import android.content.Context;
import android.content.IntentFilter;
import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
public final class zzfmh {
    @SuppressLint({"StaticFieldLeak"})
    public static final zzfmh d = new zzfmh();
    public WeakReference a;
    public boolean b = false;
    public boolean c = false;

    public static zzfmh a() {
        return d;
    }

    public final void c() {
        KeyguardManager keyguardManager;
        Context context = (Context) this.a.get();
        if (context != null && (keyguardManager = (KeyguardManager) context.getSystemService("keyguard")) != null) {
            boolean isDeviceLocked = keyguardManager.isDeviceLocked();
            d(this.b, isDeviceLocked);
            this.c = isDeviceLocked;
        }
    }

    public final void d(boolean z, boolean z2) {
        boolean z3;
        boolean z4;
        boolean z5;
        if (z2 || z) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (this.c || this.b) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z3 != z4) {
            for (zzflf zzflfVar : zzflx.a().c()) {
                zzfmn g = zzflfVar.g();
                if (z2 || z) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                g.m(z5);
            }
        }
    }

    public final void e(Context context) {
        if (context == null) {
            return;
        }
        this.a = new WeakReference(context);
        IntentFilter intentFilter = new IntentFilter("android.intent.action.SCREEN_OFF");
        intentFilter.addAction("android.intent.action.SCREEN_ON");
        context.registerReceiver(new zzfmg(this), intentFilter);
    }
}
