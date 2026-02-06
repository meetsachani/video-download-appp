package o;

import okhttp3.internal.ws.WebSocketProtocol;
import org.jetbrains.annotations.NotNull;

@InterfaceC7542kW0
@InterfaceC6480g82(version = "1.5")
@InterfaceC10924yJ2(markerClass = {InterfaceC5880dj0.class})
/* renamed from: o.tx2 */
/* loaded from: classes3.dex */
public final class C9860tx2 implements Comparable<C9860tx2> {
    @NotNull
    public static final a Y = new a(null);
    public static final long Y0 = -1;
    public static final long Z = 0;
    public static final int Z0 = 8;
    public static final int a1 = 64;
    public final long X;

    /* renamed from: o.tx2$a */
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
    public /* synthetic */ C9860tx2(long j) {
        this.X = j;
    }

    public static int A(long j) {
        return Long.hashCode(j);
    }

    @XP0
    public static final long B(long j) {
        return n(j + 1);
    }

    @XP0
    public static final long C(long j) {
        return n(~j);
    }

    @XP0
    public static final long D(long j, byte b) {
        return n(j - n(b & 255));
    }

    @XP0
    public static final long E(long j, long j2) {
        return n(j - j2);
    }

    @XP0
    public static final long F(long j, int i) {
        return n(j - n(i & 4294967295L));
    }

    @XP0
    public static final long G(long j, short s) {
        return n(j - n(s & WebSocketProtocol.PAYLOAD_SHORT_MAX));
    }

    @XP0
    public static final byte H(long j, byte b) {
        return Vw2.n((byte) Sw2.a(j, n(b & 255)));
    }

    @XP0
    public static final long I(long j, long j2) {
        return Sw2.a(j, j2);
    }

    @XP0
    public static final int J(long j, int i) {
        return C7162ix2.n((int) Sw2.a(j, n(i & 4294967295L)));
    }

    @XP0
    public static final short K(long j, short s) {
        return Xx2.n((short) Sw2.a(j, n(s & WebSocketProtocol.PAYLOAD_SHORT_MAX)));
    }

    @XP0
    public static final long L(long j, long j2) {
        return n(j | j2);
    }

    @XP0
    public static final long M(long j, byte b) {
        return n(j + n(b & 255));
    }

    @XP0
    public static final long N(long j, long j2) {
        return n(j + j2);
    }

    @XP0
    public static final long O(long j, int i) {
        return n(j + n(i & 4294967295L));
    }

    @XP0
    public static final long P(long j, short s) {
        return n(j + n(s & WebSocketProtocol.PAYLOAD_SHORT_MAX));
    }

    @XP0
    public static final C11321zx2 Q(long j, long j2) {
        return new C11321zx2(j, j2, null);
    }

    @XP0
    @InterfaceC6480g82(version = "1.9")
    @InterfaceC10924yJ2(markerClass = {InterfaceC4912Zi0.class})
    public static final C11321zx2 R(long j, long j2) {
        return Ux2.X(j, j2);
    }

    @XP0
    public static final long S(long j, byte b) {
        return Sw2.a(j, n(b & 255));
    }

    @XP0
    public static final long T(long j, long j2) {
        return ZB2.p(j, j2);
    }

    @XP0
    public static final long U(long j, int i) {
        return Sw2.a(j, n(i & 4294967295L));
    }

    @XP0
    public static final long V(long j, short s) {
        return Sw2.a(j, n(s & WebSocketProtocol.PAYLOAD_SHORT_MAX));
    }

    @XP0
    public static final long W(long j, int i) {
        return n(j << i);
    }

    @XP0
    public static final long X(long j, int i) {
        return n(j >>> i);
    }

    @XP0
    public static final long Y(long j, byte b) {
        return n(j * n(b & 255));
    }

    @XP0
    public static final long Z(long j, long j2) {
        return n(j * j2);
    }

    @XP0
    public static final long b0(long j, int i) {
        return n(j * n(i & 4294967295L));
    }

    @XP0
    public static final long c0(long j, short s) {
        return n(j * n(s & WebSocketProtocol.PAYLOAD_SHORT_MAX));
    }

    @XP0
    public static final byte d0(long j) {
        return (byte) j;
    }

    @XP0
    public static final long e(long j, long j2) {
        return n(j & j2);
    }

    @XP0
    public static final double e0(long j) {
        return ZB2.q(j);
    }

    @XP0
    public static final float f0(long j) {
        return (float) ZB2.q(j);
    }

    public static final /* synthetic */ C9860tx2 g(long j) {
        return new C9860tx2(j);
    }

    @XP0
    public static final int g0(long j) {
        return (int) j;
    }

    @XP0
    public static final int h(long j, byte b) {
        int compare;
        compare = Long.compare(j ^ Long.MIN_VALUE, n(b & 255) ^ Long.MIN_VALUE);
        return compare;
    }

    @XP0
    public static final short i0(long j) {
        return (short) j;
    }

    @XP0
    public static int j(long j, long j2) {
        return ZB2.n(j, j2);
    }

    @NotNull
    public static String j0(long j) {
        return ZB2.t(j, 10);
    }

    @XP0
    public static final byte k0(long j) {
        return Vw2.n((byte) j);
    }

    @XP0
    public static final int l(long j, int i) {
        int compare;
        compare = Long.compare(j ^ Long.MIN_VALUE, n(i & 4294967295L) ^ Long.MIN_VALUE);
        return compare;
    }

    @XP0
    public static final int l0(long j) {
        return C7162ix2.n((int) j);
    }

    @XP0
    public static final int m(long j, short s) {
        int compare;
        compare = Long.compare(j ^ Long.MIN_VALUE, n(s & WebSocketProtocol.PAYLOAD_SHORT_MAX) ^ Long.MIN_VALUE);
        return compare;
    }

    @XP0
    public static final long o(long j) {
        return n(j - 1);
    }

    @XP0
    public static final short o0(long j) {
        return Xx2.n((short) j);
    }

    @XP0
    public static final long p(long j, byte b) {
        return Tw2.a(j, n(b & 255));
    }

    @XP0
    public static final long q(long j, long j2) {
        return ZB2.o(j, j2);
    }

    @XP0
    public static final long q0(long j, long j2) {
        return n(j ^ j2);
    }

    @XP0
    public static final long r(long j, int i) {
        return Tw2.a(j, n(i & 4294967295L));
    }

    @XP0
    public static final long s(long j, short s) {
        return Tw2.a(j, n(s & WebSocketProtocol.PAYLOAD_SHORT_MAX));
    }

    public static boolean t(long j, Object obj) {
        if (!(obj instanceof C9860tx2) || j != ((C9860tx2) obj).p0()) {
            return false;
        }
        return true;
    }

    public static final boolean u(long j, long j2) {
        if (j == j2) {
            return true;
        }
        return false;
    }

    @XP0
    public static final long v(long j, byte b) {
        return Tw2.a(j, n(b & 255));
    }

    @XP0
    public static final long w(long j, long j2) {
        return Tw2.a(j, j2);
    }

    @XP0
    public static final long x(long j, int i) {
        return Tw2.a(j, n(i & 4294967295L));
    }

    @XP0
    public static final long y(long j, short s) {
        return Tw2.a(j, n(s & WebSocketProtocol.PAYLOAD_SHORT_MAX));
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(C9860tx2 c9860tx2) {
        return ZB2.n(p0(), c9860tx2.p0());
    }

    public boolean equals(Object obj) {
        return t(this.X, obj);
    }

    public int hashCode() {
        return A(this.X);
    }

    @XP0
    public final int i(long j) {
        return ZB2.n(p0(), j);
    }

    public final /* synthetic */ long p0() {
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
    public static final long h0(long j) {
        return j;
    }

    @InterfaceC6307fT0
    @HK1
    public static long n(long j) {
        return j;
    }

    @XP0
    public static final long n0(long j) {
        return j;
    }
}
