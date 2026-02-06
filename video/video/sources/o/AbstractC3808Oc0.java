package o;

import android.content.Context;
import android.text.Editable;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.EditText;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;

/* renamed from: o.Oc0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC3808Oc0 {
    public final TextInputLayout a;
    public final com.google.android.material.textfield.a b;
    public final Context c;
    public final CheckableImageButton d;

    public AbstractC3808Oc0(@InterfaceC5670cr1 com.google.android.material.textfield.a aVar) {
        this.a = aVar.Y0;
        this.b = aVar;
        this.c = aVar.getContext();
        this.d = aVar.t();
    }

    @InterfaceC3329Je2
    public int c() {
        return 0;
    }

    @K60
    public int d() {
        return 0;
    }

    public View.OnFocusChangeListener e() {
        return null;
    }

    public View.OnClickListener f() {
        return null;
    }

    public View.OnFocusChangeListener g() {
        return null;
    }

    public AccessibilityManager.TouchExplorationStateChangeListener h() {
        return null;
    }

    public boolean i(int i) {
        return true;
    }

    public boolean j() {
        return false;
    }

    public boolean k() {
        return false;
    }

    public boolean l() {
        return false;
    }

    public boolean m() {
        return false;
    }

    public final void r() {
        this.b.P(false);
    }

    public boolean t() {
        return false;
    }

    public void s() {
    }

    public void u() {
    }

    public void a(Editable editable) {
    }

    public void n(@InterfaceC11300zs1 EditText editText) {
    }

    public void q(boolean z) {
    }

    public void o(View view, @InterfaceC5670cr1 C10861y4 c10861y4) {
    }

    public void p(View view, @InterfaceC5670cr1 AccessibilityEvent accessibilityEvent) {
    }

    public void b(CharSequence charSequence, int i, int i2, int i3) {
    }
}
