package androidx.viewpager2.widget;

import androidx.viewpager2.widget.ViewPager2;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.List;

/* loaded from: classes.dex */
public final class a extends ViewPager2.j {
    public final List<ViewPager2.j> a;

    public a(int i) {
        this.a = new ArrayList(i);
    }

    @Override // androidx.viewpager2.widget.ViewPager2.j
    public void a(int i) {
        try {
            for (ViewPager2.j jVar : this.a) {
                jVar.a(i);
            }
        } catch (ConcurrentModificationException e) {
            f(e);
        }
    }

    @Override // androidx.viewpager2.widget.ViewPager2.j
    public void b(int i, float f, int i2) {
        try {
            for (ViewPager2.j jVar : this.a) {
                jVar.b(i, f, i2);
            }
        } catch (ConcurrentModificationException e) {
            f(e);
        }
    }

    @Override // androidx.viewpager2.widget.ViewPager2.j
    public void c(int i) {
        try {
            for (ViewPager2.j jVar : this.a) {
                jVar.c(i);
            }
        } catch (ConcurrentModificationException e) {
            f(e);
        }
    }

    public void d(ViewPager2.j jVar) {
        this.a.add(jVar);
    }

    public void e(ViewPager2.j jVar) {
        this.a.remove(jVar);
    }

    public final void f(ConcurrentModificationException concurrentModificationException) {
        throw new IllegalStateException("Adding and removing callbacks during dispatch to callbacks is not supported", concurrentModificationException);
    }
}
