package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzfip extends zzgys implements zzhae {
    private static final zzfip zza;
    private static volatile zzhal zzb;
    private int zzd;
    private int zze;
    private boolean zzf;
    private boolean zzh;
    private String zzc = "";
    private String zzg = "";

    static {
        zzfip zzfipVar = new zzfip();
        zza = zzfipVar;
        zzgys.F1(zzfip.class, zzfipVar);
    }

    private zzfip() {
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
                                    synchronized (zzfip.class) {
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
                    return new zzfin(null);
                }
                return new zzfip();
            }
            return zzgys.w1(zza, "\u0004\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001Ȉ\u0002\u0004\u0003\u0004\u0004\u0007\u0005Ȉ\u0006\u0007", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg", "zzh"});
        }
        return (byte) 1;
    }
}
