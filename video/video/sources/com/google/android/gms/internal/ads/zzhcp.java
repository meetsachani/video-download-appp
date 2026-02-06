package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzhcp extends zzgys implements zzhae {
    private static final zzhcp zza;
    private static volatile zzhal zzb;
    private int zzc;
    private int zzd;
    private boolean zze;
    private int zzh;
    private boolean zzi;
    private boolean zzj;
    private boolean zzk;
    private int zzm;
    private int zzn;
    private int zzo;
    private boolean zzp;
    private boolean zzv;
    private long zzw;
    private boolean zzy;
    private String zzf = "";
    private zzgze zzg = zzgys.q1();
    private String zzl = "";
    private zzgze zzu = zzgys.q1();
    private zzgza zzx = zzgys.m1();
    private zzgza zzz = zzgys.m1();

    static {
        zzhcp zzhcpVar = new zzhcp();
        zza = zzhcpVar;
        zzgys.F1(zzhcp.class, zzhcpVar);
    }

    private zzhcp() {
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
                                    synchronized (zzhcp.class) {
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
                    return new zzhci(null);
                }
                return new zzhcp();
            }
            return zzgys.w1(zza, "\u0001\u0013\u0000\u0001\u0001\u0013\u0013\u0000\u0004\u0000\u0001᠌\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004\u001a\u0005᠌\u0003\u0006ဇ\u0004\u0007ဇ\u0005\bဇ\u0006\tဈ\u0007\nင\b\u000bင\t\fင\n\rဇ\u000b\u000e\u001b\u000fဇ\f\u0010ဂ\r\u0011ࠬ\u0012ဇ\u000e\u0013ࠬ", new Object[]{"zzc", "zzd", zzhco.a, "zze", "zzf", "zzg", "zzh", zzhcm.a, "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzu", zzhcl.class, "zzv", "zzw", "zzx", zzhcc.a(), "zzy", "zzz", zzhcn.a});
        }
        return (byte) 1;
    }
}
