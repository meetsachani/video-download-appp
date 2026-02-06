package o;

import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

@InterfaceC7070ia0
/* renamed from: o.Sc0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC4199Sc0<N> extends AbstractC6437g1<AbstractC4099Rc0<N>> {
    public final Iterator<N> Y0;
    public final InterfaceC6870hl<N> Z;
    @MB
    public N Z0;
    public Iterator<N> a1;

    /* renamed from: o.Sc0$b */
    /* loaded from: classes3.dex */
    public static final class b<N> extends AbstractC4199Sc0<N> {
        @Override // o.AbstractC6437g1
        @MB
        /* renamed from: g */
        public AbstractC4099Rc0<N> b() {
            while (!this.a1.hasNext()) {
                if (!e()) {
                    return c();
                }
            }
            N n = this.Z0;
            Objects.requireNonNull(n);
            return AbstractC4099Rc0.l(n, this.a1.next());
        }

        public b(InterfaceC6870hl<N> interfaceC6870hl) {
            super(interfaceC6870hl);
        }
    }

    /* renamed from: o.Sc0$c */
    /* loaded from: classes3.dex */
    public static final class c<N> extends AbstractC4199Sc0<N> {
        @MB
        public Set<N> b1;

        @Override // o.AbstractC6437g1
        @MB
        /* renamed from: g */
        public AbstractC4099Rc0<N> b() {
            do {
                Objects.requireNonNull(this.b1);
                while (this.a1.hasNext()) {
                    N next = this.a1.next();
                    if (!this.b1.contains(next)) {
                        N n = this.Z0;
                        Objects.requireNonNull(n);
                        return AbstractC4099Rc0.w(n, next);
                    }
                }
                this.b1.add(this.Z0);
            } while (e());
            this.b1 = null;
            return c();
        }

        public c(InterfaceC6870hl<N> interfaceC6870hl) {
            super(interfaceC6870hl);
            this.b1 = C10856y22.y(interfaceC6870hl.m().size() + 1);
        }
    }

    public static <N> AbstractC4199Sc0<N> f(InterfaceC6870hl<N> interfaceC6870hl) {
        if (interfaceC6870hl.f()) {
            return new b(interfaceC6870hl);
        }
        return new c(interfaceC6870hl);
    }

    public final boolean e() {
        C10664xF1.g0(!this.a1.hasNext());
        if (!this.Y0.hasNext()) {
            return false;
        }
        N next = this.Y0.next();
        this.Z0 = next;
        this.a1 = this.Z.b((InterfaceC6870hl<N>) next).iterator();
        return true;
    }

    public AbstractC4199Sc0(InterfaceC6870hl<N> interfaceC6870hl) {
        this.Z0 = null;
        this.a1 = AbstractC9481sO0.M().iterator();
        this.Z = interfaceC6870hl;
        this.Y0 = interfaceC6870hl.m().iterator();
    }
}
