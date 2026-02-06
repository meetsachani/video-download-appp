package o;

@InterfaceC8046mW0(name = "UNumbersKt")
/* loaded from: classes3.dex */
public final class Cx2 {
    @XP0
    @InterfaceC6480g82(version = "1.5")
    @InterfaceC10924yJ2(markerClass = {InterfaceC5880dj0.class, InterfaceC4912Zi0.class})
    public static final int A(int i) {
        return C7162ix2.n(Integer.lowestOneBit(i));
    }

    @XP0
    @InterfaceC6480g82(version = "1.5")
    @InterfaceC10924yJ2(markerClass = {InterfaceC5880dj0.class, InterfaceC4912Zi0.class})
    public static final short B(short s) {
        return Xx2.n((short) Integer.lowestOneBit(s & Xx2.Y0));
    }

    @XP0
    @InterfaceC6480g82(version = "1.5")
    @InterfaceC10924yJ2(markerClass = {InterfaceC5880dj0.class, InterfaceC4912Zi0.class})
    public static final int a(byte b) {
        return Integer.numberOfLeadingZeros(b & 255) - 24;
    }

    @XP0
    @InterfaceC6480g82(version = "1.5")
    @InterfaceC10924yJ2(markerClass = {InterfaceC5880dj0.class, InterfaceC4912Zi0.class})
    public static final int b(long j) {
        return Long.numberOfLeadingZeros(j);
    }

    @XP0
    @InterfaceC6480g82(version = "1.5")
    @InterfaceC10924yJ2(markerClass = {InterfaceC5880dj0.class, InterfaceC4912Zi0.class})
    public static final int c(int i) {
        return Integer.numberOfLeadingZeros(i);
    }

    @XP0
    @InterfaceC6480g82(version = "1.5")
    @InterfaceC10924yJ2(markerClass = {InterfaceC5880dj0.class, InterfaceC4912Zi0.class})
    public static final int d(short s) {
        return Integer.numberOfLeadingZeros(s & Xx2.Y0) - 16;
    }

    @XP0
    @InterfaceC6480g82(version = "1.5")
    @InterfaceC10924yJ2(markerClass = {InterfaceC5880dj0.class, InterfaceC4912Zi0.class})
    public static final int e(byte b) {
        return Integer.bitCount(C7162ix2.n(b & 255));
    }

    @XP0
    @InterfaceC6480g82(version = "1.5")
    @InterfaceC10924yJ2(markerClass = {InterfaceC5880dj0.class, InterfaceC4912Zi0.class})
    public static final int f(long j) {
        return Long.bitCount(j);
    }

    @XP0
    @InterfaceC6480g82(version = "1.5")
    @InterfaceC10924yJ2(markerClass = {InterfaceC5880dj0.class, InterfaceC4912Zi0.class})
    public static final int g(int i) {
        return Integer.bitCount(i);
    }

    @XP0
    @InterfaceC6480g82(version = "1.5")
    @InterfaceC10924yJ2(markerClass = {InterfaceC5880dj0.class, InterfaceC4912Zi0.class})
    public static final int h(short s) {
        return Integer.bitCount(C7162ix2.n(s & Xx2.Y0));
    }

    @XP0
    @InterfaceC6480g82(version = "1.5")
    @InterfaceC10924yJ2(markerClass = {InterfaceC5880dj0.class, InterfaceC4912Zi0.class})
    public static final int i(byte b) {
        return Integer.numberOfTrailingZeros(b | 256);
    }

    @XP0
    @InterfaceC6480g82(version = "1.5")
    @InterfaceC10924yJ2(markerClass = {InterfaceC5880dj0.class, InterfaceC4912Zi0.class})
    public static final int j(long j) {
        return Long.numberOfTrailingZeros(j);
    }

    @XP0
    @InterfaceC6480g82(version = "1.5")
    @InterfaceC10924yJ2(markerClass = {InterfaceC5880dj0.class, InterfaceC4912Zi0.class})
    public static final int k(int i) {
        return Integer.numberOfTrailingZeros(i);
    }

    @XP0
    @InterfaceC6480g82(version = "1.5")
    @InterfaceC10924yJ2(markerClass = {InterfaceC5880dj0.class, InterfaceC4912Zi0.class})
    public static final int l(short s) {
        return Integer.numberOfTrailingZeros(s | 65536);
    }

    @XP0
    @InterfaceC6480g82(version = "1.6")
    @InterfaceC10924yJ2(markerClass = {InterfaceC4912Zi0.class, InterfaceC5880dj0.class})
    public static final long m(long j, int i) {
        return C9860tx2.n(Long.rotateLeft(j, i));
    }

    @XP0
    @InterfaceC6480g82(version = "1.6")
    @InterfaceC10924yJ2(markerClass = {InterfaceC4912Zi0.class, InterfaceC5880dj0.class})
    public static final byte n(byte b, int i) {
        return Vw2.n(C4067Qs1.Z0(b, i));
    }

    @XP0
    @InterfaceC6480g82(version = "1.6")
    @InterfaceC10924yJ2(markerClass = {InterfaceC4912Zi0.class, InterfaceC5880dj0.class})
    public static final int o(int i, int i2) {
        return C7162ix2.n(Integer.rotateLeft(i, i2));
    }

    @XP0
    @InterfaceC6480g82(version = "1.6")
    @InterfaceC10924yJ2(markerClass = {InterfaceC4912Zi0.class, InterfaceC5880dj0.class})
    public static final short p(short s, int i) {
        return Xx2.n(C4067Qs1.a1(s, i));
    }

    @XP0
    @InterfaceC6480g82(version = "1.6")
    @InterfaceC10924yJ2(markerClass = {InterfaceC4912Zi0.class, InterfaceC5880dj0.class})
    public static final long q(long j, int i) {
        return C9860tx2.n(Long.rotateRight(j, i));
    }

    @XP0
    @InterfaceC6480g82(version = "1.6")
    @InterfaceC10924yJ2(markerClass = {InterfaceC4912Zi0.class, InterfaceC5880dj0.class})
    public static final byte r(byte b, int i) {
        return Vw2.n(C4067Qs1.b1(b, i));
    }

    @XP0
    @InterfaceC6480g82(version = "1.6")
    @InterfaceC10924yJ2(markerClass = {InterfaceC4912Zi0.class, InterfaceC5880dj0.class})
    public static final int s(int i, int i2) {
        return C7162ix2.n(Integer.rotateRight(i, i2));
    }

    @XP0
    @InterfaceC6480g82(version = "1.6")
    @InterfaceC10924yJ2(markerClass = {InterfaceC4912Zi0.class, InterfaceC5880dj0.class})
    public static final short t(short s, int i) {
        return Xx2.n(C4067Qs1.c1(s, i));
    }

    @XP0
    @InterfaceC6480g82(version = "1.5")
    @InterfaceC10924yJ2(markerClass = {InterfaceC5880dj0.class, InterfaceC4912Zi0.class})
    public static final byte u(byte b) {
        return Vw2.n((byte) Integer.highestOneBit(b & 255));
    }

    @XP0
    @InterfaceC6480g82(version = "1.5")
    @InterfaceC10924yJ2(markerClass = {InterfaceC5880dj0.class, InterfaceC4912Zi0.class})
    public static final long v(long j) {
        return C9860tx2.n(Long.highestOneBit(j));
    }

    @XP0
    @InterfaceC6480g82(version = "1.5")
    @InterfaceC10924yJ2(markerClass = {InterfaceC5880dj0.class, InterfaceC4912Zi0.class})
    public static final int w(int i) {
        return C7162ix2.n(Integer.highestOneBit(i));
    }

    @XP0
    @InterfaceC6480g82(version = "1.5")
    @InterfaceC10924yJ2(markerClass = {InterfaceC5880dj0.class, InterfaceC4912Zi0.class})
    public static final short x(short s) {
        return Xx2.n((short) Integer.highestOneBit(s & Xx2.Y0));
    }

    @XP0
    @InterfaceC6480g82(version = "1.5")
    @InterfaceC10924yJ2(markerClass = {InterfaceC5880dj0.class, InterfaceC4912Zi0.class})
    public static final byte y(byte b) {
        return Vw2.n((byte) Integer.lowestOneBit(b & 255));
    }

    @XP0
    @InterfaceC6480g82(version = "1.5")
    @InterfaceC10924yJ2(markerClass = {InterfaceC5880dj0.class, InterfaceC4912Zi0.class})
    public static final long z(long j) {
        return C9860tx2.n(Long.lowestOneBit(j));
    }
}
