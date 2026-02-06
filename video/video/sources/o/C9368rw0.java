package o;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import o.C7025iN1;
import o.HT1;

@HT1({HT1.a.Y})
/* renamed from: o.rw0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C9368rw0 extends ViewGroup {
    public int Y0;
    public int Z0;
    public boolean a1;
    public int b1;

    public C9368rw0(@InterfaceC5670cr1 Context context) {
        this(context, null);
    }

    public static int a(int i, int i2, int i3) {
        if (i2 != Integer.MIN_VALUE) {
            if (i2 != 1073741824) {
                return i3;
            }
            return i;
        }
        return Math.min(i3, i);
    }

    public int b(@InterfaceC5670cr1 View view) {
        Object tag = view.getTag(C7025iN1.h.row_index_key);
        if (!(tag instanceof Integer)) {
            return -1;
        }
        return ((Integer) tag).intValue();
    }

    public boolean c() {
        return this.a1;
    }

    public final void d(@InterfaceC5670cr1 Context context, @InterfaceC11300zs1 AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, C7025iN1.o.j4, 0, 0);
        this.Y0 = obtainStyledAttributes.getDimensionPixelSize(C7025iN1.o.l4, 0);
        this.Z0 = obtainStyledAttributes.getDimensionPixelSize(C7025iN1.o.k4, 0);
        obtainStyledAttributes.recycle();
    }

    public int getItemSpacing() {
        return this.Z0;
    }

    public int getLineSpacing() {
        return this.Y0;
    }

    public int getRowCount() {
        return this.b1;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2;
        int paddingLeft;
        int paddingRight;
        int i5;
        int i6;
        boolean z3;
        if (getChildCount() == 0) {
            this.b1 = 0;
            return;
        }
        boolean z4 = true;
        this.b1 = 1;
        if (getLayoutDirection() == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            paddingLeft = getPaddingRight();
        } else {
            paddingLeft = getPaddingLeft();
        }
        if (z2) {
            paddingRight = getPaddingLeft();
        } else {
            paddingRight = getPaddingRight();
        }
        int paddingTop = getPaddingTop();
        int i7 = 0;
        int i8 = paddingLeft;
        int i9 = paddingTop;
        while (i7 < getChildCount()) {
            View childAt = getChildAt(i7);
            if (childAt.getVisibility() == 8) {
                childAt.setTag(C7025iN1.h.row_index_key, -1);
                z3 = z4;
            } else {
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    i6 = marginLayoutParams.getMarginStart();
                    i5 = marginLayoutParams.getMarginEnd();
                } else {
                    i5 = 0;
                    i6 = 0;
                }
                int measuredWidth = i8 + i6 + childAt.getMeasuredWidth();
                int i10 = i3 - i;
                int i11 = i10 - paddingRight;
                z3 = z4;
                if (!this.a1 && measuredWidth > i11) {
                    measuredWidth = paddingLeft + i6 + childAt.getMeasuredWidth();
                    i9 = paddingTop + this.Y0;
                    this.b1++;
                    i8 = paddingLeft;
                }
                childAt.setTag(C7025iN1.h.row_index_key, Integer.valueOf(this.b1 - 1));
                int measuredHeight = childAt.getMeasuredHeight() + i9;
                if (z2) {
                    childAt.layout(i10 - measuredWidth, i9, (i10 - i8) - i6, measuredHeight);
                } else {
                    childAt.layout(i8 + i6, i9, measuredWidth, measuredHeight);
                }
                i8 += i6 + i5 + childAt.getMeasuredWidth() + this.Z0;
                paddingTop = measuredHeight;
            }
            i7++;
            z4 = z3;
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int size = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i2);
        if (mode != Integer.MIN_VALUE && mode != 1073741824) {
            i3 = Integer.MAX_VALUE;
        } else {
            i3 = size;
        }
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = i3 - getPaddingRight();
        int i7 = paddingTop;
        int i8 = 0;
        for (int i9 = 0; i9 < getChildCount(); i9++) {
            View childAt = getChildAt(i9);
            if (childAt.getVisibility() != 8) {
                measureChild(childAt, i, i2);
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    i4 = marginLayoutParams.leftMargin;
                    i5 = marginLayoutParams.rightMargin;
                } else {
                    i4 = 0;
                    i5 = 0;
                }
                int i10 = paddingLeft;
                if (paddingLeft + i4 + childAt.getMeasuredWidth() > paddingRight && !c()) {
                    i6 = getPaddingLeft();
                    i7 = this.Y0 + paddingTop;
                } else {
                    i6 = i10;
                }
                int measuredWidth = i6 + i4 + childAt.getMeasuredWidth();
                int measuredHeight = i7 + childAt.getMeasuredHeight();
                if (measuredWidth > i8) {
                    i8 = measuredWidth;
                }
                paddingLeft = i6 + i4 + i5 + childAt.getMeasuredWidth() + this.Z0;
                if (i9 == getChildCount() - 1) {
                    i8 += i5;
                }
                paddingTop = measuredHeight;
            }
        }
        setMeasuredDimension(a(size, mode, i8 + getPaddingRight()), a(size2, mode2, paddingTop + getPaddingBottom()));
    }

    public void setItemSpacing(int i) {
        this.Z0 = i;
    }

    public void setLineSpacing(int i) {
        this.Y0 = i;
    }

    public void setSingleLine(boolean z) {
        this.a1 = z;
    }

    public C9368rw0(@InterfaceC5670cr1 Context context, @InterfaceC11300zs1 AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C9368rw0(@InterfaceC5670cr1 Context context, @InterfaceC11300zs1 AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a1 = false;
        d(context, attributeSet);
    }

    public C9368rw0(@InterfaceC5670cr1 Context context, @InterfaceC11300zs1 AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.a1 = false;
        d(context, attributeSet);
    }
}
