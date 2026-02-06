package o;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import o.InterfaceC3744Nk2;

@InterfaceC10420wF0
@InterfaceC6329fa0
/* renamed from: o.Ly0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC3598Ly0<R, C, V> extends AbstractC2510Ay0 implements InterfaceC3744Nk2<R, C, V> {
    @Override // o.InterfaceC3744Nk2
    public void D3(InterfaceC3744Nk2<? extends R, ? extends C, ? extends V> interfaceC3744Nk2) {
        L5().D3(interfaceC3744Nk2);
    }

    @Override // o.InterfaceC3744Nk2
    public Set<R> F() {
        return L5().F();
    }

    @Override // o.InterfaceC3744Nk2
    public Map<R, Map<C, V>> H() {
        return L5().H();
    }

    @Override // o.InterfaceC3744Nk2
    public Set<C> L4() {
        return L5().L4();
    }

    @Override // o.InterfaceC3744Nk2
    public boolean M4(@MB Object obj) {
        return L5().M4(obj);
    }

    @Override // o.AbstractC2510Ay0
    /* renamed from: M5 */
    public abstract InterfaceC3744Nk2<R, C, V> L5();

    @Override // o.InterfaceC3744Nk2
    public void clear() {
        L5().clear();
    }

    @Override // o.InterfaceC3744Nk2
    public boolean containsValue(@MB Object obj) {
        return L5().containsValue(obj);
    }

    @Override // o.InterfaceC3744Nk2
    public Map<R, V> d3(@InterfaceC7894ly1 C c) {
        return L5().d3(c);
    }

    @Override // o.InterfaceC3744Nk2
    public boolean equals(@MB Object obj) {
        if (obj != this && !L5().equals(obj)) {
            return false;
        }
        return true;
    }

    @Override // o.InterfaceC3744Nk2
    public int hashCode() {
        return L5().hashCode();
    }

    @Override // o.InterfaceC3744Nk2
    public Map<C, Map<R, V>> i2() {
        return L5().i2();
    }

    @Override // o.InterfaceC3744Nk2
    public boolean i5(@MB Object obj, @MB Object obj2) {
        return L5().i5(obj, obj2);
    }

    @Override // o.InterfaceC3744Nk2
    public boolean isEmpty() {
        return L5().isEmpty();
    }

    @Override // o.InterfaceC3744Nk2
    public Set<InterfaceC3744Nk2.a<R, C, V>> o3() {
        return L5().o3();
    }

    @Override // o.InterfaceC3744Nk2
    @InterfaceC6181ey
    @MB
    public V q3(@InterfaceC7894ly1 R r, @InterfaceC7894ly1 C c, @InterfaceC7894ly1 V v) {
        return L5().q3(r, c, v);
    }

    @Override // o.InterfaceC3744Nk2
    @MB
    public V r0(@MB Object obj, @MB Object obj2) {
        return L5().r0(obj, obj2);
    }

    @Override // o.InterfaceC3744Nk2
    @InterfaceC6181ey
    @MB
    public V remove(@MB Object obj, @MB Object obj2) {
        return L5().remove(obj, obj2);
    }

    @Override // o.InterfaceC3744Nk2
    public int size() {
        return L5().size();
    }

    @Override // o.InterfaceC3744Nk2
    public Collection<V> values() {
        return L5().values();
    }

    @Override // o.InterfaceC3744Nk2
    public Map<C, V> x5(@InterfaceC7894ly1 R r) {
        return L5().x5(r);
    }

    @Override // o.InterfaceC3744Nk2
    public boolean y0(@MB Object obj) {
        return L5().y0(obj);
    }
}
