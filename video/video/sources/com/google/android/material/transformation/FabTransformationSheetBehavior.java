package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.transformation.FabTransformationBehavior;
import java.util.HashMap;
import java.util.Map;
import o.C7025iN1;
import o.C9076ql1;
import o.InterfaceC11300zs1;
import o.InterfaceC2591Bt;
import o.InterfaceC5670cr1;
import o.NE1;

@Deprecated
/* loaded from: classes3.dex */
public class FabTransformationSheetBehavior extends FabTransformationBehavior {
    @InterfaceC11300zs1
    public Map<View, Integer> g1;

    public FabTransformationSheetBehavior() {
    }

    @Override // com.google.android.material.transformation.ExpandableTransformationBehavior, com.google.android.material.transformation.ExpandableBehavior
    @InterfaceC2591Bt
    public boolean R(@InterfaceC5670cr1 View view, @InterfaceC5670cr1 View view2, boolean z, boolean z2) {
        q0(view2, z);
        return super.R(view, view2, z, z2);
    }

    @Override // com.google.android.material.transformation.FabTransformationBehavior
    @InterfaceC5670cr1
    public FabTransformationBehavior.e o0(Context context, boolean z) {
        int i;
        if (z) {
            i = C7025iN1.b.mtrl_fab_transformation_sheet_expand_spec;
        } else {
            i = C7025iN1.b.mtrl_fab_transformation_sheet_collapse_spec;
        }
        FabTransformationBehavior.e eVar = new FabTransformationBehavior.e();
        eVar.a = C9076ql1.d(context, i);
        eVar.b = new NE1(17, 0.0f, 0.0f);
        return eVar;
    }

    public final void q0(@InterfaceC5670cr1 View view, boolean z) {
        boolean z2;
        ViewParent parent = view.getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (z) {
                this.g1 = new HashMap(childCount);
            }
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                if ((childAt.getLayoutParams() instanceof CoordinatorLayout.g) && (((CoordinatorLayout.g) childAt.getLayoutParams()).f() instanceof FabTransformationScrimBehavior)) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (childAt != view && !z2) {
                    if (!z) {
                        Map<View, Integer> map = this.g1;
                        if (map != null && map.containsKey(childAt)) {
                            childAt.setImportantForAccessibility(this.g1.get(childAt).intValue());
                        }
                    } else {
                        this.g1.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                        childAt.setImportantForAccessibility(4);
                    }
                }
            }
            if (!z) {
                this.g1 = null;
            }
        }
    }

    public FabTransformationSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
