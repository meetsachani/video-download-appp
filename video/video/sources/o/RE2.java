package o;

import android.view.MotionEvent;

/* loaded from: classes.dex */
public class RE2 {
    public static final long f = 100;
    public static final int g = 20;
    public static final long h = 40;
    public final float[] a = new float[20];
    public final long[] b = new long[20];
    public float c = 0.0f;
    public int d = 0;
    public int e = 0;

    public static float g(float f2) {
        float f3;
        if (f2 < 0.0f) {
            f3 = -1.0f;
        } else {
            f3 = 1.0f;
        }
        return f3 * ((float) Math.sqrt(Math.abs(f2) * 2.0f));
    }

    public void a(MotionEvent motionEvent) {
        long eventTime = motionEvent.getEventTime();
        if (this.d != 0 && eventTime - this.b[this.e] > 40) {
            b();
        }
        int i = (this.e + 1) % 20;
        this.e = i;
        int i2 = this.d;
        if (i2 != 20) {
            this.d = i2 + 1;
        }
        this.a[i] = motionEvent.getAxisValue(26);
        this.b[this.e] = eventTime;
    }

    public final void b() {
        this.d = 0;
        this.c = 0.0f;
    }

    public void c(int i) {
        d(i, Float.MAX_VALUE);
    }

    public void d(int i, float f2) {
        float f3 = f() * i;
        this.c = f3;
        if (f3 < (-Math.abs(f2))) {
            this.c = -Math.abs(f2);
        } else if (this.c > Math.abs(f2)) {
            this.c = Math.abs(f2);
        }
    }

    public float e(int i) {
        if (i != 26) {
            return 0.0f;
        }
        return this.c;
    }

    public final float f() {
        long[] jArr;
        long j;
        int i = this.d;
        if (i < 2) {
            return 0.0f;
        }
        int i2 = this.e;
        int i3 = ((i2 + 20) - (i - 1)) % 20;
        long j2 = this.b[i2];
        while (true) {
            jArr = this.b;
            j = jArr[i3];
            if (j2 - j <= 100) {
                break;
            }
            this.d--;
            i3 = (i3 + 1) % 20;
        }
        int i4 = this.d;
        if (i4 < 2) {
            return 0.0f;
        }
        if (i4 == 2) {
            int i5 = (i3 + 1) % 20;
            long j3 = jArr[i5];
            if (j == j3) {
                return 0.0f;
            }
            return this.a[i5] / ((float) (j3 - j));
        }
        float f2 = 0.0f;
        int i6 = 0;
        for (int i7 = 0; i7 < this.d - 1; i7++) {
            int i8 = i7 + i3;
            long[] jArr2 = this.b;
            long j4 = jArr2[i8 % 20];
            int i9 = (i8 + 1) % 20;
            if (jArr2[i9] != j4) {
                i6++;
                float g2 = g(f2);
                float f3 = this.a[i9] / ((float) (this.b[i9] - j4));
                f2 += (f3 - g2) * Math.abs(f3);
                if (i6 == 1) {
                    f2 *= 0.5f;
                }
            }
        }
        return g(f2);
    }
}
