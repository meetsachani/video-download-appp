package o;

/* renamed from: o.hv2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C6913hv2 {
    public static C6913hv2 d = null;
    public static final int e = 0;
    public static final int f = 1;
    public static final float g = 0.017453292f;
    public static final float h = 9.0E-4f;
    public static final float i = -0.10471976f;
    public static final float j = 0.0334196f;
    public static final float k = 3.49066E-4f;
    public static final float l = 5.236E-6f;
    public static final float m = 0.4092797f;
    public static final long n = 946728000000L;
    public long a;
    public long b;
    public int c;

    public static C6913hv2 b() {
        if (d == null) {
            d = new C6913hv2();
        }
        return d;
    }

    public void a(long j2, double d2, double d3) {
        float f2;
        float f3;
        double d4;
        double d5 = (0.01720197f * (((float) (j2 - n)) / 8.64E7f)) + 6.24006f;
        double sin = (Math.sin(d5) * 0.03341960161924362d) + d5 + (Math.sin(2.0f * f3) * 3.4906598739326E-4d) + (Math.sin(f3 * 3.0f) * 5.236000106378924E-6d) + 1.796593063d + 3.141592653589793d;
        double round = ((float) Math.round((f2 - 9.0E-4f) - d4)) + 9.0E-4f + ((-d3) / 360.0d) + (Math.sin(d5) * 0.0053d) + (Math.sin(2.0d * sin) * (-0.0069d));
        double asin = Math.asin(Math.sin(sin) * Math.sin(0.4092797040939331d));
        double d6 = 0.01745329238474369d * d2;
        double sin2 = (Math.sin(-0.10471975803375244d) - (Math.sin(d6) * Math.sin(asin))) / (Math.cos(d6) * Math.cos(asin));
        if (sin2 >= 1.0d) {
            this.c = 1;
            this.a = -1L;
            this.b = -1L;
        } else if (sin2 <= -1.0d) {
            this.c = 0;
            this.a = -1L;
            this.b = -1L;
        } else {
            double acos = (float) (Math.acos(sin2) / 6.283185307179586d);
            this.a = Math.round((round + acos) * 8.64E7d) + n;
            long round2 = Math.round((round - acos) * 8.64E7d) + n;
            this.b = round2;
            if (round2 < j2 && this.a > j2) {
                this.c = 0;
            } else {
                this.c = 1;
            }
        }
    }
}
