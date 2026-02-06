package o;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import o.Q0;

@InterfaceC5601ca0
@InterfaceC10420wF0
/* loaded from: classes3.dex */
public class LN0<V> implements InterfaceFutureC8411o11<V> {
    public static final InterfaceFutureC8411o11<?> Y = new LN0(null);
    public static final Logger Z = Logger.getLogger(LN0.class.getName());
    @InterfaceC7165iy1
    public final V X;

    /* loaded from: classes3.dex */
    public static final class a<V> extends Q0.j<V> {
        public static final a<Object> d1;

        static {
            a<Object> aVar;
            if (Q0.Y0) {
                aVar = null;
            } else {
                aVar = new a<>();
            }
            d1 = aVar;
        }

        public a() {
            cancel(false);
        }
    }

    /* loaded from: classes3.dex */
    public static final class b<V> extends Q0.j<V> {
        public b(Throwable th) {
            C(th);
        }
    }

    public LN0(@InterfaceC7165iy1 V v) {
        this.X = v;
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
        return false;
    }

    @Override // java.util.concurrent.Future
    @InterfaceC7165iy1
    public V get() {
        return this.X;
    }

    @Override // o.InterfaceFutureC8411o11
    public void h4(Runnable runnable, Executor executor) {
        C10664xF1.F(runnable, "Runnable was null.");
        C10664xF1.F(executor, "Executor was null.");
        try {
            executor.execute(runnable);
        } catch (RuntimeException e) {
            Logger logger = Z;
            Level level = Level.SEVERE;
            String valueOf = String.valueOf(runnable);
            String valueOf2 = String.valueOf(executor);
            StringBuilder sb = new StringBuilder(valueOf.length() + 57 + valueOf2.length());
            sb.append("RuntimeException while executing runnable ");
            sb.append(valueOf);
            sb.append(" with executor ");
            sb.append(valueOf2);
            logger.log(level, sb.toString(), (Throwable) e);
        }
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return true;
    }

    public String toString() {
        String obj = super.toString();
        String valueOf = String.valueOf(this.X);
        StringBuilder sb = new StringBuilder(String.valueOf(obj).length() + 27 + valueOf.length());
        sb.append(obj);
        sb.append("[status=SUCCESS, result=[");
        sb.append(valueOf);
        sb.append("]]");
        return sb.toString();
    }

    @Override // java.util.concurrent.Future
    @InterfaceC7165iy1
    public V get(long j, TimeUnit timeUnit) throws ExecutionException {
        C10664xF1.E(timeUnit);
        return get();
    }
}
