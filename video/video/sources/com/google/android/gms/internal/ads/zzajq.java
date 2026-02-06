package com.google.android.gms.internal.ads;

import java.util.Arrays;
import o.C4128Rj1;
import o.InterfaceC11300zs1;
import o.InterfaceC8800pd0;

/* loaded from: classes2.dex */
final class zzajq extends zzajz {
    @InterfaceC11300zs1
    public zzady n;
    @InterfaceC11300zs1

    /* renamed from: o  reason: collision with root package name */
    public zzajp f207o;

    public static boolean j(byte[] bArr) {
        if (bArr[0] != -1) {
            return false;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzajz
    public final long a(zzek zzekVar) {
        if (j(zzekVar.n())) {
            int i = (zzekVar.n()[2] & 255) >> 4;
            if (i != 6) {
                if (i == 7) {
                    i = 7;
                }
                int a = zzadu.a(zzekVar, i);
                zzekVar.l(0);
                return a;
            }
            zzekVar.m(4);
            zzekVar.R();
            int a2 = zzadu.a(zzekVar, i);
            zzekVar.l(0);
            return a2;
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzajz
    public final void b(boolean z) {
        super.b(z);
        if (z) {
            this.n = null;
            this.f207o = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzajz
    @InterfaceC8800pd0(expression = {"#3.format"}, result = false)
    public final boolean c(zzek zzekVar, long j, zzajw zzajwVar) {
        byte[] n = zzekVar.n();
        zzady zzadyVar = this.n;
        if (zzadyVar == null) {
            zzady zzadyVar2 = new zzady(n, 17);
            this.n = zzadyVar2;
            zzx b = zzadyVar2.c(Arrays.copyOfRange(n, 9, zzekVar.x()), null).b();
            b.e(C4128Rj1.h0);
            zzajwVar.a = b.K();
            return true;
        } else if ((n[0] & Byte.MAX_VALUE) == 3) {
            zzadx b2 = zzadv.b(zzekVar);
            zzady f = zzadyVar.f(b2);
            this.n = f;
            this.f207o = new zzajp(f, b2);
            return true;
        } else if (!j(n)) {
            return true;
        } else {
            zzajp zzajpVar = this.f207o;
            if (zzajpVar != null) {
                zzajpVar.b(j);
                zzajwVar.b = this.f207o;
            }
            zzajwVar.a.getClass();
            return false;
        }
    }
}
