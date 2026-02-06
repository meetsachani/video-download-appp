package o;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import o.C7025iN1;
import o.RL2;

/* renamed from: o.Kv0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C3492Kv0 extends FrameLayout {
    public static final String h1 = "Kv0";
    public static final int i1 = C7025iN1.n.Widget_Material3_FloatingToolbar;
    public boolean Y0;
    public boolean Z0;
    public boolean a1;
    public boolean b1;
    public Rect c1;
    public int d1;
    public int e1;
    public int f1;
    public int g1;

    /* renamed from: o.Kv0$a */
    /* loaded from: classes3.dex */
    public class a implements InterfaceC10336vu1 {
        public a() {
        }

        @Override // o.InterfaceC10336vu1
        @InterfaceC5670cr1
        public RL2 a(@InterfaceC5670cr1 View view, @InterfaceC5670cr1 RL2 rl2) {
            if (!C3492Kv0.this.Y0 && !C3492Kv0.this.a1 && !C3492Kv0.this.Z0 && !C3492Kv0.this.b1) {
                return rl2;
            }
            C9246rQ0 f = rl2.f(RL2.p.i() | RL2.p.c() | RL2.p.d());
            C3492Kv0.this.d1 = f.d;
            C3492Kv0.this.e1 = f.b;
            C3492Kv0.this.g1 = f.c;
            C3492Kv0.this.f1 = f.a;
            C3492Kv0.this.j();
            return rl2;
        }
    }

    public C3492Kv0(@InterfaceC5670cr1 Context context) {
        this(context, null);
    }

    public final void j() {
        int i;
        int i2;
        int i3;
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        Rect rect = this.c1;
        if (rect == null) {
            Log.w(h1, "Unable to update margins because original view margins are not set");
            return;
        }
        int i4 = rect.left;
        int i5 = 0;
        if (this.Y0) {
            i = this.f1;
        } else {
            i = 0;
        }
        int i6 = i4 + i;
        int i7 = rect.right;
        if (this.a1) {
            i2 = this.g1;
        } else {
            i2 = 0;
        }
        int i8 = i7 + i2;
        int i9 = rect.top;
        if (this.Z0) {
            i3 = this.e1;
        } else {
            i3 = 0;
        }
        int i10 = i9 + i3;
        int i11 = rect.bottom;
        if (this.b1) {
            i5 = this.d1;
        }
        int i12 = i11 + i5;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        if (marginLayoutParams.bottomMargin == i12 && marginLayoutParams.leftMargin == i6 && marginLayoutParams.rightMargin == i8 && marginLayoutParams.topMargin == i10) {
            return;
        }
        marginLayoutParams.bottomMargin = i12;
        marginLayoutParams.leftMargin = i6;
        marginLayoutParams.rightMargin = i8;
        marginLayoutParams.topMargin = i10;
        requestLayout();
    }

    @Override // android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        super.setLayoutParams(layoutParams);
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            this.c1 = new Rect(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
            j();
            return;
        }
        this.c1 = null;
    }

    public C3492Kv0(@InterfaceC5670cr1 Context context, @InterfaceC11300zs1 AttributeSet attributeSet) {
        this(context, attributeSet, C7025iN1.c.floatingToolbarStyle);
    }

    public C3492Kv0(@InterfaceC5670cr1 Context context, @InterfaceC11300zs1 AttributeSet attributeSet, @InterfaceC8568og int i) {
        this(context, attributeSet, i, i1);
    }

    public C3492Kv0(@InterfaceC5670cr1 Context context, @InterfaceC11300zs1 AttributeSet attributeSet, @InterfaceC8568og int i, @InterfaceC4698Xf2 int i2) {
        super(C6597gd1.d(context, attributeSet, i, i2), attributeSet, i);
        Context context2 = getContext();
        C2872Ep2 l = C7608kn2.l(context2, attributeSet, C7025iN1.o.d4, i, i2, new int[0]);
        int i3 = C7025iN1.o.e4;
        if (l.C(i3)) {
            int c = l.c(i3, 0);
            C4394Uc1 c4394Uc1 = new C4394Uc1(O22.e(context2, attributeSet, i, i2).m());
            c4394Uc1.y0(ColorStateList.valueOf(c));
            setBackground(c4394Uc1);
        }
        this.Y0 = l.a(C7025iN1.o.g4, true);
        this.Z0 = l.a(C7025iN1.o.i4, false);
        this.a1 = l.a(C7025iN1.o.h4, true);
        this.b1 = l.a(C7025iN1.o.f4, true);
        C6516gH2.l2(this, new a());
        l.I();
    }
}
