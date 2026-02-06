package o;

import java.math.RoundingMode;
import o.C5594cY;

@Deprecated
/* renamed from: o.iY  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C7063iY implements C5594cY.f {
    public static final int h = 250000;
    public static final int i = 750000;
    public static final int j = 4;
    public static final int k = 250000;
    public static final int l = 50000000;
    public static final int m = 2;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;

    /* renamed from: o.iY$a */
    /* loaded from: classes2.dex */
    public static class a {
        public int a = 250000;
        public int b = C7063iY.i;
        public int c = 4;
        public int d = 250000;
        public int e = C7063iY.l;
        public int f = 2;

        public C7063iY g() {
            return new C7063iY(this);
        }

        @InterfaceC6181ey
        public a h(int i) {
            this.f = i;
            return this;
        }

        @InterfaceC6181ey
        public a i(int i) {
            this.b = i;
            return this;
        }

        @InterfaceC6181ey
        public a j(int i) {
            this.a = i;
            return this;
        }

        @InterfaceC6181ey
        public a k(int i) {
            this.e = i;
            return this;
        }

        @InterfaceC6181ey
        public a l(int i) {
            this.d = i;
            return this;
        }

        @InterfaceC6181ey
        public a m(int i) {
            this.c = i;
            return this;
        }
    }

    public C7063iY(a aVar) {
        this.b = aVar.a;
        this.c = aVar.b;
        this.d = aVar.c;
        this.e = aVar.d;
        this.f = aVar.e;
        this.g = aVar.f;
    }

    public static int b(int i2, int i3, int i4) {
        return C7775lT0.d(((i2 * i3) * i4) / 1000000);
    }

    public static int d(int i2) {
        switch (i2) {
            case 5:
                return I3.a;
            case 6:
            case 18:
                return I3.b;
            case 7:
                return O70.a;
            case 8:
                return O70.b;
            case 9:
                return C3062Gl1.b;
            case 10:
                return 100000;
            case 11:
                return 16000;
            case 12:
                return 7000;
            case 13:
            case 19:
            default:
                throw new IllegalArgumentException();
            case 14:
                return I3.c;
            case 15:
                return 8000;
            case 16:
                return G.i;
            case 17:
                return M3.c;
            case 20:
                return C6418fw1.b;
        }
    }

    @Override // o.C5594cY.f
    public int a(int i2, int i3, int i4, int i5, int i6, int i7, double d) {
        return (((Math.max(i2, (int) (c(i2, i3, i4, i5, i6, i7) * d)) + i5) - 1) / i5) * i5;
    }

    public int c(int i2, int i3, int i4, int i5, int i6, int i7) {
        if (i4 != 0) {
            if (i4 != 1) {
                if (i4 == 2) {
                    return f(i3, i7);
                }
                throw new IllegalArgumentException();
            }
            return e(i3);
        }
        return g(i2, i6, i5);
    }

    public int e(int i2) {
        return C7775lT0.d((this.f * d(i2)) / 1000000);
    }

    public int f(int i2, int i3) {
        int d;
        int i4 = this.e;
        if (i2 == 5) {
            i4 *= this.g;
        }
        if (i3 != -1) {
            d = C9979uR0.g(i3, 8, RoundingMode.CEILING);
        } else {
            d = d(i2);
        }
        return C7775lT0.d((i4 * d) / 1000000);
    }

    public int g(int i2, int i3, int i4) {
        return TD2.w(i2 * this.d, b(this.b, i3, i4), b(this.c, i3, i4));
    }
}
