package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import o.C6516gH2;
import o.OL1;

/* loaded from: classes.dex */
public class ButtonBarLayout extends LinearLayout {
    public static final int b1 = 16;
    public boolean Y0;
    public boolean Z0;
    public int a1;

    public ButtonBarLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a1 = -1;
        int[] iArr = OL1.m.q3;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
        C6516gH2.G1(this, context, iArr, attributeSet, obtainStyledAttributes, 0, 0);
        this.Y0 = obtainStyledAttributes.getBoolean(OL1.m.r3, true);
        obtainStyledAttributes.recycle();
        if (getOrientation() == 1) {
            setStacked(this.Y0);
        }
    }

    private void setStacked(boolean z) {
        int i;
        int i2;
        if (this.Z0 != z) {
            if (!z || this.Y0) {
                this.Z0 = z;
                setOrientation(z ? 1 : 0);
                if (z) {
                    i = 8388613;
                } else {
                    i = 80;
                }
                setGravity(i);
                View findViewById = findViewById(OL1.g.i0);
                if (findViewById != null) {
                    if (z) {
                        i2 = 8;
                    } else {
                        i2 = 4;
                    }
                    findViewById.setVisibility(i2);
                }
                for (int childCount = getChildCount() - 2; childCount >= 0; childCount--) {
                    bringChildToFront(getChildAt(childCount));
                }
            }
        }
    }

    public final int a(int i) {
        int childCount = getChildCount();
        while (i < childCount) {
            if (getChildAt(i).getVisibility() == 0) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public final boolean b() {
        return this.Z0;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int i3;
        boolean z;
        int size = View.MeasureSpec.getSize(i);
        int i4 = 0;
        if (this.Y0) {
            if (size > this.a1 && b()) {
                setStacked(false);
            }
            this.a1 = size;
        }
        if (!b() && View.MeasureSpec.getMode(i) == 1073741824) {
            i3 = View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE);
            z = true;
        } else {
            i3 = i;
            z = false;
        }
        super.onMeasure(i3, i2);
        if (this.Y0 && !b() && (getMeasuredWidthAndState() & (-16777216)) == 16777216) {
            setStacked(true);
            z = true;
        }
        if (z) {
            super.onMeasure(i, i2);
        }
        int a = a(0);
        if (a >= 0) {
            View childAt = getChildAt(a);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
            int paddingTop = getPaddingTop() + childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            if (b()) {
                int a2 = a(a + 1);
                if (a2 >= 0) {
                    paddingTop += getChildAt(a2).getPaddingTop() + ((int) (getResources().getDisplayMetrics().density * 16.0f));
                }
                i4 = paddingTop;
            } else {
                i4 = paddingTop + getPaddingBottom();
            }
        }
        if (C6516gH2.j0(this) != i4) {
            setMinimumHeight(i4);
            if (i2 == 0) {
                super.onMeasure(i, i2);
            }
        }
    }

    public void setAllowStacking(boolean z) {
        if (this.Y0 != z) {
            this.Y0 = z;
            if (!z && b()) {
                setStacked(false);
            }
            requestLayout();
        }
    }
}
