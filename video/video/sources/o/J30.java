package o;

import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import o.AbstractC5317bO0;
import o.J30;
import o.Y90;

@InterfaceC7070ia0
/* loaded from: classes3.dex */
public final class J30<N, V> implements FE0<N, V> {
    public static final Object e = new Object();
    public final Map<N, Object> a;
    @MB
    public final List<f<N>> b;
    public int c;
    public int d;

    /* loaded from: classes3.dex */
    public class a extends AbstractSet<N> {

        /* renamed from: o.J30$a$a  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public class C0193a extends AbstractC6437g1<N> {
            public final /* synthetic */ Set Y0;
            public final /* synthetic */ Iterator Z;

            public C0193a(a aVar, Iterator it, Set set) {
                this.Z = it;
                this.Y0 = set;
            }

            @Override // o.AbstractC6437g1
            @MB
            public N b() {
                while (this.Z.hasNext()) {
                    f fVar = (f) this.Z.next();
                    if (this.Y0.add(fVar.a)) {
                        return fVar.a;
                    }
                }
                return c();
            }
        }

        public a() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@MB Object obj) {
            return J30.this.a.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        /* renamed from: d */
        public AbstractC6237fB2<N> iterator() {
            return new C0193a(this, J30.this.b.iterator(), new HashSet());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return J30.this.a.size();
        }
    }

    /* loaded from: classes3.dex */
    public class b extends AbstractSet<N> {

        /* loaded from: classes3.dex */
        public class a extends AbstractC6437g1<N> {
            public final /* synthetic */ Iterator Z;

            public a(b bVar, Iterator it) {
                this.Z = it;
            }

            @Override // o.AbstractC6437g1
            @MB
            public N b() {
                while (this.Z.hasNext()) {
                    Map.Entry entry = (Map.Entry) this.Z.next();
                    if (J30.s(entry.getValue())) {
                        return (N) entry.getKey();
                    }
                }
                return c();
            }
        }

        /* renamed from: o.J30$b$b  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public class C0194b extends AbstractC6437g1<N> {
            public final /* synthetic */ Iterator Z;

            public C0194b(b bVar, Iterator it) {
                this.Z = it;
            }

            @Override // o.AbstractC6437g1
            @MB
            public N b() {
                while (this.Z.hasNext()) {
                    f fVar = (f) this.Z.next();
                    if (fVar instanceof f.a) {
                        return fVar.a;
                    }
                }
                return c();
            }
        }

        public b() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@MB Object obj) {
            return J30.s(J30.this.a.get(obj));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        /* renamed from: d */
        public AbstractC6237fB2<N> iterator() {
            if (J30.this.b == null) {
                return new a(this, J30.this.a.entrySet().iterator());
            }
            return new C0194b(this, J30.this.b.iterator());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return J30.this.c;
        }
    }

    /* loaded from: classes3.dex */
    public class c extends AbstractSet<N> {

        /* loaded from: classes3.dex */
        public class a extends AbstractC6437g1<N> {
            public final /* synthetic */ Iterator Z;

            public a(c cVar, Iterator it) {
                this.Z = it;
            }

            @Override // o.AbstractC6437g1
            @MB
            public N b() {
                while (this.Z.hasNext()) {
                    Map.Entry entry = (Map.Entry) this.Z.next();
                    if (J30.t(entry.getValue())) {
                        return (N) entry.getKey();
                    }
                }
                return c();
            }
        }

        /* loaded from: classes3.dex */
        public class b extends AbstractC6437g1<N> {
            public final /* synthetic */ Iterator Z;

            public b(c cVar, Iterator it) {
                this.Z = it;
            }

            @Override // o.AbstractC6437g1
            @MB
            public N b() {
                while (this.Z.hasNext()) {
                    f fVar = (f) this.Z.next();
                    if (fVar instanceof f.b) {
                        return fVar.a;
                    }
                }
                return c();
            }
        }

        public c() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@MB Object obj) {
            return J30.t(J30.this.a.get(obj));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        /* renamed from: d */
        public AbstractC6237fB2<N> iterator() {
            if (J30.this.b == null) {
                return new a(this, J30.this.a.entrySet().iterator());
            }
            return new b(this, J30.this.b.iterator());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return J30.this.d;
        }
    }

    /* loaded from: classes3.dex */
    public class d extends AbstractC6437g1<AbstractC4099Rc0<N>> {
        public final /* synthetic */ AtomicBoolean Y0;
        public final /* synthetic */ Iterator Z;

        public d(J30 j30, Iterator it, AtomicBoolean atomicBoolean) {
            this.Z = it;
            this.Y0 = atomicBoolean;
        }

        /* JADX WARN: Removed duplicated region for block: B:4:0x0008  */
        @Override // o.AbstractC6437g1
        @MB
        /* renamed from: e */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public AbstractC4099Rc0<N> b() {
            while (this.Z.hasNext()) {
                AbstractC4099Rc0<N> abstractC4099Rc0 = (AbstractC4099Rc0) this.Z.next();
                if (!abstractC4099Rc0.h().equals(abstractC4099Rc0.i()) || !this.Y0.getAndSet(true)) {
                    return abstractC4099Rc0;
                }
                while (this.Z.hasNext()) {
                }
            }
            return c();
        }
    }

    /* loaded from: classes3.dex */
    public static /* synthetic */ class e {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[Y90.b.values().length];
            a = iArr;
            try {
                iArr[Y90.b.UNORDERED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[Y90.b.STABLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* loaded from: classes3.dex */
    public static abstract class f<N> {
        public final N a;

        /* loaded from: classes3.dex */
        public static final class a<N> extends f<N> {
            public a(N n) {
                super(n);
            }

            public boolean equals(@MB Object obj) {
                if (obj instanceof a) {
                    return this.a.equals(((a) obj).a);
                }
                return false;
            }

            public int hashCode() {
                return a.class.hashCode() + this.a.hashCode();
            }
        }

        /* loaded from: classes3.dex */
        public static final class b<N> extends f<N> {
            public b(N n) {
                super(n);
            }

            public boolean equals(@MB Object obj) {
                if (obj instanceof b) {
                    return this.a.equals(((b) obj).a);
                }
                return false;
            }

            public int hashCode() {
                return b.class.hashCode() + this.a.hashCode();
            }
        }

        public f(N n) {
            this.a = (N) C10664xF1.E(n);
        }
    }

    /* loaded from: classes3.dex */
    public static final class g {
        public final Object a;

        public g(Object obj) {
            this.a = obj;
        }
    }

    public J30(Map<N, Object> map, @MB List<f<N>> list, int i, int i2) {
        boolean z;
        this.a = (Map) C10664xF1.E(map);
        this.b = list;
        this.c = IE0.b(i);
        this.d = IE0.b(i2);
        if (i <= map.size() && i2 <= map.size()) {
            z = true;
        } else {
            z = false;
        }
        C10664xF1.g0(z);
    }

    public static /* synthetic */ AbstractC4099Rc0 k(Object obj, f fVar) {
        if (fVar instanceof f.b) {
            return AbstractC4099Rc0.l(obj, fVar.a);
        }
        return AbstractC4099Rc0.l(fVar.a, obj);
    }

    public static boolean s(@MB Object obj) {
        if (obj != e && !(obj instanceof g)) {
            return false;
        }
        return true;
    }

    public static boolean t(@MB Object obj) {
        if (obj != e && obj != null) {
            return true;
        }
        return false;
    }

    public static <N, V> J30<N, V> u(Y90<N> y90) {
        ArrayList arrayList;
        int i = e.a[y90.h().ordinal()];
        if (i != 1) {
            if (i == 2) {
                arrayList = new ArrayList();
            } else {
                throw new AssertionError(y90.h());
            }
        } else {
            arrayList = null;
        }
        return new J30<>(new HashMap(4, 1.0f), arrayList, 0, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <N, V> J30<N, V> v(N n, Iterable<AbstractC4099Rc0<N>> iterable, YA0<N, V> ya0) {
        boolean z;
        C10664xF1.E(n);
        C10664xF1.E(ya0);
        HashMap hashMap = new HashMap();
        AbstractC5317bO0.a r = AbstractC5317bO0.r();
        int i = 0;
        int i2 = 0;
        for (AbstractC4099Rc0<N> abstractC4099Rc0 : iterable) {
            if (abstractC4099Rc0.h().equals(n) && abstractC4099Rc0.i().equals(n)) {
                hashMap.put(n, new g(ya0.apply(n)));
                r.g(new f.a(n));
                r.g(new f.b(n));
                i++;
            } else if (abstractC4099Rc0.i().equals(n)) {
                N h = abstractC4099Rc0.h();
                Object put = hashMap.put(h, e);
                if (put != null) {
                    hashMap.put(h, new g(put));
                }
                r.g(new f.a(h));
                i++;
            } else {
                C10664xF1.d(abstractC4099Rc0.h().equals(n));
                N i3 = abstractC4099Rc0.i();
                V apply = ya0.apply(i3);
                Object put2 = hashMap.put(i3, apply);
                if (put2 != null) {
                    if (put2 == e) {
                        z = true;
                    } else {
                        z = false;
                    }
                    C10664xF1.d(z);
                    hashMap.put(i3, new g(apply));
                }
                r.g(new f.b(i3));
            }
            i2++;
        }
        return new J30<>(hashMap, r.e(), i, i2);
    }

    @Override // o.FE0
    public Set<N> a() {
        return new c();
    }

    @Override // o.FE0
    public Set<N> b() {
        return new b();
    }

    @Override // o.FE0
    public Set<N> c() {
        if (this.b == null) {
            return Collections.unmodifiableSet(this.a.keySet());
        }
        return new a();
    }

    @Override // o.FE0
    @MB
    public V d(N n) {
        C10664xF1.E(n);
        V v = (V) this.a.get(n);
        if (v == e) {
            return null;
        }
        if (v instanceof g) {
            return (V) ((g) v).a;
        }
        return v;
    }

    @Override // o.FE0
    @MB
    public V e(Object obj) {
        Object obj2;
        C10664xF1.E(obj);
        V v = (V) this.a.get(obj);
        if (v != null && v != (obj2 = e)) {
            if (v instanceof g) {
                this.a.put(obj, obj2);
                v = (V) ((g) v).a;
            } else {
                this.a.remove(obj);
            }
        } else {
            v = null;
        }
        if (v != null) {
            int i = this.d - 1;
            this.d = i;
            IE0.b(i);
            List<f<N>> list = this.b;
            if (list != null) {
                list.remove(new f.b(obj));
            }
        }
        if (v == null) {
            return null;
        }
        return v;
    }

    @Override // o.FE0
    public void f(N n) {
        C10664xF1.E(n);
        Object obj = this.a.get(n);
        if (obj == e) {
            this.a.remove(n);
        } else if (obj instanceof g) {
            this.a.put(n, ((g) obj).a);
        } else {
            return;
        }
        int i = this.c - 1;
        this.c = i;
        IE0.b(i);
        List<f<N>> list = this.b;
        if (list != null) {
            list.remove(new f.a(n));
        }
    }

    @Override // o.FE0
    public Iterator<AbstractC4099Rc0<N>> g(final N n) {
        Iterator c0;
        C10664xF1.E(n);
        List<f<N>> list = this.b;
        if (list == null) {
            c0 = C7052iU0.j(C7052iU0.c0(b().iterator(), new YA0() { // from class: o.G30
                @Override // o.YA0
                public final Object apply(Object obj) {
                    AbstractC4099Rc0 l;
                    l = AbstractC4099Rc0.l(obj, n);
                    return l;
                }
            }), C7052iU0.c0(a().iterator(), new YA0() { // from class: o.H30
                @Override // o.YA0
                public final Object apply(Object obj) {
                    AbstractC4099Rc0 l;
                    l = AbstractC4099Rc0.l(n, obj);
                    return l;
                }
            }));
        } else {
            c0 = C7052iU0.c0(list.iterator(), new YA0() { // from class: o.I30
                @Override // o.YA0
                public final Object apply(Object obj) {
                    return J30.k(n, (J30.f) obj);
                }
            });
        }
        return new d(this, c0, new AtomicBoolean(false));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0048 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0049 A[RETURN] */
    @Override // o.FE0
    @MB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public V h(N n, V v) {
        V v2 = (V) this.a.put(n, v);
        if (v2 != null) {
            if (v2 instanceof g) {
                this.a.put(n, new g(v));
                v2 = (V) ((g) v2).a;
            } else if (v2 == e) {
                this.a.put(n, new g(v));
            }
            if (v2 == null) {
                int i = this.d + 1;
                this.d = i;
                IE0.d(i);
                List<f<N>> list = this.b;
                if (list != null) {
                    list.add(new f.b(n));
                }
            }
            if (v2 != null) {
                return null;
            }
            return v2;
        }
        v2 = null;
        if (v2 == null) {
        }
        if (v2 != null) {
        }
    }

    @Override // o.FE0
    public void i(N n, V v) {
        Map<N, Object> map = this.a;
        Object obj = e;
        Object put = map.put(n, obj);
        if (put != null) {
            if (put instanceof g) {
                this.a.put(n, put);
                return;
            } else if (put != obj) {
                this.a.put(n, new g(put));
            } else {
                return;
            }
        }
        int i = this.c + 1;
        this.c = i;
        IE0.d(i);
        List<f<N>> list = this.b;
        if (list != null) {
            list.add(new f.a(n));
        }
    }
}
