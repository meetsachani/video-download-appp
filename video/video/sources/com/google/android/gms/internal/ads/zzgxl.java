package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Arrays;
import o.C8077mf;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzgxl extends zzgxq {
    public final byte[] f;
    public int g;
    public int h;
    public int i;
    public final int j;
    public int k;
    public int l;

    public /* synthetic */ zzgxl(byte[] bArr, int i, int i2, boolean z, zzgxp zzgxpVar) {
        super(null);
        this.l = Integer.MAX_VALUE;
        this.f = bArr;
        this.g = i2 + i;
        this.i = i;
        this.j = i;
    }

    @Override // com.google.android.gms.internal.ads.zzgxq
    public final void A(int i) throws zzgzh {
        if (this.k == i) {
            return;
        }
        throw new zzgzh("Protocol message end-group tag did not match expected tag.");
    }

    @Override // com.google.android.gms.internal.ads.zzgxq
    public final void B(int i) {
        this.l = i;
        C();
    }

    public final void C() {
        int i = this.g + this.h;
        this.g = i;
        int i2 = i - this.j;
        int i3 = this.l;
        if (i2 <= i3) {
            this.h = 0;
            return;
        }
        int i4 = i2 - i3;
        this.h = i4;
        this.g = i - i4;
    }

    public final int D() throws IOException {
        int i = this.i;
        if (this.g - i >= 4) {
            byte[] bArr = this.f;
            this.i = i + 4;
            int i2 = (bArr[i + 1] & 255) << 8;
            return ((bArr[i + 3] & 255) << 24) | i2 | (bArr[i] & 255) | ((bArr[i + 2] & 255) << 16);
        }
        throw new zzgzh("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public final int E() throws IOException {
        int i;
        int i2 = this.i;
        int i3 = this.g;
        if (i3 != i2) {
            byte[] bArr = this.f;
            int i4 = i2 + 1;
            byte b = bArr[i2];
            if (b >= 0) {
                this.i = i4;
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
                this.i = i5;
                return i;
            }
        }
        return (int) H();
    }

    public final long F() throws IOException {
        int i = this.i;
        if (this.g - i >= 8) {
            byte[] bArr = this.f;
            this.i = i + 8;
            long j = bArr[i + 2];
            long j2 = bArr[i + 3];
            long j3 = bArr[i + 4];
            long j4 = bArr[i + 5];
            return ((bArr[i + 6] & 255) << 48) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((j & 255) << 16) | ((j2 & 255) << 24) | ((j3 & 255) << 32) | ((j4 & 255) << 40) | ((bArr[i + 7] & 255) << 56);
        }
        throw new zzgzh("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public final long G() throws IOException {
        long j;
        long j2;
        int i = this.i;
        int i2 = this.g;
        if (i2 != i) {
            byte[] bArr = this.f;
            int i3 = i + 1;
            byte b = bArr[i];
            if (b >= 0) {
                this.i = i3;
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
                    } else {
                        int i8 = i + 4;
                        int i9 = i7 ^ (bArr[i6] << C8077mf.y);
                        if (i9 < 0) {
                            i4 = i8;
                            j = (-2080896) ^ i9;
                        } else {
                            i6 = i + 5;
                            long j3 = (bArr[i8] << 28) ^ i9;
                            if (j3 >= 0) {
                                j = j3 ^ 266354560;
                            } else {
                                i4 = i + 6;
                                long j4 = (bArr[i6] << 35) ^ j3;
                                if (j4 < 0) {
                                    j2 = -34093383808L;
                                } else {
                                    int i10 = i + 7;
                                    long j5 = j4 ^ (bArr[i4] << 42);
                                    if (j5 >= 0) {
                                        j = j5 ^ 4363953127296L;
                                    } else {
                                        i4 = i + 8;
                                        j4 = j5 ^ (bArr[i10] << 49);
                                        if (j4 < 0) {
                                            j2 = -558586000294016L;
                                        } else {
                                            i10 = i + 9;
                                            long j6 = (j4 ^ (bArr[i4] << 56)) ^ 71499008037633920L;
                                            if (j6 < 0) {
                                                i4 = i + 10;
                                                if (bArr[i10] >= 0) {
                                                    j = j6;
                                                }
                                            } else {
                                                j = j6;
                                            }
                                        }
                                    }
                                    i4 = i10;
                                }
                                j = j4 ^ j2;
                            }
                        }
                    }
                    i4 = i6;
                }
                this.i = i4;
                return j;
            }
        }
        return H();
    }

    public final long H() throws IOException {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            int i2 = this.i;
            if (i2 != this.g) {
                byte[] bArr = this.f;
                this.i = i2 + 1;
                byte b = bArr[i2];
                j |= (b & Byte.MAX_VALUE) << i;
                if ((b & 128) == 0) {
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
        return this.i == this.g;
    }

    @Override // com.google.android.gms.internal.ads.zzgxq
    public final boolean b() throws IOException {
        if (G() != 0) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzgxq
    public final double h() throws IOException {
        return Double.longBitsToDouble(F());
    }

    @Override // com.google.android.gms.internal.ads.zzgxq
    public final float i() throws IOException {
        return Float.intBitsToFloat(D());
    }

    @Override // com.google.android.gms.internal.ads.zzgxq
    public final int j() {
        return this.i - this.j;
    }

    @Override // com.google.android.gms.internal.ads.zzgxq
    public final int k(int i) throws zzgzh {
        if (i >= 0) {
            int i2 = i + (this.i - this.j);
            if (i2 >= 0) {
                int i3 = this.l;
                if (i2 <= i3) {
                    this.l = i2;
                    C();
                    return i3;
                }
                throw new zzgzh("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            throw new zzgzh("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
        }
        throw new zzgzh("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    @Override // com.google.android.gms.internal.ads.zzgxq
    public final int l() throws IOException {
        return E();
    }

    @Override // com.google.android.gms.internal.ads.zzgxq
    public final int m() throws IOException {
        return D();
    }

    @Override // com.google.android.gms.internal.ads.zzgxq
    public final int n() throws IOException {
        return E();
    }

    @Override // com.google.android.gms.internal.ads.zzgxq
    public final int o() throws IOException {
        return D();
    }

    @Override // com.google.android.gms.internal.ads.zzgxq
    public final int p() throws IOException {
        return zzgxq.c(E());
    }

    @Override // com.google.android.gms.internal.ads.zzgxq
    public final int q() throws IOException {
        if (a()) {
            this.k = 0;
            return 0;
        }
        int E = E();
        this.k = E;
        if ((E >>> 3) != 0) {
            return E;
        }
        throw new zzgzh("Protocol message contained an invalid tag (zero).");
    }

    @Override // com.google.android.gms.internal.ads.zzgxq
    public final int r() throws IOException {
        return E();
    }

    @Override // com.google.android.gms.internal.ads.zzgxq
    public final long s() throws IOException {
        return F();
    }

    @Override // com.google.android.gms.internal.ads.zzgxq
    public final long t() throws IOException {
        return G();
    }

    @Override // com.google.android.gms.internal.ads.zzgxq
    public final long u() throws IOException {
        return F();
    }

    @Override // com.google.android.gms.internal.ads.zzgxq
    public final long v() throws IOException {
        return zzgxq.e(G());
    }

    @Override // com.google.android.gms.internal.ads.zzgxq
    public final long w() throws IOException {
        return G();
    }

    @Override // com.google.android.gms.internal.ads.zzgxq
    public final zzgxk x() throws IOException {
        int E = E();
        if (E > 0) {
            int i = this.g;
            int i2 = this.i;
            if (E <= i - i2) {
                zzgxk U = zzgxk.U(this.f, i2, E);
                this.i += E;
                return U;
            }
        }
        if (E != 0) {
            if (E > 0) {
                int i3 = this.g;
                int i4 = this.i;
                if (E <= i3 - i4) {
                    int i5 = E + i4;
                    this.i = i5;
                    byte[] copyOfRange = Arrays.copyOfRange(this.f, i4, i5);
                    zzgxk zzgxkVar = zzgxk.Y;
                    return new zzgxh(copyOfRange);
                }
            }
            if (E <= 0) {
                throw new zzgzh("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
            throw new zzgzh("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        return zzgxk.Y;
    }

    @Override // com.google.android.gms.internal.ads.zzgxq
    public final String y() throws IOException {
        int E = E();
        if (E > 0) {
            int i = this.g;
            int i2 = this.i;
            if (E <= i - i2) {
                String str = new String(this.f, i2, E, zzgzf.a);
                this.i += E;
                return str;
            }
        }
        if (E == 0) {
            return "";
        }
        if (E < 0) {
            throw new zzgzh("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        throw new zzgzh("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    @Override // com.google.android.gms.internal.ads.zzgxq
    public final String z() throws IOException {
        int E = E();
        if (E > 0) {
            int i = this.g;
            int i2 = this.i;
            if (E <= i - i2) {
                String h = zzhbu.h(this.f, i2, E);
                this.i += E;
                return h;
            }
        }
        if (E == 0) {
            return "";
        }
        if (E <= 0) {
            throw new zzgzh("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        throw new zzgzh("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }
}
