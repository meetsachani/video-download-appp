package o;

import java.util.Comparator;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public class BH extends AH {
    @InterfaceC6480g82(version = "1.4")
    public static final <T> T A0(T t, @NotNull T[] tArr, @NotNull Comparator<? super T> comparator) {
        C6562gT0.p(tArr, "other");
        C6562gT0.p(comparator, "comparator");
        for (T t2 : tArr) {
            if (comparator.compare(t, t2) < 0) {
                t = t2;
            }
        }
        return t;
    }

    @InterfaceC6480g82(version = "1.1")
    public static final <T> T B0(T t, T t2, T t3, @NotNull Comparator<? super T> comparator) {
        C6562gT0.p(comparator, "comparator");
        return (T) C0(t, C0(t2, t3, comparator), comparator);
    }

    @InterfaceC6480g82(version = "1.1")
    public static final <T> T C0(T t, T t2, @NotNull Comparator<? super T> comparator) {
        C6562gT0.p(comparator, "comparator");
        if (comparator.compare(t, t2) <= 0) {
            return t;
        }
        return t2;
    }

    @InterfaceC6480g82(version = "1.4")
    public static final <T> T D0(T t, @NotNull T[] tArr, @NotNull Comparator<? super T> comparator) {
        C6562gT0.p(tArr, "other");
        C6562gT0.p(comparator, "comparator");
        for (T t2 : tArr) {
            if (comparator.compare(t, t2) > 0) {
                t = t2;
            }
        }
        return t;
    }

    @InterfaceC6480g82(version = "1.1")
    public static final <T> T y0(T t, T t2, T t3, @NotNull Comparator<? super T> comparator) {
        C6562gT0.p(comparator, "comparator");
        return (T) z0(t, z0(t2, t3, comparator), comparator);
    }

    @InterfaceC6480g82(version = "1.1")
    public static final <T> T z0(T t, T t2, @NotNull Comparator<? super T> comparator) {
        C6562gT0.p(comparator, "comparator");
        if (comparator.compare(t, t2) >= 0) {
            return t;
        }
        return t2;
    }
}
