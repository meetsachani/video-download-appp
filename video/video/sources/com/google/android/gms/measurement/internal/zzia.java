package com.google.android.gms.measurement.internal;

import java.util.List;
import java.util.concurrent.Callable;

/* loaded from: classes3.dex */
final class zzia implements Callable<List<zzne>> {
    public final /* synthetic */ String a;
    public final /* synthetic */ zzhj b;

    public zzia(zzhj zzhjVar, String str) {
        this.b = zzhjVar;
        this.a = str;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ List<zzne> call() throws Exception {
        zzmp zzmpVar;
        zzmp zzmpVar2;
        zzmpVar = this.b.Y;
        zzmpVar.o0();
        zzmpVar2 = this.b.Y;
        return zzmpVar2.e0().M0(this.a);
    }
}
