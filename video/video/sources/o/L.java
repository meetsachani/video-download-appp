package o;

/* loaded from: classes.dex */
public final class L<T> extends AbstractC4565Vv1<T> {
    public static final L<Object> X = new L<>();
    private static final long serialVersionUID = 0;

    public static <T> AbstractC4565Vv1<T> j() {
        return X;
    }

    private Object readResolve() {
        return X;
    }

    @Override // o.AbstractC4565Vv1
    public T c() {
        throw new IllegalStateException("Optional.get() cannot be called on an absent value");
    }

    @Override // o.AbstractC4565Vv1
    public boolean d() {
        return false;
    }

    @Override // o.AbstractC4565Vv1
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return false;
    }

    @Override // o.AbstractC4565Vv1
    public T f(T t) {
        return (T) C10907yF1.m(t, "use Optional.orNull() instead of Optional.or(null)");
    }

    @Override // o.AbstractC4565Vv1
    public T g(InterfaceC8575oh2<? extends T> interfaceC8575oh2) {
        return (T) C10907yF1.m(interfaceC8575oh2.get(), "use Optional.orNull() instead of a Supplier that returns null");
    }

    @Override // o.AbstractC4565Vv1
    public AbstractC4565Vv1<T> h(AbstractC4565Vv1<? extends T> abstractC4565Vv1) {
        return (AbstractC4565Vv1) C10907yF1.l(abstractC4565Vv1);
    }

    @Override // o.AbstractC4565Vv1
    public int hashCode() {
        return 2040732332;
    }

    @Override // o.AbstractC4565Vv1
    public T i() {
        return null;
    }

    @Override // o.AbstractC4565Vv1
    public String toString() {
        return "Optional.absent()";
    }
}
