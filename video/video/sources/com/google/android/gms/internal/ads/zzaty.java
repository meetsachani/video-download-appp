package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzaty extends zzgys implements zzhae {
    private static final zzaty zza;
    private static volatile zzhal zzb;
    private int zzc;
    private zzgze zzd = zzgys.q1();
    private zzgxk zze = zzgxk.Y;
    private int zzf = 1;
    private int zzg = 1;

    static {
        zzaty zzatyVar = new zzaty();
        zza = zzatyVar;
        zzgys.F1(zzaty.class, zzatyVar);
    }

    private zzaty() {
    }

    public static zzatx s2() {
        return (zzatx) zza.f1();
    }

    public static /* synthetic */ void u2(zzaty zzatyVar, zzgxk zzgxkVar) {
        zzgze zzgzeVar = zzatyVar.zzd;
        if (!zzgzeVar.c()) {
            zzatyVar.zzd = zzgys.r1(zzgzeVar);
        }
        zzatyVar.zzd.add(zzgxkVar);
    }

    public static /* synthetic */ void v2(zzaty zzatyVar, zzgxk zzgxkVar) {
        zzatyVar.zzc |= 1;
        zzatyVar.zze = zzgxkVar;
    }

    public static /* synthetic */ void w2(zzaty zzatyVar, int i) {
        zzatyVar.zzg = i - 1;
        zzatyVar.zzc |= 4;
    }

    public static /* synthetic */ void x2(zzaty zzatyVar, int i) {
        zzatyVar.zzf = 4;
        zzatyVar.zzc |= 2;
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
                                    synchronized (zzaty.class) {
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
                    return new zzatx(null);
                }
                return new zzaty();
            }
            return zzgys.w1(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u001c\u0002ည\u0000\u0003᠌\u0001\u0004᠌\u0002", new Object[]{"zzc", "zzd", "zze", "zzf", zzats.a, "zzg", zzato.a});
        }
        return (byte) 1;
    }
}
