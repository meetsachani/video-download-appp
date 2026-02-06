package o;

import java.util.concurrent.Executor;
import o.HJ;

/* loaded from: classes.dex */
public interface FT0 extends CO1 {
    public static final HJ.a<Executor> v = HJ.a.a("camerax.core.io.ioExecutor", Executor.class);

    /* loaded from: classes.dex */
    public interface a<B> {
        B h(Executor executor);
    }

    default Executor X(Executor executor) {
        return (Executor) h(v, executor);
    }

    default Executor f0() {
        return (Executor) j(v);
    }
}
