package o;

import java.io.Serializable;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

@InterfaceC5601ca0
@InterfaceC10420wF0
/* renamed from: o.hg  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C6850hg<K> implements Serializable {
    public final ConcurrentHashMap<K, AtomicLong> X;
    @MB
    public transient Map<K, Long> Y;

    /* renamed from: o.hg$a */
    /* loaded from: classes3.dex */
    public class a implements YA0<AtomicLong, Long> {
        public a(C6850hg c6850hg) {
        }

        @Override // o.YA0
        /* renamed from: a */
        public Long apply(AtomicLong atomicLong) {
            return Long.valueOf(atomicLong.get());
        }
    }

    public C6850hg(ConcurrentHashMap<K, AtomicLong> concurrentHashMap) {
        this.X = (ConcurrentHashMap) C10664xF1.E(concurrentHashMap);
    }

    public static <K> C6850hg<K> e() {
        return new C6850hg<>(new ConcurrentHashMap());
    }

    public static <K> C6850hg<K> f(Map<? extends K, ? extends Long> map) {
        C6850hg<K> e = e();
        e.p(map);
        return e;
    }

    @InterfaceC6181ey
    public long a(K k, long j) {
        AtomicLong atomicLong;
        do {
            atomicLong = this.X.get(k);
            if (atomicLong == null && (atomicLong = this.X.putIfAbsent(k, new AtomicLong(j))) == null) {
                break;
            }
            while (true) {
                long j2 = atomicLong.get();
                if (j2 == 0) {
                    break;
                }
                long j3 = j2 + j;
                if (atomicLong.compareAndSet(j2, j3)) {
                    return j3;
                }
            }
        } while (!this.X.replace(k, atomicLong, new AtomicLong(j)));
        return j;
    }

    public Map<K, Long> b() {
        Map<K, Long> map = this.Y;
        if (map == null) {
            Map<K, Long> g = g();
            this.Y = g;
            return g;
        }
        return map;
    }

    public void c() {
        this.X.clear();
    }

    public boolean d(Object obj) {
        return this.X.containsKey(obj);
    }

    public final Map<K, Long> g() {
        return Collections.unmodifiableMap(C7935m81.B0(this.X, new a(this)));
    }

    @InterfaceC6181ey
    public long h(K k) {
        return a(k, -1L);
    }

    public long i(K k) {
        AtomicLong atomicLong = this.X.get(k);
        if (atomicLong == null) {
            return 0L;
        }
        return atomicLong.get();
    }

    @InterfaceC6181ey
    public long j(K k, long j) {
        AtomicLong atomicLong;
        do {
            atomicLong = this.X.get(k);
            if (atomicLong == null && (atomicLong = this.X.putIfAbsent(k, new AtomicLong(j))) == null) {
                return 0L;
            }
            while (true) {
                long j2 = atomicLong.get();
                if (j2 == 0) {
                    break;
                } else if (atomicLong.compareAndSet(j2, j2 + j)) {
                    return j2;
                }
            }
        } while (!this.X.replace(k, atomicLong, new AtomicLong(j)));
        return 0L;
    }

    @InterfaceC6181ey
    public long k(K k) {
        return j(k, -1L);
    }

    @InterfaceC6181ey
    public long l(K k) {
        return j(k, 1L);
    }

    @InterfaceC6181ey
    public long m(K k) {
        return a(k, 1L);
    }

    public boolean n() {
        return this.X.isEmpty();
    }

    @InterfaceC6181ey
    public long o(K k, long j) {
        AtomicLong atomicLong;
        do {
            atomicLong = this.X.get(k);
            if (atomicLong == null && (atomicLong = this.X.putIfAbsent(k, new AtomicLong(j))) == null) {
                return 0L;
            }
            while (true) {
                long j2 = atomicLong.get();
                if (j2 == 0) {
                    break;
                } else if (atomicLong.compareAndSet(j2, j)) {
                    return j2;
                }
            }
        } while (!this.X.replace(k, atomicLong, new AtomicLong(j)));
        return 0L;
    }

    public void p(Map<? extends K, ? extends Long> map) {
        for (Map.Entry<? extends K, ? extends Long> entry : map.entrySet()) {
            o(entry.getKey(), entry.getValue().longValue());
        }
    }

    public long q(K k, long j) {
        AtomicLong atomicLong;
        do {
            atomicLong = this.X.get(k);
            if (atomicLong == null && (atomicLong = this.X.putIfAbsent(k, new AtomicLong(j))) == null) {
                return 0L;
            }
            long j2 = atomicLong.get();
            if (j2 != 0) {
                return j2;
            }
        } while (!this.X.replace(k, atomicLong, new AtomicLong(j)));
        return 0L;
    }

    @InterfaceC6181ey
    public long r(K k) {
        long j;
        AtomicLong atomicLong = this.X.get(k);
        if (atomicLong == null) {
            return 0L;
        }
        do {
            j = atomicLong.get();
            if (j == 0) {
                break;
            }
        } while (!atomicLong.compareAndSet(j, 0L));
        this.X.remove(k, atomicLong);
        return j;
    }

    public boolean s(K k, long j) {
        AtomicLong atomicLong = this.X.get(k);
        if (atomicLong == null) {
            return false;
        }
        long j2 = atomicLong.get();
        if (j2 != j) {
            return false;
        }
        if (j2 != 0 && !atomicLong.compareAndSet(j2, 0L)) {
            return false;
        }
        this.X.remove(k, atomicLong);
        return true;
    }

    public void t() {
        Iterator<Map.Entry<K, AtomicLong>> it = this.X.entrySet().iterator();
        while (it.hasNext()) {
            AtomicLong value = it.next().getValue();
            if (value != null && value.get() == 0) {
                it.remove();
            }
        }
    }

    public String toString() {
        return this.X.toString();
    }

    @InterfaceC6181ey
    @InterfaceC4238Sm
    public boolean u(K k) {
        return s(k, 0L);
    }

    public boolean v(K k, long j, long j2) {
        if (j == 0) {
            if (q(k, j2) != 0) {
                return false;
            }
            return true;
        }
        AtomicLong atomicLong = this.X.get(k);
        if (atomicLong == null) {
            return false;
        }
        return atomicLong.compareAndSet(j, j2);
    }

    public int w() {
        return this.X.size();
    }

    public long x() {
        long j = 0;
        for (AtomicLong atomicLong : this.X.values()) {
            j += atomicLong.get();
        }
        return j;
    }
}
