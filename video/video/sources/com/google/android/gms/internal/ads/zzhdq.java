package com.google.android.gms.internal.ads;

@Deprecated
/* loaded from: classes2.dex */
public final class zzhdq extends zzgys implements zzhae {
    private static final zzhdq zza;
    private static volatile zzhal zzb;
    private int zzc;
    private int zzd;
    private zzhdp zze;
    private zzhdp zzf;

    static {
        zzhdq zzhdqVar = new zzhdq();
        zza = zzhdqVar;
        zzgys.F1(zzhdq.class, zzhdqVar);
    }

    private zzhdq() {
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
                                    synchronized (zzhdq.class) {
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
                    return new zzhdm(null);
                }
                return new zzhdq();
            }
            return zzgys.w1(zza, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"zzc", "zzd", zzhdn.a, "zze", "zzf"});
        }
        return (byte) 1;
    }
}
