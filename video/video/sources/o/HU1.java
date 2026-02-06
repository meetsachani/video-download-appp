package o;

import java.util.Comparator;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class HU1<T> implements Comparator<T> {
    @NotNull
    public final Comparator<T> X;

    public HU1(@NotNull Comparator<T> comparator) {
        C6562gT0.p(comparator, "comparator");
        this.X = comparator;
    }

    @NotNull
    public final Comparator<T> a() {
        return this.X;
    }

    @Override // java.util.Comparator
    public int compare(T t, T t2) {
        return this.X.compare(t2, t);
    }

    @Override // java.util.Comparator
    @NotNull
    public final Comparator<T> reversed() {
        return this.X;
    }
}
