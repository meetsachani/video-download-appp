package okhttp3.internal.http;

import java.io.IOException;
import java.net.ProtocolException;
import o.C6562gT0;
import o.C9516sY;
import o.C9545sf2;
import o.InterfaceC7058iW0;
import okhttp3.Protocol;
import okhttp3.Response;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final class StatusLine {
    @NotNull
    public static final Companion Companion = new Companion(null);
    public static final int HTTP_CONTINUE = 100;
    public static final int HTTP_MISDIRECTED_REQUEST = 421;
    public static final int HTTP_PERM_REDIRECT = 308;
    public static final int HTTP_TEMP_REDIRECT = 307;
    @InterfaceC7058iW0
    public final int code;
    @InterfaceC7058iW0
    @NotNull
    public final String message;
    @InterfaceC7058iW0
    @NotNull
    public final Protocol protocol;

    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(C9516sY c9516sY) {
            this();
        }

        @NotNull
        public final StatusLine get(@NotNull Response response) {
            C6562gT0.p(response, "response");
            return new StatusLine(response.protocol(), response.code(), response.message());
        }

        @NotNull
        public final StatusLine parse(@NotNull String str) throws IOException {
            Protocol protocol;
            int i;
            String str2;
            C6562gT0.p(str, "statusLine");
            if (C9545sf2.J2(str, "HTTP/1.", false, 2, null)) {
                i = 9;
                if (str.length() >= 9 && str.charAt(8) == ' ') {
                    int charAt = str.charAt(7) - '0';
                    if (charAt != 0) {
                        if (charAt == 1) {
                            protocol = Protocol.HTTP_1_1;
                        } else {
                            throw new ProtocolException("Unexpected status line: " + str);
                        }
                    } else {
                        protocol = Protocol.HTTP_1_0;
                    }
                } else {
                    throw new ProtocolException("Unexpected status line: " + str);
                }
            } else if (C9545sf2.J2(str, "ICY ", false, 2, null)) {
                protocol = Protocol.HTTP_1_0;
                i = 4;
            } else {
                throw new ProtocolException("Unexpected status line: " + str);
            }
            int i2 = i + 3;
            if (str.length() >= i2) {
                try {
                    String substring = str.substring(i, i2);
                    C6562gT0.o(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                    int parseInt = Integer.parseInt(substring);
                    if (str.length() > i2) {
                        if (str.charAt(i2) == ' ') {
                            str2 = str.substring(i + 4);
                            C6562gT0.o(str2, "this as java.lang.String).substring(startIndex)");
                        } else {
                            throw new ProtocolException("Unexpected status line: " + str);
                        }
                    } else {
                        str2 = "";
                    }
                    return new StatusLine(protocol, parseInt, str2);
                } catch (NumberFormatException unused) {
                    throw new ProtocolException("Unexpected status line: " + str);
                }
            }
            throw new ProtocolException("Unexpected status line: " + str);
        }

        private Companion() {
        }
    }

    public StatusLine(@NotNull Protocol protocol, int i, @NotNull String str) {
        C6562gT0.p(protocol, "protocol");
        C6562gT0.p(str, "message");
        this.protocol = protocol;
        this.code = i;
        this.message = str;
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.protocol == Protocol.HTTP_1_0) {
            sb.append("HTTP/1.0");
        } else {
            sb.append("HTTP/1.1");
        }
        sb.append(' ');
        sb.append(this.code);
        sb.append(' ');
        sb.append(this.message);
        String sb2 = sb.toString();
        C6562gT0.o(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }
}
