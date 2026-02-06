package o;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.material.tabs.TabLayout;

/* renamed from: o.sk0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C9563sk0 extends com.google.android.material.tabs.a {
    public static final float b = 0.5f;

    @Override // com.google.android.material.tabs.a
    public void d(TabLayout tabLayout, View view, View view2, float f, @InterfaceC5670cr1 Drawable drawable) {
        float b2;
        int i = (f > 0.5f ? 1 : (f == 0.5f ? 0 : -1));
        if (i >= 0) {
            view = view2;
        }
        RectF a = com.google.android.material.tabs.a.a(tabLayout, view);
        if (i < 0) {
            b2 = C5600ca.b(1.0f, 0.0f, 0.0f, 0.5f, f);
        } else {
            b2 = C5600ca.b(0.0f, 1.0f, 0.5f, 1.0f, f);
        }
        drawable.setBounds((int) a.left, drawable.getBounds().top, (int) a.right, drawable.getBounds().bottom);
        drawable.setAlpha((int) (b2 * 255.0f));
    }
}
