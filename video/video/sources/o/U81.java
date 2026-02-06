package o;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.TypedValue;
import android.view.View;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import androidx.appcompat.app.a;
import o.C7025iN1;
import o.OL1;

/* loaded from: classes3.dex */
public class U81 extends a.C0006a {
    @InterfaceC8568og
    public static final int e = OL1.b.M;
    @InterfaceC4698Xf2
    public static final int f = C7025iN1.n.MaterialAlertDialog_MaterialComponents;
    @InterfaceC8568og
    public static final int g = C7025iN1.c.materialAlertDialogTheme;
    @InterfaceC11300zs1
    public Drawable c;
    @InterfaceC5670cr1
    public final Rect d;

    public U81(@InterfaceC5670cr1 Context context) {
        this(context, 0);
    }

    public static Context J(@InterfaceC5670cr1 Context context) {
        int L = L(context);
        Context d = C6597gd1.d(context, null, e, f);
        if (L == 0) {
            return d;
        }
        return new BM(d, L);
    }

    public static int L(@InterfaceC5670cr1 Context context) {
        TypedValue a = X81.a(context, g);
        if (a == null) {
            return 0;
        }
        return a.data;
    }

    public static int M(@InterfaceC5670cr1 Context context, int i) {
        if (i == 0) {
            return L(context);
        }
        return i;
    }

    @Override // androidx.appcompat.app.a.C0006a
    @InterfaceC6181ey
    @InterfaceC5670cr1
    /* renamed from: A0 */
    public U81 setView(@InterfaceC11300zs1 View view) {
        return (U81) super.setView(view);
    }

    @InterfaceC11300zs1
    public Drawable K() {
        return this.c;
    }

    @Override // androidx.appcompat.app.a.C0006a
    @InterfaceC6181ey
    @InterfaceC5670cr1
    /* renamed from: N */
    public U81 a(@InterfaceC11300zs1 ListAdapter listAdapter, @InterfaceC11300zs1 DialogInterface.OnClickListener onClickListener) {
        return (U81) super.a(listAdapter, onClickListener);
    }

    @InterfaceC6181ey
    @InterfaceC5670cr1
    public U81 O(@InterfaceC11300zs1 Drawable drawable) {
        this.c = drawable;
        return this;
    }

    @InterfaceC6181ey
    @InterfaceC5670cr1
    public U81 P(@PK1 int i) {
        this.d.bottom = i;
        return this;
    }

    @InterfaceC6181ey
    @InterfaceC5670cr1
    public U81 Q(@PK1 int i) {
        if (getContext().getResources().getConfiguration().getLayoutDirection() == 1) {
            this.d.left = i;
            return this;
        }
        this.d.right = i;
        return this;
    }

    @InterfaceC6181ey
    @InterfaceC5670cr1
    public U81 R(@PK1 int i) {
        if (getContext().getResources().getConfiguration().getLayoutDirection() == 1) {
            this.d.right = i;
            return this;
        }
        this.d.left = i;
        return this;
    }

    @InterfaceC6181ey
    @InterfaceC5670cr1
    public U81 S(@PK1 int i) {
        this.d.top = i;
        return this;
    }

    @Override // androidx.appcompat.app.a.C0006a
    @InterfaceC6181ey
    @InterfaceC5670cr1
    /* renamed from: T */
    public U81 b(boolean z) {
        return (U81) super.b(z);
    }

    @Override // androidx.appcompat.app.a.C0006a
    @InterfaceC6181ey
    @InterfaceC5670cr1
    /* renamed from: U */
    public U81 c(@InterfaceC11300zs1 Cursor cursor, @InterfaceC11300zs1 DialogInterface.OnClickListener onClickListener, @InterfaceC5670cr1 String str) {
        return (U81) super.c(cursor, onClickListener, str);
    }

    @Override // androidx.appcompat.app.a.C0006a
    @InterfaceC6181ey
    @InterfaceC5670cr1
    /* renamed from: V */
    public U81 d(@InterfaceC11300zs1 View view) {
        return (U81) super.d(view);
    }

    @Override // androidx.appcompat.app.a.C0006a
    @InterfaceC6181ey
    @InterfaceC5670cr1
    /* renamed from: W */
    public U81 e(@K60 int i) {
        return (U81) super.e(i);
    }

    @Override // androidx.appcompat.app.a.C0006a
    @InterfaceC6181ey
    @InterfaceC5670cr1
    /* renamed from: X */
    public U81 f(@InterfaceC11300zs1 Drawable drawable) {
        return (U81) super.f(drawable);
    }

    @Override // androidx.appcompat.app.a.C0006a
    @InterfaceC6181ey
    @InterfaceC5670cr1
    /* renamed from: Y */
    public U81 g(@InterfaceC8568og int i) {
        return (U81) super.g(i);
    }

    @Override // androidx.appcompat.app.a.C0006a
    @InterfaceC6181ey
    @InterfaceC5670cr1
    /* renamed from: Z */
    public U81 i(@InterfaceC2934Fe int i, @InterfaceC11300zs1 DialogInterface.OnClickListener onClickListener) {
        return (U81) super.i(i, onClickListener);
    }

    @Override // androidx.appcompat.app.a.C0006a
    @InterfaceC6181ey
    @InterfaceC5670cr1
    /* renamed from: a0 */
    public U81 j(@InterfaceC11300zs1 CharSequence[] charSequenceArr, @InterfaceC11300zs1 DialogInterface.OnClickListener onClickListener) {
        return (U81) super.j(charSequenceArr, onClickListener);
    }

    @Override // androidx.appcompat.app.a.C0006a
    @InterfaceC6181ey
    @InterfaceC5670cr1
    /* renamed from: b0 */
    public U81 k(@InterfaceC3329Je2 int i) {
        return (U81) super.k(i);
    }

    @Override // androidx.appcompat.app.a.C0006a
    @InterfaceC6181ey
    @InterfaceC5670cr1
    /* renamed from: c0 */
    public U81 l(@InterfaceC11300zs1 CharSequence charSequence) {
        return (U81) super.l(charSequence);
    }

    @Override // androidx.appcompat.app.a.C0006a
    @InterfaceC5670cr1
    public androidx.appcompat.app.a create() {
        androidx.appcompat.app.a create = super.create();
        Window window = create.getWindow();
        View decorView = window.getDecorView();
        Drawable drawable = this.c;
        if (drawable instanceof C4394Uc1) {
            ((C4394Uc1) drawable).x0(decorView.getElevation());
        }
        window.setBackgroundDrawable(C10883y91.b(this.c, this.d));
        decorView.setOnTouchListener(new View$OnTouchListenerC8997qQ0(create, this.d));
        return create;
    }

    @Override // androidx.appcompat.app.a.C0006a
    @InterfaceC6181ey
    @InterfaceC5670cr1
    /* renamed from: d0 */
    public U81 m(@InterfaceC2934Fe int i, @InterfaceC11300zs1 boolean[] zArr, @InterfaceC11300zs1 DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
        return (U81) super.m(i, zArr, onMultiChoiceClickListener);
    }

    @Override // androidx.appcompat.app.a.C0006a
    @InterfaceC6181ey
    @InterfaceC5670cr1
    /* renamed from: e0 */
    public U81 n(@InterfaceC11300zs1 Cursor cursor, @InterfaceC5670cr1 String str, @InterfaceC5670cr1 String str2, @InterfaceC11300zs1 DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
        return (U81) super.n(cursor, str, str2, onMultiChoiceClickListener);
    }

    @Override // androidx.appcompat.app.a.C0006a
    @InterfaceC6181ey
    @InterfaceC5670cr1
    /* renamed from: f0 */
    public U81 o(@InterfaceC11300zs1 CharSequence[] charSequenceArr, @InterfaceC11300zs1 boolean[] zArr, @InterfaceC11300zs1 DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
        return (U81) super.o(charSequenceArr, zArr, onMultiChoiceClickListener);
    }

    @Override // androidx.appcompat.app.a.C0006a
    @InterfaceC6181ey
    @InterfaceC5670cr1
    /* renamed from: g0 */
    public U81 setNegativeButton(@InterfaceC3329Je2 int i, @InterfaceC11300zs1 DialogInterface.OnClickListener onClickListener) {
        return (U81) super.setNegativeButton(i, onClickListener);
    }

    @Override // androidx.appcompat.app.a.C0006a
    @InterfaceC6181ey
    @InterfaceC5670cr1
    /* renamed from: h0 */
    public U81 p(@InterfaceC11300zs1 CharSequence charSequence, @InterfaceC11300zs1 DialogInterface.OnClickListener onClickListener) {
        return (U81) super.p(charSequence, onClickListener);
    }

    @Override // androidx.appcompat.app.a.C0006a
    @InterfaceC6181ey
    @InterfaceC5670cr1
    /* renamed from: i0 */
    public U81 q(@InterfaceC11300zs1 Drawable drawable) {
        return (U81) super.q(drawable);
    }

    @Override // androidx.appcompat.app.a.C0006a
    @InterfaceC6181ey
    @InterfaceC5670cr1
    /* renamed from: j0 */
    public U81 r(@InterfaceC3329Je2 int i, @InterfaceC11300zs1 DialogInterface.OnClickListener onClickListener) {
        return (U81) super.r(i, onClickListener);
    }

    @Override // androidx.appcompat.app.a.C0006a
    @InterfaceC6181ey
    @InterfaceC5670cr1
    /* renamed from: k0 */
    public U81 s(@InterfaceC11300zs1 CharSequence charSequence, @InterfaceC11300zs1 DialogInterface.OnClickListener onClickListener) {
        return (U81) super.s(charSequence, onClickListener);
    }

    @Override // androidx.appcompat.app.a.C0006a
    @InterfaceC6181ey
    @InterfaceC5670cr1
    /* renamed from: l0 */
    public U81 t(@InterfaceC11300zs1 Drawable drawable) {
        return (U81) super.t(drawable);
    }

    @Override // androidx.appcompat.app.a.C0006a
    @InterfaceC6181ey
    @InterfaceC5670cr1
    /* renamed from: m0 */
    public U81 u(@InterfaceC11300zs1 DialogInterface.OnCancelListener onCancelListener) {
        return (U81) super.u(onCancelListener);
    }

    @Override // androidx.appcompat.app.a.C0006a
    @InterfaceC6181ey
    @InterfaceC5670cr1
    /* renamed from: n0 */
    public U81 v(@InterfaceC11300zs1 DialogInterface.OnDismissListener onDismissListener) {
        return (U81) super.v(onDismissListener);
    }

    @Override // androidx.appcompat.app.a.C0006a
    @InterfaceC6181ey
    @InterfaceC5670cr1
    /* renamed from: o0 */
    public U81 w(@InterfaceC11300zs1 AdapterView.OnItemSelectedListener onItemSelectedListener) {
        return (U81) super.w(onItemSelectedListener);
    }

    @Override // androidx.appcompat.app.a.C0006a
    @InterfaceC6181ey
    @InterfaceC5670cr1
    /* renamed from: p0 */
    public U81 x(@InterfaceC11300zs1 DialogInterface.OnKeyListener onKeyListener) {
        return (U81) super.x(onKeyListener);
    }

    @Override // androidx.appcompat.app.a.C0006a
    @InterfaceC6181ey
    @InterfaceC5670cr1
    /* renamed from: q0 */
    public U81 setPositiveButton(@InterfaceC3329Je2 int i, @InterfaceC11300zs1 DialogInterface.OnClickListener onClickListener) {
        return (U81) super.setPositiveButton(i, onClickListener);
    }

    @Override // androidx.appcompat.app.a.C0006a
    @InterfaceC6181ey
    @InterfaceC5670cr1
    /* renamed from: r0 */
    public U81 y(@InterfaceC11300zs1 CharSequence charSequence, @InterfaceC11300zs1 DialogInterface.OnClickListener onClickListener) {
        return (U81) super.y(charSequence, onClickListener);
    }

    @Override // androidx.appcompat.app.a.C0006a
    @InterfaceC6181ey
    @InterfaceC5670cr1
    /* renamed from: s0 */
    public U81 z(@InterfaceC11300zs1 Drawable drawable) {
        return (U81) super.z(drawable);
    }

    @Override // androidx.appcompat.app.a.C0006a
    @InterfaceC6181ey
    @InterfaceC5670cr1
    /* renamed from: t0 */
    public U81 B(@InterfaceC2934Fe int i, int i2, @InterfaceC11300zs1 DialogInterface.OnClickListener onClickListener) {
        return (U81) super.B(i, i2, onClickListener);
    }

    @Override // androidx.appcompat.app.a.C0006a
    @InterfaceC6181ey
    @InterfaceC5670cr1
    /* renamed from: u0 */
    public U81 C(@InterfaceC11300zs1 Cursor cursor, int i, @InterfaceC5670cr1 String str, @InterfaceC11300zs1 DialogInterface.OnClickListener onClickListener) {
        return (U81) super.C(cursor, i, str, onClickListener);
    }

    @Override // androidx.appcompat.app.a.C0006a
    @InterfaceC6181ey
    @InterfaceC5670cr1
    /* renamed from: v0 */
    public U81 D(@InterfaceC11300zs1 ListAdapter listAdapter, int i, @InterfaceC11300zs1 DialogInterface.OnClickListener onClickListener) {
        return (U81) super.D(listAdapter, i, onClickListener);
    }

    @Override // androidx.appcompat.app.a.C0006a
    @InterfaceC6181ey
    @InterfaceC5670cr1
    /* renamed from: w0 */
    public U81 E(@InterfaceC11300zs1 CharSequence[] charSequenceArr, int i, @InterfaceC11300zs1 DialogInterface.OnClickListener onClickListener) {
        return (U81) super.E(charSequenceArr, i, onClickListener);
    }

    @Override // androidx.appcompat.app.a.C0006a
    @InterfaceC6181ey
    @InterfaceC5670cr1
    /* renamed from: x0 */
    public U81 F(@InterfaceC3329Je2 int i) {
        return (U81) super.F(i);
    }

    @Override // androidx.appcompat.app.a.C0006a
    @InterfaceC6181ey
    @InterfaceC5670cr1
    /* renamed from: y0 */
    public U81 setTitle(@InterfaceC11300zs1 CharSequence charSequence) {
        return (U81) super.setTitle(charSequence);
    }

    @Override // androidx.appcompat.app.a.C0006a
    @InterfaceC6181ey
    @InterfaceC5670cr1
    /* renamed from: z0 */
    public U81 G(int i) {
        return (U81) super.G(i);
    }

    public U81(@InterfaceC5670cr1 Context context, int i) {
        super(J(context), M(context, i));
        Context context2 = getContext();
        Resources.Theme theme = context2.getTheme();
        int i2 = e;
        int i3 = f;
        this.d = C10883y91.a(context2, i2, i3);
        int c = C9179r91.c(context2, C7025iN1.c.colorSurface, getClass().getCanonicalName());
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(null, C7025iN1.o.M4, i2, i3);
        int color = obtainStyledAttributes.getColor(C7025iN1.o.R4, c);
        obtainStyledAttributes.recycle();
        C4394Uc1 c4394Uc1 = new C4394Uc1(context2, null, i2, i3);
        c4394Uc1.i0(context2);
        c4394Uc1.y0(ColorStateList.valueOf(color));
        if (Build.VERSION.SDK_INT >= 28) {
            TypedValue typedValue = new TypedValue();
            theme.resolveAttribute(16844145, typedValue, true);
            float dimension = typedValue.getDimension(getContext().getResources().getDisplayMetrics());
            if (typedValue.type == 5 && dimension >= 0.0f) {
                c4394Uc1.t0(dimension);
            }
        }
        this.c = c4394Uc1;
    }
}
