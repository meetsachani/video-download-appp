package o;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

@InterfaceC6181ey
@InterfaceC11149zF0
@InterfaceC5601ca0
@InterfaceC4238Sm
/* renamed from: o.gn0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C6636gn0 implements InterfaceC3662Mo2 {
    @Override // o.InterfaceC3662Mo2
    public void a(Runnable runnable, long j, TimeUnit timeUnit) {
        C10664xF1.E(runnable);
        C10664xF1.E(timeUnit);
        try {
            runnable.run();
        } catch (Error e) {
            throw new C5140ag0(e);
        } catch (RuntimeException e2) {
            throw new Gy2(e2);
        } catch (Throwable th) {
            throw new Gy2(th);
        }
    }

    @Override // o.InterfaceC3662Mo2
    public <T> T b(T t, Class<T> cls, long j, TimeUnit timeUnit) {
        C10664xF1.E(t);
        C10664xF1.E(cls);
        C10664xF1.E(timeUnit);
        return t;
    }

    @Override // o.InterfaceC3662Mo2
    public void c(Runnable runnable, long j, TimeUnit timeUnit) {
        a(runnable, j, timeUnit);
    }

    @Override // o.InterfaceC3662Mo2
    @InterfaceC7165iy1
    public <T> T d(Callable<T> callable, long j, TimeUnit timeUnit) throws ExecutionException {
        return (T) e(callable, j, timeUnit);
    }

    @Override // o.InterfaceC3662Mo2
    @InterfaceC7165iy1
    public <T> T e(Callable<T> callable, long j, TimeUnit timeUnit) throws ExecutionException {
        C10664xF1.E(callable);
        C10664xF1.E(timeUnit);
        try {
            return callable.call();
        } catch (Error e) {
            throw new C5140ag0(e);
        } catch (RuntimeException e2) {
            throw new Gy2(e2);
        } catch (Exception e3) {
            throw new ExecutionException(e3);
        } catch (Throwable th) {
            throw new ExecutionException(th);
        }
    }
}
