package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* loaded from: classes2.dex */
public final class zzaxd extends zzayb {
    public zzaxd(zzawo zzawoVar, String str, String str2, zzask zzaskVar, int i, int i2) {
        super(zzawoVar, "ptULCqFpkxWHwh0HVZoMpk0Xr91rKWbEROvrSrbrHF8bfcD+J1G9qxssmqT2HcO0", "gABvx04l+Prrr7UIzRlxJTdbXEyGkYLmeTdDcw+INuA=", zzaskVar, i, 5);
    }

    @Override // com.google.android.gms.internal.ads.zzayb
    public final void a() throws IllegalAccessException, InvocationTargetException {
        zzask zzaskVar = this.d;
        zzaskVar.Q2(-1L);
        zzaskVar.P2(-1L);
        int[] iArr = (int[]) this.e.invoke(null, this.a.b());
        synchronized (zzaskVar) {
            try {
                zzaskVar.Q2(iArr[0]);
                zzaskVar.P2(iArr[1]);
                int i = iArr[2];
                if (i != Integer.MIN_VALUE) {
                    zzaskVar.O2(i);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
