package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.a;
import androidx.constraintlayout.widget.f;
import androidx.constraintlayout.widget.j;
import com.facebook.a0;
import com.google.firebase.crashlytics.internal.persistence.CrashlyticsReportPersistence;
import com.google.firebase.sessions.settings.RemoteSettings;
import java.io.IOException;
import java.io.Writer;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;
import o.AV;
import o.AbstractC4253Sp2;
import o.C2638Cg0;
import o.C5445bv2;
import o.C5738d80;
import o.C6566gU0;
import o.C6725h90;
import o.C7114il1;
import o.C7994mI2;
import o.C8590ol1;
import o.C9696tH0;
import o.C9698tH2;
import o.InterfaceC8148mw2;
import o.UK;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public class e {
    public static final int A = 0;
    public static final int A0 = 28;
    public static final int A1 = 80;
    public static final int B = 1;
    public static final int B0 = 29;
    public static final int B1 = 81;
    public static final int C = 0;
    public static final int C0 = 30;
    public static final int C1 = 82;
    public static final int D = 1;
    public static final int D0 = 31;
    public static final int D1 = 83;
    public static final int E = 0;
    public static final int E0 = 32;
    public static final int E1 = 84;
    public static final int F = 4;
    public static final int F0 = 33;
    public static final int F1 = 85;
    public static final int G = 8;
    public static final int G0 = 34;
    public static final int G1 = 86;
    public static final int H = 1;
    public static final int H0 = 35;
    public static final int H1 = 87;
    public static final int I = 2;
    public static final int I0 = 36;
    public static final int I1 = 88;
    public static final int J = 3;
    public static final int J0 = 37;
    public static final int J1 = 89;
    public static final int K = 4;
    public static final int K0 = 38;
    public static final int K1 = 90;
    public static final int L = 5;
    public static final int L0 = 39;
    public static final int L1 = 91;
    public static final int M = 6;
    public static final int M0 = 40;
    public static final int M1 = 92;
    public static final int N = 7;
    public static final int N0 = 41;
    public static final int N1 = 93;
    public static final int O = 8;
    public static final int O0 = 42;
    public static final int O1 = 94;
    public static final int P = 0;
    public static final int P0 = 43;
    public static final int P1 = 95;
    public static final int Q = 1;
    public static final int Q0 = 44;
    public static final int Q1 = 96;
    public static final int R = 0;
    public static final int R0 = 45;
    public static final int R1 = 97;
    public static final int S = 1;
    public static final int S0 = 46;
    public static final int S1 = 98;
    public static final int T = 2;
    public static final int T0 = 47;
    public static final int T1 = 99;
    public static final boolean U = false;
    public static final int U0 = 48;
    public static final String U1 = "weight";
    public static final int V0 = 49;
    public static final String V1 = "ratio";
    public static final int W = 1;
    public static final int W0 = 50;
    public static final String W1 = "parent";
    public static final int X0 = 51;
    public static final int Y0 = 52;
    public static final int Z = 1;
    public static final int Z0 = 53;
    public static final int a0 = 2;
    public static final int a1 = 54;
    public static final int b0 = 3;
    public static final int b1 = 55;
    public static final int c0 = 4;
    public static final int c1 = 56;
    public static final int d0 = 5;
    public static final int d1 = 57;
    public static final int e0 = 6;
    public static final int e1 = 58;
    public static final int f0 = 7;
    public static final int f1 = 59;
    public static final int g0 = 8;
    public static final int g1 = 60;
    public static final int h0 = 9;
    public static final int h1 = 61;
    public static final String i = "ConstraintSet";
    public static final int i0 = 10;
    public static final int i1 = 62;
    public static final String j = "XML parser error must be within a Constraint ";
    public static final int j0 = 11;
    public static final int j1 = 63;
    public static final int k = -1;
    public static final int k0 = 12;
    public static final int k1 = 64;
    public static final int l = -2;
    public static final int l0 = 13;
    public static final int l1 = 65;
    public static final int m = -3;
    public static final int m0 = 14;
    public static final int m1 = 66;
    public static final int n = -4;
    public static final int n0 = 15;
    public static final int n1 = 67;

    /* renamed from: o  reason: collision with root package name */
    public static final int f20o = 0;
    public static final int o0 = 16;
    public static final int o1 = 68;
    public static final int p = 1;
    public static final int p0 = 17;
    public static final int p1 = 69;
    public static final int q = 2;
    public static final int q0 = 18;
    public static final int q1 = 70;
    public static final int r = 3;
    public static final int r0 = 19;
    public static final int r1 = 71;
    public static final int s = 4;
    public static final int s0 = 20;
    public static final int s1 = 72;
    public static final int t = -1;
    public static final int t0 = 21;
    public static final int t1 = 73;
    public static final int u = 0;
    public static final int u0 = 22;
    public static final int u1 = 74;
    public static final int v = -2;
    public static final int v0 = 23;
    public static final int v1 = 75;
    public static final int w = 1;
    public static final int w0 = 24;
    public static final int w1 = 76;
    public static final int x = 0;
    public static final int x0 = 25;
    public static final int x1 = 77;
    public static final int y = 2;
    public static final int y0 = 26;
    public static final int y1 = 78;
    public static final int z = 0;
    public static final int z0 = 27;
    public static final int z1 = 79;
    public boolean a;
    public String b;
    public String c = "";
    public String[] d = new String[0];
    public int e = 0;
    public HashMap<String, androidx.constraintlayout.widget.a> f = new HashMap<>();
    public boolean g = true;
    public HashMap<Integer, a> h = new HashMap<>();
    public static final int[] V = {0, 4, 8};
    public static SparseIntArray X = new SparseIntArray();
    public static SparseIntArray Y = new SparseIntArray();

    /* loaded from: classes.dex */
    public static class a {
        public int a;
        public String b;
        public final d c = new d();
        public final c d = new c();
        public final b e = new b();
        public final C0020e f = new C0020e();
        public HashMap<String, androidx.constraintlayout.widget.a> g = new HashMap<>();
        public C0019a h;

        /* renamed from: androidx.constraintlayout.widget.e$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static class C0019a {
            public static final int m = 4;
            public static final int n = 10;

            /* renamed from: o  reason: collision with root package name */
            public static final int f21o = 10;
            public static final int p = 5;
            public int[] a = new int[10];
            public int[] b = new int[10];
            public int c = 0;
            public int[] d = new int[10];
            public float[] e = new float[10];
            public int f = 0;
            public int[] g = new int[5];
            public String[] h = new String[5];
            public int i = 0;
            public int[] j = new int[4];
            public boolean[] k = new boolean[4];
            public int l = 0;

            public void a(int i, float f) {
                int i2 = this.f;
                int[] iArr = this.d;
                if (i2 >= iArr.length) {
                    this.d = Arrays.copyOf(iArr, iArr.length * 2);
                    float[] fArr = this.e;
                    this.e = Arrays.copyOf(fArr, fArr.length * 2);
                }
                int[] iArr2 = this.d;
                int i3 = this.f;
                iArr2[i3] = i;
                float[] fArr2 = this.e;
                this.f = i3 + 1;
                fArr2[i3] = f;
            }

            public void b(int i, int i2) {
                int i3 = this.c;
                int[] iArr = this.a;
                if (i3 >= iArr.length) {
                    this.a = Arrays.copyOf(iArr, iArr.length * 2);
                    int[] iArr2 = this.b;
                    this.b = Arrays.copyOf(iArr2, iArr2.length * 2);
                }
                int[] iArr3 = this.a;
                int i4 = this.c;
                iArr3[i4] = i;
                int[] iArr4 = this.b;
                this.c = i4 + 1;
                iArr4[i4] = i2;
            }

            public void c(int i, String str) {
                int i2 = this.i;
                int[] iArr = this.g;
                if (i2 >= iArr.length) {
                    this.g = Arrays.copyOf(iArr, iArr.length * 2);
                    String[] strArr = this.h;
                    this.h = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
                }
                int[] iArr2 = this.g;
                int i3 = this.i;
                iArr2[i3] = i;
                String[] strArr2 = this.h;
                this.i = i3 + 1;
                strArr2[i3] = str;
            }

            public void d(int i, boolean z) {
                int i2 = this.l;
                int[] iArr = this.j;
                if (i2 >= iArr.length) {
                    this.j = Arrays.copyOf(iArr, iArr.length * 2);
                    boolean[] zArr = this.k;
                    this.k = Arrays.copyOf(zArr, zArr.length * 2);
                }
                int[] iArr2 = this.j;
                int i3 = this.l;
                iArr2[i3] = i;
                boolean[] zArr2 = this.k;
                this.l = i3 + 1;
                zArr2[i3] = z;
            }

            public void e(a aVar) {
                for (int i = 0; i < this.c; i++) {
                    e.V0(aVar, this.a[i], this.b[i]);
                }
                for (int i2 = 0; i2 < this.f; i2++) {
                    e.U0(aVar, this.d[i2], this.e[i2]);
                }
                for (int i3 = 0; i3 < this.i; i3++) {
                    e.W0(aVar, this.g[i3], this.h[i3]);
                }
                for (int i4 = 0; i4 < this.l; i4++) {
                    e.X0(aVar, this.j[i4], this.k[i4]);
                }
            }

            public void f(String str) {
                Log.v(str, a0.y);
                for (int i = 0; i < this.c; i++) {
                    Log.v(str, this.a[i] + " = " + this.b[i]);
                }
                Log.v(str, "float");
                for (int i2 = 0; i2 < this.f; i2++) {
                    Log.v(str, this.d[i2] + " = " + this.e[i2]);
                }
                Log.v(str, "strings");
                for (int i3 = 0; i3 < this.i; i3++) {
                    Log.v(str, this.g[i3] + " = " + this.h[i3]);
                }
                Log.v(str, InterfaceC8148mw2.b.f);
                for (int i4 = 0; i4 < this.l; i4++) {
                    Log.v(str, this.j[i4] + " = " + this.k[i4]);
                }
            }
        }

        public void h(a aVar) {
            C0019a c0019a = this.h;
            if (c0019a != null) {
                c0019a.e(aVar);
            }
        }

        public void i(ConstraintLayout.b bVar) {
            b bVar2 = this.e;
            bVar.e = bVar2.j;
            bVar.f = bVar2.k;
            bVar.g = bVar2.l;
            bVar.h = bVar2.m;
            bVar.i = bVar2.n;
            bVar.j = bVar2.f22o;
            bVar.k = bVar2.p;
            bVar.l = bVar2.q;
            bVar.m = bVar2.r;
            bVar.n = bVar2.s;
            bVar.f17o = bVar2.t;
            bVar.s = bVar2.u;
            bVar.t = bVar2.v;
            bVar.u = bVar2.w;
            bVar.v = bVar2.x;
            ((ViewGroup.MarginLayoutParams) bVar).leftMargin = bVar2.H;
            ((ViewGroup.MarginLayoutParams) bVar).rightMargin = bVar2.I;
            ((ViewGroup.MarginLayoutParams) bVar).topMargin = bVar2.J;
            ((ViewGroup.MarginLayoutParams) bVar).bottomMargin = bVar2.K;
            bVar.A = bVar2.T;
            bVar.B = bVar2.S;
            bVar.x = bVar2.P;
            bVar.z = bVar2.R;
            bVar.G = bVar2.y;
            bVar.H = bVar2.z;
            bVar.p = bVar2.B;
            bVar.q = bVar2.C;
            bVar.r = bVar2.D;
            bVar.I = bVar2.A;
            bVar.X = bVar2.E;
            bVar.Y = bVar2.F;
            bVar.M = bVar2.V;
            bVar.L = bVar2.W;
            bVar.O = bVar2.Y;
            bVar.N = bVar2.X;
            bVar.a0 = bVar2.n0;
            bVar.b0 = bVar2.o0;
            bVar.P = bVar2.Z;
            bVar.Q = bVar2.a0;
            bVar.T = bVar2.b0;
            bVar.U = bVar2.c0;
            bVar.R = bVar2.d0;
            bVar.S = bVar2.e0;
            bVar.V = bVar2.f0;
            bVar.W = bVar2.g0;
            bVar.Z = bVar2.G;
            bVar.c = bVar2.h;
            bVar.a = bVar2.f;
            bVar.b = bVar2.g;
            ((ViewGroup.MarginLayoutParams) bVar).width = bVar2.d;
            ((ViewGroup.MarginLayoutParams) bVar).height = bVar2.e;
            String str = bVar2.m0;
            if (str != null) {
                bVar.c0 = str;
            }
            bVar.d0 = bVar2.q0;
            bVar.setMarginStart(bVar2.M);
            bVar.setMarginEnd(this.e.L);
            bVar.e();
        }

        /* renamed from: j */
        public a clone() {
            a aVar = new a();
            aVar.e.a(this.e);
            aVar.d.a(this.d);
            aVar.c.a(this.c);
            aVar.f.a(this.f);
            aVar.a = this.a;
            aVar.h = this.h;
            return aVar;
        }

        public final void k(int i, ConstraintLayout.b bVar) {
            this.a = i;
            b bVar2 = this.e;
            bVar2.j = bVar.e;
            bVar2.k = bVar.f;
            bVar2.l = bVar.g;
            bVar2.m = bVar.h;
            bVar2.n = bVar.i;
            bVar2.f22o = bVar.j;
            bVar2.p = bVar.k;
            bVar2.q = bVar.l;
            bVar2.r = bVar.m;
            bVar2.s = bVar.n;
            bVar2.t = bVar.f17o;
            bVar2.u = bVar.s;
            bVar2.v = bVar.t;
            bVar2.w = bVar.u;
            bVar2.x = bVar.v;
            bVar2.y = bVar.G;
            bVar2.z = bVar.H;
            bVar2.A = bVar.I;
            bVar2.B = bVar.p;
            bVar2.C = bVar.q;
            bVar2.D = bVar.r;
            bVar2.E = bVar.X;
            bVar2.F = bVar.Y;
            bVar2.G = bVar.Z;
            bVar2.h = bVar.c;
            bVar2.f = bVar.a;
            bVar2.g = bVar.b;
            bVar2.d = ((ViewGroup.MarginLayoutParams) bVar).width;
            bVar2.e = ((ViewGroup.MarginLayoutParams) bVar).height;
            bVar2.H = ((ViewGroup.MarginLayoutParams) bVar).leftMargin;
            bVar2.I = ((ViewGroup.MarginLayoutParams) bVar).rightMargin;
            bVar2.J = ((ViewGroup.MarginLayoutParams) bVar).topMargin;
            bVar2.K = ((ViewGroup.MarginLayoutParams) bVar).bottomMargin;
            bVar2.N = bVar.D;
            bVar2.V = bVar.M;
            bVar2.W = bVar.L;
            bVar2.Y = bVar.O;
            bVar2.X = bVar.N;
            bVar2.n0 = bVar.a0;
            bVar2.o0 = bVar.b0;
            bVar2.Z = bVar.P;
            bVar2.a0 = bVar.Q;
            bVar2.b0 = bVar.T;
            bVar2.c0 = bVar.U;
            bVar2.d0 = bVar.R;
            bVar2.e0 = bVar.S;
            bVar2.f0 = bVar.V;
            bVar2.g0 = bVar.W;
            bVar2.m0 = bVar.c0;
            bVar2.P = bVar.x;
            bVar2.R = bVar.z;
            bVar2.O = bVar.w;
            bVar2.Q = bVar.y;
            bVar2.T = bVar.A;
            bVar2.S = bVar.B;
            bVar2.U = bVar.C;
            bVar2.q0 = bVar.d0;
            bVar2.L = bVar.getMarginEnd();
            this.e.M = bVar.getMarginStart();
        }

        public final void l(int i, f.a aVar) {
            k(i, aVar);
            this.c.d = aVar.V0;
            C0020e c0020e = this.f;
            c0020e.b = aVar.Y0;
            c0020e.c = aVar.Z0;
            c0020e.d = aVar.a1;
            c0020e.e = aVar.b1;
            c0020e.f = aVar.c1;
            c0020e.g = aVar.d1;
            c0020e.h = aVar.e1;
            c0020e.j = aVar.f1;
            c0020e.k = aVar.g1;
            c0020e.l = aVar.h1;
            c0020e.n = aVar.X0;
            c0020e.m = aVar.W0;
        }

        public final void m(androidx.constraintlayout.widget.b bVar, int i, f.a aVar) {
            l(i, aVar);
            if (bVar instanceof Barrier) {
                b bVar2 = this.e;
                bVar2.j0 = 1;
                Barrier barrier = (Barrier) bVar;
                bVar2.h0 = barrier.getType();
                this.e.k0 = barrier.getReferencedIds();
                this.e.i0 = barrier.getMargin();
            }
        }

        public final androidx.constraintlayout.widget.a n(String str, a.EnumC0018a enumC0018a) {
            if (this.g.containsKey(str)) {
                androidx.constraintlayout.widget.a aVar = this.g.get(str);
                if (aVar.j() == enumC0018a) {
                    return aVar;
                }
                throw new IllegalArgumentException("ConstraintAttribute is already a " + aVar.j().name());
            }
            androidx.constraintlayout.widget.a aVar2 = new androidx.constraintlayout.widget.a(str, enumC0018a);
            this.g.put(str, aVar2);
            return aVar2;
        }

        public void o(String str) {
            C0019a c0019a = this.h;
            if (c0019a != null) {
                c0019a.f(str);
            } else {
                Log.v(str, "DELTA IS NULL");
            }
        }

        public final void p(String str, int i) {
            n(str, a.EnumC0018a.COLOR_TYPE).s(i);
        }

        public final void q(String str, float f) {
            n(str, a.EnumC0018a.FLOAT_TYPE).t(f);
        }

        public final void r(String str, int i) {
            n(str, a.EnumC0018a.INT_TYPE).u(i);
        }

        public final void s(String str, String str2) {
            n(str, a.EnumC0018a.STRING_TYPE).v(str2);
        }
    }

    /* loaded from: classes.dex */
    public static class b {
        public static final int A0 = 7;
        public static final int A1 = 82;
        public static final int B0 = 8;
        public static final int B1 = 83;
        public static final int C0 = 9;
        public static final int C1 = 84;
        public static final int D0 = 10;
        public static final int D1 = 85;
        public static final int E0 = 11;
        public static final int E1 = 86;
        public static final int F0 = 12;
        public static final int F1 = 87;
        public static final int G0 = 13;
        public static final int G1 = 88;
        public static final int H0 = 14;
        public static final int H1 = 89;
        public static final int I0 = 15;
        public static final int I1 = 90;
        public static final int J0 = 16;
        public static final int J1 = 91;
        public static final int K0 = 17;
        public static final int L0 = 18;
        public static final int M0 = 19;
        public static final int N0 = 20;
        public static final int O0 = 21;
        public static final int P0 = 22;
        public static final int Q0 = 23;
        public static final int R0 = 24;
        public static final int S0 = 25;
        public static final int T0 = 26;
        public static final int U0 = 27;
        public static final int V0 = 28;
        public static final int W0 = 29;
        public static final int X0 = 30;
        public static final int Y0 = 31;
        public static final int Z0 = 32;
        public static final int a1 = 33;
        public static final int b1 = 34;
        public static final int c1 = 35;
        public static final int d1 = 36;
        public static final int e1 = 37;
        public static final int f1 = 38;
        public static final int g1 = 39;
        public static final int h1 = 40;
        public static final int i1 = 41;
        public static final int j1 = 42;
        public static final int k1 = 61;
        public static final int l1 = 62;
        public static final int m1 = 63;
        public static final int n1 = 69;
        public static final int o1 = 70;
        public static final int p1 = 71;
        public static final int q1 = 72;
        public static final int r0 = -1;
        public static final int r1 = 73;
        public static final int s0 = Integer.MIN_VALUE;
        public static final int s1 = 74;
        public static SparseIntArray t0 = null;
        public static final int t1 = 75;
        public static final int u0 = 1;
        public static final int u1 = 76;
        public static final int v0 = 2;
        public static final int v1 = 77;
        public static final int w0 = 3;
        public static final int w1 = 78;
        public static final int x0 = 4;
        public static final int x1 = 79;
        public static final int y0 = 5;
        public static final int y1 = 80;
        public static final int z0 = 6;
        public static final int z1 = 81;
        public int d;
        public int e;
        public int[] k0;
        public String l0;
        public String m0;
        public boolean a = false;
        public boolean b = false;
        public boolean c = false;
        public int f = -1;
        public int g = -1;
        public float h = -1.0f;
        public boolean i = true;
        public int j = -1;
        public int k = -1;
        public int l = -1;
        public int m = -1;
        public int n = -1;

        /* renamed from: o  reason: collision with root package name */
        public int f22o = -1;
        public int p = -1;
        public int q = -1;
        public int r = -1;
        public int s = -1;
        public int t = -1;
        public int u = -1;
        public int v = -1;
        public int w = -1;
        public int x = -1;
        public float y = 0.5f;
        public float z = 0.5f;
        public String A = null;
        public int B = -1;
        public int C = 0;
        public float D = 0.0f;
        public int E = -1;
        public int F = -1;
        public int G = -1;
        public int H = 0;
        public int I = 0;
        public int J = 0;
        public int K = 0;
        public int L = 0;
        public int M = 0;
        public int N = 0;
        public int O = Integer.MIN_VALUE;
        public int P = Integer.MIN_VALUE;
        public int Q = Integer.MIN_VALUE;
        public int R = Integer.MIN_VALUE;
        public int S = Integer.MIN_VALUE;
        public int T = Integer.MIN_VALUE;
        public int U = Integer.MIN_VALUE;
        public float V = -1.0f;
        public float W = -1.0f;
        public int X = 0;
        public int Y = 0;
        public int Z = 0;
        public int a0 = 0;
        public int b0 = 0;
        public int c0 = 0;
        public int d0 = 0;
        public int e0 = 0;
        public float f0 = 1.0f;
        public float g0 = 1.0f;
        public int h0 = -1;
        public int i0 = 0;
        public int j0 = -1;
        public boolean n0 = false;
        public boolean o0 = false;
        public boolean p0 = true;
        public int q0 = 0;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            t0 = sparseIntArray;
            sparseIntArray.append(j.c.Vb, 24);
            t0.append(j.c.Wb, 25);
            t0.append(j.c.Yb, 28);
            t0.append(j.c.Zb, 29);
            t0.append(j.c.ec, 35);
            t0.append(j.c.dc, 34);
            t0.append(j.c.Cb, 4);
            t0.append(j.c.Bb, 3);
            t0.append(j.c.xb, 1);
            t0.append(j.c.nc, 6);
            t0.append(j.c.oc, 7);
            t0.append(j.c.Jb, 17);
            t0.append(j.c.Kb, 18);
            t0.append(j.c.Lb, 19);
            SparseIntArray sparseIntArray2 = t0;
            int i = j.c.tb;
            sparseIntArray2.append(i, 90);
            t0.append(j.c.eb, 26);
            t0.append(j.c.ac, 31);
            t0.append(j.c.bc, 32);
            t0.append(j.c.Ib, 10);
            t0.append(j.c.Hb, 9);
            t0.append(j.c.sc, 13);
            t0.append(j.c.vc, 16);
            t0.append(j.c.tc, 14);
            t0.append(j.c.qc, 11);
            t0.append(j.c.uc, 15);
            t0.append(j.c.rc, 12);
            t0.append(j.c.hc, 38);
            t0.append(j.c.Tb, 37);
            t0.append(j.c.Sb, 39);
            t0.append(j.c.gc, 40);
            t0.append(j.c.Rb, 20);
            t0.append(j.c.fc, 36);
            t0.append(j.c.Gb, 5);
            t0.append(j.c.Ub, 91);
            t0.append(j.c.cc, 91);
            t0.append(j.c.Xb, 91);
            t0.append(j.c.Ab, 91);
            t0.append(j.c.wb, 91);
            t0.append(j.c.hb, 23);
            t0.append(j.c.jb, 27);
            t0.append(j.c.lb, 30);
            t0.append(j.c.mb, 8);
            t0.append(j.c.ib, 33);
            t0.append(j.c.kb, 2);
            t0.append(j.c.fb, 22);
            t0.append(j.c.gb, 21);
            SparseIntArray sparseIntArray3 = t0;
            int i2 = j.c.ic;
            sparseIntArray3.append(i2, 41);
            SparseIntArray sparseIntArray4 = t0;
            int i3 = j.c.Mb;
            sparseIntArray4.append(i3, 42);
            t0.append(j.c.vb, 87);
            t0.append(j.c.ub, 88);
            t0.append(j.c.xc, 76);
            t0.append(j.c.Db, 61);
            t0.append(j.c.Fb, 62);
            t0.append(j.c.Eb, 63);
            t0.append(j.c.mc, 69);
            t0.append(j.c.Qb, 70);
            t0.append(j.c.qb, 71);
            t0.append(j.c.ob, 72);
            t0.append(j.c.pb, 73);
            t0.append(j.c.rb, 74);
            t0.append(j.c.nb, 75);
            SparseIntArray sparseIntArray5 = t0;
            int i4 = j.c.kc;
            sparseIntArray5.append(i4, 84);
            t0.append(j.c.lc, 86);
            t0.append(i4, 83);
            t0.append(j.c.Pb, 85);
            t0.append(i2, 87);
            t0.append(i3, 88);
            t0.append(j.c.v3, 89);
            t0.append(i, 90);
        }

        public void a(b bVar) {
            this.a = bVar.a;
            this.d = bVar.d;
            this.b = bVar.b;
            this.e = bVar.e;
            this.f = bVar.f;
            this.g = bVar.g;
            this.h = bVar.h;
            this.i = bVar.i;
            this.j = bVar.j;
            this.k = bVar.k;
            this.l = bVar.l;
            this.m = bVar.m;
            this.n = bVar.n;
            this.f22o = bVar.f22o;
            this.p = bVar.p;
            this.q = bVar.q;
            this.r = bVar.r;
            this.s = bVar.s;
            this.t = bVar.t;
            this.u = bVar.u;
            this.v = bVar.v;
            this.w = bVar.w;
            this.x = bVar.x;
            this.y = bVar.y;
            this.z = bVar.z;
            this.A = bVar.A;
            this.B = bVar.B;
            this.C = bVar.C;
            this.D = bVar.D;
            this.E = bVar.E;
            this.F = bVar.F;
            this.G = bVar.G;
            this.H = bVar.H;
            this.I = bVar.I;
            this.J = bVar.J;
            this.K = bVar.K;
            this.L = bVar.L;
            this.M = bVar.M;
            this.N = bVar.N;
            this.O = bVar.O;
            this.P = bVar.P;
            this.Q = bVar.Q;
            this.R = bVar.R;
            this.S = bVar.S;
            this.T = bVar.T;
            this.U = bVar.U;
            this.V = bVar.V;
            this.W = bVar.W;
            this.X = bVar.X;
            this.Y = bVar.Y;
            this.Z = bVar.Z;
            this.a0 = bVar.a0;
            this.b0 = bVar.b0;
            this.c0 = bVar.c0;
            this.d0 = bVar.d0;
            this.e0 = bVar.e0;
            this.f0 = bVar.f0;
            this.g0 = bVar.g0;
            this.h0 = bVar.h0;
            this.i0 = bVar.i0;
            this.j0 = bVar.j0;
            this.m0 = bVar.m0;
            int[] iArr = bVar.k0;
            if (iArr != null && bVar.l0 == null) {
                this.k0 = Arrays.copyOf(iArr, iArr.length);
            } else {
                this.k0 = null;
            }
            this.l0 = bVar.l0;
            this.n0 = bVar.n0;
            this.o0 = bVar.o0;
            this.p0 = bVar.p0;
            this.q0 = bVar.q0;
        }

        public void b(C8590ol1 c8590ol1, StringBuilder sb) {
            Field[] declaredFields = getClass().getDeclaredFields();
            sb.append("\n");
            for (Field field : declaredFields) {
                String name = field.getName();
                if (!Modifier.isStatic(field.getModifiers())) {
                    try {
                        Object obj = field.get(this);
                        Class<?> type = field.getType();
                        if (type == Integer.TYPE) {
                            Integer num = (Integer) obj;
                            if (num.intValue() != -1) {
                                Object Y = c8590ol1.Y(num.intValue());
                                sb.append("    ");
                                sb.append(name);
                                sb.append(" = \"");
                                sb.append(Y == null ? num : Y);
                                sb.append("\"\n");
                            }
                        } else if (type == Float.TYPE) {
                            Float f = (Float) obj;
                            if (f.floatValue() != -1.0f) {
                                sb.append("    ");
                                sb.append(name);
                                sb.append(" = \"");
                                sb.append(f);
                                sb.append("\"\n");
                            }
                        }
                    } catch (IllegalAccessException e) {
                        Log.e("ConstraintSet", "Error accessing ConstraintSet field", e);
                    }
                }
            }
        }

        public void c(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.c.db);
            this.b = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                int i2 = t0.get(index);
                switch (i2) {
                    case 1:
                        this.r = e.A0(obtainStyledAttributes, index, this.r);
                        break;
                    case 2:
                        this.K = obtainStyledAttributes.getDimensionPixelSize(index, this.K);
                        break;
                    case 3:
                        this.q = e.A0(obtainStyledAttributes, index, this.q);
                        break;
                    case 4:
                        this.p = e.A0(obtainStyledAttributes, index, this.p);
                        break;
                    case 5:
                        this.A = obtainStyledAttributes.getString(index);
                        break;
                    case 6:
                        this.E = obtainStyledAttributes.getDimensionPixelOffset(index, this.E);
                        break;
                    case 7:
                        this.F = obtainStyledAttributes.getDimensionPixelOffset(index, this.F);
                        break;
                    case 8:
                        this.L = obtainStyledAttributes.getDimensionPixelSize(index, this.L);
                        break;
                    case 9:
                        this.x = e.A0(obtainStyledAttributes, index, this.x);
                        break;
                    case 10:
                        this.w = e.A0(obtainStyledAttributes, index, this.w);
                        break;
                    case 11:
                        this.R = obtainStyledAttributes.getDimensionPixelSize(index, this.R);
                        break;
                    case 12:
                        this.S = obtainStyledAttributes.getDimensionPixelSize(index, this.S);
                        break;
                    case 13:
                        this.O = obtainStyledAttributes.getDimensionPixelSize(index, this.O);
                        break;
                    case 14:
                        this.Q = obtainStyledAttributes.getDimensionPixelSize(index, this.Q);
                        break;
                    case 15:
                        this.T = obtainStyledAttributes.getDimensionPixelSize(index, this.T);
                        break;
                    case 16:
                        this.P = obtainStyledAttributes.getDimensionPixelSize(index, this.P);
                        break;
                    case 17:
                        this.f = obtainStyledAttributes.getDimensionPixelOffset(index, this.f);
                        break;
                    case 18:
                        this.g = obtainStyledAttributes.getDimensionPixelOffset(index, this.g);
                        break;
                    case 19:
                        this.h = obtainStyledAttributes.getFloat(index, this.h);
                        break;
                    case 20:
                        this.y = obtainStyledAttributes.getFloat(index, this.y);
                        break;
                    case 21:
                        this.e = obtainStyledAttributes.getLayoutDimension(index, this.e);
                        break;
                    case 22:
                        this.d = obtainStyledAttributes.getLayoutDimension(index, this.d);
                        break;
                    case 23:
                        this.H = obtainStyledAttributes.getDimensionPixelSize(index, this.H);
                        break;
                    case 24:
                        this.j = e.A0(obtainStyledAttributes, index, this.j);
                        break;
                    case 25:
                        this.k = e.A0(obtainStyledAttributes, index, this.k);
                        break;
                    case 26:
                        this.G = obtainStyledAttributes.getInt(index, this.G);
                        break;
                    case 27:
                        this.I = obtainStyledAttributes.getDimensionPixelSize(index, this.I);
                        break;
                    case 28:
                        this.l = e.A0(obtainStyledAttributes, index, this.l);
                        break;
                    case 29:
                        this.m = e.A0(obtainStyledAttributes, index, this.m);
                        break;
                    case 30:
                        this.M = obtainStyledAttributes.getDimensionPixelSize(index, this.M);
                        break;
                    case 31:
                        this.u = e.A0(obtainStyledAttributes, index, this.u);
                        break;
                    case 32:
                        this.v = e.A0(obtainStyledAttributes, index, this.v);
                        break;
                    case 33:
                        this.J = obtainStyledAttributes.getDimensionPixelSize(index, this.J);
                        break;
                    case 34:
                        this.f22o = e.A0(obtainStyledAttributes, index, this.f22o);
                        break;
                    case 35:
                        this.n = e.A0(obtainStyledAttributes, index, this.n);
                        break;
                    case 36:
                        this.z = obtainStyledAttributes.getFloat(index, this.z);
                        break;
                    case 37:
                        this.W = obtainStyledAttributes.getFloat(index, this.W);
                        break;
                    case 38:
                        this.V = obtainStyledAttributes.getFloat(index, this.V);
                        break;
                    case 39:
                        this.X = obtainStyledAttributes.getInt(index, this.X);
                        break;
                    case 40:
                        this.Y = obtainStyledAttributes.getInt(index, this.Y);
                        break;
                    case 41:
                        e.D0(this, obtainStyledAttributes, index, 0);
                        break;
                    case 42:
                        e.D0(this, obtainStyledAttributes, index, 1);
                        break;
                    default:
                        switch (i2) {
                            case 61:
                                this.B = e.A0(obtainStyledAttributes, index, this.B);
                                continue;
                            case 62:
                                this.C = obtainStyledAttributes.getDimensionPixelSize(index, this.C);
                                continue;
                            case 63:
                                this.D = obtainStyledAttributes.getFloat(index, this.D);
                                continue;
                            default:
                                switch (i2) {
                                    case 69:
                                        this.f0 = obtainStyledAttributes.getFloat(index, 1.0f);
                                        continue;
                                    case 70:
                                        this.g0 = obtainStyledAttributes.getFloat(index, 1.0f);
                                        continue;
                                    case 71:
                                        Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                                        continue;
                                    case 72:
                                        this.h0 = obtainStyledAttributes.getInt(index, this.h0);
                                        continue;
                                    case 73:
                                        this.i0 = obtainStyledAttributes.getDimensionPixelSize(index, this.i0);
                                        continue;
                                    case 74:
                                        this.l0 = obtainStyledAttributes.getString(index);
                                        continue;
                                    case 75:
                                        this.p0 = obtainStyledAttributes.getBoolean(index, this.p0);
                                        continue;
                                    case 76:
                                        this.q0 = obtainStyledAttributes.getInt(index, this.q0);
                                        continue;
                                    case 77:
                                        this.s = e.A0(obtainStyledAttributes, index, this.s);
                                        continue;
                                    case 78:
                                        this.t = e.A0(obtainStyledAttributes, index, this.t);
                                        continue;
                                    case 79:
                                        this.U = obtainStyledAttributes.getDimensionPixelSize(index, this.U);
                                        continue;
                                    case 80:
                                        this.N = obtainStyledAttributes.getDimensionPixelSize(index, this.N);
                                        continue;
                                    case 81:
                                        this.Z = obtainStyledAttributes.getInt(index, this.Z);
                                        continue;
                                    case 82:
                                        this.a0 = obtainStyledAttributes.getInt(index, this.a0);
                                        continue;
                                    case 83:
                                        this.c0 = obtainStyledAttributes.getDimensionPixelSize(index, this.c0);
                                        continue;
                                    case 84:
                                        this.b0 = obtainStyledAttributes.getDimensionPixelSize(index, this.b0);
                                        continue;
                                    case 85:
                                        this.e0 = obtainStyledAttributes.getDimensionPixelSize(index, this.e0);
                                        continue;
                                    case 86:
                                        this.d0 = obtainStyledAttributes.getDimensionPixelSize(index, this.d0);
                                        continue;
                                    case 87:
                                        this.n0 = obtainStyledAttributes.getBoolean(index, this.n0);
                                        continue;
                                    case 88:
                                        this.o0 = obtainStyledAttributes.getBoolean(index, this.o0);
                                        continue;
                                    case 89:
                                        this.m0 = obtainStyledAttributes.getString(index);
                                        continue;
                                    case 90:
                                        this.i = obtainStyledAttributes.getBoolean(index, this.i);
                                        continue;
                                    case 91:
                                        Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + t0.get(index));
                                        continue;
                                    default:
                                        Log.w("ConstraintSet", "Unknown attribute 0x" + Integer.toHexString(index) + "   " + t0.get(index));
                                        continue;
                                        continue;
                                }
                        }
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* loaded from: classes.dex */
    public static class c {
        public static final int A = 9;
        public static final int B = 10;

        /* renamed from: o  reason: collision with root package name */
        public static final int f23o = -2;
        public static final int p = -1;
        public static final int q = -3;
        public static SparseIntArray r = null;
        public static final int s = 1;
        public static final int t = 2;
        public static final int u = 3;
        public static final int v = 4;
        public static final int w = 5;
        public static final int x = 6;
        public static final int y = 7;
        public static final int z = 8;
        public boolean a = false;
        public int b = -1;
        public int c = 0;
        public String d = null;
        public int e = -1;
        public int f = 0;
        public float g = Float.NaN;
        public int h = -1;
        public float i = Float.NaN;
        public float j = Float.NaN;
        public int k = -1;
        public String l = null;
        public int m = -3;
        public int n = -1;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            r = sparseIntArray;
            sparseIntArray.append(j.c.Nc, 1);
            r.append(j.c.Pc, 2);
            r.append(j.c.Tc, 3);
            r.append(j.c.Mc, 4);
            r.append(j.c.Lc, 5);
            r.append(j.c.Kc, 6);
            r.append(j.c.Oc, 7);
            r.append(j.c.Sc, 8);
            r.append(j.c.Rc, 9);
            r.append(j.c.Qc, 10);
        }

        public void a(c cVar) {
            this.a = cVar.a;
            this.b = cVar.b;
            this.d = cVar.d;
            this.e = cVar.e;
            this.f = cVar.f;
            this.i = cVar.i;
            this.g = cVar.g;
            this.h = cVar.h;
        }

        public void b(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.c.Jc);
            this.a = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                switch (r.get(index)) {
                    case 1:
                        this.i = obtainStyledAttributes.getFloat(index, this.i);
                        break;
                    case 2:
                        this.e = obtainStyledAttributes.getInt(index, this.e);
                        break;
                    case 3:
                        if (obtainStyledAttributes.peekValue(index).type == 3) {
                            this.d = obtainStyledAttributes.getString(index);
                            break;
                        } else {
                            this.d = C6725h90.f755o[obtainStyledAttributes.getInteger(index, 0)];
                            break;
                        }
                    case 4:
                        this.f = obtainStyledAttributes.getInt(index, 0);
                        break;
                    case 5:
                        this.b = e.A0(obtainStyledAttributes, index, this.b);
                        break;
                    case 6:
                        this.c = obtainStyledAttributes.getInteger(index, this.c);
                        break;
                    case 7:
                        this.g = obtainStyledAttributes.getFloat(index, this.g);
                        break;
                    case 8:
                        this.k = obtainStyledAttributes.getInteger(index, this.k);
                        break;
                    case 9:
                        this.j = obtainStyledAttributes.getFloat(index, this.j);
                        break;
                    case 10:
                        int i2 = obtainStyledAttributes.peekValue(index).type;
                        if (i2 == 1) {
                            int resourceId = obtainStyledAttributes.getResourceId(index, -1);
                            this.n = resourceId;
                            if (resourceId != -1) {
                                this.m = -2;
                                break;
                            } else {
                                break;
                            }
                        } else if (i2 == 3) {
                            String string = obtainStyledAttributes.getString(index);
                            this.l = string;
                            if (string.indexOf(RemoteSettings.i) > 0) {
                                this.n = obtainStyledAttributes.getResourceId(index, -1);
                                this.m = -2;
                                break;
                            } else {
                                this.m = -1;
                                break;
                            }
                        } else {
                            this.m = obtainStyledAttributes.getInteger(index, this.n);
                            break;
                        }
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* loaded from: classes.dex */
    public static class d {
        public boolean a = false;
        public int b = 0;
        public int c = 0;
        public float d = 1.0f;
        public float e = Float.NaN;

        public void a(d dVar) {
            this.a = dVar.a;
            this.b = dVar.b;
            this.d = dVar.d;
            this.e = dVar.e;
            this.c = dVar.c;
        }

        public void b(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.c.re);
            this.a = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == j.c.te) {
                    this.d = obtainStyledAttributes.getFloat(index, this.d);
                } else if (index == j.c.se) {
                    this.b = obtainStyledAttributes.getInt(index, this.b);
                    this.b = e.V[this.b];
                } else if (index == j.c.we) {
                    this.c = obtainStyledAttributes.getInt(index, this.c);
                } else if (index == j.c.ve) {
                    this.e = obtainStyledAttributes.getFloat(index, this.e);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: androidx.constraintlayout.widget.e$e  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0020e {
        public static final int A = 12;

        /* renamed from: o  reason: collision with root package name */
        public static SparseIntArray f24o = null;
        public static final int p = 1;
        public static final int q = 2;
        public static final int r = 3;
        public static final int s = 4;
        public static final int t = 5;
        public static final int u = 6;
        public static final int v = 7;
        public static final int w = 8;
        public static final int x = 9;
        public static final int y = 10;
        public static final int z = 11;
        public boolean a = false;
        public float b = 0.0f;
        public float c = 0.0f;
        public float d = 0.0f;
        public float e = 1.0f;
        public float f = 1.0f;
        public float g = Float.NaN;
        public float h = Float.NaN;
        public int i = -1;
        public float j = 0.0f;
        public float k = 0.0f;
        public float l = 0.0f;
        public boolean m = false;
        public float n = 0.0f;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f24o = sparseIntArray;
            sparseIntArray.append(j.c.Ye, 1);
            f24o.append(j.c.Ze, 2);
            f24o.append(j.c.af, 3);
            f24o.append(j.c.We, 4);
            f24o.append(j.c.Xe, 5);
            f24o.append(j.c.Se, 6);
            f24o.append(j.c.Te, 7);
            f24o.append(j.c.Ue, 8);
            f24o.append(j.c.Ve, 9);
            f24o.append(j.c.bf, 10);
            f24o.append(j.c.cf, 11);
            f24o.append(j.c.df, 12);
        }

        public void a(C0020e c0020e) {
            this.a = c0020e.a;
            this.b = c0020e.b;
            this.c = c0020e.c;
            this.d = c0020e.d;
            this.e = c0020e.e;
            this.f = c0020e.f;
            this.g = c0020e.g;
            this.h = c0020e.h;
            this.i = c0020e.i;
            this.j = c0020e.j;
            this.k = c0020e.k;
            this.l = c0020e.l;
            this.m = c0020e.m;
            this.n = c0020e.n;
        }

        public void b(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.c.Re);
            this.a = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                switch (f24o.get(index)) {
                    case 1:
                        this.b = obtainStyledAttributes.getFloat(index, this.b);
                        break;
                    case 2:
                        this.c = obtainStyledAttributes.getFloat(index, this.c);
                        break;
                    case 3:
                        this.d = obtainStyledAttributes.getFloat(index, this.d);
                        break;
                    case 4:
                        this.e = obtainStyledAttributes.getFloat(index, this.e);
                        break;
                    case 5:
                        this.f = obtainStyledAttributes.getFloat(index, this.f);
                        break;
                    case 6:
                        this.g = obtainStyledAttributes.getDimension(index, this.g);
                        break;
                    case 7:
                        this.h = obtainStyledAttributes.getDimension(index, this.h);
                        break;
                    case 8:
                        this.j = obtainStyledAttributes.getDimension(index, this.j);
                        break;
                    case 9:
                        this.k = obtainStyledAttributes.getDimension(index, this.k);
                        break;
                    case 10:
                        this.l = obtainStyledAttributes.getDimension(index, this.l);
                        break;
                    case 11:
                        this.m = true;
                        this.n = obtainStyledAttributes.getDimension(index, this.n);
                        break;
                    case 12:
                        this.i = e.A0(obtainStyledAttributes, index, this.i);
                        break;
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* loaded from: classes.dex */
    public class f {

        /* renamed from: o  reason: collision with root package name */
        public static final String f25o = "       ";
        public Writer a;
        public ConstraintLayout b;
        public Context c;
        public int d;
        public int e = 0;
        public final String f = "'left'";
        public final String g = "'right'";
        public final String h = "'baseline'";
        public final String i = "'bottom'";
        public final String j = "'top'";
        public final String k = "'start'";
        public final String l = "'end'";
        public HashMap<Integer, String> m = new HashMap<>();

        public f(Writer writer, ConstraintLayout constraintLayout, int i) throws IOException {
            this.a = writer;
            this.b = constraintLayout;
            this.c = constraintLayout.getContext();
            this.d = i;
        }

        public String a(int i) {
            if (this.m.containsKey(Integer.valueOf(i))) {
                return "'" + this.m.get(Integer.valueOf(i)) + "'";
            } else if (i == 0) {
                return "'parent'";
            } else {
                String b = b(i);
                this.m.put(Integer.valueOf(i), b);
                return "'" + b + "'";
            }
        }

        public String b(int i) {
            try {
                if (i != -1) {
                    return this.c.getResources().getResourceEntryName(i);
                }
                StringBuilder sb = new StringBuilder();
                sb.append("unknown");
                int i2 = this.e + 1;
                this.e = i2;
                sb.append(i2);
                return sb.toString();
            } catch (Exception unused) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("unknown");
                int i3 = this.e + 1;
                this.e = i3;
                sb2.append(i3);
                return sb2.toString();
            }
        }

        public void c(int i, float f, int i2) throws IOException {
            if (i == -1) {
                return;
            }
            this.a.write("       circle");
            this.a.write(":[");
            this.a.write(a(i));
            Writer writer = this.a;
            writer.write(C6566gU0.h + f);
            Writer writer2 = this.a;
            writer2.write(i2 + C6566gU0.g);
        }

        public void d(String str, int i, String str2, int i2, int i3) throws IOException {
            if (i == -1) {
                return;
            }
            Writer writer = this.a;
            writer.write(f25o + str);
            this.a.write(":[");
            this.a.write(a(i));
            this.a.write(" , ");
            this.a.write(str2);
            if (i2 != 0) {
                Writer writer2 = this.a;
                writer2.write(" , " + i2);
            }
            this.a.write("],\n");
        }

        public final void e(String str, int i, int i2, float f, int i3, int i4, boolean z) throws IOException {
            if (i == 0) {
                if (i4 == -1 && i3 == -1) {
                    if (i2 != 1) {
                        if (i2 == 2) {
                            Writer writer = this.a;
                            writer.write(f25o + str + ": '" + f + "%',\n");
                            return;
                        }
                        return;
                    }
                    Writer writer2 = this.a;
                    writer2.write(f25o + str + ": '???????????',\n");
                } else if (i2 != 0) {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            return;
                        }
                        Writer writer3 = this.a;
                        writer3.write(f25o + str + ": {'" + f + "'% ," + i3 + C6566gU0.h + i4 + "}\n");
                        return;
                    }
                    Writer writer4 = this.a;
                    writer4.write(f25o + str + ": {'wrap' ," + i3 + C6566gU0.h + i4 + "}\n");
                } else {
                    Writer writer5 = this.a;
                    writer5.write(f25o + str + ": {'spread' ," + i3 + C6566gU0.h + i4 + "}\n");
                }
            } else if (i == -2) {
                Writer writer6 = this.a;
                writer6.write(f25o + str + ": 'wrap'\n");
            } else if (i == -1) {
                Writer writer7 = this.a;
                writer7.write(f25o + str + ": 'parent'\n");
            } else {
                Writer writer8 = this.a;
                writer8.write(f25o + str + ": " + i + ",\n");
            }
        }

        public final void f(int i, int i2, int i3, float f) throws IOException {
            j("'orientation'", i);
            j("'guideBegin'", i2);
            j("'guideEnd'", i3);
            h("'guidePercent'", f);
        }

        public void g() throws IOException {
            this.a.write("\n'ConstraintSet':{\n");
            for (Integer num : e.this.h.keySet()) {
                String a = a(num.intValue());
                Writer writer = this.a;
                writer.write(a + ":{\n");
                b bVar = ((a) e.this.h.get(num)).e;
                e("height", bVar.e, bVar.a0, bVar.g0, bVar.e0, bVar.c0, bVar.o0);
                e("width", bVar.d, bVar.Z, bVar.f0, bVar.d0, bVar.b0, bVar.n0);
                d("'left'", bVar.j, "'left'", bVar.H, bVar.O);
                d("'left'", bVar.k, "'right'", bVar.H, bVar.O);
                d("'right'", bVar.l, "'left'", bVar.I, bVar.Q);
                d("'right'", bVar.m, "'right'", bVar.I, bVar.Q);
                d("'baseline'", bVar.r, "'baseline'", -1, bVar.U);
                d("'baseline'", bVar.s, "'top'", -1, bVar.U);
                d("'baseline'", bVar.t, "'bottom'", -1, bVar.U);
                d("'top'", bVar.f22o, "'bottom'", bVar.J, bVar.P);
                d("'top'", bVar.n, "'top'", bVar.J, bVar.P);
                d("'bottom'", bVar.q, "'bottom'", bVar.K, bVar.R);
                d("'bottom'", bVar.p, "'top'", bVar.K, bVar.R);
                d("'start'", bVar.v, "'start'", bVar.M, bVar.T);
                d("'start'", bVar.u, "'end'", bVar.M, bVar.T);
                d("'end'", bVar.w, "'start'", bVar.L, bVar.S);
                d("'end'", bVar.x, "'end'", bVar.L, bVar.S);
                i("'horizontalBias'", bVar.y, 0.5f);
                i("'verticalBias'", bVar.z, 0.5f);
                c(bVar.B, bVar.D, bVar.C);
                f(bVar.G, bVar.f, bVar.g, bVar.h);
                k("'dimensionRatio'", bVar.A);
                j("'barrierMargin'", bVar.i0);
                j("'type'", bVar.j0);
                k("'ReferenceId'", bVar.l0);
                m("'mBarrierAllowsGoneWidgets'", bVar.p0, true);
                j("'WrapBehavior'", bVar.q0);
                h("'verticalWeight'", bVar.V);
                h("'horizontalWeight'", bVar.W);
                j("'horizontalChainStyle'", bVar.X);
                j("'verticalChainStyle'", bVar.Y);
                j("'barrierDirection'", bVar.h0);
                int[] iArr = bVar.k0;
                if (iArr != null) {
                    n("'ReferenceIds'", iArr);
                }
                this.a.write("}\n");
            }
            this.a.write("}\n");
        }

        public void h(String str, float f) throws IOException {
            if (f == -1.0f) {
                return;
            }
            Writer writer = this.a;
            writer.write(f25o + str);
            Writer writer2 = this.a;
            writer2.write(": " + f);
            this.a.write(",\n");
        }

        public void i(String str, float f, float f2) throws IOException {
            if (f == f2) {
                return;
            }
            Writer writer = this.a;
            writer.write(f25o + str);
            Writer writer2 = this.a;
            writer2.write(": " + f);
            this.a.write(",\n");
        }

        public void j(String str, int i) throws IOException {
            if (i != 0 && i != -1) {
                Writer writer = this.a;
                writer.write(f25o + str);
                this.a.write(":");
                Writer writer2 = this.a;
                writer2.write(C6566gU0.h + i);
                this.a.write("\n");
            }
        }

        public void k(String str, String str2) throws IOException {
            if (str2 == null) {
                return;
            }
            Writer writer = this.a;
            writer.write(f25o + str);
            this.a.write(":");
            Writer writer2 = this.a;
            writer2.write(C6566gU0.h + str2);
            this.a.write("\n");
        }

        public void l(String str, boolean z) throws IOException {
            if (!z) {
                return;
            }
            Writer writer = this.a;
            writer.write(f25o + str);
            Writer writer2 = this.a;
            writer2.write(": " + z);
            this.a.write(",\n");
        }

        public void m(String str, boolean z, boolean z2) throws IOException {
            if (z == z2) {
                return;
            }
            Writer writer = this.a;
            writer.write(f25o + str);
            Writer writer2 = this.a;
            writer2.write(": " + z);
            this.a.write(",\n");
        }

        public void n(String str, int[] iArr) throws IOException {
            String str2;
            if (iArr == null) {
                return;
            }
            Writer writer = this.a;
            writer.write(f25o + str);
            this.a.write(": ");
            for (int i = 0; i < iArr.length; i++) {
                Writer writer2 = this.a;
                StringBuilder sb = new StringBuilder();
                if (i == 0) {
                    str2 = C6566gU0.f;
                } else {
                    str2 = C6566gU0.h;
                }
                sb.append(str2);
                sb.append(a(iArr[i]));
                writer2.write(sb.toString());
            }
            this.a.write("],\n");
        }
    }

    /* loaded from: classes.dex */
    public class g {

        /* renamed from: o  reason: collision with root package name */
        public static final String f26o = "\n       ";
        public Writer a;
        public ConstraintLayout b;
        public Context c;
        public int d;
        public int e = 0;
        public final String f = "'left'";
        public final String g = "'right'";
        public final String h = "'baseline'";
        public final String i = "'bottom'";
        public final String j = "'top'";
        public final String k = "'start'";
        public final String l = "'end'";
        public HashMap<Integer, String> m = new HashMap<>();

        public g(Writer writer, ConstraintLayout constraintLayout, int i) throws IOException {
            this.a = writer;
            this.b = constraintLayout;
            this.c = constraintLayout.getContext();
            this.d = i;
        }

        public String a(int i) {
            if (this.m.containsKey(Integer.valueOf(i))) {
                return "@+id/" + this.m.get(Integer.valueOf(i)) + "";
            } else if (i == 0) {
                return e.W1;
            } else {
                String b = b(i);
                this.m.put(Integer.valueOf(i), b);
                return "@+id/" + b + "";
            }
        }

        public String b(int i) {
            try {
                if (i != -1) {
                    return this.c.getResources().getResourceEntryName(i);
                }
                StringBuilder sb = new StringBuilder();
                sb.append("unknown");
                int i2 = this.e + 1;
                this.e = i2;
                sb.append(i2);
                return sb.toString();
            } catch (Exception unused) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("unknown");
                int i3 = this.e + 1;
                this.e = i3;
                sb2.append(i3);
                return sb2.toString();
            }
        }

        public final void c(String str, int i, int i2) throws IOException {
            if (i != i2) {
                if (i == -2) {
                    Writer writer = this.a;
                    writer.write(f26o + str + "=\"wrap_content\"");
                } else if (i == -1) {
                    Writer writer2 = this.a;
                    writer2.write(f26o + str + "=\"match_parent\"");
                } else {
                    Writer writer3 = this.a;
                    writer3.write(f26o + str + "=\"" + i + "dp\"");
                }
            }
        }

        public final void d(String str, boolean z, boolean z2) throws IOException {
            if (z != z2) {
                Writer writer = this.a;
                writer.write(f26o + str + "=\"" + z + "dp\"");
            }
        }

        public void e(int i, float f, int i2) throws IOException {
            if (i == -1) {
                return;
            }
            this.a.write(C5445bv2.z0);
            this.a.write(":[");
            this.a.write(a(i));
            Writer writer = this.a;
            writer.write(C6566gU0.h + f);
            Writer writer2 = this.a;
            writer2.write(i2 + C6566gU0.g);
        }

        public void f(String str, int i, String str2, int i2, int i3) throws IOException {
            if (i == -1) {
                return;
            }
            Writer writer = this.a;
            writer.write(f26o + str);
            this.a.write(":[");
            this.a.write(a(i));
            this.a.write(" , ");
            this.a.write(str2);
            if (i2 != 0) {
                Writer writer2 = this.a;
                writer2.write(" , " + i2);
            }
            this.a.write("],\n");
        }

        public final void g(String str, int i, int i2) throws IOException {
            if (i != i2) {
                Writer writer = this.a;
                writer.write(f26o + str + "=\"" + i + "dp\"");
            }
        }

        public final void h(String str, int i, String[] strArr, int i2) throws IOException {
            if (i != i2) {
                Writer writer = this.a;
                writer.write(f26o + str + "=\"" + strArr[i] + AbstractC4253Sp2.b.x1);
            }
        }

        public void i() throws IOException {
            this.a.write("\n<ConstraintSet>\n");
            for (Integer num : e.this.h.keySet()) {
                String a = a(num.intValue());
                this.a.write("  <Constraint");
                Writer writer = this.a;
                writer.write("\n       android:id=\"" + a + AbstractC4253Sp2.b.x1);
                b bVar = ((a) e.this.h.get(num)).e;
                c("android:layout_width", bVar.d, -5);
                c("android:layout_height", bVar.e, -5);
                j("app:layout_constraintGuide_begin", (float) bVar.f, -1.0f);
                j("app:layout_constraintGuide_end", bVar.g, -1.0f);
                j("app:layout_constraintGuide_percent", bVar.h, -1.0f);
                j("app:layout_constraintHorizontal_bias", bVar.y, 0.5f);
                j("app:layout_constraintVertical_bias", bVar.z, 0.5f);
                m("app:layout_constraintDimensionRatio", bVar.A, null);
                o("app:layout_constraintCircle", bVar.B);
                j("app:layout_constraintCircleRadius", bVar.C, 0.0f);
                j("app:layout_constraintCircleAngle", bVar.D, 0.0f);
                j("android:orientation", bVar.G, -1.0f);
                j("app:layout_constraintVertical_weight", bVar.V, -1.0f);
                j("app:layout_constraintHorizontal_weight", bVar.W, -1.0f);
                j("app:layout_constraintHorizontal_chainStyle", bVar.X, 0.0f);
                j("app:layout_constraintVertical_chainStyle", bVar.Y, 0.0f);
                j("app:barrierDirection", bVar.h0, -1.0f);
                j("app:barrierMargin", bVar.i0, 0.0f);
                g("app:layout_marginLeft", bVar.H, 0);
                g("app:layout_goneMarginLeft", bVar.O, Integer.MIN_VALUE);
                g("app:layout_marginRight", bVar.I, 0);
                g("app:layout_goneMarginRight", bVar.Q, Integer.MIN_VALUE);
                g("app:layout_marginStart", bVar.M, 0);
                g("app:layout_goneMarginStart", bVar.T, Integer.MIN_VALUE);
                g("app:layout_marginEnd", bVar.L, 0);
                g("app:layout_goneMarginEnd", bVar.S, Integer.MIN_VALUE);
                g("app:layout_marginTop", bVar.J, 0);
                g("app:layout_goneMarginTop", bVar.P, Integer.MIN_VALUE);
                g("app:layout_marginBottom", bVar.K, 0);
                g("app:layout_goneMarginBottom", bVar.R, Integer.MIN_VALUE);
                g("app:goneBaselineMargin", bVar.U, Integer.MIN_VALUE);
                g("app:baselineMargin", bVar.N, 0);
                d("app:layout_constrainedWidth", bVar.n0, false);
                d("app:layout_constrainedHeight", bVar.o0, false);
                d("app:barrierAllowsGoneWidgets", bVar.p0, true);
                j("app:layout_wrapBehaviorInParent", bVar.q0, 0.0f);
                o("app:baselineToBaseline", bVar.r);
                o("app:baselineToBottom", bVar.t);
                o("app:baselineToTop", bVar.s);
                o("app:layout_constraintBottom_toBottomOf", bVar.q);
                o("app:layout_constraintBottom_toTopOf", bVar.p);
                o("app:layout_constraintEnd_toEndOf", bVar.x);
                o("app:layout_constraintEnd_toStartOf", bVar.w);
                o("app:layout_constraintLeft_toLeftOf", bVar.j);
                o("app:layout_constraintLeft_toRightOf", bVar.k);
                o("app:layout_constraintRight_toLeftOf", bVar.l);
                o("app:layout_constraintRight_toRightOf", bVar.m);
                o("app:layout_constraintStart_toEndOf", bVar.u);
                o("app:layout_constraintStart_toStartOf", bVar.v);
                o("app:layout_constraintTop_toBottomOf", bVar.f22o);
                o("app:layout_constraintTop_toTopOf", bVar.n);
                String[] strArr = {"spread", "wrap", "percent"};
                h("app:layout_constraintHeight_default", bVar.a0, strArr, 0);
                j("app:layout_constraintHeight_percent", bVar.g0, 1.0f);
                g("app:layout_constraintHeight_min", bVar.e0, 0);
                g("app:layout_constraintHeight_max", bVar.c0, 0);
                d("android:layout_constrainedHeight", bVar.o0, false);
                h("app:layout_constraintWidth_default", bVar.Z, strArr, 0);
                j("app:layout_constraintWidth_percent", bVar.f0, 1.0f);
                g("app:layout_constraintWidth_min", bVar.d0, 0);
                g("app:layout_constraintWidth_max", bVar.b0, 0);
                d("android:layout_constrainedWidth", bVar.n0, false);
                j("app:layout_constraintVertical_weight", bVar.V, -1.0f);
                j("app:layout_constraintHorizontal_weight", bVar.W, -1.0f);
                k("app:layout_constraintHorizontal_chainStyle", bVar.X);
                k("app:layout_constraintVertical_chainStyle", bVar.Y);
                h("app:barrierDirection", bVar.h0, new String[]{"left", C5445bv2.n0, C9698tH2.l, "bottom", "start", "end"}, -1);
                m("app:layout_constraintTag", bVar.m0, null);
                int[] iArr = bVar.k0;
                if (iArr != null) {
                    n("'ReferenceIds'", iArr);
                }
                this.a.write(" />\n");
            }
            this.a.write("</ConstraintSet>\n");
        }

        public void j(String str, float f, float f2) throws IOException {
            if (f == f2) {
                return;
            }
            Writer writer = this.a;
            writer.write(f26o + str);
            Writer writer2 = this.a;
            writer2.write("=\"" + f + AbstractC4253Sp2.b.x1);
        }

        public void k(String str, int i) throws IOException {
            if (i != 0 && i != -1) {
                Writer writer = this.a;
                writer.write(f26o + str + "=\"" + i + "\"\n");
            }
        }

        public void l(String str, String str2) throws IOException {
            if (str2 == null) {
                return;
            }
            this.a.write(str);
            this.a.write(":");
            Writer writer = this.a;
            writer.write(C6566gU0.h + str2);
            this.a.write("\n");
        }

        public void m(String str, String str2, String str3) throws IOException {
            if (str2 != null && !str2.equals(str3)) {
                Writer writer = this.a;
                writer.write(f26o + str);
                Writer writer2 = this.a;
                writer2.write("=\"" + str2 + AbstractC4253Sp2.b.x1);
            }
        }

        public void n(String str, int[] iArr) throws IOException {
            String str2;
            if (iArr == null) {
                return;
            }
            Writer writer = this.a;
            writer.write(f26o + str);
            this.a.write(":");
            for (int i = 0; i < iArr.length; i++) {
                Writer writer2 = this.a;
                StringBuilder sb = new StringBuilder();
                if (i == 0) {
                    str2 = C6566gU0.f;
                } else {
                    str2 = C6566gU0.h;
                }
                sb.append(str2);
                sb.append(a(iArr[i]));
                writer2.write(sb.toString());
            }
            this.a.write("],\n");
        }

        public void o(String str, int i) throws IOException {
            if (i == -1) {
                return;
            }
            Writer writer = this.a;
            writer.write(f26o + str);
            Writer writer2 = this.a;
            writer2.write("=\"" + a(i) + AbstractC4253Sp2.b.x1);
        }
    }

    static {
        X.append(j.c.R0, 25);
        X.append(j.c.S0, 26);
        X.append(j.c.U0, 29);
        X.append(j.c.V0, 30);
        X.append(j.c.b1, 36);
        X.append(j.c.a1, 35);
        X.append(j.c.y0, 4);
        X.append(j.c.x0, 3);
        X.append(j.c.t0, 1);
        X.append(j.c.v0, 91);
        X.append(j.c.u0, 92);
        X.append(j.c.k1, 6);
        X.append(j.c.l1, 7);
        X.append(j.c.F0, 17);
        X.append(j.c.G0, 18);
        X.append(j.c.H0, 19);
        X.append(j.c.p0, 99);
        X.append(j.c.n, 27);
        X.append(j.c.W0, 32);
        X.append(j.c.X0, 33);
        X.append(j.c.E0, 10);
        X.append(j.c.D0, 9);
        X.append(j.c.p1, 13);
        X.append(j.c.s1, 16);
        X.append(j.c.q1, 14);
        X.append(j.c.n1, 11);
        X.append(j.c.r1, 15);
        X.append(j.c.o1, 12);
        X.append(j.c.e1, 40);
        X.append(j.c.P0, 39);
        X.append(j.c.O0, 41);
        X.append(j.c.d1, 42);
        X.append(j.c.N0, 20);
        X.append(j.c.c1, 37);
        X.append(j.c.C0, 5);
        X.append(j.c.Q0, 87);
        X.append(j.c.Z0, 87);
        X.append(j.c.T0, 87);
        X.append(j.c.w0, 87);
        X.append(j.c.s0, 87);
        X.append(j.c.s, 24);
        X.append(j.c.u, 28);
        X.append(j.c.K, 31);
        X.append(j.c.L, 8);
        X.append(j.c.t, 34);
        X.append(j.c.v, 2);
        X.append(j.c.q, 23);
        X.append(j.c.r, 21);
        X.append(j.c.f1, 95);
        X.append(j.c.I0, 96);
        X.append(j.c.p, 22);
        X.append(j.c.A, 43);
        X.append(j.c.N, 44);
        X.append(j.c.I, 45);
        X.append(j.c.J, 46);
        X.append(j.c.H, 60);
        X.append(j.c.F, 47);
        X.append(j.c.G, 48);
        X.append(j.c.B, 49);
        X.append(j.c.C, 50);
        X.append(j.c.D, 51);
        X.append(j.c.E, 52);
        X.append(j.c.M, 53);
        X.append(j.c.g1, 54);
        X.append(j.c.J0, 55);
        X.append(j.c.h1, 56);
        X.append(j.c.K0, 57);
        X.append(j.c.i1, 58);
        X.append(j.c.L0, 59);
        X.append(j.c.z0, 61);
        X.append(j.c.B0, 62);
        X.append(j.c.A0, 63);
        X.append(j.c.P, 64);
        X.append(j.c.E1, 65);
        X.append(j.c.W, 66);
        X.append(j.c.F1, 67);
        X.append(j.c.w1, 79);
        X.append(j.c.f27o, 38);
        X.append(j.c.v1, 68);
        X.append(j.c.j1, 69);
        X.append(j.c.M0, 70);
        X.append(j.c.u1, 97);
        X.append(j.c.T, 71);
        X.append(j.c.R, 72);
        X.append(j.c.S, 73);
        X.append(j.c.U, 74);
        X.append(j.c.Q, 75);
        X.append(j.c.x1, 76);
        X.append(j.c.Y0, 77);
        X.append(j.c.G1, 78);
        X.append(j.c.r0, 80);
        X.append(j.c.q0, 81);
        X.append(j.c.z1, 82);
        X.append(j.c.D1, 83);
        X.append(j.c.C1, 84);
        X.append(j.c.B1, 85);
        X.append(j.c.A1, 86);
        SparseIntArray sparseIntArray = Y;
        int i2 = j.c.J5;
        sparseIntArray.append(i2, 6);
        Y.append(i2, 7);
        Y.append(j.c.c4, 27);
        Y.append(j.c.N5, 13);
        Y.append(j.c.Q5, 16);
        Y.append(j.c.O5, 14);
        Y.append(j.c.L5, 11);
        Y.append(j.c.P5, 15);
        Y.append(j.c.M5, 12);
        Y.append(j.c.C5, 40);
        Y.append(j.c.v5, 39);
        Y.append(j.c.u5, 41);
        Y.append(j.c.B5, 42);
        Y.append(j.c.t5, 20);
        Y.append(j.c.A5, 37);
        Y.append(j.c.k5, 5);
        Y.append(j.c.w5, 87);
        Y.append(j.c.z5, 87);
        Y.append(j.c.x5, 87);
        Y.append(j.c.h5, 87);
        Y.append(j.c.g5, 87);
        Y.append(j.c.h4, 24);
        Y.append(j.c.j4, 28);
        Y.append(j.c.z4, 31);
        Y.append(j.c.A4, 8);
        Y.append(j.c.i4, 34);
        Y.append(j.c.k4, 2);
        Y.append(j.c.f4, 23);
        Y.append(j.c.g4, 21);
        Y.append(j.c.D5, 95);
        Y.append(j.c.o5, 96);
        Y.append(j.c.e4, 22);
        Y.append(j.c.p4, 43);
        Y.append(j.c.C4, 44);
        Y.append(j.c.x4, 45);
        Y.append(j.c.y4, 46);
        Y.append(j.c.w4, 60);
        Y.append(j.c.u4, 47);
        Y.append(j.c.v4, 48);
        Y.append(j.c.q4, 49);
        Y.append(j.c.r4, 50);
        Y.append(j.c.s4, 51);
        Y.append(j.c.t4, 52);
        Y.append(j.c.B4, 53);
        Y.append(j.c.E5, 54);
        Y.append(j.c.p5, 55);
        Y.append(j.c.F5, 56);
        Y.append(j.c.q5, 57);
        Y.append(j.c.G5, 58);
        Y.append(j.c.r5, 59);
        Y.append(j.c.j5, 62);
        Y.append(j.c.i5, 63);
        Y.append(j.c.E4, 64);
        Y.append(j.c.d6, 65);
        Y.append(j.c.K4, 66);
        Y.append(j.c.e6, 67);
        Y.append(j.c.U5, 79);
        Y.append(j.c.d4, 38);
        Y.append(j.c.V5, 98);
        Y.append(j.c.T5, 68);
        Y.append(j.c.H5, 69);
        Y.append(j.c.s5, 70);
        Y.append(j.c.I4, 71);
        Y.append(j.c.G4, 72);
        Y.append(j.c.H4, 73);
        Y.append(j.c.J4, 74);
        Y.append(j.c.F4, 75);
        Y.append(j.c.W5, 76);
        Y.append(j.c.y5, 77);
        Y.append(j.c.f6, 78);
        Y.append(j.c.f5, 80);
        Y.append(j.c.e5, 81);
        Y.append(j.c.Y5, 82);
        Y.append(j.c.c6, 83);
        Y.append(j.c.b6, 84);
        Y.append(j.c.a6, 85);
        Y.append(j.c.Z5, 86);
        Y.append(j.c.S5, 97);
    }

    public static int A0(TypedArray typedArray, int i2, int i3) {
        int resourceId = typedArray.getResourceId(i2, i3);
        if (resourceId == -1) {
            return typedArray.getInt(i2, -1);
        }
        return resourceId;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void D0(Object obj, TypedArray typedArray, int i2, int i3) {
        int dimensionPixelSize;
        boolean z2;
        if (obj != null) {
            int i4 = typedArray.peekValue(i2).type;
            if (i4 != 3) {
                int i5 = 0;
                if (i4 != 5) {
                    dimensionPixelSize = typedArray.getInt(i2, 0);
                    if (dimensionPixelSize != -4) {
                        if (dimensionPixelSize == -3 || (dimensionPixelSize != -2 && dimensionPixelSize != -1)) {
                            z2 = false;
                        }
                    } else {
                        z2 = true;
                        i5 = -2;
                    }
                    if (!(obj instanceof ConstraintLayout.b)) {
                        ConstraintLayout.b bVar = (ConstraintLayout.b) obj;
                        if (i3 == 0) {
                            ((ViewGroup.MarginLayoutParams) bVar).width = i5;
                            bVar.a0 = z2;
                            return;
                        }
                        ((ViewGroup.MarginLayoutParams) bVar).height = i5;
                        bVar.b0 = z2;
                        return;
                    } else if (obj instanceof b) {
                        b bVar2 = (b) obj;
                        if (i3 == 0) {
                            bVar2.d = i5;
                            bVar2.n0 = z2;
                            return;
                        }
                        bVar2.e = i5;
                        bVar2.o0 = z2;
                        return;
                    } else if (obj instanceof a.C0019a) {
                        a.C0019a c0019a = (a.C0019a) obj;
                        if (i3 == 0) {
                            c0019a.b(23, i5);
                            c0019a.d(80, z2);
                            return;
                        }
                        c0019a.b(21, i5);
                        c0019a.d(81, z2);
                        return;
                    } else {
                        return;
                    }
                }
                dimensionPixelSize = typedArray.getDimensionPixelSize(i2, 0);
                i5 = dimensionPixelSize;
                z2 = false;
                if (!(obj instanceof ConstraintLayout.b)) {
                }
            } else {
                E0(obj, typedArray.getString(i2), i3);
            }
        }
    }

    public static void E0(Object obj, String str, int i2) {
        if (str != null) {
            int indexOf = str.indexOf(61);
            int length = str.length();
            if (indexOf > 0 && indexOf < length - 1) {
                String substring = str.substring(0, indexOf);
                String substring2 = str.substring(indexOf + 1);
                if (substring2.length() > 0) {
                    String trim = substring.trim();
                    String trim2 = substring2.trim();
                    if (V1.equalsIgnoreCase(trim)) {
                        if (obj instanceof ConstraintLayout.b) {
                            ConstraintLayout.b bVar = (ConstraintLayout.b) obj;
                            if (i2 == 0) {
                                ((ViewGroup.MarginLayoutParams) bVar).width = 0;
                            } else {
                                ((ViewGroup.MarginLayoutParams) bVar).height = 0;
                            }
                            F0(bVar, trim2);
                            return;
                        } else if (obj instanceof b) {
                            ((b) obj).A = trim2;
                            return;
                        } else if (obj instanceof a.C0019a) {
                            ((a.C0019a) obj).c(5, trim2);
                            return;
                        } else {
                            return;
                        }
                    }
                    try {
                        if ("weight".equalsIgnoreCase(trim)) {
                            float parseFloat = Float.parseFloat(trim2);
                            if (obj instanceof ConstraintLayout.b) {
                                ConstraintLayout.b bVar2 = (ConstraintLayout.b) obj;
                                if (i2 == 0) {
                                    ((ViewGroup.MarginLayoutParams) bVar2).width = 0;
                                    bVar2.L = parseFloat;
                                    return;
                                }
                                ((ViewGroup.MarginLayoutParams) bVar2).height = 0;
                                bVar2.M = parseFloat;
                            } else if (obj instanceof b) {
                                b bVar3 = (b) obj;
                                if (i2 == 0) {
                                    bVar3.d = 0;
                                    bVar3.W = parseFloat;
                                    return;
                                }
                                bVar3.e = 0;
                                bVar3.V = parseFloat;
                            } else if (obj instanceof a.C0019a) {
                                a.C0019a c0019a = (a.C0019a) obj;
                                if (i2 == 0) {
                                    c0019a.b(23, 0);
                                    c0019a.a(39, parseFloat);
                                    return;
                                }
                                c0019a.b(21, 0);
                                c0019a.a(40, parseFloat);
                            }
                        } else if (W1.equalsIgnoreCase(trim)) {
                            float max = Math.max(0.0f, Math.min(1.0f, Float.parseFloat(trim2)));
                            if (obj instanceof ConstraintLayout.b) {
                                ConstraintLayout.b bVar4 = (ConstraintLayout.b) obj;
                                if (i2 == 0) {
                                    ((ViewGroup.MarginLayoutParams) bVar4).width = 0;
                                    bVar4.V = max;
                                    bVar4.P = 2;
                                    return;
                                }
                                ((ViewGroup.MarginLayoutParams) bVar4).height = 0;
                                bVar4.W = max;
                                bVar4.Q = 2;
                            } else if (obj instanceof b) {
                                b bVar5 = (b) obj;
                                if (i2 == 0) {
                                    bVar5.d = 0;
                                    bVar5.f0 = max;
                                    bVar5.Z = 2;
                                    return;
                                }
                                bVar5.e = 0;
                                bVar5.g0 = max;
                                bVar5.a0 = 2;
                            } else if (obj instanceof a.C0019a) {
                                a.C0019a c0019a2 = (a.C0019a) obj;
                                if (i2 == 0) {
                                    c0019a2.b(23, 0);
                                    c0019a2.b(54, 2);
                                    return;
                                }
                                c0019a2.b(21, 0);
                                c0019a2.b(55, 2);
                            }
                        }
                    } catch (NumberFormatException unused) {
                    }
                }
            }
        }
    }

    public static void F0(ConstraintLayout.b bVar, String str) {
        float f2 = Float.NaN;
        int i2 = -1;
        if (str != null) {
            int length = str.length();
            int indexOf = str.indexOf(44);
            int i3 = 0;
            if (indexOf > 0 && indexOf < length - 1) {
                String substring = str.substring(0, indexOf);
                if (substring.equalsIgnoreCase(C2638Cg0.T4)) {
                    i2 = 0;
                } else if (substring.equalsIgnoreCase(C5738d80.e)) {
                    i2 = 1;
                }
                i3 = indexOf + 1;
            }
            int indexOf2 = str.indexOf(58);
            try {
                if (indexOf2 >= 0 && indexOf2 < length - 1) {
                    String substring2 = str.substring(i3, indexOf2);
                    String substring3 = str.substring(indexOf2 + 1);
                    if (substring2.length() > 0 && substring3.length() > 0) {
                        float parseFloat = Float.parseFloat(substring2);
                        float parseFloat2 = Float.parseFloat(substring3);
                        if (parseFloat > 0.0f && parseFloat2 > 0.0f) {
                            f2 = i2 == 1 ? Math.abs(parseFloat2 / parseFloat) : Math.abs(parseFloat / parseFloat2);
                        }
                    }
                } else {
                    String substring4 = str.substring(i3);
                    if (substring4.length() > 0) {
                        f2 = Float.parseFloat(substring4);
                    }
                }
            } catch (NumberFormatException unused) {
            }
        }
        bVar.I = str;
        bVar.J = f2;
        bVar.K = i2;
    }

    public static void K0(a aVar, TypedArray typedArray) {
        int indexCount = typedArray.getIndexCount();
        a.C0019a c0019a = new a.C0019a();
        aVar.h = c0019a;
        aVar.d.a = false;
        aVar.e.b = false;
        aVar.c.a = false;
        aVar.f.a = false;
        for (int i2 = 0; i2 < indexCount; i2++) {
            int index = typedArray.getIndex(i2);
            switch (Y.get(index)) {
                case 2:
                    c0019a.b(2, typedArray.getDimensionPixelSize(index, aVar.e.K));
                    break;
                case 3:
                case 4:
                case 9:
                case 10:
                case 25:
                case 26:
                case 29:
                case 30:
                case 32:
                case 33:
                case 35:
                case 36:
                case 61:
                case 88:
                case 89:
                case 90:
                case 91:
                case 92:
                default:
                    Log.w("ConstraintSet", "Unknown attribute 0x" + Integer.toHexString(index) + "   " + X.get(index));
                    break;
                case 5:
                    c0019a.c(5, typedArray.getString(index));
                    break;
                case 6:
                    c0019a.b(6, typedArray.getDimensionPixelOffset(index, aVar.e.E));
                    break;
                case 7:
                    c0019a.b(7, typedArray.getDimensionPixelOffset(index, aVar.e.F));
                    break;
                case 8:
                    c0019a.b(8, typedArray.getDimensionPixelSize(index, aVar.e.L));
                    break;
                case 11:
                    c0019a.b(11, typedArray.getDimensionPixelSize(index, aVar.e.R));
                    break;
                case 12:
                    c0019a.b(12, typedArray.getDimensionPixelSize(index, aVar.e.S));
                    break;
                case 13:
                    c0019a.b(13, typedArray.getDimensionPixelSize(index, aVar.e.O));
                    break;
                case 14:
                    c0019a.b(14, typedArray.getDimensionPixelSize(index, aVar.e.Q));
                    break;
                case 15:
                    c0019a.b(15, typedArray.getDimensionPixelSize(index, aVar.e.T));
                    break;
                case 16:
                    c0019a.b(16, typedArray.getDimensionPixelSize(index, aVar.e.P));
                    break;
                case 17:
                    c0019a.b(17, typedArray.getDimensionPixelOffset(index, aVar.e.f));
                    break;
                case 18:
                    c0019a.b(18, typedArray.getDimensionPixelOffset(index, aVar.e.g));
                    break;
                case 19:
                    c0019a.a(19, typedArray.getFloat(index, aVar.e.h));
                    break;
                case 20:
                    c0019a.a(20, typedArray.getFloat(index, aVar.e.y));
                    break;
                case 21:
                    c0019a.b(21, typedArray.getLayoutDimension(index, aVar.e.e));
                    break;
                case 22:
                    c0019a.b(22, V[typedArray.getInt(index, aVar.c.b)]);
                    break;
                case 23:
                    c0019a.b(23, typedArray.getLayoutDimension(index, aVar.e.d));
                    break;
                case 24:
                    c0019a.b(24, typedArray.getDimensionPixelSize(index, aVar.e.H));
                    break;
                case 27:
                    c0019a.b(27, typedArray.getInt(index, aVar.e.G));
                    break;
                case 28:
                    c0019a.b(28, typedArray.getDimensionPixelSize(index, aVar.e.I));
                    break;
                case 31:
                    c0019a.b(31, typedArray.getDimensionPixelSize(index, aVar.e.M));
                    break;
                case 34:
                    c0019a.b(34, typedArray.getDimensionPixelSize(index, aVar.e.J));
                    break;
                case 37:
                    c0019a.a(37, typedArray.getFloat(index, aVar.e.z));
                    break;
                case 38:
                    int resourceId = typedArray.getResourceId(index, aVar.a);
                    aVar.a = resourceId;
                    c0019a.b(38, resourceId);
                    break;
                case 39:
                    c0019a.a(39, typedArray.getFloat(index, aVar.e.W));
                    break;
                case 40:
                    c0019a.a(40, typedArray.getFloat(index, aVar.e.V));
                    break;
                case 41:
                    c0019a.b(41, typedArray.getInt(index, aVar.e.X));
                    break;
                case 42:
                    c0019a.b(42, typedArray.getInt(index, aVar.e.Y));
                    break;
                case 43:
                    c0019a.a(43, typedArray.getFloat(index, aVar.c.d));
                    break;
                case 44:
                    c0019a.d(44, true);
                    c0019a.a(44, typedArray.getDimension(index, aVar.f.n));
                    break;
                case 45:
                    c0019a.a(45, typedArray.getFloat(index, aVar.f.c));
                    break;
                case 46:
                    c0019a.a(46, typedArray.getFloat(index, aVar.f.d));
                    break;
                case 47:
                    c0019a.a(47, typedArray.getFloat(index, aVar.f.e));
                    break;
                case 48:
                    c0019a.a(48, typedArray.getFloat(index, aVar.f.f));
                    break;
                case 49:
                    c0019a.a(49, typedArray.getDimension(index, aVar.f.g));
                    break;
                case 50:
                    c0019a.a(50, typedArray.getDimension(index, aVar.f.h));
                    break;
                case 51:
                    c0019a.a(51, typedArray.getDimension(index, aVar.f.j));
                    break;
                case 52:
                    c0019a.a(52, typedArray.getDimension(index, aVar.f.k));
                    break;
                case 53:
                    c0019a.a(53, typedArray.getDimension(index, aVar.f.l));
                    break;
                case 54:
                    c0019a.b(54, typedArray.getInt(index, aVar.e.Z));
                    break;
                case 55:
                    c0019a.b(55, typedArray.getInt(index, aVar.e.a0));
                    break;
                case 56:
                    c0019a.b(56, typedArray.getDimensionPixelSize(index, aVar.e.b0));
                    break;
                case 57:
                    c0019a.b(57, typedArray.getDimensionPixelSize(index, aVar.e.c0));
                    break;
                case 58:
                    c0019a.b(58, typedArray.getDimensionPixelSize(index, aVar.e.d0));
                    break;
                case 59:
                    c0019a.b(59, typedArray.getDimensionPixelSize(index, aVar.e.e0));
                    break;
                case 60:
                    c0019a.a(60, typedArray.getFloat(index, aVar.f.b));
                    break;
                case 62:
                    c0019a.b(62, typedArray.getDimensionPixelSize(index, aVar.e.C));
                    break;
                case 63:
                    c0019a.a(63, typedArray.getFloat(index, aVar.e.D));
                    break;
                case 64:
                    c0019a.b(64, A0(typedArray, index, aVar.d.b));
                    break;
                case 65:
                    if (typedArray.peekValue(index).type == 3) {
                        c0019a.c(65, typedArray.getString(index));
                        break;
                    } else {
                        c0019a.c(65, C6725h90.f755o[typedArray.getInteger(index, 0)]);
                        break;
                    }
                case 66:
                    c0019a.b(66, typedArray.getInt(index, 0));
                    break;
                case 67:
                    c0019a.a(67, typedArray.getFloat(index, aVar.d.i));
                    break;
                case 68:
                    c0019a.a(68, typedArray.getFloat(index, aVar.c.e));
                    break;
                case 69:
                    c0019a.a(69, typedArray.getFloat(index, 1.0f));
                    break;
                case 70:
                    c0019a.a(70, typedArray.getFloat(index, 1.0f));
                    break;
                case 71:
                    Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                    break;
                case 72:
                    c0019a.b(72, typedArray.getInt(index, aVar.e.h0));
                    break;
                case 73:
                    c0019a.b(73, typedArray.getDimensionPixelSize(index, aVar.e.i0));
                    break;
                case 74:
                    c0019a.c(74, typedArray.getString(index));
                    break;
                case 75:
                    c0019a.d(75, typedArray.getBoolean(index, aVar.e.p0));
                    break;
                case 76:
                    c0019a.b(76, typedArray.getInt(index, aVar.d.e));
                    break;
                case 77:
                    c0019a.c(77, typedArray.getString(index));
                    break;
                case 78:
                    c0019a.b(78, typedArray.getInt(index, aVar.c.c));
                    break;
                case 79:
                    c0019a.a(79, typedArray.getFloat(index, aVar.d.g));
                    break;
                case 80:
                    c0019a.d(80, typedArray.getBoolean(index, aVar.e.n0));
                    break;
                case 81:
                    c0019a.d(81, typedArray.getBoolean(index, aVar.e.o0));
                    break;
                case 82:
                    c0019a.b(82, typedArray.getInteger(index, aVar.d.c));
                    break;
                case 83:
                    c0019a.b(83, A0(typedArray, index, aVar.f.i));
                    break;
                case 84:
                    c0019a.b(84, typedArray.getInteger(index, aVar.d.k));
                    break;
                case 85:
                    c0019a.a(85, typedArray.getFloat(index, aVar.d.j));
                    break;
                case 86:
                    int i3 = typedArray.peekValue(index).type;
                    if (i3 == 1) {
                        aVar.d.n = typedArray.getResourceId(index, -1);
                        c0019a.b(89, aVar.d.n);
                        c cVar = aVar.d;
                        if (cVar.n != -1) {
                            cVar.m = -2;
                            c0019a.b(88, -2);
                            break;
                        } else {
                            break;
                        }
                    } else if (i3 == 3) {
                        aVar.d.l = typedArray.getString(index);
                        c0019a.c(90, aVar.d.l);
                        if (aVar.d.l.indexOf(RemoteSettings.i) > 0) {
                            aVar.d.n = typedArray.getResourceId(index, -1);
                            c0019a.b(89, aVar.d.n);
                            aVar.d.m = -2;
                            c0019a.b(88, -2);
                            break;
                        } else {
                            aVar.d.m = -1;
                            c0019a.b(88, -1);
                            break;
                        }
                    } else {
                        c cVar2 = aVar.d;
                        cVar2.m = typedArray.getInteger(index, cVar2.n);
                        c0019a.b(88, aVar.d.m);
                        break;
                    }
                case 87:
                    Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + X.get(index));
                    break;
                case 93:
                    c0019a.b(93, typedArray.getDimensionPixelSize(index, aVar.e.N));
                    break;
                case 94:
                    c0019a.b(94, typedArray.getDimensionPixelSize(index, aVar.e.U));
                    break;
                case 95:
                    D0(c0019a, typedArray, index, 0);
                    break;
                case 96:
                    D0(c0019a, typedArray, index, 1);
                    break;
                case 97:
                    c0019a.b(97, typedArray.getInt(index, aVar.e.q0));
                    break;
                case 98:
                    if (C7114il1.q3) {
                        int resourceId2 = typedArray.getResourceId(index, aVar.a);
                        aVar.a = resourceId2;
                        if (resourceId2 == -1) {
                            aVar.b = typedArray.getString(index);
                            break;
                        } else {
                            break;
                        }
                    } else if (typedArray.peekValue(index).type == 3) {
                        aVar.b = typedArray.getString(index);
                        break;
                    } else {
                        aVar.a = typedArray.getResourceId(index, aVar.a);
                        break;
                    }
                case 99:
                    c0019a.d(99, typedArray.getBoolean(index, aVar.e.i));
                    break;
            }
        }
    }

    public static String[] L1(String str) {
        char[] charArray = str.toCharArray();
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        boolean z2 = false;
        for (int i3 = 0; i3 < charArray.length; i3++) {
            char c2 = charArray[i3];
            if (c2 == ',' && !z2) {
                arrayList.add(new String(charArray, i2, i3 - i2));
                i2 = i3 + 1;
            } else if (c2 == '\"') {
                z2 = !z2;
            }
        }
        arrayList.add(new String(charArray, i2, charArray.length - i2));
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public static void U0(a aVar, int i2, float f2) {
        if (i2 != 19) {
            if (i2 != 20) {
                if (i2 != 37) {
                    if (i2 != 60) {
                        if (i2 != 63) {
                            if (i2 != 79) {
                                if (i2 != 85) {
                                    if (i2 != 87) {
                                        if (i2 != 39) {
                                            if (i2 != 40) {
                                                switch (i2) {
                                                    case 43:
                                                        aVar.c.d = f2;
                                                        return;
                                                    case 44:
                                                        C0020e c0020e = aVar.f;
                                                        c0020e.n = f2;
                                                        c0020e.m = true;
                                                        return;
                                                    case 45:
                                                        aVar.f.c = f2;
                                                        return;
                                                    case 46:
                                                        aVar.f.d = f2;
                                                        return;
                                                    case 47:
                                                        aVar.f.e = f2;
                                                        return;
                                                    case 48:
                                                        aVar.f.f = f2;
                                                        return;
                                                    case 49:
                                                        aVar.f.g = f2;
                                                        return;
                                                    case 50:
                                                        aVar.f.h = f2;
                                                        return;
                                                    case 51:
                                                        aVar.f.j = f2;
                                                        return;
                                                    case 52:
                                                        aVar.f.k = f2;
                                                        return;
                                                    case 53:
                                                        aVar.f.l = f2;
                                                        return;
                                                    default:
                                                        switch (i2) {
                                                            case 67:
                                                                aVar.d.i = f2;
                                                                return;
                                                            case 68:
                                                                aVar.c.e = f2;
                                                                return;
                                                            case 69:
                                                                aVar.e.f0 = f2;
                                                                return;
                                                            case 70:
                                                                aVar.e.g0 = f2;
                                                                return;
                                                            default:
                                                                Log.w("ConstraintSet", "Unknown attribute 0x");
                                                                return;
                                                        }
                                                }
                                            }
                                            aVar.e.V = f2;
                                            return;
                                        }
                                        aVar.e.W = f2;
                                        return;
                                    }
                                    return;
                                }
                                aVar.d.j = f2;
                                return;
                            }
                            aVar.d.g = f2;
                            return;
                        }
                        aVar.e.D = f2;
                        return;
                    }
                    aVar.f.b = f2;
                    return;
                }
                aVar.e.z = f2;
                return;
            }
            aVar.e.y = f2;
            return;
        }
        aVar.e.h = f2;
    }

    public static void V0(a aVar, int i2, int i3) {
        if (i2 != 6) {
            if (i2 != 7) {
                if (i2 != 8) {
                    if (i2 != 27) {
                        if (i2 != 28) {
                            if (i2 != 41) {
                                if (i2 != 42) {
                                    if (i2 != 61) {
                                        if (i2 != 62) {
                                            if (i2 != 72) {
                                                if (i2 != 73) {
                                                    switch (i2) {
                                                        case 2:
                                                            aVar.e.K = i3;
                                                            return;
                                                        case 11:
                                                            aVar.e.R = i3;
                                                            return;
                                                        case 12:
                                                            aVar.e.S = i3;
                                                            return;
                                                        case 13:
                                                            aVar.e.O = i3;
                                                            return;
                                                        case 14:
                                                            aVar.e.Q = i3;
                                                            return;
                                                        case 15:
                                                            aVar.e.T = i3;
                                                            return;
                                                        case 16:
                                                            aVar.e.P = i3;
                                                            return;
                                                        case 17:
                                                            aVar.e.f = i3;
                                                            return;
                                                        case 18:
                                                            aVar.e.g = i3;
                                                            return;
                                                        case 31:
                                                            aVar.e.M = i3;
                                                            return;
                                                        case 34:
                                                            aVar.e.J = i3;
                                                            return;
                                                        case 38:
                                                            aVar.a = i3;
                                                            return;
                                                        case 64:
                                                            aVar.d.b = i3;
                                                            return;
                                                        case 66:
                                                            aVar.d.f = i3;
                                                            return;
                                                        case 76:
                                                            aVar.d.e = i3;
                                                            return;
                                                        case 78:
                                                            aVar.c.c = i3;
                                                            return;
                                                        case 93:
                                                            aVar.e.N = i3;
                                                            return;
                                                        case 94:
                                                            aVar.e.U = i3;
                                                            return;
                                                        case 97:
                                                            aVar.e.q0 = i3;
                                                            return;
                                                        default:
                                                            switch (i2) {
                                                                case 21:
                                                                    aVar.e.e = i3;
                                                                    return;
                                                                case 22:
                                                                    aVar.c.b = i3;
                                                                    return;
                                                                case 23:
                                                                    aVar.e.d = i3;
                                                                    return;
                                                                case 24:
                                                                    aVar.e.H = i3;
                                                                    return;
                                                                default:
                                                                    switch (i2) {
                                                                        case 54:
                                                                            aVar.e.Z = i3;
                                                                            return;
                                                                        case 55:
                                                                            aVar.e.a0 = i3;
                                                                            return;
                                                                        case 56:
                                                                            aVar.e.b0 = i3;
                                                                            return;
                                                                        case 57:
                                                                            aVar.e.c0 = i3;
                                                                            return;
                                                                        case 58:
                                                                            aVar.e.d0 = i3;
                                                                            return;
                                                                        case 59:
                                                                            aVar.e.e0 = i3;
                                                                            return;
                                                                        default:
                                                                            switch (i2) {
                                                                                case 82:
                                                                                    aVar.d.c = i3;
                                                                                    return;
                                                                                case 83:
                                                                                    aVar.f.i = i3;
                                                                                    return;
                                                                                case 84:
                                                                                    aVar.d.k = i3;
                                                                                    return;
                                                                                default:
                                                                                    switch (i2) {
                                                                                        case 87:
                                                                                            return;
                                                                                        case 88:
                                                                                            aVar.d.m = i3;
                                                                                            return;
                                                                                        case 89:
                                                                                            aVar.d.n = i3;
                                                                                            return;
                                                                                        default:
                                                                                            Log.w("ConstraintSet", "Unknown attribute 0x");
                                                                                            return;
                                                                                    }
                                                                            }
                                                                    }
                                                            }
                                                    }
                                                }
                                                aVar.e.i0 = i3;
                                                return;
                                            }
                                            aVar.e.h0 = i3;
                                            return;
                                        }
                                        aVar.e.C = i3;
                                        return;
                                    }
                                    aVar.e.B = i3;
                                    return;
                                }
                                aVar.e.Y = i3;
                                return;
                            }
                            aVar.e.X = i3;
                            return;
                        }
                        aVar.e.I = i3;
                        return;
                    }
                    aVar.e.G = i3;
                    return;
                }
                aVar.e.L = i3;
                return;
            }
            aVar.e.F = i3;
            return;
        }
        aVar.e.E = i3;
    }

    public static void W0(a aVar, int i2, String str) {
        if (i2 != 5) {
            if (i2 != 65) {
                if (i2 != 74) {
                    if (i2 != 77) {
                        if (i2 != 87) {
                            if (i2 != 90) {
                                Log.w("ConstraintSet", "Unknown attribute 0x");
                                return;
                            } else {
                                aVar.d.l = str;
                                return;
                            }
                        }
                        return;
                    }
                    aVar.e.m0 = str;
                    return;
                }
                b bVar = aVar.e;
                bVar.l0 = str;
                bVar.k0 = null;
                return;
            }
            aVar.d.d = str;
            return;
        }
        aVar.e.A = str;
    }

    public static void X0(a aVar, int i2, boolean z2) {
        if (i2 != 44) {
            if (i2 != 75) {
                if (i2 != 87) {
                    if (i2 != 80) {
                        if (i2 != 81) {
                            Log.w("ConstraintSet", "Unknown attribute 0x");
                            return;
                        } else {
                            aVar.e.o0 = z2;
                            return;
                        }
                    }
                    aVar.e.n0 = z2;
                    return;
                }
                return;
            }
            aVar.e.p0 = z2;
            return;
        }
        aVar.f.m = z2;
    }

    public static String m0(int i2) {
        Field[] declaredFields;
        for (Field field : e.class.getDeclaredFields()) {
            if (field.getName().contains(CrashlyticsReportPersistence.m) && field.getType() == Integer.TYPE && Modifier.isStatic(field.getModifiers()) && Modifier.isFinal(field.getModifiers())) {
                try {
                    if (field.getInt(null) == i2) {
                        return field.getName();
                    }
                    continue;
                } catch (IllegalAccessException e) {
                    Log.e("ConstraintSet", "Error accessing ConstraintSet field", e);
                }
            }
        }
        return "UNKNOWN";
    }

    public static String p0(Context context, int i2, XmlPullParser xmlPullParser) {
        return ".(" + AV.i(context, i2) + ".xml:" + xmlPullParser.getLineNumber() + ") \"" + xmlPullParser.getName() + AbstractC4253Sp2.b.x1;
    }

    public static a w(Context context, XmlPullParser xmlPullParser) {
        AttributeSet asAttributeSet = Xml.asAttributeSet(xmlPullParser);
        a aVar = new a();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(asAttributeSet, j.c.b4);
        K0(aVar, obtainStyledAttributes);
        obtainStyledAttributes.recycle();
        return aVar;
    }

    public void A(int i2, int i3) {
        if (i3 == 0) {
            x(i2, 0, 6, 0, 0, 7, 0, 0.5f);
        } else {
            x(i2, i3, 7, 0, i3, 6, 0, 0.5f);
        }
    }

    public void A1(int i2, float f2, float f3) {
        C0020e c0020e = i0(i2).f;
        c0020e.j = f2;
        c0020e.k = f3;
    }

    public void B(int i2, int i3, int i4, int i5, int i6, int i7, int i8, float f2) {
        L(i2, 6, i3, i4, i5);
        L(i2, 7, i6, i7, i8);
        a aVar = this.h.get(Integer.valueOf(i2));
        if (aVar != null) {
            aVar.e.y = f2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0015, code lost:
        r2 = r2 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean B0(String... strArr) {
        int length = strArr.length;
        int i2 = 0;
        while (i2 < length) {
            String str = strArr[i2];
            for (String str2 : this.d) {
                if (str2.equals(str)) {
                    break;
                }
            }
            return false;
        }
        return true;
    }

    public void B1(int i2, float f2) {
        i0(i2).f.j = f2;
    }

    public void C(int i2, int i3) {
        if (i3 == 0) {
            x(i2, 0, 3, 0, 0, 4, 0, 0.5f);
        } else {
            x(i2, i3, 4, 0, i3, 3, 0, 0.5f);
        }
    }

    public void C0(a aVar, String str) {
        String[] split = str.split(",");
        for (int i2 = 0; i2 < split.length; i2++) {
            String[] split2 = split[i2].split("=");
            if (split2.length == 2) {
                aVar.p(split2[0], Color.parseColor(split2[1]));
            } else {
                Log.w("ConstraintSet", " Unable to parse " + split[i2]);
            }
        }
    }

    public void C1(int i2, float f2) {
        i0(i2).f.k = f2;
    }

    public void D(int i2, int i3, int i4, int i5, int i6, int i7, int i8, float f2) {
        L(i2, 3, i3, i4, i5);
        L(i2, 4, i6, i7, i8);
        a aVar = this.h.get(Integer.valueOf(i2));
        if (aVar != null) {
            aVar.e.z = f2;
        }
    }

    public void D1(int i2, float f2) {
        i0(i2).f.l = f2;
    }

    public void E(int i2) {
        this.h.remove(Integer.valueOf(i2));
    }

    public void E1(boolean z2) {
        this.a = z2;
    }

    public void F(int i2, int i3) {
        a aVar;
        if (this.h.containsKey(Integer.valueOf(i2)) && (aVar = this.h.get(Integer.valueOf(i2))) != null) {
            switch (i3) {
                case 1:
                    b bVar = aVar.e;
                    bVar.k = -1;
                    bVar.j = -1;
                    bVar.H = -1;
                    bVar.O = Integer.MIN_VALUE;
                    return;
                case 2:
                    b bVar2 = aVar.e;
                    bVar2.m = -1;
                    bVar2.l = -1;
                    bVar2.I = -1;
                    bVar2.Q = Integer.MIN_VALUE;
                    return;
                case 3:
                    b bVar3 = aVar.e;
                    bVar3.f22o = -1;
                    bVar3.n = -1;
                    bVar3.J = 0;
                    bVar3.P = Integer.MIN_VALUE;
                    return;
                case 4:
                    b bVar4 = aVar.e;
                    bVar4.p = -1;
                    bVar4.q = -1;
                    bVar4.K = 0;
                    bVar4.R = Integer.MIN_VALUE;
                    return;
                case 5:
                    b bVar5 = aVar.e;
                    bVar5.r = -1;
                    bVar5.s = -1;
                    bVar5.t = -1;
                    bVar5.N = 0;
                    bVar5.U = Integer.MIN_VALUE;
                    return;
                case 6:
                    b bVar6 = aVar.e;
                    bVar6.u = -1;
                    bVar6.v = -1;
                    bVar6.M = 0;
                    bVar6.T = Integer.MIN_VALUE;
                    return;
                case 7:
                    b bVar7 = aVar.e;
                    bVar7.w = -1;
                    bVar7.x = -1;
                    bVar7.L = 0;
                    bVar7.S = Integer.MIN_VALUE;
                    return;
                case 8:
                    b bVar8 = aVar.e;
                    bVar8.D = -1.0f;
                    bVar8.C = -1;
                    bVar8.B = -1;
                    return;
                default:
                    throw new IllegalArgumentException("unknown constraint");
            }
        }
    }

    public void F1(int i2, float f2) {
        i0(i2).e.z = f2;
    }

    public void G(Context context, int i2) {
        H((ConstraintLayout) LayoutInflater.from(context).inflate(i2, (ViewGroup) null));
    }

    public void G0(a aVar, String str) {
        String[] split = str.split(",");
        for (int i2 = 0; i2 < split.length; i2++) {
            String[] split2 = split[i2].split("=");
            if (split2.length == 2) {
                aVar.q(split2[0], Float.parseFloat(split2[1]));
            } else {
                Log.w("ConstraintSet", " Unable to parse " + split[i2]);
            }
        }
    }

    public void G1(int i2, int i3) {
        i0(i2).e.Y = i3;
    }

    public void H(ConstraintLayout constraintLayout) {
        int childCount = constraintLayout.getChildCount();
        this.h.clear();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = constraintLayout.getChildAt(i2);
            ConstraintLayout.b bVar = (ConstraintLayout.b) childAt.getLayoutParams();
            int id = childAt.getId();
            if (this.g && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!this.h.containsKey(Integer.valueOf(id))) {
                this.h.put(Integer.valueOf(id), new a());
            }
            a aVar = this.h.get(Integer.valueOf(id));
            if (aVar != null) {
                aVar.g = androidx.constraintlayout.widget.a.d(this.f, childAt);
                aVar.k(id, bVar);
                aVar.c.b = childAt.getVisibility();
                aVar.c.d = childAt.getAlpha();
                aVar.f.b = childAt.getRotation();
                aVar.f.c = childAt.getRotationX();
                aVar.f.d = childAt.getRotationY();
                aVar.f.e = childAt.getScaleX();
                aVar.f.f = childAt.getScaleY();
                float pivotX = childAt.getPivotX();
                float pivotY = childAt.getPivotY();
                if (pivotX != 0.0d || pivotY != 0.0d) {
                    C0020e c0020e = aVar.f;
                    c0020e.g = pivotX;
                    c0020e.h = pivotY;
                }
                aVar.f.j = childAt.getTranslationX();
                aVar.f.k = childAt.getTranslationY();
                aVar.f.l = childAt.getTranslationZ();
                C0020e c0020e2 = aVar.f;
                if (c0020e2.m) {
                    c0020e2.n = childAt.getElevation();
                }
                if (childAt instanceof Barrier) {
                    Barrier barrier = (Barrier) childAt;
                    aVar.e.p0 = barrier.getAllowsGoneWidget();
                    aVar.e.k0 = barrier.getReferencedIds();
                    aVar.e.h0 = barrier.getType();
                    aVar.e.i0 = barrier.getMargin();
                }
            }
        }
    }

    public void H0(a aVar, String str) {
        String[] split = str.split(",");
        for (int i2 = 0; i2 < split.length; i2++) {
            String[] split2 = split[i2].split("=");
            if (split2.length == 2) {
                aVar.q(split2[0], Integer.decode(split2[1]).intValue());
            } else {
                Log.w("ConstraintSet", " Unable to parse " + split[i2]);
            }
        }
    }

    public void H1(int i2, float f2) {
        i0(i2).e.V = f2;
    }

    public void I(e eVar) {
        this.h.clear();
        for (Integer num : eVar.h.keySet()) {
            a aVar = eVar.h.get(num);
            if (aVar != null) {
                this.h.put(num, aVar.clone());
            }
        }
    }

    public void I0(a aVar, String str) {
        String[] L12 = L1(str);
        for (int i2 = 0; i2 < L12.length; i2++) {
            String[] split = L12[i2].split("=");
            Log.w("ConstraintSet", " Unable to parse " + L12[i2]);
            aVar.s(split[0], split[1]);
        }
    }

    public void I1(int i2, int i3) {
        i0(i2).c.b = i3;
    }

    public void J(androidx.constraintlayout.widget.f fVar) {
        int childCount = fVar.getChildCount();
        this.h.clear();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = fVar.getChildAt(i2);
            f.a aVar = (f.a) childAt.getLayoutParams();
            int id = childAt.getId();
            if (this.g && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!this.h.containsKey(Integer.valueOf(id))) {
                this.h.put(Integer.valueOf(id), new a());
            }
            a aVar2 = this.h.get(Integer.valueOf(id));
            if (aVar2 != null) {
                if (childAt instanceof androidx.constraintlayout.widget.b) {
                    aVar2.m((androidx.constraintlayout.widget.b) childAt, id, aVar);
                }
                aVar2.l(id, aVar);
            }
        }
    }

    public final void J0(a aVar, TypedArray typedArray, boolean z2) {
        if (z2) {
            K0(aVar, typedArray);
            return;
        }
        int indexCount = typedArray.getIndexCount();
        for (int i2 = 0; i2 < indexCount; i2++) {
            int index = typedArray.getIndex(i2);
            if (index != j.c.f27o && j.c.K != index && j.c.L != index) {
                aVar.d.a = true;
                aVar.e.b = true;
                aVar.c.a = true;
                aVar.f.a = true;
            }
            switch (X.get(index)) {
                case 1:
                    b bVar = aVar.e;
                    bVar.r = A0(typedArray, index, bVar.r);
                    break;
                case 2:
                    b bVar2 = aVar.e;
                    bVar2.K = typedArray.getDimensionPixelSize(index, bVar2.K);
                    break;
                case 3:
                    b bVar3 = aVar.e;
                    bVar3.q = A0(typedArray, index, bVar3.q);
                    break;
                case 4:
                    b bVar4 = aVar.e;
                    bVar4.p = A0(typedArray, index, bVar4.p);
                    break;
                case 5:
                    aVar.e.A = typedArray.getString(index);
                    break;
                case 6:
                    b bVar5 = aVar.e;
                    bVar5.E = typedArray.getDimensionPixelOffset(index, bVar5.E);
                    break;
                case 7:
                    b bVar6 = aVar.e;
                    bVar6.F = typedArray.getDimensionPixelOffset(index, bVar6.F);
                    break;
                case 8:
                    b bVar7 = aVar.e;
                    bVar7.L = typedArray.getDimensionPixelSize(index, bVar7.L);
                    break;
                case 9:
                    b bVar8 = aVar.e;
                    bVar8.x = A0(typedArray, index, bVar8.x);
                    break;
                case 10:
                    b bVar9 = aVar.e;
                    bVar9.w = A0(typedArray, index, bVar9.w);
                    break;
                case 11:
                    b bVar10 = aVar.e;
                    bVar10.R = typedArray.getDimensionPixelSize(index, bVar10.R);
                    break;
                case 12:
                    b bVar11 = aVar.e;
                    bVar11.S = typedArray.getDimensionPixelSize(index, bVar11.S);
                    break;
                case 13:
                    b bVar12 = aVar.e;
                    bVar12.O = typedArray.getDimensionPixelSize(index, bVar12.O);
                    break;
                case 14:
                    b bVar13 = aVar.e;
                    bVar13.Q = typedArray.getDimensionPixelSize(index, bVar13.Q);
                    break;
                case 15:
                    b bVar14 = aVar.e;
                    bVar14.T = typedArray.getDimensionPixelSize(index, bVar14.T);
                    break;
                case 16:
                    b bVar15 = aVar.e;
                    bVar15.P = typedArray.getDimensionPixelSize(index, bVar15.P);
                    break;
                case 17:
                    b bVar16 = aVar.e;
                    bVar16.f = typedArray.getDimensionPixelOffset(index, bVar16.f);
                    break;
                case 18:
                    b bVar17 = aVar.e;
                    bVar17.g = typedArray.getDimensionPixelOffset(index, bVar17.g);
                    break;
                case 19:
                    b bVar18 = aVar.e;
                    bVar18.h = typedArray.getFloat(index, bVar18.h);
                    break;
                case 20:
                    b bVar19 = aVar.e;
                    bVar19.y = typedArray.getFloat(index, bVar19.y);
                    break;
                case 21:
                    b bVar20 = aVar.e;
                    bVar20.e = typedArray.getLayoutDimension(index, bVar20.e);
                    break;
                case 22:
                    d dVar = aVar.c;
                    dVar.b = typedArray.getInt(index, dVar.b);
                    d dVar2 = aVar.c;
                    dVar2.b = V[dVar2.b];
                    break;
                case 23:
                    b bVar21 = aVar.e;
                    bVar21.d = typedArray.getLayoutDimension(index, bVar21.d);
                    break;
                case 24:
                    b bVar22 = aVar.e;
                    bVar22.H = typedArray.getDimensionPixelSize(index, bVar22.H);
                    break;
                case 25:
                    b bVar23 = aVar.e;
                    bVar23.j = A0(typedArray, index, bVar23.j);
                    break;
                case 26:
                    b bVar24 = aVar.e;
                    bVar24.k = A0(typedArray, index, bVar24.k);
                    break;
                case 27:
                    b bVar25 = aVar.e;
                    bVar25.G = typedArray.getInt(index, bVar25.G);
                    break;
                case 28:
                    b bVar26 = aVar.e;
                    bVar26.I = typedArray.getDimensionPixelSize(index, bVar26.I);
                    break;
                case 29:
                    b bVar27 = aVar.e;
                    bVar27.l = A0(typedArray, index, bVar27.l);
                    break;
                case 30:
                    b bVar28 = aVar.e;
                    bVar28.m = A0(typedArray, index, bVar28.m);
                    break;
                case 31:
                    b bVar29 = aVar.e;
                    bVar29.M = typedArray.getDimensionPixelSize(index, bVar29.M);
                    break;
                case 32:
                    b bVar30 = aVar.e;
                    bVar30.u = A0(typedArray, index, bVar30.u);
                    break;
                case 33:
                    b bVar31 = aVar.e;
                    bVar31.v = A0(typedArray, index, bVar31.v);
                    break;
                case 34:
                    b bVar32 = aVar.e;
                    bVar32.J = typedArray.getDimensionPixelSize(index, bVar32.J);
                    break;
                case 35:
                    b bVar33 = aVar.e;
                    bVar33.f22o = A0(typedArray, index, bVar33.f22o);
                    break;
                case 36:
                    b bVar34 = aVar.e;
                    bVar34.n = A0(typedArray, index, bVar34.n);
                    break;
                case 37:
                    b bVar35 = aVar.e;
                    bVar35.z = typedArray.getFloat(index, bVar35.z);
                    break;
                case 38:
                    aVar.a = typedArray.getResourceId(index, aVar.a);
                    break;
                case 39:
                    b bVar36 = aVar.e;
                    bVar36.W = typedArray.getFloat(index, bVar36.W);
                    break;
                case 40:
                    b bVar37 = aVar.e;
                    bVar37.V = typedArray.getFloat(index, bVar37.V);
                    break;
                case 41:
                    b bVar38 = aVar.e;
                    bVar38.X = typedArray.getInt(index, bVar38.X);
                    break;
                case 42:
                    b bVar39 = aVar.e;
                    bVar39.Y = typedArray.getInt(index, bVar39.Y);
                    break;
                case 43:
                    d dVar3 = aVar.c;
                    dVar3.d = typedArray.getFloat(index, dVar3.d);
                    break;
                case 44:
                    C0020e c0020e = aVar.f;
                    c0020e.m = true;
                    c0020e.n = typedArray.getDimension(index, c0020e.n);
                    break;
                case 45:
                    C0020e c0020e2 = aVar.f;
                    c0020e2.c = typedArray.getFloat(index, c0020e2.c);
                    break;
                case 46:
                    C0020e c0020e3 = aVar.f;
                    c0020e3.d = typedArray.getFloat(index, c0020e3.d);
                    break;
                case 47:
                    C0020e c0020e4 = aVar.f;
                    c0020e4.e = typedArray.getFloat(index, c0020e4.e);
                    break;
                case 48:
                    C0020e c0020e5 = aVar.f;
                    c0020e5.f = typedArray.getFloat(index, c0020e5.f);
                    break;
                case 49:
                    C0020e c0020e6 = aVar.f;
                    c0020e6.g = typedArray.getDimension(index, c0020e6.g);
                    break;
                case 50:
                    C0020e c0020e7 = aVar.f;
                    c0020e7.h = typedArray.getDimension(index, c0020e7.h);
                    break;
                case 51:
                    C0020e c0020e8 = aVar.f;
                    c0020e8.j = typedArray.getDimension(index, c0020e8.j);
                    break;
                case 52:
                    C0020e c0020e9 = aVar.f;
                    c0020e9.k = typedArray.getDimension(index, c0020e9.k);
                    break;
                case 53:
                    C0020e c0020e10 = aVar.f;
                    c0020e10.l = typedArray.getDimension(index, c0020e10.l);
                    break;
                case 54:
                    b bVar40 = aVar.e;
                    bVar40.Z = typedArray.getInt(index, bVar40.Z);
                    break;
                case 55:
                    b bVar41 = aVar.e;
                    bVar41.a0 = typedArray.getInt(index, bVar41.a0);
                    break;
                case 56:
                    b bVar42 = aVar.e;
                    bVar42.b0 = typedArray.getDimensionPixelSize(index, bVar42.b0);
                    break;
                case 57:
                    b bVar43 = aVar.e;
                    bVar43.c0 = typedArray.getDimensionPixelSize(index, bVar43.c0);
                    break;
                case 58:
                    b bVar44 = aVar.e;
                    bVar44.d0 = typedArray.getDimensionPixelSize(index, bVar44.d0);
                    break;
                case 59:
                    b bVar45 = aVar.e;
                    bVar45.e0 = typedArray.getDimensionPixelSize(index, bVar45.e0);
                    break;
                case 60:
                    C0020e c0020e11 = aVar.f;
                    c0020e11.b = typedArray.getFloat(index, c0020e11.b);
                    break;
                case 61:
                    b bVar46 = aVar.e;
                    bVar46.B = A0(typedArray, index, bVar46.B);
                    break;
                case 62:
                    b bVar47 = aVar.e;
                    bVar47.C = typedArray.getDimensionPixelSize(index, bVar47.C);
                    break;
                case 63:
                    b bVar48 = aVar.e;
                    bVar48.D = typedArray.getFloat(index, bVar48.D);
                    break;
                case 64:
                    c cVar = aVar.d;
                    cVar.b = A0(typedArray, index, cVar.b);
                    break;
                case 65:
                    if (typedArray.peekValue(index).type == 3) {
                        aVar.d.d = typedArray.getString(index);
                        break;
                    } else {
                        aVar.d.d = C6725h90.f755o[typedArray.getInteger(index, 0)];
                        break;
                    }
                case 66:
                    aVar.d.f = typedArray.getInt(index, 0);
                    break;
                case 67:
                    c cVar2 = aVar.d;
                    cVar2.i = typedArray.getFloat(index, cVar2.i);
                    break;
                case 68:
                    d dVar4 = aVar.c;
                    dVar4.e = typedArray.getFloat(index, dVar4.e);
                    break;
                case 69:
                    aVar.e.f0 = typedArray.getFloat(index, 1.0f);
                    break;
                case 70:
                    aVar.e.g0 = typedArray.getFloat(index, 1.0f);
                    break;
                case 71:
                    Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                    break;
                case 72:
                    b bVar49 = aVar.e;
                    bVar49.h0 = typedArray.getInt(index, bVar49.h0);
                    break;
                case 73:
                    b bVar50 = aVar.e;
                    bVar50.i0 = typedArray.getDimensionPixelSize(index, bVar50.i0);
                    break;
                case 74:
                    aVar.e.l0 = typedArray.getString(index);
                    break;
                case 75:
                    b bVar51 = aVar.e;
                    bVar51.p0 = typedArray.getBoolean(index, bVar51.p0);
                    break;
                case 76:
                    c cVar3 = aVar.d;
                    cVar3.e = typedArray.getInt(index, cVar3.e);
                    break;
                case 77:
                    aVar.e.m0 = typedArray.getString(index);
                    break;
                case 78:
                    d dVar5 = aVar.c;
                    dVar5.c = typedArray.getInt(index, dVar5.c);
                    break;
                case 79:
                    c cVar4 = aVar.d;
                    cVar4.g = typedArray.getFloat(index, cVar4.g);
                    break;
                case 80:
                    b bVar52 = aVar.e;
                    bVar52.n0 = typedArray.getBoolean(index, bVar52.n0);
                    break;
                case 81:
                    b bVar53 = aVar.e;
                    bVar53.o0 = typedArray.getBoolean(index, bVar53.o0);
                    break;
                case 82:
                    c cVar5 = aVar.d;
                    cVar5.c = typedArray.getInteger(index, cVar5.c);
                    break;
                case 83:
                    C0020e c0020e12 = aVar.f;
                    c0020e12.i = A0(typedArray, index, c0020e12.i);
                    break;
                case 84:
                    c cVar6 = aVar.d;
                    cVar6.k = typedArray.getInteger(index, cVar6.k);
                    break;
                case 85:
                    c cVar7 = aVar.d;
                    cVar7.j = typedArray.getFloat(index, cVar7.j);
                    break;
                case 86:
                    int i3 = typedArray.peekValue(index).type;
                    if (i3 == 1) {
                        aVar.d.n = typedArray.getResourceId(index, -1);
                        c cVar8 = aVar.d;
                        if (cVar8.n != -1) {
                            cVar8.m = -2;
                            break;
                        } else {
                            break;
                        }
                    } else if (i3 == 3) {
                        aVar.d.l = typedArray.getString(index);
                        if (aVar.d.l.indexOf(RemoteSettings.i) > 0) {
                            aVar.d.n = typedArray.getResourceId(index, -1);
                            aVar.d.m = -2;
                            break;
                        } else {
                            aVar.d.m = -1;
                            break;
                        }
                    } else {
                        c cVar9 = aVar.d;
                        cVar9.m = typedArray.getInteger(index, cVar9.n);
                        break;
                    }
                case 87:
                    Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + X.get(index));
                    break;
                case 88:
                case 89:
                case 90:
                default:
                    Log.w("ConstraintSet", "Unknown attribute 0x" + Integer.toHexString(index) + "   " + X.get(index));
                    break;
                case 91:
                    b bVar54 = aVar.e;
                    bVar54.s = A0(typedArray, index, bVar54.s);
                    break;
                case 92:
                    b bVar55 = aVar.e;
                    bVar55.t = A0(typedArray, index, bVar55.t);
                    break;
                case 93:
                    b bVar56 = aVar.e;
                    bVar56.N = typedArray.getDimensionPixelSize(index, bVar56.N);
                    break;
                case 94:
                    b bVar57 = aVar.e;
                    bVar57.U = typedArray.getDimensionPixelSize(index, bVar57.U);
                    break;
                case 95:
                    D0(aVar.e, typedArray, index, 0);
                    break;
                case 96:
                    D0(aVar.e, typedArray, index, 1);
                    break;
                case 97:
                    b bVar58 = aVar.e;
                    bVar58.q0 = typedArray.getInt(index, bVar58.q0);
                    break;
            }
        }
        b bVar59 = aVar.e;
        if (bVar59.l0 != null) {
            bVar59.k0 = null;
        }
    }

    public void J1(int i2, int i3) {
        i0(i2).c.c = i3;
    }

    public void K(int i2, int i3, int i4, int i5) {
        if (!this.h.containsKey(Integer.valueOf(i2))) {
            this.h.put(Integer.valueOf(i2), new a());
        }
        a aVar = this.h.get(Integer.valueOf(i2));
        if (aVar == null) {
            return;
        }
        switch (i3) {
            case 1:
                if (i5 == 1) {
                    b bVar = aVar.e;
                    bVar.j = i4;
                    bVar.k = -1;
                    return;
                } else if (i5 == 2) {
                    b bVar2 = aVar.e;
                    bVar2.k = i4;
                    bVar2.j = -1;
                    return;
                } else {
                    throw new IllegalArgumentException("left to " + K1(i5) + " undefined");
                }
            case 2:
                if (i5 == 1) {
                    b bVar3 = aVar.e;
                    bVar3.l = i4;
                    bVar3.m = -1;
                    return;
                } else if (i5 == 2) {
                    b bVar4 = aVar.e;
                    bVar4.m = i4;
                    bVar4.l = -1;
                    return;
                } else {
                    throw new IllegalArgumentException("right to " + K1(i5) + " undefined");
                }
            case 3:
                if (i5 == 3) {
                    b bVar5 = aVar.e;
                    bVar5.n = i4;
                    bVar5.f22o = -1;
                    bVar5.r = -1;
                    bVar5.s = -1;
                    bVar5.t = -1;
                    return;
                } else if (i5 == 4) {
                    b bVar6 = aVar.e;
                    bVar6.f22o = i4;
                    bVar6.n = -1;
                    bVar6.r = -1;
                    bVar6.s = -1;
                    bVar6.t = -1;
                    return;
                } else {
                    throw new IllegalArgumentException("right to " + K1(i5) + " undefined");
                }
            case 4:
                if (i5 == 4) {
                    b bVar7 = aVar.e;
                    bVar7.q = i4;
                    bVar7.p = -1;
                    bVar7.r = -1;
                    bVar7.s = -1;
                    bVar7.t = -1;
                    return;
                } else if (i5 == 3) {
                    b bVar8 = aVar.e;
                    bVar8.p = i4;
                    bVar8.q = -1;
                    bVar8.r = -1;
                    bVar8.s = -1;
                    bVar8.t = -1;
                    return;
                } else {
                    throw new IllegalArgumentException("right to " + K1(i5) + " undefined");
                }
            case 5:
                if (i5 == 5) {
                    b bVar9 = aVar.e;
                    bVar9.r = i4;
                    bVar9.q = -1;
                    bVar9.p = -1;
                    bVar9.n = -1;
                    bVar9.f22o = -1;
                    return;
                } else if (i5 == 3) {
                    b bVar10 = aVar.e;
                    bVar10.s = i4;
                    bVar10.q = -1;
                    bVar10.p = -1;
                    bVar10.n = -1;
                    bVar10.f22o = -1;
                    return;
                } else if (i5 == 4) {
                    b bVar11 = aVar.e;
                    bVar11.t = i4;
                    bVar11.q = -1;
                    bVar11.p = -1;
                    bVar11.n = -1;
                    bVar11.f22o = -1;
                    return;
                } else {
                    throw new IllegalArgumentException("right to " + K1(i5) + " undefined");
                }
            case 6:
                if (i5 == 6) {
                    b bVar12 = aVar.e;
                    bVar12.v = i4;
                    bVar12.u = -1;
                    return;
                } else if (i5 == 7) {
                    b bVar13 = aVar.e;
                    bVar13.u = i4;
                    bVar13.v = -1;
                    return;
                } else {
                    throw new IllegalArgumentException("right to " + K1(i5) + " undefined");
                }
            case 7:
                if (i5 == 7) {
                    b bVar14 = aVar.e;
                    bVar14.x = i4;
                    bVar14.w = -1;
                    return;
                } else if (i5 == 6) {
                    b bVar15 = aVar.e;
                    bVar15.w = i4;
                    bVar15.x = -1;
                    return;
                } else {
                    throw new IllegalArgumentException("right to " + K1(i5) + " undefined");
                }
            default:
                throw new IllegalArgumentException(K1(i3) + " to " + K1(i5) + " unknown");
        }
    }

    public final String K1(int i2) {
        switch (i2) {
            case 1:
                return "left";
            case 2:
                return C5445bv2.n0;
            case 3:
                return C9698tH2.l;
            case 4:
                return "bottom";
            case 5:
                return "baseline";
            case 6:
                return "start";
            case 7:
                return "end";
            default:
                return "undefined";
        }
    }

    public void L(int i2, int i3, int i4, int i5, int i6) {
        if (!this.h.containsKey(Integer.valueOf(i2))) {
            this.h.put(Integer.valueOf(i2), new a());
        }
        a aVar = this.h.get(Integer.valueOf(i2));
        if (aVar == null) {
            return;
        }
        switch (i3) {
            case 1:
                if (i5 == 1) {
                    b bVar = aVar.e;
                    bVar.j = i4;
                    bVar.k = -1;
                } else if (i5 == 2) {
                    b bVar2 = aVar.e;
                    bVar2.k = i4;
                    bVar2.j = -1;
                } else {
                    throw new IllegalArgumentException("Left to " + K1(i5) + " undefined");
                }
                aVar.e.H = i6;
                return;
            case 2:
                if (i5 == 1) {
                    b bVar3 = aVar.e;
                    bVar3.l = i4;
                    bVar3.m = -1;
                } else if (i5 == 2) {
                    b bVar4 = aVar.e;
                    bVar4.m = i4;
                    bVar4.l = -1;
                } else {
                    throw new IllegalArgumentException("right to " + K1(i5) + " undefined");
                }
                aVar.e.I = i6;
                return;
            case 3:
                if (i5 == 3) {
                    b bVar5 = aVar.e;
                    bVar5.n = i4;
                    bVar5.f22o = -1;
                    bVar5.r = -1;
                    bVar5.s = -1;
                    bVar5.t = -1;
                } else if (i5 == 4) {
                    b bVar6 = aVar.e;
                    bVar6.f22o = i4;
                    bVar6.n = -1;
                    bVar6.r = -1;
                    bVar6.s = -1;
                    bVar6.t = -1;
                } else {
                    throw new IllegalArgumentException("right to " + K1(i5) + " undefined");
                }
                aVar.e.J = i6;
                return;
            case 4:
                if (i5 == 4) {
                    b bVar7 = aVar.e;
                    bVar7.q = i4;
                    bVar7.p = -1;
                    bVar7.r = -1;
                    bVar7.s = -1;
                    bVar7.t = -1;
                } else if (i5 == 3) {
                    b bVar8 = aVar.e;
                    bVar8.p = i4;
                    bVar8.q = -1;
                    bVar8.r = -1;
                    bVar8.s = -1;
                    bVar8.t = -1;
                } else {
                    throw new IllegalArgumentException("right to " + K1(i5) + " undefined");
                }
                aVar.e.K = i6;
                return;
            case 5:
                if (i5 == 5) {
                    b bVar9 = aVar.e;
                    bVar9.r = i4;
                    bVar9.q = -1;
                    bVar9.p = -1;
                    bVar9.n = -1;
                    bVar9.f22o = -1;
                    return;
                } else if (i5 == 3) {
                    b bVar10 = aVar.e;
                    bVar10.s = i4;
                    bVar10.q = -1;
                    bVar10.p = -1;
                    bVar10.n = -1;
                    bVar10.f22o = -1;
                    return;
                } else if (i5 == 4) {
                    b bVar11 = aVar.e;
                    bVar11.t = i4;
                    bVar11.q = -1;
                    bVar11.p = -1;
                    bVar11.n = -1;
                    bVar11.f22o = -1;
                    return;
                } else {
                    throw new IllegalArgumentException("right to " + K1(i5) + " undefined");
                }
            case 6:
                if (i5 == 6) {
                    b bVar12 = aVar.e;
                    bVar12.v = i4;
                    bVar12.u = -1;
                } else if (i5 == 7) {
                    b bVar13 = aVar.e;
                    bVar13.u = i4;
                    bVar13.v = -1;
                } else {
                    throw new IllegalArgumentException("right to " + K1(i5) + " undefined");
                }
                aVar.e.M = i6;
                return;
            case 7:
                if (i5 == 7) {
                    b bVar14 = aVar.e;
                    bVar14.x = i4;
                    bVar14.w = -1;
                } else if (i5 == 6) {
                    b bVar15 = aVar.e;
                    bVar15.w = i4;
                    bVar15.x = -1;
                } else {
                    throw new IllegalArgumentException("right to " + K1(i5) + " undefined");
                }
                aVar.e.L = i6;
                return;
            default:
                throw new IllegalArgumentException(K1(i3) + " to " + K1(i5) + " unknown");
        }
    }

    public void L0(ConstraintLayout constraintLayout) {
        int childCount = constraintLayout.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = constraintLayout.getChildAt(i2);
            ConstraintLayout.b bVar = (ConstraintLayout.b) childAt.getLayoutParams();
            int id = childAt.getId();
            if (this.g && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!this.h.containsKey(Integer.valueOf(id))) {
                this.h.put(Integer.valueOf(id), new a());
            }
            a aVar = this.h.get(Integer.valueOf(id));
            if (aVar != null) {
                if (!aVar.e.b) {
                    aVar.k(id, bVar);
                    if (childAt instanceof androidx.constraintlayout.widget.b) {
                        aVar.e.k0 = ((androidx.constraintlayout.widget.b) childAt).getReferencedIds();
                        if (childAt instanceof Barrier) {
                            Barrier barrier = (Barrier) childAt;
                            aVar.e.p0 = barrier.getAllowsGoneWidget();
                            aVar.e.h0 = barrier.getType();
                            aVar.e.i0 = barrier.getMargin();
                        }
                    }
                    aVar.e.b = true;
                }
                d dVar = aVar.c;
                if (!dVar.a) {
                    dVar.b = childAt.getVisibility();
                    aVar.c.d = childAt.getAlpha();
                    aVar.c.a = true;
                }
                C0020e c0020e = aVar.f;
                if (!c0020e.a) {
                    c0020e.a = true;
                    c0020e.b = childAt.getRotation();
                    aVar.f.c = childAt.getRotationX();
                    aVar.f.d = childAt.getRotationY();
                    aVar.f.e = childAt.getScaleX();
                    aVar.f.f = childAt.getScaleY();
                    float pivotX = childAt.getPivotX();
                    float pivotY = childAt.getPivotY();
                    if (pivotX != 0.0d || pivotY != 0.0d) {
                        C0020e c0020e2 = aVar.f;
                        c0020e2.g = pivotX;
                        c0020e2.h = pivotY;
                    }
                    aVar.f.j = childAt.getTranslationX();
                    aVar.f.k = childAt.getTranslationY();
                    aVar.f.l = childAt.getTranslationZ();
                    C0020e c0020e3 = aVar.f;
                    if (c0020e3.m) {
                        c0020e3.n = childAt.getElevation();
                    }
                }
            }
        }
    }

    public void M(int i2, int i3, int i4, float f2) {
        b bVar = i0(i2).e;
        bVar.B = i3;
        bVar.C = i4;
        bVar.D = f2;
    }

    public void M0(e eVar) {
        for (Integer num : eVar.h.keySet()) {
            num.intValue();
            a aVar = eVar.h.get(num);
            if (!this.h.containsKey(num)) {
                this.h.put(num, new a());
            }
            a aVar2 = this.h.get(num);
            if (aVar2 != null) {
                b bVar = aVar2.e;
                if (!bVar.b) {
                    bVar.a(aVar.e);
                }
                d dVar = aVar2.c;
                if (!dVar.a) {
                    dVar.a(aVar.c);
                }
                C0020e c0020e = aVar2.f;
                if (!c0020e.a) {
                    c0020e.a(aVar.f);
                }
                c cVar = aVar2.d;
                if (!cVar.a) {
                    cVar.a(aVar.d);
                }
                for (String str : aVar.g.keySet()) {
                    if (!aVar2.g.containsKey(str)) {
                        aVar2.g.put(str, aVar.g.get(str));
                    }
                }
            }
        }
    }

    public void M1(Writer writer, ConstraintLayout constraintLayout, int i2) throws IOException {
        writer.write("\n---------------------------------------------\n");
        if ((i2 & 1) == 1) {
            new g(writer, constraintLayout, i2).i();
        } else {
            new f(writer, constraintLayout, i2).g();
        }
        writer.write("\n---------------------------------------------\n");
    }

    public void N(int i2, int i3) {
        i0(i2).e.a0 = i3;
    }

    public void N0(String str) {
        this.f.remove(str);
    }

    public void O(int i2, int i3) {
        i0(i2).e.Z = i3;
    }

    public void O0(int i2) {
        a aVar;
        if (this.h.containsKey(Integer.valueOf(i2)) && (aVar = this.h.get(Integer.valueOf(i2))) != null) {
            b bVar = aVar.e;
            int i3 = bVar.k;
            int i4 = bVar.l;
            if (i3 == -1 && i4 == -1) {
                int i5 = bVar.u;
                int i6 = bVar.w;
                if (i5 != -1 || i6 != -1) {
                    if (i5 != -1 && i6 != -1) {
                        L(i5, 7, i6, 6, 0);
                        L(i6, 6, i3, 7, 0);
                    } else if (i6 != -1) {
                        int i7 = bVar.m;
                        if (i7 != -1) {
                            L(i3, 7, i7, 7, 0);
                        } else {
                            int i8 = bVar.j;
                            if (i8 != -1) {
                                L(i6, 6, i8, 6, 0);
                                F(i2, 6);
                                F(i2, 7);
                                return;
                            }
                        }
                    }
                }
                F(i2, 6);
                F(i2, 7);
                return;
            }
            if (i3 != -1 && i4 != -1) {
                L(i3, 2, i4, 1, 0);
                L(i4, 1, i3, 2, 0);
            } else {
                int i9 = bVar.m;
                if (i9 != -1) {
                    L(i3, 2, i9, 2, 0);
                } else {
                    int i10 = bVar.j;
                    if (i10 != -1) {
                        L(i4, 1, i10, 1, 0);
                    }
                }
            }
            F(i2, 1);
            F(i2, 2);
        }
    }

    public void P(int i2, int i3) {
        i0(i2).e.e = i3;
    }

    public void P0(int i2) {
        if (this.h.containsKey(Integer.valueOf(i2))) {
            a aVar = this.h.get(Integer.valueOf(i2));
            if (aVar == null) {
                return;
            }
            b bVar = aVar.e;
            int i3 = bVar.f22o;
            int i4 = bVar.p;
            if (i3 != -1 || i4 != -1) {
                if (i3 != -1 && i4 != -1) {
                    L(i3, 4, i4, 3, 0);
                    L(i4, 3, i3, 4, 0);
                } else {
                    int i5 = bVar.q;
                    if (i5 != -1) {
                        L(i3, 4, i5, 4, 0);
                    } else {
                        int i6 = bVar.n;
                        if (i6 != -1) {
                            L(i4, 3, i6, 3, 0);
                        }
                    }
                }
                F(i2, 3);
                F(i2, 4);
            }
        }
        F(i2, 3);
        F(i2, 4);
    }

    public void Q(int i2, int i3) {
        i0(i2).e.c0 = i3;
    }

    public void Q0(int i2, float f2) {
        i0(i2).c.d = f2;
    }

    public void R(int i2, int i3) {
        i0(i2).e.b0 = i3;
    }

    public void R0(int i2, boolean z2) {
        i0(i2).f.m = z2;
    }

    public void S(int i2, int i3) {
        i0(i2).e.e0 = i3;
    }

    public void S0(int i2, int i3) {
        i0(i2).e.j0 = i3;
    }

    public void T(int i2, int i3) {
        i0(i2).e.d0 = i3;
    }

    public void T0(int i2, String str, int i3) {
        i0(i2).p(str, i3);
    }

    public void U(int i2, float f2) {
        i0(i2).e.g0 = f2;
    }

    public void V(int i2, float f2) {
        i0(i2).e.f0 = f2;
    }

    public void W(int i2, int i3) {
        i0(i2).e.d = i3;
    }

    public void X(int i2, boolean z2) {
        i0(i2).e.o0 = z2;
    }

    public void Y(int i2, boolean z2) {
        i0(i2).e.n0 = z2;
    }

    public void Y0(int i2, String str) {
        i0(i2).e.A = str;
    }

    public final int[] Z(View view, String str) {
        int i2;
        Object r2;
        String[] split = str.split(",");
        Context context = view.getContext();
        int[] iArr = new int[split.length];
        int i3 = 0;
        int i4 = 0;
        while (i3 < split.length) {
            String trim = split[i3].trim();
            try {
                i2 = j.b.class.getField(trim).getInt(null);
            } catch (Exception unused) {
                i2 = 0;
            }
            if (i2 == 0) {
                i2 = context.getResources().getIdentifier(trim, "id", context.getPackageName());
            }
            if (i2 == 0 && view.isInEditMode() && (view.getParent() instanceof ConstraintLayout) && (r2 = ((ConstraintLayout) view.getParent()).r(0, trim)) != null && (r2 instanceof Integer)) {
                i2 = ((Integer) r2).intValue();
            }
            iArr[i4] = i2;
            i3++;
            i4++;
        }
        if (i4 != split.length) {
            return Arrays.copyOf(iArr, i4);
        }
        return iArr;
    }

    public void Z0(int i2, int i3) {
        i0(i2).e.E = i3;
    }

    public void a0(int i2, int i3) {
        b bVar = i0(i2).e;
        bVar.a = true;
        bVar.G = i3;
    }

    public void a1(int i2, int i3) {
        i0(i2).e.F = i3;
    }

    public void b0(int i2, int i3, int i4, int... iArr) {
        b bVar = i0(i2).e;
        bVar.j0 = 1;
        bVar.h0 = i3;
        bVar.i0 = i4;
        bVar.a = false;
        bVar.k0 = iArr;
    }

    public void b1(int i2, float f2) {
        i0(i2).f.n = f2;
        i0(i2).f.m = true;
    }

    public void c0(int i2, int i3, int i4, int i5, int[] iArr, float[] fArr, int i6) {
        d0(i2, i3, i4, i5, iArr, fArr, i6, 1, 2);
    }

    public void c1(int i2, String str, float f2) {
        i0(i2).q(str, f2);
    }

    public final void d0(int i2, int i3, int i4, int i5, int[] iArr, float[] fArr, int i6, int i7, int i8) {
        if (iArr.length >= 2) {
            if (fArr != null && fArr.length != iArr.length) {
                throw new IllegalArgumentException("must have 2 or more widgets in a chain");
            }
            if (fArr != null) {
                i0(iArr[0]).e.W = fArr[0];
            }
            i0(iArr[0]).e.X = i6;
            L(iArr[0], i7, i2, i3, -1);
            for (int i9 = 1; i9 < iArr.length; i9++) {
                int i10 = i9 - 1;
                L(iArr[i9], i7, iArr[i10], i8, -1);
                L(iArr[i10], i8, iArr[i9], i7, -1);
                if (fArr != null) {
                    i0(iArr[i9]).e.W = fArr[i9];
                }
            }
            L(iArr[iArr.length - 1], i8, i4, i5, -1);
            return;
        }
        throw new IllegalArgumentException("must have 2 or more widgets in a chain");
    }

    public void d1(boolean z2) {
        this.g = z2;
    }

    public void e0(int i2, int i3, int i4, int i5, int[] iArr, float[] fArr, int i6) {
        d0(i2, i3, i4, i5, iArr, fArr, i6, 6, 7);
    }

    public void e1(int i2, int i3, int i4) {
        a i02 = i0(i2);
        switch (i3) {
            case 1:
                i02.e.O = i4;
                return;
            case 2:
                i02.e.Q = i4;
                return;
            case 3:
                i02.e.P = i4;
                return;
            case 4:
                i02.e.R = i4;
                return;
            case 5:
                i02.e.U = i4;
                return;
            case 6:
                i02.e.T = i4;
                return;
            case 7:
                i02.e.S = i4;
                return;
            default:
                throw new IllegalArgumentException("unknown constraint");
        }
    }

    public void f0(int i2, int i3, int i4, int i5, int[] iArr, float[] fArr, int i6) {
        if (iArr.length >= 2) {
            if (fArr != null && fArr.length != iArr.length) {
                throw new IllegalArgumentException("must have 2 or more widgets in a chain");
            }
            if (fArr != null) {
                i0(iArr[0]).e.V = fArr[0];
            }
            i0(iArr[0]).e.Y = i6;
            L(iArr[0], 3, i2, i3, 0);
            for (int i7 = 1; i7 < iArr.length; i7++) {
                int i8 = i7 - 1;
                L(iArr[i7], 3, iArr[i8], 4, 0);
                L(iArr[i8], 4, iArr[i7], 3, 0);
                if (fArr != null) {
                    i0(iArr[i7]).e.V = fArr[i7];
                }
            }
            L(iArr[iArr.length - 1], 4, i4, i5, 0);
            return;
        }
        throw new IllegalArgumentException("must have 2 or more widgets in a chain");
    }

    public void f1(int i2, int i3) {
        i0(i2).e.f = i3;
        i0(i2).e.g = -1;
        i0(i2).e.h = -1.0f;
    }

    public void g0(C8590ol1 c8590ol1, int... iArr) {
        HashSet hashSet;
        Integer[] numArr;
        Set<Integer> keySet = this.h.keySet();
        if (iArr.length != 0) {
            hashSet = new HashSet();
            for (int i2 : iArr) {
                hashSet.add(Integer.valueOf(i2));
            }
        } else {
            hashSet = new HashSet(keySet);
        }
        System.out.println(hashSet.size() + " constraints");
        StringBuilder sb = new StringBuilder();
        for (Integer num : (Integer[]) hashSet.toArray(new Integer[0])) {
            a aVar = this.h.get(num);
            if (aVar != null) {
                sb.append("<Constraint id=");
                sb.append(num);
                sb.append(" \n");
                aVar.e.b(c8590ol1, sb);
                sb.append("/>\n");
            }
        }
        System.out.println(sb.toString());
    }

    public void g1(int i2, int i3) {
        i0(i2).e.g = i3;
        i0(i2).e.f = -1;
        i0(i2).e.h = -1.0f;
    }

    public final void h(a.EnumC0018a enumC0018a, String... strArr) {
        for (int i2 = 0; i2 < strArr.length; i2++) {
            if (this.f.containsKey(strArr[i2])) {
                androidx.constraintlayout.widget.a aVar = this.f.get(strArr[i2]);
                if (aVar != null && aVar.j() != enumC0018a) {
                    throw new IllegalArgumentException("ConstraintAttribute is already a " + aVar.j().name());
                }
            } else {
                this.f.put(strArr[i2], new androidx.constraintlayout.widget.a(strArr[i2], enumC0018a));
            }
        }
    }

    public final a h0(Context context, AttributeSet attributeSet, boolean z2) {
        int[] iArr;
        a aVar = new a();
        if (z2) {
            iArr = j.c.b4;
        } else {
            iArr = j.c.m;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
        J0(aVar, obtainStyledAttributes, z2);
        obtainStyledAttributes.recycle();
        return aVar;
    }

    public void h1(int i2, float f2) {
        i0(i2).e.h = f2;
        i0(i2).e.g = -1;
        i0(i2).e.f = -1;
    }

    public void i(String... strArr) {
        h(a.EnumC0018a.COLOR_TYPE, strArr);
    }

    public final a i0(int i2) {
        if (!this.h.containsKey(Integer.valueOf(i2))) {
            this.h.put(Integer.valueOf(i2), new a());
        }
        return this.h.get(Integer.valueOf(i2));
    }

    public void i1(int i2, float f2) {
        i0(i2).e.y = f2;
    }

    public void j(String... strArr) {
        h(a.EnumC0018a.FLOAT_TYPE, strArr);
    }

    public boolean j0(int i2) {
        return i0(i2).f.m;
    }

    public void j1(int i2, int i3) {
        i0(i2).e.X = i3;
    }

    public void k(String... strArr) {
        h(a.EnumC0018a.INT_TYPE, strArr);
    }

    public a k0(int i2) {
        if (this.h.containsKey(Integer.valueOf(i2))) {
            return this.h.get(Integer.valueOf(i2));
        }
        return null;
    }

    public void k1(int i2, float f2) {
        i0(i2).e.W = f2;
    }

    public void l(String... strArr) {
        h(a.EnumC0018a.STRING_TYPE, strArr);
    }

    public HashMap<String, androidx.constraintlayout.widget.a> l0() {
        return this.f;
    }

    public void l1(int i2, String str, int i3) {
        i0(i2).r(str, i3);
    }

    public void m(int i2, int i3, int i4) {
        int i5;
        int i6;
        if (i3 == 0) {
            i5 = 1;
        } else {
            i5 = 2;
        }
        L(i2, 1, i3, i5, 0);
        if (i4 == 0) {
            i6 = 2;
        } else {
            i6 = 1;
        }
        L(i2, 2, i4, i6, 0);
        if (i3 != 0) {
            L(i3, 2, i2, 1, 0);
        }
        if (i4 != 0) {
            L(i4, 1, i2, 2, 0);
        }
    }

    public void m1(int i2, int i3) {
        if (i3 >= 0 && i3 <= 3) {
            i0(i2).e.q0 = i3;
        }
    }

    public void n(int i2, int i3, int i4) {
        int i5;
        int i6;
        if (i3 == 0) {
            i5 = 6;
        } else {
            i5 = 7;
        }
        L(i2, 6, i3, i5, 0);
        if (i4 == 0) {
            i6 = 7;
        } else {
            i6 = 6;
        }
        L(i2, 7, i4, i6, 0);
        if (i3 != 0) {
            L(i3, 7, i2, 6, 0);
        }
        if (i4 != 0) {
            L(i4, 6, i2, 7, 0);
        }
    }

    public int n0(int i2) {
        return i0(i2).e.e;
    }

    public void n1(int i2, int i3, int i4) {
        a i02 = i0(i2);
        switch (i3) {
            case 1:
                i02.e.H = i4;
                return;
            case 2:
                i02.e.I = i4;
                return;
            case 3:
                i02.e.J = i4;
                return;
            case 4:
                i02.e.K = i4;
                return;
            case 5:
                i02.e.N = i4;
                return;
            case 6:
                i02.e.M = i4;
                return;
            case 7:
                i02.e.L = i4;
                return;
            default:
                throw new IllegalArgumentException("unknown constraint");
        }
    }

    public void o(int i2, int i3, int i4) {
        int i5;
        int i6;
        if (i3 == 0) {
            i5 = 3;
        } else {
            i5 = 4;
        }
        L(i2, 3, i3, i5, 0);
        if (i4 == 0) {
            i6 = 4;
        } else {
            i6 = 3;
        }
        L(i2, 4, i4, i6, 0);
        if (i3 != 0) {
            L(i3, 4, i2, 3, 0);
        }
        if (i4 != 0) {
            L(i4, 3, i2, 4, 0);
        }
    }

    public int[] o0() {
        Integer[] numArr = (Integer[]) this.h.keySet().toArray(new Integer[0]);
        int length = numArr.length;
        int[] iArr = new int[length];
        for (int i2 = 0; i2 < length; i2++) {
            iArr[i2] = numArr[i2].intValue();
        }
        return iArr;
    }

    public void o1(int i2, int... iArr) {
        i0(i2).e.k0 = iArr;
    }

    public void p(ConstraintLayout constraintLayout) {
        a aVar;
        int childCount = constraintLayout.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = constraintLayout.getChildAt(i2);
            int id = childAt.getId();
            if (!this.h.containsKey(Integer.valueOf(id))) {
                Log.w("ConstraintSet", "id unknown " + AV.k(childAt));
            } else if (this.g && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            } else {
                if (this.h.containsKey(Integer.valueOf(id)) && (aVar = this.h.get(Integer.valueOf(id))) != null) {
                    androidx.constraintlayout.widget.a.r(childAt, aVar.g);
                }
            }
        }
    }

    public void p1(int i2, float f2) {
        i0(i2).f.b = f2;
    }

    public void q(e eVar) {
        for (a aVar : eVar.h.values()) {
            if (aVar.h != null) {
                if (aVar.b == null) {
                    aVar.h.e(k0(aVar.a));
                } else {
                    for (Integer num : this.h.keySet()) {
                        a k02 = k0(num.intValue());
                        String str = k02.e.m0;
                        if (str != null && aVar.b.matches(str)) {
                            aVar.h.e(k02);
                            k02.g.putAll((HashMap) aVar.g.clone());
                        }
                    }
                }
            }
        }
    }

    public a q0(int i2) {
        return i0(i2);
    }

    public void q1(int i2, float f2) {
        i0(i2).f.c = f2;
    }

    public void r(ConstraintLayout constraintLayout) {
        t(constraintLayout, true);
        constraintLayout.setConstraintSet(null);
        constraintLayout.requestLayout();
    }

    public int[] r0(int i2) {
        int[] iArr = i0(i2).e.k0;
        if (iArr == null) {
            return new int[0];
        }
        return Arrays.copyOf(iArr, iArr.length);
    }

    public void r1(int i2, float f2) {
        i0(i2).f.d = f2;
    }

    public void s(androidx.constraintlayout.widget.b bVar, UK uk, ConstraintLayout.b bVar2, SparseArray<UK> sparseArray) {
        a aVar;
        int id = bVar.getId();
        if (this.h.containsKey(Integer.valueOf(id)) && (aVar = this.h.get(Integer.valueOf(id))) != null && (uk instanceof C9696tH0)) {
            bVar.B(aVar, (C9696tH0) uk, bVar2, sparseArray);
        }
    }

    public String[] s0() {
        String[] strArr = this.d;
        return (String[]) Arrays.copyOf(strArr, strArr.length);
    }

    public void s1(int i2, float f2) {
        i0(i2).f.e = f2;
    }

    public void t(ConstraintLayout constraintLayout, boolean z2) {
        View findViewById;
        int childCount = constraintLayout.getChildCount();
        HashSet hashSet = new HashSet(this.h.keySet());
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = constraintLayout.getChildAt(i2);
            int id = childAt.getId();
            if (!this.h.containsKey(Integer.valueOf(id))) {
                Log.w("ConstraintSet", "id unknown " + AV.k(childAt));
            } else if (this.g && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            } else {
                if (id != -1) {
                    if (this.h.containsKey(Integer.valueOf(id))) {
                        hashSet.remove(Integer.valueOf(id));
                        a aVar = this.h.get(Integer.valueOf(id));
                        if (aVar != null) {
                            if (childAt instanceof Barrier) {
                                aVar.e.j0 = 1;
                                Barrier barrier = (Barrier) childAt;
                                barrier.setId(id);
                                barrier.setType(aVar.e.h0);
                                barrier.setMargin(aVar.e.i0);
                                barrier.setAllowsGoneWidget(aVar.e.p0);
                                b bVar = aVar.e;
                                int[] iArr = bVar.k0;
                                if (iArr != null) {
                                    barrier.setReferencedIds(iArr);
                                } else {
                                    String str = bVar.l0;
                                    if (str != null) {
                                        bVar.k0 = Z(barrier, str);
                                        barrier.setReferencedIds(aVar.e.k0);
                                    }
                                }
                            }
                            ConstraintLayout.b bVar2 = (ConstraintLayout.b) childAt.getLayoutParams();
                            bVar2.e();
                            aVar.i(bVar2);
                            if (z2) {
                                androidx.constraintlayout.widget.a.r(childAt, aVar.g);
                            }
                            childAt.setLayoutParams(bVar2);
                            d dVar = aVar.c;
                            if (dVar.c == 0) {
                                childAt.setVisibility(dVar.b);
                            }
                            childAt.setAlpha(aVar.c.d);
                            childAt.setRotation(aVar.f.b);
                            childAt.setRotationX(aVar.f.c);
                            childAt.setRotationY(aVar.f.d);
                            childAt.setScaleX(aVar.f.e);
                            childAt.setScaleY(aVar.f.f);
                            C0020e c0020e = aVar.f;
                            if (c0020e.i != -1) {
                                if (((View) childAt.getParent()).findViewById(aVar.f.i) != null) {
                                    float top = (findViewById.getTop() + findViewById.getBottom()) / 2.0f;
                                    float left = (findViewById.getLeft() + findViewById.getRight()) / 2.0f;
                                    if (childAt.getRight() - childAt.getLeft() > 0 && childAt.getBottom() - childAt.getTop() > 0) {
                                        childAt.setPivotX(left - childAt.getLeft());
                                        childAt.setPivotY(top - childAt.getTop());
                                    }
                                }
                            } else {
                                if (!Float.isNaN(c0020e.g)) {
                                    childAt.setPivotX(aVar.f.g);
                                }
                                if (!Float.isNaN(aVar.f.h)) {
                                    childAt.setPivotY(aVar.f.h);
                                }
                            }
                            childAt.setTranslationX(aVar.f.j);
                            childAt.setTranslationY(aVar.f.k);
                            childAt.setTranslationZ(aVar.f.l);
                            C0020e c0020e2 = aVar.f;
                            if (c0020e2.m) {
                                childAt.setElevation(c0020e2.n);
                            }
                        }
                    } else {
                        Log.v("ConstraintSet", "WARNING NO CONSTRAINTS for view " + id);
                    }
                }
            }
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            a aVar2 = this.h.get(num);
            if (aVar2 != null) {
                if (aVar2.e.j0 == 1) {
                    Barrier barrier2 = new Barrier(constraintLayout.getContext());
                    barrier2.setId(num.intValue());
                    b bVar3 = aVar2.e;
                    int[] iArr2 = bVar3.k0;
                    if (iArr2 != null) {
                        barrier2.setReferencedIds(iArr2);
                    } else {
                        String str2 = bVar3.l0;
                        if (str2 != null) {
                            bVar3.k0 = Z(barrier2, str2);
                            barrier2.setReferencedIds(aVar2.e.k0);
                        }
                    }
                    barrier2.setType(aVar2.e.h0);
                    barrier2.setMargin(aVar2.e.i0);
                    ConstraintLayout.b generateDefaultLayoutParams = constraintLayout.generateDefaultLayoutParams();
                    barrier2.K();
                    aVar2.i(generateDefaultLayoutParams);
                    constraintLayout.addView(barrier2, generateDefaultLayoutParams);
                }
                if (aVar2.e.a) {
                    View hVar = new h(constraintLayout.getContext());
                    hVar.setId(num.intValue());
                    ConstraintLayout.b generateDefaultLayoutParams2 = constraintLayout.generateDefaultLayoutParams();
                    aVar2.i(generateDefaultLayoutParams2);
                    constraintLayout.addView(hVar, generateDefaultLayoutParams2);
                }
            }
        }
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt2 = constraintLayout.getChildAt(i3);
            if (childAt2 instanceof androidx.constraintlayout.widget.b) {
                ((androidx.constraintlayout.widget.b) childAt2).s(constraintLayout);
            }
        }
    }

    public int t0(int i2) {
        return i0(i2).c.b;
    }

    public void t1(int i2, float f2) {
        i0(i2).f.f = f2;
    }

    public void u(int i2, ConstraintLayout.b bVar) {
        a aVar;
        if (this.h.containsKey(Integer.valueOf(i2)) && (aVar = this.h.get(Integer.valueOf(i2))) != null) {
            aVar.i(bVar);
        }
    }

    public int u0(int i2) {
        return i0(i2).c.c;
    }

    public void u1(String str) {
        this.d = str.split(",");
        int i2 = 0;
        while (true) {
            String[] strArr = this.d;
            if (i2 < strArr.length) {
                strArr[i2] = strArr[i2].trim();
                i2++;
            } else {
                return;
            }
        }
    }

    public void v(ConstraintLayout constraintLayout) {
        t(constraintLayout, false);
        constraintLayout.setConstraintSet(null);
    }

    public int v0(int i2) {
        return i0(i2).e.d;
    }

    public void v1(String... strArr) {
        this.d = strArr;
        int i2 = 0;
        while (true) {
            String[] strArr2 = this.d;
            if (i2 < strArr2.length) {
                strArr2[i2] = strArr2[i2].trim();
                i2++;
            } else {
                return;
            }
        }
    }

    public boolean w0() {
        return this.g;
    }

    public void w1(int i2, String str, String str2) {
        i0(i2).s(str, str2);
    }

    public void x(int i2, int i3, int i4, int i5, int i6, int i7, int i8, float f2) {
        if (i5 >= 0) {
            if (i8 >= 0) {
                if (f2 > 0.0f && f2 <= 1.0f) {
                    if (i4 != 1 && i4 != 2) {
                        if (i4 != 6 && i4 != 7) {
                            L(i2, 3, i3, i4, i5);
                            L(i2, 4, i6, i7, i8);
                            a aVar = this.h.get(Integer.valueOf(i2));
                            if (aVar != null) {
                                aVar.e.z = f2;
                                return;
                            }
                            return;
                        }
                        L(i2, 6, i3, i4, i5);
                        L(i2, 7, i6, i7, i8);
                        a aVar2 = this.h.get(Integer.valueOf(i2));
                        if (aVar2 != null) {
                            aVar2.e.y = f2;
                            return;
                        }
                        return;
                    }
                    L(i2, 1, i3, i4, i5);
                    L(i2, 2, i6, i7, i8);
                    a aVar3 = this.h.get(Integer.valueOf(i2));
                    if (aVar3 != null) {
                        aVar3.e.y = f2;
                        return;
                    }
                    return;
                }
                throw new IllegalArgumentException("bias must be between 0 and 1 inclusive");
            }
            throw new IllegalArgumentException("margin must be > 0");
        }
        throw new IllegalArgumentException("margin must be > 0");
    }

    public boolean x0() {
        return this.a;
    }

    public void x1(int i2, float f2, float f3) {
        C0020e c0020e = i0(i2).f;
        c0020e.h = f3;
        c0020e.g = f2;
    }

    public void y(int i2, int i3) {
        if (i3 == 0) {
            x(i2, 0, 1, 0, 0, 2, 0, 0.5f);
        } else {
            x(i2, i3, 2, 0, i3, 1, 0, 0.5f);
        }
    }

    public void y0(Context context, int i2) {
        XmlResourceParser xml = context.getResources().getXml(i2);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType != 2) {
                    continue;
                } else {
                    String name = xml.getName();
                    a h02 = h0(context, Xml.asAttributeSet(xml), false);
                    if (name.equalsIgnoreCase("Guideline")) {
                        h02.e.a = true;
                    }
                    this.h.put(Integer.valueOf(h02.a), h02);
                    continue;
                }
            }
        } catch (IOException e) {
            Log.e("ConstraintSet", "Error parsing resource: " + i2, e);
        } catch (XmlPullParserException e2) {
            Log.e("ConstraintSet", "Error parsing resource: " + i2, e2);
        }
    }

    public void y1(int i2, float f2) {
        i0(i2).f.g = f2;
    }

    public void z(int i2, int i3, int i4, int i5, int i6, int i7, int i8, float f2) {
        L(i2, 1, i3, i4, i5);
        L(i2, 2, i6, i7, i8);
        a aVar = this.h.get(Integer.valueOf(i2));
        if (aVar != null) {
            aVar.e.y = f2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:123:0x01d2, code lost:
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void z0(Context context, XmlPullParser xmlPullParser) {
        try {
            int eventType = xmlPullParser.getEventType();
            a aVar = null;
            while (eventType != 1) {
                if (eventType != 0) {
                    char c2 = 65535;
                    if (eventType != 2) {
                        if (eventType == 3) {
                            String lowerCase = xmlPullParser.getName().toLowerCase(Locale.ROOT);
                            switch (lowerCase.hashCode()) {
                                case -2075718416:
                                    if (lowerCase.equals("guideline")) {
                                        c2 = 3;
                                        break;
                                    }
                                    break;
                                case -190376483:
                                    if (lowerCase.equals("constraint")) {
                                        c2 = 1;
                                        break;
                                    }
                                    break;
                                case 426575017:
                                    if (lowerCase.equals("constraintoverride")) {
                                        c2 = 2;
                                        break;
                                    }
                                    break;
                                case 2146106725:
                                    if (lowerCase.equals("constraintset")) {
                                        c2 = 0;
                                        break;
                                    }
                                    break;
                            }
                            if (c2 != 0) {
                                if (c2 == 1 || c2 == 2 || c2 == 3) {
                                    this.h.put(Integer.valueOf(aVar.a), aVar);
                                    aVar = null;
                                }
                            } else {
                                return;
                            }
                        }
                    } else {
                        String name = xmlPullParser.getName();
                        switch (name.hashCode()) {
                            case -2025855158:
                                if (name.equals("Layout")) {
                                    c2 = 6;
                                    break;
                                }
                                break;
                            case -1984451626:
                                if (name.equals(InterfaceC8148mw2.e.a)) {
                                    c2 = 7;
                                    break;
                                }
                                break;
                            case -1962203927:
                                if (name.equals(C7994mI2.A)) {
                                    c2 = 1;
                                    break;
                                }
                                break;
                            case -1269513683:
                                if (name.equals("PropertySet")) {
                                    c2 = 4;
                                    break;
                                }
                                break;
                            case -1238332596:
                                if (name.equals("Transform")) {
                                    c2 = 5;
                                    break;
                                }
                                break;
                            case -71750448:
                                if (name.equals("Guideline")) {
                                    c2 = 2;
                                    break;
                                }
                                break;
                            case 366511058:
                                if (name.equals("CustomMethod")) {
                                    c2 = '\t';
                                    break;
                                }
                                break;
                            case 1331510167:
                                if (name.equals("Barrier")) {
                                    c2 = 3;
                                    break;
                                }
                                break;
                            case 1791837707:
                                if (name.equals("CustomAttribute")) {
                                    c2 = '\b';
                                    break;
                                }
                                break;
                            case 1803088381:
                                if (name.equals("Constraint")) {
                                    c2 = 0;
                                    break;
                                }
                                break;
                        }
                        switch (c2) {
                            case 0:
                                aVar = h0(context, Xml.asAttributeSet(xmlPullParser), false);
                                continue;
                            case 1:
                                aVar = h0(context, Xml.asAttributeSet(xmlPullParser), true);
                                continue;
                            case 2:
                                aVar = h0(context, Xml.asAttributeSet(xmlPullParser), false);
                                b bVar = aVar.e;
                                bVar.a = true;
                                bVar.b = true;
                                continue;
                            case 3:
                                aVar = h0(context, Xml.asAttributeSet(xmlPullParser), false);
                                aVar.e.j0 = 1;
                                continue;
                            case 4:
                                if (aVar != null) {
                                    aVar.c.b(context, Xml.asAttributeSet(xmlPullParser));
                                    continue;
                                } else {
                                    throw new RuntimeException("XML parser error must be within a Constraint " + xmlPullParser.getLineNumber());
                                }
                            case 5:
                                if (aVar != null) {
                                    aVar.f.b(context, Xml.asAttributeSet(xmlPullParser));
                                    continue;
                                } else {
                                    throw new RuntimeException("XML parser error must be within a Constraint " + xmlPullParser.getLineNumber());
                                }
                            case 6:
                                if (aVar != null) {
                                    aVar.e.c(context, Xml.asAttributeSet(xmlPullParser));
                                    continue;
                                } else {
                                    throw new RuntimeException("XML parser error must be within a Constraint " + xmlPullParser.getLineNumber());
                                }
                            case 7:
                                if (aVar != null) {
                                    aVar.d.b(context, Xml.asAttributeSet(xmlPullParser));
                                    continue;
                                } else {
                                    throw new RuntimeException("XML parser error must be within a Constraint " + xmlPullParser.getLineNumber());
                                }
                            case '\b':
                            case '\t':
                                if (aVar != null) {
                                    androidx.constraintlayout.widget.a.q(context, xmlPullParser, aVar.g);
                                    continue;
                                } else {
                                    throw new RuntimeException("XML parser error must be within a Constraint " + xmlPullParser.getLineNumber());
                                }
                        }
                    }
                } else {
                    xmlPullParser.getName();
                }
                eventType = xmlPullParser.next();
            }
        } catch (IOException e) {
            Log.e("ConstraintSet", "Error parsing XML resource", e);
        } catch (XmlPullParserException e2) {
            Log.e("ConstraintSet", "Error parsing XML resource", e2);
        }
    }

    public void z1(int i2, float f2) {
        i0(i2).f.h = f2;
    }
}
