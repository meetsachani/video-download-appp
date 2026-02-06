package okhttp3.internal.http1;

import o.C6562gT0;
import o.C9516sY;
import o.InterfaceC2677Cq;
import okhttp3.Headers;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final class HeadersReader {
    @NotNull
    public static final Companion Companion = new Companion(null);
    private static final int HEADER_LIMIT = 262144;
    private long headerLimit;
    @NotNull
    private final InterfaceC2677Cq source;

    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(C9516sY c9516sY) {
            this();
        }

        private Companion() {
        }
    }

    public HeadersReader(@NotNull InterfaceC2677Cq interfaceC2677Cq) {
        C6562gT0.p(interfaceC2677Cq, "source");
        this.source = interfaceC2677Cq;
        this.headerLimit = 262144L;
    }

    @NotNull
    public final InterfaceC2677Cq getSource() {
        return this.source;
    }

    @NotNull
    public final Headers readHeaders() {
        Headers.Builder builder = new Headers.Builder();
        while (true) {
            String readLine = readLine();
            if (readLine.length() == 0) {
                return builder.build();
            }
            builder.addLenient$okhttp(readLine);
        }
    }

    @NotNull
    public final String readLine() {
        String p1 = this.source.p1(this.headerLimit);
        this.headerLimit -= p1.length();
        return p1;
    }
}
