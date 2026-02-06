package okhttp3.internal.cache;

import java.io.IOException;
import o.J82;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public interface CacheRequest {
    void abort();

    @NotNull
    J82 body() throws IOException;
}
