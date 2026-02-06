package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.List;
import o.C4128Rj1;
import o.InterfaceC8800pd0;

/* loaded from: classes2.dex */
final class zzajv extends zzajz {

    /* renamed from: o  reason: collision with root package name */
    public static final byte[] f208o = {79, 112, 117, 115, 72, 101, 97, 100};
    public static final byte[] p = {79, 112, 117, 115, 84, 97, 103, 115};
    public boolean n;

    public static boolean j(zzek zzekVar) {
        return k(zzekVar, f208o);
    }

    public static boolean k(zzek zzekVar, byte[] bArr) {
        if (zzekVar.u() < 8) {
            return false;
        }
        int w = zzekVar.w();
        byte[] bArr2 = new byte[8];
        zzekVar.h(bArr2, 0, 8);
        zzekVar.l(w);
        return Arrays.equals(bArr2, bArr);
    }

    @Override // com.google.android.gms.internal.ads.zzajz
    public final long a(zzek zzekVar) {
        return f(zzaei.d(zzekVar.n()));
    }

    @Override // com.google.android.gms.internal.ads.zzajz
    public final void b(boolean z) {
        super.b(z);
        if (z) {
            this.n = false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzajz
    @InterfaceC8800pd0(expression = {"#3.format"}, result = false)
    public final boolean c(zzek zzekVar, long j, zzajw zzajwVar) throws zzaz {
        if (k(zzekVar, f208o)) {
            byte[] copyOf = Arrays.copyOf(zzekVar.n(), zzekVar.x());
            int i = copyOf[9] & 255;
            List e = zzaei.e(copyOf);
            if (zzajwVar.a == null) {
                zzx zzxVar = new zzx();
                zzxVar.e(C4128Rj1.h0);
                zzxVar.E(C4128Rj1.a0);
                zzxVar.b(i);
                zzxVar.F(48000);
                zzxVar.p(e);
                zzajwVar.a = zzxVar.K();
                return true;
            }
        } else if (k(zzekVar, p)) {
            zzdc.b(zzajwVar.a);
            if (!this.n) {
                this.n = true;
                zzekVar.m(8);
                zzav b = zzaez.b(zzfyc.D(zzaez.c(zzekVar, false, false).a));
                if (b != null) {
                    zzx b2 = zzajwVar.a.b();
                    b2.w(b.d(zzajwVar.a.l));
                    zzajwVar.a = b2.K();
                }
            }
        } else {
            zzdc.b(zzajwVar.a);
            return false;
        }
        return true;
    }
}
