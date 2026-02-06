package o;

import java.util.HashMap;
import java.util.Map;
import o.C10490wX1;

/* renamed from: o.wn0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C10550wn0<K, V> extends C10490wX1<K, V> {
    public final HashMap<K, C10490wX1.c<K, V>> Z0 = new HashMap<>();

    public boolean contains(K k) {
        return this.Z0.containsKey(k);
    }

    @Override // o.C10490wX1
    public C10490wX1.c<K, V> e(K k) {
        return this.Z0.get(k);
    }

    @Override // o.C10490wX1
    public V j(K k, V v) {
        C10490wX1.c<K, V> e = e(k);
        if (e != null) {
            return e.Y;
        }
        this.Z0.put(k, i(k, v));
        return null;
    }

    @Override // o.C10490wX1
    public V k(K k) {
        V v = (V) super.k(k);
        this.Z0.remove(k);
        return v;
    }

    public Map.Entry<K, V> l(K k) {
        if (contains(k)) {
            return this.Z0.get(k).Y0;
        }
        return null;
    }
}
