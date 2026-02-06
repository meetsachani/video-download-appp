package o;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: o.o61  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C8431o61 extends Drawable implements Drawable.Callback, Animatable {
    public static final boolean R1;
    public static final List<String> S1;
    public static final long T1 = 50000000;
    public static final Executor U1;
    public static final float V1 = 50.0f;
    public static final int W1 = 1;
    public static final int X1 = 2;
    public static final int Y1 = -1;
    public RectF A1;
    public Paint B1;
    public Rect C1;
    public Rect D1;
    public RectF E1;
    public RectF F1;
    public Matrix G1;
    public float[] H1;
    public Matrix I1;
    public boolean J1;
    public EnumC3623Mf K1;
    public final ValueAnimator.AnimatorUpdateListener L1;
    public final Semaphore M1;
    public Handler N1;
    public Runnable O1;
    public final Runnable P1;
    public float Q1;
    public C10624x51 X;
    public final N61 Y;
    public boolean Y0;
    public boolean Z;
    public boolean Z0;
    public c a1;
    public final ArrayList<b> b1;
    public C9716tM0 c1;
    public String d1;
    public InterfaceC9473sM0 e1;
    public C4176Rw0 f1;
    public Map<String, Typeface> g1;
    public String h1;
    public C4079Qw0 i1;
    public C9816tm2 j1;
    public final C8918q61 k1;
    public boolean l1;
    public boolean m1;
    public YI n1;
    public int o1;
    public boolean p1;
    public boolean q1;
    public boolean r1;
    public boolean s1;
    public boolean t1;
    public EnumC10223vR1 u1;
    public boolean v1;
    public final Matrix w1;
    public Bitmap x1;
    public Canvas y1;
    public Rect z1;

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* renamed from: o.o61$a */
    /* loaded from: classes.dex */
    public class a<T> extends O61<T> {
        public final /* synthetic */ T72 d;

        public a(T72 t72) {
            this.d = t72;
        }

        @Override // o.O61
        public T a(C9410s61<T> c9410s61) {
            return (T) this.d.a(c9410s61);
        }
    }

    /* renamed from: o.o61$b */
    /* loaded from: classes.dex */
    public interface b {
        void a(C10624x51 c10624x51);
    }

    /* renamed from: o.o61$c */
    /* loaded from: classes.dex */
    public enum c {
        NONE,
        PLAY,
        RESUME
    }

    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: o.o61$d */
    /* loaded from: classes.dex */
    public @interface d {
    }

    static {
        boolean z;
        if (Build.VERSION.SDK_INT <= 25) {
            z = true;
        } else {
            z = false;
        }
        R1 = z;
        S1 = Arrays.asList("reduced motion", "reduced_motion", "reduced-motion", "reducedmotion");
        U1 = new ThreadPoolExecutor(0, 2, 35L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new L61());
    }

    public C8431o61() {
        N61 n61 = new N61();
        this.Y = n61;
        this.Z = true;
        this.Y0 = false;
        this.Z0 = false;
        this.a1 = c.NONE;
        this.b1 = new ArrayList<>();
        this.k1 = new C8918q61();
        this.l1 = false;
        this.m1 = true;
        this.o1 = 255;
        this.t1 = false;
        this.u1 = EnumC10223vR1.AUTOMATIC;
        this.v1 = false;
        this.w1 = new Matrix();
        this.H1 = new float[9];
        this.J1 = false;
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener = new ValueAnimator.AnimatorUpdateListener() { // from class: o.j61
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                C8431o61.j(C8431o61.this, valueAnimator);
            }
        };
        this.L1 = animatorUpdateListener;
        this.M1 = new Semaphore(1);
        this.P1 = new Runnable() { // from class: o.k61
            @Override // java.lang.Runnable
            public final void run() {
                C8431o61.n(C8431o61.this);
            }
        };
        this.Q1 = -3.4028235E38f;
        n61.addUpdateListener(animatorUpdateListener);
    }

    public static /* synthetic */ void j(C8431o61 c8431o61, ValueAnimator valueAnimator) {
        if (c8431o61.R()) {
            c8431o61.invalidateSelf();
            return;
        }
        YI yi = c8431o61.n1;
        if (yi != null) {
            yi.M(c8431o61.Y.l());
        }
    }

    public static /* synthetic */ void n(final C8431o61 c8431o61) {
        YI yi = c8431o61.n1;
        if (yi == null) {
            return;
        }
        try {
            c8431o61.M1.acquire();
            yi.M(c8431o61.Y.l());
            if (R1 && c8431o61.J1) {
                if (c8431o61.N1 == null) {
                    c8431o61.N1 = new Handler(Looper.getMainLooper());
                    c8431o61.O1 = new Runnable() { // from class: o.e61
                        @Override // java.lang.Runnable
                        public final void run() {
                            C8431o61.r(C8431o61.this);
                        }
                    };
                }
                c8431o61.N1.post(c8431o61.O1);
            }
        } catch (InterruptedException unused) {
        } catch (Throwable th) {
            c8431o61.M1.release();
            throw th;
        }
        c8431o61.M1.release();
    }

    public static /* synthetic */ void r(C8431o61 c8431o61) {
        Drawable.Callback callback = c8431o61.getCallback();
        if (callback != null) {
            callback.invalidateDrawable(c8431o61);
        }
    }

    public static boolean x0(float f) {
        if (!Float.isNaN(f) && !Float.isInfinite(f)) {
            return true;
        }
        return false;
    }

    public static boolean y0(RectF rectF) {
        if (x0(rectF.left) && x0(rectF.top) && x0(rectF.right) && x0(rectF.bottom)) {
            return true;
        }
        return false;
    }

    public final void A() {
        C10624x51 c10624x51 = this.X;
        if (c10624x51 == null) {
            return;
        }
        YI yi = new YI(this, C10246vY0.b(c10624x51), c10624x51.k(), c10624x51);
        this.n1 = yi;
        if (this.q1) {
            yi.K(true);
        }
        this.n1.S(this.m1);
    }

    @Deprecated
    public boolean A0() {
        return this.k1.b(EnumC8675p61.MergePathsApi19);
    }

    public void B() {
        this.b1.clear();
        this.Y.cancel();
        if (!isVisible()) {
            this.a1 = c.NONE;
        }
    }

    @Deprecated
    public void B0(boolean z) {
        int i;
        N61 n61 = this.Y;
        if (z) {
            i = -1;
        } else {
            i = 0;
        }
        n61.setRepeatCount(i);
    }

    public void C() {
        if (this.Y.isRunning()) {
            this.Y.cancel();
            if (!isVisible()) {
                this.a1 = c.NONE;
            }
        }
        this.X = null;
        this.n1 = null;
        this.c1 = null;
        this.Q1 = -3.4028235E38f;
        this.Y.j();
        invalidateSelf();
    }

    public void C0() {
        this.b1.clear();
        this.Y.s();
        if (!isVisible()) {
            this.a1 = c.NONE;
        }
    }

    public final void D() {
        C10624x51 c10624x51 = this.X;
        if (c10624x51 == null) {
            return;
        }
        this.v1 = this.u1.g(Build.VERSION.SDK_INT, c10624x51.v(), c10624x51.n());
    }

    public void D0() {
        float f0;
        if (this.n1 == null) {
            this.b1.add(new b() { // from class: o.l61
                @Override // o.C8431o61.b
                public final void a(C10624x51 c10624x51) {
                    C8431o61.this.D0();
                }
            });
            return;
        }
        D();
        if (z(W()) || k0() == 0) {
            if (isVisible()) {
                this.Y.t();
                this.a1 = c.NONE;
            } else {
                this.a1 = c.PLAY;
            }
        }
        if (!z(W())) {
            C10636x81 e0 = e0();
            if (e0 != null) {
                X0((int) e0.b);
            } else {
                if (m0() < 0.0f) {
                    f0 = g0();
                } else {
                    f0 = f0();
                }
                X0((int) f0);
            }
            this.Y.k();
            if (!isVisible()) {
                this.a1 = c.NONE;
            }
        }
    }

    public final void E(Rect rect, RectF rectF) {
        rectF.set(rect.left, rect.top, rect.right, rect.bottom);
    }

    public void E0() {
        this.Y.removeAllListeners();
    }

    public final void F(RectF rectF, Rect rect) {
        rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
    }

    public void F0() {
        this.Y.removeAllUpdateListeners();
        this.Y.addUpdateListener(this.L1);
    }

    public void G0(Animator.AnimatorListener animatorListener) {
        this.Y.removeListener(animatorListener);
    }

    public void H(Canvas canvas, Matrix matrix) {
        YI yi = this.n1;
        C10624x51 c10624x51 = this.X;
        if (yi != null && c10624x51 != null) {
            boolean R = R();
            if (R) {
                try {
                    this.M1.acquire();
                    if (x1()) {
                        o1(this.Y.l());
                    }
                } catch (InterruptedException unused) {
                    if (R) {
                        this.M1.release();
                        if (yi.P() == this.Y.l()) {
                            return;
                        }
                    } else {
                        return;
                    }
                } catch (Throwable th) {
                    if (R) {
                        this.M1.release();
                        if (yi.P() != this.Y.l()) {
                            U1.execute(this.P1);
                        }
                    }
                    throw th;
                }
            }
            if (this.Z0) {
                I(canvas, matrix, yi, this.o1);
            } else {
                I(canvas, matrix, yi, this.o1);
            }
            this.J1 = false;
            if (R) {
                this.M1.release();
                if (yi.P() == this.Y.l()) {
                    return;
                }
                U1.execute(this.P1);
            }
        }
    }

    public void H0(Animator.AnimatorPauseListener animatorPauseListener) {
        this.Y.removePauseListener(animatorPauseListener);
    }

    public final void I(Canvas canvas, Matrix matrix, YI yi, int i) {
        if (this.v1) {
            canvas.save();
            canvas.concat(matrix);
            J0(canvas, yi);
            canvas.restore();
            return;
        }
        yi.e(canvas, matrix, i, null);
    }

    public void I0(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.Y.removeUpdateListener(animatorUpdateListener);
    }

    public final void J(Canvas canvas) {
        YI yi = this.n1;
        C10624x51 c10624x51 = this.X;
        if (yi != null && c10624x51 != null) {
            this.w1.reset();
            Rect bounds = getBounds();
            if (!bounds.isEmpty()) {
                float width = bounds.width() / c10624x51.b().width();
                float height = bounds.height() / c10624x51.b().height();
                this.w1.preTranslate(bounds.left, bounds.top);
                this.w1.preScale(width, height);
            }
            yi.e(canvas, this.w1, this.o1, null);
        }
    }

    public final void J0(Canvas canvas, YI yi) {
        if (this.X != null && yi != null) {
            P();
            canvas.getMatrix(this.G1);
            canvas.getClipBounds(this.z1);
            E(this.z1, this.A1);
            this.G1.mapRect(this.A1);
            F(this.A1, this.z1);
            if (this.m1) {
                this.F1.set(0.0f, 0.0f, getIntrinsicWidth(), getIntrinsicHeight());
            } else {
                yi.h(this.F1, null, false);
            }
            this.G1.mapRect(this.F1);
            Rect bounds = getBounds();
            float width = bounds.width() / getIntrinsicWidth();
            float height = bounds.height() / getIntrinsicHeight();
            N0(this.F1, width, height);
            if (!r0()) {
                RectF rectF = this.F1;
                Rect rect = this.z1;
                rectF.intersect(rect.left, rect.top, rect.right, rect.bottom);
            }
            if (!y0(this.F1)) {
                C7190j41.e("Skipping software rendering: transformed bounds contain non-finite values.");
                return;
            }
            int ceil = (int) Math.ceil(this.F1.width());
            int ceil2 = (int) Math.ceil(this.F1.height());
            if (ceil > 0 && ceil2 > 0) {
                long j = ceil * ceil2;
                if (j > T1) {
                    C7190j41.e("Skipping software rendering: bitmap request exceeds safe pixel count (" + j + C9811tl1.d);
                    return;
                }
                O(ceil, ceil2);
                if (this.J1) {
                    this.G1.getValues(this.H1);
                    float[] fArr = this.H1;
                    float f = fArr[0];
                    float f2 = fArr[4];
                    this.w1.set(this.G1);
                    this.w1.preScale(width, height);
                    Matrix matrix = this.w1;
                    RectF rectF2 = this.F1;
                    matrix.postTranslate(-rectF2.left, -rectF2.top);
                    this.w1.postScale(1.0f / f, 1.0f / f2);
                    this.x1.eraseColor(0);
                    this.y1.setMatrix(C6006eE2.b);
                    this.y1.scale(f, f2);
                    yi.e(this.y1, this.w1, this.o1, null);
                    this.G1.invert(this.I1);
                    this.I1.mapRect(this.E1, this.F1);
                    F(this.E1, this.D1);
                }
                this.C1.set(0, 0, ceil, ceil2);
                canvas.drawBitmap(this.x1, this.C1, this.D1, this.B1);
                return;
            }
            C7190j41.e("Skipping software rendering: transformed bounds have negative values.");
        }
    }

    public void K(EnumC8675p61 enumC8675p61, boolean z) {
        boolean a2 = this.k1.a(enumC8675p61, z);
        if (this.X != null && a2) {
            A();
        }
    }

    public List<AX0> K0(AX0 ax0) {
        if (this.n1 == null) {
            C7190j41.e("Cannot resolve KeyPath. Composition is not set yet.");
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList();
        this.n1.c(ax0, 0, arrayList, new AX0(new String[0]));
        return arrayList;
    }

    @Deprecated
    public void L(boolean z) {
        boolean a2 = this.k1.a(EnumC8675p61.MergePathsApi19, z);
        if (this.X != null && a2) {
            A();
        }
    }

    public void L0() {
        float f0;
        if (this.n1 == null) {
            this.b1.add(new b() { // from class: o.f61
                @Override // o.C8431o61.b
                public final void a(C10624x51 c10624x51) {
                    C8431o61.this.L0();
                }
            });
            return;
        }
        D();
        if (z(W()) || k0() == 0) {
            if (isVisible()) {
                this.Y.x();
                this.a1 = c.NONE;
            } else {
                this.a1 = c.RESUME;
            }
        }
        if (!z(W())) {
            if (m0() < 0.0f) {
                f0 = g0();
            } else {
                f0 = f0();
            }
            X0((int) f0);
            this.Y.k();
            if (!isVisible()) {
                this.a1 = c.NONE;
            }
        }
    }

    @Deprecated
    public boolean M() {
        return this.k1.b(EnumC8675p61.MergePathsApi19);
    }

    public void M0() {
        this.Y.y();
    }

    public void N() {
        this.b1.clear();
        this.Y.k();
        if (!isVisible()) {
            this.a1 = c.NONE;
        }
    }

    public final void N0(RectF rectF, float f, float f2) {
        rectF.set(rectF.left * f, rectF.top * f2, rectF.right * f, rectF.bottom * f2);
    }

    public final void O(int i, int i2) {
        Bitmap bitmap = this.x1;
        if (bitmap != null && bitmap.getWidth() >= i && this.x1.getHeight() >= i2) {
            if (this.x1.getWidth() <= i && this.x1.getHeight() <= i2) {
                return;
            }
            Bitmap createBitmap = Bitmap.createBitmap(this.x1, 0, 0, i, i2);
            this.x1 = createBitmap;
            this.y1.setBitmap(createBitmap);
            this.J1 = true;
            return;
        }
        Bitmap createBitmap2 = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
        this.x1 = createBitmap2;
        this.y1.setBitmap(createBitmap2);
        this.J1 = true;
    }

    public void O0(boolean z) {
        this.r1 = z;
    }

    public final void P() {
        if (this.y1 != null) {
            return;
        }
        this.y1 = new Canvas();
        this.F1 = new RectF();
        this.G1 = new Matrix();
        this.I1 = new Matrix();
        this.z1 = new Rect();
        this.A1 = new RectF();
        this.B1 = new C5353bY0();
        this.C1 = new Rect();
        this.D1 = new Rect();
        this.E1 = new RectF();
    }

    public void P0(boolean z) {
        this.s1 = z;
    }

    public EnumC3623Mf Q() {
        EnumC3623Mf enumC3623Mf = this.K1;
        if (enumC3623Mf != null) {
            return enumC3623Mf;
        }
        return ZX0.d();
    }

    public void Q0(EnumC3623Mf enumC3623Mf) {
        this.K1 = enumC3623Mf;
    }

    public boolean R() {
        if (Q() == EnumC3623Mf.ENABLED) {
            return true;
        }
        return false;
    }

    public void R0(boolean z) {
        if (z != this.t1) {
            this.t1 = z;
            invalidateSelf();
        }
    }

    public Bitmap S(String str) {
        C9716tM0 a0 = a0();
        if (a0 != null) {
            return a0.a(str);
        }
        return null;
    }

    public void S0(boolean z) {
        if (z != this.m1) {
            this.m1 = z;
            YI yi = this.n1;
            if (yi != null) {
                yi.S(z);
            }
            invalidateSelf();
        }
    }

    public boolean T() {
        return this.t1;
    }

    public boolean T0(C10624x51 c10624x51) {
        if (this.X == c10624x51) {
            return false;
        }
        this.J1 = true;
        C();
        this.X = c10624x51;
        A();
        this.Y.z(c10624x51);
        o1(this.Y.getAnimatedFraction());
        Iterator it = new ArrayList(this.b1).iterator();
        while (it.hasNext()) {
            b bVar = (b) it.next();
            if (bVar != null) {
                bVar.a(c10624x51);
            }
            it.remove();
        }
        this.b1.clear();
        c10624x51.B(this.p1);
        D();
        Drawable.Callback callback = getCallback();
        if (callback instanceof ImageView) {
            ImageView imageView = (ImageView) callback;
            imageView.setImageDrawable(null);
            imageView.setImageDrawable(this);
        }
        return true;
    }

    public boolean U() {
        return this.m1;
    }

    public void U0(String str) {
        this.h1 = str;
        C4176Rw0 X = X();
        if (X != null) {
            X.c(str);
        }
    }

    public C10624x51 V() {
        return this.X;
    }

    public void V0(C4079Qw0 c4079Qw0) {
        this.i1 = c4079Qw0;
        C4176Rw0 c4176Rw0 = this.f1;
        if (c4176Rw0 != null) {
            c4176Rw0.d(c4079Qw0);
        }
    }

    public final Context W() {
        Drawable.Callback callback = getCallback();
        if (callback == null || !(callback instanceof View)) {
            return null;
        }
        return ((View) callback).getContext();
    }

    public void W0(Map<String, Typeface> map) {
        if (map == this.g1) {
            return;
        }
        this.g1 = map;
        invalidateSelf();
    }

    public final C4176Rw0 X() {
        if (getCallback() == null) {
            return null;
        }
        if (this.f1 == null) {
            C4176Rw0 c4176Rw0 = new C4176Rw0(getCallback(), this.i1);
            this.f1 = c4176Rw0;
            String str = this.h1;
            if (str != null) {
                c4176Rw0.c(str);
            }
        }
        return this.f1;
    }

    public void X0(final int i) {
        if (this.X == null) {
            this.b1.add(new b() { // from class: o.X51
                @Override // o.C8431o61.b
                public final void a(C10624x51 c10624x51) {
                    C8431o61.this.X0(i);
                }
            });
        } else {
            this.Y.A(i);
        }
    }

    public int Y() {
        return (int) this.Y.m();
    }

    @Deprecated
    public void Y0(boolean z) {
        this.Y0 = z;
    }

    @Deprecated
    public Bitmap Z(String str) {
        C9653t61 c9653t61;
        C9716tM0 a0 = a0();
        if (a0 != null) {
            return a0.a(str);
        }
        C10624x51 c10624x51 = this.X;
        if (c10624x51 == null) {
            c9653t61 = null;
        } else {
            c9653t61 = c10624x51.j().get(str);
        }
        if (c9653t61 == null) {
            return null;
        }
        return c9653t61.b();
    }

    public void Z0(InterfaceC9473sM0 interfaceC9473sM0) {
        this.e1 = interfaceC9473sM0;
        C9716tM0 c9716tM0 = this.c1;
        if (c9716tM0 != null) {
            c9716tM0.e(interfaceC9473sM0);
        }
    }

    public final C9716tM0 a0() {
        C9716tM0 c9716tM0 = this.c1;
        if (c9716tM0 != null && !c9716tM0.c(W())) {
            this.c1 = null;
        }
        if (this.c1 == null) {
            this.c1 = new C9716tM0(getCallback(), this.d1, this.e1, this.X.j());
        }
        return this.c1;
    }

    public void a1(String str) {
        this.d1 = str;
    }

    public String b0() {
        return this.d1;
    }

    public void b1(boolean z) {
        this.l1 = z;
    }

    public C9653t61 c0(String str) {
        C10624x51 c10624x51 = this.X;
        if (c10624x51 == null) {
            return null;
        }
        return c10624x51.j().get(str);
    }

    public void c1(final int i) {
        if (this.X == null) {
            this.b1.add(new b() { // from class: o.a61
                @Override // o.C8431o61.b
                public final void a(C10624x51 c10624x51) {
                    C8431o61.this.c1(i);
                }
            });
        } else {
            this.Y.B(i + 0.99f);
        }
    }

    public boolean d0() {
        return this.l1;
    }

    public void d1(final String str) {
        C10624x51 c10624x51 = this.X;
        if (c10624x51 == null) {
            this.b1.add(new b() { // from class: o.h61
                @Override // o.C8431o61.b
                public final void a(C10624x51 c10624x512) {
                    C8431o61.this.d1(str);
                }
            });
            return;
        }
        C10636x81 l = c10624x51.l(str);
        if (l != null) {
            c1((int) (l.b + l.c));
            return;
        }
        throw new IllegalArgumentException("Cannot find marker with name " + str + UE.h);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        YI yi = this.n1;
        if (yi != null) {
            boolean R = R();
            if (R) {
                try {
                    this.M1.acquire();
                } catch (InterruptedException unused) {
                    if (ZX0.h()) {
                        ZX0.c("Drawable#draw");
                    }
                    if (R) {
                        this.M1.release();
                        if (yi.P() == this.Y.l()) {
                            return;
                        }
                    } else {
                        return;
                    }
                } catch (Throwable th) {
                    if (ZX0.h()) {
                        ZX0.c("Drawable#draw");
                    }
                    if (R) {
                        this.M1.release();
                        if (yi.P() != this.Y.l()) {
                            U1.execute(this.P1);
                        }
                    }
                    throw th;
                }
            }
            if (ZX0.h()) {
                ZX0.b("Drawable#draw");
            }
            if (R && x1()) {
                o1(this.Y.l());
            }
            if (this.Z0) {
                try {
                    if (this.v1) {
                        J0(canvas, yi);
                    } else {
                        J(canvas);
                    }
                } catch (Throwable th2) {
                    C7190j41.c("Lottie crashed in draw!", th2);
                }
            } else if (this.v1) {
                J0(canvas, yi);
            } else {
                J(canvas);
            }
            this.J1 = false;
            if (ZX0.h()) {
                ZX0.c("Drawable#draw");
            }
            if (R) {
                this.M1.release();
                if (yi.P() == this.Y.l()) {
                    return;
                }
                U1.execute(this.P1);
            }
        }
    }

    public C10636x81 e0() {
        C10636x81 c10636x81 = null;
        for (String str : S1) {
            c10636x81 = this.X.l(str);
            if (c10636x81 != null) {
                break;
            }
        }
        return c10636x81;
    }

    public void e1(final float f) {
        C10624x51 c10624x51 = this.X;
        if (c10624x51 == null) {
            this.b1.add(new b() { // from class: o.d61
                @Override // o.C8431o61.b
                public final void a(C10624x51 c10624x512) {
                    C8431o61.this.e1(f);
                }
            });
        } else {
            this.Y.B(C4713Xj1.k(c10624x51.r(), this.X.f(), f));
        }
    }

    public float f0() {
        return this.Y.o();
    }

    public void f1(final int i, final int i2) {
        if (this.X == null) {
            this.b1.add(new b() { // from class: o.Z51
                @Override // o.C8431o61.b
                public final void a(C10624x51 c10624x51) {
                    C8431o61.this.f1(i, i2);
                }
            });
        } else {
            this.Y.C(i, i2 + 0.99f);
        }
    }

    public float g0() {
        return this.Y.p();
    }

    public void g1(final String str) {
        C10624x51 c10624x51 = this.X;
        if (c10624x51 == null) {
            this.b1.add(new b() { // from class: o.W51
                @Override // o.C8431o61.b
                public final void a(C10624x51 c10624x512) {
                    C8431o61.this.g1(str);
                }
            });
            return;
        }
        C10636x81 l = c10624x51.l(str);
        if (l != null) {
            int i = (int) l.b;
            f1(i, ((int) l.c) + i);
            return;
        }
        throw new IllegalArgumentException("Cannot find marker with name " + str + UE.h);
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.o1;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        C10624x51 c10624x51 = this.X;
        if (c10624x51 == null) {
            return -1;
        }
        return c10624x51.b().height();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        C10624x51 c10624x51 = this.X;
        if (c10624x51 == null) {
            return -1;
        }
        return c10624x51.b().width();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    public BC1 h0() {
        C10624x51 c10624x51 = this.X;
        if (c10624x51 != null) {
            return c10624x51.o();
        }
        return null;
    }

    public void h1(final String str, final String str2, final boolean z) {
        float f;
        C10624x51 c10624x51 = this.X;
        if (c10624x51 == null) {
            this.b1.add(new b() { // from class: o.g61
                @Override // o.C8431o61.b
                public final void a(C10624x51 c10624x512) {
                    C8431o61.this.h1(str, str2, z);
                }
            });
            return;
        }
        C10636x81 l = c10624x51.l(str);
        if (l != null) {
            int i = (int) l.b;
            C10636x81 l2 = this.X.l(str2);
            if (l2 != null) {
                float f2 = l2.b;
                if (z) {
                    f = 1.0f;
                } else {
                    f = 0.0f;
                }
                f1(i, (int) (f2 + f));
                return;
            }
            throw new IllegalArgumentException("Cannot find marker with name " + str2 + UE.h);
        }
        throw new IllegalArgumentException("Cannot find marker with name " + str + UE.h);
    }

    public float i0() {
        return this.Y.l();
    }

    public void i1(final float f, final float f2) {
        C10624x51 c10624x51 = this.X;
        if (c10624x51 == null) {
            this.b1.add(new b() { // from class: o.Y51
                @Override // o.C8431o61.b
                public final void a(C10624x51 c10624x512) {
                    C8431o61.this.i1(f, f2);
                }
            });
        } else {
            f1((int) C4713Xj1.k(c10624x51.r(), this.X.f(), f), (int) C4713Xj1.k(this.X.r(), this.X.f(), f2));
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.invalidateDrawable(this);
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        Drawable.Callback callback;
        if (!this.J1) {
            this.J1 = true;
            if ((!R1 || Looper.getMainLooper() == Looper.myLooper()) && (callback = getCallback()) != null) {
                callback.invalidateDrawable(this);
            }
        }
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return s0();
    }

    public EnumC10223vR1 j0() {
        if (this.v1) {
            return EnumC10223vR1.SOFTWARE;
        }
        return EnumC10223vR1.HARDWARE;
    }

    public void j1(final int i) {
        if (this.X == null) {
            this.b1.add(new b() { // from class: o.b61
                @Override // o.C8431o61.b
                public final void a(C10624x51 c10624x51) {
                    C8431o61.this.j1(i);
                }
            });
        } else {
            this.Y.D(i);
        }
    }

    public int k0() {
        return this.Y.getRepeatCount();
    }

    public void k1(final String str) {
        C10624x51 c10624x51 = this.X;
        if (c10624x51 == null) {
            this.b1.add(new b() { // from class: o.i61
                @Override // o.C8431o61.b
                public final void a(C10624x51 c10624x512) {
                    C8431o61.this.k1(str);
                }
            });
            return;
        }
        C10636x81 l = c10624x51.l(str);
        if (l != null) {
            j1((int) l.b);
            return;
        }
        throw new IllegalArgumentException("Cannot find marker with name " + str + UE.h);
    }

    public int l0() {
        return this.Y.getRepeatMode();
    }

    public void l1(final float f) {
        C10624x51 c10624x51 = this.X;
        if (c10624x51 == null) {
            this.b1.add(new b() { // from class: o.m61
                @Override // o.C8431o61.b
                public final void a(C10624x51 c10624x512) {
                    C8431o61.this.l1(f);
                }
            });
        } else {
            j1((int) C4713Xj1.k(c10624x51.r(), this.X.f(), f));
        }
    }

    public float m0() {
        return this.Y.q();
    }

    public void m1(boolean z) {
        if (this.q1 != z) {
            this.q1 = z;
            YI yi = this.n1;
            if (yi != null) {
                yi.K(z);
            }
        }
    }

    public C9816tm2 n0() {
        return this.j1;
    }

    public void n1(boolean z) {
        this.p1 = z;
        C10624x51 c10624x51 = this.X;
        if (c10624x51 != null) {
            c10624x51.B(z);
        }
    }

    public Typeface o0(C3982Pw0 c3982Pw0) {
        Map<String, Typeface> map = this.g1;
        if (map != null) {
            String b2 = c3982Pw0.b();
            if (map.containsKey(b2)) {
                return map.get(b2);
            }
            String c2 = c3982Pw0.c();
            if (map.containsKey(c2)) {
                return map.get(c2);
            }
            String str = c3982Pw0.b() + "-" + c3982Pw0.d();
            if (map.containsKey(str)) {
                return map.get(str);
            }
        }
        C4176Rw0 X = X();
        if (X != null) {
            return X.b(c3982Pw0);
        }
        return null;
    }

    public void o1(final float f) {
        if (this.X == null) {
            this.b1.add(new b() { // from class: o.n61
                @Override // o.C8431o61.b
                public final void a(C10624x51 c10624x51) {
                    C8431o61.this.o1(f);
                }
            });
            return;
        }
        if (ZX0.h()) {
            ZX0.b("Drawable#setProgress");
        }
        this.Y.A(this.X.h(f));
        if (ZX0.h()) {
            ZX0.c("Drawable#setProgress");
        }
    }

    public boolean p0() {
        YI yi = this.n1;
        if (yi != null && yi.Q()) {
            return true;
        }
        return false;
    }

    public void p1(EnumC10223vR1 enumC10223vR1) {
        this.u1 = enumC10223vR1;
        D();
    }

    public boolean q0() {
        YI yi = this.n1;
        if (yi != null && yi.R()) {
            return true;
        }
        return false;
    }

    public void q1(int i) {
        this.Y.setRepeatCount(i);
    }

    public final boolean r0() {
        Drawable.Callback callback = getCallback();
        if (!(callback instanceof View)) {
            return false;
        }
        ViewParent parent = ((View) callback).getParent();
        if (!(parent instanceof ViewGroup)) {
            return false;
        }
        return !((ViewGroup) parent).getClipChildren();
    }

    public void r1(int i) {
        this.Y.setRepeatMode(i);
    }

    public boolean s0() {
        N61 n61 = this.Y;
        if (n61 == null) {
            return false;
        }
        return n61.isRunning();
    }

    public void s1(boolean z) {
        this.Z0 = z;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.scheduleDrawable(this, runnable, j);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.o1 = i;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        C7190j41.e("Use addColorFilter instead.");
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        boolean isVisible = isVisible();
        boolean visible = super.setVisible(z, z2);
        if (z) {
            c cVar = this.a1;
            if (cVar == c.PLAY) {
                D0();
                return visible;
            } else if (cVar == c.RESUME) {
                L0();
                return visible;
            }
        } else if (this.Y.isRunning()) {
            C0();
            this.a1 = c.RESUME;
            return visible;
        } else if (isVisible) {
            this.a1 = c.NONE;
        }
        return visible;
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        Drawable.Callback callback = getCallback();
        if ((callback instanceof View) && ((View) callback).isInEditMode()) {
            return;
        }
        D0();
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        N();
    }

    public boolean t0() {
        if (isVisible()) {
            return this.Y.isRunning();
        }
        c cVar = this.a1;
        if (cVar != c.PLAY && cVar != c.RESUME) {
            return false;
        }
        return true;
    }

    public void t1(float f) {
        this.Y.E(f);
    }

    public void u(Animator.AnimatorListener animatorListener) {
        this.Y.addListener(animatorListener);
    }

    public boolean u0() {
        return this.r1;
    }

    @Deprecated
    public void u1(Boolean bool) {
        this.Z = bool.booleanValue();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.unscheduleDrawable(this, runnable);
    }

    public void v(Animator.AnimatorPauseListener animatorPauseListener) {
        this.Y.addPauseListener(animatorPauseListener);
    }

    public boolean v0() {
        return this.s1;
    }

    public void v1(C9816tm2 c9816tm2) {
        this.j1 = c9816tm2;
    }

    public void w(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.Y.addUpdateListener(animatorUpdateListener);
    }

    public boolean w0(EnumC8675p61 enumC8675p61) {
        return this.k1.b(enumC8675p61);
    }

    public void w1(boolean z) {
        this.Y.F(z);
    }

    public <T> void x(final AX0 ax0, final T t, final O61<T> o61) {
        YI yi = this.n1;
        if (yi == null) {
            this.b1.add(new b() { // from class: o.c61
                @Override // o.C8431o61.b
                public final void a(C10624x51 c10624x51) {
                    C8431o61.this.x(ax0, t, o61);
                }
            });
            return;
        }
        boolean z = true;
        if (ax0 == AX0.c) {
            yi.d(t, o61);
        } else if (ax0.d() != null) {
            ax0.d().d(t, o61);
        } else {
            List<AX0> K0 = K0(ax0);
            for (int i = 0; i < K0.size(); i++) {
                K0.get(i).d().d(t, o61);
            }
            z = true ^ K0.isEmpty();
        }
        if (z) {
            invalidateSelf();
            if (t == D61.H) {
                o1(i0());
            }
        }
    }

    public final boolean x1() {
        C10624x51 c10624x51 = this.X;
        if (c10624x51 == null) {
            return false;
        }
        float f = this.Q1;
        float l = this.Y.l();
        this.Q1 = l;
        if (Math.abs(l - f) * c10624x51.d() < 50.0f) {
            return false;
        }
        return true;
    }

    public <T> void y(AX0 ax0, T t, T72<T> t72) {
        x(ax0, t, new a(t72));
    }

    public Bitmap y1(String str, Bitmap bitmap) {
        C9716tM0 a0 = a0();
        if (a0 == null) {
            C7190j41.e("Cannot update bitmap. Most likely the drawable is not added to a View which prevents Lottie from getting a Context.");
            return null;
        }
        Bitmap f = a0.f(str, bitmap);
        invalidateSelf();
        return f;
    }

    public boolean z(Context context) {
        if (this.Y0) {
            return true;
        }
        if (this.Z && ZX0.f().a(context) == IP1.STANDARD_MOTION) {
            return true;
        }
        return false;
    }

    public boolean z0() {
        if (this.Y.getRepeatCount() == -1) {
            return true;
        }
        return false;
    }

    public boolean z1() {
        if (this.g1 == null && this.j1 == null && this.X.c().y() > 0) {
            return true;
        }
        return false;
    }

    @Deprecated
    public void G() {
    }
}
