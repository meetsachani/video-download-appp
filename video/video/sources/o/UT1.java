package o;

/* loaded from: classes3.dex */
public class UT1 {
    public final float a;
    public final float b;

    public UT1(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    public static float a(UT1 ut1, UT1 ut12, UT1 ut13) {
        float f = ut12.a;
        float f2 = ut12.b;
        return ((ut13.a - f) * (ut1.b - f2)) - ((ut13.b - f2) * (ut1.a - f));
    }

    public static float b(UT1 ut1, UT1 ut12) {
        return C9044qd1.a(ut1.a, ut1.b, ut12.a, ut12.b);
    }

    public static void e(UT1[] ut1Arr) {
        UT1 ut1;
        UT1 ut12;
        UT1 ut13;
        float b = b(ut1Arr[0], ut1Arr[1]);
        float b2 = b(ut1Arr[1], ut1Arr[2]);
        float b3 = b(ut1Arr[0], ut1Arr[2]);
        if (b2 >= b && b2 >= b3) {
            ut1 = ut1Arr[0];
            ut12 = ut1Arr[1];
            ut13 = ut1Arr[2];
        } else if (b3 >= b2 && b3 >= b) {
            ut1 = ut1Arr[1];
            ut12 = ut1Arr[0];
            ut13 = ut1Arr[2];
        } else {
            ut1 = ut1Arr[2];
            ut12 = ut1Arr[0];
            ut13 = ut1Arr[1];
        }
        if (a(ut12, ut1, ut13) < 0.0f) {
            UT1 ut14 = ut13;
            ut13 = ut12;
            ut12 = ut14;
        }
        ut1Arr[0] = ut12;
        ut1Arr[1] = ut1;
        ut1Arr[2] = ut13;
    }

    public final float c() {
        return this.a;
    }

    public final float d() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof UT1) {
            UT1 ut1 = (UT1) obj;
            if (this.a == ut1.a && this.b == ut1.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (Float.floatToIntBits(this.a) * 31) + Float.floatToIntBits(this.b);
    }

    public final String toString() {
        return C9811tl1.c + this.a + ',' + this.b + ')';
    }
}
