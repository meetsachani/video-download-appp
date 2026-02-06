package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Objects;
import o.C10323vs;
import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
public final class zzbk {

    /* renamed from: o  reason: collision with root package name */
    public static final Object f227o = new Object();
    public static final zzap p;
    @InterfaceC11300zs1
    @Deprecated
    public Object b;
    public long d;
    public long e;
    public long f;
    public boolean g;
    public boolean h;
    @InterfaceC11300zs1
    public zzaj i;
    public boolean j;
    public long k;
    public long l;
    public int m;
    public int n;
    public Object a = f227o;
    public zzap c = p;

    static {
        zzad zzadVar = new zzad();
        zzadVar.a("androidx.media3.common.Timeline");
        zzadVar.b(Uri.EMPTY);
        p = zzadVar.c();
        String str = zzeu.a;
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
        Integer.toString(5, 36);
        Integer.toString(6, 36);
        Integer.toString(7, 36);
        Integer.toString(8, 36);
        Integer.toString(9, 36);
        Integer.toString(10, 36);
        Integer.toString(11, 36);
        Integer.toString(12, 36);
        Integer.toString(13, 36);
    }

    public final zzbk a(Object obj, @InterfaceC11300zs1 zzap zzapVar, @InterfaceC11300zs1 Object obj2, long j, long j2, long j3, boolean z, boolean z2, @InterfaceC11300zs1 zzaj zzajVar, long j4, long j5, int i, int i2, long j6) {
        this.a = obj;
        if (zzapVar == null) {
            zzapVar = p;
        }
        this.c = zzapVar;
        this.b = null;
        this.d = C10323vs.b;
        this.e = C10323vs.b;
        this.f = C10323vs.b;
        this.g = z;
        this.h = z2;
        this.i = zzajVar;
        this.k = 0L;
        this.l = j5;
        this.m = 0;
        this.n = 0;
        this.j = false;
        return this;
    }

    public final boolean b() {
        return this.i != null;
    }

    public final boolean equals(@InterfaceC11300zs1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzbk.class.equals(obj.getClass())) {
            zzbk zzbkVar = (zzbk) obj;
            if (Objects.equals(this.a, zzbkVar.a) && Objects.equals(this.c, zzbkVar.c) && Objects.equals(this.i, zzbkVar.i) && this.d == zzbkVar.d && this.e == zzbkVar.e && this.f == zzbkVar.f && this.g == zzbkVar.g && this.h == zzbkVar.h && this.j == zzbkVar.j && this.l == zzbkVar.l && this.m == zzbkVar.m && this.n == zzbkVar.n) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = ((this.a.hashCode() + 217) * 31) + this.c.hashCode();
        zzaj zzajVar = this.i;
        if (zzajVar == null) {
            hashCode = 0;
        } else {
            hashCode = zzajVar.hashCode();
        }
        long j = this.d;
        long j2 = this.e;
        long j3 = this.f;
        int i = (((((((((((((hashCode2 * 961) + hashCode) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31) + (this.g ? 1 : 0)) * 31) + (this.h ? 1 : 0)) * 31) + (this.j ? 1 : 0);
        long j4 = this.l;
        return ((((((i * 961) + ((int) (j4 ^ (j4 >>> 32)))) * 31) + this.m) * 31) + this.n) * 31;
    }
}
