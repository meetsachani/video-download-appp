package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzheg extends zzgys implements zzhae {
    private static final zzheg zza;
    private static volatile zzhal zzb;
    private int zzc;
    private int zzd;
    private zzhdh zzf;
    private zzhdl zzg;
    private int zzh;
    private int zzk;
    private byte zzm = 2;
    private String zze = "";
    private zzgza zzi = zzgys.m1();
    private String zzj = "";
    private zzgze zzl = zzgys.q1();

    static {
        zzheg zzhegVar = new zzheg();
        zza = zzhegVar;
        zzgys.F1(zzheg.class, zzhegVar);
    }

    private zzheg() {
    }

    public static zzhef s2() {
        return (zzhef) zza.f1();
    }

    public static /* synthetic */ void v2(zzheg zzhegVar, String str) {
        str.getClass();
        zzgze zzgzeVar = zzhegVar.zzl;
        if (!zzgzeVar.c()) {
            zzhegVar.zzl = zzgys.r1(zzgzeVar);
        }
        zzhegVar.zzl.add(str);
    }

    public static /* synthetic */ void w2(zzheg zzhegVar, int i) {
        zzhegVar.zzc |= 1;
        zzhegVar.zzd = i;
    }

    public static /* synthetic */ void x2(zzheg zzhegVar, zzhdh zzhdhVar) {
        zzhdhVar.getClass();
        zzhegVar.zzf = zzhdhVar;
        zzhegVar.zzc |= 4;
    }

    public static /* synthetic */ void y2(zzheg zzhegVar, String str) {
        str.getClass();
        zzhegVar.zzc |= 2;
        zzhegVar.zze = str;
    }

    public static /* synthetic */ void z2(zzheg zzhegVar, int i) {
        zzhegVar.zzk = i - 1;
        zzhegVar.zzc |= 64;
    }

    public final int c() {
        return this.zzl.size();
    }

    @Override // com.google.android.gms.internal.ads.zzgys
    public final Object l2(zzgyr zzgyrVar, Object obj, Object obj2) {
        byte b;
        zzhal zzhalVar;
        switch (zzgyrVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.zzm);
            case 1:
                if (obj == null) {
                    b = 0;
                } else {
                    b = 1;
                }
                this.zzm = b;
                return null;
            case 2:
                return zzgys.w1(zza, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0002\u0003\u0001ᔄ\u0000\u0002ဈ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005င\u0004\u0006\u0016\u0007ဈ\u0005\b᠌\u0006\t\u001a", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", zzhed.a, "zzl"});
            case 3:
                return new zzheg();
            case 4:
                return new zzhef(null);
            case 5:
                return zza;
            case 6:
                zzhal zzhalVar2 = zzb;
                if (zzhalVar2 == null) {
                    synchronized (zzheg.class) {
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
        return this.zze;
    }
}
