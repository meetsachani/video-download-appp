package okhttp3;

import java.util.List;
import o.C6562gT0;
import o.C8222nF;
import o.InterfaceC7058iW0;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public interface CookieJar {
    @NotNull
    public static final Companion Companion = Companion.$$INSTANCE;
    @InterfaceC7058iW0
    @NotNull
    public static final CookieJar NO_COOKIES = new Companion.NoCookies();

    /* loaded from: classes4.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        /* loaded from: classes4.dex */
        public static final class NoCookies implements CookieJar {
            @Override // okhttp3.CookieJar
            @NotNull
            public List<Cookie> loadForRequest(@NotNull HttpUrl httpUrl) {
                C6562gT0.p(httpUrl, "url");
                return C8222nF.H();
            }

            @Override // okhttp3.CookieJar
            public void saveFromResponse(@NotNull HttpUrl httpUrl, @NotNull List<Cookie> list) {
                C6562gT0.p(httpUrl, "url");
                C6562gT0.p(list, "cookies");
            }
        }

        private Companion() {
        }
    }

    @NotNull
    List<Cookie> loadForRequest(@NotNull HttpUrl httpUrl);

    void saveFromResponse(@NotNull HttpUrl httpUrl, @NotNull List<Cookie> list);
}
