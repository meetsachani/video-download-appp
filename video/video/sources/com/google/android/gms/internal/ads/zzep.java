package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.List;
import o.InterfaceC11300zs1;
import o.InterfaceC8710pF0;

/* loaded from: classes2.dex */
public final class zzep implements zzdq {
    @InterfaceC8710pF0("messagePool")
    public static final List b = new ArrayList(50);
    public final Handler a;

    public zzep(Handler handler) {
        this.a = handler;
    }

    public static /* bridge */ /* synthetic */ void b(zzen zzenVar) {
        List list = b;
        synchronized (list) {
            try {
                if (list.size() < 50) {
                    list.add(zzenVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static zzen c() {
        zzen zzenVar;
        List list = b;
        synchronized (list) {
            try {
                if (list.isEmpty()) {
                    zzenVar = new zzen(null);
                } else {
                    zzenVar = (zzen) list.remove(list.size() - 1);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzenVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdq
    public final void A(int i) {
        this.a.removeMessages(i);
    }

    @Override // com.google.android.gms.internal.ads.zzdq
    public final boolean W(int i) {
        return this.a.hasMessages(1);
    }

    @Override // com.google.android.gms.internal.ads.zzdq
    public final Looper a() {
        return this.a.getLooper();
    }

    @Override // com.google.android.gms.internal.ads.zzdq
    public final void e(@InterfaceC11300zs1 Object obj) {
        this.a.removeCallbacksAndMessages(null);
    }

    @Override // com.google.android.gms.internal.ads.zzdq
    public final zzdp f(int i, @InterfaceC11300zs1 Object obj) {
        Handler handler = this.a;
        zzen c = c();
        c.b(handler.obtainMessage(i, obj), this);
        return c;
    }

    @Override // com.google.android.gms.internal.ads.zzdq
    public final boolean g(zzdp zzdpVar) {
        return ((zzen) zzdpVar).c(this.a);
    }

    @Override // com.google.android.gms.internal.ads.zzdq
    public final boolean h(Runnable runnable) {
        return this.a.post(runnable);
    }

    @Override // com.google.android.gms.internal.ads.zzdq
    public final boolean i(int i, long j) {
        return this.a.sendEmptyMessageAtTime(2, j);
    }

    @Override // com.google.android.gms.internal.ads.zzdq
    public final zzdp j(int i, int i2, int i3) {
        Handler handler = this.a;
        zzen c = c();
        c.b(handler.obtainMessage(i, i2, i3), this);
        return c;
    }

    @Override // com.google.android.gms.internal.ads.zzdq
    public final boolean j0(int i) {
        return this.a.sendEmptyMessage(i);
    }

    @Override // com.google.android.gms.internal.ads.zzdq
    public final zzdp k(int i, int i2, int i3, @InterfaceC11300zs1 Object obj) {
        Handler handler = this.a;
        zzen c = c();
        c.b(handler.obtainMessage(31, 0, 0, obj), this);
        return c;
    }

    @Override // com.google.android.gms.internal.ads.zzdq
    public final zzdp z(int i) {
        Handler handler = this.a;
        zzen c = c();
        c.b(handler.obtainMessage(i), this);
        return c;
    }
}
