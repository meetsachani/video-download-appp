package o;

import o.C5422bq;
import org.jetbrains.annotations.NotNull;

@InterfaceC8046mW0(name = "-SegmentedByteString")
@InterfaceC8303na2({"SMAP\nUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Util.kt\nokio/-SegmentedByteString\n*L\n1#1,187:1\n68#1:188\n74#1:189\n*S KotlinDebug\n*F\n+ 1 Util.kt\nokio/-SegmentedByteString\n*L\n106#1:188\n107#1:189\n*E\n"})
/* renamed from: o.p  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C8648p {
    @NotNull
    public static final C5422bq.c a = new C5422bq.c();
    public static final int b = -1234567890;

    public static final int a(byte b2, int i) {
        return b2 & i;
    }

    public static final long b(byte b2, long j) {
        return b2 & j;
    }

    public static final long c(int i, long j) {
        return i & j;
    }

    public static final boolean d(@NotNull byte[] bArr, int i, @NotNull byte[] bArr2, int i2, int i3) {
        C6562gT0.p(bArr, "a");
        C6562gT0.p(bArr2, "b");
        for (int i4 = 0; i4 < i3; i4++) {
            if (bArr[i4 + i] != bArr2[i4 + i2]) {
                return false;
            }
        }
        return true;
    }

    public static final void e(long j, long j2, long j3) {
        if ((j2 | j3) >= 0 && j2 <= j && j - j2 >= j3) {
            return;
        }
        throw new ArrayIndexOutOfBoundsException("size=" + j + " offset=" + j2 + " byteCount=" + j3);
    }

    public static final int f() {
        return b;
    }

    @NotNull
    public static final C5422bq.c g() {
        return a;
    }

    public static final int i(int i, int i2) {
        return (i >>> (32 - i2)) | (i << i2);
    }

    public static final long j(int i, long j) {
        return Math.min(i, j);
    }

    public static final long k(long j, int i) {
        return Math.min(j, i);
    }

    public static final int l(@NotNull C8859ps c8859ps, int i) {
        C6562gT0.p(c8859ps, "<this>");
        if (i == b) {
            return c8859ps.g0();
        }
        return i;
    }

    public static final int m(@NotNull byte[] bArr, int i) {
        C6562gT0.p(bArr, "<this>");
        if (i == b) {
            return bArr.length;
        }
        return i;
    }

    @NotNull
    public static final C5422bq.c n(@NotNull C5422bq.c cVar) {
        C6562gT0.p(cVar, "unsafeCursor");
        if (cVar == a) {
            return new C5422bq.c();
        }
        return cVar;
    }

    public static final int o(int i) {
        return ((i & 255) << 24) | (((-16777216) & i) >>> 24) | ((16711680 & i) >>> 8) | ((65280 & i) << 8);
    }

    public static final long p(long j) {
        return ((j & 255) << 56) | (((-72057594037927936L) & j) >>> 56) | ((71776119061217280L & j) >>> 40) | ((280375465082880L & j) >>> 24) | ((1095216660480L & j) >>> 8) | ((4278190080L & j) << 8) | ((16711680 & j) << 24) | ((65280 & j) << 40);
    }

    public static final short q(short s) {
        return (short) (((s & 255) << 8) | ((65280 & s) >>> 8));
    }

    public static final long r(long j, int i) {
        return (j << (64 - i)) | (j >>> i);
    }

    public static final int s(byte b2, int i) {
        return b2 << i;
    }

    public static final int t(byte b2, int i) {
        return b2 >> i;
    }

    @NotNull
    public static final String u(byte b2) {
        return C9545sf2.L1(new char[]{C5461c.J()[(b2 >> 4) & 15], C5461c.J()[b2 & C8077mf.q]});
    }

    @NotNull
    public static final String v(int i) {
        if (i == 0) {
            return "0";
        }
        int i2 = 0;
        char[] cArr = {C5461c.J()[(i >> 28) & 15], C5461c.J()[(i >> 24) & 15], C5461c.J()[(i >> 20) & 15], C5461c.J()[(i >> 16) & 15], C5461c.J()[(i >> 12) & 15], C5461c.J()[(i >> 8) & 15], C5461c.J()[(i >> 4) & 15], C5461c.J()[i & 15]};
        while (i2 < 8 && cArr[i2] == '0') {
            i2++;
        }
        return C9545sf2.M1(cArr, i2, 8);
    }

    @NotNull
    public static final String w(long j) {
        if (j == 0) {
            return "0";
        }
        int i = 0;
        char[] cArr = {C5461c.J()[(int) ((j >> 60) & 15)], C5461c.J()[(int) ((j >> 56) & 15)], C5461c.J()[(int) ((j >> 52) & 15)], C5461c.J()[(int) ((j >> 48) & 15)], C5461c.J()[(int) ((j >> 44) & 15)], C5461c.J()[(int) ((j >> 40) & 15)], C5461c.J()[(int) ((j >> 36) & 15)], C5461c.J()[(int) ((j >> 32) & 15)], C5461c.J()[(int) ((j >> 28) & 15)], C5461c.J()[(int) ((j >> 24) & 15)], C5461c.J()[(int) ((j >> 20) & 15)], C5461c.J()[(int) ((j >> 16) & 15)], C5461c.J()[(int) ((j >> 12) & 15)], C5461c.J()[(int) ((j >> 8) & 15)], C5461c.J()[(int) ((j >> 4) & 15)], C5461c.J()[(int) (j & 15)]};
        while (i < 16 && cArr[i] == '0') {
            i++;
        }
        return C9545sf2.M1(cArr, i, 16);
    }

    public static final byte x(byte b2, byte b3) {
        return (byte) (b2 ^ b3);
    }

    public static /* synthetic */ void h() {
    }
}
