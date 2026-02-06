package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzfje extends zzgys implements zzhae {
    private static final zzfje zza;
    private static volatile zzhal zzb;
    private long zzc;
    private long zzd;
    private zzgze zze = zzgys.q1();

    static {
        zzfje zzfjeVar = new zzfje();
        zza = zzfjeVar;
        zzgys.F1(zzfje.class, zzfjeVar);
    }

    private zzfje() {
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
                                    synchronized (zzfje.class) {
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
                    return new zzfjc(null);
                }
                return new zzfje();
            }
            return zzgys.w1(zza, "\u0004\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u0002\u0002\u0002\u0003Ț", new Object[]{"zzc", "zzd", "zze"});
        }
        return (byte) 1;
    }
}
