package com.google.android.material.button;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import com.google.android.material.button.MaterialButton;
import o.C6597gd1;
import o.C7025iN1;
import o.InterfaceC11300zs1;
import o.InterfaceC5670cr1;

/* loaded from: classes3.dex */
public class b extends a {
    public static final int k1 = C7025iN1.n.Widget_Material3_MaterialSplitButton;
    public static final int l1 = 2;

    public b(@InterfaceC5670cr1 Context context) {
        this(context, null);
    }

    public static /* synthetic */ void p(b bVar, MaterialButton materialButton, boolean z) {
        int i;
        Resources resources = bVar.getResources();
        if (z) {
            i = C7025iN1.m.mtrl_button_expanded_content_description;
        } else {
            i = C7025iN1.m.mtrl_button_collapsed_content_description;
        }
        materialButton.setStateDescription(resources.getString(i));
    }

    @Override // com.google.android.material.button.a, android.view.ViewGroup
    public void addView(@InterfaceC5670cr1 View view, int i, @InterfaceC11300zs1 ViewGroup.LayoutParams layoutParams) {
        int i2;
        if (view instanceof MaterialButton) {
            if (getChildCount() <= 2) {
                MaterialButton materialButton = (MaterialButton) view;
                super.addView(view, i, layoutParams);
                if (indexOfChild(view) == 1) {
                    materialButton.setCheckable(true);
                    materialButton.setA11yClassName(Button.class.getName());
                    if (Build.VERSION.SDK_INT >= 30) {
                        Resources resources = getResources();
                        if (materialButton.isChecked()) {
                            i2 = C7025iN1.m.mtrl_button_expanded_content_description;
                        } else {
                            i2 = C7025iN1.m.mtrl_button_collapsed_content_description;
                        }
                        materialButton.setStateDescription(resources.getString(i2));
                        materialButton.f(new MaterialButton.c() { // from class: o.bd1
                            @Override // com.google.android.material.button.MaterialButton.c
                            public final void a(MaterialButton materialButton2, boolean z) {
                                com.google.android.material.button.b.p(com.google.android.material.button.b.this, materialButton2, z);
                            }
                        });
                        return;
                    }
                    return;
                }
                return;
            }
            throw new IllegalArgumentException("MaterialSplitButton can only hold two MaterialButtons.");
        }
        throw new IllegalArgumentException("MaterialSplitButton can only hold MaterialButtons.");
    }

    public b(@InterfaceC5670cr1 Context context, @InterfaceC11300zs1 AttributeSet attributeSet) {
        this(context, attributeSet, C7025iN1.c.materialSplitButtonStyle);
    }

    public b(@InterfaceC5670cr1 Context context, @InterfaceC11300zs1 AttributeSet attributeSet, int i) {
        super(C6597gd1.d(context, attributeSet, i, k1), attributeSet, i);
    }
}
