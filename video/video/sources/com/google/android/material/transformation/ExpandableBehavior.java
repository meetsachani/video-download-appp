package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.List;
import o.InterfaceC11300zs1;
import o.InterfaceC2591Bt;
import o.InterfaceC5670cr1;
import o.InterfaceC8090mi0;

@Deprecated
/* loaded from: classes3.dex */
public abstract class ExpandableBehavior extends CoordinatorLayout.c<View> {
    public static final int Y = 0;
    public static final int Y0 = 2;
    public static final int Z = 1;
    public int X;

    /* loaded from: classes3.dex */
    public class a implements ViewTreeObserver.OnPreDrawListener {
        public final /* synthetic */ View X;
        public final /* synthetic */ int Y;
        public final /* synthetic */ InterfaceC8090mi0 Z;

        public a(View view, int i, InterfaceC8090mi0 interfaceC8090mi0) {
            this.X = view;
            this.Y = i;
            this.Z = interfaceC8090mi0;
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            this.X.getViewTreeObserver().removeOnPreDrawListener(this);
            if (ExpandableBehavior.this.X == this.Y) {
                ExpandableBehavior expandableBehavior = ExpandableBehavior.this;
                InterfaceC8090mi0 interfaceC8090mi0 = this.Z;
                expandableBehavior.R((View) interfaceC8090mi0, this.X, interfaceC8090mi0.a(), false);
            }
            return false;
        }
    }

    public ExpandableBehavior() {
        this.X = 0;
    }

    @InterfaceC11300zs1
    public static <T extends ExpandableBehavior> T Q(@InterfaceC5670cr1 View view, @InterfaceC5670cr1 Class<T> cls) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof CoordinatorLayout.g) {
            CoordinatorLayout.c f = ((CoordinatorLayout.g) layoutParams).f();
            if (f instanceof ExpandableBehavior) {
                return cls.cast(f);
            }
            throw new IllegalArgumentException("The view is not associated with ExpandableBehavior");
        }
        throw new IllegalArgumentException("The view is not a child of CoordinatorLayout");
    }

    public final boolean O(boolean z) {
        if (z) {
            int i = this.X;
            if (i != 0 && i != 2) {
                return false;
            }
            return true;
        } else if (this.X != 1) {
            return false;
        } else {
            return true;
        }
    }

    @InterfaceC11300zs1
    public InterfaceC8090mi0 P(@InterfaceC5670cr1 CoordinatorLayout coordinatorLayout, @InterfaceC5670cr1 View view) {
        List<View> w = coordinatorLayout.w(view);
        int size = w.size();
        for (int i = 0; i < size; i++) {
            View view2 = w.get(i);
            if (m(coordinatorLayout, view, view2)) {
                return (InterfaceC8090mi0) view2;
            }
        }
        return null;
    }

    public abstract boolean R(View view, View view2, boolean z, boolean z2);

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public abstract boolean m(CoordinatorLayout coordinatorLayout, View view, View view2);

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    @InterfaceC2591Bt
    public boolean p(CoordinatorLayout coordinatorLayout, View view, View view2) {
        int i;
        InterfaceC8090mi0 interfaceC8090mi0 = (InterfaceC8090mi0) view2;
        if (O(interfaceC8090mi0.a())) {
            if (interfaceC8090mi0.a()) {
                i = 1;
            } else {
                i = 2;
            }
            this.X = i;
            return R((View) interfaceC8090mi0, view, interfaceC8090mi0.a(), true);
        }
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    @InterfaceC2591Bt
    public boolean t(@InterfaceC5670cr1 CoordinatorLayout coordinatorLayout, @InterfaceC5670cr1 View view, int i) {
        InterfaceC8090mi0 P;
        int i2;
        if (!view.isLaidOut() && (P = P(coordinatorLayout, view)) != null && O(P.a())) {
            if (P.a()) {
                i2 = 1;
            } else {
                i2 = 2;
            }
            this.X = i2;
            view.getViewTreeObserver().addOnPreDrawListener(new a(view, i2, P));
            return false;
        }
        return false;
    }

    public ExpandableBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.X = 0;
    }
}
