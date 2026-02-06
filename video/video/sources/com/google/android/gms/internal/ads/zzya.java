package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
final class zzya implements Comparable {
    public final boolean X;
    public final boolean Y;

    public zzya(zzz zzzVar, int i) {
        this.X = 1 == (zzzVar.e & 1);
        this.Y = zzlw.a(i, false);
    }

    @Override // java.lang.Comparable
    /* renamed from: e */
    public final int compareTo(zzya zzyaVar) {
        return zzfxr.i().d(this.Y, zzyaVar.Y).d(this.X, zzyaVar.X).a();
    }
}
