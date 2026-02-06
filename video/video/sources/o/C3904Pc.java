package o;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.LocaleList;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import java.util.Locale;
import o.C10231vT1;
import o.OL1;

/* renamed from: o.Pc  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3904Pc {
    public static final int n = -1;

    /* renamed from: o  reason: collision with root package name */
    public static final int f583o = 1;
    public static final int p = 2;
    public static final int q = 3;
    public final TextView a;
    public C2676Cp2 b;
    public C2676Cp2 c;
    public C2676Cp2 d;
    public C2676Cp2 e;
    public C2676Cp2 f;
    public C2676Cp2 g;
    public C2676Cp2 h;
    public final C4098Rc i;
    public int j = 0;
    public int k = -1;
    public Typeface l;
    public boolean m;

    /* renamed from: o.Pc$b */
    /* loaded from: classes.dex */
    public class b implements Runnable {
        public final /* synthetic */ TextView X;
        public final /* synthetic */ Typeface Y;
        public final /* synthetic */ int Z;

        public b(TextView textView, Typeface typeface, int i) {
            this.X = textView;
            this.Y = typeface;
            this.Z = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.X.setTypeface(this.Y, this.Z);
        }
    }

    /* renamed from: o.Pc$c */
    /* loaded from: classes.dex */
    public static class c {
        public static Locale a(String str) {
            return Locale.forLanguageTag(str);
        }
    }

    /* renamed from: o.Pc$d */
    /* loaded from: classes.dex */
    public static class d {
        public static LocaleList a(String str) {
            return LocaleList.forLanguageTags(str);
        }

        public static void b(TextView textView, LocaleList localeList) {
            textView.setTextLocales(localeList);
        }
    }

    /* renamed from: o.Pc$e */
    /* loaded from: classes.dex */
    public static class e {
        public static int a(TextView textView) {
            return textView.getAutoSizeStepGranularity();
        }

        public static void b(TextView textView, int i, int i2, int i3, int i4) {
            textView.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
        }

        public static void c(TextView textView, int[] iArr, int i) {
            textView.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
        }

        public static boolean d(TextView textView, String str) {
            return textView.setFontVariationSettings(str);
        }
    }

    /* renamed from: o.Pc$f */
    /* loaded from: classes.dex */
    public static class f {
        public static Typeface a(Typeface typeface, int i, boolean z) {
            return Typeface.create(typeface, i, z);
        }
    }

    public C3904Pc(TextView textView) {
        this.a = textView;
        this.i = new C4098Rc(textView);
    }

    public static C2676Cp2 d(Context context, C9038qc c9038qc, int i) {
        ColorStateList f2 = c9038qc.f(context, i);
        if (f2 != null) {
            C2676Cp2 c2676Cp2 = new C2676Cp2();
            c2676Cp2.d = true;
            c2676Cp2.a = f2;
            return c2676Cp2;
        }
        return null;
    }

    public void A(int i, float f2) {
        if (!C11163zI2.d && !l()) {
            B(i, f2);
        }
    }

    public final void B(int i, float f2) {
        this.i.t(i, f2);
    }

    public final void C(Context context, C2872Ep2 c2872Ep2) {
        String w;
        boolean z;
        boolean z2;
        this.j = c2872Ep2.o(OL1.m.d6, this.j);
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            int o2 = c2872Ep2.o(OL1.m.m6, -1);
            this.k = o2;
            if (o2 != -1) {
                this.j &= 2;
            }
        }
        int i2 = OL1.m.l6;
        boolean z3 = true;
        if (!c2872Ep2.C(i2) && !c2872Ep2.C(OL1.m.n6)) {
            int i3 = OL1.m.c6;
            if (c2872Ep2.C(i3)) {
                this.m = false;
                int o3 = c2872Ep2.o(i3, 1);
                if (o3 != 1) {
                    if (o3 != 2) {
                        if (o3 == 3) {
                            this.l = Typeface.MONOSPACE;
                            return;
                        }
                        return;
                    }
                    this.l = Typeface.SERIF;
                    return;
                }
                this.l = Typeface.SANS_SERIF;
                return;
            }
            return;
        }
        this.l = null;
        int i4 = OL1.m.n6;
        if (c2872Ep2.C(i4)) {
            i2 = i4;
        }
        int i5 = this.k;
        int i6 = this.j;
        if (!context.isRestricted()) {
            try {
                Typeface k = c2872Ep2.k(i2, this.j, new a(i5, i6, new WeakReference(this.a)));
                if (k != null) {
                    if (i >= 28 && this.k != -1) {
                        Typeface create = Typeface.create(k, 0);
                        int i7 = this.k;
                        if ((this.j & 2) != 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        this.l = f.a(create, i7, z2);
                    } else {
                        this.l = k;
                    }
                }
                if (this.l == null) {
                    z = true;
                } else {
                    z = false;
                }
                this.m = z;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (this.l == null && (w = c2872Ep2.w(i2)) != null) {
            if (Build.VERSION.SDK_INT >= 28 && this.k != -1) {
                Typeface create2 = Typeface.create(w, 0);
                int i8 = this.k;
                if ((this.j & 2) == 0) {
                    z3 = false;
                }
                this.l = f.a(create2, i8, z3);
                return;
            }
            this.l = Typeface.create(w, this.j);
        }
    }

    public final void a(Drawable drawable, C2676Cp2 c2676Cp2) {
        if (drawable != null && c2676Cp2 != null) {
            C9038qc.j(drawable, c2676Cp2, this.a.getDrawableState());
        }
    }

    public void b() {
        if (this.b != null || this.c != null || this.d != null || this.e != null) {
            Drawable[] compoundDrawables = this.a.getCompoundDrawables();
            a(compoundDrawables[0], this.b);
            a(compoundDrawables[1], this.c);
            a(compoundDrawables[2], this.d);
            a(compoundDrawables[3], this.e);
        }
        if (this.f == null && this.g == null) {
            return;
        }
        Drawable[] compoundDrawablesRelative = this.a.getCompoundDrawablesRelative();
        a(compoundDrawablesRelative[0], this.f);
        a(compoundDrawablesRelative[2], this.g);
    }

    public void c() {
        this.i.a();
    }

    public int e() {
        return this.i.f();
    }

    public int f() {
        return this.i.g();
    }

    public int g() {
        return this.i.h();
    }

    public int[] h() {
        return this.i.i();
    }

    public int i() {
        return this.i.j();
    }

    public ColorStateList j() {
        C2676Cp2 c2676Cp2 = this.h;
        if (c2676Cp2 != null) {
            return c2676Cp2.a;
        }
        return null;
    }

    public PorterDuff.Mode k() {
        C2676Cp2 c2676Cp2 = this.h;
        if (c2676Cp2 != null) {
            return c2676Cp2.b;
        }
        return null;
    }

    public boolean l() {
        return this.i.n();
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:134:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01ea  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m(AttributeSet attributeSet, int i) {
        boolean z;
        boolean z2;
        String str;
        String str2;
        boolean z3;
        int i2;
        int i3;
        Typeface typeface;
        C2872Ep2 F;
        int u;
        Drawable drawable;
        int u2;
        Drawable drawable2;
        int u3;
        Drawable drawable3;
        int u4;
        Drawable drawable4;
        int u5;
        Drawable drawable5;
        int u6;
        Drawable drawable6;
        int i4;
        int i5;
        int g;
        int g2;
        int i6;
        int i7;
        float f2;
        int[] i8;
        int i9;
        int i10;
        Context context = this.a.getContext();
        C9038qc b2 = C9038qc.b();
        int[] iArr = OL1.m.n0;
        C2872Ep2 G = C2872Ep2.G(context, attributeSet, iArr, i, 0);
        TextView textView = this.a;
        C6516gH2.G1(textView, textView.getContext(), iArr, attributeSet, G.B(), i, 0);
        int u7 = G.u(OL1.m.o0, -1);
        int i11 = OL1.m.r0;
        if (G.C(i11)) {
            this.b = d(context, b2, G.u(i11, 0));
        }
        int i12 = OL1.m.p0;
        if (G.C(i12)) {
            this.c = d(context, b2, G.u(i12, 0));
        }
        int i13 = OL1.m.s0;
        if (G.C(i13)) {
            this.d = d(context, b2, G.u(i13, 0));
        }
        int i14 = OL1.m.q0;
        if (G.C(i14)) {
            this.e = d(context, b2, G.u(i14, 0));
        }
        int i15 = OL1.m.t0;
        if (G.C(i15)) {
            this.f = d(context, b2, G.u(i15, 0));
        }
        int i16 = OL1.m.u0;
        if (G.C(i16)) {
            this.g = d(context, b2, G.u(i16, 0));
        }
        G.I();
        boolean z4 = this.a.getTransformationMethod() instanceof PasswordTransformationMethod;
        if (u7 != -1) {
            C2872Ep2 E = C2872Ep2.E(context, u7, OL1.m.a6);
            if (!z4) {
                int i17 = OL1.m.p6;
                if (E.C(i17)) {
                    z = E.a(i17, false);
                    z2 = true;
                    C(context, E);
                    i9 = Build.VERSION.SDK_INT;
                    i10 = OL1.m.q6;
                    if (!E.C(i10)) {
                        str2 = E.w(i10);
                    } else {
                        str2 = null;
                    }
                    if (i9 >= 26) {
                        int i18 = OL1.m.o6;
                        if (E.C(i18)) {
                            str = E.w(i18);
                            E.I();
                        }
                    }
                    str = null;
                    E.I();
                }
            }
            z = false;
            z2 = false;
            C(context, E);
            i9 = Build.VERSION.SDK_INT;
            i10 = OL1.m.q6;
            if (!E.C(i10)) {
            }
            if (i9 >= 26) {
            }
            str = null;
            E.I();
        } else {
            z = false;
            z2 = false;
            str = null;
            str2 = null;
        }
        C2872Ep2 G2 = C2872Ep2.G(context, attributeSet, OL1.m.a6, i, 0);
        if (!z4) {
            int i19 = OL1.m.p6;
            if (G2.C(i19)) {
                z = G2.a(i19, false);
                z3 = true;
                i2 = Build.VERSION.SDK_INT;
                i3 = OL1.m.q6;
                if (G2.C(i3)) {
                    str2 = G2.w(i3);
                }
                if (i2 >= 26) {
                    int i20 = OL1.m.o6;
                    if (G2.C(i20)) {
                        str = G2.w(i20);
                    }
                }
                if (i2 >= 28) {
                    int i21 = OL1.m.b6;
                    if (G2.C(i21) && G2.g(i21, -1) == 0) {
                        this.a.setTextSize(0, 0.0f);
                    }
                }
                C(context, G2);
                G2.I();
                if (!z4 && z3) {
                    s(z);
                }
                typeface = this.l;
                if (typeface != null) {
                    if (this.k == -1) {
                        this.a.setTypeface(typeface, this.j);
                    } else {
                        this.a.setTypeface(typeface);
                    }
                }
                if (str != null) {
                    e.d(this.a, str);
                }
                if (str2 != null) {
                    d.b(this.a, d.a(str2));
                }
                this.i.o(attributeSet, i);
                if (C11163zI2.d && this.i.j() != 0) {
                    i8 = this.i.i();
                    if (i8.length > 0) {
                        if (e.a(this.a) != -1.0f) {
                            e.b(this.a, this.i.g(), this.i.f(), this.i.h(), 0);
                        } else {
                            e.c(this.a, i8, 0);
                        }
                    }
                }
                F = C2872Ep2.F(context, attributeSet, OL1.m.v0);
                u = F.u(OL1.m.E0, -1);
                if (u == -1) {
                    drawable = b2.c(context, u);
                } else {
                    drawable = null;
                }
                u2 = F.u(OL1.m.J0, -1);
                if (u2 == -1) {
                    drawable2 = b2.c(context, u2);
                } else {
                    drawable2 = null;
                }
                u3 = F.u(OL1.m.F0, -1);
                if (u3 == -1) {
                    drawable3 = b2.c(context, u3);
                } else {
                    drawable3 = null;
                }
                u4 = F.u(OL1.m.C0, -1);
                if (u4 == -1) {
                    drawable4 = b2.c(context, u4);
                } else {
                    drawable4 = null;
                }
                u5 = F.u(OL1.m.G0, -1);
                if (u5 == -1) {
                    drawable5 = b2.c(context, u5);
                } else {
                    drawable5 = null;
                }
                u6 = F.u(OL1.m.D0, -1);
                if (u6 == -1) {
                    drawable6 = b2.c(context, u6);
                } else {
                    drawable6 = null;
                }
                y(drawable, drawable2, drawable3, drawable4, drawable5, drawable6);
                i4 = OL1.m.H0;
                if (F.C(i4)) {
                    C4930Zm2.s(this.a, F.d(i4));
                }
                i5 = OL1.m.I0;
                if (F.C(i5)) {
                    C4930Zm2.t(this.a, X60.e(F.o(i5, -1), null));
                }
                g = F.g(OL1.m.L0, -1);
                g2 = F.g(OL1.m.O0, -1);
                i6 = OL1.m.P0;
                if (!F.C(i6)) {
                    TypedValue H = F.H(i6);
                    if (H != null && H.type == 5) {
                        i7 = C7887lw2.c(H.data);
                        f2 = TypedValue.complexToFloat(H.data);
                    } else {
                        f2 = F.g(i6, -1);
                        i7 = -1;
                    }
                } else {
                    i7 = -1;
                    f2 = -1.0f;
                }
                F.I();
                if (g != -1) {
                    C4930Zm2.y(this.a, g);
                }
                if (g2 != -1) {
                    C4930Zm2.z(this.a, g2);
                }
                if (f2 == -1.0f) {
                    if (i7 == -1) {
                        C4930Zm2.A(this.a, (int) f2);
                        return;
                    } else {
                        C4930Zm2.B(this.a, i7, f2);
                        return;
                    }
                }
                return;
            }
        }
        z3 = z2;
        i2 = Build.VERSION.SDK_INT;
        i3 = OL1.m.q6;
        if (G2.C(i3)) {
        }
        if (i2 >= 26) {
        }
        if (i2 >= 28) {
        }
        C(context, G2);
        G2.I();
        if (!z4) {
            s(z);
        }
        typeface = this.l;
        if (typeface != null) {
        }
        if (str != null) {
        }
        if (str2 != null) {
        }
        this.i.o(attributeSet, i);
        if (C11163zI2.d) {
            i8 = this.i.i();
            if (i8.length > 0) {
            }
        }
        F = C2872Ep2.F(context, attributeSet, OL1.m.v0);
        u = F.u(OL1.m.E0, -1);
        if (u == -1) {
        }
        u2 = F.u(OL1.m.J0, -1);
        if (u2 == -1) {
        }
        u3 = F.u(OL1.m.F0, -1);
        if (u3 == -1) {
        }
        u4 = F.u(OL1.m.C0, -1);
        if (u4 == -1) {
        }
        u5 = F.u(OL1.m.G0, -1);
        if (u5 == -1) {
        }
        u6 = F.u(OL1.m.D0, -1);
        if (u6 == -1) {
        }
        y(drawable, drawable2, drawable3, drawable4, drawable5, drawable6);
        i4 = OL1.m.H0;
        if (F.C(i4)) {
        }
        i5 = OL1.m.I0;
        if (F.C(i5)) {
        }
        g = F.g(OL1.m.L0, -1);
        g2 = F.g(OL1.m.O0, -1);
        i6 = OL1.m.P0;
        if (!F.C(i6)) {
        }
        F.I();
        if (g != -1) {
        }
        if (g2 != -1) {
        }
        if (f2 == -1.0f) {
        }
    }

    public void n(WeakReference<TextView> weakReference, Typeface typeface) {
        if (this.m) {
            this.l = typeface;
            TextView textView = weakReference.get();
            if (textView != null) {
                if (textView.isAttachedToWindow()) {
                    textView.post(new b(textView, typeface, this.j));
                } else {
                    textView.setTypeface(typeface, this.j);
                }
            }
        }
    }

    public void o(boolean z, int i, int i2, int i3, int i4) {
        if (!C11163zI2.d) {
            c();
        }
    }

    public void p() {
        b();
    }

    public void q(Context context, int i) {
        String w;
        C2872Ep2 E = C2872Ep2.E(context, i, OL1.m.a6);
        int i2 = OL1.m.p6;
        if (E.C(i2)) {
            s(E.a(i2, false));
        }
        int i3 = Build.VERSION.SDK_INT;
        int i4 = OL1.m.b6;
        if (E.C(i4) && E.g(i4, -1) == 0) {
            this.a.setTextSize(0, 0.0f);
        }
        C(context, E);
        if (i3 >= 26) {
            int i5 = OL1.m.o6;
            if (E.C(i5) && (w = E.w(i5)) != null) {
                e.d(this.a, w);
            }
        }
        E.I();
        Typeface typeface = this.l;
        if (typeface != null) {
            this.a.setTypeface(typeface, this.j);
        }
    }

    public void r(TextView textView, InputConnection inputConnection, EditorInfo editorInfo) {
        if (Build.VERSION.SDK_INT < 30 && inputConnection != null) {
            N90.k(editorInfo, textView.getText());
        }
    }

    public void s(boolean z) {
        this.a.setAllCaps(z);
    }

    public void t(int i, int i2, int i3, int i4) throws IllegalArgumentException {
        this.i.p(i, i2, i3, i4);
    }

    public void u(int[] iArr, int i) throws IllegalArgumentException {
        this.i.q(iArr, i);
    }

    public void v(int i) {
        this.i.r(i);
    }

    public void w(ColorStateList colorStateList) {
        boolean z;
        if (this.h == null) {
            this.h = new C2676Cp2();
        }
        C2676Cp2 c2676Cp2 = this.h;
        c2676Cp2.a = colorStateList;
        if (colorStateList != null) {
            z = true;
        } else {
            z = false;
        }
        c2676Cp2.d = z;
        z();
    }

    public void x(PorterDuff.Mode mode) {
        boolean z;
        if (this.h == null) {
            this.h = new C2676Cp2();
        }
        C2676Cp2 c2676Cp2 = this.h;
        c2676Cp2.b = mode;
        if (mode != null) {
            z = true;
        } else {
            z = false;
        }
        c2676Cp2.c = z;
        z();
    }

    public final void y(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4, Drawable drawable5, Drawable drawable6) {
        if (drawable5 == null && drawable6 == null) {
            if (drawable == null && drawable2 == null && drawable3 == null && drawable4 == null) {
                return;
            }
            Drawable[] compoundDrawablesRelative = this.a.getCompoundDrawablesRelative();
            Drawable drawable7 = compoundDrawablesRelative[0];
            if (drawable7 == null && compoundDrawablesRelative[2] == null) {
                Drawable[] compoundDrawables = this.a.getCompoundDrawables();
                TextView textView = this.a;
                if (drawable == null) {
                    drawable = compoundDrawables[0];
                }
                if (drawable2 == null) {
                    drawable2 = compoundDrawables[1];
                }
                if (drawable3 == null) {
                    drawable3 = compoundDrawables[2];
                }
                if (drawable4 == null) {
                    drawable4 = compoundDrawables[3];
                }
                textView.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
                return;
            }
            if (drawable2 == null) {
                drawable2 = compoundDrawablesRelative[1];
            }
            if (drawable4 == null) {
                drawable4 = compoundDrawablesRelative[3];
            }
            this.a.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable7, drawable2, compoundDrawablesRelative[2], drawable4);
            return;
        }
        Drawable[] compoundDrawablesRelative2 = this.a.getCompoundDrawablesRelative();
        if (drawable5 == null) {
            drawable5 = compoundDrawablesRelative2[0];
        }
        if (drawable2 == null) {
            drawable2 = compoundDrawablesRelative2[1];
        }
        if (drawable6 == null) {
            drawable6 = compoundDrawablesRelative2[2];
        }
        TextView textView2 = this.a;
        if (drawable4 == null) {
            drawable4 = compoundDrawablesRelative2[3];
        }
        textView2.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable5, drawable2, drawable6, drawable4);
    }

    public final void z() {
        C2676Cp2 c2676Cp2 = this.h;
        this.b = c2676Cp2;
        this.c = c2676Cp2;
        this.d = c2676Cp2;
        this.e = c2676Cp2;
        this.f = c2676Cp2;
        this.g = c2676Cp2;
    }

    /* renamed from: o.Pc$a */
    /* loaded from: classes.dex */
    public class a extends C10231vT1.f {
        public final /* synthetic */ int a;
        public final /* synthetic */ int b;
        public final /* synthetic */ WeakReference c;

        public a(int i, int i2, WeakReference weakReference) {
            this.a = i;
            this.b = i2;
            this.c = weakReference;
        }

        @Override // o.C10231vT1.f
        public void g(Typeface typeface) {
            int i;
            boolean z;
            if (Build.VERSION.SDK_INT >= 28 && (i = this.a) != -1) {
                if ((this.b & 2) != 0) {
                    z = true;
                } else {
                    z = false;
                }
                typeface = f.a(typeface, i, z);
            }
            C3904Pc.this.n(this.c, typeface);
        }

        @Override // o.C10231vT1.f
        public void f(int i) {
        }
    }
}
