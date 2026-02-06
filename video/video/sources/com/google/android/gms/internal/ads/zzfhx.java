package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzfhx extends zzgys implements zzhae {
    private static final zzfhx zza;
    private static volatile zzhal zzb;
    private int zzc;
    private zzfhu zzd;

    static {
        zzfhx zzfhxVar = new zzfhx();
        zza = zzfhxVar;
        zzgys.F1(zzfhx.class, zzfhxVar);
    }

    private zzfhx() {
    }

    public static zzfhw s2() {
        return (zzfhw) zza.f1();
    }

    public static /* bridge */ /* synthetic */ zzfhx t2() {
        return zza;
    }

    public static /* synthetic */ void u2(zzfhx zzfhxVar, zzfhu zzfhuVar) {
        zzfhuVar.getClass();
        zzfhxVar.zzd = zzfhuVar;
        zzfhxVar.zzc |= 1;
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
                                    synchronized (zzfhx.class) {
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
                    return new zzfhw(null);
                }
                return new zzfhx();
            }
            return zzgys.w1(zza, "\u0004\u0001\u0000\u0001\u0006\u0006\u0001\u0000\u0000\u0000\u0006ဉ\u0000", new Object[]{"zzc", "zzd"});
        }
        return (byte) 1;
    }
}
