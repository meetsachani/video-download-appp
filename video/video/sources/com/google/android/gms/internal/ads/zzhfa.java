package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzhfa extends zzgys implements zzhae {
    private static final zzhfa zza;
    private static volatile zzhal zzb;
    private int zzc;
    private boolean zzj;
    private double zzk;
    private int zzm;
    private boolean zzn;
    private boolean zzo;
    private boolean zzp;
    private boolean zzu;
    private String zzd = "";
    private String zze = "";
    private int zzf = 4;
    private zzgze zzg = zzgys.q1();
    private String zzh = "";
    private String zzi = "";
    private zzgze zzl = zzgys.q1();

    static {
        zzhfa zzhfaVar = new zzhfa();
        zza = zzhfaVar;
        zzgys.F1(zzhfa.class, zzhfaVar);
    }

    private zzhfa() {
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
                                    synchronized (zzhfa.class) {
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
                    return new zzhev(null);
                }
                return new zzhfa();
            }
            return zzgys.w1(zza, "\u0001\u000e\u0000\u0001\u0001\u000e\u000e\u0000\u0002\u0000\u0001ဈ\u0000\u0002᠌\u0002\u0003\u001a\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဇ\u0005\u0007က\u0006\b\u001b\tဈ\u0001\n᠌\u0007\u000bဇ\b\fဇ\t\rဇ\n\u000eဇ\u000b", new Object[]{"zzc", "zzd", "zzf", zzhez.a, "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", zzhey.class, "zze", "zzm", zzhew.a, "zzn", "zzo", "zzp", "zzu"});
        }
        return (byte) 1;
    }
}
