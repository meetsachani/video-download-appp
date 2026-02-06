package o;

import java.util.AbstractSet;
import java.util.Set;

@InterfaceC7070ia0
/* loaded from: classes3.dex */
public abstract class ZO0<N> extends AbstractSet<AbstractC4099Rc0<N>> {
    public final N X;
    public final InterfaceC6870hl<N> Y;

    public ZO0(InterfaceC6870hl<N> interfaceC6870hl, N n) {
        this.Y = interfaceC6870hl;
        this.X = n;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(@MB Object obj) {
        if (!(obj instanceof AbstractC4099Rc0)) {
            return false;
        }
        AbstractC4099Rc0 abstractC4099Rc0 = (AbstractC4099Rc0) obj;
        if (this.Y.f()) {
            if (!abstractC4099Rc0.e()) {
                return false;
            }
            Object p = abstractC4099Rc0.p();
            Object r = abstractC4099Rc0.r();
            if ((!this.X.equals(p) || !this.Y.b((InterfaceC6870hl<N>) this.X).contains(r)) && (!this.X.equals(r) || !this.Y.a((InterfaceC6870hl<N>) this.X).contains(p))) {
                return false;
            }
            return true;
        } else if (abstractC4099Rc0.e()) {
            return false;
        } else {
            Set<N> k = this.Y.k(this.X);
            Object h = abstractC4099Rc0.h();
            Object i = abstractC4099Rc0.i();
            if ((!this.X.equals(i) || !k.contains(h)) && (!this.X.equals(h) || !k.contains(i))) {
                return false;
            }
            return true;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(@MB Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        if (this.Y.f()) {
            return (this.Y.n(this.X) + this.Y.i(this.X)) - (this.Y.b((InterfaceC6870hl<N>) this.X).contains(this.X) ? 1 : 0);
        }
        return this.Y.k(this.X).size();
    }
}
