package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class zzbca {

    /* renamed from: com.google.android.gms.internal.ads.zzbca$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[zzgyr.values().length];
            a = iArr;
            try {
                iArr[zzgyr.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[zzgyr.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[zzgyr.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[zzgyr.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[zzgyr.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[zzgyr.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[zzgyr.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* loaded from: classes2.dex */
    public final class zza extends zzgys<zza, zzb> implements zzf {
        public static final int zza = 7;
        public static final int zzb = 8;
        public static final int zzc = 9;
        public static final int zzd = 10;
        public static final int zze = 11;
        public static final int zzf = 12;
        public static final int zzg = 13;
        public static final int zzh = 14;
        public static final int zzi = 15;
        public static final int zzj = 16;
        public static final int zzk = 17;
        private static final zza zzl;
        private static volatile zzhal<zza> zzm;
        private zzx zzA;
        private zzz zzB;
        private int zzn;
        private int zzo;
        private zzg zzu;
        private zzi zzv;
        private zzk zzx;
        private zzah zzy;
        private zzac zzz;
        private int zzp = 1000;
        private zzgze<zzd> zzw = zzgys.q1();
        private zzgze<zzat> zzC = zzgys.q1();

        /* renamed from: com.google.android.gms.internal.ads.zzbca$zza$zza  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public enum EnumC0104zza implements zzgyw {
            AD_INITIATER_UNSPECIFIED(0),
            BANNER(1),
            DFP_BANNER(2),
            INTERSTITIAL(3),
            DFP_INTERSTITIAL(4),
            NATIVE_EXPRESS(5),
            AD_LOADER(6),
            REWARD_BASED_VIDEO_AD(7),
            BANNER_SEARCH_ADS(8),
            GOOGLE_MOBILE_ADS_SDK_ADAPTER(9),
            APP_OPEN(10),
            REWARDED_INTERSTITIAL(11);
            
            public static final int i1 = 0;
            public static final int j1 = 1;
            public static final int k1 = 2;
            public static final int l1 = 3;
            public static final int m1 = 4;
            public static final int n1 = 5;
            public static final int o1 = 6;
            public static final int p1 = 7;
            public static final int q1 = 8;
            public static final int r1 = 9;
            public static final int s1 = 10;
            public static final int t1 = 11;
            public static final zzgyx<EnumC0104zza> u1 = new zzgyx<EnumC0104zza>() { // from class: com.google.android.gms.internal.ads.zzbca.zza.zza.1
                /* renamed from: a */
                public EnumC0104zza b(int i) {
                    return EnumC0104zza.e(i);
                }
            };
            public final int X;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: com.google.android.gms.internal.ads.zzbca$zza$zza$zza  reason: collision with other inner class name */
            /* loaded from: classes2.dex */
            public final class C0105zza implements zzgyy {
                public static final zzgyy a = new C0105zza();

                private C0105zza() {
                }

                @Override // com.google.android.gms.internal.ads.zzgyy
                public boolean u(int i) {
                    if (EnumC0104zza.e(i) != null) {
                        return true;
                    }
                    return false;
                }
            }

            EnumC0104zza(int i) {
                this.X = i;
            }

            public static EnumC0104zza e(int i) {
                switch (i) {
                    case 0:
                        return AD_INITIATER_UNSPECIFIED;
                    case 1:
                        return BANNER;
                    case 2:
                        return DFP_BANNER;
                    case 3:
                        return INTERSTITIAL;
                    case 4:
                        return DFP_INTERSTITIAL;
                    case 5:
                        return NATIVE_EXPRESS;
                    case 6:
                        return AD_LOADER;
                    case 7:
                        return REWARD_BASED_VIDEO_AD;
                    case 8:
                        return BANNER_SEARCH_ADS;
                    case 9:
                        return GOOGLE_MOBILE_ADS_SDK_ADAPTER;
                    case 10:
                        return APP_OPEN;
                    case 11:
                        return REWARDED_INTERSTITIAL;
                    default:
                        return null;
                }
            }

            public static zzgyx<EnumC0104zza> h() {
                return u1;
            }

            public static zzgyy i() {
                return C0105zza.a;
            }

            @Override // com.google.android.gms.internal.ads.zzgyw
            public final int a() {
                return this.X;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return Integer.toString(this.X);
            }
        }

        /* loaded from: classes2.dex */
        public final class zzb extends zzgym<zza, zzb> implements zzf {
            public zzb A2(int i, zzat zzatVar) {
                W1();
                ((zza) this.Y).u3(i, zzatVar);
                return this;
            }

            public zzb B2(Iterable<? extends zzd> iterable) {
                W1();
                ((zza) this.Y).X2(iterable);
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzf
            public boolean C0() {
                return ((zza) this.Y).C0();
            }

            public zzb C2(Iterable<? extends zzat> iterable) {
                W1();
                ((zza) this.Y).Y2(iterable);
                return this;
            }

            public zzb D2(zzd.zzb zzbVar) {
                W1();
                ((zza) this.Y).Z2(zzbVar.V1());
                return this;
            }

            public zzb E2(zzd zzdVar) {
                W1();
                ((zza) this.Y).Z2(zzdVar);
                return this;
            }

            public zzb F2(int i, zzd.zzb zzbVar) {
                W1();
                ((zza) this.Y).a3(i, zzbVar.V1());
                return this;
            }

            public zzb G2(int i, zzd zzdVar) {
                W1();
                ((zza) this.Y).a3(i, zzdVar);
                return this;
            }

            public zzb H2(zzat.zza zzaVar) {
                W1();
                ((zza) this.Y).b3(zzaVar.V1());
                return this;
            }

            public zzb I2(zzat zzatVar) {
                W1();
                ((zza) this.Y).b3(zzatVar);
                return this;
            }

            public zzb J2(int i, zzat.zza zzaVar) {
                W1();
                ((zza) this.Y).c3(i, zzaVar.V1());
                return this;
            }

            public zzb K2(int i, zzat zzatVar) {
                W1();
                ((zza) this.Y).c3(i, zzatVar);
                return this;
            }

            public zzb L2() {
                W1();
                ((zza) this.Y).v3();
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzf
            public zzd M0(int i) {
                return ((zza) this.Y).M0(i);
            }

            public zzb M2() {
                W1();
                ((zza) this.Y).w3();
                return this;
            }

            public zzb N2() {
                W1();
                ((zza) this.Y).x3();
                return this;
            }

            public zzb O2() {
                W1();
                ((zza) this.Y).y3();
                return this;
            }

            public zzb P2() {
                W1();
                ((zza) this.Y).z3();
                return this;
            }

            public zzb Q2() {
                W1();
                ((zza) this.Y).A3();
                return this;
            }

            public zzb R2() {
                W1();
                ((zza) this.Y).B3();
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzf
            public zzat S0(int i) {
                return ((zza) this.Y).S0(i);
            }

            public zzb S2() {
                W1();
                ((zza) this.Y).C3();
                return this;
            }

            public zzb T2() {
                W1();
                ((zza) this.Y).D3();
                return this;
            }

            public zzb U2() {
                W1();
                ((zza) this.Y).E3();
                return this;
            }

            public zzb V2() {
                W1();
                ((zza) this.Y).F3();
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzf
            public zzz W() {
                return ((zza) this.Y).W();
            }

            public zzb W2(zzx zzxVar) {
                W1();
                ((zza) this.Y).I3(zzxVar);
                return this;
            }

            public zzb X2(zzz zzzVar) {
                W1();
                ((zza) this.Y).J3(zzzVar);
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzf
            public zzq Y() {
                return ((zza) this.Y).Y();
            }

            public zzb Y1(zzac zzacVar) {
                W1();
                ((zza) this.Y).K3(zzacVar);
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzf
            public List<zzat> Z() {
                return Collections.unmodifiableList(((zza) this.Y).Z());
            }

            public zzb Z1(zzg zzgVar) {
                W1();
                ((zza) this.Y).L3(zzgVar);
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzf
            public int a() {
                return ((zza) this.Y).a();
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzf
            public zzg a0() {
                return ((zza) this.Y).a0();
            }

            public zzb a2(zzi zziVar) {
                W1();
                ((zza) this.Y).M3(zziVar);
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzf
            public int b() {
                return ((zza) this.Y).b();
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzf
            public zzi b0() {
                return ((zza) this.Y).b0();
            }

            public zzb b2(zzah zzahVar) {
                W1();
                ((zza) this.Y).N3(zzahVar);
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzf
            public EnumC0104zza c() {
                return ((zza) this.Y).c();
            }

            public zzb c2(zzk zzkVar) {
                W1();
                ((zza) this.Y).O3(zzkVar);
                return this;
            }

            public zzb d2(int i) {
                W1();
                ((zza) this.Y).P3(i);
                return this;
            }

            public zzb e2(int i) {
                W1();
                ((zza) this.Y).i3(i);
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzf
            public zzx f0() {
                return ((zza) this.Y).f0();
            }

            public zzb f2(EnumC0104zza enumC0104zza) {
                W1();
                ((zza) this.Y).j3(enumC0104zza);
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzf
            public zzk g0() {
                return ((zza) this.Y).g0();
            }

            public zzb g2(zzx.zza zzaVar) {
                W1();
                ((zza) this.Y).k3(zzaVar.V1());
                return this;
            }

            public zzb h2(zzx zzxVar) {
                W1();
                ((zza) this.Y).k3(zzxVar);
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzf
            public List<zzd> j0() {
                return Collections.unmodifiableList(((zza) this.Y).j0());
            }

            public zzb j2(zzq zzqVar) {
                W1();
                ((zza) this.Y).l3(zzqVar);
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzf
            public zzah k0() {
                return ((zza) this.Y).k0();
            }

            public zzb k2(zzz.zza zzaVar) {
                W1();
                ((zza) this.Y).m3(zzaVar.V1());
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzf
            public zzac m0() {
                return ((zza) this.Y).m0();
            }

            public zzb m2(zzz zzzVar) {
                W1();
                ((zza) this.Y).m3(zzzVar);
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzf
            public boolean n0() {
                return ((zza) this.Y).n0();
            }

            public zzb n2(zzac.zza zzaVar) {
                W1();
                ((zza) this.Y).n3(zzaVar.V1());
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzf
            public boolean o0() {
                return ((zza) this.Y).o0();
            }

            public zzb o2(zzac zzacVar) {
                W1();
                ((zza) this.Y).n3(zzacVar);
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzf
            public boolean p0() {
                return ((zza) this.Y).p0();
            }

            public zzb p2(int i, zzd.zzb zzbVar) {
                W1();
                ((zza) this.Y).p3(i, zzbVar.V1());
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzf
            public boolean q0() {
                return ((zza) this.Y).q0();
            }

            public zzb q2(int i, zzd zzdVar) {
                W1();
                ((zza) this.Y).p3(i, zzdVar);
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzf
            public boolean r0() {
                return ((zza) this.Y).r0();
            }

            public zzb r2(zzg.zza zzaVar) {
                W1();
                ((zza) this.Y).q3(zzaVar.V1());
                return this;
            }

            public zzb s2(zzg zzgVar) {
                W1();
                ((zza) this.Y).q3(zzgVar);
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzf
            public boolean t0() {
                return ((zza) this.Y).t0();
            }

            public zzb t2(zzi.zza zzaVar) {
                W1();
                ((zza) this.Y).r3(zzaVar.V1());
                return this;
            }

            public zzb u2(zzi zziVar) {
                W1();
                ((zza) this.Y).r3(zziVar);
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzf
            public boolean v0() {
                return ((zza) this.Y).v0();
            }

            public zzb v2(zzah.zza zzaVar) {
                W1();
                ((zza) this.Y).s3(zzaVar.V1());
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzf
            public boolean w0() {
                return ((zza) this.Y).w0();
            }

            public zzb w2(zzah zzahVar) {
                W1();
                ((zza) this.Y).s3(zzahVar);
                return this;
            }

            public zzb x2(zzk.zza zzaVar) {
                W1();
                ((zza) this.Y).t3(zzaVar.V1());
                return this;
            }

            public zzb y2(zzk zzkVar) {
                W1();
                ((zza) this.Y).t3(zzkVar);
                return this;
            }

            public zzb z2(int i, zzat.zza zzaVar) {
                W1();
                ((zza) this.Y).u3(i, zzaVar.V1());
                return this;
            }

            private zzb() {
                super(zza.zzl);
            }
        }

        static {
            zza zzaVar = new zza();
            zzl = zzaVar;
            zzgys.F1(zza.class, zzaVar);
        }

        private zza() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void A3() {
            this.zzw = zzgys.q1();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void B3() {
            this.zzu = null;
            this.zzn &= -5;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void C3() {
            this.zzv = null;
            this.zzn &= -9;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void D3() {
            this.zzy = null;
            this.zzn &= -33;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void E3() {
            this.zzx = null;
            this.zzn &= -17;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void F3() {
            this.zzC = zzgys.q1();
        }

        private void G3() {
            zzgze<zzd> zzgzeVar = this.zzw;
            if (!zzgzeVar.c()) {
                this.zzw = zzgys.r1(zzgzeVar);
            }
        }

        private void H3() {
            zzgze<zzat> zzgzeVar = this.zzC;
            if (!zzgzeVar.c()) {
                this.zzC = zzgys.r1(zzgzeVar);
            }
        }

        public static zzb Q3() {
            return (zzb) zzl.f1();
        }

        public static zzb R3(zza zzaVar) {
            return (zzb) zzl.G1(zzaVar);
        }

        public static zza T3() {
            return zzl;
        }

        public static zza U3(InputStream inputStream) throws IOException {
            return (zza) zzgys.Q1(zzl, inputStream);
        }

        public static zza V3(InputStream inputStream, zzgyc zzgycVar) throws IOException {
            return (zza) zzgys.R1(zzl, inputStream, zzgycVar);
        }

        public static zza W3(zzgxk zzgxkVar) throws zzgzh {
            return (zza) zzgys.S1(zzl, zzgxkVar);
        }

        public static zza X3(zzgxq zzgxqVar) throws IOException {
            return (zza) zzgys.T1(zzl, zzgxqVar);
        }

        public static zza Y3(InputStream inputStream) throws IOException {
            return (zza) zzgys.U1(zzl, inputStream);
        }

        public static zza Z3(ByteBuffer byteBuffer) throws zzgzh {
            return (zza) zzgys.V1(zzl, byteBuffer);
        }

        public static zza a4(byte[] bArr) throws zzgzh {
            return (zza) zzgys.W1(zzl, bArr);
        }

        public static zza b4(zzgxk zzgxkVar, zzgyc zzgycVar) throws zzgzh {
            return (zza) zzgys.X1(zzl, zzgxkVar, zzgycVar);
        }

        public static zza c4(zzgxq zzgxqVar, zzgyc zzgycVar) throws IOException {
            return (zza) zzgys.Y1(zzl, zzgxqVar, zzgycVar);
        }

        public static zza d4(InputStream inputStream, zzgyc zzgycVar) throws IOException {
            return (zza) zzgys.Z1(zzl, inputStream, zzgycVar);
        }

        public static zza e4(ByteBuffer byteBuffer, zzgyc zzgycVar) throws zzgzh {
            return (zza) zzgys.a2(zzl, byteBuffer, zzgycVar);
        }

        public static zza f4(byte[] bArr, zzgyc zzgycVar) throws zzgzh {
            return (zza) zzgys.b2(zzl, bArr, zzgycVar);
        }

        public static zzhal<zza> i4() {
            return zzl.t1();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void v3() {
            this.zzn &= -2;
            this.zzo = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void w3() {
            this.zzA = null;
            this.zzn &= -129;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void x3() {
            this.zzn &= -3;
            this.zzp = 1000;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void y3() {
            this.zzB = null;
            this.zzn &= -257;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void z3() {
            this.zzz = null;
            this.zzn &= -65;
        }

        @Override // com.google.android.gms.internal.ads.zzbca.zzf
        public boolean C0() {
            return (this.zzn & 16) != 0;
        }

        public final void I3(zzx zzxVar) {
            zzxVar.getClass();
            zzx zzxVar2 = this.zzA;
            if (zzxVar2 != null && zzxVar2 != zzx.F2()) {
                zzx.zza D2 = zzx.D2(zzxVar2);
                D2.M1(zzxVar);
                zzxVar = D2.o3();
            }
            this.zzA = zzxVar;
            this.zzn |= 128;
        }

        public final void J3(zzz zzzVar) {
            zzzVar.getClass();
            zzz zzzVar2 = this.zzB;
            if (zzzVar2 != null && zzzVar2 != zzz.Z2()) {
                zzz.zza X2 = zzz.X2(zzzVar2);
                X2.M1(zzzVar);
                zzzVar = X2.o3();
            }
            this.zzB = zzzVar;
            this.zzn |= 256;
        }

        public final void K3(zzac zzacVar) {
            zzacVar.getClass();
            zzac zzacVar2 = this.zzz;
            if (zzacVar2 != null && zzacVar2 != zzac.B2()) {
                zzac.zza z2 = zzac.z2(zzacVar2);
                z2.M1(zzacVar);
                zzacVar = z2.o3();
            }
            this.zzz = zzacVar;
            this.zzn |= 64;
        }

        public final void L3(zzg zzgVar) {
            zzgVar.getClass();
            zzg zzgVar2 = this.zzu;
            if (zzgVar2 != null && zzgVar2 != zzg.V2()) {
                zzg.zza T2 = zzg.T2(zzgVar2);
                T2.M1(zzgVar);
                zzgVar = T2.o3();
            }
            this.zzu = zzgVar;
            this.zzn |= 4;
        }

        @Override // com.google.android.gms.internal.ads.zzbca.zzf
        public zzd M0(int i) {
            return this.zzw.get(i);
        }

        public final void M3(zzi zziVar) {
            zziVar.getClass();
            zzi zziVar2 = this.zzv;
            if (zziVar2 != null && zziVar2 != zzi.d3()) {
                zzi.zza b3 = zzi.b3(zziVar2);
                b3.M1(zziVar);
                zziVar = b3.o3();
            }
            this.zzv = zziVar;
            this.zzn |= 8;
        }

        public final void N3(zzah zzahVar) {
            zzahVar.getClass();
            zzah zzahVar2 = this.zzy;
            if (zzahVar2 != null && zzahVar2 != zzah.r3()) {
                zzah.zza p3 = zzah.p3(zzahVar2);
                p3.M1(zzahVar);
                zzahVar = p3.o3();
            }
            this.zzy = zzahVar;
            this.zzn |= 32;
        }

        public final void O3(zzk zzkVar) {
            zzkVar.getClass();
            zzk zzkVar2 = this.zzx;
            if (zzkVar2 != null && zzkVar2 != zzk.f3()) {
                zzk.zza d3 = zzk.d3(zzkVar2);
                d3.M1(zzkVar);
                zzkVar = d3.o3();
            }
            this.zzx = zzkVar;
            this.zzn |= 16;
        }

        public final void P3(int i) {
            G3();
            this.zzw.remove(i);
        }

        @Override // com.google.android.gms.internal.ads.zzbca.zzf
        public zzat S0(int i) {
            return this.zzC.get(i);
        }

        @Override // com.google.android.gms.internal.ads.zzbca.zzf
        public zzz W() {
            zzz zzzVar = this.zzB;
            if (zzzVar == null) {
                return zzz.Z2();
            }
            return zzzVar;
        }

        public final void X2(Iterable<? extends zzd> iterable) {
            G3();
            zzgwt.U0(iterable, this.zzw);
        }

        @Override // com.google.android.gms.internal.ads.zzbca.zzf
        public zzq Y() {
            zzq e = zzq.e(this.zzp);
            if (e == null) {
                return zzq.ENUM_UNKNOWN;
            }
            return e;
        }

        public final void Y2(Iterable<? extends zzat> iterable) {
            H3();
            zzgwt.U0(iterable, this.zzC);
        }

        @Override // com.google.android.gms.internal.ads.zzbca.zzf
        public List<zzat> Z() {
            return this.zzC;
        }

        public final void Z2(zzd zzdVar) {
            zzdVar.getClass();
            G3();
            this.zzw.add(zzdVar);
        }

        @Override // com.google.android.gms.internal.ads.zzbca.zzf
        public int a() {
            return this.zzw.size();
        }

        @Override // com.google.android.gms.internal.ads.zzbca.zzf
        public zzg a0() {
            zzg zzgVar = this.zzu;
            if (zzgVar == null) {
                return zzg.V2();
            }
            return zzgVar;
        }

        public final void a3(int i, zzd zzdVar) {
            zzdVar.getClass();
            G3();
            this.zzw.add(i, zzdVar);
        }

        @Override // com.google.android.gms.internal.ads.zzbca.zzf
        public int b() {
            return this.zzC.size();
        }

        @Override // com.google.android.gms.internal.ads.zzbca.zzf
        public zzi b0() {
            zzi zziVar = this.zzv;
            if (zziVar == null) {
                return zzi.d3();
            }
            return zziVar;
        }

        public final void b3(zzat zzatVar) {
            zzatVar.getClass();
            H3();
            this.zzC.add(zzatVar);
        }

        @Override // com.google.android.gms.internal.ads.zzbca.zzf
        public EnumC0104zza c() {
            EnumC0104zza e = EnumC0104zza.e(this.zzo);
            if (e == null) {
                return EnumC0104zza.AD_INITIATER_UNSPECIFIED;
            }
            return e;
        }

        public final void c3(int i, zzat zzatVar) {
            zzatVar.getClass();
            H3();
            this.zzC.add(i, zzatVar);
        }

        @Override // com.google.android.gms.internal.ads.zzbca.zzf
        public zzx f0() {
            zzx zzxVar = this.zzA;
            if (zzxVar == null) {
                return zzx.F2();
            }
            return zzxVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbca.zzf
        public zzk g0() {
            zzk zzkVar = this.zzx;
            if (zzkVar == null) {
                return zzk.f3();
            }
            return zzkVar;
        }

        public zze g4(int i) {
            return this.zzw.get(i);
        }

        public zzbi h4(int i) {
            return this.zzC.get(i);
        }

        public final void i3(int i) {
            H3();
            this.zzC.remove(i);
        }

        @Override // com.google.android.gms.internal.ads.zzbca.zzf
        public List<zzd> j0() {
            return this.zzw;
        }

        public final void j3(EnumC0104zza enumC0104zza) {
            this.zzo = enumC0104zza.a();
            this.zzn |= 1;
        }

        public List<? extends zze> j4() {
            return this.zzw;
        }

        @Override // com.google.android.gms.internal.ads.zzbca.zzf
        public zzah k0() {
            zzah zzahVar = this.zzy;
            if (zzahVar == null) {
                return zzah.r3();
            }
            return zzahVar;
        }

        public final void k3(zzx zzxVar) {
            zzxVar.getClass();
            this.zzA = zzxVar;
            this.zzn |= 128;
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
                                    zzhal<zza> zzhalVar2 = zzm;
                                    if (zzhalVar2 == null) {
                                        synchronized (zza.class) {
                                            try {
                                                zzhalVar = zzm;
                                                if (zzhalVar == null) {
                                                    zzhalVar = new zzgyn(zzl);
                                                    zzm = zzhalVar;
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
                            return zzl;
                        }
                        return new zzb();
                    }
                    return new zza();
                }
                return zzgys.w1(zzl, "\u0004\u000b\u0000\u0001\u0007\u0011\u000b\u0000\u0002\u0000\u0007᠌\u0000\b᠌\u0001\tဉ\u0002\nဉ\u0003\u000b\u001b\fဉ\u0004\rဉ\u0005\u000eဉ\u0006\u000fဉ\u0007\u0010ဉ\b\u0011\u001b", new Object[]{"zzn", "zzo", EnumC0104zza.i(), "zzp", zzq.i(), "zzu", "zzv", "zzw", zzd.class, "zzx", "zzy", "zzz", "zzA", "zzB", "zzC", zzat.class});
            }
            return (byte) 1;
        }

        public final void l3(zzq zzqVar) {
            this.zzp = zzqVar.a();
            this.zzn |= 2;
        }

        @Override // com.google.android.gms.internal.ads.zzbca.zzf
        public zzac m0() {
            zzac zzacVar = this.zzz;
            if (zzacVar == null) {
                return zzac.B2();
            }
            return zzacVar;
        }

        public final void m3(zzz zzzVar) {
            zzzVar.getClass();
            this.zzB = zzzVar;
            this.zzn |= 256;
        }

        @Override // com.google.android.gms.internal.ads.zzbca.zzf
        public boolean n0() {
            return (this.zzn & 2) != 0;
        }

        public final void n3(zzac zzacVar) {
            zzacVar.getClass();
            this.zzz = zzacVar;
            this.zzn |= 64;
        }

        @Override // com.google.android.gms.internal.ads.zzbca.zzf
        public boolean o0() {
            return (this.zzn & 256) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbca.zzf
        public boolean p0() {
            return (this.zzn & 1) != 0;
        }

        public final void p3(int i, zzd zzdVar) {
            zzdVar.getClass();
            G3();
            this.zzw.set(i, zzdVar);
        }

        @Override // com.google.android.gms.internal.ads.zzbca.zzf
        public boolean q0() {
            return (this.zzn & 128) != 0;
        }

        public final void q3(zzg zzgVar) {
            zzgVar.getClass();
            this.zzu = zzgVar;
            this.zzn |= 4;
        }

        @Override // com.google.android.gms.internal.ads.zzbca.zzf
        public boolean r0() {
            return (this.zzn & 8) != 0;
        }

        public final void r3(zzi zziVar) {
            zziVar.getClass();
            this.zzv = zziVar;
            this.zzn |= 8;
        }

        public final void s3(zzah zzahVar) {
            zzahVar.getClass();
            this.zzy = zzahVar;
            this.zzn |= 32;
        }

        @Override // com.google.android.gms.internal.ads.zzbca.zzf
        public boolean t0() {
            return (this.zzn & 32) != 0;
        }

        public final void t3(zzk zzkVar) {
            zzkVar.getClass();
            this.zzx = zzkVar;
            this.zzn |= 16;
        }

        public final void u3(int i, zzat zzatVar) {
            zzatVar.getClass();
            H3();
            this.zzC.set(i, zzatVar);
        }

        @Override // com.google.android.gms.internal.ads.zzbca.zzf
        public boolean v0() {
            return (this.zzn & 64) != 0;
        }

        public List<? extends zzbi> w() {
            return this.zzC;
        }

        @Override // com.google.android.gms.internal.ads.zzbca.zzf
        public boolean w0() {
            return (this.zzn & 4) != 0;
        }
    }

    /* loaded from: classes2.dex */
    public interface zzaa extends zzhae {
        boolean C();

        boolean L();

        zzan L0(int i);

        boolean R();

        int a();

        zzq b();

        zzv c();

        List<zzan> w();

        zzap y();
    }

    /* loaded from: classes2.dex */
    public final class zzab extends zzgys<zzab, zza> implements zzae {
        public static final int zza = 1;
        public static final int zzb = 2;
        private static final zzab zzc;
        private static volatile zzhal<zzab> zzd;
        private int zze;
        private int zzf;
        private int zzg;

        /* loaded from: classes2.dex */
        public final class zza extends zzgym<zzab, zza> implements zzae {
            public zza Y1() {
                W1();
                ((zzab) this.Y).Q2();
                return this;
            }

            public zza Z1() {
                W1();
                ((zzab) this.Y).s2();
                return this;
            }

            public zza a2(zzb zzbVar) {
                W1();
                ((zzab) this.Y).t2(zzbVar);
                return this;
            }

            public zza b2(zzc zzcVar) {
                W1();
                ((zzab) this.Y).u2(zzcVar);
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzae
            public zzb d() {
                return ((zzab) this.Y).d();
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzae
            public zzc e() {
                return ((zzab) this.Y).e();
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzae
            public boolean g() {
                return ((zzab) this.Y).g();
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzae
            public boolean h() {
                return ((zzab) this.Y).h();
            }

            private zza() {
                super(zzab.zzc);
            }
        }

        /* loaded from: classes2.dex */
        public enum zzb implements zzgyw {
            CELLULAR_NETWORK_TYPE_UNSPECIFIED(0),
            TWO_G(1),
            THREE_G(2),
            LTE(4);
            
            public static final int a1 = 0;
            public static final int b1 = 1;
            public static final int c1 = 2;
            public static final int d1 = 4;
            public static final zzgyx<zzb> e1 = new zzgyx<zzb>() { // from class: com.google.android.gms.internal.ads.zzbca.zzab.zzb.1
                /* renamed from: a */
                public zzb b(int i) {
                    return zzb.e(i);
                }
            };
            public final int X;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* loaded from: classes2.dex */
            public final class zza implements zzgyy {
                public static final zzgyy a = new zza();

                private zza() {
                }

                @Override // com.google.android.gms.internal.ads.zzgyy
                public boolean u(int i) {
                    if (zzb.e(i) != null) {
                        return true;
                    }
                    return false;
                }
            }

            zzb(int i) {
                this.X = i;
            }

            public static zzb e(int i) {
                if (i != 0) {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 4) {
                                return null;
                            }
                            return LTE;
                        }
                        return THREE_G;
                    }
                    return TWO_G;
                }
                return CELLULAR_NETWORK_TYPE_UNSPECIFIED;
            }

            public static zzgyx<zzb> h() {
                return e1;
            }

            public static zzgyy i() {
                return zza.a;
            }

            @Override // com.google.android.gms.internal.ads.zzgyw
            public final int a() {
                return this.X;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return Integer.toString(this.X);
            }
        }

        /* loaded from: classes2.dex */
        public enum zzc implements zzgyw {
            NETWORKTYPE_UNSPECIFIED(0),
            CELL(1),
            WIFI(2);
            
            public static final int Z0 = 0;
            public static final int a1 = 1;
            public static final int b1 = 2;
            public static final zzgyx<zzc> c1 = new zzgyx<zzc>() { // from class: com.google.android.gms.internal.ads.zzbca.zzab.zzc.1
                /* renamed from: a */
                public zzc b(int i) {
                    return zzc.e(i);
                }
            };
            public final int X;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* loaded from: classes2.dex */
            public final class zza implements zzgyy {
                public static final zzgyy a = new zza();

                private zza() {
                }

                @Override // com.google.android.gms.internal.ads.zzgyy
                public boolean u(int i) {
                    if (zzc.e(i) != null) {
                        return true;
                    }
                    return false;
                }
            }

            zzc(int i) {
                this.X = i;
            }

            public static zzc e(int i) {
                if (i != 0) {
                    if (i != 1) {
                        if (i != 2) {
                            return null;
                        }
                        return WIFI;
                    }
                    return CELL;
                }
                return NETWORKTYPE_UNSPECIFIED;
            }

            public static zzgyx<zzc> h() {
                return c1;
            }

            public static zzgyy i() {
                return zza.a;
            }

            @Override // com.google.android.gms.internal.ads.zzgyw
            public final int a() {
                return this.X;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return Integer.toString(this.X);
            }
        }

        static {
            zzab zzabVar = new zzab();
            zzc = zzabVar;
            zzgys.F1(zzab.class, zzabVar);
        }

        private zzab() {
        }

        public static zzab A2(InputStream inputStream, zzgyc zzgycVar) throws IOException {
            return (zzab) zzgys.R1(zzc, inputStream, zzgycVar);
        }

        public static zzab B2(zzgxk zzgxkVar) throws zzgzh {
            return (zzab) zzgys.S1(zzc, zzgxkVar);
        }

        public static zzab C2(zzgxq zzgxqVar) throws IOException {
            return (zzab) zzgys.T1(zzc, zzgxqVar);
        }

        public static zzab D2(InputStream inputStream) throws IOException {
            return (zzab) zzgys.U1(zzc, inputStream);
        }

        public static zzab E2(ByteBuffer byteBuffer) throws zzgzh {
            return (zzab) zzgys.V1(zzc, byteBuffer);
        }

        public static zzab F2(byte[] bArr) throws zzgzh {
            return (zzab) zzgys.W1(zzc, bArr);
        }

        public static zzab G2(zzgxk zzgxkVar, zzgyc zzgycVar) throws zzgzh {
            return (zzab) zzgys.X1(zzc, zzgxkVar, zzgycVar);
        }

        public static zzab H2(zzgxq zzgxqVar, zzgyc zzgycVar) throws IOException {
            return (zzab) zzgys.Y1(zzc, zzgxqVar, zzgycVar);
        }

        public static zzab I2(InputStream inputStream, zzgyc zzgycVar) throws IOException {
            return (zzab) zzgys.Z1(zzc, inputStream, zzgycVar);
        }

        public static zzab J2(ByteBuffer byteBuffer, zzgyc zzgycVar) throws zzgzh {
            return (zzab) zzgys.a2(zzc, byteBuffer, zzgycVar);
        }

        public static zzab K2(byte[] bArr, zzgyc zzgycVar) throws zzgzh {
            return (zzab) zzgys.b2(zzc, bArr, zzgycVar);
        }

        public static zzhal<zzab> L2() {
            return zzc.t1();
        }

        public static zza v2() {
            return (zza) zzc.f1();
        }

        public static zza w2(zzab zzabVar) {
            return (zza) zzc.G1(zzabVar);
        }

        public static zzab y2() {
            return zzc;
        }

        public static zzab z2(InputStream inputStream) throws IOException {
            return (zzab) zzgys.Q1(zzc, inputStream);
        }

        public final void Q2() {
            this.zze &= -3;
            this.zzg = 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbca.zzae
        public zzb d() {
            zzb e = zzb.e(this.zzg);
            if (e == null) {
                return zzb.CELLULAR_NETWORK_TYPE_UNSPECIFIED;
            }
            return e;
        }

        @Override // com.google.android.gms.internal.ads.zzbca.zzae
        public zzc e() {
            zzc e = zzc.e(this.zzf);
            if (e == null) {
                return zzc.NETWORKTYPE_UNSPECIFIED;
            }
            return e;
        }

        @Override // com.google.android.gms.internal.ads.zzbca.zzae
        public boolean g() {
            return (this.zze & 2) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbca.zzae
        public boolean h() {
            return (this.zze & 1) != 0;
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
                                    zzhal<zzab> zzhalVar2 = zzd;
                                    if (zzhalVar2 == null) {
                                        synchronized (zzab.class) {
                                            try {
                                                zzhalVar = zzd;
                                                if (zzhalVar == null) {
                                                    zzhalVar = new zzgyn(zzc);
                                                    zzd = zzhalVar;
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
                            return zzc;
                        }
                        return new zza();
                    }
                    return new zzab();
                }
                return zzgys.w1(zzc, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001", new Object[]{"zze", "zzf", zzc.i(), "zzg", zzb.i()});
            }
            return (byte) 1;
        }

        public final void s2() {
            this.zze &= -2;
            this.zzf = 0;
        }

        public final void t2(zzb zzbVar) {
            this.zzg = zzbVar.a();
            this.zze |= 2;
        }

        public final void u2(zzc zzcVar) {
            this.zzf = zzcVar.a();
            this.zze |= 1;
        }
    }

    /* loaded from: classes2.dex */
    public final class zzac extends zzgys<zzac, zza> implements zzad {
        public static final int zza = 1;
        public static final int zzb = 2;
        private static final zzac zzc;
        private static volatile zzhal<zzac> zzd;
        private int zze;
        private int zzf;
        private zzap zzg;

        /* loaded from: classes2.dex */
        public final class zza extends zzgym<zzac, zza> implements zzad {
            public zza Y1() {
                W1();
                ((zzac) this.Y).t2();
                return this;
            }

            public zza Z1() {
                W1();
                ((zzac) this.Y).u2();
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzad
            public zzq a() {
                return ((zzac) this.Y).a();
            }

            public zza a2(zzap zzapVar) {
                W1();
                ((zzac) this.Y).v2(zzapVar);
                return this;
            }

            public zza b2(zzap.zza zzaVar) {
                W1();
                ((zzac) this.Y).w2(zzaVar.V1());
                return this;
            }

            public zza c2(zzap zzapVar) {
                W1();
                ((zzac) this.Y).w2(zzapVar);
                return this;
            }

            public zza d2(zzq zzqVar) {
                W1();
                ((zzac) this.Y).x2(zzqVar);
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzad
            public zzap h() {
                return ((zzac) this.Y).h();
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzad
            public boolean i() {
                return ((zzac) this.Y).i();
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzad
            public boolean j() {
                return ((zzac) this.Y).j();
            }

            private zza() {
                super(zzac.zzc);
            }
        }

        static {
            zzac zzacVar = new zzac();
            zzc = zzacVar;
            zzgys.F1(zzac.class, zzacVar);
        }

        private zzac() {
        }

        public static zzac B2() {
            return zzc;
        }

        public static zzac C2(InputStream inputStream) throws IOException {
            return (zzac) zzgys.Q1(zzc, inputStream);
        }

        public static zzac D2(InputStream inputStream, zzgyc zzgycVar) throws IOException {
            return (zzac) zzgys.R1(zzc, inputStream, zzgycVar);
        }

        public static zzac E2(zzgxk zzgxkVar) throws zzgzh {
            return (zzac) zzgys.S1(zzc, zzgxkVar);
        }

        public static zzac F2(zzgxq zzgxqVar) throws IOException {
            return (zzac) zzgys.T1(zzc, zzgxqVar);
        }

        public static zzac G2(InputStream inputStream) throws IOException {
            return (zzac) zzgys.U1(zzc, inputStream);
        }

        public static zzac H2(ByteBuffer byteBuffer) throws zzgzh {
            return (zzac) zzgys.V1(zzc, byteBuffer);
        }

        public static zzac I2(byte[] bArr) throws zzgzh {
            return (zzac) zzgys.W1(zzc, bArr);
        }

        public static zzac J2(zzgxk zzgxkVar, zzgyc zzgycVar) throws zzgzh {
            return (zzac) zzgys.X1(zzc, zzgxkVar, zzgycVar);
        }

        public static zzac K2(zzgxq zzgxqVar, zzgyc zzgycVar) throws IOException {
            return (zzac) zzgys.Y1(zzc, zzgxqVar, zzgycVar);
        }

        public static zzac L2(InputStream inputStream, zzgyc zzgycVar) throws IOException {
            return (zzac) zzgys.Z1(zzc, inputStream, zzgycVar);
        }

        public static zzac M2(ByteBuffer byteBuffer, zzgyc zzgycVar) throws zzgzh {
            return (zzac) zzgys.a2(zzc, byteBuffer, zzgycVar);
        }

        public static zzac N2(byte[] bArr, zzgyc zzgycVar) throws zzgzh {
            return (zzac) zzgys.b2(zzc, bArr, zzgycVar);
        }

        public static zzhal<zzac> O2() {
            return zzc.t1();
        }

        public static zza y2() {
            return (zza) zzc.f1();
        }

        public static zza z2(zzac zzacVar) {
            return (zza) zzc.G1(zzacVar);
        }

        @Override // com.google.android.gms.internal.ads.zzbca.zzad
        public zzq a() {
            zzq e = zzq.e(this.zzf);
            if (e == null) {
                return zzq.ENUM_FALSE;
            }
            return e;
        }

        @Override // com.google.android.gms.internal.ads.zzbca.zzad
        public zzap h() {
            zzap zzapVar = this.zzg;
            if (zzapVar == null) {
                return zzap.i();
            }
            return zzapVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbca.zzad
        public boolean i() {
            return (this.zze & 2) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbca.zzad
        public boolean j() {
            return (this.zze & 1) != 0;
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
                                    zzhal<zzac> zzhalVar2 = zzd;
                                    if (zzhalVar2 == null) {
                                        synchronized (zzac.class) {
                                            try {
                                                zzhalVar = zzd;
                                                if (zzhalVar == null) {
                                                    zzhalVar = new zzgyn(zzc);
                                                    zzd = zzhalVar;
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
                            return zzc;
                        }
                        return new zza();
                    }
                    return new zzac();
                }
                return zzgys.w1(zzc, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001", new Object[]{"zze", "zzf", zzq.i(), "zzg"});
            }
            return (byte) 1;
        }

        public final void t2() {
            this.zzg = null;
            this.zze &= -3;
        }

        public final void u2() {
            this.zze &= -2;
            this.zzf = 0;
        }

        public final void v2(zzap zzapVar) {
            zzapVar.getClass();
            zzap zzapVar2 = this.zzg;
            if (zzapVar2 != null && zzapVar2 != zzap.i()) {
                zzap.zza x2 = zzap.x2(zzapVar2);
                x2.M1(zzapVar);
                zzapVar = x2.o3();
            }
            this.zzg = zzapVar;
            this.zze |= 2;
        }

        public final void w2(zzap zzapVar) {
            zzapVar.getClass();
            this.zzg = zzapVar;
            this.zze |= 2;
        }

        public final void x2(zzq zzqVar) {
            this.zzf = zzqVar.a();
            this.zze |= 1;
        }
    }

    /* loaded from: classes2.dex */
    public interface zzad extends zzhae {
        zzq a();

        zzap h();

        boolean i();

        boolean j();
    }

    /* loaded from: classes2.dex */
    public interface zzae extends zzhae {
        zzab.zzb d();

        zzab.zzc e();

        boolean g();

        boolean h();
    }

    /* loaded from: classes2.dex */
    public final class zzaf extends zzgys<zzaf, zzc> implements zzag {
        public static final int zza = 1;
        public static final int zzb = 2;
        public static final int zzc = 3;
        public static final int zzd = 4;
        public static final int zze = 5;
        public static final int zzf = 6;
        public static final int zzg = 7;
        public static final int zzh = 8;
        private static final zzaf zzi;
        private static volatile zzhal<zzaf> zzj;
        private int zzk;
        private int zzm;
        private int zzn;
        private long zzo;
        private long zzv;
        private int zzw;
        private zzgze<zza> zzl = zzgys.q1();
        private String zzp = "";
        private String zzu = "";

        /* loaded from: classes2.dex */
        public final class zza extends zzgys<zza, C0106zza> implements zzb {
            public static final int zza = 1;
            public static final int zzb = 2;
            public static final int zzc = 3;
            public static final int zzd = 4;
            public static final int zze = 5;
            public static final int zzf = 6;
            public static final int zzg = 7;
            public static final int zzh = 8;
            public static final int zzi = 9;
            public static final int zzj = 10;
            public static final int zzk = 11;
            public static final int zzl = 12;
            public static final int zzm = 13;
            private static final zzgzb<zzd.zza> zzn = new zzgzb<zzd.zza>() { // from class: com.google.android.gms.internal.ads.zzbca.zzaf.zza.1
                @Override // com.google.android.gms.internal.ads.zzgzb
                /* renamed from: a */
                public zzd.zza z(int i) {
                    zzd.zza e = zzd.zza.e(i);
                    if (e == null) {
                        return zzd.zza.AD_FORMAT_TYPE_UNSPECIFIED;
                    }
                    return e;
                }
            };
            private static final zza zzo;
            private static volatile zzhal<zza> zzp;
            private zzab zzA;
            private int zzB;
            private int zzC;
            private int zzD;
            private int zzE;
            private int zzF;
            private int zzG;
            private long zzH;
            private int zzu;
            private long zzv;
            private int zzw;
            private long zzx;
            private long zzy;
            private zzgza zzz = zzgys.m1();

            /* renamed from: com.google.android.gms.internal.ads.zzbca$zzaf$zza$zza  reason: collision with other inner class name */
            /* loaded from: classes2.dex */
            public final class C0106zza extends zzgym<zza, C0106zza> implements zzb {
                @Override // com.google.android.gms.internal.ads.zzbca.zzaf.zzb
                public zzd.zza A(int i) {
                    return ((zza) this.Y).A(i);
                }

                public C0106zza A2() {
                    W1();
                    ((zza) this.Y).N2();
                    return this;
                }

                public C0106zza B2() {
                    W1();
                    ((zza) this.Y).O2();
                    return this;
                }

                public C0106zza C2() {
                    W1();
                    ((zza) this.Y).P2();
                    return this;
                }

                public C0106zza D2() {
                    W1();
                    ((zza) this.Y).Q2();
                    return this;
                }

                @Override // com.google.android.gms.internal.ads.zzbca.zzaf.zzb
                public zzd I() {
                    return ((zza) this.Y).I();
                }

                @Override // com.google.android.gms.internal.ads.zzbca.zzaf.zzb
                public boolean V() {
                    return ((zza) this.Y).V();
                }

                @Override // com.google.android.gms.internal.ads.zzbca.zzaf.zzb
                public boolean X() {
                    return ((zza) this.Y).X();
                }

                public C0106zza Y1() {
                    W1();
                    ((zza) this.Y).R2();
                    return this;
                }

                public C0106zza Z1() {
                    W1();
                    ((zza) this.Y).S2();
                    return this;
                }

                @Override // com.google.android.gms.internal.ads.zzbca.zzaf.zzb
                public int a() {
                    return ((zza) this.Y).a();
                }

                @Override // com.google.android.gms.internal.ads.zzbca.zzaf.zzb
                public boolean a0() {
                    return ((zza) this.Y).a0();
                }

                public C0106zza a2(zzab zzabVar) {
                    W1();
                    ((zza) this.Y).q3(zzabVar);
                    return this;
                }

                @Override // com.google.android.gms.internal.ads.zzbca.zzaf.zzb
                public int b() {
                    return ((zza) this.Y).b();
                }

                @Override // com.google.android.gms.internal.ads.zzbca.zzaf.zzb
                public boolean b0() {
                    return ((zza) this.Y).b0();
                }

                public C0106zza b2(zzq zzqVar) {
                    W1();
                    ((zza) this.Y).r3(zzqVar);
                    return this;
                }

                @Override // com.google.android.gms.internal.ads.zzbca.zzaf.zzb
                public long c() {
                    return ((zza) this.Y).c();
                }

                @Override // com.google.android.gms.internal.ads.zzbca.zzaf.zzb
                public boolean c0() {
                    return ((zza) this.Y).c0();
                }

                public C0106zza c2(zzq zzqVar) {
                    W1();
                    ((zza) this.Y).s3(zzqVar);
                    return this;
                }

                @Override // com.google.android.gms.internal.ads.zzbca.zzaf.zzb
                public long d() {
                    return ((zza) this.Y).d();
                }

                public C0106zza d2(int i, zzd.zza zzaVar) {
                    W1();
                    ((zza) this.Y).t3(i, zzaVar);
                    return this;
                }

                @Override // com.google.android.gms.internal.ads.zzbca.zzaf.zzb
                public long e() {
                    return ((zza) this.Y).e();
                }

                @Override // com.google.android.gms.internal.ads.zzbca.zzaf.zzb
                public boolean e0() {
                    return ((zza) this.Y).e0();
                }

                public C0106zza e2(int i) {
                    W1();
                    ((zza) this.Y).u3(i);
                    return this;
                }

                @Override // com.google.android.gms.internal.ads.zzbca.zzaf.zzb
                public long f() {
                    return ((zza) this.Y).f();
                }

                public C0106zza f2(zzd zzdVar) {
                    W1();
                    ((zza) this.Y).v3(zzdVar);
                    return this;
                }

                @Override // com.google.android.gms.internal.ads.zzbca.zzaf.zzb
                public boolean g0() {
                    return ((zza) this.Y).g0();
                }

                public C0106zza g2(zzab.zza zzaVar) {
                    W1();
                    ((zza) this.Y).w3(zzaVar.V1());
                    return this;
                }

                @Override // com.google.android.gms.internal.ads.zzbca.zzaf.zzb
                public zzq h() {
                    return ((zza) this.Y).h();
                }

                public C0106zza h2(zzab zzabVar) {
                    W1();
                    ((zza) this.Y).w3(zzabVar);
                    return this;
                }

                @Override // com.google.android.gms.internal.ads.zzbca.zzaf.zzb
                public zzq i() {
                    return ((zza) this.Y).i();
                }

                @Override // com.google.android.gms.internal.ads.zzbca.zzaf.zzb
                public boolean i0() {
                    return ((zza) this.Y).i0();
                }

                @Override // com.google.android.gms.internal.ads.zzbca.zzaf.zzb
                public zzq j() {
                    return ((zza) this.Y).j();
                }

                public C0106zza j2(zzq zzqVar) {
                    W1();
                    ((zza) this.Y).x3(zzqVar);
                    return this;
                }

                @Override // com.google.android.gms.internal.ads.zzbca.zzaf.zzb
                public zzq k() {
                    return ((zza) this.Y).k();
                }

                public C0106zza k2(long j) {
                    W1();
                    ((zza) this.Y).y3(j);
                    return this;
                }

                @Override // com.google.android.gms.internal.ads.zzbca.zzaf.zzb
                public zzq l() {
                    return ((zza) this.Y).l();
                }

                @Override // com.google.android.gms.internal.ads.zzbca.zzaf.zzb
                public boolean l0() {
                    return ((zza) this.Y).l0();
                }

                @Override // com.google.android.gms.internal.ads.zzbca.zzaf.zzb
                public zzab m() {
                    return ((zza) this.Y).m();
                }

                public C0106zza m2(long j) {
                    W1();
                    ((zza) this.Y).z3(j);
                    return this;
                }

                public C0106zza n2(zzq zzqVar) {
                    W1();
                    ((zza) this.Y).A3(zzqVar);
                    return this;
                }

                public C0106zza o2(long j) {
                    W1();
                    ((zza) this.Y).B3(j);
                    return this;
                }

                public C0106zza p2(long j) {
                    W1();
                    ((zza) this.Y).C3(j);
                    return this;
                }

                public C0106zza q2(zzq zzqVar) {
                    W1();
                    ((zza) this.Y).D3(zzqVar);
                    return this;
                }

                public C0106zza r2(Iterable<? extends zzd.zza> iterable) {
                    W1();
                    ((zza) this.Y).k3(iterable);
                    return this;
                }

                @Override // com.google.android.gms.internal.ads.zzbca.zzaf.zzb
                public List<zzd.zza> s0() {
                    return ((zza) this.Y).s0();
                }

                public C0106zza s2(zzd.zza zzaVar) {
                    W1();
                    ((zza) this.Y).l3(zzaVar);
                    return this;
                }

                public C0106zza t2() {
                    W1();
                    ((zza) this.Y).m3();
                    return this;
                }

                @Override // com.google.android.gms.internal.ads.zzbca.zzaf.zzb
                public boolean u0() {
                    return ((zza) this.Y).u0();
                }

                public C0106zza u2() {
                    W1();
                    ((zza) this.Y).n3();
                    return this;
                }

                public C0106zza v2() {
                    W1();
                    ((zza) this.Y).p3();
                    return this;
                }

                public C0106zza w2() {
                    W1();
                    ((zza) this.Y).J2();
                    return this;
                }

                @Override // com.google.android.gms.internal.ads.zzbca.zzaf.zzb
                public boolean x0() {
                    return ((zza) this.Y).x0();
                }

                public C0106zza x2() {
                    W1();
                    ((zza) this.Y).K2();
                    return this;
                }

                public C0106zza y2() {
                    W1();
                    ((zza) this.Y).L2();
                    return this;
                }

                @Override // com.google.android.gms.internal.ads.zzbca.zzaf.zzb
                public boolean z0() {
                    return ((zza) this.Y).z0();
                }

                public C0106zza z2() {
                    W1();
                    ((zza) this.Y).M2();
                    return this;
                }

                private C0106zza() {
                    super(zza.zzo);
                }
            }

            static {
                zza zzaVar = new zza();
                zzo = zzaVar;
                zzgys.F1(zza.class, zzaVar);
            }

            private zza() {
            }

            public static C0106zza E3() {
                return (C0106zza) zzo.f1();
            }

            public static C0106zza F3(zza zzaVar) {
                return (C0106zza) zzo.G1(zzaVar);
            }

            public static zza H3() {
                return zzo;
            }

            public static zza I3(InputStream inputStream) throws IOException {
                return (zza) zzgys.Q1(zzo, inputStream);
            }

            public static zza J3(InputStream inputStream, zzgyc zzgycVar) throws IOException {
                return (zza) zzgys.R1(zzo, inputStream, zzgycVar);
            }

            public static zza K3(zzgxk zzgxkVar) throws zzgzh {
                return (zza) zzgys.S1(zzo, zzgxkVar);
            }

            public static zza L3(zzgxq zzgxqVar) throws IOException {
                return (zza) zzgys.T1(zzo, zzgxqVar);
            }

            public static zza M3(InputStream inputStream) throws IOException {
                return (zza) zzgys.U1(zzo, inputStream);
            }

            public static zza N3(ByteBuffer byteBuffer) throws zzgzh {
                return (zza) zzgys.V1(zzo, byteBuffer);
            }

            public static zza O3(byte[] bArr) throws zzgzh {
                return (zza) zzgys.W1(zzo, bArr);
            }

            public static zza P3(zzgxk zzgxkVar, zzgyc zzgycVar) throws zzgzh {
                return (zza) zzgys.X1(zzo, zzgxkVar, zzgycVar);
            }

            public static zza Q3(zzgxq zzgxqVar, zzgyc zzgycVar) throws IOException {
                return (zza) zzgys.Y1(zzo, zzgxqVar, zzgycVar);
            }

            public static zza s2(InputStream inputStream, zzgyc zzgycVar) throws IOException {
                return (zza) zzgys.Z1(zzo, inputStream, zzgycVar);
            }

            public static zza t2(ByteBuffer byteBuffer, zzgyc zzgycVar) throws zzgzh {
                return (zza) zzgys.a2(zzo, byteBuffer, zzgycVar);
            }

            public static zza u2(byte[] bArr, zzgyc zzgycVar) throws zzgzh {
                return (zza) zzgys.b2(zzo, bArr, zzgycVar);
            }

            public static zzhal<zza> v2() {
                return zzo.t1();
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzaf.zzb
            public zzd.zza A(int i) {
                zzd.zza e = zzd.zza.e(this.zzz.A0(i));
                if (e == null) {
                    return zzd.zza.AD_FORMAT_TYPE_UNSPECIFIED;
                }
                return e;
            }

            public final void A3(zzq zzqVar) {
                this.zzw = zzqVar.a();
                this.zzu |= 2;
            }

            public final void B3(long j) {
                this.zzu |= 1;
                this.zzv = j;
            }

            public final void C3(long j) {
                this.zzu |= 2048;
                this.zzH = j;
            }

            public final void D3(zzq zzqVar) {
                this.zzB = zzqVar.a();
                this.zzu |= 32;
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzaf.zzb
            public zzd I() {
                zzd e = zzd.e(this.zzG);
                if (e == null) {
                    return zzd.UNSPECIFIED;
                }
                return e;
            }

            public final void J2() {
                this.zzu &= -257;
                this.zzE = 0;
            }

            public final void K2() {
                this.zzu &= -1025;
                this.zzG = 0;
            }

            public final void L2() {
                this.zzA = null;
                this.zzu &= -17;
            }

            public final void M2() {
                this.zzu &= -513;
                this.zzF = 0;
            }

            public final void N2() {
                this.zzu &= -9;
                this.zzy = 0L;
            }

            public final void O2() {
                this.zzu &= -5;
                this.zzx = 0L;
            }

            public final void P2() {
                this.zzu &= -3;
                this.zzw = 0;
            }

            public final void Q2() {
                this.zzu &= -2;
                this.zzv = 0L;
            }

            public final void R2() {
                this.zzu &= -2049;
                this.zzH = 0L;
            }

            public final void S2() {
                this.zzu &= -33;
                this.zzB = 0;
            }

            public final void T2() {
                zzgza zzgzaVar = this.zzz;
                if (!zzgzaVar.c()) {
                    this.zzz = zzgys.n1(zzgzaVar);
                }
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzaf.zzb
            public boolean V() {
                return (this.zzu & 16) != 0;
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzaf.zzb
            public boolean X() {
                return (this.zzu & 128) != 0;
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzaf.zzb
            public int a() {
                return this.zzz.size();
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzaf.zzb
            public boolean a0() {
                return (this.zzu & 1) != 0;
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzaf.zzb
            public int b() {
                return this.zzE;
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzaf.zzb
            public boolean b0() {
                return (this.zzu & 2048) != 0;
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzaf.zzb
            public long c() {
                return this.zzy;
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzaf.zzb
            public boolean c0() {
                return (this.zzu & 4) != 0;
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzaf.zzb
            public long d() {
                return this.zzv;
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzaf.zzb
            public long e() {
                return this.zzH;
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzaf.zzb
            public boolean e0() {
                return (this.zzu & 2) != 0;
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzaf.zzb
            public long f() {
                return this.zzx;
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzaf.zzb
            public boolean g0() {
                return (this.zzu & 32) != 0;
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzaf.zzb
            public zzq h() {
                zzq e = zzq.e(this.zzC);
                if (e == null) {
                    return zzq.ENUM_FALSE;
                }
                return e;
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzaf.zzb
            public zzq i() {
                zzq e = zzq.e(this.zzD);
                if (e == null) {
                    return zzq.ENUM_FALSE;
                }
                return e;
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzaf.zzb
            public boolean i0() {
                return (this.zzu & 256) != 0;
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzaf.zzb
            public zzq j() {
                zzq e = zzq.e(this.zzF);
                if (e == null) {
                    return zzq.ENUM_FALSE;
                }
                return e;
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzaf.zzb
            public zzq k() {
                zzq e = zzq.e(this.zzw);
                if (e == null) {
                    return zzq.ENUM_FALSE;
                }
                return e;
            }

            public final void k3(Iterable<? extends zzd.zza> iterable) {
                T2();
                for (zzd.zza zzaVar : iterable) {
                    this.zzz.N(zzaVar.a());
                }
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzaf.zzb
            public zzq l() {
                zzq e = zzq.e(this.zzB);
                if (e == null) {
                    return zzq.ENUM_FALSE;
                }
                return e;
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzaf.zzb
            public boolean l0() {
                return (this.zzu & 512) != 0;
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
                                        zzhal<zza> zzhalVar2 = zzp;
                                        if (zzhalVar2 == null) {
                                            synchronized (zza.class) {
                                                try {
                                                    zzhalVar = zzp;
                                                    if (zzhalVar == null) {
                                                        zzhalVar = new zzgyn(zzo);
                                                        zzp = zzhalVar;
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
                                return zzo;
                            }
                            return new C0106zza();
                        }
                        return new zza();
                    }
                    return zzgys.w1(zzo, "\u0004\r\u0000\u0001\u0001\r\r\u0000\u0001\u0000\u0001ဂ\u0000\u0002᠌\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ࠞ\u0006ဉ\u0004\u0007᠌\u0005\b᠌\u0006\t᠌\u0007\nင\b\u000b᠌\t\f᠌\n\rဂ\u000b", new Object[]{"zzu", "zzv", "zzw", zzq.i(), "zzx", "zzy", "zzz", zzd.zza.i(), "zzA", "zzB", zzq.i(), "zzC", zzq.i(), "zzD", zzq.i(), "zzE", "zzF", zzq.i(), "zzG", zzd.i(), "zzH"});
                }
                return (byte) 1;
            }

            public final void l3(zzd.zza zzaVar) {
                zzaVar.getClass();
                T2();
                this.zzz.N(zzaVar.a());
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzaf.zzb
            public zzab m() {
                zzab zzabVar = this.zzA;
                if (zzabVar == null) {
                    return zzab.y2();
                }
                return zzabVar;
            }

            public final void m3() {
                this.zzu &= -65;
                this.zzC = 0;
            }

            public final void n3() {
                this.zzu &= -129;
                this.zzD = 0;
            }

            public final void p3() {
                this.zzz = zzgys.m1();
            }

            public final void q3(zzab zzabVar) {
                zzabVar.getClass();
                zzab zzabVar2 = this.zzA;
                if (zzabVar2 != null && zzabVar2 != zzab.y2()) {
                    zzab.zza w2 = zzab.w2(zzabVar2);
                    w2.M1(zzabVar);
                    zzabVar = w2.o3();
                }
                this.zzA = zzabVar;
                this.zzu |= 16;
            }

            public final void r3(zzq zzqVar) {
                this.zzC = zzqVar.a();
                this.zzu |= 64;
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzaf.zzb
            public List<zzd.zza> s0() {
                return new zzgzc(this.zzz, zzn);
            }

            public final void s3(zzq zzqVar) {
                this.zzD = zzqVar.a();
                this.zzu |= 128;
            }

            public final void t3(int i, zzd.zza zzaVar) {
                zzaVar.getClass();
                T2();
                this.zzz.g0(i, zzaVar.a());
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzaf.zzb
            public boolean u0() {
                return (this.zzu & 64) != 0;
            }

            public final void u3(int i) {
                this.zzu |= 256;
                this.zzE = i;
            }

            public final void v3(zzd zzdVar) {
                this.zzG = zzdVar.a();
                this.zzu |= 1024;
            }

            public final void w3(zzab zzabVar) {
                zzabVar.getClass();
                this.zzA = zzabVar;
                this.zzu |= 16;
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzaf.zzb
            public boolean x0() {
                return (this.zzu & 1024) != 0;
            }

            public final void x3(zzq zzqVar) {
                this.zzF = zzqVar.a();
                this.zzu |= 512;
            }

            public final void y3(long j) {
                this.zzu |= 8;
                this.zzy = j;
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzaf.zzb
            public boolean z0() {
                return (this.zzu & 8) != 0;
            }

            public final void z3(long j) {
                this.zzu |= 4;
                this.zzx = j;
            }
        }

        /* loaded from: classes2.dex */
        public interface zzb extends zzhae {
            zzd.zza A(int i);

            zzd I();

            boolean V();

            boolean X();

            int a();

            boolean a0();

            int b();

            boolean b0();

            long c();

            boolean c0();

            long d();

            long e();

            boolean e0();

            long f();

            boolean g0();

            zzq h();

            zzq i();

            boolean i0();

            zzq j();

            zzq k();

            zzq l();

            boolean l0();

            zzab m();

            List<zzd.zza> s0();

            boolean u0();

            boolean x0();

            boolean z0();
        }

        /* loaded from: classes2.dex */
        public final class zzc extends zzgym<zzaf, zzc> implements zzag {
            @Override // com.google.android.gms.internal.ads.zzbca.zzag
            public zza A(int i) {
                return ((zzaf) this.Y).A(i);
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzag
            public String D() {
                return ((zzaf) this.Y).D();
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzag
            public List<zza> G() {
                return Collections.unmodifiableList(((zzaf) this.Y).G());
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzag
            public boolean H() {
                return ((zzaf) this.Y).H();
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzag
            public boolean I() {
                return ((zzaf) this.Y).I();
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzag
            public boolean J() {
                return ((zzaf) this.Y).J();
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzag
            public boolean K() {
                return ((zzaf) this.Y).K();
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzag
            public boolean M() {
                return ((zzaf) this.Y).M();
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzag
            public zzgxk N() {
                return ((zzaf) this.Y).N();
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzag
            public String O() {
                return ((zzaf) this.Y).O();
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzag
            public zzgxk P() {
                return ((zzaf) this.Y).P();
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzag
            public boolean T() {
                return ((zzaf) this.Y).T();
            }

            public zzc Y1(int i) {
                W1();
                ((zzaf) this.Y).G2(i);
                return this;
            }

            public zzc Z1(long j) {
                W1();
                ((zzaf) this.Y).H2(j);
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzag
            public int a() {
                return ((zzaf) this.Y).a();
            }

            public zzc a2(int i, zza.C0106zza c0106zza) {
                W1();
                ((zzaf) this.Y).I2(i, c0106zza.V1());
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzag
            public int b() {
                return ((zzaf) this.Y).b();
            }

            public zzc b2(int i, zza zzaVar) {
                W1();
                ((zzaf) this.Y).I2(i, zzaVar);
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzag
            public int c() {
                return ((zzaf) this.Y).c();
            }

            public zzc c2(int i) {
                W1();
                ((zzaf) this.Y).J2(i);
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzag
            public long d() {
                return ((zzaf) this.Y).d();
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzag
            public boolean d0() {
                return ((zzaf) this.Y).d0();
            }

            public zzc d2(long j) {
                W1();
                ((zzaf) this.Y).K2(j);
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzag
            public long e() {
                return ((zzaf) this.Y).e();
            }

            public zzc e2(Iterable<? extends zza> iterable) {
                W1();
                ((zzaf) this.Y).T2(iterable);
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzag
            public int f() {
                return ((zzaf) this.Y).f();
            }

            public zzc f2(zza.C0106zza c0106zza) {
                W1();
                ((zzaf) this.Y).U2(c0106zza.V1());
                return this;
            }

            public zzc g2(zza zzaVar) {
                W1();
                ((zzaf) this.Y).U2(zzaVar);
                return this;
            }

            public zzc h2(int i, zza.C0106zza c0106zza) {
                W1();
                ((zzaf) this.Y).V2(i, c0106zza.V1());
                return this;
            }

            public zzc j2(int i, zza zzaVar) {
                W1();
                ((zzaf) this.Y).V2(i, zzaVar);
                return this;
            }

            public zzc k2() {
                W1();
                ((zzaf) this.Y).W2();
                return this;
            }

            public zzc m2() {
                W1();
                ((zzaf) this.Y).X2();
                return this;
            }

            public zzc n2() {
                W1();
                ((zzaf) this.Y).Y2();
                return this;
            }

            public zzc o2() {
                W1();
                ((zzaf) this.Y).Z2();
                return this;
            }

            public zzc p2() {
                W1();
                ((zzaf) this.Y).a3();
                return this;
            }

            public zzc q2() {
                W1();
                ((zzaf) this.Y).b3();
                return this;
            }

            public zzc r2() {
                W1();
                ((zzaf) this.Y).c3();
                return this;
            }

            public zzc s2() {
                W1();
                ((zzaf) this.Y).d3();
                return this;
            }

            public zzc t2(int i) {
                W1();
                ((zzaf) this.Y).f3(i);
                return this;
            }

            public zzc u2(String str) {
                W1();
                ((zzaf) this.Y).g3(str);
                return this;
            }

            public zzc v2(zzgxk zzgxkVar) {
                W1();
                ((zzaf) this.Y).h3(zzgxkVar);
                return this;
            }

            public zzc w2(int i) {
                W1();
                ((zzaf) this.Y).i3(i);
                return this;
            }

            public zzc x2(String str) {
                W1();
                ((zzaf) this.Y).j3(str);
                return this;
            }

            public zzc y2(zzgxk zzgxkVar) {
                W1();
                ((zzaf) this.Y).k3(zzgxkVar);
                return this;
            }

            private zzc() {
                super(zzaf.zzi);
            }
        }

        /* loaded from: classes2.dex */
        public enum zzd implements zzgyw {
            UNSPECIFIED(0),
            CONNECTING(1),
            CONNECTED(2),
            DISCONNECTING(3),
            DISCONNECTED(4),
            SUSPENDED(5);
            
            public static final int c1 = 0;
            public static final int d1 = 1;
            public static final int e1 = 2;
            public static final int f1 = 3;
            public static final int g1 = 4;
            public static final int h1 = 5;
            public static final zzgyx<zzd> i1 = new zzgyx<zzd>() { // from class: com.google.android.gms.internal.ads.zzbca.zzaf.zzd.1
                /* renamed from: a */
                public zzd b(int i) {
                    return zzd.e(i);
                }
            };
            public final int X;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* loaded from: classes2.dex */
            public final class zza implements zzgyy {
                public static final zzgyy a = new zza();

                private zza() {
                }

                @Override // com.google.android.gms.internal.ads.zzgyy
                public boolean u(int i) {
                    if (zzd.e(i) != null) {
                        return true;
                    }
                    return false;
                }
            }

            zzd(int i) {
                this.X = i;
            }

            public static zzd e(int i) {
                if (i != 0) {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                if (i != 4) {
                                    if (i != 5) {
                                        return null;
                                    }
                                    return SUSPENDED;
                                }
                                return DISCONNECTED;
                            }
                            return DISCONNECTING;
                        }
                        return CONNECTED;
                    }
                    return CONNECTING;
                }
                return UNSPECIFIED;
            }

            public static zzgyx<zzd> h() {
                return i1;
            }

            public static zzgyy i() {
                return zza.a;
            }

            @Override // com.google.android.gms.internal.ads.zzgyw
            public final int a() {
                return this.X;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return Integer.toString(this.X);
            }
        }

        static {
            zzaf zzafVar = new zzaf();
            zzi = zzafVar;
            zzgys.F1(zzaf.class, zzafVar);
        }

        private zzaf() {
        }

        public static zzaf A3(InputStream inputStream, zzgyc zzgycVar) throws IOException {
            return (zzaf) zzgys.Z1(zzi, inputStream, zzgycVar);
        }

        public static zzaf B3(ByteBuffer byteBuffer, zzgyc zzgycVar) throws zzgzh {
            return (zzaf) zzgys.a2(zzi, byteBuffer, zzgycVar);
        }

        public static zzaf C3(byte[] bArr, zzgyc zzgycVar) throws zzgzh {
            return (zzaf) zzgys.b2(zzi, bArr, zzgycVar);
        }

        public static zzhal<zzaf> D3() {
            return zzi.t1();
        }

        public static zzc m3() {
            return (zzc) zzi.f1();
        }

        public static zzc n3(zzaf zzafVar) {
            return (zzc) zzi.G1(zzafVar);
        }

        public static zzaf q3() {
            return zzi;
        }

        public static zzaf r3(InputStream inputStream) throws IOException {
            return (zzaf) zzgys.Q1(zzi, inputStream);
        }

        public static zzaf s3(InputStream inputStream, zzgyc zzgycVar) throws IOException {
            return (zzaf) zzgys.R1(zzi, inputStream, zzgycVar);
        }

        public static zzaf t3(zzgxk zzgxkVar) throws zzgzh {
            return (zzaf) zzgys.S1(zzi, zzgxkVar);
        }

        public static zzaf u3(zzgxq zzgxqVar) throws IOException {
            return (zzaf) zzgys.T1(zzi, zzgxqVar);
        }

        public static zzaf v3(InputStream inputStream) throws IOException {
            return (zzaf) zzgys.U1(zzi, inputStream);
        }

        public static zzaf w3(ByteBuffer byteBuffer) throws zzgzh {
            return (zzaf) zzgys.V1(zzi, byteBuffer);
        }

        public static zzaf x3(byte[] bArr) throws zzgzh {
            return (zzaf) zzgys.W1(zzi, bArr);
        }

        public static zzaf y3(zzgxk zzgxkVar, zzgyc zzgycVar) throws zzgzh {
            return (zzaf) zzgys.X1(zzi, zzgxkVar, zzgycVar);
        }

        public static zzaf z3(zzgxq zzgxqVar, zzgyc zzgycVar) throws IOException {
            return (zzaf) zzgys.Y1(zzi, zzgxqVar, zzgycVar);
        }

        @Override // com.google.android.gms.internal.ads.zzbca.zzag
        public zza A(int i) {
            return this.zzl.get(i);
        }

        public List<? extends zzb> C() {
            return this.zzl;
        }

        @Override // com.google.android.gms.internal.ads.zzbca.zzag
        public String D() {
            return this.zzp;
        }

        @Override // com.google.android.gms.internal.ads.zzbca.zzag
        public List<zza> G() {
            return this.zzl;
        }

        public final void G2(int i) {
            this.zzk |= 1;
            this.zzm = i;
        }

        @Override // com.google.android.gms.internal.ads.zzbca.zzag
        public boolean H() {
            return (this.zzk & 1) != 0;
        }

        public final void H2(long j) {
            this.zzk |= 32;
            this.zzv = j;
        }

        @Override // com.google.android.gms.internal.ads.zzbca.zzag
        public boolean I() {
            return (this.zzk & 4) != 0;
        }

        public final void I2(int i, zza zzaVar) {
            zzaVar.getClass();
            e3();
            this.zzl.set(i, zzaVar);
        }

        @Override // com.google.android.gms.internal.ads.zzbca.zzag
        public boolean J() {
            return (this.zzk & 8) != 0;
        }

        public final void J2(int i) {
            this.zzk |= 2;
            this.zzn = i;
        }

        @Override // com.google.android.gms.internal.ads.zzbca.zzag
        public boolean K() {
            return (this.zzk & 64) != 0;
        }

        public final void K2(long j) {
            this.zzk |= 4;
            this.zzo = j;
        }

        @Override // com.google.android.gms.internal.ads.zzbca.zzag
        public boolean M() {
            return (this.zzk & 16) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbca.zzag
        public zzgxk N() {
            return zzgxk.V(this.zzp);
        }

        @Override // com.google.android.gms.internal.ads.zzbca.zzag
        public String O() {
            return this.zzu;
        }

        @Override // com.google.android.gms.internal.ads.zzbca.zzag
        public zzgxk P() {
            return zzgxk.V(this.zzu);
        }

        @Override // com.google.android.gms.internal.ads.zzbca.zzag
        public boolean T() {
            return (this.zzk & 32) != 0;
        }

        public final void T2(Iterable<? extends zza> iterable) {
            e3();
            zzgwt.U0(iterable, this.zzl);
        }

        public final void U2(zza zzaVar) {
            zzaVar.getClass();
            e3();
            this.zzl.add(zzaVar);
        }

        public final void V2(int i, zza zzaVar) {
            zzaVar.getClass();
            e3();
            this.zzl.add(i, zzaVar);
        }

        public final void W2() {
            this.zzk &= -9;
            this.zzp = q3().D();
        }

        public final void X2() {
            this.zzk &= -65;
            this.zzw = 0;
        }

        public final void Y2() {
            this.zzk &= -17;
            this.zzu = q3().O();
        }

        public final void Z2() {
            this.zzk &= -2;
            this.zzm = 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbca.zzag
        public int a() {
            return this.zzw;
        }

        public final void a3() {
            this.zzk &= -33;
            this.zzv = 0L;
        }

        @Override // com.google.android.gms.internal.ads.zzbca.zzag
        public int b() {
            return this.zzm;
        }

        public final void b3() {
            this.zzl = zzgys.q1();
        }

        @Override // com.google.android.gms.internal.ads.zzbca.zzag
        public int c() {
            return this.zzl.size();
        }

        public final void c3() {
            this.zzk &= -3;
            this.zzn = 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbca.zzag
        public long d() {
            return this.zzv;
        }

        @Override // com.google.android.gms.internal.ads.zzbca.zzag
        public boolean d0() {
            return (this.zzk & 2) != 0;
        }

        public final void d3() {
            this.zzk &= -5;
            this.zzo = 0L;
        }

        @Override // com.google.android.gms.internal.ads.zzbca.zzag
        public long e() {
            return this.zzo;
        }

        public final void e3() {
            zzgze<zza> zzgzeVar = this.zzl;
            if (!zzgzeVar.c()) {
                this.zzl = zzgys.r1(zzgzeVar);
            }
        }

        @Override // com.google.android.gms.internal.ads.zzbca.zzag
        public int f() {
            return this.zzn;
        }

        public final void f3(int i) {
            e3();
            this.zzl.remove(i);
        }

        public final void g3(String str) {
            str.getClass();
            this.zzk |= 8;
            this.zzp = str;
        }

        public final void h3(zzgxk zzgxkVar) {
            this.zzp = zzgxkVar.X();
            this.zzk |= 8;
        }

        public final void i3(int i) {
            this.zzk |= 64;
            this.zzw = i;
        }

        public final void j3(String str) {
            str.getClass();
            this.zzk |= 16;
            this.zzu = str;
        }

        public final void k3(zzgxk zzgxkVar) {
            this.zzu = zzgxkVar.X();
            this.zzk |= 16;
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
                                    zzhal<zzaf> zzhalVar2 = zzj;
                                    if (zzhalVar2 == null) {
                                        synchronized (zzaf.class) {
                                            try {
                                                zzhalVar = zzj;
                                                if (zzhalVar == null) {
                                                    zzhalVar = new zzgyn(zzi);
                                                    zzj = zzhalVar;
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
                            return zzi;
                        }
                        return new zzc();
                    }
                    return new zzaf();
                }
                return zzgys.w1(zzi, "\u0004\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001\u001b\u0002င\u0000\u0003င\u0001\u0004ဂ\u0002\u0005ဈ\u0003\u0006ဈ\u0004\u0007ဂ\u0005\bင\u0006", new Object[]{"zzk", "zzl", zza.class, "zzm", "zzn", "zzo", "zzp", "zzu", "zzv", "zzw"});
            }
            return (byte) 1;
        }

        public zzb l3(int i) {
            return this.zzl.get(i);
        }
    }

    /* loaded from: classes2.dex */
    public interface zzag extends zzhae {
        zzaf.zza A(int i);

        String D();

        List<zzaf.zza> G();

        boolean H();

        boolean I();

        boolean J();

        boolean K();

        boolean M();

        zzgxk N();

        String O();

        zzgxk P();

        boolean T();

        int a();

        int b();

        int c();

        long d();

        boolean d0();

        long e();

        int f();
    }

    /* loaded from: classes2.dex */
    public final class zzah extends zzgys<zzah, zza> implements zzak {
        public static final int zza = 1;
        public static final int zzb = 2;
        public static final int zzc = 3;
        public static final int zzd = 4;
        public static final int zze = 5;
        public static final int zzf = 6;
        public static final int zzg = 7;
        public static final int zzh = 8;
        public static final int zzi = 9;
        public static final int zzj = 10;
        public static final int zzk = 11;
        private static final zzah zzl;
        private static volatile zzhal<zzah> zzm;
        private int zzA;
        private int zzB;
        private zzai zzC;
        private int zzn;
        private int zzo = 1000;
        private int zzp = 1000;
        private int zzu;
        private int zzv;
        private int zzw;
        private int zzx;
        private int zzy;
        private int zzz;

        /* loaded from: classes2.dex */
        public final class zza extends zzgym<zzah, zza> implements zzak {
            @Override // com.google.android.gms.internal.ads.zzbca.zzak
            public zzai D() {
                return ((zzah) this.Y).D();
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzak
            public boolean G() {
                return ((zzah) this.Y).G();
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzak
            public boolean H() {
                return ((zzah) this.Y).H();
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzak
            public boolean I() {
                return ((zzah) this.Y).I();
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzak
            public boolean J() {
                return ((zzah) this.Y).J();
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzak
            public boolean K() {
                return ((zzah) this.Y).K();
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzak
            public boolean M() {
                return ((zzah) this.Y).M();
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzak
            public boolean O() {
                return ((zzah) this.Y).O();
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzak
            public boolean T() {
                return ((zzah) this.Y).T();
            }

            public zza Y1(int i) {
                W1();
                ((zzah) this.Y).G2(i);
                return this;
            }

            public zza Z1(int i) {
                W1();
                ((zzah) this.Y).H2(i);
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzak
            public int a() {
                return ((zzah) this.Y).a();
            }

            public zza a2(int i) {
                W1();
                ((zzah) this.Y).I2(i);
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzak
            public int b() {
                return ((zzah) this.Y).b();
            }

            public zza b2(zzai.zza zzaVar) {
                W1();
                ((zzah) this.Y).J2(zzaVar.V1());
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzak
            public int c() {
                return ((zzah) this.Y).c();
            }

            public zza c2(zzai zzaiVar) {
                W1();
                ((zzah) this.Y).J2(zzaiVar);
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzak
            public int d() {
                return ((zzah) this.Y).d();
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzak
            public boolean d0() {
                return ((zzah) this.Y).d0();
            }

            public zza d2(int i) {
                W1();
                ((zzah) this.Y).K2(i);
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzak
            public int e() {
                return ((zzah) this.Y).e();
            }

            public zza e2(int i) {
                W1();
                ((zzah) this.Y).L2(i);
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzak
            public int f() {
                return ((zzah) this.Y).f();
            }

            public zza f2(int i) {
                W1();
                ((zzah) this.Y).M2(i);
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzak
            public int g() {
                return ((zzah) this.Y).g();
            }

            public zza g2() {
                W1();
                ((zzah) this.Y).X2();
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzak
            public int h() {
                return ((zzah) this.Y).h();
            }

            public zza h2() {
                W1();
                ((zzah) this.Y).Y2();
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzak
            public zzq i() {
                return ((zzah) this.Y).i();
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzak
            public zzq j() {
                return ((zzah) this.Y).j();
            }

            public zza j2() {
                W1();
                ((zzah) this.Y).Z2();
                return this;
            }

            public zza k2() {
                W1();
                ((zzah) this.Y).a3();
                return this;
            }

            public zza m2() {
                W1();
                ((zzah) this.Y).b3();
                return this;
            }

            public zza n2() {
                W1();
                ((zzah) this.Y).c3();
                return this;
            }

            public zza o2() {
                W1();
                ((zzah) this.Y).d3();
                return this;
            }

            public zza p2() {
                W1();
                ((zzah) this.Y).e3();
                return this;
            }

            public zza q2() {
                W1();
                ((zzah) this.Y).f3();
                return this;
            }

            public zza r2() {
                W1();
                ((zzah) this.Y).g3();
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzak
            public boolean s0() {
                return ((zzah) this.Y).s0();
            }

            public zza s2() {
                W1();
                ((zzah) this.Y).h3();
                return this;
            }

            public zza t2(zzai zzaiVar) {
                W1();
                ((zzah) this.Y).i3(zzaiVar);
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzak
            public boolean u0() {
                return ((zzah) this.Y).u0();
            }

            public zza u2(zzq zzqVar) {
                W1();
                ((zzah) this.Y).j3(zzqVar);
                return this;
            }

            public zza v2(zzq zzqVar) {
                W1();
                ((zzah) this.Y).k3(zzqVar);
                return this;
            }

            public zza w2(int i) {
                W1();
                ((zzah) this.Y).l3(i);
                return this;
            }

            public zza x2(int i) {
                W1();
                ((zzah) this.Y).m3(i);
                return this;
            }

            private zza() {
                super(zzah.zzl);
            }
        }

        static {
            zzah zzahVar = new zzah();
            zzl = zzahVar;
            zzgys.F1(zzah.class, zzahVar);
        }

        private zzah() {
        }

        public static zzah A3(zzgxq zzgxqVar, zzgyc zzgycVar) throws IOException {
            return (zzah) zzgys.Y1(zzl, zzgxqVar, zzgycVar);
        }

        public static zzah B3(InputStream inputStream, zzgyc zzgycVar) throws IOException {
            return (zzah) zzgys.Z1(zzl, inputStream, zzgycVar);
        }

        public static zzah C3(ByteBuffer byteBuffer, zzgyc zzgycVar) throws zzgzh {
            return (zzah) zzgys.a2(zzl, byteBuffer, zzgycVar);
        }

        public static zzah D3(byte[] bArr, zzgyc zzgycVar) throws zzgzh {
            return (zzah) zzgys.b2(zzl, bArr, zzgycVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void G2(int i) {
            this.zzn |= 8;
            this.zzv = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Y2() {
            this.zzn &= -2;
            this.zzo = 1000;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Z2() {
            this.zzn &= -65;
            this.zzy = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a3() {
            this.zzn &= -129;
            this.zzz = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void b3() {
            this.zzn &= -9;
            this.zzv = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void c3() {
            this.zzn &= -513;
            this.zzB = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void d3() {
            this.zzn &= -257;
            this.zzA = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void e3() {
            this.zzC = null;
            this.zzn &= -1025;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void f3() {
            this.zzn &= -5;
            this.zzu = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void g3() {
            this.zzn &= -33;
            this.zzx = 0;
        }

        public static zza n3() {
            return (zza) zzl.f1();
        }

        public static zza p3(zzah zzahVar) {
            return (zza) zzl.G1(zzahVar);
        }

        public static zzah r3() {
            return zzl;
        }

        public static zzhal<zzah> s2() {
            return zzl.t1();
        }

        public static zzah s3(InputStream inputStream) throws IOException {
            return (zzah) zzgys.Q1(zzl, inputStream);
        }

        public static zzah t3(InputStream inputStream, zzgyc zzgycVar) throws IOException {
            return (zzah) zzgys.R1(zzl, inputStream, zzgycVar);
        }

        public static zzah u3(zzgxk zzgxkVar) throws zzgzh {
            return (zzah) zzgys.S1(zzl, zzgxkVar);
        }

        public static zzah v3(zzgxq zzgxqVar) throws IOException {
            return (zzah) zzgys.T1(zzl, zzgxqVar);
        }

        public static zzah w3(InputStream inputStream) throws IOException {
            return (zzah) zzgys.U1(zzl, inputStream);
        }

        public static zzah x3(ByteBuffer byteBuffer) throws zzgzh {
            return (zzah) zzgys.V1(zzl, byteBuffer);
        }

        public static zzah y3(byte[] bArr) throws zzgzh {
            return (zzah) zzgys.W1(zzl, bArr);
        }

        public static zzah z3(zzgxk zzgxkVar, zzgyc zzgycVar) throws zzgzh {
            return (zzah) zzgys.X1(zzl, zzgxkVar, zzgycVar);
        }

        @Override // com.google.android.gms.internal.ads.zzbca.zzak
        public zzai D() {
            zzai zzaiVar = this.zzC;
            if (zzaiVar == null) {
                return zzai.z2();
            }
            return zzaiVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbca.zzak
        public boolean G() {
            return (this.zzn & 1) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbca.zzak
        public boolean H() {
            return (this.zzn & 512) != 0;
        }

        public final void H2(int i) {
            this.zzn |= 512;
            this.zzB = i;
        }

        @Override // com.google.android.gms.internal.ads.zzbca.zzak
        public boolean I() {
            return (this.zzn & 4) != 0;
        }

        public final void I2(int i) {
            this.zzn |= 256;
            this.zzA = i;
        }

        @Override // com.google.android.gms.internal.ads.zzbca.zzak
        public boolean J() {
            return (this.zzn & 64) != 0;
        }

        public final void J2(zzai zzaiVar) {
            zzaiVar.getClass();
            this.zzC = zzaiVar;
            this.zzn |= 1024;
        }

        @Override // com.google.android.gms.internal.ads.zzbca.zzak
        public boolean K() {
            return (this.zzn & 128) != 0;
        }

        public final void K2(int i) {
            this.zzn |= 4;
            this.zzu = i;
        }

        public final void L2(int i) {
            this.zzn |= 32;
            this.zzx = i;
        }

        @Override // com.google.android.gms.internal.ads.zzbca.zzak
        public boolean M() {
            return (this.zzn & 8) != 0;
        }

        public final void M2(int i) {
            this.zzn |= 16;
            this.zzw = i;
        }

        @Override // com.google.android.gms.internal.ads.zzbca.zzak
        public boolean O() {
            return (this.zzn & 2) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbca.zzak
        public boolean T() {
            return (this.zzn & 256) != 0;
        }

        public final void X2() {
            this.zzn &= -3;
            this.zzp = 1000;
        }

        @Override // com.google.android.gms.internal.ads.zzbca.zzak
        public int a() {
            return this.zzy;
        }

        @Override // com.google.android.gms.internal.ads.zzbca.zzak
        public int b() {
            return this.zzz;
        }

        @Override // com.google.android.gms.internal.ads.zzbca.zzak
        public int c() {
            return this.zzv;
        }

        @Override // com.google.android.gms.internal.ads.zzbca.zzak
        public int d() {
            return this.zzA;
        }

        @Override // com.google.android.gms.internal.ads.zzbca.zzak
        public boolean d0() {
            return (this.zzn & 1024) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbca.zzak
        public int e() {
            return this.zzu;
        }

        @Override // com.google.android.gms.internal.ads.zzbca.zzak
        public int f() {
            return this.zzB;
        }

        @Override // com.google.android.gms.internal.ads.zzbca.zzak
        public int g() {
            return this.zzx;
        }

        @Override // com.google.android.gms.internal.ads.zzbca.zzak
        public int h() {
            return this.zzw;
        }

        public final void h3() {
            this.zzn &= -17;
            this.zzw = 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbca.zzak
        public zzq i() {
            zzq e = zzq.e(this.zzp);
            if (e == null) {
                return zzq.ENUM_UNKNOWN;
            }
            return e;
        }

        public final void i3(zzai zzaiVar) {
            zzaiVar.getClass();
            zzai zzaiVar2 = this.zzC;
            if (zzaiVar2 != null && zzaiVar2 != zzai.z2()) {
                zzai.zza x2 = zzai.x2(zzaiVar2);
                x2.M1(zzaiVar);
                zzaiVar = x2.o3();
            }
            this.zzC = zzaiVar;
            this.zzn |= 1024;
        }

        @Override // com.google.android.gms.internal.ads.zzbca.zzak
        public zzq j() {
            zzq e = zzq.e(this.zzo);
            if (e == null) {
                return zzq.ENUM_UNKNOWN;
            }
            return e;
        }

        public final void j3(zzq zzqVar) {
            this.zzp = zzqVar.a();
            this.zzn |= 2;
        }

        public final void k3(zzq zzqVar) {
            this.zzo = zzqVar.a();
            this.zzn |= 1;
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
                                    zzhal<zzah> zzhalVar2 = zzm;
                                    if (zzhalVar2 == null) {
                                        synchronized (zzah.class) {
                                            try {
                                                zzhalVar = zzm;
                                                if (zzhalVar == null) {
                                                    zzhalVar = new zzgyn(zzl);
                                                    zzm = zzhalVar;
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
                            return zzl;
                        }
                        return new zza();
                    }
                    return new zzah();
                }
                return zzgys.w1(zzl, "\u0004\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004\u0006င\u0005\u0007င\u0006\bင\u0007\tင\b\nင\t\u000bဉ\n", new Object[]{"zzn", "zzo", zzq.i(), "zzp", zzq.i(), "zzu", "zzv", "zzw", "zzx", "zzy", "zzz", "zzA", "zzB", "zzC"});
            }
            return (byte) 1;
        }

        public final void l3(int i) {
            this.zzn |= 64;
            this.zzy = i;
        }

        public final void m3(int i) {
            this.zzn |= 128;
            this.zzz = i;
        }

        @Override // com.google.android.gms.internal.ads.zzbca.zzak
        public boolean s0() {
            return (this.zzn & 32) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbca.zzak
        public boolean u0() {
            return (this.zzn & 16) != 0;
        }
    }

    /* loaded from: classes2.dex */
    public final class zzai extends zzgys<zzai, zza> implements zzaj {
        public static final int zza = 1;
        public static final int zzb = 2;
        private static final zzai zzc;
        private static volatile zzhal<zzai> zzd;
        private int zze;
        private int zzf;
        private int zzg;

        /* loaded from: classes2.dex */
        public final class zza extends zzgym<zzai, zza> implements zzaj {
            public zza Y1() {
                W1();
                ((zzai) this.Y).s2();
                return this;
            }

            public zza Z1() {
                W1();
                ((zzai) this.Y).t2();
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzaj
            public int a() {
                return ((zzai) this.Y).a();
            }

            public zza a2(int i) {
                W1();
                ((zzai) this.Y).u2(i);
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzaj
            public int b() {
                return ((zzai) this.Y).b();
            }

            public zza b2(int i) {
                W1();
                ((zzai) this.Y).v2(i);
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzaj
            public boolean g() {
                return ((zzai) this.Y).g();
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzaj
            public boolean h() {
                return ((zzai) this.Y).h();
            }

            private zza() {
                super(zzai.zzc);
            }
        }

        static {
            zzai zzaiVar = new zzai();
            zzc = zzaiVar;
            zzgys.F1(zzai.class, zzaiVar);
        }

        private zzai() {
        }

        public static zzai A2(InputStream inputStream) throws IOException {
            return (zzai) zzgys.Q1(zzc, inputStream);
        }

        public static zzai B2(InputStream inputStream, zzgyc zzgycVar) throws IOException {
            return (zzai) zzgys.R1(zzc, inputStream, zzgycVar);
        }

        public static zzai C2(zzgxk zzgxkVar) throws zzgzh {
            return (zzai) zzgys.S1(zzc, zzgxkVar);
        }

        public static zzai D2(zzgxq zzgxqVar) throws IOException {
            return (zzai) zzgys.T1(zzc, zzgxqVar);
        }

        public static zzai E2(InputStream inputStream) throws IOException {
            return (zzai) zzgys.U1(zzc, inputStream);
        }

        public static zzai F2(ByteBuffer byteBuffer) throws zzgzh {
            return (zzai) zzgys.V1(zzc, byteBuffer);
        }

        public static zzai G2(byte[] bArr) throws zzgzh {
            return (zzai) zzgys.W1(zzc, bArr);
        }

        public static zzai H2(zzgxk zzgxkVar, zzgyc zzgycVar) throws zzgzh {
            return (zzai) zzgys.X1(zzc, zzgxkVar, zzgycVar);
        }

        public static zzai I2(zzgxq zzgxqVar, zzgyc zzgycVar) throws IOException {
            return (zzai) zzgys.Y1(zzc, zzgxqVar, zzgycVar);
        }

        public static zzai J2(InputStream inputStream, zzgyc zzgycVar) throws IOException {
            return (zzai) zzgys.Z1(zzc, inputStream, zzgycVar);
        }

        public static zzai K2(ByteBuffer byteBuffer, zzgyc zzgycVar) throws zzgzh {
            return (zzai) zzgys.a2(zzc, byteBuffer, zzgycVar);
        }

        public static zzai L2(byte[] bArr, zzgyc zzgycVar) throws zzgzh {
            return (zzai) zzgys.b2(zzc, bArr, zzgycVar);
        }

        public static zzhal<zzai> M2() {
            return zzc.t1();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void s2() {
            this.zze &= -2;
            this.zzf = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void t2() {
            this.zze &= -3;
            this.zzg = 0;
        }

        public static zza w2() {
            return (zza) zzc.f1();
        }

        public static zza x2(zzai zzaiVar) {
            return (zza) zzc.G1(zzaiVar);
        }

        public static zzai z2() {
            return zzc;
        }

        @Override // com.google.android.gms.internal.ads.zzbca.zzaj
        public int a() {
            return this.zzf;
        }

        @Override // com.google.android.gms.internal.ads.zzbca.zzaj
        public int b() {
            return this.zzg;
        }

        @Override // com.google.android.gms.internal.ads.zzbca.zzaj
        public boolean g() {
            return (this.zze & 1) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbca.zzaj
        public boolean h() {
            return (this.zze & 2) != 0;
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
                                    zzhal<zzai> zzhalVar2 = zzd;
                                    if (zzhalVar2 == null) {
                                        synchronized (zzai.class) {
                                            try {
                                                zzhalVar = zzd;
                                                if (zzhalVar == null) {
                                                    zzhalVar = new zzgyn(zzc);
                                                    zzd = zzhalVar;
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
                            return zzc;
                        }
                        return new zza();
                    }
                    return new zzai();
                }
                return zzgys.w1(zzc, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001", new Object[]{"zze", "zzf", "zzg"});
            }
            return (byte) 1;
        }

        public final void u2(int i) {
            this.zze |= 1;
            this.zzf = i;
        }

        public final void v2(int i) {
            this.zze |= 2;
            this.zzg = i;
        }
    }

    /* loaded from: classes2.dex */
    public interface zzaj extends zzhae {
        int a();

        int b();

        boolean g();

        boolean h();
    }

    /* loaded from: classes2.dex */
    public interface zzak extends zzhae {
        zzai D();

        boolean G();

        boolean H();

        boolean I();

        boolean J();

        boolean K();

        boolean M();

        boolean O();

        boolean T();

        int a();

        int b();

        int c();

        int d();

        boolean d0();

        int e();

        int f();

        int g();

        int h();

        zzq i();

        zzq j();

        boolean s0();

        boolean u0();
    }

    /* loaded from: classes2.dex */
    public final class zzal extends zzgys<zzal, zza> implements zzam {
        public static final int zza = 1;
        public static final int zzb = 2;
        private static final zzal zzc;
        private static volatile zzhal<zzal> zzd;
        private int zze;
        private int zzf;
        private int zzg;

        /* loaded from: classes2.dex */
        public final class zza extends zzgym<zzal, zza> implements zzam {
            public zza Y1() {
                W1();
                ((zzal) this.Y).s2();
                return this;
            }

            public zza Z1() {
                W1();
                ((zzal) this.Y).t2();
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzam
            public int a() {
                return ((zzal) this.Y).a();
            }

            public zza a2(int i) {
                W1();
                ((zzal) this.Y).u2(i);
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzam
            public int b() {
                return ((zzal) this.Y).b();
            }

            public zza b2(int i) {
                W1();
                ((zzal) this.Y).v2(i);
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzam
            public boolean g() {
                return ((zzal) this.Y).g();
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzam
            public boolean h() {
                return ((zzal) this.Y).h();
            }

            private zza() {
                super(zzal.zzc);
            }
        }

        static {
            zzal zzalVar = new zzal();
            zzc = zzalVar;
            zzgys.F1(zzal.class, zzalVar);
        }

        private zzal() {
        }

        public static zzal A2(InputStream inputStream) throws IOException {
            return (zzal) zzgys.Q1(zzc, inputStream);
        }

        public static zzal B2(InputStream inputStream, zzgyc zzgycVar) throws IOException {
            return (zzal) zzgys.R1(zzc, inputStream, zzgycVar);
        }

        public static zzal C2(zzgxk zzgxkVar) throws zzgzh {
            return (zzal) zzgys.S1(zzc, zzgxkVar);
        }

        public static zzal D2(zzgxq zzgxqVar) throws IOException {
            return (zzal) zzgys.T1(zzc, zzgxqVar);
        }

        public static zzal E2(InputStream inputStream) throws IOException {
            return (zzal) zzgys.U1(zzc, inputStream);
        }

        public static zzal F2(ByteBuffer byteBuffer) throws zzgzh {
            return (zzal) zzgys.V1(zzc, byteBuffer);
        }

        public static zzal G2(byte[] bArr) throws zzgzh {
            return (zzal) zzgys.W1(zzc, bArr);
        }

        public static zzal H2(zzgxk zzgxkVar, zzgyc zzgycVar) throws zzgzh {
            return (zzal) zzgys.X1(zzc, zzgxkVar, zzgycVar);
        }

        public static zzal I2(zzgxq zzgxqVar, zzgyc zzgycVar) throws IOException {
            return (zzal) zzgys.Y1(zzc, zzgxqVar, zzgycVar);
        }

        public static zzal J2(InputStream inputStream, zzgyc zzgycVar) throws IOException {
            return (zzal) zzgys.Z1(zzc, inputStream, zzgycVar);
        }

        public static zzal K2(ByteBuffer byteBuffer, zzgyc zzgycVar) throws zzgzh {
            return (zzal) zzgys.a2(zzc, byteBuffer, zzgycVar);
        }

        public static zzal L2(byte[] bArr, zzgyc zzgycVar) throws zzgzh {
            return (zzal) zzgys.b2(zzc, bArr, zzgycVar);
        }

        public static zzhal<zzal> M2() {
            return zzc.t1();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void s2() {
            this.zze &= -3;
            this.zzg = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void t2() {
            this.zze &= -2;
            this.zzf = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void u2(int i) {
            this.zze |= 2;
            this.zzg = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void v2(int i) {
            this.zze |= 1;
            this.zzf = i;
        }

        public static zza w2() {
            return (zza) zzc.f1();
        }

        public static zza x2(zzal zzalVar) {
            return (zza) zzc.G1(zzalVar);
        }

        public static zzal z2() {
            return zzc;
        }

        @Override // com.google.android.gms.internal.ads.zzbca.zzam
        public int a() {
            return this.zzg;
        }

        @Override // com.google.android.gms.internal.ads.zzbca.zzam
        public int b() {
            return this.zzf;
        }

        @Override // com.google.android.gms.internal.ads.zzbca.zzam
        public boolean g() {
            return (this.zze & 2) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbca.zzam
        public boolean h() {
            return (this.zze & 1) != 0;
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
                                    zzhal<zzal> zzhalVar2 = zzd;
                                    if (zzhalVar2 == null) {
                                        synchronized (zzal.class) {
                                            try {
                                                zzhalVar = zzd;
                                                if (zzhalVar == null) {
                                                    zzhalVar = new zzgyn(zzc);
                                                    zzd = zzhalVar;
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
                            return zzc;
                        }
                        return new zza();
                    }
                    return new zzal();
                }
                return zzgys.w1(zzc, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001", new Object[]{"zze", "zzf", "zzg"});
            }
            return (byte) 1;
        }
    }

    /* loaded from: classes2.dex */
    public interface zzam extends zzhae {
        int a();

        int b();

        boolean g();

        boolean h();
    }

    /* loaded from: classes2.dex */
    public final class zzan extends zzgys<zzan, zza> implements zzao {
        public static final int zza = 1;
        public static final int zzb = 2;
        public static final int zzc = 3;
        private static final zzan zzd;
        private static volatile zzhal<zzan> zze;
        private int zzf;
        private String zzg = "";
        private int zzh;
        private zzap zzi;

        /* loaded from: classes2.dex */
        public final class zza extends zzgym<zzan, zza> implements zzao {
            public zza Y1() {
                W1();
                ((zzan) this.Y).z2();
                return this;
            }

            public zza Z1() {
                W1();
                ((zzan) this.Y).A2();
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzao
            public zzq a() {
                return ((zzan) this.Y).a();
            }

            public zza a2() {
                W1();
                ((zzan) this.Y).B2();
                return this;
            }

            public zza b2(zzap zzapVar) {
                W1();
                ((zzan) this.Y).C2(zzapVar);
                return this;
            }

            public zza c2(String str) {
                W1();
                ((zzan) this.Y).D2(str);
                return this;
            }

            public zza d2(zzgxk zzgxkVar) {
                W1();
                ((zzan) this.Y).E2(zzgxkVar);
                return this;
            }

            public zza e2(zzap.zza zzaVar) {
                W1();
                ((zzan) this.Y).F2(zzaVar.V1());
                return this;
            }

            public zza f2(zzap zzapVar) {
                W1();
                ((zzan) this.Y).F2(zzapVar);
                return this;
            }

            public zza g2(zzq zzqVar) {
                W1();
                ((zzan) this.Y).G2(zzqVar);
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzao
            public zzap k() {
                return ((zzan) this.Y).k();
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzao
            public zzgxk l() {
                return ((zzan) this.Y).l();
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzao
            public String m() {
                return ((zzan) this.Y).m();
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzao
            public boolean n() {
                return ((zzan) this.Y).n();
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzao
            public boolean o() {
                return ((zzan) this.Y).o();
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzao
            public boolean p() {
                return ((zzan) this.Y).p();
            }

            private zza() {
                super(zzan.zzd);
            }
        }

        static {
            zzan zzanVar = new zzan();
            zzd = zzanVar;
            zzgys.F1(zzan.class, zzanVar);
        }

        private zzan() {
        }

        public static zza H2() {
            return (zza) zzd.f1();
        }

        public static zza I2(zzan zzanVar) {
            return (zza) zzd.G1(zzanVar);
        }

        public static zzan K2() {
            return zzd;
        }

        public static zzan L2(InputStream inputStream) throws IOException {
            return (zzan) zzgys.Q1(zzd, inputStream);
        }

        public static zzan M2(InputStream inputStream, zzgyc zzgycVar) throws IOException {
            return (zzan) zzgys.R1(zzd, inputStream, zzgycVar);
        }

        public static zzan N2(zzgxk zzgxkVar) throws zzgzh {
            return (zzan) zzgys.S1(zzd, zzgxkVar);
        }

        public static zzan O2(zzgxq zzgxqVar) throws IOException {
            return (zzan) zzgys.T1(zzd, zzgxqVar);
        }

        public static zzan P2(InputStream inputStream) throws IOException {
            return (zzan) zzgys.U1(zzd, inputStream);
        }

        public static zzan Q2(ByteBuffer byteBuffer) throws zzgzh {
            return (zzan) zzgys.V1(zzd, byteBuffer);
        }

        public static zzan R2(byte[] bArr) throws zzgzh {
            return (zzan) zzgys.W1(zzd, bArr);
        }

        public static zzan S2(zzgxk zzgxkVar, zzgyc zzgycVar) throws zzgzh {
            return (zzan) zzgys.X1(zzd, zzgxkVar, zzgycVar);
        }

        public static zzan T2(zzgxq zzgxqVar, zzgyc zzgycVar) throws IOException {
            return (zzan) zzgys.Y1(zzd, zzgxqVar, zzgycVar);
        }

        public static zzan U2(InputStream inputStream, zzgyc zzgycVar) throws IOException {
            return (zzan) zzgys.Z1(zzd, inputStream, zzgycVar);
        }

        public static zzan V2(ByteBuffer byteBuffer, zzgyc zzgycVar) throws zzgzh {
            return (zzan) zzgys.a2(zzd, byteBuffer, zzgycVar);
        }

        public static zzan W2(byte[] bArr, zzgyc zzgycVar) throws zzgzh {
            return (zzan) zzgys.b2(zzd, bArr, zzgycVar);
        }

        public static zzhal<zzan> X2() {
            return zzd.t1();
        }

        public final void A2() {
            this.zzi = null;
            this.zzf &= -5;
        }

        public final void B2() {
            this.zzf &= -3;
            this.zzh = 0;
        }

        public final void C2(zzap zzapVar) {
            zzapVar.getClass();
            zzap zzapVar2 = this.zzi;
            if (zzapVar2 != null && zzapVar2 != zzap.i()) {
                zzap.zza x2 = zzap.x2(zzapVar2);
                x2.M1(zzapVar);
                zzapVar = x2.o3();
            }
            this.zzi = zzapVar;
            this.zzf |= 4;
        }

        public final void D2(String str) {
            str.getClass();
            this.zzf |= 1;
            this.zzg = str;
        }

        public final void E2(zzgxk zzgxkVar) {
            this.zzg = zzgxkVar.X();
            this.zzf |= 1;
        }

        public final void F2(zzap zzapVar) {
            zzapVar.getClass();
            this.zzi = zzapVar;
            this.zzf |= 4;
        }

        public final void G2(zzq zzqVar) {
            this.zzh = zzqVar.a();
            this.zzf |= 2;
        }

        @Override // com.google.android.gms.internal.ads.zzbca.zzao
        public zzq a() {
            zzq e = zzq.e(this.zzh);
            if (e == null) {
                return zzq.ENUM_FALSE;
            }
            return e;
        }

        @Override // com.google.android.gms.internal.ads.zzbca.zzao
        public zzap k() {
            zzap zzapVar = this.zzi;
            if (zzapVar == null) {
                return zzap.i();
            }
            return zzapVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbca.zzao
        public zzgxk l() {
            return zzgxk.V(this.zzg);
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
                                    zzhal<zzan> zzhalVar2 = zze;
                                    if (zzhalVar2 == null) {
                                        synchronized (zzan.class) {
                                            try {
                                                zzhalVar = zze;
                                                if (zzhalVar == null) {
                                                    zzhalVar = new zzgyn(zzd);
                                                    zze = zzhalVar;
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
                            return zzd;
                        }
                        return new zza();
                    }
                    return new zzan();
                }
                return zzgys.w1(zzd, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002᠌\u0001\u0003ဉ\u0002", new Object[]{"zzf", "zzg", "zzh", zzq.i(), "zzi"});
            }
            return (byte) 1;
        }

        @Override // com.google.android.gms.internal.ads.zzbca.zzao
        public String m() {
            return this.zzg;
        }

        @Override // com.google.android.gms.internal.ads.zzbca.zzao
        public boolean n() {
            return (this.zzf & 1) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbca.zzao
        public boolean o() {
            return (this.zzf & 2) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbca.zzao
        public boolean p() {
            return (this.zzf & 4) != 0;
        }

        public final void z2() {
            this.zzf &= -2;
            this.zzg = K2().m();
        }
    }

    /* loaded from: classes2.dex */
    public interface zzao extends zzhae {
        zzq a();

        zzap k();

        zzgxk l();

        String m();

        boolean n();

        boolean o();

        boolean p();
    }

    /* loaded from: classes2.dex */
    public final class zzap extends zzgys<zzap, zza> implements zzaq {
        public static final int zza = 1;
        public static final int zzb = 2;
        private static final zzap zzc;
        private static volatile zzhal<zzap> zzd;
        private int zze;
        private int zzf;
        private int zzg;

        /* loaded from: classes2.dex */
        public final class zza extends zzgym<zzap, zza> implements zzaq {
            public zza Y1() {
                W1();
                ((zzap) this.Y).s2();
                return this;
            }

            public zza Z1() {
                W1();
                ((zzap) this.Y).t2();
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzaq
            public int a() {
                return ((zzap) this.Y).a();
            }

            public zza a2(int i) {
                W1();
                ((zzap) this.Y).u2(i);
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzaq
            public int b() {
                return ((zzap) this.Y).b();
            }

            public zza b2(int i) {
                W1();
                ((zzap) this.Y).v2(i);
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzaq
            public boolean g() {
                return ((zzap) this.Y).g();
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzaq
            public boolean h() {
                return ((zzap) this.Y).h();
            }

            private zza() {
                super(zzap.zzc);
            }
        }

        static {
            zzap zzapVar = new zzap();
            zzc = zzapVar;
            zzgys.F1(zzap.class, zzapVar);
        }

        private zzap() {
        }

        public static zzap A2(InputStream inputStream, zzgyc zzgycVar) throws IOException {
            return (zzap) zzgys.R1(zzc, inputStream, zzgycVar);
        }

        public static zzap B2(zzgxk zzgxkVar) throws zzgzh {
            return (zzap) zzgys.S1(zzc, zzgxkVar);
        }

        public static zzap C2(zzgxq zzgxqVar) throws IOException {
            return (zzap) zzgys.T1(zzc, zzgxqVar);
        }

        public static zzap D2(InputStream inputStream) throws IOException {
            return (zzap) zzgys.U1(zzc, inputStream);
        }

        public static zzap E2(ByteBuffer byteBuffer) throws zzgzh {
            return (zzap) zzgys.V1(zzc, byteBuffer);
        }

        public static zzap F2(byte[] bArr) throws zzgzh {
            return (zzap) zzgys.W1(zzc, bArr);
        }

        public static zzap G2(zzgxk zzgxkVar, zzgyc zzgycVar) throws zzgzh {
            return (zzap) zzgys.X1(zzc, zzgxkVar, zzgycVar);
        }

        public static zzap H2(zzgxq zzgxqVar, zzgyc zzgycVar) throws IOException {
            return (zzap) zzgys.Y1(zzc, zzgxqVar, zzgycVar);
        }

        public static zzap I2(InputStream inputStream, zzgyc zzgycVar) throws IOException {
            return (zzap) zzgys.Z1(zzc, inputStream, zzgycVar);
        }

        public static zzap J2(ByteBuffer byteBuffer, zzgyc zzgycVar) throws zzgzh {
            return (zzap) zzgys.a2(zzc, byteBuffer, zzgycVar);
        }

        public static zzap K2(byte[] bArr, zzgyc zzgycVar) throws zzgzh {
            return (zzap) zzgys.b2(zzc, bArr, zzgycVar);
        }

        public static zzhal<zzap> L2() {
            return zzc.t1();
        }

        public static zzap i() {
            return zzc;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void s2() {
            this.zze &= -3;
            this.zzg = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void t2() {
            this.zze &= -2;
            this.zzf = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void u2(int i) {
            this.zze |= 2;
            this.zzg = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void v2(int i) {
            this.zze |= 1;
            this.zzf = i;
        }

        public static zza w2() {
            return (zza) zzc.f1();
        }

        public static zza x2(zzap zzapVar) {
            return (zza) zzc.G1(zzapVar);
        }

        public static zzap z2(InputStream inputStream) throws IOException {
            return (zzap) zzgys.Q1(zzc, inputStream);
        }

        @Override // com.google.android.gms.internal.ads.zzbca.zzaq
        public int a() {
            return this.zzg;
        }

        @Override // com.google.android.gms.internal.ads.zzbca.zzaq
        public int b() {
            return this.zzf;
        }

        @Override // com.google.android.gms.internal.ads.zzbca.zzaq
        public boolean g() {
            return (this.zze & 2) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbca.zzaq
        public boolean h() {
            return (this.zze & 1) != 0;
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
                                    zzhal<zzap> zzhalVar2 = zzd;
                                    if (zzhalVar2 == null) {
                                        synchronized (zzap.class) {
                                            try {
                                                zzhalVar = zzd;
                                                if (zzhalVar == null) {
                                                    zzhalVar = new zzgyn(zzc);
                                                    zzd = zzhalVar;
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
                            return zzc;
                        }
                        return new zza();
                    }
                    return new zzap();
                }
                return zzgys.w1(zzc, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001", new Object[]{"zze", "zzf", "zzg"});
            }
            return (byte) 1;
        }
    }

    /* loaded from: classes2.dex */
    public interface zzaq extends zzhae {
        int a();

        int b();

        boolean g();

        boolean h();
    }

    /* loaded from: classes2.dex */
    public final class zzar extends zzgys<zzar, zza> implements zzas {
        public static final int zza = 1;
        public static final int zzb = 2;
        public static final int zzc = 3;
        private static final zzar zzd;
        private static volatile zzhal<zzar> zze;
        private int zzf;
        private int zzg;
        private int zzh;
        private int zzi;

        /* loaded from: classes2.dex */
        public final class zza extends zzgym<zzar, zza> implements zzas {
            public zza Y1() {
                W1();
                ((zzar) this.Y).w2();
                return this;
            }

            public zza Z1() {
                W1();
                ((zzar) this.Y).x2();
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzas
            public int a() {
                return ((zzar) this.Y).a();
            }

            public zza a2() {
                W1();
                ((zzar) this.Y).y2();
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzas
            public int b() {
                return ((zzar) this.Y).b();
            }

            public zza b2(int i) {
                W1();
                ((zzar) this.Y).z2(i);
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzas
            public int c() {
                return ((zzar) this.Y).c();
            }

            public zza c2(int i) {
                W1();
                ((zzar) this.Y).A2(i);
                return this;
            }

            public zza d2(int i) {
                W1();
                ((zzar) this.Y).B2(i);
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzas
            public boolean j() {
                return ((zzar) this.Y).j();
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzas
            public boolean k() {
                return ((zzar) this.Y).k();
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzas
            public boolean l() {
                return ((zzar) this.Y).l();
            }

            private zza() {
                super(zzar.zzd);
            }
        }

        static {
            zzar zzarVar = new zzar();
            zzd = zzarVar;
            zzgys.F1(zzar.class, zzarVar);
        }

        private zzar() {
        }

        public static zza C2() {
            return (zza) zzd.f1();
        }

        public static zza D2(zzar zzarVar) {
            return (zza) zzd.G1(zzarVar);
        }

        public static zzar F2() {
            return zzd;
        }

        public static zzar G2(InputStream inputStream) throws IOException {
            return (zzar) zzgys.Q1(zzd, inputStream);
        }

        public static zzar H2(InputStream inputStream, zzgyc zzgycVar) throws IOException {
            return (zzar) zzgys.R1(zzd, inputStream, zzgycVar);
        }

        public static zzar I2(zzgxk zzgxkVar) throws zzgzh {
            return (zzar) zzgys.S1(zzd, zzgxkVar);
        }

        public static zzar J2(zzgxq zzgxqVar) throws IOException {
            return (zzar) zzgys.T1(zzd, zzgxqVar);
        }

        public static zzar K2(InputStream inputStream) throws IOException {
            return (zzar) zzgys.U1(zzd, inputStream);
        }

        public static zzar L2(ByteBuffer byteBuffer) throws zzgzh {
            return (zzar) zzgys.V1(zzd, byteBuffer);
        }

        public static zzar M2(byte[] bArr) throws zzgzh {
            return (zzar) zzgys.W1(zzd, bArr);
        }

        public static zzar N2(zzgxk zzgxkVar, zzgyc zzgycVar) throws zzgzh {
            return (zzar) zzgys.X1(zzd, zzgxkVar, zzgycVar);
        }

        public static zzar O2(zzgxq zzgxqVar, zzgyc zzgycVar) throws IOException {
            return (zzar) zzgys.Y1(zzd, zzgxqVar, zzgycVar);
        }

        public static zzar P2(InputStream inputStream, zzgyc zzgycVar) throws IOException {
            return (zzar) zzgys.Z1(zzd, inputStream, zzgycVar);
        }

        public static zzar Q2(ByteBuffer byteBuffer, zzgyc zzgycVar) throws zzgzh {
            return (zzar) zzgys.a2(zzd, byteBuffer, zzgycVar);
        }

        public static zzar R2(byte[] bArr, zzgyc zzgycVar) throws zzgzh {
            return (zzar) zzgys.b2(zzd, bArr, zzgycVar);
        }

        public static zzhal<zzar> S2() {
            return zzd.t1();
        }

        public final void A2(int i) {
            this.zzf |= 4;
            this.zzi = i;
        }

        public final void B2(int i) {
            this.zzf |= 2;
            this.zzh = i;
        }

        @Override // com.google.android.gms.internal.ads.zzbca.zzas
        public int a() {
            return this.zzg;
        }

        @Override // com.google.android.gms.internal.ads.zzbca.zzas
        public int b() {
            return this.zzi;
        }

        @Override // com.google.android.gms.internal.ads.zzbca.zzas
        public int c() {
            return this.zzh;
        }

        @Override // com.google.android.gms.internal.ads.zzbca.zzas
        public boolean j() {
            return (this.zzf & 1) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbca.zzas
        public boolean k() {
            return (this.zzf & 4) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbca.zzas
        public boolean l() {
            return (this.zzf & 2) != 0;
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
                                    zzhal<zzar> zzhalVar2 = zze;
                                    if (zzhalVar2 == null) {
                                        synchronized (zzar.class) {
                                            try {
                                                zzhalVar = zze;
                                                if (zzhalVar == null) {
                                                    zzhalVar = new zzgyn(zzd);
                                                    zze = zzhalVar;
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
                            return zzd;
                        }
                        return new zza();
                    }
                    return new zzar();
                }
                return zzgys.w1(zzd, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002", new Object[]{"zzf", "zzg", "zzh", "zzi"});
            }
            return (byte) 1;
        }

        public final void w2() {
            this.zzf &= -2;
            this.zzg = 0;
        }

        public final void x2() {
            this.zzf &= -5;
            this.zzi = 0;
        }

        public final void y2() {
            this.zzf &= -3;
            this.zzh = 0;
        }

        public final void z2(int i) {
            this.zzf |= 1;
            this.zzg = i;
        }
    }

    /* loaded from: classes2.dex */
    public interface zzas extends zzhae {
        int a();

        int b();

        int c();

        boolean j();

        boolean k();

        boolean l();
    }

    /* loaded from: classes2.dex */
    public final class zzat extends zzgys<zzat, zza> implements zzbi {
        public static final int zza = 5;
        public static final int zzb = 6;
        public static final int zzc = 7;
        public static final int zzd = 8;
        public static final int zze = 9;
        public static final int zzf = 10;
        public static final int zzg = 11;
        public static final int zzh = 12;
        public static final int zzi = 13;
        public static final int zzj = 14;
        public static final int zzk = 15;
        public static final int zzl = 16;
        public static final int zzm = 17;
        public static final int zzn = 18;
        public static final int zzo = 19;
        public static final int zzp = 20;
        private static final zzat zzu;
        private static volatile zzhal<zzat> zzv;
        private zzbj zzA;
        private zzau zzB;
        private zzbc zzC;
        private zzay zzD;
        private int zzE;
        private int zzF;
        private zzap zzG;
        private int zzH;
        private int zzI;
        private int zzJ;
        private int zzK;
        private int zzL;
        private long zzM;
        private int zzw;
        private zzba zzx;
        private zzbe zzy;
        private zzbg zzz;

        /* loaded from: classes2.dex */
        public final class zza extends zzgym<zzat, zza> implements zzbi {
            public zza A2(zzap.zza zzaVar) {
                W1();
                ((zzat) this.Y).x3(zzaVar.V1());
                return this;
            }

            public zza B2(zzap zzapVar) {
                W1();
                ((zzat) this.Y).x3(zzapVar);
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzbi
            public boolean C0() {
                return ((zzat) this.Y).C0();
            }

            public zza C2(long j) {
                W1();
                ((zzat) this.Y).y3(j);
                return this;
            }

            public zza D2(zzbj.zza zzaVar) {
                W1();
                ((zzat) this.Y).z3(zzaVar.V1());
                return this;
            }

            public zza E2(zzbj zzbjVar) {
                W1();
                ((zzat) this.Y).z3(zzbjVar);
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzbi
            public boolean F0() {
                return ((zzat) this.Y).F0();
            }

            public zza F2() {
                W1();
                ((zzat) this.Y).A3();
                return this;
            }

            public zza G2() {
                W1();
                ((zzat) this.Y).B3();
                return this;
            }

            public zza H2() {
                W1();
                ((zzat) this.Y).C3();
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzbi
            public boolean I0() {
                return ((zzat) this.Y).I0();
            }

            public zza I2() {
                W1();
                ((zzat) this.Y).D3();
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzbi
            public boolean J0() {
                return ((zzat) this.Y).J0();
            }

            public zza J2() {
                W1();
                ((zzat) this.Y).E3();
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzbi
            public boolean K0() {
                return ((zzat) this.Y).K0();
            }

            public zza K2() {
                W1();
                ((zzat) this.Y).F3();
                return this;
            }

            public zza L2() {
                W1();
                ((zzat) this.Y).G3();
                return this;
            }

            public zza M2() {
                W1();
                ((zzat) this.Y).H3();
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzbi
            public boolean N0() {
                return ((zzat) this.Y).N0();
            }

            public zza N2() {
                W1();
                ((zzat) this.Y).I3();
                return this;
            }

            public zza O2() {
                W1();
                ((zzat) this.Y).J3();
                return this;
            }

            public zza P2() {
                W1();
                ((zzat) this.Y).K3();
                return this;
            }

            public zza Q2() {
                W1();
                ((zzat) this.Y).L3();
                return this;
            }

            public zza R2() {
                W1();
                ((zzat) this.Y).M3();
                return this;
            }

            public zza S2() {
                W1();
                ((zzat) this.Y).N3();
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzbi
            public boolean T0() {
                return ((zzat) this.Y).T0();
            }

            public zza T2() {
                W1();
                ((zzat) this.Y).O3();
                return this;
            }

            public zza U2() {
                W1();
                ((zzat) this.Y).P3();
                return this;
            }

            public zza V2(zzau zzauVar) {
                W1();
                ((zzat) this.Y).Q3(zzauVar);
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzbi
            public zzba W() {
                return ((zzat) this.Y).W();
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzbi
            public zzau Y() {
                return ((zzat) this.Y).Y();
            }

            public zza Y1(zzay zzayVar) {
                W1();
                ((zzat) this.Y).R3(zzayVar);
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzbi
            public boolean Z() {
                return ((zzat) this.Y).Z();
            }

            public zza Z1(zzba zzbaVar) {
                W1();
                ((zzat) this.Y).S3(zzbaVar);
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzbi
            public int a() {
                return ((zzat) this.Y).a();
            }

            public zza a2(zzbc zzbcVar) {
                W1();
                ((zzat) this.Y).T3(zzbcVar);
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzbi
            public int b() {
                return ((zzat) this.Y).b();
            }

            public zza b2(zzbe zzbeVar) {
                W1();
                ((zzat) this.Y).U3(zzbeVar);
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzbi
            public int c() {
                return ((zzat) this.Y).c();
            }

            public zza c2(zzbg zzbgVar) {
                W1();
                ((zzat) this.Y).g3(zzbgVar);
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzbi
            public int d() {
                return ((zzat) this.Y).d();
            }

            public zza d2(zzap zzapVar) {
                W1();
                ((zzat) this.Y).h3(zzapVar);
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzbi
            public int e() {
                return ((zzat) this.Y).e();
            }

            public zza e2(zzbj zzbjVar) {
                W1();
                ((zzat) this.Y).i3(zzbjVar);
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzbi
            public int f() {
                return ((zzat) this.Y).f();
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzbi
            public zzay f0() {
                return ((zzat) this.Y).f0();
            }

            public zza f2(zzau.zza zzaVar) {
                W1();
                ((zzat) this.Y).j3(zzaVar.V1());
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzbi
            public int g() {
                return ((zzat) this.Y).g();
            }

            public zza g2(zzau zzauVar) {
                W1();
                ((zzat) this.Y).j3(zzauVar);
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzbi
            public long h() {
                return ((zzat) this.Y).h();
            }

            public zza h2(zzay.zza zzaVar) {
                W1();
                ((zzat) this.Y).k3(zzaVar.V1());
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzbi
            public zzap i() {
                return ((zzat) this.Y).i();
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzbi
            public zzbj j0() {
                return ((zzat) this.Y).j0();
            }

            public zza j2(zzay zzayVar) {
                W1();
                ((zzat) this.Y).k3(zzayVar);
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzbi
            public zzbe k0() {
                return ((zzat) this.Y).k0();
            }

            public zza k2(zzba.zza zzaVar) {
                W1();
                ((zzat) this.Y).l3(zzaVar.V1());
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzbi
            public zzbc m0() {
                return ((zzat) this.Y).m0();
            }

            public zza m2(zzba zzbaVar) {
                W1();
                ((zzat) this.Y).l3(zzbaVar);
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzbi
            public boolean n0() {
                return ((zzat) this.Y).n0();
            }

            public zza n2(zzbc.zza zzaVar) {
                W1();
                ((zzat) this.Y).m3(zzaVar.V1());
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzbi
            public boolean o0() {
                return ((zzat) this.Y).o0();
            }

            public zza o2(zzbc zzbcVar) {
                W1();
                ((zzat) this.Y).m3(zzbcVar);
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzbi
            public boolean p0() {
                return ((zzat) this.Y).p0();
            }

            public zza p2(zzbe.zza zzaVar) {
                W1();
                ((zzat) this.Y).n3(zzaVar.V1());
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzbi
            public boolean q0() {
                return ((zzat) this.Y).q0();
            }

            public zza q2(zzbe zzbeVar) {
                W1();
                ((zzat) this.Y).n3(zzbeVar);
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzbi
            public boolean r0() {
                return ((zzat) this.Y).r0();
            }

            public zza r2(zzbg.zza zzaVar) {
                W1();
                ((zzat) this.Y).p3(zzaVar.V1());
                return this;
            }

            public zza s2(zzbg zzbgVar) {
                W1();
                ((zzat) this.Y).p3(zzbgVar);
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzbi
            public boolean t0() {
                return ((zzat) this.Y).t0();
            }

            public zza t2(int i) {
                W1();
                ((zzat) this.Y).q3(i);
                return this;
            }

            public zza u2(int i) {
                W1();
                ((zzat) this.Y).r3(i);
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzbi
            public boolean v0() {
                return ((zzat) this.Y).v0();
            }

            public zza v2(int i) {
                W1();
                ((zzat) this.Y).s3(i);
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzbi
            public boolean w0() {
                return ((zzat) this.Y).w0();
            }

            public zza w2(int i) {
                W1();
                ((zzat) this.Y).t3(i);
                return this;
            }

            public zza x2(int i) {
                W1();
                ((zzat) this.Y).u3(i);
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzbi
            public zzbg y0() {
                return ((zzat) this.Y).y0();
            }

            public zza y2(int i) {
                W1();
                ((zzat) this.Y).v3(i);
                return this;
            }

            public zza z2(int i) {
                W1();
                ((zzat) this.Y).w3(i);
                return this;
            }

            private zza() {
                super(zzat.zzu);
            }
        }

        static {
            zzat zzatVar = new zzat();
            zzu = zzatVar;
            zzgys.F1(zzat.class, zzatVar);
        }

        private zzat() {
        }

        public static zza V3() {
            return (zza) zzu.f1();
        }

        public static zza W3(zzat zzatVar) {
            return (zza) zzu.G1(zzatVar);
        }

        public static zzat Y3() {
            return zzu;
        }

        public static zzat Z3(InputStream inputStream) throws IOException {
            return (zzat) zzgys.Q1(zzu, inputStream);
        }

        public static zzat a4(InputStream inputStream, zzgyc zzgycVar) throws IOException {
            return (zzat) zzgys.R1(zzu, inputStream, zzgycVar);
        }

        public static zzat b4(zzgxk zzgxkVar) throws zzgzh {
            return (zzat) zzgys.S1(zzu, zzgxkVar);
        }

        public static zzat c4(zzgxq zzgxqVar) throws IOException {
            return (zzat) zzgys.T1(zzu, zzgxqVar);
        }

        public static zzat d4(InputStream inputStream) throws IOException {
            return (zzat) zzgys.U1(zzu, inputStream);
        }

        public static zzat e4(ByteBuffer byteBuffer) throws zzgzh {
            return (zzat) zzgys.V1(zzu, byteBuffer);
        }

        public static zzat f4(byte[] bArr) throws zzgzh {
            return (zzat) zzgys.W1(zzu, bArr);
        }

        public static zzat g4(zzgxk zzgxkVar, zzgyc zzgycVar) throws zzgzh {
            return (zzat) zzgys.X1(zzu, zzgxkVar, zzgycVar);
        }

        public static zzat h4(zzgxq zzgxqVar, zzgyc zzgycVar) throws IOException {
            return (zzat) zzgys.Y1(zzu, zzgxqVar, zzgycVar);
        }

        public static zzat i4(InputStream inputStream, zzgyc zzgycVar) throws IOException {
            return (zzat) zzgys.Z1(zzu, inputStream, zzgycVar);
        }

        public static zzat j4(ByteBuffer byteBuffer, zzgyc zzgycVar) throws zzgzh {
            return (zzat) zzgys.a2(zzu, byteBuffer, zzgycVar);
        }

        public static zzat k4(byte[] bArr, zzgyc zzgycVar) throws zzgzh {
            return (zzat) zzgys.b2(zzu, bArr, zzgycVar);
        }

        public static zzhal<zzat> l4() {
            return zzu.t1();
        }

        public final void A3() {
            this.zzB = null;
            this.zzw &= -17;
        }

        public final void B3() {
            this.zzD = null;
            this.zzw &= -65;
        }

        @Override // com.google.android.gms.internal.ads.zzbca.zzbi
        public boolean C0() {
            return (this.zzw & 128) != 0;
        }

        public final void C3() {
            this.zzx = null;
            this.zzw &= -2;
        }

        public final void D3() {
            this.zzC = null;
            this.zzw &= -33;
        }

        public final void E3() {
            this.zzy = null;
            this.zzw &= -3;
        }

        @Override // com.google.android.gms.internal.ads.zzbca.zzbi
        public boolean F0() {
            return (this.zzw & 8) != 0;
        }

        public final void F3() {
            this.zzz = null;
            this.zzw &= -5;
        }

        public final void G3() {
            this.zzw &= -8193;
            this.zzK = 0;
        }

        public final void H3() {
            this.zzw &= -16385;
            this.zzL = 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbca.zzbi
        public boolean I0() {
            return (this.zzw & 2048) != 0;
        }

        public final void I3() {
            this.zzw &= -1025;
            this.zzH = 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbca.zzbi
        public boolean J0() {
            return (this.zzw & 512) != 0;
        }

        public final void J3() {
            this.zzw &= -129;
            this.zzE = 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbca.zzbi
        public boolean K0() {
            return (this.zzw & 4096) != 0;
        }

        public final void K3() {
            this.zzw &= -257;
            this.zzF = 0;
        }

        public final void L3() {
            this.zzw &= -2049;
            this.zzI = 0;
        }

        public final void M3() {
            this.zzw &= -4097;
            this.zzJ = 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbca.zzbi
        public boolean N0() {
            return (this.zzw & 256) != 0;
        }

        public final void N3() {
            this.zzG = null;
            this.zzw &= -513;
        }

        public final void O3() {
            this.zzw &= -32769;
            this.zzM = 0L;
        }

        public final void P3() {
            this.zzA = null;
            this.zzw &= -9;
        }

        public final void Q3(zzau zzauVar) {
            zzauVar.getClass();
            zzau zzauVar2 = this.zzB;
            if (zzauVar2 != null && zzauVar2 != zzau.J2()) {
                zzau.zza H2 = zzau.H2(zzauVar2);
                H2.M1(zzauVar);
                zzauVar = H2.o3();
            }
            this.zzB = zzauVar;
            this.zzw |= 16;
        }

        public final void R3(zzay zzayVar) {
            zzayVar.getClass();
            zzay zzayVar2 = this.zzD;
            if (zzayVar2 != null && zzayVar2 != zzay.R2()) {
                zzay.zza P2 = zzay.P2(zzayVar2);
                P2.M1(zzayVar);
                zzayVar = P2.o3();
            }
            this.zzD = zzayVar;
            this.zzw |= 64;
        }

        public final void S3(zzba zzbaVar) {
            zzbaVar.getClass();
            zzba zzbaVar2 = this.zzx;
            if (zzbaVar2 != null && zzbaVar2 != zzba.S2()) {
                zzba.zza Q2 = zzba.Q2(zzbaVar2);
                Q2.M1(zzbaVar);
                zzbaVar = Q2.o3();
            }
            this.zzx = zzbaVar;
            this.zzw |= 1;
        }

        @Override // com.google.android.gms.internal.ads.zzbca.zzbi
        public boolean T0() {
            return (this.zzw & 32768) != 0;
        }

        public final void T3(zzbc zzbcVar) {
            zzbcVar.getClass();
            zzbc zzbcVar2 = this.zzC;
            if (zzbcVar2 != null && zzbcVar2 != zzbc.J2()) {
                zzbc.zza H2 = zzbc.H2(zzbcVar2);
                H2.M1(zzbcVar);
                zzbcVar = H2.o3();
            }
            this.zzC = zzbcVar;
            this.zzw |= 32;
        }

        public final void U3(zzbe zzbeVar) {
            zzbeVar.getClass();
            zzbe zzbeVar2 = this.zzy;
            if (zzbeVar2 != null && zzbeVar2 != zzbe.Y2()) {
                zzbe.zza W2 = zzbe.W2(zzbeVar2);
                W2.M1(zzbeVar);
                zzbeVar = W2.o3();
            }
            this.zzy = zzbeVar;
            this.zzw |= 2;
        }

        @Override // com.google.android.gms.internal.ads.zzbca.zzbi
        public zzba W() {
            zzba zzbaVar = this.zzx;
            if (zzbaVar == null) {
                return zzba.S2();
            }
            return zzbaVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbca.zzbi
        public zzau Y() {
            zzau zzauVar = this.zzB;
            if (zzauVar == null) {
                return zzau.J2();
            }
            return zzauVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbca.zzbi
        public boolean Z() {
            return (this.zzw & 16) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbca.zzbi
        public int a() {
            return this.zzK;
        }

        @Override // com.google.android.gms.internal.ads.zzbca.zzbi
        public int b() {
            return this.zzL;
        }

        @Override // com.google.android.gms.internal.ads.zzbca.zzbi
        public int c() {
            return this.zzH;
        }

        @Override // com.google.android.gms.internal.ads.zzbca.zzbi
        public int d() {
            return this.zzF;
        }

        @Override // com.google.android.gms.internal.ads.zzbca.zzbi
        public int e() {
            return this.zzI;
        }

        @Override // com.google.android.gms.internal.ads.zzbca.zzbi
        public int f() {
            return this.zzE;
        }

        @Override // com.google.android.gms.internal.ads.zzbca.zzbi
        public zzay f0() {
            zzay zzayVar = this.zzD;
            if (zzayVar == null) {
                return zzay.R2();
            }
            return zzayVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbca.zzbi
        public int g() {
            return this.zzJ;
        }

        public final void g3(zzbg zzbgVar) {
            zzbgVar.getClass();
            zzbg zzbgVar2 = this.zzz;
            if (zzbgVar2 != null && zzbgVar2 != zzbg.J2()) {
                zzbg.zza H2 = zzbg.H2(zzbgVar2);
                H2.M1(zzbgVar);
                zzbgVar = H2.o3();
            }
            this.zzz = zzbgVar;
            this.zzw |= 4;
        }

        @Override // com.google.android.gms.internal.ads.zzbca.zzbi
        public long h() {
            return this.zzM;
        }

        public final void h3(zzap zzapVar) {
            zzapVar.getClass();
            zzap zzapVar2 = this.zzG;
            if (zzapVar2 != null && zzapVar2 != zzap.i()) {
                zzap.zza x2 = zzap.x2(zzapVar2);
                x2.M1(zzapVar);
                zzapVar = x2.o3();
            }
            this.zzG = zzapVar;
            this.zzw |= 512;
        }

        @Override // com.google.android.gms.internal.ads.zzbca.zzbi
        public zzap i() {
            zzap zzapVar = this.zzG;
            if (zzapVar == null) {
                return zzap.i();
            }
            return zzapVar;
        }

        public final void i3(zzbj zzbjVar) {
            zzbjVar.getClass();
            zzbj zzbjVar2 = this.zzA;
            if (zzbjVar2 != null && zzbjVar2 != zzbj.B2()) {
                zzbj.zza z2 = zzbj.z2(zzbjVar2);
                z2.M1(zzbjVar);
                zzbjVar = z2.o3();
            }
            this.zzA = zzbjVar;
            this.zzw |= 8;
        }

        @Override // com.google.android.gms.internal.ads.zzbca.zzbi
        public zzbj j0() {
            zzbj zzbjVar = this.zzA;
            if (zzbjVar == null) {
                return zzbj.B2();
            }
            return zzbjVar;
        }

        public final void j3(zzau zzauVar) {
            zzauVar.getClass();
            this.zzB = zzauVar;
            this.zzw |= 16;
        }

        @Override // com.google.android.gms.internal.ads.zzbca.zzbi
        public zzbe k0() {
            zzbe zzbeVar = this.zzy;
            if (zzbeVar == null) {
                return zzbe.Y2();
            }
            return zzbeVar;
        }

        public final void k3(zzay zzayVar) {
            zzayVar.getClass();
            this.zzD = zzayVar;
            this.zzw |= 64;
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
                                    zzhal<zzat> zzhalVar2 = zzv;
                                    if (zzhalVar2 == null) {
                                        synchronized (zzat.class) {
                                            try {
                                                zzhalVar = zzv;
                                                if (zzhalVar == null) {
                                                    zzhalVar = new zzgyn(zzu);
                                                    zzv = zzhalVar;
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
                            return zzu;
                        }
                        return new zza();
                    }
                    return new zzat();
                }
                return zzgys.w1(zzu, "\u0004\u0010\u0000\u0001\u0005\u0014\u0010\u0000\u0000\u0000\u0005ဉ\u0000\u0006ဉ\u0001\u0007ဉ\u0002\bဉ\u0003\tဉ\u0004\nဉ\u0005\u000bဉ\u0006\fင\u0007\rင\b\u000eဉ\t\u000fင\n\u0010င\u000b\u0011င\f\u0012င\r\u0013င\u000e\u0014ဃ\u000f", new Object[]{"zzw", "zzx", "zzy", "zzz", "zzA", "zzB", "zzC", "zzD", "zzE", "zzF", "zzG", "zzH", "zzI", "zzJ", "zzK", "zzL", "zzM"});
            }
            return (byte) 1;
        }

        public final void l3(zzba zzbaVar) {
            zzbaVar.getClass();
            this.zzx = zzbaVar;
            this.zzw |= 1;
        }

        @Override // com.google.android.gms.internal.ads.zzbca.zzbi
        public zzbc m0() {
            zzbc zzbcVar = this.zzC;
            if (zzbcVar == null) {
                return zzbc.J2();
            }
            return zzbcVar;
        }

        public final void m3(zzbc zzbcVar) {
            zzbcVar.getClass();
            this.zzC = zzbcVar;
            this.zzw |= 32;
        }

        @Override // com.google.android.gms.internal.ads.zzbca.zzbi
        public boolean n0() {
            return (this.zzw & 32) != 0;
        }

        public final void n3(zzbe zzbeVar) {
            zzbeVar.getClass();
            this.zzy = zzbeVar;
            this.zzw |= 2;
        }

        @Override // com.google.android.gms.internal.ads.zzbca.zzbi
        public boolean o0() {
            return (this.zzw & 2) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbca.zzbi
        public boolean p0() {
            return (this.zzw & 64) != 0;
        }

        public final void p3(zzbg zzbgVar) {
            zzbgVar.getClass();
            this.zzz = zzbgVar;
            this.zzw |= 4;
        }

        @Override // com.google.android.gms.internal.ads.zzbca.zzbi
        public boolean q0() {
            return (this.zzw & 1) != 0;
        }

        public final void q3(int i) {
            this.zzw |= 8192;
            this.zzK = i;
        }

        @Override // com.google.android.gms.internal.ads.zzbca.zzbi
        public boolean r0() {
            return (this.zzw & 16384) != 0;
        }

        public final void r3(int i) {
            this.zzw |= 16384;
            this.zzL = i;
        }

        public final void s3(int i) {
            this.zzw |= 1024;
            this.zzH = i;
        }

        @Override // com.google.android.gms.internal.ads.zzbca.zzbi
        public boolean t0() {
            return (this.zzw & 1024) != 0;
        }

        public final void t3(int i) {
            this.zzw |= 128;
            this.zzE = i;
        }

        public final void u3(int i) {
            this.zzw |= 256;
            this.zzF = i;
        }

        @Override // com.google.android.gms.internal.ads.zzbca.zzbi
        public boolean v0() {
            return (this.zzw & 4) != 0;
        }

        public final void v3(int i) {
            this.zzw |= 2048;
            this.zzI = i;
        }

        @Override // com.google.android.gms.internal.ads.zzbca.zzbi
        public boolean w0() {
            return (this.zzw & 8192) != 0;
        }

        public final void w3(int i) {
            this.zzw |= 4096;
            this.zzJ = i;
        }

        public final void x3(zzap zzapVar) {
            zzapVar.getClass();
            this.zzG = zzapVar;
            this.zzw |= 512;
        }

        @Override // com.google.android.gms.internal.ads.zzbca.zzbi
        public zzbg y0() {
            zzbg zzbgVar = this.zzz;
            if (zzbgVar == null) {
                return zzbg.J2();
            }
            return zzbgVar;
        }

        public final void y3(long j) {
            this.zzw |= 32768;
            this.zzM = j;
        }

        public final void z3(zzbj zzbjVar) {
            zzbjVar.getClass();
            this.zzA = zzbjVar;
            this.zzw |= 8;
        }
    }

    /* loaded from: classes2.dex */
    public final class zzau extends zzgys<zzau, zza> implements zzav {
        public static final int zza = 1;
        public static final int zzb = 2;
        public static final int zzc = 3;
        private static final zzau zzd;
        private static volatile zzhal<zzau> zze;
        private int zzf;
        private int zzg = 1000;
        private zzaw zzh;
        private zzap zzi;

        /* loaded from: classes2.dex */
        public final class zza extends zzgym<zzau, zza> implements zzav {
            public zza Y1() {
                W1();
                ((zzau) this.Y).y2();
                return this;
            }

            public zza Z1() {
                W1();
                ((zzau) this.Y).z2();
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzav
            public zzq a() {
                return ((zzau) this.Y).a();
            }

            public zza a2() {
                W1();
                ((zzau) this.Y).A2();
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzav
            public zzap b() {
                return ((zzau) this.Y).b();
            }

            public zza b2(zzaw zzawVar) {
                W1();
                ((zzau) this.Y).B2(zzawVar);
                return this;
            }

            public zza c2(zzap zzapVar) {
                W1();
                ((zzau) this.Y).C2(zzapVar);
                return this;
            }

            public zza d2(zzaw.zza zzaVar) {
                W1();
                ((zzau) this.Y).D2(zzaVar.V1());
                return this;
            }

            public zza e2(zzaw zzawVar) {
                W1();
                ((zzau) this.Y).D2(zzawVar);
                return this;
            }

            public zza f2(zzap.zza zzaVar) {
                W1();
                ((zzau) this.Y).E2(zzaVar.V1());
                return this;
            }

            public zza g2(zzap zzapVar) {
                W1();
                ((zzau) this.Y).E2(zzapVar);
                return this;
            }

            public zza h2(zzq zzqVar) {
                W1();
                ((zzau) this.Y).F2(zzqVar);
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzav
            public zzaw m() {
                return ((zzau) this.Y).m();
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzav
            public boolean n() {
                return ((zzau) this.Y).n();
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzav
            public boolean o() {
                return ((zzau) this.Y).o();
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzav
            public boolean p() {
                return ((zzau) this.Y).p();
            }

            private zza() {
                super(zzau.zzd);
            }
        }

        static {
            zzau zzauVar = new zzau();
            zzd = zzauVar;
            zzgys.F1(zzau.class, zzauVar);
        }

        private zzau() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void A2() {
            this.zzf &= -2;
            this.zzg = 1000;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void C2(zzap zzapVar) {
            zzapVar.getClass();
            zzap zzapVar2 = this.zzi;
            if (zzapVar2 != null && zzapVar2 != zzap.i()) {
                zzap.zza x2 = zzap.x2(zzapVar2);
                x2.M1(zzapVar);
                zzapVar = x2.o3();
            }
            this.zzi = zzapVar;
            this.zzf |= 4;
        }

        public static zza G2() {
            return (zza) zzd.f1();
        }

        public static zza H2(zzau zzauVar) {
            return (zza) zzd.G1(zzauVar);
        }

        public static zzau J2() {
            return zzd;
        }

        public static zzau K2(InputStream inputStream) throws IOException {
            return (zzau) zzgys.Q1(zzd, inputStream);
        }

        public static zzau L2(InputStream inputStream, zzgyc zzgycVar) throws IOException {
            return (zzau) zzgys.R1(zzd, inputStream, zzgycVar);
        }

        public static zzau M2(zzgxk zzgxkVar) throws zzgzh {
            return (zzau) zzgys.S1(zzd, zzgxkVar);
        }

        public static zzau N2(zzgxq zzgxqVar) throws IOException {
            return (zzau) zzgys.T1(zzd, zzgxqVar);
        }

        public static zzau O2(InputStream inputStream) throws IOException {
            return (zzau) zzgys.U1(zzd, inputStream);
        }

        public static zzau P2(ByteBuffer byteBuffer) throws zzgzh {
            return (zzau) zzgys.V1(zzd, byteBuffer);
        }

        public static zzau Q2(byte[] bArr) throws zzgzh {
            return (zzau) zzgys.W1(zzd, bArr);
        }

        public static zzau R2(zzgxk zzgxkVar, zzgyc zzgycVar) throws zzgzh {
            return (zzau) zzgys.X1(zzd, zzgxkVar, zzgycVar);
        }

        public static zzau S2(zzgxq zzgxqVar, zzgyc zzgycVar) throws IOException {
            return (zzau) zzgys.Y1(zzd, zzgxqVar, zzgycVar);
        }

        public static zzau T2(InputStream inputStream, zzgyc zzgycVar) throws IOException {
            return (zzau) zzgys.Z1(zzd, inputStream, zzgycVar);
        }

        public static zzau U2(ByteBuffer byteBuffer, zzgyc zzgycVar) throws zzgzh {
            return (zzau) zzgys.a2(zzd, byteBuffer, zzgycVar);
        }

        public static zzau V2(byte[] bArr, zzgyc zzgycVar) throws zzgzh {
            return (zzau) zzgys.b2(zzd, bArr, zzgycVar);
        }

        public static zzhal<zzau> W2() {
            return zzd.t1();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void y2() {
            this.zzh = null;
            this.zzf &= -3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void z2() {
            this.zzi = null;
            this.zzf &= -5;
        }

        public final void B2(zzaw zzawVar) {
            zzawVar.getClass();
            zzaw zzawVar2 = this.zzh;
            if (zzawVar2 != null && zzawVar2 != zzaw.u2()) {
                zzaw.zza t2 = zzaw.t2(zzawVar2);
                t2.M1(zzawVar);
                zzawVar = t2.o3();
            }
            this.zzh = zzawVar;
            this.zzf |= 2;
        }

        public final void D2(zzaw zzawVar) {
            zzawVar.getClass();
            this.zzh = zzawVar;
            this.zzf |= 2;
        }

        public final void E2(zzap zzapVar) {
            zzapVar.getClass();
            this.zzi = zzapVar;
            this.zzf |= 4;
        }

        public final void F2(zzq zzqVar) {
            this.zzg = zzqVar.a();
            this.zzf |= 1;
        }

        @Override // com.google.android.gms.internal.ads.zzbca.zzav
        public zzq a() {
            zzq e = zzq.e(this.zzg);
            if (e == null) {
                return zzq.ENUM_UNKNOWN;
            }
            return e;
        }

        @Override // com.google.android.gms.internal.ads.zzbca.zzav
        public zzap b() {
            zzap zzapVar = this.zzi;
            if (zzapVar == null) {
                return zzap.i();
            }
            return zzapVar;
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
                                    zzhal<zzau> zzhalVar2 = zze;
                                    if (zzhalVar2 == null) {
                                        synchronized (zzau.class) {
                                            try {
                                                zzhalVar = zze;
                                                if (zzhalVar == null) {
                                                    zzhalVar = new zzgyn(zzd);
                                                    zze = zzhalVar;
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
                            return zzd;
                        }
                        return new zza();
                    }
                    return new zzau();
                }
                return zzgys.w1(zzd, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"zzf", "zzg", zzq.i(), "zzh", "zzi"});
            }
            return (byte) 1;
        }

        @Override // com.google.android.gms.internal.ads.zzbca.zzav
        public zzaw m() {
            zzaw zzawVar = this.zzh;
            if (zzawVar == null) {
                return zzaw.u2();
            }
            return zzawVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbca.zzav
        public boolean n() {
            return (this.zzf & 2) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbca.zzav
        public boolean o() {
            return (this.zzf & 1) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbca.zzav
        public boolean p() {
            return (this.zzf & 4) != 0;
        }
    }

    /* loaded from: classes2.dex */
    public interface zzav extends zzhae {
        zzq a();

        zzap b();

        zzaw m();

        boolean n();

        boolean o();

        boolean p();
    }

    /* loaded from: classes2.dex */
    public final class zzaw extends zzgys<zzaw, zza> implements zzax {
        public static final int zza = 1;
        private static final zzaw zzb;
        private static volatile zzhal<zzaw> zzc;
        private int zzd;
        private int zze;

        /* loaded from: classes2.dex */
        public final class zza extends zzgym<zzaw, zza> implements zzax {
            public zza Y1() {
                W1();
                ((zzaw) this.Y).K2();
                return this;
            }

            public zza Z1(zzb zzbVar) {
                W1();
                ((zzaw) this.Y).L2(zzbVar);
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzax
            public zzb c() {
                return ((zzaw) this.Y).c();
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzax
            public boolean f() {
                return ((zzaw) this.Y).f();
            }

            private zza() {
                super(zzaw.zzb);
            }
        }

        /* loaded from: classes2.dex */
        public enum zzb implements zzgyw {
            VIDEO_ERROR_CODE_UNSPECIFIED(0),
            OPENGL_RENDERING_FAILED(1),
            CACHE_LOAD_FAILED(2),
            ANDROID_TARGET_API_TOO_LOW(3);
            
            public static final int a1 = 0;
            public static final int b1 = 1;
            public static final int c1 = 2;
            public static final int d1 = 3;
            public static final zzgyx<zzb> e1 = new zzgyx<zzb>() { // from class: com.google.android.gms.internal.ads.zzbca.zzaw.zzb.1
                /* renamed from: a */
                public zzb b(int i) {
                    return zzb.e(i);
                }
            };
            public final int X;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* loaded from: classes2.dex */
            public final class zza implements zzgyy {
                public static final zzgyy a = new zza();

                private zza() {
                }

                @Override // com.google.android.gms.internal.ads.zzgyy
                public boolean u(int i) {
                    if (zzb.e(i) != null) {
                        return true;
                    }
                    return false;
                }
            }

            zzb(int i) {
                this.X = i;
            }

            public static zzb e(int i) {
                if (i != 0) {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                return null;
                            }
                            return ANDROID_TARGET_API_TOO_LOW;
                        }
                        return CACHE_LOAD_FAILED;
                    }
                    return OPENGL_RENDERING_FAILED;
                }
                return VIDEO_ERROR_CODE_UNSPECIFIED;
            }

            public static zzgyx<zzb> h() {
                return e1;
            }

            public static zzgyy i() {
                return zza.a;
            }

            @Override // com.google.android.gms.internal.ads.zzgyw
            public final int a() {
                return this.X;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return Integer.toString(this.X);
            }
        }

        static {
            zzaw zzawVar = new zzaw();
            zzb = zzawVar;
            zzgys.F1(zzaw.class, zzawVar);
        }

        private zzaw() {
        }

        public static zzaw A2(ByteBuffer byteBuffer) throws zzgzh {
            return (zzaw) zzgys.V1(zzb, byteBuffer);
        }

        public static zzaw B2(byte[] bArr) throws zzgzh {
            return (zzaw) zzgys.W1(zzb, bArr);
        }

        public static zzaw C2(zzgxk zzgxkVar, zzgyc zzgycVar) throws zzgzh {
            return (zzaw) zzgys.X1(zzb, zzgxkVar, zzgycVar);
        }

        public static zzaw D2(zzgxq zzgxqVar, zzgyc zzgycVar) throws IOException {
            return (zzaw) zzgys.Y1(zzb, zzgxqVar, zzgycVar);
        }

        public static zzaw E2(InputStream inputStream, zzgyc zzgycVar) throws IOException {
            return (zzaw) zzgys.Z1(zzb, inputStream, zzgycVar);
        }

        public static zzaw F2(ByteBuffer byteBuffer, zzgyc zzgycVar) throws zzgzh {
            return (zzaw) zzgys.a2(zzb, byteBuffer, zzgycVar);
        }

        public static zzaw G2(byte[] bArr, zzgyc zzgycVar) throws zzgzh {
            return (zzaw) zzgys.b2(zzb, bArr, zzgycVar);
        }

        public static zzhal<zzaw> H2() {
            return zzb.t1();
        }

        public static zza s2() {
            return (zza) zzb.f1();
        }

        public static zza t2(zzaw zzawVar) {
            return (zza) zzb.G1(zzawVar);
        }

        public static zzaw u2() {
            return zzb;
        }

        public static zzaw v2(InputStream inputStream) throws IOException {
            return (zzaw) zzgys.Q1(zzb, inputStream);
        }

        public static zzaw w2(InputStream inputStream, zzgyc zzgycVar) throws IOException {
            return (zzaw) zzgys.R1(zzb, inputStream, zzgycVar);
        }

        public static zzaw x2(zzgxk zzgxkVar) throws zzgzh {
            return (zzaw) zzgys.S1(zzb, zzgxkVar);
        }

        public static zzaw y2(zzgxq zzgxqVar) throws IOException {
            return (zzaw) zzgys.T1(zzb, zzgxqVar);
        }

        public static zzaw z2(InputStream inputStream) throws IOException {
            return (zzaw) zzgys.U1(zzb, inputStream);
        }

        public final void K2() {
            this.zzd &= -2;
            this.zze = 0;
        }

        public final void L2(zzb zzbVar) {
            this.zze = zzbVar.a();
            this.zzd |= 1;
        }

        @Override // com.google.android.gms.internal.ads.zzbca.zzax
        public zzb c() {
            zzb e = zzb.e(this.zze);
            if (e == null) {
                return zzb.VIDEO_ERROR_CODE_UNSPECIFIED;
            }
            return e;
        }

        @Override // com.google.android.gms.internal.ads.zzbca.zzax
        public boolean f() {
            return (this.zzd & 1) != 0;
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
                                    zzhal<zzaw> zzhalVar2 = zzc;
                                    if (zzhalVar2 == null) {
                                        synchronized (zzaw.class) {
                                            try {
                                                zzhalVar = zzc;
                                                if (zzhalVar == null) {
                                                    zzhalVar = new zzgyn(zzb);
                                                    zzc = zzhalVar;
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
                            return zzb;
                        }
                        return new zza();
                    }
                    return new zzaw();
                }
                return zzgys.w1(zzb, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"zzd", "zze", zzb.i()});
            }
            return (byte) 1;
        }
    }

    /* loaded from: classes2.dex */
    public interface zzax extends zzhae {
        zzaw.zzb c();

        boolean f();
    }

    /* loaded from: classes2.dex */
    public final class zzay extends zzgys<zzay, zza> implements zzaz {
        public static final int zza = 1;
        public static final int zzb = 2;
        public static final int zzc = 3;
        public static final int zzd = 4;
        private static final zzay zze;
        private static volatile zzhal<zzay> zzf;
        private int zzg;
        private zzar zzh;
        private int zzi = 1000;
        private zzaw zzj;
        private zzap zzk;

        /* loaded from: classes2.dex */
        public final class zza extends zzgym<zzay, zza> implements zzaz {
            public zza Y1() {
                W1();
                ((zzay) this.Y).D2();
                return this;
            }

            public zza Z1() {
                W1();
                ((zzay) this.Y).E2();
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzaz
            public zzq a() {
                return ((zzay) this.Y).a();
            }

            public zza a2() {
                W1();
                ((zzay) this.Y).F2();
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzaz
            public zzap b() {
                return ((zzay) this.Y).b();
            }

            public zza b2() {
                W1();
                ((zzay) this.Y).G2();
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzaz
            public zzar c() {
                return ((zzay) this.Y).c();
            }

            public zza c2(zzaw zzawVar) {
                W1();
                ((zzay) this.Y).H2(zzawVar);
                return this;
            }

            public zza d2(zzap zzapVar) {
                W1();
                ((zzay) this.Y).I2(zzapVar);
                return this;
            }

            public zza e2(zzar zzarVar) {
                W1();
                ((zzay) this.Y).J2(zzarVar);
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzaz
            public zzaw f() {
                return ((zzay) this.Y).f();
            }

            public zza f2(zzaw.zza zzaVar) {
                W1();
                ((zzay) this.Y).K2(zzaVar.V1());
                return this;
            }

            public zza g2(zzaw zzawVar) {
                W1();
                ((zzay) this.Y).K2(zzawVar);
                return this;
            }

            public zza h2(zzap.zza zzaVar) {
                W1();
                ((zzay) this.Y).L2(zzaVar.V1());
                return this;
            }

            public zza j2(zzap zzapVar) {
                W1();
                ((zzay) this.Y).L2(zzapVar);
                return this;
            }

            public zza k2(zzq zzqVar) {
                W1();
                ((zzay) this.Y).M2(zzqVar);
                return this;
            }

            public zza m2(zzar.zza zzaVar) {
                W1();
                ((zzay) this.Y).N2(zzaVar.V1());
                return this;
            }

            public zza n2(zzar zzarVar) {
                W1();
                ((zzay) this.Y).N2(zzarVar);
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzaz
            public boolean q() {
                return ((zzay) this.Y).q();
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzaz
            public boolean s() {
                return ((zzay) this.Y).s();
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzaz
            public boolean t() {
                return ((zzay) this.Y).t();
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzaz
            public boolean v() {
                return ((zzay) this.Y).v();
            }

            private zza() {
                super(zzay.zze);
            }
        }

        static {
            zzay zzayVar = new zzay();
            zze = zzayVar;
            zzgys.F1(zzay.class, zzayVar);
        }

        private zzay() {
        }

        public static zza O2() {
            return (zza) zze.f1();
        }

        public static zza P2(zzay zzayVar) {
            return (zza) zze.G1(zzayVar);
        }

        public static zzay R2() {
            return zze;
        }

        public static zzay S2(InputStream inputStream) throws IOException {
            return (zzay) zzgys.Q1(zze, inputStream);
        }

        public static zzay T2(InputStream inputStream, zzgyc zzgycVar) throws IOException {
            return (zzay) zzgys.R1(zze, inputStream, zzgycVar);
        }

        public static zzay U2(zzgxk zzgxkVar) throws zzgzh {
            return (zzay) zzgys.S1(zze, zzgxkVar);
        }

        public static zzay V2(zzgxq zzgxqVar) throws IOException {
            return (zzay) zzgys.T1(zze, zzgxqVar);
        }

        public static zzay W2(InputStream inputStream) throws IOException {
            return (zzay) zzgys.U1(zze, inputStream);
        }

        public static zzay X2(ByteBuffer byteBuffer) throws zzgzh {
            return (zzay) zzgys.V1(zze, byteBuffer);
        }

        public static zzay Y2(byte[] bArr) throws zzgzh {
            return (zzay) zzgys.W1(zze, bArr);
        }

        public static zzay Z2(zzgxk zzgxkVar, zzgyc zzgycVar) throws zzgzh {
            return (zzay) zzgys.X1(zze, zzgxkVar, zzgycVar);
        }

        public static zzay a3(zzgxq zzgxqVar, zzgyc zzgycVar) throws IOException {
            return (zzay) zzgys.Y1(zze, zzgxqVar, zzgycVar);
        }

        public static zzay b3(InputStream inputStream, zzgyc zzgycVar) throws IOException {
            return (zzay) zzgys.Z1(zze, inputStream, zzgycVar);
        }

        public static zzay c3(ByteBuffer byteBuffer, zzgyc zzgycVar) throws zzgzh {
            return (zzay) zzgys.a2(zze, byteBuffer, zzgycVar);
        }

        public static zzay d3(byte[] bArr, zzgyc zzgycVar) throws zzgzh {
            return (zzay) zzgys.b2(zze, bArr, zzgycVar);
        }

        public static zzhal<zzay> e3() {
            return zze.t1();
        }

        public final void D2() {
            this.zzj = null;
            this.zzg &= -5;
        }

        public final void E2() {
            this.zzk = null;
            this.zzg &= -9;
        }

        public final void F2() {
            this.zzg &= -3;
            this.zzi = 1000;
        }

        public final void G2() {
            this.zzh = null;
            this.zzg &= -2;
        }

        public final void H2(zzaw zzawVar) {
            zzawVar.getClass();
            zzaw zzawVar2 = this.zzj;
            if (zzawVar2 != null && zzawVar2 != zzaw.u2()) {
                zzaw.zza t2 = zzaw.t2(zzawVar2);
                t2.M1(zzawVar);
                zzawVar = t2.o3();
            }
            this.zzj = zzawVar;
            this.zzg |= 4;
        }

        public final void I2(zzap zzapVar) {
            zzapVar.getClass();
            zzap zzapVar2 = this.zzk;
            if (zzapVar2 != null && zzapVar2 != zzap.i()) {
                zzap.zza x2 = zzap.x2(zzapVar2);
                x2.M1(zzapVar);
                zzapVar = x2.o3();
            }
            this.zzk = zzapVar;
            this.zzg |= 8;
        }

        public final void J2(zzar zzarVar) {
            zzarVar.getClass();
            zzar zzarVar2 = this.zzh;
            if (zzarVar2 != null && zzarVar2 != zzar.F2()) {
                zzar.zza D2 = zzar.D2(zzarVar2);
                D2.M1(zzarVar);
                zzarVar = D2.o3();
            }
            this.zzh = zzarVar;
            this.zzg |= 1;
        }

        public final void K2(zzaw zzawVar) {
            zzawVar.getClass();
            this.zzj = zzawVar;
            this.zzg |= 4;
        }

        public final void L2(zzap zzapVar) {
            zzapVar.getClass();
            this.zzk = zzapVar;
            this.zzg |= 8;
        }

        public final void M2(zzq zzqVar) {
            this.zzi = zzqVar.a();
            this.zzg |= 2;
        }

        public final void N2(zzar zzarVar) {
            zzarVar.getClass();
            this.zzh = zzarVar;
            this.zzg |= 1;
        }

        @Override // com.google.android.gms.internal.ads.zzbca.zzaz
        public zzq a() {
            zzq e = zzq.e(this.zzi);
            if (e == null) {
                return zzq.ENUM_UNKNOWN;
            }
            return e;
        }

        @Override // com.google.android.gms.internal.ads.zzbca.zzaz
        public zzap b() {
            zzap zzapVar = this.zzk;
            if (zzapVar == null) {
                return zzap.i();
            }
            return zzapVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbca.zzaz
        public zzar c() {
            zzar zzarVar = this.zzh;
            if (zzarVar == null) {
                return zzar.F2();
            }
            return zzarVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbca.zzaz
        public zzaw f() {
            zzaw zzawVar = this.zzj;
            if (zzawVar == null) {
                return zzaw.u2();
            }
            return zzawVar;
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
                                    zzhal<zzay> zzhalVar2 = zzf;
                                    if (zzhalVar2 == null) {
                                        synchronized (zzay.class) {
                                            try {
                                                zzhalVar = zzf;
                                                if (zzhalVar == null) {
                                                    zzhalVar = new zzgyn(zze);
                                                    zzf = zzhalVar;
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
                            return zze;
                        }
                        return new zza();
                    }
                    return new zzay();
                }
                return zzgys.w1(zze, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002᠌\u0001\u0003ဉ\u0002\u0004ဉ\u0003", new Object[]{"zzg", "zzh", "zzi", zzq.i(), "zzj", "zzk"});
            }
            return (byte) 1;
        }

        @Override // com.google.android.gms.internal.ads.zzbca.zzaz
        public boolean q() {
            return (this.zzg & 1) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbca.zzaz
        public boolean s() {
            return (this.zzg & 4) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbca.zzaz
        public boolean t() {
            return (this.zzg & 2) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbca.zzaz
        public boolean v() {
            return (this.zzg & 8) != 0;
        }
    }

    /* loaded from: classes2.dex */
    public interface zzaz extends zzhae {
        zzq a();

        zzap b();

        zzar c();

        zzaw f();

        boolean q();

        boolean s();

        boolean t();

        boolean v();
    }

    /* loaded from: classes2.dex */
    public final class zzb extends zzgys<zzb, zzc> implements zzc {
        public static final int zza = 1;
        private static final zzb zzb;
        private static volatile zzhal<zzb> zzc;
        private zzgze<zza> zzd = zzgys.q1();

        /* loaded from: classes2.dex */
        public final class zza extends zzgys<zza, C0107zza> implements InterfaceC0108zzb {
            public static final int zza = 1;
            public static final int zzb = 2;
            public static final int zzc = 3;
            private static final zza zzd;
            private static volatile zzhal<zza> zze;
            private int zzf;
            private int zzg;
            private zze zzh;
            private zzg zzi;

            /* renamed from: com.google.android.gms.internal.ads.zzbca$zzb$zza$zza  reason: collision with other inner class name */
            /* loaded from: classes2.dex */
            public final class C0107zza extends zzgym<zza, C0107zza> implements InterfaceC0108zzb {
                public C0107zza Y1() {
                    W1();
                    ((zza) this.Y).y2();
                    return this;
                }

                public C0107zza Z1() {
                    W1();
                    ((zza) this.Y).z2();
                    return this;
                }

                public C0107zza a2() {
                    W1();
                    ((zza) this.Y).A2();
                    return this;
                }

                public C0107zza b2(zze zzeVar) {
                    W1();
                    ((zza) this.Y).B2(zzeVar);
                    return this;
                }

                public C0107zza c2(zzg zzgVar) {
                    W1();
                    ((zza) this.Y).C2(zzgVar);
                    return this;
                }

                public C0107zza d2(zzd zzdVar) {
                    W1();
                    ((zza) this.Y).D2(zzdVar);
                    return this;
                }

                public C0107zza e2(zze.zza zzaVar) {
                    W1();
                    ((zza) this.Y).E2(zzaVar.V1());
                    return this;
                }

                public C0107zza f2(zze zzeVar) {
                    W1();
                    ((zza) this.Y).E2(zzeVar);
                    return this;
                }

                public C0107zza g2(zzg.zza zzaVar) {
                    W1();
                    ((zza) this.Y).F2(zzaVar.V1());
                    return this;
                }

                public C0107zza h2(zzg zzgVar) {
                    W1();
                    ((zza) this.Y).F2(zzgVar);
                    return this;
                }

                @Override // com.google.android.gms.internal.ads.zzbca.zzb.InterfaceC0108zzb
                public zzd k() {
                    return ((zza) this.Y).k();
                }

                @Override // com.google.android.gms.internal.ads.zzbca.zzb.InterfaceC0108zzb
                public zze l() {
                    return ((zza) this.Y).l();
                }

                @Override // com.google.android.gms.internal.ads.zzbca.zzb.InterfaceC0108zzb
                public zzg m() {
                    return ((zza) this.Y).m();
                }

                @Override // com.google.android.gms.internal.ads.zzbca.zzb.InterfaceC0108zzb
                public boolean n() {
                    return ((zza) this.Y).n();
                }

                @Override // com.google.android.gms.internal.ads.zzbca.zzb.InterfaceC0108zzb
                public boolean o() {
                    return ((zza) this.Y).o();
                }

                @Override // com.google.android.gms.internal.ads.zzbca.zzb.InterfaceC0108zzb
                public boolean p() {
                    return ((zza) this.Y).p();
                }

                private C0107zza() {
                    super(zza.zzd);
                }
            }

            static {
                zza zzaVar = new zza();
                zzd = zzaVar;
                zzgys.F1(zza.class, zzaVar);
            }

            private zza() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void A2() {
                this.zzi = null;
                this.zzf &= -5;
            }

            public static C0107zza G2() {
                return (C0107zza) zzd.f1();
            }

            public static C0107zza H2(zza zzaVar) {
                return (C0107zza) zzd.G1(zzaVar);
            }

            public static zza J2() {
                return zzd;
            }

            public static zza K2(InputStream inputStream) throws IOException {
                return (zza) zzgys.Q1(zzd, inputStream);
            }

            public static zza L2(InputStream inputStream, zzgyc zzgycVar) throws IOException {
                return (zza) zzgys.R1(zzd, inputStream, zzgycVar);
            }

            public static zza M2(zzgxk zzgxkVar) throws zzgzh {
                return (zza) zzgys.S1(zzd, zzgxkVar);
            }

            public static zza N2(zzgxq zzgxqVar) throws IOException {
                return (zza) zzgys.T1(zzd, zzgxqVar);
            }

            public static zza O2(InputStream inputStream) throws IOException {
                return (zza) zzgys.U1(zzd, inputStream);
            }

            public static zza P2(ByteBuffer byteBuffer) throws zzgzh {
                return (zza) zzgys.V1(zzd, byteBuffer);
            }

            public static zza Q2(byte[] bArr) throws zzgzh {
                return (zza) zzgys.W1(zzd, bArr);
            }

            public static zza R2(zzgxk zzgxkVar, zzgyc zzgycVar) throws zzgzh {
                return (zza) zzgys.X1(zzd, zzgxkVar, zzgycVar);
            }

            public static zza S2(zzgxq zzgxqVar, zzgyc zzgycVar) throws IOException {
                return (zza) zzgys.Y1(zzd, zzgxqVar, zzgycVar);
            }

            public static zza T2(InputStream inputStream, zzgyc zzgycVar) throws IOException {
                return (zza) zzgys.Z1(zzd, inputStream, zzgycVar);
            }

            public static zza U2(ByteBuffer byteBuffer, zzgyc zzgycVar) throws zzgzh {
                return (zza) zzgys.a2(zzd, byteBuffer, zzgycVar);
            }

            public static zza V2(byte[] bArr, zzgyc zzgycVar) throws zzgzh {
                return (zza) zzgys.b2(zzd, bArr, zzgycVar);
            }

            public static zzhal<zza> W2() {
                return zzd.t1();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void y2() {
                this.zzf &= -2;
                this.zzg = 0;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void z2() {
                this.zzh = null;
                this.zzf &= -3;
            }

            public final void B2(zze zzeVar) {
                zzeVar.getClass();
                zze zzeVar2 = this.zzh;
                if (zzeVar2 != null && zzeVar2 != zze.z2()) {
                    zze.zza x2 = zze.x2(zzeVar2);
                    x2.M1(zzeVar);
                    zzeVar = x2.o3();
                }
                this.zzh = zzeVar;
                this.zzf |= 2;
            }

            public final void C2(zzg zzgVar) {
                zzgVar.getClass();
                zzg zzgVar2 = this.zzi;
                if (zzgVar2 != null && zzgVar2 != zzg.F2()) {
                    zzg.zza D2 = zzg.D2(zzgVar2);
                    D2.M1(zzgVar);
                    zzgVar = D2.o3();
                }
                this.zzi = zzgVar;
                this.zzf |= 4;
            }

            public final void D2(zzd zzdVar) {
                this.zzg = zzdVar.a();
                this.zzf |= 1;
            }

            public final void E2(zze zzeVar) {
                zzeVar.getClass();
                this.zzh = zzeVar;
                this.zzf |= 2;
            }

            public final void F2(zzg zzgVar) {
                zzgVar.getClass();
                this.zzi = zzgVar;
                this.zzf |= 4;
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzb.InterfaceC0108zzb
            public zzd k() {
                zzd e = zzd.e(this.zzg);
                if (e == null) {
                    return zzd.UNSPECIFIED;
                }
                return e;
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzb.InterfaceC0108zzb
            public zze l() {
                zze zzeVar = this.zzh;
                if (zzeVar == null) {
                    return zze.z2();
                }
                return zzeVar;
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
                                        zzhal<zza> zzhalVar2 = zze;
                                        if (zzhalVar2 == null) {
                                            synchronized (zza.class) {
                                                try {
                                                    zzhalVar = zze;
                                                    if (zzhalVar == null) {
                                                        zzhalVar = new zzgyn(zzd);
                                                        zze = zzhalVar;
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
                                return zzd;
                            }
                            return new C0107zza();
                        }
                        return new zza();
                    }
                    return zzgys.w1(zzd, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"zzf", "zzg", zzd.i(), "zzh", "zzi"});
                }
                return (byte) 1;
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzb.InterfaceC0108zzb
            public zzg m() {
                zzg zzgVar = this.zzi;
                if (zzgVar == null) {
                    return zzg.F2();
                }
                return zzgVar;
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzb.InterfaceC0108zzb
            public boolean n() {
                return (this.zzf & 1) != 0;
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzb.InterfaceC0108zzb
            public boolean o() {
                return (this.zzf & 4) != 0;
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzb.InterfaceC0108zzb
            public boolean p() {
                return (this.zzf & 2) != 0;
            }
        }

        /* renamed from: com.google.android.gms.internal.ads.zzbca$zzb$zzb  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public interface InterfaceC0108zzb extends zzhae {
            zzd k();

            zze l();

            zzg m();

            boolean n();

            boolean o();

            boolean p();
        }

        /* loaded from: classes2.dex */
        public final class zzc extends zzgym<zzb, zzc> implements zzc {
            public zzc Y1(Iterable<? extends zza> iterable) {
                W1();
                ((zzb) this.Y).v2(iterable);
                return this;
            }

            public zzc Z1(zza.C0107zza c0107zza) {
                W1();
                ((zzb) this.Y).w2(c0107zza.V1());
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzc
            public int a() {
                return ((zzb) this.Y).a();
            }

            public zzc a2(zza zzaVar) {
                W1();
                ((zzb) this.Y).w2(zzaVar);
                return this;
            }

            public zzc b2(int i, zza.C0107zza c0107zza) {
                W1();
                ((zzb) this.Y).x2(i, c0107zza.V1());
                return this;
            }

            public zzc c2(int i, zza zzaVar) {
                W1();
                ((zzb) this.Y).x2(i, zzaVar);
                return this;
            }

            public zzc d2() {
                W1();
                ((zzb) this.Y).y2();
                return this;
            }

            public zzc e2(int i) {
                W1();
                ((zzb) this.Y).A2(i);
                return this;
            }

            public zzc f2(int i, zza.C0107zza c0107zza) {
                W1();
                ((zzb) this.Y).B2(i, c0107zza.V1());
                return this;
            }

            public zzc g2(int i, zza zzaVar) {
                W1();
                ((zzb) this.Y).B2(i, zzaVar);
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzc
            public List<zza> l() {
                return Collections.unmodifiableList(((zzb) this.Y).l());
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzc
            public zza z(int i) {
                return ((zzb) this.Y).z(i);
            }

            private zzc() {
                super(zzb.zzb);
            }
        }

        /* loaded from: classes2.dex */
        public enum zzd implements zzgyw {
            UNSPECIFIED(0),
            IN_MEMORY(1);
            
            public static final int Y0 = 0;
            public static final int Z0 = 1;
            public static final zzgyx<zzd> a1 = new zzgyx<zzd>() { // from class: com.google.android.gms.internal.ads.zzbca.zzb.zzd.1
                /* renamed from: a */
                public zzd b(int i) {
                    return zzd.e(i);
                }
            };
            public final int X;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* loaded from: classes2.dex */
            public final class zza implements zzgyy {
                public static final zzgyy a = new zza();

                private zza() {
                }

                @Override // com.google.android.gms.internal.ads.zzgyy
                public boolean u(int i) {
                    if (zzd.e(i) != null) {
                        return true;
                    }
                    return false;
                }
            }

            zzd(int i) {
                this.X = i;
            }

            public static zzd e(int i) {
                if (i != 0) {
                    if (i != 1) {
                        return null;
                    }
                    return IN_MEMORY;
                }
                return UNSPECIFIED;
            }

            public static zzgyx<zzd> h() {
                return a1;
            }

            public static zzgyy i() {
                return zza.a;
            }

            @Override // com.google.android.gms.internal.ads.zzgyw
            public final int a() {
                return this.X;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return Integer.toString(this.X);
            }
        }

        /* loaded from: classes2.dex */
        public final class zze extends zzgys<zze, zza> implements zzf {
            public static final int zza = 1;
            public static final int zzb = 2;
            private static final zze zzc;
            private static volatile zzhal<zze> zzd;
            private int zze;
            private boolean zzf;
            private int zzg;

            /* loaded from: classes2.dex */
            public final class zza extends zzgym<zze, zza> implements zzf {
                public zza Y1() {
                    W1();
                    ((zze) this.Y).s2();
                    return this;
                }

                public zza Z1() {
                    W1();
                    ((zze) this.Y).t2();
                    return this;
                }

                @Override // com.google.android.gms.internal.ads.zzbca.zzb.zzf
                public int a() {
                    return ((zze) this.Y).a();
                }

                public zza a2(boolean z) {
                    W1();
                    ((zze) this.Y).u2(z);
                    return this;
                }

                public zza b2(int i) {
                    W1();
                    ((zze) this.Y).v2(i);
                    return this;
                }

                @Override // com.google.android.gms.internal.ads.zzbca.zzb.zzf
                public boolean e() {
                    return ((zze) this.Y).e();
                }

                @Override // com.google.android.gms.internal.ads.zzbca.zzb.zzf
                public boolean g() {
                    return ((zze) this.Y).g();
                }

                @Override // com.google.android.gms.internal.ads.zzbca.zzb.zzf
                public boolean h() {
                    return ((zze) this.Y).h();
                }

                private zza() {
                    super(zze.zzc);
                }
            }

            static {
                zze zzeVar = new zze();
                zzc = zzeVar;
                zzgys.F1(zze.class, zzeVar);
            }

            private zze() {
            }

            public static zze A2(InputStream inputStream) throws IOException {
                return (zze) zzgys.Q1(zzc, inputStream);
            }

            public static zze B2(InputStream inputStream, zzgyc zzgycVar) throws IOException {
                return (zze) zzgys.R1(zzc, inputStream, zzgycVar);
            }

            public static zze C2(zzgxk zzgxkVar) throws zzgzh {
                return (zze) zzgys.S1(zzc, zzgxkVar);
            }

            public static zze D2(zzgxq zzgxqVar) throws IOException {
                return (zze) zzgys.T1(zzc, zzgxqVar);
            }

            public static zze E2(InputStream inputStream) throws IOException {
                return (zze) zzgys.U1(zzc, inputStream);
            }

            public static zze F2(ByteBuffer byteBuffer) throws zzgzh {
                return (zze) zzgys.V1(zzc, byteBuffer);
            }

            public static zze G2(byte[] bArr) throws zzgzh {
                return (zze) zzgys.W1(zzc, bArr);
            }

            public static zze H2(zzgxk zzgxkVar, zzgyc zzgycVar) throws zzgzh {
                return (zze) zzgys.X1(zzc, zzgxkVar, zzgycVar);
            }

            public static zze I2(zzgxq zzgxqVar, zzgyc zzgycVar) throws IOException {
                return (zze) zzgys.Y1(zzc, zzgxqVar, zzgycVar);
            }

            public static zze J2(InputStream inputStream, zzgyc zzgycVar) throws IOException {
                return (zze) zzgys.Z1(zzc, inputStream, zzgycVar);
            }

            public static zze K2(ByteBuffer byteBuffer, zzgyc zzgycVar) throws zzgzh {
                return (zze) zzgys.a2(zzc, byteBuffer, zzgycVar);
            }

            public static zze L2(byte[] bArr, zzgyc zzgycVar) throws zzgzh {
                return (zze) zzgys.b2(zzc, bArr, zzgycVar);
            }

            public static zzhal<zze> M2() {
                return zzc.t1();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void s2() {
                this.zze &= -2;
                this.zzf = false;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void t2() {
                this.zze &= -3;
                this.zzg = 0;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void v2(int i) {
                this.zze |= 2;
                this.zzg = i;
            }

            public static zza w2() {
                return (zza) zzc.f1();
            }

            public static zza x2(zze zzeVar) {
                return (zza) zzc.G1(zzeVar);
            }

            public static zze z2() {
                return zzc;
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzb.zzf
            public int a() {
                return this.zzg;
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzb.zzf
            public boolean e() {
                return this.zzf;
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzb.zzf
            public boolean g() {
                return (this.zze & 1) != 0;
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzb.zzf
            public boolean h() {
                return (this.zze & 2) != 0;
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
                                        zzhal<zze> zzhalVar2 = zzd;
                                        if (zzhalVar2 == null) {
                                            synchronized (zze.class) {
                                                try {
                                                    zzhalVar = zzd;
                                                    if (zzhalVar == null) {
                                                        zzhalVar = new zzgyn(zzc);
                                                        zzd = zzhalVar;
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
                                return zzc;
                            }
                            return new zza();
                        }
                        return new zze();
                    }
                    return zzgys.w1(zzc, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဋ\u0001", new Object[]{"zze", "zzf", "zzg"});
                }
                return (byte) 1;
            }

            public final void u2(boolean z) {
                this.zze |= 1;
                this.zzf = z;
            }
        }

        /* loaded from: classes2.dex */
        public interface zzf extends zzhae {
            int a();

            boolean e();

            boolean g();

            boolean h();
        }

        /* loaded from: classes2.dex */
        public final class zzg extends zzgys<zzg, zza> implements zzh {
            public static final int zza = 1;
            public static final int zzb = 2;
            public static final int zzc = 3;
            private static final zzg zzd;
            private static volatile zzhal<zzg> zze;
            private int zzf;
            private boolean zzg;
            private boolean zzh;
            private int zzi;

            /* loaded from: classes2.dex */
            public final class zza extends zzgym<zzg, zza> implements zzh {
                public zza Y1() {
                    W1();
                    ((zzg) this.Y).w2();
                    return this;
                }

                public zza Z1() {
                    W1();
                    ((zzg) this.Y).x2();
                    return this;
                }

                @Override // com.google.android.gms.internal.ads.zzbca.zzb.zzh
                public int a() {
                    return ((zzg) this.Y).a();
                }

                public zza a2() {
                    W1();
                    ((zzg) this.Y).y2();
                    return this;
                }

                public zza b2(boolean z) {
                    W1();
                    ((zzg) this.Y).z2(z);
                    return this;
                }

                public zza c2(boolean z) {
                    W1();
                    ((zzg) this.Y).A2(z);
                    return this;
                }

                public zza d2(int i) {
                    W1();
                    ((zzg) this.Y).B2(i);
                    return this;
                }

                @Override // com.google.android.gms.internal.ads.zzbca.zzb.zzh
                public boolean h() {
                    return ((zzg) this.Y).h();
                }

                @Override // com.google.android.gms.internal.ads.zzbca.zzb.zzh
                public boolean i() {
                    return ((zzg) this.Y).i();
                }

                @Override // com.google.android.gms.internal.ads.zzbca.zzb.zzh
                public boolean j() {
                    return ((zzg) this.Y).j();
                }

                @Override // com.google.android.gms.internal.ads.zzbca.zzb.zzh
                public boolean k() {
                    return ((zzg) this.Y).k();
                }

                @Override // com.google.android.gms.internal.ads.zzbca.zzb.zzh
                public boolean l() {
                    return ((zzg) this.Y).l();
                }

                private zza() {
                    super(zzg.zzd);
                }
            }

            static {
                zzg zzgVar = new zzg();
                zzd = zzgVar;
                zzgys.F1(zzg.class, zzgVar);
            }

            private zzg() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void B2(int i) {
                this.zzf |= 4;
                this.zzi = i;
            }

            public static zza C2() {
                return (zza) zzd.f1();
            }

            public static zza D2(zzg zzgVar) {
                return (zza) zzd.G1(zzgVar);
            }

            public static zzg F2() {
                return zzd;
            }

            public static zzg G2(InputStream inputStream) throws IOException {
                return (zzg) zzgys.Q1(zzd, inputStream);
            }

            public static zzg H2(InputStream inputStream, zzgyc zzgycVar) throws IOException {
                return (zzg) zzgys.R1(zzd, inputStream, zzgycVar);
            }

            public static zzg I2(zzgxk zzgxkVar) throws zzgzh {
                return (zzg) zzgys.S1(zzd, zzgxkVar);
            }

            public static zzg J2(zzgxq zzgxqVar) throws IOException {
                return (zzg) zzgys.T1(zzd, zzgxqVar);
            }

            public static zzg K2(InputStream inputStream) throws IOException {
                return (zzg) zzgys.U1(zzd, inputStream);
            }

            public static zzg L2(ByteBuffer byteBuffer) throws zzgzh {
                return (zzg) zzgys.V1(zzd, byteBuffer);
            }

            public static zzg M2(byte[] bArr) throws zzgzh {
                return (zzg) zzgys.W1(zzd, bArr);
            }

            public static zzg N2(zzgxk zzgxkVar, zzgyc zzgycVar) throws zzgzh {
                return (zzg) zzgys.X1(zzd, zzgxkVar, zzgycVar);
            }

            public static zzg O2(zzgxq zzgxqVar, zzgyc zzgycVar) throws IOException {
                return (zzg) zzgys.Y1(zzd, zzgxqVar, zzgycVar);
            }

            public static zzg P2(InputStream inputStream, zzgyc zzgycVar) throws IOException {
                return (zzg) zzgys.Z1(zzd, inputStream, zzgycVar);
            }

            public static zzg Q2(ByteBuffer byteBuffer, zzgyc zzgycVar) throws zzgzh {
                return (zzg) zzgys.a2(zzd, byteBuffer, zzgycVar);
            }

            public static zzg R2(byte[] bArr, zzgyc zzgycVar) throws zzgzh {
                return (zzg) zzgys.b2(zzd, bArr, zzgycVar);
            }

            public static zzhal<zzg> S2() {
                return zzd.t1();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void w2() {
                this.zzf &= -2;
                this.zzg = false;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void x2() {
                this.zzf &= -3;
                this.zzh = false;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void y2() {
                this.zzf &= -5;
                this.zzi = 0;
            }

            public final void A2(boolean z) {
                this.zzf |= 2;
                this.zzh = z;
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzb.zzh
            public int a() {
                return this.zzi;
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzb.zzh
            public boolean h() {
                return this.zzg;
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzb.zzh
            public boolean i() {
                return this.zzh;
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzb.zzh
            public boolean j() {
                return (this.zzf & 1) != 0;
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzb.zzh
            public boolean k() {
                return (this.zzf & 2) != 0;
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzb.zzh
            public boolean l() {
                return (this.zzf & 4) != 0;
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
                                        zzhal<zzg> zzhalVar2 = zze;
                                        if (zzhalVar2 == null) {
                                            synchronized (zzg.class) {
                                                try {
                                                    zzhalVar = zze;
                                                    if (zzhalVar == null) {
                                                        zzhalVar = new zzgyn(zzd);
                                                        zze = zzhalVar;
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
                                return zzd;
                            }
                            return new zza();
                        }
                        return new zzg();
                    }
                    return zzgys.w1(zzd, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဋ\u0002", new Object[]{"zzf", "zzg", "zzh", "zzi"});
                }
                return (byte) 1;
            }

            public final void z2(boolean z) {
                this.zzf |= 1;
                this.zzg = z;
            }
        }

        /* loaded from: classes2.dex */
        public interface zzh extends zzhae {
            int a();

            boolean h();

            boolean i();

            boolean j();

            boolean k();

            boolean l();
        }

        static {
            zzb zzbVar = new zzb();
            zzb = zzbVar;
            zzgys.F1(zzb.class, zzbVar);
        }

        private zzb() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void A2(int i) {
            z2();
            this.zzd.remove(i);
        }

        public static zzc D2() {
            return (zzc) zzb.f1();
        }

        public static zzc E2(zzb zzbVar) {
            return (zzc) zzb.G1(zzbVar);
        }

        public static zzb G2() {
            return zzb;
        }

        public static zzb H2(InputStream inputStream) throws IOException {
            return (zzb) zzgys.Q1(zzb, inputStream);
        }

        public static zzb I2(InputStream inputStream, zzgyc zzgycVar) throws IOException {
            return (zzb) zzgys.R1(zzb, inputStream, zzgycVar);
        }

        public static zzb J2(zzgxk zzgxkVar) throws zzgzh {
            return (zzb) zzgys.S1(zzb, zzgxkVar);
        }

        public static zzb K2(zzgxq zzgxqVar) throws IOException {
            return (zzb) zzgys.T1(zzb, zzgxqVar);
        }

        public static zzb L2(InputStream inputStream) throws IOException {
            return (zzb) zzgys.U1(zzb, inputStream);
        }

        public static zzb M2(ByteBuffer byteBuffer) throws zzgzh {
            return (zzb) zzgys.V1(zzb, byteBuffer);
        }

        public static zzb N2(byte[] bArr) throws zzgzh {
            return (zzb) zzgys.W1(zzb, bArr);
        }

        public static zzb O2(zzgxk zzgxkVar, zzgyc zzgycVar) throws zzgzh {
            return (zzb) zzgys.X1(zzb, zzgxkVar, zzgycVar);
        }

        public static zzb P2(zzgxq zzgxqVar, zzgyc zzgycVar) throws IOException {
            return (zzb) zzgys.Y1(zzb, zzgxqVar, zzgycVar);
        }

        public static zzb Q2(InputStream inputStream, zzgyc zzgycVar) throws IOException {
            return (zzb) zzgys.Z1(zzb, inputStream, zzgycVar);
        }

        public static zzb R2(ByteBuffer byteBuffer, zzgyc zzgycVar) throws zzgzh {
            return (zzb) zzgys.a2(zzb, byteBuffer, zzgycVar);
        }

        public static zzb S2(byte[] bArr, zzgyc zzgycVar) throws zzgzh {
            return (zzb) zzgys.b2(zzb, bArr, zzgycVar);
        }

        public static zzhal<zzb> T2() {
            return zzb.t1();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void y2() {
            this.zzd = zzgys.q1();
        }

        private void z2() {
            zzgze<zza> zzgzeVar = this.zzd;
            if (!zzgzeVar.c()) {
                this.zzd = zzgys.r1(zzgzeVar);
            }
        }

        public final void B2(int i, zza zzaVar) {
            zzaVar.getClass();
            z2();
            this.zzd.set(i, zzaVar);
        }

        public InterfaceC0108zzb C2(int i) {
            return this.zzd.get(i);
        }

        public List<? extends InterfaceC0108zzb> U2() {
            return this.zzd;
        }

        @Override // com.google.android.gms.internal.ads.zzbca.zzc
        public int a() {
            return this.zzd.size();
        }

        @Override // com.google.android.gms.internal.ads.zzbca.zzc
        public List<zza> l() {
            return this.zzd;
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
                                    zzhal<zzb> zzhalVar2 = zzc;
                                    if (zzhalVar2 == null) {
                                        synchronized (zzb.class) {
                                            try {
                                                zzhalVar = zzc;
                                                if (zzhalVar == null) {
                                                    zzhalVar = new zzgyn(zzb);
                                                    zzc = zzhalVar;
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
                            return zzb;
                        }
                        return new zzc();
                    }
                    return new zzb();
                }
                return zzgys.w1(zzb, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzd", zza.class});
            }
            return (byte) 1;
        }

        public final void v2(Iterable<? extends zza> iterable) {
            z2();
            zzgwt.U0(iterable, this.zzd);
        }

        public final void w2(zza zzaVar) {
            zzaVar.getClass();
            z2();
            this.zzd.add(zzaVar);
        }

        public final void x2(int i, zza zzaVar) {
            zzaVar.getClass();
            z2();
            this.zzd.add(i, zzaVar);
        }

        @Override // com.google.android.gms.internal.ads.zzbca.zzc
        public zza z(int i) {
            return this.zzd.get(i);
        }
    }

    /* loaded from: classes2.dex */
    public final class zzba extends zzgys<zzba, zza> implements zzbb {
        public static final int zza = 1;
        public static final int zzb = 2;
        public static final int zzc = 3;
        public static final int zzd = 4;
        public static final int zze = 5;
        private static final zzba zzf;
        private static volatile zzhal<zzba> zzg;
        private int zzh;
        private int zzi = 1000;
        private zzaw zzj;
        private int zzk;
        private int zzl;
        private int zzm;

        /* loaded from: classes2.dex */
        public final class zza extends zzgym<zzba, zza> implements zzbb {
            public zza Y1() {
                W1();
                ((zzba) this.Y).E2();
                return this;
            }

            public zza Z1() {
                W1();
                ((zzba) this.Y).F2();
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzbb
            public int a() {
                return ((zzba) this.Y).a();
            }

            public zza a2() {
                W1();
                ((zzba) this.Y).G2();
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzbb
            public int b() {
                return ((zzba) this.Y).b();
            }

            public zza b2() {
                W1();
                ((zzba) this.Y).H2();
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzbb
            public int c() {
                return ((zzba) this.Y).c();
            }

            public zza c2() {
                W1();
                ((zzba) this.Y).I2();
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzbb
            public zzaw d() {
                return ((zzba) this.Y).d();
            }

            public zza d2(zzaw zzawVar) {
                W1();
                ((zzba) this.Y).J2(zzawVar);
                return this;
            }

            public zza e2(zzaw.zza zzaVar) {
                W1();
                ((zzba) this.Y).K2(zzaVar.V1());
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzbb
            public zzq f() {
                return ((zzba) this.Y).f();
            }

            public zza f2(zzaw zzawVar) {
                W1();
                ((zzba) this.Y).K2(zzawVar);
                return this;
            }

            public zza g2(zzq zzqVar) {
                W1();
                ((zzba) this.Y).L2(zzqVar);
                return this;
            }

            public zza h2(int i) {
                W1();
                ((zzba) this.Y).M2(i);
                return this;
            }

            public zza j2(int i) {
                W1();
                ((zzba) this.Y).N2(i);
                return this;
            }

            public zza k2(int i) {
                W1();
                ((zzba) this.Y).O2(i);
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzbb
            public boolean q() {
                return ((zzba) this.Y).q();
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzbb
            public boolean s() {
                return ((zzba) this.Y).s();
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzbb
            public boolean t() {
                return ((zzba) this.Y).t();
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzbb
            public boolean v() {
                return ((zzba) this.Y).v();
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzbb
            public boolean x() {
                return ((zzba) this.Y).x();
            }

            private zza() {
                super(zzba.zzf);
            }
        }

        static {
            zzba zzbaVar = new zzba();
            zzf = zzbaVar;
            zzgys.F1(zzba.class, zzbaVar);
        }

        private zzba() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void E2() {
            this.zzj = null;
            this.zzh &= -3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void F2() {
            this.zzh &= -2;
            this.zzi = 1000;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void G2() {
            this.zzh &= -17;
            this.zzm = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void K2(zzaw zzawVar) {
            zzawVar.getClass();
            this.zzj = zzawVar;
            this.zzh |= 2;
        }

        public static zza P2() {
            return (zza) zzf.f1();
        }

        public static zza Q2(zzba zzbaVar) {
            return (zza) zzf.G1(zzbaVar);
        }

        public static zzba S2() {
            return zzf;
        }

        public static zzba T2(InputStream inputStream) throws IOException {
            return (zzba) zzgys.Q1(zzf, inputStream);
        }

        public static zzba U2(InputStream inputStream, zzgyc zzgycVar) throws IOException {
            return (zzba) zzgys.R1(zzf, inputStream, zzgycVar);
        }

        public static zzba V2(zzgxk zzgxkVar) throws zzgzh {
            return (zzba) zzgys.S1(zzf, zzgxkVar);
        }

        public static zzba W2(zzgxq zzgxqVar) throws IOException {
            return (zzba) zzgys.T1(zzf, zzgxqVar);
        }

        public static zzba X2(InputStream inputStream) throws IOException {
            return (zzba) zzgys.U1(zzf, inputStream);
        }

        public static zzba Y2(ByteBuffer byteBuffer) throws zzgzh {
            return (zzba) zzgys.V1(zzf, byteBuffer);
        }

        public static zzba Z2(byte[] bArr) throws zzgzh {
            return (zzba) zzgys.W1(zzf, bArr);
        }

        public static zzba a3(zzgxk zzgxkVar, zzgyc zzgycVar) throws zzgzh {
            return (zzba) zzgys.X1(zzf, zzgxkVar, zzgycVar);
        }

        public static zzba b3(zzgxq zzgxqVar, zzgyc zzgycVar) throws IOException {
            return (zzba) zzgys.Y1(zzf, zzgxqVar, zzgycVar);
        }

        public static zzba c3(InputStream inputStream, zzgyc zzgycVar) throws IOException {
            return (zzba) zzgys.Z1(zzf, inputStream, zzgycVar);
        }

        public static zzba d3(ByteBuffer byteBuffer, zzgyc zzgycVar) throws zzgzh {
            return (zzba) zzgys.a2(zzf, byteBuffer, zzgycVar);
        }

        public static zzba e3(byte[] bArr, zzgyc zzgycVar) throws zzgzh {
            return (zzba) zzgys.b2(zzf, bArr, zzgycVar);
        }

        public static zzhal<zzba> s2() {
            return zzf.t1();
        }

        public final void H2() {
            this.zzh &= -5;
            this.zzk = 0;
        }

        public final void I2() {
            this.zzh &= -9;
            this.zzl = 0;
        }

        public final void J2(zzaw zzawVar) {
            zzawVar.getClass();
            zzaw zzawVar2 = this.zzj;
            if (zzawVar2 != null && zzawVar2 != zzaw.u2()) {
                zzaw.zza t2 = zzaw.t2(zzawVar2);
                t2.M1(zzawVar);
                zzawVar = t2.o3();
            }
            this.zzj = zzawVar;
            this.zzh |= 2;
        }

        public final void L2(zzq zzqVar) {
            this.zzi = zzqVar.a();
            this.zzh |= 1;
        }

        public final void M2(int i) {
            this.zzh |= 16;
            this.zzm = i;
        }

        public final void N2(int i) {
            this.zzh |= 4;
            this.zzk = i;
        }

        public final void O2(int i) {
            this.zzh |= 8;
            this.zzl = i;
        }

        @Override // com.google.android.gms.internal.ads.zzbca.zzbb
        public int a() {
            return this.zzm;
        }

        @Override // com.google.android.gms.internal.ads.zzbca.zzbb
        public int b() {
            return this.zzk;
        }

        @Override // com.google.android.gms.internal.ads.zzbca.zzbb
        public int c() {
            return this.zzl;
        }

        @Override // com.google.android.gms.internal.ads.zzbca.zzbb
        public zzaw d() {
            zzaw zzawVar = this.zzj;
            if (zzawVar == null) {
                return zzaw.u2();
            }
            return zzawVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbca.zzbb
        public zzq f() {
            zzq e = zzq.e(this.zzi);
            if (e == null) {
                return zzq.ENUM_UNKNOWN;
            }
            return e;
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
                                    zzhal<zzba> zzhalVar2 = zzg;
                                    if (zzhalVar2 == null) {
                                        synchronized (zzba.class) {
                                            try {
                                                zzhalVar = zzg;
                                                if (zzhalVar == null) {
                                                    zzhalVar = new zzgyn(zzf);
                                                    zzg = zzhalVar;
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
                            return zzf;
                        }
                        return new zza();
                    }
                    return new zzba();
                }
                return zzgys.w1(zzf, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004", new Object[]{"zzh", "zzi", zzq.i(), "zzj", "zzk", "zzl", "zzm"});
            }
            return (byte) 1;
        }

        @Override // com.google.android.gms.internal.ads.zzbca.zzbb
        public boolean q() {
            return (this.zzh & 8) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbca.zzbb
        public boolean s() {
            return (this.zzh & 1) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbca.zzbb
        public boolean t() {
            return (this.zzh & 4) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbca.zzbb
        public boolean v() {
            return (this.zzh & 16) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbca.zzbb
        public boolean x() {
            return (this.zzh & 2) != 0;
        }
    }

    /* loaded from: classes2.dex */
    public interface zzbb extends zzhae {
        int a();

        int b();

        int c();

        zzaw d();

        zzq f();

        boolean q();

        boolean s();

        boolean t();

        boolean v();

        boolean x();
    }

    /* loaded from: classes2.dex */
    public final class zzbc extends zzgys<zzbc, zza> implements zzbd {
        public static final int zza = 1;
        public static final int zzb = 2;
        public static final int zzc = 3;
        private static final zzbc zzd;
        private static volatile zzhal<zzbc> zze;
        private int zzf;
        private int zzg = 1000;
        private zzaw zzh;
        private zzap zzi;

        /* loaded from: classes2.dex */
        public final class zza extends zzgym<zzbc, zza> implements zzbd {
            public zza Y1() {
                W1();
                ((zzbc) this.Y).y2();
                return this;
            }

            public zza Z1() {
                W1();
                ((zzbc) this.Y).z2();
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzbd
            public zzq a() {
                return ((zzbc) this.Y).a();
            }

            public zza a2() {
                W1();
                ((zzbc) this.Y).A2();
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzbd
            public zzap b() {
                return ((zzbc) this.Y).b();
            }

            public zza b2(zzaw zzawVar) {
                W1();
                ((zzbc) this.Y).B2(zzawVar);
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzbd
            public zzaw c() {
                return ((zzbc) this.Y).c();
            }

            public zza c2(zzap zzapVar) {
                W1();
                ((zzbc) this.Y).C2(zzapVar);
                return this;
            }

            public zza d2(zzaw.zza zzaVar) {
                W1();
                ((zzbc) this.Y).D2(zzaVar.V1());
                return this;
            }

            public zza e2(zzaw zzawVar) {
                W1();
                ((zzbc) this.Y).D2(zzawVar);
                return this;
            }

            public zza f2(zzap.zza zzaVar) {
                W1();
                ((zzbc) this.Y).E2(zzaVar.V1());
                return this;
            }

            public zza g2(zzap zzapVar) {
                W1();
                ((zzbc) this.Y).E2(zzapVar);
                return this;
            }

            public zza h2(zzq zzqVar) {
                W1();
                ((zzbc) this.Y).F2(zzqVar);
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzbd
            public boolean n() {
                return ((zzbc) this.Y).n();
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzbd
            public boolean o() {
                return ((zzbc) this.Y).o();
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzbd
            public boolean p() {
                return ((zzbc) this.Y).p();
            }

            private zza() {
                super(zzbc.zzd);
            }
        }

        static {
            zzbc zzbcVar = new zzbc();
            zzd = zzbcVar;
            zzgys.F1(zzbc.class, zzbcVar);
        }

        private zzbc() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void A2() {
            this.zzf &= -2;
            this.zzg = 1000;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void B2(zzaw zzawVar) {
            zzawVar.getClass();
            zzaw zzawVar2 = this.zzh;
            if (zzawVar2 != null && zzawVar2 != zzaw.u2()) {
                zzaw.zza t2 = zzaw.t2(zzawVar2);
                t2.M1(zzawVar);
                zzawVar = t2.o3();
            }
            this.zzh = zzawVar;
            this.zzf |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void C2(zzap zzapVar) {
            zzapVar.getClass();
            zzap zzapVar2 = this.zzi;
            if (zzapVar2 != null && zzapVar2 != zzap.i()) {
                zzap.zza x2 = zzap.x2(zzapVar2);
                x2.M1(zzapVar);
                zzapVar = x2.o3();
            }
            this.zzi = zzapVar;
            this.zzf |= 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void D2(zzaw zzawVar) {
            zzawVar.getClass();
            this.zzh = zzawVar;
            this.zzf |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void E2(zzap zzapVar) {
            zzapVar.getClass();
            this.zzi = zzapVar;
            this.zzf |= 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void F2(zzq zzqVar) {
            this.zzg = zzqVar.a();
            this.zzf |= 1;
        }

        public static zza G2() {
            return (zza) zzd.f1();
        }

        public static zza H2(zzbc zzbcVar) {
            return (zza) zzd.G1(zzbcVar);
        }

        public static zzbc J2() {
            return zzd;
        }

        public static zzbc K2(InputStream inputStream) throws IOException {
            return (zzbc) zzgys.Q1(zzd, inputStream);
        }

        public static zzbc L2(InputStream inputStream, zzgyc zzgycVar) throws IOException {
            return (zzbc) zzgys.R1(zzd, inputStream, zzgycVar);
        }

        public static zzbc M2(zzgxk zzgxkVar) throws zzgzh {
            return (zzbc) zzgys.S1(zzd, zzgxkVar);
        }

        public static zzbc N2(zzgxq zzgxqVar) throws IOException {
            return (zzbc) zzgys.T1(zzd, zzgxqVar);
        }

        public static zzbc O2(InputStream inputStream) throws IOException {
            return (zzbc) zzgys.U1(zzd, inputStream);
        }

        public static zzbc P2(ByteBuffer byteBuffer) throws zzgzh {
            return (zzbc) zzgys.V1(zzd, byteBuffer);
        }

        public static zzbc Q2(byte[] bArr) throws zzgzh {
            return (zzbc) zzgys.W1(zzd, bArr);
        }

        public static zzbc R2(zzgxk zzgxkVar, zzgyc zzgycVar) throws zzgzh {
            return (zzbc) zzgys.X1(zzd, zzgxkVar, zzgycVar);
        }

        public static zzbc S2(zzgxq zzgxqVar, zzgyc zzgycVar) throws IOException {
            return (zzbc) zzgys.Y1(zzd, zzgxqVar, zzgycVar);
        }

        public static zzbc T2(InputStream inputStream, zzgyc zzgycVar) throws IOException {
            return (zzbc) zzgys.Z1(zzd, inputStream, zzgycVar);
        }

        public static zzbc U2(ByteBuffer byteBuffer, zzgyc zzgycVar) throws zzgzh {
            return (zzbc) zzgys.a2(zzd, byteBuffer, zzgycVar);
        }

        public static zzbc V2(byte[] bArr, zzgyc zzgycVar) throws zzgzh {
            return (zzbc) zzgys.b2(zzd, bArr, zzgycVar);
        }

        public static zzhal<zzbc> W2() {
            return zzd.t1();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void y2() {
            this.zzh = null;
            this.zzf &= -3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void z2() {
            this.zzi = null;
            this.zzf &= -5;
        }

        @Override // com.google.android.gms.internal.ads.zzbca.zzbd
        public zzq a() {
            zzq e = zzq.e(this.zzg);
            if (e == null) {
                return zzq.ENUM_UNKNOWN;
            }
            return e;
        }

        @Override // com.google.android.gms.internal.ads.zzbca.zzbd
        public zzap b() {
            zzap zzapVar = this.zzi;
            if (zzapVar == null) {
                return zzap.i();
            }
            return zzapVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbca.zzbd
        public zzaw c() {
            zzaw zzawVar = this.zzh;
            if (zzawVar == null) {
                return zzaw.u2();
            }
            return zzawVar;
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
                                    zzhal<zzbc> zzhalVar2 = zze;
                                    if (zzhalVar2 == null) {
                                        synchronized (zzbc.class) {
                                            try {
                                                zzhalVar = zze;
                                                if (zzhalVar == null) {
                                                    zzhalVar = new zzgyn(zzd);
                                                    zze = zzhalVar;
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
                            return zzd;
                        }
                        return new zza();
                    }
                    return new zzbc();
                }
                return zzgys.w1(zzd, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"zzf", "zzg", zzq.i(), "zzh", "zzi"});
            }
            return (byte) 1;
        }

        @Override // com.google.android.gms.internal.ads.zzbca.zzbd
        public boolean n() {
            return (this.zzf & 2) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbca.zzbd
        public boolean o() {
            return (this.zzf & 1) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbca.zzbd
        public boolean p() {
            return (this.zzf & 4) != 0;
        }
    }

    /* loaded from: classes2.dex */
    public interface zzbd extends zzhae {
        zzq a();

        zzap b();

        zzaw c();

        boolean n();

        boolean o();

        boolean p();
    }

    /* loaded from: classes2.dex */
    public final class zzbe extends zzgys<zzbe, zza> implements zzbf {
        public static final int zza = 1;
        public static final int zzb = 2;
        public static final int zzc = 3;
        public static final int zzd = 4;
        public static final int zze = 5;
        public static final int zzf = 6;
        private static final zzbe zzg;
        private static volatile zzhal<zzbe> zzh;
        private int zzi;
        private int zzj = 1000;
        private zzaw zzk;
        private int zzl;
        private int zzm;
        private int zzn;
        private long zzo;

        /* loaded from: classes2.dex */
        public final class zza extends zzgym<zzbe, zza> implements zzbf {
            @Override // com.google.android.gms.internal.ads.zzbca.zzbf
            public boolean B() {
                return ((zzbe) this.Y).B();
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzbf
            public boolean C() {
                return ((zzbe) this.Y).C();
            }

            public zza Y1() {
                W1();
                ((zzbe) this.Y).I2();
                return this;
            }

            public zza Z1() {
                W1();
                ((zzbe) this.Y).J2();
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzbf
            public int a() {
                return ((zzbe) this.Y).a();
            }

            public zza a2() {
                W1();
                ((zzbe) this.Y).K2();
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzbf
            public int b() {
                return ((zzbe) this.Y).b();
            }

            public zza b2() {
                W1();
                ((zzbe) this.Y).L2();
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzbf
            public int c() {
                return ((zzbe) this.Y).c();
            }

            public zza c2() {
                W1();
                ((zzbe) this.Y).M2();
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzbf
            public zzq d() {
                return ((zzbe) this.Y).d();
            }

            public zza d2() {
                W1();
                ((zzbe) this.Y).N2();
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzbf
            public zzaw e() {
                return ((zzbe) this.Y).e();
            }

            public zza e2(zzaw zzawVar) {
                W1();
                ((zzbe) this.Y).O2(zzawVar);
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzbf
            public long f() {
                return ((zzbe) this.Y).f();
            }

            public zza f2(long j) {
                W1();
                ((zzbe) this.Y).P2(j);
                return this;
            }

            public zza g2(zzaw.zza zzaVar) {
                W1();
                ((zzbe) this.Y).Q2(zzaVar.V1());
                return this;
            }

            public zza h2(zzaw zzawVar) {
                W1();
                ((zzbe) this.Y).Q2(zzawVar);
                return this;
            }

            public zza j2(zzq zzqVar) {
                W1();
                ((zzbe) this.Y).R2(zzqVar);
                return this;
            }

            public zza k2(int i) {
                W1();
                ((zzbe) this.Y).S2(i);
                return this;
            }

            public zza m2(int i) {
                W1();
                ((zzbe) this.Y).T2(i);
                return this;
            }

            public zza n2(int i) {
                W1();
                ((zzbe) this.Y).U2(i);
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzbf
            public boolean q() {
                return ((zzbe) this.Y).q();
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzbf
            public boolean t() {
                return ((zzbe) this.Y).t();
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzbf
            public boolean w() {
                return ((zzbe) this.Y).w();
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzbf
            public boolean y() {
                return ((zzbe) this.Y).y();
            }

            private zza() {
                super(zzbe.zzg);
            }
        }

        static {
            zzbe zzbeVar = new zzbe();
            zzg = zzbeVar;
            zzgys.F1(zzbe.class, zzbeVar);
        }

        private zzbe() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void I2() {
            this.zzi &= -33;
            this.zzo = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void M2() {
            this.zzi &= -5;
            this.zzl = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void N2() {
            this.zzi &= -9;
            this.zzm = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void T2(int i) {
            this.zzi |= 4;
            this.zzl = i;
        }

        public static zza V2() {
            return (zza) zzg.f1();
        }

        public static zza W2(zzbe zzbeVar) {
            return (zza) zzg.G1(zzbeVar);
        }

        public static zzbe Y2() {
            return zzg;
        }

        public static zzbe Z2(InputStream inputStream) throws IOException {
            return (zzbe) zzgys.Q1(zzg, inputStream);
        }

        public static zzbe a3(InputStream inputStream, zzgyc zzgycVar) throws IOException {
            return (zzbe) zzgys.R1(zzg, inputStream, zzgycVar);
        }

        public static zzbe b3(zzgxk zzgxkVar) throws zzgzh {
            return (zzbe) zzgys.S1(zzg, zzgxkVar);
        }

        public static zzbe c3(zzgxq zzgxqVar) throws IOException {
            return (zzbe) zzgys.T1(zzg, zzgxqVar);
        }

        public static zzbe d3(InputStream inputStream) throws IOException {
            return (zzbe) zzgys.U1(zzg, inputStream);
        }

        public static zzbe e3(ByteBuffer byteBuffer) throws zzgzh {
            return (zzbe) zzgys.V1(zzg, byteBuffer);
        }

        public static zzbe f3(byte[] bArr) throws zzgzh {
            return (zzbe) zzgys.W1(zzg, bArr);
        }

        public static zzbe g3(zzgxk zzgxkVar, zzgyc zzgycVar) throws zzgzh {
            return (zzbe) zzgys.X1(zzg, zzgxkVar, zzgycVar);
        }

        public static zzbe h3(zzgxq zzgxqVar, zzgyc zzgycVar) throws IOException {
            return (zzbe) zzgys.Y1(zzg, zzgxqVar, zzgycVar);
        }

        public static zzbe i3(InputStream inputStream, zzgyc zzgycVar) throws IOException {
            return (zzbe) zzgys.Z1(zzg, inputStream, zzgycVar);
        }

        public static zzbe s2(ByteBuffer byteBuffer, zzgyc zzgycVar) throws zzgzh {
            return (zzbe) zzgys.a2(zzg, byteBuffer, zzgycVar);
        }

        public static zzbe t2(byte[] bArr, zzgyc zzgycVar) throws zzgzh {
            return (zzbe) zzgys.b2(zzg, bArr, zzgycVar);
        }

        public static zzhal<zzbe> u2() {
            return zzg.t1();
        }

        @Override // com.google.android.gms.internal.ads.zzbca.zzbf
        public boolean B() {
            return (this.zzi & 1) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbca.zzbf
        public boolean C() {
            return (this.zzi & 8) != 0;
        }

        public final void J2() {
            this.zzk = null;
            this.zzi &= -3;
        }

        public final void K2() {
            this.zzi &= -2;
            this.zzj = 1000;
        }

        public final void L2() {
            this.zzi &= -17;
            this.zzn = 0;
        }

        public final void O2(zzaw zzawVar) {
            zzawVar.getClass();
            zzaw zzawVar2 = this.zzk;
            if (zzawVar2 != null && zzawVar2 != zzaw.u2()) {
                zzaw.zza t2 = zzaw.t2(zzawVar2);
                t2.M1(zzawVar);
                zzawVar = t2.o3();
            }
            this.zzk = zzawVar;
            this.zzi |= 2;
        }

        public final void P2(long j) {
            this.zzi |= 32;
            this.zzo = j;
        }

        public final void Q2(zzaw zzawVar) {
            zzawVar.getClass();
            this.zzk = zzawVar;
            this.zzi |= 2;
        }

        public final void R2(zzq zzqVar) {
            this.zzj = zzqVar.a();
            this.zzi |= 1;
        }

        public final void S2(int i) {
            this.zzi |= 16;
            this.zzn = i;
        }

        public final void U2(int i) {
            this.zzi |= 8;
            this.zzm = i;
        }

        @Override // com.google.android.gms.internal.ads.zzbca.zzbf
        public int a() {
            return this.zzn;
        }

        @Override // com.google.android.gms.internal.ads.zzbca.zzbf
        public int b() {
            return this.zzl;
        }

        @Override // com.google.android.gms.internal.ads.zzbca.zzbf
        public int c() {
            return this.zzm;
        }

        @Override // com.google.android.gms.internal.ads.zzbca.zzbf
        public zzq d() {
            zzq e = zzq.e(this.zzj);
            if (e == null) {
                return zzq.ENUM_UNKNOWN;
            }
            return e;
        }

        @Override // com.google.android.gms.internal.ads.zzbca.zzbf
        public zzaw e() {
            zzaw zzawVar = this.zzk;
            if (zzawVar == null) {
                return zzaw.u2();
            }
            return zzawVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbca.zzbf
        public long f() {
            return this.zzo;
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
                                    zzhal<zzbe> zzhalVar2 = zzh;
                                    if (zzhalVar2 == null) {
                                        synchronized (zzbe.class) {
                                            try {
                                                zzhalVar = zzh;
                                                if (zzhalVar == null) {
                                                    zzhalVar = new zzgyn(zzg);
                                                    zzh = zzhalVar;
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
                            return zzg;
                        }
                        return new zza();
                    }
                    return new zzbe();
                }
                return zzgys.w1(zzg, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004\u0006ဃ\u0005", new Object[]{"zzi", "zzj", zzq.i(), "zzk", "zzl", "zzm", "zzn", "zzo"});
            }
            return (byte) 1;
        }

        @Override // com.google.android.gms.internal.ads.zzbca.zzbf
        public boolean q() {
            return (this.zzi & 2) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbca.zzbf
        public boolean t() {
            return (this.zzi & 32) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbca.zzbf
        public boolean w() {
            return (this.zzi & 4) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbca.zzbf
        public boolean y() {
            return (this.zzi & 16) != 0;
        }
    }

    /* loaded from: classes2.dex */
    public interface zzbf extends zzhae {
        boolean B();

        boolean C();

        int a();

        int b();

        int c();

        zzq d();

        zzaw e();

        long f();

        boolean q();

        boolean t();

        boolean w();

        boolean y();
    }

    /* loaded from: classes2.dex */
    public final class zzbg extends zzgys<zzbg, zza> implements zzbh {
        public static final int zza = 1;
        public static final int zzb = 2;
        public static final int zzc = 3;
        private static final zzbg zzd;
        private static volatile zzhal<zzbg> zze;
        private int zzf;
        private int zzg = 1000;
        private zzaw zzh;
        private zzap zzi;

        /* loaded from: classes2.dex */
        public final class zza extends zzgym<zzbg, zza> implements zzbh {
            public zza Y1() {
                W1();
                ((zzbg) this.Y).y2();
                return this;
            }

            public zza Z1() {
                W1();
                ((zzbg) this.Y).z2();
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzbh
            public zzq a() {
                return ((zzbg) this.Y).a();
            }

            public zza a2() {
                W1();
                ((zzbg) this.Y).A2();
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzbh
            public zzap b() {
                return ((zzbg) this.Y).b();
            }

            public zza b2(zzaw zzawVar) {
                W1();
                ((zzbg) this.Y).B2(zzawVar);
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzbh
            public zzaw c() {
                return ((zzbg) this.Y).c();
            }

            public zza c2(zzap zzapVar) {
                W1();
                ((zzbg) this.Y).C2(zzapVar);
                return this;
            }

            public zza d2(zzaw.zza zzaVar) {
                W1();
                ((zzbg) this.Y).D2(zzaVar.V1());
                return this;
            }

            public zza e2(zzaw zzawVar) {
                W1();
                ((zzbg) this.Y).D2(zzawVar);
                return this;
            }

            public zza f2(zzap.zza zzaVar) {
                W1();
                ((zzbg) this.Y).E2(zzaVar.V1());
                return this;
            }

            public zza g2(zzap zzapVar) {
                W1();
                ((zzbg) this.Y).E2(zzapVar);
                return this;
            }

            public zza h2(zzq zzqVar) {
                W1();
                ((zzbg) this.Y).F2(zzqVar);
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzbh
            public boolean n() {
                return ((zzbg) this.Y).n();
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzbh
            public boolean o() {
                return ((zzbg) this.Y).o();
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzbh
            public boolean p() {
                return ((zzbg) this.Y).p();
            }

            private zza() {
                super(zzbg.zzd);
            }
        }

        static {
            zzbg zzbgVar = new zzbg();
            zzd = zzbgVar;
            zzgys.F1(zzbg.class, zzbgVar);
        }

        private zzbg() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void A2() {
            this.zzf &= -2;
            this.zzg = 1000;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void B2(zzaw zzawVar) {
            zzawVar.getClass();
            zzaw zzawVar2 = this.zzh;
            if (zzawVar2 != null && zzawVar2 != zzaw.u2()) {
                zzaw.zza t2 = zzaw.t2(zzawVar2);
                t2.M1(zzawVar);
                zzawVar = t2.o3();
            }
            this.zzh = zzawVar;
            this.zzf |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void C2(zzap zzapVar) {
            zzapVar.getClass();
            zzap zzapVar2 = this.zzi;
            if (zzapVar2 != null && zzapVar2 != zzap.i()) {
                zzap.zza x2 = zzap.x2(zzapVar2);
                x2.M1(zzapVar);
                zzapVar = x2.o3();
            }
            this.zzi = zzapVar;
            this.zzf |= 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void D2(zzaw zzawVar) {
            zzawVar.getClass();
            this.zzh = zzawVar;
            this.zzf |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void E2(zzap zzapVar) {
            zzapVar.getClass();
            this.zzi = zzapVar;
            this.zzf |= 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void F2(zzq zzqVar) {
            this.zzg = zzqVar.a();
            this.zzf |= 1;
        }

        public static zza G2() {
            return (zza) zzd.f1();
        }

        public static zza H2(zzbg zzbgVar) {
            return (zza) zzd.G1(zzbgVar);
        }

        public static zzbg J2() {
            return zzd;
        }

        public static zzbg K2(InputStream inputStream) throws IOException {
            return (zzbg) zzgys.Q1(zzd, inputStream);
        }

        public static zzbg L2(InputStream inputStream, zzgyc zzgycVar) throws IOException {
            return (zzbg) zzgys.R1(zzd, inputStream, zzgycVar);
        }

        public static zzbg M2(zzgxk zzgxkVar) throws zzgzh {
            return (zzbg) zzgys.S1(zzd, zzgxkVar);
        }

        public static zzbg N2(zzgxq zzgxqVar) throws IOException {
            return (zzbg) zzgys.T1(zzd, zzgxqVar);
        }

        public static zzbg O2(InputStream inputStream) throws IOException {
            return (zzbg) zzgys.U1(zzd, inputStream);
        }

        public static zzbg P2(ByteBuffer byteBuffer) throws zzgzh {
            return (zzbg) zzgys.V1(zzd, byteBuffer);
        }

        public static zzbg Q2(byte[] bArr) throws zzgzh {
            return (zzbg) zzgys.W1(zzd, bArr);
        }

        public static zzbg R2(zzgxk zzgxkVar, zzgyc zzgycVar) throws zzgzh {
            return (zzbg) zzgys.X1(zzd, zzgxkVar, zzgycVar);
        }

        public static zzbg S2(zzgxq zzgxqVar, zzgyc zzgycVar) throws IOException {
            return (zzbg) zzgys.Y1(zzd, zzgxqVar, zzgycVar);
        }

        public static zzbg T2(InputStream inputStream, zzgyc zzgycVar) throws IOException {
            return (zzbg) zzgys.Z1(zzd, inputStream, zzgycVar);
        }

        public static zzbg U2(ByteBuffer byteBuffer, zzgyc zzgycVar) throws zzgzh {
            return (zzbg) zzgys.a2(zzd, byteBuffer, zzgycVar);
        }

        public static zzbg V2(byte[] bArr, zzgyc zzgycVar) throws zzgzh {
            return (zzbg) zzgys.b2(zzd, bArr, zzgycVar);
        }

        public static zzhal<zzbg> W2() {
            return zzd.t1();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void y2() {
            this.zzh = null;
            this.zzf &= -3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void z2() {
            this.zzi = null;
            this.zzf &= -5;
        }

        @Override // com.google.android.gms.internal.ads.zzbca.zzbh
        public zzq a() {
            zzq e = zzq.e(this.zzg);
            if (e == null) {
                return zzq.ENUM_UNKNOWN;
            }
            return e;
        }

        @Override // com.google.android.gms.internal.ads.zzbca.zzbh
        public zzap b() {
            zzap zzapVar = this.zzi;
            if (zzapVar == null) {
                return zzap.i();
            }
            return zzapVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbca.zzbh
        public zzaw c() {
            zzaw zzawVar = this.zzh;
            if (zzawVar == null) {
                return zzaw.u2();
            }
            return zzawVar;
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
                                    zzhal<zzbg> zzhalVar2 = zze;
                                    if (zzhalVar2 == null) {
                                        synchronized (zzbg.class) {
                                            try {
                                                zzhalVar = zze;
                                                if (zzhalVar == null) {
                                                    zzhalVar = new zzgyn(zzd);
                                                    zze = zzhalVar;
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
                            return zzd;
                        }
                        return new zza();
                    }
                    return new zzbg();
                }
                return zzgys.w1(zzd, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"zzf", "zzg", zzq.i(), "zzh", "zzi"});
            }
            return (byte) 1;
        }

        @Override // com.google.android.gms.internal.ads.zzbca.zzbh
        public boolean n() {
            return (this.zzf & 2) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbca.zzbh
        public boolean o() {
            return (this.zzf & 1) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbca.zzbh
        public boolean p() {
            return (this.zzf & 4) != 0;
        }
    }

    /* loaded from: classes2.dex */
    public interface zzbh extends zzhae {
        zzq a();

        zzap b();

        zzaw c();

        boolean n();

        boolean o();

        boolean p();
    }

    /* loaded from: classes2.dex */
    public interface zzbi extends zzhae {
        boolean C0();

        boolean F0();

        boolean I0();

        boolean J0();

        boolean K0();

        boolean N0();

        boolean T0();

        zzba W();

        zzau Y();

        boolean Z();

        int a();

        int b();

        int c();

        int d();

        int e();

        int f();

        zzay f0();

        int g();

        long h();

        zzap i();

        zzbj j0();

        zzbe k0();

        zzbc m0();

        boolean n0();

        boolean o0();

        boolean p0();

        boolean q0();

        boolean r0();

        boolean t0();

        boolean v0();

        boolean w0();

        zzbg y0();
    }

    /* loaded from: classes2.dex */
    public final class zzbj extends zzgys<zzbj, zza> implements zzbk {
        public static final int zza = 1;
        public static final int zzb = 2;
        private static final zzbj zzc;
        private static volatile zzhal<zzbj> zzd;
        private int zze;
        private int zzf = 1000;
        private zzaw zzg;

        /* loaded from: classes2.dex */
        public final class zza extends zzgym<zzbj, zza> implements zzbk {
            public zza Y1() {
                W1();
                ((zzbj) this.Y).t2();
                return this;
            }

            public zza Z1() {
                W1();
                ((zzbj) this.Y).u2();
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzbk
            public zzq a() {
                return ((zzbj) this.Y).a();
            }

            public zza a2(zzaw zzawVar) {
                W1();
                ((zzbj) this.Y).v2(zzawVar);
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzbk
            public zzaw b() {
                return ((zzbj) this.Y).b();
            }

            public zza b2(zzaw.zza zzaVar) {
                W1();
                ((zzbj) this.Y).w2(zzaVar.V1());
                return this;
            }

            public zza c2(zzaw zzawVar) {
                W1();
                ((zzbj) this.Y).w2(zzawVar);
                return this;
            }

            public zza d2(zzq zzqVar) {
                W1();
                ((zzbj) this.Y).x2(zzqVar);
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzbk
            public boolean i() {
                return ((zzbj) this.Y).i();
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzbk
            public boolean j() {
                return ((zzbj) this.Y).j();
            }

            private zza() {
                super(zzbj.zzc);
            }
        }

        static {
            zzbj zzbjVar = new zzbj();
            zzc = zzbjVar;
            zzgys.F1(zzbj.class, zzbjVar);
        }

        private zzbj() {
        }

        public static zzbj B2() {
            return zzc;
        }

        public static zzbj C2(InputStream inputStream) throws IOException {
            return (zzbj) zzgys.Q1(zzc, inputStream);
        }

        public static zzbj D2(InputStream inputStream, zzgyc zzgycVar) throws IOException {
            return (zzbj) zzgys.R1(zzc, inputStream, zzgycVar);
        }

        public static zzbj E2(zzgxk zzgxkVar) throws zzgzh {
            return (zzbj) zzgys.S1(zzc, zzgxkVar);
        }

        public static zzbj F2(zzgxq zzgxqVar) throws IOException {
            return (zzbj) zzgys.T1(zzc, zzgxqVar);
        }

        public static zzbj G2(InputStream inputStream) throws IOException {
            return (zzbj) zzgys.U1(zzc, inputStream);
        }

        public static zzbj H2(ByteBuffer byteBuffer) throws zzgzh {
            return (zzbj) zzgys.V1(zzc, byteBuffer);
        }

        public static zzbj I2(byte[] bArr) throws zzgzh {
            return (zzbj) zzgys.W1(zzc, bArr);
        }

        public static zzbj J2(zzgxk zzgxkVar, zzgyc zzgycVar) throws zzgzh {
            return (zzbj) zzgys.X1(zzc, zzgxkVar, zzgycVar);
        }

        public static zzbj K2(zzgxq zzgxqVar, zzgyc zzgycVar) throws IOException {
            return (zzbj) zzgys.Y1(zzc, zzgxqVar, zzgycVar);
        }

        public static zzbj L2(InputStream inputStream, zzgyc zzgycVar) throws IOException {
            return (zzbj) zzgys.Z1(zzc, inputStream, zzgycVar);
        }

        public static zzbj M2(ByteBuffer byteBuffer, zzgyc zzgycVar) throws zzgzh {
            return (zzbj) zzgys.a2(zzc, byteBuffer, zzgycVar);
        }

        public static zzbj N2(byte[] bArr, zzgyc zzgycVar) throws zzgzh {
            return (zzbj) zzgys.b2(zzc, bArr, zzgycVar);
        }

        public static zzhal<zzbj> O2() {
            return zzc.t1();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void t2() {
            this.zzg = null;
            this.zze &= -3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void u2() {
            this.zze &= -2;
            this.zzf = 1000;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void x2(zzq zzqVar) {
            this.zzf = zzqVar.a();
            this.zze |= 1;
        }

        public static zza y2() {
            return (zza) zzc.f1();
        }

        public static zza z2(zzbj zzbjVar) {
            return (zza) zzc.G1(zzbjVar);
        }

        @Override // com.google.android.gms.internal.ads.zzbca.zzbk
        public zzq a() {
            zzq e = zzq.e(this.zzf);
            if (e == null) {
                return zzq.ENUM_UNKNOWN;
            }
            return e;
        }

        @Override // com.google.android.gms.internal.ads.zzbca.zzbk
        public zzaw b() {
            zzaw zzawVar = this.zzg;
            if (zzawVar == null) {
                return zzaw.u2();
            }
            return zzawVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbca.zzbk
        public boolean i() {
            return (this.zze & 2) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbca.zzbk
        public boolean j() {
            return (this.zze & 1) != 0;
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
                                    zzhal<zzbj> zzhalVar2 = zzd;
                                    if (zzhalVar2 == null) {
                                        synchronized (zzbj.class) {
                                            try {
                                                zzhalVar = zzd;
                                                if (zzhalVar == null) {
                                                    zzhalVar = new zzgyn(zzc);
                                                    zzd = zzhalVar;
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
                            return zzc;
                        }
                        return new zza();
                    }
                    return new zzbj();
                }
                return zzgys.w1(zzc, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001", new Object[]{"zze", "zzf", zzq.i(), "zzg"});
            }
            return (byte) 1;
        }

        public final void v2(zzaw zzawVar) {
            zzawVar.getClass();
            zzaw zzawVar2 = this.zzg;
            if (zzawVar2 != null && zzawVar2 != zzaw.u2()) {
                zzaw.zza t2 = zzaw.t2(zzawVar2);
                t2.M1(zzawVar);
                zzawVar = t2.o3();
            }
            this.zzg = zzawVar;
            this.zze |= 2;
        }

        public final void w2(zzaw zzawVar) {
            zzawVar.getClass();
            this.zzg = zzawVar;
            this.zze |= 2;
        }
    }

    /* loaded from: classes2.dex */
    public interface zzbk extends zzhae {
        zzq a();

        zzaw b();

        boolean i();

        boolean j();
    }

    /* loaded from: classes2.dex */
    public final class zzbl extends zzgys<zzbl, zza> implements zzbm {
        public static final int zza = 1;
        public static final int zzb = 2;
        private static final zzbl zzc;
        private static volatile zzhal<zzbl> zzd;
        private int zze;
        private boolean zzf;
        private int zzg;

        /* loaded from: classes2.dex */
        public final class zza extends zzgym<zzbl, zza> implements zzbm {
            public zza Y1() {
                W1();
                ((zzbl) this.Y).s2();
                return this;
            }

            public zza Z1() {
                W1();
                ((zzbl) this.Y).t2();
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzbm
            public int a() {
                return ((zzbl) this.Y).a();
            }

            public zza a2(boolean z) {
                W1();
                ((zzbl) this.Y).u2(z);
                return this;
            }

            public zza b2(int i) {
                W1();
                ((zzbl) this.Y).v2(i);
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzbm
            public boolean e() {
                return ((zzbl) this.Y).e();
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzbm
            public boolean g() {
                return ((zzbl) this.Y).g();
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzbm
            public boolean h() {
                return ((zzbl) this.Y).h();
            }

            private zza() {
                super(zzbl.zzc);
            }
        }

        static {
            zzbl zzblVar = new zzbl();
            zzc = zzblVar;
            zzgys.F1(zzbl.class, zzblVar);
        }

        private zzbl() {
        }

        public static zzbl A2(InputStream inputStream) throws IOException {
            return (zzbl) zzgys.Q1(zzc, inputStream);
        }

        public static zzbl B2(InputStream inputStream, zzgyc zzgycVar) throws IOException {
            return (zzbl) zzgys.R1(zzc, inputStream, zzgycVar);
        }

        public static zzbl C2(zzgxk zzgxkVar) throws zzgzh {
            return (zzbl) zzgys.S1(zzc, zzgxkVar);
        }

        public static zzbl D2(zzgxq zzgxqVar) throws IOException {
            return (zzbl) zzgys.T1(zzc, zzgxqVar);
        }

        public static zzbl E2(InputStream inputStream) throws IOException {
            return (zzbl) zzgys.U1(zzc, inputStream);
        }

        public static zzbl F2(ByteBuffer byteBuffer) throws zzgzh {
            return (zzbl) zzgys.V1(zzc, byteBuffer);
        }

        public static zzbl G2(byte[] bArr) throws zzgzh {
            return (zzbl) zzgys.W1(zzc, bArr);
        }

        public static zzbl H2(zzgxk zzgxkVar, zzgyc zzgycVar) throws zzgzh {
            return (zzbl) zzgys.X1(zzc, zzgxkVar, zzgycVar);
        }

        public static zzbl I2(zzgxq zzgxqVar, zzgyc zzgycVar) throws IOException {
            return (zzbl) zzgys.Y1(zzc, zzgxqVar, zzgycVar);
        }

        public static zzbl J2(InputStream inputStream, zzgyc zzgycVar) throws IOException {
            return (zzbl) zzgys.Z1(zzc, inputStream, zzgycVar);
        }

        public static zzbl K2(ByteBuffer byteBuffer, zzgyc zzgycVar) throws zzgzh {
            return (zzbl) zzgys.a2(zzc, byteBuffer, zzgycVar);
        }

        public static zzbl L2(byte[] bArr, zzgyc zzgycVar) throws zzgzh {
            return (zzbl) zzgys.b2(zzc, bArr, zzgycVar);
        }

        public static zzhal<zzbl> M2() {
            return zzc.t1();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void s2() {
            this.zze &= -2;
            this.zzf = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void t2() {
            this.zze &= -3;
            this.zzg = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void u2(boolean z) {
            this.zze |= 1;
            this.zzf = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void v2(int i) {
            this.zze |= 2;
            this.zzg = i;
        }

        public static zza w2() {
            return (zza) zzc.f1();
        }

        public static zza x2(zzbl zzblVar) {
            return (zza) zzc.G1(zzblVar);
        }

        public static zzbl z2() {
            return zzc;
        }

        @Override // com.google.android.gms.internal.ads.zzbca.zzbm
        public int a() {
            return this.zzg;
        }

        @Override // com.google.android.gms.internal.ads.zzbca.zzbm
        public boolean e() {
            return this.zzf;
        }

        @Override // com.google.android.gms.internal.ads.zzbca.zzbm
        public boolean g() {
            return (this.zze & 1) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbca.zzbm
        public boolean h() {
            return (this.zze & 2) != 0;
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
                                    zzhal<zzbl> zzhalVar2 = zzd;
                                    if (zzhalVar2 == null) {
                                        synchronized (zzbl.class) {
                                            try {
                                                zzhalVar = zzd;
                                                if (zzhalVar == null) {
                                                    zzhalVar = new zzgyn(zzc);
                                                    zzd = zzhalVar;
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
                            return zzc;
                        }
                        return new zza();
                    }
                    return new zzbl();
                }
                return zzgys.w1(zzc, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002င\u0001", new Object[]{"zze", "zzf", "zzg"});
            }
            return (byte) 1;
        }
    }

    /* loaded from: classes2.dex */
    public interface zzbm extends zzhae {
        int a();

        boolean e();

        boolean g();

        boolean h();
    }

    /* loaded from: classes2.dex */
    public interface zzc extends zzhae {
        int a();

        List<zzb.zza> l();

        zzb.zza z(int i);
    }

    /* loaded from: classes2.dex */
    public final class zzd extends zzgys<zzd, zzb> implements zze {
        public static final int zza = 1;
        public static final int zzb = 2;
        private static final zzd zzc;
        private static volatile zzhal<zzd> zzd;
        private int zze;
        private int zzf;
        private zzal zzg;

        /* loaded from: classes2.dex */
        public enum zza implements zzgyw {
            AD_FORMAT_TYPE_UNSPECIFIED(0),
            BANNER(1),
            INTERSTITIAL(2),
            NATIVE_EXPRESS(3),
            NATIVE_CONTENT(4),
            NATIVE_APP_INSTALL(5),
            NATIVE_CUSTOM_TEMPLATE(6),
            DFP_BANNER(7),
            DFP_INTERSTITIAL(8),
            REWARD_BASED_VIDEO_AD(9),
            BANNER_SEARCH_ADS(10);
            
            public static final int h1 = 0;
            public static final int i1 = 1;
            public static final int j1 = 2;
            public static final int k1 = 3;
            public static final int l1 = 4;
            public static final int m1 = 5;
            public static final int n1 = 6;
            public static final int o1 = 7;
            public static final int p1 = 8;
            public static final int q1 = 9;
            public static final int r1 = 10;
            public static final zzgyx<zza> s1 = new zzgyx<zza>() { // from class: com.google.android.gms.internal.ads.zzbca.zzd.zza.1
                /* renamed from: a */
                public zza b(int i) {
                    return zza.e(i);
                }
            };
            public final int X;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: com.google.android.gms.internal.ads.zzbca$zzd$zza$zza  reason: collision with other inner class name */
            /* loaded from: classes2.dex */
            public final class C0109zza implements zzgyy {
                public static final zzgyy a = new C0109zza();

                private C0109zza() {
                }

                @Override // com.google.android.gms.internal.ads.zzgyy
                public boolean u(int i) {
                    if (zza.e(i) != null) {
                        return true;
                    }
                    return false;
                }
            }

            zza(int i) {
                this.X = i;
            }

            public static zza e(int i) {
                switch (i) {
                    case 0:
                        return AD_FORMAT_TYPE_UNSPECIFIED;
                    case 1:
                        return BANNER;
                    case 2:
                        return INTERSTITIAL;
                    case 3:
                        return NATIVE_EXPRESS;
                    case 4:
                        return NATIVE_CONTENT;
                    case 5:
                        return NATIVE_APP_INSTALL;
                    case 6:
                        return NATIVE_CUSTOM_TEMPLATE;
                    case 7:
                        return DFP_BANNER;
                    case 8:
                        return DFP_INTERSTITIAL;
                    case 9:
                        return REWARD_BASED_VIDEO_AD;
                    case 10:
                        return BANNER_SEARCH_ADS;
                    default:
                        return null;
                }
            }

            public static zzgyx<zza> h() {
                return s1;
            }

            public static zzgyy i() {
                return C0109zza.a;
            }

            @Override // com.google.android.gms.internal.ads.zzgyw
            public final int a() {
                return this.X;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return Integer.toString(this.X);
            }
        }

        /* loaded from: classes2.dex */
        public final class zzb extends zzgym<zzd, zzb> implements zze {
            public zzb Y1() {
                W1();
                ((zzd) this.Y).t2();
                return this;
            }

            public zzb Z1() {
                W1();
                ((zzd) this.Y).u2();
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zze
            public zza a() {
                return ((zzd) this.Y).a();
            }

            public zzb a2(zzal zzalVar) {
                W1();
                ((zzd) this.Y).v2(zzalVar);
                return this;
            }

            public zzb b2(zzal.zza zzaVar) {
                W1();
                ((zzd) this.Y).w2(zzaVar.V1());
                return this;
            }

            public zzb c2(zzal zzalVar) {
                W1();
                ((zzd) this.Y).w2(zzalVar);
                return this;
            }

            public zzb d2(zza zzaVar) {
                W1();
                ((zzd) this.Y).x2(zzaVar);
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zze
            public zzal h() {
                return ((zzd) this.Y).h();
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zze
            public boolean i() {
                return ((zzd) this.Y).i();
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zze
            public boolean j() {
                return ((zzd) this.Y).j();
            }

            private zzb() {
                super(zzd.zzc);
            }
        }

        static {
            zzd zzdVar = new zzd();
            zzc = zzdVar;
            zzgys.F1(zzd.class, zzdVar);
        }

        private zzd() {
        }

        public static zzd B2() {
            return zzc;
        }

        public static zzd C2(InputStream inputStream) throws IOException {
            return (zzd) zzgys.Q1(zzc, inputStream);
        }

        public static zzd D2(InputStream inputStream, zzgyc zzgycVar) throws IOException {
            return (zzd) zzgys.R1(zzc, inputStream, zzgycVar);
        }

        public static zzd E2(zzgxk zzgxkVar) throws zzgzh {
            return (zzd) zzgys.S1(zzc, zzgxkVar);
        }

        public static zzd F2(zzgxq zzgxqVar) throws IOException {
            return (zzd) zzgys.T1(zzc, zzgxqVar);
        }

        public static zzd G2(InputStream inputStream) throws IOException {
            return (zzd) zzgys.U1(zzc, inputStream);
        }

        public static zzd H2(ByteBuffer byteBuffer) throws zzgzh {
            return (zzd) zzgys.V1(zzc, byteBuffer);
        }

        public static zzd I2(byte[] bArr) throws zzgzh {
            return (zzd) zzgys.W1(zzc, bArr);
        }

        public static zzd J2(zzgxk zzgxkVar, zzgyc zzgycVar) throws zzgzh {
            return (zzd) zzgys.X1(zzc, zzgxkVar, zzgycVar);
        }

        public static zzd K2(zzgxq zzgxqVar, zzgyc zzgycVar) throws IOException {
            return (zzd) zzgys.Y1(zzc, zzgxqVar, zzgycVar);
        }

        public static zzd L2(InputStream inputStream, zzgyc zzgycVar) throws IOException {
            return (zzd) zzgys.Z1(zzc, inputStream, zzgycVar);
        }

        public static zzd M2(ByteBuffer byteBuffer, zzgyc zzgycVar) throws zzgzh {
            return (zzd) zzgys.a2(zzc, byteBuffer, zzgycVar);
        }

        public static zzd N2(byte[] bArr, zzgyc zzgycVar) throws zzgzh {
            return (zzd) zzgys.b2(zzc, bArr, zzgycVar);
        }

        public static zzhal<zzd> O2() {
            return zzc.t1();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void t2() {
            this.zzg = null;
            this.zze &= -3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void u2() {
            this.zze &= -2;
            this.zzf = 0;
        }

        public static zzb y2() {
            return (zzb) zzc.f1();
        }

        public static zzb z2(zzd zzdVar) {
            return (zzb) zzc.G1(zzdVar);
        }

        @Override // com.google.android.gms.internal.ads.zzbca.zze
        public zza a() {
            zza e = zza.e(this.zzf);
            if (e == null) {
                return zza.AD_FORMAT_TYPE_UNSPECIFIED;
            }
            return e;
        }

        @Override // com.google.android.gms.internal.ads.zzbca.zze
        public zzal h() {
            zzal zzalVar = this.zzg;
            if (zzalVar == null) {
                return zzal.z2();
            }
            return zzalVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbca.zze
        public boolean i() {
            return (this.zze & 2) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbca.zze
        public boolean j() {
            return (this.zze & 1) != 0;
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
                                    zzhal<zzd> zzhalVar2 = zzd;
                                    if (zzhalVar2 == null) {
                                        synchronized (zzd.class) {
                                            try {
                                                zzhalVar = zzd;
                                                if (zzhalVar == null) {
                                                    zzhalVar = new zzgyn(zzc);
                                                    zzd = zzhalVar;
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
                            return zzc;
                        }
                        return new zzb();
                    }
                    return new zzd();
                }
                return zzgys.w1(zzc, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001", new Object[]{"zze", "zzf", zza.i(), "zzg"});
            }
            return (byte) 1;
        }

        public final void v2(zzal zzalVar) {
            zzalVar.getClass();
            zzal zzalVar2 = this.zzg;
            if (zzalVar2 != null && zzalVar2 != zzal.z2()) {
                zzal.zza x2 = zzal.x2(zzalVar2);
                x2.M1(zzalVar);
                zzalVar = x2.o3();
            }
            this.zzg = zzalVar;
            this.zze |= 2;
        }

        public final void w2(zzal zzalVar) {
            zzalVar.getClass();
            this.zzg = zzalVar;
            this.zze |= 2;
        }

        public final void x2(zza zzaVar) {
            this.zzf = zzaVar.a();
            this.zze |= 1;
        }
    }

    /* loaded from: classes2.dex */
    public interface zze extends zzhae {
        zzd.zza a();

        zzal h();

        boolean i();

        boolean j();
    }

    /* loaded from: classes2.dex */
    public interface zzf extends zzhae {
        boolean C0();

        zzd M0(int i);

        zzat S0(int i);

        zzz W();

        zzq Y();

        List<zzat> Z();

        int a();

        zzg a0();

        int b();

        zzi b0();

        zza.EnumC0104zza c();

        zzx f0();

        zzk g0();

        List<zzd> j0();

        zzah k0();

        zzac m0();

        boolean n0();

        boolean o0();

        boolean p0();

        boolean q0();

        boolean r0();

        boolean t0();

        boolean v0();

        boolean w0();
    }

    /* loaded from: classes2.dex */
    public final class zzg extends zzgys<zzg, zza> implements zzh {
        public static final int zza = 1;
        public static final int zzb = 2;
        public static final int zzc = 3;
        private static final zzg zzd;
        private static volatile zzhal<zzg> zze;
        private int zzf;
        private String zzg = "";
        private zzgze<zzd> zzh = zzgys.q1();
        private int zzi;

        /* loaded from: classes2.dex */
        public final class zza extends zzgym<zzg, zza> implements zzh {
            public zza Y1(Iterable<? extends zzd> iterable) {
                W1();
                ((zzg) this.Y).F2(iterable);
                return this;
            }

            public zza Z1(zzd.zzb zzbVar) {
                W1();
                ((zzg) this.Y).G2(zzbVar.V1());
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzh
            public int a() {
                return ((zzg) this.Y).a();
            }

            public zza a2(zzd zzdVar) {
                W1();
                ((zzg) this.Y).G2(zzdVar);
                return this;
            }

            public zza b2(int i, zzd.zzb zzbVar) {
                W1();
                ((zzg) this.Y).H2(i, zzbVar.V1());
                return this;
            }

            public zza c2(int i, zzd zzdVar) {
                W1();
                ((zzg) this.Y).H2(i, zzdVar);
                return this;
            }

            public zza d2() {
                W1();
                ((zzg) this.Y).I2();
                return this;
            }

            public zza e2() {
                W1();
                ((zzg) this.Y).J2();
                return this;
            }

            public zza f2() {
                W1();
                ((zzg) this.Y).K2();
                return this;
            }

            public zza g2(int i) {
                W1();
                ((zzg) this.Y).M2(i);
                return this;
            }

            public zza h2(String str) {
                W1();
                ((zzg) this.Y).N2(str);
                return this;
            }

            public zza j2(zzgxk zzgxkVar) {
                W1();
                ((zzg) this.Y).O2(zzgxkVar);
                return this;
            }

            public zza k2(zzq zzqVar) {
                W1();
                ((zzg) this.Y).P2(zzqVar);
                return this;
            }

            public zza m2(int i, zzd.zzb zzbVar) {
                W1();
                ((zzg) this.Y).Q2(i, zzbVar.V1());
                return this;
            }

            public zza n2(int i, zzd zzdVar) {
                W1();
                ((zzg) this.Y).Q2(i, zzdVar);
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzh
            public boolean q() {
                return ((zzg) this.Y).q();
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzh
            public zzq r() {
                return ((zzg) this.Y).r();
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzh
            public String s() {
                return ((zzg) this.Y).s();
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzh
            public boolean t() {
                return ((zzg) this.Y).t();
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzh
            public List<zzd> v() {
                return Collections.unmodifiableList(((zzg) this.Y).v());
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzh
            public zzgxk x() {
                return ((zzg) this.Y).x();
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzh
            public zzd z(int i) {
                return ((zzg) this.Y).z(i);
            }

            private zza() {
                super(zzg.zzd);
            }
        }

        static {
            zzg zzgVar = new zzg();
            zzd = zzgVar;
            zzgys.F1(zzg.class, zzgVar);
        }

        private zzg() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void I2() {
            this.zzf &= -2;
            this.zzg = V2().s();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void J2() {
            this.zzf &= -3;
            this.zzi = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void K2() {
            this.zzh = zzgys.q1();
        }

        private void L2() {
            zzgze<zzd> zzgzeVar = this.zzh;
            if (!zzgzeVar.c()) {
                this.zzh = zzgys.r1(zzgzeVar);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void M2(int i) {
            L2();
            this.zzh.remove(i);
        }

        public static zza S2() {
            return (zza) zzd.f1();
        }

        public static zza T2(zzg zzgVar) {
            return (zza) zzd.G1(zzgVar);
        }

        public static zzg V2() {
            return zzd;
        }

        public static zzg W2(InputStream inputStream) throws IOException {
            return (zzg) zzgys.Q1(zzd, inputStream);
        }

        public static zzg X2(InputStream inputStream, zzgyc zzgycVar) throws IOException {
            return (zzg) zzgys.R1(zzd, inputStream, zzgycVar);
        }

        public static zzg Y2(zzgxk zzgxkVar) throws zzgzh {
            return (zzg) zzgys.S1(zzd, zzgxkVar);
        }

        public static zzg Z2(zzgxq zzgxqVar) throws IOException {
            return (zzg) zzgys.T1(zzd, zzgxqVar);
        }

        public static zzg a3(InputStream inputStream) throws IOException {
            return (zzg) zzgys.U1(zzd, inputStream);
        }

        public static zzg b3(ByteBuffer byteBuffer) throws zzgzh {
            return (zzg) zzgys.V1(zzd, byteBuffer);
        }

        public static zzg c3(byte[] bArr) throws zzgzh {
            return (zzg) zzgys.W1(zzd, bArr);
        }

        public static zzg d3(zzgxk zzgxkVar, zzgyc zzgycVar) throws zzgzh {
            return (zzg) zzgys.X1(zzd, zzgxkVar, zzgycVar);
        }

        public static zzg e3(zzgxq zzgxqVar, zzgyc zzgycVar) throws IOException {
            return (zzg) zzgys.Y1(zzd, zzgxqVar, zzgycVar);
        }

        public static zzg f3(InputStream inputStream, zzgyc zzgycVar) throws IOException {
            return (zzg) zzgys.Z1(zzd, inputStream, zzgycVar);
        }

        public static zzg g3(ByteBuffer byteBuffer, zzgyc zzgycVar) throws zzgzh {
            return (zzg) zzgys.a2(zzd, byteBuffer, zzgycVar);
        }

        public static zzg h3(byte[] bArr, zzgyc zzgycVar) throws zzgzh {
            return (zzg) zzgys.b2(zzd, bArr, zzgycVar);
        }

        public static zzhal<zzg> s2() {
            return zzd.t1();
        }

        public final void F2(Iterable<? extends zzd> iterable) {
            L2();
            zzgwt.U0(iterable, this.zzh);
        }

        public final void G2(zzd zzdVar) {
            zzdVar.getClass();
            L2();
            this.zzh.add(zzdVar);
        }

        public final void H2(int i, zzd zzdVar) {
            zzdVar.getClass();
            L2();
            this.zzh.add(i, zzdVar);
        }

        public final void N2(String str) {
            str.getClass();
            this.zzf |= 1;
            this.zzg = str;
        }

        public final void O2(zzgxk zzgxkVar) {
            this.zzg = zzgxkVar.X();
            this.zzf |= 1;
        }

        public final void P2(zzq zzqVar) {
            this.zzi = zzqVar.a();
            this.zzf |= 2;
        }

        public final void Q2(int i, zzd zzdVar) {
            zzdVar.getClass();
            L2();
            this.zzh.set(i, zzdVar);
        }

        public zze R2(int i) {
            return this.zzh.get(i);
        }

        @Override // com.google.android.gms.internal.ads.zzbca.zzh
        public int a() {
            return this.zzh.size();
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
                                    zzhal<zzg> zzhalVar2 = zze;
                                    if (zzhalVar2 == null) {
                                        synchronized (zzg.class) {
                                            try {
                                                zzhalVar = zze;
                                                if (zzhalVar == null) {
                                                    zzhalVar = new zzgyn(zzd);
                                                    zze = zzhalVar;
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
                            return zzd;
                        }
                        return new zza();
                    }
                    return new zzg();
                }
                return zzgys.w1(zzd, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b\u0003᠌\u0001", new Object[]{"zzf", "zzg", "zzh", zzd.class, "zzi", zzq.i()});
            }
            return (byte) 1;
        }

        @Override // com.google.android.gms.internal.ads.zzbca.zzh
        public boolean q() {
            return (this.zzf & 2) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbca.zzh
        public zzq r() {
            zzq e = zzq.e(this.zzi);
            if (e == null) {
                return zzq.ENUM_FALSE;
            }
            return e;
        }

        @Override // com.google.android.gms.internal.ads.zzbca.zzh
        public String s() {
            return this.zzg;
        }

        @Override // com.google.android.gms.internal.ads.zzbca.zzh
        public boolean t() {
            return (this.zzf & 1) != 0;
        }

        public List<? extends zze> t2() {
            return this.zzh;
        }

        @Override // com.google.android.gms.internal.ads.zzbca.zzh
        public List<zzd> v() {
            return this.zzh;
        }

        @Override // com.google.android.gms.internal.ads.zzbca.zzh
        public zzgxk x() {
            return zzgxk.V(this.zzg);
        }

        @Override // com.google.android.gms.internal.ads.zzbca.zzh
        public zzd z(int i) {
            return this.zzh.get(i);
        }
    }

    /* loaded from: classes2.dex */
    public interface zzh extends zzhae {
        int a();

        boolean q();

        zzq r();

        String s();

        boolean t();

        List<zzd> v();

        zzgxk x();

        zzd z(int i);
    }

    /* loaded from: classes2.dex */
    public final class zzi extends zzgys<zzi, zza> implements zzj {
        public static final int zza = 1;
        public static final int zzb = 2;
        public static final int zzc = 3;
        public static final int zzd = 4;
        public static final int zze = 5;
        private static final zzi zzf;
        private static volatile zzhal<zzi> zzg;
        private int zzh;
        private String zzi = "";
        private zzgze<zzd> zzj = zzgys.q1();
        private int zzk = 1000;
        private int zzl = 1000;
        private int zzm = 1000;

        /* loaded from: classes2.dex */
        public final class zza extends zzgym<zzi, zza> implements zzj {
            @Override // com.google.android.gms.internal.ads.zzbca.zzj
            public zzq B() {
                return ((zzi) this.Y).B();
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzj
            public List<zzd> C() {
                return Collections.unmodifiableList(((zzi) this.Y).C());
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzj
            public boolean F() {
                return ((zzi) this.Y).F();
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzj
            public boolean L() {
                return ((zzi) this.Y).L();
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzj
            public boolean Q() {
                return ((zzi) this.Y).Q();
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzj
            public boolean R() {
                return ((zzi) this.Y).R();
            }

            public zza Y1(Iterable<? extends zzd> iterable) {
                W1();
                ((zzi) this.Y).J2(iterable);
                return this;
            }

            public zza Z1(zzd.zzb zzbVar) {
                W1();
                ((zzi) this.Y).K2(zzbVar.V1());
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzj
            public int a() {
                return ((zzi) this.Y).a();
            }

            public zza a2(zzd zzdVar) {
                W1();
                ((zzi) this.Y).K2(zzdVar);
                return this;
            }

            public zza b2(int i, zzd.zzb zzbVar) {
                W1();
                ((zzi) this.Y).L2(i, zzbVar.V1());
                return this;
            }

            public zza c2(int i, zzd zzdVar) {
                W1();
                ((zzi) this.Y).L2(i, zzdVar);
                return this;
            }

            public zza d2() {
                W1();
                ((zzi) this.Y).M2();
                return this;
            }

            public zza e2() {
                W1();
                ((zzi) this.Y).N2();
                return this;
            }

            public zza f2() {
                W1();
                ((zzi) this.Y).O2();
                return this;
            }

            public zza g2() {
                W1();
                ((zzi) this.Y).P2();
                return this;
            }

            public zza h2() {
                W1();
                ((zzi) this.Y).Q2();
                return this;
            }

            public zza j2(int i) {
                W1();
                ((zzi) this.Y).S2(i);
                return this;
            }

            public zza k2(zzq zzqVar) {
                W1();
                ((zzi) this.Y).T2(zzqVar);
                return this;
            }

            public zza m2(String str) {
                W1();
                ((zzi) this.Y).U2(str);
                return this;
            }

            public zza n2(zzgxk zzgxkVar) {
                W1();
                ((zzi) this.Y).V2(zzgxkVar);
                return this;
            }

            public zza o2(zzq zzqVar) {
                W1();
                ((zzi) this.Y).W2(zzqVar);
                return this;
            }

            public zza p2(zzq zzqVar) {
                W1();
                ((zzi) this.Y).X2(zzqVar);
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzj
            public zzq q() {
                return ((zzi) this.Y).q();
            }

            public zza q2(int i, zzd.zzb zzbVar) {
                W1();
                ((zzi) this.Y).Y2(i, zzbVar.V1());
                return this;
            }

            public zza r2(int i, zzd zzdVar) {
                W1();
                ((zzi) this.Y).Y2(i, zzdVar);
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzj
            public zzq t() {
                return ((zzi) this.Y).t();
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzj
            public String w() {
                return ((zzi) this.Y).w();
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzj
            public zzgxk y() {
                return ((zzi) this.Y).y();
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzj
            public zzd z(int i) {
                return ((zzi) this.Y).z(i);
            }

            private zza() {
                super(zzi.zzf);
            }
        }

        static {
            zzi zziVar = new zzi();
            zzf = zziVar;
            zzgys.F1(zzi.class, zziVar);
        }

        private zzi() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void M2() {
            this.zzh &= -9;
            this.zzm = 1000;
        }

        public static zza a3() {
            return (zza) zzf.f1();
        }

        public static zza b3(zzi zziVar) {
            return (zza) zzf.G1(zziVar);
        }

        public static zzi d3() {
            return zzf;
        }

        public static zzi e3(InputStream inputStream) throws IOException {
            return (zzi) zzgys.Q1(zzf, inputStream);
        }

        public static zzi f3(InputStream inputStream, zzgyc zzgycVar) throws IOException {
            return (zzi) zzgys.R1(zzf, inputStream, zzgycVar);
        }

        public static zzi g3(zzgxk zzgxkVar) throws zzgzh {
            return (zzi) zzgys.S1(zzf, zzgxkVar);
        }

        public static zzi h3(zzgxq zzgxqVar) throws IOException {
            return (zzi) zzgys.T1(zzf, zzgxqVar);
        }

        public static zzi i3(InputStream inputStream) throws IOException {
            return (zzi) zzgys.U1(zzf, inputStream);
        }

        public static zzi j3(ByteBuffer byteBuffer) throws zzgzh {
            return (zzi) zzgys.V1(zzf, byteBuffer);
        }

        public static zzi k3(byte[] bArr) throws zzgzh {
            return (zzi) zzgys.W1(zzf, bArr);
        }

        public static zzi l3(zzgxk zzgxkVar, zzgyc zzgycVar) throws zzgzh {
            return (zzi) zzgys.X1(zzf, zzgxkVar, zzgycVar);
        }

        public static zzi m3(zzgxq zzgxqVar, zzgyc zzgycVar) throws IOException {
            return (zzi) zzgys.Y1(zzf, zzgxqVar, zzgycVar);
        }

        public static zzi n3(InputStream inputStream, zzgyc zzgycVar) throws IOException {
            return (zzi) zzgys.Z1(zzf, inputStream, zzgycVar);
        }

        public static zzi p3(ByteBuffer byteBuffer, zzgyc zzgycVar) throws zzgzh {
            return (zzi) zzgys.a2(zzf, byteBuffer, zzgycVar);
        }

        public static zzi q3(byte[] bArr, zzgyc zzgycVar) throws zzgzh {
            return (zzi) zzgys.b2(zzf, bArr, zzgycVar);
        }

        public static zzhal<zzi> s2() {
            return zzf.t1();
        }

        @Override // com.google.android.gms.internal.ads.zzbca.zzj
        public zzq B() {
            zzq e = zzq.e(this.zzk);
            if (e == null) {
                return zzq.ENUM_UNKNOWN;
            }
            return e;
        }

        @Override // com.google.android.gms.internal.ads.zzbca.zzj
        public List<zzd> C() {
            return this.zzj;
        }

        @Override // com.google.android.gms.internal.ads.zzbca.zzj
        public boolean F() {
            return (this.zzh & 2) != 0;
        }

        public final void J2(Iterable<? extends zzd> iterable) {
            R2();
            zzgwt.U0(iterable, this.zzj);
        }

        public final void K2(zzd zzdVar) {
            zzdVar.getClass();
            R2();
            this.zzj.add(zzdVar);
        }

        @Override // com.google.android.gms.internal.ads.zzbca.zzj
        public boolean L() {
            return (this.zzh & 8) != 0;
        }

        public final void L2(int i, zzd zzdVar) {
            zzdVar.getClass();
            R2();
            this.zzj.add(i, zzdVar);
        }

        public final void N2() {
            this.zzh &= -2;
            this.zzi = d3().w();
        }

        public final void O2() {
            this.zzh &= -5;
            this.zzl = 1000;
        }

        public final void P2() {
            this.zzh &= -3;
            this.zzk = 1000;
        }

        @Override // com.google.android.gms.internal.ads.zzbca.zzj
        public boolean Q() {
            return (this.zzh & 4) != 0;
        }

        public final void Q2() {
            this.zzj = zzgys.q1();
        }

        @Override // com.google.android.gms.internal.ads.zzbca.zzj
        public boolean R() {
            return (this.zzh & 1) != 0;
        }

        public final void R2() {
            zzgze<zzd> zzgzeVar = this.zzj;
            if (!zzgzeVar.c()) {
                this.zzj = zzgys.r1(zzgzeVar);
            }
        }

        public final void S2(int i) {
            R2();
            this.zzj.remove(i);
        }

        public final void T2(zzq zzqVar) {
            this.zzm = zzqVar.a();
            this.zzh |= 8;
        }

        public final void U2(String str) {
            str.getClass();
            this.zzh |= 1;
            this.zzi = str;
        }

        public final void V2(zzgxk zzgxkVar) {
            this.zzi = zzgxkVar.X();
            this.zzh |= 1;
        }

        public final void W2(zzq zzqVar) {
            this.zzl = zzqVar.a();
            this.zzh |= 4;
        }

        public final void X2(zzq zzqVar) {
            this.zzk = zzqVar.a();
            this.zzh |= 2;
        }

        public final void Y2(int i, zzd zzdVar) {
            zzdVar.getClass();
            R2();
            this.zzj.set(i, zzdVar);
        }

        public zze Z2(int i) {
            return this.zzj.get(i);
        }

        @Override // com.google.android.gms.internal.ads.zzbca.zzj
        public int a() {
            return this.zzj.size();
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
                                    zzhal<zzi> zzhalVar2 = zzg;
                                    if (zzhalVar2 == null) {
                                        synchronized (zzi.class) {
                                            try {
                                                zzhalVar = zzg;
                                                if (zzhalVar == null) {
                                                    zzhalVar = new zzgyn(zzf);
                                                    zzg = zzhalVar;
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
                            return zzf;
                        }
                        return new zza();
                    }
                    return new zzi();
                }
                return zzgys.w1(zzf, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b\u0003᠌\u0001\u0004᠌\u0002\u0005᠌\u0003", new Object[]{"zzh", "zzi", "zzj", zzd.class, "zzk", zzq.i(), "zzl", zzq.i(), "zzm", zzq.i()});
            }
            return (byte) 1;
        }

        @Override // com.google.android.gms.internal.ads.zzbca.zzj
        public zzq q() {
            zzq e = zzq.e(this.zzl);
            if (e == null) {
                return zzq.ENUM_UNKNOWN;
            }
            return e;
        }

        @Override // com.google.android.gms.internal.ads.zzbca.zzj
        public zzq t() {
            zzq e = zzq.e(this.zzm);
            if (e == null) {
                return zzq.ENUM_UNKNOWN;
            }
            return e;
        }

        public List<? extends zze> t2() {
            return this.zzj;
        }

        @Override // com.google.android.gms.internal.ads.zzbca.zzj
        public String w() {
            return this.zzi;
        }

        @Override // com.google.android.gms.internal.ads.zzbca.zzj
        public zzgxk y() {
            return zzgxk.V(this.zzi);
        }

        @Override // com.google.android.gms.internal.ads.zzbca.zzj
        public zzd z(int i) {
            return this.zzj.get(i);
        }
    }

    /* loaded from: classes2.dex */
    public interface zzj extends zzhae {
        zzq B();

        List<zzd> C();

        boolean F();

        boolean L();

        boolean Q();

        boolean R();

        int a();

        zzq q();

        zzq t();

        String w();

        zzgxk y();

        zzd z(int i);
    }

    /* loaded from: classes2.dex */
    public final class zzk extends zzgys<zzk, zza> implements zzl {
        public static final int zza = 1;
        public static final int zzb = 2;
        public static final int zzc = 3;
        public static final int zzd = 4;
        public static final int zze = 5;
        public static final int zzf = 6;
        private static final zzk zzg;
        private static volatile zzhal<zzk> zzh;
        private int zzi;
        private int zzj;
        private zzap zzk;
        private zzap zzl;
        private zzap zzm;
        private zzgze<zzap> zzn = zzgys.q1();
        private int zzo;

        /* loaded from: classes2.dex */
        public final class zza extends zzgym<zzk, zza> implements zzl {
            @Override // com.google.android.gms.internal.ads.zzbca.zzl
            public boolean D() {
                return ((zzk) this.Y).D();
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzl
            public zzap F() {
                return ((zzk) this.Y).F();
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzl
            public boolean G() {
                return ((zzk) this.Y).G();
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzl
            public boolean J() {
                return ((zzk) this.Y).J();
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzl
            public List<zzap> N() {
                return Collections.unmodifiableList(((zzk) this.Y).N());
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzl
            public boolean O() {
                return ((zzk) this.Y).O();
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzl
            public boolean P() {
                return ((zzk) this.Y).P();
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzl
            public zzap P0(int i) {
                return ((zzk) this.Y).P0(i);
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzl
            public zzap Q() {
                return ((zzk) this.Y).Q();
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzl
            public zzap U() {
                return ((zzk) this.Y).U();
            }

            public zza Y1(zzap zzapVar) {
                W1();
                ((zzk) this.Y).a3(zzapVar);
                return this;
            }

            public zza Z1(int i) {
                W1();
                ((zzk) this.Y).b3(i);
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzl
            public int a() {
                return ((zzk) this.Y).a();
            }

            public zza a2(zzap.zza zzaVar) {
                W1();
                ((zzk) this.Y).I2(zzaVar.V1());
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzl
            public int b() {
                return ((zzk) this.Y).b();
            }

            public zza b2(zzap zzapVar) {
                W1();
                ((zzk) this.Y).I2(zzapVar);
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzl
            public int c() {
                return ((zzk) this.Y).c();
            }

            public zza c2(int i, zzap.zza zzaVar) {
                W1();
                ((zzk) this.Y).J2(i, zzaVar.V1());
                return this;
            }

            public zza d2(int i, zzap zzapVar) {
                W1();
                ((zzk) this.Y).J2(i, zzapVar);
                return this;
            }

            public zza e2(Iterable<? extends zzap> iterable) {
                W1();
                ((zzk) this.Y).K2(iterable);
                return this;
            }

            public zza f2() {
                W1();
                ((zzk) this.Y).L2();
                return this;
            }

            public zza g2() {
                W1();
                ((zzk) this.Y).M2();
                return this;
            }

            public zza h2() {
                W1();
                ((zzk) this.Y).N2();
                return this;
            }

            public zza j2() {
                W1();
                ((zzk) this.Y).O2();
                return this;
            }

            public zza k2() {
                W1();
                ((zzk) this.Y).P2();
                return this;
            }

            public zza m2() {
                W1();
                ((zzk) this.Y).Q2();
                return this;
            }

            public zza n2(zzap zzapVar) {
                W1();
                ((zzk) this.Y).S2(zzapVar);
                return this;
            }

            public zza o2(zzap zzapVar) {
                W1();
                ((zzk) this.Y).T2(zzapVar);
                return this;
            }

            public zza p2(zzap zzapVar) {
                W1();
                ((zzk) this.Y).U2(zzapVar);
                return this;
            }

            public zza q2(int i) {
                W1();
                ((zzk) this.Y).V2(i);
                return this;
            }

            public zza r2(int i) {
                W1();
                ((zzk) this.Y).W2(i);
                return this;
            }

            public zza s2(zzap.zza zzaVar) {
                W1();
                ((zzk) this.Y).X2(zzaVar.V1());
                return this;
            }

            public zza t2(zzap zzapVar) {
                W1();
                ((zzk) this.Y).X2(zzapVar);
                return this;
            }

            public zza u2(zzap.zza zzaVar) {
                W1();
                ((zzk) this.Y).Y2(zzaVar.V1());
                return this;
            }

            public zza v2(zzap zzapVar) {
                W1();
                ((zzk) this.Y).Y2(zzapVar);
                return this;
            }

            public zza w2(int i, zzap.zza zzaVar) {
                W1();
                ((zzk) this.Y).Z2(i, zzaVar.V1());
                return this;
            }

            public zza x2(int i, zzap zzapVar) {
                W1();
                ((zzk) this.Y).Z2(i, zzapVar);
                return this;
            }

            public zza y2(zzap.zza zzaVar) {
                W1();
                ((zzk) this.Y).a3(zzaVar.V1());
                return this;
            }

            private zza() {
                super(zzk.zzg);
            }
        }

        static {
            zzk zzkVar = new zzk();
            zzg = zzkVar;
            zzgys.F1(zzk.class, zzkVar);
        }

        private zzk() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void I2(zzap zzapVar) {
            zzapVar.getClass();
            R2();
            this.zzn.add(zzapVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void L2() {
            this.zzi &= -2;
            this.zzj = 0;
        }

        public static zza c3() {
            return (zza) zzg.f1();
        }

        public static zza d3(zzk zzkVar) {
            return (zza) zzg.G1(zzkVar);
        }

        public static zzk f3() {
            return zzg;
        }

        public static zzk g3(InputStream inputStream) throws IOException {
            return (zzk) zzgys.Q1(zzg, inputStream);
        }

        public static zzk h3(InputStream inputStream, zzgyc zzgycVar) throws IOException {
            return (zzk) zzgys.R1(zzg, inputStream, zzgycVar);
        }

        public static zzk i3(zzgxk zzgxkVar) throws zzgzh {
            return (zzk) zzgys.S1(zzg, zzgxkVar);
        }

        public static zzk j3(zzgxq zzgxqVar) throws IOException {
            return (zzk) zzgys.T1(zzg, zzgxqVar);
        }

        public static zzk k3(InputStream inputStream) throws IOException {
            return (zzk) zzgys.U1(zzg, inputStream);
        }

        public static zzk l3(ByteBuffer byteBuffer) throws zzgzh {
            return (zzk) zzgys.V1(zzg, byteBuffer);
        }

        public static zzk m3(byte[] bArr) throws zzgzh {
            return (zzk) zzgys.W1(zzg, bArr);
        }

        public static zzk n3(zzgxk zzgxkVar, zzgyc zzgycVar) throws zzgzh {
            return (zzk) zzgys.X1(zzg, zzgxkVar, zzgycVar);
        }

        public static zzk p3(zzgxq zzgxqVar, zzgyc zzgycVar) throws IOException {
            return (zzk) zzgys.Y1(zzg, zzgxqVar, zzgycVar);
        }

        public static zzk q3(InputStream inputStream, zzgyc zzgycVar) throws IOException {
            return (zzk) zzgys.Z1(zzg, inputStream, zzgycVar);
        }

        public static zzk r3(ByteBuffer byteBuffer, zzgyc zzgycVar) throws zzgzh {
            return (zzk) zzgys.a2(zzg, byteBuffer, zzgycVar);
        }

        public static zzk s3(byte[] bArr, zzgyc zzgycVar) throws zzgzh {
            return (zzk) zzgys.b2(zzg, bArr, zzgycVar);
        }

        public static zzhal<zzk> u3() {
            return zzg.t1();
        }

        @Override // com.google.android.gms.internal.ads.zzbca.zzl
        public boolean D() {
            return (this.zzi & 4) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbca.zzl
        public zzap F() {
            zzap zzapVar = this.zzk;
            if (zzapVar == null) {
                return zzap.i();
            }
            return zzapVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbca.zzl
        public boolean G() {
            return (this.zzi & 8) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbca.zzl
        public boolean J() {
            return (this.zzi & 16) != 0;
        }

        public final void J2(int i, zzap zzapVar) {
            zzapVar.getClass();
            R2();
            this.zzn.add(i, zzapVar);
        }

        public final void K2(Iterable<? extends zzap> iterable) {
            R2();
            zzgwt.U0(iterable, this.zzn);
        }

        public final void M2() {
            this.zzl = null;
            this.zzi &= -5;
        }

        @Override // com.google.android.gms.internal.ads.zzbca.zzl
        public List<zzap> N() {
            return this.zzn;
        }

        public final void N2() {
            this.zzk = null;
            this.zzi &= -3;
        }

        @Override // com.google.android.gms.internal.ads.zzbca.zzl
        public boolean O() {
            return (this.zzi & 2) != 0;
        }

        public final void O2() {
            this.zzn = zzgys.q1();
        }

        @Override // com.google.android.gms.internal.ads.zzbca.zzl
        public boolean P() {
            return (this.zzi & 1) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbca.zzl
        public zzap P0(int i) {
            return this.zzn.get(i);
        }

        public final void P2() {
            this.zzm = null;
            this.zzi &= -9;
        }

        @Override // com.google.android.gms.internal.ads.zzbca.zzl
        public zzap Q() {
            zzap zzapVar = this.zzl;
            if (zzapVar == null) {
                return zzap.i();
            }
            return zzapVar;
        }

        public final void Q2() {
            this.zzi &= -17;
            this.zzo = 0;
        }

        public final void R2() {
            zzgze<zzap> zzgzeVar = this.zzn;
            if (!zzgzeVar.c()) {
                this.zzn = zzgys.r1(zzgzeVar);
            }
        }

        public final void S2(zzap zzapVar) {
            zzapVar.getClass();
            zzap zzapVar2 = this.zzl;
            if (zzapVar2 != null && zzapVar2 != zzap.i()) {
                zzap.zza x2 = zzap.x2(zzapVar2);
                x2.M1(zzapVar);
                zzapVar = x2.o3();
            }
            this.zzl = zzapVar;
            this.zzi |= 4;
        }

        public final void T2(zzap zzapVar) {
            zzapVar.getClass();
            zzap zzapVar2 = this.zzk;
            if (zzapVar2 != null && zzapVar2 != zzap.i()) {
                zzap.zza x2 = zzap.x2(zzapVar2);
                x2.M1(zzapVar);
                zzapVar = x2.o3();
            }
            this.zzk = zzapVar;
            this.zzi |= 2;
        }

        @Override // com.google.android.gms.internal.ads.zzbca.zzl
        public zzap U() {
            zzap zzapVar = this.zzm;
            if (zzapVar == null) {
                return zzap.i();
            }
            return zzapVar;
        }

        public final void U2(zzap zzapVar) {
            zzapVar.getClass();
            zzap zzapVar2 = this.zzm;
            if (zzapVar2 != null && zzapVar2 != zzap.i()) {
                zzap.zza x2 = zzap.x2(zzapVar2);
                x2.M1(zzapVar);
                zzapVar = x2.o3();
            }
            this.zzm = zzapVar;
            this.zzi |= 8;
        }

        public final void V2(int i) {
            R2();
            this.zzn.remove(i);
        }

        public final void W2(int i) {
            this.zzi |= 1;
            this.zzj = i;
        }

        public final void X2(zzap zzapVar) {
            zzapVar.getClass();
            this.zzl = zzapVar;
            this.zzi |= 4;
        }

        public final void Y2(zzap zzapVar) {
            zzapVar.getClass();
            this.zzk = zzapVar;
            this.zzi |= 2;
        }

        public final void Z2(int i, zzap zzapVar) {
            zzapVar.getClass();
            R2();
            this.zzn.set(i, zzapVar);
        }

        @Override // com.google.android.gms.internal.ads.zzbca.zzl
        public int a() {
            return this.zzj;
        }

        public final void a3(zzap zzapVar) {
            zzapVar.getClass();
            this.zzm = zzapVar;
            this.zzi |= 8;
        }

        @Override // com.google.android.gms.internal.ads.zzbca.zzl
        public int b() {
            return this.zzn.size();
        }

        public final void b3(int i) {
            this.zzi |= 16;
            this.zzo = i;
        }

        @Override // com.google.android.gms.internal.ads.zzbca.zzl
        public int c() {
            return this.zzo;
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
                                    zzhal<zzk> zzhalVar2 = zzh;
                                    if (zzhalVar2 == null) {
                                        synchronized (zzk.class) {
                                            try {
                                                zzhalVar = zzh;
                                                if (zzhalVar == null) {
                                                    zzhalVar = new zzgyn(zzg);
                                                    zzh = zzhalVar;
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
                            return zzg;
                        }
                        return new zza();
                    }
                    return new zzk();
                }
                return zzgys.w1(zzg, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001င\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005\u001b\u0006င\u0004", new Object[]{"zzi", "zzj", "zzk", "zzl", "zzm", "zzn", zzap.class, "zzo"});
            }
            return (byte) 1;
        }

        public zzaq t3(int i) {
            return this.zzn.get(i);
        }

        public List<? extends zzaq> v3() {
            return this.zzn;
        }
    }

    /* loaded from: classes2.dex */
    public interface zzl extends zzhae {
        boolean D();

        zzap F();

        boolean G();

        boolean J();

        List<zzap> N();

        boolean O();

        boolean P();

        zzap P0(int i);

        zzap Q();

        zzap U();

        int a();

        int b();

        int c();
    }

    /* loaded from: classes2.dex */
    public final class zzm extends zzgys<zzm, zza> implements zzn {
        public static final int zza = 1;
        public static final int zzb = 2;
        public static final int zzc = 3;
        public static final int zzd = 4;
        public static final int zze = 5;
        public static final int zzf = 6;
        public static final int zzg = 7;
        public static final int zzh = 8;
        private static final zzm zzi;
        private static volatile zzhal<zzm> zzj;
        private int zzk;
        private zzap zzm;
        private int zzn;
        private zzar zzo;
        private int zzp;
        private String zzl = "";
        private int zzu = 1000;
        private int zzv = 1000;
        private int zzw = 1000;

        /* loaded from: classes2.dex */
        public final class zza extends zzgym<zzm, zza> implements zzn {
            @Override // com.google.android.gms.internal.ads.zzbca.zzn
            public zzq C() {
                return ((zzm) this.Y).C();
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzn
            public boolean D() {
                return ((zzm) this.Y).D();
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzn
            public String F() {
                return ((zzm) this.Y).F();
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzn
            public boolean G() {
                return ((zzm) this.Y).G();
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzn
            public boolean J() {
                return ((zzm) this.Y).J();
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzn
            public zzap L() {
                return ((zzm) this.Y).L();
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzn
            public boolean N() {
                return ((zzm) this.Y).N();
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzn
            public boolean O() {
                return ((zzm) this.Y).O();
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzn
            public boolean P() {
                return ((zzm) this.Y).P();
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzn
            public zzgxk Q() {
                return ((zzm) this.Y).Q();
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzn
            public zzar R() {
                return ((zzm) this.Y).R();
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzn
            public boolean U() {
                return ((zzm) this.Y).U();
            }

            public zza Y1() {
                W1();
                ((zzm) this.Y).I2();
                return this;
            }

            public zza Z1() {
                W1();
                ((zzm) this.Y).J2();
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzn
            public int a() {
                return ((zzm) this.Y).a();
            }

            public zza a2() {
                W1();
                ((zzm) this.Y).K2();
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzn
            public int b() {
                return ((zzm) this.Y).b();
            }

            public zza b2() {
                W1();
                ((zzm) this.Y).L2();
                return this;
            }

            public zza c2() {
                W1();
                ((zzm) this.Y).M2();
                return this;
            }

            public zza d2() {
                W1();
                ((zzm) this.Y).N2();
                return this;
            }

            public zza e2() {
                W1();
                ((zzm) this.Y).O2();
                return this;
            }

            public zza f2() {
                W1();
                ((zzm) this.Y).P2();
                return this;
            }

            public zza g2(zzap zzapVar) {
                W1();
                ((zzm) this.Y).Q2(zzapVar);
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzn
            public boolean h0() {
                return ((zzm) this.Y).h0();
            }

            public zza h2(zzar zzarVar) {
                W1();
                ((zzm) this.Y).R2(zzarVar);
                return this;
            }

            public zza j2(String str) {
                W1();
                ((zzm) this.Y).S2(str);
                return this;
            }

            public zza k2(zzgxk zzgxkVar) {
                W1();
                ((zzm) this.Y).T2(zzgxkVar);
                return this;
            }

            public zza m2(zzq zzqVar) {
                W1();
                ((zzm) this.Y).U2(zzqVar);
                return this;
            }

            public zza n2(zzq zzqVar) {
                W1();
                ((zzm) this.Y).V2(zzqVar);
                return this;
            }

            public zza o2(zzq zzqVar) {
                W1();
                ((zzm) this.Y).W2(zzqVar);
                return this;
            }

            public zza p2(zzap.zza zzaVar) {
                W1();
                ((zzm) this.Y).X2(zzaVar.V1());
                return this;
            }

            public zza q2(zzap zzapVar) {
                W1();
                ((zzm) this.Y).X2(zzapVar);
                return this;
            }

            public zza r2(int i) {
                W1();
                ((zzm) this.Y).Y2(i);
                return this;
            }

            public zza s2(int i) {
                W1();
                ((zzm) this.Y).Z2(i);
                return this;
            }

            public zza t2(zzar.zza zzaVar) {
                W1();
                ((zzm) this.Y).a3(zzaVar.V1());
                return this;
            }

            public zza u2(zzar zzarVar) {
                W1();
                ((zzm) this.Y).a3(zzarVar);
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzn
            public zzq w() {
                return ((zzm) this.Y).w();
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzn
            public zzq y() {
                return ((zzm) this.Y).y();
            }

            private zza() {
                super(zzm.zzi);
            }
        }

        static {
            zzm zzmVar = new zzm();
            zzi = zzmVar;
            zzgys.F1(zzm.class, zzmVar);
        }

        private zzm() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void I2() {
            this.zzk &= -2;
            this.zzl = g().F();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void J2() {
            this.zzk &= -33;
            this.zzu = 1000;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void K2() {
            this.zzk &= -65;
            this.zzv = 1000;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void L2() {
            this.zzk &= -129;
            this.zzw = 1000;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void M2() {
            this.zzm = null;
            this.zzk &= -3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void N2() {
            this.zzk &= -17;
            this.zzp = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void O2() {
            this.zzk &= -5;
            this.zzn = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void P2() {
            this.zzo = null;
            this.zzk &= -9;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Q2(zzap zzapVar) {
            zzapVar.getClass();
            zzap zzapVar2 = this.zzm;
            if (zzapVar2 != null && zzapVar2 != zzap.i()) {
                zzap.zza x2 = zzap.x2(zzapVar2);
                x2.M1(zzapVar);
                zzapVar = x2.o3();
            }
            this.zzm = zzapVar;
            this.zzk |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Z2(int i) {
            this.zzk |= 4;
            this.zzn = i;
        }

        public static zza b3() {
            return (zza) zzi.f1();
        }

        public static zza c3(zzm zzmVar) {
            return (zza) zzi.G1(zzmVar);
        }

        public static zzm e3(InputStream inputStream) throws IOException {
            return (zzm) zzgys.Q1(zzi, inputStream);
        }

        public static zzm f3(InputStream inputStream, zzgyc zzgycVar) throws IOException {
            return (zzm) zzgys.R1(zzi, inputStream, zzgycVar);
        }

        public static zzm g() {
            return zzi;
        }

        public static zzm g3(zzgxk zzgxkVar) throws zzgzh {
            return (zzm) zzgys.S1(zzi, zzgxkVar);
        }

        public static zzm h3(zzgxq zzgxqVar) throws IOException {
            return (zzm) zzgys.T1(zzi, zzgxqVar);
        }

        public static zzm i3(InputStream inputStream) throws IOException {
            return (zzm) zzgys.U1(zzi, inputStream);
        }

        public static zzm j3(ByteBuffer byteBuffer) throws zzgzh {
            return (zzm) zzgys.V1(zzi, byteBuffer);
        }

        public static zzm k3(byte[] bArr) throws zzgzh {
            return (zzm) zzgys.W1(zzi, bArr);
        }

        public static zzm l3(zzgxk zzgxkVar, zzgyc zzgycVar) throws zzgzh {
            return (zzm) zzgys.X1(zzi, zzgxkVar, zzgycVar);
        }

        public static zzm m3(zzgxq zzgxqVar, zzgyc zzgycVar) throws IOException {
            return (zzm) zzgys.Y1(zzi, zzgxqVar, zzgycVar);
        }

        public static zzm n3(InputStream inputStream, zzgyc zzgycVar) throws IOException {
            return (zzm) zzgys.Z1(zzi, inputStream, zzgycVar);
        }

        public static zzm p3(ByteBuffer byteBuffer, zzgyc zzgycVar) throws zzgzh {
            return (zzm) zzgys.a2(zzi, byteBuffer, zzgycVar);
        }

        public static zzm q3(byte[] bArr, zzgyc zzgycVar) throws zzgzh {
            return (zzm) zzgys.b2(zzi, bArr, zzgycVar);
        }

        public static zzhal<zzm> r3() {
            return zzi.t1();
        }

        @Override // com.google.android.gms.internal.ads.zzbca.zzn
        public zzq C() {
            zzq e = zzq.e(this.zzw);
            if (e == null) {
                return zzq.ENUM_UNKNOWN;
            }
            return e;
        }

        @Override // com.google.android.gms.internal.ads.zzbca.zzn
        public boolean D() {
            return (this.zzk & 2) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbca.zzn
        public String F() {
            return this.zzl;
        }

        @Override // com.google.android.gms.internal.ads.zzbca.zzn
        public boolean G() {
            return (this.zzk & 4) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbca.zzn
        public boolean J() {
            return (this.zzk & 8) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbca.zzn
        public zzap L() {
            zzap zzapVar = this.zzm;
            if (zzapVar == null) {
                return zzap.i();
            }
            return zzapVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbca.zzn
        public boolean N() {
            return (this.zzk & 64) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbca.zzn
        public boolean O() {
            return (this.zzk & 16) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbca.zzn
        public boolean P() {
            return (this.zzk & 128) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbca.zzn
        public zzgxk Q() {
            return zzgxk.V(this.zzl);
        }

        @Override // com.google.android.gms.internal.ads.zzbca.zzn
        public zzar R() {
            zzar zzarVar = this.zzo;
            if (zzarVar == null) {
                return zzar.F2();
            }
            return zzarVar;
        }

        public final void R2(zzar zzarVar) {
            zzarVar.getClass();
            zzar zzarVar2 = this.zzo;
            if (zzarVar2 != null && zzarVar2 != zzar.F2()) {
                zzar.zza D2 = zzar.D2(zzarVar2);
                D2.M1(zzarVar);
                zzarVar = D2.o3();
            }
            this.zzo = zzarVar;
            this.zzk |= 8;
        }

        public final void S2(String str) {
            str.getClass();
            this.zzk |= 1;
            this.zzl = str;
        }

        public final void T2(zzgxk zzgxkVar) {
            this.zzl = zzgxkVar.X();
            this.zzk |= 1;
        }

        @Override // com.google.android.gms.internal.ads.zzbca.zzn
        public boolean U() {
            return (this.zzk & 32) != 0;
        }

        public final void U2(zzq zzqVar) {
            this.zzu = zzqVar.a();
            this.zzk |= 32;
        }

        public final void V2(zzq zzqVar) {
            this.zzv = zzqVar.a();
            this.zzk |= 64;
        }

        public final void W2(zzq zzqVar) {
            this.zzw = zzqVar.a();
            this.zzk |= 128;
        }

        public final void X2(zzap zzapVar) {
            zzapVar.getClass();
            this.zzm = zzapVar;
            this.zzk |= 2;
        }

        public final void Y2(int i) {
            this.zzk |= 16;
            this.zzp = i;
        }

        @Override // com.google.android.gms.internal.ads.zzbca.zzn
        public int a() {
            return this.zzp;
        }

        public final void a3(zzar zzarVar) {
            zzarVar.getClass();
            this.zzo = zzarVar;
            this.zzk |= 8;
        }

        @Override // com.google.android.gms.internal.ads.zzbca.zzn
        public int b() {
            return this.zzn;
        }

        @Override // com.google.android.gms.internal.ads.zzbca.zzn
        public boolean h0() {
            return (this.zzk & 1) != 0;
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
                                    zzhal<zzm> zzhalVar2 = zzj;
                                    if (zzhalVar2 == null) {
                                        synchronized (zzm.class) {
                                            try {
                                                zzhalVar = zzj;
                                                if (zzhalVar == null) {
                                                    zzhalVar = new zzgyn(zzi);
                                                    zzj = zzhalVar;
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
                            return zzi;
                        }
                        return new zza();
                    }
                    return new zzm();
                }
                return zzgys.w1(zzi, "\u0004\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0003င\u0002\u0004ဉ\u0003\u0005င\u0004\u0006᠌\u0005\u0007᠌\u0006\b᠌\u0007", new Object[]{"zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzu", zzq.i(), "zzv", zzq.i(), "zzw", zzq.i()});
            }
            return (byte) 1;
        }

        @Override // com.google.android.gms.internal.ads.zzbca.zzn
        public zzq w() {
            zzq e = zzq.e(this.zzv);
            if (e == null) {
                return zzq.ENUM_UNKNOWN;
            }
            return e;
        }

        @Override // com.google.android.gms.internal.ads.zzbca.zzn
        public zzq y() {
            zzq e = zzq.e(this.zzu);
            if (e == null) {
                return zzq.ENUM_UNKNOWN;
            }
            return e;
        }
    }

    /* loaded from: classes2.dex */
    public interface zzn extends zzhae {
        zzq C();

        boolean D();

        String F();

        boolean G();

        boolean J();

        zzap L();

        boolean N();

        boolean O();

        boolean P();

        zzgxk Q();

        zzar R();

        boolean U();

        int a();

        int b();

        boolean h0();

        zzq w();

        zzq y();
    }

    /* loaded from: classes2.dex */
    public final class zzo extends zzgys<zzo, zza> implements zzp {
        public static final int zza = 5;
        public static final int zzb = 6;
        public static final int zzc = 7;
        public static final int zzd = 8;
        private static final zzo zze;
        private static volatile zzhal<zzo> zzf;
        private int zzg;
        private int zzh;
        private zzar zzi;
        private String zzj = "";
        private String zzk = "";

        /* loaded from: classes2.dex */
        public final class zza extends zzgym<zzo, zza> implements zzp {
            public zza Y1() {
                W1();
                ((zzo) this.Y).F2();
                return this;
            }

            public zza Z1() {
                W1();
                ((zzo) this.Y).G2();
                return this;
            }

            public zza a2() {
                W1();
                ((zzo) this.Y).H2();
                return this;
            }

            public zza b2() {
                W1();
                ((zzo) this.Y).I2();
                return this;
            }

            public zza c2(zzar zzarVar) {
                W1();
                ((zzo) this.Y).J2(zzarVar);
                return this;
            }

            public zza d2(String str) {
                W1();
                ((zzo) this.Y).K2(str);
                return this;
            }

            public zza e2(zzgxk zzgxkVar) {
                W1();
                ((zzo) this.Y).L2(zzgxkVar);
                return this;
            }

            public zza f2(zzar.zza zzaVar) {
                W1();
                ((zzo) this.Y).M2(zzaVar.V1());
                return this;
            }

            public zza g2(zzar zzarVar) {
                W1();
                ((zzo) this.Y).M2(zzarVar);
                return this;
            }

            public zza h2(zzb zzbVar) {
                W1();
                ((zzo) this.Y).N2(zzbVar);
                return this;
            }

            public zza j2(String str) {
                W1();
                ((zzo) this.Y).O2(str);
                return this;
            }

            public zza k2(zzgxk zzgxkVar) {
                W1();
                ((zzo) this.Y).P2(zzgxkVar);
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzp
            public zzb m() {
                return ((zzo) this.Y).m();
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzp
            public zzar n() {
                return ((zzo) this.Y).n();
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzp
            public zzgxk o() {
                return ((zzo) this.Y).o();
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzp
            public zzgxk p() {
                return ((zzo) this.Y).p();
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzp
            public boolean q() {
                return ((zzo) this.Y).q();
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzp
            public String r() {
                return ((zzo) this.Y).r();
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzp
            public boolean s() {
                return ((zzo) this.Y).s();
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzp
            public boolean t() {
                return ((zzo) this.Y).t();
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzp
            public boolean v() {
                return ((zzo) this.Y).v();
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzp
            public String x() {
                return ((zzo) this.Y).x();
            }

            private zza() {
                super(zzo.zze);
            }
        }

        /* loaded from: classes2.dex */
        public enum zzb implements zzgyw {
            PLATFORM_UNSPECIFIED(0),
            IOS(1),
            ANDROID(2);
            
            public static final int Z0 = 0;
            public static final int a1 = 1;
            public static final int b1 = 2;
            public static final zzgyx<zzb> c1 = new zzgyx<zzb>() { // from class: com.google.android.gms.internal.ads.zzbca.zzo.zzb.1
                /* renamed from: a */
                public zzb b(int i) {
                    return zzb.e(i);
                }
            };
            public final int X;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* loaded from: classes2.dex */
            public final class zza implements zzgyy {
                public static final zzgyy a = new zza();

                private zza() {
                }

                @Override // com.google.android.gms.internal.ads.zzgyy
                public boolean u(int i) {
                    if (zzb.e(i) != null) {
                        return true;
                    }
                    return false;
                }
            }

            zzb(int i) {
                this.X = i;
            }

            public static zzb e(int i) {
                if (i != 0) {
                    if (i != 1) {
                        if (i != 2) {
                            return null;
                        }
                        return ANDROID;
                    }
                    return IOS;
                }
                return PLATFORM_UNSPECIFIED;
            }

            public static zzgyx<zzb> h() {
                return c1;
            }

            public static zzgyy i() {
                return zza.a;
            }

            @Override // com.google.android.gms.internal.ads.zzgyw
            public final int a() {
                return this.X;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return Integer.toString(this.X);
            }
        }

        static {
            zzo zzoVar = new zzo();
            zze = zzoVar;
            zzgys.F1(zzo.class, zzoVar);
        }

        private zzo() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void F2() {
            this.zzg &= -5;
            this.zzj = T2().r();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void G2() {
            this.zzi = null;
            this.zzg &= -3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void H2() {
            this.zzg &= -2;
            this.zzh = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void I2() {
            this.zzg &= -9;
            this.zzk = T2().x();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void J2(zzar zzarVar) {
            zzarVar.getClass();
            zzar zzarVar2 = this.zzi;
            if (zzarVar2 != null && zzarVar2 != zzar.F2()) {
                zzar.zza D2 = zzar.D2(zzarVar2);
                D2.M1(zzarVar);
                zzarVar = D2.o3();
            }
            this.zzi = zzarVar;
            this.zzg |= 2;
        }

        public static zza Q2() {
            return (zza) zze.f1();
        }

        public static zza R2(zzo zzoVar) {
            return (zza) zze.G1(zzoVar);
        }

        public static zzo T2() {
            return zze;
        }

        public static zzo U2(InputStream inputStream) throws IOException {
            return (zzo) zzgys.Q1(zze, inputStream);
        }

        public static zzo V2(InputStream inputStream, zzgyc zzgycVar) throws IOException {
            return (zzo) zzgys.R1(zze, inputStream, zzgycVar);
        }

        public static zzo W2(zzgxk zzgxkVar) throws zzgzh {
            return (zzo) zzgys.S1(zze, zzgxkVar);
        }

        public static zzo X2(zzgxq zzgxqVar) throws IOException {
            return (zzo) zzgys.T1(zze, zzgxqVar);
        }

        public static zzo Y2(InputStream inputStream) throws IOException {
            return (zzo) zzgys.U1(zze, inputStream);
        }

        public static zzo Z2(ByteBuffer byteBuffer) throws zzgzh {
            return (zzo) zzgys.V1(zze, byteBuffer);
        }

        public static zzo a3(byte[] bArr) throws zzgzh {
            return (zzo) zzgys.W1(zze, bArr);
        }

        public static zzo b3(zzgxk zzgxkVar, zzgyc zzgycVar) throws zzgzh {
            return (zzo) zzgys.X1(zze, zzgxkVar, zzgycVar);
        }

        public static zzo c3(zzgxq zzgxqVar, zzgyc zzgycVar) throws IOException {
            return (zzo) zzgys.Y1(zze, zzgxqVar, zzgycVar);
        }

        public static zzo d3(InputStream inputStream, zzgyc zzgycVar) throws IOException {
            return (zzo) zzgys.Z1(zze, inputStream, zzgycVar);
        }

        public static zzo e3(ByteBuffer byteBuffer, zzgyc zzgycVar) throws zzgzh {
            return (zzo) zzgys.a2(zze, byteBuffer, zzgycVar);
        }

        public static zzo s2(byte[] bArr, zzgyc zzgycVar) throws zzgzh {
            return (zzo) zzgys.b2(zze, bArr, zzgycVar);
        }

        public static zzhal<zzo> t2() {
            return zze.t1();
        }

        public final void K2(String str) {
            str.getClass();
            this.zzg |= 4;
            this.zzj = str;
        }

        public final void L2(zzgxk zzgxkVar) {
            this.zzj = zzgxkVar.X();
            this.zzg |= 4;
        }

        public final void M2(zzar zzarVar) {
            zzarVar.getClass();
            this.zzi = zzarVar;
            this.zzg |= 2;
        }

        public final void N2(zzb zzbVar) {
            this.zzh = zzbVar.a();
            this.zzg |= 1;
        }

        public final void O2(String str) {
            str.getClass();
            this.zzg |= 8;
            this.zzk = str;
        }

        public final void P2(zzgxk zzgxkVar) {
            this.zzk = zzgxkVar.X();
            this.zzg |= 8;
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
                                    zzhal<zzo> zzhalVar2 = zzf;
                                    if (zzhalVar2 == null) {
                                        synchronized (zzo.class) {
                                            try {
                                                zzhalVar = zzf;
                                                if (zzhalVar == null) {
                                                    zzhalVar = new zzgyn(zze);
                                                    zzf = zzhalVar;
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
                            return zze;
                        }
                        return new zza();
                    }
                    return new zzo();
                }
                return zzgys.w1(zze, "\u0004\u0004\u0000\u0001\u0005\b\u0004\u0000\u0000\u0000\u0005᠌\u0000\u0006ဉ\u0001\u0007ဈ\u0002\bဈ\u0003", new Object[]{"zzg", "zzh", zzb.i(), "zzi", "zzj", "zzk"});
            }
            return (byte) 1;
        }

        @Override // com.google.android.gms.internal.ads.zzbca.zzp
        public zzb m() {
            zzb e = zzb.e(this.zzh);
            if (e == null) {
                return zzb.PLATFORM_UNSPECIFIED;
            }
            return e;
        }

        @Override // com.google.android.gms.internal.ads.zzbca.zzp
        public zzar n() {
            zzar zzarVar = this.zzi;
            if (zzarVar == null) {
                return zzar.F2();
            }
            return zzarVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbca.zzp
        public zzgxk o() {
            return zzgxk.V(this.zzk);
        }

        @Override // com.google.android.gms.internal.ads.zzbca.zzp
        public zzgxk p() {
            return zzgxk.V(this.zzj);
        }

        @Override // com.google.android.gms.internal.ads.zzbca.zzp
        public boolean q() {
            return (this.zzg & 8) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbca.zzp
        public String r() {
            return this.zzj;
        }

        @Override // com.google.android.gms.internal.ads.zzbca.zzp
        public boolean s() {
            return (this.zzg & 4) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbca.zzp
        public boolean t() {
            return (this.zzg & 1) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbca.zzp
        public boolean v() {
            return (this.zzg & 2) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbca.zzp
        public String x() {
            return this.zzk;
        }
    }

    /* loaded from: classes2.dex */
    public interface zzp extends zzhae {
        zzo.zzb m();

        zzar n();

        zzgxk o();

        zzgxk p();

        boolean q();

        String r();

        boolean s();

        boolean t();

        boolean v();

        String x();
    }

    /* loaded from: classes2.dex */
    public enum zzq implements zzgyw {
        ENUM_FALSE(0),
        ENUM_TRUE(1),
        ENUM_UNKNOWN(1000);
        
        public static final int Z0 = 0;
        public static final int a1 = 1;
        public static final int b1 = 1000;
        public static final zzgyx<zzq> c1 = new zzgyx<zzq>() { // from class: com.google.android.gms.internal.ads.zzbca.zzq.1
            /* renamed from: a */
            public zzq b(int i) {
                return zzq.e(i);
            }
        };
        public final int X;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes2.dex */
        public final class zza implements zzgyy {
            public static final zzgyy a = new zza();

            private zza() {
            }

            @Override // com.google.android.gms.internal.ads.zzgyy
            public boolean u(int i) {
                if (zzq.e(i) != null) {
                    return true;
                }
                return false;
            }
        }

        zzq(int i) {
            this.X = i;
        }

        public static zzq e(int i) {
            if (i != 0) {
                if (i != 1) {
                    if (i != 1000) {
                        return null;
                    }
                    return ENUM_UNKNOWN;
                }
                return ENUM_TRUE;
            }
            return ENUM_FALSE;
        }

        public static zzgyx<zzq> h() {
            return c1;
        }

        public static zzgyy i() {
            return zza.a;
        }

        @Override // com.google.android.gms.internal.ads.zzgyw
        public final int a() {
            return this.X;
        }

        @Override // java.lang.Enum
        public final String toString() {
            return Integer.toString(this.X);
        }
    }

    /* loaded from: classes2.dex */
    public final class zzr extends zzgys<zzr, zza> implements zzs {
        public static final int zza = 7;
        public static final int zzb = 8;
        public static final int zzc = 9;
        public static final int zzd = 10;
        public static final int zze = 11;
        public static final int zzf = 12;
        public static final int zzg = 13;
        public static final int zzh = 14;
        public static final int zzi = 15;
        public static final int zzj = 16;
        private static final zzgzb<zzd.zza> zzk = new zzgzb<zzd.zza>() { // from class: com.google.android.gms.internal.ads.zzbca.zzr.1
            @Override // com.google.android.gms.internal.ads.zzgzb
            /* renamed from: a */
            public zzd.zza z(int i) {
                zzd.zza e = zzd.zza.e(i);
                if (e == null) {
                    return zzd.zza.AD_FORMAT_TYPE_UNSPECIFIED;
                }
                return e;
            }
        };
        private static final zzgzb<zzd.zza> zzl = new zzgzb<zzd.zza>() { // from class: com.google.android.gms.internal.ads.zzbca.zzr.2
            @Override // com.google.android.gms.internal.ads.zzgzb
            /* renamed from: a */
            public zzd.zza z(int i) {
                zzd.zza e = zzd.zza.e(i);
                if (e == null) {
                    return zzd.zza.AD_FORMAT_TYPE_UNSPECIFIED;
                }
                return e;
            }
        };
        private static final zzr zzm;
        private static volatile zzhal<zzr> zzn;
        private int zzA;
        private int zzo;
        private int zzp;
        private zzar zzv;
        private int zzw;
        private int zzz;
        private String zzu = "";
        private String zzx = "";
        private String zzy = "";
        private zzgza zzB = zzgys.m1();
        private zzgza zzC = zzgys.m1();

        /* loaded from: classes2.dex */
        public final class zza extends zzgym<zzr, zza> implements zzs {
            public zza A2(String str) {
                W1();
                ((zzr) this.Y).M2(str);
                return this;
            }

            public zza B2(zzgxk zzgxkVar) {
                W1();
                ((zzr) this.Y).l3(zzgxkVar);
                return this;
            }

            public zza C2(zzab.zzc zzcVar) {
                W1();
                ((zzr) this.Y).m3(zzcVar);
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzs
            public zzd.zza E(int i) {
                return ((zzr) this.Y).E(i);
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzs
            public zzab.zzc G() {
                return ((zzr) this.Y).G();
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzs
            public zzgxk H() {
                return ((zzr) this.Y).H();
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzs
            public String I() {
                return ((zzr) this.Y).I();
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzs
            public zzar J() {
                return ((zzr) this.Y).J();
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzs
            public zzgxk K() {
                return ((zzr) this.Y).K();
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzs
            public zzgxk M() {
                return ((zzr) this.Y).M();
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzs
            public zzd.zza S(int i) {
                return ((zzr) this.Y).S(i);
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzs
            public String T() {
                return ((zzr) this.Y).T();
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzs
            public boolean V() {
                return ((zzr) this.Y).V();
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzs
            public boolean X() {
                return ((zzr) this.Y).X();
            }

            public zza Y1(String str) {
                W1();
                ((zzr) this.Y).n3(str);
                return this;
            }

            public zza Z1(zzgxk zzgxkVar) {
                W1();
                ((zzr) this.Y).p3(zzgxkVar);
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzs
            public int a() {
                return ((zzr) this.Y).a();
            }

            public zza a2(String str) {
                W1();
                ((zzr) this.Y).q3(str);
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzs
            public int b() {
                return ((zzr) this.Y).b();
            }

            public zza b2(zzgxk zzgxkVar) {
                W1();
                ((zzr) this.Y).r3(zzgxkVar);
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzs
            public int c() {
                return ((zzr) this.Y).c();
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzs
            public boolean c0() {
                return ((zzr) this.Y).c0();
            }

            public zza c2(int i) {
                W1();
                ((zzr) this.Y).s3(i);
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzs
            public String d0() {
                return ((zzr) this.Y).d0();
            }

            public zza d2(zzar.zza zzaVar) {
                W1();
                ((zzr) this.Y).t3(zzaVar.V1());
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzs
            public boolean e0() {
                return ((zzr) this.Y).e0();
            }

            public zza e2(zzar zzarVar) {
                W1();
                ((zzr) this.Y).t3(zzarVar);
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzs
            public zza.EnumC0104zza f() {
                return ((zzr) this.Y).f();
            }

            public zza f2(zzo.zzb zzbVar) {
                W1();
                ((zzr) this.Y).u3(zzbVar);
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzs
            public zzo.zzb g() {
                return ((zzr) this.Y).g();
            }

            public zza g2(int i, zzd.zza zzaVar) {
                W1();
                ((zzr) this.Y).v3(i, zzaVar);
                return this;
            }

            public zza h2(int i, zzd.zza zzaVar) {
                W1();
                ((zzr) this.Y).w3(i, zzaVar);
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzs
            public boolean i0() {
                return ((zzr) this.Y).i0();
            }

            public zza j2(Iterable<? extends zzd.zza> iterable) {
                W1();
                ((zzr) this.Y).d3(iterable);
                return this;
            }

            public zza k2(Iterable<? extends zzd.zza> iterable) {
                W1();
                ((zzr) this.Y).e3(iterable);
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzs
            public boolean l0() {
                return ((zzr) this.Y).l0();
            }

            public zza m2(zzd.zza zzaVar) {
                W1();
                ((zzr) this.Y).f3(zzaVar);
                return this;
            }

            public zza n2(zzd.zza zzaVar) {
                W1();
                ((zzr) this.Y).g3(zzaVar);
                return this;
            }

            public zza o2() {
                W1();
                ((zzr) this.Y).h3();
                return this;
            }

            public zza p2() {
                W1();
                ((zzr) this.Y).i3();
                return this;
            }

            public zza q2() {
                W1();
                ((zzr) this.Y).j3();
                return this;
            }

            public zza r2() {
                W1();
                ((zzr) this.Y).k3();
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzs
            public List<zzd.zza> s0() {
                return ((zzr) this.Y).s0();
            }

            public zza s2() {
                W1();
                ((zzr) this.Y).C2();
                return this;
            }

            public zza t2() {
                W1();
                ((zzr) this.Y).D2();
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzs
            public List<zzd.zza> u0() {
                return ((zzr) this.Y).u0();
            }

            public zza u2() {
                W1();
                ((zzr) this.Y).E2();
                return this;
            }

            public zza v2() {
                W1();
                ((zzr) this.Y).F2();
                return this;
            }

            public zza w2() {
                W1();
                ((zzr) this.Y).G2();
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzs
            public boolean x0() {
                return ((zzr) this.Y).x0();
            }

            public zza x2() {
                W1();
                ((zzr) this.Y).H2();
                return this;
            }

            public zza y2(zzar zzarVar) {
                W1();
                ((zzr) this.Y).K2(zzarVar);
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzs
            public boolean z0() {
                return ((zzr) this.Y).z0();
            }

            public zza z2(zza.EnumC0104zza enumC0104zza) {
                W1();
                ((zzr) this.Y).L2(enumC0104zza);
                return this;
            }

            private zza() {
                super(zzr.zzm);
            }
        }

        static {
            zzr zzrVar = new zzr();
            zzm = zzrVar;
            zzgys.F1(zzr.class, zzrVar);
        }

        private zzr() {
        }

        public static zzr A3() {
            return zzm;
        }

        public static zzr B3(InputStream inputStream) throws IOException {
            return (zzr) zzgys.Q1(zzm, inputStream);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void C2() {
            this.zzo &= -3;
            this.zzu = A3().I();
        }

        public static zzr C3(InputStream inputStream, zzgyc zzgycVar) throws IOException {
            return (zzr) zzgys.R1(zzm, inputStream, zzgycVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void D2() {
            this.zzo &= -2;
            this.zzp = 0;
        }

        public static zzr D3(zzgxk zzgxkVar) throws zzgzh {
            return (zzr) zzgys.S1(zzm, zzgxkVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void E2() {
            this.zzv = null;
            this.zzo &= -5;
        }

        public static zzr E3(zzgxq zzgxqVar) throws IOException {
            return (zzr) zzgys.T1(zzm, zzgxqVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void F2() {
            this.zzo &= -9;
            this.zzw = 0;
        }

        public static zzr F3(InputStream inputStream) throws IOException {
            return (zzr) zzgys.U1(zzm, inputStream);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void G2() {
            this.zzC = zzgys.m1();
        }

        public static zzr G3(ByteBuffer byteBuffer) throws zzgzh {
            return (zzr) zzgys.V1(zzm, byteBuffer);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void H2() {
            this.zzB = zzgys.m1();
        }

        public static zzr H3(byte[] bArr) throws zzgzh {
            return (zzr) zzgys.W1(zzm, bArr);
        }

        private void I2() {
            zzgza zzgzaVar = this.zzC;
            if (!zzgzaVar.c()) {
                this.zzC = zzgys.n1(zzgzaVar);
            }
        }

        public static zzr I3(zzgxk zzgxkVar, zzgyc zzgycVar) throws zzgzh {
            return (zzr) zzgys.X1(zzm, zzgxkVar, zzgycVar);
        }

        private void J2() {
            zzgza zzgzaVar = this.zzB;
            if (!zzgzaVar.c()) {
                this.zzB = zzgys.n1(zzgzaVar);
            }
        }

        public static zzr J3(zzgxq zzgxqVar, zzgyc zzgycVar) throws IOException {
            return (zzr) zzgys.Y1(zzm, zzgxqVar, zzgycVar);
        }

        public static zzr K3(InputStream inputStream, zzgyc zzgycVar) throws IOException {
            return (zzr) zzgys.Z1(zzm, inputStream, zzgycVar);
        }

        public static zzr L3(ByteBuffer byteBuffer, zzgyc zzgycVar) throws zzgzh {
            return (zzr) zzgys.a2(zzm, byteBuffer, zzgycVar);
        }

        public static zzr M3(byte[] bArr, zzgyc zzgycVar) throws zzgzh {
            return (zzr) zzgys.b2(zzm, bArr, zzgycVar);
        }

        public static zzhal<zzr> N3() {
            return zzm.t1();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void i3() {
            this.zzo &= -17;
            this.zzx = A3().T();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void j3() {
            this.zzo &= -65;
            this.zzz = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void k3() {
            this.zzo &= -33;
            this.zzy = A3().d0();
        }

        public static zza x3() {
            return (zza) zzm.f1();
        }

        public static zza y3(zzr zzrVar) {
            return (zza) zzm.G1(zzrVar);
        }

        @Override // com.google.android.gms.internal.ads.zzbca.zzs
        public zzd.zza E(int i) {
            zzd.zza e = zzd.zza.e(this.zzC.A0(i));
            if (e == null) {
                return zzd.zza.AD_FORMAT_TYPE_UNSPECIFIED;
            }
            return e;
        }

        @Override // com.google.android.gms.internal.ads.zzbca.zzs
        public zzab.zzc G() {
            zzab.zzc e = zzab.zzc.e(this.zzz);
            if (e == null) {
                return zzab.zzc.NETWORKTYPE_UNSPECIFIED;
            }
            return e;
        }

        @Override // com.google.android.gms.internal.ads.zzbca.zzs
        public zzgxk H() {
            return zzgxk.V(this.zzu);
        }

        @Override // com.google.android.gms.internal.ads.zzbca.zzs
        public String I() {
            return this.zzu;
        }

        @Override // com.google.android.gms.internal.ads.zzbca.zzs
        public zzar J() {
            zzar zzarVar = this.zzv;
            if (zzarVar == null) {
                return zzar.F2();
            }
            return zzarVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbca.zzs
        public zzgxk K() {
            return zzgxk.V(this.zzx);
        }

        public final void K2(zzar zzarVar) {
            zzarVar.getClass();
            zzar zzarVar2 = this.zzv;
            if (zzarVar2 != null && zzarVar2 != zzar.F2()) {
                zzar.zza D2 = zzar.D2(zzarVar2);
                D2.M1(zzarVar);
                zzarVar = D2.o3();
            }
            this.zzv = zzarVar;
            this.zzo |= 4;
        }

        public final void L2(zza.EnumC0104zza enumC0104zza) {
            this.zzA = enumC0104zza.a();
            this.zzo |= 128;
        }

        @Override // com.google.android.gms.internal.ads.zzbca.zzs
        public zzgxk M() {
            return zzgxk.V(this.zzy);
        }

        public final void M2(String str) {
            str.getClass();
            this.zzo |= 16;
            this.zzx = str;
        }

        @Override // com.google.android.gms.internal.ads.zzbca.zzs
        public zzd.zza S(int i) {
            zzd.zza e = zzd.zza.e(this.zzB.A0(i));
            if (e == null) {
                return zzd.zza.AD_FORMAT_TYPE_UNSPECIFIED;
            }
            return e;
        }

        @Override // com.google.android.gms.internal.ads.zzbca.zzs
        public String T() {
            return this.zzx;
        }

        @Override // com.google.android.gms.internal.ads.zzbca.zzs
        public boolean V() {
            return (this.zzo & 32) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbca.zzs
        public boolean X() {
            return (this.zzo & 128) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbca.zzs
        public int a() {
            return this.zzp;
        }

        @Override // com.google.android.gms.internal.ads.zzbca.zzs
        public int b() {
            return this.zzC.size();
        }

        @Override // com.google.android.gms.internal.ads.zzbca.zzs
        public int c() {
            return this.zzB.size();
        }

        @Override // com.google.android.gms.internal.ads.zzbca.zzs
        public boolean c0() {
            return (this.zzo & 4) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbca.zzs
        public String d0() {
            return this.zzy;
        }

        public final void d3(Iterable<? extends zzd.zza> iterable) {
            I2();
            for (zzd.zza zzaVar : iterable) {
                this.zzC.N(zzaVar.a());
            }
        }

        @Override // com.google.android.gms.internal.ads.zzbca.zzs
        public boolean e0() {
            return (this.zzo & 8) != 0;
        }

        public final void e3(Iterable<? extends zzd.zza> iterable) {
            J2();
            for (zzd.zza zzaVar : iterable) {
                this.zzB.N(zzaVar.a());
            }
        }

        @Override // com.google.android.gms.internal.ads.zzbca.zzs
        public zza.EnumC0104zza f() {
            zza.EnumC0104zza e = zza.EnumC0104zza.e(this.zzA);
            if (e == null) {
                return zza.EnumC0104zza.AD_INITIATER_UNSPECIFIED;
            }
            return e;
        }

        public final void f3(zzd.zza zzaVar) {
            zzaVar.getClass();
            I2();
            this.zzC.N(zzaVar.a());
        }

        @Override // com.google.android.gms.internal.ads.zzbca.zzs
        public zzo.zzb g() {
            zzo.zzb e = zzo.zzb.e(this.zzw);
            if (e == null) {
                return zzo.zzb.PLATFORM_UNSPECIFIED;
            }
            return e;
        }

        public final void g3(zzd.zza zzaVar) {
            zzaVar.getClass();
            J2();
            this.zzB.N(zzaVar.a());
        }

        public final void h3() {
            this.zzo &= -129;
            this.zzA = 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbca.zzs
        public boolean i0() {
            return (this.zzo & 16) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbca.zzs
        public boolean l0() {
            return (this.zzo & 2) != 0;
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
                                    zzhal<zzr> zzhalVar2 = zzn;
                                    if (zzhalVar2 == null) {
                                        synchronized (zzr.class) {
                                            try {
                                                zzhalVar = zzn;
                                                if (zzhalVar == null) {
                                                    zzhalVar = new zzgyn(zzm);
                                                    zzn = zzhalVar;
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
                            return zzm;
                        }
                        return new zza();
                    }
                    return new zzr();
                }
                return zzgys.w1(zzm, "\u0004\n\u0000\u0001\u0007\u0010\n\u0000\u0002\u0000\u0007င\u0000\bဈ\u0001\tဉ\u0002\n᠌\u0003\u000bဈ\u0004\fဈ\u0005\r᠌\u0006\u000e᠌\u0007\u000fࠞ\u0010ࠞ", new Object[]{"zzo", "zzp", "zzu", "zzv", "zzw", zzo.zzb.i(), "zzx", "zzy", "zzz", zzab.zzc.i(), "zzA", zza.EnumC0104zza.i(), "zzB", zzd.zza.i(), "zzC", zzd.zza.i()});
            }
            return (byte) 1;
        }

        public final void l3(zzgxk zzgxkVar) {
            this.zzx = zzgxkVar.X();
            this.zzo |= 16;
        }

        public final void m3(zzab.zzc zzcVar) {
            this.zzz = zzcVar.a();
            this.zzo |= 64;
        }

        public final void n3(String str) {
            str.getClass();
            this.zzo |= 32;
            this.zzy = str;
        }

        public final void p3(zzgxk zzgxkVar) {
            this.zzy = zzgxkVar.X();
            this.zzo |= 32;
        }

        public final void q3(String str) {
            str.getClass();
            this.zzo |= 2;
            this.zzu = str;
        }

        public final void r3(zzgxk zzgxkVar) {
            this.zzu = zzgxkVar.X();
            this.zzo |= 2;
        }

        @Override // com.google.android.gms.internal.ads.zzbca.zzs
        public List<zzd.zza> s0() {
            return new zzgzc(this.zzC, zzl);
        }

        public final void s3(int i) {
            this.zzo |= 1;
            this.zzp = i;
        }

        public final void t3(zzar zzarVar) {
            zzarVar.getClass();
            this.zzv = zzarVar;
            this.zzo |= 4;
        }

        @Override // com.google.android.gms.internal.ads.zzbca.zzs
        public List<zzd.zza> u0() {
            return new zzgzc(this.zzB, zzk);
        }

        public final void u3(zzo.zzb zzbVar) {
            this.zzw = zzbVar.a();
            this.zzo |= 8;
        }

        public final void v3(int i, zzd.zza zzaVar) {
            zzaVar.getClass();
            I2();
            this.zzC.g0(i, zzaVar.a());
        }

        public final void w3(int i, zzd.zza zzaVar) {
            zzaVar.getClass();
            J2();
            this.zzB.g0(i, zzaVar.a());
        }

        @Override // com.google.android.gms.internal.ads.zzbca.zzs
        public boolean x0() {
            return (this.zzo & 64) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbca.zzs
        public boolean z0() {
            return (this.zzo & 1) != 0;
        }
    }

    /* loaded from: classes2.dex */
    public interface zzs extends zzhae {
        zzd.zza E(int i);

        zzab.zzc G();

        zzgxk H();

        String I();

        zzar J();

        zzgxk K();

        zzgxk M();

        zzd.zza S(int i);

        String T();

        boolean V();

        boolean X();

        int a();

        int b();

        int c();

        boolean c0();

        String d0();

        boolean e0();

        zza.EnumC0104zza f();

        zzo.zzb g();

        boolean i0();

        boolean l0();

        List<zzd.zza> s0();

        List<zzd.zza> u0();

        boolean x0();

        boolean z0();
    }

    /* loaded from: classes2.dex */
    public final class zzt extends zzgys<zzt, zza> implements zzu {
        public static final int zza = 9;
        public static final int zzb = 10;
        public static final int zzc = 11;
        public static final int zzd = 12;
        public static final int zze = 13;
        public static final int zzf = 14;
        public static final int zzg = 15;
        public static final int zzh = 16;
        public static final int zzi = 17;
        public static final int zzj = 18;
        public static final int zzk = 19;
        public static final int zzl = 20;
        public static final int zzm = 21;
        private static final zzt zzn;
        private static volatile zzhal<zzt> zzo;
        private zzm zzA;
        private zzo zzB;
        private zzab zzC;
        private zza zzD;
        private zzaf zzE;
        private zzbl zzF;
        private zzb zzG;
        private int zzp;
        private int zzu;
        private int zzw;
        private zzar zzy;
        private String zzv = "";
        private int zzx = 1000;
        private zzgzd zzz = zzgys.o1();

        /* loaded from: classes2.dex */
        public final class zza extends zzgym<zzt, zza> implements zzu {
            @Override // com.google.android.gms.internal.ads.zzbca.zzu
            public long A0(int i) {
                return ((zzt) this.Y).A0(i);
            }

            public zza A2(zzbl.zza zzaVar) {
                W1();
                ((zzt) this.Y).u3(zzaVar.V1());
                return this;
            }

            public zza B2(zzbl zzblVar) {
                W1();
                ((zzt) this.Y).u3(zzblVar);
                return this;
            }

            public zza C2(Iterable<? extends Long> iterable) {
                W1();
                ((zzt) this.Y).W2(iterable);
                return this;
            }

            public zza D2(long j) {
                W1();
                ((zzt) this.Y).X2(j);
                return this;
            }

            public zza E2() {
                W1();
                ((zzt) this.Y).Y2();
                return this;
            }

            public zza F2() {
                W1();
                ((zzt) this.Y).Z2();
                return this;
            }

            public zza G2() {
                W1();
                ((zzt) this.Y).a3();
                return this;
            }

            public zza H2() {
                W1();
                ((zzt) this.Y).b3();
                return this;
            }

            public zza I2() {
                W1();
                ((zzt) this.Y).c3();
                return this;
            }

            public zza J2() {
                W1();
                ((zzt) this.Y).v3();
                return this;
            }

            public zza K2() {
                W1();
                ((zzt) this.Y).w3();
                return this;
            }

            public zza L2() {
                W1();
                ((zzt) this.Y).x3();
                return this;
            }

            public zza M2() {
                W1();
                ((zzt) this.Y).y3();
                return this;
            }

            public zza N2() {
                W1();
                ((zzt) this.Y).z3();
                return this;
            }

            public zza O2() {
                W1();
                ((zzt) this.Y).A3();
                return this;
            }

            public zza P2() {
                W1();
                ((zzt) this.Y).B3();
                return this;
            }

            public zza Q2() {
                W1();
                ((zzt) this.Y).C3();
                return this;
            }

            public zza R2(zza zzaVar) {
                W1();
                ((zzt) this.Y).E3(zzaVar);
                return this;
            }

            public zza S2(zzb zzbVar) {
                W1();
                ((zzt) this.Y).F3(zzbVar);
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzu
            public String W() {
                return ((zzt) this.Y).W();
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzu
            public zzbl Y() {
                return ((zzt) this.Y).Y();
            }

            public zza Y1(zzm zzmVar) {
                W1();
                ((zzt) this.Y).G3(zzmVar);
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzu
            public boolean Z() {
                return ((zzt) this.Y).Z();
            }

            public zza Z1(zzo zzoVar) {
                W1();
                ((zzt) this.Y).H3(zzoVar);
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzu
            public int a() {
                return ((zzt) this.Y).a();
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzu
            public zzab a0() {
                return ((zzt) this.Y).a0();
            }

            public zza a2(zzab zzabVar) {
                W1();
                ((zzt) this.Y).I3(zzabVar);
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzu
            public int b() {
                return ((zzt) this.Y).b();
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzu
            public zzaf b0() {
                return ((zzt) this.Y).b0();
            }

            public zza b2(zzaf zzafVar) {
                W1();
                ((zzt) this.Y).J3(zzafVar);
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzu
            public int c() {
                return ((zzt) this.Y).c();
            }

            public zza c2(zzar zzarVar) {
                W1();
                ((zzt) this.Y).K3(zzarVar);
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzu
            public zza d() {
                return ((zzt) this.Y).d();
            }

            public zza d2(zzbl zzblVar) {
                W1();
                ((zzt) this.Y).L3(zzblVar);
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzu
            public zzb e() {
                return ((zzt) this.Y).e();
            }

            public zza e2(zza.zzb zzbVar) {
                W1();
                ((zzt) this.Y).M3(zzbVar.V1());
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzu
            public zzgxk f0() {
                return ((zzt) this.Y).f0();
            }

            public zza f2(zza zzaVar) {
                W1();
                ((zzt) this.Y).M3(zzaVar);
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzu
            public zzm g() {
                return ((zzt) this.Y).g();
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzu
            public zzar g0() {
                return ((zzt) this.Y).g0();
            }

            public zza g2(zzb.zzc zzcVar) {
                W1();
                ((zzt) this.Y).N3(zzcVar.V1());
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzu
            public zzo h() {
                return ((zzt) this.Y).h();
            }

            public zza h2(zzb zzbVar) {
                W1();
                ((zzt) this.Y).N3(zzbVar);
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzu
            public zzq i() {
                return ((zzt) this.Y).i();
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzu
            public boolean j0() {
                return ((zzt) this.Y).j0();
            }

            public zza j2(zzm.zza zzaVar) {
                W1();
                ((zzt) this.Y).O3(zzaVar.V1());
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzu
            public boolean k0() {
                return ((zzt) this.Y).k0();
            }

            public zza k2(zzm zzmVar) {
                W1();
                ((zzt) this.Y).O3(zzmVar);
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzu
            public List<Long> m0() {
                return Collections.unmodifiableList(((zzt) this.Y).m0());
            }

            public zza m2(zzo.zza zzaVar) {
                W1();
                ((zzt) this.Y).P3(zzaVar.V1());
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzu
            public boolean n0() {
                return ((zzt) this.Y).n0();
            }

            public zza n2(zzo zzoVar) {
                W1();
                ((zzt) this.Y).P3(zzoVar);
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzu
            public boolean o0() {
                return ((zzt) this.Y).o0();
            }

            public zza o2(String str) {
                W1();
                ((zzt) this.Y).k3(str);
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzu
            public boolean p0() {
                return ((zzt) this.Y).p0();
            }

            public zza p2(zzgxk zzgxkVar) {
                W1();
                ((zzt) this.Y).l3(zzgxkVar);
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzu
            public boolean q0() {
                return ((zzt) this.Y).q0();
            }

            public zza q2(int i, long j) {
                W1();
                ((zzt) this.Y).m3(i, j);
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzu
            public boolean r0() {
                return ((zzt) this.Y).r0();
            }

            public zza r2(zzq zzqVar) {
                W1();
                ((zzt) this.Y).n3(zzqVar);
                return this;
            }

            public zza s2(int i) {
                W1();
                ((zzt) this.Y).p3(i);
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzu
            public boolean t0() {
                return ((zzt) this.Y).t0();
            }

            public zza t2(zzab.zza zzaVar) {
                W1();
                ((zzt) this.Y).q3(zzaVar.V1());
                return this;
            }

            public zza u2(zzab zzabVar) {
                W1();
                ((zzt) this.Y).q3(zzabVar);
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzu
            public boolean v0() {
                return ((zzt) this.Y).v0();
            }

            public zza v2(zzaf.zzc zzcVar) {
                W1();
                ((zzt) this.Y).r3(zzcVar.V1());
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzu
            public boolean w0() {
                return ((zzt) this.Y).w0();
            }

            public zza w2(zzaf zzafVar) {
                W1();
                ((zzt) this.Y).r3(zzafVar);
                return this;
            }

            public zza x2(zzar.zza zzaVar) {
                W1();
                ((zzt) this.Y).s3(zzaVar.V1());
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzu
            public boolean y0() {
                return ((zzt) this.Y).y0();
            }

            public zza y2(zzar zzarVar) {
                W1();
                ((zzt) this.Y).s3(zzarVar);
                return this;
            }

            public zza z2(int i) {
                W1();
                ((zzt) this.Y).t3(i);
                return this;
            }

            private zza() {
                super(zzt.zzn);
            }
        }

        static {
            zzt zztVar = new zzt();
            zzn = zztVar;
            zzgys.F1(zzt.class, zztVar);
        }

        private zzt() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void A3() {
            this.zzy = null;
            this.zzp &= -17;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void B3() {
            this.zzp &= -5;
            this.zzw = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void C3() {
            this.zzF = null;
            this.zzp &= -1025;
        }

        private void D3() {
            zzgzd zzgzdVar = this.zzz;
            if (!zzgzdVar.c()) {
                this.zzz = zzgys.p1(zzgzdVar);
            }
        }

        public static zza Q3() {
            return (zza) zzn.f1();
        }

        public static zza R3(zzt zztVar) {
            return (zza) zzn.G1(zztVar);
        }

        public static zzt T3() {
            return zzn;
        }

        public static zzt U3(InputStream inputStream) throws IOException {
            return (zzt) zzgys.Q1(zzn, inputStream);
        }

        public static zzt V3(InputStream inputStream, zzgyc zzgycVar) throws IOException {
            return (zzt) zzgys.R1(zzn, inputStream, zzgycVar);
        }

        public static zzt W3(zzgxk zzgxkVar) throws zzgzh {
            return (zzt) zzgys.S1(zzn, zzgxkVar);
        }

        public static zzt X3(zzgxq zzgxqVar) throws IOException {
            return (zzt) zzgys.T1(zzn, zzgxqVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Y2() {
            this.zzD = null;
            this.zzp &= -257;
        }

        public static zzt Y3(InputStream inputStream) throws IOException {
            return (zzt) zzgys.U1(zzn, inputStream);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Z2() {
            this.zzG = null;
            this.zzp &= -2049;
        }

        public static zzt Z3(ByteBuffer byteBuffer) throws zzgzh {
            return (zzt) zzgys.V1(zzn, byteBuffer);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a3() {
            this.zzA = null;
            this.zzp &= -33;
        }

        public static zzt a4(byte[] bArr) throws zzgzh {
            return (zzt) zzgys.W1(zzn, bArr);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void b3() {
            this.zzB = null;
            this.zzp &= -65;
        }

        public static zzt b4(zzgxk zzgxkVar, zzgyc zzgycVar) throws zzgzh {
            return (zzt) zzgys.X1(zzn, zzgxkVar, zzgycVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void c3() {
            this.zzp &= -3;
            this.zzv = T3().W();
        }

        public static zzt c4(zzgxq zzgxqVar, zzgyc zzgycVar) throws IOException {
            return (zzt) zzgys.Y1(zzn, zzgxqVar, zzgycVar);
        }

        public static zzt d4(InputStream inputStream, zzgyc zzgycVar) throws IOException {
            return (zzt) zzgys.Z1(zzn, inputStream, zzgycVar);
        }

        public static zzt e4(ByteBuffer byteBuffer, zzgyc zzgycVar) throws zzgzh {
            return (zzt) zzgys.a2(zzn, byteBuffer, zzgycVar);
        }

        public static zzt f4(byte[] bArr, zzgyc zzgycVar) throws zzgzh {
            return (zzt) zzgys.b2(zzn, bArr, zzgycVar);
        }

        public static zzhal<zzt> g4() {
            return zzn.t1();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void n3(zzq zzqVar) {
            this.zzx = zzqVar.a();
            this.zzp |= 8;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void v3() {
            this.zzz = zzgys.o1();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void w3() {
            this.zzp &= -9;
            this.zzx = 1000;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void x3() {
            this.zzp &= -2;
            this.zzu = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void y3() {
            this.zzC = null;
            this.zzp &= -129;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void z3() {
            this.zzE = null;
            this.zzp &= -513;
        }

        @Override // com.google.android.gms.internal.ads.zzbca.zzu
        public long A0(int i) {
            return this.zzz.u(i);
        }

        public final void E3(zza zzaVar) {
            zzaVar.getClass();
            zza zzaVar2 = this.zzD;
            if (zzaVar2 != null && zzaVar2 != zza.T3()) {
                zza.zzb R3 = zza.R3(zzaVar2);
                R3.M1(zzaVar);
                zzaVar = R3.o3();
            }
            this.zzD = zzaVar;
            this.zzp |= 256;
        }

        public final void F3(zzb zzbVar) {
            zzbVar.getClass();
            zzb zzbVar2 = this.zzG;
            if (zzbVar2 != null && zzbVar2 != zzb.G2()) {
                zzb.zzc E2 = zzb.E2(zzbVar2);
                E2.M1(zzbVar);
                zzbVar = E2.o3();
            }
            this.zzG = zzbVar;
            this.zzp |= 2048;
        }

        public final void G3(zzm zzmVar) {
            zzmVar.getClass();
            zzm zzmVar2 = this.zzA;
            if (zzmVar2 != null && zzmVar2 != zzm.g()) {
                zzm.zza c3 = zzm.c3(zzmVar2);
                c3.M1(zzmVar);
                zzmVar = c3.o3();
            }
            this.zzA = zzmVar;
            this.zzp |= 32;
        }

        public final void H3(zzo zzoVar) {
            zzoVar.getClass();
            zzo zzoVar2 = this.zzB;
            if (zzoVar2 != null && zzoVar2 != zzo.T2()) {
                zzo.zza R2 = zzo.R2(zzoVar2);
                R2.M1(zzoVar);
                zzoVar = R2.o3();
            }
            this.zzB = zzoVar;
            this.zzp |= 64;
        }

        public final void I3(zzab zzabVar) {
            zzabVar.getClass();
            zzab zzabVar2 = this.zzC;
            if (zzabVar2 != null && zzabVar2 != zzab.y2()) {
                zzab.zza w2 = zzab.w2(zzabVar2);
                w2.M1(zzabVar);
                zzabVar = w2.o3();
            }
            this.zzC = zzabVar;
            this.zzp |= 128;
        }

        public final void J3(zzaf zzafVar) {
            zzafVar.getClass();
            zzaf zzafVar2 = this.zzE;
            if (zzafVar2 != null && zzafVar2 != zzaf.q3()) {
                zzaf.zzc n3 = zzaf.n3(zzafVar2);
                n3.M1(zzafVar);
                zzafVar = n3.o3();
            }
            this.zzE = zzafVar;
            this.zzp |= 512;
        }

        public final void K3(zzar zzarVar) {
            zzarVar.getClass();
            zzar zzarVar2 = this.zzy;
            if (zzarVar2 != null && zzarVar2 != zzar.F2()) {
                zzar.zza D2 = zzar.D2(zzarVar2);
                D2.M1(zzarVar);
                zzarVar = D2.o3();
            }
            this.zzy = zzarVar;
            this.zzp |= 16;
        }

        public final void L3(zzbl zzblVar) {
            zzblVar.getClass();
            zzbl zzblVar2 = this.zzF;
            if (zzblVar2 != null && zzblVar2 != zzbl.z2()) {
                zzbl.zza x2 = zzbl.x2(zzblVar2);
                x2.M1(zzblVar);
                zzblVar = x2.o3();
            }
            this.zzF = zzblVar;
            this.zzp |= 1024;
        }

        public final void M3(zza zzaVar) {
            zzaVar.getClass();
            this.zzD = zzaVar;
            this.zzp |= 256;
        }

        public final void N3(zzb zzbVar) {
            zzbVar.getClass();
            this.zzG = zzbVar;
            this.zzp |= 2048;
        }

        public final void O3(zzm zzmVar) {
            zzmVar.getClass();
            this.zzA = zzmVar;
            this.zzp |= 32;
        }

        public final void P3(zzo zzoVar) {
            zzoVar.getClass();
            this.zzB = zzoVar;
            this.zzp |= 64;
        }

        @Override // com.google.android.gms.internal.ads.zzbca.zzu
        public String W() {
            return this.zzv;
        }

        public final void W2(Iterable<? extends Long> iterable) {
            D3();
            zzgwt.U0(iterable, this.zzz);
        }

        public final void X2(long j) {
            D3();
            this.zzz.t(j);
        }

        @Override // com.google.android.gms.internal.ads.zzbca.zzu
        public zzbl Y() {
            zzbl zzblVar = this.zzF;
            if (zzblVar == null) {
                return zzbl.z2();
            }
            return zzblVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbca.zzu
        public boolean Z() {
            return (this.zzp & 64) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbca.zzu
        public int a() {
            return this.zzz.size();
        }

        @Override // com.google.android.gms.internal.ads.zzbca.zzu
        public zzab a0() {
            zzab zzabVar = this.zzC;
            if (zzabVar == null) {
                return zzab.y2();
            }
            return zzabVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbca.zzu
        public int b() {
            return this.zzu;
        }

        @Override // com.google.android.gms.internal.ads.zzbca.zzu
        public zzaf b0() {
            zzaf zzafVar = this.zzE;
            if (zzafVar == null) {
                return zzaf.q3();
            }
            return zzafVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbca.zzu
        public int c() {
            return this.zzw;
        }

        @Override // com.google.android.gms.internal.ads.zzbca.zzu
        public zza d() {
            zza zzaVar = this.zzD;
            if (zzaVar == null) {
                return zza.T3();
            }
            return zzaVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbca.zzu
        public zzb e() {
            zzb zzbVar = this.zzG;
            if (zzbVar == null) {
                return zzb.G2();
            }
            return zzbVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbca.zzu
        public zzgxk f0() {
            return zzgxk.V(this.zzv);
        }

        @Override // com.google.android.gms.internal.ads.zzbca.zzu
        public zzm g() {
            zzm zzmVar = this.zzA;
            if (zzmVar == null) {
                return zzm.g();
            }
            return zzmVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbca.zzu
        public zzar g0() {
            zzar zzarVar = this.zzy;
            if (zzarVar == null) {
                return zzar.F2();
            }
            return zzarVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbca.zzu
        public zzo h() {
            zzo zzoVar = this.zzB;
            if (zzoVar == null) {
                return zzo.T2();
            }
            return zzoVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbca.zzu
        public zzq i() {
            zzq e = zzq.e(this.zzx);
            if (e == null) {
                return zzq.ENUM_UNKNOWN;
            }
            return e;
        }

        @Override // com.google.android.gms.internal.ads.zzbca.zzu
        public boolean j0() {
            return (this.zzp & 32) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbca.zzu
        public boolean k0() {
            return (this.zzp & 256) != 0;
        }

        public final void k3(String str) {
            str.getClass();
            this.zzp |= 2;
            this.zzv = str;
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
                                    zzhal<zzt> zzhalVar2 = zzo;
                                    if (zzhalVar2 == null) {
                                        synchronized (zzt.class) {
                                            try {
                                                zzhalVar = zzo;
                                                if (zzhalVar == null) {
                                                    zzhalVar = new zzgyn(zzn);
                                                    zzo = zzhalVar;
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
                            return zzn;
                        }
                        return new zza();
                    }
                    return new zzt();
                }
                return zzgys.w1(zzn, "\u0004\r\u0000\u0001\t\u0015\r\u0000\u0001\u0000\tင\u0000\nဈ\u0001\u000bဋ\u0002\f᠌\u0003\rဉ\u0004\u000e\u0015\u000fဉ\u0005\u0010ဉ\u0006\u0011ဉ\u0007\u0012ဉ\b\u0013ဉ\t\u0014ဉ\n\u0015ဉ\u000b", new Object[]{"zzp", "zzu", "zzv", "zzw", "zzx", zzq.i(), "zzy", "zzz", "zzA", "zzB", "zzC", "zzD", "zzE", "zzF", "zzG"});
            }
            return (byte) 1;
        }

        public final void l3(zzgxk zzgxkVar) {
            this.zzv = zzgxkVar.X();
            this.zzp |= 2;
        }

        @Override // com.google.android.gms.internal.ads.zzbca.zzu
        public List<Long> m0() {
            return this.zzz;
        }

        public final void m3(int i, long j) {
            D3();
            this.zzz.c0(i, j);
        }

        @Override // com.google.android.gms.internal.ads.zzbca.zzu
        public boolean n0() {
            return (this.zzp & 1) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbca.zzu
        public boolean o0() {
            return (this.zzp & 128) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbca.zzu
        public boolean p0() {
            return (this.zzp & 2) != 0;
        }

        public final void p3(int i) {
            this.zzp |= 1;
            this.zzu = i;
        }

        @Override // com.google.android.gms.internal.ads.zzbca.zzu
        public boolean q0() {
            return (this.zzp & 8) != 0;
        }

        public final void q3(zzab zzabVar) {
            zzabVar.getClass();
            this.zzC = zzabVar;
            this.zzp |= 128;
        }

        @Override // com.google.android.gms.internal.ads.zzbca.zzu
        public boolean r0() {
            return (this.zzp & 4) != 0;
        }

        public final void r3(zzaf zzafVar) {
            zzafVar.getClass();
            this.zzE = zzafVar;
            this.zzp |= 512;
        }

        public final void s3(zzar zzarVar) {
            zzarVar.getClass();
            this.zzy = zzarVar;
            this.zzp |= 16;
        }

        @Override // com.google.android.gms.internal.ads.zzbca.zzu
        public boolean t0() {
            return (this.zzp & 1024) != 0;
        }

        public final void t3(int i) {
            this.zzp |= 4;
            this.zzw = i;
        }

        public final void u3(zzbl zzblVar) {
            zzblVar.getClass();
            this.zzF = zzblVar;
            this.zzp |= 1024;
        }

        @Override // com.google.android.gms.internal.ads.zzbca.zzu
        public boolean v0() {
            return (this.zzp & 512) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbca.zzu
        public boolean w0() {
            return (this.zzp & 16) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbca.zzu
        public boolean y0() {
            return (this.zzp & 2048) != 0;
        }
    }

    /* loaded from: classes2.dex */
    public interface zzu extends zzhae {
        long A0(int i);

        String W();

        zzbl Y();

        boolean Z();

        int a();

        zzab a0();

        int b();

        zzaf b0();

        int c();

        zza d();

        zzb e();

        zzgxk f0();

        zzm g();

        zzar g0();

        zzo h();

        zzq i();

        boolean j0();

        boolean k0();

        List<Long> m0();

        boolean n0();

        boolean o0();

        boolean p0();

        boolean q0();

        boolean r0();

        boolean t0();

        boolean v0();

        boolean w0();

        boolean y0();
    }

    /* loaded from: classes2.dex */
    public final class zzv extends zzgys<zzv, zza> implements zzw {
        public static final int zza = 1;
        public static final int zzb = 2;
        public static final int zzc = 3;
        public static final int zzd = 4;
        private static final zzv zze;
        private static volatile zzhal<zzv> zzf;
        private int zzg;
        private int zzi;
        private zzap zzk;
        private String zzh = "";
        private zzgza zzj = zzgys.m1();

        /* loaded from: classes2.dex */
        public final class zza extends zzgym<zzv, zza> implements zzw {
            @Override // com.google.android.gms.internal.ads.zzbca.zzw
            public boolean B() {
                return ((zzv) this.Y).B();
            }

            public zza Y1(Iterable<? extends Integer> iterable) {
                W1();
                ((zzv) this.Y).G2(iterable);
                return this;
            }

            public zza Z1(int i) {
                W1();
                ((zzv) this.Y).H2(i);
                return this;
            }

            public zza a2() {
                W1();
                ((zzv) this.Y).I2();
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzw
            public int b() {
                return ((zzv) this.Y).b();
            }

            public zza b2() {
                W1();
                ((zzv) this.Y).J2();
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzw
            public zzq c() {
                return ((zzv) this.Y).c();
            }

            public zza c2() {
                W1();
                ((zzv) this.Y).K2();
                return this;
            }

            public zza d2() {
                W1();
                ((zzv) this.Y).L2();
                return this;
            }

            public zza e2(zzap zzapVar) {
                W1();
                ((zzv) this.Y).N2(zzapVar);
                return this;
            }

            public zza f2(String str) {
                W1();
                ((zzv) this.Y).O2(str);
                return this;
            }

            public zza g2(zzgxk zzgxkVar) {
                W1();
                ((zzv) this.Y).P2(zzgxkVar);
                return this;
            }

            public zza h2(zzap.zza zzaVar) {
                W1();
                ((zzv) this.Y).Q2(zzaVar.V1());
                return this;
            }

            public zza j2(zzap zzapVar) {
                W1();
                ((zzv) this.Y).Q2(zzapVar);
                return this;
            }

            public zza k2(zzq zzqVar) {
                W1();
                ((zzv) this.Y).R2(zzqVar);
                return this;
            }

            public zza m2(int i, int i2) {
                W1();
                ((zzv) this.Y).S2(i, i2);
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzw
            public boolean q() {
                return ((zzv) this.Y).q();
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzw
            public zzap r() {
                return ((zzv) this.Y).r();
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzw
            public String s() {
                return ((zzv) this.Y).s();
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzw
            public boolean t() {
                return ((zzv) this.Y).t();
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzw
            public int u(int i) {
                return ((zzv) this.Y).u(i);
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzw
            public List<Integer> v() {
                return Collections.unmodifiableList(((zzv) this.Y).v());
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzw
            public zzgxk x() {
                return ((zzv) this.Y).x();
            }

            private zza() {
                super(zzv.zze);
            }
        }

        static {
            zzv zzvVar = new zzv();
            zze = zzvVar;
            zzgys.F1(zzv.class, zzvVar);
        }

        private zzv() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void I2() {
            this.zzg &= -2;
            this.zzh = W2().s();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void J2() {
            this.zzk = null;
            this.zzg &= -5;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void K2() {
            this.zzg &= -3;
            this.zzi = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void L2() {
            this.zzj = zzgys.m1();
        }

        private void M2() {
            zzgza zzgzaVar = this.zzj;
            if (!zzgzaVar.c()) {
                this.zzj = zzgys.n1(zzgzaVar);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void O2(String str) {
            str.getClass();
            this.zzg |= 1;
            this.zzh = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void P2(zzgxk zzgxkVar) {
            this.zzh = zzgxkVar.X();
            this.zzg |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void R2(zzq zzqVar) {
            this.zzi = zzqVar.a();
            this.zzg |= 2;
        }

        public static zza T2() {
            return (zza) zze.f1();
        }

        public static zza U2(zzv zzvVar) {
            return (zza) zze.G1(zzvVar);
        }

        public static zzv W2() {
            return zze;
        }

        public static zzv X2(InputStream inputStream) throws IOException {
            return (zzv) zzgys.Q1(zze, inputStream);
        }

        public static zzv Y2(InputStream inputStream, zzgyc zzgycVar) throws IOException {
            return (zzv) zzgys.R1(zze, inputStream, zzgycVar);
        }

        public static zzv Z2(zzgxk zzgxkVar) throws zzgzh {
            return (zzv) zzgys.S1(zze, zzgxkVar);
        }

        public static zzv a3(zzgxq zzgxqVar) throws IOException {
            return (zzv) zzgys.T1(zze, zzgxqVar);
        }

        public static zzv b3(InputStream inputStream) throws IOException {
            return (zzv) zzgys.U1(zze, inputStream);
        }

        public static zzv c3(ByteBuffer byteBuffer) throws zzgzh {
            return (zzv) zzgys.V1(zze, byteBuffer);
        }

        public static zzv d3(byte[] bArr) throws zzgzh {
            return (zzv) zzgys.W1(zze, bArr);
        }

        public static zzv e3(zzgxk zzgxkVar, zzgyc zzgycVar) throws zzgzh {
            return (zzv) zzgys.X1(zze, zzgxkVar, zzgycVar);
        }

        public static zzv f3(zzgxq zzgxqVar, zzgyc zzgycVar) throws IOException {
            return (zzv) zzgys.Y1(zze, zzgxqVar, zzgycVar);
        }

        public static zzv g3(InputStream inputStream, zzgyc zzgycVar) throws IOException {
            return (zzv) zzgys.Z1(zze, inputStream, zzgycVar);
        }

        public static zzv h3(ByteBuffer byteBuffer, zzgyc zzgycVar) throws zzgzh {
            return (zzv) zzgys.a2(zze, byteBuffer, zzgycVar);
        }

        public static zzv s2(byte[] bArr, zzgyc zzgycVar) throws zzgzh {
            return (zzv) zzgys.b2(zze, bArr, zzgycVar);
        }

        public static zzhal<zzv> t2() {
            return zze.t1();
        }

        @Override // com.google.android.gms.internal.ads.zzbca.zzw
        public boolean B() {
            return (this.zzg & 2) != 0;
        }

        public final void G2(Iterable<? extends Integer> iterable) {
            M2();
            zzgwt.U0(iterable, this.zzj);
        }

        public final void H2(int i) {
            M2();
            this.zzj.N(i);
        }

        public final void N2(zzap zzapVar) {
            zzapVar.getClass();
            zzap zzapVar2 = this.zzk;
            if (zzapVar2 != null && zzapVar2 != zzap.i()) {
                zzap.zza x2 = zzap.x2(zzapVar2);
                x2.M1(zzapVar);
                zzapVar = x2.o3();
            }
            this.zzk = zzapVar;
            this.zzg |= 4;
        }

        public final void Q2(zzap zzapVar) {
            zzapVar.getClass();
            this.zzk = zzapVar;
            this.zzg |= 4;
        }

        public final void S2(int i, int i2) {
            M2();
            this.zzj.g0(i, i2);
        }

        @Override // com.google.android.gms.internal.ads.zzbca.zzw
        public int b() {
            return this.zzj.size();
        }

        @Override // com.google.android.gms.internal.ads.zzbca.zzw
        public zzq c() {
            zzq e = zzq.e(this.zzi);
            if (e == null) {
                return zzq.ENUM_FALSE;
            }
            return e;
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
                                    zzhal<zzv> zzhalVar2 = zzf;
                                    if (zzhalVar2 == null) {
                                        synchronized (zzv.class) {
                                            try {
                                                zzhalVar = zzf;
                                                if (zzhalVar == null) {
                                                    zzhalVar = new zzgyn(zze);
                                                    zzf = zzhalVar;
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
                            return zze;
                        }
                        return new zza();
                    }
                    return new zzv();
                }
                return zzgys.w1(zze, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဈ\u0000\u0002᠌\u0001\u0003\u0016\u0004ဉ\u0002", new Object[]{"zzg", "zzh", "zzi", zzq.i(), "zzj", "zzk"});
            }
            return (byte) 1;
        }

        @Override // com.google.android.gms.internal.ads.zzbca.zzw
        public boolean q() {
            return (this.zzg & 4) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbca.zzw
        public zzap r() {
            zzap zzapVar = this.zzk;
            if (zzapVar == null) {
                return zzap.i();
            }
            return zzapVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbca.zzw
        public String s() {
            return this.zzh;
        }

        @Override // com.google.android.gms.internal.ads.zzbca.zzw
        public boolean t() {
            return (this.zzg & 1) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbca.zzw
        public int u(int i) {
            return this.zzj.A0(i);
        }

        @Override // com.google.android.gms.internal.ads.zzbca.zzw
        public List<Integer> v() {
            return this.zzj;
        }

        @Override // com.google.android.gms.internal.ads.zzbca.zzw
        public zzgxk x() {
            return zzgxk.V(this.zzh);
        }
    }

    /* loaded from: classes2.dex */
    public interface zzw extends zzhae {
        boolean B();

        int b();

        zzq c();

        boolean q();

        zzap r();

        String s();

        boolean t();

        int u(int i);

        List<Integer> v();

        zzgxk x();
    }

    /* loaded from: classes2.dex */
    public final class zzx extends zzgys<zzx, zza> implements zzy {
        public static final int zza = 1;
        public static final int zzb = 2;
        private static final zzx zzc;
        private static volatile zzhal<zzx> zzd;
        private int zze;
        private int zzf;
        private zzgza zzg = zzgys.m1();

        /* loaded from: classes2.dex */
        public final class zza extends zzgym<zzx, zza> implements zzy {
            public zza Y1(Iterable<? extends Integer> iterable) {
                W1();
                ((zzx) this.Y).v2(iterable);
                return this;
            }

            public zza Z1(int i) {
                W1();
                ((zzx) this.Y).w2(i);
                return this;
            }

            public zza a2() {
                W1();
                ((zzx) this.Y).x2();
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzy
            public int b() {
                return ((zzx) this.Y).b();
            }

            public zza b2() {
                W1();
                ((zzx) this.Y).y2();
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzy
            public zzq c() {
                return ((zzx) this.Y).c();
            }

            public zza c2(int i, int i2) {
                W1();
                ((zzx) this.Y).A2(i, i2);
                return this;
            }

            public zza d2(zzq zzqVar) {
                W1();
                ((zzx) this.Y).B2(zzqVar);
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzy
            public List<Integer> j() {
                return Collections.unmodifiableList(((zzx) this.Y).j());
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzy
            public boolean k() {
                return ((zzx) this.Y).k();
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzy
            public int u(int i) {
                return ((zzx) this.Y).u(i);
            }

            private zza() {
                super(zzx.zzc);
            }
        }

        static {
            zzx zzxVar = new zzx();
            zzc = zzxVar;
            zzgys.F1(zzx.class, zzxVar);
        }

        private zzx() {
        }

        public static zza C2() {
            return (zza) zzc.f1();
        }

        public static zza D2(zzx zzxVar) {
            return (zza) zzc.G1(zzxVar);
        }

        public static zzx F2() {
            return zzc;
        }

        public static zzx G2(InputStream inputStream) throws IOException {
            return (zzx) zzgys.Q1(zzc, inputStream);
        }

        public static zzx H2(InputStream inputStream, zzgyc zzgycVar) throws IOException {
            return (zzx) zzgys.R1(zzc, inputStream, zzgycVar);
        }

        public static zzx I2(zzgxk zzgxkVar) throws zzgzh {
            return (zzx) zzgys.S1(zzc, zzgxkVar);
        }

        public static zzx J2(zzgxq zzgxqVar) throws IOException {
            return (zzx) zzgys.T1(zzc, zzgxqVar);
        }

        public static zzx K2(InputStream inputStream) throws IOException {
            return (zzx) zzgys.U1(zzc, inputStream);
        }

        public static zzx L2(ByteBuffer byteBuffer) throws zzgzh {
            return (zzx) zzgys.V1(zzc, byteBuffer);
        }

        public static zzx M2(byte[] bArr) throws zzgzh {
            return (zzx) zzgys.W1(zzc, bArr);
        }

        public static zzx N2(zzgxk zzgxkVar, zzgyc zzgycVar) throws zzgzh {
            return (zzx) zzgys.X1(zzc, zzgxkVar, zzgycVar);
        }

        public static zzx O2(zzgxq zzgxqVar, zzgyc zzgycVar) throws IOException {
            return (zzx) zzgys.Y1(zzc, zzgxqVar, zzgycVar);
        }

        public static zzx P2(InputStream inputStream, zzgyc zzgycVar) throws IOException {
            return (zzx) zzgys.Z1(zzc, inputStream, zzgycVar);
        }

        public static zzx Q2(ByteBuffer byteBuffer, zzgyc zzgycVar) throws zzgzh {
            return (zzx) zzgys.a2(zzc, byteBuffer, zzgycVar);
        }

        public static zzx R2(byte[] bArr, zzgyc zzgycVar) throws zzgzh {
            return (zzx) zzgys.b2(zzc, bArr, zzgycVar);
        }

        public static zzhal<zzx> S2() {
            return zzc.t1();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void v2(Iterable<? extends Integer> iterable) {
            z2();
            zzgwt.U0(iterable, this.zzg);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void x2() {
            this.zzg = zzgys.m1();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void y2() {
            this.zze &= -2;
            this.zzf = 0;
        }

        private void z2() {
            zzgza zzgzaVar = this.zzg;
            if (!zzgzaVar.c()) {
                this.zzg = zzgys.n1(zzgzaVar);
            }
        }

        public final void A2(int i, int i2) {
            z2();
            this.zzg.g0(i, i2);
        }

        public final void B2(zzq zzqVar) {
            this.zzf = zzqVar.a();
            this.zze |= 1;
        }

        @Override // com.google.android.gms.internal.ads.zzbca.zzy
        public int b() {
            return this.zzg.size();
        }

        @Override // com.google.android.gms.internal.ads.zzbca.zzy
        public zzq c() {
            zzq e = zzq.e(this.zzf);
            if (e == null) {
                return zzq.ENUM_FALSE;
            }
            return e;
        }

        @Override // com.google.android.gms.internal.ads.zzbca.zzy
        public List<Integer> j() {
            return this.zzg;
        }

        @Override // com.google.android.gms.internal.ads.zzbca.zzy
        public boolean k() {
            return (this.zze & 1) != 0;
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
                                    zzhal<zzx> zzhalVar2 = zzd;
                                    if (zzhalVar2 == null) {
                                        synchronized (zzx.class) {
                                            try {
                                                zzhalVar = zzd;
                                                if (zzhalVar == null) {
                                                    zzhalVar = new zzgyn(zzc);
                                                    zzd = zzhalVar;
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
                            return zzc;
                        }
                        return new zza();
                    }
                    return new zzx();
                }
                return zzgys.w1(zzc, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001᠌\u0000\u0002\u0016", new Object[]{"zze", "zzf", zzq.i(), "zzg"});
            }
            return (byte) 1;
        }

        @Override // com.google.android.gms.internal.ads.zzbca.zzy
        public int u(int i) {
            return this.zzg.A0(i);
        }

        public final void w2(int i) {
            z2();
            this.zzg.N(i);
        }
    }

    /* loaded from: classes2.dex */
    public interface zzy extends zzhae {
        int b();

        zzq c();

        List<Integer> j();

        boolean k();

        int u(int i);
    }

    /* loaded from: classes2.dex */
    public final class zzz extends zzgys<zzz, zza> implements zzaa {
        public static final int zza = 1;
        public static final int zzb = 2;
        public static final int zzc = 3;
        public static final int zzd = 4;
        private static final zzz zze;
        private static volatile zzhal<zzz> zzf;
        private int zzg;
        private zzv zzh;
        private zzgze<zzan> zzi = zzgys.q1();
        private int zzj;
        private zzap zzk;

        /* loaded from: classes2.dex */
        public final class zza extends zzgym<zzz, zza> implements zzaa {
            @Override // com.google.android.gms.internal.ads.zzbca.zzaa
            public boolean C() {
                return ((zzz) this.Y).C();
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzaa
            public boolean L() {
                return ((zzz) this.Y).L();
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzaa
            public zzan L0(int i) {
                return ((zzz) this.Y).L0(i);
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzaa
            public boolean R() {
                return ((zzz) this.Y).R();
            }

            public zza Y1(Iterable<? extends zzan> iterable) {
                W1();
                ((zzz) this.Y).H2(iterable);
                return this;
            }

            public zza Z1(zzan.zza zzaVar) {
                W1();
                ((zzz) this.Y).I2(zzaVar.V1());
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzaa
            public int a() {
                return ((zzz) this.Y).a();
            }

            public zza a2(zzan zzanVar) {
                W1();
                ((zzz) this.Y).I2(zzanVar);
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzaa
            public zzq b() {
                return ((zzz) this.Y).b();
            }

            public zza b2(int i, zzan.zza zzaVar) {
                W1();
                ((zzz) this.Y).J2(i, zzaVar.V1());
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzaa
            public zzv c() {
                return ((zzz) this.Y).c();
            }

            public zza c2(int i, zzan zzanVar) {
                W1();
                ((zzz) this.Y).J2(i, zzanVar);
                return this;
            }

            public zza d2() {
                W1();
                ((zzz) this.Y).K2();
                return this;
            }

            public zza e2() {
                W1();
                ((zzz) this.Y).L2();
                return this;
            }

            public zza f2() {
                W1();
                ((zzz) this.Y).M2();
                return this;
            }

            public zza g2() {
                W1();
                ((zzz) this.Y).N2();
                return this;
            }

            public zza h2(zzv zzvVar) {
                W1();
                ((zzz) this.Y).P2(zzvVar);
                return this;
            }

            public zza j2(zzap zzapVar) {
                W1();
                ((zzz) this.Y).Q2(zzapVar);
                return this;
            }

            public zza k2(int i) {
                W1();
                ((zzz) this.Y).R2(i);
                return this;
            }

            public zza m2(zzv.zza zzaVar) {
                W1();
                ((zzz) this.Y).S2(zzaVar.V1());
                return this;
            }

            public zza n2(zzv zzvVar) {
                W1();
                ((zzz) this.Y).S2(zzvVar);
                return this;
            }

            public zza o2(zzap.zza zzaVar) {
                W1();
                ((zzz) this.Y).T2(zzaVar.V1());
                return this;
            }

            public zza p2(zzap zzapVar) {
                W1();
                ((zzz) this.Y).T2(zzapVar);
                return this;
            }

            public zza q2(zzq zzqVar) {
                W1();
                ((zzz) this.Y).U2(zzqVar);
                return this;
            }

            public zza r2(int i, zzan.zza zzaVar) {
                W1();
                ((zzz) this.Y).V2(i, zzaVar.V1());
                return this;
            }

            public zza s2(int i, zzan zzanVar) {
                W1();
                ((zzz) this.Y).V2(i, zzanVar);
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzaa
            public List<zzan> w() {
                return Collections.unmodifiableList(((zzz) this.Y).w());
            }

            @Override // com.google.android.gms.internal.ads.zzbca.zzaa
            public zzap y() {
                return ((zzz) this.Y).y();
            }

            private zza() {
                super(zzz.zze);
            }
        }

        static {
            zzz zzzVar = new zzz();
            zze = zzzVar;
            zzgys.F1(zzz.class, zzzVar);
        }

        private zzz() {
        }

        public static zza W2() {
            return (zza) zze.f1();
        }

        public static zza X2(zzz zzzVar) {
            return (zza) zze.G1(zzzVar);
        }

        public static zzz Z2() {
            return zze;
        }

        public static zzz a3(InputStream inputStream) throws IOException {
            return (zzz) zzgys.Q1(zze, inputStream);
        }

        public static zzz b3(InputStream inputStream, zzgyc zzgycVar) throws IOException {
            return (zzz) zzgys.R1(zze, inputStream, zzgycVar);
        }

        public static zzz c3(zzgxk zzgxkVar) throws zzgzh {
            return (zzz) zzgys.S1(zze, zzgxkVar);
        }

        public static zzz d3(zzgxq zzgxqVar) throws IOException {
            return (zzz) zzgys.T1(zze, zzgxqVar);
        }

        public static zzz e3(InputStream inputStream) throws IOException {
            return (zzz) zzgys.U1(zze, inputStream);
        }

        public static zzz f3(ByteBuffer byteBuffer) throws zzgzh {
            return (zzz) zzgys.V1(zze, byteBuffer);
        }

        public static zzz g3(byte[] bArr) throws zzgzh {
            return (zzz) zzgys.W1(zze, bArr);
        }

        public static zzz h3(zzgxk zzgxkVar, zzgyc zzgycVar) throws zzgzh {
            return (zzz) zzgys.X1(zze, zzgxkVar, zzgycVar);
        }

        public static zzz i3(zzgxq zzgxqVar, zzgyc zzgycVar) throws IOException {
            return (zzz) zzgys.Y1(zze, zzgxqVar, zzgycVar);
        }

        public static zzz j3(InputStream inputStream, zzgyc zzgycVar) throws IOException {
            return (zzz) zzgys.Z1(zze, inputStream, zzgycVar);
        }

        public static zzz k3(ByteBuffer byteBuffer, zzgyc zzgycVar) throws zzgzh {
            return (zzz) zzgys.a2(zze, byteBuffer, zzgycVar);
        }

        public static zzz l3(byte[] bArr, zzgyc zzgycVar) throws zzgzh {
            return (zzz) zzgys.b2(zze, bArr, zzgycVar);
        }

        public static zzhal<zzz> n3() {
            return zze.t1();
        }

        @Override // com.google.android.gms.internal.ads.zzbca.zzaa
        public boolean C() {
            return (this.zzg & 1) != 0;
        }

        public final void H2(Iterable<? extends zzan> iterable) {
            O2();
            zzgwt.U0(iterable, this.zzi);
        }

        public final void I2(zzan zzanVar) {
            zzanVar.getClass();
            O2();
            this.zzi.add(zzanVar);
        }

        public final void J2(int i, zzan zzanVar) {
            zzanVar.getClass();
            O2();
            this.zzi.add(i, zzanVar);
        }

        public final void K2() {
            this.zzh = null;
            this.zzg &= -2;
        }

        @Override // com.google.android.gms.internal.ads.zzbca.zzaa
        public boolean L() {
            return (this.zzg & 4) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbca.zzaa
        public zzan L0(int i) {
            return this.zzi.get(i);
        }

        public final void L2() {
            this.zzk = null;
            this.zzg &= -5;
        }

        public final void M2() {
            this.zzg &= -3;
            this.zzj = 0;
        }

        public final void N2() {
            this.zzi = zzgys.q1();
        }

        public final void O2() {
            zzgze<zzan> zzgzeVar = this.zzi;
            if (!zzgzeVar.c()) {
                this.zzi = zzgys.r1(zzgzeVar);
            }
        }

        public final void P2(zzv zzvVar) {
            zzvVar.getClass();
            zzv zzvVar2 = this.zzh;
            if (zzvVar2 != null && zzvVar2 != zzv.W2()) {
                zzv.zza U2 = zzv.U2(zzvVar2);
                U2.M1(zzvVar);
                zzvVar = U2.o3();
            }
            this.zzh = zzvVar;
            this.zzg |= 1;
        }

        public final void Q2(zzap zzapVar) {
            zzapVar.getClass();
            zzap zzapVar2 = this.zzk;
            if (zzapVar2 != null && zzapVar2 != zzap.i()) {
                zzap.zza x2 = zzap.x2(zzapVar2);
                x2.M1(zzapVar);
                zzapVar = x2.o3();
            }
            this.zzk = zzapVar;
            this.zzg |= 4;
        }

        @Override // com.google.android.gms.internal.ads.zzbca.zzaa
        public boolean R() {
            return (this.zzg & 2) != 0;
        }

        public final void R2(int i) {
            O2();
            this.zzi.remove(i);
        }

        public final void S2(zzv zzvVar) {
            zzvVar.getClass();
            this.zzh = zzvVar;
            this.zzg |= 1;
        }

        public final void T2(zzap zzapVar) {
            zzapVar.getClass();
            this.zzk = zzapVar;
            this.zzg |= 4;
        }

        public final void U2(zzq zzqVar) {
            this.zzj = zzqVar.a();
            this.zzg |= 2;
        }

        public final void V2(int i, zzan zzanVar) {
            zzanVar.getClass();
            O2();
            this.zzi.set(i, zzanVar);
        }

        @Override // com.google.android.gms.internal.ads.zzbca.zzaa
        public int a() {
            return this.zzi.size();
        }

        @Override // com.google.android.gms.internal.ads.zzbca.zzaa
        public zzq b() {
            zzq e = zzq.e(this.zzj);
            if (e == null) {
                return zzq.ENUM_FALSE;
            }
            return e;
        }

        @Override // com.google.android.gms.internal.ads.zzbca.zzaa
        public zzv c() {
            zzv zzvVar = this.zzh;
            if (zzvVar == null) {
                return zzv.W2();
            }
            return zzvVar;
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
                                    zzhal<zzz> zzhalVar2 = zzf;
                                    if (zzhalVar2 == null) {
                                        synchronized (zzz.class) {
                                            try {
                                                zzhalVar = zzf;
                                                if (zzhalVar == null) {
                                                    zzhalVar = new zzgyn(zze);
                                                    zzf = zzhalVar;
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
                            return zze;
                        }
                        return new zza();
                    }
                    return new zzz();
                }
                return zzgys.w1(zze, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001b\u0003᠌\u0001\u0004ဉ\u0002", new Object[]{"zzg", "zzh", "zzi", zzan.class, "zzj", zzq.i(), "zzk"});
            }
            return (byte) 1;
        }

        public zzao m3(int i) {
            return this.zzi.get(i);
        }

        public List<? extends zzao> s2() {
            return this.zzi;
        }

        @Override // com.google.android.gms.internal.ads.zzbca.zzaa
        public List<zzan> w() {
            return this.zzi;
        }

        @Override // com.google.android.gms.internal.ads.zzbca.zzaa
        public zzap y() {
            zzap zzapVar = this.zzk;
            if (zzapVar == null) {
                return zzap.i();
            }
            return zzapVar;
        }
    }

    private zzbca() {
    }

    public static void a(zzgyc zzgycVar) {
    }
}
