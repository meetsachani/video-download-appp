package o;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.view.menu.j;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.internal.NavigationMenuItemView;
import com.google.android.material.internal.NavigationMenuView;
import java.util.ArrayList;
import o.C10861y4;
import o.C7025iN1;
import o.HT1;

@HT1({HT1.a.Y})
/* renamed from: o.cp1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C5662cp1 implements androidx.appcompat.view.menu.j {
    public static final String A1 = "android:menu:list";
    public static final String B1 = "android:menu:adapter";
    public static final String C1 = "android:menu:header";
    public static final int z1 = 0;
    public NavigationMenuView X;
    public LinearLayout Y;
    public androidx.appcompat.view.menu.e Y0;
    public j.a Z;
    public int Z0;
    public c a1;
    public LayoutInflater b1;
    @InterfaceC11300zs1
    public ColorStateList d1;
    public ColorStateList g1;
    public ColorStateList h1;
    public Drawable i1;
    public RippleDrawable j1;
    public int k1;
    @PK1
    public int l1;
    public int m1;
    public int n1;
    @PK1
    public int o1;
    @PK1
    public int p1;
    @PK1
    public int q1;
    @PK1
    public int r1;
    public boolean s1;
    public int u1;
    public int v1;
    public int w1;
    public int c1 = 0;
    public int e1 = 0;
    public boolean f1 = true;
    public boolean t1 = true;
    public int x1 = -1;
    public final View.OnClickListener y1 = new a();

    /* renamed from: o.cp1$a */
    /* loaded from: classes3.dex */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            boolean z = true;
            C5662cp1.this.b0(true);
            androidx.appcompat.view.menu.h itemData = ((NavigationMenuItemView) view).getItemData();
            C5662cp1 c5662cp1 = C5662cp1.this;
            boolean Q = c5662cp1.Y0.Q(itemData, c5662cp1, 0);
            if (itemData != null && itemData.isCheckable() && Q) {
                C5662cp1.this.a1.Y(itemData);
            } else {
                z = false;
            }
            C5662cp1.this.b0(false);
            if (z) {
                C5662cp1.this.i(false);
            }
        }
    }

    /* renamed from: o.cp1$b */
    /* loaded from: classes3.dex */
    public static class b extends l {
        public b(View view) {
            super(view);
        }
    }

    /* renamed from: o.cp1$c */
    /* loaded from: classes3.dex */
    public class c extends RecyclerView.AbstractC0370h<l> {
        public static final String h = "android:menu:checked";
        public static final String i = "android:menu:action_views";
        public static final int j = 0;
        public static final int k = 1;
        public static final int l = 2;
        public static final int m = 3;
        public final ArrayList<e> d = new ArrayList<>();
        public androidx.appcompat.view.menu.h e;
        public boolean f;

        /* renamed from: o.cp1$c$a */
        /* loaded from: classes3.dex */
        public class a extends Q3 {
            public final /* synthetic */ int d;
            public final /* synthetic */ boolean e;

            public a(int i, boolean z) {
                this.d = i;
                this.e = z;
            }

            @Override // o.Q3
            public void g(@InterfaceC5670cr1 View view, @InterfaceC5670cr1 C10861y4 c10861y4) {
                super.g(view, c10861y4);
                c10861y4.n1(C10861y4.g.j(c.this.N(this.d), 1, 1, 1, this.e, view.isSelected()));
            }
        }

        public c() {
            V();
        }

        public final int N(int i2) {
            int i3 = i2;
            for (int i4 = 0; i4 < i2; i4++) {
                if (C5662cp1.this.a1.i(i4) == 2 || C5662cp1.this.a1.i(i4) == 3) {
                    i3--;
                }
            }
            return i3;
        }

        public final void O(int i2, int i3) {
            while (i2 < i3) {
                ((g) this.d.get(i2)).b = true;
                i2++;
            }
        }

        @InterfaceC5670cr1
        public Bundle P() {
            View view;
            Bundle bundle = new Bundle();
            androidx.appcompat.view.menu.h hVar = this.e;
            if (hVar != null) {
                bundle.putInt(h, hVar.getItemId());
            }
            SparseArray<? extends Parcelable> sparseArray = new SparseArray<>();
            int size = this.d.size();
            for (int i2 = 0; i2 < size; i2++) {
                e eVar = this.d.get(i2);
                if (eVar instanceof g) {
                    androidx.appcompat.view.menu.h a2 = ((g) eVar).a();
                    if (a2 != null) {
                        view = a2.getActionView();
                    } else {
                        view = null;
                    }
                    if (view != null) {
                        C2511Ay1 c2511Ay1 = new C2511Ay1();
                        view.saveHierarchyState(c2511Ay1);
                        sparseArray.put(a2.getItemId(), c2511Ay1);
                    }
                }
            }
            bundle.putSparseParcelableArray(i, sparseArray);
            return bundle;
        }

        public androidx.appcompat.view.menu.h Q() {
            return this.e;
        }

        public int R() {
            int i2 = 0;
            for (int i3 = 0; i3 < C5662cp1.this.a1.g(); i3++) {
                int i4 = C5662cp1.this.a1.i(i3);
                if (i4 == 0 || i4 == 1) {
                    i2++;
                }
            }
            return i2;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0370h
        /* renamed from: S */
        public void x(@InterfaceC5670cr1 l lVar, int i2) {
            Drawable drawable;
            int i3 = i(i2);
            if (i3 != 0) {
                if (i3 != 1) {
                    if (i3 != 2) {
                        return;
                    }
                    f fVar = (f) this.d.get(i2);
                    lVar.a.setPaddingRelative(C5662cp1.this.o1, fVar.b(), C5662cp1.this.p1, fVar.a());
                    return;
                }
                TextView textView = (TextView) lVar.a;
                textView.setText(((g) this.d.get(i2)).a().getTitle());
                C4930Zm2.D(textView, C5662cp1.this.c1);
                textView.setPaddingRelative(C5662cp1.this.q1, textView.getPaddingTop(), C5662cp1.this.r1, textView.getPaddingBottom());
                ColorStateList colorStateList = C5662cp1.this.d1;
                if (colorStateList != null) {
                    textView.setTextColor(colorStateList);
                }
                X(textView, i2, true);
                return;
            }
            NavigationMenuItemView navigationMenuItemView = (NavigationMenuItemView) lVar.a;
            navigationMenuItemView.setIconTintList(C5662cp1.this.h1);
            navigationMenuItemView.setTextAppearance(C5662cp1.this.e1);
            ColorStateList colorStateList2 = C5662cp1.this.g1;
            if (colorStateList2 != null) {
                navigationMenuItemView.setTextColor(colorStateList2);
            }
            Drawable drawable2 = C5662cp1.this.i1;
            if (drawable2 != null) {
                drawable = drawable2.getConstantState().newDrawable();
            } else {
                drawable = null;
            }
            navigationMenuItemView.setBackground(drawable);
            RippleDrawable rippleDrawable = C5662cp1.this.j1;
            if (rippleDrawable != null) {
                navigationMenuItemView.setForeground(rippleDrawable.getConstantState().newDrawable());
            }
            g gVar = (g) this.d.get(i2);
            navigationMenuItemView.setNeedsEmptyIcon(gVar.b);
            C5662cp1 c5662cp1 = C5662cp1.this;
            int i4 = c5662cp1.k1;
            int i5 = c5662cp1.l1;
            navigationMenuItemView.setPadding(i4, i5, i4, i5);
            navigationMenuItemView.setIconPadding(C5662cp1.this.m1);
            C5662cp1 c5662cp12 = C5662cp1.this;
            if (c5662cp12.s1) {
                navigationMenuItemView.setIconSize(c5662cp12.n1);
            }
            navigationMenuItemView.setMaxLines(C5662cp1.this.u1);
            navigationMenuItemView.H(gVar.a(), C5662cp1.this.f1);
            X(navigationMenuItemView, i2, false);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0370h
        @InterfaceC11300zs1
        /* renamed from: T */
        public l z(ViewGroup viewGroup, int i2) {
            if (i2 != 0) {
                if (i2 != 1) {
                    if (i2 != 2) {
                        if (i2 != 3) {
                            return null;
                        }
                        return new b(C5662cp1.this.Y);
                    }
                    return new j(C5662cp1.this.b1, viewGroup);
                }
                return new k(C5662cp1.this.b1, viewGroup);
            }
            C5662cp1 c5662cp1 = C5662cp1.this;
            return new i(c5662cp1.b1, viewGroup, c5662cp1.y1);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0370h
        /* renamed from: U */
        public void E(l lVar) {
            if (lVar instanceof i) {
                ((NavigationMenuItemView) lVar.a).I();
            }
        }

        public final void V() {
            if (this.f) {
                return;
            }
            this.f = true;
            this.d.clear();
            this.d.add(new d());
            int size = C5662cp1.this.Y0.H().size();
            int i2 = -1;
            boolean z = false;
            int i3 = 0;
            for (int i4 = 0; i4 < size; i4++) {
                androidx.appcompat.view.menu.h hVar = C5662cp1.this.Y0.H().get(i4);
                if (hVar.isChecked()) {
                    Y(hVar);
                }
                if (hVar.isCheckable()) {
                    hVar.w(false);
                }
                if (hVar.hasSubMenu()) {
                    SubMenu subMenu = hVar.getSubMenu();
                    if (subMenu.hasVisibleItems()) {
                        if (i4 != 0) {
                            this.d.add(new f(C5662cp1.this.w1, 0));
                        }
                        this.d.add(new g(hVar));
                        int size2 = this.d.size();
                        int size3 = subMenu.size();
                        boolean z2 = false;
                        for (int i5 = 0; i5 < size3; i5++) {
                            androidx.appcompat.view.menu.h hVar2 = (androidx.appcompat.view.menu.h) subMenu.getItem(i5);
                            if (hVar2.isVisible()) {
                                if (!z2 && hVar2.getIcon() != null) {
                                    z2 = true;
                                }
                                if (hVar2.isCheckable()) {
                                    hVar2.w(false);
                                }
                                if (hVar2.isChecked()) {
                                    Y(hVar2);
                                }
                                this.d.add(new g(hVar2));
                            }
                        }
                        if (z2) {
                            O(size2, this.d.size());
                        }
                    }
                } else {
                    int groupId = hVar.getGroupId();
                    if (groupId != i2) {
                        i3 = this.d.size();
                        if (hVar.getIcon() != null) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (i4 != 0) {
                            i3++;
                            ArrayList<e> arrayList = this.d;
                            int i6 = C5662cp1.this.w1;
                            arrayList.add(new f(i6, i6));
                        }
                    } else if (!z && hVar.getIcon() != null) {
                        O(i3, this.d.size());
                        z = true;
                    }
                    g gVar = new g(hVar);
                    gVar.b = z;
                    this.d.add(gVar);
                    i2 = groupId;
                }
            }
            this.f = false;
        }

        public void W(@InterfaceC5670cr1 Bundle bundle) {
            androidx.appcompat.view.menu.h a2;
            View actionView;
            C2511Ay1 c2511Ay1;
            androidx.appcompat.view.menu.h a3;
            int i2 = bundle.getInt(h, 0);
            if (i2 != 0) {
                this.f = true;
                int size = this.d.size();
                int i3 = 0;
                while (true) {
                    if (i3 >= size) {
                        break;
                    }
                    e eVar = this.d.get(i3);
                    if ((eVar instanceof g) && (a3 = ((g) eVar).a()) != null && a3.getItemId() == i2) {
                        Y(a3);
                        break;
                    }
                    i3++;
                }
                this.f = false;
                V();
            }
            SparseArray sparseParcelableArray = bundle.getSparseParcelableArray(i);
            if (sparseParcelableArray != null) {
                int size2 = this.d.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    e eVar2 = this.d.get(i4);
                    if ((eVar2 instanceof g) && (a2 = ((g) eVar2).a()) != null && (actionView = a2.getActionView()) != null && (c2511Ay1 = (C2511Ay1) sparseParcelableArray.get(a2.getItemId())) != null) {
                        actionView.restoreHierarchyState(c2511Ay1);
                    }
                }
            }
        }

        public final void X(View view, int i2, boolean z) {
            C6516gH2.I1(view, new a(i2, z));
        }

        public void Y(@InterfaceC5670cr1 androidx.appcompat.view.menu.h hVar) {
            if (this.e != hVar && hVar.isCheckable()) {
                androidx.appcompat.view.menu.h hVar2 = this.e;
                if (hVar2 != null) {
                    hVar2.setChecked(false);
                }
                this.e = hVar;
                hVar.setChecked(true);
            }
        }

        public void Z(boolean z) {
            this.f = z;
        }

        public void a0() {
            int size = this.d.size();
            V();
            m();
            if (size == this.d.size()) {
                r(0, this.d.size());
            }
        }

        public final void b0() {
            for (int i2 = 0; i2 < this.d.size(); i2++) {
                if (this.d.get(i2) instanceof f) {
                    n(i2);
                }
            }
        }

        public final void c0() {
            for (int i2 = 0; i2 < this.d.size(); i2++) {
                if ((this.d.get(i2) instanceof g) && i(i2) == 1) {
                    n(i2);
                }
            }
        }

        public final void d0() {
            for (int i2 = 0; i2 < this.d.size(); i2++) {
                if ((this.d.get(i2) instanceof g) && i(i2) == 0) {
                    n(i2);
                }
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0370h
        public int g() {
            return this.d.size();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0370h
        public long h(int i2) {
            return i2;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0370h
        public int i(int i2) {
            e eVar = this.d.get(i2);
            if (eVar instanceof f) {
                return 2;
            }
            if (eVar instanceof d) {
                return 3;
            }
            if (eVar instanceof g) {
                if (((g) eVar).a().hasSubMenu()) {
                    return 1;
                }
                return 0;
            }
            throw new RuntimeException("Unknown item type.");
        }
    }

    /* renamed from: o.cp1$d */
    /* loaded from: classes3.dex */
    public static class d implements e {
    }

    /* renamed from: o.cp1$e */
    /* loaded from: classes3.dex */
    public interface e {
    }

    /* renamed from: o.cp1$f */
    /* loaded from: classes3.dex */
    public static class f implements e {
        public final int a;
        public final int b;

        public f(int i, int i2) {
            this.a = i;
            this.b = i2;
        }

        public int a() {
            return this.b;
        }

        public int b() {
            return this.a;
        }
    }

    /* renamed from: o.cp1$g */
    /* loaded from: classes3.dex */
    public static class g implements e {
        public final androidx.appcompat.view.menu.h a;
        public boolean b;

        public g(androidx.appcompat.view.menu.h hVar) {
            this.a = hVar;
        }

        public androidx.appcompat.view.menu.h a() {
            return this.a;
        }
    }

    /* renamed from: o.cp1$h */
    /* loaded from: classes3.dex */
    public class h extends androidx.recyclerview.widget.v {
        public h(@InterfaceC5670cr1 RecyclerView recyclerView) {
            super(recyclerView);
        }

        @Override // androidx.recyclerview.widget.v, o.Q3
        public void g(View view, @InterfaceC5670cr1 C10861y4 c10861y4) {
            super.g(view, c10861y4);
            c10861y4.m1(C10861y4.f.g(C5662cp1.this.a1.R(), 1, false));
        }
    }

    /* renamed from: o.cp1$i */
    /* loaded from: classes3.dex */
    public static class i extends l {
        public i(@InterfaceC5670cr1 LayoutInflater layoutInflater, ViewGroup viewGroup, View.OnClickListener onClickListener) {
            super(layoutInflater.inflate(C7025iN1.k.design_navigation_item, viewGroup, false));
            this.a.setOnClickListener(onClickListener);
        }
    }

    /* renamed from: o.cp1$j */
    /* loaded from: classes3.dex */
    public static class j extends l {
        public j(@InterfaceC5670cr1 LayoutInflater layoutInflater, ViewGroup viewGroup) {
            super(layoutInflater.inflate(C7025iN1.k.design_navigation_item_separator, viewGroup, false));
        }
    }

    /* renamed from: o.cp1$k */
    /* loaded from: classes3.dex */
    public static class k extends l {
        public k(@InterfaceC5670cr1 LayoutInflater layoutInflater, ViewGroup viewGroup) {
            super(layoutInflater.inflate(C7025iN1.k.design_navigation_item_subheader, viewGroup, false));
        }
    }

    /* renamed from: o.cp1$l */
    /* loaded from: classes3.dex */
    public static abstract class l extends RecyclerView.H {
        public l(View view) {
            super(view);
        }
    }

    @PK1
    public int A() {
        return this.r1;
    }

    @PK1
    public int B() {
        return this.q1;
    }

    public final boolean C() {
        if (r() > 0) {
            return true;
        }
        return false;
    }

    public View D(@BY0 int i2) {
        View inflate = this.b1.inflate(i2, (ViewGroup) this.Y, false);
        m(inflate);
        return inflate;
    }

    public boolean E() {
        return this.t1;
    }

    public void F(@InterfaceC5670cr1 View view) {
        this.Y.removeView(view);
        if (!C()) {
            NavigationMenuView navigationMenuView = this.X;
            navigationMenuView.setPadding(0, this.v1, 0, navigationMenuView.getPaddingBottom());
        }
    }

    public void G(boolean z) {
        if (this.t1 != z) {
            this.t1 = z;
            f0();
        }
    }

    public void H(@InterfaceC5670cr1 androidx.appcompat.view.menu.h hVar) {
        this.a1.Y(hVar);
    }

    public void I(@PK1 int i2) {
        this.p1 = i2;
        c0();
    }

    public void J(@PK1 int i2) {
        this.o1 = i2;
        c0();
    }

    public void K(int i2) {
        this.Z0 = i2;
    }

    public void L(@InterfaceC11300zs1 Drawable drawable) {
        this.i1 = drawable;
        e0();
    }

    public void M(@InterfaceC11300zs1 RippleDrawable rippleDrawable) {
        this.j1 = rippleDrawable;
        e0();
    }

    public void N(int i2) {
        this.k1 = i2;
        e0();
    }

    public void O(int i2) {
        this.m1 = i2;
        e0();
    }

    public void P(@InterfaceC9397s30 int i2) {
        if (this.n1 != i2) {
            this.n1 = i2;
            this.s1 = true;
            e0();
        }
    }

    public void Q(@InterfaceC11300zs1 ColorStateList colorStateList) {
        this.h1 = colorStateList;
        e0();
    }

    public void R(int i2) {
        this.u1 = i2;
        e0();
    }

    public void S(@InterfaceC4698Xf2 int i2) {
        this.e1 = i2;
        e0();
    }

    public void T(boolean z) {
        this.f1 = z;
        e0();
    }

    public void U(@InterfaceC11300zs1 ColorStateList colorStateList) {
        this.g1 = colorStateList;
        e0();
    }

    public void V(@PK1 int i2) {
        this.l1 = i2;
        e0();
    }

    public void W(int i2) {
        this.x1 = i2;
        NavigationMenuView navigationMenuView = this.X;
        if (navigationMenuView != null) {
            navigationMenuView.setOverScrollMode(i2);
        }
    }

    public void X(@InterfaceC11300zs1 ColorStateList colorStateList) {
        this.d1 = colorStateList;
        d0();
    }

    public void Y(@PK1 int i2) {
        this.r1 = i2;
        d0();
    }

    public void Z(@PK1 int i2) {
        this.q1 = i2;
        d0();
    }

    @Override // androidx.appcompat.view.menu.j
    public void a(androidx.appcompat.view.menu.e eVar, boolean z) {
        j.a aVar = this.Z;
        if (aVar != null) {
            aVar.a(eVar, z);
        }
    }

    public void a0(@InterfaceC4698Xf2 int i2) {
        this.c1 = i2;
        d0();
    }

    public void b0(boolean z) {
        c cVar = this.a1;
        if (cVar != null) {
            cVar.Z(z);
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public boolean c(androidx.appcompat.view.menu.e eVar, androidx.appcompat.view.menu.h hVar) {
        return false;
    }

    public final void c0() {
        c cVar = this.a1;
        if (cVar != null) {
            cVar.b0();
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public void d(j.a aVar) {
        this.Z = aVar;
    }

    public final void d0() {
        c cVar = this.a1;
        if (cVar != null) {
            cVar.c0();
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public void e(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:list");
            if (sparseParcelableArray != null) {
                this.X.restoreHierarchyState(sparseParcelableArray);
            }
            Bundle bundle2 = bundle.getBundle(B1);
            if (bundle2 != null) {
                this.a1.W(bundle2);
            }
            SparseArray<Parcelable> sparseParcelableArray2 = bundle.getSparseParcelableArray(C1);
            if (sparseParcelableArray2 != null) {
                this.Y.restoreHierarchyState(sparseParcelableArray2);
            }
        }
    }

    public final void e0() {
        c cVar = this.a1;
        if (cVar != null) {
            cVar.d0();
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public boolean f(androidx.appcompat.view.menu.m mVar) {
        return false;
    }

    public final void f0() {
        int i2;
        if (!C() && this.t1) {
            i2 = this.v1;
        } else {
            i2 = 0;
        }
        NavigationMenuView navigationMenuView = this.X;
        navigationMenuView.setPadding(0, i2, 0, navigationMenuView.getPaddingBottom());
    }

    @Override // androidx.appcompat.view.menu.j
    public androidx.appcompat.view.menu.k g(ViewGroup viewGroup) {
        if (this.X == null) {
            NavigationMenuView navigationMenuView = (NavigationMenuView) this.b1.inflate(C7025iN1.k.design_navigation_menu, viewGroup, false);
            this.X = navigationMenuView;
            navigationMenuView.setAccessibilityDelegateCompat(new h(this.X));
            if (this.a1 == null) {
                c cVar = new c();
                this.a1 = cVar;
                cVar.G(true);
            }
            int i2 = this.x1;
            if (i2 != -1) {
                this.X.setOverScrollMode(i2);
            }
            LinearLayout linearLayout = (LinearLayout) this.b1.inflate(C7025iN1.k.design_navigation_item_header, (ViewGroup) this.X, false);
            this.Y = linearLayout;
            linearLayout.setImportantForAccessibility(2);
            this.X.setAdapter(this.a1);
        }
        return this.X;
    }

    @Override // androidx.appcompat.view.menu.j
    public int getId() {
        return this.Z0;
    }

    @Override // androidx.appcompat.view.menu.j
    @InterfaceC5670cr1
    public Parcelable h() {
        Bundle bundle = new Bundle();
        if (this.X != null) {
            SparseArray<Parcelable> sparseArray = new SparseArray<>();
            this.X.saveHierarchyState(sparseArray);
            bundle.putSparseParcelableArray("android:menu:list", sparseArray);
        }
        c cVar = this.a1;
        if (cVar != null) {
            bundle.putBundle(B1, cVar.P());
        }
        if (this.Y != null) {
            SparseArray<Parcelable> sparseArray2 = new SparseArray<>();
            this.Y.saveHierarchyState(sparseArray2);
            bundle.putSparseParcelableArray(C1, sparseArray2);
        }
        return bundle;
    }

    @Override // androidx.appcompat.view.menu.j
    public void i(boolean z) {
        c cVar = this.a1;
        if (cVar != null) {
            cVar.a0();
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public boolean j() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public boolean k(androidx.appcompat.view.menu.e eVar, androidx.appcompat.view.menu.h hVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public void l(@InterfaceC5670cr1 Context context, @InterfaceC5670cr1 androidx.appcompat.view.menu.e eVar) {
        this.b1 = LayoutInflater.from(context);
        this.Y0 = eVar;
        this.w1 = context.getResources().getDimensionPixelOffset(C7025iN1.f.design_navigation_separator_vertical_padding);
    }

    public void m(@InterfaceC5670cr1 View view) {
        this.Y.addView(view);
        NavigationMenuView navigationMenuView = this.X;
        navigationMenuView.setPadding(0, 0, 0, navigationMenuView.getPaddingBottom());
    }

    public void n(@InterfaceC5670cr1 RL2 rl2) {
        int r = rl2.r();
        if (this.v1 != r) {
            this.v1 = r;
            f0();
        }
        NavigationMenuView navigationMenuView = this.X;
        navigationMenuView.setPadding(0, navigationMenuView.getPaddingTop(), 0, rl2.o());
        C6516gH2.q(this.Y, rl2);
    }

    @InterfaceC11300zs1
    public androidx.appcompat.view.menu.h o() {
        return this.a1.Q();
    }

    @PK1
    public int p() {
        return this.p1;
    }

    @PK1
    public int q() {
        return this.o1;
    }

    public int r() {
        return this.Y.getChildCount();
    }

    public View s(int i2) {
        return this.Y.getChildAt(i2);
    }

    @InterfaceC11300zs1
    public Drawable t() {
        return this.i1;
    }

    public int u() {
        return this.k1;
    }

    public int v() {
        return this.m1;
    }

    public int w() {
        return this.u1;
    }

    @InterfaceC11300zs1
    public ColorStateList x() {
        return this.g1;
    }

    @InterfaceC11300zs1
    public ColorStateList y() {
        return this.h1;
    }

    @PK1
    public int z() {
        return this.l1;
    }
}
