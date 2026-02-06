package o;

import java.util.Arrays;

/* loaded from: classes.dex */
public class PE2 {
    public static final int d = 20;
    public static final int e = 40;
    public static final int f = 100;
    public long[] a;
    public float[] b = new float[20];
    public int c = 0;

    public PE2() {
        long[] jArr = new long[20];
        this.a = jArr;
        Arrays.fill(jArr, Long.MIN_VALUE);
    }

    public void a(long j, float f2) {
        int i = (this.c + 1) % 20;
        this.c = i;
        this.a[i] = j;
        this.b[i] = f2;
    }

    public float b() {
        float c;
        int i = this.c;
        if (i == 0 && this.a[i] == Long.MIN_VALUE) {
            return 0.0f;
        }
        long j = this.a[i];
        int i2 = 0;
        long j2 = j;
        while (true) {
            long j3 = this.a[i];
            if (j3 == Long.MIN_VALUE) {
                break;
            }
            float abs = (float) Math.abs(j3 - j2);
            if (((float) (j - j3)) > 100.0f || abs > 40.0f) {
                break;
            }
            if (i == 0) {
                i = 20;
            }
            i--;
            i2++;
            if (i2 >= 20) {
                break;
            }
            j2 = j3;
        }
        if (i2 < 2) {
            return 0.0f;
        }
        if (i2 == 2) {
            int i3 = this.c;
            int i4 = i3 == 0 ? 19 : i3 - 1;
            long[] jArr = this.a;
            float f2 = (float) (jArr[i3] - jArr[i4]);
            if (f2 == 0.0f) {
                return 0.0f;
            }
            float[] fArr = this.b;
            c = (fArr[i3] - fArr[i4]) / f2;
        } else {
            int i5 = this.c;
            int i6 = ((i5 - i2) + 21) % 20;
            int i7 = (i5 + 21) % 20;
            long j4 = this.a[i6];
            float f3 = this.b[i6];
            int i8 = i6 + 1;
            float f4 = 0.0f;
            for (int i9 = i8 % 20; i9 != i7; i9 = (i9 + 1) % 20) {
                long j5 = this.a[i9];
                float f5 = (float) (j5 - j4);
                if (f5 != 0.0f) {
                    float f6 = this.b[i9];
                    float f7 = (f6 - f3) / f5;
                    f4 += (f7 - c(f4)) * Math.abs(f7);
                    if (i9 == i8) {
                        f4 *= 0.5f;
                    }
                    f3 = f6;
                    j4 = j5;
                }
            }
            c = c(f4);
        }
        return c * 1000.0f;
    }

    public final float c(float f2) {
        return (float) (Math.signum(f2) * Math.sqrt(Math.abs(f2) * 2.0f));
    }

    public void d() {
        this.c = 0;
        Arrays.fill(this.a, Long.MIN_VALUE);
        Arrays.fill(this.b, 0.0f);
    }
}
