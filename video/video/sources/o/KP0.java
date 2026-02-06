package o;

import java.io.Serializable;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class KP0<T> implements EY0<T>, Serializable {
    public final T X;

    public KP0(T t) {
        this.X = t;
    }

    @Override // o.EY0
    public T getValue() {
        return this.X;
    }

    @Override // o.EY0
    public boolean isInitialized() {
        return true;
    }

    @NotNull
    public String toString() {
        return String.valueOf(getValue());
    }
}
