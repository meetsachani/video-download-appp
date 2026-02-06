package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzgtm extends zzgys implements zzhae {
    private static final zzgtm zza;
    private static volatile zzhal zzb;
    private String zzc = "";
    private zzgxk zzd = zzgxk.Y;
    private int zze;

    static {
        zzgtm zzgtmVar = new zzgtm();
        zza = zzgtmVar;
        zzgys.F1(zzgtm.class, zzgtmVar);
    }

    private zzgtm() {
    }

    public static /* synthetic */ void A2(zzgtm zzgtmVar, zzgxk zzgxkVar) {
        zzgxkVar.getClass();
        zzgtmVar.zzd = zzgxkVar;
    }

    public static zzgtj s2() {
        return (zzgtj) zza.f1();
    }

    public static zzgtm v2() {
        return zza;
    }

    public static /* synthetic */ void z2(zzgtm zzgtmVar, String str) {
        str.getClass();
        zzgtmVar.zzc = str;
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
                                    synchronized (zzgtm.class) {
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
                    return new zzgtj(null);
                }
                return new zzgtm();
            }
            return zzgys.w1(zza, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"zzc", "zzd", "zze"});
        }
        return (byte) 1;
    }

    public final zzgtk t2() {
        int i = this.zze;
        zzgtk zzgtkVar = i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? null : zzgtk.REMOTE : zzgtk.ASYMMETRIC_PUBLIC : zzgtk.ASYMMETRIC_PRIVATE : zzgtk.SYMMETRIC : zzgtk.UNKNOWN_KEYMATERIAL;
        return zzgtkVar == null ? zzgtk.UNRECOGNIZED : zzgtkVar;
    }

    public final zzgxk w2() {
        return this.zzd;
    }

    public final String x2() {
        return this.zzc;
    }
}
