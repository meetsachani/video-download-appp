package o;

import java.util.List;

/* renamed from: o.Mm2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3654Mm2 extends MX0<O40> {

    /* renamed from: o.Mm2$a */
    /* loaded from: classes.dex */
    public class a extends O61<O40> {
        public final /* synthetic */ C9410s61 d;
        public final /* synthetic */ O61 e;
        public final /* synthetic */ O40 f;

        public a(C9410s61 c9410s61, O61 o61, O40 o40) {
            this.d = c9410s61;
            this.e = o61;
            this.f = o40;
        }

        @Override // o.O61
        /* renamed from: e */
        public O40 a(C9410s61<O40> c9410s61) {
            O40 g;
            this.d.h(c9410s61.f(), c9410s61.a(), c9410s61.g().a, c9410s61.b().a, c9410s61.d(), c9410s61.c(), c9410s61.e());
            String str = (String) this.e.a(this.d);
            if (c9410s61.c() == 1.0f) {
                g = c9410s61.b();
            } else {
                g = c9410s61.g();
            }
            O40 o40 = g;
            this.f.a(str, o40.b, o40.c, o40.d, o40.e, o40.f, o40.g, o40.h, o40.i, o40.j, o40.k, o40.l, o40.m);
            return this.f;
        }
    }

    public C3654Mm2(List<LX0<O40>> list) {
        super(list);
    }

    @Override // o.AbstractC7840ll
    /* renamed from: r */
    public O40 i(LX0<O40> lx0, float f) {
        O40 o40;
        float floatValue;
        O40 o402;
        O61<A> o61 = this.e;
        if (o61 != 0) {
            float f2 = lx0.g;
            Float f3 = lx0.h;
            if (f3 == null) {
                floatValue = Float.MAX_VALUE;
            } else {
                floatValue = f3.floatValue();
            }
            O40 o403 = lx0.b;
            O40 o404 = o403;
            O40 o405 = lx0.c;
            if (o405 == null) {
                o402 = o403;
            } else {
                o402 = o405;
            }
            return (O40) o61.b(f2, floatValue, o404, o402, f, d(), f());
        } else if (f == 1.0f && (o40 = lx0.c) != null) {
            return o40;
        } else {
            return lx0.b;
        }
    }

    public void s(O61<String> o61) {
        super.o(new a(new C9410s61(), o61, new O40()));
    }
}
