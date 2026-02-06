package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzhct extends zzgys implements zzhae {
    private static final zzhct zza;
    private static volatile zzhal zzb;
    private int zzc;
    private String zzd = "";

    static {
        zzhct zzhctVar = new zzhct();
        zza = zzhctVar;
        zzgys.F1(zzhct.class, zzhctVar);
    }

    private zzhct() {
    }

    public static zzhcs s2() {
        return (zzhcs) zza.f1();
    }

    public static /* bridge */ /* synthetic */ zzhct t2() {
        return zza;
    }

    public static /* synthetic */ void u2(zzhct zzhctVar, String str) {
        zzhctVar.zzc |= 1;
        zzhctVar.zzd = str;
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
                                    synchronized (zzhct.class) {
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
                    return new zzhcs(null);
                }
                return new zzhct();
            }
            return zzgys.w1(zza, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"zzc", "zzd"});
        }
        return (byte) 1;
    }
}
