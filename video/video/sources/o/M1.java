package o;

import java.util.Map;

@InterfaceC10420wF0
@InterfaceC6329fa0
/* loaded from: classes3.dex */
public abstract class M1<K, V> implements Map.Entry<K, V> {
    @Override // java.util.Map.Entry
    public boolean equals(@MB Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            if (C2593Bt1.a(getKey(), entry.getKey()) && C2593Bt1.a(getValue(), entry.getValue())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    @InterfaceC7894ly1
    public abstract K getKey();

    @Override // java.util.Map.Entry
    @InterfaceC7894ly1
    public abstract V getValue();

    @Override // java.util.Map.Entry
    public int hashCode() {
        int hashCode;
        K key = getKey();
        V value = getValue();
        int i = 0;
        if (key == null) {
            hashCode = 0;
        } else {
            hashCode = key.hashCode();
        }
        if (value != null) {
            i = value.hashCode();
        }
        return hashCode ^ i;
    }

    @Override // java.util.Map.Entry
    @InterfaceC7894ly1
    public V setValue(@InterfaceC7894ly1 V v) {
        throw new UnsupportedOperationException();
    }

    public String toString() {
        String valueOf = String.valueOf(getKey());
        String valueOf2 = String.valueOf(getValue());
        StringBuilder sb = new StringBuilder(valueOf.length() + 1 + valueOf2.length());
        sb.append(valueOf);
        sb.append("=");
        sb.append(valueOf2);
        return sb.toString();
    }
}
