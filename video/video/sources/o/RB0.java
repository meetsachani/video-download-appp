package o;

import java.util.Collection;

/* loaded from: classes4.dex */
public class RB0 {
    public static <E> InterfaceC8705pE<E>[] d(InterfaceC8705pE<? super E>... interfaceC8705pEArr) {
        if (interfaceC8705pEArr == null) {
            return null;
        }
        return (InterfaceC8705pE[]) interfaceC8705pEArr.clone();
    }

    public static <T> KF1<T>[] e(KF1<? super T>... kf1Arr) {
        if (kf1Arr == null) {
            return null;
        }
        return (KF1[]) kf1Arr.clone();
    }

    public static <I, O> InterfaceC3287Is2<I, O>[] f(InterfaceC3287Is2<? super I, ? extends O>... interfaceC3287Is2Arr) {
        if (interfaceC3287Is2Arr == null) {
            return null;
        }
        return (InterfaceC3287Is2[]) interfaceC3287Is2Arr.clone();
    }

    public static void g(InterfaceC8705pE<?>... interfaceC8705pEArr) {
        if (interfaceC8705pEArr != null) {
            for (int i = 0; i < interfaceC8705pEArr.length; i++) {
                if (interfaceC8705pEArr[i] == null) {
                    throw new NullPointerException("The closure array must not contain a null closure, index " + i + " was null");
                }
            }
            return;
        }
        throw new NullPointerException("The closure array must not be null");
    }

    public static void h(KF1<?>... kf1Arr) {
        if (kf1Arr != null) {
            for (int i = 0; i < kf1Arr.length; i++) {
                if (kf1Arr[i] == null) {
                    throw new NullPointerException("The predicate array must not contain a null predicate, index " + i + " was null");
                }
            }
            return;
        }
        throw new NullPointerException("The predicate array must not be null");
    }

    public static void i(InterfaceC3287Is2<?, ?>... interfaceC3287Is2Arr) {
        if (interfaceC3287Is2Arr != null) {
            for (int i = 0; i < interfaceC3287Is2Arr.length; i++) {
                if (interfaceC3287Is2Arr[i] == null) {
                    throw new NullPointerException("The transformer array must not contain a null transformer, index " + i + " was null");
                }
            }
            return;
        }
        throw new NullPointerException("The transformer array must not be null");
    }

    public static <T> KF1<? super T>[] j(Collection<? extends KF1<? super T>> collection) {
        if (collection != null) {
            KF1<? super T>[] kf1Arr = new KF1[collection.size()];
            int i = 0;
            for (KF1<? super T> kf1 : collection) {
                kf1Arr[i] = kf1;
                if (kf1 != null) {
                    i++;
                } else {
                    throw new NullPointerException("The predicate collection must not contain a null predicate, index " + i + " was null");
                }
            }
            return kf1Arr;
        }
        throw new NullPointerException("The predicate collection must not be null");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> InterfaceC8705pE<T> a(InterfaceC8705pE<? super T> interfaceC8705pE) {
        return interfaceC8705pE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> KF1<T> b(KF1<? super T> kf1) {
        return kf1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <I, O> InterfaceC3287Is2<I, O> c(InterfaceC3287Is2<? super I, ? extends O> interfaceC3287Is2) {
        return interfaceC3287Is2;
    }
}
