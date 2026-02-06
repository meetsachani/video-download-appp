package o;

import java.util.Arrays;

/* renamed from: o.pE0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C8706pE0 {
    public final float[] a;
    public final int[] b;

    public C8706pE0(float[] fArr, int[] iArr) {
        this.a = fArr;
        this.b = iArr;
    }

    public final void a(C8706pE0 c8706pE0) {
        int i = 0;
        while (true) {
            int[] iArr = c8706pE0.b;
            if (i < iArr.length) {
                this.a[i] = c8706pE0.a[i];
                this.b[i] = iArr[i];
                i++;
            } else {
                return;
            }
        }
    }

    public C8706pE0 b(float[] fArr) {
        int[] iArr = new int[fArr.length];
        for (int i = 0; i < fArr.length; i++) {
            iArr[i] = c(fArr[i]);
        }
        return new C8706pE0(fArr, iArr);
    }

    public final int c(float f) {
        int binarySearch = Arrays.binarySearch(this.a, f);
        if (binarySearch >= 0) {
            return this.b[binarySearch];
        }
        int i = -(binarySearch + 1);
        if (i == 0) {
            return this.b[0];
        }
        int[] iArr = this.b;
        if (i == iArr.length - 1) {
            return iArr[iArr.length - 1];
        }
        float[] fArr = this.a;
        int i2 = i - 1;
        float f2 = fArr[i2];
        return AC0.c((f - f2) / (fArr[i] - f2), iArr[i2], iArr[i]);
    }

    public int[] d() {
        return this.b;
    }

    public float[] e() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            C8706pE0 c8706pE0 = (C8706pE0) obj;
            if (Arrays.equals(this.a, c8706pE0.a) && Arrays.equals(this.b, c8706pE0.b)) {
                return true;
            }
        }
        return false;
    }

    public int f() {
        return this.b.length;
    }

    public void g(C8706pE0 c8706pE0, C8706pE0 c8706pE02, float f) {
        int[] iArr;
        if (c8706pE0.equals(c8706pE02)) {
            a(c8706pE0);
        } else if (f <= 0.0f) {
            a(c8706pE0);
        } else if (f >= 1.0f) {
            a(c8706pE02);
        } else if (c8706pE0.b.length == c8706pE02.b.length) {
            int i = 0;
            while (true) {
                iArr = c8706pE0.b;
                if (i >= iArr.length) {
                    break;
                }
                this.a[i] = C4713Xj1.k(c8706pE0.a[i], c8706pE02.a[i], f);
                this.b[i] = AC0.c(f, c8706pE0.b[i], c8706pE02.b[i]);
                i++;
            }
            int length = iArr.length;
            while (true) {
                float[] fArr = this.a;
                if (length < fArr.length) {
                    int[] iArr2 = c8706pE0.b;
                    fArr[length] = fArr[iArr2.length - 1];
                    int[] iArr3 = this.b;
                    iArr3[length] = iArr3[iArr2.length - 1];
                    length++;
                } else {
                    return;
                }
            }
        } else {
            throw new IllegalArgumentException("Cannot interpolate between gradients. Lengths vary (" + c8706pE0.b.length + " vs " + c8706pE02.b.length + C9811tl1.d);
        }
    }

    public int hashCode() {
        return (Arrays.hashCode(this.a) * 31) + Arrays.hashCode(this.b);
    }
}
