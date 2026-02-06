package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzfhu extends zzgys implements zzhae {
    private static final zzfhu zza;
    private static volatile zzhal zzb;
    private int zzB;
    private int zzF;
    private int zzG;
    private int zzH;
    private long zzI;
    private int zzJ;
    private int zzQ;
    private int zzR;
    private int zzT;
    private long zzad;
    private int zzaf;
    private int zzag;
    private int zzah;
    private zzfjb zzai;
    private int zzaj;
    private zzfiv zzak;
    private zzfic zzal;
    private zzfii zzam;
    private zzfif zzan;
    private zzfiy zzao;
    private zzfip zzap;
    private zzfim zzaq;
    private zzhbz zzar;
    private zzfje zzat;
    private int zzc;
    private int zzd;
    private int zze;
    private long zzg;
    private long zzh;
    private long zzi;
    private boolean zzk;
    private long zzl;
    private long zzm;
    private long zzn;
    private long zzo;
    private int zzp;
    private String zzf = "";
    private zzgza zzj = zzgys.m1();
    private String zzu = "";
    private String zzv = "";
    private String zzw = "";
    private String zzx = "";
    private String zzy = "";
    private String zzz = "";
    private String zzA = "";
    private String zzC = "";
    private String zzD = "";
    private zzgzd zzE = zzgys.o1();
    private String zzK = "";
    private String zzL = "";
    private String zzM = "";
    private String zzN = "";
    private String zzO = "";
    private String zzP = "";
    private String zzS = "";
    private String zzU = "";
    private String zzV = "";
    private String zzW = "";
    private String zzX = "";
    private String zzY = "";
    private String zzZ = "";
    private String zzaa = "";
    private String zzab = "";
    private String zzac = "";
    private String zzae = "";
    private String zzas = "";

    static {
        zzfhu zzfhuVar = new zzfhu();
        zza = zzfhuVar;
        zzgys.F1(zzfhu.class, zzfhuVar);
    }

    private zzfhu() {
    }

    public static /* synthetic */ void B2(zzfhu zzfhuVar, String str) {
        str.getClass();
        zzfhuVar.zzX = str;
    }

    public static /* synthetic */ void E2(zzfhu zzfhuVar, String str) {
        str.getClass();
        zzfhuVar.zzA = str;
    }

    public static /* synthetic */ void F2(zzfhu zzfhuVar, String str) {
        str.getClass();
        zzfhuVar.zzZ = str;
    }

    public static /* synthetic */ void H2(zzfhu zzfhuVar, String str) {
        str.getClass();
        zzfhuVar.zzu = str;
    }

    public static /* synthetic */ void I2(zzfhu zzfhuVar, String str) {
        str.getClass();
        zzfhuVar.zzab = str;
    }

    public static /* synthetic */ void M2(zzfhu zzfhuVar, String str) {
        str.getClass();
        zzfhuVar.zzaa = str;
    }

    public static /* synthetic */ void N2(zzfhu zzfhuVar, int i) {
        if (i != 1) {
            zzfhuVar.zzJ = i - 2;
            return;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public static /* synthetic */ void P2(zzfhu zzfhuVar, int i) {
        if (i != 1) {
            zzfhuVar.zzF = i - 2;
            return;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public static zzfhr s2() {
        return (zzfhr) zza.f1();
    }

    public static /* synthetic */ void u2(zzfhu zzfhuVar, Iterable iterable) {
        zzgzd zzgzdVar = zzfhuVar.zzE;
        if (!zzgzdVar.c()) {
            zzfhuVar.zzE = zzgys.p1(zzgzdVar);
        }
        zzgwt.U0(iterable, zzfhuVar.zzE);
    }

    public static /* synthetic */ void v2(zzfhu zzfhuVar, String str) {
        str.getClass();
        zzfhuVar.zzy = str;
    }

    public static /* synthetic */ void w2(zzfhu zzfhuVar, String str) {
        str.getClass();
        zzfhuVar.zzK = str;
    }

    public static /* synthetic */ void x2(zzfhu zzfhuVar, String str) {
        str.getClass();
        zzfhuVar.zzac = str;
    }

    public static /* synthetic */ void z2(zzfhu zzfhuVar, String str) {
        str.getClass();
        zzfhuVar.zzL = str;
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
                                    synchronized (zzfhu.class) {
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
                    return new zzfhr(null);
                }
                return new zzfhu();
            }
            return zzgys.w1(zza, "\u0004A\u0000\u0001\u0001AA\u0000\u0002\u0000\u0001\f\u0002\u0007\u0003\u0002\u0004\f\u0005Ȉ\u0006Ȉ\u0007Ȉ\b\u0004\t\f\n\u0004\u000b\u0002\f\f\rȈ\u000eȈ\u000fȈ\u0010Ȉ\u0011Ȉ\u0012Ȉ\u0013Ȉ\u0014Ȉ\u0015Ȉ\u0016Ȉ\u0017Ȉ\u0018Ȉ\u0019%\u001aȈ\u001bȈ\u001cȈ\u001d\u0002\u001eȈ\u001f\u0002 \u0002!\u0002\"\u0002#\u0002$\u0002%,&\f'\f(\f)ဉ\u0001*ဉ\u0002+\u0004,Ȉ-Ȉ.Ȉ/\f0\u00041\u00042Ȉ3Ȉ4ဉ\u00035\f6ဉ\u00047Ȉ8\u00049ဉ\u0000:ဉ\u0005;ဉ\u0006<Ȉ=ဉ\u0007>ဉ\b?Ȉ@ȈAဉ\t", new Object[]{"zzc", "zzd", "zzk", "zzl", "zzp", "zzu", "zzy", "zzA", "zzB", "zzF", "zzH", "zzI", "zzJ", "zzK", "zzL", "zzX", "zzY", "zzZ", "zzaa", "zzab", "zzac", "zzv", "zzw", "zzC", "zzD", "zzE", "zzM", "zzN", "zzV", "zzad", "zzf", "zzg", "zzh", "zzi", "zzm", "zzn", "zzo", "zzj", "zzag", "zzah", "zze", "zzak", "zzal", "zzQ", "zzS", "zzP", "zzO", "zzaj", "zzR", "zzT", "zzU", "zzz", "zzam", "zzG", "zzan", "zzae", "zzaf", "zzai", "zzao", "zzap", "zzW", "zzaq", "zzar", "zzas", "zzx", "zzat"});
        }
        return (byte) 1;
    }
}
