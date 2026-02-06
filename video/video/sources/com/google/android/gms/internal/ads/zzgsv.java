package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzgsv extends zzgys implements zzhae {
    private static final zzgsv zza;
    private static volatile zzhal zzb;
    private int zzc;
    private zzgxk zzd = zzgxk.Y;

    static {
        zzgsv zzgsvVar = new zzgsv();
        zza = zzgsvVar;
        zzgys.F1(zzgsv.class, zzgsvVar);
    }

    private zzgsv() {
    }

    public static zzgst s2() {
        return (zzgst) zza.f1();
    }

    public static zzgsv u2(zzgxk zzgxkVar, zzgyc zzgycVar) throws zzgzh {
        return (zzgsv) zzgys.X1(zza, zzgxkVar, zzgycVar);
    }

    public static zzhal w2() {
        return zza.t1();
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
                                    synchronized (zzgsv.class) {
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
                    return new zzgst(null);
                }
                return new zzgsv();
            }
            return zzgys.w1(zza, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\n", new Object[]{"zzc", "zzd"});
        }
        return (byte) 1;
    }

    public final zzgxk v2() {
        return this.zzd;
    }
}
