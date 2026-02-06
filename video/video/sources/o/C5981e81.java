package o;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Map;

/* renamed from: o.e81  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5981e81 implements InterfaceC8631ov2 {
    public final C9954uL X;
    public final boolean Y;

    /* renamed from: o.e81$a */
    /* loaded from: classes3.dex */
    public final class a<K, V> extends AbstractC8387nv2<Map<K, V>> {
        public final AbstractC8387nv2<K> a;
        public final AbstractC8387nv2<V> b;
        public final InterfaceC5678ct1<? extends Map<K, V>> c;

        public a(AbstractC8387nv2<K> abstractC8387nv2, AbstractC8387nv2<V> abstractC8387nv22, InterfaceC5678ct1<? extends Map<K, V>> interfaceC5678ct1) {
            this.a = abstractC8387nv2;
            this.b = abstractC8387nv22;
            this.c = interfaceC5678ct1;
        }

        public final String j(DV0 dv0) {
            if (dv0.Q()) {
                MV0 D = dv0.D();
                if (D.Y()) {
                    return String.valueOf(D.G());
                }
                if (D.V()) {
                    return Boolean.toString(D.h());
                }
                if (D.a0()) {
                    return D.J();
                }
                throw new AssertionError();
            } else if (dv0.L()) {
                return "null";
            } else {
                throw new AssertionError();
            }
        }

        @Override // o.AbstractC8387nv2
        /* renamed from: k */
        public Map<K, V> e(OV0 ov0) throws IOException {
            XV0 I = ov0.I();
            if (I == XV0.NULL) {
                ov0.E();
                return null;
            }
            Map<K, V> a = this.c.a();
            if (I == XV0.BEGIN_ARRAY) {
                ov0.d();
                while (ov0.r()) {
                    ov0.d();
                    K e = this.a.e(ov0);
                    if (a.put(e, this.b.e(ov0)) == null) {
                        ov0.k();
                    } else {
                        throw new WV0("duplicate key: " + e);
                    }
                }
                ov0.k();
                return a;
            }
            ov0.f();
            while (ov0.r()) {
                PV0.a.a(ov0);
                K e2 = this.a.e(ov0);
                if (a.put(e2, this.b.e(ov0)) != null) {
                    throw new WV0("duplicate key: " + e2);
                }
            }
            ov0.l();
            return a;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // o.AbstractC8387nv2
        /* renamed from: l */
        public void i(C5589cW0 c5589cW0, Map<K, V> map) throws IOException {
            boolean z;
            if (map == null) {
                c5589cW0.u();
            } else if (!C5981e81.this.Y) {
                c5589cW0.i();
                for (Map.Entry<K, V> entry : map.entrySet()) {
                    c5589cW0.s(String.valueOf(entry.getKey()));
                    this.b.i(c5589cW0, entry.getValue());
                }
                c5589cW0.l();
            } else {
                ArrayList arrayList = new ArrayList(map.size());
                ArrayList arrayList2 = new ArrayList(map.size());
                int i = 0;
                boolean z2 = false;
                for (Map.Entry<K, V> entry2 : map.entrySet()) {
                    DV0 h = this.a.h(entry2.getKey());
                    arrayList.add(h);
                    arrayList2.add(entry2.getValue());
                    if (!h.K() && !h.M()) {
                        z = false;
                    } else {
                        z = true;
                    }
                    z2 |= z;
                }
                if (z2) {
                    c5589cW0.h();
                    int size = arrayList.size();
                    while (i < size) {
                        c5589cW0.h();
                        C4690Xd2.b((DV0) arrayList.get(i), c5589cW0);
                        this.b.i(c5589cW0, arrayList2.get(i));
                        c5589cW0.k();
                        i++;
                    }
                    c5589cW0.k();
                    return;
                }
                c5589cW0.i();
                int size2 = arrayList.size();
                while (i < size2) {
                    c5589cW0.s(j((DV0) arrayList.get(i)));
                    this.b.i(c5589cW0, arrayList2.get(i));
                    i++;
                }
                c5589cW0.l();
            }
        }
    }

    public C5981e81(C9954uL c9954uL, boolean z) {
        this.X = c9954uL;
        this.Y = z;
    }

    public final AbstractC8387nv2<?> a(C5523cF0 c5523cF0, Type type) {
        if (type != Boolean.TYPE && type != Boolean.class) {
            return c5523cF0.u(Rv2.c(type));
        }
        return C9117qv2.f;
    }

    @Override // o.InterfaceC8631ov2
    public <T> AbstractC8387nv2<T> b(C5523cF0 c5523cF0, Rv2<T> rv2) {
        Type g = rv2.g();
        Class<? super T> f = rv2.f();
        if (!Map.class.isAssignableFrom(f)) {
            return null;
        }
        Type[] j = C7233jF0.j(g, f);
        Type type = j[0];
        Type type2 = j[1];
        return new a(new C8874pv2(c5523cF0, a(c5523cF0, type), type), new C8874pv2(c5523cF0, c5523cF0.u(Rv2.c(type2)), type2), this.X.x(rv2, false));
    }
}
