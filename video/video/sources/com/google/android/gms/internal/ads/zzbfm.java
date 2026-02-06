package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class zzbfm {
    public static final AtomicReference a = new AtomicReference();
    public static final AtomicReference b = new AtomicReference();

    static {
        new AtomicBoolean();
    }

    public static zzbfk a() {
        return (zzbfk) a.get();
    }

    public static zzbfl b() {
        return (zzbfl) b.get();
    }

    public static void c(zzbfk zzbfkVar) {
        a.set(zzbfkVar);
    }
}
