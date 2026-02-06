package o;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@InterfaceC8046mW0(name = "KClasses")
@InterfaceC8303na2({"SMAP\nKClasses.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KClasses.kt\nkotlin/reflect/KClasses\n+ 2 KClassesImpl.kt\nkotlin/reflect/KClassesImplKt\n*L\n1#1,46:1\n9#2:47\n*S KotlinDebug\n*F\n+ 1 KClasses.kt\nkotlin/reflect/KClasses\n*L\n25#1:47\n*E\n"})
/* loaded from: classes3.dex */
public final class BW0 {
    /* JADX WARN: Multi-variable type inference failed */
    @R61
    @InterfaceC6480g82(version = "1.4")
    @NotNull
    public static final <T> T a(@NotNull AW0<T> aw0, @Nullable Object obj) {
        C6562gT0.p(aw0, "<this>");
        if (aw0.F(obj)) {
            C6562gT0.n(obj, "null cannot be cast to non-null type T of kotlin.reflect.KClasses.cast");
            return obj;
        }
        throw new ClassCastException("Value cannot be cast to " + aw0.I());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @R61
    @InterfaceC6480g82(version = "1.4")
    @Nullable
    public static final <T> T b(@NotNull AW0<T> aw0, @Nullable Object obj) {
        C6562gT0.p(aw0, "<this>");
        if (aw0.F(obj)) {
            C6562gT0.n(obj, "null cannot be cast to non-null type T of kotlin.reflect.KClasses.safeCast");
            return obj;
        }
        return null;
    }
}
