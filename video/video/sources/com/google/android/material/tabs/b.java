package com.google.android.material.tabs;

import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import java.lang.ref.WeakReference;
import o.InterfaceC11300zs1;
import o.InterfaceC5670cr1;

/* loaded from: classes3.dex */
public final class b {
    @InterfaceC5670cr1
    public final TabLayout a;
    @InterfaceC5670cr1
    public final ViewPager2 b;
    public final boolean c;
    public final boolean d;
    public final InterfaceC0131b e;
    @InterfaceC11300zs1
    public RecyclerView.AbstractC0370h<?> f;
    public boolean g;
    @InterfaceC11300zs1
    public c h;
    @InterfaceC11300zs1
    public TabLayout.f i;
    @InterfaceC11300zs1
    public RecyclerView.j j;

    /* loaded from: classes3.dex */
    public class a extends RecyclerView.j {
        public a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void a() {
            b.this.d();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void b(int i, int i2) {
            b.this.d();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void c(int i, int i2, @InterfaceC11300zs1 Object obj) {
            b.this.d();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void d(int i, int i2) {
            b.this.d();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void e(int i, int i2, int i3) {
            b.this.d();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void f(int i, int i2) {
            b.this.d();
        }
    }

    /* renamed from: com.google.android.material.tabs.b$b  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public interface InterfaceC0131b {
        void a(@InterfaceC5670cr1 TabLayout.i iVar, int i);
    }

    /* loaded from: classes3.dex */
    public static class c extends ViewPager2.j {
        @InterfaceC5670cr1
        public final WeakReference<TabLayout> a;
        public int b;
        public int c;

        public c(TabLayout tabLayout) {
            this.a = new WeakReference<>(tabLayout);
            d();
        }

        @Override // androidx.viewpager2.widget.ViewPager2.j
        public void a(int i) {
            this.b = this.c;
            this.c = i;
            TabLayout tabLayout = this.a.get();
            if (tabLayout != null) {
                tabLayout.d0(this.c);
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.j
        public void b(int i, float f, int i2) {
            boolean z;
            TabLayout tabLayout = this.a.get();
            if (tabLayout != null) {
                int i3 = this.c;
                boolean z2 = true;
                if (i3 == 2 && this.b != 1) {
                    z = true;
                    z2 = false;
                } else {
                    z = true;
                }
                if (i3 == 2 && this.b == 0) {
                    z = false;
                }
                tabLayout.W(i, f, z2, z, false);
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.j
        public void c(int i) {
            boolean z;
            TabLayout tabLayout = this.a.get();
            if (tabLayout != null && tabLayout.getSelectedTabPosition() != i && i < tabLayout.getTabCount()) {
                int i2 = this.c;
                if (i2 != 0 && (i2 != 2 || this.b != 0)) {
                    z = false;
                } else {
                    z = true;
                }
                tabLayout.S(tabLayout.D(i), z);
            }
        }

        public void d() {
            this.c = 0;
            this.b = 0;
        }
    }

    /* loaded from: classes3.dex */
    public static class d implements TabLayout.f {
        public final ViewPager2 a;
        public final boolean b;

        public d(ViewPager2 viewPager2, boolean z) {
            this.a = viewPager2;
            this.b = z;
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public void a(@InterfaceC5670cr1 TabLayout.i iVar) {
            this.a.s(iVar.k(), this.b);
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public void b(TabLayout.i iVar) {
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public void c(TabLayout.i iVar) {
        }
    }

    public b(@InterfaceC5670cr1 TabLayout tabLayout, @InterfaceC5670cr1 ViewPager2 viewPager2, @InterfaceC5670cr1 InterfaceC0131b interfaceC0131b) {
        this(tabLayout, viewPager2, true, interfaceC0131b);
    }

    public void a() {
        if (!this.g) {
            RecyclerView.AbstractC0370h<?> adapter = this.b.getAdapter();
            this.f = adapter;
            if (adapter != null) {
                this.g = true;
                c cVar = new c(this.a);
                this.h = cVar;
                this.b.n(cVar);
                d dVar = new d(this.b, this.d);
                this.i = dVar;
                this.a.h(dVar);
                if (this.c) {
                    a aVar = new a();
                    this.j = aVar;
                    this.f.F(aVar);
                }
                d();
                this.a.U(this.b.getCurrentItem(), 0.0f, true);
                return;
            }
            throw new IllegalStateException("TabLayoutMediator attached before ViewPager2 has an adapter");
        }
        throw new IllegalStateException("TabLayoutMediator is already attached");
    }

    public void b() {
        RecyclerView.AbstractC0370h<?> abstractC0370h;
        if (!this.g) {
            return;
        }
        if (this.c && (abstractC0370h = this.f) != null) {
            abstractC0370h.I(this.j);
            this.j = null;
        }
        this.a.N(this.i);
        this.b.x(this.h);
        this.i = null;
        this.h = null;
        this.f = null;
        this.g = false;
    }

    public boolean c() {
        return this.g;
    }

    public void d() {
        this.a.L();
        RecyclerView.AbstractC0370h<?> abstractC0370h = this.f;
        if (abstractC0370h != null) {
            int g = abstractC0370h.g();
            for (int i = 0; i < g; i++) {
                TabLayout.i I = this.a.I();
                this.e.a(I, i);
                this.a.l(I, false);
            }
            if (g > 0) {
                int min = Math.min(this.b.getCurrentItem(), this.a.getTabCount() - 1);
                if (min != this.a.getSelectedTabPosition()) {
                    TabLayout tabLayout = this.a;
                    tabLayout.R(tabLayout.D(min));
                }
            }
        }
    }

    public b(@InterfaceC5670cr1 TabLayout tabLayout, @InterfaceC5670cr1 ViewPager2 viewPager2, boolean z, @InterfaceC5670cr1 InterfaceC0131b interfaceC0131b) {
        this(tabLayout, viewPager2, z, true, interfaceC0131b);
    }

    public b(@InterfaceC5670cr1 TabLayout tabLayout, @InterfaceC5670cr1 ViewPager2 viewPager2, boolean z, boolean z2, @InterfaceC5670cr1 InterfaceC0131b interfaceC0131b) {
        this.a = tabLayout;
        this.b = viewPager2;
        this.c = z;
        this.d = z2;
        this.e = interfaceC0131b;
    }
}
