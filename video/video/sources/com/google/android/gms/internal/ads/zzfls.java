package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzfls implements Runnable {
    public final /* synthetic */ zzflt X;

    public zzfls(zzflt zzfltVar) {
        this.X = zzfltVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference;
        zzfmf zzfmfVar;
        zzflt zzfltVar = this.X;
        float a = zzflt.a(zzfltVar);
        atomicReference = zzfltVar.c;
        if (((Float) atomicReference.getAndSet(Float.valueOf(a))).floatValue() != a) {
            zzfmfVar = zzfltVar.d;
            zzfmfVar.e(a);
        }
    }
}
