package o;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@InterfaceC8046mW0(name = "RegexExtensionsJDK8Kt")
/* renamed from: o.yQ1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C10951yQ1 {
    @InterfaceC6480g82(version = "1.2")
    @Nullable
    public static final M81 a(@NotNull N81 n81, @NotNull String str) {
        O81 o81;
        C6562gT0.p(n81, "<this>");
        C6562gT0.p(str, "name");
        if (n81 instanceof O81) {
            o81 = (O81) n81;
        } else {
            o81 = null;
        }
        if (o81 != null) {
            return o81.m(str);
        }
        throw new UnsupportedOperationException("Retrieving groups by name is not supported on this platform.");
    }
}
