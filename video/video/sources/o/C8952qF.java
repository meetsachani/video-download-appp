package o;

import java.util.Iterator;
import org.jetbrains.annotations.NotNull;

/* renamed from: o.qF  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C8952qF extends C8709pF {
    public static final <T> void g0(@NotNull Iterator<? extends T> it, @NotNull HA0<? super T, C7458kA2> ha0) {
        C6562gT0.p(it, "<this>");
        C6562gT0.p(ha0, "operation");
        while (it.hasNext()) {
            ha0.invoke((T) it.next());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @XP0
    public static final <T> Iterator<T> h0(Iterator<? extends T> it) {
        C6562gT0.p(it, "<this>");
        return it;
    }

    @NotNull
    public static final <T> Iterator<C9485sP0<T>> i0(@NotNull Iterator<? extends T> it) {
        C6562gT0.p(it, "<this>");
        return new C9971uP0(it);
    }
}
