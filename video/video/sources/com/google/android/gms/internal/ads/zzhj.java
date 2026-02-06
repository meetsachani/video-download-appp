package com.google.android.gms.internal.ads;

import o.InterfaceC2591Bt;

/* loaded from: classes2.dex */
public class zzhj {
    public int a;

    public final void a(int i) {
        this.a |= 536870912;
    }

    @InterfaceC2591Bt
    public void b() {
        this.a = 0;
    }

    public final void c(int i) {
        this.a = i;
    }

    public final boolean d(int i) {
        return (this.a & i) == i;
    }

    public final boolean e() {
        return d(268435456);
    }

    public final boolean f() {
        return d(4);
    }

    public final boolean g() {
        return d(1);
    }

    public final boolean h() {
        return d(536870912);
    }

    public final boolean i() {
        return d(67108864);
    }
}
