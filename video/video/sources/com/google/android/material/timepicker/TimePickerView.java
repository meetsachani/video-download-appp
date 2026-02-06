package com.google.android.material.timepicker;

import android.annotation.SuppressLint;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Checkable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.chip.Chip;
import com.google.android.material.timepicker.ClockHandView;
import java.util.Locale;
import o.C3858Oo2;
import o.C6516gH2;
import o.C7025iN1;
import o.InterfaceC11300zs1;
import o.InterfaceC3329Je2;
import o.InterfaceC4249So2;
import o.InterfaceC5670cr1;
import o.Q3;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class TimePickerView extends ConstraintLayout implements InterfaceC4249So2 {
    public static final String O1 = "android.view.View";
    public final Chip F1;
    public final Chip G1;
    public final ClockHandView H1;
    public final ClockFaceView I1;
    public final MaterialButtonToggleGroup J1;
    public final View.OnClickListener K1;
    public e L1;
    public f M1;
    public d N1;

    /* loaded from: classes3.dex */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (TimePickerView.this.M1 != null) {
                TimePickerView.this.M1.c(((Integer) view.getTag(C7025iN1.h.selection_type)).intValue());
            }
        }
    }

    /* loaded from: classes3.dex */
    public class b extends GestureDetector.SimpleOnGestureListener {
        public b() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onDoubleTap(MotionEvent motionEvent) {
            d dVar = TimePickerView.this.N1;
            if (dVar != null) {
                dVar.d();
                return true;
            }
            return false;
        }
    }

    /* loaded from: classes3.dex */
    public class c implements View.OnTouchListener {
        public final /* synthetic */ GestureDetector X;

        public c(GestureDetector gestureDetector) {
            this.X = gestureDetector;
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (((Checkable) view).isChecked()) {
                return this.X.onTouchEvent(motionEvent);
            }
            return false;
        }
    }

    /* loaded from: classes3.dex */
    public interface d {
        void d();
    }

    /* loaded from: classes3.dex */
    public interface e {
        void b(int i);
    }

    /* loaded from: classes3.dex */
    public interface f {
        void c(int i);
    }

    public TimePickerView(Context context) {
        this(context, null);
    }

    public static /* synthetic */ void M(TimePickerView timePickerView, MaterialButtonToggleGroup materialButtonToggleGroup, int i, boolean z) {
        int i2;
        if (!z) {
            timePickerView.getClass();
            return;
        }
        e eVar = timePickerView.L1;
        if (eVar != null) {
            if (i == C7025iN1.h.material_clock_period_pm_button) {
                i2 = 1;
            } else {
                i2 = 0;
            }
            eVar.b(i2);
        }
    }

    public void P(ClockHandView.c cVar) {
        this.H1.b(cVar);
    }

    public int Q() {
        return this.I1.Z();
    }

    public void R(boolean z) {
        this.H1.n(z);
    }

    public void S(int i) {
        this.I1.d0(i);
    }

    public void T(float f2, boolean z) {
        this.H1.r(f2, z);
    }

    public void U(Q3 q3) {
        C6516gH2.I1(this.F1, q3);
    }

    public void V(Q3 q3) {
        C6516gH2.I1(this.G1, q3);
    }

    public void W(ClockHandView.b bVar) {
        this.H1.u(bVar);
    }

    public void X(@InterfaceC11300zs1 d dVar) {
        this.N1 = dVar;
    }

    public void Y(e eVar) {
        this.L1 = eVar;
    }

    public void Z(f fVar) {
        this.M1 = fVar;
    }

    @Override // o.InterfaceC4249So2
    public void a(int i) {
        boolean z;
        Chip chip = this.F1;
        boolean z2 = false;
        if (i == 12) {
            z = true;
        } else {
            z = false;
        }
        d0(chip, z);
        Chip chip2 = this.G1;
        if (i == 10) {
            z2 = true;
        }
        d0(chip2, z2);
    }

    public final void a0() {
        Chip chip = this.F1;
        int i = C7025iN1.h.selection_type;
        chip.setTag(i, 12);
        this.G1.setTag(i, 10);
        this.F1.setOnClickListener(this.K1);
        this.G1.setOnClickListener(this.K1);
        this.F1.setAccessibilityClassName("android.view.View");
        this.G1.setAccessibilityClassName("android.view.View");
    }

    @Override // o.InterfaceC4249So2
    @SuppressLint({"DefaultLocale"})
    public void b(int i, int i2, int i3) {
        int i4;
        if (i == 1) {
            i4 = C7025iN1.h.material_clock_period_pm_button;
        } else {
            i4 = C7025iN1.h.material_clock_period_am_button;
        }
        this.J1.r(i4);
        Locale locale = getResources().getConfiguration().locale;
        String format = String.format(locale, C3858Oo2.c1, Integer.valueOf(i3));
        String format2 = String.format(locale, C3858Oo2.c1, Integer.valueOf(i2));
        if (!TextUtils.equals(this.F1.getText(), format)) {
            this.F1.setText(format);
        }
        if (!TextUtils.equals(this.G1.getText(), format2)) {
            this.G1.setText(format2);
        }
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public final void b0() {
        c cVar = new c(new GestureDetector(getContext(), new b()));
        this.F1.setOnTouchListener(cVar);
        this.G1.setOnTouchListener(cVar);
    }

    @Override // o.InterfaceC4249So2
    public void c(String[] strArr, @InterfaceC3329Je2 int i) {
        this.I1.c(strArr, i);
    }

    public void c0() {
        this.J1.setVisibility(0);
    }

    public final void d0(Chip chip, boolean z) {
        int i;
        chip.setChecked(z);
        if (z) {
            i = 2;
        } else {
            i = 0;
        }
        chip.setAccessibilityLiveRegion(i);
    }

    @Override // o.InterfaceC4249So2
    public void e(float f2) {
        this.H1.q(f2);
    }

    @Override // android.view.View
    public void onVisibilityChanged(@InterfaceC5670cr1 View view, int i) {
        super.onVisibilityChanged(view, i);
        if (view == this && i == 0) {
            this.G1.sendAccessibilityEvent(8);
        }
    }

    public TimePickerView(Context context, @InterfaceC11300zs1 AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TimePickerView(Context context, @InterfaceC11300zs1 AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.K1 = new a();
        LayoutInflater.from(context).inflate(C7025iN1.k.material_timepicker, this);
        this.I1 = (ClockFaceView) findViewById(C7025iN1.h.material_clock_face);
        MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) findViewById(C7025iN1.h.material_clock_period_toggle);
        this.J1 = materialButtonToggleGroup;
        materialButtonToggleGroup.q(new MaterialButtonToggleGroup.b() { // from class: com.google.android.material.timepicker.f
            @Override // com.google.android.material.button.MaterialButtonToggleGroup.b
            public final void a(MaterialButtonToggleGroup materialButtonToggleGroup2, int i2, boolean z) {
                TimePickerView.M(TimePickerView.this, materialButtonToggleGroup2, i2, z);
            }
        });
        this.F1 = (Chip) findViewById(C7025iN1.h.material_minute_tv);
        this.G1 = (Chip) findViewById(C7025iN1.h.material_hour_tv);
        this.H1 = (ClockHandView) findViewById(C7025iN1.h.material_clock_hand);
        b0();
        a0();
    }
}
