package o;

import org.jetbrains.annotations.NotNull;

/* renamed from: o.cx2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C5695cx2 {
    @InterfaceC6480g82(version = "1.5")
    @InterfaceC10924yJ2(markerClass = {InterfaceC5880dj0.class})
    public static final short a(short s, short s2) {
        if (C6562gT0.t(s & Xx2.Y0, 65535 & s2) >= 0) {
            return s;
        }
        return s2;
    }

    @InterfaceC6480g82(version = "1.5")
    @InterfaceC10924yJ2(markerClass = {InterfaceC5880dj0.class})
    public static int b(int i, int i2) {
        int compare;
        compare = Integer.compare(i ^ Integer.MIN_VALUE, i2 ^ Integer.MIN_VALUE);
        if (compare >= 0) {
            return i;
        }
        return i2;
    }

    @InterfaceC6480g82(version = "1.5")
    @InterfaceC10924yJ2(markerClass = {InterfaceC5880dj0.class})
    public static final byte c(byte b, byte b2) {
        if (C6562gT0.t(b & 255, b2 & 255) >= 0) {
            return b;
        }
        return b2;
    }

    @InterfaceC5880dj0
    @InterfaceC6480g82(version = "1.4")
    public static final int d(int i, @NotNull int... iArr) {
        C6562gT0.p(iArr, "other");
        int B = C8395nx2.B(iArr);
        for (int i2 = 0; i2 < B; i2++) {
            i = b(i, C8395nx2.r(iArr, i2));
        }
        return i;
    }

    @InterfaceC5880dj0
    @InterfaceC6480g82(version = "1.4")
    public static final long e(long j, @NotNull long... jArr) {
        C6562gT0.p(jArr, "other");
        int B = C10103ux2.B(jArr);
        for (int i = 0; i < B; i++) {
            j = j(j, C10103ux2.r(jArr, i));
        }
        return j;
    }

    @XP0
    @InterfaceC6480g82(version = "1.5")
    @InterfaceC10924yJ2(markerClass = {InterfaceC5880dj0.class})
    public static final short f(short s, short s2, short s3) {
        return a(s, a(s2, s3));
    }

    @XP0
    @InterfaceC6480g82(version = "1.5")
    @InterfaceC10924yJ2(markerClass = {InterfaceC5880dj0.class})
    public static final int g(int i, int i2, int i3) {
        return b(i, b(i2, i3));
    }

    @InterfaceC5880dj0
    @InterfaceC6480g82(version = "1.4")
    public static final byte h(byte b, @NotNull byte... bArr) {
        C6562gT0.p(bArr, "other");
        int B = Ww2.B(bArr);
        for (int i = 0; i < B; i++) {
            b = c(b, Ww2.r(bArr, i));
        }
        return b;
    }

    @XP0
    @InterfaceC6480g82(version = "1.5")
    @InterfaceC10924yJ2(markerClass = {InterfaceC5880dj0.class})
    public static final byte i(byte b, byte b2, byte b3) {
        return c(b, c(b2, b3));
    }

    @InterfaceC6480g82(version = "1.5")
    @InterfaceC10924yJ2(markerClass = {InterfaceC5880dj0.class})
    public static long j(long j, long j2) {
        int compare;
        compare = Long.compare(j ^ Long.MIN_VALUE, j2 ^ Long.MIN_VALUE);
        if (compare >= 0) {
            return j;
        }
        return j2;
    }

    @XP0
    @InterfaceC6480g82(version = "1.5")
    @InterfaceC10924yJ2(markerClass = {InterfaceC5880dj0.class})
    public static final long k(long j, long j2, long j3) {
        return j(j, j(j2, j3));
    }

    @InterfaceC5880dj0
    @InterfaceC6480g82(version = "1.4")
    public static final short l(short s, @NotNull short... sArr) {
        C6562gT0.p(sArr, "other");
        int B = Yx2.B(sArr);
        for (int i = 0; i < B; i++) {
            s = a(s, Yx2.r(sArr, i));
        }
        return s;
    }

    @InterfaceC6480g82(version = "1.5")
    @InterfaceC10924yJ2(markerClass = {InterfaceC5880dj0.class})
    public static final short m(short s, short s2) {
        if (C6562gT0.t(s & Xx2.Y0, 65535 & s2) <= 0) {
            return s;
        }
        return s2;
    }

    @InterfaceC6480g82(version = "1.5")
    @InterfaceC10924yJ2(markerClass = {InterfaceC5880dj0.class})
    public static int n(int i, int i2) {
        int compare;
        compare = Integer.compare(i ^ Integer.MIN_VALUE, i2 ^ Integer.MIN_VALUE);
        if (compare <= 0) {
            return i;
        }
        return i2;
    }

    @InterfaceC6480g82(version = "1.5")
    @InterfaceC10924yJ2(markerClass = {InterfaceC5880dj0.class})
    public static final byte o(byte b, byte b2) {
        if (C6562gT0.t(b & 255, b2 & 255) <= 0) {
            return b;
        }
        return b2;
    }

    @InterfaceC5880dj0
    @InterfaceC6480g82(version = "1.4")
    public static final int p(int i, @NotNull int... iArr) {
        C6562gT0.p(iArr, "other");
        int B = C8395nx2.B(iArr);
        for (int i2 = 0; i2 < B; i2++) {
            i = n(i, C8395nx2.r(iArr, i2));
        }
        return i;
    }

    @InterfaceC5880dj0
    @InterfaceC6480g82(version = "1.4")
    public static final long q(long j, @NotNull long... jArr) {
        C6562gT0.p(jArr, "other");
        int B = C10103ux2.B(jArr);
        for (int i = 0; i < B; i++) {
            j = v(j, C10103ux2.r(jArr, i));
        }
        return j;
    }

    @XP0
    @InterfaceC6480g82(version = "1.5")
    @InterfaceC10924yJ2(markerClass = {InterfaceC5880dj0.class})
    public static final short r(short s, short s2, short s3) {
        return m(s, m(s2, s3));
    }

    @XP0
    @InterfaceC6480g82(version = "1.5")
    @InterfaceC10924yJ2(markerClass = {InterfaceC5880dj0.class})
    public static final int s(int i, int i2, int i3) {
        return n(i, n(i2, i3));
    }

    @InterfaceC5880dj0
    @InterfaceC6480g82(version = "1.4")
    public static final byte t(byte b, @NotNull byte... bArr) {
        C6562gT0.p(bArr, "other");
        int B = Ww2.B(bArr);
        for (int i = 0; i < B; i++) {
            b = o(b, Ww2.r(bArr, i));
        }
        return b;
    }

    @XP0
    @InterfaceC6480g82(version = "1.5")
    @InterfaceC10924yJ2(markerClass = {InterfaceC5880dj0.class})
    public static final byte u(byte b, byte b2, byte b3) {
        return o(b, o(b2, b3));
    }

    @InterfaceC6480g82(version = "1.5")
    @InterfaceC10924yJ2(markerClass = {InterfaceC5880dj0.class})
    public static long v(long j, long j2) {
        int compare;
        compare = Long.compare(j ^ Long.MIN_VALUE, j2 ^ Long.MIN_VALUE);
        if (compare <= 0) {
            return j;
        }
        return j2;
    }

    @XP0
    @InterfaceC6480g82(version = "1.5")
    @InterfaceC10924yJ2(markerClass = {InterfaceC5880dj0.class})
    public static final long w(long j, long j2, long j3) {
        return v(j, v(j2, j3));
    }

    @InterfaceC5880dj0
    @InterfaceC6480g82(version = "1.4")
    public static final short x(short s, @NotNull short... sArr) {
        C6562gT0.p(sArr, "other");
        int B = Yx2.B(sArr);
        for (int i = 0; i < B; i++) {
            s = m(s, Yx2.r(sArr, i));
        }
        return s;
    }
}
