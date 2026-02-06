package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzgtf extends zzgys implements zzhae {
    private static final zzgtf zza;
    private static volatile zzhal zzb;
    private int zzc;
    private zzgti zzd;
    private int zze;
    private int zzf;

    static {
        zzgtf zzgtfVar = new zzgtf();
        zza = zzgtfVar;
        zzgys.F1(zzgtf.class, zzgtfVar);
    }

    private zzgtf() {
    }

    public static zzgtd s2() {
        return (zzgtd) zza.f1();
    }

    public static zzgtf u2() {
        return zza;
    }

    public static zzgtf v2(zzgxk zzgxkVar, zzgyc zzgycVar) throws zzgzh {
        return (zzgtf) zzgys.X1(zza, zzgxkVar, zzgycVar);
    }

    public static /* synthetic */ void y2(zzgtf zzgtfVar, zzgti zzgtiVar) {
        zzgtiVar.getClass();
        zzgtfVar.zzd = zzgtiVar;
        zzgtfVar.zzc |= 1;
    }

    public final int a() {
        return this.zze;
    }

    public final int b() {
        return this.zzf;
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
                                    synchronized (zzgtf.class) {
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
                    return new zzgtd(null);
                }
                return new zzgtf();
            }
            return zzgys.w1(zza, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u000b\u0003\u000b", new Object[]{"zzc", "zzd", "zze", "zzf"});
        }
        return (byte) 1;
    }

    public final zzgti w2() {
        zzgti zzgtiVar = this.zzd;
        if (zzgtiVar == null) {
            return zzgti.v2();
        }
        return zzgtiVar;
    }
}
