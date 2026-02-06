package com.google.android.gms.internal.ads;

import java.math.RoundingMode;
import java.util.Arrays;

/* loaded from: classes2.dex */
final class zzgak {
    public final String a;
    public final char[] b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final byte[] g;
    public final boolean[] h;
    public final boolean i;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zzgak(String str, char[] cArr) {
        this(str, cArr, r1, false);
        byte[] bArr = new byte[128];
        Arrays.fill(bArr, (byte) -1);
        for (int i = 0; i < cArr.length; i++) {
            char c = cArr[i];
            boolean z = true;
            zzfvc.g(c < 128, "Non-ASCII character: %s", c);
            if (bArr[c] != -1) {
                z = false;
            }
            zzfvc.g(z, "Duplicate character: %s", c);
            bArr[c] = (byte) i;
        }
    }

    public final char a(int i) {
        return this.b[i];
    }

    public final int b(char c) throws zzgan {
        if (c <= 127) {
            byte b = this.g[c];
            if (b == -1) {
                if (c > ' ' && c != 127) {
                    throw new zzgan("Unrecognized character: " + c);
                }
                throw new zzgan("Unrecognized character: 0x".concat(String.valueOf(Integer.toHexString(c))));
            }
            return b;
        }
        throw new zzgan("Unrecognized character: 0x".concat(String.valueOf(Integer.toHexString(c))));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v11 */
    public final zzgak c() {
        boolean z;
        int i = 0;
        while (true) {
            char[] cArr = this.b;
            int length = cArr.length;
            if (i < length) {
                if (zzfui.e(cArr[i])) {
                    int i2 = 0;
                    while (true) {
                        if (i2 < length) {
                            if (zzfui.d(cArr[i2])) {
                                z = true;
                                break;
                            }
                            i2++;
                        } else {
                            z = false;
                            break;
                        }
                    }
                    zzfvc.m(!z, "Cannot call lowerCase() on a mixed-case alphabet");
                    char[] cArr2 = new char[cArr.length];
                    for (int i3 = 0; i3 < cArr.length; i3++) {
                        char c = cArr[i3];
                        if (zzfui.e(c)) {
                            c ^= 32;
                        }
                        cArr2[i3] = (char) c;
                    }
                    zzgak zzgakVar = new zzgak(this.a.concat(".lowerCase()"), cArr2);
                    if (this.i && !zzgakVar.i) {
                        byte[] bArr = zzgakVar.g;
                        byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
                        for (int i4 = 65; i4 <= 90; i4++) {
                            int i5 = i4 | 32;
                            byte b = bArr[i4];
                            byte b2 = bArr[i5];
                            if (b == -1) {
                                copyOf[i4] = b2;
                            } else {
                                char c2 = (char) i4;
                                char c3 = (char) i5;
                                if (b2 == -1) {
                                    copyOf[i5] = b;
                                } else {
                                    throw new IllegalStateException(zzfvt.b("Can't ignoreCase() since '%s' and '%s' encode different values", Character.valueOf(c2), Character.valueOf(c3)));
                                }
                            }
                        }
                        return new zzgak(zzgakVar.a.concat(".ignoreCase()"), zzgakVar.b, copyOf, true);
                    }
                    return zzgakVar;
                }
                i++;
            } else {
                return this;
            }
        }
    }

    public final boolean d(int i) {
        return this.h[i % this.e];
    }

    public final boolean e(char c) {
        byte[] bArr = this.g;
        if (bArr.length > 61 && bArr[61] != -1) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzgak) {
            zzgak zzgakVar = (zzgak) obj;
            if (this.i == zzgakVar.i && Arrays.equals(this.b, zzgakVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        boolean z = this.i;
        int hashCode = Arrays.hashCode(this.b);
        if (true != z) {
            i = 1237;
        } else {
            i = 1231;
        }
        return hashCode + i;
    }

    public final String toString() {
        return this.a;
    }

    public zzgak(String str, char[] cArr, byte[] bArr, boolean z) {
        this.a = str;
        cArr.getClass();
        this.b = cArr;
        try {
            int length = cArr.length;
            int c = zzgay.c(length, RoundingMode.UNNECESSARY);
            this.d = c;
            int numberOfTrailingZeros = Integer.numberOfTrailingZeros(c);
            int i = 1 << (3 - numberOfTrailingZeros);
            this.e = i;
            this.f = c >> numberOfTrailingZeros;
            this.c = length - 1;
            this.g = bArr;
            boolean[] zArr = new boolean[i];
            for (int i2 = 0; i2 < this.f; i2++) {
                zArr[zzgay.b(i2 * 8, this.d, RoundingMode.CEILING)] = true;
            }
            this.h = zArr;
            this.i = z;
        } catch (ArithmeticException e) {
            int length2 = cArr.length;
            throw new IllegalArgumentException("Illegal alphabet length " + length2, e);
        }
    }
}
