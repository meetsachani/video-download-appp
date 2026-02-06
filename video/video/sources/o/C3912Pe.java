package o;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import o.C3939Pk2;
import o.C7935m81;
import o.InterfaceC3744Nk2;

@InterfaceC6329fa0
@InterfaceC4238Sm
@InterfaceC10420wF0(emulated = true)
/* renamed from: o.Pe  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3912Pe<R, C, V> extends AbstractC10614x3<R, C, V> implements Serializable {
    private static final long serialVersionUID = 0;
    public final AbstractC5317bO0<C> Y0;
    public final AbstractC5317bO0<R> Z;
    public final AbstractC6044eO0<R, Integer> Z0;
    public final AbstractC6044eO0<C, Integer> a1;
    public final V[][] b1;
    @MB
    public transient C3912Pe<R, C, V>.f c1;
    @MB
    public transient C3912Pe<R, C, V>.h d1;

    /* renamed from: o.Pe$a */
    /* loaded from: classes3.dex */
    public class a extends Y0<InterfaceC3744Nk2.a<R, C, V>> {
        public a(int i) {
            super(i);
        }

        @Override // o.Y0
        /* renamed from: c */
        public InterfaceC3744Nk2.a<R, C, V> b(int i) {
            return C3912Pe.this.r(i);
        }
    }

    /* renamed from: o.Pe$b */
    /* loaded from: classes3.dex */
    public class b extends C3939Pk2.b<R, C, V> {
        public final int X;
        public final int Y;
        public final /* synthetic */ int Z;

        public b(int i) {
            this.Z = i;
            this.X = i / C3912Pe.this.Y0.size();
            this.Y = i % C3912Pe.this.Y0.size();
        }

        @Override // o.InterfaceC3744Nk2.a
        public R a() {
            return (R) C3912Pe.this.Z.get(this.X);
        }

        @Override // o.InterfaceC3744Nk2.a
        public C b() {
            return (C) C3912Pe.this.Y0.get(this.Y);
        }

        @Override // o.InterfaceC3744Nk2.a
        @MB
        public V getValue() {
            return (V) C3912Pe.this.k(this.X, this.Y);
        }
    }

    /* renamed from: o.Pe$c */
    /* loaded from: classes3.dex */
    public class c extends Y0<V> {
        public c(int i) {
            super(i);
        }

        @Override // o.Y0
        @MB
        public V b(int i) {
            return (V) C3912Pe.this.s(i);
        }
    }

    /* renamed from: o.Pe$d */
    /* loaded from: classes3.dex */
    public static abstract class d<K, V> extends C7935m81.A<K, V> {
        public final AbstractC6044eO0<K, Integer> X;

        /* renamed from: o.Pe$d$a */
        /* loaded from: classes3.dex */
        public class a extends M1<K, V> {
            public final /* synthetic */ int X;

            public a(int i) {
                this.X = i;
            }

            @Override // o.M1, java.util.Map.Entry
            public K getKey() {
                return (K) d.this.c(this.X);
            }

            @Override // o.M1, java.util.Map.Entry
            @InterfaceC7894ly1
            public V getValue() {
                return (V) d.this.e(this.X);
            }

            @Override // o.M1, java.util.Map.Entry
            @InterfaceC7894ly1
            public V setValue(@InterfaceC7894ly1 V v) {
                return (V) d.this.f(this.X, v);
            }
        }

        /* renamed from: o.Pe$d$b */
        /* loaded from: classes3.dex */
        public class b extends Y0<Map.Entry<K, V>> {
            public b(int i) {
                super(i);
            }

            @Override // o.Y0
            /* renamed from: c */
            public Map.Entry<K, V> b(int i) {
                return d.this.b(i);
            }
        }

        public /* synthetic */ d(AbstractC6044eO0 abstractC6044eO0, a aVar) {
            this(abstractC6044eO0);
        }

        @Override // o.C7935m81.A
        public Iterator<Map.Entry<K, V>> a() {
            return new b(size());
        }

        public Map.Entry<K, V> b(int i) {
            C10664xF1.C(i, size());
            return new a(i);
        }

        public K c(int i) {
            return this.X.keySet().d().get(i);
        }

        @Override // o.C7935m81.A, java.util.AbstractMap, java.util.Map
        public void clear() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(@MB Object obj) {
            return this.X.containsKey(obj);
        }

        public abstract String d();

        @InterfaceC7894ly1
        public abstract V e(int i);

        @InterfaceC7894ly1
        public abstract V f(int i, @InterfaceC7894ly1 V v);

        @Override // java.util.AbstractMap, java.util.Map
        @MB
        public V get(@MB Object obj) {
            Integer num = this.X.get(obj);
            if (num == null) {
                return null;
            }
            return e(num.intValue());
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean isEmpty() {
            return this.X.isEmpty();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Set<K> keySet() {
            return this.X.keySet();
        }

        @Override // java.util.AbstractMap, java.util.Map
        @MB
        public V put(K k, @InterfaceC7894ly1 V v) {
            Integer num = this.X.get(k);
            if (num != null) {
                return f(num.intValue(), v);
            }
            String d = d();
            String valueOf = String.valueOf(k);
            String valueOf2 = String.valueOf(this.X.keySet());
            StringBuilder sb = new StringBuilder(String.valueOf(d).length() + 9 + valueOf.length() + valueOf2.length());
            sb.append(d);
            sb.append(C4500Ve2.b);
            sb.append(valueOf);
            sb.append(" not in ");
            sb.append(valueOf2);
            throw new IllegalArgumentException(sb.toString());
        }

        @Override // java.util.AbstractMap, java.util.Map
        @MB
        public V remove(@MB Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // o.C7935m81.A, java.util.AbstractMap, java.util.Map
        public int size() {
            return this.X.size();
        }

        public d(AbstractC6044eO0<K, Integer> abstractC6044eO0) {
            this.X = abstractC6044eO0;
        }
    }

    /* renamed from: o.Pe$e */
    /* loaded from: classes3.dex */
    public class e extends d<R, V> {
        public final int Y;

        public e(int i) {
            super(C3912Pe.this.Z0, null);
            this.Y = i;
        }

        @Override // o.C3912Pe.d
        public String d() {
            return "Row";
        }

        @Override // o.C3912Pe.d
        @MB
        public V e(int i) {
            return (V) C3912Pe.this.k(i, this.Y);
        }

        @Override // o.C3912Pe.d
        @MB
        public V f(int i, @MB V v) {
            return (V) C3912Pe.this.v(i, this.Y, v);
        }
    }

    /* renamed from: o.Pe$f */
    /* loaded from: classes3.dex */
    public class f extends d<C, Map<R, V>> {
        public /* synthetic */ f(C3912Pe c3912Pe, a aVar) {
            this();
        }

        @Override // o.C3912Pe.d
        public String d() {
            return "Column";
        }

        @Override // o.C3912Pe.d
        /* renamed from: g */
        public Map<R, V> e(int i) {
            return new e(i);
        }

        @Override // o.C3912Pe.d, java.util.AbstractMap, java.util.Map
        @MB
        /* renamed from: i */
        public Map<R, V> put(C c, Map<R, V> map) {
            throw new UnsupportedOperationException();
        }

        @Override // o.C3912Pe.d
        /* renamed from: j */
        public Map<R, V> f(int i, Map<R, V> map) {
            throw new UnsupportedOperationException();
        }

        public f() {
            super(C3912Pe.this.a1, null);
        }
    }

    /* renamed from: o.Pe$g */
    /* loaded from: classes3.dex */
    public class g extends d<C, V> {
        public final int Y;

        public g(int i) {
            super(C3912Pe.this.a1, null);
            this.Y = i;
        }

        @Override // o.C3912Pe.d
        public String d() {
            return "Column";
        }

        @Override // o.C3912Pe.d
        @MB
        public V e(int i) {
            return (V) C3912Pe.this.k(this.Y, i);
        }

        @Override // o.C3912Pe.d
        @MB
        public V f(int i, @MB V v) {
            return (V) C3912Pe.this.v(this.Y, i, v);
        }
    }

    /* renamed from: o.Pe$h */
    /* loaded from: classes3.dex */
    public class h extends d<R, Map<C, V>> {
        public /* synthetic */ h(C3912Pe c3912Pe, a aVar) {
            this();
        }

        @Override // o.C3912Pe.d
        public String d() {
            return "Row";
        }

        @Override // o.C3912Pe.d
        /* renamed from: g */
        public Map<C, V> e(int i) {
            return new g(i);
        }

        @Override // o.C3912Pe.d, java.util.AbstractMap, java.util.Map
        @MB
        /* renamed from: i */
        public Map<C, V> put(R r, Map<C, V> map) {
            throw new UnsupportedOperationException();
        }

        @Override // o.C3912Pe.d
        /* renamed from: j */
        public Map<C, V> f(int i, Map<C, V> map) {
            throw new UnsupportedOperationException();
        }

        public h() {
            super(C3912Pe.this.Z0, null);
        }
    }

    public C3912Pe(Iterable<? extends R> iterable, Iterable<? extends C> iterable2) {
        AbstractC5317bO0<R> D = AbstractC5317bO0.D(iterable);
        this.Z = D;
        AbstractC5317bO0<C> D2 = AbstractC5317bO0.D(iterable2);
        this.Y0 = D2;
        C10664xF1.d(D.isEmpty() == D2.isEmpty());
        this.Z0 = C7935m81.Q(D);
        this.a1 = C7935m81.Q(D2);
        this.b1 = (V[][]) ((Object[][]) Array.newInstance(Object.class, D.size(), D2.size()));
        q();
    }

    public static <R, C, V> C3912Pe<R, C, V> n(Iterable<? extends R> iterable, Iterable<? extends C> iterable2) {
        return new C3912Pe<>(iterable, iterable2);
    }

    public static <R, C, V> C3912Pe<R, C, V> o(InterfaceC3744Nk2<R, C, ? extends V> interfaceC3744Nk2) {
        if (interfaceC3744Nk2 instanceof C3912Pe) {
            return new C3912Pe<>((C3912Pe) interfaceC3744Nk2);
        }
        return new C3912Pe<>(interfaceC3744Nk2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public InterfaceC3744Nk2.a<R, C, V> r(int i) {
        return new b(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @MB
    public V s(int i) {
        return k(i / this.Y0.size(), i % this.Y0.size());
    }

    @Override // o.AbstractC10614x3, o.InterfaceC3744Nk2
    public void D3(InterfaceC3744Nk2<? extends R, ? extends C, ? extends V> interfaceC3744Nk2) {
        super.D3(interfaceC3744Nk2);
    }

    @Override // o.InterfaceC3744Nk2
    public Map<R, Map<C, V>> H() {
        C3912Pe<R, C, V>.h hVar = this.d1;
        if (hVar == null) {
            C3912Pe<R, C, V>.h hVar2 = new h(this, null);
            this.d1 = hVar2;
            return hVar2;
        }
        return hVar;
    }

    @Override // o.AbstractC10614x3, o.InterfaceC3744Nk2
    public boolean M4(@MB Object obj) {
        return this.Z0.containsKey(obj);
    }

    @Override // o.AbstractC10614x3
    public Iterator<InterfaceC3744Nk2.a<R, C, V>> a() {
        return new a(size());
    }

    @Override // o.AbstractC10614x3, o.InterfaceC3744Nk2
    @J40("Always throws UnsupportedOperationException")
    @Deprecated
    public void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // o.AbstractC10614x3, o.InterfaceC3744Nk2
    public boolean containsValue(@MB Object obj) {
        V[][] vArr;
        for (V[] vArr2 : this.b1) {
            for (V v : vArr2) {
                if (C2593Bt1.a(obj, v)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // o.AbstractC10614x3
    public Iterator<V> d() {
        return new c(size());
    }

    @Override // o.InterfaceC3744Nk2
    public Map<R, V> d3(C c2) {
        C10664xF1.E(c2);
        Integer num = this.a1.get(c2);
        if (num == null) {
            return Collections.EMPTY_MAP;
        }
        return new e(num.intValue());
    }

    @Override // o.AbstractC10614x3, o.InterfaceC3744Nk2
    public /* bridge */ /* synthetic */ boolean equals(@MB Object obj) {
        return super.equals(obj);
    }

    @Override // o.AbstractC10614x3, o.InterfaceC3744Nk2
    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // o.InterfaceC3744Nk2
    public Map<C, Map<R, V>> i2() {
        C3912Pe<R, C, V>.f fVar = this.c1;
        if (fVar == null) {
            C3912Pe<R, C, V>.f fVar2 = new f(this, null);
            this.c1 = fVar2;
            return fVar2;
        }
        return fVar;
    }

    @Override // o.AbstractC10614x3, o.InterfaceC3744Nk2
    public boolean i5(@MB Object obj, @MB Object obj2) {
        if (M4(obj) && y0(obj2)) {
            return true;
        }
        return false;
    }

    @Override // o.AbstractC10614x3, o.InterfaceC3744Nk2
    public boolean isEmpty() {
        if (!this.Z.isEmpty() && !this.Y0.isEmpty()) {
            return false;
        }
        return true;
    }

    @MB
    public V k(int i, int i2) {
        C10664xF1.C(i, this.Z.size());
        C10664xF1.C(i2, this.Y0.size());
        return this.b1[i][i2];
    }

    public AbstractC5317bO0<C> l() {
        return this.Y0;
    }

    @Override // o.AbstractC10614x3, o.InterfaceC3744Nk2
    /* renamed from: m */
    public AbstractC9481sO0<C> L4() {
        return this.a1.keySet();
    }

    @Override // o.AbstractC10614x3, o.InterfaceC3744Nk2
    public Set<InterfaceC3744Nk2.a<R, C, V>> o3() {
        return super.o3();
    }

    @InterfaceC6181ey
    @MB
    public V p(@MB Object obj, @MB Object obj2) {
        Integer num = this.Z0.get(obj);
        Integer num2 = this.a1.get(obj2);
        if (num == null || num2 == null) {
            return null;
        }
        return v(num.intValue(), num2.intValue(), null);
    }

    public void q() {
        for (V[] vArr : this.b1) {
            Arrays.fill(vArr, (Object) null);
        }
    }

    @Override // o.AbstractC10614x3, o.InterfaceC3744Nk2
    @InterfaceC6181ey
    @MB
    public V q3(R r, C c2, @MB V v) {
        boolean z;
        C10664xF1.E(r);
        C10664xF1.E(c2);
        Integer num = this.Z0.get(r);
        boolean z2 = false;
        if (num != null) {
            z = true;
        } else {
            z = false;
        }
        C10664xF1.y(z, "Row %s not in %s", r, this.Z);
        Integer num2 = this.a1.get(c2);
        if (num2 != null) {
            z2 = true;
        }
        C10664xF1.y(z2, "Column %s not in %s", c2, this.Y0);
        return v(num.intValue(), num2.intValue(), v);
    }

    @Override // o.AbstractC10614x3, o.InterfaceC3744Nk2
    @MB
    public V r0(@MB Object obj, @MB Object obj2) {
        Integer num = this.Z0.get(obj);
        Integer num2 = this.a1.get(obj2);
        if (num != null && num2 != null) {
            return k(num.intValue(), num2.intValue());
        }
        return null;
    }

    @Override // o.AbstractC10614x3, o.InterfaceC3744Nk2
    @InterfaceC6181ey
    @MB
    @Deprecated
    @J40("Always throws UnsupportedOperationException")
    public V remove(@MB Object obj, @MB Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // o.InterfaceC3744Nk2
    public int size() {
        return this.Z.size() * this.Y0.size();
    }

    public AbstractC5317bO0<R> t() {
        return this.Z;
    }

    @Override // o.AbstractC10614x3
    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }

    @Override // o.AbstractC10614x3, o.InterfaceC3744Nk2
    /* renamed from: u */
    public AbstractC9481sO0<R> F() {
        return this.Z0.keySet();
    }

    @InterfaceC6181ey
    @MB
    public V v(int i, int i2, @MB V v) {
        C10664xF1.C(i, this.Z.size());
        C10664xF1.C(i2, this.Y0.size());
        V[] vArr = this.b1[i];
        V v2 = vArr[i2];
        vArr[i2] = v;
        return v2;
    }

    @Override // o.AbstractC10614x3, o.InterfaceC3744Nk2
    public Collection<V> values() {
        return super.values();
    }

    @InterfaceC11149zF0
    public V[][] w(Class<V> cls) {
        V[][] vArr = (V[][]) ((Object[][]) Array.newInstance((Class<?>) cls, this.Z.size(), this.Y0.size()));
        for (int i = 0; i < this.Z.size(); i++) {
            V[] vArr2 = this.b1[i];
            System.arraycopy(vArr2, 0, vArr[i], 0, vArr2.length);
        }
        return vArr;
    }

    @Override // o.InterfaceC3744Nk2
    public Map<C, V> x5(R r) {
        C10664xF1.E(r);
        Integer num = this.Z0.get(r);
        if (num == null) {
            return Collections.EMPTY_MAP;
        }
        return new g(num.intValue());
    }

    @Override // o.AbstractC10614x3, o.InterfaceC3744Nk2
    public boolean y0(@MB Object obj) {
        return this.a1.containsKey(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C3912Pe(InterfaceC3744Nk2<R, C, ? extends V> interfaceC3744Nk2) {
        this(interfaceC3744Nk2.F(), interfaceC3744Nk2.L4());
        D3(interfaceC3744Nk2);
    }

    public C3912Pe(C3912Pe<R, C, V> c3912Pe) {
        AbstractC5317bO0<R> abstractC5317bO0 = c3912Pe.Z;
        this.Z = abstractC5317bO0;
        AbstractC5317bO0<C> abstractC5317bO02 = c3912Pe.Y0;
        this.Y0 = abstractC5317bO02;
        this.Z0 = c3912Pe.Z0;
        this.a1 = c3912Pe.a1;
        V[][] vArr = (V[][]) ((Object[][]) Array.newInstance(Object.class, abstractC5317bO0.size(), abstractC5317bO02.size()));
        this.b1 = vArr;
        for (int i = 0; i < this.Z.size(); i++) {
            V[] vArr2 = c3912Pe.b1[i];
            System.arraycopy(vArr2, 0, vArr[i], 0, vArr2.length);
        }
    }
}
