package okhttp3.internal.http;

import o.C6562gT0;
import o.InterfaceC2677Cq;
import okhttp3.MediaType;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes4.dex */
public final class RealResponseBody extends ResponseBody {
    private final long contentLength;
    @Nullable
    private final String contentTypeString;
    @NotNull
    private final InterfaceC2677Cq source;

    public RealResponseBody(@Nullable String str, long j, @NotNull InterfaceC2677Cq interfaceC2677Cq) {
        C6562gT0.p(interfaceC2677Cq, "source");
        this.contentTypeString = str;
        this.contentLength = j;
        this.source = interfaceC2677Cq;
    }

    @Override // okhttp3.ResponseBody
    public long contentLength() {
        return this.contentLength;
    }

    @Override // okhttp3.ResponseBody
    @Nullable
    public MediaType contentType() {
        String str = this.contentTypeString;
        if (str != null) {
            return MediaType.Companion.parse(str);
        }
        return null;
    }

    @Override // okhttp3.ResponseBody
    @NotNull
    public InterfaceC2677Cq source() {
        return this.source;
    }
}
