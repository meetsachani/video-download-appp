package o;

import android.content.Context;
import android.content.res.ColorStateList;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import o.C10920yI2;
import o.C7025iN1;
import o.RL2;

/* loaded from: classes3.dex */
public class N40 extends FrameLayout {
    public static final String a1 = "N40";
    public static final int b1 = C7025iN1.n.Widget_Material3_DockedToolbar;
    public Boolean Y0;
    public Boolean Z0;

    /* loaded from: classes3.dex */
    public class a implements C10920yI2.e {
        public a() {
        }

        @Override // o.C10920yI2.e
        @InterfaceC5670cr1
        public RL2 a(View view, @InterfaceC5670cr1 RL2 rl2, @InterfaceC5670cr1 C10920yI2.f fVar) {
            int i;
            int i2;
            if (N40.this.Y0 != null && N40.this.Z0 != null && !N40.this.Y0.booleanValue() && !N40.this.Z0.booleanValue()) {
                return rl2;
            }
            C9246rQ0 f = rl2.f(RL2.p.i() | RL2.p.c() | RL2.p.d());
            int i3 = f.d;
            int i4 = f.b;
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (N40.this.d(layoutParams, 48) && N40.this.Y0 == null && N40.this.getFitsSystemWindows()) {
                i = i4;
            } else {
                i = 0;
            }
            if (N40.this.d(layoutParams, 80) && N40.this.Z0 == null && N40.this.getFitsSystemWindows()) {
                i2 = i3;
            } else {
                i2 = 0;
            }
            if (N40.this.Z0 != null) {
                if (!N40.this.Z0.booleanValue()) {
                    i3 = 0;
                }
                i2 = i3;
            }
            if (N40.this.Y0 != null) {
                if (!N40.this.Y0.booleanValue()) {
                    i4 = 0;
                }
                i = i4;
            }
            fVar.b += i;
            fVar.d += i2;
            fVar.a(view);
            return rl2;
        }
    }

    public N40(@InterfaceC5670cr1 Context context) {
        this(context, null);
    }

    public final boolean d(ViewGroup.LayoutParams layoutParams, int i) {
        if (layoutParams instanceof CoordinatorLayout.g) {
            if ((((CoordinatorLayout.g) layoutParams).c & i) == i) {
                return true;
            }
            return false;
        } else if ((layoutParams instanceof FrameLayout.LayoutParams) && (((FrameLayout.LayoutParams) layoutParams).gravity & i) == i) {
            return true;
        } else {
            return false;
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (View.MeasureSpec.getMode(i2) != 1073741824) {
            int childCount = getChildCount();
            int max = Math.max(getMeasuredHeight(), getSuggestedMinimumHeight() + getPaddingTop() + getPaddingBottom());
            for (int i3 = 0; i3 < childCount; i3++) {
                measureChild(getChildAt(i3), i, View.MeasureSpec.makeMeasureSpec(max, 1073741824));
            }
            setMeasuredDimension(getMeasuredWidth(), max);
        }
    }

    public N40(@InterfaceC5670cr1 Context context, @InterfaceC11300zs1 AttributeSet attributeSet) {
        this(context, attributeSet, C7025iN1.c.dockedToolbarStyle);
    }

    public N40(@InterfaceC5670cr1 Context context, @InterfaceC11300zs1 AttributeSet attributeSet, @InterfaceC8568og int i) {
        this(context, attributeSet, i, b1);
    }

    public N40(@InterfaceC5670cr1 Context context, @InterfaceC11300zs1 AttributeSet attributeSet, @InterfaceC8568og int i, @InterfaceC4698Xf2 int i2) {
        super(C6597gd1.d(context, attributeSet, i, i2), attributeSet, i);
        Context context2 = getContext();
        C2872Ep2 l = C7608kn2.l(context2, attributeSet, C7025iN1.o.u3, i, i2, new int[0]);
        int i3 = C7025iN1.o.v3;
        if (l.C(i3)) {
            int c = l.c(i3, 0);
            C4394Uc1 c4394Uc1 = new C4394Uc1(O22.e(context2, attributeSet, i, i2).m());
            c4394Uc1.y0(ColorStateList.valueOf(c));
            setBackground(c4394Uc1);
        }
        int i4 = C7025iN1.o.x3;
        if (l.C(i4)) {
            this.Y0 = Boolean.valueOf(l.a(i4, true));
        }
        int i5 = C7025iN1.o.w3;
        if (l.C(i5)) {
            this.Z0 = Boolean.valueOf(l.a(i5, true));
        }
        C10920yI2.h(this, new a());
        setImportantForAccessibility(1);
        l.I();
    }
}
