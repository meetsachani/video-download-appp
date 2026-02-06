package o;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import o.C9740tS0;

/* loaded from: classes.dex */
public abstract class Q01 {
    public static final Q01 a = new b();
    public static final Q01 b = new c();

    /* loaded from: classes.dex */
    public static final class b extends Q01 {
        public static final Class<?> c = Collections.unmodifiableList(Collections.EMPTY_LIST).getClass();

        public b() {
            super();
        }

        public static <E> List<E> f(Object obj, long j) {
            return (List) TB2.O(obj, j);
        }

        public static <L> List<L> g(Object obj, long j, int i) {
            List<L> arrayList;
            List<L> f = f(obj, j);
            if (f.isEmpty()) {
                if (f instanceof InterfaceC6581gZ0) {
                    arrayList = new C6326fZ0(i);
                } else if ((f instanceof InterfaceC7989mH1) && (f instanceof C9740tS0.k)) {
                    arrayList = ((C9740tS0.k) f).o(i);
                } else {
                    arrayList = new ArrayList<>(i);
                }
                TB2.q0(obj, j, arrayList);
                return arrayList;
            } else if (c.isAssignableFrom(f.getClass())) {
                ArrayList arrayList2 = new ArrayList(f.size() + i);
                arrayList2.addAll(f);
                TB2.q0(obj, j, arrayList2);
                return arrayList2;
            } else if (f instanceof C6492gB2) {
                C6326fZ0 c6326fZ0 = new C6326fZ0(f.size() + i);
                c6326fZ0.addAll((C6492gB2) f);
                TB2.q0(obj, j, c6326fZ0);
                return c6326fZ0;
            } else {
                if ((f instanceof InterfaceC7989mH1) && (f instanceof C9740tS0.k)) {
                    C9740tS0.k kVar = (C9740tS0.k) f;
                    if (!kVar.X2()) {
                        C9740tS0.k o2 = kVar.o(f.size() + i);
                        TB2.q0(obj, j, o2);
                        return o2;
                    }
                }
                return f;
            }
        }

        @Override // o.Q01
        public void c(Object obj, long j) {
            Object unmodifiableList;
            List list = (List) TB2.O(obj, j);
            if (list instanceof InterfaceC6581gZ0) {
                unmodifiableList = ((InterfaceC6581gZ0) list).e5();
            } else if (!c.isAssignableFrom(list.getClass())) {
                if ((list instanceof InterfaceC7989mH1) && (list instanceof C9740tS0.k)) {
                    C9740tS0.k kVar = (C9740tS0.k) list;
                    if (kVar.X2()) {
                        kVar.M0();
                        return;
                    }
                    return;
                }
                unmodifiableList = Collections.unmodifiableList(list);
            } else {
                return;
            }
            TB2.q0(obj, j, unmodifiableList);
        }

        @Override // o.Q01
        public <E> void d(Object obj, Object obj2, long j) {
            List f = f(obj2, j);
            List g = g(obj, j, f.size());
            int size = g.size();
            int size2 = f.size();
            if (size > 0 && size2 > 0) {
                g.addAll(f);
            }
            if (size > 0) {
                f = g;
            }
            TB2.q0(obj, j, f);
        }

        @Override // o.Q01
        public <L> List<L> e(Object obj, long j) {
            return g(obj, j, 10);
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends Q01 {
        public c() {
            super();
        }

        public static <E> C9740tS0.k<E> f(Object obj, long j) {
            return (C9740tS0.k) TB2.O(obj, j);
        }

        @Override // o.Q01
        public void c(Object obj, long j) {
            f(obj, j).M0();
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v2, types: [java.util.List] */
        @Override // o.Q01
        public <E> void d(Object obj, Object obj2, long j) {
            C9740tS0.k<E> f = f(obj, j);
            C9740tS0.k<E> f2 = f(obj2, j);
            int size = f.size();
            int size2 = f2.size();
            C9740tS0.k<E> kVar = f;
            kVar = f;
            if (size > 0 && size2 > 0) {
                boolean X2 = f.X2();
                C9740tS0.k<E> kVar2 = f;
                if (!X2) {
                    kVar2 = f.o(size2 + size);
                }
                kVar2.addAll(f2);
                kVar = kVar2;
            }
            if (size > 0) {
                f2 = kVar;
            }
            TB2.q0(obj, j, f2);
        }

        @Override // o.Q01
        public <L> List<L> e(Object obj, long j) {
            int i;
            C9740tS0.k f = f(obj, j);
            if (!f.X2()) {
                int size = f.size();
                if (size == 0) {
                    i = 10;
                } else {
                    i = size * 2;
                }
                C9740tS0.k o2 = f.o(i);
                TB2.q0(obj, j, o2);
                return o2;
            }
            return f;
        }
    }

    public static Q01 a() {
        return a;
    }

    public static Q01 b() {
        return b;
    }

    public abstract void c(Object obj, long j);

    public abstract <L> void d(Object obj, Object obj2, long j);

    public abstract <L> List<L> e(Object obj, long j);

    public Q01() {
    }
}
