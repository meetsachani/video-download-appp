package androidx.camera.view;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Rational;
import android.util.Size;
import android.view.Display;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import androidx.camera.core.k;
import androidx.camera.view.PreviewView;
import androidx.camera.view.c;
import androidx.camera.view.d;
import androidx.lifecycle.LiveData;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import o.AbstractC2699Cw;
import o.AbstractC8825pj1;
import o.C10201vM;
import o.C3051Gi2;
import o.C3834Oi2;
import o.C3931Pi2;
import o.C5433bs2;
import o.C5901do2;
import o.C6422fx1;
import o.C6515gH1;
import o.C6516gH2;
import o.C7364jn1;
import o.C7433k41;
import o.C7485kH1;
import o.InterfaceC6420fx;
import o.InterfaceC6918hx;
import o.InterfaceC7402jx;
import o.UH2;
import o.W20;

/* loaded from: classes.dex */
public final class PreviewView extends FrameLayout {
    public static final String o1 = "PreviewView";
    public static final int p1 = 17170444;
    public static final d q1 = d.PERFORMANCE;
    public d Y0;
    public androidx.camera.view.c Z0;
    public final androidx.camera.view.b a1;
    public boolean b1;
    public final C7364jn1<h> c1;
    public final AtomicReference<androidx.camera.view.a> d1;
    public AbstractC2699Cw e1;
    public e f1;
    public Executor g1;
    public C7485kH1 h1;
    public final ScaleGestureDetector i1;
    public InterfaceC6918hx j1;
    public MotionEvent k1;
    public final c l1;
    public final View.OnLayoutChangeListener m1;
    public final k.c n1;

    /* loaded from: classes.dex */
    public class a implements k.c {
        public a() {
        }

        public static /* synthetic */ void c(a aVar, androidx.camera.view.a aVar2, InterfaceC7402jx interfaceC7402jx) {
            if (C6515gH1.a(PreviewView.this.d1, aVar2, null)) {
                aVar2.i(h.IDLE);
            }
            aVar2.f();
            interfaceC7402jx.e().d(aVar2);
        }

        public static /* synthetic */ void d(a aVar, InterfaceC7402jx interfaceC7402jx, C3051Gi2 c3051Gi2, C3051Gi2.h hVar) {
            boolean z;
            PreviewView previewView;
            androidx.camera.view.c cVar;
            aVar.getClass();
            C7433k41.a(PreviewView.o1, "Preview transformation info updated. " + hVar);
            if (interfaceC7402jx.n().g() == 0) {
                z = true;
            } else {
                z = false;
            }
            PreviewView.this.a1.r(hVar, c3051Gi2.p(), z);
            if (hVar.e() != -1 && ((cVar = (previewView = PreviewView.this).Z0) == null || !(cVar instanceof androidx.camera.view.e))) {
                previewView.b1 = false;
            } else {
                PreviewView.this.b1 = true;
            }
            PreviewView.this.d();
        }

        @Override // androidx.camera.core.k.c
        public void a(final C3051Gi2 c3051Gi2) {
            Executor executor;
            androidx.camera.view.c eVar;
            if (!C5901do2.f()) {
                C10201vM.o(PreviewView.this.getContext()).execute(new Runnable() { // from class: o.hH1
                    @Override // java.lang.Runnable
                    public final void run() {
                        PreviewView.this.n1.a(c3051Gi2);
                    }
                });
                return;
            }
            C7433k41.a(PreviewView.o1, "Surface requested by Preview.");
            final InterfaceC7402jx l = c3051Gi2.l();
            PreviewView.this.j1 = l.n();
            c3051Gi2.u(C10201vM.o(PreviewView.this.getContext()), new C3051Gi2.i() { // from class: o.iH1
                @Override // o.C3051Gi2.i
                public final void a(C3051Gi2.h hVar) {
                    PreviewView.a.d(PreviewView.a.this, l, c3051Gi2, hVar);
                }
            });
            PreviewView previewView = PreviewView.this;
            if (!PreviewView.f(previewView.Z0, c3051Gi2, previewView.Y0)) {
                PreviewView previewView2 = PreviewView.this;
                if (PreviewView.g(c3051Gi2, previewView2.Y0)) {
                    PreviewView previewView3 = PreviewView.this;
                    eVar = new androidx.camera.view.f(previewView3, previewView3.a1);
                } else {
                    PreviewView previewView4 = PreviewView.this;
                    eVar = new androidx.camera.view.e(previewView4, previewView4.a1);
                }
                previewView2.Z0 = eVar;
            }
            InterfaceC6918hx n = l.n();
            PreviewView previewView5 = PreviewView.this;
            final androidx.camera.view.a aVar = new androidx.camera.view.a(n, previewView5.c1, previewView5.Z0);
            PreviewView.this.d1.set(aVar);
            l.e().b(C10201vM.o(PreviewView.this.getContext()), aVar);
            PreviewView.this.Z0.h(c3051Gi2, new c.a() { // from class: o.jH1
                @Override // androidx.camera.view.c.a
                public final void a() {
                    PreviewView.a.c(PreviewView.a.this, aVar, l);
                }
            });
            PreviewView previewView6 = PreviewView.this;
            e eVar2 = previewView6.f1;
            if (eVar2 != null && (executor = previewView6.g1) != null) {
                previewView6.Z0.j(executor, eVar2);
            }
        }
    }

    /* loaded from: classes.dex */
    public static /* synthetic */ class b {
        public static final /* synthetic */ int[] a;
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[d.values().length];
            b = iArr;
            try {
                iArr[d.COMPATIBLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                b[d.PERFORMANCE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[g.values().length];
            a = iArr2;
            try {
                iArr2[g.FILL_END.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[g.FILL_CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[g.FILL_START.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[g.FIT_END.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[g.FIT_CENTER.ordinal()] = 5;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[g.FIT_START.ordinal()] = 6;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    /* loaded from: classes.dex */
    public class c implements DisplayManager.DisplayListener {
        public c() {
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayAdded(int i) {
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayChanged(int i) {
            Display display = PreviewView.this.getDisplay();
            if (display != null && display.getDisplayId() == i) {
                PreviewView.this.d();
            }
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayRemoved(int i) {
        }
    }

    /* loaded from: classes.dex */
    public enum d {
        PERFORMANCE(0),
        COMPATIBLE(1);
        
        public final int X;

        d(int i) {
            this.X = i;
        }

        public static d g(int i) {
            d[] values;
            for (d dVar : values()) {
                if (dVar.X == i) {
                    return dVar;
                }
            }
            throw new IllegalArgumentException("Unknown implementation mode id " + i);
        }

        public int h() {
            return this.X;
        }
    }

    /* loaded from: classes.dex */
    public interface e {
        void a(long j);
    }

    /* loaded from: classes.dex */
    public class f extends ScaleGestureDetector.SimpleOnScaleGestureListener {
        public f() {
        }

        @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
        public boolean onScale(ScaleGestureDetector scaleGestureDetector) {
            AbstractC2699Cw abstractC2699Cw = PreviewView.this.e1;
            if (abstractC2699Cw != null) {
                abstractC2699Cw.T(scaleGestureDetector.getScaleFactor());
                return true;
            }
            return true;
        }
    }

    /* loaded from: classes.dex */
    public enum g {
        FILL_START(0),
        FILL_CENTER(1),
        FILL_END(2),
        FIT_START(3),
        FIT_CENTER(4),
        FIT_END(5);
        
        public final int X;

        g(int i) {
            this.X = i;
        }

        public static g g(int i) {
            g[] values;
            for (g gVar : values()) {
                if (gVar.X == i) {
                    return gVar;
                }
            }
            throw new IllegalArgumentException("Unknown scale type id " + i);
        }

        public int h() {
            return this.X;
        }
    }

    /* loaded from: classes.dex */
    public enum h {
        IDLE,
        STREAMING
    }

    public PreviewView(Context context) {
        this(context, null);
    }

    public static /* synthetic */ void a(PreviewView previewView, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        previewView.getClass();
        if (i3 - i == i7 - i5 && i4 - i2 == i8 - i6) {
            return;
        }
        previewView.d();
        previewView.b(true);
    }

    public static boolean f(androidx.camera.view.c cVar, C3051Gi2 c3051Gi2, d dVar) {
        if ((cVar instanceof androidx.camera.view.e) && !g(c3051Gi2, dVar)) {
            return true;
        }
        return false;
    }

    public static boolean g(C3051Gi2 c3051Gi2, d dVar) {
        boolean z;
        int i;
        boolean equals = c3051Gi2.l().n().s().equals(InterfaceC6420fx.d);
        if (W20.a(C3931Pi2.class) == null && W20.a(C3834Oi2.class) == null) {
            z = false;
        } else {
            z = true;
        }
        if (Build.VERSION.SDK_INT <= 24 || equals || z || (i = b.b[dVar.ordinal()]) == 1) {
            return true;
        }
        if (i == 2) {
            return false;
        }
        throw new IllegalArgumentException("Invalid implementation mode: " + dVar);
    }

    private DisplayManager getDisplayManager() {
        Context context = getContext();
        if (context == null) {
            return null;
        }
        return (DisplayManager) context.getApplicationContext().getSystemService("display");
    }

    private int getViewPortScaleType() {
        switch (b.a[getScaleType().ordinal()]) {
            case 1:
                return 2;
            case 2:
                return 1;
            case 3:
                return 0;
            case 4:
            case 5:
            case 6:
                return 3;
            default:
                throw new IllegalStateException("Unexpected scale type: " + getScaleType());
        }
    }

    public final void b(boolean z) {
        C5901do2.c();
        UH2 viewPort = getViewPort();
        if (this.e1 != null && viewPort != null && isAttachedToWindow()) {
            try {
                this.e1.e(getSurfaceProvider(), viewPort);
            } catch (IllegalStateException e2) {
                if (z) {
                    C7433k41.d(o1, e2.toString(), e2);
                    return;
                }
                throw e2;
            }
        }
    }

    public UH2 c(int i) {
        C5901do2.c();
        if (getWidth() != 0 && getHeight() != 0) {
            return new UH2.a(new Rational(getWidth(), getHeight()), i).c(getViewPortScaleType()).b(getLayoutDirection()).a();
        }
        return null;
    }

    public void d() {
        C5901do2.c();
        if (this.Z0 != null) {
            j();
            this.Z0.i();
        }
        this.h1.e(new Size(getWidth(), getHeight()), getLayoutDirection());
        AbstractC2699Cw abstractC2699Cw = this.e1;
        if (abstractC2699Cw != null) {
            abstractC2699Cw.J0(getSensorToViewTransform());
        }
    }

    public void e(Executor executor, e eVar) {
        if (this.Y0 != d.PERFORMANCE) {
            this.f1 = eVar;
            this.g1 = executor;
            androidx.camera.view.c cVar = this.Z0;
            if (cVar != null) {
                cVar.j(executor, eVar);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("PERFORMANCE mode doesn't support frame update listener");
    }

    public Bitmap getBitmap() {
        C5901do2.c();
        androidx.camera.view.c cVar = this.Z0;
        if (cVar == null) {
            return null;
        }
        return cVar.a();
    }

    public AbstractC2699Cw getController() {
        C5901do2.c();
        return this.e1;
    }

    public d getImplementationMode() {
        C5901do2.c();
        return this.Y0;
    }

    public AbstractC8825pj1 getMeteringPointFactory() {
        C5901do2.c();
        return this.h1;
    }

    public C6422fx1 getOutputTransform() {
        Matrix matrix;
        C5901do2.c();
        try {
            matrix = this.a1.j(new Size(getWidth(), getHeight()), getLayoutDirection());
        } catch (IllegalStateException unused) {
            matrix = null;
        }
        Rect i = this.a1.i();
        if (matrix != null && i != null) {
            matrix.preConcat(C5433bs2.b(i));
            if (this.Z0 instanceof androidx.camera.view.f) {
                matrix.postConcat(getMatrix());
            } else if (!getMatrix().isIdentity()) {
                C7433k41.p(o1, "PreviewView needs to be in COMPATIBLE mode for the transform to work correctly.");
            }
            return new C6422fx1(matrix, new Size(i.width(), i.height()));
        }
        C7433k41.a(o1, "Transform info is not ready");
        return null;
    }

    public LiveData<h> getPreviewStreamState() {
        return this.c1;
    }

    public g getScaleType() {
        C5901do2.c();
        return this.a1.g();
    }

    public Matrix getSensorToViewTransform() {
        C5901do2.c();
        return this.a1.h(new Size(getWidth(), getHeight()), getLayoutDirection());
    }

    public k.c getSurfaceProvider() {
        C5901do2.c();
        return this.n1;
    }

    public UH2 getViewPort() {
        C5901do2.c();
        if (getDisplay() == null) {
            return null;
        }
        return c(getDisplay().getRotation());
    }

    public final void h() {
        DisplayManager displayManager = getDisplayManager();
        if (displayManager == null) {
            return;
        }
        displayManager.registerDisplayListener(this.l1, new Handler(Looper.getMainLooper()));
    }

    public final void i() {
        DisplayManager displayManager = getDisplayManager();
        if (displayManager == null) {
            return;
        }
        displayManager.unregisterDisplayListener(this.l1);
    }

    public void j() {
        Display display;
        InterfaceC6918hx interfaceC6918hx;
        if (this.b1 && (display = getDisplay()) != null && (interfaceC6918hx = this.j1) != null) {
            this.a1.o(interfaceC6918hx.t(display.getRotation()), display.getRotation());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        h();
        addOnLayoutChangeListener(this.m1);
        androidx.camera.view.c cVar = this.Z0;
        if (cVar != null) {
            cVar.e();
        }
        b(true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeOnLayoutChangeListener(this.m1);
        androidx.camera.view.c cVar = this.Z0;
        if (cVar != null) {
            cVar.f();
        }
        AbstractC2699Cw abstractC2699Cw = this.e1;
        if (abstractC2699Cw != null) {
            abstractC2699Cw.i();
        }
        i();
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        boolean z3;
        if (this.e1 == null) {
            return super.onTouchEvent(motionEvent);
        }
        if (motionEvent.getPointerCount() == 1) {
            z = true;
        } else {
            z = false;
        }
        if (motionEvent.getAction() == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (motionEvent.getEventTime() - motionEvent.getDownTime() < ViewConfiguration.getLongPressTimeout()) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z && z2 && z3) {
            this.k1 = motionEvent;
            performClick();
            return true;
        } else if (!this.i1.onTouchEvent(motionEvent) && !super.onTouchEvent(motionEvent)) {
            return false;
        } else {
            return true;
        }
    }

    @Override // android.view.View
    public boolean performClick() {
        float width;
        float height;
        if (this.e1 != null) {
            MotionEvent motionEvent = this.k1;
            if (motionEvent != null) {
                width = motionEvent.getX();
            } else {
                width = getWidth() / 2.0f;
            }
            MotionEvent motionEvent2 = this.k1;
            if (motionEvent2 != null) {
                height = motionEvent2.getY();
            } else {
                height = getHeight() / 2.0f;
            }
            this.e1.U(this.h1, width, height);
        }
        this.k1 = null;
        return super.performClick();
    }

    public void setController(AbstractC2699Cw abstractC2699Cw) {
        C5901do2.c();
        AbstractC2699Cw abstractC2699Cw2 = this.e1;
        if (abstractC2699Cw2 != null && abstractC2699Cw2 != abstractC2699Cw) {
            abstractC2699Cw2.i();
        }
        this.e1 = abstractC2699Cw;
        b(false);
    }

    public void setImplementationMode(d dVar) {
        C5901do2.c();
        this.Y0 = dVar;
        if (dVar == d.PERFORMANCE && this.f1 != null) {
            throw new IllegalArgumentException("PERFORMANCE mode doesn't support frame update listener");
        }
    }

    public void setScaleType(g gVar) {
        C5901do2.c();
        this.a1.q(gVar);
        d();
        b(false);
    }

    public PreviewView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PreviewView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public PreviewView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        d dVar = q1;
        this.Y0 = dVar;
        androidx.camera.view.b bVar = new androidx.camera.view.b();
        this.a1 = bVar;
        this.b1 = true;
        this.c1 = new C7364jn1<>(h.IDLE);
        this.d1 = new AtomicReference<>();
        this.h1 = new C7485kH1(bVar);
        this.l1 = new c();
        this.m1 = new View.OnLayoutChangeListener() { // from class: o.fH1
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
                PreviewView.a(PreviewView.this, view, i3, i4, i5, i6, i7, i8, i9, i10);
            }
        };
        this.n1 = new a();
        C5901do2.c();
        Resources.Theme theme = context.getTheme();
        int[] iArr = d.c.a;
        TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, iArr, i, i2);
        C6516gH2.G1(this, context, iArr, attributeSet, obtainStyledAttributes, i, i2);
        try {
            setScaleType(g.g(obtainStyledAttributes.getInteger(d.c.c, bVar.g().h())));
            setImplementationMode(d.g(obtainStyledAttributes.getInteger(d.c.b, dVar.h())));
            obtainStyledAttributes.recycle();
            this.i1 = new ScaleGestureDetector(context, new f());
            if (getBackground() == null) {
                setBackgroundColor(C10201vM.g(getContext(), p1));
            }
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }
}
