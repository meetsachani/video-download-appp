package com.google.android.material.bottomsheet;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import o.BY0;
import o.C8795pc;
import o.InterfaceC11300zs1;
import o.InterfaceC5670cr1;

/* loaded from: classes3.dex */
public class b extends C8795pc {
    public boolean I2;

    /* renamed from: com.google.android.material.bottomsheet.b$b  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public class C0118b extends BottomSheetBehavior.g {
        public C0118b() {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.g
        public void b(@InterfaceC5670cr1 View view, float f) {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.g
        public void c(@InterfaceC5670cr1 View view, int i) {
            if (i == 5) {
                b.this.f3();
            }
        }
    }

    public b() {
    }

    @Override // o.DialogInterface$OnCancelListenerC6458g30
    public void J2() {
        if (!h3(false)) {
            super.J2();
        }
    }

    @Override // o.DialogInterface$OnCancelListenerC6458g30
    public void K2() {
        if (!h3(true)) {
            super.K2();
        }
    }

    @Override // o.C8795pc, o.DialogInterface$OnCancelListenerC6458g30
    @InterfaceC5670cr1
    public Dialog R2(@InterfaceC11300zs1 Bundle bundle) {
        return new com.google.android.material.bottomsheet.a(v(), P2());
    }

    public final void f3() {
        if (this.I2) {
            super.K2();
        } else {
            super.J2();
        }
    }

    public final void g3(@InterfaceC5670cr1 BottomSheetBehavior<?> bottomSheetBehavior, boolean z) {
        this.I2 = z;
        if (bottomSheetBehavior.getState() == 5) {
            f3();
            return;
        }
        if (N2() instanceof com.google.android.material.bottomsheet.a) {
            ((com.google.android.material.bottomsheet.a) N2()).C();
        }
        bottomSheetBehavior.h0(new C0118b());
        bottomSheetBehavior.c(5);
    }

    public final boolean h3(boolean z) {
        Dialog N2 = N2();
        if (N2 instanceof com.google.android.material.bottomsheet.a) {
            com.google.android.material.bottomsheet.a aVar = (com.google.android.material.bottomsheet.a) N2;
            BottomSheetBehavior<FrameLayout> w = aVar.w();
            if (w.U0() && aVar.x()) {
                g3(w, z);
                return true;
            }
            return false;
        }
        return false;
    }

    @SuppressLint({"ValidFragment"})
    public b(@BY0 int i) {
        super(i);
    }
}
