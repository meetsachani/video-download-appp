package o;

import java.io.Serializable;

@InterfaceC10420wF0(serializable = true)
@InterfaceC6329fa0
/* renamed from: o.Co1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2671Co1 extends AbstractC10587ww1<Comparable<?>> implements Serializable {
    public static final C2671Co1 Z0 = new C2671Co1();
    private static final long serialVersionUID = 0;
    @MB
    public transient AbstractC10587ww1<Comparable<?>> Y0;
    @MB
    public transient AbstractC10587ww1<Comparable<?>> Z;

    private Object readResolve() {
        return Z0;
    }

    @Override // o.AbstractC10587ww1
    public <S extends Comparable<?>> AbstractC10587ww1<S> A() {
        AbstractC10587ww1<S> abstractC10587ww1 = (AbstractC10587ww1<S>) this.Z;
        if (abstractC10587ww1 == null) {
            AbstractC10587ww1<S> A = super.A();
            this.Z = A;
            return A;
        }
        return abstractC10587ww1;
    }

    @Override // o.AbstractC10587ww1
    public <S extends Comparable<?>> AbstractC10587ww1<S> B() {
        AbstractC10587ww1<S> abstractC10587ww1 = (AbstractC10587ww1<S>) this.Y0;
        if (abstractC10587ww1 == null) {
            AbstractC10587ww1<S> B = super.B();
            this.Y0 = B;
            return B;
        }
        return abstractC10587ww1;
    }

    @Override // o.AbstractC10587ww1
    public <S extends Comparable<?>> AbstractC10587ww1<S> E() {
        return EU1.Z;
    }

    @Override // o.AbstractC10587ww1, java.util.Comparator
    /* renamed from: H */
    public int compare(Comparable<?> comparable, Comparable<?> comparable2) {
        C10664xF1.E(comparable);
        C10664xF1.E(comparable2);
        return comparable.compareTo(comparable2);
    }

    public String toString() {
        return "Ordering.natural()";
    }
}
