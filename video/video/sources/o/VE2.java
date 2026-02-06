package o;

/* loaded from: classes3.dex */
public final class VE2 {
    public static final VE2[] h = a();
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final c f;
    public final int g;

    /* loaded from: classes3.dex */
    public static final class b {
        public final int a;
        public final int b;

        public int a() {
            return this.a;
        }

        public int b() {
            return this.b;
        }

        public b(int i, int i2) {
            this.a = i;
            this.b = i2;
        }
    }

    public VE2(int i, int i2, int i3, int i4, int i5, c cVar) {
        b[] a2;
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
        this.f = cVar;
        int b2 = cVar.b();
        int i6 = 0;
        for (b bVar : cVar.a()) {
            i6 += bVar.a() * (bVar.b() + b2);
        }
        this.g = i6;
    }

    public static VE2[] a() {
        return new VE2[]{new VE2(1, 10, 10, 8, 8, new c(5, new b(1, 3))), new VE2(2, 12, 12, 10, 10, new c(7, new b(1, 5))), new VE2(3, 14, 14, 12, 12, new c(10, new b(1, 8))), new VE2(4, 16, 16, 14, 14, new c(12, new b(1, 12))), new VE2(5, 18, 18, 16, 16, new c(14, new b(1, 18))), new VE2(6, 20, 20, 18, 18, new c(18, new b(1, 22))), new VE2(7, 22, 22, 20, 20, new c(20, new b(1, 30))), new VE2(8, 24, 24, 22, 22, new c(24, new b(1, 36))), new VE2(9, 26, 26, 24, 24, new c(28, new b(1, 44))), new VE2(10, 32, 32, 14, 14, new c(36, new b(1, 62))), new VE2(11, 36, 36, 16, 16, new c(42, new b(1, 86))), new VE2(12, 40, 40, 18, 18, new c(48, new b(1, 114))), new VE2(13, 44, 44, 20, 20, new c(56, new b(1, C3503Kz.h0))), new VE2(14, 48, 48, 22, 22, new c(68, new b(1, C10997yd1.y1))), new VE2(15, 52, 52, 24, 24, new c(42, new b(2, 102))), new VE2(16, 64, 64, 14, 14, new c(56, new b(2, C3503Kz.d0))), new VE2(17, 72, 72, 16, 16, new c(36, new b(4, 92))), new VE2(18, 80, 80, 18, 18, new c(48, new b(4, 114))), new VE2(19, 88, 88, 20, 20, new c(56, new b(4, C3503Kz.h0))), new VE2(20, 96, 96, 22, 22, new c(68, new b(4, C10997yd1.y1))), new VE2(21, 104, 104, 24, 24, new c(56, new b(6, 136))), new VE2(22, 120, 120, 18, 18, new c(68, new b(6, 175))), new VE2(23, C3503Kz.V, C3503Kz.V, 20, 20, new c(62, new b(8, C10997yd1.o1))), new VE2(24, C3503Kz.h0, C3503Kz.h0, 22, 22, new c(62, new b(8, C3503Kz.p0), new b(2, 155))), new VE2(25, 8, 18, 6, 16, new c(7, new b(1, 5))), new VE2(26, 8, 32, 6, 14, new c(11, new b(1, 10))), new VE2(27, 12, 26, 10, 24, new c(14, new b(1, 16))), new VE2(28, 12, 36, 10, 16, new c(18, new b(1, 22))), new VE2(29, 16, 36, 14, 16, new c(24, new b(1, 32))), new VE2(30, 16, 48, 14, 22, new c(28, new b(1, 49)))};
    }

    public static VE2 h(int i, int i2) throws C2605Bx0 {
        VE2[] ve2Arr;
        if ((i & 1) == 0 && (i2 & 1) == 0) {
            for (VE2 ve2 : h) {
                if (ve2.b == i && ve2.c == i2) {
                    return ve2;
                }
            }
            throw C2605Bx0.a();
        }
        throw C2605Bx0.a();
    }

    public int b() {
        return this.e;
    }

    public int c() {
        return this.d;
    }

    public c d() {
        return this.f;
    }

    public int e() {
        return this.c;
    }

    public int f() {
        return this.b;
    }

    public int g() {
        return this.g;
    }

    public int i() {
        return this.a;
    }

    public String toString() {
        return String.valueOf(this.a);
    }

    /* loaded from: classes3.dex */
    public static final class c {
        public final int a;
        public final b[] b;

        public b[] a() {
            return this.b;
        }

        public int b() {
            return this.a;
        }

        public c(int i, b bVar) {
            this.a = i;
            this.b = new b[]{bVar};
        }

        public c(int i, b bVar, b bVar2) {
            this.a = i;
            this.b = new b[]{bVar, bVar2};
        }
    }
}
