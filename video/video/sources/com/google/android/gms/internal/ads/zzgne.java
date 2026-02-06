package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class zzgne {
    public static final zzgne b = new zzgne();
    public static final zzgnc c = new zzgnc(null);
    public final AtomicReference a = new AtomicReference();

    public static zzgne b() {
        return b;
    }

    public final zzgmu a() {
        zzgmu zzgmuVar = (zzgmu) this.a.get();
        if (zzgmuVar == null) {
            return c;
        }
        return zzgmuVar;
    }
}
