package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzgrr extends zzgys implements zzhae {
    private static final zzgrr zza;
    private static volatile zzhal zzb;
    private int zzc;
    private int zzd;
    private zzgrx zze;
    private zzgxk zzf = zzgxk.Y;

    static {
        zzgrr zzgrrVar = new zzgrr();
        zza = zzgrrVar;
        zzgys.F1(zzgrr.class, zzgrrVar);
    }

    private zzgrr() {
    }

    public static zzgrp s2() {
        return (zzgrp) zza.f1();
    }

    public static zzgrr u2() {
        return zza;
    }

    public static /* synthetic */ void y2(zzgrr zzgrrVar, zzgrx zzgrxVar) {
        zzgrxVar.getClass();
        zzgrrVar.zze = zzgrxVar;
        zzgrrVar.zzc |= 1;
    }

    public final int a() {
        return this.zzd;
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
                                    synchronized (zzgrr.class) {
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
                    return new zzgrp(null);
                }
                return new zzgrr();
            }
            return zzgys.w1(zza, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n", new Object[]{"zzc", "zzd", "zze", "zzf"});
        }
        return (byte) 1;
    }

    public final zzgrx v2() {
        zzgrx zzgrxVar = this.zze;
        if (zzgrxVar == null) {
            return zzgrx.u2();
        }
        return zzgrxVar;
    }

    public final zzgxk w2() {
        return this.zzf;
    }
}
