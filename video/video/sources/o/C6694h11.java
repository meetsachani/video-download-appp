package o;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: o.h11  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C6694h11 {

    /* renamed from: o.h11$b */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractList<Character> {
        public final CharSequence X;

        public b(CharSequence charSequence) {
            this.X = charSequence;
        }

        @Override // java.util.AbstractList, java.util.List
        /* renamed from: d */
        public Character get(int i) {
            return Character.valueOf(this.X.charAt(i));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.X.length();
        }
    }

    /* renamed from: o.h11$d */
    /* loaded from: classes4.dex */
    public static class d<T> extends AbstractList<List<T>> {
        public final List<T> X;
        public final int Y;

        @Override // java.util.AbstractList, java.util.List
        /* renamed from: d */
        public List<T> get(int i) {
            int size = size();
            if (i >= 0) {
                if (i < size) {
                    int i2 = this.Y;
                    int i3 = i * i2;
                    return this.X.subList(i3, Math.min(i2 + i3, this.X.size()));
                }
                throw new IndexOutOfBoundsException("Index " + i + " must be less than size " + size);
            }
            throw new IndexOutOfBoundsException("Index " + i + " must not be negative");
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean isEmpty() {
            return this.X.isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return (int) Math.ceil(this.X.size() / this.Y);
        }

        public d(List<T> list, int i) {
            this.X = list;
            this.Y = i;
        }
    }

    public static <T> List<T> a(List<T> list, List<T> list2) {
        if (list == null) {
            return list2;
        }
        return list;
    }

    public static <T> List<T> b(List<T> list) {
        if (list == null) {
            return Collections.EMPTY_LIST;
        }
        return list;
    }

    public static <E> List<E> c(List<E> list) {
        return C2498Au0.i(list);
    }

    public static int d(Collection<?> collection) {
        int hashCode;
        if (collection == null) {
            return 0;
        }
        int i = 1;
        for (Object obj : collection) {
            int i2 = i * 31;
            if (obj == null) {
                hashCode = 0;
            } else {
                hashCode = obj.hashCode();
            }
            i = i2 + hashCode;
        }
        return i;
    }

    public static <E> int e(List<E> list, KF1<E> kf1) {
        if (list != null && kf1 != null) {
            for (int i = 0; i < list.size(); i++) {
                if (kf1.evaluate(list.get(i))) {
                    return i;
                }
            }
            return -1;
        }
        return -1;
    }

    public static <E> List<E> f(List<? extends E> list, List<? extends E> list2) {
        ArrayList arrayList = new ArrayList();
        if (list.size() > list2.size()) {
            list2 = list;
            list = list2;
        }
        HashSet hashSet = new HashSet(list);
        for (E e : list2) {
            if (hashSet.contains(e)) {
                arrayList.add(e);
                hashSet.remove(e);
            }
        }
        return arrayList;
    }

    public static boolean g(Collection<?> collection, Collection<?> collection2) {
        if (collection == collection2) {
            return true;
        }
        if (collection != null && collection2 != null && collection.size() == collection2.size()) {
            Iterator<?> it = collection.iterator();
            Iterator<?> it2 = collection2.iterator();
            while (it.hasNext() && it2.hasNext()) {
                Object next = it.next();
                Object next2 = it2.next();
                if (next == null) {
                    if (next2 != null) {
                        return false;
                    }
                } else if (!next.equals(next2)) {
                    return false;
                }
            }
            if (!it.hasNext() && !it2.hasNext()) {
                return true;
            }
        }
        return false;
    }

    public static <E> List<E> h(List<E> list, InterfaceC5641ck0<? extends E> interfaceC5641ck0) {
        return YY0.i(list, interfaceC5641ck0);
    }

    public static <E> List<E> i(List<E> list, InterfaceC3287Is2<Integer, ? extends E> interfaceC3287Is2) {
        return YY0.j(list, interfaceC3287Is2);
    }

    public static String j(CharSequence charSequence, CharSequence charSequence2) {
        if (charSequence != null && charSequence2 != null) {
            List<Character> k = k(new b(charSequence), new b(charSequence2));
            StringBuilder sb = new StringBuilder();
            for (Character ch : k) {
                sb.append(ch);
            }
            return sb.toString();
        }
        throw new NullPointerException("CharSequence must not be null");
    }

    public static <E> List<E> k(List<E> list, List<E> list2) {
        return l(list, list2, QY.c());
    }

    public static <E> List<E> l(List<E> list, List<E> list2, InterfaceC6600ge0<? super E> interfaceC6600ge0) {
        if (list != null && list2 != null) {
            if (interfaceC6600ge0 != null) {
                J90 d2 = new L02(list, list2, interfaceC6600ge0).d();
                c cVar = new c();
                d2.f(cVar);
                return cVar.d();
            }
            throw new NullPointerException("Equator must not be null");
        }
        throw new NullPointerException("List must not be null");
    }

    public static <T> List<List<T>> m(List<T> list, int i) {
        if (list != null) {
            if (i > 0) {
                return new d(list, i);
            }
            throw new IllegalArgumentException("Size must be greater than 0");
        }
        throw new NullPointerException("List must not be null");
    }

    public static <E> List<E> n(List<E> list, KF1<E> kf1) {
        return YF1.r(list, kf1);
    }

    public static <E> List<E> o(Collection<E> collection, Collection<?> collection2) {
        ArrayList arrayList = new ArrayList();
        for (E e : collection) {
            if (!collection2.contains(e)) {
                arrayList.add(e);
            }
        }
        return arrayList;
    }

    public static <E> List<E> p(Collection<E> collection, Collection<?> collection2) {
        ArrayList arrayList = new ArrayList(Math.min(collection.size(), collection2.size()));
        for (E e : collection) {
            if (collection2.contains(e)) {
                arrayList.add(e);
            }
        }
        return arrayList;
    }

    public static <E> List<E> q(Collection<? extends E> collection, KF1<? super E> kf1) {
        return (List) C6748hF.c0(collection, kf1, new ArrayList(collection.size()));
    }

    public static <E> List<E> r(Collection<? extends E> collection, KF1<? super E> kf1) {
        return (List) C6748hF.f0(collection, kf1, new ArrayList(collection.size()));
    }

    public static <E> List<E> s(List<E> list, List<? extends E> list2) {
        ArrayList arrayList = new ArrayList();
        C7480kG0 c7480kG0 = new C7480kG0(list2);
        for (E e : list) {
            if (!c7480kG0.v(e, 1)) {
                arrayList.add(e);
            }
        }
        return arrayList;
    }

    public static <E> List<E> t(List<? extends E> list, List<? extends E> list2) {
        return s(w(list, list2), f(list, list2));
    }

    public static <E> List<E> u(List<E> list) {
        return Collections.synchronizedList(list);
    }

    public static <E> List<E> v(List<E> list, InterfaceC3287Is2<? super E, ? extends E> interfaceC3287Is2) {
        return C8862ps2.w(list, interfaceC3287Is2);
    }

    public static <E> List<E> w(List<? extends E> list, List<? extends E> list2) {
        ArrayList arrayList = new ArrayList(list.size() + list2.size());
        arrayList.addAll(list);
        arrayList.addAll(list2);
        return arrayList;
    }

    public static <E> List<E> x(List<? extends E> list) {
        return C6735hB2.h(list);
    }

    /* renamed from: o.h11$c */
    /* loaded from: classes4.dex */
    public static final class c<E> implements JG<E> {
        public final ArrayList<E> a = new ArrayList<>();

        @Override // o.JG
        public void c(E e) {
            this.a.add(e);
        }

        public List<E> d() {
            return this.a;
        }

        @Override // o.JG
        public void a(E e) {
        }

        @Override // o.JG
        public void b(E e) {
        }
    }
}
