package o;

import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public class XY0 extends WY0 {
    @XP0
    public static final <T> T d(EY0<? extends T> ey0, Object obj, TW0<?> tw0) {
        C6562gT0.p(ey0, "<this>");
        C6562gT0.p(tw0, "property");
        return ey0.getValue();
    }

    @NotNull
    public static final <T> EY0<T> e(T t) {
        return new KP0(t);
    }
}
