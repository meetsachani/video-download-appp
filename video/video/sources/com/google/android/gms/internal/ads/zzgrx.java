package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzgrx extends zzgys implements zzhae {
    private static final zzgrx zza;
    private static volatile zzhal zzb;
    private int zzc;

    static {
        zzgrx zzgrxVar = new zzgrx();
        zza = zzgrxVar;
        zzgys.F1(zzgrx.class, zzgrxVar);
    }

    private zzgrx() {
    }

    public static zzgrv s2() {
        return (zzgrv) zza.f1();
    }

    public static zzgrx u2() {
        return zza;
    }

    public final int a() {
        return this.zzc;
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
                                    synchronized (zzgrx.class) {
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
                    return new zzgrv(null);
                }
                return new zzgrx();
            }
            return zzgys.w1(zza, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"zzc"});
        }
        return (byte) 1;
    }
}
