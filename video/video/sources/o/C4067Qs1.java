package o;

/* renamed from: o.Qs1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C4067Qs1 extends C3970Ps1 {
    @XP0
    @InterfaceC6480g82(version = "1.4")
    public static final int T0(byte b) {
        return Integer.numberOfLeadingZeros(b & 255) - 24;
    }

    @XP0
    @InterfaceC6480g82(version = "1.4")
    public static final int U0(short s) {
        return Integer.numberOfLeadingZeros(s & Xx2.Y0) - 16;
    }

    @XP0
    @InterfaceC6480g82(version = "1.4")
    public static final int V0(byte b) {
        return Integer.bitCount(b & 255);
    }

    @XP0
    @InterfaceC6480g82(version = "1.4")
    public static final int W0(short s) {
        return Integer.bitCount(s & Xx2.Y0);
    }

    @XP0
    @InterfaceC6480g82(version = "1.4")
    public static final int X0(byte b) {
        return Integer.numberOfTrailingZeros(b | 256);
    }

    @XP0
    @InterfaceC6480g82(version = "1.4")
    public static final int Y0(short s) {
        return Integer.numberOfTrailingZeros(s | 65536);
    }

    @InterfaceC6480g82(version = "1.6")
    @InterfaceC10924yJ2(markerClass = {InterfaceC4912Zi0.class})
    public static final byte Z0(byte b, int i) {
        int i2 = i & 7;
        return (byte) (((b & 255) >>> (8 - i2)) | (b << i2));
    }

    @InterfaceC6480g82(version = "1.6")
    @InterfaceC10924yJ2(markerClass = {InterfaceC4912Zi0.class})
    public static final short a1(short s, int i) {
        int i2 = i & 15;
        return (short) (((s & 65535) >>> (16 - i2)) | (s << i2));
    }

    @InterfaceC6480g82(version = "1.6")
    @InterfaceC10924yJ2(markerClass = {InterfaceC4912Zi0.class})
    public static final byte b1(byte b, int i) {
        int i2 = i & 7;
        return (byte) (((b & 255) >>> i2) | (b << (8 - i2)));
    }

    @InterfaceC6480g82(version = "1.6")
    @InterfaceC10924yJ2(markerClass = {InterfaceC4912Zi0.class})
    public static final short c1(short s, int i) {
        int i2 = i & 15;
        return (short) (((s & 65535) >>> i2) | (s << (16 - i2)));
    }

    @XP0
    @InterfaceC6480g82(version = "1.4")
    public static final byte d1(byte b) {
        return (byte) Integer.highestOneBit(b & 255);
    }

    @XP0
    @InterfaceC6480g82(version = "1.4")
    public static final short e1(short s) {
        return (short) Integer.highestOneBit(s & Xx2.Y0);
    }

    @XP0
    @InterfaceC6480g82(version = "1.4")
    public static final byte f1(byte b) {
        return (byte) Integer.lowestOneBit(b);
    }

    @XP0
    @InterfaceC6480g82(version = "1.4")
    public static final short g1(short s) {
        return (short) Integer.lowestOneBit(s);
    }
}
