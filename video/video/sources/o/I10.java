package o;

import android.view.Surface;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import o.C3679Mt;
import o.D10;

/* loaded from: classes.dex */
public final class I10 {

    /* loaded from: classes.dex */
    public class a implements XB0<List<Surface>> {
        public final /* synthetic */ boolean a;
        public final /* synthetic */ C3679Mt.a b;
        public final /* synthetic */ ScheduledFuture c;

        public a(boolean z, C3679Mt.a aVar, ScheduledFuture scheduledFuture) {
            this.a = z;
            this.b = aVar;
            this.c = scheduledFuture;
        }

        @Override // o.XB0
        public void b(Throwable th) {
            this.b.c(Collections.unmodifiableList(Collections.EMPTY_LIST));
            this.c.cancel(true);
        }

        @Override // o.XB0
        /* renamed from: c */
        public void a(List<Surface> list) {
            ArrayList arrayList = new ArrayList(list);
            if (this.a) {
                arrayList.removeAll(Collections.singleton(null));
            }
            this.b.c(arrayList);
            this.c.cancel(true);
        }
    }

    public static /* synthetic */ Object a(List list, ScheduledExecutorService scheduledExecutorService, final Executor executor, final long j, boolean z, final C3679Mt.a aVar) {
        final InterfaceFutureC8411o11 m = C7221jC0.m(list);
        ScheduledFuture<?> schedule = scheduledExecutorService.schedule(new Runnable() { // from class: o.G10
            @Override // java.lang.Runnable
            public final void run() {
                executor.execute(new Runnable() { // from class: o.F10
                    @Override // java.lang.Runnable
                    public final void run() {
                        I10.c(InterfaceFutureC8411o11.this, r2, r3);
                    }
                });
            }
        }, j, TimeUnit.MILLISECONDS);
        aVar.a(new Runnable() { // from class: o.H10
            @Override // java.lang.Runnable
            public final void run() {
                InterfaceFutureC8411o11.this.cancel(true);
            }
        }, executor);
        C7221jC0.b(m, new a(z, aVar, schedule), executor);
        return "surfaceList";
    }

    public static /* synthetic */ void c(InterfaceFutureC8411o11 interfaceFutureC8411o11, C3679Mt.a aVar, long j) {
        if (!interfaceFutureC8411o11.isDone()) {
            aVar.f(new TimeoutException("Cannot complete surfaceList within " + j));
            interfaceFutureC8411o11.cancel(true);
        }
    }

    public static void e(List<D10> list) {
        for (D10 d10 : list) {
            d10.e();
        }
    }

    public static void f(List<D10> list) throws D10.a {
        if (!list.isEmpty()) {
            int i = 0;
            do {
                try {
                    list.get(i).m();
                    i++;
                } catch (D10.a e) {
                    for (int i2 = i - 1; i2 >= 0; i2--) {
                        list.get(i2).e();
                    }
                    throw e;
                }
            } while (i < list.size());
        }
    }

    public static InterfaceFutureC8411o11<List<Surface>> g(Collection<D10> collection, final boolean z, final long j, final Executor executor, final ScheduledExecutorService scheduledExecutorService) {
        final ArrayList arrayList = new ArrayList();
        for (D10 d10 : collection) {
            arrayList.add(C7221jC0.i(d10.j()));
        }
        return C3679Mt.a(new C3679Mt.c() { // from class: o.E10
            @Override // o.C3679Mt.c
            public final Object a(C3679Mt.a aVar) {
                return I10.a(arrayList, scheduledExecutorService, executor, j, z, aVar);
            }
        });
    }

    public static boolean h(List<D10> list) {
        try {
            f(list);
            return true;
        } catch (D10.a unused) {
            return false;
        }
    }
}
