package o;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Typeface;
import android.os.Build;
import android.text.TextPaint;
import android.util.Log;
import android.util.Xml;
import o.C10231vT1;
import o.C7025iN1;
import o.HL1;
import o.HT1;
import o.OL1;

@HT1({HT1.a.Y})
/* renamed from: o.qm2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C9081qm2 {
    public static final String t = "TextAppearance";
    public static final int u = 1;
    public static final int v = 2;
    public static final int w = 3;
    @InterfaceC11300zs1
    public final ColorStateList a;
    @InterfaceC11300zs1
    public final ColorStateList b;
    @InterfaceC11300zs1
    public final ColorStateList c;
    @InterfaceC11300zs1
    public final String d;
    @InterfaceC11300zs1
    public String e;
    public final int f;
    public final int g;
    public final boolean h;
    public final float i;
    public final float j;
    public final float k;
    public final boolean l;
    public final float m;
    @InterfaceC11300zs1
    public ColorStateList n;

    /* renamed from: o  reason: collision with root package name */
    public float f841o;
    @InterfaceC5451bx0
    public final int p;
    public boolean q = false;
    public boolean r = false;
    public Typeface s;

    /* renamed from: o.qm2$a */
    /* loaded from: classes3.dex */
    public class a extends C10231vT1.f {
        public final /* synthetic */ AbstractC9573sm2 a;

        public a(AbstractC9573sm2 abstractC9573sm2) {
            this.a = abstractC9573sm2;
        }

        @Override // o.C10231vT1.f
        public void f(int i) {
            C9081qm2.this.q = true;
            this.a.a(i);
        }

        @Override // o.C10231vT1.f
        public void g(@InterfaceC5670cr1 Typeface typeface) {
            C9081qm2 c9081qm2 = C9081qm2.this;
            c9081qm2.s = Typeface.create(typeface, c9081qm2.f);
            C9081qm2.this.q = true;
            this.a.b(C9081qm2.this.s, false);
        }
    }

    /* renamed from: o.qm2$b */
    /* loaded from: classes3.dex */
    public class b extends AbstractC9573sm2 {
        public final /* synthetic */ Context a;
        public final /* synthetic */ TextPaint b;
        public final /* synthetic */ AbstractC9573sm2 c;

        public b(Context context, TextPaint textPaint, AbstractC9573sm2 abstractC9573sm2) {
            this.a = context;
            this.b = textPaint;
            this.c = abstractC9573sm2;
        }

        @Override // o.AbstractC9573sm2
        public void a(int i) {
            this.c.a(i);
        }

        @Override // o.AbstractC9573sm2
        public void b(@InterfaceC5670cr1 Typeface typeface, boolean z) {
            C9081qm2.this.t(this.a, this.b, typeface);
            this.c.b(typeface, z);
        }
    }

    public C9081qm2(@InterfaceC5670cr1 Context context, @InterfaceC4698Xf2 int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, OL1.m.a6);
        q(obtainStyledAttributes.getDimension(OL1.m.b6, 0.0f));
        p(C4297Tc1.a(context, obtainStyledAttributes, OL1.m.e6));
        this.a = C4297Tc1.a(context, obtainStyledAttributes, OL1.m.f6);
        this.b = C4297Tc1.a(context, obtainStyledAttributes, OL1.m.g6);
        this.f = obtainStyledAttributes.getInt(OL1.m.d6, 0);
        this.g = obtainStyledAttributes.getInt(OL1.m.c6, 1);
        int g = C4297Tc1.g(obtainStyledAttributes, OL1.m.n6, OL1.m.l6);
        this.p = obtainStyledAttributes.getResourceId(g, 0);
        this.d = obtainStyledAttributes.getString(g);
        this.h = obtainStyledAttributes.getBoolean(OL1.m.p6, false);
        this.c = C4297Tc1.a(context, obtainStyledAttributes, OL1.m.h6);
        this.i = obtainStyledAttributes.getFloat(OL1.m.i6, 0.0f);
        this.j = obtainStyledAttributes.getFloat(OL1.m.j6, 0.0f);
        this.k = obtainStyledAttributes.getFloat(OL1.m.k6, 0.0f);
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(i, C7025iN1.o.t7);
        int i2 = C7025iN1.o.u7;
        this.l = obtainStyledAttributes2.hasValue(i2);
        this.m = obtainStyledAttributes2.getFloat(i2, 0.0f);
        if (Build.VERSION.SDK_INT >= 26) {
            this.e = obtainStyledAttributes2.getString(C4297Tc1.g(obtainStyledAttributes2, C7025iN1.o.x7, C7025iN1.o.v7));
        }
        obtainStyledAttributes2.recycle();
    }

    @InterfaceC11300zs1
    @SuppressLint({"ResourceType"})
    public static String n(Context context, @InterfaceC5451bx0 int i) {
        Resources resources = context.getResources();
        if (i != 0 && resources.getResourceTypeName(i).equals(C4317Th1.q)) {
            try {
                XmlResourceParser xml = resources.getXml(i);
                while (xml.getEventType() != 1) {
                    if (xml.getEventType() == 2 && xml.getName().equals(C10196vK2.h)) {
                        TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xml), HL1.j.j);
                        String string = obtainAttributes.getString(HL1.j.r);
                        obtainAttributes.recycle();
                        return string;
                    }
                    xml.next();
                }
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    public final void d() {
        String str;
        if (this.s == null && (str = this.d) != null) {
            this.s = Typeface.create(str, this.f);
        }
        if (this.s == null) {
            int i = this.g;
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        this.s = Typeface.DEFAULT;
                    } else {
                        this.s = Typeface.MONOSPACE;
                    }
                } else {
                    this.s = Typeface.SERIF;
                }
            } else {
                this.s = Typeface.SANS_SERIF;
            }
            this.s = Typeface.create(this.s, this.f);
        }
    }

    public Typeface e() {
        d();
        return this.s;
    }

    @InterfaceC5056aJ2
    @InterfaceC5670cr1
    public Typeface f(@InterfaceC5670cr1 Context context) {
        if (this.q) {
            return this.s;
        }
        if (!context.isRestricted()) {
            try {
                Typeface j = C10231vT1.j(context, this.p);
                this.s = j;
                if (j != null) {
                    this.s = Typeface.create(j, this.f);
                }
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            } catch (Exception e) {
                Log.d(t, "Error loading font " + this.d, e);
            }
        }
        d();
        this.q = true;
        return this.s;
    }

    public void g(@InterfaceC5670cr1 Context context, @InterfaceC5670cr1 TextPaint textPaint, @InterfaceC5670cr1 AbstractC9573sm2 abstractC9573sm2) {
        t(context, textPaint, e());
        h(context, new b(context, textPaint, abstractC9573sm2));
    }

    public void h(@InterfaceC5670cr1 Context context, @InterfaceC5670cr1 AbstractC9573sm2 abstractC9573sm2) {
        if (!m(context)) {
            d();
        }
        int i = this.p;
        if (i == 0) {
            this.q = true;
        }
        if (this.q) {
            abstractC9573sm2.b(this.s, true);
            return;
        }
        try {
            C10231vT1.l(context, i, new a(abstractC9573sm2), null);
        } catch (Resources.NotFoundException unused) {
            this.q = true;
            abstractC9573sm2.a(1);
        } catch (Exception e) {
            Log.d(t, "Error loading font " + this.d, e);
            this.q = true;
            abstractC9573sm2.a(-3);
        }
    }

    @InterfaceC11300zs1
    @ES1(26)
    public String i() {
        return this.e;
    }

    @InterfaceC11300zs1
    public final Typeface j(Context context) {
        Typeface create;
        if (this.r) {
            return null;
        }
        this.r = true;
        String n = n(context, this.p);
        if (n == null || (create = Typeface.create(n, 0)) == Typeface.DEFAULT) {
            return null;
        }
        return Typeface.create(create, this.f);
    }

    @InterfaceC11300zs1
    public ColorStateList k() {
        return this.n;
    }

    public float l() {
        return this.f841o;
    }

    public final boolean m(Context context) {
        if (C9330rm2.b()) {
            f(context);
            return true;
        } else if (this.q) {
            return true;
        } else {
            int i = this.p;
            if (i == 0) {
                return false;
            }
            Typeface d = C10231vT1.d(context, i);
            if (d != null) {
                this.s = d;
                this.q = true;
                return true;
            }
            Typeface j = j(context);
            if (j == null) {
                return false;
            }
            this.s = j;
            this.q = true;
            return true;
        }
    }

    @ES1(26)
    public void o(@InterfaceC11300zs1 String str) {
        this.e = str;
    }

    public void p(@InterfaceC11300zs1 ColorStateList colorStateList) {
        this.n = colorStateList;
    }

    public void q(float f) {
        this.f841o = f;
    }

    public void r(@InterfaceC5670cr1 Context context, @InterfaceC5670cr1 TextPaint textPaint, @InterfaceC5670cr1 AbstractC9573sm2 abstractC9573sm2) {
        int i;
        int i2;
        s(context, textPaint, abstractC9573sm2);
        ColorStateList colorStateList = this.n;
        if (colorStateList != null) {
            i = colorStateList.getColorForState(textPaint.drawableState, colorStateList.getDefaultColor());
        } else {
            i = -16777216;
        }
        textPaint.setColor(i);
        float f = this.k;
        float f2 = this.i;
        float f3 = this.j;
        ColorStateList colorStateList2 = this.c;
        if (colorStateList2 != null) {
            i2 = colorStateList2.getColorForState(textPaint.drawableState, colorStateList2.getDefaultColor());
        } else {
            i2 = 0;
        }
        textPaint.setShadowLayer(f, f2, f3, i2);
    }

    public void s(@InterfaceC5670cr1 Context context, @InterfaceC5670cr1 TextPaint textPaint, @InterfaceC5670cr1 AbstractC9573sm2 abstractC9573sm2) {
        Typeface typeface;
        if (m(context) && this.q && (typeface = this.s) != null) {
            t(context, textPaint, typeface);
        } else {
            g(context, textPaint, abstractC9573sm2);
        }
    }

    public void t(@InterfaceC5670cr1 Context context, @InterfaceC5670cr1 TextPaint textPaint, @InterfaceC5670cr1 Typeface typeface) {
        boolean z;
        float f;
        Typeface a2 = Dw2.a(context, typeface);
        if (a2 != null) {
            typeface = a2;
        }
        textPaint.setTypeface(typeface);
        int i = this.f & (~typeface.getStyle());
        if ((i & 1) != 0) {
            z = true;
        } else {
            z = false;
        }
        textPaint.setFakeBoldText(z);
        if ((i & 2) != 0) {
            f = -0.25f;
        } else {
            f = 0.0f;
        }
        textPaint.setTextSkewX(f);
        textPaint.setTextSize(this.f841o);
        if (Build.VERSION.SDK_INT >= 26) {
            textPaint.setFontVariationSettings(this.e);
        }
        if (this.l) {
            textPaint.setLetterSpacing(this.m);
        }
    }
}
