package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class zzadd implements zzado {
    public final zzl b;
    public final long c;
    public long d;
    public int f;
    public int g;
    public byte[] e = new byte[65536];
    public final byte[] a = new byte[4096];

    static {
        zzaq.b("media3.extractor");
    }

    public zzadd(zzl zzlVar, long j, long j2) {
        this.b = zzlVar;
        this.d = j;
        this.c = j2;
    }

    @Override // com.google.android.gms.internal.ads.zzado
    public final void A(int i) throws IOException {
        g(i, false);
    }

    @Override // com.google.android.gms.internal.ads.zzado
    public final int C(int i) throws IOException {
        int l = l(1);
        if (l == 0) {
            l = k(this.a, 0, Math.min(1, 4096), 0, true);
        }
        m(l);
        return l;
    }

    @Override // com.google.android.gms.internal.ads.zzado, com.google.android.gms.internal.ads.zzl
    public final int D(byte[] bArr, int i, int i2) throws IOException {
        int i3 = i(bArr, i, i2);
        if (i3 == 0) {
            i3 = k(bArr, i, i2, 0, true);
        }
        m(i3);
        return i3;
    }

    @Override // com.google.android.gms.internal.ads.zzado
    public final boolean E(byte[] bArr, int i, int i2, boolean z) throws IOException {
        int i3 = i(bArr, i, i2);
        while (i3 < i2 && i3 != -1) {
            i3 = k(bArr, i, i2, i3, z);
        }
        m(i3);
        if (i3 != -1) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzado
    public final boolean F(byte[] bArr, int i, int i2, boolean z) throws IOException {
        if (!g(i2, z)) {
            return false;
        }
        System.arraycopy(this.e, this.f - i2, bArr, i, i2);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzado
    public final void G(int i) throws IOException {
        h(i, false);
    }

    @Override // com.google.android.gms.internal.ads.zzado
    public final int H(byte[] bArr, int i, int i2) throws IOException {
        zzadd zzaddVar;
        int min;
        n(i2);
        int i3 = this.g;
        int i4 = this.f;
        int i5 = i3 - i4;
        if (i5 == 0) {
            zzaddVar = this;
            min = zzaddVar.k(this.e, i4, i2, 0, true);
            if (min == -1) {
                return -1;
            }
            zzaddVar.g += min;
        } else {
            zzaddVar = this;
            min = Math.min(i2, i5);
        }
        System.arraycopy(zzaddVar.e, zzaddVar.f, bArr, i, min);
        zzaddVar.f += min;
        return min;
    }

    @Override // com.google.android.gms.internal.ads.zzado
    public final void I(byte[] bArr, int i, int i2) throws IOException {
        E(bArr, i, i2, false);
    }

    @Override // com.google.android.gms.internal.ads.zzado
    public final void J(byte[] bArr, int i, int i2) throws IOException {
        F(bArr, i, i2, false);
    }

    @Override // com.google.android.gms.internal.ads.zzado
    public final long d() {
        return this.d + this.f;
    }

    @Override // com.google.android.gms.internal.ads.zzado
    public final long e() {
        return this.d;
    }

    @Override // com.google.android.gms.internal.ads.zzado
    public final long f() {
        return this.c;
    }

    public final boolean g(int i, boolean z) throws IOException {
        n(i);
        int i2 = this.g - this.f;
        while (i2 < i) {
            int i3 = i;
            boolean z2 = z;
            i2 = k(this.e, this.f, i3, i2, z2);
            if (i2 == -1) {
                return false;
            }
            this.g = this.f + i2;
            i = i3;
            z = z2;
        }
        this.f += i;
        return true;
    }

    public final boolean h(int i, boolean z) throws IOException {
        int l = l(i);
        while (l < i && l != -1) {
            l = k(this.a, -l, Math.min(i, l + 4096), l, false);
        }
        m(l);
        if (l != -1) {
            return true;
        }
        return false;
    }

    public final int i(byte[] bArr, int i, int i2) {
        int i3 = this.g;
        if (i3 == 0) {
            return 0;
        }
        int min = Math.min(i3, i2);
        System.arraycopy(this.e, 0, bArr, i, min);
        o(min);
        return min;
    }

    @Override // com.google.android.gms.internal.ads.zzado
    public final void j() {
        this.f = 0;
    }

    public final int k(byte[] bArr, int i, int i2, int i3, boolean z) throws IOException {
        if (!Thread.interrupted()) {
            int D = this.b.D(bArr, i + i3, i2 - i3);
            if (D == -1) {
                if (i3 == 0 && z) {
                    return -1;
                }
                throw new EOFException();
            }
            return i3 + D;
        }
        throw new InterruptedIOException();
    }

    public final int l(int i) {
        int min = Math.min(this.g, i);
        o(min);
        return min;
    }

    public final void m(int i) {
        if (i != -1) {
            this.d += i;
        }
    }

    public final void n(int i) {
        int i2 = this.f + i;
        int length = this.e.length;
        if (i2 > length) {
            String str = zzeu.a;
            this.e = Arrays.copyOf(this.e, Math.max(65536 + i2, Math.min(length + length, i2 + 524288)));
        }
    }

    public final void o(int i) {
        byte[] bArr;
        int i2 = this.g - i;
        this.g = i2;
        this.f = 0;
        byte[] bArr2 = this.e;
        if (i2 < bArr2.length - 524288) {
            bArr = new byte[65536 + i2];
        } else {
            bArr = bArr2;
        }
        System.arraycopy(bArr2, i, bArr, 0, i2);
        this.e = bArr;
    }
}
