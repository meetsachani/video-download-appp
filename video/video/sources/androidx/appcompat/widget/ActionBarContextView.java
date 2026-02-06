package androidx.appcompat.widget;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import o.C11163zI2;
import o.C2872Ep2;
import o.C6516gH2;
import o.I;
import o.OL1;
import o.T4;
import o.ZH2;

/* loaded from: classes.dex */
public class ActionBarContextView extends I {
    public CharSequence h1;
    public CharSequence i1;
    public View j1;
    public View k1;
    public View l1;
    public LinearLayout m1;
    public TextView n1;
    public TextView o1;
    public int p1;
    public int q1;
    public boolean r1;
    public int s1;

    /* loaded from: classes.dex */
    public class a implements View.OnClickListener {
        public final /* synthetic */ T4 X;

        public a(T4 t4) {
            this.X = t4;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.X.c();
        }
    }

    public ActionBarContextView(Context context) {
        this(context, null);
    }

    @Override // o.I
    public /* bridge */ /* synthetic */ void c(int i) {
        super.c(i);
    }

    @Override // o.I
    public /* bridge */ /* synthetic */ boolean d() {
        return super.d();
    }

    @Override // o.I
    public /* bridge */ /* synthetic */ void e() {
        super.e();
    }

    @Override // o.I
    public boolean f() {
        androidx.appcompat.widget.a aVar = this.b1;
        if (aVar != null) {
            return aVar.E();
        }
        return false;
    }

    @Override // o.I
    public /* bridge */ /* synthetic */ boolean g() {
        return super.g();
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    @Override // o.I
    public /* bridge */ /* synthetic */ int getAnimatedVisibility() {
        return super.getAnimatedVisibility();
    }

    @Override // o.I
    public /* bridge */ /* synthetic */ int getContentHeight() {
        return super.getContentHeight();
    }

    public CharSequence getSubtitle() {
        return this.i1;
    }

    public CharSequence getTitle() {
        return this.h1;
    }

    @Override // o.I
    public boolean h() {
        androidx.appcompat.widget.a aVar = this.b1;
        if (aVar != null) {
            return aVar.H();
        }
        return false;
    }

    @Override // o.I
    public /* bridge */ /* synthetic */ boolean i() {
        return super.i();
    }

    @Override // o.I
    public /* bridge */ /* synthetic */ void m() {
        super.m();
    }

    @Override // o.I
    public /* bridge */ /* synthetic */ ZH2 n(int i, long j) {
        return super.n(i, j);
    }

    @Override // o.I
    public boolean o() {
        androidx.appcompat.widget.a aVar = this.b1;
        if (aVar != null) {
            return aVar.Q();
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        androidx.appcompat.widget.a aVar = this.b1;
        if (aVar != null) {
            aVar.E();
            this.b1.F();
        }
    }

    @Override // o.I, android.view.View
    public /* bridge */ /* synthetic */ boolean onHoverEvent(MotionEvent motionEvent) {
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int paddingLeft;
        int paddingRight;
        int i5;
        int i6;
        boolean b = C11163zI2.b(this);
        if (b) {
            paddingLeft = (i3 - i) - getPaddingRight();
        } else {
            paddingLeft = getPaddingLeft();
        }
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();
        View view = this.j1;
        if (view != null && view.getVisibility() != 8) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.j1.getLayoutParams();
            if (b) {
                i5 = marginLayoutParams.rightMargin;
            } else {
                i5 = marginLayoutParams.leftMargin;
            }
            if (b) {
                i6 = marginLayoutParams.leftMargin;
            } else {
                i6 = marginLayoutParams.rightMargin;
            }
            int i7 = i6;
            int k = I.k(paddingLeft, i5, b);
            paddingLeft = I.k(k + l(this.j1, k, paddingTop, paddingTop2, b), i7, b);
        }
        int i8 = paddingLeft;
        LinearLayout linearLayout = this.m1;
        if (linearLayout != null && this.l1 == null && linearLayout.getVisibility() != 8) {
            i8 += l(this.m1, i8, paddingTop, paddingTop2, b);
        }
        View view2 = this.l1;
        if (view2 != null) {
            l(view2, i8, paddingTop, paddingTop2, b);
        }
        if (b) {
            paddingRight = getPaddingLeft();
        } else {
            paddingRight = (i3 - i) - getPaddingRight();
        }
        int i9 = paddingRight;
        ActionMenuView actionMenuView = this.a1;
        if (actionMenuView != null) {
            l(actionMenuView, i9, paddingTop, paddingTop2, !b);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int i3;
        boolean z;
        int i4;
        int i5 = 1073741824;
        if (View.MeasureSpec.getMode(i) == 1073741824) {
            if (View.MeasureSpec.getMode(i2) != 0) {
                int size = View.MeasureSpec.getSize(i);
                int i6 = this.c1;
                if (i6 <= 0) {
                    i6 = View.MeasureSpec.getSize(i2);
                }
                int paddingTop = getPaddingTop() + getPaddingBottom();
                int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
                int i7 = i6 - paddingTop;
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i7, Integer.MIN_VALUE);
                View view = this.j1;
                if (view != null) {
                    int j = j(view, paddingLeft, makeMeasureSpec, 0);
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.j1.getLayoutParams();
                    paddingLeft = j - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
                }
                ActionMenuView actionMenuView = this.a1;
                if (actionMenuView != null && actionMenuView.getParent() == this) {
                    paddingLeft = j(this.a1, paddingLeft, makeMeasureSpec, 0);
                }
                LinearLayout linearLayout = this.m1;
                if (linearLayout != null && this.l1 == null) {
                    if (this.r1) {
                        this.m1.measure(View.MeasureSpec.makeMeasureSpec(0, 0), makeMeasureSpec);
                        int measuredWidth = this.m1.getMeasuredWidth();
                        if (measuredWidth <= paddingLeft) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (z) {
                            paddingLeft -= measuredWidth;
                        }
                        LinearLayout linearLayout2 = this.m1;
                        if (z) {
                            i4 = 0;
                        } else {
                            i4 = 8;
                        }
                        linearLayout2.setVisibility(i4);
                    } else {
                        paddingLeft = j(linearLayout, paddingLeft, makeMeasureSpec, 0);
                    }
                }
                View view2 = this.l1;
                if (view2 != null) {
                    ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                    int i8 = layoutParams.width;
                    if (i8 != -2) {
                        i3 = 1073741824;
                    } else {
                        i3 = Integer.MIN_VALUE;
                    }
                    if (i8 >= 0) {
                        paddingLeft = Math.min(i8, paddingLeft);
                    }
                    int i9 = layoutParams.height;
                    if (i9 == -2) {
                        i5 = Integer.MIN_VALUE;
                    }
                    if (i9 >= 0) {
                        i7 = Math.min(i9, i7);
                    }
                    this.l1.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i3), View.MeasureSpec.makeMeasureSpec(i7, i5));
                }
                if (this.c1 <= 0) {
                    int childCount = getChildCount();
                    int i10 = 0;
                    for (int i11 = 0; i11 < childCount; i11++) {
                        int measuredHeight = getChildAt(i11).getMeasuredHeight() + paddingTop;
                        if (measuredHeight > i10) {
                            i10 = measuredHeight;
                        }
                    }
                    setMeasuredDimension(size, i10);
                    return;
                }
                setMeasuredDimension(size, i6);
                return;
            }
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with android:layout_height=\"wrap_content\"");
        }
        throw new IllegalStateException(getClass().getSimpleName() + " can only be used with android:layout_width=\"match_parent\" (or fill_parent)");
    }

    @Override // o.I, android.view.View
    public /* bridge */ /* synthetic */ boolean onTouchEvent(MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }

    public void p() {
        if (this.j1 == null) {
            t();
        }
    }

    public void q(T4 t4) {
        View view = this.j1;
        if (view == null) {
            View inflate = LayoutInflater.from(getContext()).inflate(this.s1, (ViewGroup) this, false);
            this.j1 = inflate;
            addView(inflate);
        } else if (view.getParent() == null) {
            addView(this.j1);
        }
        View findViewById = this.j1.findViewById(OL1.g.m);
        this.k1 = findViewById;
        findViewById.setOnClickListener(new a(t4));
        androidx.appcompat.view.menu.e eVar = (androidx.appcompat.view.menu.e) t4.e();
        androidx.appcompat.widget.a aVar = this.b1;
        if (aVar != null) {
            aVar.B();
        }
        androidx.appcompat.widget.a aVar2 = new androidx.appcompat.widget.a(getContext());
        this.b1 = aVar2;
        aVar2.O(true);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -1);
        eVar.c(this.b1, this.Z0);
        ActionMenuView actionMenuView = (ActionMenuView) this.b1.g(this);
        this.a1 = actionMenuView;
        actionMenuView.setBackground(null);
        addView(this.a1, layoutParams);
    }

    public final void r() {
        int i;
        if (this.m1 == null) {
            LayoutInflater.from(getContext()).inflate(OL1.j.a, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.m1 = linearLayout;
            this.n1 = (TextView) linearLayout.findViewById(OL1.g.g);
            this.o1 = (TextView) this.m1.findViewById(OL1.g.f);
            if (this.p1 != 0) {
                this.n1.setTextAppearance(getContext(), this.p1);
            }
            if (this.q1 != 0) {
                this.o1.setTextAppearance(getContext(), this.q1);
            }
        }
        this.n1.setText(this.h1);
        this.o1.setText(this.i1);
        boolean isEmpty = TextUtils.isEmpty(this.h1);
        boolean isEmpty2 = TextUtils.isEmpty(this.i1);
        TextView textView = this.o1;
        int i2 = 8;
        if (!isEmpty2) {
            i = 0;
        } else {
            i = 8;
        }
        textView.setVisibility(i);
        LinearLayout linearLayout2 = this.m1;
        if (!isEmpty || !isEmpty2) {
            i2 = 0;
        }
        linearLayout2.setVisibility(i2);
        if (this.m1.getParent() == null) {
            addView(this.m1);
        }
    }

    public boolean s() {
        return this.r1;
    }

    @Override // o.I
    public void setContentHeight(int i) {
        this.c1 = i;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.l1;
        if (view2 != null) {
            removeView(view2);
        }
        this.l1 = view;
        if (view != null && (linearLayout = this.m1) != null) {
            removeView(linearLayout);
            this.m1 = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.i1 = charSequence;
        r();
    }

    public void setTitle(CharSequence charSequence) {
        this.h1 = charSequence;
        r();
        C6516gH2.L1(this, charSequence);
    }

    public void setTitleOptional(boolean z) {
        if (z != this.r1) {
            requestLayout();
        }
        this.r1 = z;
    }

    @Override // o.I, android.view.View
    public /* bridge */ /* synthetic */ void setVisibility(int i) {
        super.setVisibility(i);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public void t() {
        removeAllViews();
        this.l1 = null;
        this.a1 = null;
        this.b1 = null;
        View view = this.k1;
        if (view != null) {
            view.setOnClickListener(null);
        }
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, OL1.b.C);
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C2872Ep2 G = C2872Ep2.G(context, attributeSet, OL1.m.J, i, 0);
        setBackground(G.h(OL1.m.K));
        this.p1 = G.u(OL1.m.P, 0);
        this.q1 = G.u(OL1.m.O, 0);
        this.c1 = G.q(OL1.m.N, 0);
        this.s1 = G.u(OL1.m.M, OL1.j.f);
        G.I();
    }
}
