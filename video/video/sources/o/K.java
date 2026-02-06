package o;

import java.util.Collections;
import java.util.Set;

@InterfaceC10420wF0
@InterfaceC8301na0
/* loaded from: classes3.dex */
public final class K<T> extends AbstractC4468Uv1<T> {
    public static final K<Object> X = new K<>();
    private static final long serialVersionUID = 0;

    public static <T> AbstractC4468Uv1<T> m() {
        return X;
    }

    private Object readResolve() {
        return X;
    }

    @Override // o.AbstractC4468Uv1
    public Set<T> b() {
        return Collections.EMPTY_SET;
    }

    @Override // o.AbstractC4468Uv1
    public T d() {
        throw new IllegalStateException("Optional.get() cannot be called on an absent value");
    }

    @Override // o.AbstractC4468Uv1
    public boolean e() {
        return false;
    }

    @Override // o.AbstractC4468Uv1
    public boolean equals(@MB Object obj) {
        if (obj == this) {
            return true;
        }
        return false;
    }

    @Override // o.AbstractC4468Uv1
    public T g(T t) {
        return (T) C10664xF1.F(t, "use Optional.orNull() instead of Optional.or(null)");
    }

    @Override // o.AbstractC4468Uv1
    public T h(InterfaceC8331nh2<? extends T> interfaceC8331nh2) {
        return (T) C10664xF1.F(interfaceC8331nh2.get(), "use Optional.orNull() instead of a Supplier that returns null");
    }

    @Override // o.AbstractC4468Uv1
    public int hashCode() {
        return 2040732332;
    }

    @Override // o.AbstractC4468Uv1
    public AbstractC4468Uv1<T> i(AbstractC4468Uv1<? extends T> abstractC4468Uv1) {
        return (AbstractC4468Uv1) C10664xF1.E(abstractC4468Uv1);
    }

    @Override // o.AbstractC4468Uv1
    @MB
    public T j() {
        return null;
    }

    @Override // o.AbstractC4468Uv1
    public <V> AbstractC4468Uv1<V> l(YA0<? super T, V> ya0) {
        C10664xF1.E(ya0);
        return AbstractC4468Uv1.a();
    }

    @Override // o.AbstractC4468Uv1
    public String toString() {
        return "Optional.absent()";
    }
}
