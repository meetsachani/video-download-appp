package o;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

@InterfaceC10420wF0
@InterfaceC6329fa0
/* renamed from: o.ct0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5677ct0<K, V> extends C5435bt0<K, V> implements InterfaceC6405ft0<K, V> {

    /* renamed from: o.ct0$a */
    /* loaded from: classes3.dex */
    public class a extends C5435bt0<K, V>.c implements Set<Map.Entry<K, V>> {
        public a(C5677ct0 c5677ct0) {
            super();
        }

        @Override // java.util.Collection, java.util.Set
        public boolean equals(@MB Object obj) {
            return C10856y22.g(this, obj);
        }

        @Override // java.util.Collection, java.util.Set
        public int hashCode() {
            return C10856y22.k(this);
        }
    }

    public C5677ct0(InterfaceC8660p22<K, V> interfaceC8660p22, IF1<? super K> if1) {
        super(interfaceC8660p22, if1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.C5435bt0, o.InterfaceC10058um1, o.InterfaceC8660p22
    public /* bridge */ /* synthetic */ Collection get(@InterfaceC7894ly1 Object obj) {
        return get((C5677ct0<K, V>) obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.AbstractC6939i2, o.InterfaceC10058um1, o.InterfaceC8660p22
    public /* bridge */ /* synthetic */ Collection j(@InterfaceC7894ly1 Object obj, Iterable iterable) {
        return j((C5677ct0<K, V>) obj, iterable);
    }

    @Override // o.C5435bt0, o.AbstractC6939i2
    /* renamed from: k */
    public Set<Map.Entry<K, V>> b() {
        return new a(this);
    }

    @Override // o.C5435bt0, o.InterfaceC5919dt0
    public InterfaceC8660p22<K, V> G() {
        return (InterfaceC8660p22) this.a1;
    }

    @Override // o.C5435bt0, o.InterfaceC10058um1, o.InterfaceC8660p22
    public Set<V> get(@InterfaceC7894ly1 K k) {
        return (Set) super.get((C5677ct0<K, V>) k);
    }

    @Override // o.C5435bt0, o.InterfaceC10058um1, o.InterfaceC8660p22
    public Set<V> i(@MB Object obj) {
        return (Set) super.i(obj);
    }

    @Override // o.AbstractC6939i2, o.InterfaceC10058um1, o.InterfaceC8660p22
    public Set<V> j(@InterfaceC7894ly1 K k, Iterable<? extends V> iterable) {
        return (Set) super.j((C5677ct0<K, V>) k, (Iterable) iterable);
    }

    @Override // o.AbstractC6939i2, o.InterfaceC10058um1, o.InterfaceC8660p22
    public Set<Map.Entry<K, V>> r() {
        return (Set) super.r();
    }
}
