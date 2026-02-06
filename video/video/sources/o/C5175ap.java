package o;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import o.AbstractC4051Qo1;
import o.C10920yI2;
import o.C7025iN1;
import o.HT1;

/* renamed from: o.ap  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C5175ap extends AbstractC4051Qo1 {
    public static final int q1 = 6;

    /* renamed from: o.ap$a */
    /* loaded from: classes3.dex */
    public class a implements C10920yI2.e {
        public a() {
        }

        @Override // o.C10920yI2.e
        @InterfaceC5670cr1
        public RL2 a(View view, @InterfaceC5670cr1 RL2 rl2, @InterfaceC5670cr1 C10920yI2.f fVar) {
            int i;
            fVar.d += rl2.o();
            boolean z = true;
            if (view.getLayoutDirection() != 1) {
                z = false;
            }
            int p = rl2.p();
            int q = rl2.q();
            int i2 = fVar.a;
            if (z) {
                i = q;
            } else {
                i = p;
            }
            fVar.a = i2 + i;
            int i3 = fVar.c;
            if (!z) {
                p = q;
            }
            fVar.c = i3 + p;
            fVar.a(view);
            return rl2;
        }
    }

    @Deprecated
    /* renamed from: o.ap$b */
    /* loaded from: classes3.dex */
    public interface b extends AbstractC4051Qo1.e {
    }

    @Deprecated
    /* renamed from: o.ap$c */
    /* loaded from: classes3.dex */
    public interface c extends AbstractC4051Qo1.f {
    }

    public C5175ap(@InterfaceC5670cr1 Context context) {
        this(context, null);
    }

    @Override // o.AbstractC4051Qo1
    @HT1({HT1.a.Y})
    @InterfaceC5670cr1
    public AbstractC3661Mo1 c(@InterfaceC5670cr1 Context context) {
        return new C4935Zo(context);
    }

    @Override // o.AbstractC4051Qo1
    public int getMaxItemCount() {
        return 6;
    }

    public final void n() {
        C10920yI2.h(this, new a());
    }

    public boolean o() {
        return ((C4935Zo) getMenuView()).A();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, p(i2));
        if (View.MeasureSpec.getMode(i2) != 1073741824) {
            setMeasuredDimension(getMeasuredWidth(), Math.max(getMeasuredHeight(), getSuggestedMinimumHeight() + getPaddingTop() + getPaddingBottom()));
        }
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(@InterfaceC5670cr1 MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public final int p(int i) {
        int suggestedMinimumHeight = getSuggestedMinimumHeight();
        if (View.MeasureSpec.getMode(i) != 1073741824 && suggestedMinimumHeight > 0) {
            return View.MeasureSpec.makeMeasureSpec(Math.max(View.MeasureSpec.getSize(i), suggestedMinimumHeight + getPaddingTop() + getPaddingBottom()), Integer.MIN_VALUE);
        }
        return i;
    }

    public void setItemHorizontalTranslationEnabled(boolean z) {
        C4935Zo c4935Zo = (C4935Zo) getMenuView();
        if (c4935Zo.A() != z) {
            c4935Zo.setItemHorizontalTranslationEnabled(z);
            getPresenter().i(false);
        }
    }

    @Deprecated
    public void setOnNavigationItemReselectedListener(@InterfaceC11300zs1 b bVar) {
        setOnItemReselectedListener(bVar);
    }

    @Deprecated
    public void setOnNavigationItemSelectedListener(@InterfaceC11300zs1 c cVar) {
        setOnItemSelectedListener(cVar);
    }

    public C5175ap(@InterfaceC5670cr1 Context context, @InterfaceC11300zs1 AttributeSet attributeSet) {
        this(context, attributeSet, C7025iN1.c.bottomNavigationStyle);
    }

    public C5175ap(@InterfaceC5670cr1 Context context, @InterfaceC11300zs1 AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, C7025iN1.n.Widget_Design_BottomNavigationView);
    }

    public C5175ap(@InterfaceC5670cr1 Context context, @InterfaceC11300zs1 AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        C2872Ep2 l = C7608kn2.l(getContext(), attributeSet, C7025iN1.o.F0, i, i2, new int[0]);
        setItemHorizontalTranslationEnabled(l.a(C7025iN1.o.I0, true));
        int i3 = C7025iN1.o.G0;
        if (l.C(i3)) {
            setMinimumHeight(l.g(i3, 0));
        }
        l.I();
        n();
    }
}
