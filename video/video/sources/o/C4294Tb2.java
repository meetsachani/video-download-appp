package o;

import java.util.Comparator;
import java.util.Map;
import java.util.SortedMap;
import java.util.SortedSet;
import o.C7935m81;

@InterfaceC10420wF0
@InterfaceC6329fa0
/* renamed from: o.Tb2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C4294Tb2<R, C, V> extends C4488Vb2<R, C, V> implements InterfaceC10238vV1<R, C, V> {
    private static final long serialVersionUID = 0;

    /* renamed from: o.Tb2$b */
    /* loaded from: classes3.dex */
    public class b extends C4488Vb2<R, C, V>.h implements SortedMap<R, Map<C, V>> {
        public b() {
            super();
        }

        @Override // java.util.SortedMap
        @MB
        public Comparator<? super R> comparator() {
            return C4294Tb2.this.p().comparator();
        }

        @Override // o.C7935m81.R
        /* renamed from: f */
        public SortedSet<R> b() {
            return new C7935m81.G(this);
        }

        @Override // java.util.SortedMap
        public R firstKey() {
            return (R) C4294Tb2.this.p().firstKey();
        }

        @Override // o.C7935m81.R, java.util.AbstractMap, java.util.Map
        /* renamed from: g */
        public SortedSet<R> keySet() {
            return (SortedSet) super.keySet();
        }

        @Override // java.util.SortedMap
        public SortedMap<R, Map<C, V>> headMap(R r) {
            C10664xF1.E(r);
            return new C4294Tb2(C4294Tb2.this.p().headMap(r), C4294Tb2.this.Y0).H();
        }

        @Override // java.util.SortedMap
        public R lastKey() {
            return (R) C4294Tb2.this.p().lastKey();
        }

        @Override // java.util.SortedMap
        public SortedMap<R, Map<C, V>> subMap(R r, R r2) {
            C10664xF1.E(r);
            C10664xF1.E(r2);
            return new C4294Tb2(C4294Tb2.this.p().subMap(r, r2), C4294Tb2.this.Y0).H();
        }

        @Override // java.util.SortedMap
        public SortedMap<R, Map<C, V>> tailMap(R r) {
            C10664xF1.E(r);
            return new C4294Tb2(C4294Tb2.this.p().tailMap(r), C4294Tb2.this.Y0).H();
        }
    }

    public C4294Tb2(SortedMap<R, Map<C, V>> sortedMap, InterfaceC8331nh2<? extends Map<C, V>> interfaceC8331nh2) {
        super(sortedMap, interfaceC8331nh2);
    }

    @Override // o.C4488Vb2
    /* renamed from: o */
    public SortedMap<R, Map<C, V>> j() {
        return new b();
    }

    public final SortedMap<R, Map<C, V>> p() {
        return (SortedMap) this.Z;
    }

    @Override // o.C4488Vb2, o.AbstractC10614x3, o.InterfaceC3744Nk2
    public SortedSet<R> F() {
        return (SortedSet) H().keySet();
    }

    @Override // o.C4488Vb2, o.InterfaceC3744Nk2
    public SortedMap<R, Map<C, V>> H() {
        return (SortedMap) super.H();
    }
}
