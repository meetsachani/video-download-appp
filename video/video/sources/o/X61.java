package o;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class X61<T, Y> {
    public final Map<T, a<Y>> a = new LinkedHashMap(100, 0.75f, true);
    public final long b;
    public long c;
    public long d;

    /* loaded from: classes.dex */
    public static final class a<Y> {
        public final Y a;
        public final int b;

        public a(Y y, int i) {
            this.a = y;
            this.b = i;
        }
    }

    public X61(long j) {
        this.b = j;
        this.c = j;
    }

    public void b() {
        q(0L);
    }

    public synchronized void c(float f) {
        if (f >= 0.0f) {
            this.c = Math.round(((float) this.b) * f);
            j();
        } else {
            throw new IllegalArgumentException("Multiplier must be >= 0");
        }
    }

    public synchronized long d() {
        return this.d;
    }

    public synchronized long e() {
        return this.c;
    }

    public synchronized boolean i(T t) {
        return this.a.containsKey(t);
    }

    public final void j() {
        q(this.c);
    }

    public synchronized Y k(T t) {
        Y y;
        a<Y> aVar = this.a.get(t);
        if (aVar != null) {
            y = aVar.a;
        } else {
            y = null;
        }
        return y;
    }

    public synchronized int l() {
        return this.a.size();
    }

    public int m(Y y) {
        return 1;
    }

    public synchronized Y o(T t, Y y) {
        a<Y> aVar;
        int m = m(y);
        long j = m;
        Y y2 = null;
        if (j >= this.c) {
            n(t, y);
            return null;
        }
        if (y != null) {
            this.d += j;
        }
        Map<T, a<Y>> map = this.a;
        if (y == null) {
            aVar = null;
        } else {
            aVar = new a<>(y, m);
        }
        a<Y> put = map.put(t, aVar);
        if (put != null) {
            this.d -= put.b;
            if (!put.a.equals(y)) {
                n(t, put.a);
            }
        }
        j();
        if (put != null) {
            y2 = put.a;
        }
        return y2;
    }

    public synchronized Y p(T t) {
        a<Y> remove = this.a.remove(t);
        if (remove == null) {
            return null;
        }
        this.d -= remove.b;
        return remove.a;
    }

    public synchronized void q(long j) {
        while (this.d > j) {
            Iterator<Map.Entry<T, a<Y>>> it = this.a.entrySet().iterator();
            Map.Entry<T, a<Y>> next = it.next();
            a<Y> value = next.getValue();
            this.d -= value.b;
            T key = next.getKey();
            it.remove();
            n(key, value.a);
        }
    }

    public void n(T t, Y y) {
    }
}
