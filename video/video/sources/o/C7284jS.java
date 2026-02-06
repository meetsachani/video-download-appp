package o;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.Layout;
import android.text.Spanned;
import android.text.SpannedString;
import android.text.TextUtils;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import o.InterfaceC8368nr;

@Deprecated
/* renamed from: o.jS */
/* loaded from: classes2.dex */
public final class C7284jS implements InterfaceC8368nr {
    public static final float n1 = -3.4028235E38f;
    public static final int o1 = Integer.MIN_VALUE;
    public static final int p1 = 0;
    public static final int q1 = 1;
    public static final int r1 = 2;
    public static final int s1 = 0;
    public static final int t1 = 1;
    public static final int u1 = 0;
    public static final int v1 = 1;
    public static final int w1 = 2;
    public static final int x1 = 1;
    public static final int y1 = 2;
    @InterfaceC11300zs1
    public final CharSequence X;
    @InterfaceC11300zs1
    public final Layout.Alignment Y;
    @InterfaceC11300zs1
    public final Bitmap Y0;
    @InterfaceC11300zs1
    public final Layout.Alignment Z;
    public final float Z0;
    public final int a1;
    public final int b1;
    public final float c1;
    public final int d1;
    public final float e1;
    public final float f1;
    public final boolean g1;
    public final int h1;
    public final int i1;
    public final float j1;
    public final int k1;
    public final float l1;
    public static final C7284jS m1 = new c().A("").a();
    public static final String z1 = TD2.R0(0);
    public static final String A1 = TD2.R0(1);
    public static final String B1 = TD2.R0(2);
    public static final String C1 = TD2.R0(3);
    public static final String D1 = TD2.R0(4);
    public static final String E1 = TD2.R0(5);
    public static final String F1 = TD2.R0(6);
    public static final String G1 = TD2.R0(7);
    public static final String H1 = TD2.R0(8);
    public static final String I1 = TD2.R0(9);
    public static final String J1 = TD2.R0(10);
    public static final String K1 = TD2.R0(11);
    public static final String L1 = TD2.R0(12);
    public static final String M1 = TD2.R0(13);
    public static final String N1 = TD2.R0(14);
    public static final String O1 = TD2.R0(15);
    public static final String P1 = TD2.R0(16);
    public static final InterfaceC8368nr.a<C7284jS> Q1 = new InterfaceC8368nr.a() { // from class: o.iS
        @Override // o.InterfaceC8368nr.a
        public final InterfaceC8368nr a(Bundle bundle) {
            return C7284jS.a(bundle);
        }
    };

    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: o.jS$b */
    /* loaded from: classes2.dex */
    public @interface b {
    }

    /* renamed from: o.jS$c */
    /* loaded from: classes2.dex */
    public static final class c {
        @InterfaceC11300zs1
        public CharSequence a;
        @InterfaceC11300zs1
        public Bitmap b;
        @InterfaceC11300zs1
        public Layout.Alignment c;
        @InterfaceC11300zs1
        public Layout.Alignment d;
        public float e;
        public int f;
        public int g;
        public float h;
        public int i;
        public int j;
        public float k;
        public float l;
        public float m;
        public boolean n;
        @JF

        /* renamed from: o */
        public int f775o;
        public int p;
        public float q;

        @InterfaceC6181ey
        public c A(CharSequence charSequence) {
            this.a = charSequence;
            return this;
        }

        @InterfaceC6181ey
        public c B(@InterfaceC11300zs1 Layout.Alignment alignment) {
            this.c = alignment;
            return this;
        }

        @InterfaceC6181ey
        public c C(float f, int i) {
            this.k = f;
            this.j = i;
            return this;
        }

        @InterfaceC6181ey
        public c D(int i) {
            this.p = i;
            return this;
        }

        @InterfaceC6181ey
        public c E(@JF int i) {
            this.f775o = i;
            this.n = true;
            return this;
        }

        public C7284jS a() {
            return new C7284jS(this.a, this.c, this.d, this.b, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.f775o, this.p, this.q);
        }

        @InterfaceC6181ey
        public c b() {
            this.n = false;
            return this;
        }

        @InterfaceC11300zs1
        @JK1
        public Bitmap c() {
            return this.b;
        }

        @JK1
        public float d() {
            return this.m;
        }

        @JK1
        public float e() {
            return this.e;
        }

        @JK1
        public int f() {
            return this.g;
        }

        @JK1
        public int g() {
            return this.f;
        }

        @JK1
        public float h() {
            return this.h;
        }

        @JK1
        public int i() {
            return this.i;
        }

        @JK1
        public float j() {
            return this.l;
        }

        @InterfaceC11300zs1
        @JK1
        public CharSequence k() {
            return this.a;
        }

        @InterfaceC11300zs1
        @JK1
        public Layout.Alignment l() {
            return this.c;
        }

        @JK1
        public float m() {
            return this.k;
        }

        @JK1
        public int n() {
            return this.j;
        }

        @JK1
        public int o() {
            return this.p;
        }

        @JF
        @JK1
        public int p() {
            return this.f775o;
        }

        public boolean q() {
            return this.n;
        }

        @InterfaceC6181ey
        public c r(Bitmap bitmap) {
            this.b = bitmap;
            return this;
        }

        @InterfaceC6181ey
        public c s(float f) {
            this.m = f;
            return this;
        }

        @InterfaceC6181ey
        public c t(float f, int i) {
            this.e = f;
            this.f = i;
            return this;
        }

        @InterfaceC6181ey
        public c u(int i) {
            this.g = i;
            return this;
        }

        @InterfaceC6181ey
        public c v(@InterfaceC11300zs1 Layout.Alignment alignment) {
            this.d = alignment;
            return this;
        }

        @InterfaceC6181ey
        public c w(float f) {
            this.h = f;
            return this;
        }

        @InterfaceC6181ey
        public c x(int i) {
            this.i = i;
            return this;
        }

        @InterfaceC6181ey
        public c y(float f) {
            this.q = f;
            return this;
        }

        @InterfaceC6181ey
        public c z(float f) {
            this.l = f;
            return this;
        }

        public c() {
            this.a = null;
            this.b = null;
            this.c = null;
            this.d = null;
            this.e = -3.4028235E38f;
            this.f = Integer.MIN_VALUE;
            this.g = Integer.MIN_VALUE;
            this.h = -3.4028235E38f;
            this.i = Integer.MIN_VALUE;
            this.j = Integer.MIN_VALUE;
            this.k = -3.4028235E38f;
            this.l = -3.4028235E38f;
            this.m = -3.4028235E38f;
            this.n = false;
            this.f775o = -16777216;
            this.p = Integer.MIN_VALUE;
        }

        public c(C7284jS c7284jS) {
            this.a = c7284jS.X;
            this.b = c7284jS.Y0;
            this.c = c7284jS.Y;
            this.d = c7284jS.Z;
            this.e = c7284jS.Z0;
            this.f = c7284jS.a1;
            this.g = c7284jS.b1;
            this.h = c7284jS.c1;
            this.i = c7284jS.d1;
            this.j = c7284jS.i1;
            this.k = c7284jS.j1;
            this.l = c7284jS.e1;
            this.m = c7284jS.f1;
            this.n = c7284jS.g1;
            this.f775o = c7284jS.h1;
            this.p = c7284jS.k1;
            this.q = c7284jS.l1;
        }
    }

    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: o.jS$d */
    /* loaded from: classes2.dex */
    public @interface d {
    }

    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: o.jS$e */
    /* loaded from: classes2.dex */
    public @interface e {
    }

    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: o.jS$f */
    /* loaded from: classes2.dex */
    public @interface f {
    }

    public static /* synthetic */ C7284jS a(Bundle bundle) {
        return c(bundle);
    }

    public static final C7284jS c(Bundle bundle) {
        c cVar = new c();
        CharSequence charSequence = bundle.getCharSequence(z1);
        if (charSequence != null) {
            cVar.A(charSequence);
        }
        Layout.Alignment alignment = (Layout.Alignment) bundle.getSerializable(A1);
        if (alignment != null) {
            cVar.B(alignment);
        }
        Layout.Alignment alignment2 = (Layout.Alignment) bundle.getSerializable(B1);
        if (alignment2 != null) {
            cVar.v(alignment2);
        }
        Bitmap bitmap = (Bitmap) bundle.getParcelable(C1);
        if (bitmap != null) {
            cVar.r(bitmap);
        }
        String str = D1;
        if (bundle.containsKey(str)) {
            String str2 = E1;
            if (bundle.containsKey(str2)) {
                cVar.t(bundle.getFloat(str), bundle.getInt(str2));
            }
        }
        String str3 = F1;
        if (bundle.containsKey(str3)) {
            cVar.u(bundle.getInt(str3));
        }
        String str4 = G1;
        if (bundle.containsKey(str4)) {
            cVar.w(bundle.getFloat(str4));
        }
        String str5 = H1;
        if (bundle.containsKey(str5)) {
            cVar.x(bundle.getInt(str5));
        }
        String str6 = J1;
        if (bundle.containsKey(str6)) {
            String str7 = I1;
            if (bundle.containsKey(str7)) {
                cVar.C(bundle.getFloat(str6), bundle.getInt(str7));
            }
        }
        String str8 = K1;
        if (bundle.containsKey(str8)) {
            cVar.z(bundle.getFloat(str8));
        }
        String str9 = L1;
        if (bundle.containsKey(str9)) {
            cVar.s(bundle.getFloat(str9));
        }
        String str10 = M1;
        if (bundle.containsKey(str10)) {
            cVar.E(bundle.getInt(str10));
        }
        if (!bundle.getBoolean(N1, false)) {
            cVar.b();
        }
        String str11 = O1;
        if (bundle.containsKey(str11)) {
            cVar.D(bundle.getInt(str11));
        }
        String str12 = P1;
        if (bundle.containsKey(str12)) {
            cVar.y(bundle.getFloat(str12));
        }
        return cVar.a();
    }

    public c b() {
        return new c();
    }

    @Override // o.InterfaceC8368nr
    public Bundle e() {
        Bundle bundle = new Bundle();
        bundle.putCharSequence(z1, this.X);
        bundle.putSerializable(A1, this.Y);
        bundle.putSerializable(B1, this.Z);
        bundle.putParcelable(C1, this.Y0);
        bundle.putFloat(D1, this.Z0);
        bundle.putInt(E1, this.a1);
        bundle.putInt(F1, this.b1);
        bundle.putFloat(G1, this.c1);
        bundle.putInt(H1, this.d1);
        bundle.putInt(I1, this.i1);
        bundle.putFloat(J1, this.j1);
        bundle.putFloat(K1, this.e1);
        bundle.putFloat(L1, this.f1);
        bundle.putBoolean(N1, this.g1);
        bundle.putInt(M1, this.h1);
        bundle.putInt(O1, this.k1);
        bundle.putFloat(P1, this.l1);
        return bundle;
    }

    public boolean equals(@InterfaceC11300zs1 Object obj) {
        Bitmap bitmap;
        Bitmap bitmap2;
        if (this == obj) {
            return true;
        }
        if (obj != null && C7284jS.class == obj.getClass()) {
            C7284jS c7284jS = (C7284jS) obj;
            if (TextUtils.equals(this.X, c7284jS.X) && this.Y == c7284jS.Y && this.Z == c7284jS.Z && ((bitmap = this.Y0) != null ? !((bitmap2 = c7284jS.Y0) == null || !bitmap.sameAs(bitmap2)) : c7284jS.Y0 == null) && this.Z0 == c7284jS.Z0 && this.a1 == c7284jS.a1 && this.b1 == c7284jS.b1 && this.c1 == c7284jS.c1 && this.d1 == c7284jS.d1 && this.e1 == c7284jS.e1 && this.f1 == c7284jS.f1 && this.g1 == c7284jS.g1 && this.h1 == c7284jS.h1 && this.i1 == c7284jS.i1 && this.j1 == c7284jS.j1 && this.k1 == c7284jS.k1 && this.l1 == c7284jS.l1) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return C2593Bt1.b(this.X, this.Y, this.Z, this.Y0, Float.valueOf(this.Z0), Integer.valueOf(this.a1), Integer.valueOf(this.b1), Float.valueOf(this.c1), Integer.valueOf(this.d1), Float.valueOf(this.e1), Float.valueOf(this.f1), Boolean.valueOf(this.g1), Integer.valueOf(this.h1), Integer.valueOf(this.i1), Float.valueOf(this.j1), Integer.valueOf(this.k1), Float.valueOf(this.l1));
    }

    public C7284jS(@InterfaceC11300zs1 CharSequence charSequence, @InterfaceC11300zs1 Layout.Alignment alignment, @InterfaceC11300zs1 Layout.Alignment alignment2, @InterfaceC11300zs1 Bitmap bitmap, float f2, int i, int i2, float f3, int i3, int i4, float f4, float f5, float f6, boolean z, int i5, int i6, float f7) {
        if (charSequence == null) {
            C9542sf.g(bitmap);
        } else {
            C9542sf.a(bitmap == null);
        }
        if (charSequence instanceof Spanned) {
            this.X = SpannedString.valueOf(charSequence);
        } else if (charSequence != null) {
            this.X = charSequence.toString();
        } else {
            this.X = null;
        }
        this.Y = alignment;
        this.Z = alignment2;
        this.Y0 = bitmap;
        this.Z0 = f2;
        this.a1 = i;
        this.b1 = i2;
        this.c1 = f3;
        this.d1 = i3;
        this.e1 = f5;
        this.f1 = f6;
        this.g1 = z;
        this.h1 = i5;
        this.i1 = i4;
        this.j1 = f4;
        this.k1 = i6;
        this.l1 = f7;
    }
}
