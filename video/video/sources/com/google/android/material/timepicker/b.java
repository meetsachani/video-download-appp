package com.google.android.material.timepicker;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.Window;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.timepicker.TimePickerView;
import java.util.LinkedHashSet;
import java.util.Set;
import o.BR0;
import o.C3858Oo2;
import o.C4394Uc1;
import o.C7025iN1;
import o.DialogInterface$OnCancelListenerC6458g30;
import o.HT1;
import o.InterfaceC11300zs1;
import o.InterfaceC3329Je2;
import o.InterfaceC4346To2;
import o.InterfaceC4698Xf2;
import o.InterfaceC5056aJ2;
import o.InterfaceC5670cr1;
import o.InterfaceC6181ey;
import o.K60;
import o.X81;

/* loaded from: classes3.dex */
public final class b extends DialogInterface$OnCancelListenerC6458g30 implements TimePickerView.d {
    public static final int e3 = 0;
    public static final int f3 = 1;
    public static final String g3 = "TIME_PICKER_TIME_MODEL";
    public static final String h3 = "TIME_PICKER_INPUT_MODE";
    public static final String i3 = "TIME_PICKER_TITLE_RES";
    public static final String j3 = "TIME_PICKER_TITLE_TEXT";
    public static final String k3 = "TIME_PICKER_POSITIVE_BUTTON_TEXT_RES";
    public static final String l3 = "TIME_PICKER_POSITIVE_BUTTON_TEXT";
    public static final String m3 = "TIME_PICKER_NEGATIVE_BUTTON_TEXT_RES";
    public static final String n3 = "TIME_PICKER_NEGATIVE_BUTTON_TEXT";
    public static final String o3 = "TIME_PICKER_OVERRIDE_THEME_RES_ID";
    public TimePickerView M2;
    public ViewStub N2;
    @InterfaceC11300zs1
    public com.google.android.material.timepicker.c O2;
    @InterfaceC11300zs1
    public e P2;
    @InterfaceC11300zs1
    public InterfaceC4346To2 Q2;
    @K60
    public int R2;
    @K60
    public int S2;
    public CharSequence U2;
    public CharSequence W2;
    public CharSequence Y2;
    public MaterialButton Z2;
    public Button a3;
    public C3858Oo2 c3;
    public final Set<View.OnClickListener> I2 = new LinkedHashSet();
    public final Set<View.OnClickListener> J2 = new LinkedHashSet();
    public final Set<DialogInterface.OnCancelListener> K2 = new LinkedHashSet();
    public final Set<DialogInterface.OnDismissListener> L2 = new LinkedHashSet();
    @InterfaceC3329Je2
    public int T2 = 0;
    @InterfaceC3329Je2
    public int V2 = 0;
    @InterfaceC3329Je2
    public int X2 = 0;
    public int b3 = 0;
    public int d3 = 0;

    /* loaded from: classes3.dex */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            for (View.OnClickListener onClickListener : b.this.I2) {
                onClickListener.onClick(view);
            }
            b.this.J2();
        }
    }

    /* renamed from: com.google.android.material.timepicker.b$b  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public class View$OnClickListenerC0133b implements View.OnClickListener {
        public View$OnClickListenerC0133b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            for (View.OnClickListener onClickListener : b.this.J2) {
                onClickListener.onClick(view);
            }
            b.this.J2();
        }
    }

    /* loaded from: classes3.dex */
    public class c implements View.OnClickListener {
        public c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int i;
            b bVar = b.this;
            if (bVar.b3 == 0) {
                i = 1;
            } else {
                i = 0;
            }
            bVar.b3 = i;
            b bVar2 = b.this;
            bVar2.L3(bVar2.Z2);
        }
    }

    /* loaded from: classes3.dex */
    public static final class d {
        @InterfaceC11300zs1
        public Integer b;
        public CharSequence d;
        public CharSequence f;
        public CharSequence h;
        public C3858Oo2 a = new C3858Oo2();
        @InterfaceC3329Je2
        public int c = 0;
        @InterfaceC3329Je2
        public int e = 0;
        @InterfaceC3329Je2
        public int g = 0;
        public int i = 0;

        @InterfaceC5670cr1
        public b j() {
            return b.B3(this);
        }

        @InterfaceC6181ey
        @InterfaceC5670cr1
        public d k(@BR0(from = 0, to = 23) int i) {
            this.a.k(i);
            return this;
        }

        @InterfaceC6181ey
        @InterfaceC5670cr1
        public d l(int i) {
            this.b = Integer.valueOf(i);
            return this;
        }

        @InterfaceC6181ey
        @InterfaceC5670cr1
        public d m(@BR0(from = 0, to = 59) int i) {
            this.a.m(i);
            return this;
        }

        @InterfaceC6181ey
        @InterfaceC5670cr1
        public d n(@InterfaceC3329Je2 int i) {
            this.g = i;
            return this;
        }

        @InterfaceC6181ey
        @InterfaceC5670cr1
        public d o(@InterfaceC11300zs1 CharSequence charSequence) {
            this.h = charSequence;
            return this;
        }

        @InterfaceC6181ey
        @InterfaceC5670cr1
        public d p(@InterfaceC3329Je2 int i) {
            this.e = i;
            return this;
        }

        @InterfaceC6181ey
        @InterfaceC5670cr1
        public d q(@InterfaceC11300zs1 CharSequence charSequence) {
            this.f = charSequence;
            return this;
        }

        @InterfaceC6181ey
        @InterfaceC5670cr1
        public d r(@InterfaceC4698Xf2 int i) {
            this.i = i;
            return this;
        }

        @InterfaceC6181ey
        @InterfaceC5670cr1
        public d s(int i) {
            C3858Oo2 c3858Oo2 = this.a;
            int i2 = c3858Oo2.Y0;
            int i3 = c3858Oo2.Z0;
            C3858Oo2 c3858Oo22 = new C3858Oo2(i);
            this.a = c3858Oo22;
            c3858Oo22.m(i3);
            this.a.k(i2);
            return this;
        }

        @InterfaceC6181ey
        @InterfaceC5670cr1
        public d t(@InterfaceC3329Je2 int i) {
            this.c = i;
            return this;
        }

        @InterfaceC6181ey
        @InterfaceC5670cr1
        public d u(@InterfaceC11300zs1 CharSequence charSequence) {
            this.d = charSequence;
            return this;
        }
    }

    @InterfaceC5670cr1
    public static b B3(@InterfaceC5670cr1 d dVar) {
        b bVar = new b();
        Bundle bundle = new Bundle();
        bundle.putParcelable(g3, dVar.a);
        if (dVar.b != null) {
            bundle.putInt(h3, dVar.b.intValue());
        }
        bundle.putInt(i3, dVar.c);
        if (dVar.d != null) {
            bundle.putCharSequence(j3, dVar.d);
        }
        bundle.putInt(k3, dVar.e);
        if (dVar.f != null) {
            bundle.putCharSequence(l3, dVar.f);
        }
        bundle.putInt(m3, dVar.g);
        if (dVar.h != null) {
            bundle.putCharSequence(n3, dVar.h);
        }
        bundle.putInt(o3, dVar.i);
        bVar.f2(bundle);
        return bVar;
    }

    public static /* synthetic */ void e3(b bVar) {
        InterfaceC4346To2 interfaceC4346To2 = bVar.Q2;
        if (interfaceC4346To2 instanceof e) {
            ((e) interfaceC4346To2).h();
        }
    }

    public final InterfaceC4346To2 A3(int i, @InterfaceC5670cr1 TimePickerView timePickerView, @InterfaceC5670cr1 ViewStub viewStub) {
        if (i == 0) {
            com.google.android.material.timepicker.c cVar = this.O2;
            if (cVar == null) {
                cVar = new com.google.android.material.timepicker.c(timePickerView, this.c3);
            }
            this.O2 = cVar;
            return cVar;
        }
        if (this.P2 == null) {
            this.P2 = new e((LinearLayout) viewStub.inflate(), this.c3);
        }
        this.P2.f();
        return this.P2;
    }

    public boolean C3(@InterfaceC5670cr1 DialogInterface.OnCancelListener onCancelListener) {
        return this.K2.remove(onCancelListener);
    }

    public boolean D3(@InterfaceC5670cr1 DialogInterface.OnDismissListener onDismissListener) {
        return this.L2.remove(onDismissListener);
    }

    public boolean E3(@InterfaceC5670cr1 View.OnClickListener onClickListener) {
        return this.J2.remove(onClickListener);
    }

    public boolean F3(@InterfaceC5670cr1 View.OnClickListener onClickListener) {
        return this.I2.remove(onClickListener);
    }

    public final void G3(@InterfaceC11300zs1 Bundle bundle) {
        if (bundle == null) {
            return;
        }
        C3858Oo2 c3858Oo2 = (C3858Oo2) bundle.getParcelable(g3);
        this.c3 = c3858Oo2;
        if (c3858Oo2 == null) {
            this.c3 = new C3858Oo2();
        }
        int i = 1;
        if (this.c3.Z != 1) {
            i = 0;
        }
        this.b3 = bundle.getInt(h3, i);
        this.T2 = bundle.getInt(i3, 0);
        this.U2 = bundle.getCharSequence(j3);
        this.V2 = bundle.getInt(k3, 0);
        this.W2 = bundle.getCharSequence(l3);
        this.X2 = bundle.getInt(m3, 0);
        this.Y2 = bundle.getCharSequence(n3);
        this.d3 = bundle.getInt(o3, 0);
    }

    @InterfaceC5056aJ2
    public void H3(@InterfaceC11300zs1 InterfaceC4346To2 interfaceC4346To2) {
        this.Q2 = interfaceC4346To2;
    }

    public void I3(@BR0(from = 0, to = 23) int i) {
        this.c3.h(i);
        InterfaceC4346To2 interfaceC4346To2 = this.Q2;
        if (interfaceC4346To2 != null) {
            interfaceC4346To2.invalidate();
        }
    }

    public void J3(@BR0(from = 0, to = 59) int i) {
        this.c3.m(i);
        InterfaceC4346To2 interfaceC4346To2 = this.Q2;
        if (interfaceC4346To2 != null) {
            interfaceC4346To2.invalidate();
        }
    }

    public final void K3() {
        int i;
        Button button = this.a3;
        if (button != null) {
            if (Q2()) {
                i = 0;
            } else {
                i = 8;
            }
            button.setVisibility(i);
        }
    }

    public final void L3(MaterialButton materialButton) {
        if (materialButton != null && this.M2 != null && this.N2 != null) {
            InterfaceC4346To2 interfaceC4346To2 = this.Q2;
            if (interfaceC4346To2 != null) {
                interfaceC4346To2.e();
            }
            InterfaceC4346To2 A3 = A3(this.b3, this.M2, this.N2);
            this.Q2 = A3;
            A3.show();
            this.Q2.invalidate();
            Pair<Integer, Integer> u3 = u3(this.b3);
            materialButton.setIconResource(((Integer) u3.first).intValue());
            materialButton.setContentDescription(Y().getString(((Integer) u3.second).intValue()));
            materialButton.sendAccessibilityEvent(4);
        }
    }

    @Override // o.DialogInterface$OnCancelListenerC6458g30, androidx.fragment.app.Fragment
    public void N0(@InterfaceC11300zs1 Bundle bundle) {
        super.N0(bundle);
        if (bundle == null) {
            bundle = s();
        }
        G3(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    @InterfaceC5670cr1
    public final View R0(@InterfaceC5670cr1 LayoutInflater layoutInflater, @InterfaceC11300zs1 ViewGroup viewGroup, @InterfaceC11300zs1 Bundle bundle) {
        ViewGroup viewGroup2 = (ViewGroup) layoutInflater.inflate(C7025iN1.k.material_timepicker_dialog, viewGroup);
        TimePickerView timePickerView = (TimePickerView) viewGroup2.findViewById(C7025iN1.h.material_timepicker_view);
        this.M2 = timePickerView;
        timePickerView.X(this);
        this.N2 = (ViewStub) viewGroup2.findViewById(C7025iN1.h.material_textinput_timepicker);
        this.Z2 = (MaterialButton) viewGroup2.findViewById(C7025iN1.h.material_timepicker_mode_button);
        TextView textView = (TextView) viewGroup2.findViewById(C7025iN1.h.header_title);
        int i = this.T2;
        if (i != 0) {
            textView.setText(i);
        } else if (!TextUtils.isEmpty(this.U2)) {
            textView.setText(this.U2);
        }
        L3(this.Z2);
        Button button = (Button) viewGroup2.findViewById(C7025iN1.h.material_timepicker_ok_button);
        button.setOnClickListener(new a());
        int i2 = this.V2;
        if (i2 != 0) {
            button.setText(i2);
        } else if (!TextUtils.isEmpty(this.W2)) {
            button.setText(this.W2);
        }
        Button button2 = (Button) viewGroup2.findViewById(C7025iN1.h.material_timepicker_cancel_button);
        this.a3 = button2;
        button2.setOnClickListener(new View$OnClickListenerC0133b());
        int i4 = this.X2;
        if (i4 != 0) {
            this.a3.setText(i4);
        } else if (!TextUtils.isEmpty(this.Y2)) {
            this.a3.setText(this.Y2);
        }
        K3();
        this.Z2.setOnClickListener(new c());
        return viewGroup2;
    }

    @Override // o.DialogInterface$OnCancelListenerC6458g30
    @InterfaceC5670cr1
    public final Dialog R2(@InterfaceC11300zs1 Bundle bundle) {
        Dialog dialog = new Dialog(U1(), y3());
        Context context = dialog.getContext();
        int i = C7025iN1.c.materialTimePickerStyle;
        int i2 = C7025iN1.n.Widget_MaterialComponents_TimePicker;
        C4394Uc1 c4394Uc1 = new C4394Uc1(context, null, i, i2);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, C7025iN1.o.D7, i, i2);
        this.S2 = obtainStyledAttributes.getResourceId(C7025iN1.o.F7, 0);
        this.R2 = obtainStyledAttributes.getResourceId(C7025iN1.o.G7, 0);
        int color = obtainStyledAttributes.getColor(C7025iN1.o.E7, 0);
        obtainStyledAttributes.recycle();
        c4394Uc1.i0(context);
        c4394Uc1.y0(ColorStateList.valueOf(color));
        Window window = dialog.getWindow();
        window.setBackgroundDrawable(c4394Uc1);
        window.requestFeature(1);
        window.setLayout(-2, -2);
        c4394Uc1.x0(window.getDecorView().getElevation());
        return dialog;
    }

    @Override // o.DialogInterface$OnCancelListenerC6458g30, androidx.fragment.app.Fragment
    public void U0() {
        super.U0();
        this.Q2 = null;
        this.O2 = null;
        this.P2 = null;
        TimePickerView timePickerView = this.M2;
        if (timePickerView != null) {
            timePickerView.X(null);
            this.M2 = null;
        }
    }

    @Override // o.DialogInterface$OnCancelListenerC6458g30
    public void X2(boolean z) {
        super.X2(z);
        K3();
    }

    @Override // com.google.android.material.timepicker.TimePickerView.d
    @HT1({HT1.a.Y})
    public void d() {
        this.b3 = 1;
        L3(this.Z2);
        this.P2.h();
    }

    @Override // o.DialogInterface$OnCancelListenerC6458g30, androidx.fragment.app.Fragment
    public void j1(@InterfaceC5670cr1 Bundle bundle) {
        super.j1(bundle);
        bundle.putParcelable(g3, this.c3);
        bundle.putInt(h3, this.b3);
        bundle.putInt(i3, this.T2);
        bundle.putCharSequence(j3, this.U2);
        bundle.putInt(k3, this.V2);
        bundle.putCharSequence(l3, this.W2);
        bundle.putInt(m3, this.X2);
        bundle.putCharSequence(n3, this.Y2);
        bundle.putInt(o3, this.d3);
    }

    @Override // androidx.fragment.app.Fragment
    public void m1(@InterfaceC5670cr1 View view, @InterfaceC11300zs1 Bundle bundle) {
        super.m1(view, bundle);
        if (this.Q2 instanceof e) {
            view.postDelayed(new Runnable() { // from class: o.hd1
                @Override // java.lang.Runnable
                public final void run() {
                    com.google.android.material.timepicker.b.e3(com.google.android.material.timepicker.b.this);
                }
            }, 100L);
        }
    }

    public boolean m3(@InterfaceC5670cr1 DialogInterface.OnCancelListener onCancelListener) {
        return this.K2.add(onCancelListener);
    }

    public boolean n3(@InterfaceC5670cr1 DialogInterface.OnDismissListener onDismissListener) {
        return this.L2.add(onDismissListener);
    }

    public boolean o3(@InterfaceC5670cr1 View.OnClickListener onClickListener) {
        return this.J2.add(onClickListener);
    }

    @Override // o.DialogInterface$OnCancelListenerC6458g30, android.content.DialogInterface.OnCancelListener
    public final void onCancel(@InterfaceC5670cr1 DialogInterface dialogInterface) {
        for (DialogInterface.OnCancelListener onCancelListener : this.K2) {
            onCancelListener.onCancel(dialogInterface);
        }
        super.onCancel(dialogInterface);
    }

    @Override // o.DialogInterface$OnCancelListenerC6458g30, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(@InterfaceC5670cr1 DialogInterface dialogInterface) {
        for (DialogInterface.OnDismissListener onDismissListener : this.L2) {
            onDismissListener.onDismiss(dialogInterface);
        }
        super.onDismiss(dialogInterface);
    }

    public boolean p3(@InterfaceC5670cr1 View.OnClickListener onClickListener) {
        return this.I2.add(onClickListener);
    }

    public void q3() {
        this.K2.clear();
    }

    public void r3() {
        this.L2.clear();
    }

    public void s3() {
        this.J2.clear();
    }

    public void t3() {
        this.I2.clear();
    }

    public final Pair<Integer, Integer> u3(int i) {
        if (i != 0) {
            if (i == 1) {
                return new Pair<>(Integer.valueOf(this.S2), Integer.valueOf(C7025iN1.m.material_timepicker_clock_mode_description));
            }
            throw new IllegalArgumentException("no icon for mode: " + i);
        }
        return new Pair<>(Integer.valueOf(this.R2), Integer.valueOf(C7025iN1.m.material_timepicker_text_input_mode_description));
    }

    @BR0(from = 0, to = 23)
    public int v3() {
        return this.c3.Y0 % 24;
    }

    public int w3() {
        return this.b3;
    }

    @BR0(from = 0, to = 59)
    public int x3() {
        return this.c3.Z0;
    }

    public final int y3() {
        int i = this.d3;
        if (i != 0) {
            return i;
        }
        TypedValue a2 = X81.a(U1(), C7025iN1.c.materialTimePickerTheme);
        if (a2 == null) {
            return 0;
        }
        return a2.data;
    }

    @InterfaceC11300zs1
    public com.google.android.material.timepicker.c z3() {
        return this.O2;
    }
}
