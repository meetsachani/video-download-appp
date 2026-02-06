package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzcau implements Runnable {
    public final /* synthetic */ String X;
    public final /* synthetic */ String Y;
    public final /* synthetic */ zzcba Z;

    public zzcau(zzcba zzcbaVar, String str, String str2) {
        this.X = str;
        this.Y = str2;
        this.Z = zzcbaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzcbb zzcbbVar;
        zzcbb zzcbbVar2;
        zzcba zzcbaVar = this.Z;
        zzcbbVar = zzcbaVar.o1;
        if (zzcbbVar != null) {
            String str = this.X;
            String str2 = this.Y;
            zzcbbVar2 = zzcbaVar.o1;
            zzcbbVar2.u(str, str2);
        }
    }
}
