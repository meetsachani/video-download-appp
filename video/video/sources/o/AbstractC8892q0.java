package o;

import android.util.Pair;
import o.AbstractC7373jp2;

@Deprecated
/* renamed from: o.q0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC8892q0 extends AbstractC7373jp2 {
    public final int a1;
    public final U52 b1;
    public final boolean c1;

    public AbstractC8892q0(boolean z, U52 u52) {
        this.c1 = z;
        this.b1 = u52;
        this.a1 = u52.getLength();
    }

    public static Object D(Object obj) {
        return ((Pair) obj).second;
    }

    public static Object E(Object obj) {
        return ((Pair) obj).first;
    }

    public static Object G(Object obj, Object obj2) {
        return Pair.create(obj, obj2);
    }

    public abstract int A(Object obj);

    public abstract int B(int i);

    public abstract int C(int i);

    public abstract Object F(int i);

    public abstract int H(int i);

    public abstract int I(int i);

    public final int J(int i, boolean z) {
        if (z) {
            return this.b1.c(i);
        }
        if (i < this.a1 - 1) {
            return i + 1;
        }
        return -1;
    }

    public final int K(int i, boolean z) {
        if (z) {
            return this.b1.b(i);
        }
        if (i > 0) {
            return i - 1;
        }
        return -1;
    }

    public abstract AbstractC7373jp2 L(int i);

    @Override // o.AbstractC7373jp2
    public int f(boolean z) {
        if (this.a1 == 0) {
            return -1;
        }
        int i = 0;
        if (this.c1) {
            z = false;
        }
        if (z) {
            i = this.b1.f();
        }
        while (L(i).x()) {
            i = J(i, z);
            if (i == -1) {
                return -1;
            }
        }
        return I(i) + L(i).f(z);
    }

    @Override // o.AbstractC7373jp2
    public final int g(Object obj) {
        int g;
        if (!(obj instanceof Pair)) {
            return -1;
        }
        Object E = E(obj);
        Object D = D(obj);
        int A = A(E);
        if (A == -1 || (g = L(A).g(D)) == -1) {
            return -1;
        }
        return H(A) + g;
    }

    @Override // o.AbstractC7373jp2
    public int h(boolean z) {
        int i;
        int i2 = this.a1;
        if (i2 == 0) {
            return -1;
        }
        if (this.c1) {
            z = false;
        }
        if (z) {
            i = this.b1.d();
        } else {
            i = i2 - 1;
        }
        while (L(i).x()) {
            i = K(i, z);
            if (i == -1) {
                return -1;
            }
        }
        return I(i) + L(i).h(z);
    }

    @Override // o.AbstractC7373jp2
    public int j(int i, int i2, boolean z) {
        int i3 = 0;
        if (this.c1) {
            if (i2 == 1) {
                i2 = 2;
            }
            z = false;
        }
        int C = C(i);
        int I = I(C);
        AbstractC7373jp2 L = L(C);
        int i4 = i - I;
        if (i2 != 2) {
            i3 = i2;
        }
        int j = L.j(i4, i3, z);
        if (j != -1) {
            return I + j;
        }
        int J = J(C, z);
        while (J != -1 && L(J).x()) {
            J = J(J, z);
        }
        if (J != -1) {
            return I(J) + L(J).f(z);
        }
        if (i2 != 2) {
            return -1;
        }
        return f(z);
    }

    @Override // o.AbstractC7373jp2
    public final AbstractC7373jp2.b l(int i, AbstractC7373jp2.b bVar, boolean z) {
        int B = B(i);
        int I = I(B);
        L(B).l(i - H(B), bVar, z);
        bVar.Z += I;
        if (z) {
            bVar.Y = G(F(B), C9542sf.g(bVar.Y));
        }
        return bVar;
    }

    @Override // o.AbstractC7373jp2
    public final AbstractC7373jp2.b m(Object obj, AbstractC7373jp2.b bVar) {
        Object E = E(obj);
        Object D = D(obj);
        int A = A(E);
        int I = I(A);
        L(A).m(D, bVar);
        bVar.Z += I;
        bVar.Y = obj;
        return bVar;
    }

    @Override // o.AbstractC7373jp2
    public int s(int i, int i2, boolean z) {
        int i3 = 0;
        if (this.c1) {
            if (i2 == 1) {
                i2 = 2;
            }
            z = false;
        }
        int C = C(i);
        int I = I(C);
        AbstractC7373jp2 L = L(C);
        int i4 = i - I;
        if (i2 != 2) {
            i3 = i2;
        }
        int s = L.s(i4, i3, z);
        if (s != -1) {
            return I + s;
        }
        int K = K(C, z);
        while (K != -1 && L(K).x()) {
            K = K(K, z);
        }
        if (K != -1) {
            return I(K) + L(K).h(z);
        }
        if (i2 != 2) {
            return -1;
        }
        return h(z);
    }

    @Override // o.AbstractC7373jp2
    public final Object t(int i) {
        int B = B(i);
        return G(F(B), L(B).t(i - H(B)));
    }

    @Override // o.AbstractC7373jp2
    public final AbstractC7373jp2.d v(int i, AbstractC7373jp2.d dVar, long j) {
        int C = C(i);
        int I = I(C);
        int H = H(C);
        L(C).v(i - I, dVar, j);
        Object F = F(C);
        if (!AbstractC7373jp2.d.m1.equals(dVar.X)) {
            F = G(F, dVar.X);
        }
        dVar.X = F;
        dVar.j1 += H;
        dVar.k1 += H;
        return dVar;
    }
}
