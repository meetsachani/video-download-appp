package o;

import java.util.Collection;
import java.util.Comparator;
import java.util.Set;
import java.util.SortedSet;

@InterfaceC10420wF0
@InterfaceC6329fa0
/* renamed from: o.Jy0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC3403Jy0<K, V> extends AbstractC2902Ey0<K, V> implements InterfaceC6829ha2<K, V> {
    @Override // o.AbstractC2902Ey0
    /* renamed from: O5 */
    public abstract InterfaceC6829ha2<K, V> N5();

    @Override // o.InterfaceC6829ha2
    @MB
    public Comparator<? super V> U() {
        return N5().U();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.AbstractC2902Ey0, o.AbstractC10351vy0, o.InterfaceC10058um1, o.InterfaceC8660p22
    public /* bridge */ /* synthetic */ Collection get(@InterfaceC7894ly1 Object obj) {
        return get((AbstractC3403Jy0<K, V>) obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.AbstractC2902Ey0, o.AbstractC10351vy0, o.InterfaceC10058um1, o.InterfaceC8660p22
    public /* bridge */ /* synthetic */ Collection j(@InterfaceC7894ly1 Object obj, Iterable iterable) {
        return j((AbstractC3403Jy0<K, V>) obj, iterable);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.AbstractC2902Ey0, o.AbstractC10351vy0, o.InterfaceC10058um1, o.InterfaceC8660p22
    public /* bridge */ /* synthetic */ Set get(@InterfaceC7894ly1 Object obj) {
        return get((AbstractC3403Jy0<K, V>) obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.AbstractC2902Ey0, o.AbstractC10351vy0, o.InterfaceC10058um1, o.InterfaceC8660p22
    public /* bridge */ /* synthetic */ Set j(@InterfaceC7894ly1 Object obj, Iterable iterable) {
        return j((AbstractC3403Jy0<K, V>) obj, iterable);
    }

    @Override // o.AbstractC2902Ey0, o.AbstractC10351vy0, o.InterfaceC10058um1, o.InterfaceC8660p22
    public SortedSet<V> get(@InterfaceC7894ly1 K k) {
        return N5().get((InterfaceC6829ha2<K, V>) k);
    }

    @Override // o.AbstractC2902Ey0, o.AbstractC10351vy0, o.InterfaceC10058um1, o.InterfaceC8660p22
    public SortedSet<V> i(@MB Object obj) {
        return N5().i(obj);
    }

    @Override // o.AbstractC2902Ey0, o.AbstractC10351vy0, o.InterfaceC10058um1, o.InterfaceC8660p22
    public SortedSet<V> j(@InterfaceC7894ly1 K k, Iterable<? extends V> iterable) {
        return N5().j((InterfaceC6829ha2<K, V>) k, (Iterable) iterable);
    }
}
