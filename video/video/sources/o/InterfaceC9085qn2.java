package o;

import java.util.concurrent.Executor;
import o.HJ;

/* renamed from: o.qn2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC9085qn2 extends CO1 {
    public static final HJ.a<Executor> y = HJ.a.a("camerax.core.thread.backgroundExecutor", Executor.class);

    /* renamed from: o.qn2$a */
    /* loaded from: classes.dex */
    public interface a<B> {
        B h(Executor executor);
    }

    default Executor m() {
        return (Executor) j(y);
    }

    default Executor o0(Executor executor) {
        return (Executor) h(y, executor);
    }
}
