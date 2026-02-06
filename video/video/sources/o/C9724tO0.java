package o;

import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Map;
import o.AbstractC10942yO0;
import o.AbstractC6044eO0;
import o.AbstractC7028iO0;
import o.AbstractC9481sO0;
import o.C9634t12;

@InterfaceC10420wF0(emulated = true, serializable = true)
@InterfaceC6329fa0
/* renamed from: o.tO0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C9724tO0<K, V> extends AbstractC7028iO0<K, V> implements InterfaceC8660p22<K, V> {
    @InterfaceC11149zF0
    private static final long serialVersionUID = 0;
    public final transient AbstractC9481sO0<V> c1;
    @MB
    @SY0
    @InterfaceC7537kU1
    public transient C9724tO0<V, K> d1;
    @MB
    @SY0
    @InterfaceC7537kU1
    public transient AbstractC9481sO0<Map.Entry<K, V>> e1;

    /* renamed from: o.tO0$a */
    /* loaded from: classes3.dex */
    public static final class a<K, V> extends AbstractC7028iO0.c<K, V> {
        @Override // o.AbstractC7028iO0.c
        public Collection<V> c() {
            return C7469kD1.h();
        }

        @Override // o.AbstractC7028iO0.c
        /* renamed from: l */
        public C9724tO0<K, V> a() {
            Collection entrySet = this.a.entrySet();
            Comparator<? super K> comparator = this.b;
            if (comparator != null) {
                entrySet = AbstractC10587ww1.h(comparator).C().l(entrySet);
            }
            return C9724tO0.R(entrySet, this.c);
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
            return i(k, Arrays.asList(vArr));
        }

        @Override // o.AbstractC7028iO0.c
        @InterfaceC6181ey
        /* renamed from: u */
        public a<K, V> k(InterfaceC10058um1<? extends K, ? extends V> interfaceC10058um1) {
            for (Map.Entry<? extends K, Collection<? extends V>> entry : interfaceC10058um1.l().entrySet()) {
                i(entry.getKey(), entry.getValue());
            }
            return this;
        }
    }

    /* renamed from: o.tO0$b */
    /* loaded from: classes3.dex */
    public static final class b<K, V> extends AbstractC9481sO0<Map.Entry<K, V>> {
        @GJ2
        public final transient C9724tO0<K, V> a1;

        public b(C9724tO0<K, V> c9724tO0) {
            this.a1 = c9724tO0;
        }

        @Override // o.TN0, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@MB Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                return this.a1.q5(entry.getKey(), entry.getValue());
            }
            return false;
        }

        @Override // o.TN0
        public boolean j() {
            return false;
        }

        @Override // o.AbstractC9481sO0, o.TN0, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        /* renamed from: k */
        public AbstractC6237fB2<Map.Entry<K, V>> iterator() {
            return this.a1.f();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.a1.size();
        }
    }

    @InterfaceC11149zF0
    /* renamed from: o.tO0$c */
    /* loaded from: classes3.dex */
    public static final class c {
        public static final C9634t12.b<C9724tO0> a = C9634t12.a(C9724tO0.class, "emptySet");
    }

    public C9724tO0(AbstractC6044eO0<K, AbstractC9481sO0<V>> abstractC6044eO0, int i, @MB Comparator<? super V> comparator) {
        super(abstractC6044eO0, i);
        this.c1 = O(comparator);
    }

    public static <K, V> a<K, V> K() {
        return new a<>();
    }

    @InterfaceC4238Sm
    public static <K, V> C9724tO0<K, V> L(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
        return new a().h(iterable).a();
    }

    public static <K, V> C9724tO0<K, V> M(InterfaceC10058um1<? extends K, ? extends V> interfaceC10058um1) {
        return N(interfaceC10058um1, null);
    }

    public static <K, V> C9724tO0<K, V> N(InterfaceC10058um1<? extends K, ? extends V> interfaceC10058um1, @MB Comparator<? super V> comparator) {
        C10664xF1.E(interfaceC10058um1);
        if (interfaceC10058um1.isEmpty() && comparator == null) {
            return W();
        }
        if (interfaceC10058um1 instanceof C9724tO0) {
            C9724tO0<K, V> c9724tO0 = (C9724tO0) interfaceC10058um1;
            if (!c9724tO0.w()) {
                return c9724tO0;
            }
        }
        return R(interfaceC10058um1.l().entrySet(), comparator);
    }

    public static <V> AbstractC9481sO0<V> O(@MB Comparator<? super V> comparator) {
        if (comparator == null) {
            return AbstractC9481sO0.M();
        }
        return AbstractC10942yO0.E0(comparator);
    }

    public static <K, V> C9724tO0<K, V> R(Collection<? extends Map.Entry<? extends K, ? extends Collection<? extends V>>> collection, @MB Comparator<? super V> comparator) {
        if (collection.isEmpty()) {
            return W();
        }
        AbstractC6044eO0.b bVar = new AbstractC6044eO0.b(collection.size());
        int i = 0;
        for (Map.Entry<? extends K, ? extends Collection<? extends V>> entry : collection) {
            K key = entry.getKey();
            AbstractC9481sO0 f0 = f0(comparator, entry.getValue());
            if (!f0.isEmpty()) {
                bVar.i(key, f0);
                i += f0.size();
            }
        }
        return new C9724tO0<>(bVar.d(), i, comparator);
    }

    public static <K, V> C9724tO0<K, V> W() {
        return C4385Ua0.f1;
    }

    public static <K, V> C9724tO0<K, V> X(K k, V v) {
        a K = K();
        K.f(k, v);
        return K.a();
    }

    public static <K, V> C9724tO0<K, V> Y(K k, V v, K k2, V v2) {
        a K = K();
        K.f(k, v);
        K.f(k2, v2);
        return K.a();
    }

    public static <K, V> C9724tO0<K, V> Z(K k, V v, K k2, V v2, K k3, V v3) {
        a K = K();
        K.f(k, v);
        K.f(k2, v2);
        K.f(k3, v3);
        return K.a();
    }

    public static <K, V> C9724tO0<K, V> a0(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4) {
        a K = K();
        K.f(k, v);
        K.f(k2, v2);
        K.f(k3, v3);
        K.f(k4, v4);
        return K.a();
    }

    public static <K, V> C9724tO0<K, V> b0(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5) {
        a K = K();
        K.f(k, v);
        K.f(k2, v2);
        K.f(k3, v3);
        K.f(k4, v4);
        K.f(k5, v5);
        return K.a();
    }

    public static <V> AbstractC9481sO0<V> f0(@MB Comparator<? super V> comparator, Collection<? extends V> collection) {
        if (comparator == null) {
            return AbstractC9481sO0.G(collection);
        }
        return AbstractC10942yO0.u0(comparator, collection);
    }

    public static <V> AbstractC9481sO0.a<V> g0(@MB Comparator<? super V> comparator) {
        if (comparator == null) {
            return new AbstractC9481sO0.a<>();
        }
        return new AbstractC10942yO0.a(comparator);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC11149zF0
    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        Comparator comparator = (Comparator) objectInputStream.readObject();
        int readInt = objectInputStream.readInt();
        if (readInt >= 0) {
            AbstractC6044eO0.b b2 = AbstractC6044eO0.b();
            int i = 0;
            for (int i2 = 0; i2 < readInt; i2++) {
                Object readObject = objectInputStream.readObject();
                int readInt2 = objectInputStream.readInt();
                if (readInt2 > 0) {
                    AbstractC9481sO0.a g0 = g0(comparator);
                    for (int i3 = 0; i3 < readInt2; i3++) {
                        g0.g(objectInputStream.readObject());
                    }
                    AbstractC9481sO0 e = g0.e();
                    if (e.size() == readInt2) {
                        b2.i(readObject, e);
                        i += readInt2;
                    } else {
                        String valueOf = String.valueOf(readObject);
                        StringBuilder sb = new StringBuilder(valueOf.length() + 40);
                        sb.append("Duplicate key-value pairs exist for key ");
                        sb.append(valueOf);
                        throw new InvalidObjectException(sb.toString());
                    }
                } else {
                    StringBuilder sb2 = new StringBuilder(31);
                    sb2.append("Invalid value count ");
                    sb2.append(readInt2);
                    throw new InvalidObjectException(sb2.toString());
                }
            }
            try {
                AbstractC7028iO0.e.a.b(this, b2.d());
                AbstractC7028iO0.e.b.a(this, i);
                c.a.b(this, O(comparator));
                return;
            } catch (IllegalArgumentException e2) {
                throw ((InvalidObjectException) new InvalidObjectException(e2.getMessage()).initCause(e2));
            }
        }
        StringBuilder sb3 = new StringBuilder(29);
        sb3.append("Invalid key count ");
        sb3.append(readInt);
        throw new InvalidObjectException(sb3.toString());
    }

    @InterfaceC11149zF0
    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(U());
        C9634t12.j(this, objectOutputStream);
    }

    @Override // o.AbstractC7028iO0
    /* renamed from: P */
    public AbstractC9481sO0<Map.Entry<K, V>> s() {
        AbstractC9481sO0<Map.Entry<K, V>> abstractC9481sO0 = this.e1;
        if (abstractC9481sO0 == null) {
            b bVar = new b(this);
            this.e1 = bVar;
            return bVar;
        }
        return abstractC9481sO0;
    }

    @Override // o.AbstractC7028iO0
    /* renamed from: S */
    public AbstractC9481sO0<V> u(K k) {
        return (AbstractC9481sO0) C3743Nk1.a((AbstractC9481sO0) this.a1.get(k), this.c1);
    }

    @Override // o.AbstractC7028iO0
    /* renamed from: T */
    public C9724tO0<V, K> v() {
        C9724tO0<V, K> c9724tO0 = this.d1;
        if (c9724tO0 == null) {
            C9724tO0<V, K> V = V();
            this.d1 = V;
            return V;
        }
        return c9724tO0;
    }

    @MB
    public Comparator<? super V> U() {
        AbstractC9481sO0<V> abstractC9481sO0 = this.c1;
        if (abstractC9481sO0 instanceof AbstractC10942yO0) {
            return ((AbstractC10942yO0) abstractC9481sO0).comparator();
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final C9724tO0<V, K> V() {
        a K = K();
        AbstractC6237fB2 it = s().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            K.f(entry.getValue(), entry.getKey());
        }
        C9724tO0<V, K> a2 = K.a();
        a2.d1 = this;
        return a2;
    }

    @Override // o.AbstractC7028iO0, o.InterfaceC10058um1, o.InterfaceC8660p22
    @InterfaceC6181ey
    @J40("Always throws UnsupportedOperationException")
    @Deprecated
    /* renamed from: c0 */
    public final AbstractC9481sO0<V> i(@MB Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // o.AbstractC7028iO0, o.AbstractC6939i2, o.InterfaceC10058um1, o.InterfaceC8660p22
    @InterfaceC6181ey
    @J40("Always throws UnsupportedOperationException")
    @Deprecated
    /* renamed from: d0 */
    public final AbstractC9481sO0<V> j(K k, Iterable<? extends V> iterable) {
        throw new UnsupportedOperationException();
    }
}
