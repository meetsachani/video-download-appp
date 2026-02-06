package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.IOException;
import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
public final class zzaed {
    public final zzek a = new zzek(10);

    @InterfaceC11300zs1
    public final zzav a(zzado zzadoVar, @InterfaceC11300zs1 zzagu zzaguVar) throws IOException {
        zzav zzavVar = null;
        int i = 0;
        while (true) {
            try {
                zzek zzekVar = this.a;
                zzadoVar.J(zzekVar.n(), 0, 10);
                zzekVar.l(0);
                if (zzekVar.I() != 4801587) {
                    break;
                }
                zzekVar.m(3);
                int F = zzekVar.F();
                int i2 = F + 10;
                if (zzavVar == null) {
                    byte[] bArr = new byte[i2];
                    System.arraycopy(zzekVar.n(), 0, bArr, 0, 10);
                    zzadoVar.J(bArr, 10, F);
                    zzavVar = zzagw.a(bArr, i2, zzaguVar, new zzagi());
                } else {
                    zzadoVar.A(F);
                }
                i += i2;
            } catch (EOFException unused) {
            }
        }
        zzadoVar.j();
        zzadoVar.A(i);
        return zzavVar;
    }
}
