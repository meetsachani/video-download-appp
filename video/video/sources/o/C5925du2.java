package o;

import java.io.Serializable;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import o.C7935m81;

@InterfaceC10420wF0(serializable = true)
@InterfaceC6329fa0
/* renamed from: o.du2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C5925du2<R, C, V> extends C4294Tb2<R, C, V> {
    private static final long serialVersionUID = 0;
    public final Comparator<? super C> c1;

    /* renamed from: o.du2$a */
    /* loaded from: classes3.dex */
    public class a extends AbstractC6437g1<C> {
        public final /* synthetic */ Iterator Y0;
        @MB
        public C Z;
        public final /* synthetic */ Comparator Z0;

        public a(C5925du2 c5925du2, Iterator it, Comparator comparator) {
            this.Y0 = it;
            this.Z0 = comparator;
        }

        /* JADX WARN: Removed duplicated region for block: B:4:0x0008  */
        @Override // o.AbstractC6437g1
        @MB
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public C b() {
            while (this.Y0.hasNext()) {
                C c = (C) this.Y0.next();
                C c2 = this.Z;
                if (c2 == null || this.Z0.compare(c, c2) != 0) {
                    this.Z = c;
                    return c;
                }
                while (this.Y0.hasNext()) {
                }
            }
            this.Z = null;
            return c();
        }
    }

    /* renamed from: o.du2$b */
    /* loaded from: classes3.dex */
    public static class b<C, V> implements InterfaceC8331nh2<TreeMap<C, V>>, Serializable {
        private static final long serialVersionUID = 0;
        public final Comparator<? super C> X;

        public b(Comparator<? super C> comparator) {
            this.X = comparator;
        }

        @Override // o.InterfaceC8331nh2
        /* renamed from: a */
        public TreeMap<C, V> get() {
            return new TreeMap<>(this.X);
        }
    }

    /* renamed from: o.du2$c */
    /* loaded from: classes3.dex */
    public class c extends C4488Vb2<R, C, V>.g implements SortedMap<C, V> {
        @MB
        public final C Y0;
        @MB
        public final C Z0;
        @MB
        public transient SortedMap<C, V> a1;

        public c(C5925du2 c5925du2, R r) {
            this(r, null, null);
        }

        @Override // o.C4488Vb2.g
        public void c() {
            k();
            SortedMap<C, V> sortedMap = this.a1;
            if (sortedMap != null && sortedMap.isEmpty()) {
                C5925du2.this.Z.remove(this.X);
                this.a1 = null;
                this.Y = null;
            }
        }

        @Override // java.util.SortedMap
        public Comparator<? super C> comparator() {
            return C5925du2.this.r();
        }

        @Override // o.C4488Vb2.g, java.util.AbstractMap, java.util.Map
        public boolean containsKey(@MB Object obj) {
            if (j(obj) && super.containsKey(obj)) {
                return true;
            }
            return false;
        }

        public int f(Object obj, Object obj2) {
            return comparator().compare(obj, obj2);
        }

        @Override // java.util.SortedMap
        public C firstKey() {
            d();
            Map<C, V> map = this.Y;
            if (map != null) {
                return (C) ((SortedMap) map).firstKey();
            }
            throw new NoSuchElementException();
        }

        @Override // o.C4488Vb2.g
        @MB
        /* renamed from: g */
        public SortedMap<C, V> b() {
            k();
            SortedMap<C, V> sortedMap = this.a1;
            if (sortedMap != null) {
                C c = this.Y0;
                if (c != null) {
                    sortedMap = sortedMap.tailMap(c);
                }
                C c2 = this.Z0;
                if (c2 != null) {
                    return sortedMap.headMap(c2);
                }
                return sortedMap;
            }
            return null;
        }

        @Override // java.util.SortedMap
        public SortedMap<C, V> headMap(C c) {
            C10664xF1.d(j(C10664xF1.E(c)));
            return new c(this.X, this.Y0, c);
        }

        @Override // java.util.AbstractMap, java.util.Map, java.util.SortedMap
        /* renamed from: i */
        public SortedSet<C> keySet() {
            return new C7935m81.G(this);
        }

        public boolean j(@MB Object obj) {
            if (obj != null) {
                C c = this.Y0;
                if (c == null || f(c, obj) <= 0) {
                    C c2 = this.Z0;
                    if (c2 == null || f(c2, obj) > 0) {
                        return true;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }

        public void k() {
            SortedMap<C, V> sortedMap = this.a1;
            if (sortedMap != null && (!sortedMap.isEmpty() || !C5925du2.this.Z.containsKey(this.X))) {
                return;
            }
            this.a1 = (SortedMap) C5925du2.this.Z.get(this.X);
        }

        @Override // java.util.SortedMap
        public C lastKey() {
            d();
            Map<C, V> map = this.Y;
            if (map != null) {
                return (C) ((SortedMap) map).lastKey();
            }
            throw new NoSuchElementException();
        }

        @Override // o.C4488Vb2.g, java.util.AbstractMap, java.util.Map
        @MB
        public V put(C c, V v) {
            C10664xF1.d(j(C10664xF1.E(c)));
            return (V) super.put(c, v);
        }

        @Override // java.util.SortedMap
        public SortedMap<C, V> subMap(C c, C c2) {
            boolean z;
            if (j(C10664xF1.E(c)) && j(C10664xF1.E(c2))) {
                z = true;
            } else {
                z = false;
            }
            C10664xF1.d(z);
            return new c(this.X, c, c2);
        }

        @Override // java.util.SortedMap
        public SortedMap<C, V> tailMap(C c) {
            C10664xF1.d(j(C10664xF1.E(c)));
            return new c(this.X, c, this.Z0);
        }

        public c(R r, @MB C c, @MB C c2) {
            super(r);
            this.Y0 = c;
            this.Z0 = c2;
            C10664xF1.d(c == null || c2 == null || f(c, c2) <= 0);
        }
    }

    public C5925du2(Comparator<? super R> comparator, Comparator<? super C> comparator2) {
        super(new TreeMap(comparator), new b(comparator2));
        this.c1 = comparator2;
    }

    public static <R extends Comparable, C extends Comparable, V> C5925du2<R, C, V> s() {
        return new C5925du2<>(AbstractC10587ww1.z(), AbstractC10587ww1.z());
    }

    public static <R, C, V> C5925du2<R, C, V> t(Comparator<? super R> comparator, Comparator<? super C> comparator2) {
        C10664xF1.E(comparator);
        C10664xF1.E(comparator2);
        return new C5925du2<>(comparator, comparator2);
    }

    public static <R, C, V> C5925du2<R, C, V> u(C5925du2<R, C, ? extends V> c5925du2) {
        C5925du2<R, C, V> c5925du22 = new C5925du2<>(c5925du2.w(), c5925du2.r());
        c5925du22.D3(c5925du2);
        return c5925du22;
    }

    @Override // o.AbstractC10614x3, o.InterfaceC3744Nk2
    public /* bridge */ /* synthetic */ void D3(InterfaceC3744Nk2 interfaceC3744Nk2) {
        super.D3(interfaceC3744Nk2);
    }

    @Override // o.C4488Vb2, o.AbstractC10614x3, o.InterfaceC3744Nk2
    public /* bridge */ /* synthetic */ Set L4() {
        return super.L4();
    }

    @Override // o.C4488Vb2, o.AbstractC10614x3, o.InterfaceC3744Nk2
    public /* bridge */ /* synthetic */ boolean M4(@MB Object obj) {
        return super.M4(obj);
    }

    @Override // o.C4488Vb2, o.AbstractC10614x3, o.InterfaceC3744Nk2
    public /* bridge */ /* synthetic */ void clear() {
        super.clear();
    }

    @Override // o.C4488Vb2, o.AbstractC10614x3, o.InterfaceC3744Nk2
    public /* bridge */ /* synthetic */ boolean containsValue(@MB Object obj) {
        return super.containsValue(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.C4488Vb2, o.InterfaceC3744Nk2
    public /* bridge */ /* synthetic */ Map d3(Object obj) {
        return super.d3(obj);
    }

    @Override // o.AbstractC10614x3, o.InterfaceC3744Nk2
    public /* bridge */ /* synthetic */ boolean equals(@MB Object obj) {
        return super.equals(obj);
    }

    @Override // o.AbstractC10614x3, o.InterfaceC3744Nk2
    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // o.C4488Vb2
    public Iterator<C> i() {
        Comparator<? super C> r = r();
        return new a(this, C7052iU0.O(C5098aU0.U(this.Z.values(), new YA0() { // from class: o.cu2
            @Override // o.YA0
            public final Object apply(Object obj) {
                Iterator it;
                it = ((Map) obj).keySet().iterator();
                return it;
            }
        }), r), r);
    }

    @Override // o.C4488Vb2, o.InterfaceC3744Nk2
    public /* bridge */ /* synthetic */ Map i2() {
        return super.i2();
    }

    @Override // o.C4488Vb2, o.AbstractC10614x3, o.InterfaceC3744Nk2
    public /* bridge */ /* synthetic */ boolean i5(@MB Object obj, @MB Object obj2) {
        return super.i5(obj, obj2);
    }

    @Override // o.C4488Vb2, o.AbstractC10614x3, o.InterfaceC3744Nk2
    public /* bridge */ /* synthetic */ boolean isEmpty() {
        return super.isEmpty();
    }

    @Override // o.C4488Vb2, o.AbstractC10614x3, o.InterfaceC3744Nk2
    public /* bridge */ /* synthetic */ Set o3() {
        return super.o3();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.C4488Vb2, o.AbstractC10614x3, o.InterfaceC3744Nk2
    @InterfaceC6181ey
    @MB
    public /* bridge */ /* synthetic */ Object q3(Object obj, Object obj2, Object obj3) {
        return super.q3(obj, obj2, obj3);
    }

    @Deprecated
    public Comparator<? super C> r() {
        return this.c1;
    }

    @Override // o.C4488Vb2, o.AbstractC10614x3, o.InterfaceC3744Nk2
    @MB
    public /* bridge */ /* synthetic */ Object r0(@MB Object obj, @MB Object obj2) {
        return super.r0(obj, obj2);
    }

    @Override // o.C4488Vb2, o.AbstractC10614x3, o.InterfaceC3744Nk2
    @InterfaceC6181ey
    @MB
    public /* bridge */ /* synthetic */ Object remove(@MB Object obj, @MB Object obj2) {
        return super.remove(obj, obj2);
    }

    @Override // o.C4488Vb2, o.InterfaceC3744Nk2
    public /* bridge */ /* synthetic */ int size() {
        return super.size();
    }

    @Override // o.AbstractC10614x3
    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }

    @Override // o.C4488Vb2, o.InterfaceC3744Nk2
    /* renamed from: v */
    public SortedMap<C, V> x5(R r) {
        return new c(this, r);
    }

    @Override // o.C4488Vb2, o.AbstractC10614x3, o.InterfaceC3744Nk2
    public /* bridge */ /* synthetic */ Collection values() {
        return super.values();
    }

    @Deprecated
    public Comparator<? super R> w() {
        Comparator<? super R> comparator = F().comparator();
        Objects.requireNonNull(comparator);
        return comparator;
    }

    @Override // o.C4488Vb2, o.AbstractC10614x3, o.InterfaceC3744Nk2
    public /* bridge */ /* synthetic */ boolean y0(@MB Object obj) {
        return super.y0(obj);
    }

    @Override // o.C4294Tb2, o.C4488Vb2, o.AbstractC10614x3, o.InterfaceC3744Nk2
    public SortedSet<R> F() {
        return super.F();
    }

    @Override // o.C4294Tb2, o.C4488Vb2, o.InterfaceC3744Nk2
    public SortedMap<R, Map<C, V>> H() {
        return super.H();
    }
}
