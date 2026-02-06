package androidx.fragment.app;

import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.ArrayList;
import java.util.List;
import o.C6516gH2;
import o.C6562gT0;
import o.C9516sY;
import o.C9698tH2;
import o.RL2;
import o.XL1;

/* loaded from: classes.dex */
public final class FragmentContainerView extends FrameLayout {
    public final List<View> Y0;
    public final List<View> Z0;
    public View.OnApplyWindowInsetsListener a1;
    public boolean b1;

    /* loaded from: classes.dex */
    public static final class a {
        public static final a a = new a();

        public final WindowInsets a(View.OnApplyWindowInsetsListener onApplyWindowInsetsListener, View view, WindowInsets windowInsets) {
            C6562gT0.p(onApplyWindowInsetsListener, "onApplyWindowInsetsListener");
            C6562gT0.p(view, "v");
            C6562gT0.p(windowInsets, "insets");
            WindowInsets onApplyWindowInsets = onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
            C6562gT0.o(onApplyWindowInsets, "onApplyWindowInsetsListe…lyWindowInsets(v, insets)");
            return onApplyWindowInsets;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        C6562gT0.p(context, "context");
    }

    public final void a(View view) {
        if (this.Z0.contains(view)) {
            this.Y0.add(view);
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        C6562gT0.p(view, "child");
        if (FragmentManager.R0(view) != null) {
            super.addView(view, i, layoutParams);
            return;
        }
        throw new IllegalStateException(("Views added to a FragmentContainerView must be associated with a Fragment. View " + view + " is not associated with a Fragment.").toString());
    }

    @Override // android.view.ViewGroup, android.view.View
    public WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        RL2 l1;
        C6562gT0.p(windowInsets, "insets");
        RL2 L = RL2.L(windowInsets);
        C6562gT0.o(L, "toWindowInsetsCompat(insets)");
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = this.a1;
        if (onApplyWindowInsetsListener != null) {
            a aVar = a.a;
            C6562gT0.m(onApplyWindowInsetsListener);
            l1 = RL2.L(aVar.a(onApplyWindowInsetsListener, this, windowInsets));
        } else {
            l1 = C6516gH2.l1(this, L);
        }
        C6562gT0.o(l1, "if (applyWindowInsetsLis…, insetsCompat)\n        }");
        if (!l1.A()) {
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                C6516gH2.q(getChildAt(i), l1);
            }
        }
        return windowInsets;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        C6562gT0.p(canvas, "canvas");
        if (this.b1) {
            for (View view : this.Y0) {
                super.drawChild(canvas, view, getDrawingTime());
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j) {
        C6562gT0.p(canvas, "canvas");
        C6562gT0.p(view, "child");
        if (this.b1 && !this.Y0.isEmpty() && this.Y0.contains(view)) {
            return false;
        }
        return super.drawChild(canvas, view, j);
    }

    @Override // android.view.ViewGroup
    public void endViewTransition(View view) {
        C6562gT0.p(view, C9698tH2.A);
        this.Z0.remove(view);
        if (this.Y0.remove(view)) {
            this.b1 = true;
        }
        super.endViewTransition(view);
    }

    public final <F extends Fragment> F getFragment() {
        return (F) FragmentManager.u0(this).r0(getId());
    }

    @Override // android.view.View
    public WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        C6562gT0.p(windowInsets, "insets");
        return windowInsets;
    }

    @Override // android.view.ViewGroup
    public void removeAllViewsInLayout() {
        int childCount = getChildCount();
        while (true) {
            childCount--;
            if (-1 < childCount) {
                View childAt = getChildAt(childCount);
                C6562gT0.o(childAt, C9698tH2.A);
                a(childAt);
            } else {
                super.removeAllViewsInLayout();
                return;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        C6562gT0.p(view, C9698tH2.A);
        a(view);
        super.removeView(view);
    }

    @Override // android.view.ViewGroup
    public void removeViewAt(int i) {
        View childAt = getChildAt(i);
        C6562gT0.o(childAt, C9698tH2.A);
        a(childAt);
        super.removeViewAt(i);
    }

    @Override // android.view.ViewGroup
    public void removeViewInLayout(View view) {
        C6562gT0.p(view, C9698tH2.A);
        a(view);
        super.removeViewInLayout(view);
    }

    @Override // android.view.ViewGroup
    public void removeViews(int i, int i2) {
        int i3 = i + i2;
        for (int i4 = i; i4 < i3; i4++) {
            View childAt = getChildAt(i4);
            C6562gT0.o(childAt, C9698tH2.A);
            a(childAt);
        }
        super.removeViews(i, i2);
    }

    @Override // android.view.ViewGroup
    public void removeViewsInLayout(int i, int i2) {
        int i3 = i + i2;
        for (int i4 = i; i4 < i3; i4++) {
            View childAt = getChildAt(i4);
            C6562gT0.o(childAt, C9698tH2.A);
            a(childAt);
        }
        super.removeViewsInLayout(i, i2);
    }

    public final void setDrawDisappearingViewsLast(boolean z) {
        this.b1 = z;
    }

    @Override // android.view.ViewGroup
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        throw new UnsupportedOperationException("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
    }

    @Override // android.view.View
    public void setOnApplyWindowInsetsListener(View.OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
        C6562gT0.p(onApplyWindowInsetsListener, ServiceSpecificExtraArgs.CastExtraArgs.a);
        this.a1 = onApplyWindowInsetsListener;
    }

    @Override // android.view.ViewGroup
    public void startViewTransition(View view) {
        C6562gT0.p(view, C9698tH2.A);
        if (view.getParent() == this) {
            this.Z0.add(view);
        }
        super.startViewTransition(view);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context) {
        super(context);
        C6562gT0.p(context, "context");
        this.Y0 = new ArrayList();
        this.Z0 = new ArrayList();
        this.b1 = true;
    }

    public /* synthetic */ FragmentContainerView(Context context, AttributeSet attributeSet, int i, int i2, C9516sY c9516sY) {
        this(context, attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        String str;
        C6562gT0.p(context, "context");
        this.Y0 = new ArrayList();
        this.Z0 = new ArrayList();
        this.b1 = true;
        if (attributeSet != null) {
            String classAttribute = attributeSet.getClassAttribute();
            int[] iArr = XL1.d.e;
            C6562gT0.o(iArr, "FragmentContainerView");
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
            if (classAttribute == null) {
                classAttribute = obtainStyledAttributes.getString(XL1.d.f);
                str = "android:name";
            } else {
                str = com.facebook.applinks.c.f;
            }
            obtainStyledAttributes.recycle();
            if (classAttribute == null || isInEditMode()) {
                return;
            }
            throw new UnsupportedOperationException("FragmentContainerView must be within a FragmentActivity to use " + str + "=\"" + classAttribute + '\"');
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context, AttributeSet attributeSet, FragmentManager fragmentManager) {
        super(context, attributeSet);
        String str;
        C6562gT0.p(context, "context");
        C6562gT0.p(attributeSet, "attrs");
        C6562gT0.p(fragmentManager, "fm");
        this.Y0 = new ArrayList();
        this.Z0 = new ArrayList();
        this.b1 = true;
        String classAttribute = attributeSet.getClassAttribute();
        int[] iArr = XL1.d.e;
        C6562gT0.o(iArr, "FragmentContainerView");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        classAttribute = classAttribute == null ? obtainStyledAttributes.getString(XL1.d.f) : classAttribute;
        String string = obtainStyledAttributes.getString(XL1.d.g);
        obtainStyledAttributes.recycle();
        int id = getId();
        Fragment r0 = fragmentManager.r0(id);
        if (classAttribute != null && r0 == null) {
            if (id == -1) {
                if (string != null) {
                    str = " with tag " + string;
                } else {
                    str = "";
                }
                throw new IllegalStateException("FragmentContainerView must have an android:id to add Fragment " + classAttribute + str);
            }
            Fragment a2 = fragmentManager.H0().a(context.getClassLoader(), classAttribute);
            C6562gT0.o(a2, "fm.fragmentFactory.insta…ontext.classLoader, name)");
            a2.Z0(context, attributeSet, null);
            fragmentManager.u().M(true).f(this, a2, string).p();
        }
        fragmentManager.k1(this);
    }
}
