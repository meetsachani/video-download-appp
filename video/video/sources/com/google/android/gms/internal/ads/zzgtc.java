package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzgtc extends zzgys implements zzhae {
    private static final zzgtc zza;
    private static volatile zzhal zzb;
    private int zzc;
    private int zzd;
    private zzgti zze;
    private zzgxk zzf = zzgxk.Y;

    static {
        zzgtc zzgtcVar = new zzgtc();
        zza = zzgtcVar;
        zzgys.F1(zzgtc.class, zzgtcVar);
    }

    private zzgtc() {
    }

    public static /* synthetic */ void A2(zzgtc zzgtcVar, zzgti zzgtiVar) {
        zzgtiVar.getClass();
        zzgtcVar.zze = zzgtiVar;
        zzgtcVar.zzc |= 1;
    }

    public static zzgta s2() {
        return (zzgta) zza.f1();
    }

    public static zzgtc u2() {
        return zza;
    }

    public static zzgtc v2(zzgxk zzgxkVar, zzgyc zzgycVar) throws zzgzh {
        return (zzgtc) zzgys.X1(zza, zzgxkVar, zzgycVar);
    }

    public static zzhal y2() {
        return zza.t1();
    }

    public final int a() {
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
                                    synchronized (zzgtc.class) {
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
                    return new zzgta(null);
                }
                return new zzgtc();
            }
            return zzgys.w1(zza, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n", new Object[]{"zzc", "zzd", "zze", "zzf"});
        }
        return (byte) 1;
    }

    public final zzgti w2() {
        zzgti zzgtiVar = this.zze;
        if (zzgtiVar == null) {
            return zzgti.v2();
        }
        return zzgtiVar;
    }

    public final zzgxk x2() {
        return this.zzf;
    }
}
