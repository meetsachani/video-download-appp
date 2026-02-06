package o;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

@InterfaceC5601ca0
@InterfaceC11149zF0
@L40("Create an AbstractIdleService")
/* loaded from: classes3.dex */
public interface G12 {

    /* loaded from: classes3.dex */
    public enum b {
        NEW,
        STARTING,
        RUNNING,
        STOPPING,
        TERMINATED,
        FAILED
    }

    void a(a aVar, Executor executor);

    void b(long j, TimeUnit timeUnit) throws TimeoutException;

    void c(long j, TimeUnit timeUnit) throws TimeoutException;

    void d();

    @InterfaceC6181ey
    G12 e();

    void f();

    Throwable g();

    @InterfaceC6181ey
    G12 h();

    boolean isRunning();

    b state();

    /* loaded from: classes3.dex */
    public static abstract class a {
        public void b() {
        }

        public void c() {
        }

        public void d(b bVar) {
        }

        public void e(b bVar) {
        }

        public void a(b bVar, Throwable th) {
        }
    }
}
