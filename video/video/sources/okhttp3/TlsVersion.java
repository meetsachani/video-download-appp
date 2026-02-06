package okhttp3;

import o.C6562gT0;
import o.C9516sY;
import o.EnumC9879u20;
import o.IR1;
import o.InterfaceC8046mW0;
import o.InterfaceC9150r20;
import o.InterfaceC9511sW0;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public enum TlsVersion {
    TLS_1_3("TLSv1.3"),
    TLS_1_2("TLSv1.2"),
    TLS_1_1("TLSv1.1"),
    TLS_1_0("TLSv1"),
    SSL_3_0("SSLv3");
    
    @NotNull
    public static final Companion Companion = new Companion(null);
    @NotNull
    private final String javaName;

    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(C9516sY c9516sY) {
            this();
        }

        @InterfaceC9511sW0
        @NotNull
        public final TlsVersion forJavaName(@NotNull String str) {
            C6562gT0.p(str, "javaName");
            int hashCode = str.hashCode();
            if (hashCode != 79201641) {
                if (hashCode != 79923350) {
                    switch (hashCode) {
                        case -503070503:
                            if (str.equals("TLSv1.1")) {
                                return TlsVersion.TLS_1_1;
                            }
                            break;
                        case -503070502:
                            if (str.equals("TLSv1.2")) {
                                return TlsVersion.TLS_1_2;
                            }
                            break;
                        case -503070501:
                            if (str.equals("TLSv1.3")) {
                                return TlsVersion.TLS_1_3;
                            }
                            break;
                    }
                } else if (str.equals("TLSv1")) {
                    return TlsVersion.TLS_1_0;
                }
            } else if (str.equals("SSLv3")) {
                return TlsVersion.SSL_3_0;
            }
            throw new IllegalArgumentException("Unexpected TLS version: " + str);
        }

        private Companion() {
        }
    }

    TlsVersion(String str) {
        this.javaName = str;
    }

    @InterfaceC9511sW0
    @NotNull
    public static final TlsVersion forJavaName(@NotNull String str) {
        return Companion.forJavaName(str);
    }

    @InterfaceC8046mW0(name = "-deprecated_javaName")
    @InterfaceC9150r20(level = EnumC9879u20.Y, message = "moved to val", replaceWith = @IR1(expression = "javaName", imports = {}))
    @NotNull
    /* renamed from: -deprecated_javaName  reason: not valid java name */
    public final String m151deprecated_javaName() {
        return this.javaName;
    }

    @InterfaceC8046mW0(name = "javaName")
    @NotNull
    public final String javaName() {
        return this.javaName;
    }
}
