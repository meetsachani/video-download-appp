package o;

import java.util.List;
import org.jetbrains.annotations.NotNull;

/* renamed from: o.tF  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C9687tF extends C9444sF {
    @NotNull
    public static final <T> List<T> a1(@NotNull List<? extends T> list) {
        C6562gT0.p(list, "<this>");
        return new KU1(list);
    }

    @InterfaceC8046mW0(name = "asReversedMutable")
    @NotNull
    public static final <T> List<T> b1(@NotNull List<T> list) {
        C6562gT0.p(list, "<this>");
        return new JU1(list);
    }

    public static final int c1(List<?> list, int i) {
        if (i >= 0 && i <= C8222nF.J(list)) {
            return C8222nF.J(list) - i;
        }
        throw new IndexOutOfBoundsException("Element index " + i + " must be in range [" + new C11197zR0(0, C8222nF.J(list)) + "].");
    }

    public static final int d1(List<?> list, int i) {
        return C8222nF.J(list) - i;
    }

    public static final int e1(List<?> list, int i) {
        if (i >= 0 && i <= list.size()) {
            return list.size() - i;
        }
        throw new IndexOutOfBoundsException("Position index " + i + " must be in range [" + new C11197zR0(0, list.size()) + "].");
    }
}
