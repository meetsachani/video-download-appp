package com.google.android.gms.internal.ads;

import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
public final class zzvb {
    public final Object a;
    public final int b;
    public final int c;
    public final long d;
    public final int e;

    public zzvb(Object obj, int i, int i2, long j, int i3) {
        this.a = obj;
        this.b = i;
        this.c = i2;
        this.d = j;
        this.e = i3;
    }

    public final zzvb a(Object obj) {
        if (this.a.equals(obj)) {
            return this;
        }
        return new zzvb(obj, this.b, this.c, this.d, this.e);
    }

    public final boolean b() {
        return this.b != -1;
    }

    public final boolean equals(@InterfaceC11300zs1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzvb)) {
            return false;
        }
        zzvb zzvbVar = (zzvb) obj;
        if (this.a.equals(zzvbVar.a) && this.b == zzvbVar.b && this.c == zzvbVar.c && this.d == zzvbVar.d && this.e == zzvbVar.e) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.a.hashCode() + 527) * 31) + this.b) * 31) + this.c) * 31) + ((int) this.d)) * 31) + this.e;
    }

    public zzvb(Object obj, int i, int i2, long j) {
        this(obj, i, i2, j, -1);
    }

    public zzvb(Object obj, long j) {
        this(obj, -1, -1, j, -1);
    }

    public zzvb(Object obj, long j, int i) {
        this(obj, -1, -1, j, i);
    }
}
