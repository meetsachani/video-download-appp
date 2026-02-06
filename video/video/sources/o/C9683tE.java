package o;

import java.util.Collection;
import java.util.Map;

/* renamed from: o.tE  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C9683tE {
    public static <E> InterfaceC8705pE<E> a(InterfaceC3287Is2<? super E, ?> interfaceC3287Is2) {
        return C3483Ks2.c(interfaceC3287Is2);
    }

    public static <E> InterfaceC8705pE<E> b(Collection<? extends InterfaceC8705pE<? super E>> collection) {
        return C4769Xz.b(collection);
    }

    public static <E> InterfaceC8705pE<E> c(InterfaceC8705pE<? super E>... interfaceC8705pEArr) {
        return C4769Xz.c(interfaceC8705pEArr);
    }

    public static <E> InterfaceC8705pE<E> d(InterfaceC8705pE<? super E> interfaceC8705pE, KF1<? super E> kf1) {
        return NK2.e(kf1, interfaceC8705pE, true);
    }

    public static <E> InterfaceC8705pE<E> e() {
        return C6847hf0.b();
    }

    public static <E> InterfaceC8705pE<E> f(int i, InterfaceC8705pE<? super E> interfaceC8705pE) {
        return C6178ex0.b(i, interfaceC8705pE);
    }

    public static <E> InterfaceC8705pE<E> g(KF1<? super E> kf1, InterfaceC8705pE<? super E> interfaceC8705pE) {
        return XL0.e(kf1, interfaceC8705pE);
    }

    public static <E> InterfaceC8705pE<E> h(KF1<? super E> kf1, InterfaceC8705pE<? super E> interfaceC8705pE, InterfaceC8705pE<? super E> interfaceC8705pE2) {
        return XL0.f(kf1, interfaceC8705pE, interfaceC8705pE2);
    }

    public static <E> InterfaceC8705pE<E> i(String str) {
        return a(DT0.b(str));
    }

    public static <E> InterfaceC8705pE<E> j(String str, Class<?>[] clsArr, Object[] objArr) {
        return a(DT0.c(str, clsArr, objArr));
    }

    public static <E> InterfaceC8705pE<E> k() {
        return C8115mo1.b();
    }

    public static <E> InterfaceC8705pE<E> l(Map<KF1<E>, InterfaceC8705pE<E>> map) {
        return C5882dj2.e(map);
    }

    public static <E> InterfaceC8705pE<E> m(KF1<? super E>[] kf1Arr, InterfaceC8705pE<? super E>[] interfaceC8705pEArr) {
        return C5882dj2.f(kf1Arr, interfaceC8705pEArr, null);
    }

    public static <E> InterfaceC8705pE<E> n(KF1<? super E>[] kf1Arr, InterfaceC8705pE<? super E>[] interfaceC8705pEArr, InterfaceC8705pE<? super E> interfaceC8705pE) {
        return C5882dj2.f(kf1Arr, interfaceC8705pEArr, interfaceC8705pE);
    }

    public static <E> InterfaceC8705pE<E> o(Map<? extends E, InterfaceC8705pE<E>> map) {
        if (map != null) {
            InterfaceC8705pE<E> remove = map.remove(null);
            int size = map.size();
            InterfaceC8705pE[] interfaceC8705pEArr = new InterfaceC8705pE[size];
            KF1[] kf1Arr = new KF1[size];
            int i = 0;
            for (Map.Entry<? extends E, InterfaceC8705pE<E>> entry : map.entrySet()) {
                kf1Arr[i] = C5375be0.b(entry.getKey());
                interfaceC8705pEArr[i] = entry.getValue();
                i++;
            }
            return n(kf1Arr, interfaceC8705pEArr, remove);
        }
        throw new NullPointerException("The object and closure map must not be null");
    }

    public static <E> InterfaceC8705pE<E> p(KF1<? super E> kf1, InterfaceC8705pE<? super E> interfaceC8705pE) {
        return NK2.e(kf1, interfaceC8705pE, false);
    }
}
