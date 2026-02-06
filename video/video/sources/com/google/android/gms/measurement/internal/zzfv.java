package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import o.InterfaceC11300zs1;
import o.InterfaceC5670cr1;

/* loaded from: classes3.dex */
public final class zzfv {
    @InterfaceC5670cr1
    public String a;
    @InterfaceC5670cr1
    public String b;
    public long c;
    @InterfaceC5670cr1
    public Bundle d;

    public zzfv(@InterfaceC5670cr1 String str, @InterfaceC5670cr1 String str2, @InterfaceC11300zs1 Bundle bundle, long j) {
        this.a = str;
        this.b = str2;
        this.d = bundle == null ? new Bundle() : bundle;
        this.c = j;
    }

    public static zzfv b(zzbg zzbgVar) {
        return new zzfv(zzbgVar.X, zzbgVar.Z, zzbgVar.Y.G0(), zzbgVar.Y0);
    }

    public final zzbg a() {
        return new zzbg(this.a, new zzbb(new Bundle(this.d)), this.b, this.c);
    }

    public final String toString() {
        String str = this.b;
        String str2 = this.a;
        String valueOf = String.valueOf(this.d);
        return "origin=" + str + ",name=" + str2 + ",params=" + valueOf;
    }
}
