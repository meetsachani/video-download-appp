package com.google.android.gms.measurement.internal;

import java.util.concurrent.Callable;

/* loaded from: classes3.dex */
final class zzhz implements Callable<byte[]> {
    public final /* synthetic */ zzbg a;
    public final /* synthetic */ String b;
    public final /* synthetic */ zzhj c;

    public zzhz(zzhj zzhjVar, zzbg zzbgVar, String str) {
        this.c = zzhjVar;
        this.a = zzbgVar;
        this.b = str;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ byte[] call() throws Exception {
        zzmp zzmpVar;
        zzmp zzmpVar2;
        zzmpVar = this.c.Y;
        zzmpVar.o0();
        zzmpVar2 = this.c.Y;
        return zzmpVar2.j0().y(this.a, this.b);
    }
}
