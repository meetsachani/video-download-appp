package androidx.viewpager2.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.u;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import o.C10861y4;
import o.C6381fn0;
import o.C6516gH2;
import o.G4;
import o.IM1;
import o.InterfaceC2526Bc2;

/* loaded from: classes.dex */
public final class ViewPager2 extends ViewGroup {
    public static final int s1 = 0;
    public static final int t1 = 1;
    public static final int u1 = 0;
    public static final int v1 = 1;
    public static final int w1 = 2;
    public static final int x1 = -1;
    public static boolean y1 = true;
    public final Rect Y0;
    public final Rect Z0;
    public androidx.viewpager2.widget.a a1;
    public int b1;
    public boolean c1;
    public RecyclerView.j d1;
    public LinearLayoutManager e1;
    public int f1;
    public Parcelable g1;
    public RecyclerView h1;
    public u i1;
    public androidx.viewpager2.widget.e j1;
    public androidx.viewpager2.widget.a k1;
    public C6381fn0 l1;
    public androidx.viewpager2.widget.d m1;
    public RecyclerView.m n1;
    public boolean o1;
    public boolean p1;
    public int q1;
    public e r1;

    /* loaded from: classes.dex */
    public class a extends g {
        public a() {
            super(null);
        }

        @Override // androidx.viewpager2.widget.ViewPager2.g, androidx.recyclerview.widget.RecyclerView.j
        public void a() {
            ViewPager2 viewPager2 = ViewPager2.this;
            viewPager2.c1 = true;
            viewPager2.j1.n();
        }
    }

    /* loaded from: classes.dex */
    public class b extends j {
        public b() {
        }

        @Override // androidx.viewpager2.widget.ViewPager2.j
        public void a(int i) {
            if (i == 0) {
                ViewPager2.this.y();
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.j
        public void c(int i) {
            ViewPager2 viewPager2 = ViewPager2.this;
            if (viewPager2.b1 != i) {
                viewPager2.b1 = i;
                viewPager2.r1.q();
            }
        }
    }

    /* loaded from: classes.dex */
    public class c extends j {
        public c() {
        }

        @Override // androidx.viewpager2.widget.ViewPager2.j
        public void c(int i) {
            ViewPager2.this.clearFocus();
            if (ViewPager2.this.hasFocus()) {
                ViewPager2.this.h1.requestFocus(2);
            }
        }
    }

    /* loaded from: classes.dex */
    public class d implements RecyclerView.r {
        public d() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.r
        public void b(View view) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.r
        public void d(View view) {
            RecyclerView.q qVar = (RecyclerView.q) view.getLayoutParams();
            if (((ViewGroup.MarginLayoutParams) qVar).width == -1 && ((ViewGroup.MarginLayoutParams) qVar).height == -1) {
                return;
            }
            throw new IllegalStateException("Pages must fill the whole ViewPager2 (use match_parent)");
        }
    }

    /* loaded from: classes.dex */
    public abstract class e {
        public e() {
        }

        public boolean a() {
            return false;
        }

        public boolean b(int i) {
            return false;
        }

        public boolean c(int i, Bundle bundle) {
            return false;
        }

        public boolean d() {
            return false;
        }

        public void e(RecyclerView.AbstractC0370h<?> abstractC0370h) {
        }

        public void f(RecyclerView.AbstractC0370h<?> abstractC0370h) {
        }

        public String g() {
            throw new IllegalStateException("Not implemented.");
        }

        public void h(androidx.viewpager2.widget.a aVar, RecyclerView recyclerView) {
        }

        public void i(AccessibilityNodeInfo accessibilityNodeInfo) {
        }

        public boolean k(int i) {
            throw new IllegalStateException("Not implemented.");
        }

        public boolean l(int i, Bundle bundle) {
            throw new IllegalStateException("Not implemented.");
        }

        public void m() {
        }

        public CharSequence n() {
            throw new IllegalStateException("Not implemented.");
        }

        public void o(AccessibilityEvent accessibilityEvent) {
        }

        public void p() {
        }

        public void q() {
        }

        public void r() {
        }

        public void s() {
        }

        public /* synthetic */ e(ViewPager2 viewPager2, a aVar) {
            this();
        }

        public void j(C10861y4 c10861y4) {
        }
    }

    /* loaded from: classes.dex */
    public class f extends e {
        public f() {
            super(ViewPager2.this, null);
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public boolean b(int i) {
            if ((i == 8192 || i == 4096) && !ViewPager2.this.l()) {
                return true;
            }
            return false;
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public boolean d() {
            return true;
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public void j(C10861y4 c10861y4) {
            if (!ViewPager2.this.l()) {
                c10861y4.W0(C10861y4.a.s);
                c10861y4.W0(C10861y4.a.r);
                c10861y4.Z1(false);
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public boolean k(int i) {
            if (b(i)) {
                return false;
            }
            throw new IllegalStateException();
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public CharSequence n() {
            if (d()) {
                return "androidx.viewpager.widget.ViewPager";
            }
            throw new IllegalStateException();
        }
    }

    /* loaded from: classes.dex */
    public static abstract class g extends RecyclerView.j {
        public g() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public abstract void a();

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public final void b(int i, int i2) {
            a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public final void c(int i, int i2, Object obj) {
            a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public final void d(int i, int i2) {
            a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public final void e(int i, int i2, int i3) {
            a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public final void f(int i, int i2) {
            a();
        }

        public /* synthetic */ g(a aVar) {
            this();
        }
    }

    /* loaded from: classes.dex */
    public class h extends LinearLayoutManager {
        public h(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.p
        public boolean C1(RecyclerView.x xVar, RecyclerView.D d, int i, Bundle bundle) {
            if (ViewPager2.this.r1.b(i)) {
                return ViewPager2.this.r1.k(i);
            }
            return super.C1(xVar, d, i, bundle);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.p
        public boolean Q1(RecyclerView recyclerView, View view, Rect rect, boolean z, boolean z2) {
            return false;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.p
        public void h1(RecyclerView.x xVar, RecyclerView.D d, C10861y4 c10861y4) {
            super.h1(xVar, d, c10861y4);
            ViewPager2.this.r1.j(c10861y4);
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager
        public void o2(RecyclerView.D d, int[] iArr) {
            int offscreenPageLimit = ViewPager2.this.getOffscreenPageLimit();
            if (offscreenPageLimit == -1) {
                super.o2(d, iArr);
                return;
            }
            int pageSize = ViewPager2.this.getPageSize() * offscreenPageLimit;
            iArr[0] = pageSize;
            iArr[1] = pageSize;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface i {
    }

    /* loaded from: classes.dex */
    public static abstract class j {
        public void a(int i) {
        }

        public void b(int i, float f, int i2) {
        }

        public void c(int i) {
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface k {
    }

    /* loaded from: classes.dex */
    public class l extends e {
        public final G4 b;
        public final G4 c;
        public RecyclerView.j d;

        /* loaded from: classes.dex */
        public class a implements G4 {
            public a() {
            }

            @Override // o.G4
            public boolean a(View view, G4.a aVar) {
                l.this.v(((ViewPager2) view).getCurrentItem() + 1);
                return true;
            }
        }

        /* loaded from: classes.dex */
        public class b implements G4 {
            public b() {
            }

            @Override // o.G4
            public boolean a(View view, G4.a aVar) {
                l.this.v(((ViewPager2) view).getCurrentItem() - 1);
                return true;
            }
        }

        /* loaded from: classes.dex */
        public class c extends g {
            public c() {
                super(null);
            }

            @Override // androidx.viewpager2.widget.ViewPager2.g, androidx.recyclerview.widget.RecyclerView.j
            public void a() {
                l.this.w();
            }
        }

        public l() {
            super(ViewPager2.this, null);
            this.b = new a();
            this.c = new b();
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public boolean a() {
            return true;
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public boolean c(int i, Bundle bundle) {
            return i == 8192 || i == 4096;
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public void e(RecyclerView.AbstractC0370h<?> abstractC0370h) {
            w();
            if (abstractC0370h != null) {
                abstractC0370h.F(this.d);
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public void f(RecyclerView.AbstractC0370h<?> abstractC0370h) {
            if (abstractC0370h != null) {
                abstractC0370h.I(this.d);
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public String g() {
            if (a()) {
                return "androidx.viewpager.widget.ViewPager";
            }
            throw new IllegalStateException();
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public void h(androidx.viewpager2.widget.a aVar, RecyclerView recyclerView) {
            C6516gH2.a2(recyclerView, 2);
            this.d = new c();
            if (C6516gH2.Z(ViewPager2.this) == 0) {
                C6516gH2.a2(ViewPager2.this, 1);
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public void i(AccessibilityNodeInfo accessibilityNodeInfo) {
            t(accessibilityNodeInfo);
            u(accessibilityNodeInfo);
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public boolean l(int i, Bundle bundle) {
            int currentItem;
            if (c(i, bundle)) {
                if (i == 8192) {
                    currentItem = ViewPager2.this.getCurrentItem() - 1;
                } else {
                    currentItem = ViewPager2.this.getCurrentItem() + 1;
                }
                v(currentItem);
                return true;
            }
            throw new IllegalStateException();
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public void m() {
            w();
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public void o(AccessibilityEvent accessibilityEvent) {
            accessibilityEvent.setSource(ViewPager2.this);
            accessibilityEvent.setClassName(g());
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public void p() {
            w();
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public void q() {
            w();
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public void r() {
            w();
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public void s() {
            w();
        }

        public final void t(AccessibilityNodeInfo accessibilityNodeInfo) {
            int i;
            int i2;
            if (ViewPager2.this.getAdapter() != null) {
                if (ViewPager2.this.getOrientation() == 1) {
                    i = ViewPager2.this.getAdapter().g();
                    i2 = 0;
                } else {
                    i2 = ViewPager2.this.getAdapter().g();
                    i = 0;
                }
            } else {
                i = 0;
                i2 = 0;
            }
            C10861y4.t2(accessibilityNodeInfo).m1(C10861y4.f.h(i, i2, false, 0));
        }

        public final void u(AccessibilityNodeInfo accessibilityNodeInfo) {
            int g;
            RecyclerView.AbstractC0370h adapter = ViewPager2.this.getAdapter();
            if (adapter != null && (g = adapter.g()) != 0 && ViewPager2.this.l()) {
                if (ViewPager2.this.b1 > 0) {
                    accessibilityNodeInfo.addAction(8192);
                }
                if (ViewPager2.this.b1 < g - 1) {
                    accessibilityNodeInfo.addAction(4096);
                }
                accessibilityNodeInfo.setScrollable(true);
            }
        }

        public void v(int i) {
            if (ViewPager2.this.l()) {
                ViewPager2.this.t(i, true);
            }
        }

        public void w() {
            int g;
            int i;
            ViewPager2 viewPager2 = ViewPager2.this;
            int i2 = 16908360;
            C6516gH2.y1(viewPager2, 16908360);
            C6516gH2.y1(viewPager2, 16908361);
            C6516gH2.y1(viewPager2, 16908358);
            C6516gH2.y1(viewPager2, 16908359);
            if (ViewPager2.this.getAdapter() != null && (g = ViewPager2.this.getAdapter().g()) != 0 && ViewPager2.this.l()) {
                if (ViewPager2.this.getOrientation() == 0) {
                    boolean k = ViewPager2.this.k();
                    if (k) {
                        i = 16908360;
                    } else {
                        i = 16908361;
                    }
                    if (k) {
                        i2 = 16908361;
                    }
                    if (ViewPager2.this.b1 < g - 1) {
                        C6516gH2.B1(viewPager2, new C10861y4.a(i, null), null, this.b);
                    }
                    if (ViewPager2.this.b1 > 0) {
                        C6516gH2.B1(viewPager2, new C10861y4.a(i2, null), null, this.c);
                        return;
                    }
                    return;
                }
                if (ViewPager2.this.b1 < g - 1) {
                    C6516gH2.B1(viewPager2, new C10861y4.a(16908359, null), null, this.b);
                }
                if (ViewPager2.this.b1 > 0) {
                    C6516gH2.B1(viewPager2, new C10861y4.a(16908358, null), null, this.c);
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public interface m {
        void a(View view, float f);
    }

    /* loaded from: classes.dex */
    public class n extends u {
        public n() {
        }

        @Override // androidx.recyclerview.widget.u, androidx.recyclerview.widget.y
        public View h(RecyclerView.p pVar) {
            if (ViewPager2.this.j()) {
                return null;
            }
            return super.h(pVar);
        }
    }

    /* loaded from: classes.dex */
    public class o extends RecyclerView {
        public o(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
        public CharSequence getAccessibilityClassName() {
            if (ViewPager2.this.r1.d()) {
                return ViewPager2.this.r1.n();
            }
            return super.getAccessibilityClassName();
        }

        @Override // android.view.View
        public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            accessibilityEvent.setFromIndex(ViewPager2.this.b1);
            accessibilityEvent.setToIndex(ViewPager2.this.b1);
            ViewPager2.this.r1.o(accessibilityEvent);
        }

        @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            if (ViewPager2.this.l() && super.onInterceptTouchEvent(motionEvent)) {
                return true;
            }
            return false;
        }

        @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
        public boolean onTouchEvent(MotionEvent motionEvent) {
            if (ViewPager2.this.l() && super.onTouchEvent(motionEvent)) {
                return true;
            }
            return false;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface q {
    }

    /* loaded from: classes.dex */
    public static class r implements Runnable {
        public final int X;
        public final RecyclerView Y;

        public r(int i, RecyclerView recyclerView) {
            this.X = i;
            this.Y = recyclerView;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.Y.V1(this.X);
        }
    }

    public ViewPager2(Context context) {
        super(context);
        this.Y0 = new Rect();
        this.Z0 = new Rect();
        this.a1 = new androidx.viewpager2.widget.a(3);
        this.c1 = false;
        this.d1 = new a();
        this.f1 = -1;
        this.n1 = null;
        this.o1 = false;
        this.p1 = true;
        this.q1 = -1;
        h(context, null);
    }

    public void a(RecyclerView.o oVar) {
        this.h1.n(oVar);
    }

    public void b(RecyclerView.o oVar, int i2) {
        this.h1.o(oVar, i2);
    }

    public boolean c() {
        return this.l1.b();
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int i2) {
        return this.h1.canScrollHorizontally(i2);
    }

    @Override // android.view.View
    public boolean canScrollVertically(int i2) {
        return this.h1.canScrollVertically(i2);
    }

    public boolean d() {
        return this.l1.d();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        Parcelable parcelable = sparseArray.get(getId());
        if (parcelable instanceof p) {
            int i2 = ((p) parcelable).X;
            sparseArray.put(this.h1.getId(), sparseArray.get(i2));
            sparseArray.remove(i2);
        }
        super.dispatchRestoreInstanceState(sparseArray);
        r();
    }

    public final RecyclerView.r e() {
        return new d();
    }

    public boolean f(float f2) {
        return this.l1.e(f2);
    }

    public RecyclerView.o g(int i2) {
        return this.h1.D0(i2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        if (this.r1.a()) {
            return this.r1.g();
        }
        return super.getAccessibilityClassName();
    }

    public RecyclerView.AbstractC0370h getAdapter() {
        return this.h1.getAdapter();
    }

    public int getCurrentItem() {
        return this.b1;
    }

    public int getItemDecorationCount() {
        return this.h1.getItemDecorationCount();
    }

    public int getOffscreenPageLimit() {
        return this.q1;
    }

    public int getOrientation() {
        return this.e1.Q2();
    }

    public int getPageSize() {
        int height;
        int paddingBottom;
        RecyclerView recyclerView = this.h1;
        if (getOrientation() == 0) {
            height = recyclerView.getWidth() - recyclerView.getPaddingLeft();
            paddingBottom = recyclerView.getPaddingRight();
        } else {
            height = recyclerView.getHeight() - recyclerView.getPaddingTop();
            paddingBottom = recyclerView.getPaddingBottom();
        }
        return height - paddingBottom;
    }

    public int getScrollState() {
        return this.j1.h();
    }

    public final void h(Context context, AttributeSet attributeSet) {
        e fVar;
        if (y1) {
            fVar = new l();
        } else {
            fVar = new f();
        }
        this.r1 = fVar;
        o oVar = new o(context);
        this.h1 = oVar;
        oVar.setId(C6516gH2.F());
        this.h1.setDescendantFocusability(131072);
        h hVar = new h(context);
        this.e1 = hVar;
        this.h1.setLayoutManager(hVar);
        this.h1.setScrollingTouchSlop(1);
        u(context, attributeSet);
        this.h1.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        this.h1.p(e());
        androidx.viewpager2.widget.e eVar = new androidx.viewpager2.widget.e(this);
        this.j1 = eVar;
        this.l1 = new C6381fn0(this, eVar, this.h1);
        n nVar = new n();
        this.i1 = nVar;
        nVar.b(this.h1);
        this.h1.r(this.j1);
        androidx.viewpager2.widget.a aVar = new androidx.viewpager2.widget.a(3);
        this.k1 = aVar;
        this.j1.r(aVar);
        b bVar = new b();
        c cVar = new c();
        this.k1.d(bVar);
        this.k1.d(cVar);
        this.r1.h(this.k1, this.h1);
        this.k1.d(this.a1);
        androidx.viewpager2.widget.d dVar = new androidx.viewpager2.widget.d(this.e1);
        this.m1 = dVar;
        this.k1.d(dVar);
        RecyclerView recyclerView = this.h1;
        attachViewToParent(recyclerView, 0, recyclerView.getLayoutParams());
    }

    public void i() {
        this.h1.O0();
    }

    public boolean j() {
        return this.l1.f();
    }

    public boolean k() {
        if (this.e1.m0() == 1) {
            return true;
        }
        return false;
    }

    public boolean l() {
        return this.p1;
    }

    public final void m(RecyclerView.AbstractC0370h<?> abstractC0370h) {
        if (abstractC0370h != null) {
            abstractC0370h.F(this.d1);
        }
    }

    public void n(j jVar) {
        this.a1.d(jVar);
    }

    public void o(RecyclerView.o oVar) {
        this.h1.y1(oVar);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        this.r1.i(accessibilityNodeInfo);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        int measuredWidth = this.h1.getMeasuredWidth();
        int measuredHeight = this.h1.getMeasuredHeight();
        this.Y0.left = getPaddingLeft();
        this.Y0.right = (i4 - i2) - getPaddingRight();
        this.Y0.top = getPaddingTop();
        this.Y0.bottom = (i5 - i3) - getPaddingBottom();
        Gravity.apply(8388659, measuredWidth, measuredHeight, this.Y0, this.Z0);
        RecyclerView recyclerView = this.h1;
        Rect rect = this.Z0;
        recyclerView.layout(rect.left, rect.top, rect.right, rect.bottom);
        if (this.c1) {
            y();
        }
    }

    @Override // android.view.View
    public void onMeasure(int i2, int i3) {
        measureChild(this.h1, i2, i3);
        int measuredWidth = this.h1.getMeasuredWidth();
        int measuredHeight = this.h1.getMeasuredHeight();
        int measuredState = this.h1.getMeasuredState();
        int paddingLeft = measuredWidth + getPaddingLeft() + getPaddingRight();
        int paddingTop = measuredHeight + getPaddingTop() + getPaddingBottom();
        setMeasuredDimension(View.resolveSizeAndState(Math.max(paddingLeft, getSuggestedMinimumWidth()), i2, measuredState), View.resolveSizeAndState(Math.max(paddingTop, getSuggestedMinimumHeight()), i3, measuredState << 16));
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof p)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        p pVar = (p) parcelable;
        super.onRestoreInstanceState(pVar.getSuperState());
        this.f1 = pVar.Y;
        this.g1 = pVar.Z;
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        p pVar = new p(super.onSaveInstanceState());
        pVar.X = this.h1.getId();
        int i2 = this.f1;
        if (i2 == -1) {
            i2 = this.b1;
        }
        pVar.Y = i2;
        Parcelable parcelable = this.g1;
        if (parcelable != null) {
            pVar.Z = parcelable;
            return pVar;
        }
        RecyclerView.AbstractC0370h adapter = this.h1.getAdapter();
        if (adapter instanceof InterfaceC2526Bc2) {
            pVar.Z = ((InterfaceC2526Bc2) adapter).a();
        }
        return pVar;
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View view) {
        throw new IllegalStateException(ViewPager2.class.getSimpleName() + " does not support direct child views");
    }

    public void p(int i2) {
        this.h1.z1(i2);
    }

    @Override // android.view.View
    public boolean performAccessibilityAction(int i2, Bundle bundle) {
        if (this.r1.c(i2, bundle)) {
            return this.r1.l(i2, bundle);
        }
        return super.performAccessibilityAction(i2, bundle);
    }

    public void q() {
        if (this.m1.d() == null) {
            return;
        }
        double g2 = this.j1.g();
        int i2 = (int) g2;
        float f2 = (float) (g2 - i2);
        this.m1.b(i2, f2, Math.round(getPageSize() * f2));
    }

    public final void r() {
        RecyclerView.AbstractC0370h adapter;
        if (this.f1 == -1 || (adapter = getAdapter()) == null) {
            return;
        }
        Parcelable parcelable = this.g1;
        if (parcelable != null) {
            if (adapter instanceof InterfaceC2526Bc2) {
                ((InterfaceC2526Bc2) adapter).b(parcelable);
            }
            this.g1 = null;
        }
        int max = Math.max(0, Math.min(this.f1, adapter.g() - 1));
        this.b1 = max;
        this.f1 = -1;
        this.h1.M1(max);
        this.r1.m();
    }

    public void s(int i2, boolean z) {
        if (!j()) {
            t(i2, z);
            return;
        }
        throw new IllegalStateException("Cannot change current item when ViewPager2 is fake dragging");
    }

    public void setAdapter(RecyclerView.AbstractC0370h abstractC0370h) {
        RecyclerView.AbstractC0370h adapter = this.h1.getAdapter();
        this.r1.f(adapter);
        w(adapter);
        this.h1.setAdapter(abstractC0370h);
        this.b1 = 0;
        r();
        this.r1.e(abstractC0370h);
        m(abstractC0370h);
    }

    public void setCurrentItem(int i2) {
        s(i2, true);
    }

    @Override // android.view.View
    public void setLayoutDirection(int i2) {
        super.setLayoutDirection(i2);
        this.r1.p();
    }

    public void setOffscreenPageLimit(int i2) {
        if (i2 < 1 && i2 != -1) {
            throw new IllegalArgumentException("Offscreen page limit must be OFFSCREEN_PAGE_LIMIT_DEFAULT or a number > 0");
        }
        this.q1 = i2;
        this.h1.requestLayout();
    }

    public void setOrientation(int i2) {
        this.e1.j3(i2);
        this.r1.r();
    }

    public void setPageTransformer(m mVar) {
        if (mVar != null) {
            if (!this.o1) {
                this.n1 = this.h1.getItemAnimator();
                this.o1 = true;
            }
            this.h1.setItemAnimator(null);
        } else if (this.o1) {
            this.h1.setItemAnimator(this.n1);
            this.n1 = null;
            this.o1 = false;
        }
        if (mVar == this.m1.d()) {
            return;
        }
        this.m1.e(mVar);
        q();
    }

    public void setUserInputEnabled(boolean z) {
        this.p1 = z;
        this.r1.s();
    }

    public void t(int i2, boolean z) {
        int i3;
        RecyclerView.AbstractC0370h adapter = getAdapter();
        if (adapter == null) {
            if (this.f1 != -1) {
                this.f1 = Math.max(i2, 0);
            }
        } else if (adapter.g() > 0) {
            int min = Math.min(Math.max(i2, 0), adapter.g() - 1);
            if (min != this.b1 || !this.j1.k()) {
                int i4 = this.b1;
                if (min == i4 && z) {
                    return;
                }
                double d2 = i4;
                this.b1 = min;
                this.r1.q();
                if (!this.j1.k()) {
                    d2 = this.j1.g();
                }
                this.j1.p(min, z);
                if (!z) {
                    this.h1.M1(min);
                    return;
                }
                double d3 = min;
                if (Math.abs(d3 - d2) > 3.0d) {
                    RecyclerView recyclerView = this.h1;
                    if (d3 > d2) {
                        i3 = min - 3;
                    } else {
                        i3 = min + 3;
                    }
                    recyclerView.M1(i3);
                    RecyclerView recyclerView2 = this.h1;
                    recyclerView2.post(new r(min, recyclerView2));
                    return;
                }
                this.h1.V1(min);
            }
        }
    }

    public final void u(Context context, AttributeSet attributeSet) {
        int[] iArr = IM1.j.d0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
        if (Build.VERSION.SDK_INT >= 29) {
            saveAttributeDataForStyleable(context, iArr, attributeSet, obtainStyledAttributes, 0, 0);
        }
        try {
            setOrientation(obtainStyledAttributes.getInt(IM1.j.e0, 0));
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public void v() {
        View h2 = this.i1.h(this.e1);
        if (h2 != null) {
            int[] c2 = this.i1.c(this.e1, h2);
            int i2 = c2[0];
            if (i2 == 0 && c2[1] == 0) {
                return;
            }
            this.h1.R1(i2, c2[1]);
        }
    }

    public final void w(RecyclerView.AbstractC0370h<?> abstractC0370h) {
        if (abstractC0370h != null) {
            abstractC0370h.I(this.d1);
        }
    }

    public void x(j jVar) {
        this.a1.e(jVar);
    }

    public void y() {
        u uVar = this.i1;
        if (uVar != null) {
            View h2 = uVar.h(this.e1);
            if (h2 == null) {
                return;
            }
            int w0 = this.e1.w0(h2);
            if (w0 != this.b1 && getScrollState() == 0) {
                this.k1.c(w0);
            }
            this.c1 = false;
            return;
        }
        throw new IllegalStateException("Design assumption violated.");
    }

    /* loaded from: classes.dex */
    public static class p extends View.BaseSavedState {
        public static final Parcelable.Creator<p> CREATOR = new a();
        public int X;
        public int Y;
        public Parcelable Z;

        /* loaded from: classes.dex */
        public static class a implements Parcelable.ClassLoaderCreator<p> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public p createFromParcel(Parcel parcel) {
                return createFromParcel(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b */
            public p createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new p(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c */
            public p[] newArray(int i) {
                return new p[i];
            }
        }

        public p(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            a(parcel, classLoader);
        }

        public final void a(Parcel parcel, ClassLoader classLoader) {
            this.X = parcel.readInt();
            this.Y = parcel.readInt();
            this.Z = parcel.readParcelable(classLoader);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.X);
            parcel.writeInt(this.Y);
            parcel.writeParcelable(this.Z, i);
        }

        public p(Parcel parcel) {
            super(parcel);
            a(parcel, null);
        }

        public p(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public ViewPager2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.Y0 = new Rect();
        this.Z0 = new Rect();
        this.a1 = new androidx.viewpager2.widget.a(3);
        this.c1 = false;
        this.d1 = new a();
        this.f1 = -1;
        this.n1 = null;
        this.o1 = false;
        this.p1 = true;
        this.q1 = -1;
        h(context, attributeSet);
    }

    public ViewPager2(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.Y0 = new Rect();
        this.Z0 = new Rect();
        this.a1 = new androidx.viewpager2.widget.a(3);
        this.c1 = false;
        this.d1 = new a();
        this.f1 = -1;
        this.n1 = null;
        this.o1 = false;
        this.p1 = true;
        this.q1 = -1;
        h(context, attributeSet);
    }

    public ViewPager2(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
        this.Y0 = new Rect();
        this.Z0 = new Rect();
        this.a1 = new androidx.viewpager2.widget.a(3);
        this.c1 = false;
        this.d1 = new a();
        this.f1 = -1;
        this.n1 = null;
        this.o1 = false;
        this.p1 = true;
        this.q1 = -1;
        h(context, attributeSet);
    }
}
