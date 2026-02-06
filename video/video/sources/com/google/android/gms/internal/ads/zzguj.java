package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzguj extends zzgys implements zzhae {
    private static final zzguj zza;
    private static volatile zzhal zzb;
    private String zzc = "";

    static {
        zzguj zzgujVar = new zzguj();
        zza = zzgujVar;
        zzgys.F1(zzguj.class, zzgujVar);
    }

    private zzguj() {
    }

    public static zzguh s2() {
        return (zzguh) zza.f1();
    }

    public static zzguj u2() {
        return zza;
    }

    public static zzguj v2(zzgxk zzgxkVar, zzgyc zzgycVar) throws zzgzh {
        return (zzguj) zzgys.X1(zza, zzgxkVar, zzgycVar);
    }

    public static /* synthetic */ void x2(zzguj zzgujVar, String str) {
        str.getClass();
        zzgujVar.zzc = str;
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
                                    synchronized (zzguj.class) {
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
                    return new zzguh(null);
                }
                return new zzguj();
            }
            return zzgys.w1(zza, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"zzc"});
        }
        return (byte) 1;
    }

    public final String w2() {
        return this.zzc;
    }
}
