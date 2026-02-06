package o;

import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

/* renamed from: o.v22  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C10124v22 {
    public static final SortedSet a = LB2.i(new TreeSet());

    /* JADX INFO: Add missing generic type declarations: [E] */
    /* renamed from: o.v22$a */
    /* loaded from: classes4.dex */
    public static class a<E> implements KF1<E> {
        public final /* synthetic */ Set X;

        public a(Set set) {
            this.X = set;
        }

        @Override // o.KF1
        public boolean evaluate(E e) {
            return !this.X.contains(e);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [E] */
    /* renamed from: o.v22$b */
    /* loaded from: classes4.dex */
    public static class b<E> extends g<E> {
        public final /* synthetic */ Set X;
        public final /* synthetic */ Set Y;
        public final /* synthetic */ KF1 Z;

        public b(Set set, Set set2, KF1 kf1) {
            this.X = set;
            this.Y = set2;
            this.Z = kf1;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            if (this.X.contains(obj) && !this.Y.contains(obj)) {
                return true;
            }
            return false;
        }

        @Override // o.C10124v22.g
        public Iterator<E> e() {
            return C6566gU0.F(this.X.iterator(), this.Z);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [E] */
    /* renamed from: o.v22$c */
    /* loaded from: classes4.dex */
    public static class c<E> extends g<E> {
        public final /* synthetic */ Set X;
        public final /* synthetic */ Set Y;
        public final /* synthetic */ g Y0;
        public final /* synthetic */ g Z;

        public c(Set set, Set set2, g gVar, g gVar2) {
            this.X = set;
            this.Y = set2;
            this.Z = gVar;
            this.Y0 = gVar2;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return this.Y.contains(obj) ^ this.X.contains(obj);
        }

        @Override // o.C10124v22.g
        public Iterator<E> e() {
            return C6566gU0.u(this.Z.iterator(), this.Y0.iterator());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            if (this.Z.isEmpty() && this.Y0.isEmpty()) {
                return true;
            }
            return false;
        }

        @Override // o.C10124v22.g, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.Z.size() + this.Y0.size();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [E] */
    /* renamed from: o.v22$d */
    /* loaded from: classes4.dex */
    public static class d<E> implements KF1<E> {
        public final /* synthetic */ Set X;

        public d(Set set) {
            this.X = set;
        }

        @Override // o.KF1
        public boolean evaluate(E e) {
            return this.X.contains(e);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [E] */
    /* renamed from: o.v22$e */
    /* loaded from: classes4.dex */
    public static class e<E> extends g<E> {
        public final /* synthetic */ Set X;
        public final /* synthetic */ Set Y;
        public final /* synthetic */ KF1 Z;

        public e(Set set, Set set2, KF1 kf1) {
            this.X = set;
            this.Y = set2;
            this.Z = kf1;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            if (this.X.contains(obj) && this.Y.contains(obj)) {
                return true;
            }
            return false;
        }

        @Override // o.C10124v22.g
        public Iterator<E> e() {
            return C6566gU0.F(this.X.iterator(), this.Z);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [E] */
    /* renamed from: o.v22$f */
    /* loaded from: classes4.dex */
    public static class f<E> extends g<E> {
        public final /* synthetic */ Set X;
        public final /* synthetic */ Set Y;
        public final /* synthetic */ g Z;

        public f(Set set, Set set2, g gVar) {
            this.X = set;
            this.Y = set2;
            this.Z = gVar;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            if (!this.X.contains(obj) && !this.Y.contains(obj)) {
                return false;
            }
            return true;
        }

        @Override // o.C10124v22.g
        public Iterator<E> e() {
            return C6566gU0.u(this.X.iterator(), this.Z.iterator());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            if (this.X.isEmpty() && this.Y.isEmpty()) {
                return true;
            }
            return false;
        }

        @Override // o.C10124v22.g, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.X.size() + this.Z.size();
        }
    }

    /* renamed from: o.v22$g */
    /* loaded from: classes4.dex */
    public static abstract class g<E> extends AbstractSet<E> {
        public <S extends Set<E>> void d(S s) {
            C6748hF.a(s, this);
        }

        public abstract Iterator<E> e();

        public Set<E> f() {
            HashSet hashSet = new HashSet(size());
            d(hashSet);
            return hashSet;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<E> iterator() {
            return C6566gU0.l0(e());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return C6566gU0.a0(iterator());
        }
    }

    public static <E> g<E> a(Set<? extends E> set, Set<? extends E> set2) {
        if (set != null && set2 != null) {
            return new b(set, set2, new a(set2));
        }
        throw new NullPointerException("Sets must not be null.");
    }

    public static <E> g<E> b(Set<? extends E> set, Set<? extends E> set2) {
        if (set != null && set2 != null) {
            return new c(set, set2, a(set, set2), a(set2, set));
        }
        throw new NullPointerException("Sets must not be null.");
    }

    public static <T> Set<T> c(Set<T> set) {
        if (set == null) {
            return Collections.EMPTY_SET;
        }
        return set;
    }

    public static <E> Set<E> d() {
        return Collections.EMPTY_SET;
    }

    public static <E> SortedSet<E> e() {
        return a;
    }

    public static <T> int f(Collection<T> collection) {
        int i = 0;
        if (collection == null) {
            return 0;
        }
        for (T t : collection) {
            if (t != null) {
                i += t.hashCode();
            }
        }
        return i;
    }

    public static <E> HashSet<E> g(E... eArr) {
        if (eArr == null) {
            return null;
        }
        return new HashSet<>(Arrays.asList(eArr));
    }

    public static <E> g<E> h(Set<? extends E> set, Set<? extends E> set2) {
        if (set != null && set2 != null) {
            return new e(set, set2, new d(set2));
        }
        throw new NullPointerException("Sets must not be null.");
    }

    public static boolean i(Collection<?> collection, Collection<?> collection2) {
        if (collection == collection2) {
            return true;
        }
        if (collection != null && collection2 != null && collection.size() == collection2.size()) {
            return collection.containsAll(collection2);
        }
        return false;
    }

    public static <E> Set<E> j() {
        return Collections.newSetFromMap(new IdentityHashMap());
    }

    public static <E> Set<E> k(Set<E> set) {
        return C5468c11.k(set);
    }

    public static <E> SortedSet<E> l(NavigableSet<E> navigableSet, KF1<? super E> kf1) {
        return C5528cG1.B(navigableSet, kf1);
    }

    public static <E> Set<E> m(Set<E> set, KF1<? super E> kf1) {
        return C6013eG1.l(set, kf1);
    }

    public static <E> SortedSet<E> n(SortedSet<E> sortedSet, KF1<? super E> kf1) {
        return C7481kG1.r(sortedSet, kf1);
    }

    public static <E> Set<E> o(Set<E> set) {
        return Collections.synchronizedSet(set);
    }

    public static <E> SortedSet<E> p(SortedSet<E> sortedSet) {
        return Collections.synchronizedSortedSet(sortedSet);
    }

    public static <E> SortedSet<E> q(NavigableSet<E> navigableSet, InterfaceC3287Is2<? super E, ? extends E> interfaceC3287Is2) {
        return C10083us2.F(navigableSet, interfaceC3287Is2);
    }

    public static <E> Set<E> r(Set<E> set, InterfaceC3287Is2<? super E, ? extends E> interfaceC3287Is2) {
        return C11058ys2.l(set, interfaceC3287Is2);
    }

    public static <E> SortedSet<E> s(SortedSet<E> sortedSet, InterfaceC3287Is2<? super E, ? extends E> interfaceC3287Is2) {
        return C2884Es2.w(sortedSet, interfaceC3287Is2);
    }

    public static <E> g<E> t(Set<? extends E> set, Set<? extends E> set2) {
        if (set != null && set2 != null) {
            return new f(set, set2, a(set2, set));
        }
        throw new NullPointerException("Sets must not be null.");
    }

    public static <E> SortedSet<E> u(NavigableSet<E> navigableSet) {
        return C9917uB2.j(navigableSet);
    }

    public static <E> Set<E> v(Set<? extends E> set) {
        return CB2.h(set);
    }

    public static <E> Set<E> w(E... eArr) {
        if (eArr == null) {
            return null;
        }
        return CB2.h(g(eArr));
    }

    public static <E> SortedSet<E> x(SortedSet<E> sortedSet) {
        return LB2.i(sortedSet);
    }
}
