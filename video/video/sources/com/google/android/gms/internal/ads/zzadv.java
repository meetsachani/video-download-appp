package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Arrays;
import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
public final class zzadv {
    @InterfaceC11300zs1
    public static zzav a(zzado zzadoVar, boolean z) throws IOException {
        zzagu zzaguVar;
        if (z) {
            zzaguVar = null;
        } else {
            zzaguVar = zzagw.a;
        }
        zzav a = new zzaed().a(zzadoVar, zzaguVar);
        if (a == null || a.a() == 0) {
            return null;
        }
        return a;
    }

    public static zzadx b(zzek zzekVar) {
        zzekVar.m(1);
        int I = zzekVar.I();
        long w = zzekVar.w();
        long j = I;
        int i = I / 18;
        long[] jArr = new long[i];
        long[] jArr2 = new long[i];
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                break;
            }
            long N = zzekVar.N();
            if (N == -1) {
                jArr = Arrays.copyOf(jArr, i2);
                jArr2 = Arrays.copyOf(jArr2, i2);
                break;
            }
            jArr[i2] = N;
            jArr2[i2] = zzekVar.N();
            zzekVar.m(2);
            i2++;
        }
        zzekVar.m((int) ((w + j) - zzekVar.w()));
        return new zzadx(jArr, jArr2);
    }
}
