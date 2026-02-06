package okhttp3;

import java.io.IOException;
import o.C6562gT0;
import o.InterfaceC7058iW0;
import okhttp3.internal.authenticator.JavaNetAuthenticator;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes4.dex */
public interface Authenticator {
    @NotNull
    public static final Companion Companion = Companion.$$INSTANCE;
    @InterfaceC7058iW0
    @NotNull
    public static final Authenticator NONE = new Companion.AuthenticatorNone();
    @InterfaceC7058iW0
    @NotNull
    public static final Authenticator JAVA_NET_AUTHENTICATOR = new JavaNetAuthenticator(null, 1, null);

    /* loaded from: classes4.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        /* loaded from: classes4.dex */
        public static final class AuthenticatorNone implements Authenticator {
            @Override // okhttp3.Authenticator
            @Nullable
            public Request authenticate(@Nullable Route route, @NotNull Response response) {
                C6562gT0.p(response, "response");
                return null;
            }
        }

        private Companion() {
        }
    }

    @Nullable
    Request authenticate(@Nullable Route route, @NotNull Response response) throws IOException;
}
