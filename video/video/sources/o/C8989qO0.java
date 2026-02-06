package o;

import java.io.Serializable;
import java.lang.Comparable;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import o.AbstractC5317bO0;
import o.C5118aa2;

@InterfaceC11149zF0
@InterfaceC6329fa0
@InterfaceC4238Sm
/* renamed from: o.qO0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C8989qO0<K extends Comparable<?>, V> implements UN1<K, V>, Serializable {
    public static final C8989qO0<Comparable<?>, Object> Z = new C8989qO0<>(AbstractC5317bO0.L(), AbstractC5317bO0.L());
    private static final long serialVersionUID = 0;
    public final transient AbstractC5317bO0<PN1<K>> X;
    public final transient AbstractC5317bO0<V> Y;

    /* renamed from: o.qO0$a */
    /* loaded from: classes3.dex */
    public class a extends AbstractC5317bO0<PN1<K>> {
        public final /* synthetic */ int Y0;
        public final /* synthetic */ int Z;
        public final /* synthetic */ PN1 Z0;

        public a(int i, int i2, PN1 pn1) {
            this.Z = i;
            this.Y0 = i2;
            this.Z0 = pn1;
        }

        @Override // o.TN0
        public boolean j() {
            return true;
        }

        @Override // java.util.List
        /* renamed from: p0 */
        public PN1<K> get(int i) {
            C10664xF1.C(i, this.Z);
            if (i != 0 && i != this.Z - 1) {
                return (PN1) C8989qO0.this.X.get(i + this.Y0);
            }
            return ((PN1) C8989qO0.this.X.get(i + this.Y0)).s(this.Z0);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.Z;
        }
    }

    /* renamed from: o.qO0$b */
    /* loaded from: classes3.dex */
    public class b extends C8989qO0<K, V> {
        public final /* synthetic */ PN1 Y0;
        public final /* synthetic */ C8989qO0 Z0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C8989qO0 c8989qO0, AbstractC5317bO0 abstractC5317bO0, AbstractC5317bO0 abstractC5317bO02, PN1 pn1, C8989qO0 c8989qO02) {
            super(abstractC5317bO0, abstractC5317bO02);
            this.Y0 = pn1;
            this.Z0 = c8989qO02;
        }

        @Override // o.C8989qO0, o.UN1
        public /* bridge */ /* synthetic */ Map e() {
            return super.e();
        }

        @Override // o.C8989qO0, o.UN1
        public /* bridge */ /* synthetic */ Map i() {
            return super.i();
        }

        @Override // o.C8989qO0, o.UN1
        /* renamed from: r */
        public C8989qO0<K, V> j(PN1<K> pn1) {
            if (this.Y0.t(pn1)) {
                return this.Z0.j(pn1.s(this.Y0));
            }
            return C8989qO0.p();
        }
    }

    @L40
    /* renamed from: o.qO0$c */
    /* loaded from: classes3.dex */
    public static final class c<K extends Comparable<?>, V> {
        public final List<Map.Entry<PN1<K>, V>> a = C10608x11.q();

        public C8989qO0<K, V> a() {
            Collections.sort(this.a, PN1.C().C());
            AbstractC5317bO0.a aVar = new AbstractC5317bO0.a(this.a.size());
            AbstractC5317bO0.a aVar2 = new AbstractC5317bO0.a(this.a.size());
            for (int i = 0; i < this.a.size(); i++) {
                PN1<K> key = this.a.get(i).getKey();
                if (i > 0) {
                    PN1<K> key2 = this.a.get(i - 1).getKey();
                    if (key.t(key2) && !key.s(key2).u()) {
                        String valueOf = String.valueOf(key2);
                        String valueOf2 = String.valueOf(key);
                        StringBuilder sb = new StringBuilder(valueOf.length() + 47 + valueOf2.length());
                        sb.append("Overlapping ranges: range ");
                        sb.append(valueOf);
                        sb.append(" overlaps with entry ");
                        sb.append(valueOf2);
                        throw new IllegalArgumentException(sb.toString());
                    }
                }
                aVar.g(key);
                aVar2.g(this.a.get(i).getValue());
            }
            return new C8989qO0<>(aVar.e(), aVar2.e());
        }

        @InterfaceC6181ey
        public c<K, V> b(c<K, V> cVar) {
            this.a.addAll(cVar.a);
            return this;
        }

        @InterfaceC6181ey
        public c<K, V> c(PN1<K> pn1, V v) {
            C10664xF1.E(pn1);
            C10664xF1.E(v);
            C10664xF1.u(!pn1.u(), "Range must not be empty, but was %s", pn1);
            this.a.add(C7935m81.O(pn1, v));
            return this;
        }

        @InterfaceC6181ey
        public c<K, V> d(UN1<K, ? extends V> un1) {
            for (Map.Entry<PN1<K>, ? extends V> entry : un1.e().entrySet()) {
                c(entry.getKey(), entry.getValue());
            }
            return this;
        }
    }

    /* renamed from: o.qO0$d */
    /* loaded from: classes3.dex */
    public static class d<K extends Comparable<?>, V> implements Serializable {
        private static final long serialVersionUID = 0;
        public final AbstractC6044eO0<PN1<K>, V> X;

        public d(AbstractC6044eO0<PN1<K>, V> abstractC6044eO0) {
            this.X = abstractC6044eO0;
        }

        public Object a() {
            c cVar = new c();
            AbstractC6237fB2<Map.Entry<PN1<K>, V>> it = this.X.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry<PN1<K>, V> next = it.next();
                cVar.c(next.getKey(), next.getValue());
            }
            return cVar.a();
        }

        public Object readResolve() {
            if (this.X.isEmpty()) {
                return C8989qO0.p();
            }
            return a();
        }
    }

    public C8989qO0(AbstractC5317bO0<PN1<K>> abstractC5317bO0, AbstractC5317bO0<V> abstractC5317bO02) {
        this.X = abstractC5317bO0;
        this.Y = abstractC5317bO02;
    }

    public static <K extends Comparable<?>, V> c<K, V> n() {
        return new c<>();
    }

    public static <K extends Comparable<?>, V> C8989qO0<K, V> o(UN1<K, ? extends V> un1) {
        if (un1 instanceof C8989qO0) {
            return (C8989qO0) un1;
        }
        Map<PN1<K>, ? extends V> e = un1.e();
        AbstractC5317bO0.a aVar = new AbstractC5317bO0.a(e.size());
        AbstractC5317bO0.a aVar2 = new AbstractC5317bO0.a(e.size());
        for (Map.Entry<PN1<K>, ? extends V> entry : e.entrySet()) {
            aVar.g(entry.getKey());
            aVar2.g(entry.getValue());
        }
        return new C8989qO0<>(aVar.e(), aVar2.e());
    }

    public static <K extends Comparable<?>, V> C8989qO0<K, V> p() {
        return (C8989qO0<K, V>) Z;
    }

    public static <K extends Comparable<?>, V> C8989qO0<K, V> q(PN1<K> pn1, V v) {
        return new C8989qO0<>(AbstractC5317bO0.M(pn1), AbstractC5317bO0.M(v));
    }

    @Override // o.UN1
    public PN1<K> a() {
        if (!this.X.isEmpty()) {
            AbstractC5317bO0<PN1<K>> abstractC5317bO0 = this.X;
            return PN1.k(this.X.get(0).X, abstractC5317bO0.get(abstractC5317bO0.size() - 1).Y);
        }
        throw new NoSuchElementException();
    }

    @Override // o.UN1
    @J40("Always throws UnsupportedOperationException")
    @Deprecated
    public final void b(PN1<K> pn1) {
        throw new UnsupportedOperationException();
    }

    @Override // o.UN1
    @J40("Always throws UnsupportedOperationException")
    @Deprecated
    public final void c(PN1<K> pn1, V v) {
        throw new UnsupportedOperationException();
    }

    @Override // o.UN1
    @J40("Always throws UnsupportedOperationException")
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // o.UN1
    @J40("Always throws UnsupportedOperationException")
    @Deprecated
    public final void d(UN1<K, V> un1) {
        throw new UnsupportedOperationException();
    }

    @Override // o.UN1
    public boolean equals(@MB Object obj) {
        if (obj instanceof UN1) {
            return e().equals(((UN1) obj).e());
        }
        return false;
    }

    @Override // o.UN1
    @MB
    public Map.Entry<PN1<K>, V> f(K k) {
        int c2 = C5118aa2.c(this.X, PN1.w(), PT.i(k), C5118aa2.c.X, C5118aa2.b.X);
        if (c2 == -1) {
            return null;
        }
        PN1<K> pn1 = this.X.get(c2);
        if (!pn1.i(k)) {
            return null;
        }
        return C7935m81.O(pn1, this.Y.get(c2));
    }

    @Override // o.UN1
    @J40("Always throws UnsupportedOperationException")
    @Deprecated
    public final void g(PN1<K> pn1, V v) {
        throw new UnsupportedOperationException();
    }

    @Override // o.UN1
    @MB
    public V h(K k) {
        int c2 = C5118aa2.c(this.X, PN1.w(), PT.i(k), C5118aa2.c.X, C5118aa2.b.X);
        if (c2 == -1 || !this.X.get(c2).i(k)) {
            return null;
        }
        return this.Y.get(c2);
    }

    @Override // o.UN1
    public int hashCode() {
        return e().hashCode();
    }

    @Override // o.UN1
    /* renamed from: l */
    public AbstractC6044eO0<PN1<K>, V> i() {
        if (this.X.isEmpty()) {
            return AbstractC6044eO0.u();
        }
        return new C9967uO0(new UQ1(this.X.j0(), PN1.C().E()), this.Y.j0());
    }

    @Override // o.UN1
    /* renamed from: m */
    public AbstractC6044eO0<PN1<K>, V> e() {
        if (this.X.isEmpty()) {
            return AbstractC6044eO0.u();
        }
        return new C9967uO0(new UQ1(this.X, PN1.C()), this.Y);
    }

    @Override // o.UN1
    /* renamed from: r */
    public C8989qO0<K, V> j(PN1<K> pn1) {
        if (((PN1) C10664xF1.E(pn1)).u()) {
            return p();
        }
        if (this.X.isEmpty() || pn1.n(a())) {
            return this;
        }
        AbstractC5317bO0<PN1<K>> abstractC5317bO0 = this.X;
        YA0 H = PN1.H();
        PT<K> pt = pn1.X;
        C5118aa2.c cVar = C5118aa2.c.Y0;
        C5118aa2.b bVar = C5118aa2.b.Y;
        int c2 = C5118aa2.c(abstractC5317bO0, H, pt, cVar, bVar);
        int c3 = C5118aa2.c(this.X, PN1.w(), pn1.Y, C5118aa2.c.X, bVar);
        if (c2 >= c3) {
            return p();
        }
        return new b(this, new a(c3 - c2, c2, pn1), this.Y.subList(c2, c3), pn1, this);
    }

    @Override // o.UN1
    public String toString() {
        return e().toString();
    }

    public Object writeReplace() {
        return new d(e());
    }
}
