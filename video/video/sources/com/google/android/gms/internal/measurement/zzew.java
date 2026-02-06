package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzix;
import java.util.List;
import o.C11304zt1;

/* loaded from: classes3.dex */
public final class zzew {

    /* loaded from: classes3.dex */
    public static final class zza extends zzix<zza, C0110zza> implements zzkl {
        private static final zza zzc;
        private static volatile zzkw<zza> zzd;
        private int zze;
        private int zzf;
        private zzjf<zze> zzg = zzix.B();
        private zzjf<zzb> zzh = zzix.B();
        private boolean zzi;
        private boolean zzj;

        /* renamed from: com.google.android.gms.internal.measurement.zzew$zza$zza  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static final class C0110zza extends zzix.zzb<zza, C0110zza> implements zzkl {
            private C0110zza() {
                super(zza.zzc);
            }

            public final zze A(int i) {
                return ((zza) this.Y).L(i);
            }

            public final int v() {
                return ((zza) this.Y).K();
            }

            public final C0110zza w(int i, zzb.zza zzaVar) {
                q();
                ((zza) this.Y).G(i, (zzb) ((zzix) zzaVar.e0()));
                return this;
            }

            public final C0110zza x(int i, zze.zza zzaVar) {
                q();
                ((zza) this.Y).H(i, (zze) ((zzix) zzaVar.e0()));
                return this;
            }

            public final zzb y(int i) {
                return ((zza) this.Y).F(i);
            }

            public final int z() {
                return ((zza) this.Y).M();
            }

            public /* synthetic */ C0110zza(zzev zzevVar) {
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

        public final zzb F(int i) {
            return this.zzh.get(i);
        }

        public final void G(int i, zzb zzbVar) {
            zzbVar.getClass();
            zzjf<zzb> zzjfVar = this.zzh;
            if (!zzjfVar.c()) {
                this.zzh = zzix.o(zzjfVar);
            }
            this.zzh.set(i, zzbVar);
        }

        public final void H(int i, zze zzeVar) {
            zzeVar.getClass();
            zzjf<zze> zzjfVar = this.zzg;
            if (!zzjfVar.c()) {
                this.zzg = zzix.o(zzjfVar);
            }
            this.zzg.set(i, zzeVar);
        }

        public final int K() {
            return this.zzh.size();
        }

        public final zze L(int i) {
            return this.zzg.get(i);
        }

        public final int M() {
            return this.zzg.size();
        }

        public final List<zzb> O() {
            return this.zzh;
        }

        public final List<zze> P() {
            return this.zzg;
        }

        public final boolean Q() {
            if ((this.zze & 1) != 0) {
                return true;
            }
            return false;
        }

        public final int m() {
            return this.zzf;
        }

        @Override // com.google.android.gms.internal.measurement.zzix
        public final Object q(int i, Object obj, Object obj2) {
            zzkw zzkwVar;
            switch (zzev.a[i - 1]) {
                case 1:
                    return new zza();
                case 2:
                    return new C0110zza(null);
                case 3:
                    return zzix.r(zzc, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0000\u0001င\u0000\u0002\u001b\u0003\u001b\u0004ဇ\u0001\u0005ဇ\u0002", new Object[]{"zze", "zzf", "zzg", zze.class, "zzh", zzb.class, "zzi", "zzj"});
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
        private int zzf;
        private String zzg = "";
        private zzjf<zzc> zzh = zzix.B();
        private boolean zzi;
        private zzd zzj;
        private boolean zzk;
        private boolean zzl;
        private boolean zzm;

        /* loaded from: classes3.dex */
        public static final class zza extends zzix.zzb<zzb, zza> implements zzkl {
            private zza() {
                super(zzb.zzc);
            }

            public final int v() {
                return ((zzb) this.Y).m();
            }

            public final zza w(int i, zzc zzcVar) {
                q();
                ((zzb) this.Y).G(i, zzcVar);
                return this;
            }

            public final zza x(String str) {
                q();
                ((zzb) this.Y).J(str);
                return this;
            }

            public final zzc y(int i) {
                return ((zzb) this.Y).F(i);
            }

            public final String z() {
                return ((zzb) this.Y).O();
            }

            public /* synthetic */ zza(zzev zzevVar) {
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

        public static zza L() {
            return zzc.w();
        }

        public final zzc F(int i) {
            return this.zzh.get(i);
        }

        public final void G(int i, zzc zzcVar) {
            zzcVar.getClass();
            zzjf<zzc> zzjfVar = this.zzh;
            if (!zzjfVar.c()) {
                this.zzh = zzix.o(zzjfVar);
            }
            this.zzh.set(i, zzcVar);
        }

        public final void J(String str) {
            str.getClass();
            this.zze |= 2;
            this.zzg = str;
        }

        public final int K() {
            return this.zzf;
        }

        public final zzd N() {
            zzd zzdVar = this.zzj;
            if (zzdVar == null) {
                return zzd.H();
            }
            return zzdVar;
        }

        public final String O() {
            return this.zzg;
        }

        public final List<zzc> P() {
            return this.zzh;
        }

        public final boolean Q() {
            return this.zzk;
        }

        public final boolean R() {
            return this.zzl;
        }

        public final boolean S() {
            return this.zzm;
        }

        public final boolean T() {
            if ((this.zze & 8) != 0) {
                return true;
            }
            return false;
        }

        public final boolean U() {
            if ((this.zze & 1) != 0) {
                return true;
            }
            return false;
        }

        public final boolean V() {
            if ((this.zze & 64) != 0) {
                return true;
            }
            return false;
        }

        public final int m() {
            return this.zzh.size();
        }

        @Override // com.google.android.gms.internal.measurement.zzix
        public final Object q(int i, Object obj, Object obj2) {
            zzkw zzkwVar;
            switch (zzev.a[i - 1]) {
                case 1:
                    return new zzb();
                case 2:
                    return new zza(null);
                case 3:
                    return zzix.r(zzc, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001င\u0000\u0002ဈ\u0001\u0003\u001b\u0004ဇ\u0002\u0005ဉ\u0003\u0006ဇ\u0004\u0007ဇ\u0005\bဇ\u0006", new Object[]{"zze", "zzf", "zzg", "zzh", zzc.class, "zzi", "zzj", "zzk", "zzl", "zzm"});
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
        private zzf zzf;
        private zzd zzg;
        private boolean zzh;
        private String zzi = "";

        /* loaded from: classes3.dex */
        public static final class zza extends zzix.zzb<zzc, zza> implements zzkl {
            private zza() {
                super(zzc.zzc);
            }

            public final zza v(String str) {
                q();
                ((zzc) this.Y).H(str);
                return this;
            }

            public /* synthetic */ zza(zzev zzevVar) {
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
        public final void H(String str) {
            str.getClass();
            this.zze |= 8;
            this.zzi = str;
        }

        public static zzc I() {
            return zzc;
        }

        public final zzd J() {
            zzd zzdVar = this.zzg;
            if (zzdVar == null) {
                return zzd.H();
            }
            return zzdVar;
        }

        public final zzf K() {
            zzf zzfVar = this.zzf;
            if (zzfVar == null) {
                return zzf.H();
            }
            return zzfVar;
        }

        public final String L() {
            return this.zzi;
        }

        public final boolean M() {
            return this.zzh;
        }

        public final boolean N() {
            if ((this.zze & 4) != 0) {
                return true;
            }
            return false;
        }

        public final boolean O() {
            if ((this.zze & 2) != 0) {
                return true;
            }
            return false;
        }

        public final boolean P() {
            if ((this.zze & 8) != 0) {
                return true;
            }
            return false;
        }

        public final boolean Q() {
            if ((this.zze & 1) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.android.gms.internal.measurement.zzix
        public final Object q(int i, Object obj, Object obj2) {
            zzkw zzkwVar;
            switch (zzev.a[i - 1]) {
                case 1:
                    return new zzc();
                case 2:
                    return new zza(null);
                case 3:
                    return zzix.r(zzc, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဇ\u0002\u0004ဈ\u0003", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi"});
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
        private boolean zzg;
        private String zzh = "";
        private String zzi = "";
        private String zzj = "";

        /* loaded from: classes3.dex */
        public static final class zza extends zzix.zzb<zzd, zza> implements zzkl {
            private zza() {
                super(zzd.zzc);
            }

            public /* synthetic */ zza(zzev zzevVar) {
                this();
            }
        }

        /* loaded from: classes3.dex */
        public enum zzb implements zzjc {
            UNKNOWN_COMPARISON_TYPE(0),
            LESS_THAN(1),
            GREATER_THAN(2),
            EQUAL(3),
            BETWEEN(4);
            
            public static final zzjb<zzb> b1 = new zzex();
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
                                return BETWEEN;
                            }
                            return EQUAL;
                        }
                        return GREATER_THAN;
                    }
                    return LESS_THAN;
                }
                return UNKNOWN_COMPARISON_TYPE;
            }

            public static zzje g() {
                return zzey.a;
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

        public static zzd H() {
            return zzc;
        }

        public final zzb F() {
            zzb e = zzb.e(this.zzf);
            if (e == null) {
                return zzb.UNKNOWN_COMPARISON_TYPE;
            }
            return e;
        }

        public final String I() {
            return this.zzh;
        }

        public final String J() {
            return this.zzj;
        }

        public final String K() {
            return this.zzi;
        }

        public final boolean L() {
            return this.zzg;
        }

        public final boolean M() {
            if ((this.zze & 1) != 0) {
                return true;
            }
            return false;
        }

        public final boolean N() {
            if ((this.zze & 4) != 0) {
                return true;
            }
            return false;
        }

        public final boolean O() {
            if ((this.zze & 2) != 0) {
                return true;
            }
            return false;
        }

        public final boolean P() {
            if ((this.zze & 16) != 0) {
                return true;
            }
            return false;
        }

        public final boolean Q() {
            if ((this.zze & 8) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.android.gms.internal.measurement.zzix
        public final Object q(int i, Object obj, Object obj2) {
            zzkw zzkwVar;
            switch (zzev.a[i - 1]) {
                case 1:
                    return new zzd();
                case 2:
                    return new zza(null);
                case 3:
                    return zzix.r(zzc, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001᠌\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004", new Object[]{"zze", "zzf", zzb.g(), "zzg", "zzh", "zzi", "zzj"});
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
        private int zzf;
        private String zzg = "";
        private zzc zzh;
        private boolean zzi;
        private boolean zzj;
        private boolean zzk;

        /* loaded from: classes3.dex */
        public static final class zza extends zzix.zzb<zze, zza> implements zzkl {
            private zza() {
                super(zze.zzc);
            }

            public final zza v(String str) {
                q();
                ((zze) this.Y).G(str);
                return this;
            }

            public /* synthetic */ zza(zzev zzevVar) {
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

        /* JADX INFO: Access modifiers changed from: private */
        public final void G(String str) {
            str.getClass();
            this.zze |= 2;
            this.zzg = str;
        }

        public static zza I() {
            return zzc.w();
        }

        public final zzc H() {
            zzc zzcVar = this.zzh;
            if (zzcVar == null) {
                return zzc.I();
            }
            return zzcVar;
        }

        public final String K() {
            return this.zzg;
        }

        public final boolean L() {
            return this.zzi;
        }

        public final boolean M() {
            return this.zzj;
        }

        public final boolean N() {
            return this.zzk;
        }

        public final boolean O() {
            if ((this.zze & 1) != 0) {
                return true;
            }
            return false;
        }

        public final boolean P() {
            if ((this.zze & 32) != 0) {
                return true;
            }
            return false;
        }

        public final int m() {
            return this.zzf;
        }

        @Override // com.google.android.gms.internal.measurement.zzix
        public final Object q(int i, Object obj, Object obj2) {
            zzkw zzkwVar;
            switch (zzev.a[i - 1]) {
                case 1:
                    return new zze();
                case 2:
                    return new zza(null);
                case 3:
                    return zzix.r(zzc, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001\u0003ဉ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0005", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
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
    public static final class zzf extends zzix<zzf, zzb> implements zzkl {
        private static final zzf zzc;
        private static volatile zzkw<zzf> zzd;
        private int zze;
        private int zzf;
        private boolean zzh;
        private String zzg = "";
        private zzjf<String> zzi = zzix.B();

        /* loaded from: classes3.dex */
        public enum zza implements zzjc {
            UNKNOWN_MATCH_TYPE(0),
            REGEXP(1),
            BEGINS_WITH(2),
            ENDS_WITH(3),
            PARTIAL(4),
            EXACT(5),
            IN_LIST(6);
            
            public static final zzjb<zza> d1 = new zzfa();
            public final int X;

            zza(int i) {
                this.X = i;
            }

            public static zza e(int i) {
                switch (i) {
                    case 0:
                        return UNKNOWN_MATCH_TYPE;
                    case 1:
                        return REGEXP;
                    case 2:
                        return BEGINS_WITH;
                    case 3:
                        return ENDS_WITH;
                    case 4:
                        return PARTIAL;
                    case 5:
                        return EXACT;
                    case 6:
                        return IN_LIST;
                    default:
                        return null;
                }
            }

            public static zzje g() {
                return zzez.a;
            }

            @Override // com.google.android.gms.internal.measurement.zzjc
            public final int a() {
                return this.X;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "<" + zza.class.getName() + C11304zt1.a + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.X + " name=" + name() + '>';
            }
        }

        /* loaded from: classes3.dex */
        public static final class zzb extends zzix.zzb<zzf, zzb> implements zzkl {
            private zzb() {
                super(zzf.zzc);
            }

            public /* synthetic */ zzb(zzev zzevVar) {
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

        public static zzf H() {
            return zzc;
        }

        public final zza F() {
            zza e = zza.e(this.zzf);
            if (e == null) {
                return zza.UNKNOWN_MATCH_TYPE;
            }
            return e;
        }

        public final String I() {
            return this.zzg;
        }

        public final List<String> J() {
            return this.zzi;
        }

        public final boolean K() {
            return this.zzh;
        }

        public final boolean L() {
            if ((this.zze & 4) != 0) {
                return true;
            }
            return false;
        }

        public final boolean M() {
            if ((this.zze & 2) != 0) {
                return true;
            }
            return false;
        }

        public final boolean N() {
            if ((this.zze & 1) != 0) {
                return true;
            }
            return false;
        }

        public final int m() {
            return this.zzi.size();
        }

        @Override // com.google.android.gms.internal.measurement.zzix
        public final Object q(int i, Object obj, Object obj2) {
            zzkw zzkwVar;
            switch (zzev.a[i - 1]) {
                case 1:
                    return new zzf();
                case 2:
                    return new zzb(null);
                case 3:
                    return zzix.r(zzc, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001᠌\u0000\u0002ဈ\u0001\u0003ဇ\u0002\u0004\u001a", new Object[]{"zze", "zzf", zza.g(), "zzg", "zzh", "zzi"});
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
}
