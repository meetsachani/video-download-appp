package o;

import java.lang.Comparable;
import o.InterfaceC2796Dv1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public class XG<T extends Comparable<? super T>> implements InterfaceC2796Dv1<T> {
    @NotNull
    public final T X;
    @NotNull
    public final T Y;

    public XG(@NotNull T t, @NotNull T t2) {
        C6562gT0.p(t, "start");
        C6562gT0.p(t2, "endExclusive");
        this.X = t;
        this.Y = t2;
    }

    @Override // o.InterfaceC2796Dv1
    @NotNull
    public T d() {
        return this.X;
    }

    @Override // o.InterfaceC2796Dv1
    public boolean e(@NotNull T t) {
        return InterfaceC2796Dv1.a.a(this, t);
    }

    public boolean equals(@Nullable Object obj) {
        if (obj instanceof XG) {
            if (!isEmpty() || !((XG) obj).isEmpty()) {
                XG xg = (XG) obj;
                if (C6562gT0.g(d(), xg.d()) && C6562gT0.g(i(), xg.i())) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (d().hashCode() * 31) + i().hashCode();
    }

    @Override // o.InterfaceC2796Dv1
    @NotNull
    public T i() {
        return this.Y;
    }

    @Override // o.InterfaceC2796Dv1
    public boolean isEmpty() {
        return InterfaceC2796Dv1.a.b(this);
    }

    @NotNull
    public String toString() {
        return d() + "..<" + i();
    }
}
