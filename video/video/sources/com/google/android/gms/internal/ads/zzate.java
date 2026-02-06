package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzate extends zzgys implements zzhae {
    private static final zzate zza;
    private static volatile zzhal zzb;
    private int zzc;
    private long zzw;
    private long zzx;
    private long zzd = -1;
    private long zze = -1;
    private long zzf = -1;
    private long zzg = -1;
    private long zzh = -1;
    private long zzi = -1;
    private int zzj = 1000;
    private long zzk = -1;
    private long zzl = -1;
    private long zzm = -1;
    private int zzn = 1000;
    private long zzo = -1;
    private long zzp = -1;
    private long zzu = -1;
    private long zzv = -1;
    private long zzy = -1;
    private long zzz = -1;
    private long zzA = -1;
    private long zzB = -1;

    static {
        zzate zzateVar = new zzate();
        zza = zzateVar;
        zzgys.F1(zzate.class, zzateVar);
    }

    private zzate() {
    }

    public static /* synthetic */ void A2(zzate zzateVar, long j) {
        zzateVar.zzc |= 4;
        zzateVar.zzf = j;
    }

    public static /* synthetic */ void B2(zzate zzateVar, long j) {
        zzateVar.zzc |= 16;
        zzateVar.zzh = j;
    }

    public static /* synthetic */ void C2(zzate zzateVar, long j) {
        zzateVar.zzc |= 128;
        zzateVar.zzk = j;
    }

    public static /* synthetic */ void D2(zzate zzateVar, long j) {
        zzateVar.zzc |= 131072;
        zzateVar.zzy = j;
    }

    public static /* synthetic */ void E2(zzate zzateVar, long j) {
        zzateVar.zzc |= 1;
        zzateVar.zzd = j;
    }

    public static /* synthetic */ void F2(zzate zzateVar, long j) {
        zzateVar.zzc |= 262144;
        zzateVar.zzz = j;
    }

    public static /* synthetic */ void G2(zzate zzateVar, long j) {
        zzateVar.zzc |= 2;
        zzateVar.zze = j;
    }

    public static /* synthetic */ void H2(zzate zzateVar, long j) {
        zzateVar.zzc |= 256;
        zzateVar.zzl = j;
    }

    public static /* synthetic */ void I2(zzate zzateVar, long j) {
        zzateVar.zzc |= 32768;
        zzateVar.zzw = j;
    }

    public static /* synthetic */ void J2(zzate zzateVar, long j) {
        zzateVar.zzc |= 65536;
        zzateVar.zzx = j;
    }

    public static /* synthetic */ void K2(zzate zzateVar, long j) {
        zzateVar.zzc |= 8192;
        zzateVar.zzu = j;
    }

    public static /* synthetic */ void L2(zzate zzateVar, long j) {
        zzateVar.zzc |= 16384;
        zzateVar.zzv = j;
    }

    public static /* synthetic */ void M2(zzate zzateVar, int i) {
        zzateVar.zzn = i - 1;
        zzateVar.zzc |= 1024;
    }

    public static /* synthetic */ void N2(zzate zzateVar, int i) {
        zzateVar.zzj = i - 1;
        zzateVar.zzc |= 64;
    }

    public static zzatd s2() {
        return (zzatd) zza.f1();
    }

    public static /* synthetic */ void u2(zzate zzateVar) {
        zzateVar.zzc &= -9;
        zzateVar.zzg = -1L;
    }

    public static /* synthetic */ void v2(zzate zzateVar, long j) {
        zzateVar.zzc |= 8;
        zzateVar.zzg = j;
    }

    public static /* synthetic */ void w2(zzate zzateVar, long j) {
        zzateVar.zzc |= 32;
        zzateVar.zzi = j;
    }

    public static /* synthetic */ void x2(zzate zzateVar, long j) {
        zzateVar.zzc |= 4096;
        zzateVar.zzp = j;
    }

    public static /* synthetic */ void y2(zzate zzateVar, long j) {
        zzateVar.zzc |= 512;
        zzateVar.zzm = j;
    }

    public static /* synthetic */ void z2(zzate zzateVar, long j) {
        zzateVar.zzc |= 2048;
        zzateVar.zzo = j;
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
                                    synchronized (zzate.class) {
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
                    return new zzatd(null);
                }
                return new zzate();
            }
            zzgyy zzgyyVar = zzatp.a;
            return zzgys.w1(zza, "\u0001\u0015\u0000\u0001\u0001\u0015\u0015\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007᠌\u0006\bဂ\u0007\tဂ\b\nဂ\t\u000b᠌\n\fဂ\u000b\rဂ\f\u000eဂ\r\u000fဂ\u000e\u0010ဂ\u000f\u0011ဂ\u0010\u0012ဂ\u0011\u0013ဂ\u0012\u0014ဂ\u0013\u0015ဂ\u0014", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", zzgyyVar, "zzk", "zzl", "zzm", "zzn", zzgyyVar, "zzo", "zzp", "zzu", "zzv", "zzw", "zzx", "zzy", "zzz", "zzA", "zzB"});
        }
        return (byte) 1;
    }
}
