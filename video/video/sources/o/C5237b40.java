package o;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: o.b40  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5237b40 {
    public final Map<String, a> a = new HashMap();
    public final b b = new b();

    /* renamed from: o.b40$a */
    /* loaded from: classes.dex */
    public static class a {
        public final Lock a = new ReentrantLock();
        public int b;
    }

    /* renamed from: o.b40$b */
    /* loaded from: classes.dex */
    public static class b {
        public static final int b = 10;
        public final Queue<a> a = new ArrayDeque();

        public a a() {
            a poll;
            synchronized (this.a) {
                poll = this.a.poll();
            }
            if (poll == null) {
                return new a();
            }
            return poll;
        }

        public void b(a aVar) {
            synchronized (this.a) {
                try {
                    if (this.a.size() < 10) {
                        this.a.offer(aVar);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public void a(String str) {
        a aVar;
        synchronized (this) {
            try {
                aVar = this.a.get(str);
                if (aVar == null) {
                    aVar = this.b.a();
                    this.a.put(str, aVar);
                }
                aVar.b++;
            } catch (Throwable th) {
                throw th;
            }
        }
        aVar.a.lock();
    }

    public void b(String str) {
        a aVar;
        synchronized (this) {
            try {
                aVar = (a) C10175vF1.e(this.a.get(str));
                int i = aVar.b;
                if (i >= 1) {
                    int i2 = i - 1;
                    aVar.b = i2;
                    if (i2 == 0) {
                        a remove = this.a.remove(str);
                        if (remove.equals(aVar)) {
                            this.b.b(remove);
                        } else {
                            throw new IllegalStateException("Removed the wrong lock, expected to remove: " + aVar + ", but actually removed: " + remove + ", safeKey: " + str);
                        }
                    }
                } else {
                    throw new IllegalStateException("Cannot release a lock that is not held, safeKey: " + str + ", interestedThreads: " + aVar.b);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        aVar.a.unlock();
    }
}
