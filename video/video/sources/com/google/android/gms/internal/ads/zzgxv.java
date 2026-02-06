package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzgxv extends zzgxs {
    public final OutputStream i;

    public zzgxv(OutputStream outputStream, int i) {
        super(i);
        if (outputStream != null) {
            this.i = outputStream;
            return;
        }
        throw new NullPointerException("out");
    }

    @Override // com.google.android.gms.internal.ads.zzgxx
    public final void A(int i) throws IOException {
        L(5);
        I(i);
    }

    @Override // com.google.android.gms.internal.ads.zzgxx
    public final void B(int i, long j) throws IOException {
        L(20);
        I(i << 3);
        J(j);
    }

    @Override // com.google.android.gms.internal.ads.zzgxx
    public final void C(long j) throws IOException {
        L(10);
        J(j);
    }

    public final void K() throws IOException {
        this.i.write(this.e, 0, this.g);
        this.g = 0;
    }

    public final void L(int i) throws IOException {
        if (this.f - this.g < i) {
            K();
        }
    }

    public final void M(byte[] bArr, int i, int i2) throws IOException {
        int i3 = this.f;
        int i4 = this.g;
        int i5 = i3 - i4;
        if (i5 >= i2) {
            System.arraycopy(bArr, i, this.e, i4, i2);
            this.g += i2;
            this.h += i2;
            return;
        }
        byte[] bArr2 = this.e;
        System.arraycopy(bArr, i, bArr2, i4, i5);
        int i6 = i + i5;
        this.g = i3;
        this.h += i5;
        K();
        int i7 = i2 - i5;
        if (i7 <= i3) {
            System.arraycopy(bArr, i6, bArr2, 0, i7);
            this.g = i7;
        } else {
            this.i.write(bArr, i6, i7);
        }
        this.h += i7;
    }

    public final void N(String str) throws IOException {
        int e;
        try {
            int length = str.length() * 3;
            int e2 = zzgxx.e(length);
            int i = e2 + length;
            int i2 = this.f;
            if (i > i2) {
                byte[] bArr = new byte[length];
                int d = zzhbu.d(str, bArr, 0, length);
                A(d);
                M(bArr, 0, d);
                return;
            }
            if (i > i2 - this.g) {
                K();
            }
            int e3 = zzgxx.e(str.length());
            int i3 = this.g;
            try {
                try {
                    if (e3 == e2) {
                        int i4 = i3 + e3;
                        this.g = i4;
                        int d2 = zzhbu.d(str, this.e, i4, i2 - i4);
                        this.g = i3;
                        e = (d2 - i3) - e3;
                        I(e);
                        this.g = d2;
                    } else {
                        e = zzhbu.e(str);
                        I(e);
                        this.g = zzhbu.d(str, this.e, this.g, e);
                    }
                    this.h += e;
                } catch (ArrayIndexOutOfBoundsException e4) {
                    throw new zzgxu(e4);
                }
            } catch (zzhbt e5) {
                this.h -= this.g - i3;
                this.g = i3;
                throw e5;
            }
        } catch (zzhbt e6) {
            h(str, e6);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgxx, com.google.android.gms.internal.ads.zzgxb
    public final void a(byte[] bArr, int i, int i2) throws IOException {
        M(bArr, i, i2);
    }

    @Override // com.google.android.gms.internal.ads.zzgxx
    public final void j() throws IOException {
        if (this.g > 0) {
            K();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgxx
    public final void k(byte b) throws IOException {
        if (this.g == this.f) {
            K();
        }
        F(b);
    }

    @Override // com.google.android.gms.internal.ads.zzgxx
    public final void l(int i, boolean z) throws IOException {
        L(11);
        I(i << 3);
        F(z ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.android.gms.internal.ads.zzgxx
    public final void m(int i, zzgxk zzgxkVar) throws IOException {
        A((i << 3) | 2);
        A(zzgxkVar.i());
        zzgxkVar.G(this);
    }

    @Override // com.google.android.gms.internal.ads.zzgxx
    public final void o(int i, int i2) throws IOException {
        L(14);
        I((i << 3) | 5);
        G(i2);
    }

    @Override // com.google.android.gms.internal.ads.zzgxx
    public final void p(int i) throws IOException {
        L(4);
        G(i);
    }

    @Override // com.google.android.gms.internal.ads.zzgxx
    public final void q(int i, long j) throws IOException {
        L(18);
        I((i << 3) | 1);
        H(j);
    }

    @Override // com.google.android.gms.internal.ads.zzgxx
    public final void r(long j) throws IOException {
        L(8);
        H(j);
    }

    @Override // com.google.android.gms.internal.ads.zzgxx
    public final void s(int i, int i2) throws IOException {
        L(20);
        I(i << 3);
        if (i2 >= 0) {
            I(i2);
        } else {
            J(i2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgxx
    public final void t(int i) throws IOException {
        if (i >= 0) {
            A(i);
        } else {
            C(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgxx
    public final void u(int i, zzhad zzhadVar, zzhaw zzhawVar) throws IOException {
        A((i << 3) | 2);
        A(((zzgwt) zzhadVar).E0(zzhawVar));
        zzhawVar.g(zzhadVar, this.a);
    }

    @Override // com.google.android.gms.internal.ads.zzgxx
    public final void v(int i, zzhad zzhadVar) throws IOException {
        A(11);
        z(2, i);
        A(26);
        A(zzhadVar.O0());
        zzhadVar.W0(this);
        A(12);
    }

    @Override // com.google.android.gms.internal.ads.zzgxx
    public final void w(int i, zzgxk zzgxkVar) throws IOException {
        A(11);
        z(2, i);
        m(3, zzgxkVar);
        A(12);
    }

    @Override // com.google.android.gms.internal.ads.zzgxx
    public final void x(int i, String str) throws IOException {
        A((i << 3) | 2);
        N(str);
    }

    @Override // com.google.android.gms.internal.ads.zzgxx
    public final void y(int i, int i2) throws IOException {
        A((i << 3) | i2);
    }

    @Override // com.google.android.gms.internal.ads.zzgxx
    public final void z(int i, int i2) throws IOException {
        L(20);
        I(i << 3);
        I(i2);
    }
}
