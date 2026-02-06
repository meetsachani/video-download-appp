package com.google.android.gms.internal.ads;

import java.util.Objects;
import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
public final class zzmk {
    public final long a;
    public final zzbl b;
    public final int c;
    @InterfaceC11300zs1
    public final zzvb d;
    public final long e;
    public final zzbl f;
    public final int g;
    @InterfaceC11300zs1
    public final zzvb h;
    public final long i;
    public final long j;

    public zzmk(long j, zzbl zzblVar, int i, @InterfaceC11300zs1 zzvb zzvbVar, long j2, zzbl zzblVar2, int i2, @InterfaceC11300zs1 zzvb zzvbVar2, long j3, long j4) {
        this.a = j;
        this.b = zzblVar;
        this.c = i;
        this.d = zzvbVar;
        this.e = j2;
        this.f = zzblVar2;
        this.g = i2;
        this.h = zzvbVar2;
        this.i = j3;
        this.j = j4;
    }

    public final boolean equals(@InterfaceC11300zs1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzmk.class == obj.getClass()) {
            zzmk zzmkVar = (zzmk) obj;
            if (this.a == zzmkVar.a && this.c == zzmkVar.c && this.e == zzmkVar.e && this.g == zzmkVar.g && this.i == zzmkVar.i && this.j == zzmkVar.j && Objects.equals(this.b, zzmkVar.b) && Objects.equals(this.d, zzmkVar.d) && Objects.equals(this.f, zzmkVar.f) && Objects.equals(this.h, zzmkVar.h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.a), this.b, Integer.valueOf(this.c), this.d, Long.valueOf(this.e), this.f, Integer.valueOf(this.g), this.h, Long.valueOf(this.i), Long.valueOf(this.j));
    }
}
