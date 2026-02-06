package org.jsoup.helper;

import java.net.Authenticator;
import java.net.PasswordAuthentication;
import java.net.URL;

@FunctionalInterface
/* loaded from: classes4.dex */
public interface RequestAuthenticator {

    /* loaded from: classes4.dex */
    public static class Context {
        public final URL a;
        public final Authenticator.RequestorType b;
        public final String c;

        public Context(URL url, Authenticator.RequestorType requestorType, String str) {
            this.a = url;
            this.b = requestorType;
            this.c = str;
        }

        public PasswordAuthentication a(String str, String str2) {
            return new PasswordAuthentication(str, str2.toCharArray());
        }

        public boolean b() {
            if (this.b == Authenticator.RequestorType.PROXY) {
                return true;
            }
            return false;
        }

        public boolean c() {
            if (this.b == Authenticator.RequestorType.SERVER) {
                return true;
            }
            return false;
        }

        public String d() {
            return this.c;
        }

        public Authenticator.RequestorType e() {
            return this.b;
        }

        public URL f() {
            return this.a;
        }
    }

    PasswordAuthentication a(Context context);
}
