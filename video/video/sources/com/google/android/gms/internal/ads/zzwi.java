package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzwi implements zzva {
    public final zzgf a;
    public int b;
    public final zzwh c;
    public final zzzk d;

    public zzwi(zzgf zzgfVar, zzwh zzwhVar) {
        zzzk zzzkVar = new zzzk(-1);
        this.a = zzgfVar;
        this.c = zzwhVar;
        this.d = zzzkVar;
        this.b = 1048576;
    }

    public final zzwi a(int i) {
        this.b = i;
        return this;
    }

    public final zzwk b(zzap zzapVar) {
        zzapVar.b.getClass();
        return new zzwk(zzapVar, this.a, this.c, zzsb.a, this.d, this.b, 0, null, null, null);
    }
}
