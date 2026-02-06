package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzhdp extends zzgys implements zzhae {
    private static final zzhdp zza;
    private static volatile zzhal zzb;
    private int zzc;
    private int zzd;
    private boolean zze;
    private int zzf;

    static {
        zzhdp zzhdpVar = new zzhdp();
        zza = zzhdpVar;
        zzgys.F1(zzhdp.class, zzhdpVar);
    }

    private zzhdp() {
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
                                    synchronized (zzhdp.class) {
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
                    return new zzhdo(null);
                }
                return new zzhdp();
            }
            zzgyy zzgyyVar = zzhdn.a;
            return zzgys.w1(zza, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဇ\u0001\u0003᠌\u0002", new Object[]{"zzc", "zzd", zzgyyVar, "zze", "zzf", zzgyyVar});
        }
        return (byte) 1;
    }
}
