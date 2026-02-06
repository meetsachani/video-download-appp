package o;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import java.util.HashSet;
import o.C10861y4;
import o.C7025iN1;
import o.FE1;
import o.HT1;
import o.OL1;

@HT1({HT1.a.Y})
/* renamed from: o.Mo1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC3661Mo1 extends ViewGroup implements androidx.appcompat.view.menu.k {
    public static final int U1 = -1;
    public static final int[] V1 = {16842912};
    public static final int[] W1 = {-16842910};
    public static final int X1 = -1;
    public static final int Y1 = 7;
    public int A1;
    public int B1;
    public int C1;
    public int D1;
    public int E1;
    public int F1;
    public O22 G1;
    public boolean H1;
    public ColorStateList I1;
    public C3759No1 J1;
    public C3466Ko1 K1;
    public boolean L1;
    public boolean M1;
    public int N1;
    public int O1;
    public boolean P1;
    public MenuItem Q1;
    public int R1;
    public boolean S1;
    public final Rect T1;
    @InterfaceC11300zs1
    public final C2692Ct2 Y0;
    @InterfaceC5670cr1
    public final View.OnClickListener Z0;
    @InterfaceC11300zs1
    public FE1.a<AbstractC3270Io1> a1;
    @InterfaceC5670cr1
    public final SparseArray<View.OnTouchListener> b1;
    public int c1;
    public int d1;
    @InterfaceC11300zs1
    public InterfaceC3564Lo1[] e1;
    public int f1;
    public int g1;
    @InterfaceC11300zs1
    public ColorStateList h1;
    @InterfaceC9397s30
    public int i1;
    public ColorStateList j1;
    @InterfaceC11300zs1
    public final ColorStateList k1;
    @InterfaceC4698Xf2
    public int l1;
    @InterfaceC4698Xf2
    public int m1;
    @InterfaceC4698Xf2
    public int n1;
    @InterfaceC4698Xf2
    public int o1;
    public boolean p1;
    public Drawable q1;
    @InterfaceC11300zs1
    public ColorStateList r1;
    public int s1;
    @InterfaceC5670cr1
    public final SparseArray<C2555Bk> t1;
    public int u1;
    public int v1;
    public int w1;
    public int x1;
    public boolean y1;
    public int z1;

    /* renamed from: o.Mo1$a */
    /* loaded from: classes3.dex */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            androidx.appcompat.view.menu.h itemData = ((AbstractC3270Io1) view).getItemData();
            boolean e = AbstractC3661Mo1.this.K1.e(itemData, AbstractC3661Mo1.this.J1, 0);
            if (itemData != null && itemData.isCheckable()) {
                if (!e || itemData.isChecked()) {
                    AbstractC3661Mo1.this.setCheckedItem(itemData);
                }
            }
        }
    }

    public AbstractC3661Mo1(@InterfaceC5670cr1 Context context) {
        super(context);
        this.b1 = new SparseArray<>();
        this.f1 = -1;
        this.g1 = -1;
        this.t1 = new SparseArray<>();
        this.u1 = -1;
        this.v1 = -1;
        this.w1 = -1;
        this.x1 = -1;
        this.F1 = 49;
        this.H1 = false;
        this.N1 = 1;
        this.O1 = 0;
        this.Q1 = null;
        this.R1 = 7;
        this.S1 = false;
        this.T1 = new Rect();
        this.k1 = e(16842808);
        if (isInEditMode()) {
            this.Y0 = null;
        } else {
            C6360fi c6360fi = new C6360fi();
            this.Y0 = c6360fi;
            c6360fi.m1(0);
            c6360fi.E(TextView.class, true);
            c6360fi.I0(C9811tl1.f(getContext(), C7025iN1.c.motionDurationMedium4, getResources().getInteger(C7025iN1.i.material_motion_duration_long_1)));
            c6360fi.K0(C9811tl1.g(getContext(), C7025iN1.c.motionEasingStandard, C5600ca.b));
            c6360fi.X0(new C4338Tm2());
        }
        this.Z0 = new a();
        setImportantForAccessibility(1);
    }

    private int getCollapsedVisibleItemCount() {
        return Math.min(this.R1, this.K1.d());
    }

    private AbstractC3270Io1 getNewItem() {
        AbstractC3270Io1 abstractC3270Io1;
        FE1.a<AbstractC3270Io1> aVar = this.a1;
        if (aVar != null) {
            abstractC3270Io1 = aVar.a();
        } else {
            abstractC3270Io1 = null;
        }
        if (abstractC3270Io1 == null) {
            return h(getContext());
        }
        return abstractC3270Io1;
    }

    private void setBadgeIfNeeded(@InterfaceC5670cr1 AbstractC3270Io1 abstractC3270Io1) {
        C2555Bk c2555Bk;
        int id = abstractC3270Io1.getId();
        if (p(id) && (c2555Bk = this.t1.get(id)) != null) {
            abstractC3270Io1.setBadge(c2555Bk);
        }
    }

    @Override // androidx.appcompat.view.menu.k
    public void c(@InterfaceC5670cr1 androidx.appcompat.view.menu.e eVar) {
        this.K1 = new C3466Ko1(eVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @SuppressLint({"ClickableViewAccessibility"})
    public void d() {
        boolean z;
        AbstractC3270Io1 abstractC3270Io1;
        removeAllViews();
        q();
        this.J1.n(true);
        this.K1.f();
        this.J1.n(false);
        int a2 = this.K1.a();
        if (a2 == 0) {
            this.f1 = 0;
            this.g1 = 0;
            this.e1 = null;
            this.a1 = null;
            return;
        }
        if (this.a1 == null || this.O1 != a2) {
            this.O1 = a2;
            this.a1 = new FE1.c(a2);
        }
        s();
        int g = this.K1.g();
        this.e1 = new InterfaceC3564Lo1[g];
        boolean o2 = o(this.c1, getCurrentVisibleContentItemCount());
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < g; i3++) {
            MenuItem b = this.K1.b(i3);
            boolean z2 = b instanceof H40;
            if (z2) {
                C2976Fo1 c2976Fo1 = new C2976Fo1(getContext());
                c2976Fo1.setOnlyShowWhenExpanded(true);
                c2976Fo1.setDividersEnabled(this.S1);
                abstractC3270Io1 = c2976Fo1;
            } else if (b.hasSubMenu()) {
                if (i <= 0) {
                    C3954Po1 c3954Po1 = new C3954Po1(getContext());
                    int i4 = this.o1;
                    if (i4 == 0) {
                        i4 = this.m1;
                    }
                    c3954Po1.setTextAppearance(i4);
                    c3954Po1.setTextColor(this.j1);
                    c3954Po1.setOnlyShowWhenExpanded(true);
                    c3954Po1.g((androidx.appcompat.view.menu.h) b, 0);
                    i = b.getSubMenu().size();
                    abstractC3270Io1 = c3954Po1;
                } else {
                    throw new IllegalArgumentException("Only one layer of submenu is supported; a submenu inside a submenu is not supported by the Navigation Bar.");
                }
            } else if (i > 0) {
                i--;
                abstractC3270Io1 = g(i3, (androidx.appcompat.view.menu.h) b, o2, true);
            } else {
                androidx.appcompat.view.menu.h hVar = (androidx.appcompat.view.menu.h) b;
                if (i2 >= this.R1) {
                    z = true;
                } else {
                    z = false;
                }
                i2++;
                abstractC3270Io1 = g(i3, hVar, o2, z);
            }
            if (!z2 && b.isCheckable() && this.g1 == -1) {
                this.g1 = i3;
            }
            this.e1[i3] = abstractC3270Io1;
            addView(abstractC3270Io1);
        }
        int min = Math.min(g - 1, this.g1);
        this.g1 = min;
        setCheckedItem(this.e1[min].getItemData());
    }

    @InterfaceC11300zs1
    public ColorStateList e(int i) {
        TypedValue typedValue = new TypedValue();
        if (!getContext().getTheme().resolveAttribute(i, typedValue, true)) {
            return null;
        }
        ColorStateList a2 = C3220Ic.a(getContext(), typedValue.resourceId);
        if (!getContext().getTheme().resolveAttribute(OL1.b.J0, typedValue, true)) {
            return null;
        }
        int i2 = typedValue.data;
        int defaultColor = a2.getDefaultColor();
        int[] iArr = W1;
        return new ColorStateList(new int[][]{iArr, V1, ViewGroup.EMPTY_STATE_SET}, new int[]{a2.getColorForState(iArr, defaultColor), i2, defaultColor});
    }

    @InterfaceC11300zs1
    public final Drawable f() {
        if (this.G1 != null && this.I1 != null) {
            C4394Uc1 c4394Uc1 = new C4394Uc1(this.G1);
            c4394Uc1.y0(this.I1);
            return c4394Uc1;
        }
        return null;
    }

    public final AbstractC3270Io1 g(int i, androidx.appcompat.view.menu.h hVar, boolean z, boolean z2) {
        this.J1.n(true);
        hVar.setCheckable(true);
        this.J1.n(false);
        AbstractC3270Io1 newItem = getNewItem();
        newItem.setShifting(z);
        newItem.setLabelMaxLines(this.N1);
        newItem.setIconTintList(this.h1);
        newItem.setIconSize(this.i1);
        newItem.setTextColor(this.k1);
        newItem.setTextAppearanceInactive(this.l1);
        newItem.setTextAppearanceActive(this.m1);
        newItem.setHorizontalTextAppearanceInactive(this.n1);
        newItem.setHorizontalTextAppearanceActive(this.o1);
        newItem.setTextAppearanceActiveBoldEnabled(this.p1);
        newItem.setTextColor(this.j1);
        int i2 = this.u1;
        if (i2 != -1) {
            newItem.setItemPaddingTop(i2);
        }
        int i3 = this.v1;
        if (i3 != -1) {
            newItem.setItemPaddingBottom(i3);
        }
        newItem.setMeasureBottomPaddingFromLabelBaseline(this.L1);
        newItem.setLabelFontScalingEnabled(this.M1);
        int i4 = this.w1;
        if (i4 != -1) {
            newItem.setActiveIndicatorLabelPadding(i4);
        }
        int i5 = this.x1;
        if (i5 != -1) {
            newItem.setIconLabelHorizontalSpacing(i5);
        }
        newItem.setActiveIndicatorWidth(this.z1);
        newItem.setActiveIndicatorHeight(this.A1);
        newItem.setActiveIndicatorExpandedWidth(this.B1);
        newItem.setActiveIndicatorExpandedHeight(this.C1);
        newItem.setActiveIndicatorMarginHorizontal(this.D1);
        newItem.setItemGravity(this.F1);
        newItem.setActiveIndicatorExpandedPadding(this.T1);
        newItem.setActiveIndicatorExpandedMarginHorizontal(this.E1);
        newItem.setActiveIndicatorDrawable(f());
        newItem.setActiveIndicatorResizeable(this.H1);
        newItem.setActiveIndicatorEnabled(this.y1);
        Drawable drawable = this.q1;
        if (drawable != null) {
            newItem.setItemBackground(drawable);
        } else {
            newItem.setItemBackground(this.s1);
        }
        newItem.setItemRippleColor(this.r1);
        newItem.setLabelVisibilityMode(this.c1);
        newItem.setItemIconGravity(this.d1);
        newItem.setOnlyShowWhenExpanded(z2);
        newItem.setExpanded(this.P1);
        newItem.g(hVar, 0);
        newItem.setItemPosition(i);
        int itemId = hVar.getItemId();
        newItem.setOnTouchListener(this.b1.get(itemId));
        newItem.setOnClickListener(this.Z0);
        int i6 = this.f1;
        if (i6 != 0 && itemId == i6) {
            this.g1 = i;
        }
        setBadgeIfNeeded(newItem);
        return newItem;
    }

    @PK1
    public int getActiveIndicatorLabelPadding() {
        return this.w1;
    }

    public SparseArray<C2555Bk> getBadgeDrawables() {
        return this.t1;
    }

    public int getCurrentVisibleContentItemCount() {
        if (this.P1) {
            return this.K1.c();
        }
        return getCollapsedVisibleItemCount();
    }

    @InterfaceC4698Xf2
    public int getHorizontalItemTextAppearanceActive() {
        return this.o1;
    }

    @InterfaceC4698Xf2
    public int getHorizontalItemTextAppearanceInactive() {
        return this.n1;
    }

    @PK1
    public int getIconLabelHorizontalSpacing() {
        return this.x1;
    }

    @InterfaceC11300zs1
    public ColorStateList getIconTintList() {
        return this.h1;
    }

    @InterfaceC11300zs1
    public ColorStateList getItemActiveIndicatorColor() {
        return this.I1;
    }

    public boolean getItemActiveIndicatorEnabled() {
        return this.y1;
    }

    @PK1
    public int getItemActiveIndicatorExpandedHeight() {
        return this.C1;
    }

    @PK1
    public int getItemActiveIndicatorExpandedMarginHorizontal() {
        return this.E1;
    }

    @PK1
    public int getItemActiveIndicatorExpandedWidth() {
        return this.B1;
    }

    @PK1
    public int getItemActiveIndicatorHeight() {
        return this.A1;
    }

    @PK1
    public int getItemActiveIndicatorMarginHorizontal() {
        return this.D1;
    }

    @InterfaceC11300zs1
    public O22 getItemActiveIndicatorShapeAppearance() {
        return this.G1;
    }

    @PK1
    public int getItemActiveIndicatorWidth() {
        return this.z1;
    }

    @InterfaceC11300zs1
    public Drawable getItemBackground() {
        InterfaceC3564Lo1[] interfaceC3564Lo1Arr = this.e1;
        if (interfaceC3564Lo1Arr != null && interfaceC3564Lo1Arr.length > 0) {
            for (InterfaceC3564Lo1 interfaceC3564Lo1 : interfaceC3564Lo1Arr) {
                if (interfaceC3564Lo1 instanceof AbstractC3270Io1) {
                    return ((AbstractC3270Io1) interfaceC3564Lo1).getBackground();
                }
            }
        }
        return this.q1;
    }

    @Deprecated
    public int getItemBackgroundRes() {
        return this.s1;
    }

    public int getItemGravity() {
        return this.F1;
    }

    public int getItemIconGravity() {
        return this.d1;
    }

    @InterfaceC9397s30
    public int getItemIconSize() {
        return this.i1;
    }

    @PK1
    public int getItemPaddingBottom() {
        return this.v1;
    }

    @PK1
    public int getItemPaddingTop() {
        return this.u1;
    }

    @InterfaceC11300zs1
    public ColorStateList getItemRippleColor() {
        return this.r1;
    }

    @InterfaceC4698Xf2
    public int getItemTextAppearanceActive() {
        return this.m1;
    }

    @InterfaceC4698Xf2
    public int getItemTextAppearanceInactive() {
        return this.l1;
    }

    @InterfaceC11300zs1
    public ColorStateList getItemTextColor() {
        return this.j1;
    }

    public int getLabelMaxLines() {
        return this.N1;
    }

    public int getLabelVisibilityMode() {
        return this.c1;
    }

    @InterfaceC11300zs1
    public C3466Ko1 getMenu() {
        return this.K1;
    }

    public boolean getScaleLabelTextWithFont() {
        return this.M1;
    }

    public int getSelectedItemId() {
        return this.f1;
    }

    public int getSelectedItemPosition() {
        return this.g1;
    }

    @Override // androidx.appcompat.view.menu.k
    public int getWindowAnimations() {
        return 0;
    }

    @InterfaceC5670cr1
    public abstract AbstractC3270Io1 h(@InterfaceC5670cr1 Context context);

    @InterfaceC11300zs1
    public AbstractC3270Io1 i(int i) {
        z(i);
        InterfaceC3564Lo1[] interfaceC3564Lo1Arr = this.e1;
        if (interfaceC3564Lo1Arr != null) {
            for (InterfaceC3564Lo1 interfaceC3564Lo1 : interfaceC3564Lo1Arr) {
                if (interfaceC3564Lo1 instanceof AbstractC3270Io1) {
                    AbstractC3270Io1 abstractC3270Io1 = (AbstractC3270Io1) interfaceC3564Lo1;
                    if (abstractC3270Io1.getId() == i) {
                        return abstractC3270Io1;
                    }
                }
            }
            return null;
        }
        return null;
    }

    @InterfaceC11300zs1
    public C2555Bk j(int i) {
        return this.t1.get(i);
    }

    public C2555Bk k(int i) {
        z(i);
        C2555Bk c2555Bk = this.t1.get(i);
        if (c2555Bk == null) {
            c2555Bk = C2555Bk.g(getContext());
            this.t1.put(i, c2555Bk);
        }
        AbstractC3270Io1 i2 = i(i);
        if (i2 != null) {
            i2.setBadge(c2555Bk);
        }
        return c2555Bk;
    }

    public boolean l() {
        return this.P1;
    }

    public boolean m() {
        return this.H1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0068, code lost:
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean n() {
        C3466Ko1 c3466Ko1;
        boolean z;
        if (this.e1 == null || (c3466Ko1 = this.K1) == null || c3466Ko1.g() != this.e1.length) {
            return false;
        }
        int i = 0;
        while (true) {
            boolean z2 = true;
            if (i >= this.e1.length) {
                return true;
            }
            if ((this.K1.b(i) instanceof H40) && !(this.e1[i] instanceof C2976Fo1)) {
                return false;
            }
            if (this.K1.b(i).hasSubMenu() && !(this.e1[i] instanceof C3954Po1)) {
                z = true;
            } else {
                z = false;
            }
            if (this.K1.b(i).hasSubMenu() || (this.e1[i] instanceof AbstractC3270Io1)) {
                z2 = false;
            }
            if ((this.K1.b(i) instanceof H40) || (!z && !z2)) {
                i++;
            }
        }
    }

    public boolean o(int i, int i2) {
        if (i == -1) {
            if (i2 <= 3) {
                return false;
            }
            return true;
        } else if (i != 0) {
            return false;
        } else {
            return true;
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(@InterfaceC5670cr1 AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        C10861y4.t2(accessibilityNodeInfo).m1(C10861y4.f.h(1, getCurrentVisibleContentItemCount(), false, 1));
    }

    public final boolean p(int i) {
        if (i != -1) {
            return true;
        }
        return false;
    }

    public final void q() {
        InterfaceC3564Lo1[] interfaceC3564Lo1Arr = this.e1;
        if (interfaceC3564Lo1Arr != null && this.a1 != null) {
            for (InterfaceC3564Lo1 interfaceC3564Lo1 : interfaceC3564Lo1Arr) {
                if (interfaceC3564Lo1 instanceof AbstractC3270Io1) {
                    AbstractC3270Io1 abstractC3270Io1 = (AbstractC3270Io1) interfaceC3564Lo1;
                    this.a1.b(abstractC3270Io1);
                    abstractC3270Io1.h();
                }
            }
        }
    }

    public void r(int i) {
        z(i);
        AbstractC3270Io1 i2 = i(i);
        if (i2 != null) {
            i2.p();
        }
        this.t1.put(i, null);
    }

    public final void s() {
        HashSet hashSet = new HashSet();
        for (int i = 0; i < this.K1.g(); i++) {
            hashSet.add(Integer.valueOf(this.K1.b(i).getItemId()));
        }
        for (int i2 = 0; i2 < this.t1.size(); i2++) {
            int keyAt = this.t1.keyAt(i2);
            if (!hashSet.contains(Integer.valueOf(keyAt))) {
                this.t1.delete(keyAt);
            }
        }
    }

    public void setActiveIndicatorLabelPadding(@PK1 int i) {
        this.w1 = i;
        InterfaceC3564Lo1[] interfaceC3564Lo1Arr = this.e1;
        if (interfaceC3564Lo1Arr != null) {
            for (InterfaceC3564Lo1 interfaceC3564Lo1 : interfaceC3564Lo1Arr) {
                if (interfaceC3564Lo1 instanceof AbstractC3270Io1) {
                    ((AbstractC3270Io1) interfaceC3564Lo1).setActiveIndicatorLabelPadding(i);
                }
            }
        }
    }

    public void setCheckedItem(@InterfaceC5670cr1 MenuItem menuItem) {
        if (this.Q1 != menuItem && menuItem.isCheckable()) {
            MenuItem menuItem2 = this.Q1;
            if (menuItem2 != null && menuItem2.isChecked()) {
                this.Q1.setChecked(false);
            }
            menuItem.setChecked(true);
            this.Q1 = menuItem;
        }
    }

    public void setCollapsedMaxItemCount(int i) {
        this.R1 = i;
    }

    public void setExpanded(boolean z) {
        this.P1 = z;
        InterfaceC3564Lo1[] interfaceC3564Lo1Arr = this.e1;
        if (interfaceC3564Lo1Arr != null) {
            for (InterfaceC3564Lo1 interfaceC3564Lo1 : interfaceC3564Lo1Arr) {
                interfaceC3564Lo1.setExpanded(z);
            }
        }
    }

    public void setHorizontalItemTextAppearanceActive(@InterfaceC4698Xf2 int i) {
        this.o1 = i;
        InterfaceC3564Lo1[] interfaceC3564Lo1Arr = this.e1;
        if (interfaceC3564Lo1Arr != null) {
            for (InterfaceC3564Lo1 interfaceC3564Lo1 : interfaceC3564Lo1Arr) {
                if (interfaceC3564Lo1 instanceof AbstractC3270Io1) {
                    ((AbstractC3270Io1) interfaceC3564Lo1).setHorizontalTextAppearanceActive(i);
                }
            }
        }
    }

    public void setHorizontalItemTextAppearanceInactive(@InterfaceC4698Xf2 int i) {
        this.n1 = i;
        InterfaceC3564Lo1[] interfaceC3564Lo1Arr = this.e1;
        if (interfaceC3564Lo1Arr != null) {
            for (InterfaceC3564Lo1 interfaceC3564Lo1 : interfaceC3564Lo1Arr) {
                if (interfaceC3564Lo1 instanceof AbstractC3270Io1) {
                    ((AbstractC3270Io1) interfaceC3564Lo1).setHorizontalTextAppearanceInactive(i);
                }
            }
        }
    }

    public void setIconLabelHorizontalSpacing(@PK1 int i) {
        this.x1 = i;
        InterfaceC3564Lo1[] interfaceC3564Lo1Arr = this.e1;
        if (interfaceC3564Lo1Arr != null) {
            for (InterfaceC3564Lo1 interfaceC3564Lo1 : interfaceC3564Lo1Arr) {
                if (interfaceC3564Lo1 instanceof AbstractC3270Io1) {
                    ((AbstractC3270Io1) interfaceC3564Lo1).setIconLabelHorizontalSpacing(i);
                }
            }
        }
    }

    public void setIconTintList(@InterfaceC11300zs1 ColorStateList colorStateList) {
        this.h1 = colorStateList;
        InterfaceC3564Lo1[] interfaceC3564Lo1Arr = this.e1;
        if (interfaceC3564Lo1Arr != null) {
            for (InterfaceC3564Lo1 interfaceC3564Lo1 : interfaceC3564Lo1Arr) {
                if (interfaceC3564Lo1 instanceof AbstractC3270Io1) {
                    ((AbstractC3270Io1) interfaceC3564Lo1).setIconTintList(colorStateList);
                }
            }
        }
    }

    public void setItemActiveIndicatorColor(@InterfaceC11300zs1 ColorStateList colorStateList) {
        this.I1 = colorStateList;
        InterfaceC3564Lo1[] interfaceC3564Lo1Arr = this.e1;
        if (interfaceC3564Lo1Arr != null) {
            for (InterfaceC3564Lo1 interfaceC3564Lo1 : interfaceC3564Lo1Arr) {
                if (interfaceC3564Lo1 instanceof AbstractC3270Io1) {
                    ((AbstractC3270Io1) interfaceC3564Lo1).setActiveIndicatorDrawable(f());
                }
            }
        }
    }

    public void setItemActiveIndicatorEnabled(boolean z) {
        this.y1 = z;
        InterfaceC3564Lo1[] interfaceC3564Lo1Arr = this.e1;
        if (interfaceC3564Lo1Arr != null) {
            for (InterfaceC3564Lo1 interfaceC3564Lo1 : interfaceC3564Lo1Arr) {
                if (interfaceC3564Lo1 instanceof AbstractC3270Io1) {
                    ((AbstractC3270Io1) interfaceC3564Lo1).setActiveIndicatorEnabled(z);
                }
            }
        }
    }

    public void setItemActiveIndicatorExpandedHeight(@PK1 int i) {
        this.C1 = i;
        InterfaceC3564Lo1[] interfaceC3564Lo1Arr = this.e1;
        if (interfaceC3564Lo1Arr != null) {
            for (InterfaceC3564Lo1 interfaceC3564Lo1 : interfaceC3564Lo1Arr) {
                if (interfaceC3564Lo1 instanceof AbstractC3270Io1) {
                    ((AbstractC3270Io1) interfaceC3564Lo1).setActiveIndicatorExpandedHeight(i);
                }
            }
        }
    }

    public void setItemActiveIndicatorExpandedMarginHorizontal(@PK1 int i) {
        this.E1 = i;
        InterfaceC3564Lo1[] interfaceC3564Lo1Arr = this.e1;
        if (interfaceC3564Lo1Arr != null) {
            for (InterfaceC3564Lo1 interfaceC3564Lo1 : interfaceC3564Lo1Arr) {
                if (interfaceC3564Lo1 instanceof AbstractC3270Io1) {
                    ((AbstractC3270Io1) interfaceC3564Lo1).setActiveIndicatorExpandedMarginHorizontal(i);
                }
            }
        }
    }

    public void setItemActiveIndicatorExpandedWidth(@PK1 int i) {
        this.B1 = i;
        InterfaceC3564Lo1[] interfaceC3564Lo1Arr = this.e1;
        if (interfaceC3564Lo1Arr != null) {
            for (InterfaceC3564Lo1 interfaceC3564Lo1 : interfaceC3564Lo1Arr) {
                if (interfaceC3564Lo1 instanceof AbstractC3270Io1) {
                    ((AbstractC3270Io1) interfaceC3564Lo1).setActiveIndicatorExpandedWidth(i);
                }
            }
        }
    }

    public void setItemActiveIndicatorHeight(@PK1 int i) {
        this.A1 = i;
        InterfaceC3564Lo1[] interfaceC3564Lo1Arr = this.e1;
        if (interfaceC3564Lo1Arr != null) {
            for (InterfaceC3564Lo1 interfaceC3564Lo1 : interfaceC3564Lo1Arr) {
                if (interfaceC3564Lo1 instanceof AbstractC3270Io1) {
                    ((AbstractC3270Io1) interfaceC3564Lo1).setActiveIndicatorHeight(i);
                }
            }
        }
    }

    public void setItemActiveIndicatorMarginHorizontal(@PK1 int i) {
        this.D1 = i;
        InterfaceC3564Lo1[] interfaceC3564Lo1Arr = this.e1;
        if (interfaceC3564Lo1Arr != null) {
            for (InterfaceC3564Lo1 interfaceC3564Lo1 : interfaceC3564Lo1Arr) {
                if (interfaceC3564Lo1 instanceof AbstractC3270Io1) {
                    ((AbstractC3270Io1) interfaceC3564Lo1).setActiveIndicatorMarginHorizontal(i);
                }
            }
        }
    }

    public void setItemActiveIndicatorResizeable(boolean z) {
        this.H1 = z;
        InterfaceC3564Lo1[] interfaceC3564Lo1Arr = this.e1;
        if (interfaceC3564Lo1Arr != null) {
            for (InterfaceC3564Lo1 interfaceC3564Lo1 : interfaceC3564Lo1Arr) {
                if (interfaceC3564Lo1 instanceof AbstractC3270Io1) {
                    ((AbstractC3270Io1) interfaceC3564Lo1).setActiveIndicatorResizeable(z);
                }
            }
        }
    }

    public void setItemActiveIndicatorShapeAppearance(@InterfaceC11300zs1 O22 o22) {
        this.G1 = o22;
        InterfaceC3564Lo1[] interfaceC3564Lo1Arr = this.e1;
        if (interfaceC3564Lo1Arr != null) {
            for (InterfaceC3564Lo1 interfaceC3564Lo1 : interfaceC3564Lo1Arr) {
                if (interfaceC3564Lo1 instanceof AbstractC3270Io1) {
                    ((AbstractC3270Io1) interfaceC3564Lo1).setActiveIndicatorDrawable(f());
                }
            }
        }
    }

    public void setItemActiveIndicatorWidth(@PK1 int i) {
        this.z1 = i;
        InterfaceC3564Lo1[] interfaceC3564Lo1Arr = this.e1;
        if (interfaceC3564Lo1Arr != null) {
            for (InterfaceC3564Lo1 interfaceC3564Lo1 : interfaceC3564Lo1Arr) {
                if (interfaceC3564Lo1 instanceof AbstractC3270Io1) {
                    ((AbstractC3270Io1) interfaceC3564Lo1).setActiveIndicatorWidth(i);
                }
            }
        }
    }

    public void setItemBackground(@InterfaceC11300zs1 Drawable drawable) {
        this.q1 = drawable;
        InterfaceC3564Lo1[] interfaceC3564Lo1Arr = this.e1;
        if (interfaceC3564Lo1Arr != null) {
            for (InterfaceC3564Lo1 interfaceC3564Lo1 : interfaceC3564Lo1Arr) {
                if (interfaceC3564Lo1 instanceof AbstractC3270Io1) {
                    ((AbstractC3270Io1) interfaceC3564Lo1).setItemBackground(drawable);
                }
            }
        }
    }

    public void setItemBackgroundRes(int i) {
        this.s1 = i;
        InterfaceC3564Lo1[] interfaceC3564Lo1Arr = this.e1;
        if (interfaceC3564Lo1Arr != null) {
            for (InterfaceC3564Lo1 interfaceC3564Lo1 : interfaceC3564Lo1Arr) {
                if (interfaceC3564Lo1 instanceof AbstractC3270Io1) {
                    ((AbstractC3270Io1) interfaceC3564Lo1).setItemBackground(i);
                }
            }
        }
    }

    public void setItemGravity(int i) {
        this.F1 = i;
        InterfaceC3564Lo1[] interfaceC3564Lo1Arr = this.e1;
        if (interfaceC3564Lo1Arr != null) {
            for (InterfaceC3564Lo1 interfaceC3564Lo1 : interfaceC3564Lo1Arr) {
                if (interfaceC3564Lo1 instanceof AbstractC3270Io1) {
                    ((AbstractC3270Io1) interfaceC3564Lo1).setItemGravity(i);
                }
            }
        }
    }

    public void setItemIconGravity(int i) {
        this.d1 = i;
        InterfaceC3564Lo1[] interfaceC3564Lo1Arr = this.e1;
        if (interfaceC3564Lo1Arr != null) {
            for (InterfaceC3564Lo1 interfaceC3564Lo1 : interfaceC3564Lo1Arr) {
                if (interfaceC3564Lo1 instanceof AbstractC3270Io1) {
                    ((AbstractC3270Io1) interfaceC3564Lo1).setItemIconGravity(i);
                }
            }
        }
    }

    public void setItemIconSize(@InterfaceC9397s30 int i) {
        this.i1 = i;
        InterfaceC3564Lo1[] interfaceC3564Lo1Arr = this.e1;
        if (interfaceC3564Lo1Arr != null) {
            for (InterfaceC3564Lo1 interfaceC3564Lo1 : interfaceC3564Lo1Arr) {
                if (interfaceC3564Lo1 instanceof AbstractC3270Io1) {
                    ((AbstractC3270Io1) interfaceC3564Lo1).setIconSize(i);
                }
            }
        }
    }

    public void setItemPaddingBottom(@PK1 int i) {
        this.v1 = i;
        InterfaceC3564Lo1[] interfaceC3564Lo1Arr = this.e1;
        if (interfaceC3564Lo1Arr != null) {
            for (InterfaceC3564Lo1 interfaceC3564Lo1 : interfaceC3564Lo1Arr) {
                if (interfaceC3564Lo1 instanceof AbstractC3270Io1) {
                    ((AbstractC3270Io1) interfaceC3564Lo1).setItemPaddingBottom(this.v1);
                }
            }
        }
    }

    public void setItemPaddingTop(@PK1 int i) {
        this.u1 = i;
        InterfaceC3564Lo1[] interfaceC3564Lo1Arr = this.e1;
        if (interfaceC3564Lo1Arr != null) {
            for (InterfaceC3564Lo1 interfaceC3564Lo1 : interfaceC3564Lo1Arr) {
                if (interfaceC3564Lo1 instanceof AbstractC3270Io1) {
                    ((AbstractC3270Io1) interfaceC3564Lo1).setItemPaddingTop(i);
                }
            }
        }
    }

    public void setItemRippleColor(@InterfaceC11300zs1 ColorStateList colorStateList) {
        this.r1 = colorStateList;
        InterfaceC3564Lo1[] interfaceC3564Lo1Arr = this.e1;
        if (interfaceC3564Lo1Arr != null) {
            for (InterfaceC3564Lo1 interfaceC3564Lo1 : interfaceC3564Lo1Arr) {
                if (interfaceC3564Lo1 instanceof AbstractC3270Io1) {
                    ((AbstractC3270Io1) interfaceC3564Lo1).setItemRippleColor(colorStateList);
                }
            }
        }
    }

    public void setItemTextAppearanceActive(@InterfaceC4698Xf2 int i) {
        this.m1 = i;
        InterfaceC3564Lo1[] interfaceC3564Lo1Arr = this.e1;
        if (interfaceC3564Lo1Arr != null) {
            for (InterfaceC3564Lo1 interfaceC3564Lo1 : interfaceC3564Lo1Arr) {
                if (interfaceC3564Lo1 instanceof AbstractC3270Io1) {
                    ((AbstractC3270Io1) interfaceC3564Lo1).setTextAppearanceActive(i);
                }
            }
        }
    }

    public void setItemTextAppearanceActiveBoldEnabled(boolean z) {
        this.p1 = z;
        InterfaceC3564Lo1[] interfaceC3564Lo1Arr = this.e1;
        if (interfaceC3564Lo1Arr != null) {
            for (InterfaceC3564Lo1 interfaceC3564Lo1 : interfaceC3564Lo1Arr) {
                if (interfaceC3564Lo1 instanceof AbstractC3270Io1) {
                    ((AbstractC3270Io1) interfaceC3564Lo1).setTextAppearanceActiveBoldEnabled(z);
                }
            }
        }
    }

    public void setItemTextAppearanceInactive(@InterfaceC4698Xf2 int i) {
        this.l1 = i;
        InterfaceC3564Lo1[] interfaceC3564Lo1Arr = this.e1;
        if (interfaceC3564Lo1Arr != null) {
            for (InterfaceC3564Lo1 interfaceC3564Lo1 : interfaceC3564Lo1Arr) {
                if (interfaceC3564Lo1 instanceof AbstractC3270Io1) {
                    ((AbstractC3270Io1) interfaceC3564Lo1).setTextAppearanceInactive(i);
                }
            }
        }
    }

    public void setItemTextColor(@InterfaceC11300zs1 ColorStateList colorStateList) {
        this.j1 = colorStateList;
        InterfaceC3564Lo1[] interfaceC3564Lo1Arr = this.e1;
        if (interfaceC3564Lo1Arr != null) {
            for (InterfaceC3564Lo1 interfaceC3564Lo1 : interfaceC3564Lo1Arr) {
                if (interfaceC3564Lo1 instanceof AbstractC3270Io1) {
                    ((AbstractC3270Io1) interfaceC3564Lo1).setTextColor(colorStateList);
                }
            }
        }
    }

    public void setLabelFontScalingEnabled(boolean z) {
        this.M1 = z;
        InterfaceC3564Lo1[] interfaceC3564Lo1Arr = this.e1;
        if (interfaceC3564Lo1Arr != null) {
            for (InterfaceC3564Lo1 interfaceC3564Lo1 : interfaceC3564Lo1Arr) {
                if (interfaceC3564Lo1 instanceof AbstractC3270Io1) {
                    ((AbstractC3270Io1) interfaceC3564Lo1).setLabelFontScalingEnabled(z);
                }
            }
        }
    }

    public void setLabelMaxLines(int i) {
        this.N1 = i;
        InterfaceC3564Lo1[] interfaceC3564Lo1Arr = this.e1;
        if (interfaceC3564Lo1Arr != null) {
            for (InterfaceC3564Lo1 interfaceC3564Lo1 : interfaceC3564Lo1Arr) {
                if (interfaceC3564Lo1 instanceof AbstractC3270Io1) {
                    ((AbstractC3270Io1) interfaceC3564Lo1).setLabelMaxLines(i);
                }
            }
        }
    }

    public void setLabelVisibilityMode(int i) {
        this.c1 = i;
    }

    public void setMeasurePaddingFromLabelBaseline(boolean z) {
        this.L1 = z;
        InterfaceC3564Lo1[] interfaceC3564Lo1Arr = this.e1;
        if (interfaceC3564Lo1Arr != null) {
            for (InterfaceC3564Lo1 interfaceC3564Lo1 : interfaceC3564Lo1Arr) {
                if (interfaceC3564Lo1 instanceof AbstractC3270Io1) {
                    ((AbstractC3270Io1) interfaceC3564Lo1).setMeasureBottomPaddingFromLabelBaseline(z);
                }
            }
        }
    }

    public void setPresenter(@InterfaceC5670cr1 C3759No1 c3759No1) {
        this.J1 = c3759No1;
    }

    public void setSubmenuDividersEnabled(boolean z) {
        if (this.S1 != z) {
            this.S1 = z;
            InterfaceC3564Lo1[] interfaceC3564Lo1Arr = this.e1;
            if (interfaceC3564Lo1Arr != null) {
                for (InterfaceC3564Lo1 interfaceC3564Lo1 : interfaceC3564Lo1Arr) {
                    if (interfaceC3564Lo1 instanceof C2976Fo1) {
                        ((C2976Fo1) interfaceC3564Lo1).setDividersEnabled(z);
                    }
                }
            }
        }
    }

    public void t(SparseArray<C2555Bk> sparseArray) {
        for (int i = 0; i < sparseArray.size(); i++) {
            int keyAt = sparseArray.keyAt(i);
            if (this.t1.indexOfKey(keyAt) < 0) {
                this.t1.append(keyAt, sparseArray.get(keyAt));
            }
        }
        InterfaceC3564Lo1[] interfaceC3564Lo1Arr = this.e1;
        if (interfaceC3564Lo1Arr != null) {
            for (InterfaceC3564Lo1 interfaceC3564Lo1 : interfaceC3564Lo1Arr) {
                if (interfaceC3564Lo1 instanceof AbstractC3270Io1) {
                    AbstractC3270Io1 abstractC3270Io1 = (AbstractC3270Io1) interfaceC3564Lo1;
                    C2555Bk c2555Bk = this.t1.get(abstractC3270Io1.getId());
                    if (c2555Bk != null) {
                        abstractC3270Io1.setBadge(c2555Bk);
                    }
                }
            }
        }
    }

    public void u(int i, int i2, int i3, int i4) {
        Rect rect = this.T1;
        rect.left = i;
        rect.top = i2;
        rect.right = i3;
        rect.bottom = i4;
        InterfaceC3564Lo1[] interfaceC3564Lo1Arr = this.e1;
        if (interfaceC3564Lo1Arr != null) {
            for (InterfaceC3564Lo1 interfaceC3564Lo1 : interfaceC3564Lo1Arr) {
                if (interfaceC3564Lo1 instanceof AbstractC3270Io1) {
                    ((AbstractC3270Io1) interfaceC3564Lo1).setActiveIndicatorExpandedPadding(this.T1);
                }
            }
        }
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public void v(int i, @InterfaceC11300zs1 View.OnTouchListener onTouchListener) {
        if (onTouchListener == null) {
            this.b1.remove(i);
        } else {
            this.b1.put(i, onTouchListener);
        }
        InterfaceC3564Lo1[] interfaceC3564Lo1Arr = this.e1;
        if (interfaceC3564Lo1Arr != null) {
            for (InterfaceC3564Lo1 interfaceC3564Lo1 : interfaceC3564Lo1Arr) {
                if ((interfaceC3564Lo1 instanceof AbstractC3270Io1) && interfaceC3564Lo1.getItemData() != null && interfaceC3564Lo1.getItemData().getItemId() == i) {
                    ((AbstractC3270Io1) interfaceC3564Lo1).setOnTouchListener(onTouchListener);
                }
            }
        }
    }

    public void w(int i) {
        int g = this.K1.g();
        for (int i2 = 0; i2 < g; i2++) {
            MenuItem b = this.K1.b(i2);
            if (i == b.getItemId()) {
                this.f1 = i;
                this.g1 = i2;
                setCheckedItem(b);
                return;
            }
        }
    }

    public void x(int i) {
        InterfaceC3564Lo1[] interfaceC3564Lo1Arr = this.e1;
        if (interfaceC3564Lo1Arr != null) {
            for (InterfaceC3564Lo1 interfaceC3564Lo1 : interfaceC3564Lo1Arr) {
                if (interfaceC3564Lo1 instanceof AbstractC3270Io1) {
                    ((AbstractC3270Io1) interfaceC3564Lo1).E(i);
                }
            }
        }
    }

    public void y() {
        C2692Ct2 c2692Ct2;
        if (this.K1 != null && this.e1 != null) {
            this.J1.n(true);
            this.K1.f();
            this.J1.n(false);
            if (!n()) {
                d();
                return;
            }
            int i = this.f1;
            int g = this.K1.g();
            for (int i2 = 0; i2 < g; i2++) {
                MenuItem b = this.K1.b(i2);
                if (b.isChecked()) {
                    setCheckedItem(b);
                    this.f1 = b.getItemId();
                    this.g1 = i2;
                }
            }
            if (i != this.f1 && (c2692Ct2 = this.Y0) != null) {
                C10576wt2.b(this, c2692Ct2);
            }
            boolean o2 = o(this.c1, getCurrentVisibleContentItemCount());
            for (int i3 = 0; i3 < g; i3++) {
                this.J1.n(true);
                this.e1[i3].setExpanded(this.P1);
                InterfaceC3564Lo1 interfaceC3564Lo1 = this.e1[i3];
                if (interfaceC3564Lo1 instanceof AbstractC3270Io1) {
                    AbstractC3270Io1 abstractC3270Io1 = (AbstractC3270Io1) interfaceC3564Lo1;
                    abstractC3270Io1.setLabelVisibilityMode(this.c1);
                    abstractC3270Io1.setItemIconGravity(this.d1);
                    abstractC3270Io1.setItemGravity(this.F1);
                    abstractC3270Io1.setShifting(o2);
                }
                if (this.K1.b(i3) instanceof androidx.appcompat.view.menu.h) {
                    this.e1[i3].g((androidx.appcompat.view.menu.h) this.K1.b(i3), 0);
                }
                this.J1.n(false);
            }
        }
    }

    public final void z(int i) {
        if (p(i)) {
            return;
        }
        throw new IllegalArgumentException(i + " is not a valid view id");
    }
}
