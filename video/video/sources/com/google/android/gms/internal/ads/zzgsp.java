package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzgsp extends zzgys implements zzhae {
    private static final zzgsp zza;
    private static volatile zzhal zzb;
    private int zzc;
    private zzgxk zzd = zzgxk.Y;

    static {
        zzgsp zzgspVar = new zzgsp();
        zza = zzgspVar;
        zzgys.F1(zzgsp.class, zzgspVar);
    }

    private zzgsp() {
    }

    public static zzgsn s2() {
        return (zzgsn) zza.f1();
    }

    public static zzgsp u2(zzgxk zzgxkVar, zzgyc zzgycVar) throws zzgzh {
        return (zzgsp) zzgys.X1(zza, zzgxkVar, zzgycVar);
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
                                    synchronized (zzgsp.class) {
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
                    return new zzgsn(null);
                }
                return new zzgsp();
            }
            return zzgys.w1(zza, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003\n", new Object[]{"zzc", "zzd"});
        }
        return (byte) 1;
    }

    public final zzgxk v2() {
        return this.zzd;
    }
}
