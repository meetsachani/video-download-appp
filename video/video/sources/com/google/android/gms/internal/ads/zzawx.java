package com.google.android.gms.internal.ads;

import android.app.AppOpsManager;
import android.content.Context;
import android.os.Build;
import java.util.concurrent.Executor;
import o.InterfaceC5670cr1;

/* loaded from: classes2.dex */
public final class zzawx {
    public static final String[] e = {"android:establish_vpn_service", "android:establish_vpn_manager"};
    public long a = 0;
    public long b = 0;
    public long c = -1;
    public boolean d = false;

    public zzawx(@InterfaceC5670cr1 Context context, @InterfaceC5670cr1 Executor executor, @InterfaceC5670cr1 String[] strArr) {
        if (Build.VERSION.SDK_INT >= 30) {
            try {
                ((AppOpsManager) context.getSystemService("appops")).startWatchingActive(strArr, executor, new zzaww(this));
            } catch (IllegalArgumentException | NoSuchMethodError unused) {
            }
        }
    }

    public static zzawx d(@InterfaceC5670cr1 Context context, @InterfaceC5670cr1 Executor executor) {
        return new zzawx(context, executor, e);
    }

    public final long b() {
        long j = this.c;
        this.c = -1L;
        return j;
    }

    public final long c() {
        if (this.d) {
            return this.b - this.a;
        }
        return -1L;
    }

    public final void h() {
        if (this.d) {
            this.b = System.currentTimeMillis();
        }
    }
}
