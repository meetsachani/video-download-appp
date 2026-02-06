package o;

import android.util.ArrayMap;
import java.util.Collections;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;
import o.HJ;

/* renamed from: o.Bn1 */
/* loaded from: classes.dex */
public final class C2569Bn1 extends C5932dw1 implements InterfaceC3849Om1 {
    public static final HJ.c N = HJ.c.OPTIONAL;

    public C2569Bn1(TreeMap<HJ.a<?>, Map<HJ.c, Object>> treeMap) {
        super(treeMap);
    }

    public static C2569Bn1 u0() {
        return new C2569Bn1(new TreeMap(C5932dw1.L));
    }

    public static C2569Bn1 v0(HJ hj) {
        TreeMap treeMap = new TreeMap(C5932dw1.L);
        for (HJ.a<?> aVar : hj.f()) {
            Set<HJ.c> a = hj.a(aVar);
            ArrayMap arrayMap = new ArrayMap();
            for (HJ.c cVar : a) {
                arrayMap.put(cVar, hj.l(aVar, cVar));
            }
            treeMap.put(aVar, arrayMap);
        }
        return new C2569Bn1(treeMap);
    }

    @Override // o.InterfaceC3849Om1
    public <ValueT> void M(HJ.a<ValueT> aVar, HJ.c cVar, ValueT valuet) {
        Map<HJ.c, Object> map = this.K.get(aVar);
        if (map == null) {
            ArrayMap arrayMap = new ArrayMap();
            this.K.put(aVar, arrayMap);
            arrayMap.put(cVar, valuet);
            return;
        }
        HJ.c cVar2 = (HJ.c) Collections.min(map.keySet());
        if (!Objects.equals(map.get(cVar2), valuet) && HJ.m0(cVar2, cVar)) {
            throw new IllegalArgumentException("Option values conflicts: " + aVar.c() + ", existing value (" + cVar2 + ")=" + map.get(cVar2) + ", conflicting (" + cVar + ")=" + valuet);
        }
        map.put(cVar, valuet);
    }

    @Override // o.InterfaceC3849Om1
    public <ValueT> ValueT Q(HJ.a<ValueT> aVar) {
        return (ValueT) this.K.remove(aVar);
    }

    @Override // o.InterfaceC3849Om1
    public <ValueT> void h0(HJ.a<ValueT> aVar, ValueT valuet) {
        M(aVar, N, valuet);
    }
}
