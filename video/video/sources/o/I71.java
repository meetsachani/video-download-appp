package o;

import java.util.Collections;
import java.util.Map;

/* loaded from: classes2.dex */
public final class I71<K, V> {
    public final Map<K, V> a;

    public I71(int i) {
        this.a = YT.d(i);
    }

    public static <K, V> I71<K, V> b(int i) {
        return new I71<>(i);
    }

    public Map<K, V> a() {
        if (this.a.size() != 0) {
            return Collections.unmodifiableMap(this.a);
        }
        return Collections.EMPTY_MAP;
    }

    public I71<K, V> c(K k, V v) {
        this.a.put(k, v);
        return this;
    }

    public I71<K, V> d(Map<K, V> map) {
        this.a.putAll(map);
        return this;
    }
}
