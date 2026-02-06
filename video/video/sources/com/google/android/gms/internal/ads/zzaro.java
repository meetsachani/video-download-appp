package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzaro extends zzgys implements zzhae {
    private static final zzaro zza;
    private static volatile zzhal zzb;
    private int zzc;
    private int zzd;
    private boolean zzg;
    private zzasg zzi;
    private zzasj zzj;
    private boolean zzk;
    private boolean zze = true;
    private String zzf = "unknown_host";
    private boolean zzh = true;

    static {
        zzaro zzaroVar = new zzaro();
        zza = zzaroVar;
        zzgys.F1(zzaro.class, zzaroVar);
    }

    private zzaro() {
    }

    public static zzarm s2() {
        return (zzarm) zza.f1();
    }

    public static /* synthetic */ void x2(zzaro zzaroVar, boolean z) {
        zzaroVar.zzc |= 8;
        zzaroVar.zzg = z;
    }

    public static /* synthetic */ void y2(zzaro zzaroVar, String str) {
        str.getClass();
        zzaroVar.zzc |= 4;
        zzaroVar.zzf = str;
    }

    @Deprecated
    public final boolean i() {
        return this.zzg;
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
                                    synchronized (zzaro.class) {
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
                    return new zzarm(null);
                }
                return new zzaro();
            }
            return zzgys.w1(zza, "\u0004\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001᠌\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဉ\u0005\u0007ဉ\u0006\bဇ\u0007", new Object[]{"zzc", "zzd", zzarp.a, "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
        }
        return (byte) 1;
    }

    public final zzasg u2() {
        zzasg zzasgVar = this.zzi;
        if (zzasgVar == null) {
            return zzasg.t2();
        }
        return zzasgVar;
    }

    public final zzasj v2() {
        zzasj zzasjVar = this.zzj;
        if (zzasjVar == null) {
            return zzasj.t2();
        }
        return zzasjVar;
    }

    public final String w2() {
        return this.zzf;
    }
}
