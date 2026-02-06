package androidx.viewpager.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.SoundEffectConstants;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.Scroller;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import o.AbstractC3694Mx1;
import o.C10201vM;
import o.C10861y4;
import o.C6516gH2;
import o.InterfaceC10336vu1;
import o.J;
import o.Q3;
import o.RL2;

/* loaded from: classes.dex */
public class ViewPager extends ViewGroup {
    public static final String d2 = "ViewPager";
    public static final boolean e2 = false;
    public static final boolean f2 = false;
    public static final int g2 = 1;
    public static final int h2 = 600;
    public static final int i2 = 25;
    public static final int j2 = 16;
    public static final int k2 = 400;
    public static final int o2 = -1;
    public static final int p2 = 2;
    public static final int q2 = 0;
    public static final int r2 = 1;
    public static final int s2 = 2;
    public static final int u2 = 0;
    public static final int v2 = 1;
    public static final int w2 = 2;
    public int A1;
    public float B1;
    public float C1;
    public float D1;
    public float E1;
    public int F1;
    public VelocityTracker G1;
    public int H1;
    public int I1;
    public int J1;
    public int K1;
    public boolean L1;
    public long M1;
    public EdgeEffect N1;
    public EdgeEffect O1;
    public boolean P1;
    public boolean Q1;
    public boolean R1;
    public int S1;
    public List<j> T1;
    public j U1;
    public j V1;
    public List<i> W1;
    public k X1;
    public int Y0;
    public int Y1;
    public final ArrayList<f> Z0;
    public int Z1;
    public final f a1;
    public ArrayList<View> a2;
    public final Rect b1;
    public final Runnable b2;
    public AbstractC3694Mx1 c1;
    public int c2;
    public int d1;
    public int e1;
    public Parcelable f1;
    public ClassLoader g1;
    public Scroller h1;
    public boolean i1;
    public l j1;
    public int k1;
    public Drawable l1;
    public int m1;
    public int n1;
    public float o1;
    public float p1;
    public int q1;
    public int r1;
    public boolean s1;
    public boolean t1;
    public boolean u1;
    public int v1;
    public boolean w1;
    public boolean x1;
    public int y1;
    public int z1;
    public static final int[] l2 = {16842931};
    public static final Comparator<f> m2 = new a();
    public static final Interpolator n2 = new b();
    public static final o t2 = new o();

    /* loaded from: classes.dex */
    public static class a implements Comparator<f> {
        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(f fVar, f fVar2) {
            return fVar.b - fVar2.b;
        }
    }

    /* loaded from: classes.dex */
    public static class b implements Interpolator {
        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    }

    /* loaded from: classes.dex */
    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ViewPager.this.setScrollState(0);
            ViewPager.this.J();
        }
    }

    /* loaded from: classes.dex */
    public class d implements InterfaceC10336vu1 {
        public final Rect a = new Rect();

        public d() {
        }

        @Override // o.InterfaceC10336vu1
        public RL2 a(View view, RL2 rl2) {
            RL2 l1 = C6516gH2.l1(view, rl2);
            if (l1.A()) {
                return l1;
            }
            Rect rect = this.a;
            rect.left = l1.p();
            rect.top = l1.r();
            rect.right = l1.q();
            rect.bottom = l1.o();
            int childCount = ViewPager.this.getChildCount();
            for (int i = 0; i < childCount; i++) {
                RL2 q = C6516gH2.q(ViewPager.this.getChildAt(i), l1);
                rect.left = Math.min(q.p(), rect.left);
                rect.top = Math.min(q.r(), rect.top);
                rect.right = Math.min(q.q(), rect.right);
                rect.bottom = Math.min(q.o(), rect.bottom);
            }
            return l1.D(rect.left, rect.top, rect.right, rect.bottom);
        }
    }

    @Target({ElementType.TYPE})
    @Inherited
    @Retention(RetentionPolicy.RUNTIME)
    /* loaded from: classes.dex */
    public @interface e {
    }

    /* loaded from: classes.dex */
    public static class f {
        public Object a;
        public int b;
        public boolean c;
        public float d;
        public float e;
    }

    /* loaded from: classes.dex */
    public class h extends Q3 {
        public h() {
        }

        @Override // o.Q3
        public void f(View view, AccessibilityEvent accessibilityEvent) {
            AbstractC3694Mx1 abstractC3694Mx1;
            super.f(view, accessibilityEvent);
            accessibilityEvent.setClassName(ViewPager.class.getName());
            accessibilityEvent.setScrollable(n());
            if (accessibilityEvent.getEventType() == 4096 && (abstractC3694Mx1 = ViewPager.this.c1) != null) {
                accessibilityEvent.setItemCount(abstractC3694Mx1.e());
                accessibilityEvent.setFromIndex(ViewPager.this.d1);
                accessibilityEvent.setToIndex(ViewPager.this.d1);
            }
        }

        @Override // o.Q3
        public void g(View view, C10861y4 c10861y4) {
            super.g(view, c10861y4);
            c10861y4.k1(ViewPager.class.getName());
            c10861y4.Z1(n());
            if (ViewPager.this.canScrollHorizontally(1)) {
                c10861y4.a(4096);
            }
            if (ViewPager.this.canScrollHorizontally(-1)) {
                c10861y4.a(8192);
            }
        }

        @Override // o.Q3
        public boolean j(View view, int i, Bundle bundle) {
            if (super.j(view, i, bundle)) {
                return true;
            }
            if (i != 4096) {
                if (i != 8192 || !ViewPager.this.canScrollHorizontally(-1)) {
                    return false;
                }
                ViewPager viewPager = ViewPager.this;
                viewPager.setCurrentItem(viewPager.d1 - 1);
                return true;
            } else if (!ViewPager.this.canScrollHorizontally(1)) {
                return false;
            } else {
                ViewPager viewPager2 = ViewPager.this;
                viewPager2.setCurrentItem(viewPager2.d1 + 1);
                return true;
            }
        }

        public final boolean n() {
            AbstractC3694Mx1 abstractC3694Mx1 = ViewPager.this.c1;
            if (abstractC3694Mx1 != null && abstractC3694Mx1.e() > 1) {
                return true;
            }
            return false;
        }
    }

    /* loaded from: classes.dex */
    public interface i {
        void d(ViewPager viewPager, AbstractC3694Mx1 abstractC3694Mx1, AbstractC3694Mx1 abstractC3694Mx12);
    }

    /* loaded from: classes.dex */
    public interface j {
        void a(int i, float f, int i2);

        void b(int i);

        void c(int i);
    }

    /* loaded from: classes.dex */
    public interface k {
        void a(View view, float f);
    }

    /* loaded from: classes.dex */
    public class l extends DataSetObserver {
        public l() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            ViewPager.this.j();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            ViewPager.this.j();
        }
    }

    /* loaded from: classes.dex */
    public static class m extends J {
        public static final Parcelable.Creator<m> CREATOR = new a();
        public Parcelable Y0;
        public int Z;
        public ClassLoader Z0;

        /* loaded from: classes.dex */
        public static class a implements Parcelable.ClassLoaderCreator<m> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public m createFromParcel(Parcel parcel) {
                return new m(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b */
            public m createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new m(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c */
            public m[] newArray(int i) {
                return new m[i];
            }
        }

        public m(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "FragmentPager.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " position=" + this.Z + "}";
        }

        @Override // o.J, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.Z);
            parcel.writeParcelable(this.Y0, i);
        }

        public m(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            classLoader = classLoader == null ? getClass().getClassLoader() : classLoader;
            this.Z = parcel.readInt();
            this.Y0 = parcel.readParcelable(classLoader);
            this.Z0 = classLoader;
        }
    }

    /* loaded from: classes.dex */
    public static class n implements j {
        @Override // androidx.viewpager.widget.ViewPager.j
        public void a(int i, float f, int i2) {
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public void b(int i) {
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public void c(int i) {
        }
    }

    /* loaded from: classes.dex */
    public static class o implements Comparator<View> {
        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(View view, View view2) {
            g gVar = (g) view.getLayoutParams();
            g gVar2 = (g) view2.getLayoutParams();
            boolean z = gVar.a;
            if (z != gVar2.a) {
                if (z) {
                    return 1;
                }
                return -1;
            }
            return gVar.e - gVar2.e;
        }
    }

    public ViewPager(Context context) {
        super(context);
        this.Z0 = new ArrayList<>();
        this.a1 = new f();
        this.b1 = new Rect();
        this.e1 = -1;
        this.f1 = null;
        this.g1 = null;
        this.o1 = -3.4028235E38f;
        this.p1 = Float.MAX_VALUE;
        this.v1 = 1;
        this.F1 = -1;
        this.P1 = true;
        this.Q1 = false;
        this.b2 = new c();
        this.c2 = 0;
        z();
    }

    public static boolean A(View view) {
        if (view.getClass().getAnnotation(e.class) != null) {
            return true;
        }
        return false;
    }

    private int getClientWidth() {
        return (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
    }

    private void setScrollingCacheEnabled(boolean z) {
        if (this.t1 != z) {
            this.t1 = z;
        }
    }

    public boolean B() {
        return this.L1;
    }

    public final boolean C(float f3, float f4) {
        if (f3 >= this.z1 || f4 <= 0.0f) {
            if (f3 > getWidth() - this.z1 && f4 < 0.0f) {
                return true;
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void D(int i3, float f3, int i4) {
        int max;
        int i5;
        int left;
        if (this.S1 > 0) {
            int scrollX = getScrollX();
            int paddingLeft = getPaddingLeft();
            int paddingRight = getPaddingRight();
            int width = getWidth();
            int childCount = getChildCount();
            for (int i6 = 0; i6 < childCount; i6++) {
                View childAt = getChildAt(i6);
                g gVar = (g) childAt.getLayoutParams();
                if (gVar.a) {
                    int i7 = gVar.b & 7;
                    if (i7 != 1) {
                        if (i7 != 3) {
                            if (i7 != 5) {
                                i5 = paddingLeft;
                            } else {
                                max = (width - paddingRight) - childAt.getMeasuredWidth();
                                paddingRight += childAt.getMeasuredWidth();
                            }
                        } else {
                            i5 = childAt.getWidth() + paddingLeft;
                        }
                        left = (paddingLeft + scrollX) - childAt.getLeft();
                        if (left != 0) {
                            childAt.offsetLeftAndRight(left);
                        }
                        paddingLeft = i5;
                    } else {
                        max = Math.max((width - childAt.getMeasuredWidth()) / 2, paddingLeft);
                    }
                    int i8 = max;
                    i5 = paddingLeft;
                    paddingLeft = i8;
                    left = (paddingLeft + scrollX) - childAt.getLeft();
                    if (left != 0) {
                    }
                    paddingLeft = i5;
                }
            }
        }
        l(i3, f3, i4);
        if (this.X1 != null) {
            int scrollX2 = getScrollX();
            int childCount2 = getChildCount();
            for (int i9 = 0; i9 < childCount2; i9++) {
                View childAt2 = getChildAt(i9);
                if (!((g) childAt2.getLayoutParams()).a) {
                    this.X1.a(childAt2, (childAt2.getLeft() - scrollX2) / getClientWidth());
                }
            }
        }
        this.R1 = true;
    }

    public final void E(MotionEvent motionEvent) {
        int i3;
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.F1) {
            if (actionIndex == 0) {
                i3 = 1;
            } else {
                i3 = 0;
            }
            this.B1 = motionEvent.getX(i3);
            this.F1 = motionEvent.getPointerId(i3);
            VelocityTracker velocityTracker = this.G1;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    public boolean F() {
        int i3 = this.d1;
        if (i3 > 0) {
            S(i3 - 1, true);
            return true;
        }
        return false;
    }

    public boolean G() {
        AbstractC3694Mx1 abstractC3694Mx1 = this.c1;
        if (abstractC3694Mx1 != null && this.d1 < abstractC3694Mx1.e() - 1) {
            S(this.d1 + 1, true);
            return true;
        }
        return false;
    }

    public final boolean H(int i3) {
        if (this.Z0.size() == 0) {
            if (this.P1) {
                return false;
            }
            this.R1 = false;
            D(0, 0.0f, 0);
            if (this.R1) {
                return false;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        }
        f x = x();
        int clientWidth = getClientWidth();
        int i4 = this.k1;
        int i5 = clientWidth + i4;
        float f3 = clientWidth;
        int i6 = x.b;
        float f4 = ((i3 / f3) - x.e) / (x.d + (i4 / f3));
        this.R1 = false;
        D(i6, f4, (int) (i5 * f4));
        if (this.R1) {
            return true;
        }
        throw new IllegalStateException("onPageScrolled did not call superclass implementation");
    }

    public final boolean I(float f3) {
        boolean z;
        boolean z2;
        float f4 = this.B1 - f3;
        this.B1 = f3;
        float scrollX = getScrollX() + f4;
        float clientWidth = getClientWidth();
        float f5 = this.o1 * clientWidth;
        float f6 = this.p1 * clientWidth;
        boolean z3 = false;
        f fVar = this.Z0.get(0);
        ArrayList<f> arrayList = this.Z0;
        f fVar2 = arrayList.get(arrayList.size() - 1);
        if (fVar.b != 0) {
            f5 = fVar.e * clientWidth;
            z = false;
        } else {
            z = true;
        }
        if (fVar2.b != this.c1.e() - 1) {
            f6 = fVar2.e * clientWidth;
            z2 = false;
        } else {
            z2 = true;
        }
        if (scrollX < f5) {
            if (z) {
                this.N1.onPull(Math.abs(f5 - scrollX) / clientWidth);
                z3 = true;
            }
            scrollX = f5;
        } else if (scrollX > f6) {
            if (z2) {
                this.O1.onPull(Math.abs(scrollX - f6) / clientWidth);
                z3 = true;
            }
            scrollX = f6;
        }
        int i3 = (int) scrollX;
        this.B1 += scrollX - i3;
        scrollTo(i3, getScrollY());
        H(i3);
        return z3;
    }

    public void J() {
        K(this.d1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0061, code lost:
        if (r9 == r10) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0067, code lost:
        r8 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void K(int i3) {
        f fVar;
        String hexString;
        f fVar2;
        f fVar3;
        f w;
        f fVar4;
        float paddingLeft;
        f fVar5;
        float paddingRight;
        f fVar6;
        int i4 = this.d1;
        if (i4 != i3) {
            fVar = y(i4);
            this.d1 = i3;
        } else {
            fVar = null;
        }
        if (this.c1 == null) {
            a0();
        } else if (this.u1) {
            a0();
        } else if (getWindowToken() != null) {
            this.c1.t(this);
            int i5 = this.v1;
            int max = Math.max(0, this.d1 - i5);
            int e3 = this.c1.e();
            int min = Math.min(e3 - 1, this.d1 + i5);
            if (e3 == this.Y0) {
                int i6 = 0;
                while (true) {
                    if (i6 >= this.Z0.size()) {
                        break;
                    }
                    fVar2 = this.Z0.get(i6);
                    int i7 = fVar2.b;
                    int i8 = this.d1;
                    if (i7 < i8) {
                        i6++;
                    }
                }
                if (fVar2 == null && e3 > 0) {
                    fVar2 = a(this.d1, i6);
                }
                if (fVar2 != null) {
                    int i9 = i6 - 1;
                    if (i9 >= 0) {
                        fVar4 = this.Z0.get(i9);
                    } else {
                        fVar4 = null;
                    }
                    int clientWidth = getClientWidth();
                    if (clientWidth <= 0) {
                        paddingLeft = 0.0f;
                    } else {
                        paddingLeft = (2.0f - fVar2.d) + (getPaddingLeft() / clientWidth);
                    }
                    float f3 = 0.0f;
                    for (int i10 = this.d1 - 1; i10 >= 0; i10--) {
                        if (f3 >= paddingLeft && i10 < max) {
                            if (fVar4 == null) {
                                break;
                            }
                            if (i10 == fVar4.b && !fVar4.c) {
                                this.Z0.remove(i9);
                                this.c1.b(this, i10, fVar4.a);
                                i9--;
                                i6--;
                                if (i9 >= 0) {
                                    fVar6 = this.Z0.get(i9);
                                    fVar4 = fVar6;
                                }
                                fVar6 = null;
                                fVar4 = fVar6;
                            }
                        } else if (fVar4 != null && i10 == fVar4.b) {
                            f3 += fVar4.d;
                            i9--;
                            if (i9 >= 0) {
                                fVar6 = this.Z0.get(i9);
                                fVar4 = fVar6;
                            }
                            fVar6 = null;
                            fVar4 = fVar6;
                        } else {
                            f3 += a(i10, i9 + 1).d;
                            i6++;
                            if (i9 >= 0) {
                                fVar6 = this.Z0.get(i9);
                                fVar4 = fVar6;
                            }
                            fVar6 = null;
                            fVar4 = fVar6;
                        }
                    }
                    float f4 = fVar2.d;
                    int i11 = i6 + 1;
                    if (f4 < 2.0f) {
                        if (i11 < this.Z0.size()) {
                            fVar5 = this.Z0.get(i11);
                        } else {
                            fVar5 = null;
                        }
                        if (clientWidth <= 0) {
                            paddingRight = 0.0f;
                        } else {
                            paddingRight = (getPaddingRight() / clientWidth) + 2.0f;
                        }
                        int i12 = this.d1;
                        while (true) {
                            i12++;
                            if (i12 >= e3) {
                                break;
                            } else if (f4 >= paddingRight && i12 > min) {
                                if (fVar5 == null) {
                                    break;
                                } else if (i12 == fVar5.b && !fVar5.c) {
                                    this.Z0.remove(i11);
                                    this.c1.b(this, i12, fVar5.a);
                                    if (i11 < this.Z0.size()) {
                                        fVar5 = this.Z0.get(i11);
                                    } else {
                                        fVar5 = null;
                                    }
                                }
                            } else if (fVar5 != null && i12 == fVar5.b) {
                                f4 += fVar5.d;
                                i11++;
                                if (i11 >= this.Z0.size()) {
                                    fVar5 = null;
                                } else {
                                    fVar5 = this.Z0.get(i11);
                                }
                            } else {
                                f a2 = a(i12, i11);
                                i11++;
                                f4 += a2.d;
                                if (i11 >= this.Z0.size()) {
                                    fVar5 = null;
                                } else {
                                    fVar5 = this.Z0.get(i11);
                                }
                            }
                        }
                    }
                    f(fVar2, i6, fVar);
                    this.c1.q(this, this.d1, fVar2.a);
                }
                this.c1.d(this);
                int childCount = getChildCount();
                for (int i13 = 0; i13 < childCount; i13++) {
                    View childAt = getChildAt(i13);
                    g gVar = (g) childAt.getLayoutParams();
                    gVar.f = i13;
                    if (!gVar.a && gVar.c == 0.0f && (w = w(childAt)) != null) {
                        gVar.c = w.d;
                        gVar.e = w.b;
                    }
                }
                a0();
                if (hasFocus()) {
                    View findFocus = findFocus();
                    if (findFocus != null) {
                        fVar3 = v(findFocus);
                    } else {
                        fVar3 = null;
                    }
                    if (fVar3 == null || fVar3.b != this.d1) {
                        for (int i14 = 0; i14 < getChildCount(); i14++) {
                            View childAt2 = getChildAt(i14);
                            f w3 = w(childAt2);
                            if (w3 != null && w3.b == this.d1 && childAt2.requestFocus(2)) {
                                return;
                            }
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            try {
                hexString = getResources().getResourceName(getId());
            } catch (Resources.NotFoundException unused) {
                hexString = Integer.toHexString(getId());
            }
            throw new IllegalStateException("The application's PagerAdapter changed the adapter's contents without calling PagerAdapter#notifyDataSetChanged! Expected adapter item count: " + this.Y0 + ", found: " + e3 + " Pager id: " + hexString + " Pager class: " + getClass() + " Problematic adapter: " + this.c1.getClass());
        }
    }

    public final void L(int i3, int i4, int i5, int i6) {
        float f3;
        if (i4 > 0 && !this.Z0.isEmpty()) {
            if (!this.h1.isFinished()) {
                this.h1.setFinalX(getCurrentItem() * getClientWidth());
                return;
            }
            scrollTo((int) ((getScrollX() / (((i4 - getPaddingLeft()) - getPaddingRight()) + i6)) * (((i3 - getPaddingLeft()) - getPaddingRight()) + i5)), getScrollY());
            return;
        }
        f y = y(this.d1);
        if (y != null) {
            f3 = Math.min(y.e, this.p1);
        } else {
            f3 = 0.0f;
        }
        int paddingLeft = (int) (f3 * ((i3 - getPaddingLeft()) - getPaddingRight()));
        if (paddingLeft != getScrollX()) {
            i(false);
            scrollTo(paddingLeft, getScrollY());
        }
    }

    public final void M() {
        int i3 = 0;
        while (i3 < getChildCount()) {
            if (!((g) getChildAt(i3).getLayoutParams()).a) {
                removeViewAt(i3);
                i3--;
            }
            i3++;
        }
    }

    public void N(i iVar) {
        List<i> list = this.W1;
        if (list != null) {
            list.remove(iVar);
        }
    }

    public void O(j jVar) {
        List<j> list = this.T1;
        if (list != null) {
            list.remove(jVar);
        }
    }

    public final void P(boolean z) {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(z);
        }
    }

    public final boolean Q() {
        this.F1 = -1;
        q();
        this.N1.onRelease();
        this.O1.onRelease();
        if (!this.N1.isFinished() && !this.O1.isFinished()) {
            return false;
        }
        return true;
    }

    public final void R(int i3, boolean z, int i4, boolean z2) {
        int i5;
        f y = y(i3);
        if (y != null) {
            i5 = (int) (getClientWidth() * Math.max(this.o1, Math.min(y.e, this.p1)));
        } else {
            i5 = 0;
        }
        if (z) {
            Z(i5, 0, i4);
            if (z2) {
                m(i3);
                return;
            }
            return;
        }
        if (z2) {
            m(i3);
        }
        i(false);
        scrollTo(i5, 0);
        H(i5);
    }

    public void S(int i3, boolean z) {
        this.u1 = false;
        T(i3, z, false);
    }

    public void T(int i3, boolean z, boolean z2) {
        U(i3, z, z2, 0);
    }

    public void U(int i3, boolean z, boolean z2, int i4) {
        AbstractC3694Mx1 abstractC3694Mx1 = this.c1;
        boolean z3 = false;
        if (abstractC3694Mx1 != null && abstractC3694Mx1.e() > 0) {
            if (!z2 && this.d1 == i3 && this.Z0.size() != 0) {
                setScrollingCacheEnabled(false);
                return;
            }
            if (i3 < 0) {
                i3 = 0;
            } else if (i3 >= this.c1.e()) {
                i3 = this.c1.e() - 1;
            }
            int i5 = this.v1;
            int i6 = this.d1;
            if (i3 > i6 + i5 || i3 < i6 - i5) {
                for (int i7 = 0; i7 < this.Z0.size(); i7++) {
                    this.Z0.get(i7).c = true;
                }
            }
            if (this.d1 != i3) {
                z3 = true;
            }
            if (this.P1) {
                this.d1 = i3;
                if (z3) {
                    m(i3);
                }
                requestLayout();
                return;
            }
            K(i3);
            R(i3, z, i4, z3);
            return;
        }
        setScrollingCacheEnabled(false);
    }

    public j V(j jVar) {
        j jVar2 = this.V1;
        this.V1 = jVar;
        return jVar2;
    }

    public void W(boolean z, k kVar) {
        X(z, kVar, 2);
    }

    public void X(boolean z, k kVar, int i3) {
        boolean z2;
        boolean z3;
        boolean z4;
        int i4 = 1;
        if (kVar != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (this.X1 != null) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z2 != z3) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.X1 = kVar;
        setChildrenDrawingOrderEnabled(z2);
        if (z2) {
            if (z) {
                i4 = 2;
            }
            this.Z1 = i4;
            this.Y1 = i3;
        } else {
            this.Z1 = 0;
        }
        if (z4) {
            J();
        }
    }

    public void Y(int i3, int i4) {
        Z(i3, i4, 0);
    }

    public void Z(int i3, int i4, int i5) {
        int scrollX;
        int abs;
        if (getChildCount() == 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        Scroller scroller = this.h1;
        if (scroller != null && !scroller.isFinished()) {
            if (this.i1) {
                scrollX = this.h1.getCurrX();
            } else {
                scrollX = this.h1.getStartX();
            }
            this.h1.abortAnimation();
            setScrollingCacheEnabled(false);
        } else {
            scrollX = getScrollX();
        }
        int i6 = scrollX;
        int scrollY = getScrollY();
        int i7 = i3 - i6;
        int i8 = i4 - scrollY;
        if (i7 == 0 && i8 == 0) {
            i(false);
            J();
            setScrollState(0);
            return;
        }
        setScrollingCacheEnabled(true);
        setScrollState(2);
        int clientWidth = getClientWidth();
        int i9 = clientWidth / 2;
        float f3 = clientWidth;
        float f4 = i9;
        float o3 = f4 + (o(Math.min(1.0f, (Math.abs(i7) * 1.0f) / f3)) * f4);
        int abs2 = Math.abs(i5);
        if (abs2 > 0) {
            abs = Math.round(Math.abs(o3 / abs2) * 1000.0f) * 4;
        } else {
            abs = (int) (((Math.abs(i7) / ((f3 * this.c1.h(this.d1)) + this.k1)) + 1.0f) * 100.0f);
        }
        int min = Math.min(abs, 600);
        this.i1 = false;
        this.h1.startScroll(i6, scrollY, i7, i8, min);
        C6516gH2.u1(this);
    }

    public f a(int i3, int i4) {
        f fVar = new f();
        fVar.b = i3;
        fVar.a = this.c1.j(this, i3);
        fVar.d = this.c1.h(i3);
        if (i4 >= 0 && i4 < this.Z0.size()) {
            this.Z0.add(i4, fVar);
            return fVar;
        }
        this.Z0.add(fVar);
        return fVar;
    }

    public final void a0() {
        if (this.Z1 != 0) {
            ArrayList<View> arrayList = this.a2;
            if (arrayList == null) {
                this.a2 = new ArrayList<>();
            } else {
                arrayList.clear();
            }
            int childCount = getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                this.a2.add(getChildAt(i3));
            }
            Collections.sort(this.a2, t2);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList<View> arrayList, int i3, int i4) {
        f w;
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i5 = 0; i5 < getChildCount(); i5++) {
                View childAt = getChildAt(i5);
                if (childAt.getVisibility() == 0 && (w = w(childAt)) != null && w.b == this.d1) {
                    childAt.addFocusables(arrayList, i3, i4);
                }
            }
        }
        if ((descendantFocusability != 262144 || size == arrayList.size()) && isFocusable()) {
            if ((i4 & 1) == 1 && isInTouchMode() && !isFocusableInTouchMode()) {
                return;
            }
            arrayList.add(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addTouchables(ArrayList<View> arrayList) {
        f w;
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() == 0 && (w = w(childAt)) != null && w.b == this.d1) {
                childAt.addTouchables(arrayList);
            }
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i3, ViewGroup.LayoutParams layoutParams) {
        if (!checkLayoutParams(layoutParams)) {
            layoutParams = generateLayoutParams(layoutParams);
        }
        g gVar = (g) layoutParams;
        boolean A = gVar.a | A(view);
        gVar.a = A;
        if (this.s1) {
            if (!A) {
                gVar.d = true;
                addViewInLayout(view, i3, layoutParams);
                return;
            }
            throw new IllegalStateException("Cannot add pager decor view during layout");
        }
        super.addView(view, i3, layoutParams);
    }

    public void b(i iVar) {
        if (this.W1 == null) {
            this.W1 = new ArrayList();
        }
        this.W1.add(iVar);
    }

    public void c(j jVar) {
        if (this.T1 == null) {
            this.T1 = new ArrayList();
        }
        this.T1.add(jVar);
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int i3) {
        if (this.c1 == null) {
            return false;
        }
        int clientWidth = getClientWidth();
        int scrollX = getScrollX();
        if (i3 < 0) {
            if (scrollX <= ((int) (clientWidth * this.o1))) {
                return false;
            }
            return true;
        } else if (i3 <= 0 || scrollX >= ((int) (clientWidth * this.p1))) {
            return false;
        } else {
            return true;
        }
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if ((layoutParams instanceof g) && super.checkLayoutParams(layoutParams)) {
            return true;
        }
        return false;
    }

    @Override // android.view.View
    public void computeScroll() {
        this.i1 = true;
        if (!this.h1.isFinished() && this.h1.computeScrollOffset()) {
            int scrollX = getScrollX();
            int scrollY = getScrollY();
            int currX = this.h1.getCurrX();
            int currY = this.h1.getCurrY();
            if (scrollX != currX || scrollY != currY) {
                scrollTo(currX, currY);
                if (!H(currX)) {
                    this.h1.abortAnimation();
                    scrollTo(0, currY);
                }
            }
            C6516gH2.u1(this);
            return;
        }
        i(true);
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00cc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean d(int i3) {
        View findNextFocus;
        boolean F;
        View findFocus = findFocus();
        if (findFocus != this) {
            if (findFocus != null) {
                for (ViewParent parent = findFocus.getParent(); parent instanceof ViewGroup; parent = parent.getParent()) {
                    if (parent == this) {
                        break;
                    }
                }
                StringBuilder sb = new StringBuilder();
                sb.append(findFocus.getClass().getSimpleName());
                for (ViewParent parent2 = findFocus.getParent(); parent2 instanceof ViewGroup; parent2 = parent2.getParent()) {
                    sb.append(" => ");
                    sb.append(parent2.getClass().getSimpleName());
                }
                Log.e(d2, "arrowScroll tried to find focus based on non-child current focused view " + sb.toString());
            }
            findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, i3);
            if (findNextFocus == null && findNextFocus != findFocus) {
                if (i3 == 17) {
                    int i4 = u(this.b1, findNextFocus).left;
                    int i5 = u(this.b1, findFocus).left;
                    if (findFocus != null && i4 >= i5) {
                        F = F();
                    } else {
                        F = findNextFocus.requestFocus();
                    }
                } else {
                    if (i3 == 66) {
                        int i6 = u(this.b1, findNextFocus).left;
                        int i7 = u(this.b1, findFocus).left;
                        if (findFocus != null && i6 <= i7) {
                            F = G();
                        } else {
                            F = findNextFocus.requestFocus();
                        }
                    }
                    F = false;
                }
            } else if (i3 == 17 && i3 != 1) {
                if (i3 == 66 || i3 == 2) {
                    F = G();
                }
                F = false;
            } else {
                F = F();
            }
            if (F) {
                playSoundEffect(SoundEffectConstants.getContantForFocusDirection(i3));
            }
            return F;
        }
        findFocus = null;
        findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, i3);
        if (findNextFocus == null) {
        }
        if (i3 == 17) {
        }
        F = F();
        if (F) {
        }
        return F;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!super.dispatchKeyEvent(keyEvent) && !s(keyEvent)) {
            return false;
        }
        return true;
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        f w;
        if (accessibilityEvent.getEventType() == 4096) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() == 0 && (w = w(childAt)) != null && w.b == this.d1 && childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        AbstractC3694Mx1 abstractC3694Mx1;
        super.draw(canvas);
        int overScrollMode = getOverScrollMode();
        boolean z = false;
        if (overScrollMode != 0 && (overScrollMode != 1 || (abstractC3694Mx1 = this.c1) == null || abstractC3694Mx1.e() <= 1)) {
            this.N1.finish();
            this.O1.finish();
        } else {
            if (!this.N1.isFinished()) {
                int save = canvas.save();
                int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
                int width = getWidth();
                canvas.rotate(270.0f);
                canvas.translate((-height) + getPaddingTop(), this.o1 * width);
                this.N1.setSize(height, width);
                z = this.N1.draw(canvas);
                canvas.restoreToCount(save);
            }
            if (!this.O1.isFinished()) {
                int save2 = canvas.save();
                int width2 = getWidth();
                int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
                canvas.rotate(90.0f);
                canvas.translate(-getPaddingTop(), (-(this.p1 + 1.0f)) * width2);
                this.O1.setSize(height2, width2);
                z |= this.O1.draw(canvas);
                canvas.restoreToCount(save2);
            }
        }
        if (z) {
            C6516gH2.u1(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.l1;
        if (drawable != null && drawable.isStateful()) {
            drawable.setState(getDrawableState());
        }
    }

    public boolean e() {
        if (this.w1) {
            return false;
        }
        this.L1 = true;
        setScrollState(1);
        this.B1 = 0.0f;
        this.D1 = 0.0f;
        VelocityTracker velocityTracker = this.G1;
        if (velocityTracker == null) {
            this.G1 = VelocityTracker.obtain();
        } else {
            velocityTracker.clear();
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 0, 0.0f, 0.0f, 0);
        this.G1.addMovement(obtain);
        obtain.recycle();
        this.M1 = uptimeMillis;
        return true;
    }

    public final void f(f fVar, int i3, f fVar2) {
        float f3;
        float f4;
        float f5;
        int i4;
        int i5;
        f fVar3;
        f fVar4;
        int e3 = this.c1.e();
        int clientWidth = getClientWidth();
        if (clientWidth > 0) {
            f3 = this.k1 / clientWidth;
        } else {
            f3 = 0.0f;
        }
        if (fVar2 != null) {
            int i6 = fVar2.b;
            int i7 = fVar.b;
            if (i6 < i7) {
                float f6 = fVar2.e + fVar2.d + f3;
                int i8 = i6 + 1;
                int i9 = 0;
                while (i8 <= fVar.b && i9 < this.Z0.size()) {
                    f fVar5 = this.Z0.get(i9);
                    while (true) {
                        fVar4 = fVar5;
                        if (i8 <= fVar4.b || i9 >= this.Z0.size() - 1) {
                            break;
                        }
                        i9++;
                        fVar5 = this.Z0.get(i9);
                    }
                    while (i8 < fVar4.b) {
                        f6 += this.c1.h(i8) + f3;
                        i8++;
                    }
                    fVar4.e = f6;
                    f6 += fVar4.d + f3;
                    i8++;
                }
            } else if (i6 > i7) {
                int size = this.Z0.size() - 1;
                float f7 = fVar2.e;
                while (true) {
                    i6--;
                    if (i6 < fVar.b || size < 0) {
                        break;
                    }
                    f fVar6 = this.Z0.get(size);
                    while (true) {
                        fVar3 = fVar6;
                        if (i6 >= fVar3.b || size <= 0) {
                            break;
                        }
                        size--;
                        fVar6 = this.Z0.get(size);
                    }
                    while (i6 > fVar3.b) {
                        f7 -= this.c1.h(i6) + f3;
                        i6--;
                    }
                    f7 -= fVar3.d + f3;
                    fVar3.e = f7;
                }
            }
        }
        int size2 = this.Z0.size();
        float f8 = fVar.e;
        int i10 = fVar.b;
        int i11 = i10 - 1;
        if (i10 == 0) {
            f4 = f8;
        } else {
            f4 = -3.4028235E38f;
        }
        this.o1 = f4;
        int i12 = e3 - 1;
        if (i10 == i12) {
            f5 = (fVar.d + f8) - 1.0f;
        } else {
            f5 = Float.MAX_VALUE;
        }
        this.p1 = f5;
        int i13 = i3 - 1;
        while (i13 >= 0) {
            f fVar7 = this.Z0.get(i13);
            while (true) {
                i5 = fVar7.b;
                if (i11 <= i5) {
                    break;
                }
                f8 -= this.c1.h(i11) + f3;
                i11--;
            }
            f8 -= fVar7.d + f3;
            fVar7.e = f8;
            if (i5 == 0) {
                this.o1 = f8;
            }
            i13--;
            i11--;
        }
        float f9 = fVar.e + fVar.d + f3;
        int i14 = fVar.b + 1;
        int i15 = i3 + 1;
        while (i15 < size2) {
            f fVar8 = this.Z0.get(i15);
            while (true) {
                i4 = fVar8.b;
                if (i14 >= i4) {
                    break;
                }
                f9 += this.c1.h(i14) + f3;
                i14++;
            }
            if (i4 == i12) {
                this.p1 = (fVar8.d + f9) - 1.0f;
            }
            fVar8.e = f9;
            f9 += fVar8.d + f3;
            i15++;
            i14++;
        }
        this.Q1 = false;
    }

    public boolean g(View view, boolean z, int i3, int i4, int i5) {
        int i6;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                int i7 = i4 + scrollX;
                if (i7 >= childAt.getLeft() && i7 < childAt.getRight() && (i6 = i5 + scrollY) >= childAt.getTop() && i6 < childAt.getBottom() && g(childAt, true, i3, i7 - childAt.getLeft(), i6 - childAt.getTop())) {
                    return true;
                }
            }
        }
        if (z && view.canScrollHorizontally(-i3)) {
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new g();
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return generateDefaultLayoutParams();
    }

    public AbstractC3694Mx1 getAdapter() {
        return this.c1;
    }

    @Override // android.view.ViewGroup
    public int getChildDrawingOrder(int i3, int i4) {
        if (this.Z1 == 2) {
            i4 = (i3 - 1) - i4;
        }
        return ((g) this.a2.get(i4).getLayoutParams()).f;
    }

    public int getCurrentItem() {
        return this.d1;
    }

    public int getOffscreenPageLimit() {
        return this.v1;
    }

    public int getPageMargin() {
        return this.k1;
    }

    public void h() {
        List<j> list = this.T1;
        if (list != null) {
            list.clear();
        }
    }

    public final void i(boolean z) {
        boolean z2;
        if (this.c2 == 2) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            setScrollingCacheEnabled(false);
            if (!this.h1.isFinished()) {
                this.h1.abortAnimation();
                int scrollX = getScrollX();
                int scrollY = getScrollY();
                int currX = this.h1.getCurrX();
                int currY = this.h1.getCurrY();
                if (scrollX != currX || scrollY != currY) {
                    scrollTo(currX, currY);
                    if (currX != scrollX) {
                        H(currX);
                    }
                }
            }
        }
        this.u1 = false;
        for (int i3 = 0; i3 < this.Z0.size(); i3++) {
            f fVar = this.Z0.get(i3);
            if (fVar.c) {
                fVar.c = false;
                z2 = true;
            }
        }
        if (z2) {
            if (z) {
                C6516gH2.w1(this, this.b2);
            } else {
                this.b2.run();
            }
        }
    }

    public void j() {
        boolean z;
        int e3 = this.c1.e();
        this.Y0 = e3;
        if (this.Z0.size() < (this.v1 * 2) + 1 && this.Z0.size() < e3) {
            z = true;
        } else {
            z = false;
        }
        int i3 = this.d1;
        int i4 = 0;
        boolean z2 = false;
        while (i4 < this.Z0.size()) {
            f fVar = this.Z0.get(i4);
            int f3 = this.c1.f(fVar.a);
            if (f3 != -1) {
                if (f3 == -2) {
                    this.Z0.remove(i4);
                    i4--;
                    if (!z2) {
                        this.c1.t(this);
                        z2 = true;
                    }
                    this.c1.b(this, fVar.b, fVar.a);
                    int i5 = this.d1;
                    if (i5 == fVar.b) {
                        i3 = Math.max(0, Math.min(i5, e3 - 1));
                    }
                } else {
                    int i6 = fVar.b;
                    if (i6 != f3) {
                        if (i6 == this.d1) {
                            i3 = f3;
                        }
                        fVar.b = f3;
                    }
                }
                z = true;
            }
            i4++;
        }
        if (z2) {
            this.c1.d(this);
        }
        Collections.sort(this.Z0, m2);
        if (z) {
            int childCount = getChildCount();
            for (int i7 = 0; i7 < childCount; i7++) {
                g gVar = (g) getChildAt(i7).getLayoutParams();
                if (!gVar.a) {
                    gVar.c = 0.0f;
                }
            }
            T(i3, false, true);
            requestLayout();
        }
    }

    public final int k(int i3, float f3, int i4, int i5) {
        float f4;
        if (Math.abs(i5) > this.J1 && Math.abs(i4) > this.H1) {
            if (i4 <= 0) {
                i3++;
            }
        } else {
            if (i3 >= this.d1) {
                f4 = 0.4f;
            } else {
                f4 = 0.6f;
            }
            i3 += (int) (f3 + f4);
        }
        if (this.Z0.size() > 0) {
            ArrayList<f> arrayList = this.Z0;
            return Math.max(this.Z0.get(0).b, Math.min(i3, arrayList.get(arrayList.size() - 1).b));
        }
        return i3;
    }

    public final void l(int i3, float f3, int i4) {
        j jVar = this.U1;
        if (jVar != null) {
            jVar.a(i3, f3, i4);
        }
        List<j> list = this.T1;
        if (list != null) {
            int size = list.size();
            for (int i5 = 0; i5 < size; i5++) {
                j jVar2 = this.T1.get(i5);
                if (jVar2 != null) {
                    jVar2.a(i3, f3, i4);
                }
            }
        }
        j jVar3 = this.V1;
        if (jVar3 != null) {
            jVar3.a(i3, f3, i4);
        }
    }

    public final void m(int i3) {
        j jVar = this.U1;
        if (jVar != null) {
            jVar.c(i3);
        }
        List<j> list = this.T1;
        if (list != null) {
            int size = list.size();
            for (int i4 = 0; i4 < size; i4++) {
                j jVar2 = this.T1.get(i4);
                if (jVar2 != null) {
                    jVar2.c(i3);
                }
            }
        }
        j jVar3 = this.V1;
        if (jVar3 != null) {
            jVar3.c(i3);
        }
    }

    public final void n(int i3) {
        j jVar = this.U1;
        if (jVar != null) {
            jVar.b(i3);
        }
        List<j> list = this.T1;
        if (list != null) {
            int size = list.size();
            for (int i4 = 0; i4 < size; i4++) {
                j jVar2 = this.T1.get(i4);
                if (jVar2 != null) {
                    jVar2.b(i3);
                }
            }
        }
        j jVar3 = this.V1;
        if (jVar3 != null) {
            jVar3.b(i3);
        }
    }

    public float o(float f3) {
        return (float) Math.sin((f3 - 0.5f) * 0.47123894f);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.P1 = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        removeCallbacks(this.b2);
        Scroller scroller = this.h1;
        if (scroller != null && !scroller.isFinished()) {
            this.h1.abortAnimation();
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        int width;
        int i3;
        float f3;
        int i4;
        super.onDraw(canvas);
        if (this.k1 > 0 && this.l1 != null && this.Z0.size() > 0 && this.c1 != null) {
            int scrollX = getScrollX();
            float width2 = getWidth();
            float f4 = this.k1 / width2;
            int i5 = 0;
            f fVar = this.Z0.get(0);
            float f5 = fVar.e;
            int size = this.Z0.size();
            int i6 = fVar.b;
            int i7 = this.Z0.get(size - 1).b;
            while (i6 < i7) {
                while (true) {
                    i3 = fVar.b;
                    if (i6 <= i3 || i5 >= size) {
                        break;
                    }
                    i5++;
                    fVar = this.Z0.get(i5);
                }
                if (i6 == i3) {
                    float f6 = fVar.e;
                    float f7 = fVar.d;
                    f3 = (f6 + f7) * width2;
                    f5 = f6 + f7 + f4;
                } else {
                    float h3 = this.c1.h(i6);
                    f3 = (f5 + h3) * width2;
                    f5 += h3 + f4;
                }
                if (this.k1 + f3 > scrollX) {
                    i4 = scrollX;
                    this.l1.setBounds(Math.round(f3), this.m1, Math.round(this.k1 + f3), this.n1);
                    this.l1.draw(canvas);
                } else {
                    i4 = scrollX;
                }
                if (f3 <= i4 + width) {
                    i6++;
                    scrollX = i4;
                } else {
                    return;
                }
            }
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        float f3;
        int action = motionEvent.getAction() & 255;
        if (action != 3 && action != 1) {
            if (action != 0) {
                if (this.w1) {
                    return true;
                }
                if (this.x1) {
                    return false;
                }
            }
            if (action != 0) {
                if (action != 2) {
                    if (action == 6) {
                        E(motionEvent);
                    }
                } else {
                    int i3 = this.F1;
                    if (i3 != -1) {
                        int findPointerIndex = motionEvent.findPointerIndex(i3);
                        float x = motionEvent.getX(findPointerIndex);
                        float f4 = x - this.B1;
                        float abs = Math.abs(f4);
                        float y = motionEvent.getY(findPointerIndex);
                        float abs2 = Math.abs(y - this.E1);
                        int i4 = (f4 > 0.0f ? 1 : (f4 == 0.0f ? 0 : -1));
                        if (i4 != 0 && !C(this.B1, f4) && g(this, false, (int) f4, (int) x, (int) y)) {
                            this.B1 = x;
                            this.C1 = y;
                            this.x1 = true;
                            return false;
                        }
                        int i5 = this.A1;
                        if (abs > i5 && abs * 0.5f > abs2) {
                            this.w1 = true;
                            P(true);
                            setScrollState(1);
                            float f5 = this.D1;
                            float f6 = this.A1;
                            if (i4 > 0) {
                                f3 = f5 + f6;
                            } else {
                                f3 = f5 - f6;
                            }
                            this.B1 = f3;
                            this.C1 = y;
                            setScrollingCacheEnabled(true);
                        } else if (abs2 > i5) {
                            this.x1 = true;
                        }
                        if (this.w1 && I(x)) {
                            C6516gH2.u1(this);
                        }
                    }
                }
            } else {
                float x2 = motionEvent.getX();
                this.D1 = x2;
                this.B1 = x2;
                float y2 = motionEvent.getY();
                this.E1 = y2;
                this.C1 = y2;
                this.F1 = motionEvent.getPointerId(0);
                this.x1 = false;
                this.i1 = true;
                this.h1.computeScrollOffset();
                if (this.c2 == 2 && Math.abs(this.h1.getFinalX() - this.h1.getCurrX()) > this.K1) {
                    this.h1.abortAnimation();
                    this.u1 = false;
                    J();
                    this.w1 = true;
                    P(true);
                    setScrollState(1);
                } else {
                    i(false);
                    this.w1 = false;
                }
            }
            if (this.G1 == null) {
                this.G1 = VelocityTracker.obtain();
            }
            this.G1.addMovement(motionEvent);
            return this.w1;
        }
        Q();
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0094  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onLayout(boolean z, int i3, int i4, int i5, int i6) {
        boolean z2;
        f w;
        int max;
        int i7;
        int max2;
        int i8;
        int childCount = getChildCount();
        int i9 = i5 - i3;
        int i10 = i6 - i4;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = getPaddingRight();
        int paddingBottom = getPaddingBottom();
        int scrollX = getScrollX();
        int i11 = 0;
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (childAt.getVisibility() != 8) {
                g gVar = (g) childAt.getLayoutParams();
                if (gVar.a) {
                    int i13 = gVar.b;
                    int i14 = i13 & 7;
                    int i15 = i13 & 112;
                    if (i14 != 1) {
                        if (i14 != 3) {
                            if (i14 != 5) {
                                i7 = paddingLeft;
                            } else {
                                max = (i9 - paddingRight) - childAt.getMeasuredWidth();
                                paddingRight += childAt.getMeasuredWidth();
                            }
                        } else {
                            i7 = childAt.getMeasuredWidth() + paddingLeft;
                        }
                        if (i15 == 16) {
                            if (i15 != 48) {
                                if (i15 != 80) {
                                    i8 = paddingTop;
                                } else {
                                    max2 = (i10 - paddingBottom) - childAt.getMeasuredHeight();
                                    paddingBottom += childAt.getMeasuredHeight();
                                }
                            } else {
                                i8 = childAt.getMeasuredHeight() + paddingTop;
                            }
                            int i16 = paddingLeft + scrollX;
                            childAt.layout(i16, paddingTop, childAt.getMeasuredWidth() + i16, paddingTop + childAt.getMeasuredHeight());
                            i11++;
                            paddingTop = i8;
                            paddingLeft = i7;
                        } else {
                            max2 = Math.max((i10 - childAt.getMeasuredHeight()) / 2, paddingTop);
                        }
                        int i17 = max2;
                        i8 = paddingTop;
                        paddingTop = i17;
                        int i162 = paddingLeft + scrollX;
                        childAt.layout(i162, paddingTop, childAt.getMeasuredWidth() + i162, paddingTop + childAt.getMeasuredHeight());
                        i11++;
                        paddingTop = i8;
                        paddingLeft = i7;
                    } else {
                        max = Math.max((i9 - childAt.getMeasuredWidth()) / 2, paddingLeft);
                    }
                    int i18 = max;
                    i7 = paddingLeft;
                    paddingLeft = i18;
                    if (i15 == 16) {
                    }
                    int i172 = max2;
                    i8 = paddingTop;
                    paddingTop = i172;
                    int i1622 = paddingLeft + scrollX;
                    childAt.layout(i1622, paddingTop, childAt.getMeasuredWidth() + i1622, paddingTop + childAt.getMeasuredHeight());
                    i11++;
                    paddingTop = i8;
                    paddingLeft = i7;
                }
            }
        }
        int i19 = (i9 - paddingLeft) - paddingRight;
        for (int i20 = 0; i20 < childCount; i20++) {
            View childAt2 = getChildAt(i20);
            if (childAt2.getVisibility() != 8) {
                g gVar2 = (g) childAt2.getLayoutParams();
                if (!gVar2.a && (w = w(childAt2)) != null) {
                    float f3 = i19;
                    int i21 = ((int) (w.e * f3)) + paddingLeft;
                    if (gVar2.d) {
                        gVar2.d = false;
                        childAt2.measure(View.MeasureSpec.makeMeasureSpec((int) (f3 * gVar2.c), 1073741824), View.MeasureSpec.makeMeasureSpec((i10 - paddingTop) - paddingBottom, 1073741824));
                    }
                    childAt2.layout(i21, paddingTop, childAt2.getMeasuredWidth() + i21, childAt2.getMeasuredHeight() + paddingTop);
                }
            }
        }
        this.m1 = paddingTop;
        this.n1 = i10 - paddingBottom;
        this.S1 = i11;
        if (this.P1) {
            z2 = false;
            R(this.d1, false, 0, false);
        } else {
            z2 = false;
        }
        this.P1 = z2;
    }

    @Override // android.view.View
    public void onMeasure(int i3, int i4) {
        g gVar;
        g gVar2;
        boolean z;
        int i5;
        setMeasuredDimension(View.getDefaultSize(0, i3), View.getDefaultSize(0, i4));
        int measuredWidth = getMeasuredWidth();
        this.z1 = Math.min(measuredWidth / 10, this.y1);
        int paddingLeft = (measuredWidth - getPaddingLeft()) - getPaddingRight();
        int measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        int childCount = getChildCount();
        int i6 = 0;
        while (true) {
            boolean z2 = true;
            int i7 = 1073741824;
            if (i6 >= childCount) {
                break;
            }
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() != 8 && (gVar2 = (g) childAt.getLayoutParams()) != null && gVar2.a) {
                int i8 = gVar2.b;
                int i9 = i8 & 7;
                int i10 = i8 & 112;
                if (i10 != 48 && i10 != 80) {
                    z = false;
                } else {
                    z = true;
                }
                if (i9 != 3 && i9 != 5) {
                    z2 = false;
                }
                int i11 = Integer.MIN_VALUE;
                if (z) {
                    i5 = Integer.MIN_VALUE;
                    i11 = 1073741824;
                } else if (z2) {
                    i5 = 1073741824;
                } else {
                    i5 = Integer.MIN_VALUE;
                }
                int i12 = ((ViewGroup.LayoutParams) gVar2).width;
                if (i12 != -2) {
                    if (i12 == -1) {
                        i12 = paddingLeft;
                    }
                    i11 = 1073741824;
                } else {
                    i12 = paddingLeft;
                }
                int i13 = ((ViewGroup.LayoutParams) gVar2).height;
                if (i13 != -2) {
                    if (i13 == -1) {
                        i13 = measuredHeight;
                    }
                } else {
                    i13 = measuredHeight;
                    i7 = i5;
                }
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i12, i11), View.MeasureSpec.makeMeasureSpec(i13, i7));
                if (z) {
                    measuredHeight -= childAt.getMeasuredHeight();
                } else if (z2) {
                    paddingLeft -= childAt.getMeasuredWidth();
                }
            }
            i6++;
        }
        this.q1 = View.MeasureSpec.makeMeasureSpec(paddingLeft, 1073741824);
        this.r1 = View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
        this.s1 = true;
        J();
        this.s1 = false;
        int childCount2 = getChildCount();
        for (int i14 = 0; i14 < childCount2; i14++) {
            View childAt2 = getChildAt(i14);
            if (childAt2.getVisibility() != 8 && ((gVar = (g) childAt2.getLayoutParams()) == null || !gVar.a)) {
                childAt2.measure(View.MeasureSpec.makeMeasureSpec((int) (paddingLeft * gVar.c), 1073741824), this.r1);
            }
        }
    }

    @Override // android.view.ViewGroup
    public boolean onRequestFocusInDescendants(int i3, Rect rect) {
        int i4;
        int i5;
        int i6;
        f w;
        int childCount = getChildCount();
        if ((i3 & 2) != 0) {
            i5 = childCount;
            i4 = 0;
            i6 = 1;
        } else {
            i4 = childCount - 1;
            i5 = -1;
            i6 = -1;
        }
        while (i4 != i5) {
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() == 0 && (w = w(childAt)) != null && w.b == this.d1 && childAt.requestFocus(i3, rect)) {
                return true;
            }
            i4 += i6;
        }
        return false;
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof m)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        m mVar = (m) parcelable;
        super.onRestoreInstanceState(mVar.a());
        AbstractC3694Mx1 abstractC3694Mx1 = this.c1;
        if (abstractC3694Mx1 != null) {
            abstractC3694Mx1.n(mVar.Y0, mVar.Z0);
            T(mVar.Z, false, true);
            return;
        }
        this.e1 = mVar.Z;
        this.f1 = mVar.Y0;
        this.g1 = mVar.Z0;
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        m mVar = new m(super.onSaveInstanceState());
        mVar.Z = this.d1;
        AbstractC3694Mx1 abstractC3694Mx1 = this.c1;
        if (abstractC3694Mx1 != null) {
            mVar.Y0 = abstractC3694Mx1.o();
        }
        return mVar;
    }

    @Override // android.view.View
    public void onSizeChanged(int i3, int i4, int i5, int i6) {
        super.onSizeChanged(i3, i4, i5, i6);
        if (i3 != i5) {
            int i7 = this.k1;
            L(i3, i5, i7, i7);
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        AbstractC3694Mx1 abstractC3694Mx1;
        float f3;
        if (this.L1) {
            return true;
        }
        boolean z = false;
        if ((motionEvent.getAction() == 0 && motionEvent.getEdgeFlags() != 0) || (abstractC3694Mx1 = this.c1) == null || abstractC3694Mx1.e() == 0) {
            return false;
        }
        if (this.G1 == null) {
            this.G1 = VelocityTracker.obtain();
        }
        this.G1.addMovement(motionEvent);
        int action = motionEvent.getAction() & 255;
        if (action != 0) {
            if (action != 1) {
                if (action != 2) {
                    if (action != 3) {
                        if (action != 5) {
                            if (action == 6) {
                                E(motionEvent);
                                this.B1 = motionEvent.getX(motionEvent.findPointerIndex(this.F1));
                            }
                        } else {
                            int actionIndex = motionEvent.getActionIndex();
                            this.B1 = motionEvent.getX(actionIndex);
                            this.F1 = motionEvent.getPointerId(actionIndex);
                        }
                    } else if (this.w1) {
                        R(this.d1, true, 0, false);
                        z = Q();
                    }
                } else {
                    if (!this.w1) {
                        int findPointerIndex = motionEvent.findPointerIndex(this.F1);
                        if (findPointerIndex == -1) {
                            z = Q();
                        } else {
                            float x = motionEvent.getX(findPointerIndex);
                            float abs = Math.abs(x - this.B1);
                            float y = motionEvent.getY(findPointerIndex);
                            float abs2 = Math.abs(y - this.C1);
                            if (abs > this.A1 && abs > abs2) {
                                this.w1 = true;
                                P(true);
                                float f4 = this.D1;
                                if (x - f4 > 0.0f) {
                                    f3 = f4 + this.A1;
                                } else {
                                    f3 = f4 - this.A1;
                                }
                                this.B1 = f3;
                                this.C1 = y;
                                setScrollState(1);
                                setScrollingCacheEnabled(true);
                                ViewParent parent = getParent();
                                if (parent != null) {
                                    parent.requestDisallowInterceptTouchEvent(true);
                                }
                            }
                        }
                    }
                    if (this.w1) {
                        z = I(motionEvent.getX(motionEvent.findPointerIndex(this.F1)));
                    }
                }
            } else if (this.w1) {
                VelocityTracker velocityTracker = this.G1;
                velocityTracker.computeCurrentVelocity(1000, this.I1);
                int xVelocity = (int) velocityTracker.getXVelocity(this.F1);
                this.u1 = true;
                int clientWidth = getClientWidth();
                int scrollX = getScrollX();
                f x2 = x();
                float f5 = clientWidth;
                U(k(x2.b, ((scrollX / f5) - x2.e) / (x2.d + (this.k1 / f5)), xVelocity, (int) (motionEvent.getX(motionEvent.findPointerIndex(this.F1)) - this.D1)), true, true, xVelocity);
                z = Q();
            }
        } else {
            this.h1.abortAnimation();
            this.u1 = false;
            J();
            float x3 = motionEvent.getX();
            this.D1 = x3;
            this.B1 = x3;
            float y2 = motionEvent.getY();
            this.E1 = y2;
            this.C1 = y2;
            this.F1 = motionEvent.getPointerId(0);
        }
        if (z) {
            C6516gH2.u1(this);
        }
        return true;
    }

    public final void p(boolean z) {
        int i3;
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            if (z) {
                i3 = this.Y1;
            } else {
                i3 = 0;
            }
            getChildAt(i4).setLayerType(i3, null);
        }
    }

    public final void q() {
        this.w1 = false;
        this.x1 = false;
        VelocityTracker velocityTracker = this.G1;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.G1 = null;
        }
    }

    public void r() {
        if (this.L1) {
            if (this.c1 != null) {
                VelocityTracker velocityTracker = this.G1;
                velocityTracker.computeCurrentVelocity(1000, this.I1);
                int xVelocity = (int) velocityTracker.getXVelocity(this.F1);
                this.u1 = true;
                int clientWidth = getClientWidth();
                int scrollX = getScrollX();
                f x = x();
                U(k(x.b, ((scrollX / clientWidth) - x.e) / x.d, xVelocity, (int) (this.B1 - this.D1)), true, true, xVelocity);
            }
            q();
            this.L1 = false;
            return;
        }
        throw new IllegalStateException("No fake drag in progress. Call beginFakeDrag first.");
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        if (this.s1) {
            removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    public boolean s(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 21) {
                if (keyCode != 22) {
                    if (keyCode == 61) {
                        if (keyEvent.hasNoModifiers()) {
                            return d(2);
                        }
                        if (keyEvent.hasModifiers(1)) {
                            return d(1);
                        }
                        return false;
                    }
                    return false;
                } else if (keyEvent.hasModifiers(2)) {
                    return G();
                } else {
                    return d(66);
                }
            } else if (keyEvent.hasModifiers(2)) {
                return F();
            } else {
                return d(17);
            }
        }
        return false;
    }

    public void setAdapter(AbstractC3694Mx1 abstractC3694Mx1) {
        AbstractC3694Mx1 abstractC3694Mx12 = this.c1;
        if (abstractC3694Mx12 != null) {
            abstractC3694Mx12.r(null);
            this.c1.t(this);
            for (int i3 = 0; i3 < this.Z0.size(); i3++) {
                f fVar = this.Z0.get(i3);
                this.c1.b(this, fVar.b, fVar.a);
            }
            this.c1.d(this);
            this.Z0.clear();
            M();
            this.d1 = 0;
            scrollTo(0, 0);
        }
        AbstractC3694Mx1 abstractC3694Mx13 = this.c1;
        this.c1 = abstractC3694Mx1;
        this.Y0 = 0;
        if (abstractC3694Mx1 != null) {
            if (this.j1 == null) {
                this.j1 = new l();
            }
            this.c1.r(this.j1);
            this.u1 = false;
            boolean z = this.P1;
            this.P1 = true;
            this.Y0 = this.c1.e();
            if (this.e1 >= 0) {
                this.c1.n(this.f1, this.g1);
                T(this.e1, false, true);
                this.e1 = -1;
                this.f1 = null;
                this.g1 = null;
            } else if (!z) {
                J();
            } else {
                requestLayout();
            }
        }
        List<i> list = this.W1;
        if (list != null && !list.isEmpty()) {
            int size = this.W1.size();
            for (int i4 = 0; i4 < size; i4++) {
                this.W1.get(i4).d(this, abstractC3694Mx13, abstractC3694Mx1);
            }
        }
    }

    public void setCurrentItem(int i3) {
        this.u1 = false;
        T(i3, !this.P1, false);
    }

    public void setOffscreenPageLimit(int i3) {
        if (i3 < 1) {
            Log.w(d2, "Requested offscreen page limit " + i3 + " too small; defaulting to 1");
            i3 = 1;
        }
        if (i3 != this.v1) {
            this.v1 = i3;
            J();
        }
    }

    @Deprecated
    public void setOnPageChangeListener(j jVar) {
        this.U1 = jVar;
    }

    public void setPageMargin(int i3) {
        int i4 = this.k1;
        this.k1 = i3;
        int width = getWidth();
        L(width, width, i3, i4);
        requestLayout();
    }

    public void setPageMarginDrawable(Drawable drawable) {
        this.l1 = drawable;
        if (drawable != null) {
            refreshDrawableState();
        }
        setWillNotDraw(drawable == null);
        invalidate();
    }

    public void setScrollState(int i3) {
        boolean z;
        if (this.c2 == i3) {
            return;
        }
        this.c2 = i3;
        if (this.X1 != null) {
            if (i3 != 0) {
                z = true;
            } else {
                z = false;
            }
            p(z);
        }
        n(i3);
    }

    public void t(float f3) {
        ArrayList<f> arrayList;
        if (this.L1) {
            if (this.c1 == null) {
                return;
            }
            this.B1 += f3;
            float scrollX = getScrollX() - f3;
            float clientWidth = getClientWidth();
            float f4 = this.o1 * clientWidth;
            float f5 = this.p1 * clientWidth;
            f fVar = this.Z0.get(0);
            f fVar2 = this.Z0.get(arrayList.size() - 1);
            if (fVar.b != 0) {
                f4 = fVar.e * clientWidth;
            }
            if (fVar2.b != this.c1.e() - 1) {
                f5 = fVar2.e * clientWidth;
            }
            if (scrollX < f4) {
                scrollX = f4;
            } else if (scrollX > f5) {
                scrollX = f5;
            }
            int i3 = (int) scrollX;
            this.B1 += scrollX - i3;
            scrollTo(i3, getScrollY());
            H(i3);
            MotionEvent obtain = MotionEvent.obtain(this.M1, SystemClock.uptimeMillis(), 2, this.B1, 0.0f, 0);
            this.G1.addMovement(obtain);
            obtain.recycle();
            return;
        }
        throw new IllegalStateException("No fake drag in progress. Call beginFakeDrag first.");
    }

    public final Rect u(Rect rect, View view) {
        if (rect == null) {
            rect = new Rect();
        }
        if (view == null) {
            rect.set(0, 0, 0, 0);
            return rect;
        }
        rect.left = view.getLeft();
        rect.right = view.getRight();
        rect.top = view.getTop();
        rect.bottom = view.getBottom();
        ViewParent parent = view.getParent();
        while ((parent instanceof ViewGroup) && parent != this) {
            ViewGroup viewGroup = (ViewGroup) parent;
            rect.left += viewGroup.getLeft();
            rect.right += viewGroup.getRight();
            rect.top += viewGroup.getTop();
            rect.bottom += viewGroup.getBottom();
            parent = viewGroup.getParent();
        }
        return rect;
    }

    public f v(View view) {
        while (true) {
            ViewParent parent = view.getParent();
            if (parent != this) {
                if (parent != null && (parent instanceof View)) {
                    view = (View) parent;
                } else {
                    return null;
                }
            } else {
                return w(view);
            }
        }
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && drawable != this.l1) {
            return false;
        }
        return true;
    }

    public f w(View view) {
        for (int i3 = 0; i3 < this.Z0.size(); i3++) {
            f fVar = this.Z0.get(i3);
            if (this.c1.k(view, fVar.a)) {
                return fVar;
            }
        }
        return null;
    }

    public final f x() {
        float f3;
        float f4;
        int i3;
        int clientWidth = getClientWidth();
        float f5 = 0.0f;
        if (clientWidth > 0) {
            f3 = getScrollX() / clientWidth;
        } else {
            f3 = 0.0f;
        }
        if (clientWidth > 0) {
            f4 = this.k1 / clientWidth;
        } else {
            f4 = 0.0f;
        }
        int i4 = 0;
        boolean z = true;
        f fVar = null;
        int i5 = -1;
        float f6 = 0.0f;
        while (i4 < this.Z0.size()) {
            f fVar2 = this.Z0.get(i4);
            if (!z && fVar2.b != (i3 = i5 + 1)) {
                fVar2 = this.a1;
                fVar2.e = f5 + f6 + f4;
                fVar2.b = i3;
                fVar2.d = this.c1.h(i3);
                i4--;
            }
            f fVar3 = fVar2;
            f5 = fVar3.e;
            float f7 = fVar3.d + f5 + f4;
            if (!z && f3 < f5) {
                break;
            } else if (f3 >= f7 && i4 != this.Z0.size() - 1) {
                int i6 = fVar3.b;
                float f8 = fVar3.d;
                i4++;
                i5 = i6;
                f6 = f8;
                fVar = fVar3;
                z = false;
            } else {
                return fVar3;
            }
        }
        return fVar;
    }

    public f y(int i3) {
        for (int i4 = 0; i4 < this.Z0.size(); i4++) {
            f fVar = this.Z0.get(i4);
            if (fVar.b == i3) {
                return fVar;
            }
        }
        return null;
    }

    public void z() {
        setWillNotDraw(false);
        setDescendantFocusability(262144);
        setFocusable(true);
        Context context = getContext();
        this.h1 = new Scroller(context, n2);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        float f3 = context.getResources().getDisplayMetrics().density;
        this.A1 = viewConfiguration.getScaledPagingTouchSlop();
        this.H1 = (int) (400.0f * f3);
        this.I1 = viewConfiguration.getScaledMaximumFlingVelocity();
        this.N1 = new EdgeEffect(context);
        this.O1 = new EdgeEffect(context);
        this.J1 = (int) (25.0f * f3);
        this.K1 = (int) (2.0f * f3);
        this.y1 = (int) (f3 * 16.0f);
        C6516gH2.I1(this, new h());
        if (C6516gH2.Z(this) == 0) {
            C6516gH2.a2(this, 1);
        }
        C6516gH2.l2(this, new d());
    }

    /* loaded from: classes.dex */
    public static class g extends ViewGroup.LayoutParams {
        public boolean a;
        public int b;
        public float c;
        public boolean d;
        public int e;
        public int f;

        public g() {
            super(-1, -1);
            this.c = 0.0f;
        }

        public g(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.c = 0.0f;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ViewPager.l2);
            this.b = obtainStyledAttributes.getInteger(0, 48);
            obtainStyledAttributes.recycle();
        }
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new g(getContext(), attributeSet);
    }

    public void setPageMarginDrawable(int i3) {
        setPageMarginDrawable(C10201vM.l(getContext(), i3));
    }

    public ViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.Z0 = new ArrayList<>();
        this.a1 = new f();
        this.b1 = new Rect();
        this.e1 = -1;
        this.f1 = null;
        this.g1 = null;
        this.o1 = -3.4028235E38f;
        this.p1 = Float.MAX_VALUE;
        this.v1 = 1;
        this.F1 = -1;
        this.P1 = true;
        this.Q1 = false;
        this.b2 = new c();
        this.c2 = 0;
        z();
    }
}
