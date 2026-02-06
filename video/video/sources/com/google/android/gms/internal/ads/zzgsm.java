package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzgsm extends zzgys implements zzhae {
    private static final zzgsm zza;
    private static volatile zzhal zzb;
    private int zzc;
    private int zzd;

    static {
        zzgsm zzgsmVar = new zzgsm();
        zza = zzgsmVar;
        zzgys.F1(zzgsm.class, zzgsmVar);
    }

    private zzgsm() {
    }

    public static zzgsk s2() {
        return (zzgsk) zza.f1();
    }

    public static zzgsm u2(zzgxk zzgxkVar, zzgyc zzgycVar) throws zzgzh {
        return (zzgsm) zzgys.X1(zza, zzgxkVar, zzgycVar);
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
                                    synchronized (zzgsm.class) {
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
                    return new zzgsk(null);
                }
                return new zzgsm();
            }
            return zzgys.w1(zza, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002\u000b\u0003\u000b", new Object[]{"zzc", "zzd"});
        }
        return (byte) 1;
    }
}
