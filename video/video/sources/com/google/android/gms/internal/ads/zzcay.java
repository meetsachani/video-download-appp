package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzcay implements Runnable {
    public final /* synthetic */ zzcba X;

    public zzcay(zzcba zzcbaVar) {
        this.X = zzcbaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzcbb zzcbbVar;
        boolean z;
        zzcbb zzcbbVar2;
        zzcbb zzcbbVar3;
        zzcba zzcbaVar = this.X;
        zzcbbVar = zzcbaVar.o1;
        if (zzcbbVar != null) {
            z = zzcbaVar.p1;
            if (!z) {
                zzcbbVar3 = zzcbaVar.o1;
                zzcbbVar3.g();
                zzcbaVar.p1 = true;
            }
            zzcbbVar2 = zzcbaVar.o1;
            zzcbbVar2.d();
        }
    }
}
