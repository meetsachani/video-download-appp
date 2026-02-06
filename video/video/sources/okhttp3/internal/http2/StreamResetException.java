package okhttp3.internal.http2;

import java.io.IOException;
import o.C6562gT0;
import o.InterfaceC7058iW0;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final class StreamResetException extends IOException {
    @InterfaceC7058iW0
    @NotNull
    public final ErrorCode errorCode;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StreamResetException(@NotNull ErrorCode errorCode) {
        super("stream was reset: " + errorCode);
        C6562gT0.p(errorCode, "errorCode");
        this.errorCode = errorCode;
    }
}
