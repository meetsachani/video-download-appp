package o;

import org.jetbrains.annotations.NotNull;

@InterfaceC9150r20(message = "changed in Okio 2.x")
/* renamed from: o.g  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6432g {
    @NotNull
    public static final C6432g a = new C6432g();

    @InterfaceC9150r20(level = EnumC9879u20.Y, message = "moved to extension function", replaceWith = @IR1(expression = "string.utf8Size()", imports = {"okio.utf8Size"}))
    public final long a(@NotNull String str) {
        C6562gT0.p(str, "string");
        return ED2.l(str, 0, 0, 3, null);
    }

    @InterfaceC9150r20(level = EnumC9879u20.Y, message = "moved to extension function", replaceWith = @IR1(expression = "string.utf8Size(beginIndex, endIndex)", imports = {"okio.utf8Size"}))
    public final long b(@NotNull String str, int i, int i2) {
        C6562gT0.p(str, "string");
        return ED2.k(str, i, i2);
    }
}
