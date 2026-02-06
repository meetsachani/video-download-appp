package com.google.android.gms.internal.ads;

import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class zzgxi extends OutputStream {
    public static final byte[] a1 = new byte[0];
    public final int X = 128;
    public final ArrayList Y = new ArrayList();
    public byte[] Y0 = new byte[128];
    public int Z;
    public int Z0;

    public zzgxi(int i) {
    }

    public final synchronized int a() {
        return this.Z + this.Z0;
    }

    public final synchronized zzgxk d() {
        try {
            int i = this.Z0;
            byte[] bArr = this.Y0;
            if (i < bArr.length) {
                if (i > 0) {
                    this.Y.add(new zzgxh(Arrays.copyOf(bArr, i)));
                }
            } else {
                this.Y.add(new zzgxh(this.Y0));
                this.Y0 = a1;
            }
            this.Z += this.Z0;
            this.Z0 = 0;
        } catch (Throwable th) {
            throw th;
        }
        return zzgxk.Q(this.Y);
    }

    public final void f(int i) {
        this.Y.add(new zzgxh(this.Y0));
        int length = this.Z + this.Y0.length;
        this.Z = length;
        this.Y0 = new byte[Math.max(this.X, Math.max(i, length >>> 1))];
        this.Z0 = 0;
    }

    public final String toString() {
        return String.format("<ByteString.Output@%s size=%d>", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(a()));
    }

    @Override // java.io.OutputStream
    public final synchronized void write(int i) {
        try {
            if (this.Z0 == this.Y0.length) {
                f(1);
            }
            byte[] bArr = this.Y0;
            int i2 = this.Z0;
            this.Z0 = i2 + 1;
            bArr[i2] = (byte) i;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // java.io.OutputStream
    public final synchronized void write(byte[] bArr, int i, int i2) {
        byte[] bArr2 = this.Y0;
        int length = bArr2.length;
        int i3 = this.Z0;
        int i4 = length - i3;
        if (i2 <= i4) {
            System.arraycopy(bArr, i, bArr2, i3, i2);
            this.Z0 += i2;
            return;
        }
        System.arraycopy(bArr, i, bArr2, i3, i4);
        int i5 = i2 - i4;
        f(i5);
        System.arraycopy(bArr, i + i4, this.Y0, 0, i5);
        this.Z0 = i5;
    }
}
