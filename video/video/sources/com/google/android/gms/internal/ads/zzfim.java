package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzfim extends zzgys implements zzhae {
    private static final zzfim zza;
    private static volatile zzhal zzb;
    private boolean zzc;

    static {
        zzfim zzfimVar = new zzfim();
        zza = zzfimVar;
        zzgys.F1(zzfim.class, zzfimVar);
    }

    private zzfim() {
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
                                    synchronized (zzfim.class) {
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
                    return new zzfik(null);
                }
                return new zzfim();
            }
            return zzgys.w1(zza, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0007", new Object[]{"zzc"});
        }
        return (byte) 1;
    }
}
