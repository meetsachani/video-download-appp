package o;

import okhttp3.internal.ws.WebSocketProtocol;
import org.jetbrains.annotations.NotNull;

@InterfaceC7542kW0
@InterfaceC6480g82(version = "1.5")
@InterfaceC10924yJ2(markerClass = {InterfaceC5880dj0.class})
/* loaded from: classes3.dex */
public final class Xx2 implements Comparable<Xx2> {
    @NotNull
    public static final a Y = new a(null);
    public static final short Y0 = -1;
    public static final short Z = 0;
    public static final int Z0 = 2;
    public static final int a1 = 16;
    public final short X;

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
    public /* synthetic */ Xx2(short s) {
        this.X = s;
    }

    public static int A(short s) {
        return Short.hashCode(s);
    }

    @XP0
    public static final short B(short s) {
        return n((short) (s + 1));
    }

    @XP0
    public static final short C(short s) {
        return n((short) (~s));
    }

    @XP0
    public static final int D(short s, byte b) {
        return C7162ix2.n(C7162ix2.n(s & Y0) - C7162ix2.n(b & 255));
    }

    @XP0
    public static final long E(short s, long j) {
        return C9860tx2.n(C9860tx2.n(s & WebSocketProtocol.PAYLOAD_SHORT_MAX) - j);
    }

    @XP0
    public static final int F(short s, int i) {
        return C7162ix2.n(C7162ix2.n(s & Y0) - i);
    }

    @XP0
    public static final int G(short s, short s2) {
        return C7162ix2.n(C7162ix2.n(s & Y0) - C7162ix2.n(s2 & Y0));
    }

    @XP0
    public static final byte H(short s, byte b) {
        return Vw2.n((byte) Rw2.a(C7162ix2.n(s & Y0), C7162ix2.n(b & 255)));
    }

    @XP0
    public static final long I(short s, long j) {
        return Sw2.a(C9860tx2.n(s & WebSocketProtocol.PAYLOAD_SHORT_MAX), j);
    }

    @XP0
    public static final int J(short s, int i) {
        return Rw2.a(C7162ix2.n(s & Y0), i);
    }

    @XP0
    public static final short K(short s, short s2) {
        return n((short) Rw2.a(C7162ix2.n(s & Y0), C7162ix2.n(s2 & Y0)));
    }

    @XP0
    public static final short L(short s, short s2) {
        return n((short) (s | s2));
    }

    @XP0
    public static final int M(short s, byte b) {
        return C7162ix2.n(C7162ix2.n(s & Y0) + C7162ix2.n(b & 255));
    }

    @XP0
    public static final long N(short s, long j) {
        return C9860tx2.n(C9860tx2.n(s & WebSocketProtocol.PAYLOAD_SHORT_MAX) + j);
    }

    @XP0
    public static final int O(short s, int i) {
        return C7162ix2.n(C7162ix2.n(s & Y0) + i);
    }

    @XP0
    public static final int P(short s, short s2) {
        return C7162ix2.n(C7162ix2.n(s & Y0) + C7162ix2.n(s2 & Y0));
    }

    @XP0
    public static final C9617sx2 Q(short s, short s2) {
        return new C9617sx2(C7162ix2.n(s & Y0), C7162ix2.n(s2 & Y0), null);
    }

    @XP0
    @InterfaceC6480g82(version = "1.9")
    @InterfaceC10924yJ2(markerClass = {InterfaceC4912Zi0.class})
    public static final C9617sx2 R(short s, short s2) {
        return Ux2.V(C7162ix2.n(s & Y0), C7162ix2.n(s2 & Y0));
    }

    @XP0
    public static final int S(short s, byte b) {
        return Rw2.a(C7162ix2.n(s & Y0), C7162ix2.n(b & 255));
    }

    @XP0
    public static final long T(short s, long j) {
        return Sw2.a(C9860tx2.n(s & WebSocketProtocol.PAYLOAD_SHORT_MAX), j);
    }

    @XP0
    public static final int U(short s, int i) {
        return Rw2.a(C7162ix2.n(s & Y0), i);
    }

    @XP0
    public static final int V(short s, short s2) {
        return Rw2.a(C7162ix2.n(s & Y0), C7162ix2.n(s2 & Y0));
    }

    @XP0
    public static final int W(short s, byte b) {
        return C7162ix2.n(C7162ix2.n(s & Y0) * C7162ix2.n(b & 255));
    }

    @XP0
    public static final long X(short s, long j) {
        return C9860tx2.n(C9860tx2.n(s & WebSocketProtocol.PAYLOAD_SHORT_MAX) * j);
    }

    @XP0
    public static final int Y(short s, int i) {
        return C7162ix2.n(C7162ix2.n(s & Y0) * i);
    }

    @XP0
    public static final int Z(short s, short s2) {
        return C7162ix2.n(C7162ix2.n(s & Y0) * C7162ix2.n(s2 & Y0));
    }

    @XP0
    public static final byte b0(short s) {
        return (byte) s;
    }

    @XP0
    public static final double c0(short s) {
        return ZB2.h(s & Y0);
    }

    @XP0
    public static final float d0(short s) {
        return (float) ZB2.h(s & Y0);
    }

    @XP0
    public static final short e(short s, short s2) {
        return n((short) (s & s2));
    }

    @XP0
    public static final int e0(short s) {
        return s & Y0;
    }

    @XP0
    public static final long f0(short s) {
        return s & WebSocketProtocol.PAYLOAD_SHORT_MAX;
    }

    public static final /* synthetic */ Xx2 g(short s) {
        return new Xx2(s);
    }

    @XP0
    public static final int h(short s, byte b) {
        return C6562gT0.t(s & Y0, b & 255);
    }

    @NotNull
    public static String h0(short s) {
        return String.valueOf(s & Y0);
    }

    @XP0
    public static final int i(short s, long j) {
        int compare;
        compare = Long.compare(C9860tx2.n(s & WebSocketProtocol.PAYLOAD_SHORT_MAX) ^ Long.MIN_VALUE, j ^ Long.MIN_VALUE);
        return compare;
    }

    @XP0
    public static final byte i0(short s) {
        return Vw2.n((byte) s);
    }

    @XP0
    public static final int j(short s, int i) {
        int compare;
        compare = Integer.compare(C7162ix2.n(s & Y0) ^ Integer.MIN_VALUE, i ^ Integer.MIN_VALUE);
        return compare;
    }

    @XP0
    public static final int j0(short s) {
        return C7162ix2.n(s & Y0);
    }

    @XP0
    public static final long k0(short s) {
        return C9860tx2.n(s & WebSocketProtocol.PAYLOAD_SHORT_MAX);
    }

    @XP0
    public static int m(short s, short s2) {
        return C6562gT0.t(s & Y0, s2 & Y0);
    }

    @XP0
    public static final short o(short s) {
        return n((short) (s - 1));
    }

    @XP0
    public static final short o0(short s, short s2) {
        return n((short) (s ^ s2));
    }

    @XP0
    public static final int p(short s, byte b) {
        return Qw2.a(C7162ix2.n(s & Y0), C7162ix2.n(b & 255));
    }

    @XP0
    public static final long q(short s, long j) {
        return Tw2.a(C9860tx2.n(s & WebSocketProtocol.PAYLOAD_SHORT_MAX), j);
    }

    @XP0
    public static final int r(short s, int i) {
        return Qw2.a(C7162ix2.n(s & Y0), i);
    }

    @XP0
    public static final int s(short s, short s2) {
        return Qw2.a(C7162ix2.n(s & Y0), C7162ix2.n(s2 & Y0));
    }

    public static boolean t(short s, Object obj) {
        if (!(obj instanceof Xx2) || s != ((Xx2) obj).n0()) {
            return false;
        }
        return true;
    }

    public static final boolean u(short s, short s2) {
        if (s == s2) {
            return true;
        }
        return false;
    }

    @XP0
    public static final int v(short s, byte b) {
        return Qw2.a(C7162ix2.n(s & Y0), C7162ix2.n(b & 255));
    }

    @XP0
    public static final long w(short s, long j) {
        return Tw2.a(C9860tx2.n(s & WebSocketProtocol.PAYLOAD_SHORT_MAX), j);
    }

    @XP0
    public static final int x(short s, int i) {
        return Qw2.a(C7162ix2.n(s & Y0), i);
    }

    @XP0
    public static final int y(short s, short s2) {
        return Qw2.a(C7162ix2.n(s & Y0), C7162ix2.n(s2 & Y0));
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Xx2 xx2) {
        return C6562gT0.t(n0() & Y0, xx2.n0() & Y0);
    }

    public boolean equals(Object obj) {
        return t(this.X, obj);
    }

    public int hashCode() {
        return A(this.X);
    }

    @XP0
    public final int l(short s) {
        return C6562gT0.t(n0() & Y0, s & Y0);
    }

    public final /* synthetic */ short n0() {
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
    public static final short g0(short s) {
        return s;
    }

    @XP0
    public static final short l0(short s) {
        return s;
    }

    @InterfaceC6307fT0
    @HK1
    public static short n(short s) {
        return s;
    }
}
