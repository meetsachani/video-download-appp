package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzgsd extends zzgys implements zzhae {
    private static final zzgsd zza;
    private static volatile zzhal zzb;
    private int zzc;
    private zzgsg zzd;
    private int zze;

    static {
        zzgsd zzgsdVar = new zzgsd();
        zza = zzgsdVar;
        zzgys.F1(zzgsd.class, zzgsdVar);
    }

    private zzgsd() {
    }

    public static zzgsb s2() {
        return (zzgsb) zza.f1();
    }

    public static zzgsd u2(zzgxk zzgxkVar, zzgyc zzgycVar) throws zzgzh {
        return (zzgsd) zzgys.X1(zza, zzgxkVar, zzgycVar);
    }

    public static /* synthetic */ void x2(zzgsd zzgsdVar, zzgsg zzgsgVar) {
        zzgsgVar.getClass();
        zzgsdVar.zzd = zzgsgVar;
        zzgsdVar.zzc |= 1;
    }

    public final int a() {
        return this.zze;
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
                                    synchronized (zzgsd.class) {
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
                    return new zzgsb(null);
                }
                return new zzgsd();
            }
            return zzgys.w1(zza, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u000b", new Object[]{"zzc", "zzd", "zze"});
        }
        return (byte) 1;
    }

    public final zzgsg v2() {
        zzgsg zzgsgVar = this.zzd;
        if (zzgsgVar == null) {
            return zzgsg.u2();
        }
        return zzgsgVar;
    }
}
