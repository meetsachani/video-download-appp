package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
final class zzgyl implements zzhab {
    public static final zzgyl a = new zzgyl();

    private zzgyl() {
    }

    public static zzgyl a() {
        return a;
    }

    @Override // com.google.android.gms.internal.ads.zzhab
    public final zzhaa b(Class cls) {
        if (zzgys.class.isAssignableFrom(cls)) {
            try {
                return (zzhaa) zzgys.N1(cls.asSubclass(zzgys.class)).u1();
            } catch (Exception e) {
                throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e);
            }
        }
        throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
    }

    @Override // com.google.android.gms.internal.ads.zzhab
    public final boolean c(Class cls) {
        return zzgys.class.isAssignableFrom(cls);
    }
}
