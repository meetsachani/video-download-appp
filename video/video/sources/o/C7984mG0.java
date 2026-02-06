package o;

import java.io.Serializable;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

@InterfaceC10420wF0(serializable = true)
@InterfaceC6329fa0
/* renamed from: o.mG0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C7984mG0<R, C, V> extends C4488Vb2<R, C, V> {
    private static final long serialVersionUID = 0;

    /* renamed from: o.mG0$a */
    /* loaded from: classes3.dex */
    public static class a<C, V> implements InterfaceC8331nh2<Map<C, V>>, Serializable {
        private static final long serialVersionUID = 0;
        public final int X;

        public a(int i) {
            this.X = i;
        }

        @Override // o.InterfaceC8331nh2
        /* renamed from: a */
        public Map<C, V> get() {
            return C7935m81.e0(this.X);
        }
    }

    public C7984mG0(Map<R, Map<C, V>> map, a<C, V> aVar) {
        super(map, aVar);
    }

    public static <R, C, V> C7984mG0<R, C, V> n() {
        return new C7984mG0<>(new LinkedHashMap(), new a(0));
    }

    public static <R, C, V> C7984mG0<R, C, V> o(int i, int i2) {
        C5037aF.b(i2, "expectedCellsPerRow");
        return new C7984mG0<>(C7935m81.e0(i), new a(i2));
    }

    public static <R, C, V> C7984mG0<R, C, V> p(InterfaceC3744Nk2<? extends R, ? extends C, ? extends V> interfaceC3744Nk2) {
        C7984mG0<R, C, V> n = n();
        n.D3(interfaceC3744Nk2);
        return n;
    }

    @Override // o.AbstractC10614x3, o.InterfaceC3744Nk2
    public /* bridge */ /* synthetic */ void D3(InterfaceC3744Nk2 interfaceC3744Nk2) {
        super.D3(interfaceC3744Nk2);
    }

    @Override // o.C4488Vb2, o.AbstractC10614x3, o.InterfaceC3744Nk2
    public /* bridge */ /* synthetic */ Set F() {
        return super.F();
    }

    @Override // o.C4488Vb2, o.InterfaceC3744Nk2
    public /* bridge */ /* synthetic */ Map H() {
        return super.H();
    }

    @Override // o.C4488Vb2, o.AbstractC10614x3, o.InterfaceC3744Nk2
    public /* bridge */ /* synthetic */ Set L4() {
        return super.L4();
    }

    @Override // o.C4488Vb2, o.AbstractC10614x3, o.InterfaceC3744Nk2
    public /* bridge */ /* synthetic */ boolean M4(@MB Object obj) {
        return super.M4(obj);
    }

    @Override // o.C4488Vb2, o.AbstractC10614x3, o.InterfaceC3744Nk2
    public /* bridge */ /* synthetic */ void clear() {
        super.clear();
    }

    @Override // o.C4488Vb2, o.AbstractC10614x3, o.InterfaceC3744Nk2
    public /* bridge */ /* synthetic */ boolean containsValue(@MB Object obj) {
        return super.containsValue(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.C4488Vb2, o.InterfaceC3744Nk2
    public /* bridge */ /* synthetic */ Map d3(Object obj) {
        return super.d3(obj);
    }

    @Override // o.AbstractC10614x3, o.InterfaceC3744Nk2
    public /* bridge */ /* synthetic */ boolean equals(@MB Object obj) {
        return super.equals(obj);
    }

    @Override // o.AbstractC10614x3, o.InterfaceC3744Nk2
    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // o.C4488Vb2, o.InterfaceC3744Nk2
    public /* bridge */ /* synthetic */ Map i2() {
        return super.i2();
    }

    @Override // o.C4488Vb2, o.AbstractC10614x3, o.InterfaceC3744Nk2
    public /* bridge */ /* synthetic */ boolean i5(@MB Object obj, @MB Object obj2) {
        return super.i5(obj, obj2);
    }

    @Override // o.C4488Vb2, o.AbstractC10614x3, o.InterfaceC3744Nk2
    public /* bridge */ /* synthetic */ boolean isEmpty() {
        return super.isEmpty();
    }

    @Override // o.C4488Vb2, o.AbstractC10614x3, o.InterfaceC3744Nk2
    public /* bridge */ /* synthetic */ Set o3() {
        return super.o3();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.C4488Vb2, o.AbstractC10614x3, o.InterfaceC3744Nk2
    @InterfaceC6181ey
    @MB
    public /* bridge */ /* synthetic */ Object q3(Object obj, Object obj2, Object obj3) {
        return super.q3(obj, obj2, obj3);
    }

    @Override // o.C4488Vb2, o.AbstractC10614x3, o.InterfaceC3744Nk2
    @MB
    public /* bridge */ /* synthetic */ Object r0(@MB Object obj, @MB Object obj2) {
        return super.r0(obj, obj2);
    }

    @Override // o.C4488Vb2, o.AbstractC10614x3, o.InterfaceC3744Nk2
    @InterfaceC6181ey
    @MB
    public /* bridge */ /* synthetic */ Object remove(@MB Object obj, @MB Object obj2) {
        return super.remove(obj, obj2);
    }

    @Override // o.C4488Vb2, o.InterfaceC3744Nk2
    public /* bridge */ /* synthetic */ int size() {
        return super.size();
    }

    @Override // o.AbstractC10614x3
    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }

    @Override // o.C4488Vb2, o.AbstractC10614x3, o.InterfaceC3744Nk2
    public /* bridge */ /* synthetic */ Collection values() {
        return super.values();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.C4488Vb2, o.InterfaceC3744Nk2
    public /* bridge */ /* synthetic */ Map x5(Object obj) {
        return super.x5(obj);
    }

    @Override // o.C4488Vb2, o.AbstractC10614x3, o.InterfaceC3744Nk2
    public /* bridge */ /* synthetic */ boolean y0(@MB Object obj) {
        return super.y0(obj);
    }
}
