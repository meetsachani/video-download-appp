package o;

import java.util.concurrent.Callable;
import java.util.concurrent.Future;

@InterfaceC6181ey
@InterfaceC5601ca0
@InterfaceC11149zF0
/* renamed from: o.oy0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC8641oy0 extends AbstractExecutorServiceC4861Yx0 implements InterfaceExecutorServiceC10119v11 {
    @Override // o.AbstractExecutorServiceC4861Yx0
    /* renamed from: N5 */
    public abstract InterfaceExecutorServiceC10119v11 M5();

    @Override // o.AbstractExecutorServiceC4861Yx0, java.util.concurrent.ExecutorService
    public /* bridge */ /* synthetic */ Future submit(Runnable runnable, @InterfaceC7165iy1 Object obj) {
        return submit(runnable, (Runnable) obj);
    }

    @Override // o.AbstractExecutorServiceC4861Yx0, java.util.concurrent.ExecutorService
    public <T> InterfaceFutureC8411o11<T> submit(Callable<T> callable) {
        return M5().submit((Callable) callable);
    }

    @Override // o.AbstractExecutorServiceC4861Yx0, java.util.concurrent.ExecutorService
    public InterfaceFutureC8411o11<?> submit(Runnable runnable) {
        return M5().submit(runnable);
    }

    @Override // o.AbstractExecutorServiceC4861Yx0, java.util.concurrent.ExecutorService
    public <T> InterfaceFutureC8411o11<T> submit(Runnable runnable, @InterfaceC7165iy1 T t) {
        return M5().submit(runnable, (Runnable) t);
    }
}
