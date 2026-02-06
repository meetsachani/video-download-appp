package o;

import java.util.Comparator;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class FU1 implements Comparator<Comparable<? super Object>> {
    @NotNull
    public static final FU1 X = new FU1();

    @Override // java.util.Comparator
    /* renamed from: a */
    public int compare(@NotNull Comparable<Object> comparable, @NotNull Comparable<Object> comparable2) {
        C6562gT0.p(comparable, "a");
        C6562gT0.p(comparable2, "b");
        return comparable2.compareTo(comparable);
    }

    @Override // java.util.Comparator
    @NotNull
    public final Comparator<Comparable<? super Object>> reversed() {
        return C2573Bo1.X;
    }
}
