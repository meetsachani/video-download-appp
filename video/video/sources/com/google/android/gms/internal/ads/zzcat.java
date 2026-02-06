package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
final class zzcat implements Runnable {
    public final /* synthetic */ zzcba X;

    public zzcat(zzcba zzcbaVar) {
        this.X = zzcbaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzcbb zzcbbVar;
        zzcbb zzcbbVar2;
        zzcba zzcbaVar = this.X;
        zzcbbVar = zzcbaVar.o1;
        if (zzcbbVar != null) {
            zzcbbVar2 = zzcbaVar.o1;
            zzcbbVar2.a();
        }
    }
}
