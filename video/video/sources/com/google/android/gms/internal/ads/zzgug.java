package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzgug extends zzgys implements zzhae {
    private static final zzgug zza;
    private static volatile zzhal zzb;
    private int zzc;
    private int zzd;
    private zzguj zze;

    static {
        zzgug zzgugVar = new zzgug();
        zza = zzgugVar;
        zzgys.F1(zzgug.class, zzgugVar);
    }

    private zzgug() {
    }

    public static zzgue s2() {
        return (zzgue) zza.f1();
    }

    public static zzgug u2(zzgxk zzgxkVar, zzgyc zzgycVar) throws zzgzh {
        return (zzgug) zzgys.X1(zza, zzgxkVar, zzgycVar);
    }

    public static zzhal w2() {
        return zza.t1();
    }

    public static /* synthetic */ void x2(zzgug zzgugVar, zzguj zzgujVar) {
        zzgujVar.getClass();
        zzgugVar.zze = zzgujVar;
        zzgugVar.zzc |= 1;
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
                                    synchronized (zzgug.class) {
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
                    return new zzgue(null);
                }
                return new zzgug();
            }
            return zzgys.w1(zza, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000", new Object[]{"zzc", "zzd", "zze"});
        }
        return (byte) 1;
    }

    public final zzguj v2() {
        zzguj zzgujVar = this.zze;
        if (zzgujVar == null) {
            return zzguj.u2();
        }
        return zzgujVar;
    }
}
