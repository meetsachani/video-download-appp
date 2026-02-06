package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzasn extends zzgys implements zzhae {
    private static final zzasn zza;
    private static volatile zzhal zzb;
    private int zzc;
    private int zzd;

    static {
        zzasn zzasnVar = new zzasn();
        zza = zzasnVar;
        zzgys.F1(zzasn.class, zzasnVar);
    }

    private zzasn() {
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
                                    synchronized (zzasn.class) {
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
                    return new zzasm(null);
                }
                return new zzasn();
            }
            return zzgys.w1(zza, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"zzc", "zzd", zzasq.a});
        }
        return (byte) 1;
    }
}
