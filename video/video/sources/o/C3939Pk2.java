package o;

import java.io.Serializable;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import o.InterfaceC3744Nk2;

@InterfaceC10420wF0
@InterfaceC6329fa0
/* renamed from: o.Pk2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3939Pk2 {
    public static final YA0<? extends Map<?, ?>, ? extends Map<?, ?>> a = new a();

    /* renamed from: o.Pk2$a */
    /* loaded from: classes3.dex */
    public class a implements YA0<Map<Object, Object>, Map<Object, Object>> {
        @Override // o.YA0
        /* renamed from: a */
        public Map<Object, Object> apply(Map<Object, Object> map) {
            return Collections.unmodifiableMap(map);
        }
    }

    /* renamed from: o.Pk2$b */
    /* loaded from: classes3.dex */
    public static abstract class b<R, C, V> implements InterfaceC3744Nk2.a<R, C, V> {
        @Override // o.InterfaceC3744Nk2.a
        public boolean equals(@MB Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof InterfaceC3744Nk2.a) {
                InterfaceC3744Nk2.a aVar = (InterfaceC3744Nk2.a) obj;
                if (C2593Bt1.a(a(), aVar.a()) && C2593Bt1.a(b(), aVar.b()) && C2593Bt1.a(getValue(), aVar.getValue())) {
                    return true;
                }
            }
            return false;
        }

        @Override // o.InterfaceC3744Nk2.a
        public int hashCode() {
            return C2593Bt1.b(a(), b(), getValue());
        }

        public String toString() {
            String valueOf = String.valueOf(a());
            String valueOf2 = String.valueOf(b());
            String valueOf3 = String.valueOf(getValue());
            StringBuilder sb = new StringBuilder(valueOf.length() + 4 + valueOf2.length() + valueOf3.length());
            sb.append(C9811tl1.c);
            sb.append(valueOf);
            sb.append(",");
            sb.append(valueOf2);
            sb.append(")=");
            sb.append(valueOf3);
            return sb.toString();
        }
    }

    /* renamed from: o.Pk2$c */
    /* loaded from: classes3.dex */
    public static final class c<R, C, V> extends b<R, C, V> implements Serializable {
        private static final long serialVersionUID = 0;
        @InterfaceC7894ly1
        public final R X;
        @InterfaceC7894ly1
        public final C Y;
        @InterfaceC7894ly1
        public final V Z;

        public c(@InterfaceC7894ly1 R r, @InterfaceC7894ly1 C c, @InterfaceC7894ly1 V v) {
            this.X = r;
            this.Y = c;
            this.Z = v;
        }

        @Override // o.InterfaceC3744Nk2.a
        @InterfaceC7894ly1
        public R a() {
            return this.X;
        }

        @Override // o.InterfaceC3744Nk2.a
        @InterfaceC7894ly1
        public C b() {
            return this.Y;
        }

        @Override // o.InterfaceC3744Nk2.a
        @InterfaceC7894ly1
        public V getValue() {
            return this.Z;
        }
    }

    /* renamed from: o.Pk2$d */
    /* loaded from: classes3.dex */
    public static class d<R, C, V1, V2> extends AbstractC10614x3<R, C, V2> {
        public final YA0<? super V1, V2> Y0;
        public final InterfaceC3744Nk2<R, C, V1> Z;

        /* renamed from: o.Pk2$d$a */
        /* loaded from: classes3.dex */
        public class a implements YA0<InterfaceC3744Nk2.a<R, C, V1>, InterfaceC3744Nk2.a<R, C, V2>> {
            public a() {
            }

            @Override // o.YA0
            /* renamed from: a */
            public InterfaceC3744Nk2.a<R, C, V2> apply(InterfaceC3744Nk2.a<R, C, V1> aVar) {
                return C3939Pk2.c(aVar.a(), aVar.b(), d.this.Y0.apply(aVar.getValue()));
            }
        }

        /* renamed from: o.Pk2$d$b */
        /* loaded from: classes3.dex */
        public class b implements YA0<Map<C, V1>, Map<C, V2>> {
            public b() {
            }

            @Override // o.YA0
            /* renamed from: a */
            public Map<C, V2> apply(Map<C, V1> map) {
                return C7935m81.B0(map, d.this.Y0);
            }
        }

        /* renamed from: o.Pk2$d$c */
        /* loaded from: classes3.dex */
        public class c implements YA0<Map<R, V1>, Map<R, V2>> {
            public c() {
            }

            @Override // o.YA0
            /* renamed from: a */
            public Map<R, V2> apply(Map<R, V1> map) {
                return C7935m81.B0(map, d.this.Y0);
            }
        }

        public d(InterfaceC3744Nk2<R, C, V1> interfaceC3744Nk2, YA0<? super V1, V2> ya0) {
            this.Z = (InterfaceC3744Nk2) C10664xF1.E(interfaceC3744Nk2);
            this.Y0 = (YA0) C10664xF1.E(ya0);
        }

        @Override // o.AbstractC10614x3, o.InterfaceC3744Nk2
        public void D3(InterfaceC3744Nk2<? extends R, ? extends C, ? extends V2> interfaceC3744Nk2) {
            throw new UnsupportedOperationException();
        }

        @Override // o.AbstractC10614x3, o.InterfaceC3744Nk2
        public Set<R> F() {
            return this.Z.F();
        }

        @Override // o.InterfaceC3744Nk2
        public Map<R, Map<C, V2>> H() {
            return C7935m81.B0(this.Z.H(), new b());
        }

        @Override // o.AbstractC10614x3, o.InterfaceC3744Nk2
        public Set<C> L4() {
            return this.Z.L4();
        }

        @Override // o.AbstractC10614x3
        public Iterator<InterfaceC3744Nk2.a<R, C, V2>> a() {
            return C7052iU0.c0(this.Z.o3().iterator(), e());
        }

        @Override // o.AbstractC10614x3
        public Collection<V2> c() {
            return C7232jF.m(this.Z.values(), this.Y0);
        }

        @Override // o.AbstractC10614x3, o.InterfaceC3744Nk2
        public void clear() {
            this.Z.clear();
        }

        @Override // o.InterfaceC3744Nk2
        public Map<R, V2> d3(@InterfaceC7894ly1 C c2) {
            return C7935m81.B0(this.Z.d3(c2), this.Y0);
        }

        public YA0<InterfaceC3744Nk2.a<R, C, V1>, InterfaceC3744Nk2.a<R, C, V2>> e() {
            return new a();
        }

        @Override // o.InterfaceC3744Nk2
        public Map<C, Map<R, V2>> i2() {
            return C7935m81.B0(this.Z.i2(), new c());
        }

        @Override // o.AbstractC10614x3, o.InterfaceC3744Nk2
        public boolean i5(@MB Object obj, @MB Object obj2) {
            return this.Z.i5(obj, obj2);
        }

        @Override // o.AbstractC10614x3, o.InterfaceC3744Nk2
        @MB
        public V2 q3(@InterfaceC7894ly1 R r, @InterfaceC7894ly1 C c2, @InterfaceC7894ly1 V2 v2) {
            throw new UnsupportedOperationException();
        }

        @Override // o.AbstractC10614x3, o.InterfaceC3744Nk2
        @MB
        public V2 r0(@MB Object obj, @MB Object obj2) {
            if (i5(obj, obj2)) {
                return this.Y0.apply((Object) C2491As1.a(this.Z.r0(obj, obj2)));
            }
            return null;
        }

        @Override // o.AbstractC10614x3, o.InterfaceC3744Nk2
        @MB
        public V2 remove(@MB Object obj, @MB Object obj2) {
            if (i5(obj, obj2)) {
                return this.Y0.apply((Object) C2491As1.a(this.Z.remove(obj, obj2)));
            }
            return null;
        }

        @Override // o.InterfaceC3744Nk2
        public int size() {
            return this.Z.size();
        }

        @Override // o.InterfaceC3744Nk2
        public Map<C, V2> x5(@InterfaceC7894ly1 R r) {
            return C7935m81.B0(this.Z.x5(r), this.Y0);
        }
    }

    /* renamed from: o.Pk2$e */
    /* loaded from: classes3.dex */
    public static class e<C, R, V> extends AbstractC10614x3<C, R, V> {
        public static final YA0<InterfaceC3744Nk2.a<?, ?, ?>, InterfaceC3744Nk2.a<?, ?, ?>> Y0 = new a();
        public final InterfaceC3744Nk2<R, C, V> Z;

        /* renamed from: o.Pk2$e$a */
        /* loaded from: classes3.dex */
        public class a implements YA0<InterfaceC3744Nk2.a<?, ?, ?>, InterfaceC3744Nk2.a<?, ?, ?>> {
            @Override // o.YA0
            /* renamed from: a */
            public InterfaceC3744Nk2.a<?, ?, ?> apply(InterfaceC3744Nk2.a<?, ?, ?> aVar) {
                return C3939Pk2.c(aVar.b(), aVar.a(), aVar.getValue());
            }
        }

        public e(InterfaceC3744Nk2<R, C, V> interfaceC3744Nk2) {
            this.Z = (InterfaceC3744Nk2) C10664xF1.E(interfaceC3744Nk2);
        }

        @Override // o.AbstractC10614x3, o.InterfaceC3744Nk2
        public void D3(InterfaceC3744Nk2<? extends C, ? extends R, ? extends V> interfaceC3744Nk2) {
            this.Z.D3(C3939Pk2.g(interfaceC3744Nk2));
        }

        @Override // o.AbstractC10614x3, o.InterfaceC3744Nk2
        public Set<C> F() {
            return this.Z.L4();
        }

        @Override // o.InterfaceC3744Nk2
        public Map<C, Map<R, V>> H() {
            return this.Z.i2();
        }

        @Override // o.AbstractC10614x3, o.InterfaceC3744Nk2
        public Set<R> L4() {
            return this.Z.F();
        }

        @Override // o.AbstractC10614x3, o.InterfaceC3744Nk2
        public boolean M4(@MB Object obj) {
            return this.Z.y0(obj);
        }

        @Override // o.AbstractC10614x3
        public Iterator<InterfaceC3744Nk2.a<C, R, V>> a() {
            return C7052iU0.c0(this.Z.o3().iterator(), Y0);
        }

        @Override // o.AbstractC10614x3, o.InterfaceC3744Nk2
        public void clear() {
            this.Z.clear();
        }

        @Override // o.AbstractC10614x3, o.InterfaceC3744Nk2
        public boolean containsValue(@MB Object obj) {
            return this.Z.containsValue(obj);
        }

        @Override // o.InterfaceC3744Nk2
        public Map<C, V> d3(@InterfaceC7894ly1 R r) {
            return this.Z.x5(r);
        }

        @Override // o.InterfaceC3744Nk2
        public Map<R, Map<C, V>> i2() {
            return this.Z.H();
        }

        @Override // o.AbstractC10614x3, o.InterfaceC3744Nk2
        public boolean i5(@MB Object obj, @MB Object obj2) {
            return this.Z.i5(obj2, obj);
        }

        @Override // o.AbstractC10614x3, o.InterfaceC3744Nk2
        @MB
        public V q3(@InterfaceC7894ly1 C c, @InterfaceC7894ly1 R r, @InterfaceC7894ly1 V v) {
            return this.Z.q3(r, c, v);
        }

        @Override // o.AbstractC10614x3, o.InterfaceC3744Nk2
        @MB
        public V r0(@MB Object obj, @MB Object obj2) {
            return this.Z.r0(obj2, obj);
        }

        @Override // o.AbstractC10614x3, o.InterfaceC3744Nk2
        @MB
        public V remove(@MB Object obj, @MB Object obj2) {
            return this.Z.remove(obj2, obj);
        }

        @Override // o.InterfaceC3744Nk2
        public int size() {
            return this.Z.size();
        }

        @Override // o.AbstractC10614x3, o.InterfaceC3744Nk2
        public Collection<V> values() {
            return this.Z.values();
        }

        @Override // o.InterfaceC3744Nk2
        public Map<R, V> x5(@InterfaceC7894ly1 C c) {
            return this.Z.d3(c);
        }

        @Override // o.AbstractC10614x3, o.InterfaceC3744Nk2
        public boolean y0(@MB Object obj) {
            return this.Z.M4(obj);
        }
    }

    /* renamed from: o.Pk2$f */
    /* loaded from: classes3.dex */
    public static final class f<R, C, V> extends g<R, C, V> implements InterfaceC10238vV1<R, C, V> {
        private static final long serialVersionUID = 0;

        public f(InterfaceC10238vV1<R, ? extends C, ? extends V> interfaceC10238vV1) {
            super(interfaceC10238vV1);
        }

        @Override // o.C3939Pk2.g, o.AbstractC3598Ly0
        /* renamed from: N5 */
        public InterfaceC10238vV1<R, C, V> M5() {
            return (InterfaceC10238vV1) super.L5();
        }

        @Override // o.C3939Pk2.g, o.AbstractC3598Ly0, o.InterfaceC3744Nk2
        public SortedSet<R> F() {
            return Collections.unmodifiableSortedSet(M5().F());
        }

        @Override // o.C3939Pk2.g, o.AbstractC3598Ly0, o.InterfaceC3744Nk2
        public SortedMap<R, Map<C, V>> H() {
            return Collections.unmodifiableSortedMap(C7935m81.D0(M5().H(), C3939Pk2.a()));
        }
    }

    /* renamed from: o.Pk2$g */
    /* loaded from: classes3.dex */
    public static class g<R, C, V> extends AbstractC3598Ly0<R, C, V> implements Serializable {
        private static final long serialVersionUID = 0;
        public final InterfaceC3744Nk2<? extends R, ? extends C, ? extends V> X;

        public g(InterfaceC3744Nk2<? extends R, ? extends C, ? extends V> interfaceC3744Nk2) {
            this.X = (InterfaceC3744Nk2) C10664xF1.E(interfaceC3744Nk2);
        }

        @Override // o.AbstractC3598Ly0, o.InterfaceC3744Nk2
        public void D3(InterfaceC3744Nk2<? extends R, ? extends C, ? extends V> interfaceC3744Nk2) {
            throw new UnsupportedOperationException();
        }

        @Override // o.AbstractC3598Ly0, o.InterfaceC3744Nk2
        public Set<R> F() {
            return Collections.unmodifiableSet(super.F());
        }

        @Override // o.AbstractC3598Ly0, o.InterfaceC3744Nk2
        public Map<R, Map<C, V>> H() {
            return Collections.unmodifiableMap(C7935m81.B0(super.H(), C3939Pk2.a()));
        }

        @Override // o.AbstractC3598Ly0, o.InterfaceC3744Nk2
        public Set<C> L4() {
            return Collections.unmodifiableSet(super.L4());
        }

        @Override // o.AbstractC3598Ly0, o.AbstractC2510Ay0
        /* renamed from: M5 */
        public InterfaceC3744Nk2<R, C, V> L5() {
            return (InterfaceC3744Nk2<? extends R, ? extends C, ? extends V>) this.X;
        }

        @Override // o.AbstractC3598Ly0, o.InterfaceC3744Nk2
        public void clear() {
            throw new UnsupportedOperationException();
        }

        @Override // o.AbstractC3598Ly0, o.InterfaceC3744Nk2
        public Map<R, V> d3(@InterfaceC7894ly1 C c) {
            return Collections.unmodifiableMap(super.d3(c));
        }

        @Override // o.AbstractC3598Ly0, o.InterfaceC3744Nk2
        public Map<C, Map<R, V>> i2() {
            return Collections.unmodifiableMap(C7935m81.B0(super.i2(), C3939Pk2.a()));
        }

        @Override // o.AbstractC3598Ly0, o.InterfaceC3744Nk2
        public Set<InterfaceC3744Nk2.a<R, C, V>> o3() {
            return Collections.unmodifiableSet(super.o3());
        }

        @Override // o.AbstractC3598Ly0, o.InterfaceC3744Nk2
        @MB
        public V q3(@InterfaceC7894ly1 R r, @InterfaceC7894ly1 C c, @InterfaceC7894ly1 V v) {
            throw new UnsupportedOperationException();
        }

        @Override // o.AbstractC3598Ly0, o.InterfaceC3744Nk2
        @MB
        public V remove(@MB Object obj, @MB Object obj2) {
            throw new UnsupportedOperationException();
        }

        @Override // o.AbstractC3598Ly0, o.InterfaceC3744Nk2
        public Collection<V> values() {
            return Collections.unmodifiableCollection(super.values());
        }

        @Override // o.AbstractC3598Ly0, o.InterfaceC3744Nk2
        public Map<C, V> x5(@InterfaceC7894ly1 R r) {
            return Collections.unmodifiableMap(super.x5(r));
        }
    }

    public static /* synthetic */ YA0 a() {
        return j();
    }

    public static boolean b(InterfaceC3744Nk2<?, ?, ?> interfaceC3744Nk2, @MB Object obj) {
        if (obj == interfaceC3744Nk2) {
            return true;
        }
        if (obj instanceof InterfaceC3744Nk2) {
            return interfaceC3744Nk2.o3().equals(((InterfaceC3744Nk2) obj).o3());
        }
        return false;
    }

    public static <R, C, V> InterfaceC3744Nk2.a<R, C, V> c(@InterfaceC7894ly1 R r, @InterfaceC7894ly1 C c2, @InterfaceC7894ly1 V v) {
        return new c(r, c2, v);
    }

    @InterfaceC4238Sm
    public static <R, C, V> InterfaceC3744Nk2<R, C, V> d(Map<R, Map<C, V>> map, InterfaceC8331nh2<? extends Map<C, V>> interfaceC8331nh2) {
        C10664xF1.d(map.isEmpty());
        C10664xF1.E(interfaceC8331nh2);
        return new C4488Vb2(map, interfaceC8331nh2);
    }

    public static <R, C, V> InterfaceC3744Nk2<R, C, V> e(InterfaceC3744Nk2<R, C, V> interfaceC3744Nk2) {
        return C9069qj2.z(interfaceC3744Nk2, null);
    }

    @InterfaceC4238Sm
    public static <R, C, V1, V2> InterfaceC3744Nk2<R, C, V2> f(InterfaceC3744Nk2<R, C, V1> interfaceC3744Nk2, YA0<? super V1, V2> ya0) {
        return new d(interfaceC3744Nk2, ya0);
    }

    public static <R, C, V> InterfaceC3744Nk2<C, R, V> g(InterfaceC3744Nk2<R, C, V> interfaceC3744Nk2) {
        if (interfaceC3744Nk2 instanceof e) {
            return (InterfaceC3744Nk2<R, C, V>) ((e) interfaceC3744Nk2).Z;
        }
        return new e(interfaceC3744Nk2);
    }

    @InterfaceC4238Sm
    public static <R, C, V> InterfaceC10238vV1<R, C, V> h(InterfaceC10238vV1<R, ? extends C, ? extends V> interfaceC10238vV1) {
        return new f(interfaceC10238vV1);
    }

    public static <R, C, V> InterfaceC3744Nk2<R, C, V> i(InterfaceC3744Nk2<? extends R, ? extends C, ? extends V> interfaceC3744Nk2) {
        return new g(interfaceC3744Nk2);
    }

    public static <K, V> YA0<Map<K, V>, Map<K, V>> j() {
        return (YA0<Map<K, V>, Map<K, V>>) a;
    }
}
