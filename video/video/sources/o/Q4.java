package o;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import androidx.legacy.app.ActionBarDrawerToggle;
import o.C5734d70;

/* loaded from: classes.dex */
public class Q4 implements C5734d70.e {
    public final b a;
    public final C5734d70 b;
    public C5491c70 c;
    public boolean d;
    public Drawable e;
    public boolean f;
    public boolean g;
    public final int h;
    public final int i;
    public View.OnClickListener j;
    public boolean k;

    /* loaded from: classes.dex */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Q4 q4 = Q4.this;
            if (q4.f) {
                q4.v();
                return;
            }
            View.OnClickListener onClickListener = q4.j;
            if (onClickListener != null) {
                onClickListener.onClick(view);
            }
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        void a(Drawable drawable, int i);

        Drawable b();

        void c(int i);

        Context d();

        boolean e();
    }

    /* loaded from: classes.dex */
    public interface c {
        b d();
    }

    /* loaded from: classes.dex */
    public static class d implements b {
        public final Activity a;

        public d(Activity activity) {
            this.a = activity;
        }

        @Override // o.Q4.b
        public void a(Drawable drawable, int i) {
            ActionBar actionBar = this.a.getActionBar();
            if (actionBar != null) {
                actionBar.setHomeAsUpIndicator(drawable);
                actionBar.setHomeActionContentDescription(i);
            }
        }

        @Override // o.Q4.b
        public Drawable b() {
            TypedArray obtainStyledAttributes = d().obtainStyledAttributes(null, new int[]{16843531}, 16843470, 0);
            Drawable drawable = obtainStyledAttributes.getDrawable(0);
            obtainStyledAttributes.recycle();
            return drawable;
        }

        @Override // o.Q4.b
        public void c(int i) {
            ActionBar actionBar = this.a.getActionBar();
            if (actionBar != null) {
                actionBar.setHomeActionContentDescription(i);
            }
        }

        @Override // o.Q4.b
        public Context d() {
            ActionBar actionBar = this.a.getActionBar();
            if (actionBar != null) {
                return actionBar.getThemedContext();
            }
            return this.a;
        }

        @Override // o.Q4.b
        public boolean e() {
            ActionBar actionBar = this.a.getActionBar();
            if (actionBar != null && (actionBar.getDisplayOptions() & 4) != 0) {
                return true;
            }
            return false;
        }
    }

    /* loaded from: classes.dex */
    public static class e implements b {
        public final Toolbar a;
        public final Drawable b;
        public final CharSequence c;

        public e(Toolbar toolbar) {
            this.a = toolbar;
            this.b = toolbar.getNavigationIcon();
            this.c = toolbar.getNavigationContentDescription();
        }

        @Override // o.Q4.b
        public void a(Drawable drawable, int i) {
            this.a.setNavigationIcon(drawable);
            c(i);
        }

        @Override // o.Q4.b
        public Drawable b() {
            return this.b;
        }

        @Override // o.Q4.b
        public void c(int i) {
            if (i == 0) {
                this.a.setNavigationContentDescription(this.c);
            } else {
                this.a.setNavigationContentDescription(i);
            }
        }

        @Override // o.Q4.b
        public Context d() {
            return this.a.getContext();
        }

        @Override // o.Q4.b
        public boolean e() {
            return true;
        }
    }

    public Q4(Activity activity, C5734d70 c5734d70, int i, int i2) {
        this(activity, null, c5734d70, null, i, i2);
    }

    @Override // o.C5734d70.e
    public void a(View view) {
        s(1.0f);
        if (this.f) {
            l(this.i);
        }
    }

    @Override // o.C5734d70.e
    public void b(View view) {
        s(0.0f);
        if (this.f) {
            l(this.h);
        }
    }

    @Override // o.C5734d70.e
    public void d(View view, float f) {
        if (this.d) {
            s(Math.min(1.0f, Math.max(0.0f, f)));
        } else {
            s(0.0f);
        }
    }

    public C5491c70 e() {
        return this.c;
    }

    public Drawable f() {
        return this.a.b();
    }

    public View.OnClickListener g() {
        return this.j;
    }

    public boolean h() {
        return this.f;
    }

    public boolean i() {
        return this.d;
    }

    public void j(Configuration configuration) {
        if (!this.g) {
            this.e = f();
        }
        u();
    }

    public boolean k(MenuItem menuItem) {
        if (menuItem != null && menuItem.getItemId() == 16908332 && this.f) {
            v();
            return true;
        }
        return false;
    }

    public void l(int i) {
        this.a.c(i);
    }

    public void m(Drawable drawable, int i) {
        if (!this.k && !this.a.e()) {
            Log.w(ActionBarDrawerToggle.m, "DrawerToggle may not show up because NavigationIcon is not visible. You may need to call actionbar.setDisplayHomeAsUpEnabled(true);");
            this.k = true;
        }
        this.a.a(drawable, i);
    }

    public void n(C5491c70 c5491c70) {
        this.c = c5491c70;
        u();
    }

    public void o(boolean z) {
        int i;
        if (z != this.f) {
            if (z) {
                C5491c70 c5491c70 = this.c;
                if (this.b.C(JE0.b)) {
                    i = this.i;
                } else {
                    i = this.h;
                }
                m(c5491c70, i);
            } else {
                m(this.e, 0);
            }
            this.f = z;
        }
    }

    public void p(boolean z) {
        this.d = z;
        if (!z) {
            s(0.0f);
        }
    }

    public void q(int i) {
        Drawable drawable;
        if (i != 0) {
            drawable = this.b.getResources().getDrawable(i);
        } else {
            drawable = null;
        }
        r(drawable);
    }

    public void r(Drawable drawable) {
        if (drawable == null) {
            this.e = f();
            this.g = false;
        } else {
            this.e = drawable;
            this.g = true;
        }
        if (!this.f) {
            m(this.e, 0);
        }
    }

    public final void s(float f) {
        if (f == 1.0f) {
            this.c.u(true);
        } else if (f == 0.0f) {
            this.c.u(false);
        }
        this.c.s(f);
    }

    public void t(View.OnClickListener onClickListener) {
        this.j = onClickListener;
    }

    public void u() {
        int i;
        if (this.b.C(JE0.b)) {
            s(1.0f);
        } else {
            s(0.0f);
        }
        if (this.f) {
            C5491c70 c5491c70 = this.c;
            if (this.b.C(JE0.b)) {
                i = this.i;
            } else {
                i = this.h;
            }
            m(c5491c70, i);
        }
    }

    public void v() {
        int q = this.b.q(JE0.b);
        if (this.b.F(JE0.b) && q != 2) {
            this.b.d(JE0.b);
        } else if (q != 1) {
            this.b.K(JE0.b);
        }
    }

    public Q4(Activity activity, C5734d70 c5734d70, Toolbar toolbar, int i, int i2) {
        this(activity, toolbar, c5734d70, null, i, i2);
    }

    public Q4(Activity activity, Toolbar toolbar, C5734d70 c5734d70, C5491c70 c5491c70, int i, int i2) {
        this.d = true;
        this.f = true;
        this.k = false;
        if (toolbar != null) {
            this.a = new e(toolbar);
            toolbar.setNavigationOnClickListener(new a());
        } else if (activity instanceof c) {
            this.a = ((c) activity).d();
        } else {
            this.a = new d(activity);
        }
        this.b = c5734d70;
        this.h = i;
        this.i = i2;
        if (c5491c70 == null) {
            this.c = new C5491c70(this.a.d());
        } else {
            this.c = c5491c70;
        }
        this.e = f();
    }

    @Override // o.C5734d70.e
    public void c(int i) {
    }
}
