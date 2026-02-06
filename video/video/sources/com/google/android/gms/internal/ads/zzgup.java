package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzgup extends zzgys implements zzhae {
    private static final zzgup zza;
    private static volatile zzhal zzb;
    private int zzc;
    private String zzd = "";
    private zzgtq zze;

    static {
        zzgup zzgupVar = new zzgup();
        zza = zzgupVar;
        zzgys.F1(zzgup.class, zzgupVar);
    }

    private zzgup() {
    }

    public static zzgun t2() {
        return (zzgun) zza.f1();
    }

    public static zzgup v2() {
        return zza;
    }

    public static zzgup w2(zzgxk zzgxkVar, zzgyc zzgycVar) throws zzgzh {
        return (zzgup) zzgys.X1(zza, zzgxkVar, zzgycVar);
    }

    public static /* synthetic */ void y2(zzgup zzgupVar, zzgtq zzgtqVar) {
        zzgtqVar.getClass();
        zzgupVar.zze = zzgtqVar;
        zzgupVar.zzc |= 1;
    }

    public static /* synthetic */ void z2(zzgup zzgupVar, String str) {
        str.getClass();
        zzgupVar.zzd = str;
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
                                    synchronized (zzgup.class) {
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
                    return new zzgun(null);
                }
                return new zzgup();
            }
            return zzgys.w1(zza, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000", new Object[]{"zzc", "zzd", "zze"});
        }
        return (byte) 1;
    }

    public final zzgtq s2() {
        zzgtq zzgtqVar = this.zze;
        if (zzgtqVar == null) {
            return zzgtq.v2();
        }
        return zzgtqVar;
    }

    public final String x2() {
        return this.zzd;
    }
}
