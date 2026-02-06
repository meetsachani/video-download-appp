package o;

import android.util.AndroidRuntimeException;
import o.D80;

/* renamed from: o.db2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5850db2 extends D80<C5850db2> {
    public static final float K = Float.MAX_VALUE;
    public C6092eb2 H;
    public float I;
    public boolean J;

    public C5850db2(C3100Gv0 c3100Gv0) {
        super(c3100Gv0);
        this.H = null;
        this.I = Float.MAX_VALUE;
        this.J = false;
    }

    @Override // o.D80
    public boolean B(long j) {
        if (this.J) {
            float f = this.I;
            if (f != Float.MAX_VALUE) {
                this.H.h(f);
                this.I = Float.MAX_VALUE;
            }
            this.b = this.H.d();
            this.a = 0.0f;
            this.J = false;
            return true;
        }
        if (this.I != Float.MAX_VALUE) {
            long j2 = j / 2;
            D80.p k = this.H.k(this.b, this.a, j2);
            this.H.h(this.I);
            this.I = Float.MAX_VALUE;
            D80.p k2 = this.H.k(k.a, k.b, j2);
            this.b = k2.a;
            this.a = k2.b;
        } else {
            D80.p k3 = this.H.k(this.b, this.a, j);
            this.b = k3.a;
            this.a = k3.b;
        }
        float max = Math.max(this.b, this.h);
        this.b = max;
        float min = Math.min(max, this.g);
        this.b = min;
        if (!l(min, this.a)) {
            return false;
        }
        this.b = this.H.d();
        this.a = 0.0f;
        return true;
    }

    public void C(float f) {
        if (m()) {
            this.I = f;
            return;
        }
        if (this.H == null) {
            this.H = new C6092eb2(f);
        }
        this.H.h(f);
        z();
    }

    public boolean D() {
        if (this.H.b > 0.0d) {
            return true;
        }
        return false;
    }

    public C6092eb2 E() {
        return this.H;
    }

    public final void F() {
        C6092eb2 c6092eb2 = this.H;
        if (c6092eb2 != null) {
            double d = c6092eb2.d();
            if (d <= this.g) {
                if (d >= this.h) {
                    return;
                }
                throw new UnsupportedOperationException("Final position of the spring cannot be less than the min value.");
            }
            throw new UnsupportedOperationException("Final position of the spring cannot be greater than the max value.");
        }
        throw new UnsupportedOperationException("Incomplete SpringAnimation: Either final position or a spring force needs to be set.");
    }

    public C5850db2 G(C6092eb2 c6092eb2) {
        this.H = c6092eb2;
        return this;
    }

    public void H() {
        if (D()) {
            if (g().k()) {
                if (this.f) {
                    this.J = true;
                    return;
                }
                return;
            }
            throw new AndroidRuntimeException("Animations may only be started on the same thread as the animation handler");
        }
        throw new UnsupportedOperationException("Spring animations can only come to an end when there is damping");
    }

    @Override // o.D80
    public void d() {
        super.d();
        float f = this.I;
        if (f != Float.MAX_VALUE) {
            C6092eb2 c6092eb2 = this.H;
            if (c6092eb2 == null) {
                this.H = new C6092eb2(f);
            } else {
                c6092eb2.h(f);
            }
            this.I = Float.MAX_VALUE;
        }
    }

    @Override // o.D80
    public float f(float f, float f2) {
        return this.H.b(f, f2);
    }

    @Override // o.D80
    public boolean l(float f, float f2) {
        return this.H.a(f, f2);
    }

    @Override // o.D80
    public void z() {
        F();
        this.H.j(k());
        super.z();
    }

    public C5850db2(C3100Gv0 c3100Gv0, float f) {
        super(c3100Gv0);
        this.H = null;
        this.I = Float.MAX_VALUE;
        this.J = false;
        this.H = new C6092eb2(f);
    }

    public <K> C5850db2(K k, AbstractC11311zv0<K> abstractC11311zv0) {
        super(k, abstractC11311zv0);
        this.H = null;
        this.I = Float.MAX_VALUE;
        this.J = false;
    }

    public <K> C5850db2(K k, AbstractC11311zv0<K> abstractC11311zv0, float f) {
        super(k, abstractC11311zv0);
        this.H = null;
        this.I = Float.MAX_VALUE;
        this.J = false;
        this.H = new C6092eb2(f);
    }

    @Override // o.D80
    public void y(float f) {
    }
}
