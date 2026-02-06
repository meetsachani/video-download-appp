package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzgtw extends zzgys implements zzhae {
    private static final zzgtw zza;
    private static volatile zzhal zzb;
    private int zzc;
    private zzgtm zzd;
    private int zze;
    private int zzf;
    private int zzg;

    static {
        zzgtw zzgtwVar = new zzgtw();
        zza = zzgtwVar;
        zzgys.F1(zzgtw.class, zzgtwVar);
    }

    private zzgtw() {
    }

    public static zzgtv t2() {
        return (zzgtv) zza.f1();
    }

    public static /* synthetic */ void w2(zzgtw zzgtwVar, zzgtm zzgtmVar) {
        zzgtmVar.getClass();
        zzgtwVar.zzd = zzgtmVar;
        zzgtwVar.zzc |= 1;
    }

    public final int a() {
        return this.zzf;
    }

    public final boolean j() {
        return (this.zzc & 1) != 0;
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
                                    synchronized (zzgtw.class) {
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
                    return new zzgtv(null);
                }
                return new zzgtw();
            }
            return zzgys.w1(zza, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002\f\u0003\u000b\u0004\f", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg"});
        }
        return (byte) 1;
    }

    public final zzgtm s2() {
        zzgtm zzgtmVar = this.zzd;
        if (zzgtmVar == null) {
            return zzgtm.v2();
        }
        return zzgtmVar;
    }

    public final zzguq v2() {
        zzguq e = zzguq.e(this.zzg);
        return e == null ? zzguq.UNRECOGNIZED : e;
    }

    public final int z2() {
        int i = this.zze;
        int i2 = i != 0 ? i != 1 ? i != 2 ? i != 3 ? 0 : 5 : 4 : 3 : 2;
        if (i2 == 0) {
            return 1;
        }
        return i2;
    }
}
