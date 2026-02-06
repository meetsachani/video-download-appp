package o;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: o.Yz  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C4866Yz implements InterfaceC8948qE, Serializable {
    private static final long serialVersionUID = -3520677225766901240L;
    public final InterfaceC8948qE[] X;

    public C4866Yz(InterfaceC8948qE[] interfaceC8948qEArr) {
        this.X = interfaceC8948qEArr;
    }

    public static InterfaceC8948qE c(Collection collection) {
        if (collection != null) {
            if (collection.size() == 0) {
                return C8358no1.X;
            }
            InterfaceC8948qE[] interfaceC8948qEArr = new InterfaceC8948qE[collection.size()];
            Iterator it = collection.iterator();
            int i = 0;
            while (it.hasNext()) {
                interfaceC8948qEArr[i] = (InterfaceC8948qE) it.next();
                i++;
            }
            SB0.e(interfaceC8948qEArr);
            return new C4866Yz(interfaceC8948qEArr);
        }
        throw new IllegalArgumentException("Closure collection must not be null");
    }

    public static InterfaceC8948qE d(InterfaceC8948qE interfaceC8948qE, InterfaceC8948qE interfaceC8948qE2) {
        if (interfaceC8948qE != null && interfaceC8948qE2 != null) {
            return new C4866Yz(new InterfaceC8948qE[]{interfaceC8948qE, interfaceC8948qE2});
        }
        throw new IllegalArgumentException("Closures must not be null");
    }

    public static InterfaceC8948qE e(InterfaceC8948qE[] interfaceC8948qEArr) {
        SB0.e(interfaceC8948qEArr);
        if (interfaceC8948qEArr.length == 0) {
            return C8358no1.X;
        }
        return new C4866Yz(SB0.b(interfaceC8948qEArr));
    }

    @Override // o.InterfaceC8948qE
    public void a(Object obj) {
        int i = 0;
        while (true) {
            InterfaceC8948qE[] interfaceC8948qEArr = this.X;
            if (i < interfaceC8948qEArr.length) {
                interfaceC8948qEArr[i].a(obj);
                i++;
            } else {
                return;
            }
        }
    }

    public InterfaceC8948qE[] b() {
        return this.X;
    }
}
