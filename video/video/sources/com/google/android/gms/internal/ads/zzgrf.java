package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzgrf extends zzgys implements zzhae {
    private static final zzgrf zza;
    private static volatile zzhal zzb;
    private int zzc;
    private int zzd;
    private zzgri zze;

    static {
        zzgrf zzgrfVar = new zzgrf();
        zza = zzgrfVar;
        zzgys.F1(zzgrf.class, zzgrfVar);
    }

    private zzgrf() {
    }

    public static zzgrd s2() {
        return (zzgrd) zza.f1();
    }

    public static zzgrf u2(zzgxk zzgxkVar, zzgyc zzgycVar) throws zzgzh {
        return (zzgrf) zzgys.X1(zza, zzgxkVar, zzgycVar);
    }

    public static /* synthetic */ void x2(zzgrf zzgrfVar, zzgri zzgriVar) {
        zzgriVar.getClass();
        zzgrfVar.zze = zzgriVar;
        zzgrfVar.zzc |= 1;
    }

    public final int a() {
        return this.zzd;
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
                                    synchronized (zzgrf.class) {
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
                    return new zzgrd(null);
                }
                return new zzgrf();
            }
            return zzgys.w1(zza, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000", new Object[]{"zzc", "zzd", "zze"});
        }
        return (byte) 1;
    }

    public final zzgri v2() {
        zzgri zzgriVar = this.zze;
        if (zzgriVar == null) {
            return zzgri.u2();
        }
        return zzgriVar;
    }
}
