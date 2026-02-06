package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzqy {
    public final zzcn[] a;
    public final zzrq b;
    public final zzcq c;

    public zzqy(zzcn... zzcnVarArr) {
        zzrq zzrqVar = new zzrq();
        zzcq zzcqVar = new zzcq();
        this.a = r2;
        System.arraycopy(zzcnVarArr, 0, r2, 0, 0);
        this.b = zzrqVar;
        this.c = zzcqVar;
        zzcn[] zzcnVarArr2 = {zzrqVar, zzcqVar};
    }

    public final long a(long j) {
        zzcq zzcqVar = this.c;
        if (zzcqVar.g()) {
            return zzcqVar.i(j);
        }
        return j;
    }

    public final long b() {
        return this.b.o();
    }

    public final zzbb c(zzbb zzbbVar) {
        zzcq zzcqVar = this.c;
        zzcqVar.k(zzbbVar.a);
        zzcqVar.j(zzbbVar.b);
        return zzbbVar;
    }

    public final boolean d(boolean z) {
        this.b.p(z);
        return z;
    }

    public final zzcn[] e() {
        return this.a;
    }
}
