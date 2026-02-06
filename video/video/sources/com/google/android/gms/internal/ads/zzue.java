package com.google.android.gms.internal.ads;

import java.io.IOException;

/* loaded from: classes2.dex */
final class zzue implements zzwt {
    public final zzwt a;
    public boolean b;
    public final /* synthetic */ zzuf c;

    public zzue(zzuf zzufVar, zzwt zzwtVar) {
        this.c = zzufVar;
        this.a = zzwtVar;
    }

    @Override // com.google.android.gms.internal.ads.zzwt
    public final int a(long j) {
        if (this.c.l()) {
            return -3;
        }
        return this.a.a(j);
    }

    @Override // com.google.android.gms.internal.ads.zzwt
    public final int b(zzkq zzkqVar, zzhp zzhpVar, int i) {
        zzuf zzufVar = this.c;
        if (zzufVar.l()) {
            return -3;
        }
        if (this.b) {
            zzhpVar.c(4);
            return -4;
        }
        long b = zzufVar.b();
        int b2 = this.a.b(zzkqVar, zzhpVar, i);
        if (b2 == -5) {
            zzz zzzVar = zzkqVar.a;
            zzzVar.getClass();
            int i2 = zzzVar.H;
            int i3 = 0;
            if (i2 == 0) {
                if (zzzVar.I != 0) {
                    i2 = 0;
                }
                return -5;
            }
            if (zzufVar.Z0 == Long.MIN_VALUE) {
                i3 = zzzVar.I;
            }
            zzx b3 = zzzVar.b();
            b3.i(i2);
            b3.j(i3);
            zzkqVar.a = b3.K();
            return -5;
        }
        long j = zzufVar.Z0;
        if (j != Long.MIN_VALUE && ((b2 == -4 && zzhpVar.f >= j) || (b2 == -3 && b == Long.MIN_VALUE && !zzhpVar.e))) {
            zzhpVar.b();
            zzhpVar.c(4);
            this.b = true;
            return -4;
        }
        return b2;
    }

    public final void c() {
        this.b = false;
    }

    @Override // com.google.android.gms.internal.ads.zzwt
    public final boolean d() {
        if (!this.c.l() && this.a.d()) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzwt
    public final void f() throws IOException {
        this.a.f();
    }
}
