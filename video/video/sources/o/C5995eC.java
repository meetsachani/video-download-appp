package o;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.material.chip.Chip;
import java.util.List;
import java.util.Set;
import o.C10861y4;
import o.C7025iN1;
import o.RB;

/* renamed from: o.eC  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C5995eC extends C9368rw0 {
    public static final int i1 = C7025iN1.n.Widget_MaterialComponents_ChipGroup;
    @InterfaceC9397s30
    public int c1;
    @InterfaceC9397s30
    public int d1;
    @InterfaceC11300zs1
    public e e1;
    public final RB<Chip> f1;
    public final int g1;
    @InterfaceC5670cr1
    public final f h1;

    /* renamed from: o.eC$a */
    /* loaded from: classes3.dex */
    public class a implements RB.b {
        public a() {
        }

        @Override // o.RB.b
        public void a(Set<Integer> set) {
            if (C5995eC.this.e1 != null) {
                e eVar = C5995eC.this.e1;
                C5995eC c5995eC = C5995eC.this;
                eVar.a(c5995eC, c5995eC.f1.j(C5995eC.this));
            }
        }
    }

    /* renamed from: o.eC$b */
    /* loaded from: classes3.dex */
    public class b implements e {
        public final /* synthetic */ d a;

        public b(d dVar) {
            this.a = dVar;
        }

        @Override // o.C5995eC.e
        public void a(@InterfaceC5670cr1 C5995eC c5995eC, @InterfaceC5670cr1 List<Integer> list) {
            if (!C5995eC.this.f1.m()) {
                return;
            }
            this.a.a(c5995eC, C5995eC.this.getCheckedChipId());
        }
    }

    /* renamed from: o.eC$c */
    /* loaded from: classes3.dex */
    public static class c extends ViewGroup.MarginLayoutParams {
        public c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public c(int i, int i2) {
            super(i, i2);
        }

        public c(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }
    }

    @Deprecated
    /* renamed from: o.eC$d */
    /* loaded from: classes3.dex */
    public interface d {
        void a(@InterfaceC5670cr1 C5995eC c5995eC, @PL0 int i);
    }

    /* renamed from: o.eC$e */
    /* loaded from: classes3.dex */
    public interface e {
        void a(@InterfaceC5670cr1 C5995eC c5995eC, @InterfaceC5670cr1 List<Integer> list);
    }

    /* renamed from: o.eC$f */
    /* loaded from: classes3.dex */
    public class f implements ViewGroup.OnHierarchyChangeListener {
        public ViewGroup.OnHierarchyChangeListener X;

        public f() {
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewAdded(View view, View view2) {
            if (view == C5995eC.this && (view2 instanceof Chip)) {
                if (view2.getId() == -1) {
                    view2.setId(View.generateViewId());
                }
                C5995eC.this.f1.e((Chip) view2);
            }
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.X;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewAdded(view, view2);
            }
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewRemoved(View view, View view2) {
            C5995eC c5995eC = C5995eC.this;
            if (view == c5995eC && (view2 instanceof Chip)) {
                c5995eC.f1.o((Chip) view2);
            }
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.X;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewRemoved(view, view2);
            }
        }

        public /* synthetic */ f(C5995eC c5995eC, a aVar) {
            this();
        }
    }

    public C5995eC(Context context) {
        this(context, null);
    }

    private int getVisibleChipCount() {
        int i = 0;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            if ((getChildAt(i2) instanceof Chip) && j(i2)) {
                i++;
            }
        }
        return i;
    }

    @Override // o.C9368rw0
    public boolean c() {
        return super.c();
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (super.checkLayoutParams(layoutParams) && (layoutParams instanceof c)) {
            return true;
        }
        return false;
    }

    public void g(@PL0 int i) {
        this.f1.f(i);
    }

    @Override // android.view.ViewGroup
    @InterfaceC5670cr1
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new c(-2, -2);
    }

    @Override // android.view.ViewGroup
    @InterfaceC5670cr1
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new c(getContext(), attributeSet);
    }

    @PL0
    public int getCheckedChipId() {
        return this.f1.k();
    }

    @InterfaceC5670cr1
    public List<Integer> getCheckedChipIds() {
        return this.f1.j(this);
    }

    @InterfaceC9397s30
    public int getChipSpacingHorizontal() {
        return this.c1;
    }

    @InterfaceC9397s30
    public int getChipSpacingVertical() {
        return this.d1;
    }

    public void h() {
        this.f1.h();
    }

    public int i(@InterfaceC11300zs1 View view) {
        if (!(view instanceof Chip)) {
            return -1;
        }
        int i = 0;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            View childAt = getChildAt(i2);
            if ((childAt instanceof Chip) && j(i2)) {
                if (((Chip) childAt) == view) {
                    return i;
                }
                i++;
            }
        }
        return -1;
    }

    public final boolean j(int i) {
        if (getChildAt(i).getVisibility() == 0) {
            return true;
        }
        return false;
    }

    public boolean k() {
        return this.f1.l();
    }

    public boolean l() {
        return this.f1.m();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        int i = this.g1;
        if (i != -1) {
            this.f1.f(i);
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(@InterfaceC5670cr1 AccessibilityNodeInfo accessibilityNodeInfo) {
        int i;
        int i2;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        C10861y4 t2 = C10861y4.t2(accessibilityNodeInfo);
        if (c()) {
            i = getVisibleChipCount();
        } else {
            i = -1;
        }
        int rowCount = getRowCount();
        if (l()) {
            i2 = 1;
        } else {
            i2 = 2;
        }
        t2.m1(C10861y4.f.h(rowCount, i, false, i2));
    }

    public void setChipSpacing(@InterfaceC9397s30 int i) {
        setChipSpacingHorizontal(i);
        setChipSpacingVertical(i);
    }

    public void setChipSpacingHorizontal(@InterfaceC9397s30 int i) {
        if (this.c1 != i) {
            this.c1 = i;
            setItemSpacing(i);
            requestLayout();
        }
    }

    public void setChipSpacingHorizontalResource(@InterfaceC9154r30 int i) {
        setChipSpacingHorizontal(getResources().getDimensionPixelOffset(i));
    }

    public void setChipSpacingResource(@InterfaceC9154r30 int i) {
        setChipSpacing(getResources().getDimensionPixelOffset(i));
    }

    public void setChipSpacingVertical(@InterfaceC9397s30 int i) {
        if (this.d1 != i) {
            this.d1 = i;
            setLineSpacing(i);
            requestLayout();
        }
    }

    public void setChipSpacingVerticalResource(@InterfaceC9154r30 int i) {
        setChipSpacingVertical(getResources().getDimensionPixelOffset(i));
    }

    @Deprecated
    public void setDividerDrawableHorizontal(Drawable drawable) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setDividerDrawableVertical(@InterfaceC11300zs1 Drawable drawable) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setFlexWrap(int i) {
        throw new UnsupportedOperationException("Changing flex wrap not allowed. ChipGroup exposes a singleLine attribute instead.");
    }

    @Deprecated
    public void setOnCheckedChangeListener(@InterfaceC11300zs1 d dVar) {
        if (dVar == null) {
            setOnCheckedStateChangeListener(null);
        } else {
            setOnCheckedStateChangeListener(new b(dVar));
        }
    }

    public void setOnCheckedStateChangeListener(@InterfaceC11300zs1 e eVar) {
        this.e1 = eVar;
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.h1.X = onHierarchyChangeListener;
    }

    public void setSelectionRequired(boolean z) {
        this.f1.q(z);
    }

    @Deprecated
    public void setShowDividerHorizontal(int i) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setShowDividerVertical(int i) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Override // o.C9368rw0
    public void setSingleLine(boolean z) {
        super.setSingleLine(z);
    }

    public void setSingleSelection(boolean z) {
        this.f1.r(z);
    }

    public C5995eC(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C7025iN1.c.chipGroupStyle);
    }

    @Override // android.view.ViewGroup
    @InterfaceC5670cr1
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new c(layoutParams);
    }

    public void setSingleLine(@InterfaceC2669Co int i) {
        setSingleLine(getResources().getBoolean(i));
    }

    public void setSingleSelection(@InterfaceC2669Co int i) {
        setSingleSelection(getResources().getBoolean(i));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C5995eC(Context context, AttributeSet attributeSet, int i) {
        super(C6597gd1.d(context, attributeSet, i, r4), attributeSet, i);
        int i2 = i1;
        RB<Chip> rb = new RB<>();
        this.f1 = rb;
        f fVar = new f(this, null);
        this.h1 = fVar;
        TypedArray k = C7608kn2.k(getContext(), attributeSet, C7025iN1.o.o2, i, i2, new int[0]);
        int dimensionPixelOffset = k.getDimensionPixelOffset(C7025iN1.o.q2, 0);
        setChipSpacingHorizontal(k.getDimensionPixelOffset(C7025iN1.o.r2, dimensionPixelOffset));
        setChipSpacingVertical(k.getDimensionPixelOffset(C7025iN1.o.s2, dimensionPixelOffset));
        setSingleLine(k.getBoolean(C7025iN1.o.u2, false));
        setSingleSelection(k.getBoolean(C7025iN1.o.v2, false));
        setSelectionRequired(k.getBoolean(C7025iN1.o.t2, false));
        this.g1 = k.getResourceId(C7025iN1.o.p2, -1);
        k.recycle();
        rb.p(new a());
        super.setOnHierarchyChangeListener(fVar);
        setImportantForAccessibility(1);
    }
}
