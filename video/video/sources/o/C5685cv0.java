package o;

import o.D80;

/* renamed from: o.cv0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5685cv0 extends D80<C5685cv0> {
    public final a H;

    /* renamed from: o.cv0$a */
    /* loaded from: classes.dex */
    public static final class a implements InterfaceC7160ix0 {
        public static final float d = -4.2f;
        public static final float e = 62.5f;
        public float b;
        public float a = -4.2f;
        public final D80.p c = new D80.p();

        @Override // o.InterfaceC7160ix0
        public boolean a(float f, float f2) {
            if (Math.abs(f2) < this.b) {
                return true;
            }
            return false;
        }

        @Override // o.InterfaceC7160ix0
        public float b(float f, float f2) {
            return f2 * this.a;
        }

        public float c() {
            return this.a / (-4.2f);
        }

        public void d(float f) {
            this.a = f * (-4.2f);
        }

        public void e(float f) {
            this.b = f * 62.5f;
        }

        public D80.p f(float f, float f2, long j) {
            this.c.b = (float) (f2 * Math.exp((((float) j) / 1000.0f) * this.a));
            D80.p pVar = this.c;
            float f3 = pVar.b;
            float f4 = f + ((f3 - f2) / this.a);
            pVar.a = f4;
            if (a(f4, f3)) {
                this.c.b = 0.0f;
            }
            return this.c;
        }
    }

    public C5685cv0(C3100Gv0 c3100Gv0) {
        super(c3100Gv0);
        a aVar = new a();
        this.H = aVar;
        aVar.e(k());
    }

    @Override // o.D80
    public boolean B(long j) {
        D80.p f = this.H.f(this.b, this.a, j);
        float f2 = f.a;
        this.b = f2;
        float f3 = f.b;
        this.a = f3;
        float f4 = this.h;
        if (f2 < f4) {
            this.b = f4;
            return true;
        }
        float f5 = this.g;
        if (f2 > f5) {
            this.b = f5;
            return true;
        } else if (l(f2, f3)) {
            return true;
        } else {
            return false;
        }
    }

    public float C() {
        return this.H.c();
    }

    public C5685cv0 D(float f) {
        if (f > 0.0f) {
            this.H.d(f);
            return this;
        }
        throw new IllegalArgumentException("Friction must be positive");
    }

    @Override // o.D80
    /* renamed from: E */
    public C5685cv0 r(float f) {
        super.r(f);
        return this;
    }

    @Override // o.D80
    /* renamed from: F */
    public C5685cv0 s(float f) {
        super.s(f);
        return this;
    }

    @Override // o.D80
    /* renamed from: G */
    public C5685cv0 x(float f) {
        super.x(f);
        return this;
    }

    @Override // o.D80
    public float f(float f, float f2) {
        return this.H.b(f, f2);
    }

    @Override // o.D80
    public boolean l(float f, float f2) {
        if (f < this.g && f > this.h && !this.H.a(f, f2)) {
            return false;
        }
        return true;
    }

    @Override // o.D80
    public void y(float f) {
        this.H.e(f);
    }

    public <K> C5685cv0(K k, AbstractC11311zv0<K> abstractC11311zv0) {
        super(k, abstractC11311zv0);
        a aVar = new a();
        this.H = aVar;
        aVar.e(k());
    }
}
