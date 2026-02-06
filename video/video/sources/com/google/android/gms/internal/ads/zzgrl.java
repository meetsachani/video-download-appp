package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzgrl extends zzgys implements zzhae {
    private static final zzgrl zza;
    private static volatile zzhal zzb;
    private int zzc;
    private int zzd;
    private zzgrr zze;
    private zzgtc zzf;

    static {
        zzgrl zzgrlVar = new zzgrl();
        zza = zzgrlVar;
        zzgys.F1(zzgrl.class, zzgrlVar);
    }

    private zzgrl() {
    }

    public static zzgrj s2() {
        return (zzgrj) zza.f1();
    }

    public static zzgrl u2(zzgxk zzgxkVar, zzgyc zzgycVar) throws zzgzh {
        return (zzgrl) zzgys.X1(zza, zzgxkVar, zzgycVar);
    }

    public static zzhal x2() {
        return zza.t1();
    }

    public static /* synthetic */ void y2(zzgrl zzgrlVar, zzgrr zzgrrVar) {
        zzgrrVar.getClass();
        zzgrlVar.zze = zzgrrVar;
        zzgrlVar.zzc |= 1;
    }

    public static /* synthetic */ void z2(zzgrl zzgrlVar, zzgtc zzgtcVar) {
        zzgtcVar.getClass();
        zzgrlVar.zzf = zzgtcVar;
        zzgrlVar.zzc |= 2;
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
                                    synchronized (zzgrl.class) {
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
                    return new zzgrj(null);
                }
                return new zzgrl();
            }
            return zzgys.w1(zza, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003ဉ\u0001", new Object[]{"zzc", "zzd", "zze", "zzf"});
        }
        return (byte) 1;
    }

    public final zzgrr v2() {
        zzgrr zzgrrVar = this.zze;
        if (zzgrrVar == null) {
            return zzgrr.u2();
        }
        return zzgrrVar;
    }

    public final zzgtc w2() {
        zzgtc zzgtcVar = this.zzf;
        if (zzgtcVar == null) {
            return zzgtc.u2();
        }
        return zzgtcVar;
    }
}
