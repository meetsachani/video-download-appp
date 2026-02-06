package o;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Filterable;
import android.widget.ListAdapter;
import android.widget.TextView;
import com.google.android.material.textfield.TextInputLayout;
import java.util.List;
import o.C7025iN1;
import o.OL1;

/* loaded from: classes3.dex */
public class Y81 extends C3607Mb {
    public static final int k1 = 15;
    public static final String l1 = "SwitchAccess";
    @InterfaceC5670cr1
    public final C5711d11 c1;
    @InterfaceC11300zs1
    public final AccessibilityManager d1;
    @InterfaceC5670cr1
    public final Rect e1;
    @BY0
    public final int f1;
    public final float g1;
    @InterfaceC11300zs1
    public ColorStateList h1;
    public int i1;
    @InterfaceC11300zs1
    public ColorStateList j1;

    /* loaded from: classes3.dex */
    public class a implements AdapterView.OnItemClickListener {
        public a() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            Object item;
            Y81 y81 = Y81.this;
            if (i < 0) {
                item = y81.c1.B();
            } else {
                item = y81.getAdapter().getItem(i);
            }
            Y81 y812 = Y81.this;
            y812.setText(y812.convertSelectionToString(item), false);
            AdapterView.OnItemClickListener onItemClickListener = Y81.this.getOnItemClickListener();
            if (onItemClickListener != null) {
                if (view == null || i < 0) {
                    view = Y81.this.c1.E();
                    i = Y81.this.c1.D();
                    j = Y81.this.c1.C();
                }
                onItemClickListener.onItemClick(Y81.this.c1.p(), view, i, j);
            }
            Y81.this.c1.dismiss();
        }
    }

    /* loaded from: classes3.dex */
    public class b<T> extends ArrayAdapter<String> {
        @InterfaceC11300zs1
        public ColorStateList X;
        @InterfaceC11300zs1
        public ColorStateList Y;

        public b(@InterfaceC5670cr1 Context context, int i, @InterfaceC5670cr1 String[] strArr) {
            super(context, i, strArr);
            f();
        }

        @InterfaceC11300zs1
        public final ColorStateList a() {
            if (c() && d()) {
                int[] iArr = {16843623, -16842919};
                int[] iArr2 = {16842913, -16842919};
                int colorForState = Y81.this.j1.getColorForState(iArr2, 0);
                int colorForState2 = Y81.this.j1.getColorForState(iArr, 0);
                return new ColorStateList(new int[][]{iArr2, iArr, new int[0]}, new int[]{C9179r91.s(Y81.this.i1, colorForState), C9179r91.s(Y81.this.i1, colorForState2), Y81.this.i1});
            }
            return null;
        }

        @InterfaceC11300zs1
        public final Drawable b() {
            if (!c()) {
                return null;
            }
            ColorDrawable colorDrawable = new ColorDrawable(Y81.this.i1);
            if (this.Y != null) {
                colorDrawable.setTintList(this.X);
                return new RippleDrawable(this.Y, colorDrawable, null);
            }
            return colorDrawable;
        }

        public final boolean c() {
            if (Y81.this.i1 != 0) {
                return true;
            }
            return false;
        }

        public final boolean d() {
            if (Y81.this.j1 != null) {
                return true;
            }
            return false;
        }

        public final ColorStateList e() {
            if (!d()) {
                return null;
            }
            int[] iArr = {16842919};
            return new ColorStateList(new int[][]{iArr, new int[0]}, new int[]{Y81.this.j1.getColorForState(iArr, 0), 0});
        }

        public void f() {
            this.Y = e();
            this.X = a();
        }

        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        public View getView(int i, @InterfaceC11300zs1 View view, ViewGroup viewGroup) {
            Drawable drawable;
            View view2 = super.getView(i, view, viewGroup);
            if (view2 instanceof TextView) {
                TextView textView = (TextView) view2;
                if (Y81.this.getText().toString().contentEquals(textView.getText())) {
                    drawable = b();
                } else {
                    drawable = null;
                }
                textView.setBackground(drawable);
            }
            return view2;
        }
    }

    public Y81(@InterfaceC5670cr1 Context context) {
        this(context, null);
    }

    @Override // android.widget.AutoCompleteTextView
    public void dismissDropDown() {
        if (h()) {
            this.c1.dismiss();
        } else {
            super.dismissDropDown();
        }
    }

    @InterfaceC11300zs1
    public final TextInputLayout g() {
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof TextInputLayout) {
                return (TextInputLayout) parent;
            }
        }
        return null;
    }

    @InterfaceC11300zs1
    public ColorStateList getDropDownBackgroundTintList() {
        return this.h1;
    }

    @Override // android.widget.TextView
    @InterfaceC11300zs1
    public CharSequence getHint() {
        TextInputLayout g = g();
        if (g != null && g.e0()) {
            return g.getHint();
        }
        return super.getHint();
    }

    public float getPopupElevation() {
        return this.g1;
    }

    public int getSimpleItemSelectedColor() {
        return this.i1;
    }

    @InterfaceC11300zs1
    public ColorStateList getSimpleItemSelectedRippleColor() {
        return this.j1;
    }

    public final boolean h() {
        if (!j() && !i()) {
            return false;
        }
        return true;
    }

    public final boolean i() {
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList;
        AccessibilityManager accessibilityManager = this.d1;
        if (accessibilityManager != null && accessibilityManager.isEnabled() && (enabledAccessibilityServiceList = this.d1.getEnabledAccessibilityServiceList(16)) != null) {
            for (AccessibilityServiceInfo accessibilityServiceInfo : enabledAccessibilityServiceList) {
                if (accessibilityServiceInfo.getSettingsActivityName() != null && accessibilityServiceInfo.getSettingsActivityName().contains(l1)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean j() {
        AccessibilityManager accessibilityManager = this.d1;
        if (accessibilityManager != null && accessibilityManager.isTouchExplorationEnabled()) {
            return true;
        }
        return false;
    }

    public final int k() {
        ListAdapter adapter = getAdapter();
        TextInputLayout g = g();
        int i = 0;
        if (adapter == null || g == null) {
            return 0;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int min = Math.min(adapter.getCount(), Math.max(0, this.c1.D()) + 15);
        View view = null;
        int i2 = 0;
        for (int max = Math.max(0, min - 15); max < min; max++) {
            int itemViewType = adapter.getItemViewType(max);
            if (itemViewType != i) {
                view = null;
                i = itemViewType;
            }
            view = adapter.getView(max, view, g);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            i2 = Math.max(i2, view.getMeasuredWidth());
        }
        Drawable g2 = this.c1.g();
        if (g2 != null) {
            g2.getPadding(this.e1);
            Rect rect = this.e1;
            i2 += rect.left + rect.right;
        }
        return i2 + g.getEndIconView().getMeasuredWidth();
    }

    public final void l() {
        TextInputLayout g = g();
        if (g != null) {
            g.M0();
        }
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        TextInputLayout g = g();
        if (g != null && g.e0() && super.getHint() == null && D71.d()) {
            setHint("");
        }
    }

    @Override // android.widget.AutoCompleteTextView, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.c1.dismiss();
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (View.MeasureSpec.getMode(i) == Integer.MIN_VALUE) {
            setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), k()), View.MeasureSpec.getSize(i)), getMeasuredHeight());
        }
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public void onWindowFocusChanged(boolean z) {
        if (h()) {
            return;
        }
        super.onWindowFocusChanged(z);
    }

    @Override // android.widget.AutoCompleteTextView
    public <T extends ListAdapter & Filterable> void setAdapter(@InterfaceC11300zs1 T t) {
        super.setAdapter(t);
        this.c1.n(getAdapter());
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundDrawable(Drawable drawable) {
        super.setDropDownBackgroundDrawable(drawable);
        C5711d11 c5711d11 = this.c1;
        if (c5711d11 != null) {
            c5711d11.a(drawable);
        }
    }

    public void setDropDownBackgroundTint(@JF int i) {
        setDropDownBackgroundTintList(ColorStateList.valueOf(i));
    }

    public void setDropDownBackgroundTintList(@InterfaceC11300zs1 ColorStateList colorStateList) {
        this.h1 = colorStateList;
        Drawable dropDownBackground = getDropDownBackground();
        if (dropDownBackground instanceof C4394Uc1) {
            ((C4394Uc1) dropDownBackground).y0(this.h1);
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public void setOnItemSelectedListener(@InterfaceC11300zs1 AdapterView.OnItemSelectedListener onItemSelectedListener) {
        super.setOnItemSelectedListener(onItemSelectedListener);
        this.c1.f0(getOnItemSelectedListener());
    }

    @Override // android.widget.TextView
    public void setRawInputType(int i) {
        super.setRawInputType(i);
        l();
    }

    public void setSimpleItemSelectedColor(int i) {
        this.i1 = i;
        if (getAdapter() instanceof b) {
            ((b) getAdapter()).f();
        }
    }

    public void setSimpleItemSelectedRippleColor(@InterfaceC11300zs1 ColorStateList colorStateList) {
        this.j1 = colorStateList;
        if (getAdapter() instanceof b) {
            ((b) getAdapter()).f();
        }
    }

    public void setSimpleItems(@InterfaceC2934Fe int i) {
        setSimpleItems(getResources().getStringArray(i));
    }

    @Override // android.widget.AutoCompleteTextView
    public void showDropDown() {
        if (h()) {
            this.c1.show();
        } else {
            super.showDropDown();
        }
    }

    public Y81(@InterfaceC5670cr1 Context context, @InterfaceC11300zs1 AttributeSet attributeSet) {
        this(context, attributeSet, OL1.b.S);
    }

    public void setSimpleItems(@InterfaceC5670cr1 String[] strArr) {
        setAdapter(new b(getContext(), this.f1, strArr));
    }

    public Y81(@InterfaceC5670cr1 Context context, @InterfaceC11300zs1 AttributeSet attributeSet, int i) {
        super(C6597gd1.d(context, attributeSet, i, 0), attributeSet, i);
        this.e1 = new Rect();
        Context context2 = getContext();
        TypedArray k = C7608kn2.k(context2, attributeSet, C7025iN1.o.Z4, i, OL1.l.u4, new int[0]);
        int i2 = C7025iN1.o.a5;
        if (k.hasValue(i2) && k.getInt(i2, 0) == 0) {
            setKeyListener(null);
        }
        this.f1 = k.getResourceId(C7025iN1.o.d5, C7025iN1.k.mtrl_auto_complete_simple_item);
        this.g1 = k.getDimensionPixelOffset(C7025iN1.o.b5, C7025iN1.f.mtrl_exposed_dropdown_menu_popup_elevation);
        int i3 = C7025iN1.o.c5;
        if (k.hasValue(i3)) {
            this.h1 = ColorStateList.valueOf(k.getColor(i3, 0));
        }
        this.i1 = k.getColor(C7025iN1.o.e5, 0);
        this.j1 = C4297Tc1.a(context2, k, C7025iN1.o.f5);
        this.d1 = (AccessibilityManager) context2.getSystemService("accessibility");
        C5711d11 c5711d11 = new C5711d11(context2);
        this.c1 = c5711d11;
        c5711d11.c0(true);
        c5711d11.R(this);
        c5711d11.Z(2);
        c5711d11.n(getAdapter());
        c5711d11.e0(new a());
        int i4 = C7025iN1.o.g5;
        if (k.hasValue(i4)) {
            setSimpleItems(k.getResourceId(i4, 0));
        }
        k.recycle();
    }
}
