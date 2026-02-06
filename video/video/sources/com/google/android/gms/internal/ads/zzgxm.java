package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Iterator;
import o.C8077mf;

/* loaded from: classes2.dex */
final class zzgxm extends zzgxq {
    public final Iterable f;
    public final Iterator g;
    public ByteBuffer h;
    public int i;
    public int j;
    public int k;
    public int l;
    public int m;
    public long n;

    /* renamed from: o  reason: collision with root package name */
    public long f285o;
    public long p;

    public /* synthetic */ zzgxm(Iterable iterable, int i, boolean z, zzgxp zzgxpVar) {
        super(null);
        this.k = Integer.MAX_VALUE;
        this.i = i;
        this.f = iterable;
        this.g = iterable.iterator();
        this.m = 0;
        if (i == 0) {
            this.h = zzgzf.c;
            this.n = 0L;
            this.f285o = 0L;
            this.p = 0L;
            return;
        }
        H();
    }

    @Override // com.google.android.gms.internal.ads.zzgxq
    public final void A(int i) throws zzgzh {
        if (this.l == i) {
            return;
        }
        throw new zzgzh("Protocol message end-group tag did not match expected tag.");
    }

    @Override // com.google.android.gms.internal.ads.zzgxq
    public final void B(int i) {
        this.k = i;
        G();
    }

    public final long C() throws IOException {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            byte I = I();
            j |= (I & Byte.MAX_VALUE) << i;
            if ((I & 128) == 0) {
                return j;
            }
        }
        throw new zzgzh("CodedInputStream encountered a malformed varint.");
    }

    public final int D() {
        return (int) (((this.i - this.m) - this.n) + this.f285o);
    }

    public final void E() throws zzgzh {
        if (this.g.hasNext()) {
            H();
            return;
        }
        throw new zzgzh("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public final void F(byte[] bArr, int i, int i2) throws IOException {
        if (i2 <= D()) {
            int i3 = i2;
            while (i3 > 0) {
                if (this.p - this.n == 0) {
                    E();
                }
                int min = Math.min(i3, (int) (this.p - this.n));
                long j = min;
                zzhbp.w(this.n, bArr, i2 - i3, j);
                i3 -= min;
                this.n += j;
            }
        } else if (i2 <= 0) {
        } else {
            throw new zzgzh("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }

    public final void G() {
        int i = this.i + this.j;
        this.i = i;
        int i2 = this.k;
        if (i <= i2) {
            this.j = 0;
            return;
        }
        int i3 = i - i2;
        this.j = i3;
        this.i = i - i3;
    }

    public final void H() {
        ByteBuffer byteBuffer = (ByteBuffer) this.g.next();
        this.h = byteBuffer;
        this.m += (int) (this.n - this.f285o);
        long position = byteBuffer.position();
        this.n = position;
        this.f285o = position;
        this.p = this.h.limit();
        long m = zzhbp.m(this.h);
        this.n += m;
        this.f285o += m;
        this.p += m;
    }

    public final byte I() throws IOException {
        if (this.p - this.n == 0) {
            E();
        }
        long j = this.n;
        this.n = 1 + j;
        return zzhbp.i(j);
    }

    public final int J() throws IOException {
        long j = this.p;
        long j2 = this.n;
        if (j - j2 >= 4) {
            this.n = 4 + j2;
            return (zzhbp.i(j2) & 255) | ((zzhbp.i(1 + j2) & 255) << 8) | ((zzhbp.i(2 + j2) & 255) << 16) | ((zzhbp.i(j2 + 3) & 255) << 24);
        }
        return (I() & 255) | ((I() & 255) << 8) | ((I() & 255) << 16) | ((I() & 255) << 24);
    }

    public final int K() throws IOException {
        int i;
        long j = this.n;
        if (this.p != j) {
            long j2 = j + 1;
            byte i2 = zzhbp.i(j);
            if (i2 >= 0) {
                this.n++;
                return i2;
            } else if (this.p - this.n >= 10) {
                long j3 = 2 + j;
                int i3 = (zzhbp.i(j2) << 7) ^ i2;
                if (i3 < 0) {
                    i = i3 ^ (-128);
                } else {
                    long j4 = 3 + j;
                    int i4 = (zzhbp.i(j3) << C8077mf.p) ^ i3;
                    if (i4 >= 0) {
                        i = i4 ^ 16256;
                    } else {
                        long j5 = 4 + j;
                        int i5 = i4 ^ (zzhbp.i(j4) << C8077mf.y);
                        if (i5 < 0) {
                            i = (-2080896) ^ i5;
                        } else {
                            j4 = 5 + j;
                            byte i6 = zzhbp.i(j5);
                            int i7 = (i5 ^ (i6 << 28)) ^ 266354560;
                            if (i6 < 0) {
                                j5 = 6 + j;
                                if (zzhbp.i(j4) < 0) {
                                    j4 = 7 + j;
                                    if (zzhbp.i(j5) < 0) {
                                        j5 = 8 + j;
                                        if (zzhbp.i(j4) < 0) {
                                            j4 = 9 + j;
                                            if (zzhbp.i(j5) < 0) {
                                                long j6 = j + 10;
                                                if (zzhbp.i(j4) >= 0) {
                                                    i = i7;
                                                    j3 = j6;
                                                }
                                            }
                                        }
                                    }
                                }
                                i = i7;
                            }
                            i = i7;
                        }
                        j3 = j5;
                    }
                    j3 = j4;
                }
                this.n = j3;
                return i;
            }
        }
        return (int) C();
    }

    public final long L() throws IOException {
        long j = this.p;
        long j2 = this.n;
        if (j - j2 >= 8) {
            this.n = 8 + j2;
            return (zzhbp.i(j2) & 255) | ((zzhbp.i(1 + j2) & 255) << 8) | ((zzhbp.i(j2 + 2) & 255) << 16) | ((zzhbp.i(3 + j2) & 255) << 24) | ((zzhbp.i(j2 + 4) & 255) << 32) | ((zzhbp.i(j2 + 5) & 255) << 40) | ((zzhbp.i(j2 + 6) & 255) << 48) | ((zzhbp.i(j2 + 7) & 255) << 56);
        }
        return ((I() & 255) << 56) | (I() & 255) | ((I() & 255) << 8) | ((I() & 255) << 16) | ((I() & 255) << 24) | ((I() & 255) << 32) | ((I() & 255) << 40) | ((I() & 255) << 48);
    }

    public final long M() throws IOException {
        long j;
        long j2;
        long j3 = this.n;
        if (this.p != j3) {
            long j4 = j3 + 1;
            byte i = zzhbp.i(j3);
            if (i >= 0) {
                this.n++;
                return i;
            } else if (this.p - this.n >= 10) {
                long j5 = 2 + j3;
                int i2 = (zzhbp.i(j4) << 7) ^ i;
                if (i2 < 0) {
                    j = i2 ^ (-128);
                } else {
                    long j6 = 3 + j3;
                    int i3 = (zzhbp.i(j5) << C8077mf.p) ^ i2;
                    if (i3 >= 0) {
                        j = i3 ^ 16256;
                    } else {
                        long j7 = 4 + j3;
                        int i4 = i3 ^ (zzhbp.i(j6) << C8077mf.y);
                        if (i4 < 0) {
                            j = (-2080896) ^ i4;
                            j5 = j7;
                        } else {
                            j6 = 5 + j3;
                            long i5 = (zzhbp.i(j7) << 28) ^ i4;
                            if (i5 >= 0) {
                                j = 266354560 ^ i5;
                            } else {
                                long j8 = 6 + j3;
                                long i6 = i5 ^ (zzhbp.i(j6) << 35);
                                if (i6 < 0) {
                                    j2 = -34093383808L;
                                } else {
                                    long j9 = 7 + j3;
                                    long i7 = i6 ^ (zzhbp.i(j8) << 42);
                                    if (i7 >= 0) {
                                        j = 4363953127296L ^ i7;
                                    } else {
                                        j8 = 8 + j3;
                                        i6 = i7 ^ (zzhbp.i(j9) << 49);
                                        if (i6 < 0) {
                                            j2 = -558586000294016L;
                                        } else {
                                            j9 = 9 + j3;
                                            long i8 = (i6 ^ (zzhbp.i(j8) << 56)) ^ 71499008037633920L;
                                            if (i8 < 0) {
                                                long j10 = j3 + 10;
                                                if (zzhbp.i(j9) >= 0) {
                                                    j5 = j10;
                                                    j = i8;
                                                }
                                            } else {
                                                j = i8;
                                            }
                                        }
                                    }
                                    j5 = j9;
                                }
                                j = j2 ^ i6;
                                j5 = j8;
                            }
                        }
                    }
                    j5 = j6;
                }
                this.n = j5;
                return j;
            }
        }
        return C();
    }

    @Override // com.google.android.gms.internal.ads.zzgxq
    public final boolean a() throws IOException {
        return (((long) this.m) + this.n) - this.f285o == ((long) this.i);
    }

    @Override // com.google.android.gms.internal.ads.zzgxq
    public final boolean b() throws IOException {
        if (M() != 0) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzgxq
    public final double h() throws IOException {
        return Double.longBitsToDouble(L());
    }

    @Override // com.google.android.gms.internal.ads.zzgxq
    public final float i() throws IOException {
        return Float.intBitsToFloat(J());
    }

    @Override // com.google.android.gms.internal.ads.zzgxq
    public final int j() {
        return (int) ((this.m + this.n) - this.f285o);
    }

    @Override // com.google.android.gms.internal.ads.zzgxq
    public final int k(int i) throws zzgzh {
        if (i >= 0) {
            int j = i + j();
            int i2 = this.k;
            if (j <= i2) {
                this.k = j;
                G();
                return i2;
            }
            throw new zzgzh("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        throw new zzgzh("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    @Override // com.google.android.gms.internal.ads.zzgxq
    public final int l() throws IOException {
        return K();
    }

    @Override // com.google.android.gms.internal.ads.zzgxq
    public final int m() throws IOException {
        return J();
    }

    @Override // com.google.android.gms.internal.ads.zzgxq
    public final int n() throws IOException {
        return K();
    }

    @Override // com.google.android.gms.internal.ads.zzgxq
    public final int o() throws IOException {
        return J();
    }

    @Override // com.google.android.gms.internal.ads.zzgxq
    public final int p() throws IOException {
        return zzgxq.c(K());
    }

    @Override // com.google.android.gms.internal.ads.zzgxq
    public final int q() throws IOException {
        if (a()) {
            this.l = 0;
            return 0;
        }
        int K = K();
        this.l = K;
        if ((K >>> 3) != 0) {
            return K;
        }
        throw new zzgzh("Protocol message contained an invalid tag (zero).");
    }

    @Override // com.google.android.gms.internal.ads.zzgxq
    public final int r() throws IOException {
        return K();
    }

    @Override // com.google.android.gms.internal.ads.zzgxq
    public final long s() throws IOException {
        return L();
    }

    @Override // com.google.android.gms.internal.ads.zzgxq
    public final long t() throws IOException {
        return M();
    }

    @Override // com.google.android.gms.internal.ads.zzgxq
    public final long u() throws IOException {
        return L();
    }

    @Override // com.google.android.gms.internal.ads.zzgxq
    public final long v() throws IOException {
        return zzgxq.e(M());
    }

    @Override // com.google.android.gms.internal.ads.zzgxq
    public final long w() throws IOException {
        return M();
    }

    @Override // com.google.android.gms.internal.ads.zzgxq
    public final zzgxk x() throws IOException {
        int K = K();
        if (K > 0) {
            long j = this.p;
            long j2 = this.n;
            long j3 = K;
            if (j3 <= j - j2) {
                byte[] bArr = new byte[K];
                zzhbp.w(j2, bArr, 0L, j3);
                this.n += j3;
                zzgxk zzgxkVar = zzgxk.Y;
                return new zzgxh(bArr);
            }
        }
        if (K > 0 && K <= D()) {
            byte[] bArr2 = new byte[K];
            F(bArr2, 0, K);
            zzgxk zzgxkVar2 = zzgxk.Y;
            return new zzgxh(bArr2);
        } else if (K == 0) {
            return zzgxk.Y;
        } else {
            if (K < 0) {
                throw new zzgzh("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
            throw new zzgzh("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgxq
    public final String y() throws IOException {
        int K = K();
        if (K > 0) {
            long j = this.p;
            long j2 = this.n;
            long j3 = K;
            if (j3 <= j - j2) {
                byte[] bArr = new byte[K];
                zzhbp.w(j2, bArr, 0L, j3);
                String str = new String(bArr, zzgzf.a);
                this.n += j3;
                return str;
            }
        }
        if (K > 0 && K <= D()) {
            byte[] bArr2 = new byte[K];
            F(bArr2, 0, K);
            return new String(bArr2, zzgzf.a);
        } else if (K == 0) {
            return "";
        } else {
            if (K < 0) {
                throw new zzgzh("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
            throw new zzgzh("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgxq
    public final String z() throws IOException {
        int K = K();
        if (K > 0) {
            long j = this.p;
            long j2 = this.n;
            long j3 = K;
            if (j3 <= j - j2) {
                String g = zzhbu.g(this.h, (int) (j2 - this.f285o), K);
                this.n += j3;
                return g;
            }
        }
        if (K >= 0 && K <= D()) {
            byte[] bArr = new byte[K];
            F(bArr, 0, K);
            return zzhbu.h(bArr, 0, K);
        } else if (K == 0) {
            return "";
        } else {
            if (K <= 0) {
                throw new zzgzh("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
            throw new zzgzh("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }
}
