package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzhcw extends zzgys implements zzhae {
    private static final zzhcw zza;
    private static volatile zzhal zzb;
    private int zzc;
    private zzgxk zzd = zzgxk.Y;

    static {
        zzhcw zzhcwVar = new zzhcw();
        zza = zzhcwVar;
        zzgys.F1(zzhcw.class, zzhcwVar);
    }

    private zzhcw() {
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
                                    synchronized (zzhcw.class) {
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
                    return new zzhcv(null);
                }
                return new zzhcw();
            }
            return zzgys.w1(zza, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ည\u0000", new Object[]{"zzc", "zzd"});
        }
        return (byte) 1;
    }
}
