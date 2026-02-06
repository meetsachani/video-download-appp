package okhttp3.internal.http2;

import java.io.IOException;
import java.util.List;
import o.C6562gT0;
import o.InterfaceC2677Cq;
import o.InterfaceC7058iW0;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public interface PushObserver {
    @NotNull
    public static final Companion Companion = Companion.$$INSTANCE;
    @InterfaceC7058iW0
    @NotNull
    public static final PushObserver CANCEL = new Companion.PushObserverCancel();

    /* loaded from: classes4.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        /* loaded from: classes4.dex */
        public static final class PushObserverCancel implements PushObserver {
            @Override // okhttp3.internal.http2.PushObserver
            public boolean onData(int i, @NotNull InterfaceC2677Cq interfaceC2677Cq, int i2, boolean z) throws IOException {
                C6562gT0.p(interfaceC2677Cq, "source");
                interfaceC2677Cq.skip(i2);
                return true;
            }

            @Override // okhttp3.internal.http2.PushObserver
            public boolean onHeaders(int i, @NotNull List<Header> list, boolean z) {
                C6562gT0.p(list, "responseHeaders");
                return true;
            }

            @Override // okhttp3.internal.http2.PushObserver
            public boolean onRequest(int i, @NotNull List<Header> list) {
                C6562gT0.p(list, "requestHeaders");
                return true;
            }

            @Override // okhttp3.internal.http2.PushObserver
            public void onReset(int i, @NotNull ErrorCode errorCode) {
                C6562gT0.p(errorCode, "errorCode");
            }
        }

        private Companion() {
        }
    }

    boolean onData(int i, @NotNull InterfaceC2677Cq interfaceC2677Cq, int i2, boolean z) throws IOException;

    boolean onHeaders(int i, @NotNull List<Header> list, boolean z);

    boolean onRequest(int i, @NotNull List<Header> list);

    void onReset(int i, @NotNull ErrorCode errorCode);
}
