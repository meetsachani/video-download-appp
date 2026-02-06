package o;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;

/* renamed from: o.hF  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C6748hF {
    public static final Collection a = Collections.EMPTY_LIST;

    /* renamed from: o.hF$a */
    /* loaded from: classes4.dex */
    public static class a implements InterfaceC3287Is2 {
        public final /* synthetic */ InterfaceC6600ge0 X;

        public a(InterfaceC6600ge0 interfaceC6600ge0) {
            this.X = interfaceC6600ge0;
        }

        @Override // o.InterfaceC3287Is2
        /* renamed from: b */
        public e<?> a(Object obj) {
            return new e<>(this.X, obj);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [E] */
    /* renamed from: o.hF$b */
    /* loaded from: classes4.dex */
    public static class b<E> implements InterfaceC3287Is2<E, e<E>> {
        public final /* synthetic */ InterfaceC6600ge0 X;

        public b(InterfaceC6600ge0 interfaceC6600ge0) {
            this.X = interfaceC6600ge0;
        }

        @Override // o.InterfaceC3287Is2
        /* renamed from: b */
        public e<E> a(E e) {
            return new e<>(this.X, e);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [E] */
    /* renamed from: o.hF$c */
    /* loaded from: classes4.dex */
    public static class c<E> implements InterfaceC3287Is2<E, e<E>> {
        public final /* synthetic */ InterfaceC6600ge0 X;

        public c(InterfaceC6600ge0 interfaceC6600ge0) {
            this.X = interfaceC6600ge0;
        }

        @Override // o.InterfaceC3287Is2
        /* renamed from: b */
        public e<E> a(E e) {
            return new e<>(this.X, e);
        }
    }

    /* renamed from: o.hF$d */
    /* loaded from: classes4.dex */
    public static class d<O> {
        public final Map<O, Integer> X;
        public final Map<O, Integer> Y;

        public d(Iterable<? extends O> iterable, Iterable<? extends O> iterable2) {
            this.X = C6748hF.J(iterable);
            this.Y = C6748hF.J(iterable2);
        }

        public int d(Object obj) {
            return f(obj, this.X);
        }

        public int e(Object obj) {
            return f(obj, this.Y);
        }

        public final int f(Object obj, Map<?, Integer> map) {
            Integer num = map.get(obj);
            if (num != null) {
                return num.intValue();
            }
            return 0;
        }

        public final int h(Object obj) {
            return Math.max(d(obj), e(obj));
        }

        public final int i(Object obj) {
            return Math.min(d(obj), e(obj));
        }
    }

    /* renamed from: o.hF$e */
    /* loaded from: classes4.dex */
    public static class e<O> {
        public final InterfaceC6600ge0<? super O> a;
        public final O b;

        public e(InterfaceC6600ge0<? super O> interfaceC6600ge0, O o2) {
            this.a = interfaceC6600ge0;
            this.b = o2;
        }

        public O a() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof e)) {
                return false;
            }
            return this.a.b((O) this.b, (Object) ((e) obj).a());
        }

        public int hashCode() {
            return this.a.a((O) this.b);
        }
    }

    /* renamed from: o.hF$f */
    /* loaded from: classes4.dex */
    public static class f<O> extends d<O> implements Iterable<O> {
        public final List<O> Y0;
        public final Set<O> Z;

        public f(Iterable<? extends O> iterable, Iterable<? extends O> iterable2) {
            super(iterable, iterable2);
            HashSet hashSet = new HashSet();
            this.Z = hashSet;
            C6748hF.a(hashSet, iterable);
            C6748hF.a(hashSet, iterable2);
            this.Y0 = new ArrayList(hashSet.size());
        }

        @Override // java.lang.Iterable
        public Iterator<O> iterator() {
            return this.Z.iterator();
        }

        public Collection<O> j() {
            return this.Y0;
        }

        public void k(O o2, int i) {
            for (int i2 = 0; i2 < i; i2++) {
                this.Y0.add(o2);
            }
        }
    }

    @Deprecated
    public static <T> T A(Iterable<T> iterable, KF1<? super T> kf1) {
        if (kf1 != null) {
            return (T) ZT0.r(iterable, kf1);
        }
        return null;
    }

    @Deprecated
    public static <T, C extends InterfaceC8705pE<? super T>> T B(Iterable<T> iterable, C c2) {
        if (c2 != null) {
            return (T) ZT0.u(iterable, c2);
        }
        return null;
    }

    @Deprecated
    public static <T, C extends InterfaceC8705pE<? super T>> T C(Iterator<T> it, C c2) {
        if (c2 != null) {
            return (T) C6566gU0.K(it, c2);
        }
        return null;
    }

    @Deprecated
    public static <T, C extends InterfaceC8705pE<? super T>> C D(Iterable<T> iterable, C c2) {
        if (c2 != null) {
            ZT0.t(iterable, c2);
        }
        return c2;
    }

    @Deprecated
    public static <T, C extends InterfaceC8705pE<? super T>> C E(Iterator<T> it, C c2) {
        if (c2 != null) {
            C6566gU0.J(it, c2);
        }
        return c2;
    }

    @Deprecated
    public static <T> T F(Iterable<T> iterable, int i) {
        return (T) ZT0.w(iterable, i);
    }

    public static Object G(Object obj, int i) {
        if (i >= 0) {
            if (obj instanceof Map) {
                return C6566gU0.L(((Map) obj).entrySet().iterator(), i);
            }
            if (obj instanceof Object[]) {
                return ((Object[]) obj)[i];
            }
            if (obj instanceof Iterator) {
                return C6566gU0.L((Iterator) obj, i);
            }
            if (obj instanceof Iterable) {
                return ZT0.w((Iterable) obj, i);
            }
            if (obj instanceof Enumeration) {
                return C4591Wd0.a((Enumeration) obj, i);
            }
            if (obj != null) {
                try {
                    return Array.get(obj, i);
                } catch (IllegalArgumentException unused) {
                    throw new IllegalArgumentException("Unsupported object type: " + obj.getClass().getName());
                }
            }
            throw new IllegalArgumentException("Unsupported object type: null");
        }
        throw new IndexOutOfBoundsException("Index cannot be negative: " + i);
    }

    @Deprecated
    public static <T> T H(Iterator<T> it, int i) {
        return (T) C6566gU0.L(it, i);
    }

    public static <K, V> Map.Entry<K, V> I(Map<K, V> map, int i) {
        g(i);
        return (Map.Entry) F(map.entrySet(), i);
    }

    public static <O> Map<O, Integer> J(Iterable<? extends O> iterable) {
        HashMap hashMap = new HashMap();
        for (O o2 : iterable) {
            Integer num = (Integer) hashMap.get(o2);
            if (num == null) {
                hashMap.put(o2, 1);
            } else {
                hashMap.put(o2, Integer.valueOf(num.intValue() + 1));
            }
        }
        return hashMap;
    }

    public static <O> Collection<O> K(Iterable<? extends O> iterable, Iterable<? extends O> iterable2) {
        f fVar = new f(iterable, iterable2);
        Iterator<O> it = fVar.iterator();
        while (it.hasNext()) {
            O next = it.next();
            fVar.k(next, fVar.i(next));
        }
        return fVar.j();
    }

    public static boolean L(Collection<?> collection) {
        if (collection != null && !collection.isEmpty()) {
            return false;
        }
        return true;
    }

    public static boolean M(Collection<?> collection, Collection<?> collection2) {
        if (collection.size() != collection2.size()) {
            return false;
        }
        d dVar = new d(collection, collection2);
        if (dVar.X.size() != dVar.Y.size()) {
            return false;
        }
        for (Object obj : dVar.X.keySet()) {
            if (dVar.d(obj) != dVar.e(obj)) {
                return false;
            }
        }
        return true;
    }

    public static <E> boolean N(Collection<? extends E> collection, Collection<? extends E> collection2, InterfaceC6600ge0<? super E> interfaceC6600ge0) {
        if (interfaceC6600ge0 != null) {
            if (collection.size() != collection2.size()) {
                return false;
            }
            a aVar = new a(interfaceC6600ge0);
            return M(l(collection, aVar), l(collection2, aVar));
        }
        throw new NullPointerException("Equator must not be null.");
    }

    public static boolean O(Collection<? extends Object> collection) {
        if (collection != null) {
            if (collection instanceof InterfaceC7613kp) {
                return ((InterfaceC7613kp) collection).s();
            }
            try {
                return WA2.h(collection).s();
            } catch (IllegalArgumentException unused) {
                return false;
            }
        }
        throw new NullPointerException("The collection must not be null");
    }

    public static boolean P(Collection<?> collection) {
        return !L(collection);
    }

    public static boolean Q(Collection<?> collection, Collection<?> collection2) {
        if (collection.size() < collection2.size() && R(collection, collection2)) {
            return true;
        }
        return false;
    }

    public static boolean R(Collection<?> collection, Collection<?> collection2) {
        d dVar = new d(collection, collection2);
        for (Object obj : collection) {
            if (dVar.d(obj) > dVar.e(obj)) {
                return false;
            }
        }
        return true;
    }

    @Deprecated
    public static <C> boolean S(Iterable<C> iterable, KF1<? super C> kf1) {
        if (kf1 != null && ZT0.A(iterable, kf1)) {
            return true;
        }
        return false;
    }

    public static int T(Collection<? extends Object> collection) {
        if (collection != null) {
            if (collection instanceof InterfaceC7613kp) {
                return ((InterfaceC7613kp) collection).q();
            }
            try {
                return WA2.h(collection).q();
            } catch (IllegalArgumentException unused) {
                return -1;
            }
        }
        throw new NullPointerException("The collection must not be null");
    }

    public static <E> Collection<List<E>> U(Collection<E> collection) {
        IC1 ic1 = new IC1(collection);
        ArrayList arrayList = new ArrayList();
        while (ic1.hasNext()) {
            arrayList.add(ic1.next());
        }
        return arrayList;
    }

    public static <C> Collection<C> V(Collection<C> collection, KF1<? super C> kf1) {
        return VF1.i(collection, kf1);
    }

    public static <E> Collection<E> W(Iterable<E> iterable, Iterable<? extends E> iterable2, InterfaceC6600ge0<? super E> interfaceC6600ge0) {
        Set set = (Set) m(iterable2, new c(interfaceC6600ge0), new HashSet());
        ArrayList arrayList = new ArrayList();
        for (E e2 : iterable) {
            if (!set.contains(new e(interfaceC6600ge0, e2))) {
                arrayList.add(e2);
            }
        }
        return arrayList;
    }

    public static <E> Collection<E> X(Collection<E> collection, Collection<?> collection2) {
        return C6694h11.o(collection, collection2);
    }

    public static <E> Collection<E> Y(Iterable<E> iterable, Iterable<? extends E> iterable2, InterfaceC6600ge0<? super E> interfaceC6600ge0) {
        Set set = (Set) m(iterable2, new b(interfaceC6600ge0), new HashSet());
        ArrayList arrayList = new ArrayList();
        for (E e2 : iterable) {
            if (set.contains(new e(interfaceC6600ge0, e2))) {
                arrayList.add(e2);
            }
        }
        return arrayList;
    }

    public static <C> Collection<C> Z(Collection<C> collection, Collection<?> collection2) {
        return C6694h11.p(collection, collection2);
    }

    public static <C> boolean a(Collection<C> collection, Iterable<? extends C> iterable) {
        if (iterable instanceof Collection) {
            return collection.addAll((Collection) iterable);
        }
        return c(collection, iterable.iterator());
    }

    public static void a0(Object[] objArr) {
        int length = objArr.length - 1;
        for (int i = 0; length > i; i++) {
            Object obj = objArr[length];
            objArr[length] = objArr[i];
            objArr[i] = obj;
            length--;
        }
    }

    public static <C> boolean b(Collection<C> collection, Enumeration<? extends C> enumeration) {
        boolean z = false;
        while (enumeration.hasMoreElements()) {
            z |= collection.add(enumeration.nextElement());
        }
        return z;
    }

    public static <O> Collection<O> b0(Iterable<? extends O> iterable, KF1<? super O> kf1) {
        ArrayList arrayList;
        if (iterable instanceof Collection) {
            arrayList = new ArrayList(((Collection) iterable).size());
        } else {
            arrayList = new ArrayList();
        }
        return c0(iterable, kf1, arrayList);
    }

    public static <C> boolean c(Collection<C> collection, Iterator<? extends C> it) {
        boolean z = false;
        while (it.hasNext()) {
            z |= collection.add(it.next());
        }
        return z;
    }

    public static <O, R extends Collection<? super O>> R c0(Iterable<? extends O> iterable, KF1<? super O> kf1, R r) {
        if (iterable != null && kf1 != null) {
            Iterator<? extends O> it = iterable.iterator();
            while (it.hasNext()) {
                Object obj = (O) it.next();
                if (kf1.evaluate(obj)) {
                    r.add(obj);
                }
            }
        }
        return r;
    }

    public static <C> boolean d(Collection<C> collection, C... cArr) {
        boolean z = false;
        for (C c2 : cArr) {
            z |= collection.add(c2);
        }
        return z;
    }

    public static <O, R extends Collection<? super O>> R d0(Iterable<? extends O> iterable, KF1<? super O> kf1, R r, R r2) {
        if (iterable != null && kf1 != null) {
            Iterator<? extends O> it = iterable.iterator();
            while (it.hasNext()) {
                Object obj = (O) it.next();
                if (kf1.evaluate(obj)) {
                    r.add(obj);
                } else {
                    r2.add(obj);
                }
            }
        }
        return r;
    }

    public static <T> boolean e(Collection<T> collection, T t) {
        if (collection != null) {
            if (t != null && collection.add(t)) {
                return true;
            }
            return false;
        }
        throw new NullPointerException("The collection must not be null");
    }

    public static <O> Collection<O> e0(Iterable<? extends O> iterable, KF1<? super O> kf1) {
        ArrayList arrayList;
        if (iterable instanceof Collection) {
            arrayList = new ArrayList(((Collection) iterable).size());
        } else {
            arrayList = new ArrayList();
        }
        return f0(iterable, kf1, arrayList);
    }

    @Deprecated
    public static <O> int f(O o2, Iterable<? super O> iterable) {
        if (iterable != null) {
            return ZT0.v(iterable, o2);
        }
        throw new NullPointerException("coll must not be null.");
    }

    public static <O, R extends Collection<? super O>> R f0(Iterable<? extends O> iterable, KF1<? super O> kf1, R r) {
        if (iterable != null && kf1 != null) {
            Iterator<? extends O> it = iterable.iterator();
            while (it.hasNext()) {
                Object obj = (O) it.next();
                if (!kf1.evaluate(obj)) {
                    r.add(obj);
                }
            }
        }
        return r;
    }

    public static void g(int i) {
        if (i >= 0) {
            return;
        }
        throw new IndexOutOfBoundsException("Index cannot be negative: " + i);
    }

    public static int g0(Object obj) {
        int i = 0;
        if (obj == null) {
            return 0;
        }
        if (obj instanceof Map) {
            return ((Map) obj).size();
        }
        if (obj instanceof Collection) {
            return ((Collection) obj).size();
        }
        if (obj instanceof Iterable) {
            return ZT0.G((Iterable) obj);
        }
        if (obj instanceof Object[]) {
            return ((Object[]) obj).length;
        }
        if (obj instanceof Iterator) {
            return C6566gU0.a0((Iterator) obj);
        }
        if (obj instanceof Enumeration) {
            Enumeration enumeration = (Enumeration) obj;
            while (enumeration.hasMoreElements()) {
                i++;
                enumeration.nextElement();
            }
            return i;
        }
        try {
            return Array.getLength(obj);
        } catch (IllegalArgumentException unused) {
            throw new IllegalArgumentException("Unsupported object type: " + obj.getClass().getName());
        }
    }

    public static <O extends Comparable<? super O>> List<O> h(Iterable<? extends O> iterable, Iterable<? extends O> iterable2) {
        return j(iterable, iterable2, C7726lH.f(), true);
    }

    public static boolean h0(Object obj) {
        if (obj == null) {
            return true;
        }
        if (obj instanceof Collection) {
            return ((Collection) obj).isEmpty();
        }
        if (obj instanceof Iterable) {
            return ZT0.y((Iterable) obj);
        }
        if (obj instanceof Map) {
            return ((Map) obj).isEmpty();
        }
        if (obj instanceof Object[]) {
            if (((Object[]) obj).length == 0) {
                return true;
            }
            return false;
        } else if (obj instanceof Iterator) {
            return !((Iterator) obj).hasNext();
        } else {
            if (obj instanceof Enumeration) {
                return !((Enumeration) obj).hasMoreElements();
            }
            try {
                if (Array.getLength(obj) == 0) {
                    return true;
                }
                return false;
            } catch (IllegalArgumentException unused) {
                throw new IllegalArgumentException("Unsupported object type: " + obj.getClass().getName());
            }
        }
    }

    public static <O> List<O> i(Iterable<? extends O> iterable, Iterable<? extends O> iterable2, Comparator<? super O> comparator) {
        return j(iterable, iterable2, comparator, true);
    }

    public static <O> Collection<O> i0(Iterable<? extends O> iterable, Iterable<? extends O> iterable2) {
        return j0(iterable, iterable2, Fu2.b());
    }

    public static <O> List<O> j(Iterable<? extends O> iterable, Iterable<? extends O> iterable2, Comparator<? super O> comparator, boolean z) {
        int i;
        if (iterable != null && iterable2 != null) {
            if (comparator != null) {
                if ((iterable instanceof Collection) && (iterable2 instanceof Collection)) {
                    i = Math.max(1, ((Collection) iterable).size() + ((Collection) iterable2).size());
                } else {
                    i = 10;
                }
                YE ye = new YE(comparator, iterable.iterator(), iterable2.iterator());
                if (z) {
                    return C6566gU0.f0(ye, i);
                }
                ArrayList arrayList = new ArrayList(i);
                Object obj = null;
                while (ye.hasNext()) {
                    Object next = ye.next();
                    if (obj == null || !obj.equals(next)) {
                        arrayList.add(next);
                    }
                    obj = next;
                }
                arrayList.trimToSize();
                return arrayList;
            }
            throw new NullPointerException("The comparator must not be null");
        }
        throw new NullPointerException("The collections must not be null");
    }

    public static <O> Collection<O> j0(Iterable<? extends O> iterable, Iterable<? extends O> iterable2, KF1<O> kf1) {
        ArrayList arrayList = new ArrayList();
        C7480kG0 c7480kG0 = new C7480kG0();
        for (O o2 : iterable2) {
            if (kf1.evaluate(o2)) {
                c7480kG0.add(o2);
            }
        }
        for (O o3 : iterable) {
            if (!c7480kG0.v(o3, 1)) {
                arrayList.add(o3);
            }
        }
        return arrayList;
    }

    public static <O extends Comparable<? super O>> List<O> k(Iterable<? extends O> iterable, Iterable<? extends O> iterable2, boolean z) {
        return j(iterable, iterable2, C7726lH.f(), z);
    }

    @Deprecated
    public static <C> Collection<C> k0(Collection<C> collection) {
        return C3447Kj2.e(collection);
    }

    public static <I, O> Collection<O> l(Iterable<I> iterable, InterfaceC3287Is2<? super I, ? extends O> interfaceC3287Is2) {
        ArrayList arrayList;
        if (iterable instanceof Collection) {
            arrayList = new ArrayList(((Collection) iterable).size());
        } else {
            arrayList = new ArrayList();
        }
        return m(iterable, interfaceC3287Is2, arrayList);
    }

    public static <C> void l0(Collection<C> collection, InterfaceC3287Is2<? super C, ? extends C> interfaceC3287Is2) {
        if (collection != null && interfaceC3287Is2 != null) {
            if (collection instanceof List) {
                ListIterator listIterator = ((List) collection).listIterator();
                while (listIterator.hasNext()) {
                    listIterator.set(interfaceC3287Is2.a((Object) listIterator.next()));
                }
                return;
            }
            Collection<? extends C> l = l(collection, interfaceC3287Is2);
            collection.clear();
            collection.addAll(l);
        }
    }

    public static <I, O, R extends Collection<? super O>> R m(Iterable<? extends I> iterable, InterfaceC3287Is2<? super I, ? extends O> interfaceC3287Is2, R r) {
        if (iterable != null) {
            return (R) o(iterable.iterator(), interfaceC3287Is2, r);
        }
        return r;
    }

    public static <E> Collection<E> m0(Collection<E> collection, InterfaceC3287Is2<? super E, ? extends E> interfaceC3287Is2) {
        return C7871ls2.j(collection, interfaceC3287Is2);
    }

    public static <I, O> Collection<O> n(Iterator<I> it, InterfaceC3287Is2<? super I, ? extends O> interfaceC3287Is2) {
        return o(it, interfaceC3287Is2, new ArrayList());
    }

    public static <O> Collection<O> n0(Iterable<? extends O> iterable, Iterable<? extends O> iterable2) {
        f fVar = new f(iterable, iterable2);
        Iterator<O> it = fVar.iterator();
        while (it.hasNext()) {
            O next = it.next();
            fVar.k(next, fVar.h(next));
        }
        return fVar.j();
    }

    public static <I, O, R extends Collection<? super O>> R o(Iterator<? extends I> it, InterfaceC3287Is2<? super I, ? extends O> interfaceC3287Is2, R r) {
        if (it != null && interfaceC3287Is2 != null) {
            while (it.hasNext()) {
                r.add(interfaceC3287Is2.a((I) it.next()));
            }
        }
        return r;
    }

    @Deprecated
    public static <C> Collection<C> o0(Collection<? extends C> collection) {
        return ZA2.f(collection);
    }

    public static boolean p(Collection<?> collection, Collection<?> collection2) {
        if (collection2.isEmpty()) {
            return true;
        }
        HashSet hashSet = new HashSet();
        for (Object obj : collection2) {
            if (!hashSet.contains(obj)) {
                for (Object obj2 : collection) {
                    hashSet.add(obj2);
                    if (obj == null) {
                        if (obj2 == null) {
                            break;
                        }
                    } else if (obj.equals(obj2)) {
                        break;
                    }
                }
                return false;
            }
        }
        return true;
    }

    public static boolean q(Collection<?> collection, Collection<?> collection2) {
        if (collection.size() < collection2.size()) {
            Iterator<?> it = collection.iterator();
            while (it.hasNext()) {
                if (collection2.contains(it.next())) {
                    return true;
                }
            }
            return false;
        }
        Iterator<?> it2 = collection2.iterator();
        while (it2.hasNext()) {
            if (collection.contains(it2.next())) {
                return true;
            }
        }
        return false;
    }

    public static <T> boolean r(Collection<?> collection, T... tArr) {
        if (collection.size() < tArr.length) {
            Iterator<?> it = collection.iterator();
            while (it.hasNext()) {
                if (C4303Te.a(tArr, it.next())) {
                    return true;
                }
            }
        } else {
            for (T t : tArr) {
                if (collection.contains(t)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Deprecated
    public static <C> int s(Iterable<C> iterable, KF1<? super C> kf1) {
        if (kf1 == null) {
            return 0;
        }
        return (int) ZT0.m(iterable, kf1);
    }

    public static <O> Collection<O> t(Iterable<? extends O> iterable, Iterable<? extends O> iterable2) {
        f fVar = new f(iterable, iterable2);
        Iterator<O> it = fVar.iterator();
        while (it.hasNext()) {
            O next = it.next();
            fVar.k(next, fVar.h(next) - fVar.i(next));
        }
        return fVar.j();
    }

    public static <T> Collection<T> u() {
        return a;
    }

    public static <T> Collection<T> v(Collection<T> collection) {
        if (collection == null) {
            return u();
        }
        return collection;
    }

    @Deprecated
    public static <C> boolean w(Iterable<C> iterable, KF1<? super C> kf1) {
        if (kf1 != null && ZT0.B(iterable, kf1)) {
            return true;
        }
        return false;
    }

    public static <E> E x(Collection<E> collection) {
        if (collection != null) {
            if (collection.size() == 1) {
                return collection.iterator().next();
            }
            throw new IllegalArgumentException("Can extract singleton only when collection size == 1");
        }
        throw new NullPointerException("Collection must not be null.");
    }

    public static <T> boolean y(Iterable<T> iterable, KF1<? super T> kf1) {
        boolean z = false;
        if (iterable != null && kf1 != null) {
            Iterator<T> it = iterable.iterator();
            while (it.hasNext()) {
                if (!kf1.evaluate(it.next())) {
                    it.remove();
                    z = true;
                }
            }
        }
        return z;
    }

    public static <T> boolean z(Iterable<T> iterable, KF1<? super T> kf1) {
        KF1 s;
        if (kf1 == null) {
            s = null;
        } else {
            s = QF1.s(kf1);
        }
        return y(iterable, s);
    }
}
