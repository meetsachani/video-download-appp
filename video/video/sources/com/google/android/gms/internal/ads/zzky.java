package com.google.android.gms.internal.ads;

import java.util.Objects;
import o.InterfaceC11300zs1;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzky {
    public final zzvb a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final boolean j;

    public zzky(zzvb zzvbVar, long j, long j2, long j3, long j4, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        boolean z6;
        boolean z7 = true;
        if (!z5 || z3) {
            z6 = true;
        } else {
            z6 = false;
        }
        zzdc.d(z6);
        if (z4 && !z3) {
            z7 = false;
        }
        zzdc.d(z7);
        this.a = zzvbVar;
        this.b = j;
        this.c = j2;
        this.d = j3;
        this.e = j4;
        this.f = false;
        this.g = false;
        this.h = z3;
        this.i = z4;
        this.j = z5;
    }

    public final zzky a(long j) {
        if (j == this.c) {
            return this;
        }
        return new zzky(this.a, this.b, j, this.d, this.e, false, false, this.h, this.i, this.j);
    }

    public final zzky b(long j) {
        if (j == this.b) {
            return this;
        }
        return new zzky(this.a, j, this.c, this.d, this.e, false, false, this.h, this.i, this.j);
    }

    public final boolean equals(@InterfaceC11300zs1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzky.class == obj.getClass()) {
            zzky zzkyVar = (zzky) obj;
            if (this.b == zzkyVar.b && this.c == zzkyVar.c && this.d == zzkyVar.d && this.e == zzkyVar.e && this.h == zzkyVar.h && this.i == zzkyVar.i && this.j == zzkyVar.j && Objects.equals(this.a, zzkyVar.a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.e;
        long j2 = this.d;
        return ((((((((((((((this.a.hashCode() + 527) * 31) + ((int) this.b)) * 31) + ((int) this.c)) * 31) + ((int) j2)) * 31) + ((int) j)) * 29791) + (this.h ? 1 : 0)) * 31) + (this.i ? 1 : 0)) * 31) + (this.j ? 1 : 0);
    }
}
