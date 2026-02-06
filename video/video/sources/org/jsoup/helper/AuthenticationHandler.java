package org.jsoup.helper;

import java.net.Authenticator;
import java.net.PasswordAuthentication;
import org.jsoup.helper.RequestAuthenticator;

/* loaded from: classes4.dex */
class AuthenticationHandler extends Authenticator {
    public static final int c = 3;
    public static AuthShim d;
    public RequestAuthenticator a;
    public int b = 0;

    /* loaded from: classes4.dex */
    public interface AuthShim {
        void a(RequestAuthenticator requestAuthenticator, Object obj);

        AuthenticationHandler b(AuthenticationHandler authenticationHandler);

        void remove();
    }

    /* loaded from: classes4.dex */
    public static class GlobalHandler implements AuthShim {
        public static ThreadLocal<AuthenticationHandler> a = new ThreadLocal<>();

        static {
            Authenticator.setDefault(new AuthenticationHandler());
        }

        @Override // org.jsoup.helper.AuthenticationHandler.AuthShim
        public void a(RequestAuthenticator requestAuthenticator, Object obj) {
            a.set(new AuthenticationHandler(requestAuthenticator));
        }

        @Override // org.jsoup.helper.AuthenticationHandler.AuthShim
        public AuthenticationHandler b(AuthenticationHandler authenticationHandler) {
            return a.get();
        }

        @Override // org.jsoup.helper.AuthenticationHandler.AuthShim
        public void remove() {
            a.remove();
        }
    }

    static {
        try {
            d = (AuthShim) Class.forName("org.jsoup.helper.RequestAuthHandler").getConstructor(null).newInstance(null);
        } catch (ClassNotFoundException unused) {
            d = new GlobalHandler();
        } catch (Exception e) {
            throw new IllegalStateException(e);
        }
    }

    public AuthenticationHandler() {
    }

    @Override // java.net.Authenticator
    public final PasswordAuthentication getPasswordAuthentication() {
        AuthenticationHandler b = d.b(this);
        if (b == null) {
            return null;
        }
        int i = b.b + 1;
        b.b = i;
        if (i > 3 || b.a == null) {
            return null;
        }
        return b.a.a(new RequestAuthenticator.Context(getRequestingURL(), getRequestorType(), getRequestingPrompt()));
    }

    public AuthenticationHandler(RequestAuthenticator requestAuthenticator) {
        this.a = requestAuthenticator;
    }
}
