package com.google.android.material.datepicker;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.datepicker.a;
import com.google.android.material.internal.CheckableImageButton;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.text.SimpleDateFormat;
import java.util.Iterator;
import java.util.LinkedHashSet;
import o.AbstractC10236vV;
import o.AbstractC6912hv1;
import o.C10920yI2;
import o.C11125z90;
import o.C11143zD2;
import o.C3220Ic;
import o.C3548Lk1;
import o.C4377Tx1;
import o.C4394Uc1;
import o.C6099ed1;
import o.C6516gH2;
import o.C7025iN1;
import o.C7954m82;
import o.C9246rQ0;
import o.DialogInterface$OnCancelListenerC6458g30;
import o.HT1;
import o.InterfaceC10336vu1;
import o.InterfaceC11300zs1;
import o.InterfaceC3329Je2;
import o.InterfaceC4100Rc1;
import o.InterfaceC4698Xf2;
import o.InterfaceC5056aJ2;
import o.InterfaceC5670cr1;
import o.InterfaceC6181ey;
import o.InterfaceC9015qV;
import o.KZ0;
import o.RL2;
import o.RN1;
import o.VC1;
import o.View$OnTouchListenerC8997qQ0;
import o.X81;

/* loaded from: classes3.dex */
public class g<S> extends DialogInterface$OnCancelListenerC6458g30 {
    public static final String A3 = "INPUT_MODE_KEY";
    public static final Object B3 = "CONFIRM_BUTTON_TAG";
    public static final Object C3 = "CANCEL_BUTTON_TAG";
    public static final Object D3 = "TOGGLE_BUTTON_TAG";
    public static final int E3 = 0;
    public static final int F3 = 1;
    public static final String m3 = "OVERRIDE_THEME_RES_ID";
    public static final String n3 = "DATE_SELECTOR_KEY";
    public static final String o3 = "CALENDAR_CONSTRAINTS_KEY";
    public static final String p3 = "DAY_VIEW_DECORATOR_KEY";
    public static final String q3 = "TITLE_TEXT_RES_ID_KEY";
    public static final String r3 = "TITLE_TEXT_KEY";
    public static final String s3 = "POSITIVE_BUTTON_TEXT_RES_ID_KEY";
    public static final String t3 = "POSITIVE_BUTTON_TEXT_KEY";
    public static final String u3 = "POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY";
    public static final String v3 = "POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY";
    public static final String w3 = "NEGATIVE_BUTTON_TEXT_RES_ID_KEY";
    public static final String x3 = "NEGATIVE_BUTTON_TEXT_KEY";
    public static final String y3 = "NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY";
    public static final String z3 = "NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY";
    public final LinkedHashSet<InterfaceC4100Rc1<? super S>> I2 = new LinkedHashSet<>();
    public final LinkedHashSet<View.OnClickListener> J2 = new LinkedHashSet<>();
    public final LinkedHashSet<DialogInterface.OnCancelListener> K2 = new LinkedHashSet<>();
    public final LinkedHashSet<DialogInterface.OnDismissListener> L2 = new LinkedHashSet<>();
    @InterfaceC4698Xf2
    public int M2;
    @InterfaceC11300zs1
    public InterfaceC9015qV<S> N2;
    public VC1<S> O2;
    @InterfaceC11300zs1
    public com.google.android.material.datepicker.a P2;
    @InterfaceC11300zs1
    public AbstractC10236vV Q2;
    public f<S> R2;
    @InterfaceC3329Je2
    public int S2;
    public CharSequence T2;
    public boolean U2;
    public int V2;
    @InterfaceC3329Je2
    public int W2;
    public CharSequence X2;
    @InterfaceC3329Je2
    public int Y2;
    public CharSequence Z2;
    @InterfaceC3329Je2
    public int a3;
    public CharSequence b3;
    @InterfaceC3329Je2
    public int c3;
    public CharSequence d3;
    public TextView e3;
    public TextView f3;
    public CheckableImageButton g3;
    @InterfaceC11300zs1
    public C4394Uc1 h3;
    public Button i3;
    public boolean j3;
    @InterfaceC11300zs1
    public CharSequence k3;
    @InterfaceC11300zs1
    public CharSequence l3;

    /* loaded from: classes3.dex */
    public class a implements InterfaceC10336vu1 {
        public final /* synthetic */ int a;
        public final /* synthetic */ View b;
        public final /* synthetic */ int c;
        public final /* synthetic */ int d;
        public final /* synthetic */ int e;

        public a(int i, View view, int i2, int i3, int i4) {
            this.a = i;
            this.b = view;
            this.c = i2;
            this.d = i3;
            this.e = i4;
        }

        @Override // o.InterfaceC10336vu1
        public RL2 a(View view, RL2 rl2) {
            C9246rQ0 f = rl2.f(RL2.p.i());
            if (this.a >= 0) {
                this.b.getLayoutParams().height = this.a + f.b;
                View view2 = this.b;
                view2.setLayoutParams(view2.getLayoutParams());
            }
            View view3 = this.b;
            view3.setPadding(this.c + f.a, this.d + f.b, this.e + f.c, view3.getPaddingBottom());
            return rl2;
        }
    }

    /* loaded from: classes3.dex */
    public class b extends AbstractC6912hv1<S> {
        public b() {
        }

        @Override // o.AbstractC6912hv1
        public void a() {
            g.this.i3.setEnabled(false);
        }

        @Override // o.AbstractC6912hv1
        public void b(S s) {
            g gVar = g.this;
            gVar.O3(gVar.u3());
            g.this.i3.setEnabled(g.this.r3().p0());
        }
    }

    /* loaded from: classes3.dex */
    public static final class c<S> {
        public final InterfaceC9015qV<S> a;
        public com.google.android.material.datepicker.a c;
        @InterfaceC11300zs1
        public AbstractC10236vV d;
        public int b = 0;
        public int e = 0;
        public CharSequence f = null;
        public int g = 0;
        public CharSequence h = null;
        public int i = 0;
        public CharSequence j = null;
        public int k = 0;
        public CharSequence l = null;
        public int m = 0;
        public CharSequence n = null;
        @InterfaceC11300zs1

        /* renamed from: o  reason: collision with root package name */
        public S f320o = null;
        public int p = 0;

        public c(InterfaceC9015qV<S> interfaceC9015qV) {
            this.a = interfaceC9015qV;
        }

        @HT1({HT1.a.Y})
        @InterfaceC5670cr1
        public static <S> c<S> c(@InterfaceC5670cr1 InterfaceC9015qV<S> interfaceC9015qV) {
            return new c<>(interfaceC9015qV);
        }

        @InterfaceC5670cr1
        public static c<Long> d() {
            return new c<>(new C7954m82());
        }

        @InterfaceC5670cr1
        public static c<C4377Tx1<Long, Long>> e() {
            return new c<>(new RN1());
        }

        public static boolean f(C3548Lk1 c3548Lk1, com.google.android.material.datepicker.a aVar) {
            if (c3548Lk1.compareTo(aVar.s()) >= 0 && c3548Lk1.compareTo(aVar.h()) <= 0) {
                return true;
            }
            return false;
        }

        @InterfaceC5670cr1
        public g<S> a() {
            if (this.c == null) {
                this.c = new a.b().a();
            }
            if (this.e == 0) {
                this.e = this.a.p();
            }
            S s = this.f320o;
            if (s != null) {
                this.a.b0(s);
            }
            if (this.c.o() == null) {
                this.c.w(b());
            }
            return g.D3(this);
        }

        public final C3548Lk1 b() {
            if (!this.a.r0().isEmpty()) {
                C3548Lk1 h = C3548Lk1.h(this.a.r0().iterator().next().longValue());
                if (f(h, this.c)) {
                    return h;
                }
            }
            C3548Lk1 m = C3548Lk1.m();
            if (f(m, this.c)) {
                return m;
            }
            return this.c.s();
        }

        @InterfaceC6181ey
        @InterfaceC5670cr1
        public c<S> g(com.google.android.material.datepicker.a aVar) {
            this.c = aVar;
            return this;
        }

        @InterfaceC6181ey
        @InterfaceC5670cr1
        public c<S> h(@InterfaceC11300zs1 AbstractC10236vV abstractC10236vV) {
            this.d = abstractC10236vV;
            return this;
        }

        @InterfaceC6181ey
        @InterfaceC5670cr1
        public c<S> i(int i) {
            this.p = i;
            return this;
        }

        @InterfaceC6181ey
        @InterfaceC5670cr1
        public c<S> j(@InterfaceC3329Je2 int i) {
            this.m = i;
            this.n = null;
            return this;
        }

        @InterfaceC6181ey
        @InterfaceC5670cr1
        public c<S> k(@InterfaceC11300zs1 CharSequence charSequence) {
            this.n = charSequence;
            this.m = 0;
            return this;
        }

        @InterfaceC6181ey
        @InterfaceC5670cr1
        public c<S> l(@InterfaceC3329Je2 int i) {
            this.k = i;
            this.l = null;
            return this;
        }

        @InterfaceC6181ey
        @InterfaceC5670cr1
        public c<S> m(@InterfaceC11300zs1 CharSequence charSequence) {
            this.l = charSequence;
            this.k = 0;
            return this;
        }

        @InterfaceC6181ey
        @InterfaceC5670cr1
        public c<S> n(@InterfaceC3329Je2 int i) {
            this.i = i;
            this.j = null;
            return this;
        }

        @InterfaceC6181ey
        @InterfaceC5670cr1
        public c<S> o(@InterfaceC11300zs1 CharSequence charSequence) {
            this.j = charSequence;
            this.i = 0;
            return this;
        }

        @InterfaceC6181ey
        @InterfaceC5670cr1
        public c<S> p(@InterfaceC3329Je2 int i) {
            this.g = i;
            this.h = null;
            return this;
        }

        @InterfaceC6181ey
        @InterfaceC5670cr1
        public c<S> q(@InterfaceC11300zs1 CharSequence charSequence) {
            this.h = charSequence;
            this.g = 0;
            return this;
        }

        @InterfaceC6181ey
        @InterfaceC5670cr1
        public c<S> r(S s) {
            this.f320o = s;
            return this;
        }

        @InterfaceC6181ey
        @InterfaceC5670cr1
        public c<S> s(@InterfaceC11300zs1 SimpleDateFormat simpleDateFormat) {
            this.a.n0(simpleDateFormat);
            return this;
        }

        @InterfaceC6181ey
        @InterfaceC5670cr1
        public c<S> t(@InterfaceC4698Xf2 int i) {
            this.b = i;
            return this;
        }

        @InterfaceC6181ey
        @InterfaceC5670cr1
        public c<S> u(@InterfaceC3329Je2 int i) {
            this.e = i;
            this.f = null;
            return this;
        }

        @InterfaceC6181ey
        @InterfaceC5670cr1
        public c<S> v(@InterfaceC11300zs1 CharSequence charSequence) {
            this.f = charSequence;
            this.e = 0;
            return this;
        }
    }

    @HT1({HT1.a.Y})
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes3.dex */
    public @interface d {
    }

    public static boolean A3(@InterfaceC5670cr1 Context context) {
        return G3(context, 16843277);
    }

    public static boolean C3(@InterfaceC5670cr1 Context context) {
        return G3(context, C7025iN1.c.nestedScrollable);
    }

    @InterfaceC5670cr1
    public static <S> g<S> D3(@InterfaceC5670cr1 c<S> cVar) {
        g<S> gVar = new g<>();
        Bundle bundle = new Bundle();
        bundle.putInt(m3, cVar.b);
        bundle.putParcelable("DATE_SELECTOR_KEY", cVar.a);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", cVar.c);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", cVar.d);
        bundle.putInt(q3, cVar.e);
        bundle.putCharSequence(r3, cVar.f);
        bundle.putInt(A3, cVar.p);
        bundle.putInt(s3, cVar.g);
        bundle.putCharSequence(t3, cVar.h);
        bundle.putInt(u3, cVar.i);
        bundle.putCharSequence(v3, cVar.j);
        bundle.putInt(w3, cVar.k);
        bundle.putCharSequence(x3, cVar.l);
        bundle.putInt(y3, cVar.m);
        bundle.putCharSequence(z3, cVar.n);
        gVar.f2(bundle);
        return gVar;
    }

    public static boolean G3(@InterfaceC5670cr1 Context context, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(X81.g(context, C7025iN1.c.materialCalendarStyle, f.class.getCanonicalName()), new int[]{i});
        boolean z = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        return z;
    }

    public static long M3() {
        return C3548Lk1.m().a1;
    }

    public static long N3() {
        return C11143zD2.v().getTimeInMillis();
    }

    public static /* synthetic */ void e3(g gVar, View view) {
        gVar.i3.setEnabled(gVar.r3().p0());
        gVar.g3.toggle();
        int i = 1;
        if (gVar.V2 == 1) {
            i = 0;
        }
        gVar.V2 = i;
        gVar.Q3(gVar.g3);
        gVar.L3();
    }

    @InterfaceC5670cr1
    public static Drawable p3(Context context) {
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{16842912}, C3220Ic.b(context, C7025iN1.g.material_ic_calendar_black_24dp));
        stateListDrawable.addState(new int[0], C3220Ic.b(context, C7025iN1.g.material_ic_edit_black_24dp));
        return stateListDrawable;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public InterfaceC9015qV<S> r3() {
        if (this.N2 == null) {
            this.N2 = (InterfaceC9015qV) s().getParcelable("DATE_SELECTOR_KEY");
        }
        return this.N2;
    }

    @InterfaceC11300zs1
    public static CharSequence s3(@InterfaceC11300zs1 CharSequence charSequence) {
        if (charSequence != null) {
            String[] split = TextUtils.split(String.valueOf(charSequence), "\n");
            if (split.length > 1) {
                return split[0];
            }
            return charSequence;
        }
        return null;
    }

    public static int w3(@InterfaceC5670cr1 Context context) {
        Resources resources = context.getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(C7025iN1.f.mtrl_calendar_content_padding);
        int i = C3548Lk1.m().Y0;
        return (dimensionPixelOffset * 2) + (resources.getDimensionPixelSize(C7025iN1.f.mtrl_calendar_day_width) * i) + ((i - 1) * resources.getDimensionPixelOffset(C7025iN1.f.mtrl_calendar_month_horizontal_padding));
    }

    public final boolean B3() {
        if (Y().getConfiguration().orientation == 2) {
            return true;
        }
        return false;
    }

    public void E3(@InterfaceC5670cr1 View view) {
        Iterator<View.OnClickListener> it = this.J2.iterator();
        while (it.hasNext()) {
            it.next().onClick(view);
        }
        J2();
    }

    public void F3(@InterfaceC5670cr1 View view) {
        Iterator<InterfaceC4100Rc1<? super S>> it = this.I2.iterator();
        while (it.hasNext()) {
            it.next().a(x3());
        }
        J2();
    }

    public boolean H3(DialogInterface.OnCancelListener onCancelListener) {
        return this.K2.remove(onCancelListener);
    }

    public boolean I3(DialogInterface.OnDismissListener onDismissListener) {
        return this.L2.remove(onDismissListener);
    }

    public boolean J3(View.OnClickListener onClickListener) {
        return this.J2.remove(onClickListener);
    }

    public boolean K3(InterfaceC4100Rc1<? super S> interfaceC4100Rc1) {
        return this.I2.remove(interfaceC4100Rc1);
    }

    public final void L3() {
        int y32 = y3(U1());
        f<S> c3 = f.c3(r3(), y32, this.P2, this.Q2);
        this.R2 = c3;
        KZ0 kz0 = c3;
        if (this.V2 == 1) {
            kz0 = C6099ed1.K2(r3(), y32, this.P2);
        }
        this.O2 = (VC1<S>) kz0;
        P3();
        O3(u3());
        androidx.fragment.app.j u = u().u();
        u.y(C7025iN1.h.mtrl_calendar_frame, this.O2);
        u.o();
        this.O2.G2(new b());
    }

    @Override // o.DialogInterface$OnCancelListenerC6458g30, androidx.fragment.app.Fragment
    public final void N0(@InterfaceC11300zs1 Bundle bundle) {
        super.N0(bundle);
        if (bundle == null) {
            bundle = s();
        }
        this.M2 = bundle.getInt(m3);
        this.N2 = (InterfaceC9015qV) bundle.getParcelable("DATE_SELECTOR_KEY");
        this.P2 = (com.google.android.material.datepicker.a) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.Q2 = (AbstractC10236vV) bundle.getParcelable("DAY_VIEW_DECORATOR_KEY");
        this.S2 = bundle.getInt(q3);
        this.T2 = bundle.getCharSequence(r3);
        this.V2 = bundle.getInt(A3);
        this.W2 = bundle.getInt(s3);
        this.X2 = bundle.getCharSequence(t3);
        this.Y2 = bundle.getInt(u3);
        this.Z2 = bundle.getCharSequence(v3);
        this.a3 = bundle.getInt(w3);
        this.b3 = bundle.getCharSequence(x3);
        this.c3 = bundle.getInt(y3);
        this.d3 = bundle.getCharSequence(z3);
        CharSequence charSequence = this.T2;
        if (charSequence == null) {
            charSequence = U1().getResources().getText(this.S2);
        }
        this.k3 = charSequence;
        this.l3 = s3(charSequence);
    }

    @InterfaceC5056aJ2
    public void O3(String str) {
        this.f3.setContentDescription(t3());
        this.f3.setText(str);
    }

    public final void P3() {
        CharSequence charSequence;
        TextView textView = this.e3;
        if (this.V2 == 1 && B3()) {
            charSequence = this.l3;
        } else {
            charSequence = this.k3;
        }
        textView.setText(charSequence);
    }

    public final void Q3(@InterfaceC5670cr1 CheckableImageButton checkableImageButton) {
        String string;
        if (this.V2 == 1) {
            string = checkableImageButton.getContext().getString(C7025iN1.m.mtrl_picker_toggle_to_calendar_input_mode);
        } else {
            string = checkableImageButton.getContext().getString(C7025iN1.m.mtrl_picker_toggle_to_text_input_mode);
        }
        this.g3.setContentDescription(string);
    }

    @Override // androidx.fragment.app.Fragment
    @InterfaceC5670cr1
    public final View R0(@InterfaceC5670cr1 LayoutInflater layoutInflater, @InterfaceC11300zs1 ViewGroup viewGroup, @InterfaceC11300zs1 Bundle bundle) {
        int i;
        if (this.U2) {
            i = C7025iN1.k.mtrl_picker_fullscreen;
        } else {
            i = C7025iN1.k.mtrl_picker_dialog;
        }
        View inflate = layoutInflater.inflate(i, viewGroup);
        Context context = inflate.getContext();
        AbstractC10236vV abstractC10236vV = this.Q2;
        if (abstractC10236vV != null) {
            abstractC10236vV.h(context);
        }
        if (this.U2) {
            inflate.findViewById(C7025iN1.h.mtrl_calendar_frame).setLayoutParams(new LinearLayout.LayoutParams(w3(context), -2));
        } else {
            inflate.findViewById(C7025iN1.h.mtrl_calendar_main_pane).setLayoutParams(new LinearLayout.LayoutParams(w3(context), -1));
        }
        TextView textView = (TextView) inflate.findViewById(C7025iN1.h.mtrl_picker_header_selection_text);
        this.f3 = textView;
        textView.setAccessibilityLiveRegion(1);
        this.g3 = (CheckableImageButton) inflate.findViewById(C7025iN1.h.mtrl_picker_header_toggle);
        this.e3 = (TextView) inflate.findViewById(C7025iN1.h.mtrl_picker_title_text);
        z3(context);
        this.i3 = (Button) inflate.findViewById(C7025iN1.h.confirm_button);
        if (r3().p0()) {
            this.i3.setEnabled(true);
        } else {
            this.i3.setEnabled(false);
        }
        this.i3.setTag(B3);
        CharSequence charSequence = this.X2;
        if (charSequence != null) {
            this.i3.setText(charSequence);
        } else {
            int i2 = this.W2;
            if (i2 != 0) {
                this.i3.setText(i2);
            }
        }
        CharSequence charSequence2 = this.Z2;
        if (charSequence2 != null) {
            this.i3.setContentDescription(charSequence2);
        } else if (this.Y2 != 0) {
            this.i3.setContentDescription(v().getResources().getText(this.Y2));
        }
        this.i3.setOnClickListener(new View.OnClickListener() { // from class: o.w91
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                com.google.android.material.datepicker.g.this.F3(view);
            }
        });
        Button button = (Button) inflate.findViewById(C7025iN1.h.f767o);
        button.setTag(C3);
        CharSequence charSequence3 = this.b3;
        if (charSequence3 != null) {
            button.setText(charSequence3);
        } else {
            int i3 = this.a3;
            if (i3 != 0) {
                button.setText(i3);
            }
        }
        CharSequence charSequence4 = this.d3;
        if (charSequence4 != null) {
            button.setContentDescription(charSequence4);
        } else if (this.c3 != 0) {
            button.setContentDescription(v().getResources().getText(this.c3));
        }
        button.setOnClickListener(new View.OnClickListener() { // from class: o.x91
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                com.google.android.material.datepicker.g.this.E3(view);
            }
        });
        return inflate;
    }

    @Override // o.DialogInterface$OnCancelListenerC6458g30
    @InterfaceC5670cr1
    public final Dialog R2(@InterfaceC11300zs1 Bundle bundle) {
        Dialog dialog = new Dialog(U1(), y3(U1()));
        Context context = dialog.getContext();
        this.U2 = A3(context);
        int i = C7025iN1.c.materialCalendarStyle;
        int i2 = C7025iN1.n.Widget_MaterialComponents_MaterialCalendar;
        this.h3 = new C4394Uc1(context, null, i, i2);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, C7025iN1.o.W5, i, i2);
        int color = obtainStyledAttributes.getColor(C7025iN1.o.Y5, 0);
        obtainStyledAttributes.recycle();
        this.h3.i0(context);
        this.h3.y0(ColorStateList.valueOf(color));
        this.h3.x0(dialog.getWindow().getDecorView().getElevation());
        return dialog;
    }

    public boolean h3(DialogInterface.OnCancelListener onCancelListener) {
        return this.K2.add(onCancelListener);
    }

    public boolean i3(DialogInterface.OnDismissListener onDismissListener) {
        return this.L2.add(onDismissListener);
    }

    @Override // o.DialogInterface$OnCancelListenerC6458g30, androidx.fragment.app.Fragment
    public final void j1(@InterfaceC5670cr1 Bundle bundle) {
        C3548Lk1 X2;
        super.j1(bundle);
        bundle.putInt(m3, this.M2);
        bundle.putParcelable("DATE_SELECTOR_KEY", this.N2);
        a.b bVar = new a.b(this.P2);
        f<S> fVar = this.R2;
        if (fVar == null) {
            X2 = null;
        } else {
            X2 = fVar.X2();
        }
        if (X2 != null) {
            bVar.d(X2.a1);
        }
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", bVar.a());
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", this.Q2);
        bundle.putInt(q3, this.S2);
        bundle.putCharSequence(r3, this.T2);
        bundle.putInt(A3, this.V2);
        bundle.putInt(s3, this.W2);
        bundle.putCharSequence(t3, this.X2);
        bundle.putInt(u3, this.Y2);
        bundle.putCharSequence(v3, this.Z2);
        bundle.putInt(w3, this.a3);
        bundle.putCharSequence(x3, this.b3);
        bundle.putInt(y3, this.c3);
        bundle.putCharSequence(z3, this.d3);
    }

    public boolean j3(View.OnClickListener onClickListener) {
        return this.J2.add(onClickListener);
    }

    @Override // o.DialogInterface$OnCancelListenerC6458g30, androidx.fragment.app.Fragment
    public void k1() {
        super.k1();
        Window window = W2().getWindow();
        if (this.U2) {
            window.setLayout(-1, -1);
            window.setBackgroundDrawable(this.h3);
            q3(window);
        } else {
            window.setLayout(-2, -2);
            int dimensionPixelOffset = Y().getDimensionPixelOffset(C7025iN1.f.mtrl_calendar_dialog_background_inset);
            Rect rect = new Rect(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
            window.setBackgroundDrawable(new InsetDrawable((Drawable) this.h3, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset));
            window.getDecorView().setOnTouchListener(new View$OnTouchListenerC8997qQ0(W2(), rect));
        }
        L3();
    }

    public boolean k3(InterfaceC4100Rc1<? super S> interfaceC4100Rc1) {
        return this.I2.add(interfaceC4100Rc1);
    }

    @Override // o.DialogInterface$OnCancelListenerC6458g30, androidx.fragment.app.Fragment
    public void l1() {
        this.O2.H2();
        super.l1();
    }

    public void l3() {
        this.K2.clear();
    }

    public void m3() {
        this.L2.clear();
    }

    public void n3() {
        this.J2.clear();
    }

    public void o3() {
        this.I2.clear();
    }

    @Override // o.DialogInterface$OnCancelListenerC6458g30, android.content.DialogInterface.OnCancelListener
    public final void onCancel(@InterfaceC5670cr1 DialogInterface dialogInterface) {
        Iterator<DialogInterface.OnCancelListener> it = this.K2.iterator();
        while (it.hasNext()) {
            it.next().onCancel(dialogInterface);
        }
        super.onCancel(dialogInterface);
    }

    @Override // o.DialogInterface$OnCancelListenerC6458g30, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(@InterfaceC5670cr1 DialogInterface dialogInterface) {
        Iterator<DialogInterface.OnDismissListener> it = this.L2.iterator();
        while (it.hasNext()) {
            it.next().onDismiss(dialogInterface);
        }
        ViewGroup viewGroup = (ViewGroup) n0();
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        super.onDismiss(dialogInterface);
    }

    public final void q3(Window window) {
        if (this.j3) {
            return;
        }
        View findViewById = Y1().findViewById(C7025iN1.h.fullscreen_header);
        C11125z90.b(window, true, C10920yI2.j(findViewById), null);
        int paddingTop = findViewById.getPaddingTop();
        C6516gH2.l2(findViewById, new a(findViewById.getLayoutParams().height, findViewById, findViewById.getPaddingLeft(), paddingTop, findViewById.getPaddingRight()));
        this.j3 = true;
    }

    public final String t3() {
        return r3().G(U1());
    }

    public String u3() {
        return r3().U(v());
    }

    public int v3() {
        return this.V2;
    }

    @InterfaceC11300zs1
    public final S x3() {
        return r3().u0();
    }

    public final int y3(Context context) {
        int i = this.M2;
        if (i != 0) {
            return i;
        }
        return r3().H(context);
    }

    public final void z3(Context context) {
        boolean z;
        this.g3.setTag(D3);
        this.g3.setImageDrawable(p3(context));
        CheckableImageButton checkableImageButton = this.g3;
        if (this.V2 != 0) {
            z = true;
        } else {
            z = false;
        }
        checkableImageButton.setChecked(z);
        C6516gH2.I1(this.g3, null);
        Q3(this.g3);
        this.g3.setOnClickListener(new View.OnClickListener() { // from class: o.v91
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                com.google.android.material.datepicker.g.e3(com.google.android.material.datepicker.g.this, view);
            }
        });
    }
}
