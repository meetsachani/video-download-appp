package o;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import o.C9271rX0;
import o.OL1;
import o.T4;

/* renamed from: o.oc  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class DialogC8552oc extends DialogC11160zI implements InterfaceC4291Tb {
    public AbstractC5608cc Z0;
    public final C9271rX0.a a1;

    public DialogC8552oc(Context context) {
        this(context, 0);
    }

    private static int o(Context context, int i) {
        if (i == 0) {
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(OL1.b.Z0, typedValue, true);
            return typedValue.resourceId;
        }
        return i;
    }

    @Override // o.DialogC11160zI, android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        i();
        m().f(view, layoutParams);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        super.dismiss();
        m().L();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return C9271rX0.e(this.a1, getWindow().getDecorView(), this, keyEvent);
    }

    @Override // android.app.Dialog
    public <T extends View> T findViewById(int i) {
        return (T) m().s(i);
    }

    @Override // android.app.Dialog
    public void invalidateOptionsMenu() {
        m().F();
    }

    public AbstractC5608cc m() {
        if (this.Z0 == null) {
            this.Z0 = AbstractC5608cc.o(this, this);
        }
        return this.Z0;
    }

    public O4 n() {
        return m().C();
    }

    @Override // o.DialogC11160zI, android.app.Dialog
    public void onCreate(Bundle bundle) {
        m().E();
        super.onCreate(bundle);
        m().K(bundle);
    }

    @Override // o.DialogC11160zI, android.app.Dialog
    public void onStop() {
        super.onStop();
        m().Q();
    }

    public boolean p(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    public boolean q(int i) {
        return m().T(i);
    }

    @Override // o.DialogC11160zI, android.app.Dialog
    public void setContentView(int i) {
        i();
        m().X(i);
    }

    @Override // android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        m().h0(charSequence);
    }

    @Override // o.InterfaceC4291Tb
    public T4 y(T4.a aVar) {
        return null;
    }

    public DialogC8552oc(Context context, int i) {
        super(context, o(context, i));
        this.a1 = new C9271rX0.a() { // from class: o.nc
            @Override // o.C9271rX0.a
            public final boolean I(KeyEvent keyEvent) {
                return DialogC8552oc.this.p(keyEvent);
            }
        };
        AbstractC5608cc m = m();
        m.g0(o(context, i));
        m.K(null);
    }

    @Override // o.DialogC11160zI, android.app.Dialog
    public void setContentView(View view) {
        i();
        m().Y(view);
    }

    @Override // android.app.Dialog
    public void setTitle(int i) {
        super.setTitle(i);
        m().h0(getContext().getString(i));
    }

    @Override // o.DialogC11160zI, android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        i();
        m().Z(view, layoutParams);
    }

    public DialogC8552oc(Context context, boolean z, DialogInterface.OnCancelListener onCancelListener) {
        super(context);
        this.a1 = new C9271rX0.a() { // from class: o.nc
            @Override // o.C9271rX0.a
            public final boolean I(KeyEvent keyEvent) {
                return DialogC8552oc.this.p(keyEvent);
            }
        };
        setCancelable(z);
        setOnCancelListener(onCancelListener);
    }

    @Override // o.InterfaceC4291Tb
    public void B(T4 t4) {
    }

    @Override // o.InterfaceC4291Tb
    public void P(T4 t4) {
    }
}
