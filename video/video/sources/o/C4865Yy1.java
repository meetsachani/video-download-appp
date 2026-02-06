package o;

import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import o.C7025iN1;

/* renamed from: o.Yy1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C4865Yy1 extends AbstractC3808Oc0 {
    public int e;
    @InterfaceC11300zs1
    public EditText f;
    public final View.OnClickListener g;

    public C4865Yy1(@InterfaceC5670cr1 com.google.android.material.textfield.a aVar, @K60 int i) {
        super(aVar);
        this.e = C7025iN1.g.design_password_eye;
        this.g = new View.OnClickListener() { // from class: o.Xy1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C4865Yy1.v(C4865Yy1.this, view);
            }
        };
        if (i != 0) {
            this.e = i;
        }
    }

    public static /* synthetic */ void v(C4865Yy1 c4865Yy1, View view) {
        EditText editText = c4865Yy1.f;
        if (editText == null) {
            return;
        }
        int selectionEnd = editText.getSelectionEnd();
        if (c4865Yy1.w()) {
            c4865Yy1.f.setTransformationMethod(null);
        } else {
            c4865Yy1.f.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
        if (selectionEnd >= 0) {
            c4865Yy1.f.setSelection(selectionEnd);
        }
        c4865Yy1.r();
    }

    public static boolean x(EditText editText) {
        if (editText != null) {
            if (editText.getInputType() == 16 || editText.getInputType() == 128 || editText.getInputType() == 144 || editText.getInputType() == 224) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // o.AbstractC3808Oc0
    public void b(CharSequence charSequence, int i, int i2, int i3) {
        r();
    }

    @Override // o.AbstractC3808Oc0
    @InterfaceC3329Je2
    public int c() {
        return C7025iN1.m.password_toggle_content_description;
    }

    @Override // o.AbstractC3808Oc0
    @K60
    public int d() {
        return this.e;
    }

    @Override // o.AbstractC3808Oc0
    public View.OnClickListener f() {
        return this.g;
    }

    @Override // o.AbstractC3808Oc0
    public boolean l() {
        return true;
    }

    @Override // o.AbstractC3808Oc0
    public boolean m() {
        return !w();
    }

    @Override // o.AbstractC3808Oc0
    public void n(@InterfaceC11300zs1 EditText editText) {
        this.f = editText;
        r();
    }

    @Override // o.AbstractC3808Oc0
    public void s() {
        if (x(this.f)) {
            this.f.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }

    @Override // o.AbstractC3808Oc0
    public void u() {
        EditText editText = this.f;
        if (editText != null) {
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }

    public final boolean w() {
        EditText editText = this.f;
        if (editText != null && (editText.getTransformationMethod() instanceof PasswordTransformationMethod)) {
            return true;
        }
        return false;
    }
}
