package o;

import android.content.Context;
import android.graphics.Point;
import android.os.Bundle;
import android.os.Looper;
import android.view.accessibility.CaptioningManager;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;
import o.AbstractC5317bO0;
import o.InterfaceC8368nr;

@Deprecated
/* renamed from: o.Fr2  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C2989Fr2 implements InterfaceC8368nr {
    public static final String A1;
    public static final String B1;
    public static final String C1;
    public static final String D1;
    public static final String E1;
    public static final String F1;
    public static final String G1;
    public static final String H1;
    public static final String I1;
    public static final String J1;
    public static final String K1;
    public static final String L1;
    public static final String M1;
    public static final String N1;
    public static final String O1;
    public static final String P1;
    public static final String Q1;
    public static final String R1;
    public static final String S1;
    public static final String T1;
    public static final String U1;
    public static final String V1;
    public static final String W1;
    public static final int X1 = 1000;
    @Deprecated
    public static final InterfaceC8368nr.a<C2989Fr2> Y1;
    public static final C2989Fr2 v1;
    @Deprecated
    public static final C2989Fr2 w1;
    public static final String x1;
    public static final String y1;
    public static final String z1;
    public final int X;
    public final int Y;
    public final int Y0;
    public final int Z;
    public final int Z0;
    public final int a1;
    public final int b1;
    public final int c1;
    public final int d1;
    public final int e1;
    public final boolean f1;
    public final AbstractC5317bO0<String> g1;
    public final int h1;
    public final AbstractC5317bO0<String> i1;
    public final int j1;
    public final int k1;
    public final int l1;
    public final AbstractC5317bO0<String> m1;
    public final AbstractC5317bO0<String> n1;
    public final int o1;
    public final int p1;
    public final boolean q1;
    public final boolean r1;
    public final boolean s1;
    public final AbstractC6044eO0<C9593sr2, C2782Dr2> t1;
    public final AbstractC9481sO0<Integer> u1;

    static {
        C2989Fr2 B = new a().B();
        v1 = B;
        w1 = B;
        x1 = TD2.R0(1);
        y1 = TD2.R0(2);
        z1 = TD2.R0(3);
        A1 = TD2.R0(4);
        B1 = TD2.R0(5);
        C1 = TD2.R0(6);
        D1 = TD2.R0(7);
        E1 = TD2.R0(8);
        F1 = TD2.R0(9);
        G1 = TD2.R0(10);
        H1 = TD2.R0(11);
        I1 = TD2.R0(12);
        J1 = TD2.R0(13);
        K1 = TD2.R0(14);
        L1 = TD2.R0(15);
        M1 = TD2.R0(16);
        N1 = TD2.R0(17);
        O1 = TD2.R0(18);
        P1 = TD2.R0(19);
        Q1 = TD2.R0(20);
        R1 = TD2.R0(21);
        S1 = TD2.R0(22);
        T1 = TD2.R0(23);
        U1 = TD2.R0(24);
        V1 = TD2.R0(25);
        W1 = TD2.R0(26);
        Y1 = new InterfaceC8368nr.a() { // from class: o.Er2
            @Override // o.InterfaceC8368nr.a
            public final InterfaceC8368nr a(Bundle bundle) {
                return C2989Fr2.C(bundle);
            }
        };
    }

    public C2989Fr2(a aVar) {
        this.X = aVar.a;
        this.Y = aVar.b;
        this.Z = aVar.c;
        this.Y0 = aVar.d;
        this.Z0 = aVar.e;
        this.a1 = aVar.f;
        this.b1 = aVar.g;
        this.c1 = aVar.h;
        this.d1 = aVar.i;
        this.e1 = aVar.j;
        this.f1 = aVar.k;
        this.g1 = aVar.l;
        this.h1 = aVar.m;
        this.i1 = aVar.n;
        this.j1 = aVar.f458o;
        this.k1 = aVar.p;
        this.l1 = aVar.q;
        this.m1 = aVar.r;
        this.n1 = aVar.s;
        this.o1 = aVar.t;
        this.p1 = aVar.u;
        this.q1 = aVar.v;
        this.r1 = aVar.w;
        this.s1 = aVar.x;
        this.t1 = AbstractC6044eO0.g(aVar.y);
        this.u1 = AbstractC9481sO0.G(aVar.z);
    }

    public static C2989Fr2 C(Bundle bundle) {
        return new a(bundle).B();
    }

    public static C2989Fr2 D(Context context) {
        return new a(context).B();
    }

    public a B() {
        return new a(this);
    }

    @Override // o.InterfaceC8368nr
    public Bundle e() {
        Bundle bundle = new Bundle();
        bundle.putInt(C1, this.X);
        bundle.putInt(D1, this.Y);
        bundle.putInt(E1, this.Z);
        bundle.putInt(F1, this.Y0);
        bundle.putInt(G1, this.Z0);
        bundle.putInt(H1, this.a1);
        bundle.putInt(I1, this.b1);
        bundle.putInt(J1, this.c1);
        bundle.putInt(K1, this.d1);
        bundle.putInt(L1, this.e1);
        bundle.putBoolean(M1, this.f1);
        bundle.putStringArray(N1, (String[]) this.g1.toArray(new String[0]));
        bundle.putInt(V1, this.h1);
        bundle.putStringArray(x1, (String[]) this.i1.toArray(new String[0]));
        bundle.putInt(y1, this.j1);
        bundle.putInt(O1, this.k1);
        bundle.putInt(P1, this.l1);
        bundle.putStringArray(Q1, (String[]) this.m1.toArray(new String[0]));
        bundle.putStringArray(z1, (String[]) this.n1.toArray(new String[0]));
        bundle.putInt(A1, this.o1);
        bundle.putInt(W1, this.p1);
        bundle.putBoolean(B1, this.q1);
        bundle.putBoolean(R1, this.r1);
        bundle.putBoolean(S1, this.s1);
        bundle.putParcelableArrayList(T1, C8855pr.i(this.t1.values()));
        bundle.putIntArray(U1, C7775lT0.B(this.u1));
        return bundle;
    }

    public boolean equals(@InterfaceC11300zs1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            C2989Fr2 c2989Fr2 = (C2989Fr2) obj;
            if (this.X == c2989Fr2.X && this.Y == c2989Fr2.Y && this.Z == c2989Fr2.Z && this.Y0 == c2989Fr2.Y0 && this.Z0 == c2989Fr2.Z0 && this.a1 == c2989Fr2.a1 && this.b1 == c2989Fr2.b1 && this.c1 == c2989Fr2.c1 && this.f1 == c2989Fr2.f1 && this.d1 == c2989Fr2.d1 && this.e1 == c2989Fr2.e1 && this.g1.equals(c2989Fr2.g1) && this.h1 == c2989Fr2.h1 && this.i1.equals(c2989Fr2.i1) && this.j1 == c2989Fr2.j1 && this.k1 == c2989Fr2.k1 && this.l1 == c2989Fr2.l1 && this.m1.equals(c2989Fr2.m1) && this.n1.equals(c2989Fr2.n1) && this.o1 == c2989Fr2.o1 && this.p1 == c2989Fr2.p1 && this.q1 == c2989Fr2.q1 && this.r1 == c2989Fr2.r1 && this.s1 == c2989Fr2.s1 && this.t1.equals(c2989Fr2.t1) && this.u1.equals(c2989Fr2.u1)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((((((((((((((((((((((((((((((((((((((((((((((((this.X + 31) * 31) + this.Y) * 31) + this.Z) * 31) + this.Y0) * 31) + this.Z0) * 31) + this.a1) * 31) + this.b1) * 31) + this.c1) * 31) + (this.f1 ? 1 : 0)) * 31) + this.d1) * 31) + this.e1) * 31) + this.g1.hashCode()) * 31) + this.h1) * 31) + this.i1.hashCode()) * 31) + this.j1) * 31) + this.k1) * 31) + this.l1) * 31) + this.m1.hashCode()) * 31) + this.n1.hashCode()) * 31) + this.o1) * 31) + this.p1) * 31) + (this.q1 ? 1 : 0)) * 31) + (this.r1 ? 1 : 0)) * 31) + (this.s1 ? 1 : 0)) * 31) + this.t1.hashCode()) * 31) + this.u1.hashCode();
    }

    /* renamed from: o.Fr2$a */
    /* loaded from: classes2.dex */
    public static class a {
        public int a;
        public int b;
        public int c;
        public int d;
        public int e;
        public int f;
        public int g;
        public int h;
        public int i;
        public int j;
        public boolean k;
        public AbstractC5317bO0<String> l;
        public int m;
        public AbstractC5317bO0<String> n;

        /* renamed from: o  reason: collision with root package name */
        public int f458o;
        public int p;
        public int q;
        public AbstractC5317bO0<String> r;
        public AbstractC5317bO0<String> s;
        public int t;
        public int u;
        public boolean v;
        public boolean w;
        public boolean x;
        public HashMap<C9593sr2, C2782Dr2> y;
        public HashSet<Integer> z;

        @Deprecated
        public a() {
            this.a = Integer.MAX_VALUE;
            this.b = Integer.MAX_VALUE;
            this.c = Integer.MAX_VALUE;
            this.d = Integer.MAX_VALUE;
            this.i = Integer.MAX_VALUE;
            this.j = Integer.MAX_VALUE;
            this.k = true;
            this.l = AbstractC5317bO0.L();
            this.m = 0;
            this.n = AbstractC5317bO0.L();
            this.f458o = 0;
            this.p = Integer.MAX_VALUE;
            this.q = Integer.MAX_VALUE;
            this.r = AbstractC5317bO0.L();
            this.s = AbstractC5317bO0.L();
            this.t = 0;
            this.u = 0;
            this.v = false;
            this.w = false;
            this.x = false;
            this.y = new HashMap<>();
            this.z = new HashSet<>();
        }

        public static AbstractC5317bO0<String> I(String[] strArr) {
            AbstractC5317bO0.a r = AbstractC5317bO0.r();
            for (String str : (String[]) C9542sf.g(strArr)) {
                r.g(TD2.m1((String) C9542sf.g(str)));
            }
            return r.e();
        }

        @InterfaceC6181ey
        public a A(C2782Dr2 c2782Dr2) {
            this.y.put(c2782Dr2.X, c2782Dr2);
            return this;
        }

        public C2989Fr2 B() {
            return new C2989Fr2(this);
        }

        @InterfaceC6181ey
        public a C(C9593sr2 c9593sr2) {
            this.y.remove(c9593sr2);
            return this;
        }

        @InterfaceC6181ey
        public a D() {
            this.y.clear();
            return this;
        }

        @InterfaceC6181ey
        public a E(int i) {
            Iterator<C2782Dr2> it = this.y.values().iterator();
            while (it.hasNext()) {
                if (it.next().b() == i) {
                    it.remove();
                }
            }
            return this;
        }

        @InterfaceC6181ey
        public a F() {
            return S(Integer.MAX_VALUE, Integer.MAX_VALUE);
        }

        @InterfaceC6181ey
        public a G() {
            return n0(Integer.MAX_VALUE, Integer.MAX_VALUE, true);
        }

        @InterfaceC8557od0({"preferredVideoMimeTypes", "preferredAudioLanguages", "preferredAudioMimeTypes", "preferredTextLanguages", "overrides", "disabledTrackTypes"})
        public final void H(C2989Fr2 c2989Fr2) {
            this.a = c2989Fr2.X;
            this.b = c2989Fr2.Y;
            this.c = c2989Fr2.Z;
            this.d = c2989Fr2.Y0;
            this.e = c2989Fr2.Z0;
            this.f = c2989Fr2.a1;
            this.g = c2989Fr2.b1;
            this.h = c2989Fr2.c1;
            this.i = c2989Fr2.d1;
            this.j = c2989Fr2.e1;
            this.k = c2989Fr2.f1;
            this.l = c2989Fr2.g1;
            this.m = c2989Fr2.h1;
            this.n = c2989Fr2.i1;
            this.f458o = c2989Fr2.j1;
            this.p = c2989Fr2.k1;
            this.q = c2989Fr2.l1;
            this.r = c2989Fr2.m1;
            this.s = c2989Fr2.n1;
            this.t = c2989Fr2.o1;
            this.u = c2989Fr2.p1;
            this.v = c2989Fr2.q1;
            this.w = c2989Fr2.r1;
            this.x = c2989Fr2.s1;
            this.z = new HashSet<>(c2989Fr2.u1);
            this.y = new HashMap<>(c2989Fr2.t1);
        }

        @InterfaceC6181ey
        public a J(C2989Fr2 c2989Fr2) {
            H(c2989Fr2);
            return this;
        }

        @InterfaceC6181ey
        @Deprecated
        public a K(Set<Integer> set) {
            this.z.clear();
            this.z.addAll(set);
            return this;
        }

        @InterfaceC6181ey
        public a L(boolean z) {
            this.x = z;
            return this;
        }

        @InterfaceC6181ey
        public a M(boolean z) {
            this.w = z;
            return this;
        }

        @InterfaceC6181ey
        public a N(int i) {
            this.u = i;
            return this;
        }

        @InterfaceC6181ey
        public a O(int i) {
            this.q = i;
            return this;
        }

        @InterfaceC6181ey
        public a P(int i) {
            this.p = i;
            return this;
        }

        @InterfaceC6181ey
        public a Q(int i) {
            this.d = i;
            return this;
        }

        @InterfaceC6181ey
        public a R(int i) {
            this.c = i;
            return this;
        }

        @InterfaceC6181ey
        public a S(int i, int i2) {
            this.a = i;
            this.b = i2;
            return this;
        }

        @InterfaceC6181ey
        public a T() {
            return S(C8920q7.D, C8920q7.E);
        }

        @InterfaceC6181ey
        public a U(int i) {
            this.h = i;
            return this;
        }

        @InterfaceC6181ey
        public a V(int i) {
            this.g = i;
            return this;
        }

        @InterfaceC6181ey
        public a W(int i, int i2) {
            this.e = i;
            this.f = i2;
            return this;
        }

        @InterfaceC6181ey
        public a X(C2782Dr2 c2782Dr2) {
            E(c2782Dr2.b());
            this.y.put(c2782Dr2.X, c2782Dr2);
            return this;
        }

        public a Y(@InterfaceC11300zs1 String str) {
            if (str == null) {
                return Z(new String[0]);
            }
            return Z(str);
        }

        @InterfaceC6181ey
        public a Z(String... strArr) {
            this.n = I(strArr);
            return this;
        }

        public a a0(@InterfaceC11300zs1 String str) {
            if (str == null) {
                return b0(new String[0]);
            }
            return b0(str);
        }

        @InterfaceC6181ey
        public a b0(String... strArr) {
            this.r = AbstractC5317bO0.H(strArr);
            return this;
        }

        @InterfaceC6181ey
        public a c0(int i) {
            this.f458o = i;
            return this;
        }

        public a d0(@InterfaceC11300zs1 String str) {
            if (str == null) {
                return g0(new String[0]);
            }
            return g0(str);
        }

        @InterfaceC6181ey
        public a e0(Context context) {
            if (TD2.a >= 19) {
                f0(context);
            }
            return this;
        }

        @ES1(19)
        public final void f0(Context context) {
            CaptioningManager captioningManager;
            if ((TD2.a >= 23 || Looper.myLooper() != null) && (captioningManager = (CaptioningManager) context.getSystemService("captioning")) != null && captioningManager.isEnabled()) {
                this.t = 1088;
                Locale locale = captioningManager.getLocale();
                if (locale != null) {
                    this.s = AbstractC5317bO0.M(TD2.p0(locale));
                }
            }
        }

        @InterfaceC6181ey
        public a g0(String... strArr) {
            this.s = I(strArr);
            return this;
        }

        @InterfaceC6181ey
        public a h0(int i) {
            this.t = i;
            return this;
        }

        public a i0(@InterfaceC11300zs1 String str) {
            if (str == null) {
                return j0(new String[0]);
            }
            return j0(str);
        }

        @InterfaceC6181ey
        public a j0(String... strArr) {
            this.l = AbstractC5317bO0.H(strArr);
            return this;
        }

        @InterfaceC6181ey
        public a k0(int i) {
            this.m = i;
            return this;
        }

        @InterfaceC6181ey
        public a l0(boolean z) {
            this.v = z;
            return this;
        }

        @InterfaceC6181ey
        public a m0(int i, boolean z) {
            if (z) {
                this.z.add(Integer.valueOf(i));
                return this;
            }
            this.z.remove(Integer.valueOf(i));
            return this;
        }

        @InterfaceC6181ey
        public a n0(int i, int i2, boolean z) {
            this.i = i;
            this.j = i2;
            this.k = z;
            return this;
        }

        @InterfaceC6181ey
        public a o0(Context context, boolean z) {
            Point b0 = TD2.b0(context);
            return n0(b0.x, b0.y, z);
        }

        public a(Context context) {
            this();
            e0(context);
            o0(context, true);
        }

        public a(C2989Fr2 c2989Fr2) {
            H(c2989Fr2);
        }

        public a(Bundle bundle) {
            AbstractC5317bO0 d;
            String str = C2989Fr2.C1;
            C2989Fr2 c2989Fr2 = C2989Fr2.v1;
            this.a = bundle.getInt(str, c2989Fr2.X);
            this.b = bundle.getInt(C2989Fr2.D1, c2989Fr2.Y);
            this.c = bundle.getInt(C2989Fr2.E1, c2989Fr2.Z);
            this.d = bundle.getInt(C2989Fr2.F1, c2989Fr2.Y0);
            this.e = bundle.getInt(C2989Fr2.G1, c2989Fr2.Z0);
            this.f = bundle.getInt(C2989Fr2.H1, c2989Fr2.a1);
            this.g = bundle.getInt(C2989Fr2.I1, c2989Fr2.b1);
            this.h = bundle.getInt(C2989Fr2.J1, c2989Fr2.c1);
            this.i = bundle.getInt(C2989Fr2.K1, c2989Fr2.d1);
            this.j = bundle.getInt(C2989Fr2.L1, c2989Fr2.e1);
            this.k = bundle.getBoolean(C2989Fr2.M1, c2989Fr2.f1);
            this.l = AbstractC5317bO0.H((String[]) C3743Nk1.a(bundle.getStringArray(C2989Fr2.N1), new String[0]));
            this.m = bundle.getInt(C2989Fr2.V1, c2989Fr2.h1);
            this.n = I((String[]) C3743Nk1.a(bundle.getStringArray(C2989Fr2.x1), new String[0]));
            this.f458o = bundle.getInt(C2989Fr2.y1, c2989Fr2.j1);
            this.p = bundle.getInt(C2989Fr2.O1, c2989Fr2.k1);
            this.q = bundle.getInt(C2989Fr2.P1, c2989Fr2.l1);
            this.r = AbstractC5317bO0.H((String[]) C3743Nk1.a(bundle.getStringArray(C2989Fr2.Q1), new String[0]));
            this.s = I((String[]) C3743Nk1.a(bundle.getStringArray(C2989Fr2.z1), new String[0]));
            this.t = bundle.getInt(C2989Fr2.A1, c2989Fr2.o1);
            this.u = bundle.getInt(C2989Fr2.W1, c2989Fr2.p1);
            this.v = bundle.getBoolean(C2989Fr2.B1, c2989Fr2.q1);
            this.w = bundle.getBoolean(C2989Fr2.R1, c2989Fr2.r1);
            this.x = bundle.getBoolean(C2989Fr2.S1, c2989Fr2.s1);
            ArrayList parcelableArrayList = bundle.getParcelableArrayList(C2989Fr2.T1);
            if (parcelableArrayList == null) {
                d = AbstractC5317bO0.L();
            } else {
                d = C8855pr.d(C2782Dr2.Z0, parcelableArrayList);
            }
            this.y = new HashMap<>();
            for (int i = 0; i < d.size(); i++) {
                C2782Dr2 c2782Dr2 = (C2782Dr2) d.get(i);
                this.y.put(c2782Dr2.X, c2782Dr2);
            }
            int[] iArr = (int[]) C3743Nk1.a(bundle.getIntArray(C2989Fr2.U1), new int[0]);
            this.z = new HashSet<>();
            for (int i2 : iArr) {
                this.z.add(Integer.valueOf(i2));
            }
        }
    }
}
