package okhttp3.internal.ws;

import java.io.IOException;
import o.C10928yK2;
import o.C6562gT0;
import o.C9516sY;
import o.C9545sf2;
import o.InterfaceC7058iW0;
import okhttp3.Headers;
import okhttp3.internal.Util;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes4.dex */
public final class WebSocketExtensions {
    @NotNull
    public static final Companion Companion = new Companion(null);
    @NotNull
    private static final String HEADER_WEB_SOCKET_EXTENSION = "Sec-WebSocket-Extensions";
    @InterfaceC7058iW0
    @Nullable
    public final Integer clientMaxWindowBits;
    @InterfaceC7058iW0
    public final boolean clientNoContextTakeover;
    @InterfaceC7058iW0
    public final boolean perMessageDeflate;
    @InterfaceC7058iW0
    @Nullable
    public final Integer serverMaxWindowBits;
    @InterfaceC7058iW0
    public final boolean serverNoContextTakeover;
    @InterfaceC7058iW0
    public final boolean unknownValues;

    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(C9516sY c9516sY) {
            this();
        }

        /* JADX WARN: Code restructure failed: missing block: B:12:0x0051, code lost:
            if (r6 != false) goto L16;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x0054, code lost:
            if (r2 >= r5) goto L67;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x0056, code lost:
            r3 = okhttp3.internal.Util.delimiterOffset(r14, (char) o.C10928yK2.l, r2, r5);
            r6 = okhttp3.internal.Util.delimiterOffset(r14, '=', r2, r3);
            r2 = okhttp3.internal.Util.trimSubstring(r14, r2, r6);
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0064, code lost:
            if (r6 >= r3) goto L66;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x0066, code lost:
            r6 = o.C10763xf2.G4(okhttp3.internal.Util.trimSubstring(r14, r6 + 1, r3), o.AbstractC4253Sp2.b.x1);
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x0073, code lost:
            r6 = null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x0074, code lost:
            r3 = r3 + 1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x007c, code lost:
            if (o.C9545sf2.c2(r2, "client_max_window_bits", true) == false) goto L24;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x007e, code lost:
            if (r7 == null) goto L61;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x0080, code lost:
            r11 = true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x0081, code lost:
            if (r6 == null) goto L65;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x0083, code lost:
            r7 = o.C9302rf2.p1(r6);
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x0089, code lost:
            r7 = null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x008a, code lost:
            if (r7 != null) goto L54;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x008c, code lost:
            r2 = r3;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x008d, code lost:
            r11 = true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x008f, code lost:
            r2 = r3;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x0097, code lost:
            if (o.C9545sf2.c2(r2, "client_no_context_takeover", true) == false) goto L34;
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x0099, code lost:
            if (r8 == false) goto L29;
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x009b, code lost:
            r11 = true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x009c, code lost:
            if (r6 == null) goto L31;
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x009e, code lost:
            r11 = true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:36:0x009f, code lost:
            r2 = r3;
            r8 = true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:38:0x00a8, code lost:
            if (o.C9545sf2.c2(r2, "server_max_window_bits", true) == false) goto L37;
         */
        /* JADX WARN: Code restructure failed: missing block: B:39:0x00aa, code lost:
            if (r9 == null) goto L51;
         */
        /* JADX WARN: Code restructure failed: missing block: B:40:0x00ac, code lost:
            r11 = true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:41:0x00ad, code lost:
            if (r6 == null) goto L57;
         */
        /* JADX WARN: Code restructure failed: missing block: B:42:0x00af, code lost:
            r9 = o.C9302rf2.p1(r6);
         */
        /* JADX WARN: Code restructure failed: missing block: B:43:0x00b5, code lost:
            r9 = null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:44:0x00b6, code lost:
            if (r9 != null) goto L54;
         */
        /* JADX WARN: Code restructure failed: missing block: B:47:0x00bf, code lost:
            if (o.C9545sf2.c2(r2, "server_no_context_takeover", true) == false) goto L46;
         */
        /* JADX WARN: Code restructure failed: missing block: B:48:0x00c1, code lost:
            if (r10 == false) goto L42;
         */
        /* JADX WARN: Code restructure failed: missing block: B:49:0x00c3, code lost:
            r11 = true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:50:0x00c4, code lost:
            if (r6 == null) goto L44;
         */
        /* JADX WARN: Code restructure failed: missing block: B:51:0x00c6, code lost:
            r11 = true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:52:0x00c7, code lost:
            r2 = r3;
            r10 = true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:53:0x00ca, code lost:
            r5 = r2;
            r6 = true;
         */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x008d -> B:14:0x0054). Please submit an issue!!! */
        @NotNull
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final WebSocketExtensions parse(@NotNull Headers headers) throws IOException {
            C6562gT0.p(headers, "responseHeaders");
            int size = headers.size();
            boolean z = false;
            Integer num = null;
            boolean z2 = false;
            Integer num2 = null;
            boolean z3 = false;
            boolean z4 = false;
            for (int i = 0; i < size; i++) {
                if (C9545sf2.c2(headers.name(i), "Sec-WebSocket-Extensions", true)) {
                    String value = headers.value(i);
                    int i2 = 0;
                    while (i2 < value.length()) {
                        int i3 = i2;
                        int delimiterOffset$default = Util.delimiterOffset$default(value, ',', i3, 0, 4, (Object) null);
                        int delimiterOffset = Util.delimiterOffset(value, (char) C10928yK2.l, i3, delimiterOffset$default);
                        String trimSubstring = Util.trimSubstring(value, i3, delimiterOffset);
                        int i4 = delimiterOffset + 1;
                        if (!C9545sf2.c2(trimSubstring, "permessage-deflate", true)) {
                            i2 = i4;
                            z4 = true;
                        }
                    }
                }
            }
            return new WebSocketExtensions(z, num, z2, num2, z3, z4);
        }

        private Companion() {
        }
    }

    public WebSocketExtensions() {
        this(false, null, false, null, false, false, 63, null);
    }

    public static /* synthetic */ WebSocketExtensions copy$default(WebSocketExtensions webSocketExtensions, boolean z, Integer num, boolean z2, Integer num2, boolean z3, boolean z4, int i, Object obj) {
        if ((i & 1) != 0) {
            z = webSocketExtensions.perMessageDeflate;
        }
        if ((i & 2) != 0) {
            num = webSocketExtensions.clientMaxWindowBits;
        }
        if ((i & 4) != 0) {
            z2 = webSocketExtensions.clientNoContextTakeover;
        }
        if ((i & 8) != 0) {
            num2 = webSocketExtensions.serverMaxWindowBits;
        }
        if ((i & 16) != 0) {
            z3 = webSocketExtensions.serverNoContextTakeover;
        }
        if ((i & 32) != 0) {
            z4 = webSocketExtensions.unknownValues;
        }
        boolean z5 = z3;
        boolean z6 = z4;
        return webSocketExtensions.copy(z, num, z2, num2, z5, z6);
    }

    public final boolean component1() {
        return this.perMessageDeflate;
    }

    @Nullable
    public final Integer component2() {
        return this.clientMaxWindowBits;
    }

    public final boolean component3() {
        return this.clientNoContextTakeover;
    }

    @Nullable
    public final Integer component4() {
        return this.serverMaxWindowBits;
    }

    public final boolean component5() {
        return this.serverNoContextTakeover;
    }

    public final boolean component6() {
        return this.unknownValues;
    }

    @NotNull
    public final WebSocketExtensions copy(boolean z, @Nullable Integer num, boolean z2, @Nullable Integer num2, boolean z3, boolean z4) {
        return new WebSocketExtensions(z, num, z2, num2, z3, z4);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof WebSocketExtensions) {
            WebSocketExtensions webSocketExtensions = (WebSocketExtensions) obj;
            return this.perMessageDeflate == webSocketExtensions.perMessageDeflate && C6562gT0.g(this.clientMaxWindowBits, webSocketExtensions.clientMaxWindowBits) && this.clientNoContextTakeover == webSocketExtensions.clientNoContextTakeover && C6562gT0.g(this.serverMaxWindowBits, webSocketExtensions.serverMaxWindowBits) && this.serverNoContextTakeover == webSocketExtensions.serverNoContextTakeover && this.unknownValues == webSocketExtensions.unknownValues;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r2v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v6, types: [boolean] */
    public int hashCode() {
        boolean z = this.perMessageDeflate;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        Integer num = this.clientMaxWindowBits;
        int hashCode = (i + (num == null ? 0 : num.hashCode())) * 31;
        ?? r2 = this.clientNoContextTakeover;
        int i2 = r2;
        if (r2 != 0) {
            i2 = 1;
        }
        int i3 = (hashCode + i2) * 31;
        Integer num2 = this.serverMaxWindowBits;
        int hashCode2 = (i3 + (num2 != null ? num2.hashCode() : 0)) * 31;
        ?? r22 = this.serverNoContextTakeover;
        int i4 = r22;
        if (r22 != 0) {
            i4 = 1;
        }
        int i5 = (hashCode2 + i4) * 31;
        boolean z2 = this.unknownValues;
        return i5 + (z2 ? 1 : z2 ? 1 : 0);
    }

    public final boolean noContextTakeover(boolean z) {
        if (z) {
            return this.clientNoContextTakeover;
        }
        return this.serverNoContextTakeover;
    }

    @NotNull
    public String toString() {
        return "WebSocketExtensions(perMessageDeflate=" + this.perMessageDeflate + ", clientMaxWindowBits=" + this.clientMaxWindowBits + ", clientNoContextTakeover=" + this.clientNoContextTakeover + ", serverMaxWindowBits=" + this.serverMaxWindowBits + ", serverNoContextTakeover=" + this.serverNoContextTakeover + ", unknownValues=" + this.unknownValues + ')';
    }

    public WebSocketExtensions(boolean z, @Nullable Integer num, boolean z2, @Nullable Integer num2, boolean z3, boolean z4) {
        this.perMessageDeflate = z;
        this.clientMaxWindowBits = num;
        this.clientNoContextTakeover = z2;
        this.serverMaxWindowBits = num2;
        this.serverNoContextTakeover = z3;
        this.unknownValues = z4;
    }

    public /* synthetic */ WebSocketExtensions(boolean z, Integer num, boolean z2, Integer num2, boolean z3, boolean z4, int i, C9516sY c9516sY) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? null : num, (i & 4) != 0 ? false : z2, (i & 8) != 0 ? null : num2, (i & 16) != 0 ? false : z3, (i & 32) != 0 ? false : z4);
    }
}
