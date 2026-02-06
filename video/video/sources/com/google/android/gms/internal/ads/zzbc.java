package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzbc {
    public final zzt a = new zzt();

    public final zzbc a(int i) {
        this.a.a(i);
        return this;
    }

    public final zzbc b(zzbd zzbdVar) {
        zzv zzvVar;
        zzvVar = zzbdVar.a;
        for (int i = 0; i < zzvVar.b(); i++) {
            this.a.a(zzvVar.a(i));
        }
        return this;
    }

    public final zzbc c(int... iArr) {
        for (int i = 0; i < 20; i++) {
            this.a.a(iArr[i]);
        }
        return this;
    }

    public final zzbc d(int i, boolean z) {
        if (z) {
            this.a.a(i);
        }
        return this;
    }

    public final zzbd e() {
        return new zzbd(this.a.b(), null);
    }
}
