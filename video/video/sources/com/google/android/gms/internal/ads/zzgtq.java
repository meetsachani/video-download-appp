package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzgtq extends zzgys implements zzhae {
    private static final zzgtq zza;
    private static volatile zzhal zzb;
    private String zzc = "";
    private zzgxk zzd = zzgxk.Y;
    private int zze;

    static {
        zzgtq zzgtqVar = new zzgtq();
        zza = zzgtqVar;
        zzgys.F1(zzgtq.class, zzgtqVar);
    }

    private zzgtq() {
    }

    public static /* synthetic */ void B2(zzgtq zzgtqVar, String str) {
        str.getClass();
        zzgtqVar.zzc = str;
    }

    public static /* synthetic */ void C2(zzgtq zzgtqVar, zzgxk zzgxkVar) {
        zzgxkVar.getClass();
        zzgtqVar.zzd = zzgxkVar;
    }

    public static zzgto s2() {
        return (zzgto) zza.f1();
    }

    public static zzgto t2(zzgtq zzgtqVar) {
        return (zzgto) zza.G1(zzgtqVar);
    }

    public static zzgtq v2() {
        return zza;
    }

    public static zzgtq w2(byte[] bArr, zzgyc zzgycVar) throws zzgzh {
        return (zzgtq) zzgys.b2(zza, bArr, zzgycVar);
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
                                    synchronized (zzgtq.class) {
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
                    return new zzgto(null);
                }
                return new zzgtq();
            }
            return zzgys.w1(zza, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"zzc", "zzd", "zze"});
        }
        return (byte) 1;
    }

    public final zzguq x2() {
        zzguq e = zzguq.e(this.zze);
        return e == null ? zzguq.UNRECOGNIZED : e;
    }

    public final zzgxk y2() {
        return this.zzd;
    }

    public final String z2() {
        return this.zzc;
    }
}
