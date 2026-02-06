package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzgud extends zzgys implements zzhae {
    private static final zzgud zza;
    private static volatile zzhal zzb;
    private int zzc;
    private zzgze zzd = zzgys.q1();

    static {
        zzgud zzgudVar = new zzgud();
        zza = zzgudVar;
        zzgys.F1(zzgud.class, zzgudVar);
    }

    private zzgud() {
    }

    public static zzgtz s2() {
        return (zzgtz) zza.f1();
    }

    public static /* bridge */ /* synthetic */ zzgud t2() {
        return zza;
    }

    public static /* synthetic */ void u2(zzgud zzgudVar, zzgub zzgubVar) {
        zzgubVar.getClass();
        zzgze zzgzeVar = zzgudVar.zzd;
        if (!zzgzeVar.c()) {
            zzgudVar.zzd = zzgys.r1(zzgzeVar);
        }
        zzgudVar.zzd.add(zzgubVar);
    }

    public static /* synthetic */ void v2(zzgud zzgudVar, int i) {
        zzgudVar.zzc = i;
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
                                    synchronized (zzgud.class) {
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
                    return new zzgtz(null);
                }
                return new zzgud();
            }
            return zzgys.w1(zza, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"zzc", "zzd", zzgub.class});
        }
        return (byte) 1;
    }
}
