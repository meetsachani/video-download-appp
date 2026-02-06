package o;

import java.util.Collection;
import java.util.Map;

/* renamed from: o.Ps2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C3971Ps2 {
    public static InterfaceC3189Hs2 a(InterfaceC8948qE interfaceC8948qE) {
        return C9440sE.c(interfaceC8948qE);
    }

    public static InterfaceC3189Hs2 b(InterfaceC5399bk0 interfaceC5399bk0) {
        return C6624gk0.c(interfaceC5399bk0);
    }

    public static InterfaceC3189Hs2 c(JF1 jf1) {
        return PF1.b(jf1);
    }

    public static InterfaceC3189Hs2 d(Collection collection) {
        return C5017aA.b(collection);
    }

    public static InterfaceC3189Hs2 e(InterfaceC3189Hs2 interfaceC3189Hs2, InterfaceC3189Hs2 interfaceC3189Hs22) {
        return C5017aA.c(interfaceC3189Hs2, interfaceC3189Hs22);
    }

    public static InterfaceC3189Hs2 f(InterfaceC3189Hs2[] interfaceC3189Hs2Arr) {
        return C5017aA.d(interfaceC3189Hs2Arr);
    }

    public static InterfaceC3189Hs2 g() {
        return QD.X;
    }

    public static InterfaceC3189Hs2 h(Object obj) {
        return C10193vK.c(obj);
    }

    public static InterfaceC3189Hs2 i() {
        return C10518wf0.X;
    }

    public static InterfaceC3189Hs2 j() {
        return RQ0.Z;
    }

    public static InterfaceC3189Hs2 k(Class[] clsArr, Object[] objArr) {
        return RQ0.c(clsArr, objArr);
    }

    public static InterfaceC3189Hs2 l(String str) {
        return ET0.d(str, null, null);
    }

    public static InterfaceC3189Hs2 m(String str, Class[] clsArr, Object[] objArr) {
        return ET0.d(str, clsArr, objArr);
    }

    public static InterfaceC3189Hs2 n(Map map) {
        return C5739d81.b(map);
    }

    public static InterfaceC3189Hs2 o() {
        return C8845po1.X;
    }

    public static InterfaceC3189Hs2 p() {
        return C10193vK.Y;
    }

    public static InterfaceC3189Hs2 q() {
        return C5623cf2.X;
    }

    public static InterfaceC3189Hs2 r(Map map) {
        if (map != null) {
            InterfaceC3189Hs2 interfaceC3189Hs2 = (InterfaceC3189Hs2) map.remove(null);
            int size = map.size();
            InterfaceC3189Hs2[] interfaceC3189Hs2Arr = new InterfaceC3189Hs2[size];
            JF1[] jf1Arr = new JF1[size];
            int i = 0;
            for (Map.Entry entry : map.entrySet()) {
                jf1Arr[i] = C5617ce0.b(entry.getKey());
                interfaceC3189Hs2Arr[i] = (InterfaceC3189Hs2) entry.getValue();
                i++;
            }
            return v(jf1Arr, interfaceC3189Hs2Arr, interfaceC3189Hs2);
        }
        throw new IllegalArgumentException("The object and transformer map must not be null");
    }

    public static InterfaceC3189Hs2 s(Map map) {
        return C7349jj2.c(map);
    }

    public static InterfaceC3189Hs2 t(JF1 jf1, InterfaceC3189Hs2 interfaceC3189Hs2, InterfaceC3189Hs2 interfaceC3189Hs22) {
        return C7349jj2.d(new JF1[]{jf1}, new InterfaceC3189Hs2[]{interfaceC3189Hs2}, interfaceC3189Hs22);
    }

    public static InterfaceC3189Hs2 u(JF1[] jf1Arr, InterfaceC3189Hs2[] interfaceC3189Hs2Arr) {
        return C7349jj2.d(jf1Arr, interfaceC3189Hs2Arr, null);
    }

    public static InterfaceC3189Hs2 v(JF1[] jf1Arr, InterfaceC3189Hs2[] interfaceC3189Hs2Arr, InterfaceC3189Hs2 interfaceC3189Hs2) {
        return C7349jj2.d(jf1Arr, interfaceC3189Hs2Arr, interfaceC3189Hs2);
    }
}
