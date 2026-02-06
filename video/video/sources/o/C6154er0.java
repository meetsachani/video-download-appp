package o;

import java.io.File;
import org.jetbrains.annotations.NotNull;

/* renamed from: o.er0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C6154er0 extends C5911dr0 {
    @NotNull
    public static final C4833Yp0 O(@NotNull File file, @NotNull EnumC4449Uq0 enumC4449Uq0) {
        C6562gT0.p(file, "<this>");
        C6562gT0.p(enumC4449Uq0, "direction");
        return new C4833Yp0(file, enumC4449Uq0);
    }

    public static /* synthetic */ C4833Yp0 P(File file, EnumC4449Uq0 enumC4449Uq0, int i, Object obj) {
        if ((i & 1) != 0) {
            enumC4449Uq0 = EnumC4449Uq0.X;
        }
        return O(file, enumC4449Uq0);
    }

    @NotNull
    public static final C4833Yp0 Q(@NotNull File file) {
        C6562gT0.p(file, "<this>");
        return O(file, EnumC4449Uq0.Y);
    }

    @NotNull
    public static final C4833Yp0 R(@NotNull File file) {
        C6562gT0.p(file, "<this>");
        return O(file, EnumC4449Uq0.X);
    }
}
