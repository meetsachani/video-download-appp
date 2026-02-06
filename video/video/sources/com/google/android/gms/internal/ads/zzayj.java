package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzayj extends zzgys implements zzhae {
    private static final zzayj zza;
    private static volatile zzhal zzb;
    private int zzc;
    private String zzd = "";
    private String zze = "";
    private long zzf;
    private long zzg;
    private long zzh;

    static {
        zzayj zzayjVar = new zzayj();
        zza = zzayjVar;
        zzgys.F1(zzayj.class, zzayjVar);
    }

    private zzayj() {
    }

    public static /* synthetic */ void B2(zzayj zzayjVar, String str) {
        str.getClass();
        zzayjVar.zzc |= 2;
        zzayjVar.zze = str;
    }

    public static /* synthetic */ void C2(zzayj zzayjVar, long j) {
        zzayjVar.zzc |= 8;
        zzayjVar.zzg = j;
    }

    public static /* synthetic */ void D2(zzayj zzayjVar, long j) {
        zzayjVar.zzc |= 4;
        zzayjVar.zzf = j;
    }

    public static /* synthetic */ void E2(zzayj zzayjVar, long j) {
        zzayjVar.zzc |= 16;
        zzayjVar.zzh = j;
    }

    public static /* synthetic */ void F2(zzayj zzayjVar, String str) {
        str.getClass();
        zzayjVar.zzc |= 1;
        zzayjVar.zzd = str;
    }

    public static zzayh u2() {
        return (zzayh) zza.f1();
    }

    public static zzayj w2() {
        return zza;
    }

    public static zzayj x2(zzgxk zzgxkVar) throws zzgzh {
        return (zzayj) zzgys.S1(zza, zzgxkVar);
    }

    public static zzayj y2(zzgxk zzgxkVar, zzgyc zzgycVar) throws zzgzh {
        return (zzayj) zzgys.X1(zza, zzgxkVar, zzgycVar);
    }

    public final String A2() {
        return this.zzd;
    }

    public final long c() {
        return this.zzh;
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
                                    synchronized (zzayj.class) {
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
                    return new zzayh(null);
                }
                return new zzayj();
            }
            return zzgys.w1(zza, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဃ\u0002\u0004ဃ\u0003\u0005ဃ\u0004", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg", "zzh"});
        }
        return (byte) 1;
    }

    public final long s2() {
        return this.zzg;
    }

    public final long t2() {
        return this.zzf;
    }

    public final String z2() {
        return this.zze;
    }
}
