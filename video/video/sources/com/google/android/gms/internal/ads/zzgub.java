package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzgub extends zzgys implements zzhae {
    private static final zzgub zza;
    private static volatile zzhal zzb;
    private String zzc = "";
    private int zzd;
    private int zze;
    private int zzf;

    static {
        zzgub zzgubVar = new zzgub();
        zza = zzgubVar;
        zzgys.F1(zzgub.class, zzgubVar);
    }

    private zzgub() {
    }

    public static zzgua s2() {
        return (zzgua) zza.f1();
    }

    public static /* bridge */ /* synthetic */ zzgub t2() {
        return zza;
    }

    public static /* synthetic */ void u2(zzgub zzgubVar, int i) {
        zzgubVar.zze = i;
    }

    public static /* synthetic */ void v2(zzgub zzgubVar, zzguq zzguqVar) {
        zzgubVar.zzf = zzguqVar.a();
    }

    public static /* synthetic */ void w2(zzgub zzgubVar, String str) {
        str.getClass();
        zzgubVar.zzc = str;
    }

    public static /* synthetic */ void x2(zzgub zzgubVar, int i) {
        zzgubVar.zzd = zzgtn.a(i);
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
                                    synchronized (zzgub.class) {
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
                    return new zzgua(null);
                }
                return new zzgub();
            }
            return zzgys.w1(zza, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003\u000b\u0004\f", new Object[]{"zzc", "zzd", "zze", "zzf"});
        }
        return (byte) 1;
    }
}
