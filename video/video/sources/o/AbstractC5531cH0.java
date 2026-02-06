package o;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.List;

/* renamed from: o.cH0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC5531cH0 extends KH2<View> {
    public final Rect Y0;
    public final Rect Z0;
    public int a1;
    public int b1;

    public AbstractC5531cH0() {
        this.Y0 = new Rect();
        this.Z0 = new Rect();
        this.a1 = 0;
    }

    public static int c0(int i) {
        if (i == 0) {
            return 8388659;
        }
        return i;
    }

    @Override // o.KH2
    public void R(@InterfaceC5670cr1 CoordinatorLayout coordinatorLayout, @InterfaceC5670cr1 View view, int i) {
        View W = W(coordinatorLayout.w(view));
        if (W != null) {
            CoordinatorLayout.g gVar = (CoordinatorLayout.g) view.getLayoutParams();
            Rect rect = this.Y0;
            rect.set(coordinatorLayout.getPaddingLeft() + ((ViewGroup.MarginLayoutParams) gVar).leftMargin, W.getBottom() + ((ViewGroup.MarginLayoutParams) gVar).topMargin, (coordinatorLayout.getWidth() - coordinatorLayout.getPaddingRight()) - ((ViewGroup.MarginLayoutParams) gVar).rightMargin, ((coordinatorLayout.getHeight() + W.getBottom()) - coordinatorLayout.getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) gVar).bottomMargin);
            RL2 lastWindowInsets = coordinatorLayout.getLastWindowInsets();
            if (lastWindowInsets != null && coordinatorLayout.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
                rect.left += lastWindowInsets.p();
                rect.right -= lastWindowInsets.q();
            }
            Rect rect2 = this.Z0;
            Gravity.apply(c0(gVar.c), view.getMeasuredWidth(), view.getMeasuredHeight(), rect, rect2, i);
            int X = X(W);
            view.layout(rect2.left, rect2.top - X, rect2.right, rect2.bottom - X);
            this.a1 = rect2.top - W.getBottom();
            return;
        }
        super.R(coordinatorLayout, view, i);
        this.a1 = 0;
    }

    @InterfaceC11300zs1
    public abstract View W(List<View> list);

    public final int X(View view) {
        if (this.b1 == 0) {
            return 0;
        }
        float Y = Y(view);
        int i = this.b1;
        return C9293rd1.e((int) (Y * i), 0, i);
    }

    public float Y(View view) {
        return 1.0f;
    }

    public final int Z() {
        return this.b1;
    }

    public int a0(@InterfaceC5670cr1 View view) {
        return view.getMeasuredHeight();
    }

    public final int b0() {
        return this.a1;
    }

    public final void d0(int i) {
        this.b1 = i;
    }

    public boolean e0() {
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean u(@InterfaceC5670cr1 CoordinatorLayout coordinatorLayout, @InterfaceC5670cr1 View view, int i, int i2, int i3, int i4) {
        View W;
        int i5;
        RL2 lastWindowInsets;
        int i6 = view.getLayoutParams().height;
        if ((i6 == -1 || i6 == -2) && (W = W(coordinatorLayout.w(view))) != null) {
            int size = View.MeasureSpec.getSize(i3);
            if (size > 0) {
                if (W.getFitsSystemWindows() && (lastWindowInsets = coordinatorLayout.getLastWindowInsets()) != null) {
                    size += lastWindowInsets.r() + lastWindowInsets.o();
                }
            } else {
                size = coordinatorLayout.getHeight();
            }
            int a0 = size + a0(W);
            int measuredHeight = W.getMeasuredHeight();
            if (e0()) {
                view.setTranslationY(-measuredHeight);
            } else {
                view.setTranslationY(0.0f);
                a0 -= measuredHeight;
            }
            if (i6 == -1) {
                i5 = 1073741824;
            } else {
                i5 = Integer.MIN_VALUE;
            }
            coordinatorLayout.O(view, i, i2, View.MeasureSpec.makeMeasureSpec(a0, i5), i4);
            return true;
        }
        return false;
    }

    public AbstractC5531cH0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.Y0 = new Rect();
        this.Z0 = new Rect();
        this.a1 = 0;
    }
}
