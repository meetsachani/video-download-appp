package o;

/* loaded from: classes3.dex */
public abstract class K2 extends AbstractC9608sv1 {
    public static final float g = 0.2f;
    public static final float h = 0.45f;
    public static final float i = 0.7916667f;
    public static final float j = 0.89285713f;
    public final int[] b;
    public final int[] e;
    public final int[] f;
    public final int[] a = new int[4];
    public final float[] c = new float[4];
    public final float[] d = new float[4];

    public K2() {
        int[] iArr = new int[8];
        this.b = iArr;
        this.e = new int[iArr.length / 2];
        this.f = new int[iArr.length / 2];
    }

    @Deprecated
    public static int h(int[] iArr) {
        return C9044qd1.d(iArr);
    }

    public static void i(int[] iArr, float[] fArr) {
        int i2 = 0;
        float f = fArr[0];
        for (int i3 = 1; i3 < iArr.length; i3++) {
            float f2 = fArr[i3];
            if (f2 < f) {
                i2 = i3;
                f = f2;
            }
        }
        iArr[i2] = iArr[i2] - 1;
    }

    public static void p(int[] iArr, float[] fArr) {
        int i2 = 0;
        float f = fArr[0];
        for (int i3 = 1; i3 < iArr.length; i3++) {
            float f2 = fArr[i3];
            if (f2 > f) {
                i2 = i3;
                f = f2;
            }
        }
        iArr[i2] = iArr[i2] + 1;
    }

    public static boolean q(int[] iArr) {
        int i2;
        float f = (iArr[0] + iArr[1]) / ((iArr[2] + i2) + iArr[3]);
        if (f >= 0.7916667f && f <= 0.89285713f) {
            int i3 = Integer.MAX_VALUE;
            int i4 = Integer.MIN_VALUE;
            for (int i5 : iArr) {
                if (i5 > i4) {
                    i4 = i5;
                }
                if (i5 < i3) {
                    i3 = i5;
                }
            }
            if (i4 < i3 * 10) {
                return true;
            }
        }
        return false;
    }

    public static int r(int[] iArr, int[][] iArr2) throws C9349rr1 {
        for (int i2 = 0; i2 < iArr2.length; i2++) {
            if (AbstractC9608sv1.e(iArr, iArr2[i2], 0.45f) < 0.2f) {
                return i2;
            }
        }
        throw C9349rr1.a();
    }

    public final int[] j() {
        return this.b;
    }

    public final int[] k() {
        return this.a;
    }

    public final int[] l() {
        return this.f;
    }

    public final float[] m() {
        return this.d;
    }

    public final int[] n() {
        return this.e;
    }

    public final float[] o() {
        return this.c;
    }
}
