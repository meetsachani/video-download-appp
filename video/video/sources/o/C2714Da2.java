package o;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import o.AbstractC6044eO0;
import o.BO0;
import o.InterfaceC3744Nk2;

@NN0(containerOf = {"R", "C", C2638Cg0.X4})
@InterfaceC10420wF0
@InterfaceC6329fa0
/* renamed from: o.Da2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2714Da2<R, C, V> extends WQ1<R, C, V> {
    public static final BO0<Object, Object, Object> b1 = new C2714Da2(AbstractC5317bO0.L(), AbstractC9481sO0.M(), AbstractC9481sO0.M());
    public final AbstractC6044eO0<C, AbstractC6044eO0<R, V>> Y0;
    public final AbstractC6044eO0<R, AbstractC6044eO0<C, V>> Z;
    public final int[] Z0;
    public final int[] a1;

    /* JADX WARN: Multi-variable type inference failed */
    public C2714Da2(AbstractC5317bO0<InterfaceC3744Nk2.a<R, C, V>> abstractC5317bO0, AbstractC9481sO0<R> abstractC9481sO0, AbstractC9481sO0<C> abstractC9481sO02) {
        AbstractC6044eO0 Q = C7935m81.Q(abstractC9481sO0);
        LinkedHashMap c0 = C7935m81.c0();
        AbstractC6237fB2<R> it = abstractC9481sO0.iterator();
        while (it.hasNext()) {
            c0.put(it.next(), new LinkedHashMap());
        }
        LinkedHashMap c02 = C7935m81.c0();
        AbstractC6237fB2<C> it2 = abstractC9481sO02.iterator();
        while (it2.hasNext()) {
            c02.put(it2.next(), new LinkedHashMap());
        }
        int[] iArr = new int[abstractC5317bO0.size()];
        int[] iArr2 = new int[abstractC5317bO0.size()];
        for (int i = 0; i < abstractC5317bO0.size(); i++) {
            InterfaceC3744Nk2.a<R, C, V> aVar = abstractC5317bO0.get(i);
            R a = aVar.a();
            C b = aVar.b();
            V value = aVar.getValue();
            Integer num = (Integer) Q.get(a);
            Objects.requireNonNull(num);
            iArr[i] = num.intValue();
            Map map = (Map) c0.get(a);
            Objects.requireNonNull(map);
            Map map2 = map;
            iArr2[i] = map2.size();
            x(a, b, map2.put(b, value), value);
            Map map3 = (Map) c02.get(b);
            Objects.requireNonNull(map3);
            map3.put(a, value);
        }
        this.Z0 = iArr;
        this.a1 = iArr2;
        AbstractC6044eO0.b bVar = new AbstractC6044eO0.b(c0.size());
        for (Map.Entry entry : c0.entrySet()) {
            bVar.i(entry.getKey(), AbstractC6044eO0.g((Map) entry.getValue()));
        }
        this.Z = bVar.d();
        AbstractC6044eO0.b bVar2 = new AbstractC6044eO0.b(c02.size());
        for (Map.Entry entry2 : c02.entrySet()) {
            bVar2.i(entry2.getKey(), AbstractC6044eO0.g((Map) entry2.getValue()));
        }
        this.Y0 = bVar2.d();
    }

    @Override // o.WQ1
    public InterfaceC3744Nk2.a<R, C, V> C(int i) {
        Map.Entry<R, AbstractC6044eO0<C, V>> entry = this.Z.entrySet().d().get(this.Z0[i]);
        Map.Entry<C, V> entry2 = entry.getValue().entrySet().d().get(this.a1[i]);
        return BO0.g(entry.getKey(), entry2.getKey(), entry2.getValue());
    }

    @Override // o.WQ1
    public V D(int i) {
        int i2 = this.Z0[i];
        return this.Z.values().d().get(i2).values().d().get(this.a1[i]);
    }

    @Override // o.BO0, o.InterfaceC3744Nk2
    /* renamed from: k */
    public AbstractC6044eO0<C, Map<R, V>> i2() {
        return AbstractC6044eO0.g(this.Y0);
    }

    @Override // o.BO0
    public BO0.b o() {
        AbstractC6044eO0 Q = C7935m81.Q(L4());
        int[] iArr = new int[o3().size()];
        AbstractC6237fB2<InterfaceC3744Nk2.a<R, C, V>> it = o3().iterator();
        int i = 0;
        while (it.hasNext()) {
            Integer num = (Integer) Q.get(it.next().b());
            Objects.requireNonNull(num);
            iArr[i] = num.intValue();
            i++;
        }
        return BO0.b.a(this, this.Z0, iArr);
    }

    @Override // o.InterfaceC3744Nk2
    public int size() {
        return this.Z0.length;
    }

    @Override // o.BO0, o.InterfaceC3744Nk2
    /* renamed from: u */
    public AbstractC6044eO0<R, Map<C, V>> H() {
        return AbstractC6044eO0.g(this.Z);
    }
}
