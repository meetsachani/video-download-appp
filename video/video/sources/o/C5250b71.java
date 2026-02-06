package o;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: o.b71  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5250b71<K, V> {
    public final LinkedHashMap<K, V> a;

    public C5250b71() {
        this(0, 0.0f, 3, null);
    }

    public final V a(K k) {
        C6562gT0.p(k, "key");
        return this.a.get(k);
    }

    public final Set<Map.Entry<K, V>> b() {
        Set<Map.Entry<K, V>> entrySet = this.a.entrySet();
        C6562gT0.o(entrySet, "map.entries");
        return entrySet;
    }

    public final boolean c() {
        return this.a.isEmpty();
    }

    public final V d(K k, V v) {
        C6562gT0.p(k, "key");
        C6562gT0.p(v, "value");
        return this.a.put(k, v);
    }

    public final V e(K k) {
        C6562gT0.p(k, "key");
        return this.a.remove(k);
    }

    public C5250b71(int i, float f) {
        this.a = new LinkedHashMap<>(i, f, true);
    }

    public /* synthetic */ C5250b71(int i, float f, int i2, C9516sY c9516sY) {
        this((i2 & 1) != 0 ? 16 : i, (i2 & 2) != 0 ? 0.75f : f);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C5250b71(C5250b71<? extends K, V> c5250b71) {
        this(0, 0.0f, 3, null);
        C6562gT0.p(c5250b71, "original");
        for (Map.Entry<? extends K, V> entry : c5250b71.b()) {
            d(entry.getKey(), entry.getValue());
        }
    }
}
