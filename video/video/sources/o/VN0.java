package o;

import java.io.Serializable;

@InterfaceC10420wF0(serializable = true)
@InterfaceC6329fa0
/* loaded from: classes3.dex */
public class VN0<K, V> extends M1<K, V> implements Serializable {
    private static final long serialVersionUID = 0;
    @InterfaceC7894ly1
    public final K X;
    @InterfaceC7894ly1
    public final V Y;

    public VN0(@InterfaceC7894ly1 K k, @InterfaceC7894ly1 V v) {
        this.X = k;
        this.Y = v;
    }

    @Override // o.M1, java.util.Map.Entry
    @InterfaceC7894ly1
    public final K getKey() {
        return this.X;
    }

    @Override // o.M1, java.util.Map.Entry
    @InterfaceC7894ly1
    public final V getValue() {
        return this.Y;
    }

    @Override // o.M1, java.util.Map.Entry
    @InterfaceC7894ly1
    public final V setValue(@InterfaceC7894ly1 V v) {
        throw new UnsupportedOperationException();
    }
}
