package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
final class zzcaw implements Runnable {
    public final /* synthetic */ int X;
    public final /* synthetic */ int Y;
    public final /* synthetic */ zzcba Z;

    public zzcaw(zzcba zzcbaVar, int i, int i2) {
        this.X = i;
        this.Y = i2;
        this.Z = zzcbaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzcbb zzcbbVar;
        zzcbb zzcbbVar2;
        zzcba zzcbaVar = this.Z;
        zzcbbVar = zzcbaVar.o1;
        if (zzcbbVar != null) {
            int i = this.X;
            int i2 = this.Y;
            zzcbbVar2 = zzcbaVar.o1;
            zzcbbVar2.b(i, i2);
        }
    }
}
