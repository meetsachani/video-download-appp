package o;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import o.HT1;

@HT1({HT1.a.Y})
/* renamed from: o.dp1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C5904dp1 extends FrameLayout {
    public int Y0;
    public boolean Z0;

    public C5904dp1(@InterfaceC5670cr1 Context context) {
        super(context);
        this.Y0 = 0;
        this.Z0 = false;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        int childCount = getChildCount();
        int i5 = this.Y0;
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int max = Math.max(i5, childAt.getTop()) + layoutParams.topMargin;
            childAt.layout(childAt.getLeft(), max, childAt.getRight(), childAt.getMeasuredHeight() + max);
            i5 = max + childAt.getMeasuredHeight() + layoutParams.bottomMargin;
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int childCount = getChildCount();
        int i3 = 0;
        View childAt = getChildAt(0);
        int size = View.MeasureSpec.getSize(i2);
        if (childCount > 1) {
            View childAt2 = getChildAt(0);
            measureChild(childAt2, i, i2);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt2.getLayoutParams();
            i3 = layoutParams.topMargin + childAt2.getMeasuredHeight() + layoutParams.bottomMargin;
            int i4 = (size - i3) - this.Y0;
            childAt = getChildAt(1);
            if (!this.Z0) {
                i2 = View.MeasureSpec.makeMeasureSpec(i4, Integer.MIN_VALUE);
            }
        }
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        measureChild(childAt, i, i2);
        setMeasuredDimension(getMeasuredWidth(), Math.max(size, this.Y0 + i3 + childAt.getMeasuredHeight() + layoutParams2.bottomMargin + layoutParams2.topMargin));
    }

    public void setPaddingTop(int i) {
        this.Y0 = i;
    }

    public void setScrollingEnabled(boolean z) {
        this.Z0 = z;
    }
}
