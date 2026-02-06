package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.concurrent.ExecutorService;

/* loaded from: classes2.dex */
public final class zzbbx {
    public final byte[] a;
    public int b;
    public final /* synthetic */ zzbbz c;

    public /* synthetic */ zzbbx(zzbbz zzbbzVar, byte[] bArr, zzbby zzbbyVar) {
        this.c = zzbbzVar;
        this.a = bArr;
    }

    public static /* synthetic */ void b(zzbbx zzbbxVar) {
        zzbbxVar.d();
    }

    public final zzbbx a(int i) {
        this.b = i;
        return this;
    }

    public final synchronized void c() {
        ExecutorService executorService;
        executorService = this.c.c;
        executorService.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbbw
            @Override // java.lang.Runnable
            public final void run() {
                zzbbx.b(zzbbx.this);
            }
        });
    }

    public final synchronized void d() {
        try {
            zzbbz zzbbzVar = this.c;
            if (zzbbzVar.b) {
                zzbbzVar.a.X0(this.a);
                zzbbzVar.a.N(0);
                zzbbzVar.a.A(this.b);
                zzbbzVar.a.J0(null);
                zzbbzVar.a.e();
            }
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.c("Clearcut log failed", e);
        }
    }
}
