package o;

import java.util.Collection;
import java.util.Comparator;

/* renamed from: o.mH  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C7987mH {
    public static final Comparator a = WG.a();

    public static Comparator a(boolean z) {
        return C3464Ko.b(z);
    }

    public static Comparator b(Collection collection) {
        return d((Comparator[]) collection.toArray(new Comparator[collection.size()]));
    }

    public static Comparator c(Comparator comparator, Comparator comparator2) {
        return d(new Comparator[]{comparator, comparator2});
    }

    public static Comparator d(Comparator[] comparatorArr) {
        C6999iH c6999iH = new C6999iH();
        for (Comparator comparator : comparatorArr) {
            if (comparator != null) {
                c6999iH.a(comparator);
            } else {
                throw new NullPointerException("Comparator cannot be null");
            }
        }
        return c6999iH;
    }

    public static Object e(Object obj, Object obj2, Comparator comparator) {
        if (comparator == null) {
            comparator = a;
        }
        if (comparator.compare(obj, obj2) > 0) {
            return obj;
        }
        return obj2;
    }

    public static Object f(Object obj, Object obj2, Comparator comparator) {
        if (comparator == null) {
            comparator = a;
        }
        if (comparator.compare(obj, obj2) < 0) {
            return obj;
        }
        return obj2;
    }

    public static Comparator g() {
        return a;
    }

    public static Comparator h(Comparator comparator) {
        if (comparator == null) {
            comparator = a;
        }
        return new C5674cs1(comparator, true);
    }

    public static Comparator i(Comparator comparator) {
        if (comparator == null) {
            comparator = a;
        }
        return new C5674cs1(comparator, false);
    }

    public static Comparator j(Comparator comparator) {
        if (comparator == null) {
            comparator = a;
        }
        return new AU1(comparator);
    }

    public static Comparator k(Comparator comparator, InterfaceC3189Hs2 interfaceC3189Hs2) {
        if (comparator == null) {
            comparator = a;
        }
        return new C4165Rs2(interfaceC3189Hs2, comparator);
    }
}
