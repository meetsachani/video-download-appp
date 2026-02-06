package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzhbz extends zzgys implements zzhae {
    private static final zzhbz zza;
    private static volatile zzhal zzb;
    private zzgza zzc = zzgys.m1();
    private zzgza zzd = zzgys.m1();

    static {
        zzhbz zzhbzVar = new zzhbz();
        zza = zzhbzVar;
        zzgys.F1(zzhbz.class, zzhbzVar);
    }

    private zzhbz() {
    }

    @Override // com.google.android.gms.internal.ads.zzgys
    public final Object l2(zzgyr zzgyrVar, Object obj, Object obj2) {
        zzhal zzhalVar;
        int ordinal = zzgyrVar.ordinal();
        if (ordinal != 0) {
            if (ordinal != 2) {
                if (ordinal != 3) {
                    if (ordinal != 4) {
                        if (ordinal != 5) {
                            if (ordinal == 6) {
                                zzhal zzhalVar2 = zzb;
                                if (zzhalVar2 == null) {
                                    synchronized (zzhbz.class) {
                                        try {
                                            zzhalVar = zzb;
                                            if (zzhalVar == null) {
                                                zzhalVar = new zzgyn(zza);
                                                zzb = zzhalVar;
                                            }
                                        } catch (Throwable th) {
                                            throw th;
                                        }
                                    }
                                    return zzhalVar;
                                }
                                return zzhalVar2;
                            }
                            throw null;
                        }
                        return zza;
                    }
                    return new zzhby(null);
                }
                return new zzhbz();
            }
            return zzgys.w1(zza, "\u0004\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0002\u0000\u0001\u0016\u0003\u0016", new Object[]{"zzc", "zzd"});
        }
        return (byte) 1;
    }
}
