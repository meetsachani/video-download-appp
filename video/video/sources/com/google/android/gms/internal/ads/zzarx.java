package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzarx extends zzgys implements zzhae {
    private static final zzarx zza;
    private static volatile zzhal zzb;
    private int zzc;
    private zzarz zzd;
    private zzasc zze;

    static {
        zzarx zzarxVar = new zzarx();
        zza = zzarxVar;
        zzgys.F1(zzarx.class, zzarxVar);
    }

    private zzarx() {
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
                                    synchronized (zzarx.class) {
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
                    return new zzarw(null);
                }
                return new zzarx();
            }
            return zzgys.w1(zza, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"zzc", "zzd", "zze"});
        }
        return (byte) 1;
    }
}
