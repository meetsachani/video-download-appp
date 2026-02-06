package o;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.List;
import o.HL1;
import o.SJ1;

/* loaded from: classes.dex */
public class UJ1 extends FrameLayout {
    public static final Object a1 = new Object();
    public final List<SJ1> Y0;
    public TJ1 Z0;

    /* loaded from: classes.dex */
    public class a implements SJ1.a.InterfaceC0228a {
        public final /* synthetic */ FrameLayout.LayoutParams a;
        public final /* synthetic */ View b;

        public a(FrameLayout.LayoutParams layoutParams, View view) {
            this.a = layoutParams;
            this.b = view;
        }

        @Override // o.SJ1.a.InterfaceC0228a
        public void a(int i) {
            FrameLayout.LayoutParams layoutParams = this.a;
            layoutParams.height = i;
            this.b.setLayoutParams(layoutParams);
        }

        @Override // o.SJ1.a.InterfaceC0228a
        public void b(boolean z) {
            int i;
            View view = this.b;
            if (z) {
                i = 0;
            } else {
                i = 4;
            }
            view.setVisibility(i);
        }

        @Override // o.SJ1.a.InterfaceC0228a
        public void c(float f) {
            this.b.setAlpha(f);
        }

        @Override // o.SJ1.a.InterfaceC0228a
        public void d(C9246rQ0 c9246rQ0) {
            FrameLayout.LayoutParams layoutParams = this.a;
            layoutParams.leftMargin = c9246rQ0.a;
            layoutParams.topMargin = c9246rQ0.b;
            layoutParams.rightMargin = c9246rQ0.c;
            layoutParams.bottomMargin = c9246rQ0.d;
            this.b.setLayoutParams(layoutParams);
        }

        @Override // o.SJ1.a.InterfaceC0228a
        public void e(int i) {
            FrameLayout.LayoutParams layoutParams = this.a;
            layoutParams.width = i;
            this.b.setLayoutParams(layoutParams);
        }

        @Override // o.SJ1.a.InterfaceC0228a
        public void f(float f) {
            this.b.setTranslationX(f);
        }

        @Override // o.SJ1.a.InterfaceC0228a
        public void g(float f) {
            this.b.setTranslationY(f);
        }

        @Override // o.SJ1.a.InterfaceC0228a
        public void h(Drawable drawable) {
            this.b.setBackground(drawable);
        }
    }

    public UJ1(Context context) {
        super(context);
        this.Y0 = new ArrayList();
    }

    private C7596kk2 getOrInstallSystemBarStateMonitor() {
        ViewGroup viewGroup = (ViewGroup) getRootView();
        int i = HL1.e.tag_system_bar_state_monitor;
        Object tag = viewGroup.getTag(i);
        if (tag instanceof C7596kk2) {
            return (C7596kk2) tag;
        }
        C7596kk2 c7596kk2 = new C7596kk2(viewGroup);
        viewGroup.setTag(i, c7596kk2);
        return c7596kk2;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x008c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Context context, int i, SJ1 sj1) {
        int q;
        int i2;
        int i3;
        SJ1.a j = sj1.j();
        int m = sj1.m();
        int i4 = 4;
        int i5 = -1;
        if (m != 1) {
            if (m != 2) {
                if (m != 4) {
                    if (m == 8) {
                        i3 = j.m();
                        i2 = 80;
                    } else {
                        throw new IllegalArgumentException("Unexpected side: " + sj1.m());
                    }
                } else {
                    q = j.q();
                    i2 = 5;
                }
            } else {
                i3 = j.m();
                i2 = 48;
            }
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i5, i3, i2);
            C9246rQ0 n = j.n();
            layoutParams.leftMargin = n.a;
            layoutParams.topMargin = n.b;
            layoutParams.rightMargin = n.c;
            layoutParams.bottomMargin = n.d;
            View view = new View(context);
            view.setTag(a1);
            view.setTranslationX(j.o());
            view.setTranslationY(j.p());
            view.setAlpha(j.k());
            if (j.r()) {
                i4 = 0;
            }
            view.setVisibility(i4);
            view.setBackground(j.l());
            j.t(new a(layoutParams, view));
            addView(view, i, layoutParams);
        }
        q = j.q();
        i2 = 3;
        i5 = q;
        i3 = -1;
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(i5, i3, i2);
        C9246rQ0 n2 = j.n();
        layoutParams2.leftMargin = n2.a;
        layoutParams2.topMargin = n2.b;
        layoutParams2.rightMargin = n2.c;
        layoutParams2.bottomMargin = n2.d;
        View view2 = new View(context);
        view2.setTag(a1);
        view2.setTranslationX(j.o());
        view2.setTranslationY(j.p());
        view2.setAlpha(j.k());
        if (j.r()) {
        }
        view2.setVisibility(i4);
        view2.setBackground(j.l());
        j.t(new a(layoutParams2, view2));
        addView(view2, i, layoutParams2);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        int i2;
        if (view != null && view.getTag() != a1) {
            TJ1 tj1 = this.Z0;
            if (tj1 != null) {
                i2 = tj1.i();
            } else {
                i2 = 0;
            }
            int childCount = getChildCount() - i2;
            if (i > childCount || i < 0) {
                i = childCount;
            }
        }
        super.addView(view, i, layoutParams);
    }

    public final void b() {
        if (!this.Y0.isEmpty()) {
            this.Z0 = new TJ1(getOrInstallSystemBarStateMonitor(), this.Y0);
            int childCount = getChildCount();
            int i = this.Z0.i();
            for (int i2 = 0; i2 < i; i2++) {
                a(getContext(), i2 + childCount, this.Z0.h(i2));
            }
        }
    }

    public final void c() {
        ViewGroup viewGroup = (ViewGroup) getRootView();
        int i = HL1.e.tag_system_bar_state_monitor;
        Object tag = viewGroup.getTag(i);
        if (tag instanceof C7596kk2) {
            C7596kk2 c7596kk2 = (C7596kk2) tag;
            if (c7596kk2.k()) {
                return;
            }
            c7596kk2.h();
            viewGroup.setTag(i, null);
        }
    }

    public final void d() {
        if (this.Z0 != null) {
            removeViews(getChildCount() - this.Z0.i(), this.Z0.i());
            int i = this.Z0.i();
            for (int i2 = 0; i2 < i; i2++) {
                this.Z0.h(i2).j().t(null);
            }
            this.Z0.g();
            this.Z0 = null;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.Z0 != null) {
            d();
        }
        b();
        requestApplyInsets();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        d();
        c();
    }

    public void setProtections(List<SJ1> list) {
        this.Y0.clear();
        this.Y0.addAll(list);
        if (isAttachedToWindow()) {
            d();
            b();
            requestApplyInsets();
        }
    }

    public UJ1(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public UJ1(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public UJ1(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.Y0 = new ArrayList();
    }

    public UJ1(Context context, List<SJ1> list) {
        super(context);
        this.Y0 = new ArrayList();
        setProtections(list);
    }
}
