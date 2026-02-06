package o;

import java.nio.charset.Charset;

@InterfaceC8046mW0(name = "CharsetsKt")
/* loaded from: classes3.dex */
public final class LB {
    @XP0
    public static final Charset a(String str) {
        C6562gT0.p(str, "charsetName");
        Charset forName = Charset.forName(str);
        C6562gT0.o(forName, "forName(...)");
        return forName;
    }
}
