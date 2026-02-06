package o;

/* renamed from: o.Ps1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C3970Ps1 extends C3873Os1 {
    @XP0
    @InterfaceC6480g82(version = "1.2")
    public static final float A0(C6668gv0 c6668gv0, int i) {
        C6562gT0.p(c6668gv0, "<this>");
        return Float.intBitsToFloat(i);
    }

    @XP0
    public static final boolean B0(double d) {
        if (Math.abs(d) <= Double.MAX_VALUE) {
            return true;
        }
        return false;
    }

    @XP0
    public static final boolean C0(float f) {
        if (Math.abs(f) <= Float.MAX_VALUE) {
            return true;
        }
        return false;
    }

    @XP0
    public static final boolean D0(double d) {
        return Double.isInfinite(d);
    }

    @XP0
    public static final boolean E0(float f) {
        return Float.isInfinite(f);
    }

    @XP0
    public static final boolean F0(double d) {
        return Double.isNaN(d);
    }

    @XP0
    public static final boolean G0(float f) {
        return Float.isNaN(f);
    }

    @XP0
    @InterfaceC6480g82(version = "1.6")
    @InterfaceC10924yJ2(markerClass = {InterfaceC4912Zi0.class})
    public static final int H0(int i, int i2) {
        return Integer.rotateLeft(i, i2);
    }

    @XP0
    @InterfaceC6480g82(version = "1.6")
    @InterfaceC10924yJ2(markerClass = {InterfaceC4912Zi0.class})
    public static final long I0(long j, int i) {
        return Long.rotateLeft(j, i);
    }

    @XP0
    @InterfaceC6480g82(version = "1.6")
    @InterfaceC10924yJ2(markerClass = {InterfaceC4912Zi0.class})
    public static final int J0(int i, int i2) {
        return Integer.rotateRight(i, i2);
    }

    @XP0
    @InterfaceC6480g82(version = "1.6")
    @InterfaceC10924yJ2(markerClass = {InterfaceC4912Zi0.class})
    public static final long K0(long j, int i) {
        return Long.rotateRight(j, i);
    }

    @XP0
    @InterfaceC6480g82(version = "1.4")
    public static final int L0(int i) {
        return Integer.highestOneBit(i);
    }

    @XP0
    @InterfaceC6480g82(version = "1.4")
    public static final long M0(long j) {
        return Long.highestOneBit(j);
    }

    @XP0
    @InterfaceC6480g82(version = "1.4")
    public static final int N0(int i) {
        return Integer.lowestOneBit(i);
    }

    @XP0
    @InterfaceC6480g82(version = "1.4")
    public static final long O0(long j) {
        return Long.lowestOneBit(j);
    }

    @XP0
    @InterfaceC6480g82(version = "1.2")
    public static final int P0(float f) {
        return Float.floatToIntBits(f);
    }

    @XP0
    @InterfaceC6480g82(version = "1.2")
    public static final long Q0(double d) {
        return Double.doubleToLongBits(d);
    }

    @XP0
    @InterfaceC6480g82(version = "1.2")
    public static final int R0(float f) {
        return Float.floatToRawIntBits(f);
    }

    @XP0
    @InterfaceC6480g82(version = "1.2")
    public static final long S0(double d) {
        return Double.doubleToRawLongBits(d);
    }

    @XP0
    @InterfaceC6480g82(version = "1.4")
    public static final int t0(int i) {
        return Integer.numberOfLeadingZeros(i);
    }

    @XP0
    @InterfaceC6480g82(version = "1.4")
    public static final int u0(long j) {
        return Long.numberOfLeadingZeros(j);
    }

    @XP0
    @InterfaceC6480g82(version = "1.4")
    public static final int v0(int i) {
        return Integer.bitCount(i);
    }

    @XP0
    @InterfaceC6480g82(version = "1.4")
    public static final int w0(long j) {
        return Long.bitCount(j);
    }

    @XP0
    @InterfaceC6480g82(version = "1.4")
    public static final int x0(int i) {
        return Integer.numberOfTrailingZeros(i);
    }

    @XP0
    @InterfaceC6480g82(version = "1.4")
    public static final int y0(long j) {
        return Long.numberOfTrailingZeros(j);
    }

    @XP0
    @InterfaceC6480g82(version = "1.2")
    public static final double z0(Z40 z40, long j) {
        C6562gT0.p(z40, "<this>");
        return Double.longBitsToDouble(j);
    }
}
