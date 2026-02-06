package com.google.android.gms.internal.measurement;

import java.util.List;

/* loaded from: classes3.dex */
final class zzjt extends zzjs {
    public static <E> zzjf<E> f(Object obj, long j) {
        return (zzjf) zzmg.B(obj, j);
    }

    @Override // com.google.android.gms.internal.measurement.zzjs
    public final <L> List<L> b(Object obj, long j) {
        int i;
        zzjf f = f(obj, j);
        if (!f.c()) {
            int size = f.size();
            if (size == 0) {
                i = 10;
            } else {
                i = size << 1;
            }
            zzjf u = f.u(i);
            zzmg.j(obj, j, u);
            return u;
        }
        return f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.List] */
    @Override // com.google.android.gms.internal.measurement.zzjs
    public final <E> void c(Object obj, Object obj2, long j) {
        zzjf<E> f = f(obj, j);
        zzjf<E> f2 = f(obj2, j);
        int size = f.size();
        int size2 = f2.size();
        zzjf<E> zzjfVar = f;
        zzjfVar = f;
        if (size > 0 && size2 > 0) {
            boolean c = f.c();
            zzjf<E> zzjfVar2 = f;
            if (!c) {
                zzjfVar2 = f.u(size2 + size);
            }
            zzjfVar2.addAll(f2);
            zzjfVar = zzjfVar2;
        }
        if (size > 0) {
            f2 = zzjfVar;
        }
        zzmg.j(obj, j, f2);
    }

    @Override // com.google.android.gms.internal.measurement.zzjs
    public final void e(Object obj, long j) {
        f(obj, j).g5();
    }

    private zzjt() {
        super();
    }
}
