package o;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ExecutionException;

@InterfaceC6086ea0
@InterfaceC10420wF0
/* renamed from: o.g0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC6433g0<K, V> implements InterfaceC4951Zs<K, V> {

    /* renamed from: o.g0$a */
    /* loaded from: classes3.dex */
    public static final class a implements b {
        public final InterfaceC9888u41 a = C10131v41.a();
        public final InterfaceC9888u41 b = C10131v41.a();
        public final InterfaceC9888u41 c = C10131v41.a();
        public final InterfaceC9888u41 d = C10131v41.a();
        public final InterfaceC9888u41 e = C10131v41.a();
        public final InterfaceC9888u41 f = C10131v41.a();

        public static long h(long j) {
            if (j >= 0) {
                return j;
            }
            return Long.MAX_VALUE;
        }

        @Override // o.AbstractC6433g0.b
        public void a(int i) {
            this.a.add(i);
        }

        @Override // o.AbstractC6433g0.b
        public void b(int i) {
            this.b.add(i);
        }

        @Override // o.AbstractC6433g0.b
        public void c() {
            this.f.a();
        }

        @Override // o.AbstractC6433g0.b
        public void d(long j) {
            this.d.a();
            this.e.add(j);
        }

        @Override // o.AbstractC6433g0.b
        public void e(long j) {
            this.c.a();
            this.e.add(j);
        }

        @Override // o.AbstractC6433g0.b
        public C8620ot f() {
            return new C8620ot(h(this.a.sum()), h(this.b.sum()), h(this.c.sum()), h(this.d.sum()), h(this.e.sum()), h(this.f.sum()));
        }

        public void g(b bVar) {
            C8620ot f = bVar.f();
            this.a.add(f.c());
            this.b.add(f.j());
            this.c.add(f.h());
            this.d.add(f.f());
            this.e.add(f.n());
            this.f.add(f.b());
        }
    }

    /* renamed from: o.g0$b */
    /* loaded from: classes3.dex */
    public interface b {
        void a(int i);

        void b(int i);

        void c();

        void d(long j);

        void e(long j);

        C8620ot f();
    }

    @Override // o.InterfaceC4951Zs
    public V G0(K k, Callable<? extends V> callable) throws ExecutionException {
        throw new UnsupportedOperationException();
    }

    @Override // o.InterfaceC4951Zs
    public C8620ot J5() {
        throw new UnsupportedOperationException();
    }

    @Override // o.InterfaceC4951Zs
    public void K5() {
        throw new UnsupportedOperationException();
    }

    @Override // o.InterfaceC4951Zs
    public void P3(Iterable<? extends Object> iterable) {
        for (Object obj : iterable) {
            l2(obj);
        }
    }

    @Override // o.InterfaceC4951Zs
    public ConcurrentMap<K, V> l() {
        throw new UnsupportedOperationException();
    }

    @Override // o.InterfaceC4951Zs
    public void l2(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // o.InterfaceC4951Zs
    public void put(K k, V v) {
        throw new UnsupportedOperationException();
    }

    @Override // o.InterfaceC4951Zs
    public void putAll(Map<? extends K, ? extends V> map) {
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // o.InterfaceC4951Zs
    public long size() {
        throw new UnsupportedOperationException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.InterfaceC4951Zs
    public AbstractC6044eO0<K, V> y5(Iterable<? extends Object> iterable) {
        V B3;
        LinkedHashMap c0 = C7935m81.c0();
        for (Object obj : iterable) {
            if (!c0.containsKey(obj) && (B3 = B3(obj)) != null) {
                c0.put(obj, B3);
            }
        }
        return AbstractC6044eO0.g(c0);
    }

    @Override // o.InterfaceC4951Zs
    public void J() {
    }
}
