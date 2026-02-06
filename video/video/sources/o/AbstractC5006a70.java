package o;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.util.Property;
import java.util.ArrayList;
import java.util.List;
import o.InterfaceC8441o9;

/* renamed from: o.a70  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC5006a70 extends Drawable implements InterfaceC8441o9 {
    public static final float l1 = -1.0f;
    public static final boolean m1 = false;
    public static final int n1 = 500;
    public static final Property<AbstractC5006a70, Float> o1 = new c(Float.class, "growFraction");
    public final Context X;
    public final AbstractC2755Dl Y;
    public ValueAnimator Y0;
    public ValueAnimator Z0;
    public boolean a1;
    public boolean b1;
    public float c1;
    public List<InterfaceC8441o9.a> e1;
    public InterfaceC8441o9.a f1;
    public boolean g1;
    public float h1;
    @BR0(from = 0, to = YX1.d)
    public int j1;
    public float d1 = -1.0f;
    public final Paint i1 = new Paint();
    @InterfaceC5670cr1
    public Rect k1 = new Rect();
    public C6085ea Z = new C6085ea();

    /* renamed from: o.a70$a */
    /* loaded from: classes3.dex */
    public class a extends AnimatorListenerAdapter {
        public a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            AbstractC5006a70.this.h();
        }
    }

    /* renamed from: o.a70$b */
    /* loaded from: classes3.dex */
    public class b extends AnimatorListenerAdapter {
        public b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            AbstractC5006a70.super.setVisible(false, false);
            AbstractC5006a70.this.g();
        }
    }

    /* renamed from: o.a70$c */
    /* loaded from: classes3.dex */
    public class c extends Property<AbstractC5006a70, Float> {
        public c(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a */
        public Float get(AbstractC5006a70 abstractC5006a70) {
            return Float.valueOf(abstractC5006a70.j());
        }

        @Override // android.util.Property
        /* renamed from: b */
        public void set(AbstractC5006a70 abstractC5006a70, Float f) {
            abstractC5006a70.r(f.floatValue());
        }
    }

    public AbstractC5006a70(@InterfaceC5670cr1 Context context, @InterfaceC5670cr1 AbstractC2755Dl abstractC2755Dl) {
        this.X = context;
        this.Y = abstractC2755Dl;
        setAlpha(255);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        InterfaceC8441o9.a aVar = this.f1;
        if (aVar != null) {
            aVar.b(this);
        }
        List<InterfaceC8441o9.a> list = this.e1;
        if (list != null && !this.g1) {
            for (InterfaceC8441o9.a aVar2 : list) {
                aVar2.b(this);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        InterfaceC8441o9.a aVar = this.f1;
        if (aVar != null) {
            aVar.c(this);
        }
        List<InterfaceC8441o9.a> list = this.e1;
        if (list != null && !this.g1) {
            for (InterfaceC8441o9.a aVar2 : list) {
                aVar2.c(this);
            }
        }
    }

    public boolean b(@InterfaceC5670cr1 InterfaceC8441o9.a aVar) {
        List<InterfaceC8441o9.a> list = this.e1;
        if (list != null && list.contains(aVar)) {
            this.e1.remove(aVar);
            if (this.e1.isEmpty()) {
                this.e1 = null;
                return true;
            }
            return true;
        }
        return false;
    }

    public void c(@InterfaceC5670cr1 InterfaceC8441o9.a aVar) {
        if (this.e1 == null) {
            this.e1 = new ArrayList();
        }
        if (!this.e1.contains(aVar)) {
            this.e1.add(aVar);
        }
    }

    public void clearAnimationCallbacks() {
        this.e1.clear();
        this.e1 = null;
    }

    public final void f(@InterfaceC5670cr1 ValueAnimator... valueAnimatorArr) {
        boolean z = this.g1;
        this.g1 = true;
        for (ValueAnimator valueAnimator : valueAnimatorArr) {
            valueAnimator.cancel();
        }
        this.g1 = z;
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.j1;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    public final void i(@InterfaceC5670cr1 ValueAnimator... valueAnimatorArr) {
        boolean z = this.g1;
        this.g1 = true;
        for (ValueAnimator valueAnimator : valueAnimatorArr) {
            valueAnimator.end();
        }
        this.g1 = z;
    }

    public boolean isRunning() {
        if (!p() && !o()) {
            return false;
        }
        return true;
    }

    public float j() {
        if (!this.Y.d() && !this.Y.c()) {
            return 1.0f;
        }
        if (!this.b1 && !this.a1) {
            return this.h1;
        }
        return this.c1;
    }

    @InterfaceC5670cr1
    public ValueAnimator k() {
        return this.Z0;
    }

    public float l() {
        int i;
        float f = this.d1;
        if (f > 0.0f) {
            return f;
        }
        if (this.Y.b(n()) && this.Y.m != 0) {
            float a2 = this.Z.a(this.X.getContentResolver());
            if (a2 > 0.0f) {
                if (n()) {
                    i = this.Y.j;
                } else {
                    i = this.Y.k;
                }
                int i2 = (int) (((i * 1000.0f) / this.Y.m) * a2);
                float uptimeMillis = ((float) (SystemClock.uptimeMillis() % i2)) / i2;
                if (uptimeMillis < 0.0f) {
                    return (uptimeMillis % 1.0f) + 1.0f;
                }
                return uptimeMillis;
            }
        }
        return 0.0f;
    }

    public boolean m() {
        return y(false, false, false);
    }

    public final boolean n() {
        return this instanceof N20;
    }

    public boolean o() {
        ValueAnimator valueAnimator = this.Z0;
        if ((valueAnimator != null && valueAnimator.isRunning()) || this.b1) {
            return true;
        }
        return false;
    }

    public boolean p() {
        ValueAnimator valueAnimator = this.Y0;
        if ((valueAnimator != null && valueAnimator.isRunning()) || this.a1) {
            return true;
        }
        return false;
    }

    public final void q() {
        if (this.Y0 == null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, o1, 0.0f, 1.0f);
            this.Y0 = ofFloat;
            ofFloat.setDuration(500L);
            this.Y0.setInterpolator(C5600ca.b);
            x(this.Y0);
        }
        if (this.Z0 == null) {
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this, o1, 1.0f, 0.0f);
            this.Z0 = ofFloat2;
            ofFloat2.setDuration(500L);
            this.Z0.setInterpolator(C5600ca.b);
            s(this.Z0);
        }
    }

    public void r(@InterfaceC2501Av0(from = 0.0d, to = 1.0d) float f) {
        if (this.h1 != f) {
            this.h1 = f;
            invalidateSelf();
        }
    }

    public final void s(@InterfaceC5670cr1 ValueAnimator valueAnimator) {
        ValueAnimator valueAnimator2 = this.Z0;
        if (valueAnimator2 != null && valueAnimator2.isRunning()) {
            throw new IllegalArgumentException("Cannot set hideAnimator while the current hideAnimator is running.");
        }
        this.Z0 = valueAnimator;
        valueAnimator.addListener(new b());
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(@BR0(from = 0, to = 255) int i) {
        this.j1 = i;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(@InterfaceC11300zs1 ColorFilter colorFilter) {
        this.i1.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        return y(z, z2, true);
    }

    public void start() {
        z(true, true, false);
    }

    public void stop() {
        z(false, true, false);
    }

    public void t(@InterfaceC5670cr1 InterfaceC8441o9.a aVar) {
        this.f1 = aVar;
    }

    @InterfaceC5056aJ2
    public void u(boolean z, @InterfaceC2501Av0(from = 0.0d, to = 1.0d) float f) {
        this.b1 = z;
        this.c1 = f;
    }

    @InterfaceC5056aJ2
    public void v(@InterfaceC2501Av0(from = 0.0d, to = 1.0d) float f) {
        this.d1 = f;
    }

    @InterfaceC5056aJ2
    public void w(boolean z, @InterfaceC2501Av0(from = 0.0d, to = 1.0d) float f) {
        this.a1 = z;
        this.c1 = f;
    }

    public final void x(@InterfaceC5670cr1 ValueAnimator valueAnimator) {
        ValueAnimator valueAnimator2 = this.Y0;
        if (valueAnimator2 != null && valueAnimator2.isRunning()) {
            throw new IllegalArgumentException("Cannot set showAnimator while the current showAnimator is running.");
        }
        this.Y0 = valueAnimator;
        valueAnimator.addListener(new a());
    }

    public boolean y(boolean z, boolean z2, boolean z3) {
        boolean z4;
        float a2 = this.Z.a(this.X.getContentResolver());
        if (z3 && a2 > 0.0f) {
            z4 = true;
        } else {
            z4 = false;
        }
        return z(z, z2, z4);
    }

    public boolean z(boolean z, boolean z2, boolean z3) {
        ValueAnimator valueAnimator;
        ValueAnimator valueAnimator2;
        boolean c2;
        q();
        boolean z4 = false;
        if (!isVisible() && !z) {
            return false;
        }
        if (z) {
            valueAnimator = this.Y0;
        } else {
            valueAnimator = this.Z0;
        }
        if (z) {
            valueAnimator2 = this.Z0;
        } else {
            valueAnimator2 = this.Y0;
        }
        if (!z3) {
            if (valueAnimator2.isRunning()) {
                f(valueAnimator2);
            }
            if (valueAnimator.isRunning()) {
                valueAnimator.end();
            } else {
                i(valueAnimator);
            }
            return super.setVisible(z, false);
        } else if (valueAnimator.isRunning()) {
            return false;
        } else {
            z4 = (!z || super.setVisible(z, false)) ? true : true;
            if (z) {
                c2 = this.Y.d();
            } else {
                c2 = this.Y.c();
            }
            if (!c2) {
                i(valueAnimator);
                return z4;
            } else if (!z2 && valueAnimator.isPaused()) {
                valueAnimator.resume();
                return z4;
            } else {
                valueAnimator.start();
                return z4;
            }
        }
    }
}
