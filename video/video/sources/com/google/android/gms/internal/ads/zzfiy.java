package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzfiy extends zzgys implements zzhae {
    private static final zzfiy zza;
    private static volatile zzhal zzb;
    private int zzc;
    private boolean zzd;
    private boolean zze;
    private boolean zzf;

    static {
        zzfiy zzfiyVar = new zzfiy();
        zza = zzfiyVar;
        zzgys.F1(zzfiy.class, zzfiyVar);
    }

    private zzfiy() {
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
                                    synchronized (zzfiy.class) {
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
                    return new zzfiw(null);
                }
                return new zzfiy();
            }
            return zzgys.w1(zza, "\u0004\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0004\u0002\u0007\u0003\u0007\u0004\u0007", new Object[]{"zzc", "zzd", "zze", "zzf"});
        }
        return (byte) 1;
    }
}
