package com.google.android.material.carousel;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import o.C5600ca;
import o.HT1;
import o.InterfaceC11300zs1;
import o.InterfaceC2501Av0;
import o.InterfaceC5670cr1;
import o.InterfaceC6181ey;

@HT1({HT1.a.Y})
/* loaded from: classes3.dex */
public final class c {
    public final float a;
    public int b;
    public final List<C0122c> c;
    public final int d;
    public final int e;
    public final int f;

    /* loaded from: classes3.dex */
    public static final class b {
        public static final int j = -1;
        public static final float k = Float.MIN_VALUE;
        public final float a;
        public final int b;
        public C0122c d;
        public C0122c e;
        public final List<C0122c> c = new ArrayList();
        public int f = -1;
        public int g = -1;
        public float h = 0.0f;
        public int i = -1;

        public b(float f, int i) {
            this.a = f;
            this.b = i;
        }

        public static float j(float f, float f2, int i, int i2) {
            return (f - (i * f2)) + (i2 * f2);
        }

        @InterfaceC6181ey
        @InterfaceC5670cr1
        public b a(float f, @InterfaceC2501Av0(from = 0.0d, to = 1.0d) float f2, float f3) {
            return d(f, f2, f3, false, true);
        }

        @InterfaceC6181ey
        @InterfaceC5670cr1
        public b b(float f, @InterfaceC2501Av0(from = 0.0d, to = 1.0d) float f2, float f3) {
            return c(f, f2, f3, false);
        }

        @InterfaceC6181ey
        @InterfaceC5670cr1
        public b c(float f, @InterfaceC2501Av0(from = 0.0d, to = 1.0d) float f2, float f3, boolean z) {
            return d(f, f2, f3, z, false);
        }

        @InterfaceC6181ey
        @InterfaceC5670cr1
        public b d(float f, @InterfaceC2501Av0(from = 0.0d, to = 1.0d) float f2, float f3, boolean z, boolean z2) {
            float f4;
            float f5 = f3 / 2.0f;
            float f6 = f - f5;
            float f7 = f5 + f;
            int i = this.b;
            if (f7 > i) {
                f4 = Math.abs(f7 - Math.max(f7 - f3, i));
            } else {
                f4 = 0.0f;
                if (f6 < 0.0f) {
                    f4 = Math.abs(f6 - Math.min(f6 + f3, 0.0f));
                }
            }
            return e(f, f2, f3, z, z2, f4);
        }

        @InterfaceC6181ey
        @InterfaceC5670cr1
        public b e(float f, @InterfaceC2501Av0(from = 0.0d, to = 1.0d) float f2, float f3, boolean z, boolean z2, float f4) {
            return f(f, f2, f3, z, z2, f4, 0.0f, 0.0f);
        }

        @InterfaceC6181ey
        @InterfaceC5670cr1
        public b f(float f, @InterfaceC2501Av0(from = 0.0d, to = 1.0d) float f2, float f3, boolean z, boolean z2, float f4, float f5, float f6) {
            if (f3 <= 0.0f) {
                return this;
            }
            if (z2) {
                if (!z) {
                    int i = this.i;
                    if (i != -1 && i != 0) {
                        throw new IllegalArgumentException("Anchor keylines must be either the first or last keyline.");
                    }
                    this.i = this.c.size();
                } else {
                    throw new IllegalArgumentException("Anchor keylines cannot be focal.");
                }
            }
            C0122c c0122c = new C0122c(Float.MIN_VALUE, f, f2, f3, z2, f4, f5, f6);
            if (z) {
                if (this.d == null) {
                    this.d = c0122c;
                    this.f = this.c.size();
                }
                if (this.g != -1 && this.c.size() - this.g > 1) {
                    throw new IllegalArgumentException("Keylines marked as focal must be placed next to each other. There cannot be non-focal keylines between focal keylines.");
                }
                if (f3 == this.d.d) {
                    this.e = c0122c;
                    this.g = this.c.size();
                } else {
                    throw new IllegalArgumentException("Keylines that are marked as focal must all have the same masked item size.");
                }
            } else if (this.d == null && c0122c.d < this.h) {
                throw new IllegalArgumentException("Keylines before the first focal keyline must be ordered by incrementing masked item size.");
            } else {
                if (this.e != null && c0122c.d > this.h) {
                    throw new IllegalArgumentException("Keylines after the last focal keyline must be ordered by decreasing masked item size.");
                }
            }
            this.h = c0122c.d;
            this.c.add(c0122c);
            return this;
        }

        @InterfaceC6181ey
        @InterfaceC5670cr1
        public b g(float f, @InterfaceC2501Av0(from = 0.0d, to = 1.0d) float f2, float f3, int i) {
            return h(f, f2, f3, i, false);
        }

        @InterfaceC6181ey
        @InterfaceC5670cr1
        public b h(float f, @InterfaceC2501Av0(from = 0.0d, to = 1.0d) float f2, float f3, int i, boolean z) {
            if (i > 0 && f3 > 0.0f) {
                for (int i2 = 0; i2 < i; i2++) {
                    c((i2 * f3) + f, f2, f3, z);
                }
            }
            return this;
        }

        @InterfaceC5670cr1
        public c i() {
            if (this.d != null) {
                ArrayList arrayList = new ArrayList();
                for (int i = 0; i < this.c.size(); i++) {
                    C0122c c0122c = this.c.get(i);
                    arrayList.add(new C0122c(j(this.d.b, this.a, this.f, i), c0122c.b, c0122c.c, c0122c.d, c0122c.e, c0122c.f, c0122c.g, c0122c.h));
                }
                return new c(this.a, arrayList, this.f, this.g, this.b);
            }
            throw new IllegalStateException("There must be a keyline marked as focal.");
        }
    }

    /* renamed from: com.google.android.material.carousel.c$c  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static final class C0122c {
        public final float a;
        public final float b;
        public final float c;
        public final float d;
        public final boolean e;
        public final float f;
        public final float g;
        public final float h;

        public C0122c(float f, float f2, float f3, float f4) {
            this(f, f2, f3, f4, false, 0.0f, 0.0f, 0.0f);
        }

        public static C0122c a(C0122c c0122c, C0122c c0122c2, @InterfaceC2501Av0(from = 0.0d, to = 1.0d) float f) {
            return new C0122c(C5600ca.a(c0122c.a, c0122c2.a, f), C5600ca.a(c0122c.b, c0122c2.b, f), C5600ca.a(c0122c.c, c0122c2.c, f), C5600ca.a(c0122c.d, c0122c2.d, f));
        }

        public C0122c(float f, float f2, float f3, float f4, boolean z, float f5, float f6, float f7) {
            this.a = f;
            this.b = f2;
            this.c = f3;
            this.d = f4;
            this.e = z;
            this.f = f5;
            this.g = f6;
            this.h = f7;
        }
    }

    public static c o(c cVar, c cVar2, float f) {
        if (cVar.g() == cVar2.g()) {
            List<C0122c> h = cVar.h();
            List<C0122c> h2 = cVar2.h();
            if (h.size() == h2.size()) {
                ArrayList arrayList = new ArrayList();
                for (int i = 0; i < cVar.h().size(); i++) {
                    arrayList.add(C0122c.a(h.get(i), h2.get(i), f));
                }
                return new c(cVar.g(), arrayList, C5600ca.c(cVar.c(), cVar2.c(), f), C5600ca.c(cVar.j(), cVar2.j(), f), cVar.f);
            }
            throw new IllegalArgumentException("Keylines being linearly interpolated must have the same number of keylines.");
        }
        throw new IllegalArgumentException("Keylines being linearly interpolated must have the same item size.");
    }

    public static c p(c cVar, int i) {
        boolean z;
        b bVar = new b(cVar.g(), i);
        float f = (i - cVar.k().b) - (cVar.k().d / 2.0f);
        for (int size = cVar.h().size() - 1; size >= 0; size--) {
            C0122c c0122c = cVar.h().get(size);
            float f2 = (c0122c.d / 2.0f) + f;
            if (size >= cVar.c() && size <= cVar.j()) {
                z = true;
            } else {
                z = false;
            }
            bVar.d(f2, c0122c.c, c0122c.d, z, c0122c.e);
            f += c0122c.d;
        }
        return bVar.i();
    }

    public int a() {
        return this.f;
    }

    public C0122c b() {
        return this.c.get(this.d);
    }

    public int c() {
        return this.d;
    }

    public C0122c d() {
        return this.c.get(0);
    }

    @InterfaceC11300zs1
    public C0122c e() {
        for (int i = 0; i < this.c.size(); i++) {
            C0122c c0122c = this.c.get(i);
            if (!c0122c.e) {
                return c0122c;
            }
        }
        return null;
    }

    public List<C0122c> f() {
        return this.c.subList(this.d, this.e + 1);
    }

    public float g() {
        return this.a;
    }

    public List<C0122c> h() {
        return this.c;
    }

    public C0122c i() {
        return this.c.get(this.e);
    }

    public int j() {
        return this.e;
    }

    public C0122c k() {
        List<C0122c> list = this.c;
        return list.get(list.size() - 1);
    }

    @InterfaceC11300zs1
    public C0122c l() {
        for (int size = this.c.size() - 1; size >= 0; size--) {
            C0122c c0122c = this.c.get(size);
            if (!c0122c.e) {
                return c0122c;
            }
        }
        return null;
    }

    public int m() {
        int i = 0;
        for (C0122c c0122c : this.c) {
            if (c0122c.e) {
                i++;
            }
        }
        return this.c.size() - i;
    }

    public int n() {
        return this.b;
    }

    public c(float f, List<C0122c> list, int i, int i2, int i3) {
        this.a = f;
        this.c = Collections.unmodifiableList(list);
        this.d = i;
        this.e = i2;
        while (i <= i2) {
            if (list.get(i).f == 0.0f) {
                this.b++;
            }
            i++;
        }
        this.f = i3;
    }
}
