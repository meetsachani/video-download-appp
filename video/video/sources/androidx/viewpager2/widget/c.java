package androidx.viewpager2.widget;

import android.view.View;
import android.view.ViewParent;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import o.C10907yF1;

/* loaded from: classes.dex */
public final class c implements ViewPager2.m {
    public final int a;

    public c(int i) {
        C10907yF1.j(i, "Margin must be non-negative");
        this.a = i;
    }

    @Override // androidx.viewpager2.widget.ViewPager2.m
    public void a(View view, float f) {
        ViewPager2 b = b(view);
        float f2 = this.a * f;
        if (b.getOrientation() == 0) {
            if (b.k()) {
                f2 = -f2;
            }
            view.setTranslationX(f2);
            return;
        }
        view.setTranslationY(f2);
    }

    public final ViewPager2 b(View view) {
        ViewParent parent = view.getParent();
        ViewParent parent2 = parent.getParent();
        if ((parent instanceof RecyclerView) && (parent2 instanceof ViewPager2)) {
            return (ViewPager2) parent2;
        }
        throw new IllegalStateException("Expected the page view to be managed by a ViewPager2 instance.");
    }
}
