package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.IOException;
import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
public final class zzadj implements zzaet {
    public final byte[] a = new byte[4096];

    @Override // com.google.android.gms.internal.ads.zzaet
    public final void a(zzek zzekVar, int i, int i2) {
        zzekVar.m(i);
    }

    @Override // com.google.android.gms.internal.ads.zzaet
    public final /* synthetic */ int b(zzl zzlVar, int i, boolean z) {
        return zzaer.a(this, zzlVar, i, z);
    }

    @Override // com.google.android.gms.internal.ads.zzaet
    public final void c(long j, int i, int i2, int i3, @InterfaceC11300zs1 zzaes zzaesVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzaet
    public final /* synthetic */ void d(zzek zzekVar, int i) {
        zzaer.b(this, zzekVar, i);
    }

    @Override // com.google.android.gms.internal.ads.zzaet
    public final void e(zzz zzzVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzaet
    public final /* synthetic */ void f(long j) {
    }

    @Override // com.google.android.gms.internal.ads.zzaet
    public final int g(zzl zzlVar, int i, boolean z, int i2) throws IOException {
        int D = zzlVar.D(this.a, 0, Math.min(4096, i));
        if (D == -1) {
            if (z) {
                return -1;
            }
            throw new EOFException();
        }
        return D;
    }
}
