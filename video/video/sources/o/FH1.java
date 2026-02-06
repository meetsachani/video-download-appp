package o;

import java.io.IOException;
import java.util.Collections;
import java.util.PriorityQueue;

@Deprecated
/* loaded from: classes2.dex */
public final class FH1 {
    public final Object a = new Object();
    public final PriorityQueue<Integer> b = new PriorityQueue<>(10, Collections.reverseOrder());
    public int c = Integer.MIN_VALUE;

    /* loaded from: classes2.dex */
    public static class a extends IOException {
        public a(int i, int i2) {
            super("Priority too low [priority=" + i + ", highest=" + i2 + C6566gU0.g);
        }
    }

    public void a(int i) {
        synchronized (this.a) {
            this.b.add(Integer.valueOf(i));
            this.c = Math.max(this.c, i);
        }
    }

    public void b(int i) throws InterruptedException {
        synchronized (this.a) {
            while (this.c != i) {
                try {
                    this.a.wait();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public boolean c(int i) {
        boolean z;
        synchronized (this.a) {
            if (this.c == i) {
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    public void d(int i) throws a {
        synchronized (this.a) {
            try {
                if (this.c != i) {
                    throw new a(i, this.c);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void e(int i) {
        int intValue;
        synchronized (this.a) {
            this.b.remove(Integer.valueOf(i));
            if (this.b.isEmpty()) {
                intValue = Integer.MIN_VALUE;
            } else {
                intValue = ((Integer) TD2.o(this.b.peek())).intValue();
            }
            this.c = intValue;
            this.a.notifyAll();
        }
    }
}
