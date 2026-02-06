package o;

import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public class AH extends C11156zH {
    @XP0
    @InterfaceC6480g82(version = "1.1")
    public static final byte I(byte b, byte b2) {
        return (byte) Math.max((int) b, (int) b2);
    }

    @XP0
    @InterfaceC6480g82(version = "1.1")
    public static final byte J(byte b, byte b2, byte b3) {
        return (byte) Math.max((int) b, Math.max((int) b2, (int) b3));
    }

    @InterfaceC6480g82(version = "1.4")
    public static final byte K(byte b, @NotNull byte... bArr) {
        C6562gT0.p(bArr, "other");
        for (byte b2 : bArr) {
            b = (byte) Math.max((int) b, (int) b2);
        }
        return b;
    }

    @XP0
    @InterfaceC6480g82(version = "1.1")
    public static final double L(double d, double d2) {
        return Math.max(d, d2);
    }

    @XP0
    @InterfaceC6480g82(version = "1.1")
    public static final double M(double d, double d2, double d3) {
        return Math.max(d, Math.max(d2, d3));
    }

    @InterfaceC6480g82(version = "1.4")
    public static final double N(double d, @NotNull double... dArr) {
        C6562gT0.p(dArr, "other");
        for (double d2 : dArr) {
            d = Math.max(d, d2);
        }
        return d;
    }

    @XP0
    @InterfaceC6480g82(version = "1.1")
    public static final float O(float f, float f2) {
        return Math.max(f, f2);
    }

    @XP0
    @InterfaceC6480g82(version = "1.1")
    public static final float P(float f, float f2, float f3) {
        return Math.max(f, Math.max(f2, f3));
    }

    @InterfaceC6480g82(version = "1.4")
    public static final float Q(float f, @NotNull float... fArr) {
        C6562gT0.p(fArr, "other");
        for (float f2 : fArr) {
            f = Math.max(f, f2);
        }
        return f;
    }

    @XP0
    @InterfaceC6480g82(version = "1.1")
    public static final int R(int i, int i2) {
        return Math.max(i, i2);
    }

    @XP0
    @InterfaceC6480g82(version = "1.1")
    public static final int S(int i, int i2, int i3) {
        return Math.max(i, Math.max(i2, i3));
    }

    @InterfaceC6480g82(version = "1.4")
    public static final int T(int i, @NotNull int... iArr) {
        C6562gT0.p(iArr, "other");
        for (int i2 : iArr) {
            i = Math.max(i, i2);
        }
        return i;
    }

    @XP0
    @InterfaceC6480g82(version = "1.1")
    public static final long U(long j, long j2) {
        return Math.max(j, j2);
    }

    @XP0
    @InterfaceC6480g82(version = "1.1")
    public static final long V(long j, long j2, long j3) {
        return Math.max(j, Math.max(j2, j3));
    }

    @InterfaceC6480g82(version = "1.4")
    public static final long W(long j, @NotNull long... jArr) {
        C6562gT0.p(jArr, "other");
        for (long j2 : jArr) {
            j = Math.max(j, j2);
        }
        return j;
    }

    @InterfaceC6480g82(version = "1.1")
    @NotNull
    public static <T extends Comparable<? super T>> T X(@NotNull T t, @NotNull T t2) {
        C6562gT0.p(t, "a");
        C6562gT0.p(t2, "b");
        if (t.compareTo(t2) >= 0) {
            return t;
        }
        return t2;
    }

    @InterfaceC6480g82(version = "1.1")
    @NotNull
    public static final <T extends Comparable<? super T>> T Y(@NotNull T t, @NotNull T t2, @NotNull T t3) {
        C6562gT0.p(t, "a");
        C6562gT0.p(t2, "b");
        C6562gT0.p(t3, "c");
        return (T) X(t, X(t2, t3));
    }

    @InterfaceC6480g82(version = "1.4")
    @NotNull
    public static final <T extends Comparable<? super T>> T Z(@NotNull T t, @NotNull T... tArr) {
        C6562gT0.p(t, "a");
        C6562gT0.p(tArr, "other");
        for (T t2 : tArr) {
            t = (T) X(t, t2);
        }
        return t;
    }

    @XP0
    @InterfaceC6480g82(version = "1.1")
    public static final short a0(short s, short s2) {
        return (short) Math.max((int) s, (int) s2);
    }

    @XP0
    @InterfaceC6480g82(version = "1.1")
    public static final short b0(short s, short s2, short s3) {
        return (short) Math.max((int) s, Math.max((int) s2, (int) s3));
    }

    @InterfaceC6480g82(version = "1.4")
    public static final short c0(short s, @NotNull short... sArr) {
        C6562gT0.p(sArr, "other");
        for (short s2 : sArr) {
            s = (short) Math.max((int) s, (int) s2);
        }
        return s;
    }

    @XP0
    @InterfaceC6480g82(version = "1.1")
    public static final byte d0(byte b, byte b2) {
        return (byte) Math.min((int) b, (int) b2);
    }

    @XP0
    @InterfaceC6480g82(version = "1.1")
    public static final byte e0(byte b, byte b2, byte b3) {
        return (byte) Math.min((int) b, Math.min((int) b2, (int) b3));
    }

    @InterfaceC6480g82(version = "1.4")
    public static final byte f0(byte b, @NotNull byte... bArr) {
        C6562gT0.p(bArr, "other");
        for (byte b2 : bArr) {
            b = (byte) Math.min((int) b, (int) b2);
        }
        return b;
    }

    @XP0
    @InterfaceC6480g82(version = "1.1")
    public static final double g0(double d, double d2) {
        return Math.min(d, d2);
    }

    @XP0
    @InterfaceC6480g82(version = "1.1")
    public static final double h0(double d, double d2, double d3) {
        return Math.min(d, Math.min(d2, d3));
    }

    @InterfaceC6480g82(version = "1.4")
    public static final double i0(double d, @NotNull double... dArr) {
        C6562gT0.p(dArr, "other");
        for (double d2 : dArr) {
            d = Math.min(d, d2);
        }
        return d;
    }

    @XP0
    @InterfaceC6480g82(version = "1.1")
    public static final float j0(float f, float f2) {
        return Math.min(f, f2);
    }

    @XP0
    @InterfaceC6480g82(version = "1.1")
    public static final float k0(float f, float f2, float f3) {
        return Math.min(f, Math.min(f2, f3));
    }

    @InterfaceC6480g82(version = "1.4")
    public static final float l0(float f, @NotNull float... fArr) {
        C6562gT0.p(fArr, "other");
        for (float f2 : fArr) {
            f = Math.min(f, f2);
        }
        return f;
    }

    @XP0
    @InterfaceC6480g82(version = "1.1")
    public static final int m0(int i, int i2) {
        return Math.min(i, i2);
    }

    @XP0
    @InterfaceC6480g82(version = "1.1")
    public static final int n0(int i, int i2, int i3) {
        return Math.min(i, Math.min(i2, i3));
    }

    @InterfaceC6480g82(version = "1.4")
    public static final int o0(int i, @NotNull int... iArr) {
        C6562gT0.p(iArr, "other");
        for (int i2 : iArr) {
            i = Math.min(i, i2);
        }
        return i;
    }

    @XP0
    @InterfaceC6480g82(version = "1.1")
    public static final long p0(long j, long j2) {
        return Math.min(j, j2);
    }

    @XP0
    @InterfaceC6480g82(version = "1.1")
    public static final long q0(long j, long j2, long j3) {
        return Math.min(j, Math.min(j2, j3));
    }

    @InterfaceC6480g82(version = "1.4")
    public static final long r0(long j, @NotNull long... jArr) {
        C6562gT0.p(jArr, "other");
        for (long j2 : jArr) {
            j = Math.min(j, j2);
        }
        return j;
    }

    @InterfaceC6480g82(version = "1.1")
    @NotNull
    public static final <T extends Comparable<? super T>> T s0(@NotNull T t, @NotNull T t2) {
        C6562gT0.p(t, "a");
        C6562gT0.p(t2, "b");
        if (t.compareTo(t2) <= 0) {
            return t;
        }
        return t2;
    }

    @InterfaceC6480g82(version = "1.1")
    @NotNull
    public static final <T extends Comparable<? super T>> T t0(@NotNull T t, @NotNull T t2, @NotNull T t3) {
        C6562gT0.p(t, "a");
        C6562gT0.p(t2, "b");
        C6562gT0.p(t3, "c");
        return (T) s0(t, s0(t2, t3));
    }

    @InterfaceC6480g82(version = "1.4")
    @NotNull
    public static final <T extends Comparable<? super T>> T u0(@NotNull T t, @NotNull T... tArr) {
        C6562gT0.p(t, "a");
        C6562gT0.p(tArr, "other");
        for (T t2 : tArr) {
            t = (T) s0(t, t2);
        }
        return t;
    }

    @XP0
    @InterfaceC6480g82(version = "1.1")
    public static final short v0(short s, short s2) {
        return (short) Math.min((int) s, (int) s2);
    }

    @XP0
    @InterfaceC6480g82(version = "1.1")
    public static final short w0(short s, short s2, short s3) {
        return (short) Math.min((int) s, Math.min((int) s2, (int) s3));
    }

    @InterfaceC6480g82(version = "1.4")
    public static final short x0(short s, @NotNull short... sArr) {
        C6562gT0.p(sArr, "other");
        for (short s2 : sArr) {
            s = (short) Math.min((int) s, (int) s2);
        }
        return s;
    }
}
