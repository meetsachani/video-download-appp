package o;

import o.AbstractC5317bO0;

@Deprecated
/* loaded from: classes2.dex */
public final class O01 implements InterfaceC4029Qj {
    public final AbstractC5317bO0<InterfaceC4029Qj> a;
    public final int b;

    public O01(int i, AbstractC5317bO0<InterfaceC4029Qj> abstractC5317bO0) {
        this.b = i;
        this.a = abstractC5317bO0;
    }

    @InterfaceC11300zs1
    public static InterfaceC4029Qj a(int i, int i2, C3012Fy1 c3012Fy1) {
        switch (i) {
            case C4126Rj.B /* 1718776947 */:
                return C2628Cd2.d(i2, c3012Fy1);
            case C4126Rj.v /* 1751742049 */:
                return C4226Sj.b(c3012Fy1);
            case C4126Rj.D /* 1752331379 */:
                return C4323Tj.d(c3012Fy1);
            case C4126Rj.C /* 1852994675 */:
                return C3325Jd2.a(c3012Fy1);
            default:
                return null;
        }
    }

    public static O01 c(int i, C3012Fy1 c3012Fy1) {
        InterfaceC4029Qj a;
        AbstractC5317bO0.a aVar = new AbstractC5317bO0.a();
        int g = c3012Fy1.g();
        int i2 = -2;
        while (c3012Fy1.a() > 8) {
            int w = c3012Fy1.w();
            int f = c3012Fy1.f() + c3012Fy1.w();
            c3012Fy1.X(f);
            if (w == 1414744396) {
                a = c(c3012Fy1.w(), c3012Fy1);
            } else {
                a = a(w, i2, c3012Fy1);
            }
            if (a != null) {
                if (a.getType() == 1752331379) {
                    i2 = ((C4323Tj) a).c();
                }
                aVar.g(a);
            }
            c3012Fy1.Y(f);
            c3012Fy1.X(g);
        }
        return new O01(i, aVar.e());
    }

    @InterfaceC11300zs1
    public <T extends InterfaceC4029Qj> T b(Class<T> cls) {
        AbstractC6237fB2<InterfaceC4029Qj> it = this.a.iterator();
        while (it.hasNext()) {
            T t = (T) it.next();
            if (t.getClass() == cls) {
                return t;
            }
        }
        return null;
    }

    @Override // o.InterfaceC4029Qj
    public int getType() {
        return this.b;
    }
}
