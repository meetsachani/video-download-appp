package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzasg extends zzgys implements zzhae {
    private static final zzasg zza;
    private static volatile zzhal zzb;
    private int zzc;
    private boolean zzd;
    private int zze = 5000;
    private boolean zzf;
    private boolean zzg;
    private boolean zzh;

    static {
        zzasg zzasgVar = new zzasg();
        zza = zzasgVar;
        zzgys.F1(zzasg.class, zzasgVar);
    }

    private zzasg() {
    }

    public static zzasg t2() {
        return zza;
    }

    public final int a() {
        return this.zze;
    }

    public final boolean e() {
        return this.zzg;
    }

    public final boolean f() {
        return this.zzd;
    }

    public final boolean g() {
        return this.zzf;
    }

    public final boolean h() {
        return this.zzh;
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
                                    synchronized (zzasg.class) {
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
                    return new zzase(null);
                }
                return new zzasg();
            }
            return zzgys.w1(zza, "\u0004\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0000\u0001ဇ\u0000\u0003င\u0001\u0004ဇ\u0002\u0005ဇ\u0003\u0006ဇ\u0004", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg", "zzh"});
        }
        return (byte) 1;
    }
}
