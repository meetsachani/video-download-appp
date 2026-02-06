package o;

import java.util.Collection;
import java.util.Map;

/* renamed from: o.Os2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C3874Os2 {
    public static <T> InterfaceC3287Is2<T, T> a(InterfaceC8705pE<? super T> interfaceC8705pE) {
        return C9197rE.b(interfaceC8705pE);
    }

    public static <I, O> InterfaceC3287Is2<I, O> b(InterfaceC5641ck0<? extends O> interfaceC5641ck0) {
        return C6369fk0.b(interfaceC5641ck0);
    }

    public static <T> InterfaceC3287Is2<T, Boolean> c(KF1<? super T> kf1) {
        return OF1.c(kf1);
    }

    public static <T> InterfaceC3287Is2<T, T> d(Collection<? extends InterfaceC3287Is2<? super T, ? extends T>> collection) {
        return C4973Zz.b(collection);
    }

    public static <T> InterfaceC3287Is2<T, T> e(InterfaceC3287Is2<? super T, ? extends T>... interfaceC3287Is2Arr) {
        return C4973Zz.c(interfaceC3287Is2Arr);
    }

    public static <T> InterfaceC3287Is2<T, T> f() {
        return PD.b();
    }

    public static <I, O> InterfaceC3287Is2<I, O> g(O o2) {
        return C9950uK.b(o2);
    }

    public static <I, O> InterfaceC3287Is2<I, O> h() {
        return C10272vf0.b();
    }

    public static <T> InterfaceC3287Is2<T, T> i(KF1<? super T> kf1, InterfaceC3287Is2<? super T, ? extends T> interfaceC3287Is2) {
        return ZL0.e(kf1, interfaceC3287Is2);
    }

    public static <I, O> InterfaceC3287Is2<I, O> j(KF1<? super I> kf1, InterfaceC3287Is2<? super I, ? extends O> interfaceC3287Is2, InterfaceC3287Is2<? super I, ? extends O> interfaceC3287Is22) {
        return ZL0.f(kf1, interfaceC3287Is2, interfaceC3287Is22);
    }

    public static <T> InterfaceC3287Is2<Class<? extends T>, T> k() {
        return QQ0.b();
    }

    public static <T> InterfaceC3287Is2<Class<? extends T>, T> l(Class<?>[] clsArr, Object[] objArr) {
        return QQ0.c(clsArr, objArr);
    }

    public static <I, O> InterfaceC3287Is2<I, O> m(String str) {
        return DT0.c(str, null, null);
    }

    public static <I, O> InterfaceC3287Is2<I, O> n(String str, Class<?>[] clsArr, Object[] objArr) {
        return DT0.c(str, clsArr, objArr);
    }

    public static <I, O> InterfaceC3287Is2<I, O> o(Map<? super I, ? extends O> map) {
        return C5496c81.c(map);
    }

    public static <T> InterfaceC3287Is2<T, T> p() {
        return C8602oo1.b();
    }

    public static <I, O> InterfaceC3287Is2<I, O> q() {
        return C9950uK.d();
    }

    public static <T> InterfaceC3287Is2<T, String> r() {
        return C5381bf2.b();
    }

    public static <I, O> InterfaceC3287Is2<I, O> s(Map<I, InterfaceC3287Is2<I, O>> map) {
        if (map != null) {
            InterfaceC3287Is2<I, O> remove = map.remove(null);
            int size = map.size();
            InterfaceC3287Is2[] interfaceC3287Is2Arr = new InterfaceC3287Is2[size];
            KF1[] kf1Arr = new KF1[size];
            int i = 0;
            for (Map.Entry<I, InterfaceC3287Is2<I, O>> entry : map.entrySet()) {
                kf1Arr[i] = C5375be0.b(entry.getKey());
                interfaceC3287Is2Arr[i] = entry.getValue();
                i++;
            }
            return w(kf1Arr, interfaceC3287Is2Arr, remove);
        }
        throw new NullPointerException("The object and transformer map must not be null");
    }

    public static <I, O> InterfaceC3287Is2<I, O> t(Map<KF1<I>, InterfaceC3287Is2<I, O>> map) {
        return C7107ij2.e(map);
    }

    @Deprecated
    public static <I, O> InterfaceC3287Is2<I, O> u(KF1<? super I> kf1, InterfaceC3287Is2<? super I, ? extends O> interfaceC3287Is2, InterfaceC3287Is2<? super I, ? extends O> interfaceC3287Is22) {
        return C7107ij2.f(new KF1[]{kf1}, new InterfaceC3287Is2[]{interfaceC3287Is2}, interfaceC3287Is22);
    }

    public static <I, O> InterfaceC3287Is2<I, O> v(KF1<? super I>[] kf1Arr, InterfaceC3287Is2<? super I, ? extends O>[] interfaceC3287Is2Arr) {
        return C7107ij2.f(kf1Arr, interfaceC3287Is2Arr, null);
    }

    public static <I, O> InterfaceC3287Is2<I, O> w(KF1<? super I>[] kf1Arr, InterfaceC3287Is2<? super I, ? extends O>[] interfaceC3287Is2Arr, InterfaceC3287Is2<? super I, ? extends O> interfaceC3287Is2) {
        return C7107ij2.f(kf1Arr, interfaceC3287Is2Arr, interfaceC3287Is2);
    }
}
