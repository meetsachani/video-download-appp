package o;

import java.util.Comparator;
import org.jetbrains.annotations.NotNull;

/* renamed from: o.Bo1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2573Bo1 implements Comparator<Comparable<? super Object>> {
    @NotNull
    public static final C2573Bo1 X = new C2573Bo1();

    @Override // java.util.Comparator
    /* renamed from: a */
    public int compare(@NotNull Comparable<Object> comparable, @NotNull Comparable<Object> comparable2) {
        C6562gT0.p(comparable, "a");
        C6562gT0.p(comparable2, "b");
        return comparable.compareTo(comparable2);
    }

    @Override // java.util.Comparator
    @NotNull
    public final Comparator<Comparable<? super Object>> reversed() {
        return FU1.X;
    }
}
