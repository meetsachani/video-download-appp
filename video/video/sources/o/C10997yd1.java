package o;

import android.util.Pair;
import android.util.SparseArray;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import o.C10833xx0;
import o.C6960i70;
import o.G;
import o.InterfaceC10568wr2;
import o.KZ1;

@Deprecated
/* renamed from: o.yd1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C10997yd1 implements InterfaceC4324Tj0 {
    public static final String A0 = "A_OPUS";
    public static final int A1 = 131;
    public static final int A2 = 21947;
    public static final String B0 = "A_AAC";
    public static final int B1 = 136;
    public static final int B2 = 21948;
    public static final String C0 = "A_MPEG/L2";
    public static final int C1 = 21930;
    public static final int C2 = 21949;
    public static final String D0 = "A_MPEG/L3";
    public static final int D1 = 2352003;
    public static final int D2 = 21968;
    public static final String E0 = "A_AC3";
    public static final int E1 = 21998;
    public static final int E2 = 21969;
    public static final String F0 = "A_EAC3";
    public static final int F1 = 16868;
    public static final int F2 = 21970;
    public static final String G0 = "A_TRUEHD";
    public static final int G1 = 16871;
    public static final int G2 = 21971;
    public static final String H0 = "A_DTS";
    public static final int H1 = 16877;
    public static final int H2 = 21972;
    public static final String I0 = "A_DTS/EXPRESS";
    public static final int I1 = 21358;
    public static final int I2 = 21973;
    public static final String J0 = "A_DTS/LOSSLESS";
    public static final int J1 = 134;
    public static final int J2 = 21974;
    public static final String K0 = "A_FLAC";
    public static final int K1 = 25506;
    public static final int K2 = 21975;
    public static final String L0 = "A_MS/ACM";
    public static final int L1 = 22186;
    public static final int L2 = 21976;
    public static final String M0 = "A_PCM/INT/LIT";
    public static final int M1 = 22203;
    public static final int M2 = 21977;
    public static final String N0 = "A_PCM/INT/BIG";
    public static final int N1 = 30114;
    public static final int N2 = 21978;
    public static final String O0 = "A_PCM/FLOAT/IEEE";
    public static final int O1 = 224;
    public static final int O2 = 4;
    public static final String P0 = "S_TEXT/UTF8";
    public static final int P1 = 176;
    public static final int P2 = 1685480259;
    public static final String Q0 = "S_TEXT/ASS";
    public static final int Q1 = 186;
    public static final int Q2 = 1685485123;
    public static final String R0 = "S_TEXT/WEBVTT";
    public static final int R1 = 21680;
    public static final int R2 = 0;
    public static final String S0 = "S_VOBSUB";
    public static final int S1 = 21690;
    public static final int S2 = 1;
    public static final String T0 = "S_HDMV/PGS";
    public static final int T1 = 21682;
    public static final int T2 = 2;
    public static final String U0 = "S_DVBSUB";
    public static final int U1 = 225;
    public static final int U2 = 3;
    public static final int V0 = 8192;
    public static final int V1 = 159;
    public static final int V2 = 1482049860;
    public static final int W0 = 5760;
    public static final int W1 = 25188;
    public static final int W2 = 859189832;
    public static final int X0 = 8;
    public static final int X1 = 181;
    public static final int X2 = 826496599;
    public static final int Y0 = 2;
    public static final int Y1 = 28032;
    public static final int Z0 = 440786851;
    public static final int Z1 = 25152;
    public static final int Z2 = 19;
    public static final int a1 = 17143;
    public static final int a2 = 20529;
    public static final long a3 = 1000;
    public static final int b1 = 17026;
    public static final int b2 = 20530;
    public static final String b3 = "%02d:%02d:%02d,%03d";
    public static final int c1 = 17029;
    public static final int c2 = 20532;
    public static final int d1 = 408125543;
    public static final int d2 = 16980;
    public static final int e1 = 357149030;
    public static final int e2 = 16981;
    public static final int e3 = 21;
    public static final int f1 = 290298740;
    public static final int f2 = 20533;
    public static final long f3 = 10000;
    public static final int g0 = 1;
    public static final int g1 = 19899;
    public static final int g2 = 18401;
    public static final String g3 = "%01d:%02d:%02d:%02d";
    public static final String h0 = "MatroskaExtractor";
    public static final int h1 = 21419;
    public static final int h2 = 18402;
    public static final int i0 = -1;
    public static final int i1 = 21420;
    public static final int i2 = 18407;
    public static final int i3 = 25;
    public static final int j0 = 0;
    public static final int j1 = 357149030;
    public static final int j2 = 18408;
    public static final long j3 = 1000;
    public static final int k0 = 1;
    public static final int k1 = 2807729;
    public static final int k2 = 475249515;
    public static final String k3 = "%02d:%02d:%02d.%03d";
    public static final int l0 = 2;
    public static final int l1 = 17545;
    public static final int l2 = 187;
    public static final int l3 = 18;
    public static final String m0 = "matroska";
    public static final int m1 = 524531317;
    public static final int m2 = 179;
    public static final int m3 = 65534;
    public static final String n0 = "webm";
    public static final int n1 = 231;
    public static final int n2 = 183;
    public static final int n3 = 1;
    public static final String o0 = "V_VP8";
    public static final int o1 = 163;
    public static final int o2 = 241;
    public static final String p0 = "V_VP9";
    public static final int p1 = 160;
    public static final int p2 = 2274716;
    public static final Map<String, Integer> p3;
    public static final String q0 = "V_AV1";
    public static final int q1 = 161;
    public static final int q2 = 30320;
    public static final String r0 = "V_MPEG2";
    public static final int r1 = 155;
    public static final int r2 = 30321;
    public static final String s0 = "V_MPEG4/ISO/SP";
    public static final int s1 = 30113;
    public static final int s2 = 30322;
    public static final String t0 = "V_MPEG4/ISO/ASP";
    public static final int t1 = 166;
    public static final int t2 = 30323;
    public static final String u0 = "V_MPEG4/ISO/AP";
    public static final int u1 = 238;
    public static final int u2 = 30324;
    public static final String v0 = "V_MPEG4/ISO/AVC";
    public static final int v1 = 165;
    public static final int v2 = 30325;
    public static final String w0 = "V_MPEGH/ISO/HEVC";
    public static final int w1 = 251;
    public static final int w2 = 21432;
    public static final String x0 = "V_MS/VFW/FOURCC";
    public static final int x1 = 374648427;
    public static final int x2 = 21936;
    public static final String y0 = "V_THEORA";
    public static final int y1 = 174;
    public static final int y2 = 21945;
    public static final String z0 = "A_VORBIS";
    public static final int z1 = 215;
    public static final int z2 = 21946;
    public long A;
    public boolean B;
    public long C;
    public long D;
    public long E;
    @InterfaceC11300zs1
    public C11106z41 F;
    @InterfaceC11300zs1
    public C11106z41 G;
    public boolean H;
    public boolean I;
    public int J;
    public long K;
    public long L;
    public int M;
    public int N;
    public int[] O;
    public int P;
    public int Q;
    public int R;
    public int S;
    public boolean T;
    public long U;
    public int V;
    public int W;
    public int X;
    public boolean Y;
    public boolean Z;
    public boolean a0;
    public int b0;
    public byte c0;
    public final InterfaceC7452k90 d;
    public boolean d0;
    public final JE2 e;
    public InterfaceC4518Vj0 e0;
    public final SparseArray<d> f;
    public final boolean g;
    public final C3012Fy1 h;
    public final C3012Fy1 i;
    public final C3012Fy1 j;
    public final C3012Fy1 k;
    public final C3012Fy1 l;
    public final C3012Fy1 m;
    public final C3012Fy1 n;

    /* renamed from: o  reason: collision with root package name */
    public final C3012Fy1 f918o;
    public final C3012Fy1 p;
    public final C3012Fy1 q;
    public ByteBuffer r;
    public long s;
    public long t;
    public long u;
    public long v;
    public long w;
    @InterfaceC11300zs1
    public d x;
    public boolean y;
    public int z;
    public static final InterfaceC4809Yj0 f0 = new InterfaceC4809Yj0() { // from class: o.xd1
        @Override // o.InterfaceC4809Yj0
        public final InterfaceC4324Tj0[] b() {
            return C10997yd1.c();
        }
    };
    public static final byte[] Y2 = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, C3307Iz.d0, 48, 48, 48, 32, C3307Iz.e0, C3307Iz.e0, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, C3307Iz.d0, 48, 48, 48, 10};
    public static final byte[] c3 = TD2.G0("Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text");
    public static final byte[] d3 = {68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, C3307Iz.d0, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, C3307Iz.d0};
    public static final byte[] h3 = {87, 69, 66, 86, 84, 84, 10, 10, 48, 48, 58, 48, 48, 58, 48, 48, C3307Iz.f0, 48, 48, 48, 32, C3307Iz.e0, C3307Iz.e0, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, C3307Iz.f0, 48, 48, 48, 10};
    public static final UUID o3 = new UUID(72057594037932032L, -9223371306706625679L);

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: o.yd1$b */
    /* loaded from: classes2.dex */
    public @interface b {
    }

    /* renamed from: o.yd1$c */
    /* loaded from: classes2.dex */
    public final class c implements InterfaceC7209j90 {
        public c() {
        }

        @Override // o.InterfaceC7209j90
        public void a(int i) throws C3989Py1 {
            C10997yd1.this.p(i);
        }

        @Override // o.InterfaceC7209j90
        public void b(int i, double d) throws C3989Py1 {
            C10997yd1.this.s(i, d);
        }

        @Override // o.InterfaceC7209j90
        public void c(int i, long j) throws C3989Py1 {
            C10997yd1.this.y(i, j);
        }

        @Override // o.InterfaceC7209j90
        public int d(int i) {
            return C10997yd1.this.v(i);
        }

        @Override // o.InterfaceC7209j90
        public boolean e(int i) {
            return C10997yd1.this.A(i);
        }

        @Override // o.InterfaceC7209j90
        public void f(int i, String str) throws C3989Py1 {
            C10997yd1.this.H(i, str);
        }

        @Override // o.InterfaceC7209j90
        public void g(int i, int i2, InterfaceC4421Uj0 interfaceC4421Uj0) throws IOException {
            C10997yd1.this.m(i, i2, interfaceC4421Uj0);
        }

        @Override // o.InterfaceC7209j90
        public void h(int i, long j, long j2) throws C3989Py1 {
            C10997yd1.this.G(i, j, j2);
        }
    }

    /* renamed from: o.yd1$d */
    /* loaded from: classes2.dex */
    public static final class d {
        public static final int Z = 0;
        public static final int a0 = 50000;
        public static final int b0 = 1000;
        public static final int c0 = 200;
        public byte[] N;
        public Du2 T;
        public boolean U;
        public InterfaceC10568wr2 X;
        public int Y;
        public String a;
        public String b;
        public int c;
        public int d;
        public int e;
        public int f;
        public int g;
        public boolean h;
        public byte[] i;
        public InterfaceC10568wr2.a j;
        public byte[] k;
        public C6960i70 l;
        public int m = -1;
        public int n = -1;

        /* renamed from: o  reason: collision with root package name */
        public int f919o = -1;
        public int p = -1;
        public int q = 0;
        public int r = -1;
        public float s = 0.0f;
        public float t = 0.0f;
        public float u = 0.0f;
        public byte[] v = null;
        public int w = -1;
        public boolean x = false;
        public int y = -1;
        public int z = -1;
        public int A = -1;
        public int B = 1000;
        public int C = 200;
        public float D = -1.0f;
        public float E = -1.0f;
        public float F = -1.0f;
        public float G = -1.0f;
        public float H = -1.0f;
        public float I = -1.0f;
        public float J = -1.0f;
        public float K = -1.0f;
        public float L = -1.0f;
        public float M = -1.0f;
        public int O = 1;
        public int P = -1;
        public int Q = 8000;
        public long R = 0;
        public long S = 0;
        public boolean V = true;
        public String W = "eng";

        public static Pair<String, List<byte[]>> k(C3012Fy1 c3012Fy1) throws C3989Py1 {
            try {
                c3012Fy1.Z(16);
                long A = c3012Fy1.A();
                if (A == 1482049860) {
                    return new Pair<>(C4128Rj1.u, null);
                }
                if (A == 859189832) {
                    return new Pair<>(C4128Rj1.i, null);
                }
                if (A == 826496599) {
                    byte[] e = c3012Fy1.e();
                    for (int f = c3012Fy1.f() + 20; f < e.length - 4; f++) {
                        if (e[f] == 0 && e[f + 1] == 0 && e[f + 2] == 1 && e[f + 3] == 15) {
                            return new Pair<>(C4128Rj1.t, Collections.singletonList(Arrays.copyOfRange(e, f, e.length)));
                        }
                    }
                    throw C3989Py1.a("Failed to find FourCC VC1 initialization data", null);
                }
                I31.n(C10997yd1.h0, "Unknown FourCC. Setting mimeType to video/x-unknown");
                return new Pair<>(C4128Rj1.D, null);
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw C3989Py1.a("Error parsing FourCC private data", null);
            }
        }

        public static boolean l(C3012Fy1 c3012Fy1) throws C3989Py1 {
            try {
                int D = c3012Fy1.D();
                if (D == 1) {
                    return true;
                }
                if (D == 65534) {
                    c3012Fy1.Y(24);
                    if (c3012Fy1.E() == C10997yd1.o3.getMostSignificantBits()) {
                        if (c3012Fy1.E() == C10997yd1.o3.getLeastSignificantBits()) {
                            return true;
                        }
                    }
                }
                return false;
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw C3989Py1.a("Error parsing MS/ACM codec private", null);
            }
        }

        public static List<byte[]> m(byte[] bArr) throws C3989Py1 {
            int i;
            int i2;
            try {
                if (bArr[0] == 2) {
                    int i3 = 0;
                    int i4 = 1;
                    while (true) {
                        i = bArr[i4];
                        if ((i & 255) != 255) {
                            break;
                        }
                        i3 += 255;
                        i4++;
                    }
                    int i5 = i4 + 1;
                    int i6 = i3 + (i & 255);
                    int i7 = 0;
                    while (true) {
                        i2 = bArr[i5];
                        if ((i2 & 255) != 255) {
                            break;
                        }
                        i7 += 255;
                        i5++;
                    }
                    int i8 = i5 + 1;
                    int i9 = i7 + (i2 & 255);
                    if (bArr[i8] == 1) {
                        byte[] bArr2 = new byte[i6];
                        System.arraycopy(bArr, i8, bArr2, 0, i6);
                        int i10 = i8 + i6;
                        if (bArr[i10] == 3) {
                            int i11 = i10 + i9;
                            if (bArr[i11] == 5) {
                                byte[] bArr3 = new byte[bArr.length - i11];
                                System.arraycopy(bArr, i11, bArr3, 0, bArr.length - i11);
                                ArrayList arrayList = new ArrayList(2);
                                arrayList.add(bArr2);
                                arrayList.add(bArr3);
                                return arrayList;
                            }
                            throw C3989Py1.a("Error parsing vorbis codec private", null);
                        }
                        throw C3989Py1.a("Error parsing vorbis codec private", null);
                    }
                    throw C3989Py1.a("Error parsing vorbis codec private", null);
                }
                throw C3989Py1.a("Error parsing vorbis codec private", null);
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw C3989Py1.a("Error parsing vorbis codec private", null);
            }
        }

        @InterfaceC8557od0({"output"})
        public final void f() {
            C9542sf.g(this.X);
        }

        @InterfaceC8557od0({"codecPrivate"})
        public final byte[] g(String str) throws C3989Py1 {
            byte[] bArr = this.k;
            if (bArr != null) {
                return bArr;
            }
            throw C3989Py1.a("Missing CodecPrivate for codec " + str, null);
        }

        @InterfaceC11300zs1
        public final byte[] h() {
            if (this.D != -1.0f && this.E != -1.0f && this.F != -1.0f && this.G != -1.0f && this.H != -1.0f && this.I != -1.0f && this.J != -1.0f && this.K != -1.0f && this.L != -1.0f && this.M != -1.0f) {
                byte[] bArr = new byte[25];
                ByteBuffer order = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
                order.put((byte) 0);
                order.putShort((short) ((this.D * 50000.0f) + 0.5f));
                order.putShort((short) ((this.E * 50000.0f) + 0.5f));
                order.putShort((short) ((this.F * 50000.0f) + 0.5f));
                order.putShort((short) ((this.G * 50000.0f) + 0.5f));
                order.putShort((short) ((this.H * 50000.0f) + 0.5f));
                order.putShort((short) ((this.I * 50000.0f) + 0.5f));
                order.putShort((short) ((this.J * 50000.0f) + 0.5f));
                order.putShort((short) ((this.K * 50000.0f) + 0.5f));
                order.putShort((short) (this.L + 0.5f));
                order.putShort((short) (this.M + 0.5f));
                order.putShort((short) this.B);
                order.putShort((short) this.C);
                return bArr;
            }
            return null;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        @InterfaceC8557od0({"this.output"})
        @HS1({"codecId"})
        public void i(InterfaceC4518Vj0 interfaceC4518Vj0, int i) throws C3989Py1 {
            char c;
            List<byte[]> singletonList;
            String str;
            int i2;
            int i3;
            List<byte[]> list;
            String str2;
            int i4;
            int i5;
            int i6;
            int i7;
            int i8;
            T40 a;
            String str3 = this.b;
            str3.getClass();
            switch (str3.hashCode()) {
                case -2095576542:
                    if (str3.equals(C10997yd1.u0)) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case -2095575984:
                    if (str3.equals(C10997yd1.s0)) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case -1985379776:
                    if (str3.equals(C10997yd1.L0)) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case -1784763192:
                    if (str3.equals(C10997yd1.G0)) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case -1730367663:
                    if (str3.equals(C10997yd1.z0)) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case -1482641358:
                    if (str3.equals(C10997yd1.C0)) {
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                case -1482641357:
                    if (str3.equals(C10997yd1.D0)) {
                        c = 6;
                        break;
                    }
                    c = 65535;
                    break;
                case -1373388978:
                    if (str3.equals(C10997yd1.x0)) {
                        c = 7;
                        break;
                    }
                    c = 65535;
                    break;
                case -933872740:
                    if (str3.equals(C10997yd1.U0)) {
                        c = '\b';
                        break;
                    }
                    c = 65535;
                    break;
                case -538363189:
                    if (str3.equals(C10997yd1.t0)) {
                        c = '\t';
                        break;
                    }
                    c = 65535;
                    break;
                case -538363109:
                    if (str3.equals(C10997yd1.v0)) {
                        c = '\n';
                        break;
                    }
                    c = 65535;
                    break;
                case -425012669:
                    if (str3.equals(C10997yd1.S0)) {
                        c = 11;
                        break;
                    }
                    c = 65535;
                    break;
                case -356037306:
                    if (str3.equals(C10997yd1.J0)) {
                        c = '\f';
                        break;
                    }
                    c = 65535;
                    break;
                case 62923557:
                    if (str3.equals(C10997yd1.B0)) {
                        c = C8206nB.d;
                        break;
                    }
                    c = 65535;
                    break;
                case 62923603:
                    if (str3.equals(C10997yd1.E0)) {
                        c = 14;
                        break;
                    }
                    c = 65535;
                    break;
                case 62927045:
                    if (str3.equals(C10997yd1.H0)) {
                        c = 15;
                        break;
                    }
                    c = 65535;
                    break;
                case 82318131:
                    if (str3.equals(C10997yd1.q0)) {
                        c = 16;
                        break;
                    }
                    c = 65535;
                    break;
                case 82338133:
                    if (str3.equals(C10997yd1.o0)) {
                        c = 17;
                        break;
                    }
                    c = 65535;
                    break;
                case 82338134:
                    if (str3.equals(C10997yd1.p0)) {
                        c = 18;
                        break;
                    }
                    c = 65535;
                    break;
                case 99146302:
                    if (str3.equals(C10997yd1.T0)) {
                        c = 19;
                        break;
                    }
                    c = 65535;
                    break;
                case 444813526:
                    if (str3.equals(C10997yd1.y0)) {
                        c = 20;
                        break;
                    }
                    c = 65535;
                    break;
                case 542569478:
                    if (str3.equals(C10997yd1.I0)) {
                        c = 21;
                        break;
                    }
                    c = 65535;
                    break;
                case 635596514:
                    if (str3.equals(C10997yd1.O0)) {
                        c = 22;
                        break;
                    }
                    c = 65535;
                    break;
                case 725948237:
                    if (str3.equals(C10997yd1.N0)) {
                        c = 23;
                        break;
                    }
                    c = 65535;
                    break;
                case 725957860:
                    if (str3.equals(C10997yd1.M0)) {
                        c = 24;
                        break;
                    }
                    c = 65535;
                    break;
                case 738597099:
                    if (str3.equals(C10997yd1.Q0)) {
                        c = 25;
                        break;
                    }
                    c = 65535;
                    break;
                case 855502857:
                    if (str3.equals(C10997yd1.w0)) {
                        c = 26;
                        break;
                    }
                    c = 65535;
                    break;
                case 1045209816:
                    if (str3.equals(C10997yd1.R0)) {
                        c = 27;
                        break;
                    }
                    c = 65535;
                    break;
                case 1422270023:
                    if (str3.equals(C10997yd1.P0)) {
                        c = C5588cW.n;
                        break;
                    }
                    c = 65535;
                    break;
                case 1809237540:
                    if (str3.equals(C10997yd1.r0)) {
                        c = C5588cW.f706o;
                        break;
                    }
                    c = 65535;
                    break;
                case 1950749482:
                    if (str3.equals(C10997yd1.F0)) {
                        c = C5588cW.p;
                        break;
                    }
                    c = 65535;
                    break;
                case 1950789798:
                    if (str3.equals(C10997yd1.K0)) {
                        c = VN2.b;
                        break;
                    }
                    c = 65535;
                    break;
                case 1951062397:
                    if (str3.equals(C10997yd1.A0)) {
                        c = ' ';
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            String str4 = C4128Rj1.N;
            switch (c) {
                case 0:
                case 1:
                case '\t':
                    byte[] bArr = this.k;
                    singletonList = bArr == null ? null : Collections.singletonList(bArr);
                    str4 = C4128Rj1.p;
                    str = null;
                    i3 = -1;
                    i2 = -1;
                    break;
                case 2:
                    if (l(new C3012Fy1(g(this.b)))) {
                        int u0 = TD2.u0(this.P);
                        if (u0 != 0) {
                            i2 = u0;
                            singletonList = null;
                            str = null;
                            i3 = -1;
                            break;
                        } else {
                            I31.n(C10997yd1.h0, "Unsupported PCM bit depth: " + this.P + ". Setting mimeType to " + C4128Rj1.l0);
                        }
                    } else {
                        I31.n(C10997yd1.h0, "Non-PCM MS/ACM is unsupported. Setting mimeType to " + C4128Rj1.l0);
                    }
                    singletonList = null;
                    str = null;
                    str4 = C4128Rj1.l0;
                    i3 = -1;
                    i2 = -1;
                    break;
                case 3:
                    this.T = new Du2();
                    str4 = C4128Rj1.U;
                    singletonList = null;
                    str = null;
                    i3 = -1;
                    i2 = -1;
                    break;
                case 4:
                    singletonList = m(g(this.b));
                    str4 = "audio/vorbis";
                    i3 = 8192;
                    str = null;
                    i2 = -1;
                    break;
                case 5:
                    str4 = C4128Rj1.K;
                    singletonList = null;
                    str = null;
                    i3 = 4096;
                    i2 = -1;
                    break;
                case 6:
                    str4 = C4128Rj1.I;
                    singletonList = null;
                    str = null;
                    i3 = 4096;
                    i2 = -1;
                    break;
                case 7:
                    Pair<String, List<byte[]>> k = k(new C3012Fy1(g(this.b)));
                    str4 = (String) k.first;
                    singletonList = (List) k.second;
                    str = null;
                    i3 = -1;
                    i2 = -1;
                    break;
                case '\b':
                    byte[] bArr2 = new byte[4];
                    System.arraycopy(g(this.b), 0, bArr2, 0, 4);
                    singletonList = AbstractC5317bO0.M(bArr2);
                    str = null;
                    str4 = C4128Rj1.K0;
                    i3 = -1;
                    i2 = -1;
                    break;
                case '\n':
                    C3932Pj b = C3932Pj.b(new C3012Fy1(g(this.b)));
                    list = b.a;
                    this.Y = b.b;
                    str2 = b.i;
                    str4 = "video/avc";
                    List<byte[]> list2 = list;
                    str = str2;
                    singletonList = list2;
                    i3 = -1;
                    i2 = -1;
                    break;
                case 11:
                    singletonList = AbstractC5317bO0.M(g(this.b));
                    str = null;
                    str4 = C4128Rj1.F0;
                    i3 = -1;
                    i2 = -1;
                    break;
                case '\f':
                    str4 = C4128Rj1.W;
                    singletonList = null;
                    str = null;
                    i3 = -1;
                    i2 = -1;
                    break;
                case '\r':
                    singletonList = Collections.singletonList(g(this.b));
                    G.c f = G.f(this.k);
                    this.Q = f.a;
                    this.O = f.b;
                    str = f.c;
                    str4 = "audio/mp4a-latm";
                    i3 = -1;
                    i2 = -1;
                    break;
                case 14:
                    str4 = C4128Rj1.Q;
                    singletonList = null;
                    str = null;
                    i3 = -1;
                    i2 = -1;
                    break;
                case 15:
                case 21:
                    str4 = C4128Rj1.V;
                    singletonList = null;
                    str = null;
                    i3 = -1;
                    i2 = -1;
                    break;
                case 16:
                    str4 = C4128Rj1.n;
                    singletonList = null;
                    str = null;
                    i3 = -1;
                    i2 = -1;
                    break;
                case 17:
                    str4 = "video/x-vnd.on2.vp8";
                    singletonList = null;
                    str = null;
                    i3 = -1;
                    i2 = -1;
                    break;
                case 18:
                    str4 = C4128Rj1.m;
                    singletonList = null;
                    str = null;
                    i3 = -1;
                    i2 = -1;
                    break;
                case 19:
                    singletonList = null;
                    str = null;
                    str4 = C4128Rj1.G0;
                    i3 = -1;
                    i2 = -1;
                    break;
                case 20:
                    str4 = C4128Rj1.D;
                    singletonList = null;
                    str = null;
                    i3 = -1;
                    i2 = -1;
                    break;
                case 22:
                    if (this.P == 32) {
                        singletonList = null;
                        str = null;
                        i3 = -1;
                        i2 = 4;
                        break;
                    } else {
                        I31.n(C10997yd1.h0, "Unsupported floating point PCM bit depth: " + this.P + ". Setting mimeType to " + C4128Rj1.l0);
                        singletonList = null;
                        str = null;
                        str4 = C4128Rj1.l0;
                        i3 = -1;
                        i2 = -1;
                    }
                case 23:
                    int i9 = this.P;
                    if (i9 == 8) {
                        singletonList = null;
                        str = null;
                        i2 = 3;
                        i3 = -1;
                        break;
                    } else if (i9 == 16) {
                        i4 = 268435456;
                        i2 = i4;
                        singletonList = null;
                        str = null;
                        i3 = -1;
                    } else {
                        I31.n(C10997yd1.h0, "Unsupported big endian PCM bit depth: " + this.P + ". Setting mimeType to " + C4128Rj1.l0);
                        singletonList = null;
                        str = null;
                        str4 = C4128Rj1.l0;
                        i3 = -1;
                        i2 = -1;
                    }
                case 24:
                    i4 = TD2.u0(this.P);
                    if (i4 == 0) {
                        I31.n(C10997yd1.h0, "Unsupported little endian PCM bit depth: " + this.P + ". Setting mimeType to " + C4128Rj1.l0);
                        singletonList = null;
                        str = null;
                        str4 = C4128Rj1.l0;
                        i3 = -1;
                        i2 = -1;
                        break;
                    }
                    i2 = i4;
                    singletonList = null;
                    str = null;
                    i3 = -1;
                case 25:
                    singletonList = AbstractC5317bO0.Q(C10997yd1.c3, g(this.b));
                    str = null;
                    str4 = C4128Rj1.n0;
                    i3 = -1;
                    i2 = -1;
                    break;
                case 26:
                    C10182vH0 a2 = C10182vH0.a(new C3012Fy1(g(this.b)));
                    list = a2.a;
                    this.Y = a2.b;
                    str2 = a2.i;
                    str4 = C4128Rj1.k;
                    List<byte[]> list22 = list;
                    str = str2;
                    singletonList = list22;
                    i3 = -1;
                    i2 = -1;
                    break;
                case 27:
                    str4 = C4128Rj1.m0;
                    singletonList = null;
                    str = null;
                    i3 = -1;
                    i2 = -1;
                    break;
                case 28:
                    str4 = C4128Rj1.z0;
                    singletonList = null;
                    str = null;
                    i3 = -1;
                    i2 = -1;
                    break;
                case 29:
                    str4 = C4128Rj1.s;
                    singletonList = null;
                    str = null;
                    i3 = -1;
                    i2 = -1;
                    break;
                case 30:
                    str4 = C4128Rj1.R;
                    singletonList = null;
                    str = null;
                    i3 = -1;
                    i2 = -1;
                    break;
                case 31:
                    singletonList = Collections.singletonList(g(this.b));
                    str4 = C4128Rj1.e0;
                    str = null;
                    i3 = -1;
                    i2 = -1;
                    break;
                case ' ':
                    singletonList = new ArrayList<>(3);
                    singletonList.add(g(this.b));
                    ByteBuffer allocate = ByteBuffer.allocate(8);
                    ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
                    singletonList.add(allocate.order(byteOrder).putLong(this.R).array());
                    singletonList.add(ByteBuffer.allocate(8).order(byteOrder).putLong(this.S).array());
                    str4 = C4128Rj1.a0;
                    i3 = 5760;
                    str = null;
                    i2 = -1;
                    break;
                default:
                    throw C3989Py1.a("Unrecognized codec identifier.", null);
            }
            if (this.N != null && (a = T40.a(new C3012Fy1(this.N))) != null) {
                str = a.c;
                str4 = C4128Rj1.w;
            }
            String str5 = str4;
            int i10 = (this.U ? 2 : 0) | (this.V ? 1 : 0);
            C10833xx0.b bVar = new C10833xx0.b();
            if (C4128Rj1.p(str5)) {
                bVar.J(this.O).h0(this.Q).a0(i2);
                i5 = 1;
            } else if (C4128Rj1.t(str5)) {
                if (this.q == 0) {
                    int i11 = this.f919o;
                    i6 = -1;
                    if (i11 == -1) {
                        i11 = this.m;
                    }
                    this.f919o = i11;
                    int i12 = this.p;
                    if (i12 == -1) {
                        i12 = this.n;
                    }
                    this.p = i12;
                } else {
                    i6 = -1;
                }
                float f2 = (this.f919o == i6 || (i8 = this.p) == i6) ? -1.0f : (this.n * i7) / (this.m * i8);
                IF r7 = this.x ? new IF(this.y, this.A, this.z, h()) : null;
                if (this.a != null && C10997yd1.p3.containsKey(this.a)) {
                    i6 = ((Integer) C10997yd1.p3.get(this.a)).intValue();
                }
                if (this.r == 0 && Float.compare(this.s, 0.0f) == 0 && Float.compare(this.t, 0.0f) == 0) {
                    if (Float.compare(this.u, 0.0f) == 0) {
                        i6 = 0;
                    } else if (Float.compare(this.t, 90.0f) == 0) {
                        i6 = 90;
                    } else if (Float.compare(this.t, -180.0f) == 0 || Float.compare(this.t, 180.0f) == 0) {
                        i6 = 180;
                    } else if (Float.compare(this.t, -90.0f) == 0) {
                        i6 = C4731Xo.d1;
                    }
                }
                bVar.n0(this.m).S(this.n).c0(f2).f0(i6).d0(this.v).j0(this.w).L(r7);
                i5 = 2;
            } else if (!C4128Rj1.z0.equals(str5) && !C4128Rj1.n0.equals(str5) && !C4128Rj1.m0.equals(str5) && !C4128Rj1.F0.equals(str5) && !C4128Rj1.G0.equals(str5) && !C4128Rj1.K0.equals(str5)) {
                throw C3989Py1.a("Unexpected MIME type.", null);
            } else {
                i5 = 3;
            }
            if (this.a != null && !C10997yd1.p3.containsKey(this.a)) {
                bVar.W(this.a);
            }
            C10833xx0 G = bVar.T(i).g0(str5).Y(i3).X(this.W).i0(i10).V(singletonList).K(str).O(this.l).G();
            InterfaceC10568wr2 b2 = interfaceC4518Vj0.b(this.c, i5);
            this.X = b2;
            b2.a(G);
        }

        @HS1({"output"})
        public void j() {
            Du2 du2 = this.T;
            if (du2 != null) {
                du2.a(this.X, this.j);
            }
        }

        public void n() {
            Du2 du2 = this.T;
            if (du2 != null) {
                du2.b();
            }
        }

        public final boolean o(boolean z) {
            if (C10997yd1.A0.equals(this.b)) {
                return z;
            }
            if (this.f > 0) {
                return true;
            }
            return false;
        }
    }

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("htc_video_rotA-000", 0);
        hashMap.put("htc_video_rotA-090", 90);
        hashMap.put("htc_video_rotA-180", 180);
        hashMap.put("htc_video_rotA-270", Integer.valueOf((int) C4731Xo.d1));
        p3 = Collections.unmodifiableMap(hashMap);
    }

    public C10997yd1() {
        this(0);
    }

    public static void F(String str, long j, byte[] bArr) {
        byte[] t;
        int i;
        str.getClass();
        char c4 = 65535;
        switch (str.hashCode()) {
            case 738597099:
                if (str.equals(Q0)) {
                    c4 = 0;
                    break;
                }
                break;
            case 1045209816:
                if (str.equals(R0)) {
                    c4 = 1;
                    break;
                }
                break;
            case 1422270023:
                if (str.equals(P0)) {
                    c4 = 2;
                    break;
                }
                break;
        }
        switch (c4) {
            case 0:
                t = t(j, g3, 10000L);
                i = 21;
                break;
            case 1:
                t = t(j, k3, 1000L);
                i = 25;
                break;
            case 2:
                t = t(j, b3, 1000L);
                i = 19;
                break;
            default:
                throw new IllegalArgumentException();
        }
        System.arraycopy(t, 0, bArr, i, t.length);
    }

    public static /* synthetic */ InterfaceC4324Tj0[] c() {
        return new InterfaceC4324Tj0[]{new C10997yd1()};
    }

    @InterfaceC8557od0({"extractorOutput"})
    private void l() {
        C9542sf.k(this.e0);
    }

    public static int[] q(@InterfaceC11300zs1 int[] iArr, int i) {
        if (iArr == null) {
            return new int[i];
        }
        if (iArr.length >= i) {
            return iArr;
        }
        return new int[Math.max(iArr.length * 2, i)];
    }

    public static byte[] t(long j, String str, long j4) {
        boolean z;
        if (j != C10323vs.b) {
            z = true;
        } else {
            z = false;
        }
        C9542sf.a(z);
        int i = (int) (j / 3600000000L);
        long j5 = j - (i * 3600000000L);
        int i4 = (int) (j5 / 60000000);
        long j6 = j5 - (i4 * 60000000);
        int i5 = (int) (j6 / 1000000);
        return TD2.G0(String.format(Locale.US, str, Integer.valueOf(i), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf((int) ((j6 - (i5 * 1000000)) / j4))));
    }

    public static boolean z(String str) {
        str.getClass();
        char c4 = 65535;
        switch (str.hashCode()) {
            case -2095576542:
                if (str.equals(u0)) {
                    c4 = 0;
                    break;
                }
                break;
            case -2095575984:
                if (str.equals(s0)) {
                    c4 = 1;
                    break;
                }
                break;
            case -1985379776:
                if (str.equals(L0)) {
                    c4 = 2;
                    break;
                }
                break;
            case -1784763192:
                if (str.equals(G0)) {
                    c4 = 3;
                    break;
                }
                break;
            case -1730367663:
                if (str.equals(z0)) {
                    c4 = 4;
                    break;
                }
                break;
            case -1482641358:
                if (str.equals(C0)) {
                    c4 = 5;
                    break;
                }
                break;
            case -1482641357:
                if (str.equals(D0)) {
                    c4 = 6;
                    break;
                }
                break;
            case -1373388978:
                if (str.equals(x0)) {
                    c4 = 7;
                    break;
                }
                break;
            case -933872740:
                if (str.equals(U0)) {
                    c4 = '\b';
                    break;
                }
                break;
            case -538363189:
                if (str.equals(t0)) {
                    c4 = '\t';
                    break;
                }
                break;
            case -538363109:
                if (str.equals(v0)) {
                    c4 = '\n';
                    break;
                }
                break;
            case -425012669:
                if (str.equals(S0)) {
                    c4 = 11;
                    break;
                }
                break;
            case -356037306:
                if (str.equals(J0)) {
                    c4 = '\f';
                    break;
                }
                break;
            case 62923557:
                if (str.equals(B0)) {
                    c4 = C8206nB.d;
                    break;
                }
                break;
            case 62923603:
                if (str.equals(E0)) {
                    c4 = 14;
                    break;
                }
                break;
            case 62927045:
                if (str.equals(H0)) {
                    c4 = 15;
                    break;
                }
                break;
            case 82318131:
                if (str.equals(q0)) {
                    c4 = 16;
                    break;
                }
                break;
            case 82338133:
                if (str.equals(o0)) {
                    c4 = 17;
                    break;
                }
                break;
            case 82338134:
                if (str.equals(p0)) {
                    c4 = 18;
                    break;
                }
                break;
            case 99146302:
                if (str.equals(T0)) {
                    c4 = 19;
                    break;
                }
                break;
            case 444813526:
                if (str.equals(y0)) {
                    c4 = 20;
                    break;
                }
                break;
            case 542569478:
                if (str.equals(I0)) {
                    c4 = 21;
                    break;
                }
                break;
            case 635596514:
                if (str.equals(O0)) {
                    c4 = 22;
                    break;
                }
                break;
            case 725948237:
                if (str.equals(N0)) {
                    c4 = 23;
                    break;
                }
                break;
            case 725957860:
                if (str.equals(M0)) {
                    c4 = 24;
                    break;
                }
                break;
            case 738597099:
                if (str.equals(Q0)) {
                    c4 = 25;
                    break;
                }
                break;
            case 855502857:
                if (str.equals(w0)) {
                    c4 = 26;
                    break;
                }
                break;
            case 1045209816:
                if (str.equals(R0)) {
                    c4 = 27;
                    break;
                }
                break;
            case 1422270023:
                if (str.equals(P0)) {
                    c4 = C5588cW.n;
                    break;
                }
                break;
            case 1809237540:
                if (str.equals(r0)) {
                    c4 = C5588cW.f706o;
                    break;
                }
                break;
            case 1950749482:
                if (str.equals(F0)) {
                    c4 = C5588cW.p;
                    break;
                }
                break;
            case 1950789798:
                if (str.equals(K0)) {
                    c4 = VN2.b;
                    break;
                }
                break;
            case 1951062397:
                if (str.equals(A0)) {
                    c4 = ' ';
                    break;
                }
                break;
        }
        switch (c4) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case '\b':
            case '\t':
            case '\n':
            case 11:
            case '\f':
            case '\r':
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case ' ':
                return true;
            default:
                return false;
        }
    }

    @InterfaceC2591Bt
    public boolean A(int i) {
        if (i != 357149030 && i != 524531317 && i != 475249515 && i != 374648427) {
            return false;
        }
        return true;
    }

    public final boolean B(KE1 ke1, long j) {
        if (this.B) {
            this.D = j;
            ke1.a = this.C;
            this.B = false;
            return true;
        }
        if (this.y) {
            long j4 = this.D;
            if (j4 != -1) {
                ke1.a = j4;
                this.D = -1L;
                return true;
            }
        }
        return false;
    }

    public final void C(InterfaceC4421Uj0 interfaceC4421Uj0, int i) throws IOException {
        if (this.j.g() >= i) {
            return;
        }
        if (this.j.b() < i) {
            C3012Fy1 c3012Fy1 = this.j;
            c3012Fy1.c(Math.max(c3012Fy1.b() * 2, i));
        }
        interfaceC4421Uj0.readFully(this.j.e(), this.j.g(), i - this.j.g());
        this.j.X(i);
    }

    public final void D() {
        this.V = 0;
        this.W = 0;
        this.X = 0;
        this.Y = false;
        this.Z = false;
        this.a0 = false;
        this.b0 = 0;
        this.c0 = (byte) 0;
        this.d0 = false;
        this.m.U(0);
    }

    public final long E(long j) throws C3989Py1 {
        long j4 = this.u;
        if (j4 != C10323vs.b) {
            return TD2.C1(j, j4, 1000L);
        }
        throw C3989Py1.a("Can't scale timecode prior to timecodeScale being set.", null);
    }

    @InterfaceC2591Bt
    public void G(int i, long j, long j4) throws C3989Py1 {
        l();
        if (i != 160) {
            if (i != 174) {
                if (i != 187) {
                    if (i != 19899) {
                        if (i != 20533) {
                            if (i != 21968) {
                                if (i != 408125543) {
                                    if (i != 475249515) {
                                        if (i == 524531317 && !this.y) {
                                            if (this.g && this.C != -1) {
                                                this.B = true;
                                                return;
                                            }
                                            this.e0.p(new KZ1.b(this.w));
                                            this.y = true;
                                            return;
                                        }
                                        return;
                                    }
                                    this.F = new C11106z41();
                                    this.G = new C11106z41();
                                    return;
                                }
                                long j5 = this.t;
                                if (j5 != -1 && j5 != j) {
                                    throw C3989Py1.a("Multiple Segment elements not supported", null);
                                }
                                this.t = j;
                                this.s = j4;
                                return;
                            }
                            u(i).x = true;
                            return;
                        }
                        u(i).h = true;
                        return;
                    }
                    this.z = -1;
                    this.A = -1L;
                    return;
                }
                this.H = false;
                return;
            }
            this.x = new d();
            return;
        }
        this.T = false;
        this.U = 0L;
    }

    @InterfaceC2591Bt
    public void H(int i, String str) throws C3989Py1 {
        if (i != 134) {
            if (i != 17026) {
                if (i != 21358) {
                    if (i == 2274716) {
                        u(i).W = str;
                        return;
                    }
                    return;
                }
                u(i).a = str;
                return;
            } else if (!n0.equals(str) && !m0.equals(str)) {
                throw C3989Py1.a("DocType " + str + " not supported", null);
            } else {
                return;
            }
        }
        u(i).b = str;
    }

    @HS1({"#2.output"})
    public final int I(InterfaceC4421Uj0 interfaceC4421Uj0, d dVar, int i, boolean z) throws IOException {
        boolean z3;
        int i4;
        if (P0.equals(dVar.b)) {
            J(interfaceC4421Uj0, Y2, i);
            return r();
        } else if (Q0.equals(dVar.b)) {
            J(interfaceC4421Uj0, d3, i);
            return r();
        } else if (R0.equals(dVar.b)) {
            J(interfaceC4421Uj0, h3, i);
            return r();
        } else {
            InterfaceC10568wr2 interfaceC10568wr2 = dVar.X;
            boolean z4 = true;
            if (!this.Y) {
                if (dVar.h) {
                    this.R &= -1073741825;
                    int i5 = 128;
                    if (!this.Z) {
                        interfaceC4421Uj0.readFully(this.j.e(), 0, 1);
                        this.V++;
                        if ((this.j.e()[0] & 128) != 128) {
                            this.c0 = this.j.e()[0];
                            this.Z = true;
                        } else {
                            throw C3989Py1.a("Extension bit is set in signal byte", null);
                        }
                    }
                    byte b4 = this.c0;
                    if ((b4 & 1) == 1) {
                        if ((b4 & 2) == 2) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        this.R |= 1073741824;
                        if (!this.d0) {
                            interfaceC4421Uj0.readFully(this.f918o.e(), 0, 8);
                            this.V += 8;
                            this.d0 = true;
                            byte[] e = this.j.e();
                            if (!z3) {
                                i5 = 0;
                            }
                            e[0] = (byte) (i5 | 8);
                            this.j.Y(0);
                            interfaceC10568wr2.f(this.j, 1, 1);
                            this.W++;
                            this.f918o.Y(0);
                            interfaceC10568wr2.f(this.f918o, 8, 1);
                            this.W += 8;
                        }
                        if (z3) {
                            if (!this.a0) {
                                interfaceC4421Uj0.readFully(this.j.e(), 0, 1);
                                this.V++;
                                this.j.Y(0);
                                this.b0 = this.j.L();
                                this.a0 = true;
                            }
                            int i6 = this.b0 * 4;
                            this.j.U(i6);
                            interfaceC4421Uj0.readFully(this.j.e(), 0, i6);
                            this.V += i6;
                            short s = (short) ((this.b0 / 2) + 1);
                            int i7 = (s * 6) + 2;
                            ByteBuffer byteBuffer = this.r;
                            if (byteBuffer == null || byteBuffer.capacity() < i7) {
                                this.r = ByteBuffer.allocate(i7);
                            }
                            this.r.position(0);
                            this.r.putShort(s);
                            int i8 = 0;
                            int i9 = 0;
                            while (true) {
                                i4 = this.b0;
                                if (i8 >= i4) {
                                    break;
                                }
                                int P = this.j.P();
                                if (i8 % 2 == 0) {
                                    this.r.putShort((short) (P - i9));
                                } else {
                                    this.r.putInt(P - i9);
                                }
                                i8++;
                                i9 = P;
                            }
                            int i10 = (i - this.V) - i9;
                            if (i4 % 2 == 1) {
                                this.r.putInt(i10);
                            } else {
                                this.r.putShort((short) i10);
                                this.r.putInt(0);
                            }
                            this.p.W(this.r.array(), i7);
                            interfaceC10568wr2.f(this.p, i7, 1);
                            this.W += i7;
                        }
                    }
                } else {
                    byte[] bArr = dVar.i;
                    if (bArr != null) {
                        this.m.W(bArr, bArr.length);
                    }
                }
                if (dVar.o(z)) {
                    this.R |= 268435456;
                    this.q.U(0);
                    int g = (this.m.g() + i) - this.V;
                    this.j.U(4);
                    this.j.e()[0] = (byte) ((g >> 24) & 255);
                    this.j.e()[1] = (byte) ((g >> 16) & 255);
                    this.j.e()[2] = (byte) ((g >> 8) & 255);
                    this.j.e()[3] = (byte) (g & 255);
                    interfaceC10568wr2.f(this.j, 4, 2);
                    this.W += 4;
                }
                this.Y = true;
            }
            int g4 = i + this.m.g();
            if (!v0.equals(dVar.b) && !w0.equals(dVar.b)) {
                if (dVar.T != null) {
                    if (this.m.g() != 0) {
                        z4 = false;
                    }
                    C9542sf.i(z4);
                    dVar.T.d(interfaceC4421Uj0);
                }
                while (true) {
                    int i11 = this.V;
                    if (i11 >= g4) {
                        break;
                    }
                    int K = K(interfaceC4421Uj0, interfaceC10568wr2, g4 - i11);
                    this.V += K;
                    this.W += K;
                }
            } else {
                byte[] e4 = this.i.e();
                e4[0] = 0;
                e4[1] = 0;
                e4[2] = 0;
                int i12 = dVar.Y;
                int i13 = 4 - i12;
                while (this.V < g4) {
                    int i14 = this.X;
                    if (i14 == 0) {
                        L(interfaceC4421Uj0, e4, i13, i12);
                        this.V += i12;
                        this.i.Y(0);
                        this.X = this.i.P();
                        this.h.Y(0);
                        interfaceC10568wr2.e(this.h, 4);
                        this.W += 4;
                    } else {
                        int K3 = K(interfaceC4421Uj0, interfaceC10568wr2, i14);
                        this.V += K3;
                        this.W += K3;
                        this.X -= K3;
                    }
                }
            }
            if (z0.equals(dVar.b)) {
                this.k.Y(0);
                interfaceC10568wr2.e(this.k, 4);
                this.W += 4;
            }
            return r();
        }
    }

    public final void J(InterfaceC4421Uj0 interfaceC4421Uj0, byte[] bArr, int i) throws IOException {
        int length = bArr.length + i;
        if (this.n.b() < length) {
            this.n.V(Arrays.copyOf(bArr, length + i));
        } else {
            System.arraycopy(bArr, 0, this.n.e(), 0, bArr.length);
        }
        interfaceC4421Uj0.readFully(this.n.e(), bArr.length, i);
        this.n.Y(0);
        this.n.X(length);
    }

    public final int K(InterfaceC4421Uj0 interfaceC4421Uj0, InterfaceC10568wr2 interfaceC10568wr2, int i) throws IOException {
        int a4 = this.m.a();
        if (a4 > 0) {
            int min = Math.min(i, a4);
            interfaceC10568wr2.e(this.m, min);
            return min;
        }
        return interfaceC10568wr2.c(interfaceC4421Uj0, i, false);
    }

    public final void L(InterfaceC4421Uj0 interfaceC4421Uj0, byte[] bArr, int i, int i4) throws IOException {
        int min = Math.min(i4, this.m.a());
        interfaceC4421Uj0.readFully(bArr, i + min, i4 - min);
        if (min > 0) {
            this.m.n(bArr, i, min);
        }
    }

    @Override // o.InterfaceC4324Tj0
    @InterfaceC2591Bt
    public void a(long j, long j4) {
        this.E = C10323vs.b;
        this.J = 0;
        this.d.reset();
        this.e.e();
        D();
        for (int i = 0; i < this.f.size(); i++) {
            this.f.valueAt(i).n();
        }
    }

    @Override // o.InterfaceC4324Tj0
    public final void b(InterfaceC4518Vj0 interfaceC4518Vj0) {
        this.e0 = interfaceC4518Vj0;
    }

    @Override // o.InterfaceC4324Tj0
    public final boolean d(InterfaceC4421Uj0 interfaceC4421Uj0) throws IOException {
        return new B92().b(interfaceC4421Uj0);
    }

    @InterfaceC8557od0({"cueTimesUs", "cueClusterPositions"})
    public final void i(int i) throws C3989Py1 {
        if (this.F != null && this.G != null) {
            return;
        }
        throw C3989Py1.a("Element " + i + " must be in a Cues", null);
    }

    @Override // o.InterfaceC4324Tj0
    public final int j(InterfaceC4421Uj0 interfaceC4421Uj0, KE1 ke1) throws IOException {
        this.I = false;
        boolean z = true;
        while (z && !this.I) {
            z = this.d.a(interfaceC4421Uj0);
            if (z && B(ke1, interfaceC4421Uj0.getPosition())) {
                return 1;
            }
        }
        if (z) {
            return 0;
        }
        for (int i = 0; i < this.f.size(); i++) {
            d valueAt = this.f.valueAt(i);
            valueAt.f();
            valueAt.j();
        }
        return -1;
    }

    @InterfaceC8557od0({"currentTrack"})
    public final void k(int i) throws C3989Py1 {
        if (this.x != null) {
            return;
        }
        throw C3989Py1.a("Element " + i + " must be in a TrackEntry", null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:94:0x0244, code lost:
        throw o.C3989Py1.a("EBML lacing sample size out of range.", null);
     */
    @InterfaceC2591Bt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m(int i, int i4, InterfaceC4421Uj0 interfaceC4421Uj0) throws IOException {
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        long j;
        int i10;
        int i11;
        int i12;
        int i13;
        InterfaceC4421Uj0 interfaceC4421Uj02 = interfaceC4421Uj0;
        int i14 = 0;
        int i15 = 1;
        if (i != 161 && i != 163) {
            if (i != 165) {
                if (i != 16877) {
                    if (i != 16981) {
                        if (i != 18402) {
                            if (i != 21419) {
                                if (i != 25506) {
                                    if (i == 30322) {
                                        k(i);
                                        byte[] bArr = new byte[i4];
                                        this.x.v = bArr;
                                        interfaceC4421Uj02.readFully(bArr, 0, i4);
                                        return;
                                    }
                                    throw C3989Py1.a("Unexpected id: " + i, null);
                                }
                                k(i);
                                byte[] bArr2 = new byte[i4];
                                this.x.k = bArr2;
                                interfaceC4421Uj02.readFully(bArr2, 0, i4);
                                return;
                            }
                            Arrays.fill(this.l.e(), (byte) 0);
                            interfaceC4421Uj02.readFully(this.l.e(), 4 - i4, i4);
                            this.l.Y(0);
                            this.z = (int) this.l.N();
                            return;
                        }
                        byte[] bArr3 = new byte[i4];
                        interfaceC4421Uj02.readFully(bArr3, 0, i4);
                        u(i).j = new InterfaceC10568wr2.a(1, bArr3, 0, 0);
                        return;
                    }
                    k(i);
                    byte[] bArr4 = new byte[i4];
                    this.x.i = bArr4;
                    interfaceC4421Uj02.readFully(bArr4, 0, i4);
                    return;
                }
                w(u(i), interfaceC4421Uj02, i4);
                return;
            } else if (this.J == 2) {
                x(this.f.get(this.P), this.S, interfaceC4421Uj02, i4);
                return;
            } else {
                return;
            }
        }
        int i16 = 8;
        if (this.J == 0) {
            this.P = (int) this.e.d(interfaceC4421Uj02, false, true, 8);
            this.Q = this.e.b();
            this.L = C10323vs.b;
            this.J = 1;
            this.j.U(0);
        }
        d dVar = this.f.get(this.P);
        if (dVar != null) {
            dVar.f();
            if (this.J == 1) {
                C(interfaceC4421Uj02, 3);
                int i17 = (this.j.e()[2] & 6) >> 1;
                if (i17 == 0) {
                    this.N = 1;
                    int[] q = q(this.O, 1);
                    this.O = q;
                    q[0] = (i4 - this.Q) - 3;
                } else {
                    C(interfaceC4421Uj02, 4);
                    int i18 = (this.j.e()[3] & 255) + 1;
                    this.N = i18;
                    int[] q3 = q(this.O, i18);
                    this.O = q3;
                    if (i17 == 2) {
                        int i19 = this.N;
                        Arrays.fill(q3, 0, i19, ((i4 - this.Q) - 4) / i19);
                    } else if (i17 == 1) {
                        int i20 = 0;
                        int i21 = 0;
                        int i22 = 4;
                        while (true) {
                            i10 = this.N;
                            if (i20 >= i10 - 1) {
                                break;
                            }
                            this.O[i20] = 0;
                            while (true) {
                                i11 = i22 + 1;
                                C(interfaceC4421Uj02, i11);
                                int i23 = this.j.e()[i22] & 255;
                                int[] iArr = this.O;
                                i12 = iArr[i20] + i23;
                                iArr[i20] = i12;
                                if (i23 != 255) {
                                    break;
                                }
                                i22 = i11;
                            }
                            i21 += i12;
                            i20++;
                            i22 = i11;
                        }
                        this.O[i10 - 1] = ((i4 - this.Q) - i22) - i21;
                    } else if (i17 == 3) {
                        int i24 = 0;
                        int i25 = 0;
                        int i26 = 4;
                        while (true) {
                            int i27 = this.N;
                            i5 = i15;
                            if (i24 < i27 - 1) {
                                this.O[i24] = i14;
                                int i28 = i26 + 1;
                                C(interfaceC4421Uj02, i28);
                                if (this.j.e()[i26] != 0) {
                                    int i29 = i14;
                                    while (true) {
                                        if (i29 < i16) {
                                            i8 = i16;
                                            int i30 = i5 << (7 - i29);
                                            i7 = i14;
                                            if ((this.j.e()[i26] & i30) != 0) {
                                                i28 += i29;
                                                C(interfaceC4421Uj02, i28);
                                                int i31 = i26 + 1;
                                                j = this.j.e()[i26] & 255 & (~i30);
                                                while (true) {
                                                    int i32 = i31;
                                                    if (i32 >= i28) {
                                                        break;
                                                    }
                                                    i31 = i32 + 1;
                                                    j = (j << i8) | (this.j.e()[i32] & 255);
                                                    i24 = i24;
                                                }
                                                i9 = i24;
                                                if (i9 > 0) {
                                                    j -= (1 << ((i29 * 7) + 6)) - 1;
                                                }
                                            } else {
                                                i29++;
                                                interfaceC4421Uj02 = interfaceC4421Uj0;
                                                i14 = i7;
                                                i16 = i8;
                                            }
                                        } else {
                                            i7 = i14;
                                            i8 = i16;
                                            i9 = i24;
                                            j = 0;
                                            break;
                                        }
                                    }
                                    i26 = i28;
                                    if (j < -2147483648L || j > 2147483647L) {
                                        break;
                                    }
                                    int i33 = (int) j;
                                    int[] iArr2 = this.O;
                                    if (i9 != 0) {
                                        i33 += iArr2[i9 - 1];
                                    }
                                    iArr2[i9] = i33;
                                    i25 += i33;
                                    i24 = i9 + 1;
                                    interfaceC4421Uj02 = interfaceC4421Uj0;
                                    i15 = i5;
                                    i14 = i7;
                                    i16 = i8;
                                } else {
                                    throw C3989Py1.a("No valid varint length mask found", null);
                                }
                            } else {
                                i6 = i14;
                                this.O[i27 - 1] = ((i4 - this.Q) - i26) - i25;
                                break;
                            }
                        }
                    } else {
                        throw C3989Py1.a("Unexpected lacing value: " + i17, null);
                    }
                }
                i6 = 0;
                i5 = 1;
                this.K = this.E + E((this.j.e()[i6] << 8) | (this.j.e()[i5] & 255));
                if (dVar.d != 2 && (i != 163 || (this.j.e()[2] & 128) != 128)) {
                    i13 = i6;
                } else {
                    i13 = i5;
                }
                this.R = i13;
                this.J = 2;
                this.M = i6;
            } else {
                i5 = 1;
            }
            if (i == 163) {
                while (true) {
                    int i34 = this.M;
                    if (i34 < this.N) {
                        int I = I(interfaceC4421Uj0, dVar, this.O[i34], false);
                        d dVar2 = dVar;
                        o(dVar2, this.K + ((this.M * dVar.e) / 1000), this.R, I, 0);
                        this.M++;
                        dVar = dVar2;
                    } else {
                        this.J = 0;
                        return;
                    }
                }
            } else {
                while (true) {
                    int i35 = this.M;
                    if (i35 < this.N) {
                        int[] iArr3 = this.O;
                        boolean z = i5;
                        iArr3[i35] = I(interfaceC4421Uj0, dVar, iArr3[i35], z);
                        this.M += z ? 1 : 0;
                    } else {
                        return;
                    }
                }
            }
        } else {
            interfaceC4421Uj02.t(i4 - this.Q);
            this.J = 0;
        }
    }

    public final KZ1 n(@InterfaceC11300zs1 C11106z41 c11106z41, @InterfaceC11300zs1 C11106z41 c11106z412) {
        int i;
        if (this.t != -1 && this.w != C10323vs.b && c11106z41 != null && c11106z41.c() != 0 && c11106z412 != null && c11106z412.c() == c11106z41.c()) {
            int c4 = c11106z41.c();
            int[] iArr = new int[c4];
            long[] jArr = new long[c4];
            long[] jArr2 = new long[c4];
            long[] jArr3 = new long[c4];
            int i4 = 0;
            for (int i5 = 0; i5 < c4; i5++) {
                jArr3[i5] = c11106z41.b(i5);
                jArr[i5] = this.t + c11106z412.b(i5);
            }
            while (true) {
                i = c4 - 1;
                if (i4 >= i) {
                    break;
                }
                int i6 = i4 + 1;
                iArr[i4] = (int) (jArr[i6] - jArr[i4]);
                jArr2[i4] = jArr3[i6] - jArr3[i4];
                i4 = i6;
            }
            iArr[i] = (int) ((this.t + this.s) - jArr[i]);
            long j = this.w - jArr3[i];
            jArr2[i] = j;
            if (j <= 0) {
                I31.n(h0, "Discarding last cue point with unexpected duration: " + j);
                iArr = Arrays.copyOf(iArr, i);
                jArr = Arrays.copyOf(jArr, i);
                jArr2 = Arrays.copyOf(jArr2, i);
                jArr3 = Arrays.copyOf(jArr3, i);
            }
            return new C6979iC(iArr, jArr, jArr2, jArr3);
        }
        return new KZ1.b(this.w);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x009e  */
    @HS1({"#1.output"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void o(d dVar, long j, int i, int i4, int i5) {
        int g;
        Du2 du2 = dVar.T;
        if (du2 != null) {
            du2.c(dVar.X, j, i, i4, i5, dVar.j);
        } else {
            if (P0.equals(dVar.b) || Q0.equals(dVar.b) || R0.equals(dVar.b)) {
                if (this.N > 1) {
                    I31.n(h0, "Skipping subtitle sample in laced block.");
                } else {
                    long j4 = this.L;
                    if (j4 == C10323vs.b) {
                        I31.n(h0, "Skipping subtitle sample with no duration.");
                    } else {
                        F(dVar.b, j4, this.n.e());
                        int f = this.n.f();
                        while (true) {
                            if (f >= this.n.g()) {
                                break;
                            } else if (this.n.e()[f] == 0) {
                                this.n.X(f);
                                break;
                            } else {
                                f++;
                            }
                        }
                        InterfaceC10568wr2 interfaceC10568wr2 = dVar.X;
                        C3012Fy1 c3012Fy1 = this.n;
                        interfaceC10568wr2.e(c3012Fy1, c3012Fy1.g());
                        g = i4 + this.n.g();
                        if ((i & 268435456) != 0) {
                            if (this.N > 1) {
                                this.q.U(0);
                            } else {
                                int g4 = this.q.g();
                                dVar.X.f(this.q, g4, 2);
                                g += g4;
                            }
                        }
                        dVar.X.b(j, i, g, i5, dVar.j);
                    }
                }
            }
            g = i4;
            if ((i & 268435456) != 0) {
            }
            dVar.X.b(j, i, g, i5, dVar.j);
        }
        this.I = true;
    }

    @InterfaceC2591Bt
    public void p(int i) throws C3989Py1 {
        l();
        if (i != 160) {
            if (i != 174) {
                if (i != 19899) {
                    if (i != 25152) {
                        if (i != 28032) {
                            if (i != 357149030) {
                                if (i != 374648427) {
                                    if (i == 475249515) {
                                        if (!this.y) {
                                            this.e0.p(n(this.F, this.G));
                                            this.y = true;
                                        }
                                        this.F = null;
                                        this.G = null;
                                        return;
                                    }
                                    return;
                                } else if (this.f.size() != 0) {
                                    this.e0.n();
                                    return;
                                } else {
                                    throw C3989Py1.a("No valid tracks were found", null);
                                }
                            }
                            if (this.u == C10323vs.b) {
                                this.u = 1000000L;
                            }
                            long j = this.v;
                            if (j != C10323vs.b) {
                                this.w = E(j);
                                return;
                            }
                            return;
                        }
                        k(i);
                        d dVar = this.x;
                        if (dVar.h && dVar.i != null) {
                            throw C3989Py1.a("Combining encryption and compression is not supported", null);
                        }
                        return;
                    }
                    k(i);
                    d dVar2 = this.x;
                    if (dVar2.h) {
                        if (dVar2.j != null) {
                            dVar2.l = new C6960i70(new C6960i70.b(C10323vs.d2, "video/webm", this.x.j.b));
                            return;
                        }
                        throw C3989Py1.a("Encrypted Track found but ContentEncKeyID was not found", null);
                    }
                    return;
                }
                int i4 = this.z;
                if (i4 != -1) {
                    long j4 = this.A;
                    if (j4 != -1) {
                        if (i4 == 475249515) {
                            this.C = j4;
                            return;
                        }
                        return;
                    }
                }
                throw C3989Py1.a("Mandatory element SeekID or SeekPosition not found", null);
            }
            d dVar3 = (d) C9542sf.k(this.x);
            String str = dVar3.b;
            if (str != null) {
                if (z(str)) {
                    dVar3.i(this.e0, dVar3.c);
                    this.f.put(dVar3.c, dVar3);
                }
                this.x = null;
                return;
            }
            throw C3989Py1.a("CodecId is missing in TrackEntry element", null);
        } else if (this.J == 2) {
            d dVar4 = this.f.get(this.P);
            dVar4.f();
            if (this.U > 0 && A0.equals(dVar4.b)) {
                this.q.V(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(this.U).array());
            }
            int i5 = 0;
            for (int i6 = 0; i6 < this.N; i6++) {
                i5 += this.O[i6];
            }
            int i7 = 0;
            while (i7 < this.N) {
                long j5 = this.K + ((dVar4.e * i7) / 1000);
                int i8 = this.R;
                if (i7 == 0 && !this.T) {
                    i8 |= 1;
                }
                int i9 = this.O[i7];
                int i10 = i5 - i9;
                o(dVar4, j5, i8, i9, i10);
                i7++;
                i5 = i10;
            }
            this.J = 0;
        }
    }

    public final int r() {
        int i = this.W;
        D();
        return i;
    }

    @InterfaceC2591Bt
    public void s(int i, double d4) throws C3989Py1 {
        if (i != 181) {
            if (i != 17545) {
                switch (i) {
                    case E2 /* 21969 */:
                        u(i).D = (float) d4;
                        return;
                    case F2 /* 21970 */:
                        u(i).E = (float) d4;
                        return;
                    case G2 /* 21971 */:
                        u(i).F = (float) d4;
                        return;
                    case H2 /* 21972 */:
                        u(i).G = (float) d4;
                        return;
                    case I2 /* 21973 */:
                        u(i).H = (float) d4;
                        return;
                    case J2 /* 21974 */:
                        u(i).I = (float) d4;
                        return;
                    case K2 /* 21975 */:
                        u(i).J = (float) d4;
                        return;
                    case L2 /* 21976 */:
                        u(i).K = (float) d4;
                        return;
                    case M2 /* 21977 */:
                        u(i).L = (float) d4;
                        return;
                    case N2 /* 21978 */:
                        u(i).M = (float) d4;
                        return;
                    default:
                        switch (i) {
                            case t2 /* 30323 */:
                                u(i).s = (float) d4;
                                return;
                            case u2 /* 30324 */:
                                u(i).t = (float) d4;
                                return;
                            case v2 /* 30325 */:
                                u(i).u = (float) d4;
                                return;
                            default:
                                return;
                        }
                }
            }
            this.v = (long) d4;
            return;
        }
        u(i).Q = (int) d4;
    }

    public d u(int i) throws C3989Py1 {
        k(i);
        return this.x;
    }

    @InterfaceC2591Bt
    public int v(int i) {
        switch (i) {
            case 131:
            case 136:
            case 155:
            case 159:
            case 176:
            case 179:
            case Q1 /* 186 */:
            case z1 /* 215 */:
            case n1 /* 231 */:
            case u1 /* 238 */:
            case o2 /* 241 */:
            case w1 /* 251 */:
            case G1 /* 16871 */:
            case d2 /* 16980 */:
            case c1 /* 17029 */:
            case a1 /* 17143 */:
            case g2 /* 18401 */:
            case j2 /* 18408 */:
            case a2 /* 20529 */:
            case b2 /* 20530 */:
            case i1 /* 21420 */:
            case w2 /* 21432 */:
            case R1 /* 21680 */:
            case T1 /* 21682 */:
            case S1 /* 21690 */:
            case C1 /* 21930 */:
            case y2 /* 21945 */:
            case z2 /* 21946 */:
            case A2 /* 21947 */:
            case B2 /* 21948 */:
            case C2 /* 21949 */:
            case E1 /* 21998 */:
            case L1 /* 22186 */:
            case M1 /* 22203 */:
            case W1 /* 25188 */:
            case N1 /* 30114 */:
            case r2 /* 30321 */:
            case D1 /* 2352003 */:
            case k1 /* 2807729 */:
                return 2;
            case 134:
            case 17026:
            case I1 /* 21358 */:
            case p2 /* 2274716 */:
                return 3;
            case 160:
            case t1 /* 166 */:
            case y1 /* 174 */:
            case n2 /* 183 */:
            case l2 /* 187 */:
            case 224:
            case 225:
            case F1 /* 16868 */:
            case i2 /* 18407 */:
            case g1 /* 19899 */:
            case c2 /* 20532 */:
            case f2 /* 20533 */:
            case x2 /* 21936 */:
            case D2 /* 21968 */:
            case Z1 /* 25152 */:
            case Y1 /* 28032 */:
            case s1 /* 30113 */:
            case q2 /* 30320 */:
            case f1 /* 290298740 */:
            case 357149030:
            case x1 /* 374648427 */:
            case d1 /* 408125543 */:
            case 440786851:
            case k2 /* 475249515 */:
            case m1 /* 524531317 */:
                return 1;
            case q1 /* 161 */:
            case o1 /* 163 */:
            case v1 /* 165 */:
            case H1 /* 16877 */:
            case e2 /* 16981 */:
            case h2 /* 18402 */:
            case h1 /* 21419 */:
            case K1 /* 25506 */:
            case s2 /* 30322 */:
                return 4;
            case 181:
            case l1 /* 17545 */:
            case E2 /* 21969 */:
            case F2 /* 21970 */:
            case G2 /* 21971 */:
            case H2 /* 21972 */:
            case I2 /* 21973 */:
            case J2 /* 21974 */:
            case K2 /* 21975 */:
            case L2 /* 21976 */:
            case M2 /* 21977 */:
            case N2 /* 21978 */:
            case t2 /* 30323 */:
            case u2 /* 30324 */:
            case v2 /* 30325 */:
                return 5;
            default:
                return 0;
        }
    }

    public void w(d dVar, InterfaceC4421Uj0 interfaceC4421Uj0, int i) throws IOException {
        if (dVar.g != 1685485123 && dVar.g != 1685480259) {
            interfaceC4421Uj0.t(i);
            return;
        }
        byte[] bArr = new byte[i];
        dVar.N = bArr;
        interfaceC4421Uj0.readFully(bArr, 0, i);
    }

    public void x(d dVar, int i, InterfaceC4421Uj0 interfaceC4421Uj0, int i4) throws IOException {
        if (i == 4 && p0.equals(dVar.b)) {
            this.q.U(i4);
            interfaceC4421Uj0.readFully(this.q.e(), 0, i4);
            return;
        }
        interfaceC4421Uj0.t(i4);
    }

    @InterfaceC2591Bt
    public void y(int i, long j) throws C3989Py1 {
        if (i != 20529) {
            if (i != 20530) {
                boolean z = false;
                switch (i) {
                    case 131:
                        u(i).d = (int) j;
                        return;
                    case 136:
                        d u = u(i);
                        if (j == 1) {
                            z = true;
                        }
                        u.V = z;
                        return;
                    case 155:
                        this.L = E(j);
                        return;
                    case 159:
                        u(i).O = (int) j;
                        return;
                    case 176:
                        u(i).m = (int) j;
                        return;
                    case 179:
                        i(i);
                        this.F.a(E(j));
                        return;
                    case Q1 /* 186 */:
                        u(i).n = (int) j;
                        return;
                    case z1 /* 215 */:
                        u(i).c = (int) j;
                        return;
                    case n1 /* 231 */:
                        this.E = E(j);
                        return;
                    case u1 /* 238 */:
                        this.S = (int) j;
                        return;
                    case o2 /* 241 */:
                        if (!this.H) {
                            i(i);
                            this.G.a(j);
                            this.H = true;
                            return;
                        }
                        return;
                    case w1 /* 251 */:
                        this.T = true;
                        return;
                    case G1 /* 16871 */:
                        u(i).g = (int) j;
                        return;
                    case d2 /* 16980 */:
                        if (j != 3) {
                            throw C3989Py1.a("ContentCompAlgo " + j + " not supported", null);
                        }
                        return;
                    case c1 /* 17029 */:
                        if (j < 1 || j > 2) {
                            throw C3989Py1.a("DocTypeReadVersion " + j + " not supported", null);
                        }
                        return;
                    case a1 /* 17143 */:
                        if (j != 1) {
                            throw C3989Py1.a("EBMLReadVersion " + j + " not supported", null);
                        }
                        return;
                    case g2 /* 18401 */:
                        if (j != 5) {
                            throw C3989Py1.a("ContentEncAlgo " + j + " not supported", null);
                        }
                        return;
                    case j2 /* 18408 */:
                        if (j != 1) {
                            throw C3989Py1.a("AESSettingsCipherMode " + j + " not supported", null);
                        }
                        return;
                    case i1 /* 21420 */:
                        this.A = j + this.t;
                        return;
                    case w2 /* 21432 */:
                        int i4 = (int) j;
                        k(i);
                        if (i4 != 0) {
                            if (i4 != 1) {
                                if (i4 != 3) {
                                    if (i4 == 15) {
                                        this.x.w = 3;
                                        return;
                                    }
                                    return;
                                }
                                this.x.w = 1;
                                return;
                            }
                            this.x.w = 2;
                            return;
                        }
                        this.x.w = 0;
                        return;
                    case R1 /* 21680 */:
                        u(i).f919o = (int) j;
                        return;
                    case T1 /* 21682 */:
                        u(i).q = (int) j;
                        return;
                    case S1 /* 21690 */:
                        u(i).p = (int) j;
                        return;
                    case C1 /* 21930 */:
                        d u3 = u(i);
                        if (j == 1) {
                            z = true;
                        }
                        u3.U = z;
                        return;
                    case E1 /* 21998 */:
                        u(i).f = (int) j;
                        return;
                    case L1 /* 22186 */:
                        u(i).R = j;
                        return;
                    case M1 /* 22203 */:
                        u(i).S = j;
                        return;
                    case W1 /* 25188 */:
                        u(i).P = (int) j;
                        return;
                    case N1 /* 30114 */:
                        this.U = j;
                        return;
                    case r2 /* 30321 */:
                        k(i);
                        int i5 = (int) j;
                        if (i5 != 0) {
                            if (i5 != 1) {
                                if (i5 != 2) {
                                    if (i5 == 3) {
                                        this.x.r = 3;
                                        return;
                                    }
                                    return;
                                }
                                this.x.r = 2;
                                return;
                            }
                            this.x.r = 1;
                            return;
                        }
                        this.x.r = 0;
                        return;
                    case D1 /* 2352003 */:
                        u(i).e = (int) j;
                        return;
                    case k1 /* 2807729 */:
                        this.u = j;
                        return;
                    default:
                        switch (i) {
                            case y2 /* 21945 */:
                                k(i);
                                int i6 = (int) j;
                                if (i6 != 1) {
                                    if (i6 == 2) {
                                        this.x.A = 1;
                                        return;
                                    }
                                    return;
                                }
                                this.x.A = 2;
                                return;
                            case z2 /* 21946 */:
                                k(i);
                                int j4 = IF.j((int) j);
                                if (j4 != -1) {
                                    this.x.z = j4;
                                    return;
                                }
                                return;
                            case A2 /* 21947 */:
                                k(i);
                                this.x.x = true;
                                int i7 = IF.i((int) j);
                                if (i7 != -1) {
                                    this.x.y = i7;
                                    return;
                                }
                                return;
                            case B2 /* 21948 */:
                                u(i).B = (int) j;
                                return;
                            case C2 /* 21949 */:
                                u(i).C = (int) j;
                                return;
                            default:
                                return;
                        }
                }
            } else if (j != 1) {
                throw C3989Py1.a("ContentEncodingScope " + j + " not supported", null);
            }
        } else if (j == 0) {
        } else {
            throw C3989Py1.a("ContentEncodingOrder " + j + " not supported", null);
        }
    }

    public C10997yd1(int i) {
        this(new PY(), i);
    }

    public C10997yd1(InterfaceC7452k90 interfaceC7452k90, int i) {
        this.t = -1L;
        this.u = C10323vs.b;
        this.v = C10323vs.b;
        this.w = C10323vs.b;
        this.C = -1L;
        this.D = -1L;
        this.E = C10323vs.b;
        this.d = interfaceC7452k90;
        interfaceC7452k90.b(new c());
        this.g = (i & 1) == 0;
        this.e = new JE2();
        this.f = new SparseArray<>();
        this.j = new C3012Fy1(4);
        this.k = new C3012Fy1(ByteBuffer.allocate(4).putInt(-1).array());
        this.l = new C3012Fy1(4);
        this.h = new C3012Fy1(C9337ro1.i);
        this.i = new C3012Fy1(4);
        this.m = new C3012Fy1();
        this.n = new C3012Fy1();
        this.f918o = new C3012Fy1(8);
        this.p = new C3012Fy1();
        this.q = new C3012Fy1();
        this.O = new int[1];
    }

    @Override // o.InterfaceC4324Tj0
    public final void g() {
    }
}
