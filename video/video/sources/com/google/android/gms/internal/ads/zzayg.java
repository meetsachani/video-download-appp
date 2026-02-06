package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzayg extends zzgys implements zzhae {
    private static final zzayg zza;
    private static volatile zzhal zzb;
    private int zzc;
    private zzayj zzd;
    private zzgxk zze;
    private zzgxk zzf;

    static {
        zzayg zzaygVar = new zzayg();
        zza = zzaygVar;
        zzgys.F1(zzayg.class, zzaygVar);
    }

    private zzayg() {
        zzgxk zzgxkVar = zzgxk.Y;
        this.zze = zzgxkVar;
        this.zzf = zzgxkVar;
    }

    public static zzayg t2(zzgxk zzgxkVar, zzgyc zzgycVar) throws zzgzh {
        return (zzayg) zzgys.X1(zza, zzgxkVar, zzgycVar);
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
                                    synchronized (zzayg.class) {
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
                    return new zzaye(null);
                }
                return new zzayg();
            }
            return zzgys.w1(zza, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ည\u0001\u0003ည\u0002", new Object[]{"zzc", "zzd", "zze", "zzf"});
        }
        return (byte) 1;
    }

    public final zzayj u2() {
        zzayj zzayjVar = this.zzd;
        if (zzayjVar == null) {
            return zzayj.w2();
        }
        return zzayjVar;
    }

    public final zzgxk v2() {
        return this.zzf;
    }

    public final zzgxk w2() {
        return this.zze;
    }
}
