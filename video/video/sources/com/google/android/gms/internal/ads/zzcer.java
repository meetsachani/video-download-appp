package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
public final class zzcer {
    public final AtomicBoolean a = new AtomicBoolean(false);

    public zzcer(String str) {
    }

    public final void a() {
        this.a.set(false);
    }

    public final void b() {
        this.a.set(true);
    }

    public final void c() {
        this.a.set(false);
    }

    public final boolean d() {
        return this.a.get();
    }
}
