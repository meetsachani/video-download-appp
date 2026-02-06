package com.google.android.gms.internal.measurement;

import java.io.IOException;

/* loaded from: classes3.dex */
public final class zzkb<K, V> {
    public static <K, V> int a(zzke<K, V> zzkeVar, K k, V v) {
        return zziq.c(zzkeVar.a, 1, k) + zziq.c(zzkeVar.c, 2, v);
    }

    public static <K, V> void b(zzig zzigVar, zzke<K, V> zzkeVar, K k, V v) throws IOException {
        zziq.h(zzigVar, zzkeVar.a, 1, k);
        zziq.h(zzigVar, zzkeVar.c, 2, v);
    }
}
