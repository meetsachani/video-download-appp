package com.google.android.gms.internal.ads;

import java.util.List;

/* loaded from: classes2.dex */
public final class zzheq extends zzgys implements zzhae {
    private static final zzheq zza;
    private static volatile zzhal zzb;
    private zzhem zzC;
    private zzhcx zzE;
    private zzhcp zzG;
    private zzhdq zzI;
    private int zzJ;
    private long zzM;
    private zzhep zzN;
    private zzhdv zzO;
    private int zzc;
    private int zzd;
    private int zze;
    private zzhct zzi;
    private zzheb zzm;
    private boolean zzn;
    private boolean zzu;
    private boolean zzv;
    private zzhei zzx;
    private boolean zzy;
    private byte zzQ = 2;
    private String zzf = "";
    private String zzg = "";
    private String zzh = "";
    private zzgze zzj = zzgys.q1();
    private zzgze zzk = zzgys.q1();
    private String zzl = "";
    private zzgze zzo = zzgys.q1();
    private String zzp = "";
    private zzgxk zzw = zzgxk.Y;
    private String zzz = "";
    private zzgze zzA = zzgys.q1();
    private zzgze zzB = zzgys.q1();
    private zzgze zzD = zzgys.q1();
    private String zzF = "";
    private zzgze zzH = zzgys.q1();
    private zzgze zzK = zzgys.q1();
    private zzgze zzL = zzgys.q1();
    private String zzP = "";

    static {
        zzheq zzheqVar = new zzheq();
        zza = zzheqVar;
        zzgys.F1(zzheq.class, zzheqVar);
    }

    private zzheq() {
    }

    public static /* synthetic */ void A2(zzheq zzheqVar) {
        zzheqVar.zzc &= -65;
        zzheqVar.zzl = zza.zzl;
    }

    public static /* synthetic */ void B2(zzheq zzheqVar, String str) {
        zzheqVar.zzc |= 64;
        zzheqVar.zzl = str;
    }

    public static /* synthetic */ void C2(zzheq zzheqVar, zzhei zzheiVar) {
        zzheiVar.getClass();
        zzheqVar.zzx = zzheiVar;
        zzheqVar.zzc |= 8192;
    }

    public static /* synthetic */ void D2(zzheq zzheqVar, zzhct zzhctVar) {
        zzhctVar.getClass();
        zzheqVar.zzi = zzhctVar;
        zzheqVar.zzc |= 32;
    }

    public static /* synthetic */ void E2(zzheq zzheqVar, String str) {
        zzheqVar.zzc |= 8;
        zzheqVar.zzg = str;
    }

    public static /* synthetic */ void F2(zzheq zzheqVar, zzheb zzhebVar) {
        zzhebVar.getClass();
        zzheqVar.zzm = zzhebVar;
        zzheqVar.zzc |= 128;
    }

    public static /* synthetic */ void G2(zzheq zzheqVar, String str) {
        zzheqVar.zzc |= 4;
        zzheqVar.zzf = str;
    }

    public static /* synthetic */ void H2(zzheq zzheqVar, int i) {
        zzheqVar.zzd = i - 1;
        zzheqVar.zzc |= 1;
    }

    public static zzhcr s2() {
        return (zzhcr) zza.f1();
    }

    public static /* synthetic */ void x2(zzheq zzheqVar, Iterable iterable) {
        zzgze zzgzeVar = zzheqVar.zzA;
        if (!zzgzeVar.c()) {
            zzheqVar.zzA = zzgys.r1(zzgzeVar);
        }
        zzgwt.U0(iterable, zzheqVar.zzA);
    }

    public static /* synthetic */ void y2(zzheq zzheqVar, Iterable iterable) {
        zzgze zzgzeVar = zzheqVar.zzB;
        if (!zzgzeVar.c()) {
            zzheqVar.zzB = zzgys.r1(zzgzeVar);
        }
        zzgwt.U0(iterable, zzheqVar.zzB);
    }

    public static /* synthetic */ void z2(zzheq zzheqVar, zzheg zzhegVar) {
        zzhegVar.getClass();
        zzgze zzgzeVar = zzheqVar.zzj;
        if (!zzgzeVar.c()) {
            zzheqVar.zzj = zzgys.r1(zzgzeVar);
        }
        zzheqVar.zzj.add(zzhegVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgys
    public final Object l2(zzgyr zzgyrVar, Object obj, Object obj2) {
        byte b;
        zzhal zzhalVar;
        switch (zzgyrVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.zzQ);
            case 1:
                if (obj == null) {
                    b = 0;
                } else {
                    b = 1;
                }
                this.zzQ = b;
                return null;
            case 2:
                return zzgys.w1(zza, "\u0001#\u0000\u0001\u0001##\u0000\t\u0001\u0001ဈ\u0002\u0002ဈ\u0003\u0003ဈ\u0004\u0004Л\u0005ဇ\b\u0006\u001a\u0007ဈ\t\bဇ\n\tဇ\u000b\n᠌\u0000\u000b᠌\u0001\fဉ\u0005\rဈ\u0006\u000eဉ\u0007\u000fည\f\u0010\u001b\u0011ဉ\r\u0012ဇ\u000e\u0013ဈ\u000f\u0014\u001a\u0015\u001a\u0016ဉ\u0010\u0017\u001b\u0018ဉ\u0011\u0019ဈ\u0012\u001aဉ\u0013\u001b\u001b\u001cဉ\u0014\u001d᠌\u0015\u001e\u001b\u001f\u001b ဂ\u0016!ဉ\u0017\"ဉ\u0018#ဈ\u0019", new Object[]{"zzc", "zzf", "zzg", "zzh", "zzj", zzheg.class, "zzn", "zzo", "zzp", "zzu", "zzv", "zzd", zzhec.a, "zze", zzhcq.a, "zzi", "zzl", "zzm", "zzw", "zzk", zzheu.class, "zzx", "zzy", "zzz", "zzA", "zzB", "zzC", "zzD", zzhfa.class, "zzE", "zzF", "zzG", "zzH", zzhdb.class, "zzI", "zzJ", zzhek.a, "zzK", zzhdt.class, "zzL", zzhdy.class, "zzM", "zzN", "zzO", "zzP"});
            case 3:
                return new zzheq();
            case 4:
                return new zzhcr(null);
            case 5:
                return zza;
            case 6:
                zzhal zzhalVar2 = zzb;
                if (zzhalVar2 == null) {
                    synchronized (zzheq.class) {
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
            default:
                throw null;
        }
    }

    public final String u2() {
        return this.zzl;
    }

    public final String v2() {
        return this.zzf;
    }

    public final List w2() {
        return this.zzj;
    }
}
