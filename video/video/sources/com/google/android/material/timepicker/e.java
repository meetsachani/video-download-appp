package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.Resources;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.timepicker.TimePickerView;
import java.util.Locale;
import o.C10861y4;
import o.C10920yI2;
import o.C3858Oo2;
import o.C4500Ve2;
import o.C5655cn2;
import o.C7025iN1;
import o.ED;
import o.InterfaceC4346To2;

/* loaded from: classes3.dex */
public class e implements TimePickerView.f, InterfaceC4346To2 {
    public final LinearLayout X;
    public final C3858Oo2 Y;
    public final ChipTextInputComboView Z0;
    public final ChipTextInputComboView a1;
    public final com.google.android.material.timepicker.d b1;
    public final EditText c1;
    public final EditText d1;
    public MaterialButtonToggleGroup e1;
    public final TextWatcher Z = new a();
    public final TextWatcher Y0 = new b();

    /* loaded from: classes3.dex */
    public class a extends C5655cn2 {
        public a() {
        }

        @Override // o.C5655cn2, android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            try {
                if (TextUtils.isEmpty(editable)) {
                    e.this.Y.m(0);
                    return;
                }
                e.this.Y.m(Integer.parseInt(editable.toString()));
            } catch (NumberFormatException unused) {
            }
        }
    }

    /* loaded from: classes3.dex */
    public class b extends C5655cn2 {
        public b() {
        }

        @Override // o.C5655cn2, android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            try {
                if (TextUtils.isEmpty(editable)) {
                    e.this.Y.h(0);
                    return;
                }
                e.this.Y.h(Integer.parseInt(editable.toString()));
            } catch (NumberFormatException unused) {
            }
        }
    }

    /* loaded from: classes3.dex */
    public class c implements View.OnClickListener {
        public c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            e.this.c(((Integer) view.getTag(C7025iN1.h.selection_type)).intValue());
        }
    }

    /* loaded from: classes3.dex */
    public class d extends ED {
        public final /* synthetic */ Resources e;
        public final /* synthetic */ C3858Oo2 f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Context context, int i, Resources resources, C3858Oo2 c3858Oo2) {
            super(context, i);
            this.e = resources;
            this.f = c3858Oo2;
        }

        @Override // o.ED, o.Q3
        public void g(View view, C10861y4 c10861y4) {
            super.g(view, c10861y4);
            c10861y4.p1(this.e.getString(C7025iN1.m.material_timepicker_hour) + C4500Ve2.b + view.getResources().getString(this.f.c(), String.valueOf(this.f.d())));
        }
    }

    /* renamed from: com.google.android.material.timepicker.e$e  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public class C0134e extends ED {
        public final /* synthetic */ Resources e;
        public final /* synthetic */ C3858Oo2 f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0134e(Context context, int i, Resources resources, C3858Oo2 c3858Oo2) {
            super(context, i);
            this.e = resources;
            this.f = c3858Oo2;
        }

        @Override // o.ED, o.Q3
        public void g(View view, C10861y4 c10861y4) {
            super.g(view, c10861y4);
            c10861y4.p1(this.e.getString(C7025iN1.m.material_timepicker_minute) + C4500Ve2.b + view.getResources().getString(C7025iN1.m.material_minute_suffix, String.valueOf(this.f.Z0)));
        }
    }

    /* loaded from: classes3.dex */
    public class f extends View.AccessibilityDelegate {
        public final /* synthetic */ Resources a;
        public final /* synthetic */ int b;

        public f(Resources resources, int i) {
            this.a = resources;
            this.b = i;
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            accessibilityNodeInfo.setText(this.a.getString(this.b));
        }
    }

    public e(LinearLayout linearLayout, C3858Oo2 c3858Oo2) {
        this.X = linearLayout;
        this.Y = c3858Oo2;
        Resources resources = linearLayout.getResources();
        ChipTextInputComboView chipTextInputComboView = (ChipTextInputComboView) linearLayout.findViewById(C7025iN1.h.material_minute_text_input);
        this.Z0 = chipTextInputComboView;
        ChipTextInputComboView chipTextInputComboView2 = (ChipTextInputComboView) linearLayout.findViewById(C7025iN1.h.material_hour_text_input);
        this.a1 = chipTextInputComboView2;
        int i = C7025iN1.h.material_label;
        TextView textView = (TextView) chipTextInputComboView.findViewById(i);
        TextView textView2 = (TextView) chipTextInputComboView2.findViewById(i);
        int i2 = C7025iN1.m.material_timepicker_minute;
        textView.setText(resources.getString(i2));
        textView.setImportantForAccessibility(2);
        int i3 = C7025iN1.m.material_timepicker_hour;
        textView2.setText(resources.getString(i3));
        textView2.setImportantForAccessibility(2);
        int i4 = C7025iN1.h.selection_type;
        chipTextInputComboView.setTag(i4, 12);
        chipTextInputComboView2.setTag(i4, 10);
        if (c3858Oo2.Z == 0) {
            k();
        }
        c cVar = new c();
        chipTextInputComboView2.setOnClickListener(cVar);
        chipTextInputComboView.setOnClickListener(cVar);
        chipTextInputComboView2.c(c3858Oo2.e());
        chipTextInputComboView.c(c3858Oo2.f());
        EditText editText = chipTextInputComboView2.f().getEditText();
        this.c1 = editText;
        editText.setAccessibilityDelegate(j(linearLayout.getResources(), i3));
        EditText editText2 = chipTextInputComboView.f().getEditText();
        this.d1 = editText2;
        editText2.setAccessibilityDelegate(j(linearLayout.getResources(), i2));
        this.b1 = new com.google.android.material.timepicker.d(chipTextInputComboView2, chipTextInputComboView, c3858Oo2);
        chipTextInputComboView2.g(new d(linearLayout.getContext(), C7025iN1.m.material_hour_selection, resources, c3858Oo2));
        chipTextInputComboView.g(new C0134e(linearLayout.getContext(), C7025iN1.m.material_minute_selection, resources, c3858Oo2));
        initialize();
    }

    public static /* synthetic */ void a(e eVar, MaterialButtonToggleGroup materialButtonToggleGroup, int i, boolean z) {
        int i2;
        eVar.getClass();
        if (!z) {
            return;
        }
        if (i == C7025iN1.h.material_clock_period_pm_button) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        eVar.Y.n(i2);
    }

    @Override // com.google.android.material.timepicker.TimePickerView.f
    public void c(int i) {
        boolean z;
        this.Y.a1 = i;
        ChipTextInputComboView chipTextInputComboView = this.Z0;
        boolean z2 = false;
        if (i == 12) {
            z = true;
        } else {
            z = false;
        }
        chipTextInputComboView.setChecked(z);
        ChipTextInputComboView chipTextInputComboView2 = this.a1;
        if (i == 10) {
            z2 = true;
        }
        chipTextInputComboView2.setChecked(z2);
        l();
    }

    public final void d() {
        this.c1.addTextChangedListener(this.Y0);
        this.d1.addTextChangedListener(this.Z);
    }

    @Override // o.InterfaceC4346To2
    public void e() {
        View focusedChild = this.X.getFocusedChild();
        if (focusedChild != null) {
            C10920yI2.r(focusedChild, false);
        }
        this.X.setVisibility(8);
    }

    public void f() {
        this.Z0.setChecked(false);
        this.a1.setChecked(false);
    }

    public final void g() {
        this.c1.removeTextChangedListener(this.Y0);
        this.d1.removeTextChangedListener(this.Z);
    }

    public void h() {
        boolean z;
        ChipTextInputComboView chipTextInputComboView = this.Z0;
        boolean z2 = false;
        if (this.Y.a1 == 12) {
            z = true;
        } else {
            z = false;
        }
        chipTextInputComboView.setChecked(z);
        ChipTextInputComboView chipTextInputComboView2 = this.a1;
        if (this.Y.a1 == 10) {
            z2 = true;
        }
        chipTextInputComboView2.setChecked(z2);
    }

    public final void i(C3858Oo2 c3858Oo2) {
        g();
        Locale locale = this.X.getResources().getConfiguration().locale;
        String format = String.format(locale, C3858Oo2.c1, Integer.valueOf(c3858Oo2.Z0));
        String format2 = String.format(locale, C3858Oo2.c1, Integer.valueOf(c3858Oo2.d()));
        this.Z0.j(format);
        this.a1.j(format2);
        d();
        l();
    }

    @Override // o.InterfaceC4346To2
    public void initialize() {
        d();
        i(this.Y);
        this.b1.a();
    }

    @Override // o.InterfaceC4346To2
    public void invalidate() {
        i(this.Y);
    }

    public final View.AccessibilityDelegate j(Resources resources, int i) {
        return new f(resources, i);
    }

    public final void k() {
        MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) this.X.findViewById(C7025iN1.h.material_clock_period_toggle);
        this.e1 = materialButtonToggleGroup;
        materialButtonToggleGroup.q(new MaterialButtonToggleGroup.b() { // from class: o.Uo2
            @Override // com.google.android.material.button.MaterialButtonToggleGroup.b
            public final void a(MaterialButtonToggleGroup materialButtonToggleGroup2, int i, boolean z) {
                com.google.android.material.timepicker.e.a(com.google.android.material.timepicker.e.this, materialButtonToggleGroup2, i, z);
            }
        });
        this.e1.setVisibility(0);
        l();
    }

    public final void l() {
        int i;
        MaterialButtonToggleGroup materialButtonToggleGroup = this.e1;
        if (materialButtonToggleGroup == null) {
            return;
        }
        if (this.Y.b1 == 0) {
            i = C7025iN1.h.material_clock_period_am_button;
        } else {
            i = C7025iN1.h.material_clock_period_pm_button;
        }
        materialButtonToggleGroup.r(i);
    }

    @Override // o.InterfaceC4346To2
    public void show() {
        this.X.setVisibility(0);
        c(this.Y.a1);
    }
}
