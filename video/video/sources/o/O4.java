package o;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SpinnerAdapter;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import o.OL1;
import o.T4;

/* loaded from: classes.dex */
public abstract class O4 {
    @Deprecated
    public static final int a = 0;
    @Deprecated
    public static final int b = 1;
    @Deprecated
    public static final int c = 2;
    public static final int d = 1;
    public static final int e = 2;
    public static final int f = 4;
    public static final int g = 8;
    public static final int h = 16;

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface a {
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface c {
    }

    /* loaded from: classes.dex */
    public interface d {
        void onMenuVisibilityChanged(boolean z);
    }

    @Deprecated
    /* loaded from: classes.dex */
    public interface e {
        boolean onNavigationItemSelected(int i, long j);
    }

    @Deprecated
    /* loaded from: classes.dex */
    public static abstract class f {
        public static final int a = -1;

        public abstract CharSequence a();

        public abstract View b();

        public abstract Drawable c();

        public abstract int d();

        public abstract Object e();

        public abstract CharSequence f();

        public abstract void g();

        public abstract f h(int i);

        public abstract f i(CharSequence charSequence);

        public abstract f j(int i);

        public abstract f k(View view);

        public abstract f l(int i);

        public abstract f m(Drawable drawable);

        public abstract f n(g gVar);

        public abstract f o(Object obj);

        public abstract f p(int i);

        public abstract f q(CharSequence charSequence);
    }

    @Deprecated
    /* loaded from: classes.dex */
    public interface g {
        void a(f fVar, androidx.fragment.app.j jVar);

        void b(f fVar, androidx.fragment.app.j jVar);

        void c(f fVar, androidx.fragment.app.j jVar);
    }

    public abstract CharSequence A();

    public abstract void B();

    public abstract void B0();

    public boolean C() {
        return false;
    }

    public T4 C0(T4.a aVar) {
        return null;
    }

    public boolean D() {
        return false;
    }

    public abstract boolean E();

    public boolean F() {
        return false;
    }

    @Deprecated
    public abstract f G();

    public boolean J(int i, KeyEvent keyEvent) {
        return false;
    }

    public boolean K(KeyEvent keyEvent) {
        return false;
    }

    public boolean L() {
        return false;
    }

    @Deprecated
    public abstract void M();

    public abstract void N(d dVar);

    @Deprecated
    public abstract void O(f fVar);

    @Deprecated
    public abstract void P(int i);

    public boolean Q() {
        return false;
    }

    @Deprecated
    public abstract void R(f fVar);

    public abstract void S(Drawable drawable);

    public abstract void T(int i);

    public abstract void U(View view);

    public abstract void V(View view, b bVar);

    public abstract void X(boolean z);

    public abstract void Y(int i);

    public abstract void Z(int i, int i2);

    public abstract void a0(boolean z);

    public abstract void b0(boolean z);

    public abstract void c0(boolean z);

    public abstract void d0(boolean z);

    public void e0(float f2) {
        if (f2 == 0.0f) {
            return;
        }
        throw new UnsupportedOperationException("Setting a non-zero elevation is not supported in this action bar configuration.");
    }

    public abstract void f(d dVar);

    public void f0(int i) {
        if (i == 0) {
            return;
        }
        throw new UnsupportedOperationException("Setting an explicit action bar hide offset is not supported in this action bar configuration.");
    }

    @Deprecated
    public abstract void g(f fVar);

    public void g0(boolean z) {
        if (!z) {
            return;
        }
        throw new UnsupportedOperationException("Hide on content scroll is not supported in this action bar configuration.");
    }

    @Deprecated
    public abstract void h(f fVar, int i);

    @Deprecated
    public abstract void i(f fVar, int i, boolean z);

    @Deprecated
    public abstract void j(f fVar, boolean z);

    public boolean k() {
        return false;
    }

    public boolean l() {
        return false;
    }

    public abstract void m0(int i);

    public abstract View n();

    public abstract void n0(Drawable drawable);

    public abstract int o();

    @Deprecated
    public abstract void o0(SpinnerAdapter spinnerAdapter, e eVar);

    public float p() {
        return 0.0f;
    }

    public abstract void p0(int i);

    public abstract int q();

    public abstract void q0(Drawable drawable);

    public int r() {
        return 0;
    }

    @Deprecated
    public abstract void r0(int i);

    @Deprecated
    public abstract int s();

    @Deprecated
    public abstract void s0(int i);

    @Deprecated
    public abstract int t();

    @Deprecated
    public abstract int u();

    @Deprecated
    public abstract f v();

    public abstract CharSequence w();

    public abstract void w0(int i);

    @Deprecated
    public abstract f x(int i);

    public abstract void x0(CharSequence charSequence);

    @Deprecated
    public abstract int y();

    public abstract void y0(int i);

    public Context z() {
        return null;
    }

    public abstract void z0(CharSequence charSequence);

    /* loaded from: classes.dex */
    public static class b extends ViewGroup.MarginLayoutParams {
        public int a;

        public b(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.a = 0;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, OL1.m.E);
            this.a = obtainStyledAttributes.getInt(OL1.m.F, 0);
            obtainStyledAttributes.recycle();
        }

        public b(int i, int i2) {
            super(i, i2);
            this.a = AbstractC4051Qo1.o1;
        }

        public b(int i, int i2, int i3) {
            super(i, i2);
            this.a = i3;
        }

        public b(int i) {
            this(-2, -1, i);
        }

        public b(b bVar) {
            super((ViewGroup.MarginLayoutParams) bVar);
            this.a = 0;
            this.a = bVar.a;
        }

        public b(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.a = 0;
        }
    }

    public void I() {
    }

    public void A0(CharSequence charSequence) {
    }

    public void H(Configuration configuration) {
    }

    public void W(boolean z) {
    }

    public void h0(int i) {
    }

    public void i0(CharSequence charSequence) {
    }

    public void j0(int i) {
    }

    public void k0(Drawable drawable) {
    }

    public void l0(boolean z) {
    }

    public void m(boolean z) {
    }

    public void t0(boolean z) {
    }

    public void u0(Drawable drawable) {
    }

    public void v0(Drawable drawable) {
    }
}
