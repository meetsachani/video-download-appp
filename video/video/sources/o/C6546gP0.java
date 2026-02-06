package o;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import java.util.List;
import o.AbstractC2755Dl;
import o.AbstractC6717h70;
import o.C7025iN1;
import o.HT1;
import o.InterfaceC8441o9;

/* renamed from: o.gP0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C6546gP0<S extends AbstractC2755Dl> extends AbstractC5006a70 {
    public AbstractC6717h70<S> p1;
    public AbstractC6291fP0<ObjectAnimator> q1;
    public Drawable r1;

    public C6546gP0(@InterfaceC5670cr1 Context context, @InterfaceC5670cr1 AbstractC2755Dl abstractC2755Dl, @InterfaceC5670cr1 AbstractC6717h70<S> abstractC6717h70, @InterfaceC5670cr1 AbstractC6291fP0<ObjectAnimator> abstractC6291fP0) {
        super(context, abstractC2755Dl);
        J(abstractC6717h70);
        I(abstractC6291fP0);
    }

    @InterfaceC5670cr1
    public static C6546gP0<KC> A(@InterfaceC5670cr1 Context context, @InterfaceC5670cr1 KC kc) {
        return B(context, kc, new AC(kc));
    }

    @InterfaceC5670cr1
    public static C6546gP0<KC> B(@InterfaceC5670cr1 Context context, @InterfaceC5670cr1 KC kc, @InterfaceC5670cr1 AC ac) {
        AbstractC6291fP0 ec;
        if (kc.f508o == 1) {
            ec = new FC(context, kc);
        } else {
            ec = new EC(kc);
        }
        C6546gP0<KC> c6546gP0 = new C6546gP0<>(context, kc, ac, ec);
        c6546gP0.K(ME2.d(context.getResources(), C7025iN1.g.ic_mtrl_arrow_circle, null));
        return c6546gP0;
    }

    @InterfaceC5670cr1
    public static C6546gP0<C9629t01> C(@InterfaceC5670cr1 Context context, @InterfaceC5670cr1 C9629t01 c9629t01) {
        return D(context, c9629t01, new C6192f01(c9629t01));
    }

    @InterfaceC5670cr1
    public static C6546gP0<C9629t01> D(@InterfaceC5670cr1 Context context, @InterfaceC5670cr1 C9629t01 c9629t01, @InterfaceC5670cr1 C6192f01 c6192f01) {
        AbstractC6291fP0 c6690h01;
        if (c9629t01.f866o == 0) {
            c6690h01 = new C6435g01(c9629t01);
        } else {
            c6690h01 = new C6690h01(context, c9629t01);
        }
        return new C6546gP0<>(context, c9629t01, c6192f01, c6690h01);
    }

    @InterfaceC5670cr1
    public AbstractC6291fP0<ObjectAnimator> E() {
        return this.q1;
    }

    @InterfaceC5670cr1
    public AbstractC6717h70<S> F() {
        return this.p1;
    }

    @InterfaceC11300zs1
    @HT1({HT1.a.Y})
    public Drawable G() {
        return this.r1;
    }

    public final boolean H() {
        C6085ea c6085ea = this.Z;
        if (c6085ea == null || c6085ea.a(this.X.getContentResolver()) != 0.0f) {
            return false;
        }
        return true;
    }

    public void I(@InterfaceC5670cr1 AbstractC6291fP0<ObjectAnimator> abstractC6291fP0) {
        this.q1 = abstractC6291fP0;
        abstractC6291fP0.e(this);
    }

    public void J(@InterfaceC5670cr1 AbstractC6717h70<S> abstractC6717h70) {
        this.p1 = abstractC6717h70;
    }

    @HT1({HT1.a.Y})
    @InterfaceC5056aJ2
    public void K(@InterfaceC11300zs1 Drawable drawable) {
        this.r1 = drawable;
    }

    @Override // o.AbstractC5006a70, o.InterfaceC8441o9
    public /* bridge */ /* synthetic */ boolean b(@InterfaceC5670cr1 InterfaceC8441o9.a aVar) {
        return super.b(aVar);
    }

    @Override // o.AbstractC5006a70, o.InterfaceC8441o9
    public /* bridge */ /* synthetic */ void c(@InterfaceC5670cr1 InterfaceC8441o9.a aVar) {
        super.c(aVar);
    }

    @Override // o.AbstractC5006a70, o.InterfaceC8441o9
    public /* bridge */ /* synthetic */ void clearAnimationCallbacks() {
        super.clearAnimationCallbacks();
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0109  */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void draw(@InterfaceC5670cr1 Canvas canvas) {
        boolean z;
        boolean z2;
        Canvas canvas2;
        int i;
        Drawable drawable;
        if (!getBounds().isEmpty() && isVisible() && canvas.getClipBounds(this.k1)) {
            int i2 = 0;
            if (H() && (drawable = this.r1) != null) {
                drawable.setBounds(getBounds());
                this.r1.setTint(this.Y.e[0]);
                this.r1.draw(canvas);
                return;
            }
            canvas.save();
            this.p1.h(canvas, getBounds(), j(), p(), o());
            int i3 = this.Y.i;
            int alpha = getAlpha();
            AbstractC2755Dl abstractC2755Dl = this.Y;
            if (!(abstractC2755Dl instanceof C9629t01) && (!(abstractC2755Dl instanceof KC) || !((KC) abstractC2755Dl).s)) {
                z = false;
            } else {
                z = true;
            }
            if (z && i3 == 0 && !abstractC2755Dl.b(false)) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                canvas2 = canvas;
                this.p1.d(canvas2, this.i1, 0.0f, 1.0f, this.Y.f, alpha, 0);
            } else if (z) {
                AbstractC6717h70.a aVar = this.q1.b.get(0);
                List<AbstractC6717h70.a> list = this.q1.b;
                AbstractC6717h70.a aVar2 = list.get(list.size() - 1);
                AbstractC6717h70<S> abstractC6717h70 = this.p1;
                if (abstractC6717h70 instanceof C6192f01) {
                    i = i3;
                    abstractC6717h70.d(canvas, this.i1, 0.0f, aVar.a, this.Y.f, alpha, i);
                    canvas2 = canvas;
                    this.p1.d(canvas2, this.i1, aVar2.b, 1.0f, this.Y.f, alpha, i);
                } else {
                    canvas2 = canvas;
                    i = i3;
                    canvas.save();
                    canvas.rotate(aVar2.g);
                    this.p1.d(canvas2, this.i1, aVar2.b, aVar.a + 1.0f, this.Y.f, alpha, i);
                    canvas.restore();
                }
                while (i2 < this.q1.b.size()) {
                    AbstractC6717h70.a aVar3 = this.q1.b.get(i2);
                    aVar3.f = l();
                    this.p1.c(canvas, this.i1, aVar3, getAlpha());
                    if (i2 > 0 && !z2 && z) {
                        this.p1.d(canvas2, this.i1, this.q1.b.get(i2 - 1).b, aVar3.a, this.Y.f, alpha, i);
                    }
                    i2++;
                    canvas2 = canvas;
                }
                canvas.restore();
            } else {
                canvas2 = canvas;
            }
            i = i3;
            while (i2 < this.q1.b.size()) {
            }
            canvas.restore();
        }
    }

    @Override // o.AbstractC5006a70, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getAlpha() {
        return super.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.p1.e();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.p1.f();
    }

    @Override // o.AbstractC5006a70, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getOpacity() {
        return super.getOpacity();
    }

    @Override // o.AbstractC5006a70, android.graphics.drawable.Animatable
    public /* bridge */ /* synthetic */ boolean isRunning() {
        return super.isRunning();
    }

    @Override // o.AbstractC5006a70
    public /* bridge */ /* synthetic */ boolean m() {
        return super.m();
    }

    @Override // o.AbstractC5006a70
    public /* bridge */ /* synthetic */ boolean o() {
        return super.o();
    }

    @Override // o.AbstractC5006a70
    public /* bridge */ /* synthetic */ boolean p() {
        return super.p();
    }

    @Override // o.AbstractC5006a70, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setAlpha(@BR0(from = 0, to = 255) int i) {
        super.setAlpha(i);
    }

    @Override // o.AbstractC5006a70, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setColorFilter(@InterfaceC11300zs1 ColorFilter colorFilter) {
        super.setColorFilter(colorFilter);
    }

    @Override // o.AbstractC5006a70, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean setVisible(boolean z, boolean z2) {
        return super.setVisible(z, z2);
    }

    @Override // o.AbstractC5006a70, android.graphics.drawable.Animatable
    public /* bridge */ /* synthetic */ void start() {
        super.start();
    }

    @Override // o.AbstractC5006a70, android.graphics.drawable.Animatable
    public /* bridge */ /* synthetic */ void stop() {
        super.stop();
    }

    @Override // o.AbstractC5006a70
    public /* bridge */ /* synthetic */ boolean y(boolean z, boolean z2, boolean z3) {
        return super.y(z, z2, z3);
    }

    @Override // o.AbstractC5006a70
    public boolean z(boolean z, boolean z2, boolean z3) {
        Drawable drawable;
        boolean z4 = super.z(z, z2, z3);
        if (H() && (drawable = this.r1) != null) {
            return drawable.setVisible(z, z2);
        }
        if (!isRunning()) {
            this.q1.a();
        }
        if (z) {
            if (!z3) {
                return z4;
            }
            this.q1.i();
        }
        return z4;
    }
}
