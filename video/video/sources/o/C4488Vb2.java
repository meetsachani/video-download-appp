package o;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import o.C10856y22;
import o.C7935m81;
import o.InterfaceC3744Nk2;

@InterfaceC10420wF0
@InterfaceC6329fa0
/* renamed from: o.Vb2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C4488Vb2<R, C, V> extends AbstractC10614x3<R, C, V> implements Serializable {
    private static final long serialVersionUID = 0;
    @BF0
    public final InterfaceC8331nh2<? extends Map<C, V>> Y0;
    @BF0
    public final Map<R, Map<C, V>> Z;
    @MB
    public transient Set<C> Z0;
    @MB
    public transient Map<R, Map<C, V>> a1;
    @MB
    public transient C4488Vb2<R, C, V>.f b1;

    /* renamed from: o.Vb2$b */
    /* loaded from: classes3.dex */
    public class b implements Iterator<InterfaceC3744Nk2.a<R, C, V>> {
        public final Iterator<Map.Entry<R, Map<C, V>>> X;
        @MB
        public Map.Entry<R, Map<C, V>> Y;
        public Iterator<Map.Entry<C, V>> Z;

        public b() {
            this.X = C4488Vb2.this.Z.entrySet().iterator();
            this.Z = C7052iU0.w();
        }

        @Override // java.util.Iterator
        /* renamed from: b */
        public InterfaceC3744Nk2.a<R, C, V> next() {
            if (!this.Z.hasNext()) {
                Map.Entry<R, Map<C, V>> next = this.X.next();
                this.Y = next;
                this.Z = next.getValue().entrySet().iterator();
            }
            Objects.requireNonNull(this.Y);
            Map.Entry<C, V> next2 = this.Z.next();
            return C3939Pk2.c(this.Y.getKey(), next2.getKey(), next2.getValue());
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (!this.X.hasNext() && !this.Z.hasNext()) {
                return false;
            }
            return true;
        }

        @Override // java.util.Iterator
        public void remove() {
            this.Z.remove();
            Map.Entry<R, Map<C, V>> entry = this.Y;
            Objects.requireNonNull(entry);
            if (entry.getValue().isEmpty()) {
                this.X.remove();
                this.Y = null;
            }
        }
    }

    /* renamed from: o.Vb2$c */
    /* loaded from: classes3.dex */
    public class c extends C7935m81.R<R, V> {
        public final C Y0;

        /* renamed from: o.Vb2$c$a */
        /* loaded from: classes3.dex */
        public class a extends C10856y22.k<Map.Entry<R, V>> {
            public a() {
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public void clear() {
                c.this.d(C7985mG1.c());
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean contains(@MB Object obj) {
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    return C4488Vb2.this.h(entry.getKey(), c.this.Y0, entry.getValue());
                }
                return false;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean isEmpty() {
                c cVar = c.this;
                return !C4488Vb2.this.y0(cVar.Y0);
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator<Map.Entry<R, V>> iterator() {
                return new b();
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean remove(@MB Object obj) {
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    return C4488Vb2.this.m(entry.getKey(), c.this.Y0, entry.getValue());
                }
                return false;
            }

            @Override // o.C10856y22.k, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean retainAll(Collection<?> collection) {
                return c.this.d(C7985mG1.q(C7985mG1.n(collection)));
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public int size() {
                int i = 0;
                for (Map<C, V> map : C4488Vb2.this.Z.values()) {
                    if (map.containsKey(c.this.Y0)) {
                        i++;
                    }
                }
                return i;
            }
        }

        /* renamed from: o.Vb2$c$b */
        /* loaded from: classes3.dex */
        public class b extends AbstractC6437g1<Map.Entry<R, V>> {
            public final Iterator<Map.Entry<R, Map<C, V>>> Z;

            /* renamed from: o.Vb2$c$b$a */
            /* loaded from: classes3.dex */
            public class a extends M1<R, V> {
                public final /* synthetic */ Map.Entry X;

                public a(Map.Entry entry) {
                    this.X = entry;
                }

                @Override // o.M1, java.util.Map.Entry
                public R getKey() {
                    return (R) this.X.getKey();
                }

                @Override // o.M1, java.util.Map.Entry
                public V getValue() {
                    return (V) ((Map) this.X.getValue()).get(c.this.Y0);
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // o.M1, java.util.Map.Entry
                public V setValue(V v) {
                    return (V) C2491As1.a(((Map) this.X.getValue()).put(c.this.Y0, C10664xF1.E(v)));
                }
            }

            public b() {
                this.Z = C4488Vb2.this.Z.entrySet().iterator();
            }

            @Override // o.AbstractC6437g1
            @MB
            /* renamed from: e */
            public Map.Entry<R, V> b() {
                while (this.Z.hasNext()) {
                    Map.Entry<R, Map<C, V>> next = this.Z.next();
                    if (next.getValue().containsKey(c.this.Y0)) {
                        return new a(next);
                    }
                }
                return c();
            }
        }

        /* renamed from: o.Vb2$c$c  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public class C0233c extends C7935m81.B<R, V> {
            public C0233c() {
                super(c.this);
            }

            @Override // o.C7935m81.B, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean contains(@MB Object obj) {
                c cVar = c.this;
                return C4488Vb2.this.i5(obj, cVar.Y0);
            }

            @Override // o.C7935m81.B, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean remove(@MB Object obj) {
                c cVar = c.this;
                if (C4488Vb2.this.remove(obj, cVar.Y0) != null) {
                    return true;
                }
                return false;
            }

            @Override // o.C10856y22.k, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean retainAll(Collection<?> collection) {
                return c.this.d(C7935m81.U(C7985mG1.q(C7985mG1.n(collection))));
            }
        }

        /* renamed from: o.Vb2$c$d */
        /* loaded from: classes3.dex */
        public class d extends C7935m81.Q<R, V> {
            public d() {
                super(c.this);
            }

            @Override // o.C7935m81.Q, java.util.AbstractCollection, java.util.Collection
            public boolean remove(@MB Object obj) {
                if (obj != null && c.this.d(C7935m81.Q0(C7985mG1.m(obj)))) {
                    return true;
                }
                return false;
            }

            @Override // o.C7935m81.Q, java.util.AbstractCollection, java.util.Collection
            public boolean removeAll(Collection<?> collection) {
                return c.this.d(C7935m81.Q0(C7985mG1.n(collection)));
            }

            @Override // o.C7935m81.Q, java.util.AbstractCollection, java.util.Collection
            public boolean retainAll(Collection<?> collection) {
                return c.this.d(C7935m81.Q0(C7985mG1.q(C7985mG1.n(collection))));
            }
        }

        public c(C c) {
            this.Y0 = (C) C10664xF1.E(c);
        }

        @Override // o.C7935m81.R
        public Set<Map.Entry<R, V>> a() {
            return new a();
        }

        @Override // o.C7935m81.R
        public Set<R> b() {
            return new C0233c();
        }

        @Override // o.C7935m81.R
        public Collection<V> c() {
            return new d();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(@MB Object obj) {
            return C4488Vb2.this.i5(obj, this.Y0);
        }

        @InterfaceC6181ey
        public boolean d(IF1<? super Map.Entry<R, V>> if1) {
            Iterator<Map.Entry<R, Map<C, V>>> it = C4488Vb2.this.Z.entrySet().iterator();
            boolean z = false;
            while (it.hasNext()) {
                Map.Entry<R, Map<C, V>> next = it.next();
                Map<C, V> value = next.getValue();
                V v = value.get(this.Y0);
                if (v != null && if1.apply(C7935m81.O(next.getKey(), v))) {
                    value.remove(this.Y0);
                    if (value.isEmpty()) {
                        it.remove();
                    }
                    z = true;
                }
            }
            return z;
        }

        @Override // java.util.AbstractMap, java.util.Map
        @MB
        public V get(@MB Object obj) {
            return (V) C4488Vb2.this.r0(obj, this.Y0);
        }

        @Override // java.util.AbstractMap, java.util.Map
        @MB
        public V put(R r, V v) {
            return (V) C4488Vb2.this.q3(r, this.Y0, v);
        }

        @Override // java.util.AbstractMap, java.util.Map
        @MB
        public V remove(@MB Object obj) {
            return (V) C4488Vb2.this.remove(obj, this.Y0);
        }
    }

    /* renamed from: o.Vb2$d */
    /* loaded from: classes3.dex */
    public class d extends AbstractC6437g1<C> {
        public final Iterator<Map<C, V>> Y0;
        public final Map<C, V> Z;
        public Iterator<Map.Entry<C, V>> Z0;

        public d() {
            this.Z = C4488Vb2.this.Y0.get();
            this.Y0 = C4488Vb2.this.Z.values().iterator();
            this.Z0 = C7052iU0.u();
        }

        @Override // o.AbstractC6437g1
        @MB
        public C b() {
            while (true) {
                if (this.Z0.hasNext()) {
                    Map.Entry<C, V> next = this.Z0.next();
                    if (!this.Z.containsKey(next.getKey())) {
                        this.Z.put(next.getKey(), next.getValue());
                        return next.getKey();
                    }
                } else if (this.Y0.hasNext()) {
                    this.Z0 = this.Y0.next().entrySet().iterator();
                } else {
                    return c();
                }
            }
        }
    }

    /* renamed from: o.Vb2$e */
    /* loaded from: classes3.dex */
    public class e extends C4488Vb2<R, C, V>.i<C> {
        public e() {
            super();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@MB Object obj) {
            return C4488Vb2.this.y0(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<C> iterator() {
            return C4488Vb2.this.i();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(@MB Object obj) {
            boolean z = false;
            if (obj == null) {
                return false;
            }
            Iterator<Map<C, V>> it = C4488Vb2.this.Z.values().iterator();
            while (it.hasNext()) {
                Map<C, V> next = it.next();
                if (next.keySet().remove(obj)) {
                    if (next.isEmpty()) {
                        it.remove();
                    }
                    z = true;
                }
            }
            return z;
        }

        @Override // o.C10856y22.k, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean removeAll(Collection<?> collection) {
            C10664xF1.E(collection);
            Iterator<Map<C, V>> it = C4488Vb2.this.Z.values().iterator();
            boolean z = false;
            while (it.hasNext()) {
                Map<C, V> next = it.next();
                if (C7052iU0.V(next.keySet().iterator(), collection)) {
                    if (next.isEmpty()) {
                        it.remove();
                    }
                    z = true;
                }
            }
            return z;
        }

        @Override // o.C10856y22.k, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean retainAll(Collection<?> collection) {
            C10664xF1.E(collection);
            Iterator<Map<C, V>> it = C4488Vb2.this.Z.values().iterator();
            boolean z = false;
            while (it.hasNext()) {
                Map<C, V> next = it.next();
                if (next.keySet().retainAll(collection)) {
                    if (next.isEmpty()) {
                        it.remove();
                    }
                    z = true;
                }
            }
            return z;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return C7052iU0.Z(iterator());
        }
    }

    /* renamed from: o.Vb2$f */
    /* loaded from: classes3.dex */
    public class f extends C7935m81.R<C, Map<R, V>> {

        /* renamed from: o.Vb2$f$a */
        /* loaded from: classes3.dex */
        public class a extends C4488Vb2<R, C, V>.i<Map.Entry<C, Map<R, V>>> {

            /* renamed from: o.Vb2$f$a$a  reason: collision with other inner class name */
            /* loaded from: classes3.dex */
            public class C0234a implements YA0<C, Map<R, V>> {
                public C0234a() {
                }

                @Override // o.YA0
                /* renamed from: a */
                public Map<R, V> apply(C c) {
                    return C4488Vb2.this.d3(c);
                }
            }

            public a() {
                super();
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean contains(@MB Object obj) {
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    if (C4488Vb2.this.y0(entry.getKey())) {
                        Map<R, V> map = f.this.get(entry.getKey());
                        Objects.requireNonNull(map);
                        return map.equals(entry.getValue());
                    }
                    return false;
                }
                return false;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator<Map.Entry<C, Map<R, V>>> iterator() {
                return C7935m81.m(C4488Vb2.this.L4(), new C0234a());
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean remove(@MB Object obj) {
                if (contains(obj) && (obj instanceof Map.Entry)) {
                    C4488Vb2.this.l(((Map.Entry) obj).getKey());
                    return true;
                }
                return false;
            }

            @Override // o.C10856y22.k, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean removeAll(Collection<?> collection) {
                C10664xF1.E(collection);
                return C10856y22.J(this, collection.iterator());
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // o.C10856y22.k, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean retainAll(Collection<?> collection) {
                C10664xF1.E(collection);
                Iterator it = C10608x11.s(C4488Vb2.this.L4().iterator()).iterator();
                boolean z = false;
                while (it.hasNext()) {
                    Object next = it.next();
                    if (!collection.contains(C7935m81.O(next, C4488Vb2.this.d3(next)))) {
                        C4488Vb2.this.l(next);
                        z = true;
                    }
                }
                return z;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public int size() {
                return C4488Vb2.this.L4().size();
            }
        }

        /* renamed from: o.Vb2$f$b */
        /* loaded from: classes3.dex */
        public class b extends C7935m81.Q<C, Map<R, V>> {
            public b() {
                super(f.this);
            }

            @Override // o.C7935m81.Q, java.util.AbstractCollection, java.util.Collection
            public boolean remove(@MB Object obj) {
                for (Map.Entry<C, Map<R, V>> entry : f.this.entrySet()) {
                    if (entry.getValue().equals(obj)) {
                        C4488Vb2.this.l(entry.getKey());
                        return true;
                    }
                }
                return false;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // o.C7935m81.Q, java.util.AbstractCollection, java.util.Collection
            public boolean removeAll(Collection<?> collection) {
                C10664xF1.E(collection);
                Iterator it = C10608x11.s(C4488Vb2.this.L4().iterator()).iterator();
                boolean z = false;
                while (it.hasNext()) {
                    Object next = it.next();
                    if (collection.contains(C4488Vb2.this.d3(next))) {
                        C4488Vb2.this.l(next);
                        z = true;
                    }
                }
                return z;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // o.C7935m81.Q, java.util.AbstractCollection, java.util.Collection
            public boolean retainAll(Collection<?> collection) {
                C10664xF1.E(collection);
                Iterator it = C10608x11.s(C4488Vb2.this.L4().iterator()).iterator();
                boolean z = false;
                while (it.hasNext()) {
                    Object next = it.next();
                    if (!collection.contains(C4488Vb2.this.d3(next))) {
                        C4488Vb2.this.l(next);
                        z = true;
                    }
                }
                return z;
            }
        }

        public f() {
        }

        @Override // o.C7935m81.R
        public Set<Map.Entry<C, Map<R, V>>> a() {
            return new a();
        }

        @Override // o.C7935m81.R
        public Collection<Map<R, V>> c() {
            return new b();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(@MB Object obj) {
            return C4488Vb2.this.y0(obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        @MB
        /* renamed from: d */
        public Map<R, V> get(@MB Object obj) {
            if (C4488Vb2.this.y0(obj)) {
                C4488Vb2 c4488Vb2 = C4488Vb2.this;
                Objects.requireNonNull(obj);
                return c4488Vb2.d3(obj);
            }
            return null;
        }

        @Override // java.util.AbstractMap, java.util.Map
        @MB
        /* renamed from: e */
        public Map<R, V> remove(@MB Object obj) {
            if (C4488Vb2.this.y0(obj)) {
                return C4488Vb2.this.l(obj);
            }
            return null;
        }

        @Override // o.C7935m81.R, java.util.AbstractMap, java.util.Map
        public Set<C> keySet() {
            return C4488Vb2.this.L4();
        }
    }

    /* renamed from: o.Vb2$g */
    /* loaded from: classes3.dex */
    public class g extends C7935m81.A<C, V> {
        public final R X;
        @MB
        public Map<C, V> Y;

        /* renamed from: o.Vb2$g$a */
        /* loaded from: classes3.dex */
        public class a implements Iterator<Map.Entry<C, V>> {
            public final /* synthetic */ Iterator X;

            public a(Iterator it) {
                this.X = it;
            }

            @Override // java.util.Iterator
            /* renamed from: b */
            public Map.Entry<C, V> next() {
                return g.this.e((Map.Entry) this.X.next());
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.X.hasNext();
            }

            @Override // java.util.Iterator
            public void remove() {
                this.X.remove();
                g.this.c();
            }
        }

        /* renamed from: o.Vb2$g$b */
        /* loaded from: classes3.dex */
        public class b extends AbstractC10105uy0<C, V> {
            public final /* synthetic */ Map.Entry X;

            public b(g gVar, Map.Entry entry) {
                this.X = entry;
            }

            @Override // o.AbstractC10105uy0, o.AbstractC2510Ay0
            /* renamed from: M5 */
            public Map.Entry<C, V> L5() {
                return this.X;
            }

            @Override // o.AbstractC10105uy0, java.util.Map.Entry
            public boolean equals(@MB Object obj) {
                return N5(obj);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // o.AbstractC10105uy0, java.util.Map.Entry
            public V setValue(V v) {
                return (V) super.setValue(C10664xF1.E(v));
            }
        }

        public g(R r) {
            this.X = (R) C10664xF1.E(r);
        }

        @Override // o.C7935m81.A
        public Iterator<Map.Entry<C, V>> a() {
            d();
            Map<C, V> map = this.Y;
            if (map == null) {
                return C7052iU0.w();
            }
            return new a(map.entrySet().iterator());
        }

        @MB
        public Map<C, V> b() {
            return C4488Vb2.this.Z.get(this.X);
        }

        public void c() {
            d();
            Map<C, V> map = this.Y;
            if (map != null && map.isEmpty()) {
                C4488Vb2.this.Z.remove(this.X);
                this.Y = null;
            }
        }

        @Override // o.C7935m81.A, java.util.AbstractMap, java.util.Map
        public void clear() {
            d();
            Map<C, V> map = this.Y;
            if (map != null) {
                map.clear();
            }
            c();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(@MB Object obj) {
            Map<C, V> map;
            d();
            if (obj != null && (map = this.Y) != null && C7935m81.o0(map, obj)) {
                return true;
            }
            return false;
        }

        public final void d() {
            Map<C, V> map = this.Y;
            if (map != null && (!map.isEmpty() || !C4488Vb2.this.Z.containsKey(this.X))) {
                return;
            }
            this.Y = b();
        }

        public Map.Entry<C, V> e(Map.Entry<C, V> entry) {
            return new b(this, entry);
        }

        @Override // java.util.AbstractMap, java.util.Map
        @MB
        public V get(@MB Object obj) {
            Map<C, V> map;
            d();
            if (obj != null && (map = this.Y) != null) {
                return (V) C7935m81.p0(map, obj);
            }
            return null;
        }

        @Override // java.util.AbstractMap, java.util.Map
        @MB
        public V put(C c, V v) {
            C10664xF1.E(c);
            C10664xF1.E(v);
            Map<C, V> map = this.Y;
            if (map != null && !map.isEmpty()) {
                return this.Y.put(c, v);
            }
            return (V) C4488Vb2.this.q3(this.X, c, v);
        }

        @Override // java.util.AbstractMap, java.util.Map
        @MB
        public V remove(@MB Object obj) {
            d();
            Map<C, V> map = this.Y;
            if (map == null) {
                return null;
            }
            V v = (V) C7935m81.q0(map, obj);
            c();
            return v;
        }

        @Override // o.C7935m81.A, java.util.AbstractMap, java.util.Map
        public int size() {
            d();
            Map<C, V> map = this.Y;
            if (map == null) {
                return 0;
            }
            return map.size();
        }
    }

    /* renamed from: o.Vb2$h */
    /* loaded from: classes3.dex */
    public class h extends C7935m81.R<R, Map<C, V>> {

        /* renamed from: o.Vb2$h$a */
        /* loaded from: classes3.dex */
        public class a extends C4488Vb2<R, C, V>.i<Map.Entry<R, Map<C, V>>> {

            /* renamed from: o.Vb2$h$a$a  reason: collision with other inner class name */
            /* loaded from: classes3.dex */
            public class C0235a implements YA0<R, Map<C, V>> {
                public C0235a() {
                }

                @Override // o.YA0
                /* renamed from: a */
                public Map<C, V> apply(R r) {
                    return C4488Vb2.this.x5(r);
                }
            }

            public a() {
                super();
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean contains(@MB Object obj) {
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    if (entry.getKey() != null && (entry.getValue() instanceof Map) && C7232jF.j(C4488Vb2.this.Z.entrySet(), entry)) {
                        return true;
                    }
                }
                return false;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator<Map.Entry<R, Map<C, V>>> iterator() {
                return C7935m81.m(C4488Vb2.this.Z.keySet(), new C0235a());
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean remove(@MB Object obj) {
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    if (entry.getKey() != null && (entry.getValue() instanceof Map) && C4488Vb2.this.Z.entrySet().remove(entry)) {
                        return true;
                    }
                }
                return false;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public int size() {
                return C4488Vb2.this.Z.size();
            }
        }

        public h() {
        }

        @Override // o.C7935m81.R
        public Set<Map.Entry<R, Map<C, V>>> a() {
            return new a();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(@MB Object obj) {
            return C4488Vb2.this.M4(obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        @MB
        /* renamed from: d */
        public Map<C, V> get(@MB Object obj) {
            if (C4488Vb2.this.M4(obj)) {
                C4488Vb2 c4488Vb2 = C4488Vb2.this;
                Objects.requireNonNull(obj);
                return c4488Vb2.x5(obj);
            }
            return null;
        }

        @Override // java.util.AbstractMap, java.util.Map
        @MB
        /* renamed from: e */
        public Map<C, V> remove(@MB Object obj) {
            if (obj == null) {
                return null;
            }
            return C4488Vb2.this.Z.remove(obj);
        }
    }

    /* renamed from: o.Vb2$i */
    /* loaded from: classes3.dex */
    public abstract class i<T> extends C10856y22.k<T> {
        public i() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            C4488Vb2.this.Z.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return C4488Vb2.this.Z.isEmpty();
        }
    }

    public C4488Vb2(Map<R, Map<C, V>> map, InterfaceC8331nh2<? extends Map<C, V>> interfaceC8331nh2) {
        this.Z = map;
        this.Y0 = interfaceC8331nh2;
    }

    @Override // o.AbstractC10614x3, o.InterfaceC3744Nk2
    public Set<R> F() {
        return H().keySet();
    }

    @Override // o.InterfaceC3744Nk2
    public Map<R, Map<C, V>> H() {
        Map<R, Map<C, V>> map = this.a1;
        if (map == null) {
            Map<R, Map<C, V>> j = j();
            this.a1 = j;
            return j;
        }
        return map;
    }

    @Override // o.AbstractC10614x3, o.InterfaceC3744Nk2
    public Set<C> L4() {
        Set<C> set = this.Z0;
        if (set == null) {
            e eVar = new e();
            this.Z0 = eVar;
            return eVar;
        }
        return set;
    }

    @Override // o.AbstractC10614x3, o.InterfaceC3744Nk2
    public boolean M4(@MB Object obj) {
        if (obj != null && C7935m81.o0(this.Z, obj)) {
            return true;
        }
        return false;
    }

    @Override // o.AbstractC10614x3
    public Iterator<InterfaceC3744Nk2.a<R, C, V>> a() {
        return new b();
    }

    @Override // o.AbstractC10614x3, o.InterfaceC3744Nk2
    public void clear() {
        this.Z.clear();
    }

    @Override // o.AbstractC10614x3, o.InterfaceC3744Nk2
    public boolean containsValue(@MB Object obj) {
        if (obj != null && super.containsValue(obj)) {
            return true;
        }
        return false;
    }

    @Override // o.InterfaceC3744Nk2
    public Map<R, V> d3(C c2) {
        return new c(c2);
    }

    public final boolean h(@MB Object obj, @MB Object obj2, @MB Object obj3) {
        if (obj3 != null && obj3.equals(r0(obj, obj2))) {
            return true;
        }
        return false;
    }

    public Iterator<C> i() {
        return new d();
    }

    @Override // o.InterfaceC3744Nk2
    public Map<C, Map<R, V>> i2() {
        C4488Vb2<R, C, V>.f fVar = this.b1;
        if (fVar == null) {
            C4488Vb2<R, C, V>.f fVar2 = new f();
            this.b1 = fVar2;
            return fVar2;
        }
        return fVar;
    }

    @Override // o.AbstractC10614x3, o.InterfaceC3744Nk2
    public boolean i5(@MB Object obj, @MB Object obj2) {
        if (obj != null && obj2 != null && super.i5(obj, obj2)) {
            return true;
        }
        return false;
    }

    @Override // o.AbstractC10614x3, o.InterfaceC3744Nk2
    public boolean isEmpty() {
        return this.Z.isEmpty();
    }

    public Map<R, Map<C, V>> j() {
        return new h();
    }

    public final Map<C, V> k(R r) {
        Map<C, V> map = this.Z.get(r);
        if (map == null) {
            Map<C, V> map2 = this.Y0.get();
            this.Z.put(r, map2);
            return map2;
        }
        return map;
    }

    @InterfaceC6181ey
    public final Map<R, V> l(@MB Object obj) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<Map.Entry<R, Map<C, V>>> it = this.Z.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<R, Map<C, V>> next = it.next();
            V remove = next.getValue().remove(obj);
            if (remove != null) {
                linkedHashMap.put(next.getKey(), remove);
                if (next.getValue().isEmpty()) {
                    it.remove();
                }
            }
        }
        return linkedHashMap;
    }

    public final boolean m(@MB Object obj, @MB Object obj2, @MB Object obj3) {
        if (h(obj, obj2, obj3)) {
            remove(obj, obj2);
            return true;
        }
        return false;
    }

    @Override // o.AbstractC10614x3, o.InterfaceC3744Nk2
    public Set<InterfaceC3744Nk2.a<R, C, V>> o3() {
        return super.o3();
    }

    @Override // o.AbstractC10614x3, o.InterfaceC3744Nk2
    @InterfaceC6181ey
    @MB
    public V q3(R r, C c2, V v) {
        C10664xF1.E(r);
        C10664xF1.E(c2);
        C10664xF1.E(v);
        return k(r).put(c2, v);
    }

    @Override // o.AbstractC10614x3, o.InterfaceC3744Nk2
    @MB
    public V r0(@MB Object obj, @MB Object obj2) {
        if (obj != null && obj2 != null) {
            return (V) super.r0(obj, obj2);
        }
        return null;
    }

    @Override // o.AbstractC10614x3, o.InterfaceC3744Nk2
    @InterfaceC6181ey
    @MB
    public V remove(@MB Object obj, @MB Object obj2) {
        Map map;
        if (obj == null || obj2 == null || (map = (Map) C7935m81.p0(this.Z, obj)) == null) {
            return null;
        }
        V v = (V) map.remove(obj2);
        if (map.isEmpty()) {
            this.Z.remove(obj);
        }
        return v;
    }

    @Override // o.InterfaceC3744Nk2
    public int size() {
        int i2 = 0;
        for (Map<C, V> map : this.Z.values()) {
            i2 += map.size();
        }
        return i2;
    }

    @Override // o.AbstractC10614x3, o.InterfaceC3744Nk2
    public Collection<V> values() {
        return super.values();
    }

    @Override // o.InterfaceC3744Nk2
    public Map<C, V> x5(R r) {
        return new g(r);
    }

    @Override // o.AbstractC10614x3, o.InterfaceC3744Nk2
    public boolean y0(@MB Object obj) {
        if (obj == null) {
            return false;
        }
        for (Map<C, V> map : this.Z.values()) {
            if (C7935m81.o0(map, obj)) {
                return true;
            }
        }
        return false;
    }
}
