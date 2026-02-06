package okhttp3;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import o.C3167Hn0;
import o.C4317Th1;
import o.C6562gT0;
import o.C8859ps;
import o.InterfaceC8289nW0;
import o.InterfaceC9511sW0;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final class Credentials {
    @NotNull
    public static final Credentials INSTANCE = new Credentials();

    private Credentials() {
    }

    @InterfaceC9511sW0
    @InterfaceC8289nW0
    @NotNull
    public static final String basic(@NotNull String str, @NotNull String str2) {
        C6562gT0.p(str, "username");
        C6562gT0.p(str2, C3167Hn0.c);
        return basic$default(str, str2, null, 4, null);
    }

    public static /* synthetic */ String basic$default(String str, String str2, Charset charset, int i, Object obj) {
        if ((i & 4) != 0) {
            charset = StandardCharsets.ISO_8859_1;
            C6562gT0.o(charset, "ISO_8859_1");
        }
        return basic(str, str2, charset);
    }

    @InterfaceC9511sW0
    @InterfaceC8289nW0
    @NotNull
    public static final String basic(@NotNull String str, @NotNull String str2, @NotNull Charset charset) {
        C6562gT0.p(str, "username");
        C6562gT0.p(str2, C3167Hn0.c);
        C6562gT0.p(charset, C4317Th1.g);
        String i = C8859ps.Y0.j(str + ':' + str2, charset).i();
        return "Basic " + i;
    }
}
