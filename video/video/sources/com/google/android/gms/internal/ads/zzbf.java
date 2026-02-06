package com.google.android.gms.internal.ads;

import java.util.Objects;
import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
public final class zzbf {
    @InterfaceC11300zs1
    public final Object a;
    public final int b;
    @InterfaceC11300zs1
    public final zzap c;
    @InterfaceC11300zs1
    public final Object d;
    public final int e;
    public final long f;
    public final long g;
    public final int h;
    public final int i;

    static {
        String str = zzeu.a;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
        Integer.toString(5, 36);
        Integer.toString(6, 36);
    }

    public zzbf(@InterfaceC11300zs1 Object obj, int i, @InterfaceC11300zs1 zzap zzapVar, @InterfaceC11300zs1 Object obj2, int i2, long j, long j2, int i3, int i4) {
        this.a = obj;
        this.b = i;
        this.c = zzapVar;
        this.d = obj2;
        this.e = i2;
        this.f = j;
        this.g = j2;
        this.h = i3;
        this.i = i4;
    }

    public final boolean equals(@InterfaceC11300zs1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzbf.class == obj.getClass()) {
            zzbf zzbfVar = (zzbf) obj;
            if (this.b == zzbfVar.b && this.e == zzbfVar.e && this.f == zzbfVar.f && this.g == zzbfVar.g && this.h == zzbfVar.h && this.i == zzbfVar.i && Objects.equals(this.c, zzbfVar.c) && Objects.equals(this.a, zzbfVar.a) && Objects.equals(this.d, zzbfVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a, Integer.valueOf(this.b), this.c, this.d, Integer.valueOf(this.e), Long.valueOf(this.f), Long.valueOf(this.g), Integer.valueOf(this.h), Integer.valueOf(this.i));
    }
}
