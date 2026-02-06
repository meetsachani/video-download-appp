package o;

@Deprecated
/* renamed from: o.wA  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C10399wA {
    public final int a;
    public final int b;
    public final float[] c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    public C10399wA(int i, int i2, float[] fArr) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6 = false;
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        C9542sf.b(z, "Input channel count must be positive.");
        if (i2 > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        C9542sf.b(z2, "Output channel count must be positive.");
        if (fArr.length == i * i2) {
            z3 = true;
        } else {
            z3 = false;
        }
        C9542sf.b(z3, "Coefficient array length is invalid.");
        this.a = i;
        this.b = i2;
        this.c = a(fArr);
        boolean z7 = true;
        boolean z8 = true;
        boolean z9 = true;
        for (int i3 = 0; i3 < i; i3++) {
            for (int i4 = 0; i4 < i2; i4++) {
                float e = e(i3, i4);
                if (i3 == i4) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (e != 1.0f && z5) {
                    z9 = false;
                }
                if (e != 0.0f) {
                    z7 = false;
                    if (!z5) {
                        z8 = false;
                    }
                }
            }
        }
        this.d = z7;
        if (j() && z8) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.e = z4;
        if (z4 && z9) {
            z6 = true;
        }
        this.f = z6;
    }

    public static float[] a(float[] fArr) {
        for (int i = 0; i < fArr.length; i++) {
            if (fArr[i] < 0.0f) {
                throw new IllegalArgumentException("Coefficient at index " + i + " is negative.");
            }
        }
        return fArr;
    }

    public static C10399wA b(int i, int i2) {
        return new C10399wA(i, i2, c(i, i2));
    }

    public static float[] c(int i, int i2) {
        if (i == i2) {
            return g(i2);
        }
        if (i == 1 && i2 == 2) {
            return new float[]{1.0f, 1.0f};
        }
        if (i == 2 && i2 == 1) {
            return new float[]{0.5f, 0.5f};
        }
        throw new UnsupportedOperationException("Default channel mixing coefficients for " + i + "->" + i2 + " are not yet implemented.");
    }

    public static float[] g(int i) {
        float[] fArr = new float[i * i];
        for (int i2 = 0; i2 < i; i2++) {
            fArr[(i * i2) + i2] = 1.0f;
        }
        return fArr;
    }

    public int d() {
        return this.a;
    }

    public float e(int i, int i2) {
        return this.c[(i * this.b) + i2];
    }

    public int f() {
        return this.b;
    }

    public boolean h() {
        return this.e;
    }

    public boolean i() {
        return this.f;
    }

    public boolean j() {
        if (this.a == this.b) {
            return true;
        }
        return false;
    }

    public boolean k() {
        return this.d;
    }

    public C10399wA l(float f) {
        float[] fArr = new float[this.c.length];
        int i = 0;
        while (true) {
            float[] fArr2 = this.c;
            if (i < fArr2.length) {
                fArr[i] = fArr2[i] * f;
                i++;
            } else {
                return new C10399wA(this.a, this.b, fArr);
            }
        }
    }
}
