package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* loaded from: classes2.dex */
public final class zzeny implements zzetu {
    public final int a;
    public final boolean b;
    public final boolean c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final float i;
    public final boolean j;
    public final boolean k;

    public zzeny(int i, boolean z, boolean z2, int i2, int i3, int i4, int i5, int i6, float f, boolean z3, boolean z4) {
        this.a = i;
        this.b = z;
        this.c = z2;
        this.d = i2;
        this.e = i3;
        this.f = i4;
        this.g = i5;
        this.h = i6;
        this.i = f;
        this.j = z3;
        this.k = z4;
    }

    @Override // com.google.android.gms.internal.ads.zzetu
    public final /* synthetic */ void b(Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.zzetu
    public final /* bridge */ /* synthetic */ void c(Object obj) {
        Bundle bundle = ((zzcuv) obj).a;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.nb)).booleanValue()) {
            bundle.putInt("muv_min", this.e);
            bundle.putInt("muv_max", this.f);
        }
        bundle.putFloat("android_app_volume", this.i);
        bundle.putBoolean("android_app_muted", this.j);
        if (!this.k) {
            bundle.putInt("am", this.a);
            bundle.putBoolean("ma", this.b);
            bundle.putBoolean("sp", this.c);
            bundle.putInt("muv", this.d);
            bundle.putInt("rm", this.g);
            bundle.putInt("riv", this.h);
        }
    }
}
