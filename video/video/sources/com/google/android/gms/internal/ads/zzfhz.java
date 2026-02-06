package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzfhz extends zzgys implements zzhae {
    private static final zzfhz zza;
    private static volatile zzhal zzb;
    private zzgze zzc = zzgys.q1();

    static {
        zzfhz zzfhzVar = new zzfhz();
        zza = zzfhzVar;
        zzgys.F1(zzfhz.class, zzfhzVar);
    }

    private zzfhz() {
    }

    public static zzfhv s2() {
        return (zzfhv) zza.f1();
    }

    public static /* bridge */ /* synthetic */ zzfhz t2() {
        return zza;
    }

    public static /* synthetic */ void u2(zzfhz zzfhzVar, zzfhx zzfhxVar) {
        zzfhxVar.getClass();
        zzgze zzgzeVar = zzfhzVar.zzc;
        if (!zzgzeVar.c()) {
            zzfhzVar.zzc = zzgys.r1(zzgzeVar);
        }
        zzfhzVar.zzc.add(zzfhxVar);
    }

    public static /* synthetic */ void v2(zzfhz zzfhzVar) {
        zzfhzVar.zzc = zzgys.q1();
    }

    public final int a() {
        return this.zzc.size();
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
                                    synchronized (zzfhz.class) {
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
                    return new zzfhv(null);
                }
                return new zzfhz();
            }
            return zzgys.w1(zza, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzc", zzfhx.class});
        }
        return (byte) 1;
    }
}
