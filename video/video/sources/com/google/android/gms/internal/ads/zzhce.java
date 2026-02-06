package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzhce extends zzgys implements zzhae {
    private static final zzhce zza;
    private static volatile zzhal zzb;
    private int zzc;
    private long zzd;
    private long zze;

    static {
        zzhce zzhceVar = new zzhce();
        zza = zzhceVar;
        zzgys.F1(zzhce.class, zzhceVar);
    }

    private zzhce() {
    }

    public static zzhcd s2() {
        return (zzhcd) zza.f1();
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
                                    synchronized (zzhce.class) {
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
                    return new zzhcd(null);
                }
                return new zzhce();
            }
            return zzgys.w1(zza, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0004\u0002\u0002\u0003\u0002", new Object[]{"zzc", "zzd", "zze"});
        }
        return (byte) 1;
    }
}
