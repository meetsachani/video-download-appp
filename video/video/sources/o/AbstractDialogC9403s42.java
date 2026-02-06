package o;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import o.C7025iN1;
import o.InterfaceC8668p42;

/* renamed from: o.s42  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractDialogC9403s42<C extends InterfaceC8668p42> extends DialogC8552oc {
    public static final int j1 = C7025iN1.h.coordinator;
    public static final int k1 = C7025iN1.h.touch_outside;
    @InterfaceC11300zs1
    public InterfaceC8424o42<C> b1;
    @InterfaceC11300zs1
    public FrameLayout c1;
    @InterfaceC11300zs1
    public FrameLayout d1;
    public boolean e1;
    public boolean f1;
    public boolean g1;
    public boolean h1;
    @InterfaceC11300zs1
    public C5258b91 i1;

    /* renamed from: o.s42$a */
    /* loaded from: classes3.dex */
    public class a extends Q3 {
        public a() {
        }

        @Override // o.Q3
        public void g(View view, @InterfaceC5670cr1 C10861y4 c10861y4) {
            super.g(view, c10861y4);
            if (AbstractDialogC9403s42.this.f1) {
                c10861y4.a(1048576);
                c10861y4.s1(true);
                return;
            }
            c10861y4.s1(false);
        }

        @Override // o.Q3
        public boolean j(View view, int i, Bundle bundle) {
            if (i == 1048576) {
                AbstractDialogC9403s42 abstractDialogC9403s42 = AbstractDialogC9403s42.this;
                if (abstractDialogC9403s42.f1) {
                    abstractDialogC9403s42.cancel();
                    return true;
                }
            }
            return super.j(view, i, bundle);
        }
    }

    public AbstractDialogC9403s42(@InterfaceC5670cr1 Context context, @InterfaceC4698Xf2 int i, @InterfaceC8568og int i2, @InterfaceC4698Xf2 int i3) {
        super(context, D(context, i, i2, i3));
        this.f1 = true;
        this.g1 = true;
        q(1);
    }

    public static int D(@InterfaceC5670cr1 Context context, @InterfaceC4698Xf2 int i, @InterfaceC8568og int i2, @InterfaceC4698Xf2 int i3) {
        if (i == 0) {
            TypedValue typedValue = new TypedValue();
            if (context.getTheme().resolveAttribute(i2, typedValue, true)) {
                return typedValue.resourceId;
            }
            return i3;
        }
        return i;
    }

    private boolean J() {
        if (!this.h1) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(new int[]{16843611});
            this.g1 = obtainStyledAttributes.getBoolean(0, true);
            obtainStyledAttributes.recycle();
            this.h1 = true;
        }
        return this.g1;
    }

    private void K() {
        C5258b91 c5258b91 = this.i1;
        if (c5258b91 == null) {
            return;
        }
        if (this.f1) {
            c5258b91.c();
        } else {
            c5258b91.f();
        }
    }

    public static /* synthetic */ void r(AbstractDialogC9403s42 abstractDialogC9403s42, View view) {
        if (abstractDialogC9403s42.f1 && abstractDialogC9403s42.isShowing() && abstractDialogC9403s42.J()) {
            abstractDialogC9403s42.cancel();
        }
    }

    @InterfaceC5670cr1
    public final FrameLayout A() {
        if (this.d1 == null) {
            t();
        }
        return this.d1;
    }

    public abstract int C();

    public boolean F() {
        return this.e1;
    }

    public final void G() {
        FrameLayout frameLayout;
        int i;
        Window window = getWindow();
        if (window != null && (frameLayout = this.d1) != null && (frameLayout.getLayoutParams() instanceof CoordinatorLayout.g)) {
            if (Gravity.getAbsoluteGravity(((CoordinatorLayout.g) this.d1.getLayoutParams()).c, this.d1.getLayoutDirection()) == 3) {
                i = C7025iN1.n.Animation_Material3_SideSheetDialog_Left;
            } else {
                i = C7025iN1.n.Animation_Material3_SideSheetDialog_Right;
            }
            window.setWindowAnimations(i);
        }
    }

    public void H(boolean z) {
        this.e1 = z;
    }

    public void I(@KE0 int i) {
        FrameLayout frameLayout = this.d1;
        if (frameLayout != null) {
            if (!frameLayout.isLaidOut()) {
                ViewGroup.LayoutParams layoutParams = this.d1.getLayoutParams();
                if (layoutParams instanceof CoordinatorLayout.g) {
                    ((CoordinatorLayout.g) layoutParams).c = i;
                    G();
                    return;
                }
                return;
            }
            throw new IllegalStateException("Sheet view has been laid out; sheet edge cannot be changed once the sheet has been laid out.");
        }
        throw new IllegalStateException("Sheet view reference is null; sheet edge cannot be changed if the sheet view is null.");
    }

    public final View L(int i, @InterfaceC11300zs1 View view, @InterfaceC11300zs1 ViewGroup.LayoutParams layoutParams) {
        t();
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) w().findViewById(j1);
        if (i != 0 && view == null) {
            view = getLayoutInflater().inflate(i, (ViewGroup) coordinatorLayout, false);
        }
        FrameLayout A = A();
        A.removeAllViews();
        if (layoutParams == null) {
            A.addView(view);
        } else {
            A.addView(view, layoutParams);
        }
        coordinatorLayout.findViewById(k1).setOnClickListener(new View.OnClickListener() { // from class: o.r42
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                AbstractDialogC9403s42.r(AbstractDialogC9403s42.this, view2);
            }
        });
        C6516gH2.I1(A(), new a());
        return this.c1;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void cancel() {
        InterfaceC8424o42<C> u = u();
        if (this.e1 && u.getState() != 5) {
            u.c(5);
        } else {
            super.cancel();
        }
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        G();
        K();
    }

    @Override // o.DialogC8552oc, o.DialogC11160zI, android.app.Dialog
    public void onCreate(@InterfaceC11300zs1 Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null) {
            window.setStatusBarColor(0);
            window.addFlags(Integer.MIN_VALUE);
            window.setLayout(-1, -1);
        }
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C5258b91 c5258b91 = this.i1;
        if (c5258b91 != null) {
            c5258b91.f();
        }
    }

    @Override // o.DialogC11160zI, android.app.Dialog
    public void onStart() {
        super.onStart();
        InterfaceC8424o42<C> interfaceC8424o42 = this.b1;
        if (interfaceC8424o42 != null && interfaceC8424o42.getState() == 5) {
            this.b1.c(C());
        }
    }

    public abstract void s(InterfaceC8424o42<C> interfaceC8424o42);

    @Override // android.app.Dialog
    public void setCancelable(boolean z) {
        super.setCancelable(z);
        if (this.f1 != z) {
            this.f1 = z;
        }
        if (getWindow() != null) {
            K();
        }
    }

    @Override // android.app.Dialog
    public void setCanceledOnTouchOutside(boolean z) {
        super.setCanceledOnTouchOutside(z);
        if (z && !this.f1) {
            this.f1 = true;
        }
        this.g1 = z;
        this.h1 = true;
    }

    @Override // o.DialogC8552oc, o.DialogC11160zI, android.app.Dialog
    public void setContentView(@BY0 int i) {
        super.setContentView(L(i, null, null));
    }

    public final void t() {
        if (this.c1 == null) {
            FrameLayout frameLayout = (FrameLayout) View.inflate(getContext(), z(), null);
            this.c1 = frameLayout;
            FrameLayout frameLayout2 = (FrameLayout) frameLayout.findViewById(x());
            this.d1 = frameLayout2;
            InterfaceC8424o42<C> v = v(frameLayout2);
            this.b1 = v;
            s(v);
            this.i1 = new C5258b91(this.b1, this.d1);
        }
    }

    @InterfaceC5670cr1
    public InterfaceC8424o42<C> u() {
        if (this.b1 == null) {
            t();
        }
        return this.b1;
    }

    @InterfaceC5670cr1
    public abstract InterfaceC8424o42<C> v(@InterfaceC5670cr1 FrameLayout frameLayout);

    @InterfaceC5670cr1
    public final FrameLayout w() {
        if (this.c1 == null) {
            t();
        }
        return this.c1;
    }

    @PL0
    public abstract int x();

    @BY0
    public abstract int z();

    @Override // o.DialogC8552oc, o.DialogC11160zI, android.app.Dialog
    public void setContentView(@InterfaceC11300zs1 View view) {
        super.setContentView(L(0, view, null));
    }

    @Override // o.DialogC8552oc, o.DialogC11160zI, android.app.Dialog
    public void setContentView(@InterfaceC11300zs1 View view, @InterfaceC11300zs1 ViewGroup.LayoutParams layoutParams) {
        super.setContentView(L(0, view, layoutParams));
    }
}
