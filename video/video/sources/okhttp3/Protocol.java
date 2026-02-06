package okhttp3;

import java.io.IOException;
import o.C6562gT0;
import o.C9516sY;
import o.InterfaceC9511sW0;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public enum Protocol {
    HTTP_1_0("http/1.0"),
    HTTP_1_1("http/1.1"),
    SPDY_3("spdy/3.1"),
    HTTP_2("h2"),
    H2_PRIOR_KNOWLEDGE("h2_prior_knowledge"),
    QUIC("quic");
    
    @NotNull
    public static final Companion Companion = new Companion(null);
    @NotNull
    private final String protocol;

    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(C9516sY c9516sY) {
            this();
        }

        @InterfaceC9511sW0
        @NotNull
        public final Protocol get(@NotNull String str) throws IOException {
            C6562gT0.p(str, "protocol");
            Protocol protocol = Protocol.HTTP_1_0;
            if (C6562gT0.g(str, protocol.protocol)) {
                return protocol;
            }
            Protocol protocol2 = Protocol.HTTP_1_1;
            if (C6562gT0.g(str, protocol2.protocol)) {
                return protocol2;
            }
            Protocol protocol3 = Protocol.H2_PRIOR_KNOWLEDGE;
            if (C6562gT0.g(str, protocol3.protocol)) {
                return protocol3;
            }
            Protocol protocol4 = Protocol.HTTP_2;
            if (C6562gT0.g(str, protocol4.protocol)) {
                return protocol4;
            }
            Protocol protocol5 = Protocol.SPDY_3;
            if (C6562gT0.g(str, protocol5.protocol)) {
                return protocol5;
            }
            Protocol protocol6 = Protocol.QUIC;
            if (C6562gT0.g(str, protocol6.protocol)) {
                return protocol6;
            }
            throw new IOException("Unexpected protocol: " + str);
        }

        private Companion() {
        }
    }

    Protocol(String str) {
        this.protocol = str;
    }

    @InterfaceC9511sW0
    @NotNull
    public static final Protocol get(@NotNull String str) throws IOException {
        return Companion.get(str);
    }

    @Override // java.lang.Enum
    @NotNull
    public String toString() {
        return this.protocol;
    }
}
