package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzhdh extends zzgys implements zzhae {
    private static final zzhdh zza;
    private static volatile zzhal zzb;
    private int zzc;
    private zzhdg zzd;
    private zzgxk zzf;
    private zzgxk zzg;
    private int zzh;
    private byte zzi = 2;
    private zzgze zze = zzgys.q1();

    static {
        zzhdh zzhdhVar = new zzhdh();
        zza = zzhdhVar;
        zzgys.F1(zzhdh.class, zzhdhVar);
    }

    private zzhdh() {
        zzgxk zzgxkVar = zzgxk.Y;
        this.zzf = zzgxkVar;
        this.zzg = zzgxkVar;
    }

    public static zzhde s2() {
        return (zzhde) zza.f1();
    }

    public static /* synthetic */ void u2(zzhdh zzhdhVar, zzhdd zzhddVar) {
        zzhddVar.getClass();
        zzgze zzgzeVar = zzhdhVar.zze;
        if (!zzgzeVar.c()) {
            zzhdhVar.zze = zzgys.r1(zzgzeVar);
        }
        zzhdhVar.zze.add(zzhddVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgys
    public final Object l2(zzgyr zzgyrVar, Object obj, Object obj2) {
        byte b;
        zzhal zzhalVar;
        switch (zzgyrVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.zzi);
            case 1:
                if (obj == null) {
                    b = 0;
                } else {
                    b = 1;
                }
                this.zzi = b;
                return null;
            case 2:
                return zzgys.w1(zza, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0001\u0001ဉ\u0000\u0002Л\u0003ည\u0001\u0004ည\u0002\u0005င\u0003", new Object[]{"zzc", "zzd", "zze", zzhdd.class, "zzf", "zzg", "zzh"});
            case 3:
                return new zzhdh();
            case 4:
                return new zzhde(null);
            case 5:
                return zza;
            case 6:
                zzhal zzhalVar2 = zzb;
                if (zzhalVar2 == null) {
                    synchronized (zzhdh.class) {
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
}
