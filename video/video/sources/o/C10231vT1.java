package o;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.WeakHashMap;
import o.C10231vT1;
import o.C5693cx0;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: o.vT1 */
/* loaded from: classes.dex */
public final class C10231vT1 {
    public static final String a = "ResourcesCompat";
    public static final ThreadLocal<TypedValue> b = new ThreadLocal<>();
    public static final WeakHashMap<e, SparseArray<d>> c = new WeakHashMap<>(0);
    public static final Object d = new Object();
    public static final int e = 0;

    /* renamed from: o.vT1$a */
    /* loaded from: classes.dex */
    public static class a {
        public static Drawable a(Resources resources, int i, Resources.Theme theme) {
            return resources.getDrawable(i, theme);
        }

        public static Drawable b(Resources resources, int i, int i2, Resources.Theme theme) {
            return resources.getDrawableForDensity(i, i2, theme);
        }
    }

    /* renamed from: o.vT1$b */
    /* loaded from: classes.dex */
    public static class b {
        public static int a(Resources resources, int i, Resources.Theme theme) {
            return resources.getColor(i, theme);
        }

        public static ColorStateList b(Resources resources, int i, Resources.Theme theme) {
            return resources.getColorStateList(i, theme);
        }
    }

    /* renamed from: o.vT1$c */
    /* loaded from: classes.dex */
    public static class c {
        public static float a(Resources resources, int i) {
            return resources.getFloat(i);
        }
    }

    /* renamed from: o.vT1$d */
    /* loaded from: classes.dex */
    public static class d {
        public final ColorStateList a;
        public final Configuration b;
        public final int c;

        public d(ColorStateList colorStateList, Configuration configuration, Resources.Theme theme) {
            int hashCode;
            this.a = colorStateList;
            this.b = configuration;
            if (theme == null) {
                hashCode = 0;
            } else {
                hashCode = theme.hashCode();
            }
            this.c = hashCode;
        }
    }

    /* renamed from: o.vT1$e */
    /* loaded from: classes.dex */
    public static final class e {
        public final Resources a;
        public final Resources.Theme b;

        public e(Resources resources, Resources.Theme theme) {
            this.a = resources;
            this.b = theme;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && e.class == obj.getClass()) {
                e eVar = (e) obj;
                if (this.a.equals(eVar.a) && C2691Ct1.a(this.b, eVar.b)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return C2691Ct1.b(this.a, this.b);
        }
    }

    /* renamed from: o.vT1$f */
    /* loaded from: classes.dex */
    public static abstract class f {
        public static /* synthetic */ void a(f fVar, Typeface typeface) {
            fVar.g(typeface);
        }

        public static /* synthetic */ void b(f fVar, int i) {
            fVar.f(i);
        }

        public static Handler e(Handler handler) {
            if (handler == null) {
                return new Handler(Looper.getMainLooper());
            }
            return handler;
        }

        public final void c(final int i, Handler handler) {
            e(handler).post(new Runnable() { // from class: o.xT1
                @Override // java.lang.Runnable
                public final void run() {
                    C10231vT1.f.b(C10231vT1.f.this, i);
                }
            });
        }

        public final void d(final Typeface typeface, Handler handler) {
            e(handler).post(new Runnable() { // from class: o.wT1
                @Override // java.lang.Runnable
                public final void run() {
                    C10231vT1.f.a(C10231vT1.f.this, typeface);
                }
            });
        }

        public abstract void f(int i);

        public abstract void g(Typeface typeface);
    }

    /* renamed from: o.vT1$g */
    /* loaded from: classes.dex */
    public static final class g {

        /* renamed from: o.vT1$g$a */
        /* loaded from: classes.dex */
        public static class a {
            public static final Object a = new Object();
            public static Method b;
            public static boolean c;

            public static void a(Resources.Theme theme) {
                synchronized (a) {
                    if (!c) {
                        try {
                            Method declaredMethod = Resources.Theme.class.getDeclaredMethod("rebase", null);
                            b = declaredMethod;
                            declaredMethod.setAccessible(true);
                        } catch (NoSuchMethodException e) {
                            Log.i(C10231vT1.a, "Failed to retrieve rebase() method", e);
                        }
                        c = true;
                    }
                    Method method = b;
                    if (method != null) {
                        try {
                            method.invoke(theme, null);
                        } catch (IllegalAccessException | InvocationTargetException e2) {
                            Log.i(C10231vT1.a, "Failed to invoke rebase() method via reflection", e2);
                            b = null;
                        }
                    }
                }
            }
        }

        /* renamed from: o.vT1$g$b */
        /* loaded from: classes.dex */
        public static class b {
            public static void a(Resources.Theme theme) {
                theme.rebase();
            }
        }

        public static void a(Resources.Theme theme) {
            if (Build.VERSION.SDK_INT >= 29) {
                b.a(theme);
            } else {
                a.a(theme);
            }
        }
    }

    public static void a(e eVar, int i, ColorStateList colorStateList, Resources.Theme theme) {
        synchronized (d) {
            try {
                WeakHashMap<e, SparseArray<d>> weakHashMap = c;
                SparseArray<d> sparseArray = weakHashMap.get(eVar);
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                    weakHashMap.put(eVar, sparseArray);
                }
                sparseArray.append(i, new d(colorStateList, eVar.a.getConfiguration(), theme));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void b(Resources.Theme theme) {
        synchronized (d) {
            try {
                Iterator<e> it = c.keySet().iterator();
                while (it.hasNext()) {
                    e next = it.next();
                    if (next != null && theme.equals(next.b)) {
                        it.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x003c, code lost:
        if (r2.c == r5.hashCode()) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ColorStateList c(e eVar, int i) {
        d dVar;
        synchronized (d) {
            try {
                SparseArray<d> sparseArray = c.get(eVar);
                if (sparseArray != null && sparseArray.size() > 0 && (dVar = sparseArray.get(i)) != null) {
                    if (dVar.b.equals(eVar.a.getConfiguration())) {
                        Resources.Theme theme = eVar.b;
                        if (theme == null) {
                            if (dVar.c != 0) {
                            }
                            return dVar.a;
                        }
                        if (theme != null) {
                        }
                    }
                    sparseArray.remove(i);
                }
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static Typeface d(Context context, int i) throws Resources.NotFoundException {
        if (context.isRestricted()) {
            return null;
        }
        return p(context, i, new TypedValue(), 0, null, null, false, true);
    }

    public static int e(Resources resources, int i, Resources.Theme theme) throws Resources.NotFoundException {
        return b.a(resources, i, theme);
    }

    public static ColorStateList f(Resources resources, int i, Resources.Theme theme) throws Resources.NotFoundException {
        e eVar = new e(resources, theme);
        ColorStateList c2 = c(eVar, i);
        if (c2 != null) {
            return c2;
        }
        ColorStateList n = n(resources, i, theme);
        if (n != null) {
            a(eVar, i, n, theme);
            return n;
        }
        return b.b(resources, i, theme);
    }

    public static Drawable g(Resources resources, int i, Resources.Theme theme) throws Resources.NotFoundException {
        return a.a(resources, i, theme);
    }

    public static Drawable h(Resources resources, int i, int i2, Resources.Theme theme) throws Resources.NotFoundException {
        return a.b(resources, i, i2, theme);
    }

    public static float i(Resources resources, int i) {
        if (Build.VERSION.SDK_INT >= 29) {
            return c.a(resources, i);
        }
        TypedValue m = m();
        resources.getValue(i, m, true);
        if (m.type == 4) {
            return m.getFloat();
        }
        throw new Resources.NotFoundException("Resource ID #0x" + Integer.toHexString(i) + " type #0x" + Integer.toHexString(m.type) + " is not valid");
    }

    public static Typeface j(Context context, int i) throws Resources.NotFoundException {
        if (context.isRestricted()) {
            return null;
        }
        return p(context, i, new TypedValue(), 0, null, null, false, false);
    }

    public static Typeface k(Context context, int i, TypedValue typedValue, int i2, f fVar) throws Resources.NotFoundException {
        if (context.isRestricted()) {
            return null;
        }
        return p(context, i, typedValue, i2, fVar, null, true, false);
    }

    public static void l(Context context, int i, f fVar, Handler handler) throws Resources.NotFoundException {
        C10907yF1.l(fVar);
        if (context.isRestricted()) {
            fVar.c(-4, handler);
        } else {
            p(context, i, new TypedValue(), 0, fVar, handler, false, false);
        }
    }

    public static TypedValue m() {
        ThreadLocal<TypedValue> threadLocal = b;
        TypedValue typedValue = threadLocal.get();
        if (typedValue == null) {
            TypedValue typedValue2 = new TypedValue();
            threadLocal.set(typedValue2);
            return typedValue2;
        }
        return typedValue;
    }

    public static ColorStateList n(Resources resources, int i, Resources.Theme theme) {
        if (o(resources, i)) {
            return null;
        }
        try {
            return C8956qG.a(resources, resources.getXml(i), theme);
        } catch (Exception e2) {
            Log.w(a, "Failed to inflate ColorStateList, leaving it to the framework", e2);
            return null;
        }
    }

    public static boolean o(Resources resources, int i) {
        TypedValue m = m();
        resources.getValue(i, m, true);
        int i2 = m.type;
        if (i2 >= 28 && i2 <= 31) {
            return true;
        }
        return false;
    }

    public static Typeface p(Context context, int i, TypedValue typedValue, int i2, f fVar, Handler handler, boolean z, boolean z2) {
        Resources resources = context.getResources();
        resources.getValue(i, typedValue, true);
        Typeface q = q(context, resources, typedValue, i, i2, fVar, handler, z, z2);
        if (q == null && fVar == null && !z2) {
            throw new Resources.NotFoundException("Font resource ID #0x" + Integer.toHexString(i) + " could not be retrieved.");
        }
        return q;
    }

    /* JADX WARN: Removed duplicated region for block: B:99:0x00b3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Typeface q(Context context, Resources resources, TypedValue typedValue, int i, int i2, f fVar, Handler handler, boolean z, boolean z2) {
        CharSequence charSequence = typedValue.string;
        if (charSequence != null) {
            String charSequence2 = charSequence.toString();
            if (!charSequence2.startsWith("res/")) {
                if (fVar != null) {
                    fVar.c(-3, handler);
                }
                return null;
            }
            Typeface l = C9128qw2.l(resources, i, charSequence2, typedValue.assetCookie, i2);
            if (l != null) {
                if (fVar != null) {
                    fVar.d(l, handler);
                }
                return l;
            } else if (z2) {
                return null;
            } else {
                try {
                    if (charSequence2.toLowerCase().endsWith(androidx.appcompat.widget.b.y)) {
                        C5693cx0.b b2 = C5693cx0.b(resources.getXml(i), resources);
                        if (b2 == null) {
                            Log.e(a, "Failed to find font-family tag");
                            if (fVar != null) {
                                fVar.c(-3, handler);
                            }
                            return null;
                        }
                        try {
                            return C9128qw2.g(context, b2, resources, i, charSequence2, typedValue.assetCookie, i2, fVar, handler, z);
                        } catch (IOException e2) {
                            e = e2;
                            charSequence2 = charSequence2;
                            IOException iOException = e;
                            Log.e(a, "Failed to read xml resource " + charSequence2, iOException);
                            if (fVar != null) {
                                fVar.c(-3, handler);
                            }
                            return null;
                        } catch (XmlPullParserException e3) {
                            e = e3;
                            charSequence2 = charSequence2;
                            XmlPullParserException xmlPullParserException = e;
                            Log.e(a, "Failed to parse xml resource " + charSequence2, xmlPullParserException);
                            if (fVar != null) {
                            }
                            return null;
                        }
                    }
                    Typeface i3 = C9128qw2.i(context, resources, i, charSequence2, typedValue.assetCookie, i2);
                    if (fVar != null) {
                        if (i3 != null) {
                            fVar.d(i3, handler);
                            return i3;
                        }
                        fVar.c(-3, handler);
                    }
                    return i3;
                } catch (IOException e4) {
                    e = e4;
                } catch (XmlPullParserException e5) {
                    e = e5;
                }
            }
        } else {
            throw new Resources.NotFoundException("Resource \"" + resources.getResourceName(i) + "\" (" + Integer.toHexString(i) + ") is not a Font: " + typedValue);
        }
    }
}
