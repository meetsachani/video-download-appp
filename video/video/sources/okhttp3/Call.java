package okhttp3;

import java.io.IOException;
import o.C8120mp2;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public interface Call extends Cloneable {

    /* loaded from: classes4.dex */
    public interface Factory {
        @NotNull
        Call newCall(@NotNull Request request);
    }

    void cancel();

    @NotNull
    Call clone();

    void enqueue(@NotNull Callback callback);

    @NotNull
    Response execute() throws IOException;

    boolean isCanceled();

    boolean isExecuted();

    @NotNull
    Request request();

    @NotNull
    C8120mp2 timeout();
}
