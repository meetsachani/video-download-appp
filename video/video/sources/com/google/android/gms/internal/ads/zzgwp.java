package com.google.android.gms.internal.ads;

import java.util.Arrays;
import o.C10671xH0;
import o.C8077mf;
import o.C9811tl1;

/* loaded from: classes2.dex */
public final class zzgwp {
    public final byte[] a;

    public zzgwp(byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[i2];
        this.a = bArr2;
        System.arraycopy(bArr, 0, bArr2, 0, i2);
    }

    public static zzgwp b(byte[] bArr) {
        if (bArr != null) {
            return c(bArr, 0, bArr.length);
        }
        throw new NullPointerException("data must be non-null");
    }

    public static zzgwp c(byte[] bArr, int i, int i2) {
        if (bArr != null) {
            int length = bArr.length;
            if (i2 > length) {
                i2 = length;
            }
            return new zzgwp(bArr, 0, i2);
        }
        throw new NullPointerException("data must be non-null");
    }

    public final int a() {
        return this.a.length;
    }

    public final byte[] d() {
        byte[] bArr = this.a;
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, length);
        return bArr2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzgwp)) {
            return false;
        }
        return Arrays.equals(((zzgwp) obj).a, this.a);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.a);
    }

    public final String toString() {
        byte[] bArr = this.a;
        int length = bArr.length;
        StringBuilder sb = new StringBuilder(length + length);
        for (byte b : bArr) {
            sb.append(C10671xH0.a.charAt((b & 255) >> 4));
            sb.append(C10671xH0.a.charAt(b & C8077mf.q));
        }
        return "Bytes(" + sb.toString() + C9811tl1.d;
    }
}
