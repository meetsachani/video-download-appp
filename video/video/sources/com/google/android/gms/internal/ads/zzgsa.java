package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzgsa extends zzgys implements zzhae {
    private static final zzgsa zza;
    private static volatile zzhal zzb;
    private int zzc;
    private int zzd;
    private zzgsg zze;
    private zzgxk zzf = zzgxk.Y;

    static {
        zzgsa zzgsaVar = new zzgsa();
        zza = zzgsaVar;
        zzgys.F1(zzgsa.class, zzgsaVar);
    }

    private zzgsa() {
    }

    public static zzgry s2() {
        return (zzgry) zza.f1();
    }

    public static zzgsa u2(zzgxk zzgxkVar, zzgyc zzgycVar) throws zzgzh {
        return (zzgsa) zzgys.X1(zza, zzgxkVar, zzgycVar);
    }

    public static zzhal x2() {
        return zza.t1();
    }

    public static /* synthetic */ void z2(zzgsa zzgsaVar, zzgsg zzgsgVar) {
        zzgsgVar.getClass();
        zzgsaVar.zze = zzgsgVar;
        zzgsaVar.zzc |= 1;
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
                                    synchronized (zzgsa.class) {
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
                    return new zzgry(null);
                }
                return new zzgsa();
            }
            return zzgys.w1(zza, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n", new Object[]{"zzc", "zzd", "zze", "zzf"});
        }
        return (byte) 1;
    }

    public final zzgsg v2() {
        zzgsg zzgsgVar = this.zze;
        if (zzgsgVar == null) {
            return zzgsg.u2();
        }
        return zzgsgVar;
    }

    public final zzgxk w2() {
        return this.zzf;
    }
}
