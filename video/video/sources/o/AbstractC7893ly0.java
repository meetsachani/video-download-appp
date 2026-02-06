package o;

import java.util.Collection;
import java.util.List;

@InterfaceC10420wF0
@InterfaceC6329fa0
/* renamed from: o.ly0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC7893ly0<K, V> extends AbstractC10351vy0<K, V> implements V01<K, V> {
    @Override // o.AbstractC10351vy0
    /* renamed from: N5 */
    public abstract V01<K, V> M5();

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.AbstractC10351vy0, o.InterfaceC10058um1, o.InterfaceC8660p22
    public /* bridge */ /* synthetic */ Collection get(@InterfaceC7894ly1 Object obj) {
        return get((AbstractC7893ly0<K, V>) obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.AbstractC10351vy0, o.InterfaceC10058um1, o.InterfaceC8660p22
    @InterfaceC6181ey
    public /* bridge */ /* synthetic */ Collection j(@InterfaceC7894ly1 Object obj, Iterable iterable) {
        return j((AbstractC7893ly0<K, V>) obj, iterable);
    }

    @Override // o.AbstractC10351vy0, o.InterfaceC10058um1, o.InterfaceC8660p22
    public List<V> get(@InterfaceC7894ly1 K k) {
        return M5().get((V01<K, V>) k);
    }

    @Override // o.AbstractC10351vy0, o.InterfaceC10058um1, o.InterfaceC8660p22
    @InterfaceC6181ey
    public List<V> i(@MB Object obj) {
        return M5().i(obj);
    }

    @Override // o.AbstractC10351vy0, o.InterfaceC10058um1, o.InterfaceC8660p22
    @InterfaceC6181ey
    public List<V> j(@InterfaceC7894ly1 K k, Iterable<? extends V> iterable) {
        return M5().j((V01<K, V>) k, (Iterable) iterable);
    }
}
