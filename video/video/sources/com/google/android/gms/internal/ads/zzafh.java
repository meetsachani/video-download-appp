package com.google.android.gms.internal.ads;

import java.math.RoundingMode;
import o.C4126Rj;
import o.C4323Tj;

/* loaded from: classes2.dex */
final class zzafh implements zzafb {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;

    public zzafh(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        this.a = i;
        this.b = i3;
        this.c = i4;
        this.d = i5;
        this.e = i6;
        this.f = i7;
    }

    public static zzafh d(zzek zzekVar) {
        int C = zzekVar.C();
        zzekVar.m(12);
        int C2 = zzekVar.C();
        int C3 = zzekVar.C();
        int C4 = zzekVar.C();
        zzekVar.m(4);
        int C5 = zzekVar.C();
        int C6 = zzekVar.C();
        zzekVar.m(4);
        return new zzafh(C, C2, C3, C4, C5, C6, zzekVar.C());
    }

    @Override // com.google.android.gms.internal.ads.zzafb
    public final int a() {
        return C4126Rj.D;
    }

    public final int b() {
        int i = this.a;
        if (i != 1935960438) {
            if (i != 1935963489) {
                if (i != 1937012852) {
                    zzdx.f(C4323Tj.g, "Found unsupported streamType fourCC: ".concat(String.valueOf(Integer.toHexString(i))));
                    return -1;
                }
                return 3;
            }
            return 1;
        }
        return 2;
    }

    public final long c() {
        RoundingMode roundingMode = RoundingMode.DOWN;
        return zzeu.P(this.d, this.b * 1000000, this.c, roundingMode);
    }
}
