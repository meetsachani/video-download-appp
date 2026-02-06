package o;

/* renamed from: o.st  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9598st<K, V> extends C2531Be<K, V> {
    public int b1;

    @Override // o.C9654t62, java.util.Map
    public void clear() {
        this.b1 = 0;
        super.clear();
    }

    @Override // o.C9654t62, java.util.Map
    public int hashCode() {
        if (this.b1 == 0) {
            this.b1 = super.hashCode();
        }
        return this.b1;
    }

    @Override // o.C9654t62
    public void i(C9654t62<? extends K, ? extends V> c9654t62) {
        this.b1 = 0;
        super.i(c9654t62);
    }

    @Override // o.C9654t62
    public V j(int i) {
        this.b1 = 0;
        return (V) super.j(i);
    }

    @Override // o.C9654t62
    public V k(int i, V v) {
        this.b1 = 0;
        return (V) super.k(i, v);
    }

    @Override // o.C9654t62, java.util.Map
    public V put(K k, V v) {
        this.b1 = 0;
        return (V) super.put(k, v);
    }
}
