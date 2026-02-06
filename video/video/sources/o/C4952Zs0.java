package o;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

@InterfaceC10420wF0
@InterfaceC6329fa0
/* renamed from: o.Zs0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4952Zs0<K, V> extends C4748Xs0<K, V> implements InterfaceC6405ft0<K, V> {
    public C4952Zs0(InterfaceC8660p22<K, V> interfaceC8660p22, IF1<? super Map.Entry<K, V>> if1) {
        super(interfaceC8660p22, if1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.C4748Xs0, o.InterfaceC10058um1, o.InterfaceC8660p22
    public /* bridge */ /* synthetic */ Collection get(@InterfaceC7894ly1 Object obj) {
        return get((C4952Zs0<K, V>) obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.AbstractC6939i2, o.InterfaceC10058um1, o.InterfaceC8660p22
    public /* bridge */ /* synthetic */ Collection j(@InterfaceC7894ly1 Object obj, Iterable iterable) {
        return j((C4952Zs0<K, V>) obj, iterable);
    }

    @Override // o.C4748Xs0, o.AbstractC6939i2
    /* renamed from: p */
    public Set<Map.Entry<K, V>> b() {
        return C10856y22.i(G().r(), Q3());
    }

    @Override // o.C4748Xs0, o.InterfaceC5919dt0
    public InterfaceC8660p22<K, V> G() {
        return (InterfaceC8660p22) this.a1;
    }

    @Override // o.C4748Xs0, o.InterfaceC10058um1, o.InterfaceC8660p22
    public Set<V> get(@InterfaceC7894ly1 K k) {
        return (Set) super.get((C4952Zs0<K, V>) k);
    }

    @Override // o.C4748Xs0, o.InterfaceC10058um1, o.InterfaceC8660p22
    public Set<V> i(@MB Object obj) {
        return (Set) super.i(obj);
    }

    @Override // o.AbstractC6939i2, o.InterfaceC10058um1, o.InterfaceC8660p22
    public Set<V> j(@InterfaceC7894ly1 K k, Iterable<? extends V> iterable) {
        return (Set) super.j((C4952Zs0<K, V>) k, (Iterable) iterable);
    }

    @Override // o.AbstractC6939i2, o.InterfaceC10058um1, o.InterfaceC8660p22
    public Set<Map.Entry<K, V>> r() {
        return (Set) super.r();
    }
}
