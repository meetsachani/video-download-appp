package com.google.android.gms.ads.internal.util;

import android.graphics.Bitmap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes2.dex */
public final class zzbu {
    public final Map a = new ConcurrentHashMap();

    public zzbu() {
        new AtomicInteger(0);
    }

    public final Bitmap a(Integer num) {
        return (Bitmap) this.a.get(num);
    }
}
