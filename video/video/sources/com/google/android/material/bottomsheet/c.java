package com.google.android.material.bottomsheet;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import o.C10861y4;
import o.C6516gH2;
import o.C6597gd1;
import o.C7025iN1;
import o.G4;
import o.InterfaceC11300zs1;
import o.InterfaceC5670cr1;
import o.Q3;

/* loaded from: classes3.dex */
public class c extends AppCompatImageView implements AccessibilityManager.AccessibilityStateChangeListener {
    public static final int l1 = C7025iN1.n.Widget_Material3_BottomSheet_DragHandle;
    @InterfaceC11300zs1
    public final AccessibilityManager b1;
    @InterfaceC11300zs1
    public BottomSheetBehavior<?> c1;
    public final GestureDetector d1;
    public boolean e1;
    public boolean f1;
    public boolean g1;
    public final String h1;
    public final String i1;
    public final BottomSheetBehavior.g j1;
    public final GestureDetector.OnGestureListener k1;

    /* loaded from: classes3.dex */
    public class a extends BottomSheetBehavior.g {
        public a() {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.g
        public void b(@InterfaceC5670cr1 View view, float f) {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.g
        public void c(@InterfaceC5670cr1 View view, int i) {
            c.this.k(i);
        }
    }

    /* loaded from: classes3.dex */
    public class b extends GestureDetector.SimpleOnGestureListener {
        public b() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onDoubleTap(@InterfaceC5670cr1 MotionEvent motionEvent) {
            if (c.this.c1 != null && c.this.c1.U0()) {
                c.this.c1.c(5);
                return true;
            }
            return super.onDoubleTap(motionEvent);
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onDown(@InterfaceC5670cr1 MotionEvent motionEvent) {
            return c.this.isClickable();
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onSingleTapConfirmed(@InterfaceC5670cr1 MotionEvent motionEvent) {
            return c.this.g();
        }
    }

    /* renamed from: com.google.android.material.bottomsheet.c$c  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public class C0119c extends Q3 {
        public C0119c() {
        }

        @Override // o.Q3
        public void h(View view, @InterfaceC5670cr1 AccessibilityEvent accessibilityEvent) {
            super.h(view, accessibilityEvent);
            if (accessibilityEvent.getEventType() == 1) {
                c.this.g();
            }
        }
    }

    public c(@InterfaceC5670cr1 Context context) {
        this(context, null);
    }

    @InterfaceC11300zs1
    public static View i(View view) {
        ViewParent parent = view.getParent();
        if (parent instanceof View) {
            return (View) parent;
        }
        return null;
    }

    private void setBottomSheetBehavior(@InterfaceC11300zs1 BottomSheetBehavior<?> bottomSheetBehavior) {
        BottomSheetBehavior<?> bottomSheetBehavior2 = this.c1;
        if (bottomSheetBehavior2 != null) {
            bottomSheetBehavior2.b1(this.j1);
            this.c1.g1(null);
            this.c1.i1(null);
        }
        this.c1 = bottomSheetBehavior;
        if (bottomSheetBehavior != null) {
            bottomSheetBehavior.g1(this);
            this.c1.i1(this);
            k(this.c1.getState());
            this.c1.h0(this.j1);
        }
        setClickable(j());
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0025, code lost:
        if (r1 != false) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean g() {
        boolean z = false;
        if (!j()) {
            return false;
        }
        if (!this.c1.S0() && !this.c1.G1()) {
            z = true;
        }
        int state = this.c1.getState();
        int i = 6;
        int i2 = 3;
        if (state != 4) {
            if (state == 3) {
                if (!z) {
                    i = 4;
                }
                this.c1.c(i);
                return true;
            }
            if (!this.e1) {
                i2 = 4;
            }
            i = i2;
            this.c1.c(i);
            return true;
        }
    }

    @InterfaceC11300zs1
    public final BottomSheetBehavior<?> h() {
        View view = this;
        while (true) {
            view = i(view);
            if (view != null) {
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                if (layoutParams instanceof CoordinatorLayout.g) {
                    CoordinatorLayout.c f = ((CoordinatorLayout.g) layoutParams).f();
                    if (f instanceof BottomSheetBehavior) {
                        return (BottomSheetBehavior) f;
                    }
                }
            } else {
                return null;
            }
        }
    }

    public final boolean j() {
        if (this.c1 != null) {
            return true;
        }
        return false;
    }

    public final void k(int i) {
        String str;
        if (i == 4) {
            this.e1 = true;
        } else if (i == 3) {
            this.e1 = false;
        }
        C10861y4.a aVar = C10861y4.a.j;
        if (this.e1) {
            str = this.h1;
        } else {
            str = this.i1;
        }
        C6516gH2.B1(this, aVar, str, new G4() { // from class: o.dp
            @Override // o.G4
            public final boolean a(View view, G4.a aVar2) {
                boolean g;
                g = com.google.android.material.bottomsheet.c.this.g();
                return g;
            }
        });
    }

    @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
    public void onAccessibilityStateChanged(boolean z) {
    }

    @Override // android.widget.ImageView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        setBottomSheetBehavior(h());
        AccessibilityManager accessibilityManager = this.b1;
        if (accessibilityManager != null) {
            accessibilityManager.addAccessibilityStateChangeListener(this);
            onAccessibilityStateChanged(this.b1.isEnabled());
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDetachedFromWindow() {
        AccessibilityManager accessibilityManager = this.b1;
        if (accessibilityManager != null) {
            accessibilityManager.removeAccessibilityStateChangeListener(this);
        }
        setBottomSheetBehavior(null);
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.g1 && !this.f1) {
            return this.d1.onTouchEvent(motionEvent);
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public void setOnClickListener(@InterfaceC11300zs1 View.OnClickListener onClickListener) {
        boolean z;
        if (onClickListener != null) {
            z = true;
        } else {
            z = false;
        }
        this.g1 = z;
        super.setOnClickListener(onClickListener);
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public void setOnTouchListener(View.OnTouchListener onTouchListener) {
        boolean z;
        if (onTouchListener != null) {
            z = true;
        } else {
            z = false;
        }
        this.f1 = z;
        super.setOnTouchListener(onTouchListener);
    }

    public c(@InterfaceC5670cr1 Context context, @InterfaceC11300zs1 AttributeSet attributeSet) {
        this(context, attributeSet, C7025iN1.c.bottomSheetDragHandleStyle);
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public c(@InterfaceC5670cr1 Context context, @InterfaceC11300zs1 AttributeSet attributeSet, int i) {
        super(C6597gd1.d(context, attributeSet, i, l1), attributeSet, i);
        this.f1 = false;
        this.g1 = false;
        this.h1 = getResources().getString(C7025iN1.m.bottomsheet_action_expand);
        this.i1 = getResources().getString(C7025iN1.m.bottomsheet_action_collapse);
        this.j1 = new a();
        b bVar = new b();
        this.k1 = bVar;
        Context context2 = getContext();
        this.d1 = new GestureDetector(context2, bVar, new Handler(Looper.getMainLooper()));
        this.b1 = (AccessibilityManager) context2.getSystemService("accessibility");
        C6516gH2.I1(this, new C0119c());
    }
}
