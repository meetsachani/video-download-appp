package o;

/* loaded from: classes.dex */
public class BS {
    public static final String i = "TransitionLayout";
    public boolean a;
    public String b;
    public a c;
    public int d;
    public float e;
    public String f;
    public boolean g;
    public int h;

    /* loaded from: classes.dex */
    public enum a {
        INT_TYPE,
        FLOAT_TYPE,
        COLOR_TYPE,
        COLOR_DRAWABLE_TYPE,
        STRING_TYPE,
        BOOLEAN_TYPE,
        DIMENSION_TYPE,
        REFERENCE_TYPE
    }

    public BS(String str, a aVar) {
        this.a = false;
        this.b = str;
        this.c = aVar;
    }

    public static int a(int i2) {
        int i3 = (i2 & (~(i2 >> 31))) - 255;
        return (i3 & (i3 >> 31)) + 255;
    }

    public static int f(float f, float f2, float f3) {
        float f4 = f * 6.0f;
        int i2 = (int) f4;
        float f5 = f4 - i2;
        float f6 = f3 * 255.0f;
        int i3 = (int) (((1.0f - f2) * f6) + 0.5f);
        int i4 = (int) (((1.0f - (f5 * f2)) * f6) + 0.5f);
        int i5 = (int) (((1.0f - ((1.0f - f5) * f2)) * f6) + 0.5f);
        int i6 = (int) (f6 + 0.5f);
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        if (i2 != 4) {
                            if (i2 != 5) {
                                return 0;
                            }
                            return ((i6 << 16) + (i3 << 8) + i4) | (-16777216);
                        }
                        return ((i5 << 16) + (i3 << 8) + i6) | (-16777216);
                    }
                    return ((i3 << 16) + (i4 << 8) + i6) | (-16777216);
                }
                return ((i3 << 16) + (i6 << 8) + i5) | (-16777216);
            }
            return ((i4 << 16) + (i6 << 8) + i3) | (-16777216);
        }
        return ((i6 << 16) + (i5 << 8) + i3) | (-16777216);
    }

    public boolean b(BS bs) {
        a aVar;
        if (bs != null && (aVar = this.c) == bs.c) {
            switch (aVar.ordinal()) {
                case 0:
                case 7:
                    if (this.d == bs.d) {
                        return true;
                    }
                    break;
                case 1:
                    if (this.e != bs.e) {
                        return false;
                    }
                    return true;
                case 2:
                case 3:
                    if (this.h != bs.h) {
                        return false;
                    }
                    return true;
                case 4:
                    if (this.d != bs.d) {
                        return false;
                    }
                    return true;
                case 5:
                    if (this.g != bs.g) {
                        return false;
                    }
                    return true;
                case 6:
                    if (this.e != bs.e) {
                        return false;
                    }
                    return true;
                default:
                    return false;
            }
        }
        return false;
    }

    public a c() {
        return this.c;
    }

    public float d() {
        switch (this.c.ordinal()) {
            case 0:
                return this.d;
            case 1:
                return this.e;
            case 2:
            case 3:
                throw new RuntimeException("Color does not have a single color to interpolate");
            case 4:
                throw new RuntimeException("Cannot interpolate String");
            case 5:
                if (this.g) {
                    return 1.0f;
                }
                return 0.0f;
            case 6:
                return this.e;
            default:
                return Float.NaN;
        }
    }

    public void e(float[] fArr) {
        float f;
        switch (this.c.ordinal()) {
            case 0:
                fArr[0] = this.d;
                return;
            case 1:
                fArr[0] = this.e;
                return;
            case 2:
            case 3:
                int i2 = this.h;
                float pow = (float) Math.pow(((i2 >> 16) & 255) / 255.0f, 2.2d);
                float pow2 = (float) Math.pow(((i2 >> 8) & 255) / 255.0f, 2.2d);
                fArr[0] = pow;
                fArr[1] = pow2;
                fArr[2] = (float) Math.pow((i2 & 255) / 255.0f, 2.2d);
                fArr[3] = ((i2 >> 24) & 255) / 255.0f;
                return;
            case 4:
                throw new RuntimeException("Color does not have a single color to interpolate");
            case 5:
                if (this.g) {
                    f = 1.0f;
                } else {
                    f = 0.0f;
                }
                fArr[0] = f;
                return;
            case 6:
                fArr[0] = this.e;
                return;
            default:
                return;
        }
    }

    public boolean g() {
        int ordinal = this.c.ordinal();
        if (ordinal != 4 && ordinal != 5 && ordinal != 7) {
            return true;
        }
        return false;
    }

    public int h() {
        int ordinal = this.c.ordinal();
        if (ordinal != 2 && ordinal != 3) {
            return 1;
        }
        return 4;
    }

    public void i(int i2) {
        this.h = i2;
    }

    public void j(float f) {
        this.e = f;
    }

    public void k(int i2) {
        this.d = i2;
    }

    public void l(String str) {
        this.f = str;
    }

    public void m(Object obj) {
        switch (this.c.ordinal()) {
            case 0:
            case 7:
                this.d = ((Integer) obj).intValue();
                return;
            case 1:
                this.e = ((Float) obj).floatValue();
                return;
            case 2:
            case 3:
                this.h = ((Integer) obj).intValue();
                return;
            case 4:
                this.f = (String) obj;
                return;
            case 5:
                this.g = ((Boolean) obj).booleanValue();
                return;
            case 6:
                this.e = ((Float) obj).floatValue();
                return;
            default:
                return;
        }
    }

    public void n(float[] fArr) {
        boolean z = true;
        switch (this.c.ordinal()) {
            case 0:
            case 7:
                this.d = (int) fArr[0];
                return;
            case 1:
                this.e = fArr[0];
                return;
            case 2:
            case 3:
                int f = f(fArr[0], fArr[1], fArr[2]);
                this.h = f;
                this.h = (a((int) (fArr[3] * 255.0f)) << 24) | (f & C6516gH2.x);
                return;
            case 4:
                throw new RuntimeException("Color does not have a single color to interpolate");
            case 5:
                if (fArr[0] <= 0.5d) {
                    z = false;
                }
                this.g = z;
                return;
            case 6:
                this.e = fArr[0];
                return;
            default:
                return;
        }
    }

    public BS(String str, a aVar, Object obj, boolean z) {
        this.b = str;
        this.c = aVar;
        this.a = z;
        m(obj);
    }

    public BS(BS bs, Object obj) {
        this.a = false;
        this.b = bs.b;
        this.c = bs.c;
        m(obj);
    }
}
