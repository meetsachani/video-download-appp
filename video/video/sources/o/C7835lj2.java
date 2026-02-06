package o;

/* renamed from: o.lj2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C7835lj2 {
    public static final C7835lj2[] i;
    public static C7835lj2[] j;
    public final boolean a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;

    static {
        C7835lj2[] c7835lj2Arr = {new C7835lj2(false, 3, 5, 8, 8, 1), new C7835lj2(false, 5, 7, 10, 10, 1), new C7835lj2(true, 5, 7, 16, 6, 1), new C7835lj2(false, 8, 10, 12, 12, 1), new C7835lj2(true, 10, 11, 14, 6, 2), new C7835lj2(false, 12, 12, 14, 14, 1), new C7835lj2(true, 16, 14, 24, 10, 1), new C7835lj2(false, 18, 14, 16, 16, 1), new C7835lj2(false, 22, 18, 18, 18, 1), new C7835lj2(true, 22, 18, 16, 10, 2), new C7835lj2(false, 30, 20, 20, 20, 1), new C7835lj2(true, 32, 24, 16, 14, 2), new C7835lj2(false, 36, 24, 22, 22, 1), new C7835lj2(false, 44, 28, 24, 24, 1), new C7835lj2(true, 49, 28, 22, 14, 2), new C7835lj2(false, 62, 36, 14, 14, 4), new C7835lj2(false, 86, 42, 16, 16, 4), new C7835lj2(false, 114, 48, 18, 18, 4), new C7835lj2(false, C3503Kz.h0, 56, 20, 20, 4), new C7835lj2(false, C10997yd1.y1, 68, 22, 22, 4), new C7835lj2(false, 204, 84, 24, 24, 4, 102, 42), new C7835lj2(false, 280, 112, 14, 14, 16, C3503Kz.d0, 56), new C7835lj2(false, 368, C3503Kz.h0, 16, 16, 16, 92, 36), new C7835lj2(false, 456, CK1.x, 18, 18, 16, 114, 48), new C7835lj2(false, C3062Gl1.m, 224, 20, 20, 16, C3503Kz.h0, 56), new C7835lj2(false, 696, 272, 22, 22, 16, C10997yd1.y1, 68), new C7835lj2(false, 816, 336, 24, 24, 16, 136, 56), new C7835lj2(false, 1050, 408, 18, 18, 36, 175, 68), new C7835lj2(false, 1304, 496, 20, 20, 36, C10997yd1.o1, 62), new C10965yU()};
        i = c7835lj2Arr;
        j = c7835lj2Arr;
    }

    public C7835lj2(boolean z, int i2, int i3, int i4, int i5, int i6) {
        this(z, i2, i3, i4, i5, i6, i2, i3);
    }

    public static C7835lj2 m(int i2) {
        return p(i2, EnumC8096mj2.FORCE_NONE, true);
    }

    public static C7835lj2 n(int i2, EnumC8096mj2 enumC8096mj2) {
        return p(i2, enumC8096mj2, true);
    }

    public static C7835lj2 o(int i2, EnumC8096mj2 enumC8096mj2, C9883u30 c9883u30, C9883u30 c9883u302, boolean z) {
        C7835lj2[] c7835lj2Arr;
        for (C7835lj2 c7835lj2 : j) {
            if ((enumC8096mj2 != EnumC8096mj2.FORCE_SQUARE || !c7835lj2.a) && ((enumC8096mj2 != EnumC8096mj2.FORCE_RECTANGLE || c7835lj2.a) && ((c9883u30 == null || (c7835lj2.k() >= c9883u30.b() && c7835lj2.j() >= c9883u30.a())) && ((c9883u302 == null || (c7835lj2.k() <= c9883u302.b() && c7835lj2.j() <= c9883u302.a())) && i2 <= c7835lj2.b)))) {
                return c7835lj2;
            }
        }
        if (!z) {
            return null;
        }
        throw new IllegalArgumentException("Can't find a symbol arrangement that matches the message. Data codewords: ".concat(String.valueOf(i2)));
    }

    public static C7835lj2 p(int i2, EnumC8096mj2 enumC8096mj2, boolean z) {
        return o(i2, enumC8096mj2, null, null, z);
    }

    public static C7835lj2 q(int i2, boolean z, boolean z2) {
        EnumC8096mj2 enumC8096mj2;
        if (z) {
            enumC8096mj2 = EnumC8096mj2.FORCE_NONE;
        } else {
            enumC8096mj2 = EnumC8096mj2.FORCE_SQUARE;
        }
        return p(i2, enumC8096mj2, z2);
    }

    public static void r(C7835lj2[] c7835lj2Arr) {
        j = c7835lj2Arr;
    }

    public int a() {
        return this.b + this.c;
    }

    public final int b() {
        return this.b;
    }

    public int c(int i2) {
        return this.g;
    }

    public final int d() {
        return this.c;
    }

    public final int e(int i2) {
        return this.h;
    }

    public final int f() {
        int i2 = this.f;
        int i3 = 1;
        if (i2 != 1) {
            i3 = 2;
            if (i2 != 2 && i2 != 4) {
                if (i2 == 16) {
                    return 4;
                }
                if (i2 == 36) {
                    return 6;
                }
                throw new IllegalStateException("Cannot handle this number of data regions");
            }
        }
        return i3;
    }

    public int g() {
        return this.b / this.g;
    }

    public final int h() {
        return l() * this.e;
    }

    public final int i() {
        return f() * this.d;
    }

    public final int j() {
        return h() + (l() << 1);
    }

    public final int k() {
        return i() + (f() << 1);
    }

    public final int l() {
        int i2 = this.f;
        if (i2 == 1 || i2 == 2) {
            return 1;
        }
        if (i2 == 4) {
            return 2;
        }
        if (i2 == 16) {
            return 4;
        }
        if (i2 == 36) {
            return 6;
        }
        throw new IllegalStateException("Cannot handle this number of data regions");
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        if (this.a) {
            str = "Rectangular Symbol:";
        } else {
            str = "Square Symbol:";
        }
        sb.append(str);
        sb.append(" data region ");
        sb.append(this.d);
        sb.append('x');
        sb.append(this.e);
        sb.append(", symbol size ");
        sb.append(k());
        sb.append('x');
        sb.append(j());
        sb.append(", symbol data size ");
        sb.append(i());
        sb.append('x');
        sb.append(h());
        sb.append(", codewords ");
        sb.append(this.b);
        sb.append('+');
        sb.append(this.c);
        return sb.toString();
    }

    public C7835lj2(boolean z, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        this.a = z;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
        this.f = i6;
        this.g = i7;
        this.h = i8;
    }
}
