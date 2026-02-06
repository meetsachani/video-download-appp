package o;

import org.jetbrains.annotations.NotNull;

@InterfaceC7542kW0
@InterfaceC6480g82(version = "1.5")
@InterfaceC10924yJ2(markerClass = {InterfaceC5880dj0.class})
/* renamed from: o.ix2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C7162ix2 implements Comparable<C7162ix2> {
    @NotNull
    public static final a Y = new a(null);
    public static final int Y0 = -1;
    public static final int Z = 0;
    public static final int Z0 = 4;
    public static final int a1 = 32;
    public final int X;

    /* renamed from: o.ix2$a */
    /* loaded from: classes3.dex */
    public static final class a {
        public /* synthetic */ a(C9516sY c9516sY) {
            this();
        }

        public a() {
        }
    }

    @InterfaceC6307fT0
    @HK1
    public /* synthetic */ C7162ix2(int i) {
        this.X = i;
    }

    public static int A(int i) {
        return Integer.hashCode(i);
    }

    @XP0
    public static final int B(int i) {
        return n(i + 1);
    }

    @XP0
    public static final int C(int i) {
        return n(~i);
    }

    @XP0
    public static final int D(int i, byte b) {
        return n(i - n(b & 255));
    }

    @XP0
    public static final long E(int i, long j) {
        return C9860tx2.n(C9860tx2.n(i & 4294967295L) - j);
    }

    @XP0
    public static final int F(int i, int i2) {
        return n(i - i2);
    }

    @XP0
    public static final int G(int i, short s) {
        return n(i - n(s & Xx2.Y0));
    }

    @XP0
    public static final byte H(int i, byte b) {
        return Vw2.n((byte) Rw2.a(i, n(b & 255)));
    }

    @XP0
    public static final long I(int i, long j) {
        return Sw2.a(C9860tx2.n(i & 4294967295L), j);
    }

    @XP0
    public static final int J(int i, int i2) {
        return Rw2.a(i, i2);
    }

    @XP0
    public static final short K(int i, short s) {
        return Xx2.n((short) Rw2.a(i, n(s & Xx2.Y0)));
    }

    @XP0
    public static final int L(int i, int i2) {
        return n(i | i2);
    }

    @XP0
    public static final int M(int i, byte b) {
        return n(i + n(b & 255));
    }

    @XP0
    public static final long N(int i, long j) {
        return C9860tx2.n(C9860tx2.n(i & 4294967295L) + j);
    }

    @XP0
    public static final int O(int i, int i2) {
        return n(i + i2);
    }

    @XP0
    public static final int P(int i, short s) {
        return n(i + n(s & Xx2.Y0));
    }

    @XP0
    public static final C9617sx2 Q(int i, int i2) {
        return new C9617sx2(i, i2, null);
    }

    @XP0
    @InterfaceC6480g82(version = "1.9")
    @InterfaceC10924yJ2(markerClass = {InterfaceC4912Zi0.class})
    public static final C9617sx2 R(int i, int i2) {
        return Ux2.V(i, i2);
    }

    @XP0
    public static final int S(int i, byte b) {
        return Rw2.a(i, n(b & 255));
    }

    @XP0
    public static final long T(int i, long j) {
        return Sw2.a(C9860tx2.n(i & 4294967295L), j);
    }

    @XP0
    public static final int U(int i, int i2) {
        return ZB2.g(i, i2);
    }

    @XP0
    public static final int V(int i, short s) {
        return Rw2.a(i, n(s & Xx2.Y0));
    }

    @XP0
    public static final int W(int i, int i2) {
        return n(i << i2);
    }

    @XP0
    public static final int X(int i, int i2) {
        return n(i >>> i2);
    }

    @XP0
    public static final int Y(int i, byte b) {
        return n(i * n(b & 255));
    }

    @XP0
    public static final long Z(int i, long j) {
        return C9860tx2.n(C9860tx2.n(i & 4294967295L) * j);
    }

    @XP0
    public static final int b0(int i, int i2) {
        return n(i * i2);
    }

    @XP0
    public static final int c0(int i, short s) {
        return n(i * n(s & Xx2.Y0));
    }

    @XP0
    public static final byte d0(int i) {
        return (byte) i;
    }

    @XP0
    public static final int e(int i, int i2) {
        return n(i & i2);
    }

    @XP0
    public static final double e0(int i) {
        return ZB2.h(i);
    }

    @XP0
    public static final float f0(int i) {
        return (float) ZB2.h(i);
    }

    public static final /* synthetic */ C7162ix2 g(int i) {
        return new C7162ix2(i);
    }

    @XP0
    public static final int h(int i, byte b) {
        return Uw2.a(i, n(b & 255));
    }

    @XP0
    public static final long h0(int i) {
        return i & 4294967295L;
    }

    @XP0
    public static final int i(int i, long j) {
        int compare;
        compare = Long.compare(C9860tx2.n(i & 4294967295L) ^ Long.MIN_VALUE, j ^ Long.MIN_VALUE);
        return compare;
    }

    @XP0
    public static final short i0(int i) {
        return (short) i;
    }

    @NotNull
    public static String j0(int i) {
        return String.valueOf(i & 4294967295L);
    }

    @XP0
    public static final byte k0(int i) {
        return Vw2.n((byte) i);
    }

    @XP0
    public static int l(int i, int i2) {
        return ZB2.e(i, i2);
    }

    @XP0
    public static final int m(int i, short s) {
        return Uw2.a(i, n(s & Xx2.Y0));
    }

    @XP0
    public static final long n0(int i) {
        return C9860tx2.n(i & 4294967295L);
    }

    @XP0
    public static final int o(int i) {
        return n(i - 1);
    }

    @XP0
    public static final short o0(int i) {
        return Xx2.n((short) i);
    }

    @XP0
    public static final int p(int i, byte b) {
        return Qw2.a(i, n(b & 255));
    }

    @XP0
    public static final long q(int i, long j) {
        return Tw2.a(C9860tx2.n(i & 4294967295L), j);
    }

    @XP0
    public static final int q0(int i, int i2) {
        return n(i ^ i2);
    }

    @XP0
    public static final int r(int i, int i2) {
        return ZB2.f(i, i2);
    }

    @XP0
    public static final int s(int i, short s) {
        return Qw2.a(i, n(s & Xx2.Y0));
    }

    public static boolean t(int i, Object obj) {
        if (!(obj instanceof C7162ix2) || i != ((C7162ix2) obj).p0()) {
            return false;
        }
        return true;
    }

    public static final boolean u(int i, int i2) {
        if (i == i2) {
            return true;
        }
        return false;
    }

    @XP0
    public static final int v(int i, byte b) {
        return Qw2.a(i, n(b & 255));
    }

    @XP0
    public static final long w(int i, long j) {
        return Tw2.a(C9860tx2.n(i & 4294967295L), j);
    }

    @XP0
    public static final int x(int i, int i2) {
        return Qw2.a(i, i2);
    }

    @XP0
    public static final int y(int i, short s) {
        return Qw2.a(i, n(s & Xx2.Y0));
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(C7162ix2 c7162ix2) {
        return ZB2.e(p0(), c7162ix2.p0());
    }

    public boolean equals(Object obj) {
        return t(this.X, obj);
    }

    public int hashCode() {
        return A(this.X);
    }

    @XP0
    public final int j(int i) {
        return ZB2.e(p0(), i);
    }

    public final /* synthetic */ int p0() {
        return this.X;
    }

    @NotNull
    public String toString() {
        return j0(this.X);
    }

    @HK1
    public static /* synthetic */ void z() {
    }

    @XP0
    public static final int g0(int i) {
        return i;
    }

    @XP0
    public static final int l0(int i) {
        return i;
    }

    @InterfaceC6307fT0
    @HK1
    public static int n(int i) {
        return i;
    }
}
