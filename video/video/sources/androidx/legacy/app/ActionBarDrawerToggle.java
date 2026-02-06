package androidx.legacy.app;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import java.lang.reflect.Method;
import o.C10201vM;
import o.C5734d70;
import o.C6516gH2;
import o.JE0;

@Deprecated
/* loaded from: classes.dex */
public class ActionBarDrawerToggle implements C5734d70.e {
    public static final String m = "ActionBarDrawerToggle";
    public static final int[] n = {16843531};

    /* renamed from: o  reason: collision with root package name */
    public static final float f35o = 0.33333334f;
    public static final int p = 16908332;
    public final Activity a;
    public final Delegate b;
    public final C5734d70 c;
    public boolean d;
    public boolean e;
    public Drawable f;
    public Drawable g;
    public SlideDrawable h;
    public final int i;
    public final int j;
    public final int k;
    public SetIndicatorInfo l;

    @Deprecated
    /* loaded from: classes.dex */
    public interface Delegate {
        void a(Drawable drawable, int i);

        Drawable b();

        void c(int i);
    }

    @Deprecated
    /* loaded from: classes.dex */
    public interface DelegateProvider {
        Delegate d();
    }

    /* loaded from: classes.dex */
    public static class SetIndicatorInfo {
        public Method a;
        public Method b;
        public ImageView c;

        public SetIndicatorInfo(Activity activity) {
            try {
                this.a = ActionBar.class.getDeclaredMethod("setHomeAsUpIndicator", Drawable.class);
                this.b = ActionBar.class.getDeclaredMethod("setHomeActionContentDescription", Integer.TYPE);
            } catch (NoSuchMethodException unused) {
                View findViewById = activity.findViewById(ActionBarDrawerToggle.p);
                if (findViewById != null) {
                    ViewGroup viewGroup = (ViewGroup) findViewById.getParent();
                    if (viewGroup.getChildCount() == 2) {
                        View childAt = viewGroup.getChildAt(0);
                        childAt = childAt.getId() == 16908332 ? viewGroup.getChildAt(1) : childAt;
                        if (childAt instanceof ImageView) {
                            this.c = (ImageView) childAt;
                        }
                    }
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public class SlideDrawable extends InsetDrawable implements Drawable.Callback {
        public final boolean X;
        public final Rect Y;
        public float Y0;
        public float Z;

        public SlideDrawable(Drawable drawable) {
            super(drawable, 0);
            this.X = true;
            this.Y = new Rect();
        }

        public float a() {
            return this.Z;
        }

        public void b(float f) {
            this.Y0 = f;
            invalidateSelf();
        }

        public void c(float f) {
            this.Z = f;
            invalidateSelf();
        }

        @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
        public void draw(Canvas canvas) {
            boolean z;
            copyBounds(this.Y);
            canvas.save();
            int i = 1;
            if (C6516gH2.e0(ActionBarDrawerToggle.this.a.getWindow().getDecorView()) == 1) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                i = -1;
            }
            float width = this.Y.width();
            canvas.translate((-this.Y0) * width * this.Z * i, 0.0f);
            if (z && !this.X) {
                canvas.translate(width, 0.0f);
                canvas.scale(-1.0f, 1.0f);
            }
            super.draw(canvas);
            canvas.restore();
        }
    }

    public ActionBarDrawerToggle(Activity activity, C5734d70 c5734d70, int i, int i2, int i3) {
        this(activity, c5734d70, !e(activity), i, i2, i3);
    }

    public static boolean e(Context context) {
        if (context.getApplicationInfo().targetSdkVersion >= 21) {
            return true;
        }
        return false;
    }

    private Drawable f() {
        Context context;
        Delegate delegate = this.b;
        if (delegate != null) {
            return delegate.b();
        }
        ActionBar actionBar = this.a.getActionBar();
        if (actionBar != null) {
            context = actionBar.getThemedContext();
        } else {
            context = this.a;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, n, 16843470, 0);
        Drawable drawable = obtainStyledAttributes.getDrawable(0);
        obtainStyledAttributes.recycle();
        return drawable;
    }

    private void j(int i) {
        Delegate delegate = this.b;
        if (delegate != null) {
            delegate.c(i);
            return;
        }
        ActionBar actionBar = this.a.getActionBar();
        if (actionBar != null) {
            actionBar.setHomeActionContentDescription(i);
        }
    }

    private void k(Drawable drawable, int i) {
        Delegate delegate = this.b;
        if (delegate != null) {
            delegate.a(drawable, i);
            return;
        }
        ActionBar actionBar = this.a.getActionBar();
        if (actionBar != null) {
            actionBar.setHomeAsUpIndicator(drawable);
            actionBar.setHomeActionContentDescription(i);
        }
    }

    @Override // o.C5734d70.e
    public void a(View view) {
        this.h.c(1.0f);
        if (this.d) {
            j(this.k);
        }
    }

    @Override // o.C5734d70.e
    public void b(View view) {
        this.h.c(0.0f);
        if (this.d) {
            j(this.j);
        }
    }

    @Override // o.C5734d70.e
    public void c(int i) {
    }

    @Override // o.C5734d70.e
    public void d(View view, float f) {
        float min;
        float a = this.h.a();
        if (f > 0.5f) {
            min = Math.max(a, Math.max(0.0f, f - 0.5f) * 2.0f);
        } else {
            min = Math.min(a, f * 2.0f);
        }
        this.h.c(min);
    }

    public boolean g() {
        return this.d;
    }

    public void h(Configuration configuration) {
        if (!this.e) {
            this.f = f();
        }
        this.g = C10201vM.l(this.a, this.i);
        o();
    }

    public boolean i(MenuItem menuItem) {
        if (menuItem != null && menuItem.getItemId() == 16908332 && this.d) {
            if (this.c.F(JE0.b)) {
                this.c.d(JE0.b);
                return true;
            }
            this.c.K(JE0.b);
            return true;
        }
        return false;
    }

    public void l(boolean z) {
        int i;
        if (z != this.d) {
            if (z) {
                SlideDrawable slideDrawable = this.h;
                if (this.c.C(JE0.b)) {
                    i = this.k;
                } else {
                    i = this.j;
                }
                k(slideDrawable, i);
            } else {
                k(this.f, 0);
            }
            this.d = z;
        }
    }

    public void m(int i) {
        Drawable drawable;
        if (i != 0) {
            drawable = C10201vM.l(this.a, i);
        } else {
            drawable = null;
        }
        n(drawable);
    }

    public void n(Drawable drawable) {
        if (drawable == null) {
            this.f = f();
            this.e = false;
        } else {
            this.f = drawable;
            this.e = true;
        }
        if (!this.d) {
            k(this.f, 0);
        }
    }

    public void o() {
        int i;
        if (this.c.C(JE0.b)) {
            this.h.c(1.0f);
        } else {
            this.h.c(0.0f);
        }
        if (this.d) {
            SlideDrawable slideDrawable = this.h;
            if (this.c.C(JE0.b)) {
                i = this.k;
            } else {
                i = this.j;
            }
            k(slideDrawable, i);
        }
    }

    public ActionBarDrawerToggle(Activity activity, C5734d70 c5734d70, boolean z, int i, int i2, int i3) {
        this.d = true;
        this.a = activity;
        if (activity instanceof DelegateProvider) {
            this.b = ((DelegateProvider) activity).d();
        } else {
            this.b = null;
        }
        this.c = c5734d70;
        this.i = i;
        this.j = i2;
        this.k = i3;
        this.f = f();
        this.g = C10201vM.l(activity, i);
        SlideDrawable slideDrawable = new SlideDrawable(this.g);
        this.h = slideDrawable;
        slideDrawable.b(z ? 0.33333334f : 0.0f);
    }
}
