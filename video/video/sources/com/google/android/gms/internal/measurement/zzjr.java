package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
final class zzjr extends zzjs {
    public static final Class<?> c = Collections.unmodifiableList(Collections.EMPTY_LIST).getClass();

    public static <L> List<L> f(Object obj, long j, int i) {
        List<L> arrayList;
        List<L> g = g(obj, j);
        if (g.isEmpty()) {
            if (g instanceof zzjp) {
                arrayList = new zzjq(i);
            } else if ((g instanceof zzkv) && (g instanceof zzjf)) {
                arrayList = ((zzjf) g).u(i);
            } else {
                arrayList = new ArrayList<>(i);
            }
            zzmg.j(obj, j, arrayList);
            return arrayList;
        } else if (c.isAssignableFrom(g.getClass())) {
            ArrayList arrayList2 = new ArrayList(g.size() + i);
            arrayList2.addAll(g);
            zzmg.j(obj, j, arrayList2);
            return arrayList2;
        } else if (g instanceof zzmb) {
            zzjq zzjqVar = new zzjq(g.size() + i);
            zzjqVar.addAll((zzmb) g);
            zzmg.j(obj, j, zzjqVar);
            return zzjqVar;
        } else {
            if ((g instanceof zzkv) && (g instanceof zzjf)) {
                zzjf zzjfVar = (zzjf) g;
                if (!zzjfVar.c()) {
                    zzjf u = zzjfVar.u(g.size() + i);
                    zzmg.j(obj, j, u);
                    return u;
                }
            }
            return g;
        }
    }

    public static <E> List<E> g(Object obj, long j) {
        return (List) zzmg.B(obj, j);
    }

    @Override // com.google.android.gms.internal.measurement.zzjs
    public final <L> List<L> b(Object obj, long j) {
        return f(obj, j, 10);
    }

    @Override // com.google.android.gms.internal.measurement.zzjs
    public final <E> void c(Object obj, Object obj2, long j) {
        List g = g(obj2, j);
        List f = f(obj, j, g.size());
        int size = f.size();
        int size2 = g.size();
        if (size > 0 && size2 > 0) {
            f.addAll(g);
        }
        if (size > 0) {
            g = f;
        }
        zzmg.j(obj, j, g);
    }

    @Override // com.google.android.gms.internal.measurement.zzjs
    public final void e(Object obj, long j) {
        Object unmodifiableList;
        List list = (List) zzmg.B(obj, j);
        if (list instanceof zzjp) {
            unmodifiableList = ((zzjp) list).W0();
        } else if (!c.isAssignableFrom(list.getClass())) {
            if ((list instanceof zzkv) && (list instanceof zzjf)) {
                zzjf zzjfVar = (zzjf) list;
                if (zzjfVar.c()) {
                    zzjfVar.g5();
                    return;
                }
                return;
            }
            unmodifiableList = Collections.unmodifiableList(list);
        } else {
            return;
        }
        zzmg.j(obj, j, unmodifiableList);
    }

    private zzjr() {
        super();
    }
}
