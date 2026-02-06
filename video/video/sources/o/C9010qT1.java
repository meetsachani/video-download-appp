package o;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import o.CH;
import o.ZL1;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: o.qT1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9010qT1 {
    public static final String h = "ResourceManagerInternal";
    public static final boolean i = false;
    public static final String k = "appcompat_skip_skip";
    public static final String l = "android.graphics.drawable.VectorDrawable";
    public static C9010qT1 m;
    public WeakHashMap<Context, C10986ya2<ColorStateList>> a;
    public C9654t62<String, e> b;
    public C10986ya2<String> c;
    public final WeakHashMap<Context, C5484c51<WeakReference<Drawable.ConstantState>>> d = new WeakHashMap<>(0);
    public TypedValue e;
    public boolean f;
    public f g;
    public static final PorterDuff.Mode j = PorterDuff.Mode.SRC_IN;
    public static final c n = new c(6);

    /* renamed from: o.qT1$a */
    /* loaded from: classes.dex */
    public static class a implements e {
        @Override // o.C9010qT1.e
        public Drawable a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                return S9.C(context, context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e) {
                Log.e("AsldcInflateDelegate", "Exception while inflating <animated-selector>", e);
                return null;
            }
        }
    }

    /* renamed from: o.qT1$b */
    /* loaded from: classes.dex */
    public static class b implements e {
        @Override // o.C9010qT1.e
        public Drawable a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                return T9.e(context, context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e) {
                Log.e("AvdcInflateDelegate", "Exception while inflating <animated-vector>", e);
                return null;
            }
        }
    }

    /* renamed from: o.qT1$c */
    /* loaded from: classes.dex */
    public static class c extends Y61<Integer, PorterDuffColorFilter> {
        public c(int i) {
            super(i);
        }

        public static int s(int i, PorterDuff.Mode mode) {
            return ((i + 31) * 31) + mode.hashCode();
        }

        public PorterDuffColorFilter t(int i, PorterDuff.Mode mode) {
            return f(Integer.valueOf(s(i, mode)));
        }

        public PorterDuffColorFilter u(int i, PorterDuff.Mode mode, PorterDuffColorFilter porterDuffColorFilter) {
            return j(Integer.valueOf(s(i, mode)), porterDuffColorFilter);
        }
    }

    /* renamed from: o.qT1$d */
    /* loaded from: classes.dex */
    public static class d implements e {
        @Override // o.C9010qT1.e
        public Drawable a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            String classAttribute = attributeSet.getClassAttribute();
            if (classAttribute != null) {
                try {
                    Drawable drawable = (Drawable) d.class.getClassLoader().loadClass(classAttribute).asSubclass(Drawable.class).getDeclaredConstructor(null).newInstance(null);
                    CH.a.c(drawable, context.getResources(), xmlPullParser, attributeSet, theme);
                    return drawable;
                } catch (Exception e) {
                    Log.e("DrawableDelegate", "Exception while inflating <drawable>", e);
                }
            }
            return null;
        }
    }

    /* renamed from: o.qT1$e */
    /* loaded from: classes.dex */
    public interface e {
        Drawable a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme);
    }

    /* renamed from: o.qT1$f */
    /* loaded from: classes.dex */
    public interface f {
        Drawable a(C9010qT1 c9010qT1, Context context, int i);

        ColorStateList b(Context context, int i);

        boolean c(Context context, int i, Drawable drawable);

        PorterDuff.Mode d(int i);

        boolean e(Context context, int i, Drawable drawable);
    }

    /* renamed from: o.qT1$g */
    /* loaded from: classes.dex */
    public static class g implements e {
        @Override // o.C9010qT1.e
        public Drawable a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                return ME2.e(context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e) {
                Log.e("VdcInflateDelegate", "Exception while inflating <vector>", e);
                return null;
            }
        }
    }

    public static long e(TypedValue typedValue) {
        return (typedValue.assetCookie << 32) | typedValue.data;
    }

    public static PorterDuffColorFilter g(ColorStateList colorStateList, PorterDuff.Mode mode, int[] iArr) {
        if (colorStateList != null && mode != null) {
            return l(colorStateList.getColorForState(iArr, 0), mode);
        }
        return null;
    }

    public static synchronized C9010qT1 h() {
        C9010qT1 c9010qT1;
        synchronized (C9010qT1.class) {
            try {
                if (m == null) {
                    C9010qT1 c9010qT12 = new C9010qT1();
                    m = c9010qT12;
                    p(c9010qT12);
                }
                c9010qT1 = m;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c9010qT1;
    }

    public static synchronized PorterDuffColorFilter l(int i2, PorterDuff.Mode mode) {
        PorterDuffColorFilter t;
        synchronized (C9010qT1.class) {
            c cVar = n;
            t = cVar.t(i2, mode);
            if (t == null) {
                t = new PorterDuffColorFilter(i2, mode);
                cVar.u(i2, mode, t);
            }
        }
        return t;
    }

    public static boolean q(Drawable drawable) {
        if (!(drawable instanceof ME2) && !l.equals(drawable.getClass().getName())) {
            return false;
        }
        return true;
    }

    public static void w(Drawable drawable, C2676Cp2 c2676Cp2, int[] iArr) {
        ColorStateList colorStateList;
        PorterDuff.Mode mode;
        int[] state = drawable.getState();
        if (drawable.mutate() == drawable) {
            if ((drawable instanceof LayerDrawable) && drawable.isStateful()) {
                drawable.setState(new int[0]);
                drawable.setState(state);
            }
            boolean z = c2676Cp2.d;
            if (!z && !c2676Cp2.c) {
                drawable.clearColorFilter();
                return;
            }
            if (z) {
                colorStateList = c2676Cp2.a;
            } else {
                colorStateList = null;
            }
            if (c2676Cp2.c) {
                mode = c2676Cp2.b;
            } else {
                mode = j;
            }
            drawable.setColorFilter(g(colorStateList, mode, iArr));
            return;
        }
        Log.d(h, "Mutated drawable is not the same instance as the input.");
    }

    public final void a(String str, e eVar) {
        if (this.b == null) {
            this.b = new C9654t62<>();
        }
        this.b.put(str, eVar);
    }

    public final synchronized boolean b(Context context, long j2, Drawable drawable) {
        try {
            Drawable.ConstantState constantState = drawable.getConstantState();
            if (constantState != null) {
                C5484c51<WeakReference<Drawable.ConstantState>> c5484c51 = this.d.get(context);
                if (c5484c51 == null) {
                    c5484c51 = new C5484c51<>();
                    this.d.put(context, c5484c51);
                }
                c5484c51.n(j2, new WeakReference<>(constantState));
                return true;
            }
            return false;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void c(Context context, int i2, ColorStateList colorStateList) {
        if (this.a == null) {
            this.a = new WeakHashMap<>();
        }
        C10986ya2<ColorStateList> c10986ya2 = this.a.get(context);
        if (c10986ya2 == null) {
            c10986ya2 = new C10986ya2<>();
            this.a.put(context, c10986ya2);
        }
        c10986ya2.b(i2, colorStateList);
    }

    public final void d(Context context) {
        if (!this.f) {
            this.f = true;
            Drawable j2 = j(context, ZL1.a.a);
            if (j2 != null && q(j2)) {
                return;
            }
            this.f = false;
            throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
        }
    }

    public final Drawable f(Context context, int i2) {
        Drawable a2;
        if (this.e == null) {
            this.e = new TypedValue();
        }
        TypedValue typedValue = this.e;
        context.getResources().getValue(i2, typedValue, true);
        long e2 = e(typedValue);
        Drawable i3 = i(context, e2);
        if (i3 != null) {
            return i3;
        }
        f fVar = this.g;
        if (fVar == null) {
            a2 = null;
        } else {
            a2 = fVar.a(this, context, i2);
        }
        if (a2 != null) {
            a2.setChangingConfigurations(typedValue.changingConfigurations);
            b(context, e2, a2);
        }
        return a2;
    }

    public final synchronized Drawable i(Context context, long j2) {
        C5484c51<WeakReference<Drawable.ConstantState>> c5484c51 = this.d.get(context);
        if (c5484c51 == null) {
            return null;
        }
        WeakReference<Drawable.ConstantState> h2 = c5484c51.h(j2);
        if (h2 != null) {
            Drawable.ConstantState constantState = h2.get();
            if (constantState != null) {
                return constantState.newDrawable(context.getResources());
            }
            c5484c51.q(j2);
        }
        return null;
    }

    public synchronized Drawable j(Context context, int i2) {
        return k(context, i2, false);
    }

    public synchronized Drawable k(Context context, int i2, boolean z) {
        Drawable r;
        try {
            d(context);
            r = r(context, i2);
            if (r == null) {
                r = f(context, i2);
            }
            if (r == null) {
                r = C10201vM.l(context, i2);
            }
            if (r != null) {
                r = v(context, i2, z, r);
            }
            if (r != null) {
                X60.b(r);
            }
        } catch (Throwable th) {
            throw th;
        }
        return r;
    }

    public synchronized ColorStateList m(Context context, int i2) {
        ColorStateList n2;
        n2 = n(context, i2);
        if (n2 == null) {
            f fVar = this.g;
            if (fVar == null) {
                n2 = null;
            } else {
                n2 = fVar.b(context, i2);
            }
            if (n2 != null) {
                c(context, i2, n2);
            }
        }
        return n2;
    }

    public final ColorStateList n(Context context, int i2) {
        C10986ya2<ColorStateList> c10986ya2;
        WeakHashMap<Context, C10986ya2<ColorStateList>> weakHashMap = this.a;
        if (weakHashMap == null || (c10986ya2 = weakHashMap.get(context)) == null) {
            return null;
        }
        return c10986ya2.h(i2);
    }

    public PorterDuff.Mode o(int i2) {
        f fVar = this.g;
        if (fVar == null) {
            return null;
        }
        return fVar.d(i2);
    }

    public final Drawable r(Context context, int i2) {
        int next;
        C9654t62<String, e> c9654t62 = this.b;
        if (c9654t62 == null || c9654t62.isEmpty()) {
            return null;
        }
        C10986ya2<String> c10986ya2 = this.c;
        if (c10986ya2 != null) {
            String h2 = c10986ya2.h(i2);
            if (k.equals(h2) || (h2 != null && this.b.get(h2) == null)) {
                return null;
            }
        } else {
            this.c = new C10986ya2<>();
        }
        if (this.e == null) {
            this.e = new TypedValue();
        }
        TypedValue typedValue = this.e;
        Resources resources = context.getResources();
        resources.getValue(i2, typedValue, true);
        long e2 = e(typedValue);
        Drawable i3 = i(context, e2);
        if (i3 != null) {
            return i3;
        }
        CharSequence charSequence = typedValue.string;
        if (charSequence != null && charSequence.toString().endsWith(androidx.appcompat.widget.b.y)) {
            try {
                XmlResourceParser xml = resources.getXml(i2);
                AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
                while (true) {
                    next = xml.next();
                    if (next == 2 || next == 1) {
                        break;
                    }
                }
                if (next == 2) {
                    String name = xml.getName();
                    this.c.b(i2, name);
                    e eVar = this.b.get(name);
                    if (eVar != null) {
                        i3 = eVar.a(context, xml, asAttributeSet, context.getTheme());
                    }
                    if (i3 != null) {
                        i3.setChangingConfigurations(typedValue.changingConfigurations);
                        b(context, e2, i3);
                    }
                } else {
                    throw new XmlPullParserException("No start tag found");
                }
            } catch (Exception e3) {
                Log.e(h, "Exception while inflating drawable", e3);
            }
        }
        if (i3 == null) {
            this.c.b(i2, k);
        }
        return i3;
    }

    public synchronized void s(Context context) {
        C5484c51<WeakReference<Drawable.ConstantState>> c5484c51 = this.d.get(context);
        if (c5484c51 != null) {
            c5484c51.c();
        }
    }

    public synchronized Drawable t(Context context, NE2 ne2, int i2) {
        try {
            Drawable r = r(context, i2);
            if (r == null) {
                r = ne2.a(i2);
            }
            if (r != null) {
                return v(context, i2, false, r);
            }
            return null;
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void u(f fVar) {
        this.g = fVar;
    }

    public final Drawable v(Context context, int i2, boolean z, Drawable drawable) {
        ColorStateList m2 = m(context, i2);
        if (m2 != null) {
            Drawable r = D60.r(drawable.mutate());
            D60.o(r, m2);
            PorterDuff.Mode o2 = o(i2);
            if (o2 != null) {
                D60.p(r, o2);
            }
            return r;
        }
        f fVar = this.g;
        if ((fVar == null || !fVar.e(context, i2, drawable)) && !x(context, i2, drawable) && z) {
            return null;
        }
        return drawable;
    }

    public boolean x(Context context, int i2, Drawable drawable) {
        f fVar = this.g;
        if (fVar != null && fVar.c(context, i2, drawable)) {
            return true;
        }
        return false;
    }

    public static void p(C9010qT1 c9010qT1) {
    }
}
