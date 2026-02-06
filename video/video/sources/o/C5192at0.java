package o;

import java.util.Collection;
import java.util.List;

@InterfaceC10420wF0
@InterfaceC6329fa0
/* renamed from: o.at0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5192at0<K, V> extends C5435bt0<K, V> implements V01<K, V> {
    public C5192at0(V01<K, V> v01, IF1<? super K> if1) {
        super(v01, if1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.C5435bt0, o.InterfaceC10058um1, o.InterfaceC8660p22
    public /* bridge */ /* synthetic */ Collection get(@InterfaceC7894ly1 Object obj) {
        return get((C5192at0<K, V>) obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.AbstractC6939i2, o.InterfaceC10058um1, o.InterfaceC8660p22
    public /* bridge */ /* synthetic */ Collection j(@InterfaceC7894ly1 Object obj, Iterable iterable) {
        return j((C5192at0<K, V>) obj, iterable);
    }

    @Override // o.C5435bt0, o.InterfaceC5919dt0
    /* renamed from: k */
    public V01<K, V> G() {
        return (V01) super.G();
    }

    @Override // o.C5435bt0, o.InterfaceC10058um1, o.InterfaceC8660p22
    public List<V> get(@InterfaceC7894ly1 K k) {
        return (List) super.get((C5192at0<K, V>) k);
    }

    @Override // o.C5435bt0, o.InterfaceC10058um1, o.InterfaceC8660p22
    public List<V> i(@MB Object obj) {
        return (List) super.i(obj);
    }

    @Override // o.AbstractC6939i2, o.InterfaceC10058um1, o.InterfaceC8660p22
    public List<V> j(@InterfaceC7894ly1 K k, Iterable<? extends V> iterable) {
        return (List) super.j((C5192at0<K, V>) k, (Iterable) iterable);
    }
}
