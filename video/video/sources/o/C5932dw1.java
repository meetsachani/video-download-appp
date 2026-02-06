package o;

import android.util.ArrayMap;
import java.util.Collections;
import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import o.HJ;

/* renamed from: o.dw1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C5932dw1 implements HJ {
    public static final Comparator<HJ.a<?>> L;
    public static final C5932dw1 M;
    public final TreeMap<HJ.a<?>, Map<HJ.c, Object>> K;

    static {
        Comparator<HJ.a<?>> comparator = new Comparator() { // from class: o.cw1
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int compareTo;
                compareTo = ((HJ.a) obj).c().compareTo(((HJ.a) obj2).c());
                return compareTo;
            }
        };
        L = comparator;
        M = new C5932dw1(new TreeMap(comparator));
    }

    public C5932dw1(TreeMap<HJ.a<?>, Map<HJ.c, Object>> treeMap) {
        this.K = treeMap;
    }

    public static C5932dw1 s0() {
        return M;
    }

    public static C5932dw1 t0(HJ hj) {
        if (C5932dw1.class.equals(hj.getClass())) {
            return (C5932dw1) hj;
        }
        TreeMap treeMap = new TreeMap(L);
        for (HJ.a<?> aVar : hj.f()) {
            Set<HJ.c> a = hj.a(aVar);
            ArrayMap arrayMap = new ArrayMap();
            for (HJ.c cVar : a) {
                arrayMap.put(cVar, hj.l(aVar, cVar));
            }
            treeMap.put(aVar, arrayMap);
        }
        return new C5932dw1(treeMap);
    }

    @Override // o.HJ
    public Set<HJ.c> a(HJ.a<?> aVar) {
        Map<HJ.c, Object> map = this.K.get(aVar);
        if (map == null) {
            return Collections.EMPTY_SET;
        }
        return Collections.unmodifiableSet(map.keySet());
    }

    @Override // o.HJ
    public Set<HJ.a<?>> f() {
        return Collections.unmodifiableSet(this.K.keySet());
    }

    @Override // o.HJ
    public boolean g(HJ.a<?> aVar) {
        return this.K.containsKey(aVar);
    }

    @Override // o.HJ
    public <ValueT> ValueT h(HJ.a<ValueT> aVar, ValueT valuet) {
        try {
            return (ValueT) j(aVar);
        } catch (IllegalArgumentException unused) {
            return valuet;
        }
    }

    @Override // o.HJ
    public HJ.c i(HJ.a<?> aVar) {
        Map<HJ.c, Object> map = this.K.get(aVar);
        if (map != null) {
            return (HJ.c) Collections.min(map.keySet());
        }
        throw new IllegalArgumentException("Option does not exist: " + aVar);
    }

    @Override // o.HJ
    public <ValueT> ValueT j(HJ.a<ValueT> aVar) {
        Map<HJ.c, Object> map = this.K.get(aVar);
        if (map != null) {
            return (ValueT) map.get((HJ.c) Collections.min(map.keySet()));
        }
        throw new IllegalArgumentException("Option does not exist: " + aVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x001a  */
    @Override // o.HJ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void k(String str, HJ.b bVar) {
        for (Map.Entry<HJ.a<?>, Map<HJ.c, Object>> entry : this.K.tailMap(HJ.a.a(str, Void.class)).entrySet()) {
            if (!entry.getKey().c().startsWith(str) || !bVar.a(entry.getKey())) {
                return;
            }
            while (r0.hasNext()) {
            }
        }
    }

    @Override // o.HJ
    public <ValueT> ValueT l(HJ.a<ValueT> aVar, HJ.c cVar) {
        Map<HJ.c, Object> map = this.K.get(aVar);
        if (map != null) {
            if (map.containsKey(cVar)) {
                return (ValueT) map.get(cVar);
            }
            throw new IllegalArgumentException("Option does not exist: " + aVar + " with priority=" + cVar);
        }
        throw new IllegalArgumentException("Option does not exist: " + aVar);
    }
}
