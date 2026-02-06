package o;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: o.Ff  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2938Ff extends AbstractC7112il {
    public ExecutorService a;
    public ExecutorService b;

    /* renamed from: o.Ff$a */
    /* loaded from: classes.dex */
    public class a implements b {
        public final /* synthetic */ AtomicReference a;
        public final /* synthetic */ CountDownLatch b;

        public a(AtomicReference atomicReference, CountDownLatch countDownLatch) {
            this.a = atomicReference;
            this.b = countDownLatch;
        }

        @Override // o.AbstractC2938Ff.b
        public void a(C4118Rh c4118Rh) {
            this.a.set(new c(null, null, c4118Rh, null));
            this.b.countDown();
        }

        @Override // o.AbstractC2938Ff.b
        public void b(IOException iOException) {
            this.a.set(new c(null, iOException, null, null));
            this.b.countDown();
        }

        @Override // o.AbstractC2938Ff.b
        public void c(CI0 ci0) {
            this.a.set(new c(ci0, null, null, null));
            this.b.countDown();
        }
    }

    /* renamed from: o.Ff$b */
    /* loaded from: classes.dex */
    public interface b {
        void a(C4118Rh c4118Rh);

        void b(IOException iOException);

        void c(CI0 ci0);
    }

    /* renamed from: o.Ff$c */
    /* loaded from: classes.dex */
    public static class c {
        public CI0 a;
        public IOException b;
        public C4118Rh c;

        public /* synthetic */ c(CI0 ci0, IOException iOException, C4118Rh c4118Rh, a aVar) {
            this(ci0, iOException, c4118Rh);
        }

        public c(CI0 ci0, IOException iOException, C4118Rh c4118Rh) {
            this.a = ci0;
            this.b = iOException;
            this.c = c4118Rh;
        }
    }

    @Override // o.AbstractC7112il
    public final CI0 b(AbstractC5091aS1<?> abstractC5091aS1, Map<String, String> map) throws IOException, C4118Rh {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        AtomicReference atomicReference = new AtomicReference();
        c(abstractC5091aS1, map, new a(atomicReference, countDownLatch));
        try {
            countDownLatch.await();
            c cVar = (c) atomicReference.get();
            CI0 ci0 = cVar.a;
            if (ci0 != null) {
                return ci0;
            }
            IOException iOException = cVar.b;
            if (iOException != null) {
                throw iOException;
            }
            throw cVar.c;
        } catch (InterruptedException e) {
            C6767hJ2.d(e, "while waiting for CountDownLatch", new Object[0]);
            Thread.currentThread().interrupt();
            throw new InterruptedIOException(e.toString());
        }
    }

    public abstract void c(AbstractC5091aS1<?> abstractC5091aS1, Map<String, String> map, b bVar);

    public ExecutorService d() {
        return this.a;
    }

    public ExecutorService e() {
        return this.b;
    }

    public void f(ExecutorService executorService) {
        this.a = executorService;
    }

    public void g(ExecutorService executorService) {
        this.b = executorService;
    }
}
