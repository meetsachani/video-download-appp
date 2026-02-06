package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.Set;
import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
public class zzcow {
    public final zzcqv a;
    public final View b;
    public final zzfbv c;
    @InterfaceC11300zs1
    public final zzcfb d;

    public zzcow(View view, @InterfaceC11300zs1 zzcfb zzcfbVar, zzcqv zzcqvVar, zzfbv zzfbvVar) {
        this.b = view;
        this.d = zzcfbVar;
        this.a = zzcqvVar;
        this.c = zzfbvVar;
    }

    public final View a() {
        return this.b;
    }

    @InterfaceC11300zs1
    public final zzcfb b() {
        return this.d;
    }

    public final zzcqv c() {
        return this.a;
    }

    public zzcxf d(Set set) {
        return new zzcxf(set);
    }

    public final zzfbv e() {
        return this.c;
    }
}
