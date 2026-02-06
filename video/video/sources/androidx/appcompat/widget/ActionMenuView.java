package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.h;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.view.menu.k;
import androidx.appcompat.widget.d;
import o.C11163zI2;

/* loaded from: classes.dex */
public class ActionMenuView extends androidx.appcompat.widget.d implements e.b, k {
    public static final String L1 = "ActionMenuView";
    public static final int M1 = 56;
    public static final int N1 = 4;
    public Context A1;
    public int B1;
    public boolean C1;
    public androidx.appcompat.widget.a D1;
    public j.a E1;
    public e.a F1;
    public boolean G1;
    public int H1;
    public int I1;
    public int J1;
    public e K1;
    public androidx.appcompat.view.menu.e z1;

    /* loaded from: classes.dex */
    public interface a {
        boolean c();

        boolean f();
    }

    /* loaded from: classes.dex */
    public static class b implements j.a {
        @Override // androidx.appcompat.view.menu.j.a
        public void a(androidx.appcompat.view.menu.e eVar, boolean z) {
        }

        @Override // androidx.appcompat.view.menu.j.a
        public boolean b(androidx.appcompat.view.menu.e eVar) {
            return false;
        }
    }

    /* loaded from: classes.dex */
    public static class c extends d.b {
        @ViewDebug.ExportedProperty
        public boolean a;
        @ViewDebug.ExportedProperty
        public int b;
        @ViewDebug.ExportedProperty
        public int c;
        @ViewDebug.ExportedProperty
        public boolean d;
        @ViewDebug.ExportedProperty
        public boolean e;
        public boolean f;

        public c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public c(c cVar) {
            super((ViewGroup.LayoutParams) cVar);
            this.a = cVar.a;
        }

        public c(int i, int i2) {
            super(i, i2);
            this.a = false;
        }

        public c(int i, int i2, boolean z) {
            super(i, i2);
            this.a = z;
        }
    }

    /* loaded from: classes.dex */
    public class d implements e.a {
        public d() {
        }

        @Override // androidx.appcompat.view.menu.e.a
        public boolean a(androidx.appcompat.view.menu.e eVar, MenuItem menuItem) {
            e eVar2 = ActionMenuView.this.K1;
            if (eVar2 != null && eVar2.onMenuItemClick(menuItem)) {
                return true;
            }
            return false;
        }

        @Override // androidx.appcompat.view.menu.e.a
        public void b(androidx.appcompat.view.menu.e eVar) {
            e.a aVar = ActionMenuView.this.F1;
            if (aVar != null) {
                aVar.b(eVar);
            }
        }
    }

    /* loaded from: classes.dex */
    public interface e {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    public ActionMenuView(Context context) {
        this(context, null);
    }

    public static int P(View view, int i, int i2, int i3, int i4) {
        ActionMenuItemView actionMenuItemView;
        boolean z;
        int i5;
        c cVar = (c) view.getLayoutParams();
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3) - i4, View.MeasureSpec.getMode(i3));
        if (view instanceof ActionMenuItemView) {
            actionMenuItemView = (ActionMenuItemView) view;
        } else {
            actionMenuItemView = null;
        }
        boolean z2 = false;
        if (actionMenuItemView != null && actionMenuItemView.H()) {
            z = true;
        } else {
            z = false;
        }
        if (i2 > 0) {
            i5 = 2;
            if (!z || i2 >= 2) {
                view.measure(View.MeasureSpec.makeMeasureSpec(i2 * i, Integer.MIN_VALUE), makeMeasureSpec);
                int measuredWidth = view.getMeasuredWidth();
                int i6 = measuredWidth / i;
                if (measuredWidth % i != 0) {
                    i6++;
                }
                if (!z || i6 >= 2) {
                    i5 = i6;
                }
                if (!cVar.a && z) {
                    z2 = true;
                }
                cVar.d = z2;
                cVar.b = i5;
                view.measure(View.MeasureSpec.makeMeasureSpec(i * i5, 1073741824), makeMeasureSpec);
                return i5;
            }
        }
        i5 = 0;
        if (!cVar.a) {
            z2 = true;
        }
        cVar.d = z2;
        cVar.b = i5;
        view.measure(View.MeasureSpec.makeMeasureSpec(i * i5, 1073741824), makeMeasureSpec);
        return i5;
    }

    public void F() {
        androidx.appcompat.widget.a aVar = this.D1;
        if (aVar != null) {
            aVar.B();
        }
    }

    @Override // androidx.appcompat.widget.d
    /* renamed from: G */
    public c l() {
        c cVar = new c(-2, -2);
        ((LinearLayout.LayoutParams) cVar).gravity = 16;
        return cVar;
    }

    @Override // androidx.appcompat.widget.d
    /* renamed from: H */
    public c m(AttributeSet attributeSet) {
        return new c(getContext(), attributeSet);
    }

    @Override // androidx.appcompat.widget.d
    /* renamed from: I */
    public c n(ViewGroup.LayoutParams layoutParams) {
        c cVar;
        if (layoutParams != null) {
            if (layoutParams instanceof c) {
                cVar = new c((c) layoutParams);
            } else {
                cVar = new c(layoutParams);
            }
            if (((LinearLayout.LayoutParams) cVar).gravity <= 0) {
                ((LinearLayout.LayoutParams) cVar).gravity = 16;
            }
            return cVar;
        }
        return l();
    }

    public c J() {
        c l = l();
        l.a = true;
        return l;
    }

    public boolean K(int i) {
        boolean z = false;
        if (i == 0) {
            return false;
        }
        View childAt = getChildAt(i - 1);
        View childAt2 = getChildAt(i);
        if (i < getChildCount() && (childAt instanceof a)) {
            z = ((a) childAt).c();
        }
        if (i > 0 && (childAt2 instanceof a)) {
            return ((a) childAt2).f() | z;
        }
        return z;
    }

    public boolean L() {
        androidx.appcompat.widget.a aVar = this.D1;
        if (aVar != null && aVar.E()) {
            return true;
        }
        return false;
    }

    public boolean M() {
        androidx.appcompat.widget.a aVar = this.D1;
        if (aVar != null && aVar.G()) {
            return true;
        }
        return false;
    }

    public boolean N() {
        androidx.appcompat.widget.a aVar = this.D1;
        if (aVar != null && aVar.H()) {
            return true;
        }
        return false;
    }

    public boolean O() {
        return this.C1;
    }

    /* JADX WARN: Type inference failed for: r3v33 */
    /* JADX WARN: Type inference failed for: r3v34, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v48 */
    public final void Q(int i, int i2) {
        boolean z;
        long j;
        boolean z2;
        int i3;
        int i4;
        int i5;
        int i6;
        boolean z3;
        boolean z4;
        ?? r3;
        boolean z5;
        int i7;
        int i8;
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i2, paddingTop, -2);
        int i9 = size - paddingLeft;
        int i10 = this.I1;
        int i11 = i9 / i10;
        int i12 = i9 % i10;
        if (i11 == 0) {
            setMeasuredDimension(i9, 0);
            return;
        }
        int i13 = i10 + (i12 / i11);
        int childCount = getChildCount();
        int i14 = 0;
        int i15 = 0;
        boolean z6 = false;
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        long j2 = 0;
        while (i15 < childCount) {
            View childAt = getChildAt(i15);
            int i19 = size2;
            if (childAt.getVisibility() == 8) {
                i8 = i13;
            } else {
                boolean z7 = childAt instanceof ActionMenuItemView;
                i16++;
                if (z7) {
                    int i20 = this.J1;
                    z4 = z7;
                    r3 = 0;
                    childAt.setPadding(i20, 0, i20, 0);
                } else {
                    z4 = z7;
                    r3 = 0;
                }
                c cVar = (c) childAt.getLayoutParams();
                cVar.f = r3;
                cVar.c = r3;
                cVar.b = r3;
                cVar.d = r3;
                ((LinearLayout.LayoutParams) cVar).leftMargin = r3;
                ((LinearLayout.LayoutParams) cVar).rightMargin = r3;
                if (z4 && ((ActionMenuItemView) childAt).H()) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                cVar.e = z5;
                if (cVar.a) {
                    i7 = 1;
                } else {
                    i7 = i11;
                }
                int P = P(childAt, i13, i7, childMeasureSpec, paddingTop);
                i17 = Math.max(i17, P);
                i8 = i13;
                if (cVar.d) {
                    i18++;
                }
                if (cVar.a) {
                    z6 = true;
                }
                i11 -= P;
                i14 = Math.max(i14, childAt.getMeasuredHeight());
                if (P == 1) {
                    j2 |= 1 << i15;
                }
            }
            i15++;
            size2 = i19;
            i13 = i8;
        }
        int i21 = size2;
        int i22 = i13;
        char c2 = 2;
        if (z6 && i16 == 2) {
            z = true;
        } else {
            z = false;
        }
        boolean z8 = false;
        while (i18 > 0 && i11 > 0) {
            int i23 = Integer.MAX_VALUE;
            long j3 = 0;
            char c3 = c2;
            int i24 = 0;
            int i25 = 0;
            j = 1;
            while (i25 < childCount) {
                c cVar2 = (c) getChildAt(i25).getLayoutParams();
                boolean z9 = z;
                if (cVar2.d) {
                    int i26 = cVar2.b;
                    if (i26 < i23) {
                        j3 = 1 << i25;
                        i23 = i26;
                        i24 = 1;
                    } else if (i26 == i23) {
                        j3 |= 1 << i25;
                        i24++;
                    }
                }
                i25++;
                z = z9;
            }
            boolean z10 = z;
            j2 |= j3;
            if (i24 > i11) {
                break;
            }
            int i27 = i23 + 1;
            int i28 = 0;
            while (i28 < childCount) {
                View childAt2 = getChildAt(i28);
                c cVar3 = (c) childAt2.getLayoutParams();
                long j4 = 1 << i28;
                if ((j3 & j4) == 0) {
                    if (cVar3.b == i27) {
                        j2 |= j4;
                    }
                    i6 = i28;
                } else {
                    if (z10 && cVar3.e) {
                        if (i11 == 1) {
                            int i29 = this.J1;
                            z3 = true;
                            i6 = i28;
                            childAt2.setPadding(i29 + i22, 0, i29, 0);
                        } else {
                            i6 = i28;
                            z3 = true;
                        }
                    } else {
                        i6 = i28;
                        z3 = true;
                    }
                    cVar3.b++;
                    cVar3.f = z3;
                    i11--;
                }
                i28 = i6 + 1;
            }
            c2 = c3;
            z = z10;
            z8 = true;
        }
        j = 1;
        if (!z6 && i16 == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (i11 <= 0 || j2 == 0 || (i11 >= i16 - 1 && !z2 && i17 <= 1)) {
            i3 = 0;
        } else {
            float bitCount = Long.bitCount(j2);
            if (!z2) {
                if ((j2 & j) != 0) {
                    i3 = 0;
                    if (!((c) getChildAt(0).getLayoutParams()).e) {
                        bitCount -= 0.5f;
                    }
                } else {
                    i3 = 0;
                }
                int i30 = childCount - 1;
                if ((j2 & (1 << i30)) != 0 && !((c) getChildAt(i30).getLayoutParams()).e) {
                    bitCount -= 0.5f;
                }
            } else {
                i3 = 0;
            }
            if (bitCount > 0.0f) {
                i5 = (int) ((i11 * i22) / bitCount);
            } else {
                i5 = i3;
            }
            boolean z11 = z8;
            for (int i31 = i3; i31 < childCount; i31++) {
                if ((j2 & (1 << i31)) != 0) {
                    View childAt3 = getChildAt(i31);
                    c cVar4 = (c) childAt3.getLayoutParams();
                    if (childAt3 instanceof ActionMenuItemView) {
                        cVar4.c = i5;
                        cVar4.f = true;
                        if (i31 == 0 && !cVar4.e) {
                            ((LinearLayout.LayoutParams) cVar4).leftMargin = (-i5) / 2;
                        }
                        z11 = true;
                    } else {
                        if (cVar4.a) {
                            cVar4.c = i5;
                            cVar4.f = true;
                            ((LinearLayout.LayoutParams) cVar4).rightMargin = (-i5) / 2;
                            z11 = true;
                        } else {
                            if (i31 != 0) {
                                ((LinearLayout.LayoutParams) cVar4).leftMargin = i5 / 2;
                            }
                            if (i31 != childCount - 1) {
                                ((LinearLayout.LayoutParams) cVar4).rightMargin = i5 / 2;
                            }
                        }
                    }
                }
            }
            z8 = z11;
        }
        if (z8) {
            for (int i32 = i3; i32 < childCount; i32++) {
                View childAt4 = getChildAt(i32);
                c cVar5 = (c) childAt4.getLayoutParams();
                if (cVar5.f) {
                    childAt4.measure(View.MeasureSpec.makeMeasureSpec((cVar5.b * i22) + cVar5.c, 1073741824), childMeasureSpec);
                }
            }
        }
        if (mode != 1073741824) {
            i4 = i14;
        } else {
            i4 = i21;
        }
        setMeasuredDimension(i9, i4);
    }

    public androidx.appcompat.view.menu.e R() {
        return this.z1;
    }

    public void S(j.a aVar, e.a aVar2) {
        this.E1 = aVar;
        this.F1 = aVar2;
    }

    public boolean T() {
        androidx.appcompat.widget.a aVar = this.D1;
        if (aVar != null && aVar.Q()) {
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.e.b
    public boolean b(h hVar) {
        return this.z1.P(hVar, 0);
    }

    @Override // androidx.appcompat.view.menu.k
    public void c(androidx.appcompat.view.menu.e eVar) {
        this.z1 = eVar;
    }

    @Override // androidx.appcompat.widget.d, android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof c;
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    public Menu getMenu() {
        if (this.z1 == null) {
            Context context = getContext();
            androidx.appcompat.view.menu.e eVar = new androidx.appcompat.view.menu.e(context);
            this.z1 = eVar;
            eVar.Y(new d());
            androidx.appcompat.widget.a aVar = new androidx.appcompat.widget.a(context);
            this.D1 = aVar;
            aVar.O(true);
            androidx.appcompat.widget.a aVar2 = this.D1;
            j.a aVar3 = this.E1;
            if (aVar3 == null) {
                aVar3 = new b();
            }
            aVar2.d(aVar3);
            this.z1.c(this.D1, this.A1);
            this.D1.M(this);
        }
        return this.z1;
    }

    public Drawable getOverflowIcon() {
        getMenu();
        return this.D1.D();
    }

    public int getPopupTheme() {
        return this.B1;
    }

    @Override // androidx.appcompat.view.menu.k
    public int getWindowAnimations() {
        return 0;
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        androidx.appcompat.widget.a aVar = this.D1;
        if (aVar != null) {
            aVar.i(false);
            if (this.D1.H()) {
                this.D1.E();
                this.D1.Q();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        F();
    }

    @Override // androidx.appcompat.widget.d, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int width;
        int i6;
        if (!this.G1) {
            super.onLayout(z, i, i2, i3, i4);
            return;
        }
        int childCount = getChildCount();
        int i7 = (i4 - i2) / 2;
        int dividerWidth = getDividerWidth();
        int i8 = i3 - i;
        int paddingRight = (i8 - getPaddingRight()) - getPaddingLeft();
        boolean b2 = C11163zI2.b(this);
        int i9 = 0;
        int i10 = 0;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() != 8) {
                c cVar = (c) childAt.getLayoutParams();
                if (cVar.a) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (K(i11)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (b2) {
                        i6 = getPaddingLeft() + ((LinearLayout.LayoutParams) cVar).leftMargin;
                        width = i6 + measuredWidth;
                    } else {
                        width = (getWidth() - getPaddingRight()) - ((LinearLayout.LayoutParams) cVar).rightMargin;
                        i6 = width - measuredWidth;
                    }
                    int i12 = i7 - (measuredHeight / 2);
                    childAt.layout(i6, i12, width, measuredHeight + i12);
                    paddingRight -= measuredWidth;
                    i9 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + ((LinearLayout.LayoutParams) cVar).leftMargin) + ((LinearLayout.LayoutParams) cVar).rightMargin;
                    K(i11);
                    i10++;
                }
            }
        }
        if (childCount == 1 && i9 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i13 = (i8 / 2) - (measuredWidth2 / 2);
            int i14 = i7 - (measuredHeight2 / 2);
            childAt2.layout(i13, i14, measuredWidth2 + i13, measuredHeight2 + i14);
            return;
        }
        int i15 = i10 - (i9 ^ 1);
        if (i15 > 0) {
            i5 = paddingRight / i15;
        } else {
            i5 = 0;
        }
        int max = Math.max(0, i5);
        if (b2) {
            int width2 = getWidth() - getPaddingRight();
            for (int i16 = 0; i16 < childCount; i16++) {
                View childAt3 = getChildAt(i16);
                c cVar2 = (c) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !cVar2.a) {
                    int i17 = width2 - ((LinearLayout.LayoutParams) cVar2).rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i18 = i7 - (measuredHeight3 / 2);
                    childAt3.layout(i17 - measuredWidth3, i18, i17, measuredHeight3 + i18);
                    width2 = i17 - ((measuredWidth3 + ((LinearLayout.LayoutParams) cVar2).leftMargin) + max);
                }
            }
            return;
        }
        int paddingLeft = getPaddingLeft();
        for (int i19 = 0; i19 < childCount; i19++) {
            View childAt4 = getChildAt(i19);
            c cVar3 = (c) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !cVar3.a) {
                int i20 = paddingLeft + ((LinearLayout.LayoutParams) cVar3).leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i21 = i7 - (measuredHeight4 / 2);
                childAt4.layout(i20, i21, i20 + measuredWidth4, measuredHeight4 + i21);
                paddingLeft = i20 + measuredWidth4 + ((LinearLayout.LayoutParams) cVar3).rightMargin + max;
            }
        }
    }

    @Override // androidx.appcompat.widget.d, android.view.View
    public void onMeasure(int i, int i2) {
        boolean z;
        androidx.appcompat.view.menu.e eVar;
        boolean z2 = this.G1;
        if (View.MeasureSpec.getMode(i) == 1073741824) {
            z = true;
        } else {
            z = false;
        }
        this.G1 = z;
        if (z2 != z) {
            this.H1 = 0;
        }
        int size = View.MeasureSpec.getSize(i);
        if (this.G1 && (eVar = this.z1) != null && size != this.H1) {
            this.H1 = size;
            eVar.O(true);
        }
        int childCount = getChildCount();
        if (this.G1 && childCount > 0) {
            Q(i, i2);
            return;
        }
        for (int i3 = 0; i3 < childCount; i3++) {
            c cVar = (c) getChildAt(i3).getLayoutParams();
            ((LinearLayout.LayoutParams) cVar).rightMargin = 0;
            ((LinearLayout.LayoutParams) cVar).leftMargin = 0;
        }
        super.onMeasure(i, i2);
    }

    public void setExpandedActionViewsExclusive(boolean z) {
        this.D1.K(z);
    }

    public void setOnMenuItemClickListener(e eVar) {
        this.K1 = eVar;
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        this.D1.N(drawable);
    }

    public void setOverflowReserved(boolean z) {
        this.C1 = z;
    }

    public void setPopupTheme(int i) {
        if (this.B1 != i) {
            this.B1 = i;
            if (i == 0) {
                this.A1 = getContext();
            } else {
                this.A1 = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void setPresenter(androidx.appcompat.widget.a aVar) {
        this.D1 = aVar;
        aVar.M(this);
    }

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBaselineAligned(false);
        float f = context.getResources().getDisplayMetrics().density;
        this.I1 = (int) (56.0f * f);
        this.J1 = (int) (f * 4.0f);
        this.A1 = context;
        this.B1 = 0;
    }
}
