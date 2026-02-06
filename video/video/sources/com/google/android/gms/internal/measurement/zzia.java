package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.util.Arrays;
import o.C8077mf;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzia extends zzib {
    public final byte[] g;
    public final boolean h;
    public int i;
    public int j;
    public int k;
    public int l;
    public int m;
    public int n;

    @Override // com.google.android.gms.internal.measurement.zzib
    public final boolean A() throws IOException {
        if (this.k == this.i) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.zzib
    public final boolean B() throws IOException {
        if (I() != 0) {
            return true;
        }
        return false;
    }

    public final void C() {
        int i = this.i + this.j;
        this.i = i;
        int i2 = i - this.l;
        int i3 = this.n;
        if (i2 > i3) {
            int i4 = i2 - i3;
            this.j = i4;
            this.i = i - i4;
            return;
        }
        this.j = 0;
    }

    public final void D(int i) throws IOException {
        if (i >= 0) {
            int i2 = this.i;
            int i3 = this.k;
            if (i <= i2 - i3) {
                this.k = i3 + i;
                return;
            }
        }
        if (i < 0) {
            throw zzji.f();
        }
        throw zzji.h();
    }

    public final byte E() throws IOException {
        int i = this.k;
        if (i != this.i) {
            byte[] bArr = this.g;
            this.k = i + 1;
            return bArr[i];
        }
        throw zzji.h();
    }

    public final int F() throws IOException {
        int i = this.k;
        if (this.i - i >= 4) {
            byte[] bArr = this.g;
            this.k = i + 4;
            return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
        }
        throw zzji.h();
    }

    public final int G() throws IOException {
        int i;
        int i2 = this.k;
        int i3 = this.i;
        if (i3 != i2) {
            byte[] bArr = this.g;
            int i4 = i2 + 1;
            byte b = bArr[i2];
            if (b >= 0) {
                this.k = i4;
                return b;
            } else if (i3 - i4 >= 9) {
                int i5 = i2 + 2;
                int i6 = (bArr[i4] << 7) ^ b;
                if (i6 < 0) {
                    i = i6 ^ (-128);
                } else {
                    int i7 = i2 + 3;
                    int i8 = (bArr[i5] << C8077mf.p) ^ i6;
                    if (i8 >= 0) {
                        i = i8 ^ 16256;
                    } else {
                        int i9 = i2 + 4;
                        int i10 = i8 ^ (bArr[i7] << C8077mf.y);
                        if (i10 < 0) {
                            i = (-2080896) ^ i10;
                        } else {
                            i7 = i2 + 5;
                            byte b2 = bArr[i9];
                            int i11 = (i10 ^ (b2 << 28)) ^ 266354560;
                            if (b2 < 0) {
                                i9 = i2 + 6;
                                if (bArr[i7] < 0) {
                                    i7 = i2 + 7;
                                    if (bArr[i9] < 0) {
                                        i9 = i2 + 8;
                                        if (bArr[i7] < 0) {
                                            i7 = i2 + 9;
                                            if (bArr[i9] < 0) {
                                                int i12 = i2 + 10;
                                                if (bArr[i7] >= 0) {
                                                    i5 = i12;
                                                    i = i11;
                                                }
                                            }
                                        }
                                    }
                                }
                                i = i11;
                            }
                            i = i11;
                        }
                        i5 = i9;
                    }
                    i5 = i7;
                }
                this.k = i5;
                return i;
            }
        }
        return (int) t();
    }

    public final long H() throws IOException {
        int i = this.k;
        if (this.i - i >= 8) {
            byte[] bArr = this.g;
            this.k = i + 8;
            return ((bArr[i + 7] & 255) << 56) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48);
        }
        throw zzji.h();
    }

    public final long I() throws IOException {
        long j;
        long j2;
        long j3;
        int i = this.k;
        int i2 = this.i;
        if (i2 != i) {
            byte[] bArr = this.g;
            int i3 = i + 1;
            byte b = bArr[i];
            if (b >= 0) {
                this.k = i3;
                return b;
            } else if (i2 - i3 >= 9) {
                int i4 = i + 2;
                int i5 = (bArr[i3] << 7) ^ b;
                if (i5 < 0) {
                    j = i5 ^ (-128);
                } else {
                    int i6 = i + 3;
                    int i7 = (bArr[i4] << C8077mf.p) ^ i5;
                    if (i7 >= 0) {
                        j = i7 ^ 16256;
                        i4 = i6;
                    } else {
                        int i8 = i + 4;
                        int i9 = i7 ^ (bArr[i6] << C8077mf.y);
                        if (i9 < 0) {
                            i4 = i8;
                            j = (-2080896) ^ i9;
                        } else {
                            long j4 = i9;
                            i4 = i + 5;
                            long j5 = j4 ^ (bArr[i8] << 28);
                            if (j5 >= 0) {
                                j3 = 266354560;
                            } else {
                                int i10 = i + 6;
                                long j6 = j5 ^ (bArr[i4] << 35);
                                if (j6 < 0) {
                                    j2 = -34093383808L;
                                } else {
                                    i4 = i + 7;
                                    j5 = j6 ^ (bArr[i10] << 42);
                                    if (j5 >= 0) {
                                        j3 = 4363953127296L;
                                    } else {
                                        i10 = i + 8;
                                        j6 = j5 ^ (bArr[i4] << 49);
                                        if (j6 < 0) {
                                            j2 = -558586000294016L;
                                        } else {
                                            i4 = i + 9;
                                            long j7 = (j6 ^ (bArr[i10] << 56)) ^ 71499008037633920L;
                                            if (j7 < 0) {
                                                int i11 = i + 10;
                                                if (bArr[i4] >= 0) {
                                                    i4 = i11;
                                                }
                                            }
                                            j = j7;
                                        }
                                    }
                                }
                                j = j6 ^ j2;
                                i4 = i10;
                            }
                            j = j5 ^ j3;
                        }
                    }
                }
                this.k = i4;
                return j;
            }
        }
        return t();
    }

    @Override // com.google.android.gms.internal.measurement.zzib
    public final double a() throws IOException {
        return Double.longBitsToDouble(H());
    }

    @Override // com.google.android.gms.internal.measurement.zzib
    public final int b(int i) throws zzji {
        if (i >= 0) {
            int g = i + g();
            if (g >= 0) {
                int i2 = this.n;
                if (g <= i2) {
                    this.n = g;
                    C();
                    return i2;
                }
                throw zzji.h();
            }
            throw zzji.g();
        }
        throw zzji.f();
    }

    @Override // com.google.android.gms.internal.measurement.zzib
    public final float e() throws IOException {
        return Float.intBitsToFloat(F());
    }

    @Override // com.google.android.gms.internal.measurement.zzib
    public final void f(int i) throws zzji {
        if (this.m == i) {
            return;
        }
        throw zzji.b();
    }

    @Override // com.google.android.gms.internal.measurement.zzib
    public final int g() {
        return this.k - this.l;
    }

    @Override // com.google.android.gms.internal.measurement.zzib
    public final void h(int i) {
        this.n = i;
        C();
    }

    @Override // com.google.android.gms.internal.measurement.zzib
    public final int i() throws IOException {
        return G();
    }

    @Override // com.google.android.gms.internal.measurement.zzib
    public final boolean j(int i) throws IOException {
        int p;
        int i2 = i & 7;
        int i3 = 0;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        if (i2 == 4) {
                            return false;
                        }
                        if (i2 == 5) {
                            D(4);
                            return true;
                        }
                        throw zzji.a();
                    }
                    do {
                        p = p();
                        if (p == 0) {
                            break;
                        }
                    } while (j(p));
                    f(((i >>> 3) << 3) | 4);
                    return true;
                }
                D(G());
                return true;
            }
            D(8);
            return true;
        }
        if (this.i - this.k >= 10) {
            while (i3 < 10) {
                byte[] bArr = this.g;
                int i4 = this.k;
                this.k = i4 + 1;
                if (bArr[i4] < 0) {
                    i3++;
                }
            }
            throw zzji.e();
        }
        while (i3 < 10) {
            if (E() < 0) {
                i3++;
            }
        }
        throw zzji.e();
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.zzib
    public final int k() throws IOException {
        return F();
    }

    @Override // com.google.android.gms.internal.measurement.zzib
    public final int m() throws IOException {
        return G();
    }

    @Override // com.google.android.gms.internal.measurement.zzib
    public final int n() throws IOException {
        return F();
    }

    @Override // com.google.android.gms.internal.measurement.zzib
    public final int o() throws IOException {
        return zzib.l(G());
    }

    @Override // com.google.android.gms.internal.measurement.zzib
    public final int p() throws IOException {
        if (A()) {
            this.m = 0;
            return 0;
        }
        int G = G();
        this.m = G;
        if ((G >>> 3) != 0) {
            return G;
        }
        throw zzji.c();
    }

    @Override // com.google.android.gms.internal.measurement.zzib
    public final int q() throws IOException {
        return G();
    }

    @Override // com.google.android.gms.internal.measurement.zzib
    public final long r() throws IOException {
        return H();
    }

    @Override // com.google.android.gms.internal.measurement.zzib
    public final long s() throws IOException {
        return I();
    }

    @Override // com.google.android.gms.internal.measurement.zzib
    public final long t() throws IOException {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            byte E = E();
            j |= (E & Byte.MAX_VALUE) << i;
            if ((E & 128) == 0) {
                return j;
            }
        }
        throw zzji.e();
    }

    @Override // com.google.android.gms.internal.measurement.zzib
    public final long u() throws IOException {
        return H();
    }

    @Override // com.google.android.gms.internal.measurement.zzib
    public final long v() throws IOException {
        return zzib.c(I());
    }

    @Override // com.google.android.gms.internal.measurement.zzib
    public final long w() throws IOException {
        return I();
    }

    @Override // com.google.android.gms.internal.measurement.zzib
    public final zzhm x() throws IOException {
        byte[] bArr;
        int G = G();
        if (G > 0) {
            int i = this.i;
            int i2 = this.k;
            if (G <= i - i2) {
                zzhm l = zzhm.l(this.g, i2, G);
                this.k += G;
                return l;
            }
        }
        if (G == 0) {
            return zzhm.Y;
        }
        if (G > 0) {
            int i3 = this.i;
            int i4 = this.k;
            if (G <= i3 - i4) {
                int i5 = G + i4;
                this.k = i5;
                bArr = Arrays.copyOfRange(this.g, i4, i5);
                return zzhm.k(bArr);
            }
        }
        if (G <= 0) {
            if (G == 0) {
                bArr = zziz.d;
                return zzhm.k(bArr);
            }
            throw zzji.f();
        }
        throw zzji.h();
    }

    @Override // com.google.android.gms.internal.measurement.zzib
    public final String y() throws IOException {
        int G = G();
        if (G > 0) {
            int i = this.i;
            int i2 = this.k;
            if (G <= i - i2) {
                String str = new String(this.g, i2, G, zziz.b);
                this.k += G;
                return str;
            }
        }
        if (G == 0) {
            return "";
        }
        if (G < 0) {
            throw zzji.f();
        }
        throw zzji.h();
    }

    @Override // com.google.android.gms.internal.measurement.zzib
    public final String z() throws IOException {
        int G = G();
        if (G > 0) {
            int i = this.i;
            int i2 = this.k;
            if (G <= i - i2) {
                String e = zzmh.e(this.g, i2, G);
                this.k += G;
                return e;
            }
        }
        if (G == 0) {
            return "";
        }
        if (G <= 0) {
            throw zzji.f();
        }
        throw zzji.h();
    }

    public zzia(byte[] bArr, int i, int i2, boolean z) {
        super();
        this.n = Integer.MAX_VALUE;
        this.g = bArr;
        this.i = i2 + i;
        this.k = i;
        this.l = i;
        this.h = z;
    }
}
