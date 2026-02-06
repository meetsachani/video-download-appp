package com.google.android.gms.internal.ads;

import java.util.Objects;
import o.C10323vs;
import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
public final class zzbj {
    @InterfaceC11300zs1
    public Object a;
    @InterfaceC11300zs1
    public Object b;
    public int c;
    public long d;
    public long e;
    public boolean f;
    public zzb g = zzb.e;

    static {
        String str = zzeu.a;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
    }

    public final int a(int i) {
        return this.g.a(i).b;
    }

    public final int b() {
        int i = this.g.a;
        return 0;
    }

    public final int c(long j) {
        return -1;
    }

    public final int d(long j) {
        this.g.b(-1);
        return -1;
    }

    public final int e(int i) {
        return this.g.a(i).a(-1);
    }

    public final boolean equals(@InterfaceC11300zs1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzbj.class.equals(obj.getClass())) {
            zzbj zzbjVar = (zzbj) obj;
            if (Objects.equals(this.a, zzbjVar.a) && Objects.equals(this.b, zzbjVar.b) && this.c == zzbjVar.c && this.d == zzbjVar.d && this.f == zzbjVar.f && Objects.equals(this.g, zzbjVar.g)) {
                return true;
            }
        }
        return false;
    }

    public final long f(int i, int i2) {
        zza a = this.g.a(i);
        if (a.b != -1) {
            return a.f[i2];
        }
        return C10323vs.b;
    }

    public final long g(int i) {
        long j = this.g.a(i).a;
        return 0L;
    }

    public final long h() {
        long j = this.g.b;
        return 0L;
    }

    public final int hashCode() {
        int hashCode;
        Object obj = this.a;
        int i = 0;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        Object obj2 = this.b;
        if (obj2 != null) {
            i = obj2.hashCode();
        }
        int i2 = ((((hashCode + 217) * 31) + i) * 31) + this.c;
        long j = this.d;
        return (((((i2 * 31) + ((int) (j ^ (j >>> 32)))) * 961) + (this.f ? 1 : 0)) * 31) + this.g.hashCode();
    }

    public final zzbj i(@InterfaceC11300zs1 Object obj, @InterfaceC11300zs1 Object obj2, int i, long j, long j2, zzb zzbVar, boolean z) {
        this.a = obj;
        this.b = obj2;
        this.c = i;
        this.d = j;
        this.e = 0L;
        this.g = zzbVar;
        this.f = z;
        return this;
    }

    public final boolean j(int i) {
        b();
        if (i == -1) {
            this.g.b(-1);
            return false;
        }
        return false;
    }

    public final boolean k(int i) {
        boolean z = this.g.a(i).i;
        return false;
    }
}
