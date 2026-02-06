package o;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: o.If  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3232If implements InterfaceC11045yp1 {
    public ExecutorService a;
    public ExecutorService b;
    public ScheduledExecutorService c;

    /* renamed from: o.If$a */
    /* loaded from: classes.dex */
    public class a implements b {
        public final /* synthetic */ AtomicReference a;
        public final /* synthetic */ CountDownLatch b;
        public final /* synthetic */ AtomicReference c;

        public a(AtomicReference atomicReference, CountDownLatch countDownLatch, AtomicReference atomicReference2) {
            this.a = atomicReference;
            this.b = countDownLatch;
            this.c = atomicReference2;
        }

        @Override // o.AbstractC3232If.b
        public void a(C6524gJ2 c6524gJ2) {
            this.c.set(c6524gJ2);
            this.b.countDown();
        }

        @Override // o.AbstractC3232If.b
        public void b(C3470Kp1 c3470Kp1) {
            this.a.set(c3470Kp1);
            this.b.countDown();
        }
    }

    /* renamed from: o.If$b */
    /* loaded from: classes.dex */
    public interface b {
        void a(C6524gJ2 c6524gJ2);

        void b(C3470Kp1 c3470Kp1);
    }

    @Override // o.InterfaceC11045yp1
    public C3470Kp1 a(AbstractC5091aS1<?> abstractC5091aS1) throws C6524gJ2 {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        AtomicReference atomicReference = new AtomicReference();
        AtomicReference atomicReference2 = new AtomicReference();
        e(abstractC5091aS1, new a(atomicReference, countDownLatch, atomicReference2));
        try {
            countDownLatch.await();
            if (atomicReference.get() != null) {
                return (C3470Kp1) atomicReference.get();
            }
            if (atomicReference2.get() != null) {
                throw ((C6524gJ2) atomicReference2.get());
            }
            throw new C6524gJ2("Neither response entry was set");
        } catch (InterruptedException e) {
            C6767hJ2.d(e, "while waiting for CountDownLatch", new Object[0]);
            Thread.currentThread().interrupt();
            throw new C6524gJ2(e);
        }
    }

    public ExecutorService b() {
        return this.a;
    }

    public ExecutorService c() {
        return this.b;
    }

    public ScheduledExecutorService d() {
        return this.c;
    }

    public abstract void e(AbstractC5091aS1<?> abstractC5091aS1, b bVar);

    public void f(ExecutorService executorService) {
        this.a = executorService;
    }

    public void g(ExecutorService executorService) {
        this.b = executorService;
    }

    public void h(ScheduledExecutorService scheduledExecutorService) {
        this.c = scheduledExecutorService;
    }
}
