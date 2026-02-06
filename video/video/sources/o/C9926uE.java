package o;

import java.util.Collection;
import java.util.Map;

/* renamed from: o.uE  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C9926uE {
    public static InterfaceC8948qE a(InterfaceC3189Hs2 interfaceC3189Hs2) {
        return C3580Ls2.b(interfaceC3189Hs2);
    }

    public static InterfaceC8948qE b(Collection collection) {
        return C4866Yz.c(collection);
    }

    public static InterfaceC8948qE c(InterfaceC8948qE interfaceC8948qE, InterfaceC8948qE interfaceC8948qE2) {
        return C4866Yz.d(interfaceC8948qE, interfaceC8948qE2);
    }

    public static InterfaceC8948qE d(InterfaceC8948qE[] interfaceC8948qEArr) {
        return C4866Yz.e(interfaceC8948qEArr);
    }

    public static InterfaceC8948qE e(InterfaceC8948qE interfaceC8948qE, JF1 jf1) {
        return OK2.d(jf1, interfaceC8948qE, true);
    }

    public static InterfaceC8948qE f() {
        return C7089if0.X;
    }

    public static InterfaceC8948qE g(int i, InterfaceC8948qE interfaceC8948qE) {
        return C6421fx0.e(i, interfaceC8948qE);
    }

    public static InterfaceC8948qE h(JF1 jf1, InterfaceC8948qE interfaceC8948qE) {
        return YL0.c(jf1, interfaceC8948qE);
    }

    public static InterfaceC8948qE i(JF1 jf1, InterfaceC8948qE interfaceC8948qE, InterfaceC8948qE interfaceC8948qE2) {
        return YL0.d(jf1, interfaceC8948qE, interfaceC8948qE2);
    }

    public static InterfaceC8948qE j(String str) {
        return a(ET0.c(str));
    }

    public static InterfaceC8948qE k(String str, Class[] clsArr, Object[] objArr) {
        return a(ET0.d(str, clsArr, objArr));
    }

    public static InterfaceC8948qE l() {
        return C8358no1.X;
    }

    public static InterfaceC8948qE m(Map map) {
        return C6124ej2.d(map);
    }

    public static InterfaceC8948qE n(JF1[] jf1Arr, InterfaceC8948qE[] interfaceC8948qEArr) {
        return C6124ej2.e(jf1Arr, interfaceC8948qEArr, null);
    }

    public static InterfaceC8948qE o(JF1[] jf1Arr, InterfaceC8948qE[] interfaceC8948qEArr, InterfaceC8948qE interfaceC8948qE) {
        return C6124ej2.e(jf1Arr, interfaceC8948qEArr, interfaceC8948qE);
    }

    public static InterfaceC8948qE p(Map map) {
        if (map != null) {
            InterfaceC8948qE interfaceC8948qE = (InterfaceC8948qE) map.remove(null);
            int size = map.size();
            InterfaceC8948qE[] interfaceC8948qEArr = new InterfaceC8948qE[size];
            JF1[] jf1Arr = new JF1[size];
            int i = 0;
            for (Map.Entry entry : map.entrySet()) {
                jf1Arr[i] = C5617ce0.b(entry.getKey());
                interfaceC8948qEArr[i] = (InterfaceC8948qE) entry.getValue();
                i++;
            }
            return o(jf1Arr, interfaceC8948qEArr, interfaceC8948qE);
        }
        throw new IllegalArgumentException("The object and closure map must not be null");
    }

    public static InterfaceC8948qE q(JF1 jf1, InterfaceC8948qE interfaceC8948qE) {
        return OK2.d(jf1, interfaceC8948qE, false);
    }
}
