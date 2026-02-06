package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzguw extends zzgys implements zzhae {
    private static final zzguw zza;
    private static volatile zzhal zzb;
    private int zzc;
    private int zzd;
    private zzgvc zze;
    private zzgxk zzf = zzgxk.Y;

    static {
        zzguw zzguwVar = new zzguw();
        zza = zzguwVar;
        zzgys.F1(zzguw.class, zzguwVar);
    }

    private zzguw() {
    }

    public static zzguu s2() {
        return (zzguu) zza.f1();
    }

    public static zzguw u2(zzgxk zzgxkVar, zzgyc zzgycVar) throws zzgzh {
        return (zzguw) zzgys.X1(zza, zzgxkVar, zzgycVar);
    }

    public static /* synthetic */ void y2(zzguw zzguwVar, zzgvc zzgvcVar) {
        zzgvcVar.getClass();
        zzguwVar.zze = zzgvcVar;
        zzguwVar.zzc |= 1;
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
                                    synchronized (zzguw.class) {
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
                    return new zzguu(null);
                }
                return new zzguw();
            }
            return zzgys.w1(zza, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n", new Object[]{"zzc", "zzd", "zze", "zzf"});
        }
        return (byte) 1;
    }

    public final zzgvc v2() {
        zzgvc zzgvcVar = this.zze;
        if (zzgvcVar == null) {
            return zzgvc.u2();
        }
        return zzgvcVar;
    }

    public final zzgxk w2() {
        return this.zzf;
    }
}
