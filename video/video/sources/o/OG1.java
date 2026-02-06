package o;

import java.util.Collections;
import java.util.Set;

@InterfaceC10420wF0
@InterfaceC8301na0
/* loaded from: classes3.dex */
public final class OG1<T> extends AbstractC4468Uv1<T> {
    private static final long serialVersionUID = 0;
    public final T X;

    public OG1(T t) {
        this.X = t;
    }

    @Override // o.AbstractC4468Uv1
    public Set<T> b() {
        return Collections.singleton(this.X);
    }

    @Override // o.AbstractC4468Uv1
    public T d() {
        return this.X;
    }

    @Override // o.AbstractC4468Uv1
    public boolean e() {
        return true;
    }

    @Override // o.AbstractC4468Uv1
    public boolean equals(@MB Object obj) {
        if (obj instanceof OG1) {
            return this.X.equals(((OG1) obj).X);
        }
        return false;
    }

    @Override // o.AbstractC4468Uv1
    public T g(T t) {
        C10664xF1.F(t, "use Optional.orNull() instead of Optional.or(null)");
        return this.X;
    }

    @Override // o.AbstractC4468Uv1
    public T h(InterfaceC8331nh2<? extends T> interfaceC8331nh2) {
        C10664xF1.E(interfaceC8331nh2);
        return this.X;
    }

    @Override // o.AbstractC4468Uv1
    public int hashCode() {
        return this.X.hashCode() + 1502476572;
    }

    @Override // o.AbstractC4468Uv1
    public AbstractC4468Uv1<T> i(AbstractC4468Uv1<? extends T> abstractC4468Uv1) {
        C10664xF1.E(abstractC4468Uv1);
        return this;
    }

    @Override // o.AbstractC4468Uv1
    public T j() {
        return this.X;
    }

    @Override // o.AbstractC4468Uv1
    public <V> AbstractC4468Uv1<V> l(YA0<? super T, V> ya0) {
        return new OG1(C10664xF1.F(ya0.apply((T) this.X), "the Function passed to Optional.transform() must not return null."));
    }

    @Override // o.AbstractC4468Uv1
    public String toString() {
        String valueOf = String.valueOf(this.X);
        StringBuilder sb = new StringBuilder(valueOf.length() + 13);
        sb.append("Optional.of(");
        sb.append(valueOf);
        sb.append(C9811tl1.d);
        return sb.toString();
    }
}
