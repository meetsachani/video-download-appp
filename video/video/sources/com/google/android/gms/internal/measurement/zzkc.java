package com.google.android.gms.internal.measurement;

/* loaded from: classes3.dex */
final class zzkc implements zzkk {
    public zzkk[] a;

    public zzkc(zzkk... zzkkVarArr) {
        this.a = zzkkVarArr;
    }

    @Override // com.google.android.gms.internal.measurement.zzkk
    public final zzkh a(Class<?> cls) {
        zzkk[] zzkkVarArr;
        for (zzkk zzkkVar : this.a) {
            if (zzkkVar.b(cls)) {
                return zzkkVar.a(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: " + cls.getName());
    }

    @Override // com.google.android.gms.internal.measurement.zzkk
    public final boolean b(Class<?> cls) {
        for (zzkk zzkkVar : this.a) {
            if (zzkkVar.b(cls)) {
                return true;
            }
        }
        return false;
    }
}
