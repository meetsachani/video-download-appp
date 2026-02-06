package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzheu extends zzgys implements zzhae {
    private static final zzheu zza;
    private static volatile zzhal zzb;
    private int zzc;
    private int zzd;
    private int zzg;
    private String zze = "";
    private zzgza zzf = zzgys.m1();
    private zzgze zzh = zzgys.q1();
    private zzgxk zzi = zzgxk.Y;

    static {
        zzheu zzheuVar = new zzheu();
        zza = zzheuVar;
        zzgys.F1(zzheu.class, zzheuVar);
    }

    private zzheu() {
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
                                    synchronized (zzheu.class) {
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
                    return new zzhet(null);
                }
                return new zzheu();
            }
            return zzgys.w1(zza, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0002\u0000\u0001င\u0000\u0002ဈ\u0001\u0003\u0016\u0005င\u0002\u0006\u001b\u0007ည\u0003", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg", "zzh", zzhes.class, "zzi"});
        }
        return (byte) 1;
    }
}
