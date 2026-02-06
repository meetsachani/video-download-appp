package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzgri extends zzgys implements zzhae {
    private static final zzgri zza;
    private static volatile zzhal zzb;
    private int zzc;

    static {
        zzgri zzgriVar = new zzgri();
        zza = zzgriVar;
        zzgys.F1(zzgri.class, zzgriVar);
    }

    private zzgri() {
    }

    public static zzgrg s2() {
        return (zzgrg) zza.f1();
    }

    public static zzgri u2() {
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
                                    synchronized (zzgri.class) {
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
                    return new zzgrg(null);
                }
                return new zzgri();
            }
            return zzgys.w1(zza, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"zzc"});
        }
        return (byte) 1;
    }
}
