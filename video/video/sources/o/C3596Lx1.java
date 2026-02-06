package o;

/* renamed from: o.Lx1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3596Lx1 {
    public static final long a(float f, float f2) {
        return (Float.floatToRawIntBits(f2) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
    }

    public static final long b(int i, int i2) {
        return (i2 & 4294967295L) | (i << 32);
    }
}
