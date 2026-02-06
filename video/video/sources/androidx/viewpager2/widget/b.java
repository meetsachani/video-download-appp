package androidx.viewpager2.widget;

import android.view.View;
import androidx.viewpager2.widget.ViewPager2;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class b implements ViewPager2.m {
    public final List<ViewPager2.m> a = new ArrayList();

    @Override // androidx.viewpager2.widget.ViewPager2.m
    public void a(View view, float f) {
        for (ViewPager2.m mVar : this.a) {
            mVar.a(view, f);
        }
    }

    public void b(ViewPager2.m mVar) {
        this.a.add(mVar);
    }

    public void c(ViewPager2.m mVar) {
        this.a.remove(mVar);
    }
}
