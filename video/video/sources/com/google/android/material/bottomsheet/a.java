package com.google.android.material.bottomsheet;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import o.BY0;
import o.C10861y4;
import o.C10920yI2;
import o.C11125z90;
import o.C4394Uc1;
import o.C5258b91;
import o.C6516gH2;
import o.C7025iN1;
import o.C8006mL2;
import o.C9179r91;
import o.DialogC8552oc;
import o.InterfaceC10336vu1;
import o.InterfaceC11300zs1;
import o.InterfaceC4698Xf2;
import o.InterfaceC5670cr1;
import o.Q3;
import o.RL2;

/* loaded from: classes3.dex */
public class a extends DialogC8552oc {
    public BottomSheetBehavior<FrameLayout> b1;
    public FrameLayout c1;
    public CoordinatorLayout d1;
    public FrameLayout e1;
    public boolean f1;
    public boolean g1;
    public boolean h1;
    public boolean i1;
    public f j1;
    public boolean k1;
    @InterfaceC11300zs1
    public C5258b91 l1;
    @InterfaceC5670cr1
    public BottomSheetBehavior.g m1;

    /* renamed from: com.google.android.material.bottomsheet.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public class C0117a implements InterfaceC10336vu1 {
        public C0117a() {
        }

        @Override // o.InterfaceC10336vu1
        public RL2 a(View view, RL2 rl2) {
            if (a.this.j1 != null) {
                a.this.b1.b1(a.this.j1);
            }
            if (rl2 != null) {
                a aVar = a.this;
                aVar.j1 = new f(aVar.e1, rl2, null);
                a.this.j1.e(a.this.getWindow());
                a.this.b1.h0(a.this.j1);
            }
            return rl2;
        }
    }

    /* loaded from: classes3.dex */
    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            a aVar = a.this;
            if (aVar.g1 && aVar.isShowing() && a.this.G()) {
                a.this.cancel();
            }
        }
    }

    /* loaded from: classes3.dex */
    public class c extends Q3 {
        public c() {
        }

        @Override // o.Q3
        public void g(View view, @InterfaceC5670cr1 C10861y4 c10861y4) {
            super.g(view, c10861y4);
            if (a.this.g1) {
                c10861y4.a(1048576);
                c10861y4.s1(true);
                return;
            }
            c10861y4.s1(false);
        }

        @Override // o.Q3
        public boolean j(View view, int i, Bundle bundle) {
            if (i == 1048576) {
                a aVar = a.this;
                if (aVar.g1) {
                    aVar.cancel();
                    return true;
                }
            }
            return super.j(view, i, bundle);
        }
    }

    /* loaded from: classes3.dex */
    public class d implements View.OnTouchListener {
        public d() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            return true;
        }
    }

    /* loaded from: classes3.dex */
    public class e extends BottomSheetBehavior.g {
        public e() {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.g
        public void b(@InterfaceC5670cr1 View view, float f) {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.g
        public void c(@InterfaceC5670cr1 View view, int i) {
            if (i == 5) {
                a.this.cancel();
            }
        }
    }

    /* loaded from: classes3.dex */
    public static class f extends BottomSheetBehavior.g {
        @InterfaceC11300zs1
        public final Boolean a;
        @InterfaceC5670cr1
        public final RL2 b;
        @InterfaceC11300zs1
        public Window c;
        public boolean d;

        public /* synthetic */ f(View view, RL2 rl2, C0117a c0117a) {
            this(view, rl2);
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.g
        public void a(@InterfaceC5670cr1 View view) {
            d(view);
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.g
        public void b(@InterfaceC5670cr1 View view, float f) {
            d(view);
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.g
        public void c(@InterfaceC5670cr1 View view, int i) {
            d(view);
        }

        public final void d(View view) {
            boolean booleanValue;
            if (view.getTop() < this.b.r()) {
                Window window = this.c;
                if (window != null) {
                    Boolean bool = this.a;
                    if (bool == null) {
                        booleanValue = this.d;
                    } else {
                        booleanValue = bool.booleanValue();
                    }
                    C11125z90.g(window, booleanValue);
                }
                view.setPadding(view.getPaddingLeft(), this.b.r() - view.getTop(), view.getPaddingRight(), view.getPaddingBottom());
            } else if (view.getTop() != 0) {
                Window window2 = this.c;
                if (window2 != null) {
                    C11125z90.g(window2, this.d);
                }
                view.setPadding(view.getPaddingLeft(), 0, view.getPaddingRight(), view.getPaddingBottom());
            }
        }

        public void e(@InterfaceC11300zs1 Window window) {
            if (this.c != window) {
                this.c = window;
                if (window != null) {
                    this.d = C8006mL2.a(window, window.getDecorView()).f();
                }
            }
        }

        public f(@InterfaceC5670cr1 View view, @InterfaceC5670cr1 RL2 rl2) {
            ColorStateList backgroundTintList;
            this.b = rl2;
            C4394Uc1 E0 = BottomSheetBehavior.x0(view).E0();
            if (E0 != null) {
                backgroundTintList = E0.G();
            } else {
                backgroundTintList = view.getBackgroundTintList();
            }
            if (backgroundTintList != null) {
                this.a = Boolean.valueOf(C9179r91.q(backgroundTintList.getDefaultColor()));
                return;
            }
            Integer j = C10920yI2.j(view);
            if (j != null) {
                this.a = Boolean.valueOf(C9179r91.q(j.intValue()));
            } else {
                this.a = null;
            }
        }
    }

    public a(@InterfaceC5670cr1 Context context) {
        this(context, 0);
        A();
    }

    private void A() {
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(new int[]{C7025iN1.c.enableEdgeToEdge});
        this.k1 = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
    }

    @Deprecated
    public static void F(@InterfaceC5670cr1 View view, boolean z) {
        int i;
        int systemUiVisibility = view.getSystemUiVisibility();
        if (z) {
            i = systemUiVisibility | 8192;
        } else {
            i = systemUiVisibility & (-8193);
        }
        view.setSystemUiVisibility(i);
    }

    public static int o(@InterfaceC5670cr1 Context context, int i) {
        if (i == 0) {
            TypedValue typedValue = new TypedValue();
            if (context.getTheme().resolveAttribute(C7025iN1.c.bottomSheetDialogTheme, typedValue, true)) {
                return typedValue.resourceId;
            }
            return C7025iN1.n.Theme_Design_Light_BottomSheetDialog;
        }
        return i;
    }

    public void C() {
        this.b1.b1(this.m1);
    }

    public void D(boolean z) {
        this.f1 = z;
    }

    public boolean G() {
        if (!this.i1) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(new int[]{16843611});
            this.h1 = obtainStyledAttributes.getBoolean(0, true);
            obtainStyledAttributes.recycle();
            this.i1 = true;
        }
        return this.h1;
    }

    public final void H() {
        C5258b91 c5258b91 = this.l1;
        if (c5258b91 == null) {
            return;
        }
        if (this.g1) {
            c5258b91.c();
        } else {
            c5258b91.f();
        }
    }

    public final View I(int i, @InterfaceC11300zs1 View view, @InterfaceC11300zs1 ViewGroup.LayoutParams layoutParams) {
        v();
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.c1.findViewById(C7025iN1.h.coordinator);
        if (i != 0 && view == null) {
            view = getLayoutInflater().inflate(i, (ViewGroup) coordinatorLayout, false);
        }
        if (this.k1) {
            C6516gH2.l2(this.c1, new C0117a());
        }
        this.e1.removeAllViews();
        if (layoutParams == null) {
            this.e1.addView(view);
        } else {
            this.e1.addView(view, layoutParams);
        }
        coordinatorLayout.findViewById(C7025iN1.h.touch_outside).setOnClickListener(new b());
        C6516gH2.I1(this.e1, new c());
        this.e1.setOnTouchListener(new d());
        return this.c1;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void cancel() {
        BottomSheetBehavior<FrameLayout> w = w();
        if (this.f1 && w.getState() != 5) {
            w.c(5);
        } else {
            super.cancel();
        }
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onAttachedToWindow() {
        boolean z;
        super.onAttachedToWindow();
        Window window = getWindow();
        if (window != null) {
            if (this.k1 && Color.alpha(window.getNavigationBarColor()) < 255) {
                z = true;
            } else {
                z = false;
            }
            FrameLayout frameLayout = this.c1;
            if (frameLayout != null) {
                frameLayout.setFitsSystemWindows(!z);
            }
            CoordinatorLayout coordinatorLayout = this.d1;
            if (coordinatorLayout != null) {
                coordinatorLayout.setFitsSystemWindows(!z);
            }
            C8006mL2.c(window, !z);
            f fVar = this.j1;
            if (fVar != null) {
                fVar.e(window);
            }
        }
        H();
    }

    @Override // o.DialogC8552oc, o.DialogC11160zI, android.app.Dialog
    public void onCreate(Bundle bundle) {
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
        f fVar = this.j1;
        if (fVar != null) {
            fVar.e(null);
        }
        C5258b91 c5258b91 = this.l1;
        if (c5258b91 != null) {
            c5258b91.f();
        }
    }

    @Override // o.DialogC11160zI, android.app.Dialog
    public void onStart() {
        super.onStart();
        BottomSheetBehavior<FrameLayout> bottomSheetBehavior = this.b1;
        if (bottomSheetBehavior != null && bottomSheetBehavior.getState() == 5) {
            this.b1.c(4);
        }
    }

    @Override // android.app.Dialog
    public void setCancelable(boolean z) {
        super.setCancelable(z);
        if (this.g1 != z) {
            this.g1 = z;
            BottomSheetBehavior<FrameLayout> bottomSheetBehavior = this.b1;
            if (bottomSheetBehavior != null) {
                bottomSheetBehavior.q1(z);
            }
            if (getWindow() != null) {
                H();
            }
        }
    }

    @Override // android.app.Dialog
    public void setCanceledOnTouchOutside(boolean z) {
        super.setCanceledOnTouchOutside(z);
        if (z && !this.g1) {
            this.g1 = true;
        }
        this.h1 = z;
        this.i1 = true;
    }

    @Override // o.DialogC8552oc, o.DialogC11160zI, android.app.Dialog
    public void setContentView(@BY0 int i) {
        super.setContentView(I(i, null, null));
    }

    public final FrameLayout v() {
        if (this.c1 == null) {
            FrameLayout frameLayout = (FrameLayout) View.inflate(getContext(), C7025iN1.k.design_bottom_sheet_dialog, null);
            this.c1 = frameLayout;
            this.d1 = (CoordinatorLayout) frameLayout.findViewById(C7025iN1.h.coordinator);
            FrameLayout frameLayout2 = (FrameLayout) this.c1.findViewById(C7025iN1.h.design_bottom_sheet);
            this.e1 = frameLayout2;
            BottomSheetBehavior<FrameLayout> x0 = BottomSheetBehavior.x0(frameLayout2);
            this.b1 = x0;
            x0.h0(this.m1);
            this.b1.q1(this.g1);
            this.l1 = new C5258b91(this.b1, this.e1);
        }
        return this.c1;
    }

    @InterfaceC5670cr1
    public BottomSheetBehavior<FrameLayout> w() {
        if (this.b1 == null) {
            v();
        }
        return this.b1;
    }

    public boolean x() {
        return this.f1;
    }

    public boolean z() {
        return this.k1;
    }

    @Override // o.DialogC8552oc, o.DialogC11160zI, android.app.Dialog
    public void setContentView(View view) {
        super.setContentView(I(0, view, null));
    }

    public a(@InterfaceC5670cr1 Context context, @InterfaceC4698Xf2 int i) {
        super(context, o(context, i));
        this.g1 = true;
        this.h1 = true;
        this.m1 = new e();
        q(1);
        A();
    }

    @Override // o.DialogC8552oc, o.DialogC11160zI, android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(I(0, view, layoutParams));
    }

    public a(@InterfaceC5670cr1 Context context, boolean z, DialogInterface.OnCancelListener onCancelListener) {
        super(context, z, onCancelListener);
        this.g1 = true;
        this.h1 = true;
        this.m1 = new e();
        q(1);
        this.g1 = z;
        A();
    }
}
