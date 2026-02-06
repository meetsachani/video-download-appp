package o;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import o.BM1;

/* renamed from: o.gD0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C6498gD0 extends ViewGroup implements InterfaceC5758dD0 {
    public ViewGroup Y0;
    public View Z0;
    public final View a1;
    public int b1;
    public Matrix c1;
    public final ViewTreeObserver.OnPreDrawListener d1;

    /* renamed from: o.gD0$a */
    /* loaded from: classes.dex */
    public class a implements ViewTreeObserver.OnPreDrawListener {
        public a() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            View view;
            C6498gD0.this.postInvalidateOnAnimation();
            C6498gD0 c6498gD0 = C6498gD0.this;
            ViewGroup viewGroup = c6498gD0.Y0;
            if (viewGroup != null && (view = c6498gD0.Z0) != null) {
                viewGroup.endViewTransition(view);
                C6498gD0.this.Y0.postInvalidateOnAnimation();
                C6498gD0 c6498gD02 = C6498gD0.this;
                c6498gD02.Y0 = null;
                c6498gD02.Z0 = null;
                return true;
            }
            return true;
        }
    }

    public C6498gD0(View view) {
        super(view.getContext());
        this.d1 = new a();
        this.a1 = view;
        setWillNotDraw(false);
        setClipChildren(false);
        setLayerType(2, null);
    }

    public static C6498gD0 b(View view, ViewGroup viewGroup, Matrix matrix) {
        int i;
        C6000eD0 c6000eD0;
        if (view.getParent() instanceof ViewGroup) {
            C6000eD0 b = C6000eD0.b(viewGroup);
            C6498gD0 e = e(view);
            if (e != null && (c6000eD0 = (C6000eD0) e.getParent()) != b) {
                i = e.b1;
                c6000eD0.removeView(e);
                e = null;
            } else {
                i = 0;
            }
            if (e == null) {
                if (matrix == null) {
                    matrix = new Matrix();
                    c(view, viewGroup, matrix);
                }
                e = new C6498gD0(view);
                e.h(matrix);
                if (b == null) {
                    b = new C6000eD0(viewGroup);
                } else {
                    b.g();
                }
                d(viewGroup, b);
                d(viewGroup, e);
                b.a(e);
                e.b1 = i;
            } else if (matrix != null) {
                e.h(matrix);
            }
            e.b1++;
            return e;
        }
        throw new IllegalArgumentException("Ghosted views must be parented by a ViewGroup");
    }

    public static void c(View view, ViewGroup viewGroup, Matrix matrix) {
        ViewGroup viewGroup2 = (ViewGroup) view.getParent();
        matrix.reset();
        AI2.h(viewGroup2, matrix);
        matrix.preTranslate(-viewGroup2.getScrollX(), -viewGroup2.getScrollY());
        AI2.i(viewGroup, matrix);
    }

    public static void d(View view, View view2) {
        AI2.e(view2, view2.getLeft(), view2.getTop(), view2.getLeft() + view.getWidth(), view2.getTop() + view.getHeight());
    }

    public static C6498gD0 e(View view) {
        return (C6498gD0) view.getTag(BM1.a.ghost_view);
    }

    public static void f(View view) {
        C6498gD0 e = e(view);
        if (e != null) {
            int i = e.b1 - 1;
            e.b1 = i;
            if (i <= 0) {
                ((C6000eD0) e.getParent()).removeView(e);
            }
        }
    }

    public static void g(View view, C6498gD0 c6498gD0) {
        view.setTag(BM1.a.ghost_view, c6498gD0);
    }

    @Override // o.InterfaceC5758dD0
    public void a(ViewGroup viewGroup, View view) {
        this.Y0 = viewGroup;
        this.Z0 = view;
    }

    public void h(Matrix matrix) {
        this.c1 = matrix;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        g(this.a1, this);
        this.a1.getViewTreeObserver().addOnPreDrawListener(this.d1);
        AI2.g(this.a1, 4);
        if (this.a1.getParent() != null) {
            ((View) this.a1.getParent()).invalidate();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        this.a1.getViewTreeObserver().removeOnPreDrawListener(this.d1);
        AI2.g(this.a1, 0);
        g(this.a1, null);
        if (this.a1.getParent() != null) {
            ((View) this.a1.getParent()).invalidate();
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        C2901Ey.a(canvas, true);
        canvas.setMatrix(this.c1);
        AI2.g(this.a1, 0);
        this.a1.invalidate();
        AI2.g(this.a1, 4);
        drawChild(canvas, this.a1, getDrawingTime());
        C2901Ey.a(canvas, false);
    }

    @Override // android.view.View, o.InterfaceC5758dD0
    public void setVisibility(int i) {
        int i2;
        super.setVisibility(i);
        if (e(this.a1) == this) {
            if (i == 0) {
                i2 = 4;
            } else {
                i2 = 0;
            }
            AI2.g(this.a1, i2);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }
}
