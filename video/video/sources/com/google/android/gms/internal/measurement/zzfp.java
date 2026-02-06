package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzix;
import java.util.List;
import o.C11304zt1;

/* loaded from: classes3.dex */
public final class zzfp {

    /* loaded from: classes3.dex */
    public static final class zza extends zzix<zza, C0116zza> implements zzkl {
        private static final zza zzc;
        private static volatile zzkw<zza> zzd;
        private zzjf<zzb> zze = zzix.B();

        /* renamed from: com.google.android.gms.internal.measurement.zzfp$zza$zza  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static final class C0116zza extends zzix.zzb<zza, C0116zza> implements zzkl {
            private C0116zza() {
                super(zza.zzc);
            }

            public /* synthetic */ C0116zza(zzfo zzfoVar) {
                this();
            }
        }

        static {
            zza zzaVar = new zza();
            zzc = zzaVar;
            zzix.t(zza.class, zzaVar);
        }

        private zza() {
        }

        public static zza G() {
            return zzc;
        }

        public final List<zzb> H() {
            return this.zze;
        }

        public final int m() {
            return this.zze.size();
        }

        @Override // com.google.android.gms.internal.measurement.zzix
        public final Object q(int i, Object obj, Object obj2) {
            zzkw zzkwVar;
            switch (zzfo.a[i - 1]) {
                case 1:
                    return new zza();
                case 2:
                    return new C0116zza(null);
                case 3:
                    return zzix.r(zzc, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zze", zzb.class});
                case 4:
                    return zzc;
                case 5:
                    zzkw<zza> zzkwVar2 = zzd;
                    if (zzkwVar2 == null) {
                        synchronized (zza.class) {
                            try {
                                zzkwVar = zzd;
                                if (zzkwVar == null) {
                                    zzkwVar = new zzix.zza(zzc);
                                    zzd = zzkwVar;
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        return zzkwVar;
                    }
                    return zzkwVar2;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }
    }

    /* loaded from: classes3.dex */
    public static final class zzb extends zzix<zzb, zza> implements zzkl {
        private static final zzb zzc;
        private static volatile zzkw<zzb> zzd;
        private int zze;
        private String zzf = "";
        private zzjf<zzd> zzg = zzix.B();

        /* loaded from: classes3.dex */
        public static final class zza extends zzix.zzb<zzb, zza> implements zzkl {
            private zza() {
                super(zzb.zzc);
            }

            public /* synthetic */ zza(zzfo zzfoVar) {
                this();
            }
        }

        static {
            zzb zzbVar = new zzb();
            zzc = zzbVar;
            zzix.t(zzb.class, zzbVar);
        }

        private zzb() {
        }

        public final String G() {
            return this.zzf;
        }

        public final List<zzd> H() {
            return this.zzg;
        }

        @Override // com.google.android.gms.internal.measurement.zzix
        public final Object q(int i, Object obj, Object obj2) {
            zzkw zzkwVar;
            switch (zzfo.a[i - 1]) {
                case 1:
                    return new zzb();
                case 2:
                    return new zza(null);
                case 3:
                    return zzix.r(zzc, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b", new Object[]{"zze", "zzf", "zzg", zzd.class});
                case 4:
                    return zzc;
                case 5:
                    zzkw<zzb> zzkwVar2 = zzd;
                    if (zzkwVar2 == null) {
                        synchronized (zzb.class) {
                            try {
                                zzkwVar = zzd;
                                if (zzkwVar == null) {
                                    zzkwVar = new zzix.zza(zzc);
                                    zzd = zzkwVar;
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        return zzkwVar;
                    }
                    return zzkwVar2;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }
    }

    /* loaded from: classes3.dex */
    public static final class zzc extends zzix<zzc, zza> implements zzkl {
        private static final zzc zzc;
        private static volatile zzkw<zzc> zzd;
        private int zze;
        private zzjf<zzd> zzf = zzix.B();
        private zza zzg;

        /* loaded from: classes3.dex */
        public static final class zza extends zzix.zzb<zzc, zza> implements zzkl {
            private zza() {
                super(zzc.zzc);
            }

            public /* synthetic */ zza(zzfo zzfoVar) {
                this();
            }
        }

        static {
            zzc zzcVar = new zzc();
            zzc = zzcVar;
            zzix.t(zzc.class, zzcVar);
        }

        private zzc() {
        }

        public final zza F() {
            zza zzaVar = this.zzg;
            if (zzaVar == null) {
                return zza.G();
            }
            return zzaVar;
        }

        public final List<zzd> H() {
            return this.zzf;
        }

        @Override // com.google.android.gms.internal.measurement.zzix
        public final Object q(int i, Object obj, Object obj2) {
            zzkw zzkwVar;
            switch (zzfo.a[i - 1]) {
                case 1:
                    return new zzc();
                case 2:
                    return new zza(null);
                case 3:
                    return zzix.r(zzc, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000", new Object[]{"zze", "zzf", zzd.class, "zzg"});
                case 4:
                    return zzc;
                case 5:
                    zzkw<zzc> zzkwVar2 = zzd;
                    if (zzkwVar2 == null) {
                        synchronized (zzc.class) {
                            try {
                                zzkwVar = zzd;
                                if (zzkwVar == null) {
                                    zzkwVar = new zzix.zza(zzc);
                                    zzd = zzkwVar;
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        return zzkwVar;
                    }
                    return zzkwVar2;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }
    }

    /* loaded from: classes3.dex */
    public static final class zzd extends zzix<zzd, zza> implements zzkl {
        private static final zzd zzc;
        private static volatile zzkw<zzd> zzd;
        private int zze;
        private int zzf;
        private zzjf<zzd> zzg = zzix.B();
        private String zzh = "";
        private String zzi = "";
        private boolean zzj;
        private double zzk;

        /* loaded from: classes3.dex */
        public static final class zza extends zzix.zzb<zzd, zza> implements zzkl {
            private zza() {
                super(zzd.zzc);
            }

            public /* synthetic */ zza(zzfo zzfoVar) {
                this();
            }
        }

        /* loaded from: classes3.dex */
        public enum zzb implements zzjc {
            UNKNOWN(0),
            STRING(1),
            NUMBER(2),
            BOOLEAN(3),
            STATEMENT(4);
            
            public static final zzjb<zzb> b1 = new zzfq();
            public final int X;

            zzb(int i) {
                this.X = i;
            }

            public static zzb e(int i) {
                if (i != 0) {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                if (i != 4) {
                                    return null;
                                }
                                return STATEMENT;
                            }
                            return BOOLEAN;
                        }
                        return NUMBER;
                    }
                    return STRING;
                }
                return UNKNOWN;
            }

            public static zzje g() {
                return zzfs.a;
            }

            @Override // com.google.android.gms.internal.measurement.zzjc
            public final int a() {
                return this.X;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "<" + zzb.class.getName() + C11304zt1.a + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.X + " name=" + name() + '>';
            }
        }

        static {
            zzd zzdVar = new zzd();
            zzc = zzdVar;
            zzix.t(zzd.class, zzdVar);
        }

        private zzd() {
        }

        public final double F() {
            return this.zzk;
        }

        public final zzb G() {
            zzb e = zzb.e(this.zzf);
            if (e == null) {
                return zzb.UNKNOWN;
            }
            return e;
        }

        public final String I() {
            return this.zzh;
        }

        public final String J() {
            return this.zzi;
        }

        public final List<zzd> K() {
            return this.zzg;
        }

        public final boolean L() {
            return this.zzj;
        }

        public final boolean M() {
            if ((this.zze & 8) != 0) {
                return true;
            }
            return false;
        }

        public final boolean N() {
            if ((this.zze & 16) != 0) {
                return true;
            }
            return false;
        }

        public final boolean O() {
            if ((this.zze & 4) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.android.gms.internal.measurement.zzix
        public final Object q(int i, Object obj, Object obj2) {
            zzkw zzkwVar;
            switch (zzfo.a[i - 1]) {
                case 1:
                    return new zzd();
                case 2:
                    return new zza(null);
                case 3:
                    return zzix.r(zzc, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001᠌\u0000\u0002\u001b\u0003ဈ\u0001\u0004ဈ\u0002\u0005ဇ\u0003\u0006က\u0004", new Object[]{"zze", "zzf", zzb.g(), "zzg", zzd.class, "zzh", "zzi", "zzj", "zzk"});
                case 4:
                    return zzc;
                case 5:
                    zzkw<zzd> zzkwVar2 = zzd;
                    if (zzkwVar2 == null) {
                        synchronized (zzd.class) {
                            try {
                                zzkwVar = zzd;
                                if (zzkwVar == null) {
                                    zzkwVar = new zzix.zza(zzc);
                                    zzd = zzkwVar;
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        return zzkwVar;
                    }
                    return zzkwVar2;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }
    }
}
