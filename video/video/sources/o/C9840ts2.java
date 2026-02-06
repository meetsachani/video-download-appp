package o;

import java.util.Iterator;
import java.util.Map;

/* renamed from: o.ts2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C9840ts2<K, V> extends AbstractC6696h2<K, V> {
    private static final long serialVersionUID = 20150612;
    public final InterfaceC3287Is2<? super K, ? extends K> Y;
    public final InterfaceC3287Is2<? super V, ? extends V> Z;

    public C9840ts2(InterfaceC7846lm1<K, V> interfaceC7846lm1, InterfaceC3287Is2<? super K, ? extends K> interfaceC3287Is2, InterfaceC3287Is2<? super V, ? extends V> interfaceC3287Is22) {
        super(interfaceC7846lm1);
        this.Y = interfaceC3287Is2;
        this.Z = interfaceC3287Is22;
    }

    public static <K, V> C9840ts2<K, V> d(InterfaceC7846lm1<K, V> interfaceC7846lm1, InterfaceC3287Is2<? super K, ? extends K> interfaceC3287Is2, InterfaceC3287Is2<? super V, ? extends V> interfaceC3287Is22) {
        C9840ts2<K, V> c9840ts2 = new C9840ts2<>(interfaceC7846lm1, interfaceC3287Is2, interfaceC3287Is22);
        if (!interfaceC7846lm1.isEmpty()) {
            C11242ze c11242ze = new C11242ze(interfaceC7846lm1);
            c9840ts2.clear();
            c9840ts2.f0(c11242ze);
        }
        return c9840ts2;
    }

    public static <K, V> C9840ts2<K, V> e(InterfaceC7846lm1<K, V> interfaceC7846lm1, InterfaceC3287Is2<? super K, ? extends K> interfaceC3287Is2, InterfaceC3287Is2<? super V, ? extends V> interfaceC3287Is22) {
        return new C9840ts2<>(interfaceC7846lm1, interfaceC3287Is2, interfaceC3287Is22);
    }

    public K b(K k) {
        InterfaceC3287Is2<? super K, ? extends K> interfaceC3287Is2 = this.Y;
        if (interfaceC3287Is2 == null) {
            return k;
        }
        return interfaceC3287Is2.a(k);
    }

    public V c(V v) {
        InterfaceC3287Is2<? super V, ? extends V> interfaceC3287Is2 = this.Z;
        if (interfaceC3287Is2 == null) {
            return v;
        }
        return interfaceC3287Is2.a(v);
    }

    @Override // o.AbstractC6696h2, o.InterfaceC7846lm1
    public boolean e0(K k, Iterable<? extends V> iterable) {
        if (iterable != null) {
            Iterator<E> it = C10586ww0.G(iterable).U(this.Z).iterator();
            if (it.hasNext() && C6748hF.c(a().get(b(k)), it)) {
                return true;
            }
            return false;
        }
        throw new NullPointerException("Values must not be null.");
    }

    @Override // o.AbstractC6696h2, o.InterfaceC7846lm1
    public boolean f0(InterfaceC7846lm1<? extends K, ? extends V> interfaceC7846lm1) {
        if (interfaceC7846lm1 != null) {
            boolean z = false;
            for (Map.Entry<? extends K, ? extends V> entry : interfaceC7846lm1.r()) {
                z |= put(entry.getKey(), entry.getValue());
            }
            return z;
        }
        throw new NullPointerException("Map must not be null.");
    }

    @Override // o.AbstractC6696h2, o.InterfaceC7846lm1
    public boolean put(K k, V v) {
        return a().put(b(k), c(v));
    }

    @Override // o.AbstractC6696h2, o.InterfaceC7846lm1
    public boolean putAll(Map<? extends K, ? extends V> map) {
        if (map != null) {
            boolean z = false;
            for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
                z |= put(entry.getKey(), entry.getValue());
            }
            return z;
        }
        throw new NullPointerException("Map must not be null.");
    }
}
