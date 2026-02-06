package o;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.material.tabs.TabLayout;

/* loaded from: classes3.dex */
public class Q90 extends com.google.android.material.tabs.a {
    public static float e(@InterfaceC2501Av0(from = 0.0d, to = 1.0d) float f) {
        return (float) (1.0d - Math.cos((f * 3.141592653589793d) / 2.0d));
    }

    public static float f(@InterfaceC2501Av0(from = 0.0d, to = 1.0d) float f) {
        return (float) Math.sin((f * 3.141592653589793d) / 2.0d);
    }

    @Override // com.google.android.material.tabs.a
    public void d(TabLayout tabLayout, View view, View view2, float f, @InterfaceC5670cr1 Drawable drawable) {
        float f2;
        float e;
        RectF a = com.google.android.material.tabs.a.a(tabLayout, view);
        RectF a2 = com.google.android.material.tabs.a.a(tabLayout, view2);
        if (a.left < a2.left) {
            f2 = e(f);
            e = f(f);
        } else {
            f2 = f(f);
            e = e(f);
        }
        drawable.setBounds(C5600ca.c((int) a.left, (int) a2.left, f2), drawable.getBounds().top, C5600ca.c((int) a.right, (int) a2.right, e), drawable.getBounds().bottom);
    }
}
