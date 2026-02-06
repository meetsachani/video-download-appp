package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Locale;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzgxt extends zzgxx {
    public final byte[] e;
    public final int f;
    public int g;

    public zzgxt(byte[] bArr, int i, int i2) {
        super(null);
        int length = bArr.length;
        if (((length - i2) | i2) >= 0) {
            this.e = bArr;
            this.g = 0;
            this.f = i2;
            return;
        }
        throw new IllegalArgumentException(String.format(Locale.US, "Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(length), 0, Integer.valueOf(i2)));
    }

    @Override // com.google.android.gms.internal.ads.zzgxx
    public final void A(int i) throws IOException {
        int i2;
        IndexOutOfBoundsException indexOutOfBoundsException;
        int i3 = this.g;
        while ((i & (-128)) != 0) {
            try {
                i2 = i3 + 1;
            } catch (IndexOutOfBoundsException e) {
                indexOutOfBoundsException = e;
                throw new zzgxu(i3, this.f, 1, indexOutOfBoundsException);
            }
            try {
                this.e[i3] = (byte) (i | 128);
                i >>>= 7;
                i3 = i2;
            } catch (IndexOutOfBoundsException e2) {
                indexOutOfBoundsException = e2;
                i3 = i2;
                throw new zzgxu(i3, this.f, 1, indexOutOfBoundsException);
            }
        }
        i2 = i3 + 1;
        this.e[i3] = (byte) i;
        this.g = i2;
    }

    @Override // com.google.android.gms.internal.ads.zzgxx
    public final void B(int i, long j) throws IOException {
        A(i << 3);
        C(j);
    }

    @Override // com.google.android.gms.internal.ads.zzgxx
    public final void C(long j) throws IOException {
        boolean z;
        int i;
        IndexOutOfBoundsException indexOutOfBoundsException;
        int i2;
        int i3 = this.g;
        z = zzgxx.c;
        if (z && this.f - i3 >= 10) {
            while ((j & (-128)) != 0) {
                zzhbp.y(this.e, i3, (byte) (((int) j) | 128));
                j >>>= 7;
                i3++;
            }
            i = i3 + 1;
            zzhbp.y(this.e, i3, (byte) j);
        } else {
            int i4 = i3;
            while ((j & (-128)) != 0) {
                try {
                    i2 = i4 + 1;
                } catch (IndexOutOfBoundsException e) {
                    indexOutOfBoundsException = e;
                }
                try {
                    this.e[i4] = (byte) (((int) j) | 128);
                    j >>>= 7;
                    i4 = i2;
                } catch (IndexOutOfBoundsException e2) {
                    indexOutOfBoundsException = e2;
                    i4 = i2;
                    throw new zzgxu(i4, this.f, 1, indexOutOfBoundsException);
                }
            }
            i = i4 + 1;
            try {
                this.e[i4] = (byte) j;
            } catch (IndexOutOfBoundsException e3) {
                indexOutOfBoundsException = e3;
                i4 = i;
                throw new zzgxu(i4, this.f, 1, indexOutOfBoundsException);
            }
        }
        this.g = i;
    }

    public final void F(byte[] bArr, int i, int i2) throws IOException {
        try {
            System.arraycopy(bArr, i, this.e, this.g, i2);
            this.g += i2;
        } catch (IndexOutOfBoundsException e) {
            throw new zzgxu(this.g, this.f, i2, e);
        }
    }

    public final void G(String str) throws IOException {
        int i = this.g;
        try {
            int e = zzgxx.e(str.length() * 3);
            int e2 = zzgxx.e(str.length());
            if (e2 == e) {
                int i2 = i + e2;
                this.g = i2;
                int d = zzhbu.d(str, this.e, i2, this.f - i2);
                this.g = i;
                A((d - i) - e2);
                this.g = d;
                return;
            }
            A(zzhbu.e(str));
            byte[] bArr = this.e;
            int i3 = this.g;
            this.g = zzhbu.d(str, bArr, i3, this.f - i3);
        } catch (zzhbt e3) {
            this.g = i;
            h(str, e3);
        } catch (IndexOutOfBoundsException e4) {
            throw new zzgxu(e4);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgxx, com.google.android.gms.internal.ads.zzgxb
    public final void a(byte[] bArr, int i, int i2) throws IOException {
        F(bArr, i, i2);
    }

    @Override // com.google.android.gms.internal.ads.zzgxx
    public final void j() {
    }

    @Override // com.google.android.gms.internal.ads.zzgxx
    public final void k(byte b) throws IOException {
        int i;
        int i2 = this.g;
        try {
            i = i2 + 1;
        } catch (IndexOutOfBoundsException e) {
            e = e;
        }
        try {
            this.e[i2] = b;
            this.g = i;
        } catch (IndexOutOfBoundsException e2) {
            e = e2;
            i2 = i;
            throw new zzgxu(i2, this.f, 1, e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgxx
    public final void l(int i, boolean z) throws IOException {
        A(i << 3);
        k(z ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.android.gms.internal.ads.zzgxx
    public final void m(int i, zzgxk zzgxkVar) throws IOException {
        A((i << 3) | 2);
        A(zzgxkVar.i());
        zzgxkVar.G(this);
    }

    @Override // com.google.android.gms.internal.ads.zzgxx
    public final int n() {
        return this.f - this.g;
    }

    @Override // com.google.android.gms.internal.ads.zzgxx
    public final void o(int i, int i2) throws IOException {
        A((i << 3) | 5);
        p(i2);
    }

    @Override // com.google.android.gms.internal.ads.zzgxx
    public final void p(int i) throws IOException {
        int i2 = this.g;
        try {
            byte[] bArr = this.e;
            bArr[i2] = (byte) i;
            bArr[i2 + 1] = (byte) (i >> 8);
            bArr[i2 + 2] = (byte) (i >> 16);
            bArr[i2 + 3] = (byte) (i >> 24);
            this.g = i2 + 4;
        } catch (IndexOutOfBoundsException e) {
            throw new zzgxu(i2, this.f, 4, e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgxx
    public final void q(int i, long j) throws IOException {
        A((i << 3) | 1);
        r(j);
    }

    @Override // com.google.android.gms.internal.ads.zzgxx
    public final void r(long j) throws IOException {
        int i = this.g;
        try {
            byte[] bArr = this.e;
            bArr[i] = (byte) j;
            bArr[i + 1] = (byte) (j >> 8);
            bArr[i + 2] = (byte) (j >> 16);
            bArr[i + 3] = (byte) (j >> 24);
            bArr[i + 4] = (byte) (j >> 32);
            bArr[i + 5] = (byte) (j >> 40);
            bArr[i + 6] = (byte) (j >> 48);
            bArr[i + 7] = (byte) (j >> 56);
            this.g = i + 8;
        } catch (IndexOutOfBoundsException e) {
            throw new zzgxu(i, this.f, 8, e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgxx
    public final void s(int i, int i2) throws IOException {
        A(i << 3);
        t(i2);
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
        G(str);
    }

    @Override // com.google.android.gms.internal.ads.zzgxx
    public final void y(int i, int i2) throws IOException {
        A((i << 3) | i2);
    }

    @Override // com.google.android.gms.internal.ads.zzgxx
    public final void z(int i, int i2) throws IOException {
        A(i << 3);
        A(i2);
    }
}
