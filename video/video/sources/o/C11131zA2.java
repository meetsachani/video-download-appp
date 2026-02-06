package o;

import java.io.IOException;

/* renamed from: o.zA2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C11131zA2 extends AbstractC10645xA2<C10888yA2, C10888yA2> {
    @Override // o.AbstractC10645xA2
    /* renamed from: A */
    public C10888yA2 g(Object obj) {
        return ((IC0) obj).unknownFields;
    }

    @Override // o.AbstractC10645xA2
    /* renamed from: B */
    public int h(C10888yA2 c10888yA2) {
        return c10888yA2.f();
    }

    @Override // o.AbstractC10645xA2
    /* renamed from: C */
    public int i(C10888yA2 c10888yA2) {
        return c10888yA2.g();
    }

    @Override // o.AbstractC10645xA2
    /* renamed from: D */
    public C10888yA2 k(C10888yA2 c10888yA2, C10888yA2 c10888yA22) {
        if (c10888yA22.equals(C10888yA2.e())) {
            return c10888yA2;
        }
        return C10888yA2.o(c10888yA2, c10888yA22);
    }

    @Override // o.AbstractC10645xA2
    /* renamed from: E */
    public C10888yA2 n() {
        return C10888yA2.p();
    }

    @Override // o.AbstractC10645xA2
    /* renamed from: F */
    public void o(Object obj, C10888yA2 c10888yA2) {
        p(obj, c10888yA2);
    }

    @Override // o.AbstractC10645xA2
    /* renamed from: G */
    public void p(Object obj, C10888yA2 c10888yA2) {
        ((IC0) obj).unknownFields = c10888yA2;
    }

    @Override // o.AbstractC10645xA2
    /* renamed from: H */
    public C10888yA2 r(C10888yA2 c10888yA2) {
        c10888yA2.j();
        return c10888yA2;
    }

    @Override // o.AbstractC10645xA2
    /* renamed from: I */
    public void s(C10888yA2 c10888yA2, NN2 nn2) throws IOException {
        c10888yA2.t(nn2);
    }

    @Override // o.AbstractC10645xA2
    /* renamed from: J */
    public void t(C10888yA2 c10888yA2, NN2 nn2) throws IOException {
        c10888yA2.w(nn2);
    }

    @Override // o.AbstractC10645xA2
    public void j(Object obj) {
        g(obj).j();
    }

    @Override // o.AbstractC10645xA2
    public boolean q(EO1 eo1) {
        return false;
    }

    @Override // o.AbstractC10645xA2
    /* renamed from: u */
    public void a(C10888yA2 c10888yA2, int i, int i2) {
        c10888yA2.r(IM2.c(i, 5), Integer.valueOf(i2));
    }

    @Override // o.AbstractC10645xA2
    /* renamed from: v */
    public void b(C10888yA2 c10888yA2, int i, long j) {
        c10888yA2.r(IM2.c(i, 1), Long.valueOf(j));
    }

    @Override // o.AbstractC10645xA2
    /* renamed from: w */
    public void c(C10888yA2 c10888yA2, int i, C10888yA2 c10888yA22) {
        c10888yA2.r(IM2.c(i, 3), c10888yA22);
    }

    @Override // o.AbstractC10645xA2
    /* renamed from: x */
    public void d(C10888yA2 c10888yA2, int i, AbstractC8616os abstractC8616os) {
        c10888yA2.r(IM2.c(i, 2), abstractC8616os);
    }

    @Override // o.AbstractC10645xA2
    /* renamed from: y */
    public void e(C10888yA2 c10888yA2, int i, long j) {
        c10888yA2.r(IM2.c(i, 0), Long.valueOf(j));
    }

    @Override // o.AbstractC10645xA2
    /* renamed from: z */
    public C10888yA2 f(Object obj) {
        C10888yA2 g = g(obj);
        if (g == C10888yA2.e()) {
            C10888yA2 p = C10888yA2.p();
            p(obj, p);
            return p;
        }
        return g;
    }
}
