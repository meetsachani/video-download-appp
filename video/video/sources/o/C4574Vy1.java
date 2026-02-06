package o;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* renamed from: o.Vy1  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C4574Vy1<K, V> extends I1<K, V> implements Serializable {
    private static final long serialVersionUID = 1;
    public final Map<Object, Long> Y;
    public final b<K, V> Z;

    /* renamed from: o.Vy1$a */
    /* loaded from: classes4.dex */
    public static class a<K, V> implements b<K, V> {
        private static final long serialVersionUID = 1;
        public final long X;

        public a() {
            this(-1L);
        }

        @Override // o.C4574Vy1.b
        public long i3(K k, V v) {
            if (this.X < 0) {
                return -1L;
            }
            long currentTimeMillis = System.currentTimeMillis();
            long j = this.X;
            if (currentTimeMillis > Long.MAX_VALUE - j) {
                return -1L;
            }
            return currentTimeMillis + j;
        }

        public a(long j) {
            this.X = j;
        }

        public a(long j, TimeUnit timeUnit) {
            this(C4574Vy1.i(j, timeUnit));
        }
    }

    @FunctionalInterface
    /* renamed from: o.Vy1$b */
    /* loaded from: classes4.dex */
    public interface b<K, V> extends Serializable {
        long i3(K k, V v);
    }

    public C4574Vy1() {
        this(-1L);
    }

    public static long i(long j, TimeUnit timeUnit) {
        if (timeUnit != null) {
            return TimeUnit.MILLISECONDS.convert(j, timeUnit);
        }
        throw new NullPointerException("Time unit must not be null");
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        this.X = (Map) objectInputStream.readObject();
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(this.X);
    }

    @Override // o.I1, java.util.Map, o.OK1
    public void clear() {
        super.clear();
        this.Y.clear();
    }

    @Override // o.I1, java.util.Map, o.UC0
    public boolean containsKey(Object obj) {
        g(obj, e());
        return super.containsKey(obj);
    }

    @Override // o.I1, java.util.Map, o.UC0
    public boolean containsValue(Object obj) {
        f(e());
        return super.containsValue(obj);
    }

    public final boolean d(long j, Long l) {
        if (l != null) {
            long longValue = l.longValue();
            if (longValue >= 0 && j >= longValue) {
                return true;
            }
        }
        return false;
    }

    public final long e() {
        return System.currentTimeMillis();
    }

    @Override // o.I1, java.util.Map, o.UC0
    public Set<Map.Entry<K, V>> entrySet() {
        f(e());
        return super.entrySet();
    }

    public final void f(long j) {
        Iterator<Map.Entry<Object, Long>> it = this.Y.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<Object, Long> next = it.next();
            if (d(j, next.getValue())) {
                super.remove(next.getKey());
                it.remove();
            }
        }
    }

    public final void g(Object obj, long j) {
        if (d(j, this.Y.get(obj))) {
            remove(obj);
        }
    }

    @Override // o.I1, java.util.Map, o.UC0
    public V get(Object obj) {
        g(obj, e());
        return (V) super.get(obj);
    }

    @Override // o.I1, java.util.Map, o.UC0
    public boolean isEmpty() {
        f(e());
        return super.isEmpty();
    }

    @Override // o.I1, java.util.Map, o.UC0
    public Set<K> keySet() {
        f(e());
        return super.keySet();
    }

    @Override // o.I1, java.util.Map, o.OK1
    public V put(K k, V v) {
        g(k, e());
        this.Y.put(k, Long.valueOf(this.Z.i3(k, v)));
        return (V) super.put(k, v);
    }

    @Override // o.I1, java.util.Map, o.OK1
    public void putAll(Map<? extends K, ? extends V> map) {
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // o.I1, java.util.Map, o.UC0
    public V remove(Object obj) {
        this.Y.remove(obj);
        return (V) super.remove(obj);
    }

    @Override // o.I1, java.util.Map, o.UC0
    public int size() {
        f(e());
        return super.size();
    }

    @Override // o.I1, java.util.Map, o.UC0
    public Collection<V> values() {
        f(e());
        return super.values();
    }

    public C4574Vy1(b<K, V> bVar) {
        this(bVar, new HashMap());
    }

    public C4574Vy1(b<K, V> bVar, Map<K, V> map) {
        super(map);
        this.Y = new HashMap();
        if (bVar != null) {
            this.Z = bVar;
            return;
        }
        throw new NullPointerException("Policy must not be null.");
    }

    public C4574Vy1(long j) {
        this(new a(j), new HashMap());
    }

    public C4574Vy1(long j, Map<K, V> map) {
        this(new a(j), map);
    }

    public C4574Vy1(long j, TimeUnit timeUnit) {
        this(i(j, timeUnit));
    }

    public C4574Vy1(long j, TimeUnit timeUnit, Map<K, V> map) {
        this(i(j, timeUnit), map);
    }

    public C4574Vy1(Map<K, V> map) {
        this(-1L, map);
    }
}
