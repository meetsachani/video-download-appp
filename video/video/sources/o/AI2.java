package o;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.os.Build;
import android.util.Property;
import android.view.View;

/* loaded from: classes.dex */
public class AI2 {
    public static final DI2 a;
    public static final String b = "ViewUtils";
    public static final Property<View, Float> c;
    public static final Property<View, Rect> d;

    /* loaded from: classes.dex */
    public class a extends Property<View, Float> {
        public a(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a */
        public Float get(View view) {
            return Float.valueOf(AI2.b(view));
        }

        @Override // android.util.Property
        /* renamed from: b */
        public void set(View view, Float f) {
            AI2.f(view, f.floatValue());
        }
    }

    /* loaded from: classes.dex */
    public class b extends Property<View, Rect> {
        public b(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a */
        public Rect get(View view) {
            return view.getClipBounds();
        }

        @Override // android.util.Property
        /* renamed from: b */
        public void set(View view, Rect rect) {
            view.setClipBounds(rect);
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 29) {
            a = new MI2();
        } else {
            a = new LI2();
        }
        c = new a(Float.class, "translationAlpha");
        d = new b(Rect.class, "clipBounds");
    }

    public static void a(View view) {
        a.a(view);
    }

    public static float b(View view) {
        return a.c(view);
    }

    public static void c(View view) {
        a.d(view);
    }

    public static void d(View view, Matrix matrix) {
        a.e(view, matrix);
    }

    public static void e(View view, int i, int i2, int i3, int i4) {
        a.f(view, i, i2, i3, i4);
    }

    public static void f(View view, float f) {
        a.g(view, f);
    }

    public static void g(View view, int i) {
        a.h(view, i);
    }

    public static void h(View view, Matrix matrix) {
        a.i(view, matrix);
    }

    public static void i(View view, Matrix matrix) {
        a.j(view, matrix);
    }
}
