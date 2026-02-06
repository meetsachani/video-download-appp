package o;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: o.aA  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C5017aA implements InterfaceC3189Hs2, Serializable {
    private static final long serialVersionUID = 3514945074733160196L;
    public final InterfaceC3189Hs2[] X;

    public C5017aA(InterfaceC3189Hs2[] interfaceC3189Hs2Arr) {
        this.X = interfaceC3189Hs2Arr;
    }

    public static InterfaceC3189Hs2 b(Collection collection) {
        if (collection != null) {
            if (collection.size() == 0) {
                return C8845po1.X;
            }
            InterfaceC3189Hs2[] interfaceC3189Hs2Arr = new InterfaceC3189Hs2[collection.size()];
            Iterator it = collection.iterator();
            int i = 0;
            while (it.hasNext()) {
                interfaceC3189Hs2Arr[i] = (InterfaceC3189Hs2) it.next();
                i++;
            }
            SB0.g(interfaceC3189Hs2Arr);
            return new C5017aA(interfaceC3189Hs2Arr);
        }
        throw new IllegalArgumentException("Transformer collection must not be null");
    }

    public static InterfaceC3189Hs2 c(InterfaceC3189Hs2 interfaceC3189Hs2, InterfaceC3189Hs2 interfaceC3189Hs22) {
        if (interfaceC3189Hs2 != null && interfaceC3189Hs22 != null) {
            return new C5017aA(new InterfaceC3189Hs2[]{interfaceC3189Hs2, interfaceC3189Hs22});
        }
        throw new IllegalArgumentException("Transformers must not be null");
    }

    public static InterfaceC3189Hs2 d(InterfaceC3189Hs2[] interfaceC3189Hs2Arr) {
        SB0.g(interfaceC3189Hs2Arr);
        if (interfaceC3189Hs2Arr.length == 0) {
            return C8845po1.X;
        }
        return new C5017aA(SB0.d(interfaceC3189Hs2Arr));
    }

    @Override // o.InterfaceC3189Hs2
    public Object a(Object obj) {
        int i = 0;
        while (true) {
            InterfaceC3189Hs2[] interfaceC3189Hs2Arr = this.X;
            if (i < interfaceC3189Hs2Arr.length) {
                obj = interfaceC3189Hs2Arr[i].a(obj);
                i++;
            } else {
                return obj;
            }
        }
    }

    public InterfaceC3189Hs2[] e() {
        return this.X;
    }
}
