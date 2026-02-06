package o;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import o.C7025iN1;
import o.HT1;

/* loaded from: classes3.dex */
public class O22 {
    public static final int m = 4;
    public static final YP n = new YQ1(0.5f);
    public ZP a;
    public ZP b;
    public ZP c;
    public ZP d;
    public YP e;
    public YP f;
    public YP g;
    public YP h;
    public A90 i;
    public A90 j;
    public A90 k;
    public A90 l;

    @HT1({HT1.a.Y})
    /* loaded from: classes3.dex */
    public interface c {
        @InterfaceC5670cr1
        YP a(@InterfaceC5670cr1 YP yp);
    }

    @InterfaceC5670cr1
    public static b a() {
        return new b();
    }

    @InterfaceC5670cr1
    public static b b(Context context, @InterfaceC4698Xf2 int i, @InterfaceC4698Xf2 int i2) {
        return c(context, i, i2, 0);
    }

    @InterfaceC5670cr1
    public static b c(Context context, @InterfaceC4698Xf2 int i, @InterfaceC4698Xf2 int i2, int i3) {
        return d(context, i, i2, new M(i3));
    }

    @InterfaceC5670cr1
    public static b d(Context context, @InterfaceC4698Xf2 int i, @InterfaceC4698Xf2 int i2, @InterfaceC5670cr1 YP yp) {
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i);
        if (i2 != 0) {
            contextThemeWrapper.getTheme().applyStyle(i2, true);
        }
        TypedArray obtainStyledAttributes = contextThemeWrapper.obtainStyledAttributes(C7025iN1.o.Ka);
        try {
            int i3 = obtainStyledAttributes.getInt(C7025iN1.o.La, 0);
            int i4 = obtainStyledAttributes.getInt(C7025iN1.o.Oa, i3);
            int i5 = obtainStyledAttributes.getInt(C7025iN1.o.Pa, i3);
            int i6 = obtainStyledAttributes.getInt(C7025iN1.o.Na, i3);
            int i7 = obtainStyledAttributes.getInt(C7025iN1.o.Ma, i3);
            YP m2 = m(obtainStyledAttributes, C7025iN1.o.Qa, yp);
            YP m3 = m(obtainStyledAttributes, C7025iN1.o.Ta, m2);
            YP m4 = m(obtainStyledAttributes, C7025iN1.o.Ua, m2);
            YP m5 = m(obtainStyledAttributes, C7025iN1.o.Sa, m2);
            return new b().I(i4, m3).N(i5, m4).A(i6, m5).v(i7, m(obtainStyledAttributes, C7025iN1.o.Ra, m2));
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    @InterfaceC5670cr1
    public static b e(@InterfaceC5670cr1 Context context, AttributeSet attributeSet, @InterfaceC8568og int i, @InterfaceC4698Xf2 int i2) {
        return f(context, attributeSet, i, i2, 0);
    }

    @InterfaceC5670cr1
    public static b f(@InterfaceC5670cr1 Context context, AttributeSet attributeSet, @InterfaceC8568og int i, @InterfaceC4698Xf2 int i2, int i3) {
        return g(context, attributeSet, i, i2, new M(i3));
    }

    @InterfaceC5670cr1
    public static b g(@InterfaceC5670cr1 Context context, AttributeSet attributeSet, @InterfaceC8568og int i, @InterfaceC4698Xf2 int i2, @InterfaceC5670cr1 YP yp) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C7025iN1.o.f7, i, i2);
        int resourceId = obtainStyledAttributes.getResourceId(C7025iN1.o.g7, 0);
        int resourceId2 = obtainStyledAttributes.getResourceId(C7025iN1.o.h7, 0);
        obtainStyledAttributes.recycle();
        return d(context, resourceId, resourceId2, yp);
    }

    @HT1({HT1.a.Y})
    @InterfaceC5670cr1
    public static YP m(@InterfaceC5670cr1 TypedArray typedArray, int i, @InterfaceC5670cr1 YP yp) {
        TypedValue peekValue = typedArray.peekValue(i);
        if (peekValue != null) {
            int i2 = peekValue.type;
            if (i2 == 5) {
                return new M(TypedValue.complexToDimensionPixelSize(peekValue.data, typedArray.getResources().getDisplayMetrics()));
            }
            if (i2 == 6) {
                return new YQ1(peekValue.getFraction(1.0f, 1.0f));
            }
        }
        return yp;
    }

    @InterfaceC5670cr1
    public A90 h() {
        return this.k;
    }

    @InterfaceC5670cr1
    public ZP i() {
        return this.d;
    }

    @InterfaceC5670cr1
    public YP j() {
        return this.h;
    }

    @InterfaceC5670cr1
    public ZP k() {
        return this.c;
    }

    @InterfaceC5670cr1
    public YP l() {
        return this.g;
    }

    @InterfaceC5670cr1
    public A90 n() {
        return this.l;
    }

    @InterfaceC5670cr1
    public A90 o() {
        return this.j;
    }

    @InterfaceC5670cr1
    public A90 p() {
        return this.i;
    }

    @InterfaceC5670cr1
    public ZP q() {
        return this.a;
    }

    @InterfaceC5670cr1
    public YP r() {
        return this.e;
    }

    @InterfaceC5670cr1
    public ZP s() {
        return this.b;
    }

    @InterfaceC5670cr1
    public YP t() {
        return this.f;
    }

    @InterfaceC5670cr1
    public String toString() {
        return C6566gU0.f + r() + C6566gU0.h + t() + C6566gU0.h + l() + C6566gU0.h + j() + C6566gU0.g;
    }

    @HT1({HT1.a.Y})
    public boolean u() {
        if ((this.b instanceof C7540kV1) && (this.a instanceof C7540kV1) && (this.c instanceof C7540kV1) && (this.d instanceof C7540kV1)) {
            return true;
        }
        return false;
    }

    @HT1({HT1.a.Y})
    public boolean v(@InterfaceC5670cr1 RectF rectF) {
        boolean z;
        boolean z2;
        if (this.l.getClass().equals(A90.class) && this.j.getClass().equals(A90.class) && this.i.getClass().equals(A90.class) && this.k.getClass().equals(A90.class)) {
            z = true;
        } else {
            z = false;
        }
        float a2 = this.e.a(rectF);
        if (this.f.a(rectF) == a2 && this.h.a(rectF) == a2 && this.g.a(rectF) == a2) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z || !z2 || !u()) {
            return false;
        }
        return true;
    }

    @InterfaceC5670cr1
    public b w() {
        return new b(this);
    }

    @InterfaceC5670cr1
    public O22 x(float f) {
        return w().o(f).m();
    }

    @InterfaceC5670cr1
    public O22 y(@InterfaceC5670cr1 YP yp) {
        return w().p(yp).m();
    }

    @HT1({HT1.a.Y})
    @InterfaceC5670cr1
    public O22 z(@InterfaceC5670cr1 c cVar) {
        return w().L(cVar.a(r())).Q(cVar.a(t())).y(cVar.a(j())).D(cVar.a(l())).m();
    }

    public O22(@InterfaceC5670cr1 b bVar) {
        this.a = bVar.a;
        this.b = bVar.b;
        this.c = bVar.c;
        this.d = bVar.d;
        this.e = bVar.e;
        this.f = bVar.f;
        this.g = bVar.g;
        this.h = bVar.h;
        this.i = bVar.i;
        this.j = bVar.j;
        this.k = bVar.k;
        this.l = bVar.l;
    }

    /* loaded from: classes3.dex */
    public static final class b {
        @InterfaceC5670cr1
        public ZP a;
        @InterfaceC5670cr1
        public ZP b;
        @InterfaceC5670cr1
        public ZP c;
        @InterfaceC5670cr1
        public ZP d;
        @InterfaceC5670cr1
        public YP e;
        @InterfaceC5670cr1
        public YP f;
        @InterfaceC5670cr1
        public YP g;
        @InterfaceC5670cr1
        public YP h;
        @InterfaceC5670cr1
        public A90 i;
        @InterfaceC5670cr1
        public A90 j;
        @InterfaceC5670cr1
        public A90 k;
        @InterfaceC5670cr1
        public A90 l;

        public b() {
            this.a = C4491Vc1.b();
            this.b = C4491Vc1.b();
            this.c = C4491Vc1.b();
            this.d = C4491Vc1.b();
            this.e = new M(0.0f);
            this.f = new M(0.0f);
            this.g = new M(0.0f);
            this.h = new M(0.0f);
            this.i = C4491Vc1.c();
            this.j = C4491Vc1.c();
            this.k = C4491Vc1.c();
            this.l = C4491Vc1.c();
        }

        public static float n(ZP zp) {
            if (zp instanceof C7540kV1) {
                return ((C7540kV1) zp).a;
            }
            if (zp instanceof QT) {
                return ((QT) zp).a;
            }
            return -1.0f;
        }

        @InterfaceC6181ey
        @InterfaceC5670cr1
        public b A(int i, @InterfaceC5670cr1 YP yp) {
            return B(C4491Vc1.a(i)).D(yp);
        }

        @InterfaceC6181ey
        @InterfaceC5670cr1
        public b B(@InterfaceC5670cr1 ZP zp) {
            this.c = zp;
            float n = n(zp);
            if (n != -1.0f) {
                C(n);
            }
            return this;
        }

        @InterfaceC6181ey
        @InterfaceC5670cr1
        public b C(@InterfaceC9397s30 float f) {
            this.g = new M(f);
            return this;
        }

        @InterfaceC6181ey
        @InterfaceC5670cr1
        public b D(@InterfaceC5670cr1 YP yp) {
            this.g = yp;
            return this;
        }

        @InterfaceC6181ey
        @InterfaceC5670cr1
        public b E(@InterfaceC5670cr1 A90 a90) {
            this.l = a90;
            return this;
        }

        @InterfaceC6181ey
        @InterfaceC5670cr1
        public b F(@InterfaceC5670cr1 A90 a90) {
            this.j = a90;
            return this;
        }

        @InterfaceC6181ey
        @InterfaceC5670cr1
        public b G(@InterfaceC5670cr1 A90 a90) {
            this.i = a90;
            return this;
        }

        @InterfaceC6181ey
        @InterfaceC5670cr1
        public b H(int i, @InterfaceC9397s30 float f) {
            return J(C4491Vc1.a(i)).K(f);
        }

        @InterfaceC6181ey
        @InterfaceC5670cr1
        public b I(int i, @InterfaceC5670cr1 YP yp) {
            return J(C4491Vc1.a(i)).L(yp);
        }

        @InterfaceC6181ey
        @InterfaceC5670cr1
        public b J(@InterfaceC5670cr1 ZP zp) {
            this.a = zp;
            float n = n(zp);
            if (n != -1.0f) {
                K(n);
            }
            return this;
        }

        @InterfaceC6181ey
        @InterfaceC5670cr1
        public b K(@InterfaceC9397s30 float f) {
            this.e = new M(f);
            return this;
        }

        @InterfaceC6181ey
        @InterfaceC5670cr1
        public b L(@InterfaceC5670cr1 YP yp) {
            this.e = yp;
            return this;
        }

        @InterfaceC6181ey
        @InterfaceC5670cr1
        public b M(int i, @InterfaceC9397s30 float f) {
            return O(C4491Vc1.a(i)).P(f);
        }

        @InterfaceC6181ey
        @InterfaceC5670cr1
        public b N(int i, @InterfaceC5670cr1 YP yp) {
            return O(C4491Vc1.a(i)).Q(yp);
        }

        @InterfaceC6181ey
        @InterfaceC5670cr1
        public b O(@InterfaceC5670cr1 ZP zp) {
            this.b = zp;
            float n = n(zp);
            if (n != -1.0f) {
                P(n);
            }
            return this;
        }

        @InterfaceC6181ey
        @InterfaceC5670cr1
        public b P(@InterfaceC9397s30 float f) {
            this.f = new M(f);
            return this;
        }

        @InterfaceC6181ey
        @InterfaceC5670cr1
        public b Q(@InterfaceC5670cr1 YP yp) {
            this.f = yp;
            return this;
        }

        @InterfaceC5670cr1
        public O22 m() {
            return new O22(this);
        }

        @InterfaceC6181ey
        @InterfaceC5670cr1
        public b o(@InterfaceC9397s30 float f) {
            return K(f).P(f).C(f).x(f);
        }

        @InterfaceC6181ey
        @InterfaceC5670cr1
        public b p(@InterfaceC5670cr1 YP yp) {
            return L(yp).Q(yp).D(yp).y(yp);
        }

        @InterfaceC6181ey
        @InterfaceC5670cr1
        public b q(int i, @InterfaceC9397s30 float f) {
            return r(C4491Vc1.a(i)).o(f);
        }

        @InterfaceC6181ey
        @InterfaceC5670cr1
        public b r(@InterfaceC5670cr1 ZP zp) {
            return J(zp).O(zp).B(zp).w(zp);
        }

        @InterfaceC6181ey
        @InterfaceC5670cr1
        public b s(@InterfaceC5670cr1 A90 a90) {
            return E(a90).G(a90).F(a90).t(a90);
        }

        @InterfaceC6181ey
        @InterfaceC5670cr1
        public b t(@InterfaceC5670cr1 A90 a90) {
            this.k = a90;
            return this;
        }

        @InterfaceC6181ey
        @InterfaceC5670cr1
        public b u(int i, @InterfaceC9397s30 float f) {
            return w(C4491Vc1.a(i)).x(f);
        }

        @InterfaceC6181ey
        @InterfaceC5670cr1
        public b v(int i, @InterfaceC5670cr1 YP yp) {
            return w(C4491Vc1.a(i)).y(yp);
        }

        @InterfaceC6181ey
        @InterfaceC5670cr1
        public b w(@InterfaceC5670cr1 ZP zp) {
            this.d = zp;
            float n = n(zp);
            if (n != -1.0f) {
                x(n);
            }
            return this;
        }

        @InterfaceC6181ey
        @InterfaceC5670cr1
        public b x(@InterfaceC9397s30 float f) {
            this.h = new M(f);
            return this;
        }

        @InterfaceC6181ey
        @InterfaceC5670cr1
        public b y(@InterfaceC5670cr1 YP yp) {
            this.h = yp;
            return this;
        }

        @InterfaceC6181ey
        @InterfaceC5670cr1
        public b z(int i, @InterfaceC9397s30 float f) {
            return B(C4491Vc1.a(i)).C(f);
        }

        public b(@InterfaceC5670cr1 O22 o22) {
            this.a = C4491Vc1.b();
            this.b = C4491Vc1.b();
            this.c = C4491Vc1.b();
            this.d = C4491Vc1.b();
            this.e = new M(0.0f);
            this.f = new M(0.0f);
            this.g = new M(0.0f);
            this.h = new M(0.0f);
            this.i = C4491Vc1.c();
            this.j = C4491Vc1.c();
            this.k = C4491Vc1.c();
            this.l = C4491Vc1.c();
            this.a = o22.a;
            this.b = o22.b;
            this.c = o22.c;
            this.d = o22.d;
            this.e = o22.e;
            this.f = o22.f;
            this.g = o22.g;
            this.h = o22.h;
            this.i = o22.i;
            this.j = o22.j;
            this.k = o22.k;
            this.l = o22.l;
        }
    }

    public O22() {
        this.a = C4491Vc1.b();
        this.b = C4491Vc1.b();
        this.c = C4491Vc1.b();
        this.d = C4491Vc1.b();
        this.e = new M(0.0f);
        this.f = new M(0.0f);
        this.g = new M(0.0f);
        this.h = new M(0.0f);
        this.i = C4491Vc1.c();
        this.j = C4491Vc1.c();
        this.k = C4491Vc1.c();
        this.l = C4491Vc1.c();
    }
}
