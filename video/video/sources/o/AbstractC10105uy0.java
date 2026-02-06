package o;

import java.util.Map;

@InterfaceC10420wF0
@InterfaceC6329fa0
/* renamed from: o.uy0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC10105uy0<K, V> extends AbstractC2510Ay0 implements Map.Entry<K, V> {
    @Override // o.AbstractC2510Ay0
    /* renamed from: M5 */
    public abstract Map.Entry<K, V> L5();

    public boolean N5(@MB Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            if (C2593Bt1.a(getKey(), entry.getKey()) && C2593Bt1.a(getValue(), entry.getValue())) {
                return true;
            }
        }
        return false;
    }

    public int O5() {
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

    @InterfaceC4238Sm
    public String P5() {
        String valueOf = String.valueOf(getKey());
        String valueOf2 = String.valueOf(getValue());
        StringBuilder sb = new StringBuilder(valueOf.length() + 1 + valueOf2.length());
        sb.append(valueOf);
        sb.append("=");
        sb.append(valueOf2);
        return sb.toString();
    }

    public boolean equals(@MB Object obj) {
        return L5().equals(obj);
    }

    @Override // java.util.Map.Entry
    @InterfaceC7894ly1
    public K getKey() {
        return L5().getKey();
    }

    @InterfaceC7894ly1
    public V getValue() {
        return L5().getValue();
    }

    @Override // java.util.Map.Entry
    public int hashCode() {
        return L5().hashCode();
    }

    @InterfaceC7894ly1
    public V setValue(@InterfaceC7894ly1 V v) {
        return L5().setValue(v);
    }
}
