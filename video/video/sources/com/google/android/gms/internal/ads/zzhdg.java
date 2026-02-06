package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzhdg extends zzgys implements zzhae {
    private static final zzhdg zza;
    private static volatile zzhal zzb;
    private int zzc;
    private zzgxk zzd;
    private zzgxk zze;
    private zzgxk zzf;

    static {
        zzhdg zzhdgVar = new zzhdg();
        zza = zzhdgVar;
        zzgys.F1(zzhdg.class, zzhdgVar);
    }

    private zzhdg() {
        zzgxk zzgxkVar = zzgxk.Y;
        this.zzd = zzgxkVar;
        this.zze = zzgxkVar;
        this.zzf = zzgxkVar;
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
                                    synchronized (zzhdg.class) {
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
                    return new zzhdf(null);
                }
                return new zzhdg();
            }
            return zzgys.w1(zza, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ည\u0000\u0002ည\u0001\u0003ည\u0002", new Object[]{"zzc", "zzd", "zze", "zzf"});
        }
        return (byte) 1;
    }
}
