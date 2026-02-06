package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzfos extends zzgys implements zzhae {
    private static final zzfos zza;
    private static volatile zzhal zzb;
    private int zzc;
    private zzgza zzd = zzgys.m1();
    private String zze = "";
    private String zzf = "";
    private String zzg = "";

    static {
        zzfos zzfosVar = new zzfos();
        zza = zzfosVar;
        zzgys.F1(zzfos.class, zzfosVar);
    }

    private zzfos() {
    }

    public static zzfoq s2() {
        return (zzfoq) zza.f1();
    }

    public static /* synthetic */ void u2(zzfos zzfosVar, String str) {
        str.getClass();
        zzfosVar.zzc |= 1;
        zzfosVar.zze = str;
    }

    public static /* synthetic */ void v2(zzfos zzfosVar, int i) {
        zzgza zzgzaVar = zzfosVar.zzd;
        if (!zzgzaVar.c()) {
            zzfosVar.zzd = zzgys.n1(zzgzaVar);
        }
        zzfosVar.zzd.N(2);
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
                                    synchronized (zzfos.class) {
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
                    return new zzfoq(null);
                }
                return new zzfos();
            }
            return zzgys.w1(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ࠞ\u0002ဈ\u0000\u0003ဈ\u0001\u0004ဈ\u0002", new Object[]{"zzc", "zzd", zzfop.a, "zze", "zzf", "zzg"});
        }
        return (byte) 1;
    }
}
