package o;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.BlockingQueue;
import o.AbstractC5091aS1;
import o.InterfaceC4747Xs;

/* renamed from: o.tJ2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C9706tJ2 implements AbstractC5091aS1.c {
    public final Map<String, List<AbstractC5091aS1<?>>> a;
    public final GT1 b;
    public final C9006qS1 c;
    public final C6404ft d;
    public final BlockingQueue<AbstractC5091aS1<?>> e;

    public C9706tJ2(C9006qS1 c9006qS1) {
        this.a = new HashMap();
        this.c = c9006qS1;
        this.b = c9006qS1.i();
        this.d = null;
        this.e = null;
    }

    @Override // o.AbstractC5091aS1.c
    public void a(AbstractC5091aS1<?> abstractC5091aS1, DT1<?> dt1) {
        List<AbstractC5091aS1<?>> remove;
        InterfaceC4747Xs.a aVar = dt1.b;
        if (aVar != null && !aVar.a()) {
            String s = abstractC5091aS1.s();
            synchronized (this) {
                remove = this.a.remove(s);
            }
            if (remove != null) {
                if (C6767hJ2.b) {
                    C6767hJ2.f("Releasing %d waiting requests for cacheKey=%s.", Integer.valueOf(remove.size()), s);
                }
                for (AbstractC5091aS1<?> abstractC5091aS12 : remove) {
                    this.b.c(abstractC5091aS12, dt1);
                }
                return;
            }
            return;
        }
        b(abstractC5091aS1);
    }

    @Override // o.AbstractC5091aS1.c
    public synchronized void b(AbstractC5091aS1<?> abstractC5091aS1) {
        BlockingQueue<AbstractC5091aS1<?>> blockingQueue;
        try {
            String s = abstractC5091aS1.s();
            List<AbstractC5091aS1<?>> remove = this.a.remove(s);
            if (remove != null && !remove.isEmpty()) {
                if (C6767hJ2.b) {
                    C6767hJ2.f("%d waiting requests for cacheKey=%s; resend to network", Integer.valueOf(remove.size()), s);
                }
                AbstractC5091aS1<?> remove2 = remove.remove(0);
                this.a.put(s, remove);
                remove2.S(this);
                C9006qS1 c9006qS1 = this.c;
                if (c9006qS1 != null) {
                    c9006qS1.n(remove2);
                } else if (this.d != null && (blockingQueue = this.e) != null) {
                    try {
                        blockingQueue.put(remove2);
                    } catch (InterruptedException e) {
                        C6767hJ2.c("Couldn't add request to queue. %s", e.toString());
                        Thread.currentThread().interrupt();
                        this.d.d();
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized boolean c(AbstractC5091aS1<?> abstractC5091aS1) {
        try {
            String s = abstractC5091aS1.s();
            if (this.a.containsKey(s)) {
                List<AbstractC5091aS1<?>> list = this.a.get(s);
                if (list == null) {
                    list = new ArrayList<>();
                }
                abstractC5091aS1.g("waiting-for-response");
                list.add(abstractC5091aS1);
                this.a.put(s, list);
                if (C6767hJ2.b) {
                    C6767hJ2.b("Request for cacheKey=%s is in flight, putting on hold.", s);
                }
                return true;
            }
            this.a.put(s, null);
            abstractC5091aS1.S(this);
            if (C6767hJ2.b) {
                C6767hJ2.b("new request, sending to network %s", s);
            }
            return false;
        } catch (Throwable th) {
            throw th;
        }
    }

    public C9706tJ2(C6404ft c6404ft, BlockingQueue<AbstractC5091aS1<?>> blockingQueue, GT1 gt1) {
        this.a = new HashMap();
        this.c = null;
        this.b = gt1;
        this.d = c6404ft;
        this.e = blockingQueue;
    }
}
