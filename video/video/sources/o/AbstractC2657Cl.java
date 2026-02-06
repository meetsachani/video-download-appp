package o;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import android.widget.ProgressBar;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Arrays;
import o.AbstractC2755Dl;
import o.C7025iN1;
import o.HT1;
import o.InterfaceC8441o9;
import o.OL1;

/* renamed from: o.Cl  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC2657Cl<S extends AbstractC2755Dl> extends ProgressBar {
    public static final int n1 = 0;
    public static final int o1 = 1;
    public static final int p1 = 2;
    public static final int q1 = 0;
    public static final int r1 = 1;
    public static final int s1 = 2;
    public static final int t1 = 3;
    public static final int u1 = C7025iN1.n.Widget_MaterialComponents_ProgressIndicator;
    public static final float v1 = 0.2f;
    public static final int w1 = 255;
    public static final int x1 = 1000;
    public S Y0;
    public int Z0;
    public boolean a1;
    public boolean b1;
    public final int c1;
    public final int d1;
    public long e1;
    public C6085ea f1;
    public boolean g1;
    public int h1;
    public boolean i1;
    public final Runnable j1;
    public final Runnable k1;
    public final InterfaceC8441o9.a l1;
    public final InterfaceC8441o9.a m1;

    /* renamed from: o.Cl$a */
    /* loaded from: classes3.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractC2657Cl.this.l();
        }
    }

    /* renamed from: o.Cl$b */
    /* loaded from: classes3.dex */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractC2657Cl.this.k();
            AbstractC2657Cl.this.e1 = -1L;
        }
    }

    /* renamed from: o.Cl$c */
    /* loaded from: classes3.dex */
    public class c extends InterfaceC8441o9.a {
        public c() {
        }

        @Override // o.InterfaceC8441o9.a
        public void b(Drawable drawable) {
            AbstractC2657Cl.this.setIndeterminate(false);
            AbstractC2657Cl abstractC2657Cl = AbstractC2657Cl.this;
            abstractC2657Cl.q(abstractC2657Cl.Z0, AbstractC2657Cl.this.a1);
        }
    }

    /* renamed from: o.Cl$d */
    /* loaded from: classes3.dex */
    public class d extends InterfaceC8441o9.a {
        public d() {
        }

        @Override // o.InterfaceC8441o9.a
        public void b(Drawable drawable) {
            super.b(drawable);
            if (!AbstractC2657Cl.this.g1) {
                AbstractC2657Cl abstractC2657Cl = AbstractC2657Cl.this;
                abstractC2657Cl.setVisibility(abstractC2657Cl.h1);
            }
        }
    }

    @HT1({HT1.a.Y})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: o.Cl$e */
    /* loaded from: classes3.dex */
    public @interface e {
    }

    @HT1({HT1.a.Y})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: o.Cl$f */
    /* loaded from: classes3.dex */
    public @interface f {
    }

    public AbstractC2657Cl(@InterfaceC5670cr1 Context context, @InterfaceC11300zs1 AttributeSet attributeSet, @InterfaceC8568og int i, @InterfaceC4698Xf2 int i2) {
        super(C6597gd1.d(context, attributeSet, i, u1), attributeSet, i);
        this.e1 = -1L;
        this.g1 = false;
        this.h1 = 4;
        this.j1 = new a();
        this.k1 = new b();
        this.l1 = new c();
        this.m1 = new d();
        Context context2 = getContext();
        this.Y0 = i(context2, attributeSet);
        TypedArray k = C7608kn2.k(context2, attributeSet, C7025iN1.o.W, i, i2, new int[0]);
        this.c1 = k.getInt(C7025iN1.o.e0, -1);
        this.d1 = Math.min(k.getInt(C7025iN1.o.c0, -1), 1000);
        k.recycle();
        this.f1 = new C6085ea();
        this.b1 = true;
    }

    @InterfaceC11300zs1
    private AbstractC6717h70<S> getCurrentDrawingDelegate() {
        if (isIndeterminate()) {
            if (getIndeterminateDrawable() == null) {
                return null;
            }
            return getIndeterminateDrawable().F();
        } else if (getProgressDrawable() == null) {
            return null;
        } else {
            return getProgressDrawable().L();
        }
    }

    @Override // android.widget.ProgressBar
    @InterfaceC11300zs1
    public Drawable getCurrentDrawable() {
        if (isIndeterminate()) {
            return getIndeterminateDrawable();
        }
        return getProgressDrawable();
    }

    public int getHideAnimationBehavior() {
        return this.Y0.h;
    }

    @InterfaceC5670cr1
    public int[] getIndicatorColor() {
        return this.Y0.e;
    }

    @PK1
    public int getIndicatorTrackGapSize() {
        return this.Y0.i;
    }

    public int getShowAnimationBehavior() {
        return this.Y0.g;
    }

    @JF
    public int getTrackColor() {
        return this.Y0.f;
    }

    @PK1
    public int getTrackCornerRadius() {
        return this.Y0.b;
    }

    public float getTrackCornerRadiusFraction() {
        return this.Y0.c;
    }

    @PK1
    public int getTrackThickness() {
        return this.Y0.a;
    }

    @PK1
    public int getWaveAmplitude() {
        return this.Y0.l;
    }

    @PK1
    public int getWaveSpeed() {
        return this.Y0.m;
    }

    @PK1
    public int getWavelengthDeterminate() {
        return this.Y0.j;
    }

    @PK1
    public int getWavelengthIndeterminate() {
        return this.Y0.k;
    }

    public void h(boolean z) {
        if (!this.b1) {
            return;
        }
        ((AbstractC5006a70) getCurrentDrawable()).y(t(), false, z);
    }

    public abstract S i(@InterfaceC5670cr1 Context context, @InterfaceC5670cr1 AttributeSet attributeSet);

    @Override // android.view.View
    public void invalidate() {
        super.invalidate();
        if (getCurrentDrawable() != null) {
            getCurrentDrawable().invalidateSelf();
        }
    }

    public void j() {
        if (getVisibility() != 0) {
            removeCallbacks(this.j1);
            return;
        }
        removeCallbacks(this.k1);
        long uptimeMillis = SystemClock.uptimeMillis() - this.e1;
        int i = this.d1;
        if (uptimeMillis >= i) {
            this.k1.run();
        } else {
            postDelayed(this.k1, i - uptimeMillis);
        }
    }

    public final void k() {
        ((AbstractC5006a70) getCurrentDrawable()).y(false, false, true);
        if (n()) {
            setVisibility(4);
        }
    }

    public final void l() {
        if (this.d1 > 0) {
            this.e1 = SystemClock.uptimeMillis();
        }
        setVisibility(0);
    }

    public boolean m() {
        View view = this;
        while (view.getVisibility() == 0) {
            ViewParent parent = view.getParent();
            if (parent == null) {
                if (getWindowVisibility() != 0) {
                    return false;
                }
                return true;
            } else if (!(parent instanceof View)) {
                return true;
            } else {
                view = (View) parent;
            }
        }
        return false;
    }

    public final boolean n() {
        if (getProgressDrawable() == null || !getProgressDrawable().isVisible()) {
            if (getIndeterminateDrawable() != null && getIndeterminateDrawable().isVisible()) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final void o() {
        p();
        if (getProgressDrawable() != null) {
            getProgressDrawable().c(this.m1);
        }
        if (getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().c(this.m1);
        }
    }

    @Override // android.widget.ProgressBar, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        o();
        if (t()) {
            l();
        }
    }

    @Override // android.widget.ProgressBar, android.view.View
    public void onDetachedFromWindow() {
        removeCallbacks(this.k1);
        removeCallbacks(this.j1);
        ((AbstractC5006a70) getCurrentDrawable()).m();
        s();
        super.onDetachedFromWindow();
    }

    @Override // android.widget.ProgressBar, android.view.View
    public synchronized void onDraw(@InterfaceC5670cr1 Canvas canvas) {
        try {
            int save = canvas.save();
            if (getPaddingLeft() == 0) {
                if (getPaddingTop() != 0) {
                }
                if (getPaddingRight() == 0 || getPaddingBottom() != 0) {
                    canvas.clipRect(0, 0, getWidth() - (getPaddingLeft() + getPaddingRight()), getHeight() - (getPaddingTop() + getPaddingBottom()));
                }
                getCurrentDrawable().draw(canvas);
                canvas.restoreToCount(save);
            }
            canvas.translate(getPaddingLeft(), getPaddingTop());
            if (getPaddingRight() == 0) {
            }
            canvas.clipRect(0, 0, getWidth() - (getPaddingLeft() + getPaddingRight()), getHeight() - (getPaddingTop() + getPaddingBottom()));
            getCurrentDrawable().draw(canvas);
            canvas.restoreToCount(save);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        getCurrentDrawingDelegate().g();
    }

    @Override // android.widget.ProgressBar, android.view.View
    public synchronized void onMeasure(int i, int i2) {
        int f2;
        int e2;
        try {
            AbstractC6717h70<S> currentDrawingDelegate = getCurrentDrawingDelegate();
            if (currentDrawingDelegate == null) {
                return;
            }
            if (currentDrawingDelegate.f() < 0) {
                f2 = View.getDefaultSize(getSuggestedMinimumWidth(), i);
            } else {
                f2 = currentDrawingDelegate.f() + getPaddingLeft() + getPaddingRight();
            }
            if (currentDrawingDelegate.e() < 0) {
                e2 = View.getDefaultSize(getSuggestedMinimumHeight(), i2);
            } else {
                e2 = currentDrawingDelegate.e() + getPaddingTop() + getPaddingBottom();
            }
            setMeasuredDimension(f2, e2);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.view.View
    public void onVisibilityChanged(@InterfaceC5670cr1 View view, int i) {
        boolean z;
        super.onVisibilityChanged(view, i);
        if (i == 0) {
            z = true;
        } else {
            z = false;
        }
        h(z);
    }

    @Override // android.view.View
    public void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        h(false);
    }

    public void p() {
        if (getProgressDrawable() != null && getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().E().d(this.l1);
        }
    }

    public void q(int i, boolean z) {
        if (isIndeterminate()) {
            if (getProgressDrawable() != null) {
                this.Z0 = i;
                this.a1 = z;
                this.g1 = true;
                if (getIndeterminateDrawable().isVisible() && this.f1.a(getContext().getContentResolver()) != 0.0f) {
                    getIndeterminateDrawable().E().f();
                    return;
                } else {
                    this.l1.b(getIndeterminateDrawable());
                    return;
                }
            }
            return;
        }
        super.setProgress(i);
        if (getProgressDrawable() != null && !z) {
            getProgressDrawable().jumpToCurrentState();
        }
    }

    public void r() {
        if (this.c1 > 0) {
            removeCallbacks(this.j1);
            postDelayed(this.j1, this.c1);
            return;
        }
        this.j1.run();
    }

    public final void s() {
        if (getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().b(this.m1);
            getIndeterminateDrawable().E().j();
        }
        if (getProgressDrawable() != null) {
            getProgressDrawable().b(this.m1);
        }
    }

    @HT1({HT1.a.Y})
    @InterfaceC5056aJ2
    public void setAnimatorDurationScaleProvider(@InterfaceC5670cr1 C6085ea c6085ea) {
        this.f1 = c6085ea;
        if (getProgressDrawable() != null) {
            getProgressDrawable().Z = c6085ea;
        }
        if (getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().Z = c6085ea;
        }
    }

    public void setHideAnimationBehavior(int i) {
        this.Y0.h = i;
        invalidate();
    }

    @Override // android.widget.ProgressBar
    public synchronized void setIndeterminate(boolean z) {
        try {
            if (z == isIndeterminate()) {
                return;
            }
            AbstractC5006a70 abstractC5006a70 = (AbstractC5006a70) getCurrentDrawable();
            if (abstractC5006a70 != null) {
                abstractC5006a70.m();
            }
            super.setIndeterminate(z);
            AbstractC5006a70 abstractC5006a702 = (AbstractC5006a70) getCurrentDrawable();
            if (abstractC5006a702 != null) {
                abstractC5006a702.y(t(), false, false);
            }
            if ((abstractC5006a702 instanceof C6546gP0) && t()) {
                ((C6546gP0) abstractC5006a702).E().i();
            }
            this.g1 = false;
        } catch (Throwable th) {
            throw th;
        }
    }

    public void setIndeterminateAnimatorDurationScale(@InterfaceC2501Av0(from = 0.10000000149011612d, to = 10.0d) float f2) {
        S s = this.Y0;
        if (s.n != f2) {
            s.n = f2;
            getIndeterminateDrawable().E().c();
        }
    }

    @Override // android.widget.ProgressBar
    public void setIndeterminateDrawable(@InterfaceC11300zs1 Drawable drawable) {
        if (drawable instanceof C6546gP0) {
            ((AbstractC5006a70) drawable).m();
            super.setIndeterminateDrawable(drawable);
        } else if (!this.i1) {
            super.setIndeterminateDrawable(drawable);
        } else {
            throw new IllegalArgumentException("Cannot set framework drawable as indeterminate drawable.");
        }
    }

    public void setIndicatorColor(@JF int... iArr) {
        if (iArr.length == 0) {
            iArr = new int[]{C9179r91.b(getContext(), OL1.b.J0, -1)};
        }
        if (!Arrays.equals(getIndicatorColor(), iArr)) {
            this.Y0.e = iArr;
            getIndeterminateDrawable().E().c();
            invalidate();
        }
    }

    public void setIndicatorTrackGapSize(@PK1 int i) {
        S s = this.Y0;
        if (s.i != i) {
            s.i = i;
            s.h();
            invalidate();
        }
    }

    @Override // android.widget.ProgressBar
    public synchronized void setProgress(int i) {
        if (isIndeterminate()) {
            return;
        }
        q(i, false);
    }

    @Override // android.widget.ProgressBar
    public void setProgressDrawable(@InterfaceC11300zs1 Drawable drawable) {
        if (drawable instanceof N20) {
            N20 n20 = (N20) drawable;
            n20.m();
            super.setProgressDrawable(n20);
            n20.U(getProgress() / getMax());
        } else if (!this.i1) {
            super.setProgressDrawable(drawable);
        } else {
            throw new IllegalArgumentException("Cannot set framework drawable as progress drawable.");
        }
    }

    public void setShowAnimationBehavior(int i) {
        this.Y0.g = i;
        invalidate();
    }

    public void setTrackColor(@JF int i) {
        S s = this.Y0;
        if (s.f != i) {
            s.f = i;
            invalidate();
        }
    }

    public void setTrackCornerRadius(@PK1 int i) {
        S s = this.Y0;
        if (s.b != i) {
            s.b = Math.min(i, s.a / 2);
            this.Y0.d = false;
            invalidate();
        }
    }

    public void setTrackCornerRadiusFraction(@InterfaceC2501Av0(from = 0.0d, to = 0.5d) float f2) {
        S s = this.Y0;
        if (s.c != f2) {
            s.c = Math.min(f2, 0.5f);
            this.Y0.d = true;
            invalidate();
        }
    }

    public void setTrackThickness(@PK1 int i) {
        S s = this.Y0;
        if (s.a != i) {
            s.a = i;
            requestLayout();
        }
    }

    public void setVisibilityAfterHide(int i) {
        if (i != 0 && i != 4 && i != 8) {
            throw new IllegalArgumentException("The component's visibility must be one of VISIBLE, INVISIBLE, and GONE defined in View.");
        }
        this.h1 = i;
    }

    public void setWaveAmplitude(@PK1 int i) {
        S s = this.Y0;
        if (s.l != i) {
            s.l = Math.abs(i);
            requestLayout();
        }
    }

    public void setWaveSpeed(@PK1 int i) {
        boolean z;
        this.Y0.m = i;
        N20<S> progressDrawable = getProgressDrawable();
        if (this.Y0.m != 0) {
            z = true;
        } else {
            z = false;
        }
        progressDrawable.S(z);
    }

    public void setWavelength(@PK1 int i) {
        setWavelengthDeterminate(i);
        setWavelengthIndeterminate(i);
    }

    public void setWavelengthDeterminate(@PK1 int i) {
        S s = this.Y0;
        if (s.j != i) {
            s.j = Math.abs(i);
            if (!isIndeterminate()) {
                requestLayout();
            }
        }
    }

    public void setWavelengthIndeterminate(@PK1 int i) {
        S s = this.Y0;
        if (s.k != i) {
            s.k = Math.abs(i);
            if (isIndeterminate()) {
                requestLayout();
            }
        }
    }

    public boolean t() {
        if (isAttachedToWindow() && getWindowVisibility() == 0 && m()) {
            return true;
        }
        return false;
    }

    @Override // android.widget.ProgressBar
    @InterfaceC11300zs1
    public C6546gP0<S> getIndeterminateDrawable() {
        return (C6546gP0) super.getIndeterminateDrawable();
    }

    @Override // android.widget.ProgressBar
    @InterfaceC11300zs1
    public N20<S> getProgressDrawable() {
        return (N20) super.getProgressDrawable();
    }
}
