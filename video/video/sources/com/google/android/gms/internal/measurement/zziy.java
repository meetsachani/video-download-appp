package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzix;

/* loaded from: classes3.dex */
final class zziy implements zzkk {
    public static final zziy a = new zziy();

    private zziy() {
    }

    public static zziy c() {
        return a;
    }

    @Override // com.google.android.gms.internal.measurement.zzkk
    public final zzkh a(Class<?> cls) {
        if (zzix.class.isAssignableFrom(cls)) {
            try {
                return (zzkh) zzix.n(cls.asSubclass(zzix.class)).q(zzix.zze.c, null, null);
            } catch (Exception e) {
                String name = cls.getName();
                throw new RuntimeException("Unable to get message info for " + name, e);
            }
        }
        String name2 = cls.getName();
        throw new IllegalArgumentException("Unsupported message type: " + name2);
    }

    @Override // com.google.android.gms.internal.measurement.zzkk
    public final boolean b(Class<?> cls) {
        return zzix.class.isAssignableFrom(cls);
    }
}
