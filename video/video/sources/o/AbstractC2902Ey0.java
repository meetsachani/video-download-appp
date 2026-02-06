package o;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

@InterfaceC10420wF0
@InterfaceC6329fa0
/* renamed from: o.Ey0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC2902Ey0<K, V> extends AbstractC10351vy0<K, V> implements InterfaceC8660p22<K, V> {
    @Override // o.AbstractC10351vy0
    /* renamed from: N5 */
    public abstract InterfaceC8660p22<K, V> M5();

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.AbstractC10351vy0, o.InterfaceC10058um1, o.InterfaceC8660p22
    public /* bridge */ /* synthetic */ Collection get(@InterfaceC7894ly1 Object obj) {
        return get((AbstractC2902Ey0<K, V>) obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.AbstractC10351vy0, o.InterfaceC10058um1, o.InterfaceC8660p22
    @InterfaceC6181ey
    public /* bridge */ /* synthetic */ Collection j(@InterfaceC7894ly1 Object obj, Iterable iterable) {
        return j((AbstractC2902Ey0<K, V>) obj, iterable);
    }

    @Override // o.AbstractC10351vy0, o.InterfaceC10058um1, o.InterfaceC8660p22
    public Set<V> get(@InterfaceC7894ly1 K k) {
        return M5().get((InterfaceC8660p22<K, V>) k);
    }

    @Override // o.AbstractC10351vy0, o.InterfaceC10058um1, o.InterfaceC8660p22
    @InterfaceC6181ey
    public Set<V> i(@MB Object obj) {
        return M5().i(obj);
    }

    @Override // o.AbstractC10351vy0, o.InterfaceC10058um1, o.InterfaceC8660p22
    @InterfaceC6181ey
    public Set<V> j(@InterfaceC7894ly1 K k, Iterable<? extends V> iterable) {
        return M5().j((InterfaceC8660p22<K, V>) k, (Iterable) iterable);
    }

    @Override // o.AbstractC10351vy0, o.InterfaceC10058um1, o.InterfaceC8660p22
    public Set<Map.Entry<K, V>> r() {
        return M5().r();
    }
}
