package androidx.viewpager2.widget;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.viewpager2.widget.ViewPager2;
import java.util.Locale;

/* loaded from: classes.dex */
public final class d extends ViewPager2.j {
    public final LinearLayoutManager a;
    public ViewPager2.m b;

    public d(LinearLayoutManager linearLayoutManager) {
        this.a = linearLayoutManager;
    }

    @Override // androidx.viewpager2.widget.ViewPager2.j
    public void a(int i) {
    }

    @Override // androidx.viewpager2.widget.ViewPager2.j
    public void b(int i, float f, int i2) {
        if (this.b != null) {
            float f2 = -f;
            for (int i3 = 0; i3 < this.a.V(); i3++) {
                View U = this.a.U(i3);
                if (U != null) {
                    this.b.a(U, (this.a.w0(U) - i) + f2);
                } else {
                    throw new IllegalStateException(String.format(Locale.US, "LayoutManager returned a null child at pos %d/%d while transforming pages", Integer.valueOf(i3), Integer.valueOf(this.a.V())));
                }
            }
        }
    }

    @Override // androidx.viewpager2.widget.ViewPager2.j
    public void c(int i) {
    }

    public ViewPager2.m d() {
        return this.b;
    }

    public void e(ViewPager2.m mVar) {
        this.b = mVar;
    }
}
