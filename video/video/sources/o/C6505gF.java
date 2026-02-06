package o;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Collection;

/* renamed from: o.gF  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C6505gF implements InterfaceC8631ov2 {
    public final C9954uL X;

    /* renamed from: o.gF$a */
    /* loaded from: classes3.dex */
    public static final class a<E> extends AbstractC8387nv2<Collection<E>> {
        public final AbstractC8387nv2<E> a;
        public final InterfaceC5678ct1<? extends Collection<E>> b;

        public a(AbstractC8387nv2<E> abstractC8387nv2, InterfaceC5678ct1<? extends Collection<E>> interfaceC5678ct1) {
            this.a = abstractC8387nv2;
            this.b = interfaceC5678ct1;
        }

        @Override // o.AbstractC8387nv2
        /* renamed from: j */
        public Collection<E> e(OV0 ov0) throws IOException {
            if (ov0.I() == XV0.NULL) {
                ov0.E();
                return null;
            }
            Collection<E> a = this.b.a();
            ov0.d();
            while (ov0.r()) {
                a.add(this.a.e(ov0));
            }
            ov0.k();
            return a;
        }

        @Override // o.AbstractC8387nv2
        /* renamed from: k */
        public void i(C5589cW0 c5589cW0, Collection<E> collection) throws IOException {
            if (collection == null) {
                c5589cW0.u();
                return;
            }
            c5589cW0.h();
            for (E e : collection) {
                this.a.i(c5589cW0, e);
            }
            c5589cW0.k();
        }
    }

    public C6505gF(C9954uL c9954uL) {
        this.X = c9954uL;
    }

    @Override // o.InterfaceC8631ov2
    public <T> AbstractC8387nv2<T> b(C5523cF0 c5523cF0, Rv2<T> rv2) {
        Type g = rv2.g();
        Class<? super T> f = rv2.f();
        if (!Collection.class.isAssignableFrom(f)) {
            return null;
        }
        Type h = C7233jF0.h(g, f);
        return new a(new C8874pv2(c5523cF0, c5523cF0.u(Rv2.c(h)), h), this.X.x(rv2, false));
    }
}
