package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
abstract class zzgxs extends zzgxx {
    public final byte[] e;
    public final int f;
    public int g;
    public int h;

    public zzgxs(int i) {
        super(null);
        if (i >= 0) {
            byte[] bArr = new byte[Math.max(i, 20)];
            this.e = bArr;
            this.f = bArr.length;
            return;
        }
        throw new IllegalArgumentException("bufferSize must be >= 0");
    }

    public final void F(byte b) {
        byte[] bArr = this.e;
        int i = this.g;
        bArr[i] = b;
        this.g = i + 1;
        this.h++;
    }

    public final void G(int i) {
        int i2 = this.g;
        byte[] bArr = this.e;
        bArr[i2] = (byte) i;
        bArr[i2 + 1] = (byte) (i >> 8);
        bArr[i2 + 2] = (byte) (i >> 16);
        bArr[i2 + 3] = (byte) (i >> 24);
        this.g = i2 + 4;
        this.h += 4;
    }

    public final void H(long j) {
        int i = this.g;
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
        this.h += 8;
    }

    public final void I(int i) {
        boolean z;
        z = zzgxx.c;
        if (z) {
            long j = this.g;
            while ((i & (-128)) != 0) {
                byte[] bArr = this.e;
                int i2 = this.g;
                this.g = i2 + 1;
                zzhbp.y(bArr, i2, (byte) (i | 128));
                i >>>= 7;
            }
            byte[] bArr2 = this.e;
            int i3 = this.g;
            this.g = i3 + 1;
            zzhbp.y(bArr2, i3, (byte) i);
            this.h += (int) (this.g - j);
            return;
        }
        while ((i & (-128)) != 0) {
            byte[] bArr3 = this.e;
            int i4 = this.g;
            this.g = i4 + 1;
            bArr3[i4] = (byte) (i | 128);
            this.h++;
            i >>>= 7;
        }
        byte[] bArr4 = this.e;
        int i5 = this.g;
        this.g = i5 + 1;
        bArr4[i5] = (byte) i;
        this.h++;
    }

    public final void J(long j) {
        boolean z;
        z = zzgxx.c;
        if (z) {
            long j2 = this.g;
            while (true) {
                int i = (int) j;
                if ((j & (-128)) == 0) {
                    byte[] bArr = this.e;
                    int i2 = this.g;
                    this.g = i2 + 1;
                    zzhbp.y(bArr, i2, (byte) i);
                    this.h += (int) (this.g - j2);
                    return;
                }
                byte[] bArr2 = this.e;
                int i3 = this.g;
                this.g = i3 + 1;
                zzhbp.y(bArr2, i3, (byte) (i | 128));
                j >>>= 7;
            }
        } else {
            while (true) {
                int i4 = (int) j;
                if ((j & (-128)) == 0) {
                    byte[] bArr3 = this.e;
                    int i5 = this.g;
                    this.g = i5 + 1;
                    bArr3[i5] = (byte) i4;
                    this.h++;
                    return;
                }
                byte[] bArr4 = this.e;
                int i6 = this.g;
                this.g = i6 + 1;
                bArr4[i6] = (byte) (i4 | 128);
                this.h++;
                j >>>= 7;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgxx
    public final int n() {
        throw new UnsupportedOperationException("spaceLeft() can only be called on CodedOutputStreams that are writing to a flat array or ByteBuffer.");
    }
}
