package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
abstract class zzafx {
    public final zzaet a;

    public zzafx(zzaet zzaetVar) {
        this.a = zzaetVar;
    }

    public abstract boolean a(zzek zzekVar) throws zzaz;

    public abstract boolean b(zzek zzekVar, long j) throws zzaz;

    public final boolean c(zzek zzekVar, long j) throws zzaz {
        if (a(zzekVar) && b(zzekVar, j)) {
            return true;
        }
        return false;
    }
}
