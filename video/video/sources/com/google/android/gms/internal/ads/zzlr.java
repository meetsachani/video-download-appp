package com.google.android.gms.internal.ads;

import android.os.Looper;
import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
public final class zzlr {
    public final zzlq a;
    public final zzlp b;
    public final zzbl c;
    public int d;
    @InterfaceC11300zs1
    public Object e;
    public final Looper f;
    public final int g;
    public boolean h;
    public boolean i;

    public zzlr(zzlp zzlpVar, zzlq zzlqVar, zzbl zzblVar, int i, zzdg zzdgVar, Looper looper) {
        this.b = zzlpVar;
        this.a = zzlqVar;
        this.c = zzblVar;
        this.f = looper;
        this.g = i;
    }

    public final int a() {
        return this.d;
    }

    public final Looper b() {
        return this.f;
    }

    public final zzlq c() {
        return this.a;
    }

    public final zzlr d() {
        zzdc.f(!this.h);
        this.h = true;
        this.b.d(this);
        return this;
    }

    public final zzlr e(@InterfaceC11300zs1 Object obj) {
        zzdc.f(!this.h);
        this.e = obj;
        return this;
    }

    public final zzlr f(int i) {
        zzdc.f(!this.h);
        this.d = i;
        return this;
    }

    @InterfaceC11300zs1
    public final Object g() {
        return this.e;
    }

    public final synchronized void h(boolean z) {
        this.i = z | this.i;
        notifyAll();
    }

    public final synchronized boolean i() {
        return false;
    }
}
