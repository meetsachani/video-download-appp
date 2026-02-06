package o;

import org.jetbrains.annotations.NotNull;

@InterfaceC7542kW0
@InterfaceC6480g82(version = "1.5")
@InterfaceC10924yJ2(markerClass = {InterfaceC5880dj0.class})
/* loaded from: classes3.dex */
public final class Vw2 implements Comparable<Vw2> {
    @NotNull
    public static final a Y = new a(null);
    public static final byte Y0 = -1;
    public static final byte Z = 0;
    public static final int Z0 = 1;
    public static final int a1 = 8;
    public final byte X;

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
    public /* synthetic */ Vw2(byte b) {
        this.X = b;
    }

    public static int A(byte b) {
        return Byte.hashCode(b);
    }

    @XP0
    public static final byte B(byte b) {
        return n((byte) (b + 1));
    }

    @XP0
    public static final byte C(byte b) {
        return n((byte) (~b));
    }

    @XP0
    public static final int D(byte b, byte b2) {
        return C7162ix2.n(C7162ix2.n(b & 255) - C7162ix2.n(b2 & 255));
    }

    @XP0
    public static final long E(byte b, long j) {
        return C9860tx2.n(C9860tx2.n(b & 255) - j);
    }

    @XP0
    public static final int F(byte b, int i) {
        return C7162ix2.n(C7162ix2.n(b & 255) - i);
    }

    @XP0
    public static final int G(byte b, short s) {
        return C7162ix2.n(C7162ix2.n(b & 255) - C7162ix2.n(s & Xx2.Y0));
    }

    @XP0
    public static final byte H(byte b, byte b2) {
        return n((byte) Rw2.a(C7162ix2.n(b & 255), C7162ix2.n(b2 & 255)));
    }

    @XP0
    public static final long I(byte b, long j) {
        return Sw2.a(C9860tx2.n(b & 255), j);
    }

    @XP0
    public static final int J(byte b, int i) {
        return Rw2.a(C7162ix2.n(b & 255), i);
    }

    @XP0
    public static final short K(byte b, short s) {
        return Xx2.n((short) Rw2.a(C7162ix2.n(b & 255), C7162ix2.n(s & Xx2.Y0)));
    }

    @XP0
    public static final byte L(byte b, byte b2) {
        return n((byte) (b | b2));
    }

    @XP0
    public static final int M(byte b, byte b2) {
        return C7162ix2.n(C7162ix2.n(b & 255) + C7162ix2.n(b2 & 255));
    }

    @XP0
    public static final long N(byte b, long j) {
        return C9860tx2.n(C9860tx2.n(b & 255) + j);
    }

    @XP0
    public static final int O(byte b, int i) {
        return C7162ix2.n(C7162ix2.n(b & 255) + i);
    }

    @XP0
    public static final int P(byte b, short s) {
        return C7162ix2.n(C7162ix2.n(b & 255) + C7162ix2.n(s & Xx2.Y0));
    }

    @XP0
    public static final C9617sx2 Q(byte b, byte b2) {
        return new C9617sx2(C7162ix2.n(b & 255), C7162ix2.n(b2 & 255), null);
    }

    @XP0
    @InterfaceC6480g82(version = "1.9")
    @InterfaceC10924yJ2(markerClass = {InterfaceC4912Zi0.class})
    public static final C9617sx2 R(byte b, byte b2) {
        return Ux2.V(C7162ix2.n(b & 255), C7162ix2.n(b2 & 255));
    }

    @XP0
    public static final int S(byte b, byte b2) {
        return Rw2.a(C7162ix2.n(b & 255), C7162ix2.n(b2 & 255));
    }

    @XP0
    public static final long T(byte b, long j) {
        return Sw2.a(C9860tx2.n(b & 255), j);
    }

    @XP0
    public static final int U(byte b, int i) {
        return Rw2.a(C7162ix2.n(b & 255), i);
    }

    @XP0
    public static final int V(byte b, short s) {
        return Rw2.a(C7162ix2.n(b & 255), C7162ix2.n(s & Xx2.Y0));
    }

    @XP0
    public static final int W(byte b, byte b2) {
        return C7162ix2.n(C7162ix2.n(b & 255) * C7162ix2.n(b2 & 255));
    }

    @XP0
    public static final long X(byte b, long j) {
        return C9860tx2.n(C9860tx2.n(b & 255) * j);
    }

    @XP0
    public static final int Y(byte b, int i) {
        return C7162ix2.n(C7162ix2.n(b & 255) * i);
    }

    @XP0
    public static final int Z(byte b, short s) {
        return C7162ix2.n(C7162ix2.n(b & 255) * C7162ix2.n(s & Xx2.Y0));
    }

    @XP0
    public static final double c0(byte b) {
        return ZB2.h(b & 255);
    }

    @XP0
    public static final float d0(byte b) {
        return (float) ZB2.h(b & 255);
    }

    @XP0
    public static final byte e(byte b, byte b2) {
        return n((byte) (b & b2));
    }

    @XP0
    public static final int e0(byte b) {
        return b & 255;
    }

    @XP0
    public static final long f0(byte b) {
        return b & 255;
    }

    public static final /* synthetic */ Vw2 g(byte b) {
        return new Vw2(b);
    }

    @XP0
    public static final short g0(byte b) {
        return (short) (b & 255);
    }

    @NotNull
    public static String h0(byte b) {
        return String.valueOf(b & 255);
    }

    @XP0
    public static int i(byte b, byte b2) {
        return C6562gT0.t(b & 255, b2 & 255);
    }

    @XP0
    public static final int j(byte b, long j) {
        int compare;
        compare = Long.compare(C9860tx2.n(b & 255) ^ Long.MIN_VALUE, j ^ Long.MIN_VALUE);
        return compare;
    }

    @XP0
    public static final int j0(byte b) {
        return C7162ix2.n(b & 255);
    }

    @XP0
    public static final long k0(byte b) {
        return C9860tx2.n(b & 255);
    }

    @XP0
    public static final int l(byte b, int i) {
        int compare;
        compare = Integer.compare(C7162ix2.n(b & 255) ^ Integer.MIN_VALUE, i ^ Integer.MIN_VALUE);
        return compare;
    }

    @XP0
    public static final short l0(byte b) {
        return Xx2.n((short) (b & 255));
    }

    @XP0
    public static final int m(byte b, short s) {
        return C6562gT0.t(b & 255, s & Xx2.Y0);
    }

    @XP0
    public static final byte o(byte b) {
        return n((byte) (b - 1));
    }

    @XP0
    public static final byte o0(byte b, byte b2) {
        return n((byte) (b ^ b2));
    }

    @XP0
    public static final int p(byte b, byte b2) {
        return Qw2.a(C7162ix2.n(b & 255), C7162ix2.n(b2 & 255));
    }

    @XP0
    public static final long q(byte b, long j) {
        return Tw2.a(C9860tx2.n(b & 255), j);
    }

    @XP0
    public static final int r(byte b, int i) {
        return Qw2.a(C7162ix2.n(b & 255), i);
    }

    @XP0
    public static final int s(byte b, short s) {
        return Qw2.a(C7162ix2.n(b & 255), C7162ix2.n(s & Xx2.Y0));
    }

    public static boolean t(byte b, Object obj) {
        if (!(obj instanceof Vw2) || b != ((Vw2) obj).n0()) {
            return false;
        }
        return true;
    }

    public static final boolean u(byte b, byte b2) {
        if (b == b2) {
            return true;
        }
        return false;
    }

    @XP0
    public static final int v(byte b, byte b2) {
        return Qw2.a(C7162ix2.n(b & 255), C7162ix2.n(b2 & 255));
    }

    @XP0
    public static final long w(byte b, long j) {
        return Tw2.a(C9860tx2.n(b & 255), j);
    }

    @XP0
    public static final int x(byte b, int i) {
        return Qw2.a(C7162ix2.n(b & 255), i);
    }

    @XP0
    public static final int y(byte b, short s) {
        return Qw2.a(C7162ix2.n(b & 255), C7162ix2.n(s & Xx2.Y0));
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Vw2 vw2) {
        return C6562gT0.t(n0() & 255, vw2.n0() & 255);
    }

    public boolean equals(Object obj) {
        return t(this.X, obj);
    }

    @XP0
    public final int h(byte b) {
        return C6562gT0.t(n0() & 255, b & 255);
    }

    public int hashCode() {
        return A(this.X);
    }

    public final /* synthetic */ byte n0() {
        return this.X;
    }

    @NotNull
    public String toString() {
        return h0(this.X);
    }

    @HK1
    public static /* synthetic */ void z() {
    }

    @XP0
    public static final byte b0(byte b) {
        return b;
    }

    @XP0
    public static final byte i0(byte b) {
        return b;
    }

    @InterfaceC6307fT0
    @HK1
    public static byte n(byte b) {
        return b;
    }
}
