package o;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import o.IC0;
import o.IM2;

/* renamed from: o.Jj0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3347Jj0 extends AbstractC3249Ij0<IC0.g> {

    /* renamed from: o.Jj0$a */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[IM2.b.values().length];
            a = iArr;
            try {
                iArr[IM2.b.Z.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[IM2.b.Y0.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[IM2.b.Z0.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[IM2.b.a1.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[IM2.b.b1.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[IM2.b.c1.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[IM2.b.d1.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[IM2.b.e1.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                a[IM2.b.j1.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                a[IM2.b.l1.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                a[IM2.b.m1.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                a[IM2.b.n1.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                a[IM2.b.o1.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                a[IM2.b.k1.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                a[IM2.b.i1.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                a[IM2.b.f1.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                a[IM2.b.g1.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                a[IM2.b.h1.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
        }
    }

    @Override // o.AbstractC3249Ij0
    public int a(Map.Entry<?, ?> entry) {
        return ((IC0.g) entry.getKey()).k();
    }

    @Override // o.AbstractC3249Ij0
    public Object b(C3151Hj0 c3151Hj0, InterfaceC3540Li1 interfaceC3540Li1, int i) {
        return c3151Hj0.c(interfaceC3540Li1, i);
    }

    @Override // o.AbstractC3249Ij0
    public C11040yo0<IC0.g> c(Object obj) {
        return ((IC0.e) obj).extensions;
    }

    @Override // o.AbstractC3249Ij0
    public C11040yo0<IC0.g> d(Object obj) {
        return ((IC0.e) obj).z2();
    }

    @Override // o.AbstractC3249Ij0
    public boolean e(InterfaceC3540Li1 interfaceC3540Li1) {
        return interfaceC3540Li1 instanceof IC0.e;
    }

    @Override // o.AbstractC3249Ij0
    public void f(Object obj) {
        c(obj).I();
    }

    @Override // o.AbstractC3249Ij0
    public <UT, UB> UB g(EO1 eo1, Object obj, C3151Hj0 c3151Hj0, C11040yo0<IC0.g> c11040yo0, UB ub, AbstractC10645xA2<UT, UB> abstractC10645xA2) throws IOException {
        Object valueOf;
        Object u;
        ArrayList arrayList;
        IC0.h hVar = (IC0.h) obj;
        int d = hVar.d();
        if (hVar.d.g3() && hVar.d.A5()) {
            switch (a.a[hVar.b().ordinal()]) {
                case 1:
                    arrayList = new ArrayList();
                    eo1.P(arrayList);
                    break;
                case 2:
                    arrayList = new ArrayList();
                    eo1.K(arrayList);
                    break;
                case 3:
                    arrayList = new ArrayList();
                    eo1.l(arrayList);
                    break;
                case 4:
                    arrayList = new ArrayList();
                    eo1.h(arrayList);
                    break;
                case 5:
                    arrayList = new ArrayList();
                    eo1.D(arrayList);
                    break;
                case 6:
                    arrayList = new ArrayList();
                    eo1.v(arrayList);
                    break;
                case 7:
                    arrayList = new ArrayList();
                    eo1.E(arrayList);
                    break;
                case 8:
                    arrayList = new ArrayList();
                    eo1.r(arrayList);
                    break;
                case 9:
                    arrayList = new ArrayList();
                    eo1.y(arrayList);
                    break;
                case 10:
                    arrayList = new ArrayList();
                    eo1.d(arrayList);
                    break;
                case 11:
                    arrayList = new ArrayList();
                    eo1.C(arrayList);
                    break;
                case 12:
                    arrayList = new ArrayList();
                    eo1.w(arrayList);
                    break;
                case 13:
                    arrayList = new ArrayList();
                    eo1.e(arrayList);
                    break;
                case 14:
                    arrayList = new ArrayList();
                    eo1.o(arrayList);
                    ub = (UB) C11222zY1.B(d, arrayList, hVar.d.Z0(), ub, abstractC10645xA2);
                    break;
                default:
                    throw new IllegalStateException("Type cannot be packed: " + hVar.d.y3());
            }
            c11040yo0.O(hVar.d, arrayList);
            return ub;
        }
        if (hVar.b() == IM2.b.k1) {
            int u2 = eo1.u();
            if (hVar.d.Z0().a(u2) == null) {
                return (UB) C11222zY1.Q(d, u2, ub, abstractC10645xA2);
            }
            valueOf = Integer.valueOf(u2);
        } else {
            switch (a.a[hVar.b().ordinal()]) {
                case 1:
                    valueOf = Double.valueOf(eo1.readDouble());
                    break;
                case 2:
                    valueOf = Float.valueOf(eo1.readFloat());
                    break;
                case 3:
                    valueOf = Long.valueOf(eo1.Q());
                    break;
                case 4:
                    valueOf = Long.valueOf(eo1.x());
                    break;
                case 5:
                    valueOf = Integer.valueOf(eo1.u());
                    break;
                case 6:
                    valueOf = Long.valueOf(eo1.c());
                    break;
                case 7:
                    valueOf = Integer.valueOf(eo1.B());
                    break;
                case 8:
                    valueOf = Boolean.valueOf(eo1.f());
                    break;
                case 9:
                    valueOf = Integer.valueOf(eo1.j());
                    break;
                case 10:
                    valueOf = Integer.valueOf(eo1.N());
                    break;
                case 11:
                    valueOf = Long.valueOf(eo1.g());
                    break;
                case 12:
                    valueOf = Integer.valueOf(eo1.q());
                    break;
                case 13:
                    valueOf = Long.valueOf(eo1.F());
                    break;
                case 14:
                    throw new IllegalStateException("Shouldn't reach here.");
                case 15:
                    valueOf = eo1.t();
                    break;
                case 16:
                    valueOf = eo1.H();
                    break;
                case 17:
                    valueOf = eo1.n(hVar.c().getClass(), c3151Hj0);
                    break;
                case 18:
                    valueOf = eo1.a(hVar.c().getClass(), c3151Hj0);
                    break;
                default:
                    valueOf = null;
                    break;
            }
        }
        if (hVar.f()) {
            c11040yo0.h(hVar.d, valueOf);
            return ub;
        }
        int i = a.a[hVar.b().ordinal()];
        if ((i == 17 || i == 18) && (u = c11040yo0.u(hVar.d)) != null) {
            valueOf = C9740tS0.v(u, valueOf);
        }
        c11040yo0.O(hVar.d, valueOf);
        return ub;
    }

    @Override // o.AbstractC3249Ij0
    public void h(EO1 eo1, Object obj, C3151Hj0 c3151Hj0, C11040yo0<IC0.g> c11040yo0) throws IOException {
        IC0.h hVar = (IC0.h) obj;
        c11040yo0.O(hVar.d, eo1.a(hVar.c().getClass(), c3151Hj0));
    }

    @Override // o.AbstractC3249Ij0
    public void i(AbstractC8616os abstractC8616os, Object obj, C3151Hj0 c3151Hj0, C11040yo0<IC0.g> c11040yo0) throws IOException {
        IC0.h hVar = (IC0.h) obj;
        InterfaceC3540Li1 i2 = hVar.c().k0().i2();
        AbstractC8839pn T = AbstractC8839pn.T(ByteBuffer.wrap(abstractC8616os.v0()), true);
        XJ1.a().f(i2, T, c3151Hj0);
        c11040yo0.O(hVar.d, i2);
        if (T.I() == Integer.MAX_VALUE) {
            return;
        }
        throw C9258rT0.b();
    }

    @Override // o.AbstractC3249Ij0
    public void j(NN2 nn2, Map.Entry<?, ?> entry) throws IOException {
        IC0.g gVar = (IC0.g) entry.getKey();
        if (gVar.g3()) {
            switch (a.a[gVar.y3().ordinal()]) {
                case 1:
                    C11222zY1.Y(gVar.k(), (List) entry.getValue(), nn2, gVar.A5());
                    return;
                case 2:
                    C11222zY1.g0(gVar.k(), (List) entry.getValue(), nn2, gVar.A5());
                    return;
                case 3:
                    C11222zY1.m0(gVar.k(), (List) entry.getValue(), nn2, gVar.A5());
                    return;
                case 4:
                    C11222zY1.F0(gVar.k(), (List) entry.getValue(), nn2, gVar.A5());
                    return;
                case 5:
                    C11222zY1.k0(gVar.k(), (List) entry.getValue(), nn2, gVar.A5());
                    return;
                case 6:
                    C11222zY1.e0(gVar.k(), (List) entry.getValue(), nn2, gVar.A5());
                    return;
                case 7:
                    C11222zY1.c0(gVar.k(), (List) entry.getValue(), nn2, gVar.A5());
                    return;
                case 8:
                    C11222zY1.U(gVar.k(), (List) entry.getValue(), nn2, gVar.A5());
                    return;
                case 9:
                    C11222zY1.D0(gVar.k(), (List) entry.getValue(), nn2, gVar.A5());
                    return;
                case 10:
                    C11222zY1.s0(gVar.k(), (List) entry.getValue(), nn2, gVar.A5());
                    return;
                case 11:
                    C11222zY1.u0(gVar.k(), (List) entry.getValue(), nn2, gVar.A5());
                    return;
                case 12:
                    C11222zY1.w0(gVar.k(), (List) entry.getValue(), nn2, gVar.A5());
                    return;
                case 13:
                    C11222zY1.y0(gVar.k(), (List) entry.getValue(), nn2, gVar.A5());
                    return;
                case 14:
                    C11222zY1.k0(gVar.k(), (List) entry.getValue(), nn2, gVar.A5());
                    return;
                case 15:
                    C11222zY1.W(gVar.k(), (List) entry.getValue(), nn2);
                    return;
                case 16:
                    C11222zY1.B0(gVar.k(), (List) entry.getValue(), nn2);
                    return;
                case 17:
                    List list = (List) entry.getValue();
                    if (list != null && !list.isEmpty()) {
                        C11222zY1.i0(gVar.k(), (List) entry.getValue(), nn2, XJ1.a().i(list.get(0).getClass()));
                        return;
                    }
                    return;
                case 18:
                    List list2 = (List) entry.getValue();
                    if (list2 != null && !list2.isEmpty()) {
                        C11222zY1.q0(gVar.k(), (List) entry.getValue(), nn2, XJ1.a().i(list2.get(0).getClass()));
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
        switch (a.a[gVar.y3().ordinal()]) {
            case 1:
                nn2.u(gVar.k(), ((Double) entry.getValue()).doubleValue());
                return;
            case 2:
                nn2.L(gVar.k(), ((Float) entry.getValue()).floatValue());
                return;
            case 3:
                nn2.B(gVar.k(), ((Long) entry.getValue()).longValue());
                return;
            case 4:
                nn2.h(gVar.k(), ((Long) entry.getValue()).longValue());
                return;
            case 5:
                nn2.l(gVar.k(), ((Integer) entry.getValue()).intValue());
                return;
            case 6:
                nn2.x(gVar.k(), ((Long) entry.getValue()).longValue());
                return;
            case 7:
                nn2.c(gVar.k(), ((Integer) entry.getValue()).intValue());
                return;
            case 8:
                nn2.C(gVar.k(), ((Boolean) entry.getValue()).booleanValue());
                return;
            case 9:
                nn2.s(gVar.k(), ((Integer) entry.getValue()).intValue());
                return;
            case 10:
                nn2.E(gVar.k(), ((Integer) entry.getValue()).intValue());
                return;
            case 11:
                nn2.m(gVar.k(), ((Long) entry.getValue()).longValue());
                return;
            case 12:
                nn2.R(gVar.k(), ((Integer) entry.getValue()).intValue());
                return;
            case 13:
                nn2.q(gVar.k(), ((Long) entry.getValue()).longValue());
                return;
            case 14:
                nn2.l(gVar.k(), ((Integer) entry.getValue()).intValue());
                return;
            case 15:
                nn2.e(gVar.k(), (AbstractC8616os) entry.getValue());
                return;
            case 16:
                nn2.g(gVar.k(), (String) entry.getValue());
                return;
            case 17:
                nn2.t(gVar.k(), entry.getValue(), XJ1.a().i(entry.getValue().getClass()));
                return;
            case 18:
                nn2.i(gVar.k(), entry.getValue(), XJ1.a().i(entry.getValue().getClass()));
                return;
            default:
                return;
        }
    }

    @Override // o.AbstractC3249Ij0
    public void k(Object obj, C11040yo0<IC0.g> c11040yo0) {
        ((IC0.e) obj).extensions = c11040yo0;
    }
}
