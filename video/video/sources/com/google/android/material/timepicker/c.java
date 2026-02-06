package com.google.android.material.timepicker;

import android.content.Context;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import com.google.android.material.timepicker.ChipTextInputComboView;
import com.google.android.material.timepicker.ClockHandView;
import com.google.android.material.timepicker.TimePickerView;
import o.C10201vM;
import o.C10861y4;
import o.C2638Cg0;
import o.C3858Oo2;
import o.C7025iN1;
import o.ED;
import o.InterfaceC4346To2;

/* loaded from: classes3.dex */
public class c implements ClockHandView.c, TimePickerView.f, TimePickerView.e, ClockHandView.b, InterfaceC4346To2 {
    public static final String[] a1 = {"12", "1", C2638Cg0.Y4, C2638Cg0.Z4, "4", "5", "6", "7", "8", "9", "10", "11"};
    public static final String[] b1 = {ChipTextInputComboView.b.Y, "1", C2638Cg0.Y4, C2638Cg0.Z4, "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23"};
    public static final String[] c1 = {ChipTextInputComboView.b.Y, "5", "10", "15", "20", "25", "30", "35", "40", "45", "50", "55"};
    public static final int d1 = 30;
    public static final int e1 = 6;
    public final TimePickerView X;
    public final C3858Oo2 Y;
    public float Y0;
    public float Z;
    public boolean Z0 = false;

    /* loaded from: classes3.dex */
    public class a extends ED {
        public a(Context context, int i) {
            super(context, i);
        }

        @Override // o.ED, o.Q3
        public void g(View view, C10861y4 c10861y4) {
            super.g(view, c10861y4);
            c10861y4.p1(view.getResources().getString(c.this.Y.c(), String.valueOf(c.this.Y.d())));
        }
    }

    /* loaded from: classes3.dex */
    public class b extends ED {
        public b(Context context, int i) {
            super(context, i);
        }

        @Override // o.ED, o.Q3
        public void g(View view, C10861y4 c10861y4) {
            super.g(view, c10861y4);
            c10861y4.p1(view.getResources().getString(C7025iN1.m.material_minute_suffix, String.valueOf(c.this.Y.Z0)));
        }
    }

    public c(TimePickerView timePickerView, C3858Oo2 c3858Oo2) {
        this.X = timePickerView;
        this.Y = c3858Oo2;
        initialize();
    }

    @Override // com.google.android.material.timepicker.ClockHandView.b
    public void a(float f, boolean z) {
        this.Z0 = true;
        C3858Oo2 c3858Oo2 = this.Y;
        int i = c3858Oo2.Z0;
        int i2 = c3858Oo2.Y0;
        if (c3858Oo2.a1 == 10) {
            this.X.T(this.Y0, false);
            AccessibilityManager accessibilityManager = (AccessibilityManager) C10201vM.s(this.X.getContext(), AccessibilityManager.class);
            if (accessibilityManager == null || !accessibilityManager.isTouchExplorationEnabled()) {
                j(12, true);
            }
        } else {
            int round = Math.round(f);
            if (!z) {
                this.Y.m(((round + 15) / 30) * 5);
                this.Z = this.Y.Z0 * 6;
            }
            this.X.T(this.Z, z);
        }
        this.Z0 = false;
        l();
        i(i2, i);
    }

    @Override // com.google.android.material.timepicker.TimePickerView.e
    public void b(int i) {
        this.Y.n(i);
    }

    @Override // com.google.android.material.timepicker.TimePickerView.f
    public void c(int i) {
        j(i, true);
    }

    @Override // com.google.android.material.timepicker.ClockHandView.c
    public void d(float f, boolean z) {
        if (!this.Z0 && !z) {
            C3858Oo2 c3858Oo2 = this.Y;
            int i = c3858Oo2.Y0;
            int i2 = c3858Oo2.Z0;
            int round = Math.round(f);
            C3858Oo2 c3858Oo22 = this.Y;
            if (c3858Oo22.a1 == 12) {
                c3858Oo22.m((round + 3) / 6);
                this.Z = (float) Math.floor(this.Y.Z0 * 6);
            } else {
                int i3 = (round + 15) / 30;
                if (c3858Oo22.Z == 1) {
                    i3 %= 12;
                    if (this.X.Q() == 2) {
                        i3 += 12;
                    }
                }
                this.Y.h(i3);
                this.Y0 = h();
            }
            l();
            i(i, i2);
        }
    }

    @Override // o.InterfaceC4346To2
    public void e() {
        this.X.setVisibility(8);
    }

    public final String[] g() {
        if (this.Y.Z == 1) {
            return b1;
        }
        return a1;
    }

    public final int h() {
        return (this.Y.d() * 30) % 360;
    }

    public final void i(int i, int i2) {
        C3858Oo2 c3858Oo2 = this.Y;
        if (c3858Oo2.Z0 == i2 && c3858Oo2.Y0 == i) {
            return;
        }
        this.X.performHapticFeedback(4);
    }

    @Override // o.InterfaceC4346To2
    public void initialize() {
        if (this.Y.Z == 0) {
            this.X.c0();
        }
        this.X.P(this);
        this.X.Z(this);
        this.X.Y(this);
        this.X.W(this);
        m();
        invalidate();
    }

    @Override // o.InterfaceC4346To2
    public void invalidate() {
        this.Y0 = h();
        C3858Oo2 c3858Oo2 = this.Y;
        this.Z = c3858Oo2.Z0 * 6;
        j(c3858Oo2.a1, false);
        l();
    }

    public void j(int i, boolean z) {
        boolean z2;
        String[] g;
        int c;
        float f;
        if (i == 12) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.X.R(z2);
        this.Y.a1 = i;
        TimePickerView timePickerView = this.X;
        if (z2) {
            g = c1;
        } else {
            g = g();
        }
        if (z2) {
            c = C7025iN1.m.material_minute_suffix;
        } else {
            c = this.Y.c();
        }
        timePickerView.c(g, c);
        k();
        TimePickerView timePickerView2 = this.X;
        if (z2) {
            f = this.Z;
        } else {
            f = this.Y0;
        }
        timePickerView2.T(f, z);
        this.X.a(i);
        this.X.V(new a(this.X.getContext(), C7025iN1.m.material_hour_selection));
        this.X.U(new b(this.X.getContext(), C7025iN1.m.material_minute_selection));
    }

    public final void k() {
        C3858Oo2 c3858Oo2 = this.Y;
        int i = 1;
        if (c3858Oo2.a1 == 10 && c3858Oo2.Z == 1 && c3858Oo2.Y0 >= 12) {
            i = 2;
        }
        this.X.S(i);
    }

    public final void l() {
        TimePickerView timePickerView = this.X;
        C3858Oo2 c3858Oo2 = this.Y;
        timePickerView.b(c3858Oo2.b1, c3858Oo2.d(), this.Y.Z0);
    }

    public final void m() {
        n(a1, C3858Oo2.d1);
        n(b1, C3858Oo2.d1);
        n(c1, C3858Oo2.c1);
    }

    public final void n(String[] strArr, String str) {
        for (int i = 0; i < strArr.length; i++) {
            strArr[i] = C3858Oo2.b(this.X.getResources(), strArr[i], str);
        }
    }

    @Override // o.InterfaceC4346To2
    public void show() {
        this.X.setVisibility(0);
    }
}
