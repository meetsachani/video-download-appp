package o;

import com.google.firebase.crashlytics.internal.common.IdManager;
import java.util.ArrayList;
import o.C9872u01;
import o.Q92;

/* renamed from: o.He  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3130He implements C9872u01.a {
    public static final boolean g = false;
    public static final boolean h = false;
    public a e;
    public Q92 a = null;
    public float b = 0.0f;
    public boolean c = false;
    public ArrayList<Q92> d = new ArrayList<>();
    public boolean f = false;

    /* renamed from: o.He$a */
    /* loaded from: classes.dex */
    public interface a {
        void clear();

        int d();

        float e(Q92 q92);

        Q92 f(int i);

        float g(Q92 q92, boolean z);

        void h();

        void i(Q92 q92, float f);

        boolean j(Q92 q92);

        int k();

        void l();

        int m(Q92 q92);

        float n(int i);

        void o(Q92 q92, float f, boolean z);

        float p(C3130He c3130He, boolean z);

        void q(float f);
    }

    public C3130He() {
    }

    public Q92 A(Q92 q92) {
        return B(null, q92);
    }

    public final Q92 B(boolean[] zArr, Q92 q92) {
        Q92.a aVar;
        int d = this.e.d();
        Q92 q922 = null;
        float f = 0.0f;
        for (int i = 0; i < d; i++) {
            float n = this.e.n(i);
            if (n < 0.0f) {
                Q92 f2 = this.e.f(i);
                if ((zArr == null || !zArr[f2.Z]) && f2 != q92 && (((aVar = f2.e1) == Q92.a.SLACK || aVar == Q92.a.ERROR) && n < f)) {
                    f = n;
                    q922 = f2;
                }
            }
        }
        return q922;
    }

    public void C(Q92 q92) {
        Q92 q922 = this.a;
        if (q922 != null) {
            this.e.i(q922, -1.0f);
            this.a.Y0 = -1;
            this.a = null;
        }
        float g2 = this.e.g(q92, true) * (-1.0f);
        this.a = q92;
        if (g2 == 1.0f) {
            return;
        }
        this.b /= g2;
        this.e.q(g2);
    }

    public void D() {
        this.a = null;
        this.e.clear();
        this.b = 0.0f;
        this.f = false;
    }

    public int E() {
        int i;
        if (this.a != null) {
            i = 4;
        } else {
            i = 0;
        }
        return i + 8 + this.e.k();
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00d0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String F() {
        String str;
        boolean z;
        float n;
        int i;
        if (this.a == null) {
            str = "0";
        } else {
            str = "" + this.a;
        }
        String str2 = str + " = ";
        if (this.b != 0.0f) {
            str2 = str2 + this.b;
            z = true;
        } else {
            z = false;
        }
        int d = this.e.d();
        for (int i2 = 0; i2 < d; i2++) {
            Q92 f = this.e.f(i2);
            if (f != null && (this.e.n(i2)) != 0.0f) {
                String q92 = f.toString();
                if (!z) {
                    if (n < 0.0f) {
                        str2 = str2 + "- ";
                        n *= -1.0f;
                    }
                    if (n == 1.0f) {
                        str2 = str2 + q92;
                    } else {
                        str2 = str2 + n + C4500Ve2.b + q92;
                    }
                    z = true;
                } else if (i > 0) {
                    str2 = str2 + " + ";
                    if (n == 1.0f) {
                    }
                    z = true;
                } else {
                    str2 = str2 + " - ";
                    n *= -1.0f;
                    if (n == 1.0f) {
                    }
                    z = true;
                }
            }
        }
        if (!z) {
            return str2 + IdManager.g;
        }
        return str2;
    }

    public void G(C9872u01 c9872u01, Q92 q92, boolean z) {
        if (q92 != null && q92.i1) {
            float e = this.e.e(q92);
            this.b += q92.k1 * e;
            this.e.g(q92, z);
            if (z) {
                q92.m(this);
            }
            this.e.o(c9872u01.f880o.d[q92.j1], e, z);
            if (C9872u01.y && this.e.d() == 0) {
                this.f = true;
                c9872u01.b = true;
            }
        }
    }

    @Override // o.C9872u01.a
    public void a(C9872u01 c9872u01, Q92 q92, boolean z) {
        if (q92 != null && q92.b1) {
            this.b += q92.a1 * this.e.e(q92);
            this.e.g(q92, z);
            if (z) {
                q92.m(this);
            }
            if (C9872u01.y && this.e.d() == 0) {
                this.f = true;
                c9872u01.b = true;
            }
        }
    }

    @Override // o.C9872u01.a
    public Q92 b(C9872u01 c9872u01, boolean[] zArr) {
        return B(zArr, null);
    }

    @Override // o.C9872u01.a
    public void c(C9872u01.a aVar) {
        if (aVar instanceof C3130He) {
            C3130He c3130He = (C3130He) aVar;
            this.a = null;
            this.e.clear();
            for (int i = 0; i < c3130He.e.d(); i++) {
                this.e.o(c3130He.e.f(i), c3130He.e.n(i), true);
            }
        }
    }

    @Override // o.C9872u01.a
    public void clear() {
        this.e.clear();
        this.a = null;
        this.b = 0.0f;
    }

    @Override // o.C9872u01.a
    public void d(C9872u01 c9872u01, C3130He c3130He, boolean z) {
        this.b += c3130He.b * this.e.p(c3130He, z);
        if (z) {
            c3130He.a.m(this);
        }
        if (C9872u01.y && this.a != null && this.e.d() == 0) {
            this.f = true;
            c9872u01.b = true;
        }
    }

    @Override // o.C9872u01.a
    public void e(C9872u01 c9872u01) {
        if (c9872u01.h.length != 0) {
            boolean z = false;
            while (!z) {
                int d = this.e.d();
                for (int i = 0; i < d; i++) {
                    Q92 f = this.e.f(i);
                    if (f.Y0 != -1 || f.b1 || f.i1) {
                        this.d.add(f);
                    }
                }
                int size = this.d.size();
                if (size > 0) {
                    for (int i2 = 0; i2 < size; i2++) {
                        Q92 q92 = this.d.get(i2);
                        if (q92.b1) {
                            a(c9872u01, q92, true);
                        } else if (q92.i1) {
                            G(c9872u01, q92, true);
                        } else {
                            d(c9872u01, c9872u01.h[q92.Y0], true);
                        }
                    }
                    this.d.clear();
                } else {
                    z = true;
                }
            }
            if (C9872u01.y && this.a != null && this.e.d() == 0) {
                this.f = true;
                c9872u01.b = true;
            }
        }
    }

    @Override // o.C9872u01.a
    public void f(Q92 q92) {
        int i = q92.Z0;
        float f = 1.0f;
        if (i != 1) {
            if (i == 2) {
                f = 1000.0f;
            } else if (i == 3) {
                f = 1000000.0f;
            } else if (i == 4) {
                f = 1.0E9f;
            } else if (i == 5) {
                f = 1.0E12f;
            }
        }
        this.e.i(q92, f);
    }

    public C3130He g(C9872u01 c9872u01, int i) {
        this.e.i(c9872u01.q(i, "ep"), 1.0f);
        this.e.i(c9872u01.q(i, com.facebook.appevents.Q.k), -1.0f);
        return this;
    }

    @Override // o.C9872u01.a
    public Q92 getKey() {
        return this.a;
    }

    public C3130He h(Q92 q92, int i) {
        this.e.i(q92, i);
        return this;
    }

    public boolean i(C9872u01 c9872u01) {
        boolean z;
        Q92 j = j(c9872u01);
        if (j == null) {
            z = true;
        } else {
            C(j);
            z = false;
        }
        if (this.e.d() == 0) {
            this.f = true;
        }
        return z;
    }

    @Override // o.C9872u01.a
    public boolean isEmpty() {
        if (this.a == null && this.b == 0.0f && this.e.d() == 0) {
            return true;
        }
        return false;
    }

    public Q92 j(C9872u01 c9872u01) {
        boolean z;
        boolean z2;
        int d = this.e.d();
        Q92 q92 = null;
        float f = 0.0f;
        float f2 = 0.0f;
        boolean z3 = false;
        boolean z4 = false;
        Q92 q922 = null;
        for (int i = 0; i < d; i++) {
            float n = this.e.n(i);
            Q92 f3 = this.e.f(i);
            if (f3.e1 == Q92.a.UNRESTRICTED) {
                if (q92 == null) {
                    z2 = z(f3, c9872u01);
                } else if (f > n) {
                    z2 = z(f3, c9872u01);
                } else if (!z3 && z(f3, c9872u01)) {
                    f = n;
                    q92 = f3;
                    z3 = true;
                }
                z3 = z2;
                f = n;
                q92 = f3;
            } else if (q92 == null && n < 0.0f) {
                if (q922 == null) {
                    z = z(f3, c9872u01);
                } else if (f2 > n) {
                    z = z(f3, c9872u01);
                } else if (!z4 && z(f3, c9872u01)) {
                    f2 = n;
                    q922 = f3;
                    z4 = true;
                }
                z4 = z;
                f2 = n;
                q922 = f3;
            }
        }
        if (q92 != null) {
            return q92;
        }
        return q922;
    }

    public C3130He k(Q92 q92, Q92 q922, int i, float f, Q92 q923, Q92 q924, int i2) {
        if (q922 == q923) {
            this.e.i(q92, 1.0f);
            this.e.i(q924, 1.0f);
            this.e.i(q922, -2.0f);
            return this;
        }
        if (f == 0.5f) {
            this.e.i(q92, 1.0f);
            this.e.i(q922, -1.0f);
            this.e.i(q923, -1.0f);
            this.e.i(q924, 1.0f);
            if (i > 0 || i2 > 0) {
                this.b = (-i) + i2;
                return this;
            }
        } else if (f <= 0.0f) {
            this.e.i(q92, -1.0f);
            this.e.i(q922, 1.0f);
            this.b = i;
            return this;
        } else if (f >= 1.0f) {
            this.e.i(q924, -1.0f);
            this.e.i(q923, 1.0f);
            this.b = -i2;
            return this;
        } else {
            float f2 = 1.0f - f;
            this.e.i(q92, f2 * 1.0f);
            this.e.i(q922, f2 * (-1.0f));
            this.e.i(q923, (-1.0f) * f);
            this.e.i(q924, 1.0f * f);
            if (i > 0 || i2 > 0) {
                this.b = ((-i) * f2) + (i2 * f);
                return this;
            }
        }
        return this;
    }

    public C3130He l(Q92 q92, int i) {
        this.a = q92;
        float f = i;
        q92.a1 = f;
        this.b = f;
        this.f = true;
        return this;
    }

    public C3130He m(Q92 q92, Q92 q922, float f) {
        this.e.i(q92, -1.0f);
        this.e.i(q922, f);
        return this;
    }

    public C3130He n(Q92 q92, Q92 q922, Q92 q923, Q92 q924, float f) {
        this.e.i(q92, -1.0f);
        this.e.i(q922, 1.0f);
        this.e.i(q923, f);
        this.e.i(q924, -f);
        return this;
    }

    public C3130He o(float f, float f2, float f3, Q92 q92, int i, Q92 q922, int i2, Q92 q923, int i3, Q92 q924, int i4) {
        if (f2 != 0.0f && f != f3) {
            float f4 = (f / f2) / (f3 / f2);
            this.b = ((-i) - i2) + (i3 * f4) + (i4 * f4);
            this.e.i(q92, 1.0f);
            this.e.i(q922, -1.0f);
            this.e.i(q924, f4);
            this.e.i(q923, -f4);
            return this;
        }
        this.b = ((-i) - i2) + i3 + i4;
        this.e.i(q92, 1.0f);
        this.e.i(q922, -1.0f);
        this.e.i(q924, 1.0f);
        this.e.i(q923, -1.0f);
        return this;
    }

    public C3130He p(float f, float f2, float f3, Q92 q92, Q92 q922, Q92 q923, Q92 q924) {
        this.b = 0.0f;
        if (f2 != 0.0f && f != f3) {
            if (f == 0.0f) {
                this.e.i(q92, 1.0f);
                this.e.i(q922, -1.0f);
                return this;
            } else if (f3 == 0.0f) {
                this.e.i(q923, 1.0f);
                this.e.i(q924, -1.0f);
                return this;
            } else {
                float f4 = (f / f2) / (f3 / f2);
                this.e.i(q92, 1.0f);
                this.e.i(q922, -1.0f);
                this.e.i(q924, f4);
                this.e.i(q923, -f4);
                return this;
            }
        }
        this.e.i(q92, 1.0f);
        this.e.i(q922, -1.0f);
        this.e.i(q924, 1.0f);
        this.e.i(q923, -1.0f);
        return this;
    }

    public C3130He q(Q92 q92, int i) {
        if (i < 0) {
            this.b = i * (-1);
            this.e.i(q92, 1.0f);
            return this;
        }
        this.b = i;
        this.e.i(q92, -1.0f);
        return this;
    }

    public C3130He r(Q92 q92, Q92 q922, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.b = i;
        }
        if (!z) {
            this.e.i(q92, -1.0f);
            this.e.i(q922, 1.0f);
            return this;
        }
        this.e.i(q92, 1.0f);
        this.e.i(q922, -1.0f);
        return this;
    }

    public C3130He s(Q92 q92, int i, Q92 q922) {
        this.b = i;
        this.e.i(q92, -1.0f);
        return this;
    }

    public C3130He t(Q92 q92, Q92 q922, Q92 q923, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.b = i;
        }
        if (!z) {
            this.e.i(q92, -1.0f);
            this.e.i(q922, 1.0f);
            this.e.i(q923, 1.0f);
            return this;
        }
        this.e.i(q92, 1.0f);
        this.e.i(q922, -1.0f);
        this.e.i(q923, -1.0f);
        return this;
    }

    public String toString() {
        return F();
    }

    public C3130He u(Q92 q92, Q92 q922, Q92 q923, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.b = i;
        }
        if (!z) {
            this.e.i(q92, -1.0f);
            this.e.i(q922, 1.0f);
            this.e.i(q923, -1.0f);
            return this;
        }
        this.e.i(q92, 1.0f);
        this.e.i(q922, -1.0f);
        this.e.i(q923, 1.0f);
        return this;
    }

    public C3130He v(Q92 q92, Q92 q922, Q92 q923, Q92 q924, float f) {
        this.e.i(q923, 0.5f);
        this.e.i(q924, 0.5f);
        this.e.i(q92, -0.5f);
        this.e.i(q922, -0.5f);
        this.b = -f;
        return this;
    }

    public void w() {
        float f = this.b;
        if (f < 0.0f) {
            this.b = f * (-1.0f);
            this.e.h();
        }
    }

    public boolean x() {
        Q92 q92 = this.a;
        if (q92 != null) {
            if (q92.e1 == Q92.a.UNRESTRICTED || this.b >= 0.0f) {
                return true;
            }
            return false;
        }
        return false;
    }

    public boolean y(Q92 q92) {
        return this.e.j(q92);
    }

    public final boolean z(Q92 q92, C9872u01 c9872u01) {
        if (q92.h1 <= 1) {
            return true;
        }
        return false;
    }

    public C3130He(C5191at c5191at) {
        this.e = new C10024ue(this, c5191at);
    }
}
