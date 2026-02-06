package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzatu extends zzgys implements zzhae {
    private static final zzatu zza;
    private static volatile zzhal zzb;
    private int zzc;
    private long zzd;
    private String zze = "";
    private zzgxk zzf = zzgxk.Y;

    static {
        zzatu zzatuVar = new zzatu();
        zza = zzatuVar;
        zzgys.F1(zzatu.class, zzatuVar);
    }

    private zzatu() {
    }

    public static zzatu u2() {
        return zza;
    }

    public final boolean g() {
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
                                    synchronized (zzatu.class) {
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
                    return new zzatt(null);
                }
                return new zzatu();
            }
            return zzgys.w1(zza, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001ဂ\u0000\u0003ဈ\u0001\u0004ည\u0002", new Object[]{"zzc", "zzd", "zze", "zzf"});
        }
        return (byte) 1;
    }

    public final long s2() {
        return this.zzd;
    }

    public final zzgxk v2() {
        return this.zzf;
    }

    public final String w2() {
        return this.zze;
    }
}
