package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.Configuration;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Checkable;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.material.chip.Chip;
import com.google.android.material.textfield.TextInputLayout;
import java.util.Arrays;
import o.C10920yI2;
import o.C3858Oo2;
import o.C5655cn2;
import o.C6516gH2;
import o.C7025iN1;
import o.InterfaceC11300zs1;
import o.InterfaceC5056aJ2;
import o.InterfaceC5670cr1;
import o.Q3;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class ChipTextInputComboView extends FrameLayout implements Checkable {
    public final Chip Y0;
    public final TextInputLayout Z0;
    public final EditText a1;
    public TextWatcher b1;
    public TextView c1;

    /* loaded from: classes3.dex */
    public class b extends C5655cn2 {
        public static final String Y = "00";

        public b() {
        }

        @Override // o.C5655cn2, android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            if (!TextUtils.isEmpty(editable)) {
                String d = ChipTextInputComboView.this.d(editable);
                Chip chip = ChipTextInputComboView.this.Y0;
                if (TextUtils.isEmpty(d)) {
                    d = ChipTextInputComboView.this.d(Y);
                }
                chip.setText(d);
                return;
            }
            ChipTextInputComboView.this.Y0.setText(ChipTextInputComboView.this.d(Y));
        }
    }

    public ChipTextInputComboView(@InterfaceC5670cr1 Context context) {
        this(context, null);
    }

    public void c(InputFilter inputFilter) {
        InputFilter[] filters = this.a1.getFilters();
        InputFilter[] inputFilterArr = (InputFilter[]) Arrays.copyOf(filters, filters.length + 1);
        inputFilterArr[filters.length] = inputFilter;
        this.a1.setFilters(inputFilterArr);
    }

    public final String d(CharSequence charSequence) {
        return C3858Oo2.a(getResources(), charSequence);
    }

    @InterfaceC5056aJ2
    public CharSequence e() {
        return this.Y0.getText();
    }

    public TextInputLayout f() {
        return this.Z0;
    }

    public void g(Q3 q3) {
        C6516gH2.I1(this.Y0, q3);
    }

    public void h(boolean z) {
        this.a1.setCursorVisible(z);
    }

    public void i(CharSequence charSequence) {
        this.c1.setText(charSequence);
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.Y0.isChecked();
    }

    public void j(CharSequence charSequence) {
        String d = d(charSequence);
        this.Y0.setText(d);
        if (!TextUtils.isEmpty(d)) {
            this.a1.removeTextChangedListener(this.b1);
            this.a1.setText(d);
            this.a1.addTextChangedListener(this.b1);
        }
    }

    public final void k() {
        this.a1.setImeHintLocales(getContext().getResources().getConfiguration().getLocales());
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        k();
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        int i;
        int i2;
        this.Y0.setChecked(z);
        EditText editText = this.a1;
        if (z) {
            i = 0;
        } else {
            i = 4;
        }
        editText.setVisibility(i);
        Chip chip = this.Y0;
        if (z) {
            i2 = 8;
        } else {
            i2 = 0;
        }
        chip.setVisibility(i2);
        if (isChecked()) {
            C10920yI2.y(this.a1, false);
        }
    }

    @Override // android.view.View
    public void setOnClickListener(@InterfaceC11300zs1 View.OnClickListener onClickListener) {
        this.Y0.setOnClickListener(onClickListener);
    }

    @Override // android.view.View
    public void setTag(int i, Object obj) {
        this.Y0.setTag(i, obj);
    }

    @Override // android.widget.Checkable
    public void toggle() {
        this.Y0.toggle();
    }

    public ChipTextInputComboView(@InterfaceC5670cr1 Context context, @InterfaceC11300zs1 AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ChipTextInputComboView(@InterfaceC5670cr1 Context context, @InterfaceC11300zs1 AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater from = LayoutInflater.from(context);
        Chip chip = (Chip) from.inflate(C7025iN1.k.material_time_chip, (ViewGroup) this, false);
        this.Y0 = chip;
        chip.setAccessibilityClassName("android.view.View");
        TextInputLayout textInputLayout = (TextInputLayout) from.inflate(C7025iN1.k.material_time_input, (ViewGroup) this, false);
        this.Z0 = textInputLayout;
        EditText editText = textInputLayout.getEditText();
        this.a1 = editText;
        editText.setVisibility(4);
        b bVar = new b();
        this.b1 = bVar;
        editText.addTextChangedListener(bVar);
        k();
        addView(chip);
        addView(textInputLayout);
        this.c1 = (TextView) findViewById(C7025iN1.h.material_label);
        editText.setId(View.generateViewId());
        this.c1.setLabelFor(editText.getId());
        editText.setSaveEnabled(false);
        editText.setLongClickable(false);
    }
}
