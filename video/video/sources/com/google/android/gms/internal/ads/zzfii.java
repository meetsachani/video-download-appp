package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzfii extends zzgys implements zzhae {
    private static final zzfii zza;
    private static volatile zzhal zzb;
    private String zzc = "";

    static {
        zzfii zzfiiVar = new zzfii();
        zza = zzfiiVar;
        zzgys.F1(zzfii.class, zzfiiVar);
    }

    private zzfii() {
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
                                    synchronized (zzfii.class) {
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
                    return new zzfig(null);
                }
                return new zzfii();
            }
            return zzgys.w1(zza, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"zzc"});
        }
        return (byte) 1;
    }
}
