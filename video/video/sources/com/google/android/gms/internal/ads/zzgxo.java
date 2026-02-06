package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;
import o.C8077mf;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzgxo extends zzgxq {
    public static final /* synthetic */ int n = 0;
    public final ByteBuffer f;
    public final long g;
    public long h;
    public long i;
    public final long j;
    public int k;
    public int l;
    public int m;

    public /* synthetic */ zzgxo(ByteBuffer byteBuffer, boolean z, zzgxp zzgxpVar) {
        super(null);
        this.m = Integer.MAX_VALUE;
        this.f = byteBuffer.duplicate();
        long m = zzhbp.m(byteBuffer);
        this.g = m;
        this.h = byteBuffer.limit() + m;
        long position = m + byteBuffer.position();
        this.i = position;
        this.j = position;
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
        this.m = i;
        D();
    }

    public final int C() {
        return (int) (this.h - this.i);
    }

    public final void D() {
        long j = this.h + this.k;
        this.h = j;
        int i = (int) (j - this.j);
        int i2 = this.m;
        if (i <= i2) {
            this.k = 0;
            return;
        }
        int i3 = i - i2;
        this.k = i3;
        this.h = j - i3;
    }

    public final int E() throws IOException {
        long j = this.i;
        if (this.h - j >= 4) {
            this.i = 4 + j;
            int i = (zzhbp.i(1 + j) & 255) << 8;
            return ((zzhbp.i(j + 3) & 255) << 24) | i | (zzhbp.i(j) & 255) | ((zzhbp.i(2 + j) & 255) << 16);
        }
        throw new zzgzh("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0089, code lost:
        if (com.google.android.gms.internal.ads.zzhbp.i(r3) >= 0) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int F() throws IOException {
        int i;
        long j = this.i;
        if (this.h != j) {
            long j2 = 1 + j;
            byte i2 = zzhbp.i(j);
            if (i2 >= 0) {
                this.i = j2;
                return i2;
            } else if (this.h - j2 >= 9) {
                long j3 = 2 + j;
                int i3 = (zzhbp.i(j2) << 7) ^ i2;
                if (i3 < 0) {
                    i = i3 ^ (-128);
                } else {
                    long j4 = 3 + j;
                    int i4 = i3 ^ (zzhbp.i(j3) << C8077mf.p);
                    if (i4 >= 0) {
                        i = i4 ^ 16256;
                    } else {
                        j3 = 4 + j;
                        int i5 = i4 ^ (zzhbp.i(j4) << C8077mf.y);
                        if (i5 < 0) {
                            i = (-2080896) ^ i5;
                        } else {
                            j4 = 5 + j;
                            byte i6 = zzhbp.i(j3);
                            int i7 = (i5 ^ (i6 << 28)) ^ 266354560;
                            if (i6 < 0) {
                                j3 = 6 + j;
                                if (zzhbp.i(j4) < 0) {
                                    j4 = 7 + j;
                                    if (zzhbp.i(j3) < 0) {
                                        j3 = 8 + j;
                                        if (zzhbp.i(j4) < 0) {
                                            j4 = j + 9;
                                            if (zzhbp.i(j3) < 0) {
                                                j3 = 10 + j;
                                            }
                                        }
                                    }
                                }
                                i = i7;
                            }
                            i = i7;
                        }
                    }
                    j3 = j4;
                }
                this.i = j3;
                return i;
            }
        }
        return (int) I();
    }

    public final long G() throws IOException {
        long j = this.i;
        if (this.h - j >= 8) {
            this.i = 8 + j;
            long i = zzhbp.i(6 + j);
            return ((zzhbp.i(j + 7) & 255) << 56) | (zzhbp.i(j) & 255) | ((zzhbp.i(1 + j) & 255) << 8) | ((zzhbp.i(2 + j) & 255) << 16) | ((zzhbp.i(3 + j) & 255) << 24) | ((zzhbp.i(4 + j) & 255) << 32) | ((zzhbp.i(5 + j) & 255) << 40) | ((i & 255) << 48);
        }
        throw new zzgzh("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public final long H() throws IOException {
        long j;
        long j2;
        int i;
        long j3 = this.i;
        if (this.h != j3) {
            long j4 = 1 + j3;
            byte i2 = zzhbp.i(j3);
            if (i2 >= 0) {
                this.i = j4;
                return i2;
            } else if (this.h - j4 >= 9) {
                long j5 = 2 + j3;
                int i3 = (zzhbp.i(j4) << 7) ^ i2;
                if (i3 < 0) {
                    i = i3 ^ (-128);
                } else {
                    long j6 = 3 + j3;
                    int i4 = i3 ^ (zzhbp.i(j5) << C8077mf.p);
                    if (i4 >= 0) {
                        j = i4 ^ 16256;
                    } else {
                        j5 = 4 + j3;
                        int i5 = i4 ^ (zzhbp.i(j6) << C8077mf.y);
                        if (i5 < 0) {
                            i = (-2080896) ^ i5;
                        } else {
                            j6 = 5 + j3;
                            long i6 = (zzhbp.i(j5) << 28) ^ i5;
                            if (i6 >= 0) {
                                j = 266354560 ^ i6;
                            } else {
                                long j7 = 6 + j3;
                                long i7 = (zzhbp.i(j6) << 35) ^ i6;
                                if (i7 < 0) {
                                    j2 = -34093383808L;
                                } else {
                                    j5 = j3 + 7;
                                    long i8 = i7 ^ (zzhbp.i(j7) << 42);
                                    if (i8 >= 0) {
                                        j = 4363953127296L ^ i8;
                                    } else {
                                        j7 = 8 + j3;
                                        i7 = i8 ^ (zzhbp.i(j5) << 49);
                                        if (i7 < 0) {
                                            j2 = -558586000294016L;
                                        } else {
                                            j5 = j3 + 9;
                                            long i9 = (i7 ^ (zzhbp.i(j7) << 56)) ^ 71499008037633920L;
                                            if (i9 < 0) {
                                                long j8 = j3 + 10;
                                                if (zzhbp.i(j5) >= 0) {
                                                    j5 = j8;
                                                }
                                            }
                                            j = i9;
                                        }
                                    }
                                    this.i = j5;
                                    return j;
                                }
                                j = j2 ^ i7;
                                j5 = j7;
                                this.i = j5;
                                return j;
                            }
                        }
                    }
                    j5 = j6;
                    this.i = j5;
                    return j;
                }
                j = i;
                this.i = j5;
                return j;
            }
        }
        return I();
    }

    public final long I() throws IOException {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            long j2 = this.i;
            if (j2 != this.h) {
                this.i = 1 + j2;
                byte i2 = zzhbp.i(j2);
                j |= (i2 & Byte.MAX_VALUE) << i;
                if ((i2 & 128) == 0) {
                    return j;
                }
            } else {
                throw new zzgzh("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
        }
        throw new zzgzh("CodedInputStream encountered a malformed varint.");
    }

    @Override // com.google.android.gms.internal.ads.zzgxq
    public final boolean a() throws IOException {
        return this.i == this.h;
    }

    @Override // com.google.android.gms.internal.ads.zzgxq
    public final boolean b() throws IOException {
        if (H() != 0) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzgxq
    public final double h() throws IOException {
        return Double.longBitsToDouble(G());
    }

    @Override // com.google.android.gms.internal.ads.zzgxq
    public final float i() throws IOException {
        return Float.intBitsToFloat(E());
    }

    @Override // com.google.android.gms.internal.ads.zzgxq
    public final int j() {
        return (int) (this.i - this.j);
    }

    @Override // com.google.android.gms.internal.ads.zzgxq
    public final int k(int i) throws zzgzh {
        if (i >= 0) {
            int j = i + j();
            int i2 = this.m;
            if (j <= i2) {
                this.m = j;
                D();
                return i2;
            }
            throw new zzgzh("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        throw new zzgzh("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    @Override // com.google.android.gms.internal.ads.zzgxq
    public final int l() throws IOException {
        return F();
    }

    @Override // com.google.android.gms.internal.ads.zzgxq
    public final int m() throws IOException {
        return E();
    }

    @Override // com.google.android.gms.internal.ads.zzgxq
    public final int n() throws IOException {
        return F();
    }

    @Override // com.google.android.gms.internal.ads.zzgxq
    public final int o() throws IOException {
        return E();
    }

    @Override // com.google.android.gms.internal.ads.zzgxq
    public final int p() throws IOException {
        return zzgxq.c(F());
    }

    @Override // com.google.android.gms.internal.ads.zzgxq
    public final int q() throws IOException {
        if (a()) {
            this.l = 0;
            return 0;
        }
        int F = F();
        this.l = F;
        if ((F >>> 3) != 0) {
            return F;
        }
        throw new zzgzh("Protocol message contained an invalid tag (zero).");
    }

    @Override // com.google.android.gms.internal.ads.zzgxq
    public final int r() throws IOException {
        return F();
    }

    @Override // com.google.android.gms.internal.ads.zzgxq
    public final long s() throws IOException {
        return G();
    }

    @Override // com.google.android.gms.internal.ads.zzgxq
    public final long t() throws IOException {
        return H();
    }

    @Override // com.google.android.gms.internal.ads.zzgxq
    public final long u() throws IOException {
        return G();
    }

    @Override // com.google.android.gms.internal.ads.zzgxq
    public final long v() throws IOException {
        return zzgxq.e(H());
    }

    @Override // com.google.android.gms.internal.ads.zzgxq
    public final long w() throws IOException {
        return H();
    }

    @Override // com.google.android.gms.internal.ads.zzgxq
    public final zzgxk x() throws IOException {
        int F = F();
        if (F > 0 && F <= C()) {
            byte[] bArr = new byte[F];
            long j = F;
            zzhbp.w(this.i, bArr, 0L, j);
            this.i += j;
            zzgxk zzgxkVar = zzgxk.Y;
            return new zzgxh(bArr);
        } else if (F == 0) {
            return zzgxk.Y;
        } else {
            if (F < 0) {
                throw new zzgzh("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
            throw new zzgzh("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgxq
    public final String y() throws IOException {
        int F = F();
        if (F > 0 && F <= C()) {
            byte[] bArr = new byte[F];
            long j = F;
            zzhbp.w(this.i, bArr, 0L, j);
            String str = new String(bArr, zzgzf.a);
            this.i += j;
            return str;
        } else if (F == 0) {
            return "";
        } else {
            if (F < 0) {
                throw new zzgzh("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
            throw new zzgzh("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgxq
    public final String z() throws IOException {
        int F = F();
        if (F > 0 && F <= C()) {
            String g = zzhbu.g(this.f, (int) (this.i - this.g), F);
            this.i += F;
            return g;
        } else if (F == 0) {
            return "";
        } else {
            if (F <= 0) {
                throw new zzgzh("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
            throw new zzgzh("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }
}
