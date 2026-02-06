package com.google.android.gms.measurement.internal;

/* loaded from: classes3.dex */
public final class zzft {
    public final int a;
    public final boolean b;
    public final boolean c;
    public final /* synthetic */ zzfr d;

    public zzft(zzfr zzfrVar, int i, boolean z, boolean z2) {
        this.d = zzfrVar;
        this.a = i;
        this.b = z;
        this.c = z2;
    }

    public final void a(String str) {
        this.d.z(this.a, this.b, this.c, str, null, null, null);
    }

    public final void b(String str, Object obj) {
        this.d.z(this.a, this.b, this.c, str, obj, null, null);
    }

    public final void c(String str, Object obj, Object obj2) {
        this.d.z(this.a, this.b, this.c, str, obj, obj2, null);
    }

    public final void d(String str, Object obj, Object obj2, Object obj3) {
        this.d.z(this.a, this.b, this.c, str, obj, obj2, obj3);
    }
}
