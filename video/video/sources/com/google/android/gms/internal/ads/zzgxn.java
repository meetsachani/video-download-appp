package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import o.C10323vs;
import o.C8077mf;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzgxn extends zzgxq {
    public final InputStream f;
    public final byte[] g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int l;
    public int m;

    public /* synthetic */ zzgxn(InputStream inputStream, int i, zzgxp zzgxpVar) {
        super(null);
        this.m = Integer.MAX_VALUE;
        byte[] bArr = zzgzf.b;
        this.f = inputStream;
        this.g = new byte[4096];
        this.h = 0;
        this.j = 0;
        this.l = 0;
    }

    private final void E() {
        int i = this.h + this.i;
        this.h = i;
        int i2 = this.l + i;
        int i3 = this.m;
        if (i2 <= i3) {
            this.i = 0;
            return;
        }
        int i4 = i2 - i3;
        this.i = i4;
        this.h = i - i4;
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
        this.m = i;
        E();
    }

    public final void C(int i) throws IOException {
        int i2 = this.h;
        int i3 = this.j;
        int i4 = i2 - i3;
        if (i <= i4 && i >= 0) {
            this.j = i3 + i;
        } else if (i >= 0) {
            int i5 = this.l;
            int i6 = i5 + i3;
            int i7 = this.m;
            if (i6 + i <= i7) {
                this.l = i6;
                this.h = 0;
                this.j = 0;
                while (i4 < i) {
                    try {
                        long j = i - i4;
                        try {
                            long skip = this.f.skip(j);
                            int i8 = (skip > 0L ? 1 : (skip == 0L ? 0 : -1));
                            if (i8 >= 0 && skip <= j) {
                                if (i8 == 0) {
                                    break;
                                }
                                i4 += (int) skip;
                            } else {
                                throw new IllegalStateException(String.valueOf(this.f.getClass()) + "#skip returned invalid result: " + skip + "\nThe InputStream implementation is buggy.");
                            }
                        } catch (zzgzh e) {
                            e.a();
                            throw e;
                        }
                    } catch (Throwable th) {
                        this.l += i4;
                        E();
                        throw th;
                    }
                }
                this.l += i4;
                E();
                if (i4 < i) {
                    int i9 = this.h;
                    int i10 = i9 - this.j;
                    this.j = i9;
                    F(1);
                    while (true) {
                        int i11 = i - i10;
                        int i12 = this.h;
                        if (i11 > i12) {
                            i10 += i12;
                            this.j = i12;
                            F(1);
                        } else {
                            this.j = i11;
                            return;
                        }
                    }
                }
            } else {
                C((i7 - i5) - i3);
                throw new zzgzh("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
        } else {
            throw new zzgzh("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
    }

    public final List D(int i) throws IOException {
        ArrayList arrayList = new ArrayList();
        while (i > 0) {
            int min = Math.min(i, 4096);
            byte[] bArr = new byte[min];
            int i2 = 0;
            while (i2 < min) {
                int read = this.f.read(bArr, i2, min - i2);
                if (read != -1) {
                    this.l += read;
                    i2 += read;
                } else {
                    throw new zzgzh("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                }
            }
            i -= min;
            arrayList.add(bArr);
        }
        return arrayList;
    }

    public final void F(int i) throws IOException {
        if (!G(i)) {
            if (i > (Integer.MAX_VALUE - this.l) - this.j) {
                throw new zzgzh("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
            }
            throw new zzgzh("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }

    public final boolean G(int i) throws IOException {
        int i2 = this.j;
        int i3 = i2 + i;
        int i4 = this.h;
        if (i3 > i4) {
            int i5 = this.l;
            if (i > (Integer.MAX_VALUE - i5) - i2 || i5 + i2 + i > this.m) {
                return false;
            }
            if (i2 > 0) {
                if (i4 > i2) {
                    byte[] bArr = this.g;
                    System.arraycopy(bArr, i2, bArr, 0, i4 - i2);
                }
                i5 = this.l + i2;
                this.l = i5;
                i4 = this.h - i2;
                this.h = i4;
                this.j = 0;
            }
            try {
                int read = this.f.read(this.g, i4, Math.min(4096 - i4, (Integer.MAX_VALUE - i5) - i4));
                if (read != 0 && read >= -1 && read <= 4096) {
                    if (read <= 0) {
                        return false;
                    }
                    this.h += read;
                    E();
                    if (this.h >= i) {
                        return true;
                    }
                    return G(i);
                }
                throw new IllegalStateException(String.valueOf(this.f.getClass()) + "#read(byte[]) returned invalid result: " + read + "\nThe InputStream implementation is buggy.");
            } catch (zzgzh e) {
                e.a();
                throw e;
            }
        }
        throw new IllegalStateException("refillBuffer() called when " + i + " bytes were already available in buffer");
    }

    public final byte[] H(int i, boolean z) throws IOException {
        byte[] I = I(i);
        if (I != null) {
            return I;
        }
        int i2 = this.j;
        int i3 = this.h;
        int i4 = i3 - i2;
        this.l += i3;
        this.j = 0;
        this.h = 0;
        List<byte[]> D = D(i - i4);
        byte[] bArr = new byte[i];
        System.arraycopy(this.g, i2, bArr, 0, i4);
        for (byte[] bArr2 : D) {
            int length = bArr2.length;
            System.arraycopy(bArr2, 0, bArr, i4, length);
            i4 += length;
        }
        return bArr;
    }

    public final byte[] I(int i) throws IOException {
        if (i == 0) {
            return zzgzf.b;
        }
        int i2 = this.l;
        int i3 = this.j;
        int i4 = i2 + i3 + i;
        if (C10323vs.f + i4 <= 0) {
            int i5 = this.m;
            if (i4 <= i5) {
                int i6 = this.h - i3;
                int i7 = i - i6;
                if (i7 >= 4096) {
                    try {
                        if (i7 > this.f.available()) {
                            return null;
                        }
                    } catch (zzgzh e) {
                        e.a();
                        throw e;
                    }
                }
                byte[] bArr = new byte[i];
                System.arraycopy(this.g, this.j, bArr, 0, i6);
                this.l += this.h;
                this.j = 0;
                this.h = 0;
                while (i6 < i) {
                    try {
                        int read = this.f.read(bArr, i6, i - i6);
                        if (read != -1) {
                            this.l += read;
                            i6 += read;
                        } else {
                            throw new zzgzh("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                        }
                    } catch (zzgzh e2) {
                        e2.a();
                        throw e2;
                    }
                }
                return bArr;
            }
            C((i5 - i2) - i3);
            throw new zzgzh("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        throw new zzgzh("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
    }

    public final int J() throws IOException {
        int i = this.j;
        if (this.h - i < 4) {
            F(4);
            i = this.j;
        }
        byte[] bArr = this.g;
        this.j = i + 4;
        int i2 = (bArr[i + 1] & 255) << 8;
        return ((bArr[i + 3] & 255) << 24) | i2 | (bArr[i] & 255) | ((bArr[i + 2] & 255) << 16);
    }

    public final int K() throws IOException {
        int i;
        int i2 = this.j;
        int i3 = this.h;
        if (i3 != i2) {
            byte[] bArr = this.g;
            int i4 = i2 + 1;
            byte b = bArr[i2];
            if (b >= 0) {
                this.j = i4;
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
                this.j = i5;
                return i;
            }
        }
        return (int) N();
    }

    public final long L() throws IOException {
        int i = this.j;
        if (this.h - i < 8) {
            F(8);
            i = this.j;
        }
        byte[] bArr = this.g;
        this.j = i + 8;
        long j = bArr[i + 2];
        long j2 = bArr[i + 3];
        long j3 = bArr[i + 4];
        long j4 = bArr[i + 5];
        return ((bArr[i + 6] & 255) << 48) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((j & 255) << 16) | ((j2 & 255) << 24) | ((j3 & 255) << 32) | ((j4 & 255) << 40) | ((bArr[i + 7] & 255) << 56);
    }

    public final long M() throws IOException {
        long j;
        long j2;
        int i = this.j;
        int i2 = this.h;
        if (i2 != i) {
            byte[] bArr = this.g;
            int i3 = i + 1;
            byte b = bArr[i];
            if (b >= 0) {
                this.j = i3;
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
                this.j = i4;
                return j;
            }
        }
        return N();
    }

    public final long N() throws IOException {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            if (this.j == this.h) {
                F(1);
            }
            byte[] bArr = this.g;
            int i2 = this.j;
            this.j = i2 + 1;
            byte b = bArr[i2];
            j |= (b & Byte.MAX_VALUE) << i;
            if ((b & 128) == 0) {
                return j;
            }
        }
        throw new zzgzh("CodedInputStream encountered a malformed varint.");
    }

    @Override // com.google.android.gms.internal.ads.zzgxq
    public final boolean a() throws IOException {
        if (this.j == this.h && !G(1)) {
            return true;
        }
        return false;
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
        return this.l + this.j;
    }

    @Override // com.google.android.gms.internal.ads.zzgxq
    public final int k(int i) throws zzgzh {
        if (i >= 0) {
            int i2 = i + this.l + this.j;
            if (i2 >= 0) {
                int i3 = this.m;
                if (i2 <= i3) {
                    this.m = i2;
                    E();
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
            this.k = 0;
            return 0;
        }
        int K = K();
        this.k = K;
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
        int i = this.h;
        int i2 = this.j;
        if (K <= i - i2 && K > 0) {
            zzgxk U = zzgxk.U(this.g, i2, K);
            this.j += K;
            return U;
        } else if (K == 0) {
            return zzgxk.Y;
        } else {
            if (K >= 0) {
                byte[] I = I(K);
                if (I != null) {
                    return zzgxk.U(I, 0, I.length);
                }
                int i3 = this.j;
                int i4 = this.h;
                int i5 = i4 - i3;
                this.l += i4;
                this.j = 0;
                this.h = 0;
                List<byte[]> D = D(K - i5);
                byte[] bArr = new byte[K];
                System.arraycopy(this.g, i3, bArr, 0, i5);
                for (byte[] bArr2 : D) {
                    int length = bArr2.length;
                    System.arraycopy(bArr2, 0, bArr, i5, length);
                    i5 += length;
                }
                zzgxk zzgxkVar = zzgxk.Y;
                return new zzgxh(bArr);
            }
            throw new zzgzh("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgxq
    public final String y() throws IOException {
        int K = K();
        if (K > 0) {
            int i = this.h;
            int i2 = this.j;
            if (K <= i - i2) {
                String str = new String(this.g, i2, K, zzgzf.a);
                this.j += K;
                return str;
            }
        }
        if (K == 0) {
            return "";
        }
        if (K >= 0) {
            if (K <= this.h) {
                F(K);
                String str2 = new String(this.g, this.j, K, zzgzf.a);
                this.j += K;
                return str2;
            }
            return new String(H(K, false), zzgzf.a);
        }
        throw new zzgzh("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    @Override // com.google.android.gms.internal.ads.zzgxq
    public final String z() throws IOException {
        byte[] H;
        int K = K();
        int i = this.j;
        int i2 = this.h;
        if (K <= i2 - i && K > 0) {
            H = this.g;
            this.j = i + K;
        } else if (K == 0) {
            return "";
        } else {
            if (K >= 0) {
                i = 0;
                if (K <= i2) {
                    F(K);
                    H = this.g;
                    this.j = K;
                } else {
                    H = H(K, false);
                }
            } else {
                throw new zzgzh("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
        }
        return zzhbu.h(H, i, K);
    }
}
