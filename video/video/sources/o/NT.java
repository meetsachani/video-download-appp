package o;

import o.InterfaceC8148mw2;

/* loaded from: classes.dex */
public class NT {
    public static final String g = "TransitionLayout";
    public String a;
    public int b;
    public int c;
    public float d;
    public String e;
    public boolean f;

    public NT(NT nt) {
        this.c = Integer.MIN_VALUE;
        this.d = Float.NaN;
        this.e = null;
        this.a = nt.a;
        this.b = nt.b;
        this.c = nt.c;
        this.d = nt.d;
        this.e = nt.e;
        this.f = nt.f;
    }

    public static int b(int i) {
        int i2 = (i & (~(i >> 31))) - 255;
        return (i2 & (i2 >> 31)) + 255;
    }

    public static String c(int i) {
        String str = "00000000" + Integer.toHexString(i);
        return "#" + str.substring(str.length() - 8);
    }

    public static int p(float f, float f2, float f3) {
        float f4 = f * 6.0f;
        int i = (int) f4;
        float f5 = f4 - i;
        float f6 = f3 * 255.0f;
        int i2 = (int) (((1.0f - f2) * f6) + 0.5f);
        int i3 = (int) (((1.0f - (f5 * f2)) * f6) + 0.5f);
        int i4 = (int) (((1.0f - ((1.0f - f5) * f2)) * f6) + 0.5f);
        int i5 = (int) (f6 + 0.5f);
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i != 5) {
                                return 0;
                            }
                            return ((i5 << 16) + (i2 << 8) + i3) | (-16777216);
                        }
                        return ((i4 << 16) + (i2 << 8) + i5) | (-16777216);
                    }
                    return ((i2 << 16) + (i3 << 8) + i5) | (-16777216);
                }
                return ((i2 << 16) + (i5 << 8) + i4) | (-16777216);
            }
            return ((i3 << 16) + (i5 << 8) + i2) | (-16777216);
        }
        return ((i5 << 16) + (i4 << 8) + i2) | (-16777216);
    }

    public static int s(float f, float f2, float f3, float f4) {
        int b = b((int) (f * 255.0f));
        int b2 = b((int) (f2 * 255.0f));
        return (b << 16) | (b((int) (f4 * 255.0f)) << 24) | (b2 << 8) | b((int) (f3 * 255.0f));
    }

    public void a(C10054ul1 c10054ul1) {
        int i = this.b;
        switch (i) {
            case 900:
            case 902:
            case InterfaceC8148mw2.b.p /* 906 */:
                c10054ul1.J(this.a, i, this.c);
                return;
            case 901:
            case InterfaceC8148mw2.b.f812o /* 905 */:
                c10054ul1.I(this.a, i, this.d);
                return;
            case InterfaceC8148mw2.b.m /* 903 */:
                c10054ul1.K(this.a, i, this.e);
                return;
            case InterfaceC8148mw2.b.n /* 904 */:
                c10054ul1.L(this.a, i, this.f);
                return;
            default:
                return;
        }
    }

    public NT d() {
        return new NT(this);
    }

    public boolean e(NT nt) {
        int i;
        if (nt != null && (i = this.b) == nt.b) {
            switch (i) {
                case 900:
                case InterfaceC8148mw2.b.p /* 906 */:
                    if (this.c == nt.c) {
                        return true;
                    }
                    break;
                case 901:
                    if (this.d != nt.d) {
                        return false;
                    }
                    return true;
                case 902:
                    if (this.c != nt.c) {
                        return false;
                    }
                    return true;
                case InterfaceC8148mw2.b.m /* 903 */:
                    if (this.c != nt.c) {
                        return false;
                    }
                    return true;
                case InterfaceC8148mw2.b.n /* 904 */:
                    if (this.f != nt.f) {
                        return false;
                    }
                    return true;
                case InterfaceC8148mw2.b.f812o /* 905 */:
                    if (this.d != nt.d) {
                        return false;
                    }
                    return true;
                default:
                    return false;
            }
        }
        return false;
    }

    public boolean f() {
        return this.f;
    }

    public int g() {
        return this.c;
    }

    public float h() {
        return this.d;
    }

    public int i() {
        return this.c;
    }

    public int j(float[] fArr) {
        int b = b((int) (((float) Math.pow(fArr[0], 0.45454545454545453d)) * 255.0f));
        int b2 = b((int) (((float) Math.pow(fArr[1], 0.45454545454545453d)) * 255.0f));
        return (b((int) (fArr[3] * 255.0f)) << 24) | (b << 16) | (b2 << 8) | b((int) (((float) Math.pow(fArr[2], 0.45454545454545453d)) * 255.0f));
    }

    public String k() {
        return this.a;
    }

    public String l() {
        return this.e;
    }

    public int m() {
        return this.b;
    }

    public float n() {
        switch (this.b) {
            case 900:
                return this.c;
            case 901:
                return this.d;
            case 902:
                throw new RuntimeException("Color does not have a single color to interpolate");
            case InterfaceC8148mw2.b.m /* 903 */:
                throw new RuntimeException("Cannot interpolate String");
            case InterfaceC8148mw2.b.n /* 904 */:
                if (this.f) {
                    return 1.0f;
                }
                return 0.0f;
            case InterfaceC8148mw2.b.f812o /* 905 */:
                return this.d;
            default:
                return Float.NaN;
        }
    }

    public void o(float[] fArr) {
        float f;
        switch (this.b) {
            case 900:
                fArr[0] = this.c;
                return;
            case 901:
                fArr[0] = this.d;
                return;
            case 902:
                int i = this.c;
                float pow = (float) Math.pow(((i >> 16) & 255) / 255.0f, 2.2d);
                float pow2 = (float) Math.pow(((i >> 8) & 255) / 255.0f, 2.2d);
                fArr[0] = pow;
                fArr[1] = pow2;
                fArr[2] = (float) Math.pow((i & 255) / 255.0f, 2.2d);
                fArr[3] = ((i >> 24) & 255) / 255.0f;
                return;
            case InterfaceC8148mw2.b.m /* 903 */:
                throw new RuntimeException("Cannot interpolate String");
            case InterfaceC8148mw2.b.n /* 904 */:
                if (this.f) {
                    f = 1.0f;
                } else {
                    f = 0.0f;
                }
                fArr[0] = f;
                return;
            case InterfaceC8148mw2.b.f812o /* 905 */:
                fArr[0] = this.d;
                return;
            default:
                return;
        }
    }

    public boolean q() {
        int i = this.b;
        if (i != 903 && i != 904 && i != 906) {
            return true;
        }
        return false;
    }

    public int r() {
        if (this.b != 902) {
            return 1;
        }
        return 4;
    }

    public void t(boolean z) {
        this.f = z;
    }

    public String toString() {
        String str = this.a + ':';
        switch (this.b) {
            case 900:
                return str + this.c;
            case 901:
                return str + this.d;
            case 902:
                return str + c(this.c);
            case InterfaceC8148mw2.b.m /* 903 */:
                return str + this.e;
            case InterfaceC8148mw2.b.n /* 904 */:
                return str + Boolean.valueOf(this.f);
            case InterfaceC8148mw2.b.f812o /* 905 */:
                return str + this.d;
            default:
                return str + "????";
        }
    }

    public void u(float f) {
        this.d = f;
    }

    public void v(int i) {
        this.c = i;
    }

    public void w(C10054ul1 c10054ul1, float[] fArr) {
        int i = this.b;
        boolean z = true;
        switch (i) {
            case 900:
                c10054ul1.J(this.a, i, (int) fArr[0]);
                return;
            case 901:
            case InterfaceC8148mw2.b.f812o /* 905 */:
                c10054ul1.I(this.a, i, fArr[0]);
                return;
            case 902:
                int b = b((int) (((float) Math.pow(fArr[0], 0.45454545454545453d)) * 255.0f));
                int b2 = b((int) (((float) Math.pow(fArr[1], 0.45454545454545453d)) * 255.0f));
                c10054ul1.J(this.a, this.b, (b((int) (fArr[3] * 255.0f)) << 24) | (b << 16) | (b2 << 8) | b((int) (((float) Math.pow(fArr[2], 0.45454545454545453d)) * 255.0f)));
                return;
            case InterfaceC8148mw2.b.m /* 903 */:
            case InterfaceC8148mw2.b.p /* 906 */:
                throw new RuntimeException("unable to interpolate " + this.a);
            case InterfaceC8148mw2.b.n /* 904 */:
                String str = this.a;
                if (fArr[0] <= 0.5f) {
                    z = false;
                }
                c10054ul1.L(str, i, z);
                return;
            default:
                return;
        }
    }

    public void x(String str) {
        this.e = str;
    }

    public void y(Object obj) {
        switch (this.b) {
            case 900:
            case InterfaceC8148mw2.b.p /* 906 */:
                this.c = ((Integer) obj).intValue();
                return;
            case 901:
                this.d = ((Float) obj).floatValue();
                return;
            case 902:
                this.c = ((Integer) obj).intValue();
                return;
            case InterfaceC8148mw2.b.m /* 903 */:
                this.e = (String) obj;
                return;
            case InterfaceC8148mw2.b.n /* 904 */:
                this.f = ((Boolean) obj).booleanValue();
                return;
            case InterfaceC8148mw2.b.f812o /* 905 */:
                this.d = ((Float) obj).floatValue();
                return;
            default:
                return;
        }
    }

    public void z(float[] fArr) {
        boolean z = true;
        switch (this.b) {
            case 900:
            case InterfaceC8148mw2.b.p /* 906 */:
                this.c = (int) fArr[0];
                return;
            case 901:
            case InterfaceC8148mw2.b.f812o /* 905 */:
                this.d = fArr[0];
                return;
            case 902:
                this.c = ((Math.round(fArr[3] * 255.0f) & 255) << 24) | ((Math.round(((float) Math.pow(fArr[0], 0.5d)) * 255.0f) & 255) << 16) | ((Math.round(((float) Math.pow(fArr[1], 0.5d)) * 255.0f) & 255) << 8) | (Math.round(((float) Math.pow(fArr[2], 0.5d)) * 255.0f) & 255);
                return;
            case InterfaceC8148mw2.b.m /* 903 */:
                throw new RuntimeException("Cannot interpolate String");
            case InterfaceC8148mw2.b.n /* 904 */:
                if (fArr[0] <= 0.5d) {
                    z = false;
                }
                this.f = z;
                return;
            default:
                return;
        }
    }

    public NT(String str, int i, String str2) {
        this.c = Integer.MIN_VALUE;
        this.d = Float.NaN;
        this.a = str;
        this.b = i;
        this.e = str2;
    }

    public NT(String str, int i, int i2) {
        this.c = Integer.MIN_VALUE;
        this.d = Float.NaN;
        this.e = null;
        this.a = str;
        this.b = i;
        if (i == 901) {
            this.d = i2;
        } else {
            this.c = i2;
        }
    }

    public NT(String str, int i, float f) {
        this.c = Integer.MIN_VALUE;
        this.e = null;
        this.a = str;
        this.b = i;
        this.d = f;
    }

    public NT(String str, int i, boolean z) {
        this.c = Integer.MIN_VALUE;
        this.d = Float.NaN;
        this.e = null;
        this.a = str;
        this.b = i;
        this.f = z;
    }

    public NT(String str, int i) {
        this.c = Integer.MIN_VALUE;
        this.d = Float.NaN;
        this.e = null;
        this.a = str;
        this.b = i;
    }

    public NT(String str, int i, Object obj) {
        this.c = Integer.MIN_VALUE;
        this.d = Float.NaN;
        this.e = null;
        this.a = str;
        this.b = i;
        y(obj);
    }

    public NT(NT nt, Object obj) {
        this.c = Integer.MIN_VALUE;
        this.d = Float.NaN;
        this.e = null;
        this.a = nt.a;
        this.b = nt.b;
        y(obj);
    }
}
