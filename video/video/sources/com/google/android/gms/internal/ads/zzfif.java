package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzfif extends zzgys implements zzhae {
    private static final zzfif zza;
    private static volatile zzhal zzb;
    private String zzc = "";
    private int zzd;

    static {
        zzfif zzfifVar = new zzfif();
        zza = zzfifVar;
        zzgys.F1(zzfif.class, zzfifVar);
    }

    private zzfif() {
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
                                    synchronized (zzfif.class) {
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
                    return new zzfid(null);
                }
                return new zzfif();
            }
            return zzgys.w1(zza, "\u0004\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\u0004", new Object[]{"zzc", "zzd"});
        }
        return (byte) 1;
    }
}
