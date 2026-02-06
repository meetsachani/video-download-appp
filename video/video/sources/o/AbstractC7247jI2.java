package o;

import android.content.Context;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o.NM1;

@Deprecated
/* renamed from: o.jI2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC7247jI2<T extends View, Z> extends AbstractC3843Ol<Z> {
    public static final String b1 = "ViewTarget";
    public static boolean c1;
    public static int d1 = NM1.a.glide_custom_view_target_tag;
    public final T Y;
    public View.OnAttachStateChangeListener Y0;
    public final b Z;
    public boolean Z0;
    public boolean a1;

    /* renamed from: o.jI2$a */
    /* loaded from: classes.dex */
    public class a implements View.OnAttachStateChangeListener {
        public a() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            AbstractC7247jI2.this.p();
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            AbstractC7247jI2.this.n();
        }
    }

    /* renamed from: o.jI2$b */
    /* loaded from: classes.dex */
    public static final class b {
        public static final int e = 0;
        public static Integer f;
        public final View a;
        public final List<U82> b = new ArrayList();
        public boolean c;
        public a d;

        /* renamed from: o.jI2$b$a */
        /* loaded from: classes.dex */
        public static final class a implements ViewTreeObserver.OnPreDrawListener {
            public final WeakReference<b> X;

            public a(b bVar) {
                this.X = new WeakReference<>(bVar);
            }

            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public boolean onPreDraw() {
                if (Log.isLoggable(AbstractC7247jI2.b1, 2)) {
                    Log.v(AbstractC7247jI2.b1, "OnGlobalLayoutListener called attachStateListener=" + this);
                }
                b bVar = this.X.get();
                if (bVar != null) {
                    bVar.a();
                    return true;
                }
                return true;
            }
        }

        public b(View view) {
            this.a = view;
        }

        public static int c(Context context) {
            if (f == null) {
                Display defaultDisplay = ((WindowManager) C10175vF1.e((WindowManager) context.getSystemService("window"))).getDefaultDisplay();
                Point point = new Point();
                defaultDisplay.getSize(point);
                f = Integer.valueOf(Math.max(point.x, point.y));
            }
            return f.intValue();
        }

        public void a() {
            if (!this.b.isEmpty()) {
                int g = g();
                int f2 = f();
                if (!i(g, f2)) {
                    return;
                }
                j(g, f2);
                b();
            }
        }

        public void b() {
            ViewTreeObserver viewTreeObserver = this.a.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnPreDrawListener(this.d);
            }
            this.d = null;
            this.b.clear();
        }

        public void d(U82 u82) {
            int g = g();
            int f2 = f();
            if (i(g, f2)) {
                u82.d(g, f2);
                return;
            }
            if (!this.b.contains(u82)) {
                this.b.add(u82);
            }
            if (this.d == null) {
                ViewTreeObserver viewTreeObserver = this.a.getViewTreeObserver();
                a aVar = new a(this);
                this.d = aVar;
                viewTreeObserver.addOnPreDrawListener(aVar);
            }
        }

        public final int e(int i, int i2, int i3) {
            int i4 = i2 - i3;
            if (i4 > 0) {
                return i4;
            }
            if (this.c && this.a.isLayoutRequested()) {
                return 0;
            }
            int i5 = i - i3;
            if (i5 > 0) {
                return i5;
            }
            if (this.a.isLayoutRequested() || i2 != -2) {
                return 0;
            }
            if (Log.isLoggable(AbstractC7247jI2.b1, 4)) {
                Log.i(AbstractC7247jI2.b1, "Glide treats LayoutParams.WRAP_CONTENT as a request for an image the size of this device's screen dimensions. If you want to load the original image and are ok with the corresponding memory cost and OOMs (depending on the input size), use override(Target.SIZE_ORIGINAL). Otherwise, use LayoutParams.MATCH_PARENT, set layout_width and layout_height to fixed dimension, or use .override() with fixed dimensions.");
            }
            return c(this.a.getContext());
        }

        public final int f() {
            int i;
            int paddingTop = this.a.getPaddingTop() + this.a.getPaddingBottom();
            ViewGroup.LayoutParams layoutParams = this.a.getLayoutParams();
            if (layoutParams != null) {
                i = layoutParams.height;
            } else {
                i = 0;
            }
            return e(this.a.getHeight(), i, paddingTop);
        }

        public final int g() {
            int i;
            int paddingLeft = this.a.getPaddingLeft() + this.a.getPaddingRight();
            ViewGroup.LayoutParams layoutParams = this.a.getLayoutParams();
            if (layoutParams != null) {
                i = layoutParams.width;
            } else {
                i = 0;
            }
            return e(this.a.getWidth(), i, paddingLeft);
        }

        public final boolean h(int i) {
            if (i <= 0 && i != Integer.MIN_VALUE) {
                return false;
            }
            return true;
        }

        public final boolean i(int i, int i2) {
            if (h(i) && h(i2)) {
                return true;
            }
            return false;
        }

        public final void j(int i, int i2) {
            Iterator it = new ArrayList(this.b).iterator();
            while (it.hasNext()) {
                ((U82) it.next()).d(i, i2);
            }
        }

        public void k(U82 u82) {
            this.b.remove(u82);
        }
    }

    public AbstractC7247jI2(T t) {
        this.Y = (T) C10175vF1.e(t);
        this.Z = new b(t);
    }

    @Deprecated
    public static void s(int i) {
        if (!c1) {
            d1 = i;
            return;
        }
        throw new IllegalArgumentException("You cannot set the tag id more than once or change the tag id after the first request has been made");
    }

    public T a() {
        return this.Y;
    }

    public final AbstractC7247jI2<T, Z> d() {
        if (this.Y0 != null) {
            return this;
        }
        this.Y0 = new a();
        g();
        return this;
    }

    @Override // o.InterfaceC2856El2
    public void e(U82 u82) {
        this.Z.k(u82);
    }

    public final Object f() {
        return this.Y.getTag(d1);
    }

    public final void g() {
        View.OnAttachStateChangeListener onAttachStateChangeListener = this.Y0;
        if (onAttachStateChangeListener != null && !this.a1) {
            this.Y.addOnAttachStateChangeListener(onAttachStateChangeListener);
            this.a1 = true;
        }
    }

    @Override // o.InterfaceC2856El2
    public void h(U82 u82) {
        this.Z.d(u82);
    }

    @Override // o.AbstractC3843Ol, o.InterfaceC2856El2
    public void i(Drawable drawable) {
        super.i(drawable);
        g();
    }

    @Override // o.AbstractC3843Ol, o.InterfaceC2856El2
    public InterfaceC5334bS1 j() {
        Object f = f();
        if (f != null) {
            if (f instanceof InterfaceC5334bS1) {
                return (InterfaceC5334bS1) f;
            }
            throw new IllegalArgumentException("You must not call setTag() on a view Glide is targeting");
        }
        return null;
    }

    @Override // o.AbstractC3843Ol, o.InterfaceC2856El2
    public void k(Drawable drawable) {
        super.k(drawable);
        this.Z.b();
        if (!this.Z0) {
            l();
        }
    }

    public final void l() {
        View.OnAttachStateChangeListener onAttachStateChangeListener = this.Y0;
        if (onAttachStateChangeListener != null && this.a1) {
            this.Y.removeOnAttachStateChangeListener(onAttachStateChangeListener);
            this.a1 = false;
        }
    }

    public void n() {
        InterfaceC5334bS1 j = j();
        if (j != null) {
            this.Z0 = true;
            j.clear();
            this.Z0 = false;
        }
    }

    public void p() {
        InterfaceC5334bS1 j = j();
        if (j != null && j.e()) {
            j.i();
        }
    }

    @Override // o.AbstractC3843Ol, o.InterfaceC2856El2
    public void q(InterfaceC5334bS1 interfaceC5334bS1) {
        r(interfaceC5334bS1);
    }

    public final void r(Object obj) {
        c1 = true;
        this.Y.setTag(d1, obj);
    }

    public final AbstractC7247jI2<T, Z> t() {
        this.Z.c = true;
        return this;
    }

    public String toString() {
        return "Target for: " + this.Y;
    }

    @Deprecated
    public AbstractC7247jI2(T t, boolean z) {
        this(t);
        if (z) {
            t();
        }
    }
}
