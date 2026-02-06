package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzgss extends zzgys implements zzhae {
    private static final zzgss zza;
    private static volatile zzhal zzb;
    private int zzc;
    private int zzd;

    static {
        zzgss zzgssVar = new zzgss();
        zza = zzgssVar;
        zzgys.F1(zzgss.class, zzgssVar);
    }

    private zzgss() {
    }

    public static zzgsq s2() {
        return (zzgsq) zza.f1();
    }

    public static zzgss u2(zzgxk zzgxkVar, zzgyc zzgycVar) throws zzgzh {
        return (zzgss) zzgys.X1(zza, zzgxkVar, zzgycVar);
    }

    public final int a() {
        return this.zzc;
    }

    public final int b() {
        return this.zzd;
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
                                    synchronized (zzgss.class) {
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
                    return new zzgsq(null);
                }
                return new zzgss();
            }
            return zzgys.w1(zza, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\u000b", new Object[]{"zzd", "zzc"});
        }
        return (byte) 1;
    }
}
