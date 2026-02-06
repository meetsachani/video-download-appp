package o;

import java.io.Serializable;
import java.util.Collection;

/* renamed from: o.Xz  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C4769Xz<E> implements InterfaceC8705pE<E>, Serializable {
    private static final long serialVersionUID = -3520677225766901240L;
    public final InterfaceC8705pE<? super E>[] X;

    public C4769Xz(boolean z, InterfaceC8705pE<? super E>... interfaceC8705pEArr) {
        this.X = z ? RB0.d(interfaceC8705pEArr) : interfaceC8705pEArr;
    }

    public static <E> InterfaceC8705pE<E> b(Collection<? extends InterfaceC8705pE<? super E>> collection) {
        if (collection != null) {
            if (collection.size() == 0) {
                return C8115mo1.b();
            }
            InterfaceC8705pE[] interfaceC8705pEArr = new InterfaceC8705pE[collection.size()];
            int i = 0;
            for (InterfaceC8705pE<? super E> interfaceC8705pE : collection) {
                interfaceC8705pEArr[i] = interfaceC8705pE;
                i++;
            }
            RB0.g(interfaceC8705pEArr);
            return new C4769Xz(false, interfaceC8705pEArr);
        }
        throw new NullPointerException("Closure collection must not be null");
    }

    public static <E> InterfaceC8705pE<E> c(InterfaceC8705pE<? super E>... interfaceC8705pEArr) {
        RB0.g(interfaceC8705pEArr);
        if (interfaceC8705pEArr.length == 0) {
            return C8115mo1.b();
        }
        return new C4769Xz(interfaceC8705pEArr);
    }

    @Override // o.InterfaceC8705pE
    public void a(E e) {
        for (InterfaceC8705pE<? super E> interfaceC8705pE : this.X) {
            interfaceC8705pE.a(e);
        }
    }

    public InterfaceC8705pE<? super E>[] d() {
        return RB0.d(this.X);
    }

    public C4769Xz(InterfaceC8705pE<? super E>... interfaceC8705pEArr) {
        this(true, interfaceC8705pEArr);
    }
}
