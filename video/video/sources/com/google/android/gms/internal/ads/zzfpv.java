package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.util.Log;

/* loaded from: classes2.dex */
public final class zzfpv {
    public final byte[] a;
    public int b;
    public int c;
    public final /* synthetic */ zzfpx d;

    public /* synthetic */ zzfpv(zzfpx zzfpxVar, byte[] bArr, zzfpw zzfpwVar) {
        this.d = zzfpxVar;
        this.a = bArr;
    }

    public final zzfpv a(int i) {
        this.c = i;
        return this;
    }

    public final zzfpv b(int i) {
        this.b = i;
        return this;
    }

    public final synchronized void c() {
        try {
            zzfpx zzfpxVar = this.d;
            if (zzfpxVar.b) {
                zzfqa zzfqaVar = zzfpxVar.a;
                zzfqaVar.X0(this.a);
                zzfqaVar.N(this.b);
                zzfqaVar.A(this.c);
                zzfqaVar.J0(null);
                zzfqaVar.e();
            }
        } catch (RemoteException e) {
            Log.d("GASS", "Clearcut log failed", e);
        }
    }
}
