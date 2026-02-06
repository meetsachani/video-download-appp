package o;

import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import androidx.activity.OnBackPressedDispatcher;
import androidx.lifecycle.f;

/* renamed from: o.zI  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class DialogC11160zI extends Dialog implements KZ0, InterfaceC3294Iu1, InterfaceC4345To1, OX1 {
    public androidx.lifecycle.j X;
    public final NX1 Y;
    public final EY0 Y0;
    public final EY0 Z;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DialogC11160zI(Context context) {
        this(context, 0, 2, null);
        C6562gT0.p(context, "context");
    }

    private final D30 h() {
        return (D30) this.Z.getValue();
    }

    public static final OnBackPressedDispatcher j(final DialogC11160zI dialogC11160zI) {
        return new OnBackPressedDispatcher(new Runnable() { // from class: o.wI
            @Override // java.lang.Runnable
            public final void run() {
                DialogC11160zI.k(DialogC11160zI.this);
            }
        });
    }

    public static final void k(DialogC11160zI dialogC11160zI) {
        super.onBackPressed();
    }

    public static final D30 l(DialogC11160zI dialogC11160zI) {
        D30 d30 = new D30();
        dialogC11160zI.f().d(d30);
        return d30;
    }

    @Override // o.OX1
    public androidx.savedstate.a E() {
        return this.Y.b();
    }

    @Override // o.InterfaceC3294Iu1
    public final OnBackPressedDispatcher R() {
        return (OnBackPressedDispatcher) this.Y0.getValue();
    }

    @Override // android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        C6562gT0.p(view, C9698tH2.A);
        i();
        super.addContentView(view, layoutParams);
    }

    @Override // o.KZ0
    public androidx.lifecycle.f b() {
        return e();
    }

    public final androidx.lifecycle.j e() {
        androidx.lifecycle.j jVar = this.X;
        if (jVar == null) {
            androidx.lifecycle.j jVar2 = new androidx.lifecycle.j(this);
            this.X = jVar2;
            return jVar2;
        }
        return jVar;
    }

    @Override // o.InterfaceC4345To1
    public C4248So1 f() {
        return R().j();
    }

    public void i() {
        Window window = getWindow();
        C6562gT0.m(window);
        View decorView = window.getDecorView();
        C6562gT0.o(decorView, "getDecorView(...)");
        C9216rI2.b(decorView, this);
        Window window2 = getWindow();
        C6562gT0.m(window2);
        View decorView2 = window2.getDecorView();
        C6562gT0.o(decorView2, "getDecorView(...)");
        C9702tI2.b(decorView2, this);
        Window window3 = getWindow();
        C6562gT0.m(window3);
        View decorView3 = window3.getDecorView();
        C6562gT0.o(decorView3, "getDecorView(...)");
        C9945uI2.b(decorView3, this);
        Window window4 = getWindow();
        C6562gT0.m(window4);
        View decorView4 = window4.getDecorView();
        C6562gT0.o(decorView4, "getDecorView(...)");
        C9459sI2.b(decorView4, this);
    }

    @Override // android.app.Dialog
    @InterfaceC9150r20(message = "This method has been deprecated in favor of using the\n      {@link OnBackPressedDispatcher} via {@link #getOnBackPressedDispatcher()}.\n      The OnBackPressedDispatcher controls how back button events are dispatched\n      to one or more {@link OnBackPressedCallback} objects.")
    public void onBackPressed() {
        h().t();
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackPressedDispatcher R = R();
            OnBackInvokedDispatcher a = C10185vI.a(this);
            C6562gT0.o(a, "getOnBackInvokedDispatcher(...)");
            R.m(a);
        }
        this.Y.d(bundle);
        e().l(f.a.ON_CREATE);
    }

    @Override // android.app.Dialog
    public Bundle onSaveInstanceState() {
        Bundle onSaveInstanceState = super.onSaveInstanceState();
        C6562gT0.o(onSaveInstanceState, "onSaveInstanceState(...)");
        this.Y.e(onSaveInstanceState);
        return onSaveInstanceState;
    }

    @Override // android.app.Dialog
    public void onStart() {
        super.onStart();
        e().l(f.a.ON_RESUME);
    }

    @Override // android.app.Dialog
    public void onStop() {
        e().l(f.a.ON_DESTROY);
        this.X = null;
        super.onStop();
    }

    @Override // android.app.Dialog
    public void setContentView(int i) {
        i();
        super.setContentView(i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DialogC11160zI(Context context, int i) {
        super(context, i);
        C6562gT0.p(context, "context");
        this.Y = NX1.d.a(this);
        this.Z = WY0.b(new FA0() { // from class: o.xI
            @Override // o.FA0
            public final Object invoke() {
                D30 l;
                l = DialogC11160zI.l(DialogC11160zI.this);
                return l;
            }
        });
        this.Y0 = WY0.b(new FA0() { // from class: o.yI
            @Override // o.FA0
            public final Object invoke() {
                OnBackPressedDispatcher j;
                j = DialogC11160zI.j(DialogC11160zI.this);
                return j;
            }
        });
    }

    @Override // android.app.Dialog
    public void setContentView(View view) {
        C6562gT0.p(view, C9698tH2.A);
        i();
        super.setContentView(view);
    }

    @Override // android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        C6562gT0.p(view, C9698tH2.A);
        i();
        super.setContentView(view, layoutParams);
    }

    public /* synthetic */ DialogC11160zI(Context context, int i, int i2, C9516sY c9516sY) {
        this(context, (i2 & 2) != 0 ? 0 : i);
    }

    public static /* synthetic */ void g() {
    }
}
