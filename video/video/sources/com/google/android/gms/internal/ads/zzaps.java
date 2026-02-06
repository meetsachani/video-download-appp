package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzaps implements Runnable {
    public final /* synthetic */ String X;
    public final /* synthetic */ long Y;
    public final /* synthetic */ zzapu Z;

    public zzaps(zzapu zzapuVar, String str, long j) {
        this.X = str;
        this.Y = j;
        this.Z = zzapuVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzaqf zzaqfVar;
        zzaqf zzaqfVar2;
        zzapu zzapuVar = this.Z;
        zzaqfVar = zzapuVar.X;
        zzaqfVar.a(this.X, this.Y);
        zzaqfVar2 = zzapuVar.X;
        zzaqfVar2.b(zzapuVar.toString());
    }
}
