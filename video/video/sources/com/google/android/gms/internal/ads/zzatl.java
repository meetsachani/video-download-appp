package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzatl extends zzgys implements zzhae {
    private static final zzatl zza;
    private static volatile zzhal zzb;
    private int zzc;
    private zzgxk zzd;
    private zzgxk zze;
    private zzgxk zzf;
    private zzgxk zzg;

    static {
        zzatl zzatlVar = new zzatl();
        zza = zzatlVar;
        zzgys.F1(zzatl.class, zzatlVar);
    }

    private zzatl() {
        zzgxk zzgxkVar = zzgxk.Y;
        this.zzd = zzgxkVar;
        this.zze = zzgxkVar;
        this.zzf = zzgxkVar;
        this.zzg = zzgxkVar;
    }

    public static /* synthetic */ void A2(zzatl zzatlVar, zzgxk zzgxkVar) {
        zzatlVar.zzc |= 2;
        zzatlVar.zze = zzgxkVar;
    }

    public static /* synthetic */ void B2(zzatl zzatlVar, zzgxk zzgxkVar) {
        zzatlVar.zzc |= 8;
        zzatlVar.zzg = zzgxkVar;
    }

    public static /* synthetic */ void C2(zzatl zzatlVar, zzgxk zzgxkVar) {
        zzatlVar.zzc |= 4;
        zzatlVar.zzf = zzgxkVar;
    }

    public static zzatk s2() {
        return (zzatk) zza.f1();
    }

    public static zzatl u2(byte[] bArr, zzgyc zzgycVar) throws zzgzh {
        return (zzatl) zzgys.b2(zza, bArr, zzgycVar);
    }

    public static /* synthetic */ void z2(zzatl zzatlVar, zzgxk zzgxkVar) {
        zzatlVar.zzc |= 1;
        zzatlVar.zzd = zzgxkVar;
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
                                    synchronized (zzatl.class) {
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
                    return new zzatk(null);
                }
                return new zzatl();
            }
            return zzgys.w1(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ည\u0000\u0002ည\u0001\u0003ည\u0002\u0004ည\u0003", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg"});
        }
        return (byte) 1;
    }

    public final zzgxk v2() {
        return this.zzd;
    }

    public final zzgxk w2() {
        return this.zze;
    }

    public final zzgxk x2() {
        return this.zzg;
    }

    public final zzgxk y2() {
        return this.zzf;
    }
}
