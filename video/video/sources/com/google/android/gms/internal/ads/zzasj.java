package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzasj extends zzgys implements zzhae {
    public static final /* synthetic */ int zza = 0;
    private static final zzasj zzb;
    private static volatile zzhal zzc;
    private int zzd;
    private boolean zzf;
    private boolean zzg;
    private long zze = 100;
    private long zzh = 300;
    private long zzi = 1000;

    static {
        zzasj zzasjVar = new zzasj();
        zzb = zzasjVar;
        zzgys.F1(zzasj.class, zzasjVar);
    }

    private zzasj() {
    }

    public static zzasj t2() {
        return zzb;
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
                                zzhal zzhalVar2 = zzc;
                                if (zzhalVar2 == null) {
                                    synchronized (zzasj.class) {
                                        try {
                                            zzhalVar = zzc;
                                            if (zzhalVar == null) {
                                                zzhalVar = new zzgyn(zzb);
                                                zzc = zzhalVar;
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
                        return zzb;
                    }
                    return new zzash(null);
                }
                return new zzasj();
            }
            return zzgys.w1(zzb, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဂ\u0003\u0005ဂ\u0004", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi"});
        }
        return (byte) 1;
    }
}
