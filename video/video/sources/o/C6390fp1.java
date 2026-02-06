package o;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import o.HT1;

@HT1({HT1.a.Y})
/* renamed from: o.fp1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C6390fp1 extends AbstractC3661Mo1 {
    @PK1
    public int Z1;
    @PK1
    public int a2;
    public final FrameLayout.LayoutParams b2;

    public C6390fp1(@InterfaceC5670cr1 Context context) {
        super(context);
        this.Z1 = -1;
        this.a2 = 0;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        this.b2 = layoutParams;
        layoutParams.gravity = 49;
        setLayoutParams(layoutParams);
        setItemActiveIndicatorResizeable(true);
    }

    public final int A(int i, int i2, int i3) {
        int max = i2 / Math.max(1, i3);
        int i4 = this.Z1;
        if (i4 == -1) {
            i4 = View.MeasureSpec.getSize(i);
        }
        return View.MeasureSpec.makeMeasureSpec(Math.min(i4, max), 0);
    }

    public final int B(View view, int i, int i2) {
        view.measure(i, i2);
        if (view.getVisibility() != 8) {
            return view.getMeasuredHeight();
        }
        return 0;
    }

    public final int C(int i, int i2, int i3, View view) {
        int makeMeasureSpec;
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i2, 0);
        int childCount = getChildCount();
        int i4 = 0;
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (!(childAt instanceof AbstractC3270Io1)) {
                int B = B(childAt, i, makeMeasureSpec2);
                i2 -= B;
                i4 += B;
            }
        }
        int max = Math.max(i2, 0);
        if (view == null) {
            makeMeasureSpec = A(i, max, i3);
        } else {
            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(view.getMeasuredHeight(), 0);
        }
        int i6 = 0;
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt2 = getChildAt(i7);
            if (childAt2.getVisibility() == 0) {
                i6++;
            }
            if ((childAt2 instanceof AbstractC3270Io1) && childAt2 != view) {
                i4 += B(childAt2, i, makeMeasureSpec);
            }
        }
        return i4 + (Math.max(0, i6 - 1) * this.a2);
    }

    public final int D(int i, int i2, int i3) {
        int i4;
        View childAt = getChildAt(getSelectedItemPosition());
        if (childAt != null) {
            i4 = B(childAt, i, A(i, i2, i3));
            i2 -= i4;
            i3--;
        } else {
            i4 = 0;
        }
        return i4 + C(i, i2, i3, childAt);
    }

    @PK1
    public int getItemMinimumHeight() {
        return this.Z1;
    }

    @PK1
    public int getItemSpacing() {
        return this.a2;
    }

    public int getMenuGravity() {
        return this.b2.gravity;
    }

    @Override // o.AbstractC3661Mo1
    @InterfaceC5670cr1
    public AbstractC3270Io1 h(@InterfaceC5670cr1 Context context) {
        return new C6147ep1(context);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int max;
        int childCount = getChildCount();
        int i5 = i3 - i;
        int i6 = 0;
        int i7 = 0;
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            if (childAt.getVisibility() != 8) {
                i7 += childAt.getMeasuredHeight();
                i6++;
            }
        }
        if (i6 <= 1) {
            max = 0;
        } else {
            max = Math.max(0, Math.min((getMeasuredHeight() - i7) / (i6 - 1), this.a2));
        }
        int i9 = 0;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt2 = getChildAt(i10);
            if (childAt2.getVisibility() != 8) {
                int measuredHeight = childAt2.getMeasuredHeight();
                childAt2.layout(0, i9, i5, measuredHeight + i9);
                i9 += measuredHeight + max;
            }
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int C;
        int size = View.MeasureSpec.getSize(i2);
        int currentVisibleContentItemCount = getCurrentVisibleContentItemCount();
        if (currentVisibleContentItemCount > 1 && o(getLabelVisibilityMode(), currentVisibleContentItemCount)) {
            C = D(i, size, currentVisibleContentItemCount);
        } else {
            C = C(i, size, currentVisibleContentItemCount, null);
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i), View.resolveSizeAndState(C, i2, 0));
    }

    public void setItemMinimumHeight(@PK1 int i) {
        if (this.Z1 != i) {
            this.Z1 = i;
            requestLayout();
        }
    }

    public void setItemSpacing(@PK1 int i) {
        if (this.a2 != i) {
            this.a2 = i;
            requestLayout();
        }
    }

    public void setMenuGravity(int i) {
        FrameLayout.LayoutParams layoutParams = this.b2;
        if (layoutParams.gravity != i) {
            layoutParams.gravity = i;
            setLayoutParams(layoutParams);
        }
    }
}
