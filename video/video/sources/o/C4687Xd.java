package o;

import o.HT1;

@HT1({HT1.a.Y})
/* renamed from: o.Xd  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4687Xd {
    public static final float i = 0.1f;
    public final int a;
    public float b;
    public int c;
    public int d;
    public float e;
    public float f;
    public final int g;
    public final float h;

    public C4687Xd(int i2, float f, float f2, float f3, int i3, float f4, int i4, float f5, int i5, float f6) {
        this.a = i2;
        this.b = C9293rd1.d(f, f2, f3);
        this.c = i3;
        this.e = f4;
        this.d = i4;
        this.f = f5;
        this.g = i5;
        d(f6, f2, f3, f5);
        this.h = b(f5);
    }

    @InterfaceC11300zs1
    public static C4687Xd c(float f, float f2, float f3, float f4, @InterfaceC5670cr1 int[] iArr, float f5, @InterfaceC5670cr1 int[] iArr2, float f6, @InterfaceC5670cr1 int[] iArr3) {
        C4687Xd c4687Xd = null;
        int i2 = 1;
        for (int i3 : iArr3) {
            int length = iArr2.length;
            int i4 = 0;
            while (i4 < length) {
                int i5 = iArr2[i4];
                int length2 = iArr.length;
                int i6 = 0;
                while (i6 < length2) {
                    int i7 = length;
                    int i8 = i4;
                    int i9 = i2;
                    int i10 = length2;
                    int i11 = i6;
                    C4687Xd c4687Xd2 = new C4687Xd(i9, f2, f3, f4, iArr[i6], f5, i5, f6, i3, f);
                    if (c4687Xd == null || c4687Xd2.h < c4687Xd.h) {
                        if (c4687Xd2.h == 0.0f) {
                            return c4687Xd2;
                        }
                        c4687Xd = c4687Xd2;
                    }
                    int i12 = i9 + 1;
                    i6 = i11 + 1;
                    i4 = i8;
                    i2 = i12;
                    length = i7;
                    length2 = i10;
                }
                i4++;
                i2 = i2;
                length = length;
            }
        }
        return c4687Xd;
    }

    public final float a(float f, int i2, float f2, int i3, int i4) {
        if (i2 <= 0) {
            f2 = 0.0f;
        }
        float f3 = i3 / 2.0f;
        return (f - ((i2 + f3) * f2)) / (i4 + f3);
    }

    public final float b(float f) {
        if (!g()) {
            return Float.MAX_VALUE;
        }
        return Math.abs(f - this.f) * this.a;
    }

    public final void d(float f, float f2, float f3, float f4) {
        float f5;
        float f6 = f - f();
        int i2 = this.c;
        if (i2 > 0 && f6 > 0.0f) {
            float f7 = this.b;
            this.b = f7 + Math.min(f6 / i2, f3 - f7);
        } else if (i2 > 0 && f6 < 0.0f) {
            float f8 = this.b;
            this.b = f8 + Math.max(f6 / i2, f2 - f8);
        }
        int i3 = this.c;
        if (i3 > 0) {
            f5 = this.b;
        } else {
            f5 = 0.0f;
        }
        this.b = f5;
        float a = a(f, i3, f5, this.d, this.g);
        this.f = a;
        float f9 = (this.b + a) / 2.0f;
        this.e = f9;
        int i4 = this.d;
        if (i4 > 0 && a != f4) {
            float f10 = (f4 - a) * this.g;
            float min = Math.min(Math.abs(f10), f9 * 0.1f * i4);
            if (f10 > 0.0f) {
                this.e -= min / this.d;
                this.f += min / this.g;
                return;
            }
            this.e += min / this.d;
            this.f -= min / this.g;
        }
    }

    public int e() {
        return this.c + this.d + this.g;
    }

    public final float f() {
        return (this.f * this.g) + (this.e * this.d) + (this.b * this.c);
    }

    public final boolean g() {
        int i2 = this.g;
        if (i2 > 0 && this.c > 0 && this.d > 0) {
            float f = this.f;
            float f2 = this.e;
            if (f <= f2 || f2 <= this.b) {
                return false;
            }
            return true;
        } else if (i2 > 0 && this.c > 0 && this.f <= this.b) {
            return false;
        } else {
            return true;
        }
    }

    @InterfaceC5670cr1
    public String toString() {
        return "Arrangement [priority=" + this.a + ", smallCount=" + this.c + ", smallSize=" + this.b + ", mediumCount=" + this.d + ", mediumSize=" + this.e + ", largeCount=" + this.g + ", largeSize=" + this.f + ", cost=" + this.h + C6566gU0.g;
    }
}
