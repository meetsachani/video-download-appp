package o;

import java.io.Serializable;
import java.util.Map;

/* renamed from: o.ej2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C6124ej2 implements InterfaceC8948qE, Serializable {
    private static final long serialVersionUID = 3518477308466486130L;
    public final JF1[] X;
    public final InterfaceC8948qE[] Y;
    public final InterfaceC8948qE Z;

    public C6124ej2(JF1[] jf1Arr, InterfaceC8948qE[] interfaceC8948qEArr, InterfaceC8948qE interfaceC8948qE) {
        this.X = jf1Arr;
        this.Y = interfaceC8948qEArr;
        this.Z = interfaceC8948qE == null ? C8358no1.X : interfaceC8948qE;
    }

    public static InterfaceC8948qE d(Map map) {
        if (map != null) {
            if (map.size() == 0) {
                return C8358no1.X;
            }
            InterfaceC8948qE interfaceC8948qE = (InterfaceC8948qE) map.remove(null);
            int size = map.size();
            if (size == 0) {
                if (interfaceC8948qE == null) {
                    return C8358no1.X;
                }
                return interfaceC8948qE;
            }
            InterfaceC8948qE[] interfaceC8948qEArr = new InterfaceC8948qE[size];
            JF1[] jf1Arr = new JF1[size];
            int i = 0;
            for (Map.Entry entry : map.entrySet()) {
                jf1Arr[i] = (JF1) entry.getKey();
                interfaceC8948qEArr[i] = (InterfaceC8948qE) entry.getValue();
                i++;
            }
            return new C6124ej2(jf1Arr, interfaceC8948qEArr, interfaceC8948qE);
        }
        throw new IllegalArgumentException("The predicate and closure map must not be null");
    }

    public static InterfaceC8948qE e(JF1[] jf1Arr, InterfaceC8948qE[] interfaceC8948qEArr, InterfaceC8948qE interfaceC8948qE) {
        SB0.f(jf1Arr);
        SB0.e(interfaceC8948qEArr);
        if (jf1Arr.length == interfaceC8948qEArr.length) {
            if (jf1Arr.length == 0) {
                if (interfaceC8948qE == null) {
                    return C8358no1.X;
                }
                return interfaceC8948qE;
            }
            return new C6124ej2(SB0.c(jf1Arr), SB0.b(interfaceC8948qEArr), interfaceC8948qE);
        }
        throw new IllegalArgumentException("The predicate and closure arrays must be the same size");
    }

    @Override // o.InterfaceC8948qE
    public void a(Object obj) {
        int i = 0;
        while (true) {
            JF1[] jf1Arr = this.X;
            if (i < jf1Arr.length) {
                if (jf1Arr[i].evaluate(obj)) {
                    this.Y[i].a(obj);
                    return;
                }
                i++;
            } else {
                this.Z.a(obj);
                return;
            }
        }
    }

    public InterfaceC8948qE[] b() {
        return this.Y;
    }

    public InterfaceC8948qE c() {
        return this.Z;
    }

    public JF1[] f() {
        return this.X;
    }
}
