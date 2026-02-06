package o;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* renamed from: o.aN2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C5072aN2 implements InterfaceC3748Nl2 {
    public final ExecutorC8412o12 a;
    public final Handler b = new Handler(Looper.getMainLooper());
    public final Executor c = new a();

    /* renamed from: o.aN2$a */
    /* loaded from: classes.dex */
    public class a implements Executor {
        public a() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable command) {
            C5072aN2.this.p(command);
        }
    }

    public C5072aN2(Executor backgroundExecutor) {
        this.a = new ExecutorC8412o12(backgroundExecutor);
    }

    @Override // o.InterfaceC3748Nl2
    public ExecutorC8412o12 m() {
        return this.a;
    }

    @Override // o.InterfaceC3748Nl2
    public Executor n() {
        return this.c;
    }

    @Override // o.InterfaceC3748Nl2
    public void o(Runnable runnable) {
        this.a.execute(runnable);
    }

    @Override // o.InterfaceC3748Nl2
    public void p(Runnable runnable) {
        this.b.post(runnable);
    }
}
