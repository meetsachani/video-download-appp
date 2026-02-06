package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;
import java.util.List;
import java.util.Map;
import o.InterfaceC10697xN2;

@InterfaceC10697xN2
/* loaded from: classes3.dex */
final class zzga implements Runnable {
    public final zzfx X;
    public final int Y;
    public final byte[] Y0;
    public final Throwable Z;
    public final String Z0;
    public final Map<String, List<String>> a1;

    @Override // java.lang.Runnable
    public final void run() {
        this.X.a(this.Z0, this.Y, this.Z, this.Y0, this.a1);
    }

    public zzga(String str, zzfx zzfxVar, int i, Throwable th, byte[] bArr, Map<String, List<String>> map) {
        Preconditions.r(zzfxVar);
        this.X = zzfxVar;
        this.Y = i;
        this.Z = th;
        this.Y0 = bArr;
        this.Z0 = str;
        this.a1 = map;
    }
}
