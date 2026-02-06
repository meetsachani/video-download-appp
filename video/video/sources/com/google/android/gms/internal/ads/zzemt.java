package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;
import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
public final class zzemt {
    public final AtomicBoolean a = new AtomicBoolean(false);
    @InterfaceC11300zs1
    public zzems b;

    @InterfaceC11300zs1
    public final zzems a() {
        return this.b;
    }

    public final void b(zzems zzemsVar) {
        this.b = zzemsVar;
    }

    public final void c(boolean z) {
        this.a.set(true);
    }

    public final boolean d() {
        return this.a.get();
    }
}
