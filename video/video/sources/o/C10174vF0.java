package o;

/* renamed from: o.vF0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C10174vF0 implements InterfaceC5156ak0, TP1 {
    public final C8068mc2 a;
    public int b;
    public C9445sF0 c;
    public int d = -1;
    public int e = -1;
    public float f = 0.0f;
    public Object g;

    public C10174vF0(C8068mc2 c8068mc2) {
        this.a = c8068mc2;
    }

    @Override // o.InterfaceC5156ak0, o.TP1
    public UK a() {
        if (this.c == null) {
            this.c = new C9445sF0();
        }
        return this.c;
    }

    @Override // o.InterfaceC5156ak0, o.TP1
    public void apply() {
        this.c.D2(this.b);
        int i = this.d;
        if (i != -1) {
            this.c.y2(i);
            return;
        }
        int i2 = this.e;
        if (i2 != -1) {
            this.c.z2(i2);
        } else {
            this.c.A2(this.f);
        }
    }

    @Override // o.TP1
    public void b(UK uk) {
        if (uk instanceof C9445sF0) {
            this.c = (C9445sF0) uk;
        } else {
            this.c = null;
        }
    }

    @Override // o.TP1
    public void c(Object obj) {
        this.g = obj;
    }

    @Override // o.TP1
    public InterfaceC5156ak0 d() {
        return null;
    }

    public C10174vF0 e(Object obj) {
        this.d = -1;
        this.e = this.a.g(obj);
        this.f = 0.0f;
        return this;
    }

    public int f() {
        return this.b;
    }

    public C10174vF0 g(float f) {
        this.d = -1;
        this.e = -1;
        this.f = f;
        return this;
    }

    @Override // o.TP1
    public Object getKey() {
        return this.g;
    }

    public void h(int i) {
        this.b = i;
    }

    public C10174vF0 i(Object obj) {
        this.d = this.a.g(obj);
        this.e = -1;
        this.f = 0.0f;
        return this;
    }
}
