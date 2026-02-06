package o;

import android.annotation.SuppressLint;
import android.content.Context;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.UUID;

@Deprecated
/* renamed from: o.vs  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C10323vs {
    public static final int A = 2;
    public static final int A0 = 14;
    public static final int A1 = 4;
    public static final int A2 = 3;
    public static final int B = 268435456;
    public static final int B0 = 1;
    public static final int B1 = 5;
    public static final int B2 = 0;
    public static final int C = 536870912;
    public static final int C0 = 5;
    public static final int C1 = 6;
    public static final int C2 = -1000;
    public static final int D = 805306368;
    public static final int D0 = 9;
    public static final int D1 = 7;
    public static final int D2 = 0;
    public static final int E = 4;
    public static final int E0 = 8;
    public static final int E1 = 10000;
    public static final int E2 = 1;
    public static final int F = 9;
    public static final int F0 = 7;
    public static final int F1 = -2;
    public static final int F2 = 2;
    public static final int G = 10;
    public static final int G0 = 10;
    public static final int G1 = -1;
    public static final int G2 = 3;
    public static final int H = 11;
    public static final int H0 = 6;
    public static final int H1 = 0;
    public static final int H2 = 4;
    public static final int I = 12;
    public static final int I0 = 0;
    public static final int I1 = 1;
    public static final int I2 = 5;
    public static final int J = 16;
    public static final int J0 = 2;
    public static final int J1 = 2;
    public static final int J2 = 9;
    public static final int K = 15;
    public static final int K0 = 3;
    public static final int K1 = 3;
    public static final int K2 = 10;
    public static final int L = 1073741824;
    public static final int L0 = 1;
    public static final int L1 = 4;
    public static final int L2 = 6;
    public static final int M = 5;
    public static final int M0 = 3;
    public static final int M1 = 5;
    public static final int M2 = 7;
    public static final int N = 6;
    public static final int N0 = 2;
    public static final int N1 = 6;
    public static final int N2 = 8;
    public static final int O = 18;
    public static final int O0 = 1;
    public static final int O1 = 10000;
    public static final int O2 = 0;
    public static final int P = 17;
    public static final int P0 = 4;
    public static final int P1 = 0;
    public static final int P2 = 1;
    public static final int Q = 7;
    public static final int Q0 = 134217728;
    public static final int Q1 = 1;
    public static final int Q2 = 2;
    public static final int R = 8;
    public static final int R0 = 268435456;
    public static final int R1 = 2;
    public static final int R2 = 1;
    public static final int S = 30;
    public static final int S0 = 536870912;
    public static final int S1 = 3;
    public static final int S2 = 2;
    public static final int T = 14;
    public static final int T0 = 1073741824;
    public static final int T1 = 4;
    public static final int T2 = 4;
    public static final int U = 20;
    public static final int U0 = Integer.MIN_VALUE;
    public static final int U1 = 10000;
    public static final int U2 = 8;
    public static final int V = 0;
    public static final int V0 = -1;
    public static final int V1 = 65536;
    public static final int V2 = 16;
    public static final int W = 1;
    public static final int W0 = 0;
    public static final long W1 = 5000;
    public static final int W2 = 32;
    public static final int X = 4;
    public static final int X0 = 1;
    public static final long X1 = 15000;
    public static final int X2 = 64;
    public static final int Y = 8;
    public static final int Y0 = 1;
    public static final long Y1 = 3000;
    public static final int Y2 = 128;
    public static final int Z = 3;
    public static final int Z0 = 2;
    public static final String Z1 = "cenc";
    public static final int Z2 = 256;
    public static final long a = Long.MIN_VALUE;
    public static final int a0 = 5;
    public static final int a1 = 1;
    public static final String a2 = "cbc1";
    public static final int a3 = 512;
    public static final long b = -9223372036854775807L;
    public static final int b0 = 2;
    public static final int b1 = Integer.MIN_VALUE;
    public static final String b2 = "cens";
    public static final int b3 = 1024;
    public static final int c = -1;
    public static final int c0 = 1;
    public static final int c1 = 0;
    public static final String c2 = "cbcs";
    public static final int c3 = 2048;
    @Deprecated
    public static final int d = -1;
    public static final int d0 = 0;
    public static final int d1 = 1;
    public static final int d3 = 4096;
    public static final float e = -3.4028235E38f;
    public static final int e0 = 3;
    public static final int e1 = 2;
    public static final int e3 = 8192;
    public static final int f = -2147483647;
    public static final int f0 = 1;
    public static final int f1 = 4;
    public static final int f3 = 16384;
    public static final int g = -1;
    public static final int g0 = 2;
    public static final String g1 = "und";
    public static final int g3 = 4;
    public static final int h = -1;
    public static final int h0 = 4;
    public static final int h1 = 0;
    public static final int h3 = 3;
    public static final long i = 1000;
    public static final int i0 = 8;
    @Deprecated
    public static final int i1 = 0;
    public static final int i2 = 0;
    public static final int i3 = 2;
    public static final long j = 1000000;
    public static final int j0 = 16;
    public static final int j1 = 1;
    public static final int j2 = 1;
    public static final int j3 = 1;
    public static final long k = 1000000000;
    public static final int k0 = 3;
    @Deprecated
    public static final int k1 = 1;
    public static final int k2 = 2;
    public static final int k3 = 0;
    public static final int l = 8;
    @Deprecated
    public static final int l0 = 3;
    public static final int l1 = 2;
    public static final int l2 = 3;
    public static final int m = 4;
    public static final int m0 = 2;
    @Deprecated
    public static final int m1 = 2;
    public static final int m2 = 2;
    public static final String n = "serif";
    @Deprecated
    public static final int n0 = 2;
    public static final int n1 = 3;
    public static final int n2 = 1;

    /* renamed from: o  reason: collision with root package name */
    public static final String f899o = "sans-serif";
    public static final int o0 = 4;
    @Deprecated
    public static final int o1 = 3;
    public static final int o2 = 6;
    public static final String p = "ssai";
    @Deprecated
    public static final int p0 = 4;
    public static final int p1 = 4;
    public static final int p2 = 1;
    public static final int q = 0;
    public static final int q0 = 1;
    @Deprecated
    public static final int q1 = 4;
    public static final int q2 = 3;
    public static final int r = 1;
    @Deprecated
    public static final int r0 = 1;
    public static final int r1 = -1;
    public static final int r2 = 2;
    public static final int s = 2;
    public static final int s0 = 0;
    public static final int s1 = -2;
    public static final int s2 = 10;
    public static final int t = 10000;
    @Deprecated
    public static final int t0 = 0;
    public static final int t1 = -3;
    public static final int t2 = 6;
    public static final int u = 0;
    public static final int u0 = 1;
    public static final int u1 = -4;
    public static final int u2 = 7;
    public static final int v = 1;
    public static final int v0 = 4;
    public static final int v1 = -5;
    public static final int v2 = 2;
    public static final int w = 2;
    public static final int w0 = 11;
    public static final int w1 = 0;
    public static final int w2 = 1;
    public static final int x = 0;
    public static final int x0 = 12;
    public static final int x1 = 1;
    public static final int x2 = 0;
    public static final int y = 0;
    public static final int y0 = 13;
    public static final int y1 = 2;
    public static final int y2 = 1;
    public static final int z = 3;
    public static final int z0 = 16;
    public static final int z1 = 3;
    public static final int z2 = 2;
    public static final UUID d2 = new UUID(0, 0);
    public static final UUID e2 = new UUID(1186680826959645954L, -5988876978535335093L);
    public static final UUID f2 = new UUID(-2129748144642739255L, 8654423357094679310L);
    public static final UUID g2 = new UUID(-1301668207276963122L, -6645017420763422227L);
    public static final UUID h2 = new UUID(-7348484286925749626L, -6083546864340672619L);

    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @SuppressLint({"UniqueConstants"})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: o.vs$A */
    /* loaded from: classes2.dex */
    public @interface A {
    }

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: o.vs$B */
    /* loaded from: classes2.dex */
    public @interface B {
    }

    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: o.vs$C */
    /* loaded from: classes2.dex */
    public @interface C {
    }

    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: o.vs$a  reason: case insensitive filesystem */
    /* loaded from: classes2.dex */
    public @interface InterfaceC10324a {
    }

    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: o.vs$b  reason: case insensitive filesystem */
    /* loaded from: classes2.dex */
    public @interface InterfaceC10325b {
    }

    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: o.vs$c  reason: case insensitive filesystem */
    /* loaded from: classes2.dex */
    public @interface InterfaceC10326c {
    }

    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: o.vs$d */
    /* loaded from: classes2.dex */
    public @interface d {
    }

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: o.vs$e */
    /* loaded from: classes2.dex */
    public @interface e {
    }

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: o.vs$f */
    /* loaded from: classes2.dex */
    public @interface f {
    }

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: o.vs$g */
    /* loaded from: classes2.dex */
    public @interface g {
    }

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: o.vs$h */
    /* loaded from: classes2.dex */
    public @interface h {
    }

    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: o.vs$i */
    /* loaded from: classes2.dex */
    public @interface i {
    }

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: o.vs$j */
    /* loaded from: classes2.dex */
    public @interface j {
    }

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: o.vs$k */
    /* loaded from: classes2.dex */
    public @interface k {
    }

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: o.vs$l */
    /* loaded from: classes2.dex */
    public @interface l {
    }

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: o.vs$m */
    /* loaded from: classes2.dex */
    public @interface m {
    }

    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: o.vs$n */
    /* loaded from: classes2.dex */
    public @interface n {
    }

    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: o.vs$o */
    /* loaded from: classes2.dex */
    public @interface o {
    }

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: o.vs$p */
    /* loaded from: classes2.dex */
    public @interface p {
    }

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: o.vs$q */
    /* loaded from: classes2.dex */
    public @interface q {
    }

    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: o.vs$r */
    /* loaded from: classes2.dex */
    public @interface r {
    }

    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: o.vs$s */
    /* loaded from: classes2.dex */
    public @interface s {
    }

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: o.vs$t */
    /* loaded from: classes2.dex */
    public @interface t {
    }

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: o.vs$u */
    /* loaded from: classes2.dex */
    public @interface u {
    }

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: o.vs$v */
    /* loaded from: classes2.dex */
    public @interface v {
    }

    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @SuppressLint({"UniqueConstants"})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: o.vs$w */
    /* loaded from: classes2.dex */
    public @interface w {
    }

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: o.vs$x */
    /* loaded from: classes2.dex */
    public @interface x {
    }

    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: o.vs$y */
    /* loaded from: classes2.dex */
    public @interface y {
    }

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: o.vs$z */
    /* loaded from: classes2.dex */
    public @interface z {
    }

    @ES1(21)
    @Deprecated
    @VP0(imports = {"com.google.android.exoplayer2.util.Util"}, replacement = "Util.generateAudioSessionIdV21(context)")
    public static int a(Context context) {
        return TD2.P(context);
    }

    @Deprecated
    @VP0(imports = {"com.google.android.exoplayer2.util.Util"}, replacement = "Util.getErrorCodeForMediaDrmErrorCode(mediaDrmErrorCode)")
    public static int b(int i4) {
        return TD2.l0(i4);
    }

    @Deprecated
    @VP0(imports = {"com.google.android.exoplayer2.util.Util"}, replacement = "Util.getFormatSupportString(formatSupport)")
    public static String c(int i4) {
        return TD2.n0(i4);
    }

    @Deprecated
    @VP0(imports = {"com.google.android.exoplayer2.util.Util"}, replacement = "Util.msToUs(timeMs)")
    public static long d(long j4) {
        return TD2.j1(j4);
    }

    @Deprecated
    @VP0(imports = {"com.google.android.exoplayer2.util.Util"}, replacement = "Util.usToMs(timeUs)")
    public static long e(long j4) {
        return TD2.b2(j4);
    }
}
