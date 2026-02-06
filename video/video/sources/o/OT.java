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

/* loaded from: classes.dex */
public abstract class OT<T extends View, Z> implements InterfaceC2856El2<Z> {
    public static final String a1 = "CustomViewTarget";
    public static final int b1 = NM1.a.glide_custom_view_target_tag;
    public final b X;
    public final T Y;
    public boolean Y0;
    public View.OnAttachStateChangeListener Z;
    public boolean Z0;

    /* loaded from: classes.dex */
    public class a implements View.OnAttachStateChangeListener {
        public a() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            OT.this.p();
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            OT.this.n();
        }
    }

    /* loaded from: classes.dex */
    public static final class b {
        public static final int e = 0;
        public static Integer f;
        public final View a;
        public final List<U82> b = new ArrayList();
        public boolean c;
        public a d;

        /* loaded from: classes.dex */
        public static final class a implements ViewTreeObserver.OnPreDrawListener {
            public final WeakReference<b> X;

            public a(b bVar) {
                this.X = new WeakReference<>(bVar);
            }

            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public boolean onPreDraw() {
                if (Log.isLoggable(OT.a1, 2)) {
                    Log.v(OT.a1, "OnGlobalLayoutListener called attachStateListener=" + this);
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
            if (Log.isLoggable(OT.a1, 4)) {
                Log.i(OT.a1, "Glide treats LayoutParams.WRAP_CONTENT as a request for an image the size of this device's screen dimensions. If you want to load the original image and are ok with the corresponding memory cost and OOMs (depending on the input size), use .override(Target.SIZE_ORIGINAL). Otherwise, use LayoutParams.MATCH_PARENT, set layout_width and layout_height to fixed dimension, or use .override() with fixed dimensions.");
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

    public OT(T t) {
        this.Y = (T) C10175vF1.e(t);
        this.X = new b(t);
    }

    private Object b() {
        return this.Y.getTag(b1);
    }

    private void d() {
        View.OnAttachStateChangeListener onAttachStateChangeListener = this.Z;
        if (onAttachStateChangeListener != null && !this.Z0) {
            this.Y.addOnAttachStateChangeListener(onAttachStateChangeListener);
            this.Z0 = true;
        }
    }

    private void f() {
        View.OnAttachStateChangeListener onAttachStateChangeListener = this.Z;
        if (onAttachStateChangeListener != null && this.Z0) {
            this.Y.removeOnAttachStateChangeListener(onAttachStateChangeListener);
            this.Z0 = false;
        }
    }

    private void r(Object obj) {
        this.Y.setTag(b1, obj);
    }

    public final OT<T, Z> a() {
        if (this.Z != null) {
            return this;
        }
        this.Z = new a();
        d();
        return this;
    }

    public final T c() {
        return this.Y;
    }

    @Override // o.InterfaceC2856El2
    public final void e(U82 u82) {
        this.X.k(u82);
    }

    public abstract void g(Drawable drawable);

    @Override // o.InterfaceC2856El2
    public final void h(U82 u82) {
        this.X.d(u82);
    }

    @Override // o.InterfaceC2856El2
    public final void i(Drawable drawable) {
        d();
        l(drawable);
    }

    @Override // o.InterfaceC2856El2
    public final InterfaceC5334bS1 j() {
        Object b2 = b();
        if (b2 != null) {
            if (b2 instanceof InterfaceC5334bS1) {
                return (InterfaceC5334bS1) b2;
            }
            throw new IllegalArgumentException("You must not pass non-R.id ids to setTag(id)");
        }
        return null;
    }

    @Override // o.InterfaceC2856El2
    public final void k(Drawable drawable) {
        this.X.b();
        g(drawable);
        if (!this.Y0) {
            f();
        }
    }

    public final void n() {
        InterfaceC5334bS1 j = j();
        if (j != null) {
            this.Y0 = true;
            j.clear();
            this.Y0 = false;
        }
    }

    public final void p() {
        InterfaceC5334bS1 j = j();
        if (j != null && j.e()) {
            j.i();
        }
    }

    @Override // o.InterfaceC2856El2
    public final void q(InterfaceC5334bS1 interfaceC5334bS1) {
        r(interfaceC5334bS1);
    }

    public final OT<T, Z> t() {
        this.X.c = true;
        return this;
    }

    public String toString() {
        return "Target for: " + this.Y;
    }

    @Override // o.IZ0
    public void onDestroy() {
    }

    @Override // o.IZ0
    public void onStart() {
    }

    @Override // o.IZ0
    public void onStop() {
    }

    public void l(Drawable drawable) {
    }

    @Deprecated
    public final OT<T, Z> s(int i) {
        return this;
    }
}
