package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzawm implements Runnable {
    public final /* synthetic */ int X;
    public final /* synthetic */ zzawo Y;

    public zzawm(zzawo zzawoVar, int i, boolean z) {
        this.X = i;
        this.Y = zzawoVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzath zzathVar;
        int i = this.X;
        zzawo zzawoVar = this.Y;
        if (i > 0) {
            try {
                Thread.sleep(i * 1000);
            } catch (InterruptedException unused) {
            }
        }
        try {
            Context context = zzawoVar.a;
            zzathVar = zzfof.a(context, context.getPackageName(), Integer.toString(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode));
        } catch (Throwable unused2) {
            zzathVar = null;
        }
        zzawo zzawoVar2 = this.Y;
        zzawoVar2.i = zzathVar;
        int i2 = this.X;
        if (i2 < 4) {
            if (zzathVar == null || !zzathVar.Y2() || zzathVar.k3().equals("0000000000000000000000000000000000000000000000000000000000000000") || !zzathVar.Z2() || !zzathVar.j3().g() || zzathVar.j3().s2() == -2) {
                zzawoVar2.n(i2 + 1, true);
            }
        }
    }
}
