package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes3.dex */
final class zzkf implements zzkg {
    @Override // com.google.android.gms.internal.measurement.zzkg
    public final zzke<?, ?> b(Object obj) {
        zzkb zzkbVar = (zzkb) obj;
        throw new NoSuchMethodError();
    }

    @Override // com.google.android.gms.internal.measurement.zzkg
    public final Object c(Object obj) {
        return zzkd.c().e();
    }

    @Override // com.google.android.gms.internal.measurement.zzkg
    public final Map<?, ?> d(Object obj) {
        return (zzkd) obj;
    }

    @Override // com.google.android.gms.internal.measurement.zzkg
    public final boolean e(Object obj) {
        if (!((zzkd) obj).g()) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.zzkg
    public final Object f(Object obj) {
        ((zzkd) obj).f();
        return obj;
    }

    @Override // com.google.android.gms.internal.measurement.zzkg
    public final Object g(Object obj, Object obj2) {
        zzkd zzkdVar = (zzkd) obj;
        zzkd zzkdVar2 = (zzkd) obj2;
        if (!zzkdVar2.isEmpty()) {
            if (!zzkdVar.g()) {
                zzkdVar = zzkdVar.e();
            }
            zzkdVar.d(zzkdVar2);
        }
        return zzkdVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzkg
    public final Map<?, ?> h(Object obj) {
        return (zzkd) obj;
    }

    @Override // com.google.android.gms.internal.measurement.zzkg
    public final int i(int i, Object obj, Object obj2) {
        zzkd zzkdVar = (zzkd) obj;
        zzkb zzkbVar = (zzkb) obj2;
        if (zzkdVar.isEmpty()) {
            return 0;
        }
        Iterator it = zzkdVar.entrySet().iterator();
        if (!it.hasNext()) {
            return 0;
        }
        Map.Entry entry = (Map.Entry) it.next();
        entry.getKey();
        entry.getValue();
        throw new NoSuchMethodError();
    }
}
