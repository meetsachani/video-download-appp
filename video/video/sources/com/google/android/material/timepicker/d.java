package com.google.android.material.timepicker;

import android.text.Editable;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import com.google.android.material.textfield.TextInputLayout;
import o.C3858Oo2;

/* loaded from: classes3.dex */
public class d implements TextView.OnEditorActionListener, View.OnKeyListener {
    public final ChipTextInputComboView X;
    public final ChipTextInputComboView Y;
    public boolean Y0 = false;
    public final C3858Oo2 Z;

    public d(ChipTextInputComboView chipTextInputComboView, ChipTextInputComboView chipTextInputComboView2, C3858Oo2 c3858Oo2) {
        this.X = chipTextInputComboView;
        this.Y = chipTextInputComboView2;
        this.Z = c3858Oo2;
    }

    public void a() {
        TextInputLayout f = this.X.f();
        TextInputLayout f2 = this.Y.f();
        EditText editText = f.getEditText();
        EditText editText2 = f2.getEditText();
        editText.setImeOptions(268435461);
        editText2.setImeOptions(268435462);
        editText.setOnEditorActionListener(this);
        editText.setOnKeyListener(this);
        editText2.setOnKeyListener(this);
    }

    public final void b(EditText editText) {
        if (editText.getSelectionStart() == 0 && editText.length() == 2) {
            editText.getText().clear();
        }
    }

    public final void c(int i) {
        boolean z;
        ChipTextInputComboView chipTextInputComboView = this.Y;
        boolean z2 = false;
        if (i == 12) {
            z = true;
        } else {
            z = false;
        }
        chipTextInputComboView.setChecked(z);
        ChipTextInputComboView chipTextInputComboView2 = this.X;
        if (i == 10) {
            z2 = true;
        }
        chipTextInputComboView2.setChecked(z2);
        this.Z.a1 = i;
    }

    public final boolean d(int i, KeyEvent keyEvent, EditText editText) {
        Editable text = editText.getText();
        if (text == null) {
            return false;
        }
        if (i >= 7 && i <= 16 && keyEvent.getAction() == 1 && editText.getSelectionStart() == 2 && text.length() == 2) {
            c(12);
            return true;
        }
        if (i >= 7 && i <= 16) {
            b(editText);
        }
        return false;
    }

    public final boolean e(int i, KeyEvent keyEvent, EditText editText) {
        if (i == 67 && keyEvent.getAction() == 0 && TextUtils.isEmpty(editText.getText())) {
            c(10);
            return true;
        } else if (i >= 7 && i <= 16) {
            b(editText);
            return false;
        } else {
            return false;
        }
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        boolean z;
        if (i == 5) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            c(12);
        }
        return z;
    }

    @Override // android.view.View.OnKeyListener
    public boolean onKey(View view, int i, KeyEvent keyEvent) {
        boolean d;
        if (this.Y0) {
            return false;
        }
        this.Y0 = true;
        EditText editText = (EditText) view;
        if (this.Z.a1 == 12) {
            d = e(i, keyEvent, editText);
        } else {
            d = d(i, keyEvent, editText);
        }
        this.Y0 = false;
        return d;
    }
}
