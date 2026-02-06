package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.d;
import o.C6516gH2;
import o.JE0;
import o.OL1;

/* loaded from: classes.dex */
public class AlertDialogLayout extends d {
    public AlertDialogLayout(Context context) {
        super(context);
    }

    public static int F(View view) {
        int j0 = C6516gH2.j0(view);
        if (j0 > 0) {
            return j0;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (viewGroup.getChildCount() == 1) {
                return F(viewGroup.getChildAt(0));
            }
        }
        return 0;
    }

    public final void E(View view, int i, int i2, int i3, int i4) {
        view.layout(i, i2, i3 + i, i4 + i2);
    }

    public final boolean G(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int makeMeasureSpec;
        int childCount = getChildCount();
        View view = null;
        View view2 = null;
        View view3 = null;
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if (childAt.getVisibility() != 8) {
                int id = childAt.getId();
                if (id == OL1.g.v0) {
                    view = childAt;
                } else if (id == OL1.g.q) {
                    view2 = childAt;
                } else if ((id != OL1.g.u && id != OL1.g.w) || view3 != null) {
                    return false;
                } else {
                    view3 = childAt;
                }
            }
        }
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i);
        int paddingTop = getPaddingTop() + getPaddingBottom();
        if (view != null) {
            view.measure(i, 0);
            paddingTop += view.getMeasuredHeight();
            i3 = View.combineMeasuredStates(0, view.getMeasuredState());
        } else {
            i3 = 0;
        }
        if (view2 != null) {
            view2.measure(i, 0);
            i4 = F(view2);
            i5 = view2.getMeasuredHeight() - i4;
            paddingTop += i4;
            i3 = View.combineMeasuredStates(i3, view2.getMeasuredState());
        } else {
            i4 = 0;
            i5 = 0;
        }
        if (view3 != null) {
            if (mode == 0) {
                makeMeasureSpec = 0;
            } else {
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.max(0, size - paddingTop), mode);
            }
            view3.measure(i, makeMeasureSpec);
            i6 = view3.getMeasuredHeight();
            paddingTop += i6;
            i3 = View.combineMeasuredStates(i3, view3.getMeasuredState());
        } else {
            i6 = 0;
        }
        int i8 = size - paddingTop;
        if (view2 != null) {
            int i9 = paddingTop - i4;
            int min = Math.min(i8, i5);
            if (min > 0) {
                i8 -= min;
                i4 += min;
            }
            view2.measure(i, View.MeasureSpec.makeMeasureSpec(i4, 1073741824));
            paddingTop = i9 + view2.getMeasuredHeight();
            i3 = View.combineMeasuredStates(i3, view2.getMeasuredState());
        }
        if (view3 != null && i8 > 0) {
            view3.measure(i, View.MeasureSpec.makeMeasureSpec(i6 + i8, mode));
            paddingTop = (paddingTop - i6) + view3.getMeasuredHeight();
            i3 = View.combineMeasuredStates(i3, view3.getMeasuredState());
        }
        int i10 = 0;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt2 = getChildAt(i11);
            if (childAt2.getVisibility() != 8) {
                i10 = Math.max(i10, childAt2.getMeasuredWidth());
            }
        }
        setMeasuredDimension(View.resolveSizeAndState(i10 + getPaddingLeft() + getPaddingRight(), i, i3), View.resolveSizeAndState(paddingTop, i2, 0));
        if (mode2 != 1073741824) {
            k(childCount, i2);
            return true;
        }
        return true;
    }

    public final void k(int i, int i2) {
        int i3;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
        int i4 = 0;
        while (i4 < i) {
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() != 8) {
                d.b bVar = (d.b) childAt.getLayoutParams();
                if (((LinearLayout.LayoutParams) bVar).width == -1) {
                    int i5 = ((LinearLayout.LayoutParams) bVar).height;
                    ((LinearLayout.LayoutParams) bVar).height = childAt.getMeasuredHeight();
                    i3 = i2;
                    measureChildWithMargins(childAt, makeMeasureSpec, 0, i3, 0);
                    ((LinearLayout.LayoutParams) bVar).height = i5;
                    i4++;
                    i2 = i3;
                }
            }
            i3 = i2;
            i4++;
            i2 = i3;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00a0  */
    @Override // androidx.appcompat.widget.d, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int paddingTop;
        int intrinsicHeight;
        int i5;
        int i6;
        int i7;
        int paddingLeft = getPaddingLeft();
        int i8 = i3 - i;
        int paddingRight = i8 - getPaddingRight();
        int paddingRight2 = (i8 - paddingLeft) - getPaddingRight();
        int measuredHeight = getMeasuredHeight();
        int childCount = getChildCount();
        int gravity = getGravity();
        int i9 = gravity & 112;
        int i10 = gravity & JE0.d;
        if (i9 != 16) {
            if (i9 != 80) {
                paddingTop = getPaddingTop();
            } else {
                paddingTop = ((getPaddingTop() + i4) - i2) - measuredHeight;
            }
        } else {
            paddingTop = getPaddingTop() + (((i4 - i2) - measuredHeight) / 2);
        }
        Drawable dividerDrawable = getDividerDrawable();
        if (dividerDrawable == null) {
            intrinsicHeight = 0;
        } else {
            intrinsicHeight = dividerDrawable.getIntrinsicHeight();
        }
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (childAt != null && childAt.getVisibility() != 8) {
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight2 = childAt.getMeasuredHeight();
                d.b bVar = (d.b) childAt.getLayoutParams();
                int i12 = ((LinearLayout.LayoutParams) bVar).gravity;
                if (i12 < 0) {
                    i12 = i10;
                }
                int d = JE0.d(i12, getLayoutDirection()) & 7;
                if (d != 1) {
                    if (d != 5) {
                        i7 = ((LinearLayout.LayoutParams) bVar).leftMargin + paddingLeft;
                        int i13 = i7;
                        if (v(i11)) {
                            paddingTop += intrinsicHeight;
                        }
                        int i14 = paddingTop + ((LinearLayout.LayoutParams) bVar).topMargin;
                        E(childAt, i13, i14, measuredWidth, measuredHeight2);
                        paddingTop = i14 + measuredHeight2 + ((LinearLayout.LayoutParams) bVar).bottomMargin;
                    } else {
                        i5 = paddingRight - measuredWidth;
                        i6 = ((LinearLayout.LayoutParams) bVar).rightMargin;
                    }
                } else {
                    i5 = ((paddingRight2 - measuredWidth) / 2) + paddingLeft + ((LinearLayout.LayoutParams) bVar).leftMargin;
                    i6 = ((LinearLayout.LayoutParams) bVar).rightMargin;
                }
                i7 = i5 - i6;
                int i132 = i7;
                if (v(i11)) {
                }
                int i142 = paddingTop + ((LinearLayout.LayoutParams) bVar).topMargin;
                E(childAt, i132, i142, measuredWidth, measuredHeight2);
                paddingTop = i142 + measuredHeight2 + ((LinearLayout.LayoutParams) bVar).bottomMargin;
            }
        }
    }

    @Override // androidx.appcompat.widget.d, android.view.View
    public void onMeasure(int i, int i2) {
        if (!G(i, i2)) {
            super.onMeasure(i, i2);
        }
    }

    public AlertDialogLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
