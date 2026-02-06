package com.google.android.gms.internal.ads;

import o.C4128Rj1;

/* loaded from: classes2.dex */
public final class zzheb extends zzgys implements zzhae {
    private static final zzheb zza;
    private static volatile zzhal zzb;
    private int zzc;
    private int zzd;
    private String zze = "";
    private zzgxk zzf;
    private zzgxk zzg;

    static {
        zzheb zzhebVar = new zzheb();
        zza = zzhebVar;
        zzgys.F1(zzheb.class, zzhebVar);
    }

    private zzheb() {
        zzgxk zzgxkVar = zzgxk.Y;
        this.zzf = zzgxkVar;
        this.zzg = zzgxkVar;
    }

    public static zzhdz s2() {
        return (zzhdz) zza.f1();
    }

    public static /* bridge */ /* synthetic */ zzheb t2() {
        return zza;
    }

    public static /* synthetic */ void u2(zzheb zzhebVar, zzgxk zzgxkVar) {
        zzgxkVar.getClass();
        zzhebVar.zzc |= 4;
        zzhebVar.zzf = zzgxkVar;
    }

    public static /* synthetic */ void v2(zzheb zzhebVar, String str) {
        zzhebVar.zzc |= 2;
        zzhebVar.zze = C4128Rj1.P0;
    }

    public static /* synthetic */ void w2(zzheb zzhebVar, int i) {
        zzhebVar.zzd = 1;
        zzhebVar.zzc = 1 | zzhebVar.zzc;
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
                                    synchronized (zzheb.class) {
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
                    return new zzhdz(null);
                }
                return new zzheb();
            }
            return zzgys.w1(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001\u0003ည\u0002\u0004ည\u0003", new Object[]{"zzc", "zzd", zzhea.a, "zze", "zzf", "zzg"});
        }
        return (byte) 1;
    }
}
