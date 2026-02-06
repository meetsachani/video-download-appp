package o;

import java.lang.Comparable;
import o.InterfaceC6987iE;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public class YG<T extends Comparable<? super T>> implements InterfaceC6987iE<T> {
    @NotNull
    public final T X;
    @NotNull
    public final T Y;

    public YG(@NotNull T t, @NotNull T t2) {
        C6562gT0.p(t, "start");
        C6562gT0.p(t2, "endInclusive");
        this.X = t;
        this.Y = t2;
    }

    @Override // o.InterfaceC6987iE
    @NotNull
    public T d() {
        return this.X;
    }

    @Override // o.InterfaceC6987iE
    public boolean e(@NotNull T t) {
        return InterfaceC6987iE.a.a(this, t);
    }

    public boolean equals(@Nullable Object obj) {
        if (obj instanceof YG) {
            if (!isEmpty() || !((YG) obj).isEmpty()) {
                YG yg = (YG) obj;
                if (C6562gT0.g(d(), yg.d()) && C6562gT0.g(h(), yg.h())) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    @Override // o.InterfaceC6987iE
    @NotNull
    public T h() {
        return this.Y;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (d().hashCode() * 31) + h().hashCode();
    }

    @Override // o.InterfaceC6987iE
    public boolean isEmpty() {
        return InterfaceC6987iE.a.b(this);
    }

    @NotNull
    public String toString() {
        return d() + ".." + h();
    }
}
