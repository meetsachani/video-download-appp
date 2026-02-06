package com.google.android.material.button;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.google.android.material.button.MaterialButton;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.TreeMap;
import o.C10262vc2;
import o.C10751xc2;
import o.C10920yI2;
import o.C10994yc2;
import o.C6597gd1;
import o.C7025iN1;
import o.C7608kn2;
import o.HT1;
import o.InterfaceC11300zs1;
import o.InterfaceC5056aJ2;
import o.InterfaceC5670cr1;
import o.M;
import o.O22;
import o.PK1;
import o.YP;

/* loaded from: classes3.dex */
public class a extends LinearLayout {
    public static final String i1 = "MButtonGroup";
    public static final int j1 = C7025iN1.n.Widget_Material3_MaterialButtonGroup;
    public final List<O22> Y0;
    public final List<C10751xc2> Z0;
    public final b a1;
    public final Comparator<MaterialButton> b1;
    public Integer[] c1;
    @InterfaceC11300zs1
    public C10262vc2 d1;
    @InterfaceC11300zs1
    public C10751xc2 e1;
    @PK1
    public int f1;
    @InterfaceC11300zs1
    public C10994yc2 g1;
    public boolean h1;

    /* loaded from: classes3.dex */
    public class b implements MaterialButton.d {
        public b() {
        }

        @Override // com.google.android.material.button.MaterialButton.d
        public void a(@InterfaceC5670cr1 MaterialButton materialButton, boolean z) {
            a.this.invalidate();
        }
    }

    public a(@InterfaceC5670cr1 Context context) {
        this(context, null);
    }

    public static /* synthetic */ int a(a aVar, MaterialButton materialButton, MaterialButton materialButton2) {
        aVar.getClass();
        int compareTo = Boolean.valueOf(materialButton.isChecked()).compareTo(Boolean.valueOf(materialButton2.isChecked()));
        if (compareTo != 0) {
            return compareTo;
        }
        int compareTo2 = Boolean.valueOf(materialButton.isPressed()).compareTo(Boolean.valueOf(materialButton2.isPressed()));
        if (compareTo2 != 0) {
            return compareTo2;
        }
        return Integer.compare(aVar.indexOfChild(materialButton), aVar.indexOfChild(materialButton2));
    }

    private int getFirstVisibleChildIndex() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (j(i)) {
                return i;
            }
        }
        return -1;
    }

    private int getLastVisibleChildIndex() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            if (j(childCount)) {
                return childCount;
            }
        }
        return -1;
    }

    private boolean j(int i) {
        if (getChildAt(i).getVisibility() != 8) {
            return true;
        }
        return false;
    }

    private void setGeneratedIdIfNeeded(@InterfaceC5670cr1 MaterialButton materialButton) {
        if (materialButton.getId() == -1) {
            materialButton.setId(View.generateViewId());
        }
    }

    @Override // android.view.ViewGroup
    public void addView(@InterfaceC5670cr1 View view, int i, @InterfaceC11300zs1 ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof MaterialButton)) {
            Log.e(i1, "Child views must be of type MaterialButton.");
            return;
        }
        l();
        this.h1 = true;
        super.addView(view, i, layoutParams);
        MaterialButton materialButton = (MaterialButton) view;
        setGeneratedIdIfNeeded(materialButton);
        materialButton.setOnPressedChangeListenerInternal(this.a1);
        this.Y0.add(materialButton.getShapeAppearanceModel());
        this.Z0.add(materialButton.getStateListShapeAppearanceModel());
        materialButton.setEnabled(isEnabled());
    }

    public final void b() {
        int i;
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        if (firstVisibleChildIndex == -1) {
            return;
        }
        for (int i2 = firstVisibleChildIndex + 1; i2 < getChildCount(); i2++) {
            MaterialButton f = f(i2);
            MaterialButton f2 = f(i2 - 1);
            if (this.f1 <= 0) {
                i = Math.min(f.getStrokeWidth(), f2.getStrokeWidth());
                f.setShouldDrawSurfaceColorStroke(true);
                f2.setShouldDrawSurfaceColorStroke(true);
            } else {
                f.setShouldDrawSurfaceColorStroke(false);
                f2.setShouldDrawSurfaceColorStroke(false);
                i = 0;
            }
            LinearLayout.LayoutParams d = d(f);
            if (getOrientation() == 0) {
                d.setMarginEnd(0);
                d.setMarginStart(this.f1 - i);
                d.topMargin = 0;
            } else {
                d.bottomMargin = 0;
                d.topMargin = this.f1 - i;
                d.setMarginStart(0);
            }
            f.setLayoutParams(d);
        }
        m(firstVisibleChildIndex);
    }

    public final void c() {
        int i;
        if (this.g1 != null && getChildCount() != 0) {
            int firstVisibleChildIndex = getFirstVisibleChildIndex();
            int lastVisibleChildIndex = getLastVisibleChildIndex();
            int i2 = Integer.MAX_VALUE;
            for (int i3 = firstVisibleChildIndex; i3 <= lastVisibleChildIndex; i3++) {
                if (j(i3)) {
                    int e = e(i3);
                    if (i3 != firstVisibleChildIndex && i3 != lastVisibleChildIndex) {
                        e /= 2;
                    }
                    i2 = Math.min(i2, e);
                }
            }
            for (int i4 = firstVisibleChildIndex; i4 <= lastVisibleChildIndex; i4++) {
                if (j(i4)) {
                    f(i4).setSizeChange(this.g1);
                    MaterialButton f = f(i4);
                    if (i4 != firstVisibleChildIndex && i4 != lastVisibleChildIndex) {
                        i = i2 * 2;
                    } else {
                        i = i2;
                    }
                    f.setWidthChangeMax(i);
                }
            }
        }
    }

    @InterfaceC5670cr1
    public LinearLayout.LayoutParams d(@InterfaceC5670cr1 View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof LinearLayout.LayoutParams) {
            return (LinearLayout.LayoutParams) layoutParams;
        }
        return new LinearLayout.LayoutParams(layoutParams.width, layoutParams.height);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(@InterfaceC5670cr1 Canvas canvas) {
        n();
        super.dispatchDraw(canvas);
    }

    public final int e(int i) {
        int allowedWidthDecrease;
        int i2 = 0;
        if (!j(i) || this.g1 == null) {
            return 0;
        }
        int max = Math.max(0, this.g1.d(f(i).getWidth()));
        MaterialButton i3 = i(i);
        if (i3 == null) {
            allowedWidthDecrease = 0;
        } else {
            allowedWidthDecrease = i3.getAllowedWidthDecrease();
        }
        MaterialButton g = g(i);
        if (g != null) {
            i2 = g.getAllowedWidthDecrease();
        }
        return Math.min(max, allowedWidthDecrease + i2);
    }

    @InterfaceC5670cr1
    public MaterialButton f(int i) {
        return (MaterialButton) getChildAt(i);
    }

    @InterfaceC11300zs1
    public final MaterialButton g(int i) {
        int childCount = getChildCount();
        do {
            i++;
            if (i >= childCount) {
                return null;
            }
        } while (!j(i));
        return f(i);
    }

    @InterfaceC11300zs1
    @HT1({HT1.a.Y})
    public C10994yc2 getButtonSizeChange() {
        return this.g1;
    }

    @Override // android.view.ViewGroup
    public int getChildDrawingOrder(int i, int i2) {
        Integer[] numArr = this.c1;
        if (numArr != null && i2 < numArr.length) {
            return numArr[i2].intValue();
        }
        Log.w(i1, "Child order wasn't updated");
        return i2;
    }

    @InterfaceC5670cr1
    public YP getInnerCornerSize() {
        return this.d1.e();
    }

    @HT1({HT1.a.Y})
    @InterfaceC5670cr1
    public C10262vc2 getInnerCornerSizeStateList() {
        return this.d1;
    }

    @InterfaceC11300zs1
    public O22 getShapeAppearance() {
        C10751xc2 c10751xc2 = this.e1;
        if (c10751xc2 == null) {
            return null;
        }
        return c10751xc2.c(true);
    }

    @PK1
    public int getSpacing() {
        return this.f1;
    }

    @InterfaceC11300zs1
    @HT1({HT1.a.Y})
    public C10751xc2 getStateListShapeAppearance() {
        return this.e1;
    }

    @InterfaceC5670cr1
    public final C10751xc2.b h(boolean z, boolean z2, int i) {
        C10751xc2 c10751xc2 = this.e1;
        if (c10751xc2 == null || (!z && !z2)) {
            c10751xc2 = this.Z0.get(i);
        }
        if (c10751xc2 == null) {
            return new C10751xc2.b(this.Y0.get(i));
        }
        return c10751xc2.j();
    }

    @InterfaceC11300zs1
    public final MaterialButton i(int i) {
        for (int i2 = i - 1; i2 >= 0; i2--) {
            if (j(i2)) {
                return f(i2);
            }
        }
        return null;
    }

    public void k(@InterfaceC5670cr1 MaterialButton materialButton, int i) {
        int indexOfChild = indexOfChild(materialButton);
        if (indexOfChild >= 0) {
            MaterialButton i2 = i(indexOfChild);
            MaterialButton g = g(indexOfChild);
            if (i2 != null || g != null) {
                if (i2 == null) {
                    g.setDisplayedWidthDecrease(i);
                }
                if (g == null) {
                    i2.setDisplayedWidthDecrease(i);
                }
                if (i2 != null && g != null) {
                    i2.setDisplayedWidthDecrease(i / 2);
                    g.setDisplayedWidthDecrease((i + 1) / 2);
                }
            }
        }
    }

    public final void l() {
        for (int i = 0; i < getChildCount(); i++) {
            f(i).t();
        }
    }

    public final void m(int i) {
        if (getChildCount() != 0 && i != -1) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) f(i).getLayoutParams();
            if (getOrientation() == 1) {
                layoutParams.topMargin = 0;
                layoutParams.bottomMargin = 0;
                return;
            }
            layoutParams.setMarginEnd(0);
            layoutParams.setMarginStart(0);
            layoutParams.leftMargin = 0;
            layoutParams.rightMargin = 0;
        }
    }

    public final void n() {
        TreeMap treeMap = new TreeMap(this.b1);
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            treeMap.put(f(i), Integer.valueOf(i));
        }
        this.c1 = (Integer[]) treeMap.values().toArray(new Integer[0]);
    }

    @InterfaceC5056aJ2
    public void o() {
        boolean z;
        boolean z2;
        boolean z3;
        int i;
        if ((this.d1 != null || this.e1 != null) && this.h1) {
            this.h1 = false;
            int childCount = getChildCount();
            int firstVisibleChildIndex = getFirstVisibleChildIndex();
            int lastVisibleChildIndex = getLastVisibleChildIndex();
            for (int i2 = 0; i2 < childCount; i2++) {
                MaterialButton f = f(i2);
                if (f.getVisibility() != 8) {
                    if (i2 == firstVisibleChildIndex) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (i2 == lastVisibleChildIndex) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    C10751xc2.b h = h(z, z2, i2);
                    if (getOrientation() == 0) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    boolean s = C10920yI2.s(this);
                    if (z3) {
                        if (z) {
                            i = 5;
                        } else {
                            i = 0;
                        }
                        if (z2) {
                            i |= 10;
                        }
                        if (s) {
                            i = C10751xc2.i(i);
                        }
                    } else {
                        if (z) {
                            i = 3;
                        } else {
                            i = 0;
                        }
                        if (z2) {
                            i |= 12;
                        }
                    }
                    C10751xc2 j = h.n(this.d1, ~i).j();
                    if (j.g()) {
                        f.setStateListShapeAppearanceModel(j);
                    } else {
                        f.setShapeAppearanceModel(j.c(true));
                    }
                }
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            l();
            c();
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i, int i2) {
        o();
        b();
        super.onMeasure(i, i2);
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if (view instanceof MaterialButton) {
            ((MaterialButton) view).setOnPressedChangeListenerInternal(null);
        }
        int indexOfChild = indexOfChild(view);
        if (indexOfChild >= 0) {
            this.Y0.remove(indexOfChild);
            this.Z0.remove(indexOfChild);
        }
        this.h1 = true;
        o();
        l();
        b();
    }

    @HT1({HT1.a.Y})
    public void setButtonSizeChange(@InterfaceC5670cr1 C10994yc2 c10994yc2) {
        if (this.g1 != c10994yc2) {
            this.g1 = c10994yc2;
            c();
            requestLayout();
            invalidate();
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        for (int i = 0; i < getChildCount(); i++) {
            f(i).setEnabled(z);
        }
    }

    public void setInnerCornerSize(@InterfaceC5670cr1 YP yp) {
        this.d1 = C10262vc2.c(yp);
        this.h1 = true;
        o();
        invalidate();
    }

    @HT1({HT1.a.Y})
    public void setInnerCornerSizeStateList(@InterfaceC5670cr1 C10262vc2 c10262vc2) {
        this.d1 = c10262vc2;
        this.h1 = true;
        o();
        invalidate();
    }

    @Override // android.widget.LinearLayout
    public void setOrientation(int i) {
        if (getOrientation() != i) {
            this.h1 = true;
        }
        super.setOrientation(i);
    }

    public void setShapeAppearance(@InterfaceC11300zs1 O22 o22) {
        this.e1 = new C10751xc2.b(o22).j();
        this.h1 = true;
        o();
        invalidate();
    }

    public void setSpacing(@PK1 int i) {
        this.f1 = i;
        invalidate();
        requestLayout();
    }

    @HT1({HT1.a.Y})
    public void setStateListShapeAppearance(@InterfaceC11300zs1 C10751xc2 c10751xc2) {
        this.e1 = c10751xc2;
        this.h1 = true;
        o();
        invalidate();
    }

    public a(@InterfaceC5670cr1 Context context, @InterfaceC11300zs1 AttributeSet attributeSet) {
        this(context, attributeSet, C7025iN1.c.materialButtonGroupStyle);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public a(@InterfaceC5670cr1 Context context, @InterfaceC11300zs1 AttributeSet attributeSet, int i) {
        super(C6597gd1.d(context, attributeSet, i, r4), attributeSet, i);
        int i2 = j1;
        this.Y0 = new ArrayList();
        this.Z0 = new ArrayList();
        this.a1 = new b();
        this.b1 = new Comparator() { // from class: o.i91
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return com.google.android.material.button.a.a(com.google.android.material.button.a.this, (MaterialButton) obj, (MaterialButton) obj2);
            }
        };
        this.h1 = true;
        Context context2 = getContext();
        TypedArray k = C7608kn2.k(context2, attributeSet, C7025iN1.o.G5, i, i2, new int[0]);
        int i3 = C7025iN1.o.J5;
        if (k.hasValue(i3)) {
            this.g1 = C10994yc2.b(context2, k, i3);
        }
        int i4 = C7025iN1.o.L5;
        if (k.hasValue(i4)) {
            C10751xc2 b2 = C10751xc2.b(context2, k, i4);
            this.e1 = b2;
            if (b2 == null) {
                this.e1 = new C10751xc2.b(O22.b(context2, k.getResourceId(i4, 0), k.getResourceId(C7025iN1.o.M5, 0)).m()).j();
            }
        }
        int i5 = C7025iN1.o.K5;
        if (k.hasValue(i5)) {
            this.d1 = C10262vc2.b(context2, k, i5, new M(0.0f));
        }
        this.f1 = k.getDimensionPixelSize(C7025iN1.o.I5, 0);
        setChildrenDrawingOrderEnabled(true);
        setEnabled(k.getBoolean(C7025iN1.o.H5, true));
        k.recycle();
    }
}
