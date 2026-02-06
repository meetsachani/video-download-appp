package o;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.List;
import o.C7025iN1;
import o.HT1;

@HT1({HT1.a.Y})
/* renamed from: o.Zo  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C4935Zo extends AbstractC3661Mo1 {
    public final int Z1;
    public final int a2;
    public final int b2;
    public final int c2;
    public boolean d2;
    public final List<Integer> e2;

    public C4935Zo(@InterfaceC5670cr1 Context context) {
        super(context);
        this.e2 = new ArrayList();
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        setLayoutParams(layoutParams);
        Resources resources = getResources();
        this.Z1 = resources.getDimensionPixelSize(C7025iN1.f.design_bottom_navigation_item_max_width);
        this.a2 = resources.getDimensionPixelSize(C7025iN1.f.design_bottom_navigation_item_min_width);
        this.b2 = resources.getDimensionPixelSize(C7025iN1.f.design_bottom_navigation_active_item_max_width);
        this.c2 = resources.getDimensionPixelSize(C7025iN1.f.design_bottom_navigation_active_item_min_width);
    }

    public boolean A() {
        return this.d2;
    }

    @Override // o.AbstractC3661Mo1
    @InterfaceC5670cr1
    public AbstractC3270Io1 h(@InterfaceC5670cr1 Context context) {
        return new C4828Yo(context);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int i5 = i3 - i;
        int i6 = i4 - i2;
        int i7 = 0;
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            if (childAt.getVisibility() != 8) {
                if (getLayoutDirection() == 1) {
                    int i9 = i5 - i7;
                    childAt.layout(i9 - childAt.getMeasuredWidth(), 0, i9, i6);
                } else {
                    childAt.layout(i7, 0, childAt.getMeasuredWidth() + i7, i6);
                }
                i7 += childAt.getMeasuredWidth();
            }
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int size = View.MeasureSpec.getSize(i);
        int currentVisibleContentItemCount = getCurrentVisibleContentItemCount();
        int childCount = getChildCount();
        this.e2.clear();
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i2), Integer.MIN_VALUE);
        int i8 = 1;
        int i9 = 0;
        if (getItemIconGravity() == 0) {
            if (o(getLabelVisibilityMode(), currentVisibleContentItemCount) && A()) {
                View childAt = getChildAt(getSelectedItemPosition());
                int i10 = this.c2;
                if (childAt.getVisibility() != 8) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(this.b2, Integer.MIN_VALUE), makeMeasureSpec);
                    i10 = Math.max(i10, childAt.getMeasuredWidth());
                }
                if (childAt.getVisibility() != 8) {
                    i6 = 1;
                } else {
                    i6 = 0;
                }
                int i11 = currentVisibleContentItemCount - i6;
                int min = Math.min(size - (this.a2 * i11), Math.min(i10, this.b2));
                int i12 = size - min;
                if (i11 != 0) {
                    i8 = i11;
                }
                int min2 = Math.min(i12 / i8, this.Z1);
                int i13 = i12 - (i11 * min2);
                for (int i14 = 0; i14 < childCount; i14++) {
                    if (getChildAt(i14).getVisibility() != 8) {
                        if (i14 == getSelectedItemPosition()) {
                            i7 = min;
                        } else {
                            i7 = min2;
                        }
                        if (i13 > 0) {
                            i7++;
                            i13--;
                        }
                    } else {
                        i7 = 0;
                    }
                    this.e2.add(Integer.valueOf(i7));
                }
            } else {
                if (currentVisibleContentItemCount != 0) {
                    i8 = currentVisibleContentItemCount;
                }
                int min3 = Math.min(size / i8, this.b2);
                int i15 = size - (currentVisibleContentItemCount * min3);
                for (int i16 = 0; i16 < childCount; i16++) {
                    if (getChildAt(i16).getVisibility() != 8) {
                        if (i15 > 0) {
                            i5 = min3 + 1;
                            i15--;
                        } else {
                            i5 = min3;
                        }
                    } else {
                        i5 = 0;
                    }
                    this.e2.add(Integer.valueOf(i5));
                }
            }
            i3 = 0;
            i4 = 0;
            while (i9 < childCount) {
                View childAt2 = getChildAt(i9);
                if (childAt2.getVisibility() != 8) {
                    childAt2.measure(View.MeasureSpec.makeMeasureSpec(this.e2.get(i9).intValue(), 1073741824), makeMeasureSpec);
                    childAt2.getLayoutParams().width = childAt2.getMeasuredWidth();
                    i3 += childAt2.getMeasuredWidth();
                    i4 = Math.max(i4, childAt2.getMeasuredHeight());
                }
                i9++;
            }
        } else {
            if (currentVisibleContentItemCount == 0) {
                currentVisibleContentItemCount = 1;
            }
            float f = size;
            float f2 = currentVisibleContentItemCount;
            int round = Math.round((Math.min((currentVisibleContentItemCount + 3) / 10.0f, 0.9f) * f) / f2);
            int round2 = Math.round(f / f2);
            int i17 = 0;
            int i18 = 0;
            while (i9 < childCount) {
                View childAt3 = getChildAt(i9);
                if (childAt3.getVisibility() != 8) {
                    childAt3.measure(View.MeasureSpec.makeMeasureSpec(round2, Integer.MIN_VALUE), makeMeasureSpec);
                    if (childAt3.getMeasuredWidth() < round) {
                        childAt3.measure(View.MeasureSpec.makeMeasureSpec(round, 1073741824), makeMeasureSpec);
                    }
                    i17 += childAt3.getMeasuredWidth();
                    i18 = Math.max(i18, childAt3.getMeasuredHeight());
                }
                i9++;
            }
            i3 = i17;
            i4 = i18;
        }
        setMeasuredDimension(i3, Math.max(i4, getSuggestedMinimumHeight()));
    }

    public void setItemHorizontalTranslationEnabled(boolean z) {
        this.d2 = z;
    }
}
