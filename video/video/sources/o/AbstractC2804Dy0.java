package o;

import java.util.Collection;
import java.util.Set;

@InterfaceC10420wF0
@InterfaceC6329fa0
/* renamed from: o.Dy0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC2804Dy0<E> extends AbstractC4473Ux0<E> implements Set<E> {
    @Override // o.AbstractC4473Ux0
    public boolean T5(Collection<?> collection) {
        return C10856y22.I(this, (Collection) C10664xF1.E(collection));
    }

    @Override // o.AbstractC4473Ux0
    /* renamed from: Y5 */
    public abstract Set<E> M5();

    public boolean Z5(@MB Object obj) {
        return C10856y22.g(this, obj);
    }

    public int a6() {
        return C10856y22.k(this);
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(@MB Object obj) {
        if (obj != this && !M5().equals(obj)) {
            return false;
        }
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return M5().hashCode();
    }
}
