package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzasu extends zzgys implements zzhae {
    private static final zzasu zza;
    private static volatile zzhal zzb;
    private int zzc;
    private long zzd = -1;

    static {
        zzasu zzasuVar = new zzasu();
        zza = zzasuVar;
        zzgys.F1(zzasu.class, zzasuVar);
    }

    private zzasu() {
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
                                    synchronized (zzasu.class) {
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
                    return new zzast(null);
                }
                return new zzasu();
            }
            return zzgys.w1(zza, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဂ\u0000", new Object[]{"zzc", "zzd"});
        }
        return (byte) 1;
    }
}
