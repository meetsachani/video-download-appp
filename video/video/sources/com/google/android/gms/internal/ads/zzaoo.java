package com.google.android.gms.internal.ads;

import java.io.IOException;

/* loaded from: classes2.dex */
final class zzaoo {
    public final int a;
    public final long b;

    public zzaoo(int i, long j) {
        this.a = i;
        this.b = j;
    }

    public static zzaoo a(zzado zzadoVar, zzek zzekVar) throws IOException {
        zzadoVar.J(zzekVar.n(), 0, 8);
        zzekVar.l(0);
        return new zzaoo(zzekVar.A(), zzekVar.M());
    }
}
