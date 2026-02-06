package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* loaded from: classes2.dex */
public final class zzfbt {
    public final Clock a;
    public final zzdsd b;
    public final Object c = new Object();
    public volatile int e = 1;
    public volatile long d = 0;

    public zzfbt(Clock clock, zzdsd zzdsdVar) {
        this.a = clock;
        this.b = zzdsdVar;
    }

    public final void a() {
        f(2, 3);
    }

    public final void b(boolean z) {
        String str;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.nd)).booleanValue()) {
            zzdsc a = this.b.a();
            a.b("action", "mbs_state");
            if (true != z) {
                str = "0";
            } else {
                str = "1";
            }
            a.b("mbs_state", str);
            a.j();
        }
        if (z) {
            f(1, 2);
        } else {
            f(2, 1);
        }
    }

    public final boolean c() {
        boolean z;
        synchronized (this.c) {
            e();
            if (this.e == 3) {
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    public final boolean d() {
        boolean z;
        synchronized (this.c) {
            e();
            if (this.e == 2) {
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    public final void e() {
        long a = this.a.a();
        synchronized (this.c) {
            try {
                if (this.e == 3) {
                    if (this.d + ((Long) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.g6)).longValue() <= a) {
                        this.e = 1;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void f(int i, int i2) {
        e();
        Object obj = this.c;
        long a = this.a.a();
        synchronized (obj) {
            try {
                if (this.e != i) {
                    return;
                }
                this.e = i2;
                if (this.e == 3) {
                    this.d = a;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
