package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzix;
import java.util.Collections;
import java.util.List;
import o.C11304zt1;

/* loaded from: classes3.dex */
public final class zzfi {

    /* loaded from: classes3.dex */
    public static final class zza extends zzix<zza, C0115zza> implements zzkl {
        private static final zza zzc;
        private static volatile zzkw<zza> zzd;
        private int zze;
        private String zzf = "";
        private String zzg = "";
        private String zzh = "";
        private String zzi = "";
        private String zzj = "";
        private String zzk = "";
        private String zzl = "";

        /* renamed from: com.google.android.gms.internal.measurement.zzfi$zza$zza  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static final class C0115zza extends zzix.zzb<zza, C0115zza> implements zzkl {
            private C0115zza() {
                super(zza.zzc);
            }

            public /* synthetic */ C0115zza(zzfh zzfhVar) {
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

        @Override // com.google.android.gms.internal.measurement.zzix
        public final Object q(int i, Object obj, Object obj2) {
            zzkw zzkwVar;
            switch (zzfh.a[i - 1]) {
                case 1:
                    return new zza();
                case 2:
                    return new C0115zza(null);
                case 3:
                    return zzix.r(zzc, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဈ\u0006", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl"});
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
        private boolean zzf;
        private boolean zzg;
        private boolean zzh;
        private boolean zzi;
        private boolean zzj;
        private boolean zzk;
        private boolean zzl;

        /* loaded from: classes3.dex */
        public static final class zza extends zzix.zzb<zzb, zza> implements zzkl {
            private zza() {
                super(zzb.zzc);
            }

            public final zza A(boolean z) {
                q();
                ((zzb) this.Y).V(z);
                return this;
            }

            public final zza B(boolean z) {
                q();
                ((zzb) this.Y).Y(z);
                return this;
            }

            public final zza v(boolean z) {
                q();
                ((zzb) this.Y).H(z);
                return this;
            }

            public final zza w(boolean z) {
                q();
                ((zzb) this.Y).K(z);
                return this;
            }

            public final zza x(boolean z) {
                q();
                ((zzb) this.Y).N(z);
                return this;
            }

            public final zza y(boolean z) {
                q();
                ((zzb) this.Y).P(z);
                return this;
            }

            public final zza z(boolean z) {
                q();
                ((zzb) this.Y).S(z);
                return this;
            }

            public /* synthetic */ zza(zzfh zzfhVar) {
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

        public static zza F() {
            return zzc.w();
        }

        public static zzb L() {
            return zzc;
        }

        public final void H(boolean z) {
            this.zze |= 32;
            this.zzk = z;
        }

        public final void K(boolean z) {
            this.zze |= 16;
            this.zzj = z;
        }

        public final void N(boolean z) {
            this.zze |= 1;
            this.zzf = z;
        }

        public final void P(boolean z) {
            this.zze |= 64;
            this.zzl = z;
        }

        public final boolean Q() {
            return this.zzk;
        }

        public final void S(boolean z) {
            this.zze |= 2;
            this.zzg = z;
        }

        public final boolean T() {
            return this.zzj;
        }

        public final void V(boolean z) {
            this.zze |= 4;
            this.zzh = z;
        }

        public final boolean W() {
            return this.zzf;
        }

        public final void Y(boolean z) {
            this.zze |= 8;
            this.zzi = z;
        }

        public final boolean Z() {
            return this.zzl;
        }

        public final boolean b0() {
            return this.zzg;
        }

        public final boolean c0() {
            return this.zzh;
        }

        public final boolean d0() {
            return this.zzi;
        }

        @Override // com.google.android.gms.internal.measurement.zzix
        public final Object q(int i, Object obj, Object obj2) {
            zzkw zzkwVar;
            switch (zzfh.a[i - 1]) {
                case 1:
                    return new zzb();
                case 2:
                    return new zza(null);
                case 3:
                    return zzix.r(zzc, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0005\u0007ဇ\u0006", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl"});
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
        private int zzf;
        private zzl zzg;
        private zzl zzh;
        private boolean zzi;

        /* loaded from: classes3.dex */
        public static final class zza extends zzix.zzb<zzc, zza> implements zzkl {
            private zza() {
                super(zzc.zzc);
            }

            public final zza v(int i) {
                q();
                ((zzc) this.Y).F(i);
                return this;
            }

            public final zza w(zzl.zza zzaVar) {
                q();
                ((zzc) this.Y).J((zzl) ((zzix) zzaVar.e0()));
                return this;
            }

            public final zza x(zzl zzlVar) {
                q();
                ((zzc) this.Y).N(zzlVar);
                return this;
            }

            public final zza y(boolean z) {
                q();
                ((zzc) this.Y).K(z);
                return this;
            }

            public /* synthetic */ zza(zzfh zzfhVar) {
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
        public final void J(zzl zzlVar) {
            zzlVar.getClass();
            this.zzg = zzlVar;
            this.zze |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void K(boolean z) {
            this.zze |= 8;
            this.zzi = z;
        }

        public static zza L() {
            return zzc.w();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void N(zzl zzlVar) {
            zzlVar.getClass();
            this.zzh = zzlVar;
            this.zze |= 4;
        }

        public final void F(int i) {
            this.zze |= 1;
            this.zzf = i;
        }

        public final zzl P() {
            zzl zzlVar = this.zzg;
            if (zzlVar == null) {
                return zzl.W();
            }
            return zzlVar;
        }

        public final zzl Q() {
            zzl zzlVar = this.zzh;
            if (zzlVar == null) {
                return zzl.W();
            }
            return zzlVar;
        }

        public final boolean R() {
            return this.zzi;
        }

        public final boolean S() {
            if ((this.zze & 1) != 0) {
                return true;
            }
            return false;
        }

        public final boolean T() {
            if ((this.zze & 8) != 0) {
                return true;
            }
            return false;
        }

        public final boolean U() {
            if ((this.zze & 4) != 0) {
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
            switch (zzfh.a[i - 1]) {
                case 1:
                    return new zzc();
                case 2:
                    return new zza(null);
                case 3:
                    return zzix.r(zzc, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဇ\u0003", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi"});
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
        private long zzg;

        /* loaded from: classes3.dex */
        public static final class zza extends zzix.zzb<zzd, zza> implements zzkl {
            private zza() {
                super(zzd.zzc);
            }

            public final zza v(int i) {
                q();
                ((zzd) this.Y).F(i);
                return this;
            }

            public final zza w(long j) {
                q();
                ((zzd) this.Y).G(j);
                return this;
            }

            public /* synthetic */ zza(zzfh zzfhVar) {
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

        /* JADX INFO: Access modifiers changed from: private */
        public final void F(int i) {
            this.zze |= 1;
            this.zzf = i;
        }

        public static zza K() {
            return zzc.w();
        }

        public final void G(long j) {
            this.zze |= 2;
            this.zzg = j;
        }

        public final long J() {
            return this.zzg;
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
            return this.zzf;
        }

        @Override // com.google.android.gms.internal.measurement.zzix
        public final Object q(int i, Object obj, Object obj2) {
            zzkw zzkwVar;
            switch (zzfh.a[i - 1]) {
                case 1:
                    return new zzd();
                case 2:
                    return new zza(null);
                case 3:
                    return zzix.r(zzc, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဂ\u0001", new Object[]{"zze", "zzf", "zzg"});
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
        private zzjf<zzg> zzf = zzix.B();
        private String zzg = "";
        private long zzh;
        private long zzi;
        private int zzj;

        /* loaded from: classes3.dex */
        public static final class zza extends zzix.zzb<zze, zza> implements zzkl {
            private zza() {
                super(zze.zzc);
            }

            public final zza A(zzg.zza zzaVar) {
                q();
                ((zze) this.Y).P((zzg) ((zzix) zzaVar.e0()));
                return this;
            }

            public final zza B(zzg zzgVar) {
                q();
                ((zze) this.Y).P(zzgVar);
                return this;
            }

            public final zza C(Iterable<? extends zzg> iterable) {
                q();
                ((zze) this.Y).Q(iterable);
                return this;
            }

            public final zza D(String str) {
                q();
                ((zze) this.Y).R(str);
                return this;
            }

            public final long E() {
                return ((zze) this.Y).W();
            }

            public final zza F(long j) {
                q();
                ((zze) this.Y).U(j);
                return this;
            }

            public final zzg G(int i) {
                return ((zze) this.Y).F(i);
            }

            public final long H() {
                return ((zze) this.Y).X();
            }

            public final zza I() {
                q();
                ((zze) this.Y).h0();
                return this;
            }

            public final String J() {
                return ((zze) this.Y).b0();
            }

            public final List<zzg> K() {
                return Collections.unmodifiableList(((zze) this.Y).c0());
            }

            public final boolean L() {
                return ((zze) this.Y).g0();
            }

            public final int v() {
                return ((zze) this.Y).S();
            }

            public final zza w(int i) {
                q();
                ((zze) this.Y).T(i);
                return this;
            }

            public final zza x(int i, zzg.zza zzaVar) {
                q();
                ((zze) this.Y).G(i, (zzg) ((zzix) zzaVar.e0()));
                return this;
            }

            public final zza y(int i, zzg zzgVar) {
                q();
                ((zze) this.Y).G(i, zzgVar);
                return this;
            }

            public final zza z(long j) {
                q();
                ((zze) this.Y).H(j);
                return this;
            }

            public /* synthetic */ zza(zzfh zzfhVar) {
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
        public final void H(long j) {
            this.zze |= 4;
            this.zzi = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void P(zzg zzgVar) {
            zzgVar.getClass();
            i0();
            this.zzf.add(zzgVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void R(String str) {
            str.getClass();
            this.zze |= 1;
            this.zzg = str;
        }

        public static zza Y() {
            return zzc.w();
        }

        public final zzg F(int i) {
            return this.zzf.get(i);
        }

        public final void G(int i, zzg zzgVar) {
            zzgVar.getClass();
            i0();
            this.zzf.set(i, zzgVar);
        }

        public final void Q(Iterable<? extends zzg> iterable) {
            i0();
            zzhd.i(iterable, this.zzf);
        }

        public final int S() {
            return this.zzf.size();
        }

        public final void T(int i) {
            i0();
            this.zzf.remove(i);
        }

        public final void U(long j) {
            this.zze |= 2;
            this.zzh = j;
        }

        public final long W() {
            return this.zzi;
        }

        public final long X() {
            return this.zzh;
        }

        public final String b0() {
            return this.zzg;
        }

        public final List<zzg> c0() {
            return this.zzf;
        }

        public final boolean d0() {
            if ((this.zze & 8) != 0) {
                return true;
            }
            return false;
        }

        public final boolean f0() {
            if ((this.zze & 4) != 0) {
                return true;
            }
            return false;
        }

        public final boolean g0() {
            if ((this.zze & 2) != 0) {
                return true;
            }
            return false;
        }

        public final void h0() {
            this.zzf = zzix.B();
        }

        public final void i0() {
            zzjf<zzg> zzjfVar = this.zzf;
            if (!zzjfVar.c()) {
                this.zzf = zzix.o(zzjfVar);
            }
        }

        public final int m() {
            return this.zzj;
        }

        @Override // com.google.android.gms.internal.measurement.zzix
        public final Object q(int i, Object obj, Object obj2) {
            zzkw zzkwVar;
            switch (zzfh.a[i - 1]) {
                case 1:
                    return new zze();
                case 2:
                    return new zza(null);
                case 3:
                    return zzix.r(zzc, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001\u001b\u0002ဈ\u0000\u0003ဂ\u0001\u0004ဂ\u0002\u0005င\u0003", new Object[]{"zze", "zzf", zzg.class, "zzg", "zzh", "zzi", "zzj"});
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
        private long zzg;

        /* loaded from: classes3.dex */
        public static final class zza extends zzix.zzb<zzf, zza> implements zzkl {
            private zza() {
                super(zzf.zzc);
            }

            public final zza v(long j) {
                q();
                ((zzf) this.Y).G(j);
                return this;
            }

            public final zza w(String str) {
                q();
                ((zzf) this.Y).J(str);
                return this;
            }

            public /* synthetic */ zza(zzfh zzfhVar) {
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

        public static zza F() {
            return zzc.w();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void G(long j) {
            this.zze |= 2;
            this.zzg = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void J(String str) {
            str.getClass();
            this.zze |= 1;
            this.zzf = str;
        }

        @Override // com.google.android.gms.internal.measurement.zzix
        public final Object q(int i, Object obj, Object obj2) {
            zzkw zzkwVar;
            switch (zzfh.a[i - 1]) {
                case 1:
                    return new zzf();
                case 2:
                    return new zza(null);
                case 3:
                    return zzix.r(zzc, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001", new Object[]{"zze", "zzf", "zzg"});
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
        private long zzh;
        private float zzi;
        private double zzj;
        private String zzf = "";
        private String zzg = "";
        private zzjf<zzg> zzk = zzix.B();

        /* loaded from: classes3.dex */
        public static final class zza extends zzix.zzb<zzg, zza> implements zzkl {
            private zza() {
                super(zzg.zzc);
            }

            public final zza A(String str) {
                q();
                ((zzg) this.Y).P(str);
                return this;
            }

            public final zza B() {
                q();
                ((zzg) this.Y).l0();
                return this;
            }

            public final zza C(String str) {
                q();
                ((zzg) this.Y).T(str);
                return this;
            }

            public final zza D() {
                q();
                ((zzg) this.Y).m0();
                return this;
            }

            public final zza E() {
                q();
                ((zzg) this.Y).n0();
                return this;
            }

            public final zza F() {
                q();
                ((zzg) this.Y).o0();
                return this;
            }

            public final int v() {
                return ((zzg) this.Y).U();
            }

            public final zza w(double d) {
                q();
                ((zzg) this.Y).G(d);
                return this;
            }

            public final zza x(long j) {
                q();
                ((zzg) this.Y).H(j);
                return this;
            }

            public final zza y(zza zzaVar) {
                q();
                ((zzg) this.Y).Z((zzg) ((zzix) zzaVar.e0()));
                return this;
            }

            public final zza z(Iterable<? extends zzg> iterable) {
                q();
                ((zzg) this.Y).O(iterable);
                return this;
            }

            public /* synthetic */ zza(zzfh zzfhVar) {
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

        /* JADX INFO: Access modifiers changed from: private */
        public final void H(long j) {
            this.zze |= 4;
            this.zzh = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void O(Iterable<? extends zzg> iterable) {
            p0();
            zzhd.i(iterable, this.zzk);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void P(String str) {
            str.getClass();
            this.zze |= 1;
            this.zzf = str;
        }

        public static zza Y() {
            return zzc.w();
        }

        public final double F() {
            return this.zzj;
        }

        public final void G(double d) {
            this.zze |= 16;
            this.zzj = d;
        }

        public final float Q() {
            return this.zzi;
        }

        public final void T(String str) {
            str.getClass();
            this.zze |= 2;
            this.zzg = str;
        }

        public final int U() {
            return this.zzk.size();
        }

        public final long W() {
            return this.zzh;
        }

        public final void Z(zzg zzgVar) {
            zzgVar.getClass();
            p0();
            this.zzk.add(zzgVar);
        }

        public final String c0() {
            return this.zzf;
        }

        public final String d0() {
            return this.zzg;
        }

        public final List<zzg> f0() {
            return this.zzk;
        }

        public final boolean g0() {
            if ((this.zze & 16) != 0) {
                return true;
            }
            return false;
        }

        public final boolean h0() {
            if ((this.zze & 8) != 0) {
                return true;
            }
            return false;
        }

        public final boolean i0() {
            if ((this.zze & 4) != 0) {
                return true;
            }
            return false;
        }

        public final boolean j0() {
            if ((this.zze & 1) != 0) {
                return true;
            }
            return false;
        }

        public final boolean k0() {
            if ((this.zze & 2) != 0) {
                return true;
            }
            return false;
        }

        public final void l0() {
            this.zze &= -17;
            this.zzj = 0.0d;
        }

        public final void m0() {
            this.zze &= -5;
            this.zzh = 0L;
        }

        public final void n0() {
            this.zzk = zzix.B();
        }

        public final void o0() {
            this.zze &= -3;
            this.zzg = zzc.zzg;
        }

        public final void p0() {
            zzjf<zzg> zzjfVar = this.zzk;
            if (!zzjfVar.c()) {
                this.zzk = zzix.o(zzjfVar);
            }
        }

        @Override // com.google.android.gms.internal.measurement.zzix
        public final Object q(int i, Object obj, Object obj2) {
            zzkw zzkwVar;
            switch (zzfh.a[i - 1]) {
                case 1:
                    return new zzg();
                case 2:
                    return new zza(null);
                case 3:
                    return zzix.r(zzc, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004ခ\u0003\u0005က\u0004\u0006\u001b", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", zzg.class});
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

    /* loaded from: classes3.dex */
    public static final class zzh extends zzix<zzh, zza> implements zzkl {
        private static final zzh zzc;
        private static volatile zzkw<zzh> zzd;
        private int zze;
        private String zzf = "";
        private String zzg = "";
        private zza zzh;

        /* loaded from: classes3.dex */
        public static final class zza extends zzix.zzb<zzh, zza> implements zzkl {
            private zza() {
                super(zzh.zzc);
            }

            public /* synthetic */ zza(zzfh zzfhVar) {
                this();
            }
        }

        static {
            zzh zzhVar = new zzh();
            zzc = zzhVar;
            zzix.t(zzh.class, zzhVar);
        }

        private zzh() {
        }

        @Override // com.google.android.gms.internal.measurement.zzix
        public final Object q(int i, Object obj, Object obj2) {
            zzkw zzkwVar;
            switch (zzfh.a[i - 1]) {
                case 1:
                    return new zzh();
                case 2:
                    return new zza(null);
                case 3:
                    return zzix.r(zzc, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဉ\u0002", new Object[]{"zze", "zzf", "zzg", "zzh"});
                case 4:
                    return zzc;
                case 5:
                    zzkw<zzh> zzkwVar2 = zzd;
                    if (zzkwVar2 == null) {
                        synchronized (zzh.class) {
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
    public static final class zzi extends zzix<zzi, zza> implements zzkl {
        private static final zzi zzc;
        private static volatile zzkw<zzi> zzd;
        private int zze;
        private zzjf<zzj> zzf = zzix.B();
        private String zzg = "";

        /* loaded from: classes3.dex */
        public static final class zza extends zzix.zzb<zzi, zza> implements zzkl {
            private zza() {
                super(zzi.zzc);
            }

            public final int v() {
                return ((zzi) this.Y).m();
            }

            public final zza w(zzj.zza zzaVar) {
                q();
                ((zzi) this.Y).H((zzj) ((zzix) zzaVar.e0()));
                return this;
            }

            public final zzj x(int i) {
                return ((zzi) this.Y).F(0);
            }

            public /* synthetic */ zza(zzfh zzfhVar) {
                this();
            }
        }

        static {
            zzi zziVar = new zzi();
            zzc = zziVar;
            zzix.t(zzi.class, zziVar);
        }

        private zzi() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void H(zzj zzjVar) {
            zzjVar.getClass();
            zzjf<zzj> zzjfVar = this.zzf;
            if (!zzjfVar.c()) {
                this.zzf = zzix.o(zzjfVar);
            }
            this.zzf.add(zzjVar);
        }

        public static zza I() {
            return zzc.w();
        }

        public final zzj F(int i) {
            return this.zzf.get(0);
        }

        public final List<zzj> K() {
            return this.zzf;
        }

        public final int m() {
            return this.zzf.size();
        }

        @Override // com.google.android.gms.internal.measurement.zzix
        public final Object q(int i, Object obj, Object obj2) {
            zzkw zzkwVar;
            switch (zzfh.a[i - 1]) {
                case 1:
                    return new zzi();
                case 2:
                    return new zza(null);
                case 3:
                    return zzix.r(zzc, "\u0001\u0002\u0000\u0001\u0001\u0007\u0002\u0000\u0001\u0000\u0001\u001b\u0007ဈ\u0000", new Object[]{"zze", "zzf", zzj.class, "zzg"});
                case 4:
                    return zzc;
                case 5:
                    zzkw<zzi> zzkwVar2 = zzd;
                    if (zzkwVar2 == null) {
                        synchronized (zzi.class) {
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
    public static final class zzj extends zzix<zzj, zza> implements zzkl {
        private static final zzj zzc;
        private static volatile zzkw<zzj> zzd;
        private long zzab;
        private int zzac;
        private boolean zzaf;
        private int zzai;
        private int zzaj;
        private int zzak;
        private long zzam;
        private long zzan;
        private int zzaq;
        private zzk zzas;
        private long zzau;
        private long zzav;
        private int zzay;
        private boolean zzaz;
        private boolean zzbb;
        private zzh zzbc;
        private long zzbg;
        private boolean zzbh;
        private boolean zzbj;
        private int zzbl;
        private zzb zzbn;
        private int zze;
        private int zzf;
        private int zzg;
        private long zzj;
        private long zzk;
        private long zzl;
        private long zzm;
        private long zzn;
        private int zzs;
        private long zzw;
        private long zzx;
        private boolean zzz;
        private zzjf<zze> zzh = zzix.B();
        private zzjf<zzn> zzi = zzix.B();
        private String zzo = "";
        private String zzp = "";
        private String zzq = "";
        private String zzr = "";
        private String zzt = "";
        private String zzu = "";
        private String zzv = "";
        private String zzy = "";
        private String zzaa = "";
        private String zzad = "";
        private String zzae = "";
        private zzjf<zzc> zzag = zzix.B();
        private String zzah = "";
        private String zzal = "";
        private String zzao = "";
        private String zzap = "";
        private String zzar = "";
        private zzjd zzat = zzix.z();
        private String zzaw = "";
        private String zzax = "";
        private String zzba = "";
        private String zzbd = "";
        private zzjf<String> zzbe = zzix.B();
        private String zzbf = "";
        private String zzbi = "";
        private String zzbk = "";
        private String zzbm = "";

        /* loaded from: classes3.dex */
        public static final class zza extends zzix.zzb<zzj, zza> implements zzkl {
            private zza() {
                super(zzj.zzc);
            }

            public final zza A(long j) {
                q();
                ((zzj) this.Y).I(j);
                return this;
            }

            public final zza A0(String str) {
                q();
                ((zzj) this.Y).T2(null);
                return this;
            }

            public final zza B(zzb zzbVar) {
                q();
                ((zzj) this.Y).J(zzbVar);
                return this;
            }

            public final zza C(zze.zza zzaVar) {
                q();
                ((zzj) this.Y).K((zze) ((zzix) zzaVar.e0()));
                return this;
            }

            public final zzn C0(int i) {
                return ((zzj) this.Y).H0(i);
            }

            public final zza D(zzk.zzb zzbVar) {
                q();
                ((zzj) this.Y).X((zzk) ((zzix) zzbVar.e0()));
                return this;
            }

            public final zza E(zzn.zza zzaVar) {
                q();
                ((zzj) this.Y).Y((zzn) ((zzix) zzaVar.e0()));
                return this;
            }

            public final zza F(zzn zznVar) {
                q();
                ((zzj) this.Y).Y(zznVar);
                return this;
            }

            public final zza F0() {
                q();
                ((zzj) this.Y).C1();
                return this;
            }

            public final zza G(Iterable<? extends zzc> iterable) {
                q();
                ((zzj) this.Y).Z(iterable);
                return this;
            }

            public final zza H(String str) {
                q();
                ((zzj) this.Y).b0(str);
                return this;
            }

            public final zza I(boolean z) {
                q();
                ((zzj) this.Y).c0(z);
                return this;
            }

            public final zza I0(long j) {
                q();
                ((zzj) this.Y).W2(j);
                return this;
            }

            public final int J() {
                return ((zzj) this.Y).y2();
            }

            public final zza J0(String str) {
                q();
                ((zzj) this.Y).a3(str);
                return this;
            }

            public final zza K(int i) {
                q();
                ((zzj) this.Y).N1(i);
                return this;
            }

            public final zza K0() {
                q();
                ((zzj) this.Y).D1();
                return this;
            }

            public final zza L(long j) {
                q();
                ((zzj) this.Y).I0(j);
                return this;
            }

            public final zza L0(long j) {
                q();
                ((zzj) this.Y).c3(j);
                return this;
            }

            public final zza M(Iterable<? extends zze> iterable) {
                q();
                ((zzj) this.Y).P0(iterable);
                return this;
            }

            public final zza M0(String str) {
                q();
                ((zzj) this.Y).g3(str);
                return this;
            }

            public final zza N(String str) {
                q();
                ((zzj) this.Y).Q0(str);
                return this;
            }

            public final zza N0() {
                q();
                ((zzj) this.Y).E1();
                return this;
            }

            public final zza O(boolean z) {
                q();
                ((zzj) this.Y).R0(z);
                return this;
            }

            public final zza O0(String str) {
                q();
                ((zzj) this.Y).k3(str);
                return this;
            }

            public final long P() {
                return ((zzj) this.Y).b3();
            }

            public final zza P0() {
                q();
                ((zzj) this.Y).F1();
                return this;
            }

            public final zza Q(int i) {
                q();
                ((zzj) this.Y).Z1(i);
                return this;
            }

            public final zza Q0(String str) {
                q();
                ((zzj) this.Y).n3(str);
                return this;
            }

            public final zza R(long j) {
                q();
                ((zzj) this.Y).m1(j);
                return this;
            }

            public final zza R0() {
                q();
                ((zzj) this.Y).G1();
                return this;
            }

            public final zza S(Iterable<? extends Integer> iterable) {
                q();
                ((zzj) this.Y).t1(iterable);
                return this;
            }

            public final zza S0(String str) {
                q();
                ((zzj) this.Y).q3(str);
                return this;
            }

            public final zza T(String str) {
                q();
                ((zzj) this.Y).u1(str);
                return this;
            }

            public final zza T0() {
                q();
                ((zzj) this.Y).H1();
                return this;
            }

            public final zza U(boolean z) {
                q();
                ((zzj) this.Y).v1(z);
                return this;
            }

            public final long V() {
                return ((zzj) this.Y).r3();
            }

            public final zza V0(String str) {
                q();
                ((zzj) this.Y).t3(str);
                return this;
            }

            public final zza W(int i) {
                q();
                ((zzj) this.Y).j2(i);
                return this;
            }

            public final zza W0() {
                q();
                ((zzj) this.Y).J1();
                return this;
            }

            public final zza X(long j) {
                q();
                ((zzj) this.Y).O1(j);
                return this;
            }

            public final zza X0(String str) {
                q();
                ((zzj) this.Y).w3(str);
                return this;
            }

            public final zza Y(Iterable<String> iterable) {
                q();
                ((zzj) this.Y).V1(iterable);
                return this;
            }

            public final zza Y0(String str) {
                q();
                ((zzj) this.Y).z3(str);
                return this;
            }

            public final zza Z(String str) {
                q();
                ((zzj) this.Y).W1(str);
                return this;
            }

            public final String a1() {
                return ((zzj) this.Y).H3();
            }

            public final zza b0(boolean z) {
                q();
                ((zzj) this.Y).X1(z);
                return this;
            }

            public final zza b1(String str) {
                q();
                ((zzj) this.Y).C3(str);
                return this;
            }

            public final zza c0() {
                q();
                ((zzj) this.Y).w1();
                return this;
            }

            public final String c1() {
                return ((zzj) this.Y).f0();
            }

            public final zza d0(int i) {
                q();
                ((zzj) this.Y).r2(i);
                return this;
            }

            public final String d1() {
                return ((zzj) this.Y).l0();
            }

            public final String e1() {
                return ((zzj) this.Y).n0();
            }

            public final zza f0(long j) {
                q();
                ((zzj) this.Y).a2(j);
                return this;
            }

            public final String f1() {
                return ((zzj) this.Y).p0();
            }

            public final zza g0(Iterable<? extends zzn> iterable) {
                q();
                ((zzj) this.Y).g2(iterable);
                return this;
            }

            public final List<zze> g1() {
                return Collections.unmodifiableList(((zzj) this.Y).t0());
            }

            public final zza h0(String str) {
                q();
                ((zzj) this.Y).h2(str);
                return this;
            }

            public final List<zzn> h1() {
                return Collections.unmodifiableList(((zzj) this.Y).u0());
            }

            public final zza i0() {
                q();
                ((zzj) this.Y).x1();
                return this;
            }

            public final zza j0(int i) {
                q();
                ((zzj) this.Y).z2(i);
                return this;
            }

            public final zza k0(long j) {
                q();
                ((zzj) this.Y).k2(j);
                return this;
            }

            public final zza l0(String str) {
                q();
                ((zzj) this.Y).p2(str);
                return this;
            }

            public final zza m0() {
                q();
                ((zzj) this.Y).y1();
                return this;
            }

            public final zza n0(int i) {
                q();
                ((zzj) this.Y).H2(1);
                return this;
            }

            public final zza o0(long j) {
                q();
                ((zzj) this.Y).s2(j);
                return this;
            }

            public final zza p0(String str) {
                q();
                ((zzj) this.Y).x2(str);
                return this;
            }

            public final zza q0() {
                q();
                ((zzj) this.Y).z1();
                return this;
            }

            public final zza r0(int i) {
                q();
                ((zzj) this.Y).O2(i);
                return this;
            }

            public final zza s0(long j) {
                q();
                ((zzj) this.Y).A2(j);
                return this;
            }

            public final zza t0(String str) {
                q();
                ((zzj) this.Y).F2(str);
                return this;
            }

            public final zza u0() {
                q();
                ((zzj) this.Y).A1();
                return this;
            }

            public final int v() {
                return ((zzj) this.Y).M1();
            }

            public final zza v0(int i) {
                q();
                ((zzj) this.Y).V2(i);
                return this;
            }

            public final zze w(int i) {
                return ((zzj) this.Y).F(i);
            }

            public final zza w0(long j) {
                q();
                ((zzj) this.Y).I2(j);
                return this;
            }

            public final zza x(int i, zze.zza zzaVar) {
                q();
                ((zzj) this.Y).G(i, (zze) ((zzix) zzaVar.e0()));
                return this;
            }

            public final zza x0(String str) {
                q();
                ((zzj) this.Y).M2(str);
                return this;
            }

            public final zza y(int i, zze zzeVar) {
                q();
                ((zzj) this.Y).G(i, zzeVar);
                return this;
            }

            public final zza y0() {
                q();
                ((zzj) this.Y).B1();
                return this;
            }

            public final zza z(int i, zzn zznVar) {
                q();
                ((zzj) this.Y).H(i, zznVar);
                return this;
            }

            public final zza z0(long j) {
                q();
                ((zzj) this.Y).P2(j);
                return this;
            }

            public /* synthetic */ zza(zzfh zzfhVar) {
                this();
            }
        }

        static {
            zzj zzjVar = new zzj();
            zzc = zzjVar;
            zzix.t(zzj.class, zzjVar);
        }

        private zzj() {
        }

        public static zza E3() {
            return zzc.w();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void I(long j) {
            this.zzf |= 32;
            this.zzav = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void I0(long j) {
            this.zze |= 536870912;
            this.zzam = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void K(zze zzeVar) {
            zzeVar.getClass();
            K1();
            this.zzh.add(zzeVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void Q0(String str) {
            str.getClass();
            this.zze |= 4096;
            this.zzu = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void R0(boolean z) {
            this.zzf |= 262144;
            this.zzbj = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void X1(boolean z) {
            this.zze |= 8388608;
            this.zzaf = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void Y(zzn zznVar) {
            zznVar.getClass();
            L1();
            this.zzi.add(zznVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void Z(Iterable<? extends zzc> iterable) {
            zzjf<zzc> zzjfVar = this.zzag;
            if (!zzjfVar.c()) {
                this.zzag = zzix.o(zzjfVar);
            }
            zzhd.i(iterable, this.zzag);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void b0(String str) {
            str.getClass();
            this.zzf |= 4;
            this.zzar = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void c0(boolean z) {
            this.zzf |= 65536;
            this.zzbh = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void v1(boolean z) {
            this.zze |= 131072;
            this.zzz = z;
        }

        public final boolean A0() {
            if ((this.zzf & 4194304) != 0) {
                return true;
            }
            return false;
        }

        public final void A1() {
            this.zzh = zzix.B();
        }

        public final void A2(long j) {
            this.zze |= 16;
            this.zzm = j;
        }

        public final long A3() {
            return this.zzx;
        }

        public final void B1() {
            this.zze &= -2097153;
            this.zzad = zzc.zzad;
        }

        public final boolean C0() {
            if ((this.zze & 1048576) != 0) {
                return true;
            }
            return false;
        }

        public final void C1() {
            this.zze &= -131073;
            this.zzz = false;
        }

        public final void C3(String str) {
            str.getClass();
            this.zze |= 512;
            this.zzr = str;
        }

        public final void D1() {
            this.zze &= -129;
            this.zzp = zzc.zzp;
        }

        public final zzb D3() {
            zzb zzbVar = this.zzbn;
            if (zzbVar == null) {
                return zzb.L();
            }
            return zzbVar;
        }

        public final boolean E0() {
            if ((this.zze & 536870912) != 0) {
                return true;
            }
            return false;
        }

        public final void E1() {
            this.zze &= -33;
            this.zzn = 0L;
        }

        public final zze F(int i) {
            return this.zzh.get(i);
        }

        public final boolean F0() {
            if ((this.zzf & 131072) != 0) {
                return true;
            }
            return false;
        }

        public final void F1() {
            this.zze &= -17;
            this.zzm = 0L;
        }

        public final void F2(String str) {
            str.getClass();
            this.zzf |= 524288;
            this.zzbk = str;
        }

        public final void G(int i, zze zzeVar) {
            zzeVar.getClass();
            K1();
            this.zzh.set(i, zzeVar);
        }

        public final int G0() {
            return this.zzai;
        }

        public final void G1() {
            this.zze &= -65537;
            this.zzy = zzc.zzy;
        }

        public final long G2() {
            return this.zzam;
        }

        public final String G3() {
            return this.zzar;
        }

        public final void H(int i, zzn zznVar) {
            zznVar.getClass();
            L1();
            this.zzi.set(i, zznVar);
        }

        public final zzn H0(int i) {
            return this.zzi.get(i);
        }

        public final void H1() {
            this.zzf &= -8193;
            this.zzbd = zzc.zzbd;
        }

        public final void H2(int i) {
            this.zze |= 1;
            this.zzg = 1;
        }

        public final String H3() {
            return this.zzu;
        }

        public final void I2(long j) {
            this.zze |= 4;
            this.zzk = j;
        }

        public final String I3() {
            return this.zzaa;
        }

        public final void J(zzb zzbVar) {
            zzbVar.getClass();
            this.zzbn = zzbVar;
            this.zzf |= 4194304;
        }

        public final void J1() {
            this.zze &= -268435457;
            this.zzal = zzc.zzal;
        }

        public final String J3() {
            return this.zzt;
        }

        public final void K1() {
            zzjf<zze> zzjfVar = this.zzh;
            if (!zzjfVar.c()) {
                this.zzh = zzix.o(zzjfVar);
            }
        }

        public final void L1() {
            zzjf<zzn> zzjfVar = this.zzi;
            if (!zzjfVar.c()) {
                this.zzi = zzix.o(zzjfVar);
            }
        }

        public final int M1() {
            return this.zzh.size();
        }

        public final void M2(String str) {
            str.getClass();
            this.zze |= 256;
            this.zzq = str;
        }

        public final void N1(int i) {
            K1();
            this.zzh.remove(i);
        }

        public final long N2() {
            return this.zzab;
        }

        public final void O1(long j) {
            this.zzf |= 16;
            this.zzau = j;
        }

        public final void O2(int i) {
            this.zzf |= 2;
            this.zzaq = i;
        }

        public final void P0(Iterable<? extends zze> iterable) {
            K1();
            zzhd.i(iterable, this.zzh);
        }

        public final void P2(long j) {
            this.zzf |= 32768;
            this.zzbg = j;
        }

        public final boolean S0() {
            if ((this.zzf & 128) != 0) {
                return true;
            }
            return false;
        }

        public final boolean T0() {
            if ((this.zzf & 524288) != 0) {
                return true;
            }
            return false;
        }

        public final void T2(String str) {
            str.getClass();
            this.zze |= Integer.MIN_VALUE;
            this.zzao = str;
        }

        public final boolean U0() {
            if ((this.zze & 524288) != 0) {
                return true;
            }
            return false;
        }

        public final long U2() {
            return this.zzau;
        }

        public final boolean V0() {
            if ((this.zzf & 16) != 0) {
                return true;
            }
            return false;
        }

        public final void V1(Iterable<String> iterable) {
            zzjf<String> zzjfVar = this.zzbe;
            if (!zzjfVar.c()) {
                this.zzbe = zzix.o(zzjfVar);
            }
            zzhd.i(iterable, this.zzbe);
        }

        public final void V2(int i) {
            this.zze |= 1024;
            this.zzs = i;
        }

        public final boolean W0() {
            if ((this.zze & 8) != 0) {
                return true;
            }
            return false;
        }

        public final void W1(String str) {
            str.getClass();
            this.zze |= 2048;
            this.zzt = str;
        }

        public final void W2(long j) {
            this.zze |= 2;
            this.zzj = j;
        }

        public final void X(zzk zzkVar) {
            zzkVar.getClass();
            this.zzas = zzkVar;
            this.zzf |= 8;
        }

        public final boolean X0() {
            if ((this.zze & 16384) != 0) {
                return true;
            }
            return false;
        }

        public final boolean Y0() {
            if ((this.zzf & 262144) != 0) {
                return true;
            }
            return false;
        }

        public final int Y1() {
            return this.zzg;
        }

        public final boolean Z0() {
            if ((this.zze & 131072) != 0) {
                return true;
            }
            return false;
        }

        public final void Z1(int i) {
            L1();
            this.zzi.remove(i);
        }

        public final boolean a1() {
            if ((this.zze & 32) != 0) {
                return true;
            }
            return false;
        }

        public final void a2(long j) {
            this.zze |= 8;
            this.zzl = j;
        }

        public final void a3(String str) {
            str.getClass();
            this.zzf |= 16384;
            this.zzbf = str;
        }

        public final boolean b1() {
            if ((this.zze & 16) != 0) {
                return true;
            }
            return false;
        }

        public final long b3() {
            return this.zzl;
        }

        public final boolean c1() {
            if ((this.zze & 1) != 0) {
                return true;
            }
            return false;
        }

        public final void c3(long j) {
            this.zze |= 32768;
            this.zzx = j;
        }

        public final String d0() {
            return this.zzv;
        }

        public final boolean d1() {
            if ((this.zzf & 2) != 0) {
                return true;
            }
            return false;
        }

        public final boolean e1() {
            if ((this.zze & 8388608) != 0) {
                return true;
            }
            return false;
        }

        public final String f0() {
            return this.zzbi;
        }

        public final boolean f1() {
            if ((this.zzf & 8192) != 0) {
                return true;
            }
            return false;
        }

        public final String g0() {
            return this.zzax;
        }

        public final boolean g1() {
            if ((this.zze & 4) != 0) {
                return true;
            }
            return false;
        }

        public final void g2(Iterable<? extends zzn> iterable) {
            L1();
            zzhd.i(iterable, this.zzi);
        }

        public final void g3(String str) {
            str.getClass();
            this.zze |= 16777216;
            this.zzah = str;
        }

        public final String h0() {
            return this.zzbk;
        }

        public final boolean h1() {
            if ((this.zzf & 32768) != 0) {
                return true;
            }
            return false;
        }

        public final void h2(String str) {
            str.getClass();
            this.zze |= 8192;
            this.zzv = str;
        }

        public final long h3() {
            return this.zzw;
        }

        public final String i0() {
            return this.zzq;
        }

        public final boolean i1() {
            if ((this.zze & 1024) != 0) {
                return true;
            }
            return false;
        }

        public final int i2() {
            return this.zzaq;
        }

        public final String j0() {
            return this.zzao;
        }

        public final boolean j1() {
            if ((this.zze & 2) != 0) {
                return true;
            }
            return false;
        }

        public final void j2(int i) {
            this.zzf |= 1048576;
            this.zzbl = i;
        }

        public final String k0() {
            return this.zzah;
        }

        public final boolean k1() {
            if ((this.zze & 32768) != 0) {
                return true;
            }
            return false;
        }

        public final void k2(long j) {
            this.zze |= 16384;
            this.zzw = j;
        }

        public final void k3(String str) {
            str.getClass();
            this.zze |= 4194304;
            this.zzae = str;
        }

        public final String l0() {
            return this.zzae;
        }

        public final int l1() {
            return this.zzac;
        }

        public final long l3() {
            return this.zzn;
        }

        public final int m() {
            return this.zzbl;
        }

        public final String m0() {
            return this.zzad;
        }

        public final void m1(long j) {
            this.zze |= 524288;
            this.zzab = j;
        }

        public final String n0() {
            return this.zzp;
        }

        public final void n3(String str) {
            str.getClass();
            this.zze |= 2097152;
            this.zzad = str;
        }

        public final String o0() {
            return this.zzo;
        }

        public final long o3() {
            return this.zzm;
        }

        public final String p0() {
            return this.zzy;
        }

        public final void p2(String str) {
            str.getClass();
            this.zzf |= 131072;
            this.zzbi = str;
        }

        @Override // com.google.android.gms.internal.measurement.zzix
        public final Object q(int i, Object obj, Object obj2) {
            zzkw zzkwVar;
            switch (zzfh.a[i - 1]) {
                case 1:
                    return new zzj();
                case 2:
                    return new zza(null);
                case 3:
                    return zzix.r(zzc, "\u0001<\u0000\u0002\u0001L<\u0000\u0005\u0000\u0001င\u0000\u0002\u001b\u0003\u001b\u0004ဂ\u0001\u0005ဂ\u0002\u0006ဂ\u0003\u0007ဂ\u0005\bဈ\u0006\tဈ\u0007\nဈ\b\u000bဈ\t\fင\n\rဈ\u000b\u000eဈ\f\u0010ဈ\r\u0011ဂ\u000e\u0012ဂ\u000f\u0013ဈ\u0010\u0014ဇ\u0011\u0015ဈ\u0012\u0016ဂ\u0013\u0017င\u0014\u0018ဈ\u0015\u0019ဈ\u0016\u001aဂ\u0004\u001cဇ\u0017\u001d\u001b\u001eဈ\u0018\u001fင\u0019 င\u001a!င\u001b\"ဈ\u001c#ဂ\u001d$ဂ\u001e%ဈ\u001f&ဈ 'င!)ဈ\",ဉ#-\u001d.ဂ$/ဂ%2ဈ&4ဈ'5᠌(7ဇ)9ဈ*:ဇ+;ဉ,?ဈ-@\u001aAဈ.Cဂ/Dဇ0Gဈ1Hဇ2Iဈ3Jင4Kဈ5Lဉ6", new Object[]{"zze", "zzf", "zzg", "zzh", zze.class, "zzi", zzn.class, "zzj", "zzk", "zzl", "zzn", "zzo", "zzp", "zzq", "zzr", "zzs", "zzt", "zzu", "zzv", "zzw", "zzx", "zzy", "zzz", "zzaa", "zzab", "zzac", "zzad", "zzae", "zzm", "zzaf", "zzag", zzc.class, "zzah", "zzai", "zzaj", "zzak", "zzal", "zzam", "zzan", "zzao", "zzap", "zzaq", "zzar", "zzas", "zzat", "zzau", "zzav", "zzaw", "zzax", "zzay", zzfk.g(), "zzaz", "zzba", "zzbb", "zzbc", "zzbd", "zzbe", "zzbf", "zzbg", "zzbh", "zzbi", "zzbj", "zzbk", "zzbl", "zzbm", "zzbn"});
                case 4:
                    return zzc;
                case 5:
                    zzkw<zzj> zzkwVar2 = zzd;
                    if (zzkwVar2 == null) {
                        synchronized (zzj.class) {
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

        public final String q0() {
            return this.zzbd;
        }

        public final int q2() {
            return this.zzs;
        }

        public final void q3(String str) {
            str.getClass();
            this.zze |= 128;
            this.zzp = str;
        }

        public final String r0() {
            return this.zzr;
        }

        public final void r2(int i) {
            this.zze |= 33554432;
            this.zzai = i;
        }

        public final long r3() {
            return this.zzk;
        }

        public final List<zzc> s0() {
            return this.zzag;
        }

        public final void s2(long j) {
            this.zze |= 32;
            this.zzn = j;
        }

        public final List<zze> t0() {
            return this.zzh;
        }

        public final void t1(Iterable<? extends Integer> iterable) {
            int i;
            zzjd zzjdVar = this.zzat;
            if (!zzjdVar.c()) {
                int size = zzjdVar.size();
                if (size == 0) {
                    i = 10;
                } else {
                    i = size << 1;
                }
                this.zzat = zzjdVar.C(i);
            }
            zzhd.i(iterable, this.zzat);
        }

        public final void t3(String str) {
            str.getClass();
            this.zze |= 64;
            this.zzo = str;
        }

        public final List<zzn> u0() {
            return this.zzi;
        }

        public final void u1(String str) {
            str.getClass();
            this.zze |= 262144;
            this.zzaa = str;
        }

        public final long u3() {
            return this.zzbg;
        }

        public final boolean v0() {
            return this.zzbh;
        }

        public final boolean w0() {
            return this.zzbj;
        }

        public final void w1() {
            this.zze &= -262145;
            this.zzaa = zzc.zzaa;
        }

        public final void w3(String str) {
            str.getClass();
            this.zze |= 65536;
            this.zzy = str;
        }

        public final boolean x0() {
            return this.zzz;
        }

        public final void x1() {
            this.zzag = zzix.B();
        }

        public final void x2(String str) {
            str.getClass();
            this.zzf |= 128;
            this.zzax = str;
        }

        public final long x3() {
            return this.zzj;
        }

        public final boolean y0() {
            return this.zzaf;
        }

        public final void y1() {
            this.zze &= -257;
            this.zzq = zzc.zzq;
        }

        public final int y2() {
            return this.zzi.size();
        }

        public final boolean z0() {
            if ((this.zze & 33554432) != 0) {
                return true;
            }
            return false;
        }

        public final void z1() {
            this.zze &= Integer.MAX_VALUE;
            this.zzao = zzc.zzao;
        }

        public final void z2(int i) {
            this.zze |= 1048576;
            this.zzac = i;
        }

        public final void z3(String str) {
            str.getClass();
            this.zzf |= 8192;
            this.zzbd = str;
        }
    }

    /* loaded from: classes3.dex */
    public static final class zzk extends zzix<zzk, zzb> implements zzkl {
        private static final zzk zzc;
        private static volatile zzkw<zzk> zzd;
        private int zze;
        private int zzf = 1;
        private zzjf<zzf> zzg = zzix.B();

        /* loaded from: classes3.dex */
        public enum zza implements zzjc {
            RADS(1),
            PROVISIONING(2);
            
            public static final zzjb<zza> Y0 = new zzfn();
            public final int X;

            zza(int i) {
                this.X = i;
            }

            public static zza e(int i) {
                if (i != 1) {
                    if (i != 2) {
                        return null;
                    }
                    return PROVISIONING;
                }
                return RADS;
            }

            public static zzje g() {
                return zzfm.a;
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
        public static final class zzb extends zzix.zzb<zzk, zzb> implements zzkl {
            private zzb() {
                super(zzk.zzc);
            }

            public final zzb v(zzf.zza zzaVar) {
                q();
                ((zzk) this.Y).G((zzf) ((zzix) zzaVar.e0()));
                return this;
            }

            public /* synthetic */ zzb(zzfh zzfhVar) {
                this();
            }
        }

        static {
            zzk zzkVar = new zzk();
            zzc = zzkVar;
            zzix.t(zzk.class, zzkVar);
        }

        private zzk() {
        }

        public static zzb F() {
            return zzc.w();
        }

        public final void G(zzf zzfVar) {
            zzfVar.getClass();
            zzjf<zzf> zzjfVar = this.zzg;
            if (!zzjfVar.c()) {
                this.zzg = zzix.o(zzjfVar);
            }
            this.zzg.add(zzfVar);
        }

        @Override // com.google.android.gms.internal.measurement.zzix
        public final Object q(int i, Object obj, Object obj2) {
            zzkw zzkwVar;
            switch (zzfh.a[i - 1]) {
                case 1:
                    return new zzk();
                case 2:
                    return new zzb(null);
                case 3:
                    return zzix.r(zzc, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001᠌\u0000\u0002\u001b", new Object[]{"zze", "zzf", zza.g(), "zzg", zzf.class});
                case 4:
                    return zzc;
                case 5:
                    zzkw<zzk> zzkwVar2 = zzd;
                    if (zzkwVar2 == null) {
                        synchronized (zzk.class) {
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
    public static final class zzl extends zzix<zzl, zza> implements zzkl {
        private static final zzl zzc;
        private static volatile zzkw<zzl> zzd;
        private zzjg zze = zzix.A();
        private zzjg zzf = zzix.A();
        private zzjf<zzd> zzg = zzix.B();
        private zzjf<zzm> zzh = zzix.B();

        /* loaded from: classes3.dex */
        public static final class zza extends zzix.zzb<zzl, zza> implements zzkl {
            private zza() {
                super(zzl.zzc);
            }

            public final zza A(Iterable<? extends zzm> iterable) {
                q();
                ((zzl) this.Y).P(iterable);
                return this;
            }

            public final zza B() {
                q();
                ((zzl) this.Y).g0();
                return this;
            }

            public final zza C(Iterable<? extends Long> iterable) {
                q();
                ((zzl) this.Y).T(iterable);
                return this;
            }

            public final zza v() {
                q();
                ((zzl) this.Y).c0();
                return this;
            }

            public final zza w(Iterable<? extends zzd> iterable) {
                q();
                ((zzl) this.Y).H(iterable);
                return this;
            }

            public final zza x() {
                q();
                ((zzl) this.Y).d0();
                return this;
            }

            public final zza y(Iterable<? extends Long> iterable) {
                q();
                ((zzl) this.Y).L(iterable);
                return this;
            }

            public final zza z() {
                q();
                ((zzl) this.Y).f0();
                return this;
            }

            public /* synthetic */ zza(zzfh zzfhVar) {
                this();
            }
        }

        static {
            zzl zzlVar = new zzl();
            zzc = zzlVar;
            zzix.t(zzl.class, zzlVar);
        }

        private zzl() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void H(Iterable<? extends zzd> iterable) {
            zzjf<zzd> zzjfVar = this.zzg;
            if (!zzjfVar.c()) {
                this.zzg = zzix.o(zzjfVar);
            }
            zzhd.i(iterable, this.zzg);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void L(Iterable<? extends Long> iterable) {
            zzjg zzjgVar = this.zzf;
            if (!zzjgVar.c()) {
                this.zzf = zzix.p(zzjgVar);
            }
            zzhd.i(iterable, this.zzf);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void P(Iterable<? extends zzm> iterable) {
            zzjf<zzm> zzjfVar = this.zzh;
            if (!zzjfVar.c()) {
                this.zzh = zzix.o(zzjfVar);
            }
            zzhd.i(iterable, this.zzh);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void T(Iterable<? extends Long> iterable) {
            zzjg zzjgVar = this.zze;
            if (!zzjgVar.c()) {
                this.zze = zzix.p(zzjgVar);
            }
            zzhd.i(iterable, this.zze);
        }

        public static zza U() {
            return zzc.w();
        }

        public static zzl W() {
            return zzc;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void c0() {
            this.zzg = zzix.B();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void d0() {
            this.zzf = zzix.A();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void g0() {
            this.zze = zzix.A();
        }

        public final int I() {
            return this.zzf.size();
        }

        public final int M() {
            return this.zzh.size();
        }

        public final int Q() {
            return this.zze.size();
        }

        public final List<zzd> X() {
            return this.zzg;
        }

        public final List<Long> Y() {
            return this.zzf;
        }

        public final List<zzm> Z() {
            return this.zzh;
        }

        public final List<Long> b0() {
            return this.zze;
        }

        public final void f0() {
            this.zzh = zzix.B();
        }

        public final int m() {
            return this.zzg.size();
        }

        @Override // com.google.android.gms.internal.measurement.zzix
        public final Object q(int i, Object obj, Object obj2) {
            zzkw zzkwVar;
            switch (zzfh.a[i - 1]) {
                case 1:
                    return new zzl();
                case 2:
                    return new zza(null);
                case 3:
                    return zzix.r(zzc, "\u0001\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0004\u0000\u0001\u0015\u0002\u0015\u0003\u001b\u0004\u001b", new Object[]{"zze", "zzf", "zzg", zzd.class, "zzh", zzm.class});
                case 4:
                    return zzc;
                case 5:
                    zzkw<zzl> zzkwVar2 = zzd;
                    if (zzkwVar2 == null) {
                        synchronized (zzl.class) {
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
    public static final class zzm extends zzix<zzm, zza> implements zzkl {
        private static final zzm zzc;
        private static volatile zzkw<zzm> zzd;
        private int zze;
        private int zzf;
        private zzjg zzg = zzix.A();

        /* loaded from: classes3.dex */
        public static final class zza extends zzix.zzb<zzm, zza> implements zzkl {
            private zza() {
                super(zzm.zzc);
            }

            public final zza v(int i) {
                q();
                ((zzm) this.Y).K(i);
                return this;
            }

            public final zza w(Iterable<? extends Long> iterable) {
                q();
                ((zzm) this.Y).I(iterable);
                return this;
            }

            public /* synthetic */ zza(zzfh zzfhVar) {
                this();
            }
        }

        static {
            zzm zzmVar = new zzm();
            zzc = zzmVar;
            zzix.t(zzm.class, zzmVar);
        }

        private zzm() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void I(Iterable<? extends Long> iterable) {
            zzjg zzjgVar = this.zzg;
            if (!zzjgVar.c()) {
                this.zzg = zzix.p(zzjgVar);
            }
            zzhd.i(iterable, this.zzg);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void K(int i) {
            this.zze |= 1;
            this.zzf = i;
        }

        public static zza L() {
            return zzc.w();
        }

        public final long F(int i) {
            return this.zzg.z(i);
        }

        public final int J() {
            return this.zzf;
        }

        public final List<Long> N() {
            return this.zzg;
        }

        public final boolean O() {
            if ((this.zze & 1) != 0) {
                return true;
            }
            return false;
        }

        public final int m() {
            return this.zzg.size();
        }

        @Override // com.google.android.gms.internal.measurement.zzix
        public final Object q(int i, Object obj, Object obj2) {
            zzkw zzkwVar;
            switch (zzfh.a[i - 1]) {
                case 1:
                    return new zzm();
                case 2:
                    return new zza(null);
                case 3:
                    return zzix.r(zzc, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001င\u0000\u0002\u0014", new Object[]{"zze", "zzf", "zzg"});
                case 4:
                    return zzc;
                case 5:
                    zzkw<zzm> zzkwVar2 = zzd;
                    if (zzkwVar2 == null) {
                        synchronized (zzm.class) {
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
    public static final class zzn extends zzix<zzn, zza> implements zzkl {
        private static final zzn zzc;
        private static volatile zzkw<zzn> zzd;
        private int zze;
        private long zzf;
        private String zzg = "";
        private String zzh = "";
        private long zzi;
        private float zzj;
        private double zzk;

        /* loaded from: classes3.dex */
        public static final class zza extends zzix.zzb<zzn, zza> implements zzkl {
            private zza() {
                super(zzn.zzc);
            }

            public final zza A(long j) {
                q();
                ((zzn) this.Y).O(j);
                return this;
            }

            public final zza B(String str) {
                q();
                ((zzn) this.Y).S(str);
                return this;
            }

            public final zza C() {
                q();
                ((zzn) this.Y).j0();
                return this;
            }

            public final zza v() {
                q();
                ((zzn) this.Y).h0();
                return this;
            }

            public final zza w(double d) {
                q();
                ((zzn) this.Y).G(d);
                return this;
            }

            public final zza x(long j) {
                q();
                ((zzn) this.Y).H(j);
                return this;
            }

            public final zza y(String str) {
                q();
                ((zzn) this.Y).M(str);
                return this;
            }

            public final zza z() {
                q();
                ((zzn) this.Y).i0();
                return this;
            }

            public /* synthetic */ zza(zzfh zzfhVar) {
                this();
            }
        }

        static {
            zzn zznVar = new zzn();
            zzc = zznVar;
            zzix.t(zzn.class, zznVar);
        }

        private zzn() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void G(double d) {
            this.zze |= 32;
            this.zzk = d;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void H(long j) {
            this.zze |= 8;
            this.zzi = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void M(String str) {
            str.getClass();
            this.zze |= 2;
            this.zzg = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void O(long j) {
            this.zze |= 1;
            this.zzf = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void S(String str) {
            str.getClass();
            this.zze |= 4;
            this.zzh = str;
        }

        public static zza W() {
            return zzc.w();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void h0() {
            this.zze &= -33;
            this.zzk = 0.0d;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void i0() {
            this.zze &= -9;
            this.zzi = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void j0() {
            this.zze &= -5;
            this.zzh = zzc.zzh;
        }

        public final double F() {
            return this.zzk;
        }

        public final float N() {
            return this.zzj;
        }

        public final long T() {
            return this.zzi;
        }

        public final long V() {
            return this.zzf;
        }

        public final String Y() {
            return this.zzg;
        }

        public final String Z() {
            return this.zzh;
        }

        public final boolean b0() {
            if ((this.zze & 32) != 0) {
                return true;
            }
            return false;
        }

        public final boolean c0() {
            if ((this.zze & 16) != 0) {
                return true;
            }
            return false;
        }

        public final boolean d0() {
            if ((this.zze & 8) != 0) {
                return true;
            }
            return false;
        }

        public final boolean f0() {
            if ((this.zze & 1) != 0) {
                return true;
            }
            return false;
        }

        public final boolean g0() {
            if ((this.zze & 4) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.android.gms.internal.measurement.zzix
        public final Object q(int i, Object obj, Object obj2) {
            zzkw zzkwVar;
            switch (zzfh.a[i - 1]) {
                case 1:
                    return new zzn();
                case 2:
                    return new zza(null);
                case 3:
                    return zzix.r(zzc, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0005ခ\u0004\u0006က\u0005", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
                case 4:
                    return zzc;
                case 5:
                    zzkw<zzn> zzkwVar2 = zzd;
                    if (zzkwVar2 == null) {
                        synchronized (zzn.class) {
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
