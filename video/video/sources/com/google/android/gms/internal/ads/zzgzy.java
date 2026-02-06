package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
final class zzgzy {
    public static final boolean a(Object obj) {
        if (!((zzgzx) obj).f()) {
            return true;
        }
        return false;
    }

    public static final Object b(Object obj, Object obj2) {
        zzgzx zzgzxVar = (zzgzx) obj;
        zzgzx zzgzxVar2 = (zzgzx) obj2;
        if (!zzgzxVar2.isEmpty()) {
            if (!zzgzxVar.f()) {
                zzgzxVar = zzgzxVar.c();
            }
            zzgzxVar.e(zzgzxVar2);
        }
        return zzgzxVar;
    }
}
