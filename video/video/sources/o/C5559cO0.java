package o;

import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.Comparator;
import java.util.Map;
import o.AbstractC5317bO0;
import o.AbstractC6044eO0;
import o.AbstractC7028iO0;

@InterfaceC10420wF0(emulated = true, serializable = true)
@InterfaceC6329fa0
/* renamed from: o.cO0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C5559cO0<K, V> extends AbstractC7028iO0<K, V> implements V01<K, V> {
    @InterfaceC11149zF0
    private static final long serialVersionUID = 0;
    @MB
    @SY0
    @InterfaceC7537kU1
    public transient C5559cO0<V, K> c1;

    /* renamed from: o.cO0$a */
    /* loaded from: classes3.dex */
    public static final class a<K, V> extends AbstractC7028iO0.c<K, V> {
        @Override // o.AbstractC7028iO0.c
        /* renamed from: l */
        public C5559cO0<K, V> a() {
            return (C5559cO0) super.a();
        }

        @Override // o.AbstractC7028iO0.c
        @InterfaceC6181ey
        /* renamed from: m */
        public a<K, V> b(AbstractC7028iO0.c<K, V> cVar) {
            super.b(cVar);
            return this;
        }

        @Override // o.AbstractC7028iO0.c
        @InterfaceC6181ey
        /* renamed from: n */
        public a<K, V> d(Comparator<? super K> comparator) {
            super.d(comparator);
            return this;
        }

        @Override // o.AbstractC7028iO0.c
        @InterfaceC6181ey
        /* renamed from: o */
        public a<K, V> e(Comparator<? super V> comparator) {
            super.e(comparator);
            return this;
        }

        @Override // o.AbstractC7028iO0.c
        @InterfaceC6181ey
        /* renamed from: p */
        public a<K, V> f(K k, V v) {
            super.f(k, v);
            return this;
        }

        @Override // o.AbstractC7028iO0.c
        @InterfaceC6181ey
        /* renamed from: q */
        public a<K, V> g(Map.Entry<? extends K, ? extends V> entry) {
            super.g(entry);
            return this;
        }

        @Override // o.AbstractC7028iO0.c
        @InterfaceC6181ey
        @InterfaceC4238Sm
        /* renamed from: r */
        public a<K, V> h(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
            super.h(iterable);
            return this;
        }

        @Override // o.AbstractC7028iO0.c
        @InterfaceC6181ey
        /* renamed from: s */
        public a<K, V> i(K k, Iterable<? extends V> iterable) {
            super.i(k, iterable);
            return this;
        }

        @Override // o.AbstractC7028iO0.c
        @InterfaceC6181ey
        /* renamed from: t */
        public a<K, V> j(K k, V... vArr) {
            super.j(k, vArr);
            return this;
        }

        @Override // o.AbstractC7028iO0.c
        @InterfaceC6181ey
        /* renamed from: u */
        public a<K, V> k(InterfaceC10058um1<? extends K, ? extends V> interfaceC10058um1) {
            super.k(interfaceC10058um1);
            return this;
        }
    }

    public C5559cO0(AbstractC6044eO0<K, AbstractC5317bO0<V>> abstractC6044eO0, int i) {
        super(abstractC6044eO0, i);
    }

    public static <K, V> a<K, V> K() {
        return new a<>();
    }

    @InterfaceC4238Sm
    public static <K, V> C5559cO0<K, V> L(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
        return new a().h(iterable).a();
    }

    public static <K, V> C5559cO0<K, V> M(InterfaceC10058um1<? extends K, ? extends V> interfaceC10058um1) {
        if (interfaceC10058um1.isEmpty()) {
            return S();
        }
        if (interfaceC10058um1 instanceof C5559cO0) {
            C5559cO0<K, V> c5559cO0 = (C5559cO0) interfaceC10058um1;
            if (!c5559cO0.w()) {
                return c5559cO0;
            }
        }
        return N(interfaceC10058um1.l().entrySet(), null);
    }

    public static <K, V> C5559cO0<K, V> N(Collection<? extends Map.Entry<? extends K, ? extends Collection<? extends V>>> collection, Comparator<? super V> comparator) {
        AbstractC5317bO0 l0;
        if (collection.isEmpty()) {
            return S();
        }
        AbstractC6044eO0.b bVar = new AbstractC6044eO0.b(collection.size());
        int i = 0;
        for (Map.Entry<? extends K, ? extends Collection<? extends V>> entry : collection) {
            K key = entry.getKey();
            Collection<? extends V> value = entry.getValue();
            if (comparator == null) {
                l0 = AbstractC5317bO0.F(value);
            } else {
                l0 = AbstractC5317bO0.l0(comparator, value);
            }
            if (!l0.isEmpty()) {
                bVar.i(key, l0);
                i += l0.size();
            }
        }
        return new C5559cO0<>(bVar.d(), i);
    }

    public static <K, V> C5559cO0<K, V> S() {
        return C4288Ta0.d1;
    }

    public static <K, V> C5559cO0<K, V> T(K k, V v) {
        a K = K();
        K.f(k, v);
        return K.a();
    }

    public static <K, V> C5559cO0<K, V> V(K k, V v, K k2, V v2) {
        a K = K();
        K.f(k, v);
        K.f(k2, v2);
        return K.a();
    }

    public static <K, V> C5559cO0<K, V> W(K k, V v, K k2, V v2, K k3, V v3) {
        a K = K();
        K.f(k, v);
        K.f(k2, v2);
        K.f(k3, v3);
        return K.a();
    }

    public static <K, V> C5559cO0<K, V> X(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4) {
        a K = K();
        K.f(k, v);
        K.f(k2, v2);
        K.f(k3, v3);
        K.f(k4, v4);
        return K.a();
    }

    public static <K, V> C5559cO0<K, V> Y(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5) {
        a K = K();
        K.f(k, v);
        K.f(k2, v2);
        K.f(k3, v3);
        K.f(k4, v4);
        K.f(k5, v5);
        return K.a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC11149zF0
    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        int readInt = objectInputStream.readInt();
        if (readInt >= 0) {
            AbstractC6044eO0.b b = AbstractC6044eO0.b();
            int i = 0;
            for (int i2 = 0; i2 < readInt; i2++) {
                Object readObject = objectInputStream.readObject();
                int readInt2 = objectInputStream.readInt();
                if (readInt2 > 0) {
                    AbstractC5317bO0.a r = AbstractC5317bO0.r();
                    for (int i3 = 0; i3 < readInt2; i3++) {
                        r.g(objectInputStream.readObject());
                    }
                    b.i(readObject, r.e());
                    i += readInt2;
                } else {
                    StringBuilder sb = new StringBuilder(31);
                    sb.append("Invalid value count ");
                    sb.append(readInt2);
                    throw new InvalidObjectException(sb.toString());
                }
            }
            try {
                AbstractC7028iO0.e.a.b(this, b.d());
                AbstractC7028iO0.e.b.a(this, i);
                return;
            } catch (IllegalArgumentException e) {
                throw ((InvalidObjectException) new InvalidObjectException(e.getMessage()).initCause(e));
            }
        }
        StringBuilder sb2 = new StringBuilder(29);
        sb2.append("Invalid key count ");
        sb2.append(readInt);
        throw new InvalidObjectException(sb2.toString());
    }

    @InterfaceC11149zF0
    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        C9634t12.j(this, objectOutputStream);
    }

    @Override // o.AbstractC7028iO0
    /* renamed from: O */
    public AbstractC5317bO0<V> u(K k) {
        AbstractC5317bO0<V> abstractC5317bO0 = (AbstractC5317bO0) this.a1.get(k);
        if (abstractC5317bO0 == null) {
            return AbstractC5317bO0.L();
        }
        return abstractC5317bO0;
    }

    @Override // o.AbstractC7028iO0
    /* renamed from: P */
    public C5559cO0<V, K> v() {
        C5559cO0<V, K> c5559cO0 = this.c1;
        if (c5559cO0 == null) {
            C5559cO0<V, K> R = R();
            this.c1 = R;
            return R;
        }
        return c5559cO0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final C5559cO0<V, K> R() {
        a K = K();
        AbstractC6237fB2 it = r().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            K.f(entry.getValue(), entry.getKey());
        }
        C5559cO0<V, K> a2 = K.a();
        a2.c1 = this;
        return a2;
    }

    @Override // o.AbstractC7028iO0, o.InterfaceC10058um1, o.InterfaceC8660p22
    @InterfaceC6181ey
    @J40("Always throws UnsupportedOperationException")
    @Deprecated
    /* renamed from: Z */
    public final AbstractC5317bO0<V> i(@MB Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // o.AbstractC7028iO0, o.AbstractC6939i2, o.InterfaceC10058um1, o.InterfaceC8660p22
    @InterfaceC6181ey
    @J40("Always throws UnsupportedOperationException")
    @Deprecated
    /* renamed from: a0 */
    public final AbstractC5317bO0<V> j(K k, Iterable<? extends V> iterable) {
        throw new UnsupportedOperationException();
    }
}
