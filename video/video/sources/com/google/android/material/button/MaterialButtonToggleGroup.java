package com.google.android.material.button;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.RadioButton;
import android.widget.ToggleButton;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import o.C10262vc2;
import o.C10861y4;
import o.C6516gH2;
import o.C6597gd1;
import o.C7025iN1;
import o.C7608kn2;
import o.InterfaceC11300zs1;
import o.InterfaceC2669Co;
import o.InterfaceC5670cr1;
import o.M;
import o.PL0;
import o.Q3;

/* loaded from: classes3.dex */
public class MaterialButtonToggleGroup extends com.google.android.material.button.a {
    public static final String q1 = "MButtonToggleGroup";
    public static final int r1 = C7025iN1.n.Widget_MaterialComponents_MaterialButtonToggleGroup;
    public final LinkedHashSet<b> k1;
    public boolean l1;
    public boolean m1;
    public boolean n1;
    @PL0
    public final int o1;
    public Set<Integer> p1;

    /* loaded from: classes3.dex */
    public class a extends Q3 {
        public a() {
        }

        @Override // o.Q3
        public void g(View view, @InterfaceC5670cr1 C10861y4 c10861y4) {
            super.g(view, c10861y4);
            c10861y4.n1(C10861y4.g.j(0, 1, MaterialButtonToggleGroup.this.w(view), 1, false, ((MaterialButton) view).isChecked()));
        }
    }

    /* loaded from: classes3.dex */
    public interface b {
        void a(MaterialButtonToggleGroup materialButtonToggleGroup, @PL0 int i, boolean z);
    }

    public MaterialButtonToggleGroup(@InterfaceC5670cr1 Context context) {
        this(context, null);
    }

    @InterfaceC5670cr1
    private String getChildrenA11yClassName() {
        Class cls;
        if (this.m1) {
            cls = RadioButton.class;
        } else {
            cls = ToggleButton.class;
        }
        return cls.getName();
    }

    private int getVisibleButtonCount() {
        int i = 0;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            if ((getChildAt(i2) instanceof MaterialButton) && j(i2)) {
                i++;
            }
        }
        return i;
    }

    private void setupButtonChild(@InterfaceC5670cr1 MaterialButton materialButton) {
        materialButton.setMaxLines(1);
        materialButton.setEllipsize(TextUtils.TruncateAt.END);
        materialButton.setCheckable(true);
        materialButton.setA11yClassName(getChildrenA11yClassName());
    }

    public void A(@InterfaceC5670cr1 b bVar) {
        this.k1.remove(bVar);
    }

    public final void B(@PL0 int i, boolean z) {
        View findViewById = findViewById(i);
        if (findViewById instanceof MaterialButton) {
            this.l1 = true;
            ((MaterialButton) findViewById).setChecked(z);
            this.l1 = false;
        }
    }

    public void C(@PL0 int i) {
        s(i, false);
    }

    public final void D(Set<Integer> set) {
        Set<Integer> set2 = this.p1;
        this.p1 = new HashSet(set);
        for (int i = 0; i < getChildCount(); i++) {
            int id = f(i).getId();
            B(id, set.contains(Integer.valueOf(id)));
            if (set2.contains(Integer.valueOf(id)) != set.contains(Integer.valueOf(id))) {
                v(id, set.contains(Integer.valueOf(id)));
            }
        }
        invalidate();
    }

    public final void E() {
        String childrenA11yClassName = getChildrenA11yClassName();
        for (int i = 0; i < getChildCount(); i++) {
            f(i).setA11yClassName(childrenA11yClassName);
        }
    }

    @Override // com.google.android.material.button.a, android.view.ViewGroup
    public void addView(@InterfaceC5670cr1 View view, int i, @InterfaceC5670cr1 ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof MaterialButton)) {
            Log.e(q1, "Child views must be of type MaterialButton.");
            return;
        }
        super.addView(view, i, layoutParams);
        MaterialButton materialButton = (MaterialButton) view;
        setupButtonChild(materialButton);
        s(materialButton.getId(), materialButton.isChecked());
        C6516gH2.I1(materialButton, new a());
    }

    @PL0
    public int getCheckedButtonId() {
        if (this.m1 && !this.p1.isEmpty()) {
            return this.p1.iterator().next().intValue();
        }
        return -1;
    }

    @InterfaceC5670cr1
    public List<Integer> getCheckedButtonIds() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < getChildCount(); i++) {
            int id = f(i).getId();
            if (this.p1.contains(Integer.valueOf(id))) {
                arrayList.add(Integer.valueOf(id));
            }
        }
        return arrayList;
    }

    public final boolean j(int i) {
        if (getChildAt(i).getVisibility() != 8) {
            return true;
        }
        return false;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        int i = this.o1;
        if (i != -1) {
            D(Collections.singleton(Integer.valueOf(i)));
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(@InterfaceC5670cr1 AccessibilityNodeInfo accessibilityNodeInfo) {
        int i;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        C10861y4 t2 = C10861y4.t2(accessibilityNodeInfo);
        int visibleButtonCount = getVisibleButtonCount();
        if (y()) {
            i = 1;
        } else {
            i = 2;
        }
        t2.m1(C10861y4.f.h(1, visibleButtonCount, false, i));
    }

    public void q(@InterfaceC5670cr1 b bVar) {
        this.k1.add(bVar);
    }

    public void r(@PL0 int i) {
        s(i, true);
    }

    public final void s(@PL0 int i, boolean z) {
        if (i == -1) {
            Log.e(q1, "Button ID is not valid: " + i);
            return;
        }
        HashSet hashSet = new HashSet(this.p1);
        if (z && !hashSet.contains(Integer.valueOf(i))) {
            if (this.m1 && !hashSet.isEmpty()) {
                hashSet.clear();
            }
            hashSet.add(Integer.valueOf(i));
        } else if (!z && hashSet.contains(Integer.valueOf(i))) {
            if (!this.n1 || hashSet.size() > 1) {
                hashSet.remove(Integer.valueOf(i));
            }
        } else {
            return;
        }
        D(hashSet);
    }

    public void setSelectionRequired(boolean z) {
        this.n1 = z;
    }

    public void setSingleSelection(boolean z) {
        if (this.m1 != z) {
            this.m1 = z;
            t();
        }
        E();
    }

    public void t() {
        D(new HashSet());
    }

    public void u() {
        this.k1.clear();
    }

    public final void v(@PL0 int i, boolean z) {
        Iterator<b> it = this.k1.iterator();
        while (it.hasNext()) {
            it.next().a(this, i, z);
        }
    }

    public final int w(@InterfaceC11300zs1 View view) {
        if (!(view instanceof MaterialButton)) {
            return -1;
        }
        int i = 0;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            if (getChildAt(i2) == view) {
                return i;
            }
            if ((getChildAt(i2) instanceof MaterialButton) && j(i2)) {
                i++;
            }
        }
        return -1;
    }

    public boolean x() {
        return this.n1;
    }

    public boolean y() {
        return this.m1;
    }

    public void z(@InterfaceC5670cr1 MaterialButton materialButton, boolean z) {
        if (this.l1) {
            return;
        }
        s(materialButton.getId(), z);
    }

    public MaterialButtonToggleGroup(@InterfaceC5670cr1 Context context, @InterfaceC11300zs1 AttributeSet attributeSet) {
        this(context, attributeSet, C7025iN1.c.materialButtonToggleGroupStyle);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public MaterialButtonToggleGroup(@InterfaceC5670cr1 Context context, @InterfaceC11300zs1 AttributeSet attributeSet, int i) {
        super(C6597gd1.d(context, attributeSet, i, r4), attributeSet, i);
        int i2 = r1;
        this.k1 = new LinkedHashSet<>();
        this.l1 = false;
        this.p1 = new HashSet();
        TypedArray k = C7608kn2.k(getContext(), attributeSet, C7025iN1.o.N5, i, i2, new int[0]);
        setSingleSelection(k.getBoolean(C7025iN1.o.V5, false));
        this.o1 = k.getResourceId(C7025iN1.o.Q5, -1);
        this.n1 = k.getBoolean(C7025iN1.o.S5, false);
        if (this.d1 == null) {
            this.d1 = C10262vc2.c(new M(0.0f));
        }
        setEnabled(k.getBoolean(C7025iN1.o.O5, true));
        k.recycle();
        setImportantForAccessibility(1);
    }

    public void setSingleSelection(@InterfaceC2669Co int i) {
        setSingleSelection(getResources().getBoolean(i));
    }
}
