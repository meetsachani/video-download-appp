package o;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import o.Y90;

@InterfaceC7070ia0
/* loaded from: classes3.dex */
public final class Mz2<N, V> implements FE0<N, V> {
    public final Map<N, V> a;

    /* loaded from: classes3.dex */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[Y90.b.values().length];
            a = iArr;
            try {
                iArr[Y90.b.UNORDERED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[Y90.b.STABLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public Mz2(Map<N, V> map) {
        this.a = (Map) C10664xF1.E(map);
    }

    public static <N, V> Mz2<N, V> k(Y90<N> y90) {
        int i = a.a[y90.h().ordinal()];
        if (i != 1) {
            if (i == 2) {
                return new Mz2<>(new LinkedHashMap(2, 1.0f));
            }
            throw new AssertionError(y90.h());
        }
        return new Mz2<>(new HashMap(2, 1.0f));
    }

    public static <N, V> Mz2<N, V> l(Map<N, V> map) {
        return new Mz2<>(AbstractC6044eO0.g(map));
    }

    @Override // o.FE0
    public Set<N> a() {
        return c();
    }

    @Override // o.FE0
    public Set<N> b() {
        return c();
    }

    @Override // o.FE0
    public Set<N> c() {
        return Collections.unmodifiableSet(this.a.keySet());
    }

    @Override // o.FE0
    @MB
    public V d(N n) {
        return this.a.get(n);
    }

    @Override // o.FE0
    @MB
    public V e(N n) {
        return this.a.remove(n);
    }

    @Override // o.FE0
    public void f(N n) {
        e(n);
    }

    @Override // o.FE0
    public Iterator<AbstractC4099Rc0<N>> g(final N n) {
        return C7052iU0.c0(this.a.keySet().iterator(), new YA0() { // from class: o.Lz2
            @Override // o.YA0
            public final Object apply(Object obj) {
                AbstractC4099Rc0 w;
                w = AbstractC4099Rc0.w(n, obj);
                return w;
            }
        });
    }

    @Override // o.FE0
    @MB
    public V h(N n, V v) {
        return this.a.put(n, v);
    }

    @Override // o.FE0
    public void i(N n, V v) {
        h(n, v);
    }
}
