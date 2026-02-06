package o;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: o.hf2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C6849hf2 {
    @NotNull
    public static final <T extends Appendable> T a(@NotNull T t, @NotNull CharSequence... charSequenceArr) {
        C6562gT0.p(t, "<this>");
        C6562gT0.p(charSequenceArr, "value");
        for (CharSequence charSequence : charSequenceArr) {
            t.append(charSequence);
        }
        return t;
    }

    public static <T> void b(@NotNull Appendable appendable, T t, @Nullable HA0<? super T, ? extends CharSequence> ha0) {
        boolean z;
        C6562gT0.p(appendable, "<this>");
        if (ha0 != null) {
            appendable.append(ha0.invoke(t));
            return;
        }
        if (t == null) {
            z = true;
        } else {
            z = t instanceof CharSequence;
        }
        if (z) {
            appendable.append((CharSequence) t);
        } else if (t instanceof Character) {
            appendable.append(((Character) t).charValue());
        } else {
            appendable.append(t.toString());
        }
    }

    @XP0
    @InterfaceC6480g82(version = "1.4")
    public static final Appendable c(Appendable appendable) {
        C6562gT0.p(appendable, "<this>");
        return appendable.append('\n');
    }

    @XP0
    @InterfaceC6480g82(version = "1.4")
    public static final Appendable d(Appendable appendable, char c) {
        C6562gT0.p(appendable, "<this>");
        return appendable.append(c).append('\n');
    }

    @XP0
    @InterfaceC6480g82(version = "1.4")
    public static final Appendable e(Appendable appendable, CharSequence charSequence) {
        C6562gT0.p(appendable, "<this>");
        return appendable.append(charSequence).append('\n');
    }

    @InterfaceC6480g82(version = "1.4")
    @NotNull
    public static final <T extends Appendable> T f(@NotNull T t, @NotNull CharSequence charSequence, int i, int i2) {
        C6562gT0.p(t, "<this>");
        C6562gT0.p(charSequence, "value");
        T t2 = (T) t.append(charSequence, i, i2);
        C6562gT0.n(t2, "null cannot be cast to non-null type T of kotlin.text.StringsKt__AppendableKt.appendRange");
        return t2;
    }
}
