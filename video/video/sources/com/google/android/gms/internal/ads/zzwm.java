package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* loaded from: classes2.dex */
final class zzwm {
    public final zzek a = new zzek(32);
    public zzwl b;
    public zzwl c;
    public zzwl d;
    public long e;
    public final zzzg f;

    public zzwm(zzzg zzzgVar) {
        this.f = zzzgVar;
        zzwl zzwlVar = new zzwl(0L, 65536);
        this.b = zzwlVar;
        this.c = zzwlVar;
        this.d = zzwlVar;
    }

    public static zzwl j(zzwl zzwlVar, long j) {
        while (j >= zzwlVar.b) {
            zzwlVar = zzwlVar.d;
        }
        return zzwlVar;
    }

    public static zzwl k(zzwl zzwlVar, long j, ByteBuffer byteBuffer, int i) {
        zzwl j2 = j(zzwlVar, j);
        while (i > 0) {
            int min = Math.min(i, (int) (j2.b - j));
            byteBuffer.put(j2.c.a, j2.a(j), min);
            i -= min;
            j += min;
            if (j == j2.b) {
                j2 = j2.d;
            }
        }
        return j2;
    }

    public static zzwl l(zzwl zzwlVar, long j, byte[] bArr, int i) {
        zzwl j2 = j(zzwlVar, j);
        int i2 = i;
        while (i2 > 0) {
            int min = Math.min(i2, (int) (j2.b - j));
            System.arraycopy(j2.c.a, j2.a(j), bArr, i - i2, min);
            i2 -= min;
            j += min;
            if (j == j2.b) {
                j2 = j2.d;
            }
        }
        return j2;
    }

    public static zzwl m(zzwl zzwlVar, zzhp zzhpVar, zzwo zzwoVar, zzek zzekVar) {
        zzwl zzwlVar2;
        boolean z;
        if (zzhpVar.l()) {
            long j = zzwoVar.b;
            int i = 1;
            zzekVar.i(1);
            zzwl l = l(zzwlVar, j, zzekVar.n(), 1);
            long j2 = j + 1;
            byte b = zzekVar.n()[0];
            int i2 = b & 128;
            int i3 = b & Byte.MAX_VALUE;
            zzhm zzhmVar = zzhpVar.c;
            byte[] bArr = zzhmVar.a;
            if (bArr == null) {
                zzhmVar.a = new byte[16];
            } else {
                Arrays.fill(bArr, (byte) 0);
            }
            if (i2 != 0) {
                z = true;
            } else {
                z = false;
            }
            zzwlVar2 = l(l, j2, zzhmVar.a, i3);
            long j3 = j2 + i3;
            if (z) {
                zzekVar.i(2);
                zzwlVar2 = l(zzwlVar2, j3, zzekVar.n(), 2);
                j3 += 2;
                i = zzekVar.K();
            }
            int i4 = i;
            int[] iArr = zzhmVar.d;
            if (iArr == null || iArr.length < i4) {
                iArr = new int[i4];
            }
            int[] iArr2 = iArr;
            int[] iArr3 = zzhmVar.e;
            if (iArr3 == null || iArr3.length < i4) {
                iArr3 = new int[i4];
            }
            int[] iArr4 = iArr3;
            if (z) {
                int i5 = i4 * 6;
                zzekVar.i(i5);
                zzwlVar2 = l(zzwlVar2, j3, zzekVar.n(), i5);
                j3 += i5;
                zzekVar.l(0);
                for (int i6 = 0; i6 < i4; i6++) {
                    iArr2[i6] = zzekVar.K();
                    iArr4[i6] = zzekVar.J();
                }
            } else {
                iArr2[0] = 0;
                iArr4[0] = zzwoVar.a - ((int) (j3 - zzwoVar.b));
            }
            zzaes zzaesVar = zzwoVar.c;
            String str = zzeu.a;
            zzhmVar.c(i4, iArr2, iArr4, zzaesVar.b, zzhmVar.a, zzaesVar.a, zzaesVar.c, zzaesVar.d);
            long j4 = zzwoVar.b;
            int i7 = (int) (j3 - j4);
            zzwoVar.b = j4 + i7;
            zzwoVar.a -= i7;
        } else {
            zzwlVar2 = zzwlVar;
        }
        if (zzhpVar.e()) {
            zzekVar.i(4);
            zzwl l2 = l(zzwlVar2, zzwoVar.b, zzekVar.n(), 4);
            int J = zzekVar.J();
            zzwoVar.b += 4;
            zzwoVar.a -= 4;
            zzhpVar.j(J);
            zzwl k = k(l2, zzwoVar.b, zzhpVar.d, J);
            zzwoVar.b += J;
            int i8 = zzwoVar.a - J;
            zzwoVar.a = i8;
            ByteBuffer byteBuffer = zzhpVar.g;
            if (byteBuffer != null && byteBuffer.capacity() >= i8) {
                zzhpVar.g.clear();
            } else {
                zzhpVar.g = ByteBuffer.allocate(i8);
            }
            return k(k, zzwoVar.b, zzhpVar.g, zzwoVar.a);
        }
        zzhpVar.j(zzwoVar.a);
        return k(zzwlVar2, zzwoVar.b, zzhpVar.d, zzwoVar.a);
    }

    public final int a(zzl zzlVar, int i, boolean z) throws IOException {
        int i2 = i(i);
        zzwl zzwlVar = this.d;
        int D = zzlVar.D(zzwlVar.c.a, zzwlVar.a(this.e), i2);
        if (D == -1) {
            if (z) {
                return -1;
            }
            throw new EOFException();
        }
        n(D);
        return D;
    }

    public final long b() {
        return this.e;
    }

    public final void c(long j) {
        zzwl zzwlVar;
        if (j != -1) {
            while (true) {
                zzwlVar = this.b;
                if (j < zzwlVar.b) {
                    break;
                }
                this.f.c(zzwlVar.c);
                this.b = this.b.b();
            }
            if (this.c.a < zzwlVar.a) {
                this.c = zzwlVar;
            }
        }
    }

    public final void d(zzhp zzhpVar, zzwo zzwoVar) {
        m(this.c, zzhpVar, zzwoVar, this.a);
    }

    public final void e(zzhp zzhpVar, zzwo zzwoVar) {
        this.c = m(this.c, zzhpVar, zzwoVar, this.a);
    }

    public final void f() {
        zzwl zzwlVar = this.b;
        if (zzwlVar.c != null) {
            this.f.d(zzwlVar);
            zzwlVar.b();
        }
        this.b.d(0L, 65536);
        zzwl zzwlVar2 = this.b;
        this.c = zzwlVar2;
        this.d = zzwlVar2;
        this.e = 0L;
        this.f.g();
    }

    public final void g() {
        this.c = this.b;
    }

    public final void h(zzek zzekVar, int i) {
        while (i > 0) {
            int i2 = i(i);
            zzwl zzwlVar = this.d;
            zzekVar.h(zzwlVar.c.a, zzwlVar.a(this.e), i2);
            i -= i2;
            n(i2);
        }
    }

    public final int i(int i) {
        zzwl zzwlVar = this.d;
        if (zzwlVar.c == null) {
            zzyz b = this.f.b();
            zzwl zzwlVar2 = new zzwl(this.d.b, 65536);
            zzwlVar.c = b;
            zzwlVar.d = zzwlVar2;
        }
        return Math.min(i, (int) (this.d.b - this.e));
    }

    public final void n(int i) {
        long j = this.e + i;
        this.e = j;
        zzwl zzwlVar = this.d;
        if (j == zzwlVar.b) {
            this.d = zzwlVar.d;
        }
    }
}
