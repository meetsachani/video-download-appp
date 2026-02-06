package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzatg extends zzgys implements zzhae {
    private static final zzatg zza;
    private static volatile zzhal zzb;
    private int zzc;
    private long zzd = -1;
    private long zze = -1;
    private long zzf = -1;
    private long zzg = -1;
    private long zzh = -1;
    private long zzi = -1;
    private long zzj = -1;
    private long zzk = -1;

    static {
        zzatg zzatgVar = new zzatg();
        zza = zzatgVar;
        zzgys.F1(zzatg.class, zzatgVar);
    }

    private zzatg() {
    }

    public static zzatf s2() {
        return (zzatf) zza.f1();
    }

    public static /* synthetic */ void u2(zzatg zzatgVar, long j) {
        zzatgVar.zzc |= 32;
        zzatgVar.zzi = j;
    }

    public static /* synthetic */ void v2(zzatg zzatgVar, long j) {
        zzatgVar.zzc |= 4;
        zzatgVar.zzf = j;
    }

    public static /* synthetic */ void w2(zzatg zzatgVar, long j) {
        zzatgVar.zzc |= 1;
        zzatgVar.zzd = j;
    }

    public static /* synthetic */ void x2(zzatg zzatgVar, long j) {
        zzatgVar.zzc |= 8;
        zzatgVar.zzg = j;
    }

    public static /* synthetic */ void y2(zzatg zzatgVar, long j) {
        zzatgVar.zzc |= 16;
        zzatgVar.zzh = j;
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
                                    synchronized (zzatg.class) {
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
                    return new zzatf(null);
                }
                return new zzatg();
            }
            return zzgys.w1(zza, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007ဂ\u0006\bဂ\u0007", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
        }
        return (byte) 1;
    }
}
