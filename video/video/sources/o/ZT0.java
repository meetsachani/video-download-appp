package o;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* loaded from: classes4.dex */
public class ZT0 {
    public static final C10586ww0 a = new e();

    /* JADX INFO: Add missing generic type declarations: [O] */
    /* loaded from: classes4.dex */
    public static class a<O> extends C10586ww0<O> {
        public final /* synthetic */ Iterable Y;
        public final /* synthetic */ InterfaceC3287Is2 Z;

        public a(Iterable iterable, InterfaceC3287Is2 interfaceC3287Is2) {
            this.Y = iterable;
            this.Z = interfaceC3287Is2;
        }

        @Override // o.C10586ww0, java.lang.Iterable
        public Iterator<O> iterator() {
            return C6566gU0.k0(this.Y.iterator(), this.Z);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [E] */
    /* loaded from: classes4.dex */
    public static class b<E> extends C10586ww0<E> {
        public final /* synthetic */ Iterable Y;

        public b(Iterable iterable) {
            this.Y = iterable;
        }

        @Override // o.C10586ww0, java.lang.Iterable
        public Iterator<E> iterator() {
            return new C6488gA2(this.Y.iterator());
        }
    }

    /* JADX INFO: Add missing generic type declarations: [E] */
    /* loaded from: classes4.dex */
    public static class c<E> extends C10586ww0<E> {
        public final /* synthetic */ Iterable Y;
        public final /* synthetic */ Iterable Z;

        public c(Iterable iterable, Iterable iterable2) {
            this.Y = iterable;
            this.Z = iterable2;
        }

        @Override // o.C10586ww0, java.lang.Iterable
        public Iterator<E> iterator() {
            return C6566gU0.o0(this.Y.iterator(), this.Z.iterator());
        }
    }

    /* JADX INFO: Add missing generic type declarations: [E] */
    /* loaded from: classes4.dex */
    public static class d<E> extends C10586ww0<E> {
        public final /* synthetic */ Iterable[] Y;
        public final /* synthetic */ Iterable Z;

        public d(Iterable[] iterableArr, Iterable iterable) {
            this.Y = iterableArr;
            this.Z = iterable;
        }

        @Override // o.C10586ww0, java.lang.Iterable
        public Iterator<E> iterator() {
            Iterator[] itArr = new Iterator[this.Y.length + 1];
            int i = 0;
            itArr[0] = this.Z.iterator();
            while (true) {
                Iterable[] iterableArr = this.Y;
                if (i < iterableArr.length) {
                    int i2 = i + 1;
                    itArr[i2] = iterableArr[i].iterator();
                    i = i2;
                } else {
                    return C6566gU0.q0(itArr);
                }
            }
        }
    }

    /* loaded from: classes4.dex */
    public static class e extends C10586ww0<Object> {
        @Override // o.C10586ww0, java.lang.Iterable
        public Iterator<Object> iterator() {
            return C6566gU0.A();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [E] */
    /* loaded from: classes4.dex */
    public static class f<E> extends C10586ww0<E> {
        public final /* synthetic */ Iterable[] Y;

        /* loaded from: classes4.dex */
        public class a extends UY0<E> {
            public a() {
            }

            @Override // o.UY0
            public Iterator<? extends E> b(int i) {
                Iterable[] iterableArr = f.this.Y;
                if (i > iterableArr.length) {
                    return null;
                }
                return iterableArr[i - 1].iterator();
            }
        }

        public f(Iterable[] iterableArr) {
            this.Y = iterableArr;
        }

        @Override // o.C10586ww0, java.lang.Iterable
        public Iterator<E> iterator() {
            return new a();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [E] */
    /* loaded from: classes4.dex */
    public static class g<E> extends C10586ww0<E> {
        public final /* synthetic */ Iterable Y;
        public final /* synthetic */ Iterable Z;

        public g(Iterable iterable, Iterable iterable2) {
            this.Y = iterable;
            this.Z = iterable2;
        }

        @Override // o.C10586ww0, java.lang.Iterable
        public Iterator<E> iterator() {
            return C6566gU0.x(null, this.Y.iterator(), this.Z.iterator());
        }
    }

    /* JADX INFO: Add missing generic type declarations: [E] */
    /* loaded from: classes4.dex */
    public static class h<E> extends C10586ww0<E> {
        public final /* synthetic */ Comparator Y;
        public final /* synthetic */ Iterable Y0;
        public final /* synthetic */ Iterable Z;

        public h(Comparator comparator, Iterable iterable, Iterable iterable2) {
            this.Y = comparator;
            this.Z = iterable;
            this.Y0 = iterable2;
        }

        @Override // o.C10586ww0, java.lang.Iterable
        public Iterator<E> iterator() {
            return C6566gU0.x(this.Y, this.Z.iterator(), this.Y0.iterator());
        }
    }

    /* JADX INFO: Add missing generic type declarations: [E] */
    /* loaded from: classes4.dex */
    public static class i<E> extends C10586ww0<E> {
        public final /* synthetic */ Iterable Y;
        public final /* synthetic */ KF1 Z;

        public i(Iterable iterable, KF1 kf1) {
            this.Y = iterable;
            this.Z = kf1;
        }

        @Override // o.C10586ww0, java.lang.Iterable
        public Iterator<E> iterator() {
            return C6566gU0.F(ZT0.p(this.Y), this.Z);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [E] */
    /* loaded from: classes4.dex */
    public static class j<E> extends C10586ww0<E> {
        public final /* synthetic */ Iterable Y;
        public final /* synthetic */ long Z;

        public j(Iterable iterable, long j) {
            this.Y = iterable;
            this.Z = j;
        }

        @Override // o.C10586ww0, java.lang.Iterable
        public Iterator<E> iterator() {
            return C6566gU0.r(this.Y.iterator(), this.Z);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [E] */
    /* loaded from: classes4.dex */
    public static class k<E> extends C10586ww0<E> {
        public final /* synthetic */ Iterable Y;

        /* loaded from: classes4.dex */
        public class a extends UY0<E> {
            public a() {
            }

            @Override // o.UY0
            public Iterator<? extends E> b(int i) {
                if (ZT0.y(k.this.Y)) {
                    return null;
                }
                return k.this.Y.iterator();
            }
        }

        public k(Iterable iterable) {
            this.Y = iterable;
        }

        @Override // o.C10586ww0, java.lang.Iterable
        public Iterator<E> iterator() {
            return new a();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [E] */
    /* loaded from: classes4.dex */
    public static class l<E> extends C10586ww0<E> {
        public final /* synthetic */ Iterable Y;

        public l(Iterable iterable) {
            this.Y = iterable;
        }

        @Override // o.C10586ww0, java.lang.Iterable
        public Iterator<E> iterator() {
            List e0;
            Iterable iterable = this.Y;
            if (iterable instanceof List) {
                e0 = (List) iterable;
            } else {
                e0 = C6566gU0.e0(iterable.iterator());
            }
            return new CU1(e0);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [E] */
    /* loaded from: classes4.dex */
    public static class m<E> extends C10586ww0<E> {
        public final /* synthetic */ Iterable Y;
        public final /* synthetic */ long Z;

        public m(Iterable iterable, long j) {
            this.Y = iterable;
            this.Z = j;
        }

        @Override // o.C10586ww0, java.lang.Iterable
        public Iterator<E> iterator() {
            return C6566gU0.b0(this.Y.iterator(), this.Z);
        }
    }

    /* loaded from: classes4.dex */
    public static final class n<E> extends C10586ww0<E> {
        public final Iterable<E> Y;

        public n(Iterable<E> iterable) {
            this.Y = iterable;
        }

        @Override // o.C10586ww0, java.lang.Iterable
        public Iterator<E> iterator() {
            return C6566gU0.l0(this.Y.iterator());
        }
    }

    public static <E> boolean A(Iterable<E> iterable, KF1<? super E> kf1) {
        return C6566gU0.R(p(iterable), kf1);
    }

    public static <E> boolean B(Iterable<E> iterable, KF1<? super E> kf1) {
        return C6566gU0.S(p(iterable), kf1);
    }

    public static <O, R extends Collection<O>> List<R> C(Iterable<? extends O> iterable, InterfaceC5641ck0<R> interfaceC5641ck0, KF1<? super O>... kf1Arr) {
        if (iterable == null) {
            return C(o(), interfaceC5641ck0, kf1Arr);
        }
        if (kf1Arr != null) {
            for (KF1<? super O> kf1 : kf1Arr) {
                if (kf1 == null) {
                    throw new NullPointerException("Predicate must not be null.");
                }
            }
            if (kf1Arr.length < 1) {
                R a2 = interfaceC5641ck0.a();
                C6748hF.a(a2, iterable);
                return Collections.singletonList(a2);
            }
            int length = kf1Arr.length;
            int i2 = length + 1;
            ArrayList arrayList = new ArrayList(i2);
            for (int i3 = 0; i3 < i2; i3++) {
                arrayList.add(interfaceC5641ck0.a());
            }
            Iterator<? extends O> it = iterable.iterator();
            while (it.hasNext()) {
                Object obj = (O) it.next();
                int i4 = 0;
                while (true) {
                    if (i4 < length) {
                        if (kf1Arr[i4].evaluate(obj)) {
                            ((Collection) arrayList.get(i4)).add(obj);
                            break;
                        }
                        i4++;
                    } else {
                        ((Collection) arrayList.get(length)).add(obj);
                        break;
                    }
                }
            }
            return arrayList;
        }
        throw new NullPointerException("Predicates must not be null.");
    }

    public static <O> List<List<O>> D(Iterable<? extends O> iterable, KF1<? super O> kf1) {
        if (kf1 != null) {
            return C(iterable, C6867hk0.c(ArrayList.class), kf1);
        }
        throw new NullPointerException("Predicate must not be null.");
    }

    public static <O> List<List<O>> E(Iterable<? extends O> iterable, KF1<? super O>... kf1Arr) {
        return C(iterable, C6867hk0.c(ArrayList.class), kf1Arr);
    }

    public static <E> Iterable<E> F(Iterable<E> iterable) {
        g(iterable);
        return new l(iterable);
    }

    public static int G(Iterable<?> iterable) {
        if (iterable instanceof Collection) {
            return ((Collection) iterable).size();
        }
        return C6566gU0.a0(p(iterable));
    }

    public static <E> Iterable<E> H(Iterable<E> iterable, long j2) {
        g(iterable);
        if (j2 >= 0) {
            return new m(iterable, j2);
        }
        throw new IllegalArgumentException("ElementsToSkip parameter must not be negative.");
    }

    public static <E> List<E> I(Iterable<E> iterable) {
        return C6566gU0.e0(p(iterable));
    }

    public static <E> String J(Iterable<E> iterable) {
        return C6566gU0.h0(p(iterable));
    }

    public static <E> String K(Iterable<E> iterable, InterfaceC3287Is2<? super E, String> interfaceC3287Is2) {
        if (interfaceC3287Is2 != null) {
            return C6566gU0.i0(p(iterable), interfaceC3287Is2);
        }
        throw new NullPointerException("Transformer must not be null.");
    }

    public static <E> String L(Iterable<E> iterable, InterfaceC3287Is2<? super E, String> interfaceC3287Is2, String str, String str2, String str3) {
        return C6566gU0.j0(p(iterable), interfaceC3287Is2, str, str2, str3);
    }

    public static <I, O> Iterable<O> M(Iterable<I> iterable, InterfaceC3287Is2<? super I, ? extends O> interfaceC3287Is2) {
        g(iterable);
        if (interfaceC3287Is2 != null) {
            return new a(iterable, interfaceC3287Is2);
        }
        throw new NullPointerException("Transformer must not be null.");
    }

    public static <E> Iterable<E> N(Iterable<E> iterable) {
        g(iterable);
        return new b(iterable);
    }

    public static <E> Iterable<E> O(Iterable<E> iterable) {
        g(iterable);
        if (iterable instanceof n) {
            return iterable;
        }
        return new n(iterable);
    }

    public static <E> Iterable<E> P(Iterable<? extends E> iterable, Iterable<? extends E> iterable2) {
        g(iterable);
        g(iterable2);
        return new c(iterable, iterable2);
    }

    public static <E> Iterable<E> Q(Iterable<? extends E> iterable, Iterable<? extends E>... iterableArr) {
        g(iterable);
        h(iterableArr);
        return new d(iterableArr, iterable);
    }

    public static <E> Iterable<E> b(Iterable<E> iterable, long j2) {
        g(iterable);
        if (j2 >= 0) {
            return new j(iterable, j2);
        }
        throw new IllegalArgumentException("MaxSize parameter must not be negative.");
    }

    public static <E> Iterable<E> c(Iterable<? extends E> iterable, Iterable<? extends E> iterable2) {
        return f(iterable, iterable2);
    }

    public static <E> Iterable<E> d(Iterable<? extends E> iterable, Iterable<? extends E> iterable2, Iterable<? extends E> iterable3) {
        return f(iterable, iterable2, iterable3);
    }

    public static <E> Iterable<E> e(Iterable<? extends E> iterable, Iterable<? extends E> iterable2, Iterable<? extends E> iterable3, Iterable<? extends E> iterable4) {
        return f(iterable, iterable2, iterable3, iterable4);
    }

    public static <E> Iterable<E> f(Iterable<? extends E>... iterableArr) {
        h(iterableArr);
        return new f(iterableArr);
    }

    public static void g(Iterable<?> iterable) {
        if (iterable != null) {
            return;
        }
        throw new NullPointerException("Iterable must not be null.");
    }

    public static void h(Iterable<?>... iterableArr) {
        if (iterableArr != null) {
            for (Iterable<?> iterable : iterableArr) {
                g(iterable);
            }
            return;
        }
        throw new NullPointerException("Iterables must not be null.");
    }

    public static <E> Iterable<E> i(Iterable<? extends E> iterable, Iterable<? extends E> iterable2) {
        h(iterable, iterable2);
        return new g(iterable, iterable2);
    }

    public static <E> Iterable<E> j(Comparator<? super E> comparator, Iterable<? extends E> iterable, Iterable<? extends E> iterable2) {
        h(iterable, iterable2);
        return new h(comparator, iterable, iterable2);
    }

    public static <E> boolean k(Iterable<E> iterable, Object obj) {
        if (iterable instanceof Collection) {
            return ((Collection) iterable).contains(obj);
        }
        return C6566gU0.z(p(iterable), obj);
    }

    public static <E> boolean l(Iterable<? extends E> iterable, E e2, InterfaceC6600ge0<? super E> interfaceC6600ge0) {
        if (interfaceC6600ge0 != null) {
            return B(iterable, C5375be0.c(e2, interfaceC6600ge0));
        }
        throw new NullPointerException("Equator must not be null.");
    }

    public static <E> long m(Iterable<E> iterable, KF1<? super E> kf1) {
        if (kf1 != null) {
            return G(q(n(iterable), kf1));
        }
        throw new NullPointerException("Predicate must not be null.");
    }

    public static <E> Iterable<E> n(Iterable<E> iterable) {
        if (iterable == null) {
            return o();
        }
        return iterable;
    }

    public static <E> Iterable<E> o() {
        return a;
    }

    public static <E> Iterator<E> p(Iterable<E> iterable) {
        if (iterable != null) {
            return iterable.iterator();
        }
        return C6566gU0.A();
    }

    public static <E> Iterable<E> q(Iterable<E> iterable, KF1<? super E> kf1) {
        g(iterable);
        if (kf1 != null) {
            return new i(iterable, kf1);
        }
        throw new NullPointerException("Predicate must not be null.");
    }

    public static <E> E r(Iterable<E> iterable, KF1<? super E> kf1) {
        return (E) C6566gU0.H(p(iterable), kf1);
    }

    public static <T> T s(Iterable<T> iterable) {
        return (T) w(iterable, 0);
    }

    public static <E> void t(Iterable<E> iterable, InterfaceC8705pE<? super E> interfaceC8705pE) {
        C6566gU0.J(p(iterable), interfaceC8705pE);
    }

    public static <E> E u(Iterable<E> iterable, InterfaceC8705pE<? super E> interfaceC8705pE) {
        return (E) C6566gU0.K(p(iterable), interfaceC8705pE);
    }

    public static <E, T extends E> int v(Iterable<E> iterable, T t) {
        if (iterable instanceof Set) {
            return ((Set) iterable).contains(t) ? 1 : 0;
        }
        if (iterable instanceof InterfaceC2958Fk) {
            return ((InterfaceC2958Fk) iterable).I(t);
        }
        return G(q(n(iterable), C5375be0.b(t)));
    }

    public static <T> T w(Iterable<T> iterable, int i2) {
        C6748hF.g(i2);
        if (iterable instanceof List) {
            return (T) ((List) iterable).get(i2);
        }
        return (T) C6566gU0.L(p(iterable), i2);
    }

    public static <E> int x(Iterable<E> iterable, KF1<? super E> kf1) {
        return C6566gU0.N(p(iterable), kf1);
    }

    public static boolean y(Iterable<?> iterable) {
        if (iterable instanceof Collection) {
            return ((Collection) iterable).isEmpty();
        }
        return C6566gU0.O(p(iterable));
    }

    public static <E> Iterable<E> z(Iterable<E> iterable) {
        g(iterable);
        return new k(iterable);
    }
}
