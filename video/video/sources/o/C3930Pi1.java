package o;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import o.C11040yo0;
import o.C6842he;
import o.IC0;
import o.IM2;
import o.OY0;

/* renamed from: o.Pi1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3930Pi1<T> implements InterfaceC9026qY1<T> {
    public final InterfaceC3540Li1 a;
    public final AbstractC10645xA2<?, ?> b;
    public final boolean c;
    public final AbstractC3249Ij0<?> d;

    public C3930Pi1(AbstractC10645xA2<?, ?> abstractC10645xA2, AbstractC3249Ij0<?> abstractC3249Ij0, InterfaceC3540Li1 interfaceC3540Li1) {
        this.b = abstractC10645xA2;
        this.c = abstractC3249Ij0.e(interfaceC3540Li1);
        this.d = abstractC3249Ij0;
        this.a = interfaceC3540Li1;
    }

    private <UT, UB> int k(AbstractC10645xA2<UT, UB> abstractC10645xA2, T t) {
        return abstractC10645xA2.i(abstractC10645xA2.g(t));
    }

    private <UT, UB, ET extends C11040yo0.c<ET>> void l(AbstractC10645xA2<UT, UB> abstractC10645xA2, AbstractC3249Ij0<ET> abstractC3249Ij0, T t, EO1 eo1, C3151Hj0 c3151Hj0) throws IOException {
        AbstractC10645xA2<UT, UB> abstractC10645xA22;
        AbstractC3249Ij0<ET> abstractC3249Ij02;
        EO1 eo12;
        C3151Hj0 c3151Hj02;
        UB f = abstractC10645xA2.f(t);
        C11040yo0<ET> d = abstractC3249Ij0.d(t);
        while (eo1.I() != Integer.MAX_VALUE) {
            try {
                abstractC10645xA22 = abstractC10645xA2;
                abstractC3249Ij02 = abstractC3249Ij0;
                eo12 = eo1;
                c3151Hj02 = c3151Hj0;
            } catch (Throwable th) {
                th = th;
                abstractC10645xA22 = abstractC10645xA2;
            }
            try {
                if (n(eo12, c3151Hj02, abstractC3249Ij02, d, abstractC10645xA22, f)) {
                    eo1 = eo12;
                    c3151Hj0 = c3151Hj02;
                    abstractC3249Ij0 = abstractC3249Ij02;
                    abstractC10645xA2 = abstractC10645xA22;
                } else {
                    abstractC10645xA22.o(t, f);
                    return;
                }
            } catch (Throwable th2) {
                th = th2;
                Throwable th3 = th;
                abstractC10645xA22.o(t, f);
                throw th3;
            }
        }
        abstractC10645xA2.o(t, f);
    }

    public static <T> C3930Pi1<T> m(AbstractC10645xA2<?, ?> abstractC10645xA2, AbstractC3249Ij0<?> abstractC3249Ij0, InterfaceC3540Li1 interfaceC3540Li1) {
        return new C3930Pi1<>(abstractC10645xA2, abstractC3249Ij0, interfaceC3540Li1);
    }

    @Override // o.InterfaceC9026qY1
    public void a(T t, T t2) {
        C11222zY1.J(this.b, t, t2);
        if (this.c) {
            C11222zY1.H(this.d, t, t2);
        }
    }

    @Override // o.InterfaceC9026qY1
    public T b() {
        return (T) this.a.k0().i2();
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00cf A[EDGE_INSN: B:61:0x00cf->B:34:0x00cf ?: BREAK  , SYNTHETIC] */
    @Override // o.InterfaceC9026qY1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void c(T t, byte[] bArr, int i, int i2, C6842he.b bVar) throws IOException {
        int i3;
        IC0 ic0 = (IC0) t;
        C10888yA2 c10888yA2 = ic0.unknownFields;
        if (c10888yA2 == C10888yA2.e()) {
            c10888yA2 = C10888yA2.p();
            ic0.unknownFields = c10888yA2;
        }
        C10888yA2 c10888yA22 = c10888yA2;
        C11040yo0<IC0.g> z2 = ((IC0.e) t).z2();
        IC0.h hVar = null;
        while (i < i2) {
            int I = C6842he.I(bArr, i, bVar);
            int i4 = bVar.a;
            if (i4 != IM2.q) {
                if (IM2.b(i4) == 2) {
                    hVar = (IC0.h) this.d.b(bVar.d, this.a, IM2.a(i4));
                    if (hVar != null) {
                        i = C6842he.p(XJ1.a().i(hVar.c().getClass()), bArr, I, i2, bVar);
                        z2.O(hVar.d, bVar.c);
                    } else {
                        i = C6842he.G(i4, bArr, I, i2, c10888yA22, bVar);
                    }
                } else {
                    i = C6842he.N(i4, bArr, I, i2, bVar);
                }
            } else {
                int i5 = i2;
                C6842he.b bVar2 = bVar;
                int i6 = 0;
                AbstractC8616os abstractC8616os = null;
                while (true) {
                    if (I < i5) {
                        i3 = C6842he.I(bArr, I, bVar2);
                        int i7 = bVar2.a;
                        int a = IM2.a(i7);
                        int b = IM2.b(i7);
                        if (a != 2) {
                            if (a == 3) {
                                if (hVar != null) {
                                    I = C6842he.p(XJ1.a().i(hVar.c().getClass()), bArr, i3, i5, bVar2);
                                    z2.O(hVar.d, bVar2.c);
                                } else if (b == 2) {
                                    I = C6842he.b(bArr, i3, bVar2);
                                    abstractC8616os = (AbstractC8616os) bVar2.c;
                                }
                            }
                            if (i7 != IM2.r) {
                                break;
                            }
                            I = C6842he.N(i7, bArr, i3, i5, bVar2);
                        } else if (b == 0) {
                            I = C6842he.I(bArr, i3, bVar2);
                            i6 = bVar2.a;
                            hVar = (IC0.h) this.d.b(bVar2.d, this.a, i6);
                        } else if (i7 != IM2.r) {
                        }
                    } else {
                        i3 = I;
                        break;
                    }
                }
                if (abstractC8616os != null) {
                    c10888yA22.r(IM2.c(i6, 2), abstractC8616os);
                }
                i = i3;
                i2 = i5;
                bVar = bVar2;
            }
        }
        if (i == i2) {
            return;
        }
        throw C9258rT0.h();
    }

    @Override // o.InterfaceC9026qY1
    public void d(T t) {
        this.b.j(t);
        this.d.f(t);
    }

    @Override // o.InterfaceC9026qY1
    public final boolean e(T t) {
        return this.d.c(t).E();
    }

    @Override // o.InterfaceC9026qY1
    public void f(T t, NN2 nn2) throws IOException {
        Iterator<Map.Entry<?, Object>> H = this.d.c(t).H();
        while (H.hasNext()) {
            Map.Entry<?, Object> next = H.next();
            C11040yo0.c cVar = (C11040yo0.c) next.getKey();
            if (cVar.z5() == IM2.c.MESSAGE && !cVar.g3() && !cVar.A5()) {
                if (next instanceof OY0.b) {
                    nn2.b(cVar.k(), ((OY0.b) next).a().n());
                } else {
                    nn2.b(cVar.k(), next.getValue());
                }
            } else {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
        }
        o(this.b, t, nn2);
    }

    @Override // o.InterfaceC9026qY1
    public int g(T t) {
        int k = k(this.b, t);
        if (this.c) {
            return k + this.d.c(t).v();
        }
        return k;
    }

    @Override // o.InterfaceC9026qY1
    public int h(T t) {
        int hashCode = this.b.g(t).hashCode();
        if (this.c) {
            return (hashCode * 53) + this.d.c(t).hashCode();
        }
        return hashCode;
    }

    @Override // o.InterfaceC9026qY1
    public void i(T t, EO1 eo1, C3151Hj0 c3151Hj0) throws IOException {
        l(this.b, this.d, t, eo1, c3151Hj0);
    }

    @Override // o.InterfaceC9026qY1
    public boolean j(T t, T t2) {
        if (!this.b.g(t).equals(this.b.g(t2))) {
            return false;
        }
        if (this.c) {
            return this.d.c(t).equals(this.d.c(t2));
        }
        return true;
    }

    public final <UT, UB, ET extends C11040yo0.c<ET>> boolean n(EO1 eo1, C3151Hj0 c3151Hj0, AbstractC3249Ij0<ET> abstractC3249Ij0, C11040yo0<ET> c11040yo0, AbstractC10645xA2<UT, UB> abstractC10645xA2, UB ub) throws IOException {
        int i0 = eo1.i0();
        if (i0 != IM2.q) {
            if (IM2.b(i0) == 2) {
                Object b = abstractC3249Ij0.b(c3151Hj0, this.a, IM2.a(i0));
                if (b != null) {
                    abstractC3249Ij0.h(eo1, b, c3151Hj0, c11040yo0);
                    return true;
                }
                return abstractC10645xA2.m(ub, eo1);
            }
            return eo1.M();
        }
        Object obj = null;
        int i = 0;
        AbstractC8616os abstractC8616os = null;
        while (eo1.I() != Integer.MAX_VALUE) {
            int i02 = eo1.i0();
            if (i02 == IM2.s) {
                i = eo1.j();
                obj = abstractC3249Ij0.b(c3151Hj0, this.a, i);
            } else if (i02 == IM2.t) {
                if (obj != null) {
                    abstractC3249Ij0.h(eo1, obj, c3151Hj0, c11040yo0);
                } else {
                    abstractC8616os = eo1.t();
                }
            } else if (!eo1.M()) {
                break;
            }
        }
        if (eo1.i0() == IM2.r) {
            if (abstractC8616os != null) {
                if (obj != null) {
                    abstractC3249Ij0.i(abstractC8616os, obj, c3151Hj0, c11040yo0);
                } else {
                    abstractC10645xA2.d(ub, i, abstractC8616os);
                }
            }
            return true;
        }
        throw C9258rT0.b();
    }

    public final <UT, UB> void o(AbstractC10645xA2<UT, UB> abstractC10645xA2, T t, NN2 nn2) throws IOException {
        abstractC10645xA2.s(abstractC10645xA2.g(t), nn2);
    }
}
