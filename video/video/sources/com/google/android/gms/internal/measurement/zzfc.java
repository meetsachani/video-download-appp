package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzew;
import com.google.android.gms.internal.measurement.zzfp;
import com.google.android.gms.internal.measurement.zzix;
import java.util.Collections;
import java.util.List;
import o.C11304zt1;

/* loaded from: classes3.dex */
public final class zzfc {

    /* loaded from: classes3.dex */
    public static final class zza extends zzix<zza, C0111zza> implements zzkl {
        private static final zza zzc;
        private static volatile zzkw<zza> zzd;
        private int zze;
        private boolean zzi;
        private zzjf<zzb> zzf = zzix.B();
        private zzjf<zzc> zzg = zzix.B();
        private zzjf<zzf> zzh = zzix.B();
        private zzjf<zzb> zzj = zzix.B();

        /* renamed from: com.google.android.gms.internal.measurement.zzfc$zza$zza  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static final class C0111zza extends zzix.zzb<zza, C0111zza> implements zzkl {
            private C0111zza() {
                super(zza.zzc);
            }

            public /* synthetic */ C0111zza(zzfb zzfbVar) {
                this();
            }
        }

        /* loaded from: classes3.dex */
        public static final class zzb extends zzix<zzb, C0112zza> implements zzkl {
            private static final zzb zzc;
            private static volatile zzkw<zzb> zzd;
            private int zze;
            private int zzf;
            private int zzg;

            /* renamed from: com.google.android.gms.internal.measurement.zzfc$zza$zzb$zza  reason: collision with other inner class name */
            /* loaded from: classes3.dex */
            public static final class C0112zza extends zzix.zzb<zzb, C0112zza> implements zzkl {
                private C0112zza() {
                    super(zzb.zzc);
                }

                public /* synthetic */ C0112zza(zzfb zzfbVar) {
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

            public final zzd G() {
                zzd e = zzd.e(this.zzg);
                if (e == null) {
                    return zzd.CONSENT_STATUS_UNSPECIFIED;
                }
                return e;
            }

            public final zze H() {
                zze e = zze.e(this.zzf);
                if (e == null) {
                    return zze.CONSENT_TYPE_UNSPECIFIED;
                }
                return e;
            }

            @Override // com.google.android.gms.internal.measurement.zzix
            public final Object q(int i, Object obj, Object obj2) {
                zzkw zzkwVar;
                switch (zzfb.a[i - 1]) {
                    case 1:
                        return new zzb();
                    case 2:
                        return new C0112zza(null);
                    case 3:
                        return zzix.r(zzc, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001", new Object[]{"zze", "zzf", zze.g(), "zzg", zzd.g()});
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
        public static final class zzc extends zzix<zzc, C0113zza> implements zzkl {
            private static final zzc zzc;
            private static volatile zzkw<zzc> zzd;
            private int zze;
            private int zzf;
            private int zzg;

            /* renamed from: com.google.android.gms.internal.measurement.zzfc$zza$zzc$zza  reason: collision with other inner class name */
            /* loaded from: classes3.dex */
            public static final class C0113zza extends zzix.zzb<zzc, C0113zza> implements zzkl {
                private C0113zza() {
                    super(zzc.zzc);
                }

                public /* synthetic */ C0113zza(zzfb zzfbVar) {
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

            public final zze G() {
                zze e = zze.e(this.zzg);
                if (e == null) {
                    return zze.CONSENT_TYPE_UNSPECIFIED;
                }
                return e;
            }

            public final zze H() {
                zze e = zze.e(this.zzf);
                if (e == null) {
                    return zze.CONSENT_TYPE_UNSPECIFIED;
                }
                return e;
            }

            @Override // com.google.android.gms.internal.measurement.zzix
            public final Object q(int i, Object obj, Object obj2) {
                zzkw zzkwVar;
                switch (zzfb.a[i - 1]) {
                    case 1:
                        return new zzc();
                    case 2:
                        return new C0113zza(null);
                    case 3:
                        return zzix.r(zzc, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001", new Object[]{"zze", "zzf", zze.g(), "zzg", zze.g()});
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
        public enum zzd implements zzjc {
            CONSENT_STATUS_UNSPECIFIED(0),
            GRANTED(1),
            DENIED(2);
            
            public static final zzjb<zzd> Z0 = new zzfd();
            public final int X;

            zzd(int i) {
                this.X = i;
            }

            public static zzd e(int i) {
                if (i != 0) {
                    if (i != 1) {
                        if (i != 2) {
                            return null;
                        }
                        return DENIED;
                    }
                    return GRANTED;
                }
                return CONSENT_STATUS_UNSPECIFIED;
            }

            public static zzje g() {
                return zzfe.a;
            }

            @Override // com.google.android.gms.internal.measurement.zzjc
            public final int a() {
                return this.X;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "<" + zzd.class.getName() + C11304zt1.a + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.X + " name=" + name() + '>';
            }
        }

        /* loaded from: classes3.dex */
        public enum zze implements zzjc {
            CONSENT_TYPE_UNSPECIFIED(0),
            AD_STORAGE(1),
            ANALYTICS_STORAGE(2),
            AD_USER_DATA(3),
            AD_PERSONALIZATION(4);
            
            public static final zzjb<zze> b1 = new zzfg();
            public final int X;

            zze(int i) {
                this.X = i;
            }

            public static zze e(int i) {
                if (i != 0) {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                if (i != 4) {
                                    return null;
                                }
                                return AD_PERSONALIZATION;
                            }
                            return AD_USER_DATA;
                        }
                        return ANALYTICS_STORAGE;
                    }
                    return AD_STORAGE;
                }
                return CONSENT_TYPE_UNSPECIFIED;
            }

            public static zzje g() {
                return zzff.a;
            }

            @Override // com.google.android.gms.internal.measurement.zzjc
            public final int a() {
                return this.X;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "<" + zze.class.getName() + C11304zt1.a + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.X + " name=" + name() + '>';
            }
        }

        /* loaded from: classes3.dex */
        public static final class zzf extends zzix<zzf, C0114zza> implements zzkl {
            private static final zzf zzc;
            private static volatile zzkw<zzf> zzd;
            private int zze;
            private String zzf = "";
            private String zzg = "";

            /* renamed from: com.google.android.gms.internal.measurement.zzfc$zza$zzf$zza  reason: collision with other inner class name */
            /* loaded from: classes3.dex */
            public static final class C0114zza extends zzix.zzb<zzf, C0114zza> implements zzkl {
                private C0114zza() {
                    super(zzf.zzc);
                }

                public /* synthetic */ C0114zza(zzfb zzfbVar) {
                    this();
                }
            }

            static {
                zzf zzfVar = new zzf();
                zzc = zzfVar;
                zzix.t(zzf.class, zzfVar);
            }

            private zzf() {
            }

            public final String G() {
                return this.zzf;
            }

            @Override // com.google.android.gms.internal.measurement.zzix
            public final Object q(int i, Object obj, Object obj2) {
                zzkw zzkwVar;
                switch (zzfb.a[i - 1]) {
                    case 1:
                        return new zzf();
                    case 2:
                        return new C0114zza(null);
                    case 3:
                        return zzix.r(zzc, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zze", "zzf", "zzg"});
                    case 4:
                        return zzc;
                    case 5:
                        zzkw<zzf> zzkwVar2 = zzd;
                        if (zzkwVar2 == null) {
                            synchronized (zzf.class) {
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

        public final List<zzf> H() {
            return this.zzh;
        }

        public final List<zzb> I() {
            return this.zzf;
        }

        public final List<zzc> J() {
            return this.zzg;
        }

        public final boolean K() {
            return this.zzi;
        }

        public final boolean L() {
            if ((this.zze & 1) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.android.gms.internal.measurement.zzix
        public final Object q(int i, Object obj, Object obj2) {
            zzkw zzkwVar;
            switch (zzfb.a[i - 1]) {
                case 1:
                    return new zza();
                case 2:
                    return new C0111zza(null);
                case 3:
                    return zzix.r(zzc, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0004\u0000\u0001\u001b\u0002\u001b\u0003\u001b\u0004ဇ\u0000\u0005\u001b", new Object[]{"zze", "zzf", zzb.class, "zzg", zzc.class, "zzh", zzf.class, "zzi", "zzj", zzb.class});
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
        private zzjf<zzf> zzg = zzix.B();
        private boolean zzh;

        /* loaded from: classes3.dex */
        public static final class zza extends zzix.zzb<zzb, zza> implements zzkl {
            private zza() {
                super(zzb.zzc);
            }

            public /* synthetic */ zza(zzfb zzfbVar) {
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

        @Override // com.google.android.gms.internal.measurement.zzix
        public final Object q(int i, Object obj, Object obj2) {
            zzkw zzkwVar;
            switch (zzfb.a[i - 1]) {
                case 1:
                    return new zzb();
                case 2:
                    return new zza(null);
                case 3:
                    return zzix.r(zzc, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b\u0003ဇ\u0001", new Object[]{"zze", "zzf", "zzg", zzf.class, "zzh"});
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
        private String zzf = "";
        private boolean zzg;
        private boolean zzh;
        private int zzi;

        /* loaded from: classes3.dex */
        public static final class zza extends zzix.zzb<zzc, zza> implements zzkl {
            private zza() {
                super(zzc.zzc);
            }

            public final boolean A() {
                return ((zzc) this.Y).L();
            }

            public final boolean B() {
                return ((zzc) this.Y).M();
            }

            public final boolean C() {
                return ((zzc) this.Y).N();
            }

            public final int v() {
                return ((zzc) this.Y).m();
            }

            public final zza w(String str) {
                q();
                ((zzc) this.Y).G(str);
                return this;
            }

            public final String x() {
                return ((zzc) this.Y).I();
            }

            public final boolean y() {
                return ((zzc) this.Y).J();
            }

            public final boolean z() {
                return ((zzc) this.Y).K();
            }

            public /* synthetic */ zza(zzfb zzfbVar) {
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

        /* JADX INFO: Access modifiers changed from: private */
        public final void G(String str) {
            str.getClass();
            this.zze |= 1;
            this.zzf = str;
        }

        public final String I() {
            return this.zzf;
        }

        public final boolean J() {
            return this.zzg;
        }

        public final boolean K() {
            return this.zzh;
        }

        public final boolean L() {
            if ((this.zze & 2) != 0) {
                return true;
            }
            return false;
        }

        public final boolean M() {
            if ((this.zze & 4) != 0) {
                return true;
            }
            return false;
        }

        public final boolean N() {
            if ((this.zze & 8) != 0) {
                return true;
            }
            return false;
        }

        public final int m() {
            return this.zzi;
        }

        @Override // com.google.android.gms.internal.measurement.zzix
        public final Object q(int i, Object obj, Object obj2) {
            zzkw zzkwVar;
            switch (zzfb.a[i - 1]) {
                case 1:
                    return new zzc();
                case 2:
                    return new zza(null);
                case 3:
                    return zzix.r(zzc, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004င\u0003", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi"});
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
        private long zzf;
        private int zzh;
        private boolean zzm;
        private zza zzt;
        private zze zzu;
        private String zzg = "";
        private zzjf<zzg> zzi = zzix.B();
        private zzjf<zzc> zzj = zzix.B();
        private zzjf<zzew.zza> zzk = zzix.B();
        private String zzl = "";
        private zzjf<zzfp.zzc> zzn = zzix.B();
        private zzjf<zzb> zzo = zzix.B();
        private String zzp = "";
        private String zzq = "";
        private String zzr = "";
        private String zzs = "";

        /* loaded from: classes3.dex */
        public static final class zza extends zzix.zzb<zzd, zza> implements zzkl {
            private zza() {
                super(zzd.zzc);
            }

            public final List<zzew.zza> A() {
                return Collections.unmodifiableList(((zzd) this.Y).T());
            }

            public final List<zzb> B() {
                return Collections.unmodifiableList(((zzd) this.Y).U());
            }

            public final int v() {
                return ((zzd) this.Y).J();
            }

            public final zzc w(int i) {
                return ((zzd) this.Y).F(i);
            }

            public final zza x(int i, zzc.zza zzaVar) {
                q();
                ((zzd) this.Y).G(i, (zzc) ((zzix) zzaVar.e0()));
                return this;
            }

            public final zza y() {
                q();
                ((zzd) this.Y).c0();
                return this;
            }

            public final String z() {
                return ((zzd) this.Y).S();
            }

            public /* synthetic */ zza(zzfb zzfbVar) {
                this();
            }
        }

        static {
            zzd zzdVar = new zzd();
            zzc = zzdVar;
            zzix.t(zzd.class, zzdVar);
        }

        private zzd() {
        }

        public static zza M() {
            return zzc.w();
        }

        public static zzd O() {
            return zzc;
        }

        public final zzc F(int i) {
            return this.zzj.get(i);
        }

        public final void G(int i, zzc zzcVar) {
            zzcVar.getClass();
            zzjf<zzc> zzjfVar = this.zzj;
            if (!zzjfVar.c()) {
                this.zzj = zzix.o(zzjfVar);
            }
            this.zzj.set(i, zzcVar);
        }

        public final int J() {
            return this.zzj.size();
        }

        public final long K() {
            return this.zzf;
        }

        public final zza L() {
            zza zzaVar = this.zzt;
            if (zzaVar == null) {
                return zza.G();
            }
            return zzaVar;
        }

        public final String P() {
            return this.zzg;
        }

        public final String Q() {
            return this.zzr;
        }

        public final String R() {
            return this.zzq;
        }

        public final String S() {
            return this.zzp;
        }

        public final List<zzew.zza> T() {
            return this.zzk;
        }

        public final List<zzb> U() {
            return this.zzo;
        }

        public final List<zzfp.zzc> V() {
            return this.zzn;
        }

        public final List<zzg> W() {
            return this.zzi;
        }

        public final boolean X() {
            return this.zzm;
        }

        public final boolean Y() {
            if ((this.zze & 512) != 0) {
                return true;
            }
            return false;
        }

        public final boolean Z() {
            if ((this.zze & 2) != 0) {
                return true;
            }
            return false;
        }

        public final boolean b0() {
            if ((this.zze & 1) != 0) {
                return true;
            }
            return false;
        }

        public final void c0() {
            this.zzk = zzix.B();
        }

        public final int m() {
            return this.zzn.size();
        }

        @Override // com.google.android.gms.internal.measurement.zzix
        public final Object q(int i, Object obj, Object obj2) {
            zzkw zzkwVar;
            switch (zzfb.a[i - 1]) {
                case 1:
                    return new zzd();
                case 2:
                    return new zza(null);
                case 3:
                    return zzix.r(zzc, "\u0001\u0010\u0000\u0001\u0001\u0010\u0010\u0000\u0005\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003င\u0002\u0004\u001b\u0005\u001b\u0006\u001b\u0007ဈ\u0003\bဇ\u0004\t\u001b\n\u001b\u000bဈ\u0005\fဈ\u0006\rဈ\u0007\u000eဈ\b\u000fဉ\t\u0010ဉ\n", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", zzg.class, "zzj", zzc.class, "zzk", zzew.zza.class, "zzl", "zzm", "zzn", zzfp.zzc.class, "zzo", zzb.class, "zzp", "zzq", "zzr", "zzs", "zzt", "zzu"});
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

    /* loaded from: classes3.dex */
    public static final class zze extends zzix<zze, zza> implements zzkl {
        private static final zze zzc;
        private static volatile zzkw<zze> zzd;
        private int zze;
        private int zzf = 14;
        private int zzg = 11;
        private int zzh = 60;

        /* loaded from: classes3.dex */
        public static final class zza extends zzix.zzb<zze, zza> implements zzkl {
            private zza() {
                super(zze.zzc);
            }

            public /* synthetic */ zza(zzfb zzfbVar) {
                this();
            }
        }

        static {
            zze zzeVar = new zze();
            zzc = zzeVar;
            zzix.t(zze.class, zzeVar);
        }

        private zze() {
        }

        @Override // com.google.android.gms.internal.measurement.zzix
        public final Object q(int i, Object obj, Object obj2) {
            zzkw zzkwVar;
            switch (zzfb.a[i - 1]) {
                case 1:
                    return new zze();
                case 2:
                    return new zza(null);
                case 3:
                    return zzix.r(zzc, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002", new Object[]{"zze", "zzf", "zzg", "zzh"});
                case 4:
                    return zzc;
                case 5:
                    zzkw<zze> zzkwVar2 = zzd;
                    if (zzkwVar2 == null) {
                        synchronized (zze.class) {
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
    public static final class zzf extends zzix<zzf, zza> implements zzkl {
        private static final zzf zzc;
        private static volatile zzkw<zzf> zzd;
        private int zze;
        private String zzf = "";
        private String zzg = "";

        /* loaded from: classes3.dex */
        public static final class zza extends zzix.zzb<zzf, zza> implements zzkl {
            private zza() {
                super(zzf.zzc);
            }

            public /* synthetic */ zza(zzfb zzfbVar) {
                this();
            }
        }

        static {
            zzf zzfVar = new zzf();
            zzc = zzfVar;
            zzix.t(zzf.class, zzfVar);
        }

        private zzf() {
        }

        @Override // com.google.android.gms.internal.measurement.zzix
        public final Object q(int i, Object obj, Object obj2) {
            zzkw zzkwVar;
            switch (zzfb.a[i - 1]) {
                case 1:
                    return new zzf();
                case 2:
                    return new zza(null);
                case 3:
                    return zzix.r(zzc, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zze", "zzf", "zzg"});
                case 4:
                    return zzc;
                case 5:
                    zzkw<zzf> zzkwVar2 = zzd;
                    if (zzkwVar2 == null) {
                        synchronized (zzf.class) {
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
    public static final class zzg extends zzix<zzg, zza> implements zzkl {
        private static final zzg zzc;
        private static volatile zzkw<zzg> zzd;
        private int zze;
        private String zzf = "";
        private String zzg = "";

        /* loaded from: classes3.dex */
        public static final class zza extends zzix.zzb<zzg, zza> implements zzkl {
            private zza() {
                super(zzg.zzc);
            }

            public /* synthetic */ zza(zzfb zzfbVar) {
                this();
            }
        }

        static {
            zzg zzgVar = new zzg();
            zzc = zzgVar;
            zzix.t(zzg.class, zzgVar);
        }

        private zzg() {
        }

        public final String G() {
            return this.zzf;
        }

        public final String H() {
            return this.zzg;
        }

        @Override // com.google.android.gms.internal.measurement.zzix
        public final Object q(int i, Object obj, Object obj2) {
            zzkw zzkwVar;
            switch (zzfb.a[i - 1]) {
                case 1:
                    return new zzg();
                case 2:
                    return new zza(null);
                case 3:
                    return zzix.r(zzc, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zze", "zzf", "zzg"});
                case 4:
                    return zzc;
                case 5:
                    zzkw<zzg> zzkwVar2 = zzd;
                    if (zzkwVar2 == null) {
                        synchronized (zzg.class) {
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
