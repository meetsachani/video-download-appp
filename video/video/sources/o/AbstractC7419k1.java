package o;

/* renamed from: o.k1  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC7419k1<K, V> implements JX0<K, V> {
    public K X;
    public V Y;

    public AbstractC7419k1(K k, V v) {
        this.X = k;
        this.Y = v;
    }

    public K a(K k) {
        K k2 = this.X;
        this.X = k;
        return k2;
    }

    @Override // o.JX0
    public K getKey() {
        return this.X;
    }

    @Override // o.JX0
    public V getValue() {
        return this.Y;
    }

    public V setValue(V v) {
        V v2 = this.Y;
        this.Y = v;
        return v2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getKey());
        sb.append('=');
        sb.append(getValue());
        return sb.toString();
    }
}
