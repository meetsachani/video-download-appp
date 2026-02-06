package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzhcg extends zzgys implements zzhae {
    private static final zzhcg zza;
    private static volatile zzhal zzb;
    private zzgze zzc = zzgys.q1();

    static {
        zzhcg zzhcgVar = new zzhcg();
        zza = zzhcgVar;
        zzgys.F1(zzhcg.class, zzhcgVar);
    }

    private zzhcg() {
    }

    public static zzhcf s2() {
        return (zzhcf) zza.f1();
    }

    public static /* synthetic */ void u2(zzhcg zzhcgVar, zzhce zzhceVar) {
        zzhceVar.getClass();
        zzgze zzgzeVar = zzhcgVar.zzc;
        if (!zzgzeVar.c()) {
            zzhcgVar.zzc = zzgys.r1(zzgzeVar);
        }
        zzhcgVar.zzc.add(zzhceVar);
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
                                    synchronized (zzhcg.class) {
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
                    return new zzhcf(null);
                }
                return new zzhcg();
            }
            return zzgys.w1(zza, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzc", zzhce.class});
        }
        return (byte) 1;
    }
}
