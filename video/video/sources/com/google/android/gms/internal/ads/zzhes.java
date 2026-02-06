package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzhes extends zzgys implements zzhae {
    private static final zzhes zza;
    private static volatile zzhal zzb;
    private int zzc;
    private String zzd = "";
    private String zze = "";

    static {
        zzhes zzhesVar = new zzhes();
        zza = zzhesVar;
        zzgys.F1(zzhes.class, zzhesVar);
    }

    private zzhes() {
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
                                    synchronized (zzhes.class) {
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
                    return new zzher(null);
                }
                return new zzhes();
            }
            return zzgys.w1(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zzc", "zzd", "zze"});
        }
        return (byte) 1;
    }
}
