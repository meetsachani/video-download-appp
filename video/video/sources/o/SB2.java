package o;

import java.io.Serializable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class SB2<T> implements EY0<T>, Serializable {
    @Nullable
    public FA0<? extends T> X;
    @Nullable
    public Object Y;

    public SB2(@NotNull FA0<? extends T> fa0) {
        C6562gT0.p(fa0, "initializer");
        this.X = fa0;
        this.Y = Bx2.a;
    }

    private final Object writeReplace() {
        return new KP0(getValue());
    }

    @Override // o.EY0
    public T getValue() {
        if (this.Y == Bx2.a) {
            FA0<? extends T> fa0 = this.X;
            C6562gT0.m(fa0);
            this.Y = fa0.invoke();
            this.X = null;
        }
        return (T) this.Y;
    }

    @Override // o.EY0
    public boolean isInitialized() {
        if (this.Y != Bx2.a) {
            return true;
        }
        return false;
    }

    @NotNull
    public String toString() {
        if (isInitialized()) {
            return String.valueOf(getValue());
        }
        return "Lazy value not initialized yet.";
    }
}
