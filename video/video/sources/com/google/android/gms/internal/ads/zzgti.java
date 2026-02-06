package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzgti extends zzgys implements zzhae {
    private static final zzgti zza;
    private static volatile zzhal zzb;
    private int zzc;
    private int zzd;

    static {
        zzgti zzgtiVar = new zzgti();
        zza = zzgtiVar;
        zzgys.F1(zzgti.class, zzgtiVar);
    }

    private zzgti() {
    }

    public static zzgtg t2() {
        return (zzgtg) zza.f1();
    }

    public static zzgti v2() {
        return zza;
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
                                    synchronized (zzgti.class) {
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
                    return new zzgtg(null);
                }
                return new zzgti();
            }
            return zzgys.w1(zza, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\u000b", new Object[]{"zzc", "zzd"});
        }
        return (byte) 1;
    }

    public final zzgsz s2() {
        int i = this.zzc;
        zzgsz zzgszVar = i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? null : zzgsz.SHA224 : zzgsz.SHA512 : zzgsz.SHA256 : zzgsz.SHA384 : zzgsz.SHA1 : zzgsz.UNKNOWN_HASH;
        return zzgszVar == null ? zzgsz.UNRECOGNIZED : zzgszVar;
    }
}
