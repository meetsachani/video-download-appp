package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes2.dex */
public final class zzus {
    public static final AtomicLong a = new AtomicLong();

    public zzus(long j, zzgl zzglVar, Uri uri, Map map, long j2, long j3, long j4) {
    }

    public static long a() {
        return a.getAndIncrement();
    }

    public zzus(long j, zzgl zzglVar, long j2) {
        Uri uri = zzglVar.a;
    }
}
