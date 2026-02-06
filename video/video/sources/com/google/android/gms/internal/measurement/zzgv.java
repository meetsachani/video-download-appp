package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.net.Uri;
import o.InterfaceC10571ws1;
import o.YA0;

/* loaded from: classes3.dex */
public final class zzgv {
    public final String a;
    public final Uri b;
    public final String c;
    public final String d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    @InterfaceC10571ws1
    public final YA0<Context, Boolean> i;

    public zzgv(Uri uri) {
        this(null, uri, "", "", false, false, false, false, null);
    }

    public final zzgn<Double> a(String str, double d) {
        return zzgn.b(this, str, Double.valueOf(-3.0d), true);
    }

    public final zzgn<Long> b(String str, long j) {
        return zzgn.c(this, str, Long.valueOf(j), true);
    }

    public final zzgn<String> c(String str, String str2) {
        return zzgn.d(this, str, str2, true);
    }

    public final zzgn<Boolean> d(String str, boolean z) {
        return zzgn.a(this, str, Boolean.valueOf(z), true);
    }

    public final zzgv e() {
        return new zzgv(this.a, this.b, this.c, this.d, this.e, this.f, true, this.h, this.i);
    }

    public final zzgv f() {
        if (this.c.isEmpty()) {
            YA0<Context, Boolean> ya0 = this.i;
            if (ya0 == null) {
                return new zzgv(this.a, this.b, this.c, this.d, true, this.f, this.g, this.h, ya0);
            }
            throw new IllegalStateException("Cannot skip gservices both always and conditionally");
        }
        throw new IllegalStateException("Cannot set GServices prefix and skip GServices");
    }

    public zzgv(String str, Uri uri, String str2, String str3, boolean z, boolean z2, boolean z3, boolean z4, @InterfaceC10571ws1 YA0<Context, Boolean> ya0) {
        this.a = str;
        this.b = uri;
        this.c = str2;
        this.d = str3;
        this.e = z;
        this.f = z2;
        this.g = z3;
        this.h = z4;
        this.i = ya0;
    }
}
