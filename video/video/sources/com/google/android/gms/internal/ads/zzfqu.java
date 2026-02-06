package com.google.android.gms.internal.ads;

import java.io.Closeable;

/* loaded from: classes2.dex */
public abstract class zzfqu implements Closeable {
    public static zzfrg a() {
        return new zzfrg();
    }

    public static zzfrg d(final int i, zzfrf zzfrfVar) {
        return new zzfrg(new zzfvu() { // from class: com.google.android.gms.internal.ads.zzfqs
            @Override // com.google.android.gms.internal.ads.zzfvu
            public final Object a() {
                return zzfqu.h(i);
            }
        }, new zzfvu() { // from class: com.google.android.gms.internal.ads.zzfqt
            @Override // com.google.android.gms.internal.ads.zzfvu
            public final Object a() {
                return zzfqu.i();
            }
        }, zzfrfVar);
    }

    public static zzfrg f(zzfvu<Integer> zzfvuVar, zzfvu<Integer> zzfvuVar2, zzfrf zzfrfVar) {
        return new zzfrg(zzfvuVar, zzfvuVar2, zzfrfVar);
    }

    public static /* synthetic */ Integer h(int i) {
        return Integer.valueOf(i);
    }

    public static /* synthetic */ Integer i() {
        return -1;
    }
}
