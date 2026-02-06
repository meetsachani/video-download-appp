package o;

import o.PT1;
import org.jetbrains.annotations.NotNull;

@InterfaceC8303na2({"SMAP\nDebugStrings.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DebugStrings.kt\nkotlinx/coroutines/DebugStringsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,18:1\n1#2:19\n*E\n"})
/* loaded from: classes3.dex */
public final class NV {
    @NotNull
    public static final String a(@NotNull Object obj) {
        return obj.getClass().getSimpleName();
    }

    @NotNull
    public static final String b(@NotNull Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    @NotNull
    public static final String c(@NotNull HM<?> hm) {
        String b;
        if (hm instanceof C7189j40) {
            return ((C7189j40) hm).toString();
        }
        try {
            PT1.a aVar = PT1.Y;
            b = PT1.b(hm + C11304zt1.a + b(hm));
        } catch (Throwable th) {
            PT1.a aVar2 = PT1.Y;
            b = PT1.b(RT1.a(th));
        }
        if (PT1.e(b) != null) {
            b = hm.getClass().getName() + C11304zt1.a + b(hm);
        }
        return (String) b;
    }
}
