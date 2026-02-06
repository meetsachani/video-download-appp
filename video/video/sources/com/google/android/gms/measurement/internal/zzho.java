package com.google.android.gms.measurement.internal;

import java.util.List;
import java.util.concurrent.Callable;

/* loaded from: classes3.dex */
final class zzho implements Callable<List<zzne>> {
    public final /* synthetic */ String a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ zzhj d;

    public zzho(zzhj zzhjVar, String str, String str2, String str3) {
        this.d = zzhjVar;
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ List<zzne> call() throws Exception {
        zzmp zzmpVar;
        zzmp zzmpVar2;
        zzmpVar = this.d.Y;
        zzmpVar.o0();
        zzmpVar2 = this.d.Y;
        return zzmpVar2.e0().y0(this.a, this.b, this.c);
    }
}
