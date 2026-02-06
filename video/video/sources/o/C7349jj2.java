package o;

import java.io.Serializable;
import java.util.Map;

/* renamed from: o.jj2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C7349jj2 implements InterfaceC3189Hs2, Serializable {
    private static final long serialVersionUID = -6404460890903469332L;
    public final JF1[] X;
    public final InterfaceC3189Hs2[] Y;
    public final InterfaceC3189Hs2 Z;

    public C7349jj2(JF1[] jf1Arr, InterfaceC3189Hs2[] interfaceC3189Hs2Arr, InterfaceC3189Hs2 interfaceC3189Hs2) {
        this.X = jf1Arr;
        this.Y = interfaceC3189Hs2Arr;
        this.Z = interfaceC3189Hs2 == null ? C10193vK.Y : interfaceC3189Hs2;
    }

    public static InterfaceC3189Hs2 c(Map map) {
        if (map != null) {
            if (map.size() == 0) {
                return C10193vK.Y;
            }
            InterfaceC3189Hs2 interfaceC3189Hs2 = (InterfaceC3189Hs2) map.remove(null);
            int size = map.size();
            if (size == 0) {
                if (interfaceC3189Hs2 == null) {
                    return C10193vK.Y;
                }
                return interfaceC3189Hs2;
            }
            InterfaceC3189Hs2[] interfaceC3189Hs2Arr = new InterfaceC3189Hs2[size];
            JF1[] jf1Arr = new JF1[size];
            int i = 0;
            for (Map.Entry entry : map.entrySet()) {
                jf1Arr[i] = (JF1) entry.getKey();
                interfaceC3189Hs2Arr[i] = (InterfaceC3189Hs2) entry.getValue();
                i++;
            }
            return new C7349jj2(jf1Arr, interfaceC3189Hs2Arr, interfaceC3189Hs2);
        }
        throw new IllegalArgumentException("The predicate and transformer map must not be null");
    }

    public static InterfaceC3189Hs2 d(JF1[] jf1Arr, InterfaceC3189Hs2[] interfaceC3189Hs2Arr, InterfaceC3189Hs2 interfaceC3189Hs2) {
        SB0.f(jf1Arr);
        SB0.g(interfaceC3189Hs2Arr);
        if (jf1Arr.length == interfaceC3189Hs2Arr.length) {
            if (jf1Arr.length == 0) {
                if (interfaceC3189Hs2 == null) {
                    return C10193vK.Y;
                }
                return interfaceC3189Hs2;
            }
            return new C7349jj2(SB0.c(jf1Arr), SB0.d(interfaceC3189Hs2Arr), interfaceC3189Hs2);
        }
        throw new IllegalArgumentException("The predicate and transformer arrays must be the same size");
    }

    @Override // o.InterfaceC3189Hs2
    public Object a(Object obj) {
        int i = 0;
        while (true) {
            JF1[] jf1Arr = this.X;
            if (i < jf1Arr.length) {
                if (jf1Arr[i].evaluate(obj)) {
                    return this.Y[i].a(obj);
                }
                i++;
            } else {
                return this.Z.a(obj);
            }
        }
    }

    public InterfaceC3189Hs2 b() {
        return this.Z;
    }

    public JF1[] e() {
        return this.X;
    }

    public InterfaceC3189Hs2[] f() {
        return this.Y;
    }
}
