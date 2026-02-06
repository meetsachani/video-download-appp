package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzhdd extends zzgys implements zzhae {
    private static final zzhdd zza;
    private static volatile zzhal zzb;
    private int zzc;
    private zzgxk zzd;
    private zzgxk zze;
    private byte zzf = 2;

    static {
        zzhdd zzhddVar = new zzhdd();
        zza = zzhddVar;
        zzgys.F1(zzhdd.class, zzhddVar);
    }

    private zzhdd() {
        zzgxk zzgxkVar = zzgxk.Y;
        this.zzd = zzgxkVar;
        this.zze = zzgxkVar;
    }

    public static zzhdc s2() {
        return (zzhdc) zza.f1();
    }

    public static /* bridge */ /* synthetic */ zzhdd t2() {
        return zza;
    }

    public static /* synthetic */ void u2(zzhdd zzhddVar, zzgxk zzgxkVar) {
        zzhddVar.zzc |= 1;
        zzhddVar.zzd = zzgxkVar;
    }

    public static /* synthetic */ void v2(zzhdd zzhddVar, zzgxk zzgxkVar) {
        zzhddVar.zzc |= 2;
        zzhddVar.zze = zzgxkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgys
    public final Object l2(zzgyr zzgyrVar, Object obj, Object obj2) {
        byte b;
        zzhal zzhalVar;
        switch (zzgyrVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.zzf);
            case 1:
                if (obj == null) {
                    b = 0;
                } else {
                    b = 1;
                }
                this.zzf = b;
                return null;
            case 2:
                return zzgys.w1(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ᔊ\u0000\u0002ည\u0001", new Object[]{"zzc", "zzd", "zze"});
            case 3:
                return new zzhdd();
            case 4:
                return new zzhdc(null);
            case 5:
                return zza;
            case 6:
                zzhal zzhalVar2 = zzb;
                if (zzhalVar2 == null) {
                    synchronized (zzhdd.class) {
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
