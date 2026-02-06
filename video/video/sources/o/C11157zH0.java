package o;

import o.C10914yH0;

@InterfaceC8303na2({"SMAP\nHexFormat.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HexFormat.kt\nkotlin/text/HexFormatKt\n+ 2 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n*L\n1#1,844:1\n1088#2,2:845\n*S KotlinDebug\n*F\n+ 1 HexFormat.kt\nkotlin/text/HexFormatKt\n*L\n843#1:845,2\n*E\n"})
/* renamed from: o.zH0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C11157zH0 {
    @XP0
    @InterfaceC4912Zi0
    @InterfaceC6480g82(version = "1.9")
    public static final C10914yH0 a(HA0<? super C10914yH0.a, C7458kA2> ha0) {
        C6562gT0.p(ha0, "builderAction");
        C10914yH0.a aVar = new C10914yH0.a();
        ha0.invoke(aVar);
        return aVar.a();
    }

    public static final boolean c(String str) {
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (C6562gT0.t(charAt, 128) >= 0 || Character.isLetter(charAt)) {
                return true;
            }
        }
        return false;
    }
}
