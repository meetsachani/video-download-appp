package com.google.android.material.tabs;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.material.tabs.TabLayout;
import o.C10920yI2;
import o.C5600ca;
import o.InterfaceC11300zs1;
import o.InterfaceC2501Av0;
import o.InterfaceC5670cr1;
import o.InterfaceC9397s30;

/* loaded from: classes3.dex */
public class a {
    @InterfaceC9397s30(unit = 0)
    public static final int a = 24;

    public static RectF a(TabLayout tabLayout, @InterfaceC11300zs1 View view) {
        if (view == null) {
            return new RectF();
        }
        if (!tabLayout.H() && (view instanceof TabLayout.n)) {
            return b((TabLayout.n) view, 24);
        }
        return new RectF(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
    }

    public static RectF b(@InterfaceC5670cr1 TabLayout.n nVar, @InterfaceC9397s30(unit = 0) int i) {
        int contentWidth = nVar.getContentWidth();
        int contentHeight = nVar.getContentHeight();
        int i2 = (int) C10920yI2.i(nVar.getContext(), i);
        if (contentWidth < i2) {
            contentWidth = i2;
        }
        int left = (nVar.getLeft() + nVar.getRight()) / 2;
        int top = (nVar.getTop() + nVar.getBottom()) / 2;
        int i3 = contentWidth / 2;
        return new RectF(left - i3, top - (contentHeight / 2), i3 + left, top + (left / 2));
    }

    public void c(TabLayout tabLayout, View view, @InterfaceC5670cr1 Drawable drawable) {
        RectF a2 = a(tabLayout, view);
        drawable.setBounds((int) a2.left, drawable.getBounds().top, (int) a2.right, drawable.getBounds().bottom);
    }

    public void d(TabLayout tabLayout, View view, View view2, @InterfaceC2501Av0(from = 0.0d, to = 1.0d) float f, @InterfaceC5670cr1 Drawable drawable) {
        RectF a2 = a(tabLayout, view);
        RectF a3 = a(tabLayout, view2);
        drawable.setBounds(C5600ca.c((int) a2.left, (int) a3.left, f), drawable.getBounds().top, C5600ca.c((int) a2.right, (int) a3.right, f), drawable.getBounds().bottom);
    }
}
