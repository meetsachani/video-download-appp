package o;

import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

/* renamed from: o.ci1 */
/* loaded from: classes4.dex */
public class C5634ci1<I, O> implements InterfaceC5538cJ<I, O> {
    public final ConcurrentMap<I, Future<O>> a;
    public final InterfaceC5538cJ<I, O> b;
    public final boolean c;

    public C5634ci1(InterfaceC5538cJ<I, O> interfaceC5538cJ) {
        this(interfaceC5538cJ, false);
    }

    public static /* synthetic */ Object b(C5634ci1 c5634ci1, Object obj) {
        return c5634ci1.b.a(obj);
    }

    @Override // o.InterfaceC5538cJ
    public O a(final I i) throws InterruptedException {
        FutureTask futureTask;
        while (true) {
            Future<O> future = this.a.get(i);
            if (future == null && (future = this.a.putIfAbsent(i, (futureTask = new FutureTask(new Callable() { // from class: o.bi1
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return C5634ci1.b(C5634ci1.this, i);
                }
            })))) == null) {
                futureTask.run();
                future = futureTask;
            }
            try {
                continue;
                return future.get();
            } catch (CancellationException unused) {
                this.a.remove(i, future);
            } catch (ExecutionException e) {
                if (this.c) {
                    this.a.remove(i, future);
                }
                throw c(e.getCause());
            }
        }
    }

    public final RuntimeException c(Throwable th) {
        if (th instanceof RuntimeException) {
            return (RuntimeException) th;
        }
        if (th instanceof Error) {
            throw ((Error) th);
        }
        throw new IllegalStateException("Unchecked exception", th);
    }

    public C5634ci1(InterfaceC5538cJ<I, O> interfaceC5538cJ, boolean z) {
        this.a = new ConcurrentHashMap();
        this.b = interfaceC5538cJ;
        this.c = z;
    }
}
