package o;

/* loaded from: classes.dex */
public final class QG1<T> extends AbstractC4565Vv1<T> {
    private static final long serialVersionUID = 0;
    public final T X;

    public QG1(T t) {
        this.X = t;
    }

    @Override // o.AbstractC4565Vv1
    public T c() {
        return this.X;
    }

    @Override // o.AbstractC4565Vv1
    public boolean d() {
        return true;
    }

    @Override // o.AbstractC4565Vv1
    public boolean equals(Object obj) {
        if (obj instanceof QG1) {
            return this.X.equals(((QG1) obj).X);
        }
        return false;
    }

    @Override // o.AbstractC4565Vv1
    public T f(T t) {
        C10907yF1.m(t, "use Optional.orNull() instead of Optional.or(null)");
        return this.X;
    }

    @Override // o.AbstractC4565Vv1
    public T g(InterfaceC8575oh2<? extends T> interfaceC8575oh2) {
        C10907yF1.l(interfaceC8575oh2);
        return this.X;
    }

    @Override // o.AbstractC4565Vv1
    public AbstractC4565Vv1<T> h(AbstractC4565Vv1<? extends T> abstractC4565Vv1) {
        C10907yF1.l(abstractC4565Vv1);
        return this;
    }

    @Override // o.AbstractC4565Vv1
    public int hashCode() {
        return this.X.hashCode() + 1502476572;
    }

    @Override // o.AbstractC4565Vv1
    public T i() {
        return this.X;
    }

    @Override // o.AbstractC4565Vv1
    public String toString() {
        return "Optional.of(" + this.X + C9811tl1.d;
    }
}
