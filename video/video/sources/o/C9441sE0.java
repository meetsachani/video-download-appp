package o;

import android.graphics.Color;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import o.NV0;

/* renamed from: o.sE0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C9441sE0 implements GE2<C8706pE0> {
    public int a;

    public C9441sE0(int i) {
        this.a = i;
    }

    public static float[] e(float[] fArr, float[] fArr2) {
        float f;
        if (fArr.length == 0) {
            return fArr2;
        }
        if (fArr2.length == 0) {
            return fArr;
        }
        int length = fArr.length + fArr2.length;
        float[] fArr3 = new float[length];
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < length; i4++) {
            float f2 = Float.NaN;
            if (i2 < fArr.length) {
                f = fArr[i2];
            } else {
                f = Float.NaN;
            }
            if (i3 < fArr2.length) {
                f2 = fArr2[i3];
            }
            if (!Float.isNaN(f2) && f >= f2) {
                if (!Float.isNaN(f) && f2 >= f) {
                    fArr3[i4] = f;
                    i2++;
                    i3++;
                    i++;
                } else {
                    fArr3[i4] = f2;
                    i3++;
                }
            } else {
                fArr3[i4] = f;
                i2++;
            }
        }
        if (i == 0) {
            return fArr3;
        }
        return Arrays.copyOf(fArr3, length - i);
    }

    public final C8706pE0 b(C8706pE0 c8706pE0, List<Float> list) {
        int i = this.a * 4;
        if (list.size() <= i) {
            return c8706pE0;
        }
        float[] e = c8706pE0.e();
        int[] d = c8706pE0.d();
        int size = (list.size() - i) / 2;
        float[] fArr = new float[size];
        float[] fArr2 = new float[size];
        int i2 = 0;
        while (i < list.size()) {
            if (i % 2 == 0) {
                fArr[i2] = list.get(i).floatValue();
            } else {
                fArr2[i2] = list.get(i).floatValue();
                i2++;
            }
            i++;
        }
        float[] e2 = e(c8706pE0.e(), fArr);
        int length = e2.length;
        int[] iArr = new int[length];
        for (int i3 = 0; i3 < length; i3++) {
            float f = e2[i3];
            int binarySearch = Arrays.binarySearch(e, f);
            int binarySearch2 = Arrays.binarySearch(fArr, f);
            if (binarySearch >= 0 && binarySearch2 <= 0) {
                iArr[i3] = d(f, d[binarySearch], fArr, fArr2);
            } else {
                if (binarySearch2 < 0) {
                    binarySearch2 = -(binarySearch2 + 1);
                }
                iArr[i3] = c(f, fArr2[binarySearch2], e, d);
            }
        }
        return new C8706pE0(e2, iArr);
    }

    public int c(float f, float f2, float[] fArr, int[] iArr) {
        if (iArr.length >= 2 && f != fArr[0]) {
            for (int i = 1; i < fArr.length; i++) {
                float f3 = fArr[i];
                if (f3 >= f || i == fArr.length - 1) {
                    if (i == fArr.length - 1 && f >= f3) {
                        return Color.argb((int) (f2 * 255.0f), Color.red(iArr[i]), Color.green(iArr[i]), Color.blue(iArr[i]));
                    } else {
                        int i2 = i - 1;
                        float f4 = fArr[i2];
                        int c = AC0.c((f - f4) / (f3 - f4), iArr[i2], iArr[i]);
                        return Color.argb((int) (f2 * 255.0f), Color.red(c), Color.green(c), Color.blue(c));
                    }
                }
            }
            throw new IllegalArgumentException("Unreachable code.");
        }
        return iArr[0];
    }

    public final int d(float f, int i, float[] fArr, float[] fArr2) {
        float k;
        if (fArr2.length >= 2 && f > fArr[0]) {
            for (int i2 = 1; i2 < fArr.length; i2++) {
                float f2 = fArr[i2];
                int i3 = (f2 > f ? 1 : (f2 == f ? 0 : -1));
                if (i3 >= 0 || i2 == fArr.length - 1) {
                    if (i3 <= 0) {
                        k = fArr2[i2];
                    } else {
                        int i4 = i2 - 1;
                        float f3 = fArr[i4];
                        k = C4713Xj1.k(fArr2[i4], fArr2[i2], (f - f3) / (f2 - f3));
                    }
                    return Color.argb((int) (k * 255.0f), Color.red(i), Color.green(i), Color.blue(i));
                }
            }
            throw new IllegalArgumentException("Unreachable code.");
        }
        return Color.argb((int) (fArr2[0] * 255.0f), Color.red(i), Color.green(i), Color.blue(i));
    }

    @Override // o.GE2
    /* renamed from: f */
    public C8706pE0 a(NV0 nv0, float f) throws IOException {
        boolean z;
        ArrayList arrayList = new ArrayList();
        if (nv0.q() == NV0.b.BEGIN_ARRAY) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            nv0.d();
        }
        while (nv0.j()) {
            arrayList.add(Float.valueOf((float) nv0.l()));
        }
        if (arrayList.size() == 4 && arrayList.get(0).floatValue() == 1.0f) {
            arrayList.set(0, Float.valueOf(0.0f));
            arrayList.add(Float.valueOf(1.0f));
            arrayList.add(arrayList.get(1));
            arrayList.add(arrayList.get(2));
            arrayList.add(arrayList.get(3));
            this.a = 2;
        }
        if (z) {
            nv0.h();
        }
        if (this.a == -1) {
            this.a = arrayList.size() / 4;
        }
        int i = this.a;
        float[] fArr = new float[i];
        int[] iArr = new int[i];
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < this.a * 4; i4++) {
            int i5 = i4 / 4;
            double floatValue = arrayList.get(i4).floatValue();
            int i6 = i4 % 4;
            if (i6 != 0) {
                if (i6 != 1) {
                    if (i6 != 2) {
                        if (i6 == 3) {
                            iArr[i5] = Color.argb(255, i2, i3, (int) (floatValue * 255.0d));
                        }
                    } else {
                        i3 = (int) (floatValue * 255.0d);
                    }
                } else {
                    i2 = (int) (floatValue * 255.0d);
                }
            } else {
                if (i5 > 0) {
                    float f2 = (float) floatValue;
                    if (fArr[i5 - 1] >= f2) {
                        fArr[i5] = f2 + 0.01f;
                    }
                }
                fArr[i5] = (float) floatValue;
            }
        }
        return b(new C8706pE0(fArr, iArr), arrayList);
    }
}
