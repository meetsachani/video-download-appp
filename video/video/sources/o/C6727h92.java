package o;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import o.C7729lH2;

/* renamed from: o.h92  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C6727h92 extends ViewGroup {
    public static final String v1 = "SlidingPaneLayout";
    public static final int w1 = 32;
    public static final int x1 = -858993460;
    public static final int y1 = 400;
    public int Y0;
    public int Z0;
    public Drawable a1;
    public Drawable b1;
    public final int c1;
    public boolean d1;
    public View e1;
    public float f1;
    public float g1;
    public int h1;
    public boolean i1;
    public int j1;
    public float k1;
    public float l1;
    public e m1;
    public final C7729lH2 n1;
    public boolean o1;
    public boolean p1;
    public final Rect q1;
    public final ArrayList<b> r1;
    public Method s1;
    public Field t1;
    public boolean u1;

    /* renamed from: o.h92$a */
    /* loaded from: classes.dex */
    public class a extends Q3 {
        public final Rect d = new Rect();

        public a() {
        }

        private void n(C10861y4 c10861y4, C10861y4 c10861y42) {
            Rect rect = this.d;
            c10861y42.s(rect);
            c10861y4.e1(rect);
            c10861y42.t(rect);
            c10861y4.f1(rect);
            c10861y4.r2(c10861y42.N0());
            c10861y4.P1(c10861y42.S());
            c10861y4.k1(c10861y42.y());
            c10861y4.p1(c10861y42.D());
            c10861y4.v1(c10861y42.x0());
            c10861y4.l1(c10861y42.s0());
            c10861y4.y1(c10861y42.z0());
            c10861y4.z1(c10861y42.A0());
            c10861y4.b1(c10861y42.p0());
            c10861y4.a2(c10861y42.J0());
            c10861y4.K1(c10861y42.E0());
            c10861y4.a(c10861y42.p());
            c10861y4.N1(c10861y42.Q());
        }

        @Override // o.Q3
        public void f(View view, AccessibilityEvent accessibilityEvent) {
            super.f(view, accessibilityEvent);
            accessibilityEvent.setClassName(C6727h92.class.getName());
        }

        @Override // o.Q3
        public void g(View view, C10861y4 c10861y4) {
            C10861y4 R0 = C10861y4.R0(c10861y4);
            super.g(view, R0);
            n(c10861y4, R0);
            R0.U0();
            c10861y4.k1(C6727h92.class.getName());
            c10861y4.c2(view);
            ViewParent q0 = C6516gH2.q0(view);
            if (q0 instanceof View) {
                c10861y4.R1((View) q0);
            }
            int childCount = C6727h92.this.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = C6727h92.this.getChildAt(i);
                if (!o(childAt) && childAt.getVisibility() == 0) {
                    C6516gH2.a2(childAt, 1);
                    c10861y4.c(childAt);
                }
            }
        }

        @Override // o.Q3
        public boolean i(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            if (!o(view)) {
                return super.i(viewGroup, view, accessibilityEvent);
            }
            return false;
        }

        public boolean o(View view) {
            return C6727h92.this.j(view);
        }
    }

    /* renamed from: o.h92$b */
    /* loaded from: classes.dex */
    public class b implements Runnable {
        public final View X;

        public b(View view) {
            this.X = view;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.X.getParent() == C6727h92.this) {
                this.X.setLayerType(0, null);
                C6727h92.this.i(this.X);
            }
            C6727h92.this.r1.remove(this);
        }
    }

    /* renamed from: o.h92$c */
    /* loaded from: classes.dex */
    public class c extends C7729lH2.c {
        public c() {
        }

        @Override // o.C7729lH2.c
        public int a(View view, int i, int i2) {
            d dVar = (d) C6727h92.this.e1.getLayoutParams();
            if (C6727h92.this.k()) {
                int width = C6727h92.this.getWidth() - ((C6727h92.this.getPaddingRight() + ((ViewGroup.MarginLayoutParams) dVar).rightMargin) + C6727h92.this.e1.getWidth());
                return Math.max(Math.min(i, width), width - C6727h92.this.h1);
            }
            int paddingLeft = C6727h92.this.getPaddingLeft() + ((ViewGroup.MarginLayoutParams) dVar).leftMargin;
            return Math.min(Math.max(i, paddingLeft), C6727h92.this.h1 + paddingLeft);
        }

        @Override // o.C7729lH2.c
        public int b(View view, int i, int i2) {
            return view.getTop();
        }

        @Override // o.C7729lH2.c
        public int d(View view) {
            return C6727h92.this.h1;
        }

        @Override // o.C7729lH2.c
        public void f(int i, int i2) {
            C6727h92 c6727h92 = C6727h92.this;
            c6727h92.n1.d(c6727h92.e1, i2);
        }

        @Override // o.C7729lH2.c
        public void i(View view, int i) {
            C6727h92.this.r();
        }

        @Override // o.C7729lH2.c
        public void j(int i) {
            if (C6727h92.this.n1.F() == 0) {
                C6727h92 c6727h92 = C6727h92.this;
                if (c6727h92.f1 == 0.0f) {
                    c6727h92.v(c6727h92.e1);
                    C6727h92 c6727h922 = C6727h92.this;
                    c6727h922.f(c6727h922.e1);
                    C6727h92.this.o1 = false;
                    return;
                }
                c6727h92.g(c6727h92.e1);
                C6727h92.this.o1 = true;
            }
        }

        @Override // o.C7729lH2.c
        public void k(View view, int i, int i2, int i3, int i4) {
            C6727h92.this.n(i);
            C6727h92.this.invalidate();
        }

        @Override // o.C7729lH2.c
        public void l(View view, float f, float f2) {
            int paddingLeft;
            d dVar = (d) view.getLayoutParams();
            if (C6727h92.this.k()) {
                int paddingRight = C6727h92.this.getPaddingRight() + ((ViewGroup.MarginLayoutParams) dVar).rightMargin;
                if (f < 0.0f || (f == 0.0f && C6727h92.this.f1 > 0.5f)) {
                    paddingRight += C6727h92.this.h1;
                }
                paddingLeft = (C6727h92.this.getWidth() - paddingRight) - C6727h92.this.e1.getWidth();
            } else {
                paddingLeft = ((ViewGroup.MarginLayoutParams) dVar).leftMargin + C6727h92.this.getPaddingLeft();
                int i = (f > 0.0f ? 1 : (f == 0.0f ? 0 : -1));
                if (i > 0 || (i == 0 && C6727h92.this.f1 > 0.5f)) {
                    paddingLeft += C6727h92.this.h1;
                }
            }
            C6727h92.this.n1.V(paddingLeft, view.getTop());
            C6727h92.this.invalidate();
        }

        @Override // o.C7729lH2.c
        public boolean m(View view, int i) {
            if (C6727h92.this.i1) {
                return false;
            }
            return ((d) view.getLayoutParams()).b;
        }
    }

    /* renamed from: o.h92$e */
    /* loaded from: classes.dex */
    public interface e {
        void a(View view);

        void b(View view);

        void c(View view, float f);
    }

    /* renamed from: o.h92$f */
    /* loaded from: classes.dex */
    public static class f extends J {
        public static final Parcelable.Creator<f> CREATOR = new a();
        public boolean Z;

        /* renamed from: o.h92$f$a */
        /* loaded from: classes.dex */
        public static class a implements Parcelable.ClassLoaderCreator<f> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public f createFromParcel(Parcel parcel) {
                return new f(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b */
            public f createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new f(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c */
            public f[] newArray(int i) {
                return new f[i];
            }
        }

        public f(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // o.J, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.Z ? 1 : 0);
        }

        public f(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.Z = parcel.readInt() != 0;
        }
    }

    public C6727h92(Context context) {
        this(context, null);
    }

    public static boolean w(View view) {
        if (view.isOpaque()) {
            return true;
        }
        return false;
    }

    public boolean a(View view, boolean z, int i, int i2, int i3) {
        int i4;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                int i5 = i2 + scrollX;
                if (i5 >= childAt.getLeft() && i5 < childAt.getRight() && (i4 = i3 + scrollY) >= childAt.getTop() && i4 < childAt.getBottom() && a(childAt, true, i, i5 - childAt.getLeft(), i4 - childAt.getTop())) {
                    return true;
                }
            }
        }
        if (z) {
            if (!k()) {
                i = -i;
            }
            if (view.canScrollHorizontally(i)) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Deprecated
    public boolean b() {
        return this.d1;
    }

    public boolean c() {
        return d(this.e1, 0);
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if ((layoutParams instanceof d) && super.checkLayoutParams(layoutParams)) {
            return true;
        }
        return false;
    }

    @Override // android.view.View
    public void computeScroll() {
        if (this.n1.o(true)) {
            if (!this.d1) {
                this.n1.a();
            } else {
                C6516gH2.u1(this);
            }
        }
    }

    public final boolean d(View view, int i) {
        if (!this.p1 && !u(0.0f, i)) {
            return false;
        }
        this.o1 = false;
        return true;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        Drawable drawable;
        View view;
        int i;
        int i2;
        super.draw(canvas);
        if (k()) {
            drawable = this.b1;
        } else {
            drawable = this.a1;
        }
        if (getChildCount() > 1) {
            view = getChildAt(1);
        } else {
            view = null;
        }
        if (view != null && drawable != null) {
            int top = view.getTop();
            int bottom = view.getBottom();
            int intrinsicWidth = drawable.getIntrinsicWidth();
            if (k()) {
                i2 = view.getRight();
                i = intrinsicWidth + i2;
            } else {
                int left = view.getLeft();
                int i3 = left - intrinsicWidth;
                i = left;
                i2 = i3;
            }
            drawable.setBounds(i2, top, i, bottom);
            drawable.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j) {
        d dVar = (d) view.getLayoutParams();
        int save = canvas.save();
        if (this.d1 && !dVar.b && this.e1 != null) {
            canvas.getClipBounds(this.q1);
            if (k()) {
                Rect rect = this.q1;
                rect.left = Math.max(rect.left, this.e1.getRight());
            } else {
                Rect rect2 = this.q1;
                rect2.right = Math.min(rect2.right, this.e1.getLeft());
            }
            canvas.clipRect(this.q1);
        }
        boolean drawChild = super.drawChild(canvas, view, j);
        canvas.restoreToCount(save);
        return drawChild;
    }

    public final void e(View view, float f2, int i) {
        d dVar = (d) view.getLayoutParams();
        if (f2 > 0.0f && i != 0) {
            int i2 = (((int) ((((-16777216) & i) >>> 24) * f2)) << 24) | (i & C6516gH2.x);
            if (dVar.d == null) {
                dVar.d = new Paint();
            }
            dVar.d.setColorFilter(new PorterDuffColorFilter(i2, PorterDuff.Mode.SRC_OVER));
            if (view.getLayerType() != 2) {
                view.setLayerType(2, dVar.d);
            }
            i(view);
        } else if (view.getLayerType() != 0) {
            Paint paint = dVar.d;
            if (paint != null) {
                paint.setColorFilter(null);
            }
            b bVar = new b(view);
            this.r1.add(bVar);
            C6516gH2.w1(this, bVar);
        }
    }

    public void f(View view) {
        e eVar = this.m1;
        if (eVar != null) {
            eVar.b(view);
        }
        sendAccessibilityEvent(32);
    }

    public void g(View view) {
        e eVar = this.m1;
        if (eVar != null) {
            eVar.a(view);
        }
        sendAccessibilityEvent(32);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new d();
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new d((ViewGroup.MarginLayoutParams) layoutParams) : new d(layoutParams);
    }

    public int getCoveredFadeColor() {
        return this.Z0;
    }

    public int getParallaxDistance() {
        return this.j1;
    }

    public int getSliderFadeColor() {
        return this.Y0;
    }

    public void h(View view) {
        e eVar = this.m1;
        if (eVar != null) {
            eVar.c(view, this.f1);
        }
    }

    public void i(View view) {
        C6516gH2.g2(view, ((d) view.getLayoutParams()).d);
    }

    public boolean j(View view) {
        if (view == null) {
            return false;
        }
        d dVar = (d) view.getLayoutParams();
        if (!this.d1 || !dVar.c || this.f1 <= 0.0f) {
            return false;
        }
        return true;
    }

    public boolean k() {
        if (C6516gH2.e0(this) == 1) {
            return true;
        }
        return false;
    }

    public boolean l() {
        if (this.d1 && this.f1 != 1.0f) {
            return false;
        }
        return true;
    }

    public boolean m() {
        return this.d1;
    }

    public void n(int i) {
        int paddingLeft;
        int i2;
        if (this.e1 == null) {
            this.f1 = 0.0f;
            return;
        }
        boolean k = k();
        d dVar = (d) this.e1.getLayoutParams();
        int width = this.e1.getWidth();
        if (k) {
            i = (getWidth() - i) - width;
        }
        if (k) {
            paddingLeft = getPaddingRight();
        } else {
            paddingLeft = getPaddingLeft();
        }
        if (k) {
            i2 = ((ViewGroup.MarginLayoutParams) dVar).rightMargin;
        } else {
            i2 = ((ViewGroup.MarginLayoutParams) dVar).leftMargin;
        }
        float f2 = (i - (paddingLeft + i2)) / this.h1;
        this.f1 = f2;
        if (this.j1 != 0) {
            q(f2);
        }
        if (dVar.c) {
            e(this.e1, this.f1, this.Y0);
        }
        h(this.e1);
    }

    public boolean o() {
        return p(this.e1, 0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.p1 = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.p1 = true;
        int size = this.r1.size();
        for (int i = 0; i < size; i++) {
            this.r1.get(i).run();
        }
        this.r1.clear();
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        View childAt;
        int actionMasked = motionEvent.getActionMasked();
        if (!this.d1 && actionMasked == 0 && getChildCount() > 1 && (childAt = getChildAt(1)) != null) {
            this.o1 = !this.n1.L(childAt, (int) motionEvent.getX(), (int) motionEvent.getY());
        }
        if (this.d1 && (!this.i1 || actionMasked == 0)) {
            if (actionMasked != 3 && actionMasked != 1) {
                if (actionMasked != 0) {
                    if (actionMasked == 2) {
                        float x = motionEvent.getX();
                        float y = motionEvent.getY();
                        float abs = Math.abs(x - this.k1);
                        float abs2 = Math.abs(y - this.l1);
                        if (abs > this.n1.E() && abs2 > abs) {
                            this.n1.c();
                            this.i1 = true;
                            return false;
                        }
                    }
                } else {
                    this.i1 = false;
                    float x2 = motionEvent.getX();
                    float y2 = motionEvent.getY();
                    this.k1 = x2;
                    this.l1 = y2;
                    if (this.n1.L(this.e1, (int) x2, (int) y2) && j(this.e1)) {
                        z = true;
                        if (!this.n1.W(motionEvent) || z) {
                            return true;
                        }
                        return false;
                    }
                }
                z = false;
                if (!this.n1.W(motionEvent)) {
                }
                return true;
            }
            this.n1.c();
            return false;
        }
        this.n1.c();
        return super.onInterceptTouchEvent(motionEvent);
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00bf  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int paddingLeft;
        int paddingRight;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        boolean z2;
        float f2;
        boolean k = k();
        if (k) {
            this.n1.T(2);
        } else {
            this.n1.T(1);
        }
        int i10 = i3 - i;
        if (k) {
            paddingLeft = getPaddingRight();
        } else {
            paddingLeft = getPaddingLeft();
        }
        if (k) {
            paddingRight = getPaddingLeft();
        } else {
            paddingRight = getPaddingRight();
        }
        int paddingTop = getPaddingTop();
        int childCount = getChildCount();
        if (this.p1) {
            if (this.d1 && this.o1) {
                f2 = 1.0f;
            } else {
                f2 = 0.0f;
            }
            this.f1 = f2;
        }
        int i11 = paddingLeft;
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (childAt.getVisibility() != 8) {
                d dVar = (d) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                if (dVar.b) {
                    int i13 = i10 - paddingRight;
                    int min = (Math.min(paddingLeft, i13 - this.c1) - i11) - (((ViewGroup.MarginLayoutParams) dVar).leftMargin + ((ViewGroup.MarginLayoutParams) dVar).rightMargin);
                    this.h1 = min;
                    if (k) {
                        i9 = ((ViewGroup.MarginLayoutParams) dVar).rightMargin;
                    } else {
                        i9 = ((ViewGroup.MarginLayoutParams) dVar).leftMargin;
                    }
                    if (i11 + i9 + min + (measuredWidth / 2) > i13) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    dVar.c = z2;
                    int i14 = (int) (min * this.f1);
                    i11 += i9 + i14;
                    this.f1 = i14 / min;
                } else if (this.d1 && (i5 = this.j1) != 0) {
                    i6 = (int) ((1.0f - this.f1) * i5);
                    i11 = paddingLeft;
                    if (!k) {
                        i8 = (i10 - i11) + i6;
                        i7 = i8 - measuredWidth;
                    } else {
                        i7 = i11 - i6;
                        i8 = i7 + measuredWidth;
                    }
                    childAt.layout(i7, paddingTop, i8, childAt.getMeasuredHeight() + paddingTop);
                    paddingLeft += childAt.getWidth();
                } else {
                    i11 = paddingLeft;
                }
                i6 = 0;
                if (!k) {
                }
                childAt.layout(i7, paddingTop, i8, childAt.getMeasuredHeight() + paddingTop);
                paddingLeft += childAt.getWidth();
            }
        }
        if (this.p1) {
            if (this.d1) {
                if (this.j1 != 0) {
                    q(this.f1);
                }
                if (((d) this.e1.getLayoutParams()).c) {
                    e(this.e1, this.f1, this.Y0);
                }
            } else {
                for (int i15 = 0; i15 < childCount; i15++) {
                    e(getChildAt(i15), 0.0f, this.Y0);
                }
            }
            v(this.e1);
        }
        this.p1 = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00ac, code lost:
        if (((android.view.ViewGroup.MarginLayoutParams) r6).width == 0) goto L22;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onMeasure(int i, int i2) {
        int paddingTop;
        int i3;
        int i4;
        boolean z;
        int measuredWidth;
        int i5;
        int makeMeasureSpec;
        int i6;
        int makeMeasureSpec2;
        int i7;
        int makeMeasureSpec3;
        int i8;
        int makeMeasureSpec4;
        boolean z2;
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode != 1073741824) {
            if (isInEditMode()) {
                if (mode != Integer.MIN_VALUE && mode == 0) {
                    size = 300;
                }
            } else {
                throw new IllegalStateException("Width must have an exact value or MATCH_PARENT");
            }
        } else if (mode2 == 0) {
            if (isInEditMode()) {
                if (mode2 == 0) {
                    size2 = 300;
                    mode2 = Integer.MIN_VALUE;
                }
            } else {
                throw new IllegalStateException("Height must not be UNSPECIFIED");
            }
        }
        boolean z3 = false;
        if (mode2 != Integer.MIN_VALUE) {
            if (mode2 != 1073741824) {
                i3 = 0;
            } else {
                i3 = (size2 - getPaddingTop()) - getPaddingBottom();
            }
            paddingTop = i3;
        } else {
            paddingTop = (size2 - getPaddingTop()) - getPaddingBottom();
            i3 = 0;
        }
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int childCount = getChildCount();
        if (childCount > 2) {
            Log.e(v1, "onMeasure: More than two child views are not supported.");
        }
        this.e1 = null;
        int i9 = 0;
        boolean z4 = false;
        int i10 = paddingLeft;
        float f2 = 0.0f;
        while (true) {
            i4 = 8;
            if (i9 >= childCount) {
                break;
            }
            View childAt = getChildAt(i9);
            d dVar = (d) childAt.getLayoutParams();
            if (childAt.getVisibility() == 8) {
                dVar.c = z3;
            } else {
                float f3 = dVar.a;
                if (f3 > 0.0f) {
                    f2 += f3;
                }
                int i11 = ((ViewGroup.MarginLayoutParams) dVar).leftMargin + ((ViewGroup.MarginLayoutParams) dVar).rightMargin;
                int i12 = ((ViewGroup.MarginLayoutParams) dVar).width;
                if (i12 == -2) {
                    makeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(paddingLeft - i11, Integer.MIN_VALUE);
                    i7 = Integer.MIN_VALUE;
                } else {
                    i7 = Integer.MIN_VALUE;
                    if (i12 == -1) {
                        makeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(paddingLeft - i11, 1073741824);
                    } else {
                        makeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(i12, 1073741824);
                    }
                }
                int i13 = ((ViewGroup.MarginLayoutParams) dVar).height;
                i8 = paddingLeft;
                if (i13 == -2) {
                    makeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(paddingTop, i7);
                } else if (i13 == -1) {
                    makeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(paddingTop, 1073741824);
                } else {
                    makeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(i13, 1073741824);
                }
                childAt.measure(makeMeasureSpec3, makeMeasureSpec4);
                int measuredWidth2 = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                if (mode2 == i7 && measuredHeight > i3) {
                    i3 = Math.min(measuredHeight, paddingTop);
                }
                i10 -= measuredWidth2;
                if (i10 < 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                dVar.b = z2;
                z4 |= z2;
                if (z2) {
                    this.e1 = childAt;
                }
                i9++;
                paddingLeft = i8;
                z3 = false;
            }
            i8 = paddingLeft;
            i9++;
            paddingLeft = i8;
            z3 = false;
        }
        int i14 = paddingLeft;
        if (z4 || f2 > 0.0f) {
            int i15 = i14 - this.c1;
            int i16 = 0;
            while (i16 < childCount) {
                View childAt2 = getChildAt(i16);
                if (childAt2.getVisibility() != i4) {
                    d dVar2 = (d) childAt2.getLayoutParams();
                    if (childAt2.getVisibility() != i4) {
                        if (((ViewGroup.MarginLayoutParams) dVar2).width == 0 && dVar2.a > 0.0f) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (z) {
                            measuredWidth = 0;
                        } else {
                            measuredWidth = childAt2.getMeasuredWidth();
                        }
                        if (z4 && childAt2 != this.e1) {
                            if (((ViewGroup.MarginLayoutParams) dVar2).width < 0 && (measuredWidth > i15 || dVar2.a > 0.0f)) {
                                if (z) {
                                    int i17 = ((ViewGroup.MarginLayoutParams) dVar2).height;
                                    if (i17 == -2) {
                                        makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(paddingTop, Integer.MIN_VALUE);
                                        i6 = 1073741824;
                                    } else if (i17 == -1) {
                                        i6 = 1073741824;
                                        makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(paddingTop, 1073741824);
                                    } else {
                                        i6 = 1073741824;
                                        makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i17, 1073741824);
                                    }
                                } else {
                                    i6 = 1073741824;
                                    makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(childAt2.getMeasuredHeight(), 1073741824);
                                }
                                childAt2.measure(View.MeasureSpec.makeMeasureSpec(i15, i6), makeMeasureSpec2);
                            }
                        } else if (dVar2.a > 0.0f) {
                            if (((ViewGroup.MarginLayoutParams) dVar2).width == 0) {
                                int i18 = ((ViewGroup.MarginLayoutParams) dVar2).height;
                                if (i18 == -2) {
                                    makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(paddingTop, Integer.MIN_VALUE);
                                    i5 = 1073741824;
                                } else if (i18 == -1) {
                                    i5 = 1073741824;
                                    makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(paddingTop, 1073741824);
                                } else {
                                    i5 = 1073741824;
                                    makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i18, 1073741824);
                                }
                            } else {
                                i5 = 1073741824;
                                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(childAt2.getMeasuredHeight(), 1073741824);
                            }
                            if (z4) {
                                int i19 = i14 - (((ViewGroup.MarginLayoutParams) dVar2).leftMargin + ((ViewGroup.MarginLayoutParams) dVar2).rightMargin);
                                int makeMeasureSpec5 = View.MeasureSpec.makeMeasureSpec(i19, i5);
                                if (measuredWidth != i19) {
                                    childAt2.measure(makeMeasureSpec5, makeMeasureSpec);
                                }
                            } else {
                                childAt2.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth + ((int) ((dVar2.a * Math.max(0, i10)) / f2)), 1073741824), makeMeasureSpec);
                                i16++;
                                i4 = 8;
                            }
                        }
                    }
                }
                i16++;
                i4 = 8;
            }
        }
        setMeasuredDimension(size, i3 + getPaddingTop() + getPaddingBottom());
        this.d1 = z4;
        if (this.n1.F() != 0 && !z4) {
            this.n1.a();
        }
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof f)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        f fVar = (f) parcelable;
        super.onRestoreInstanceState(fVar.a());
        if (fVar.Z) {
            o();
        } else {
            c();
        }
        this.o1 = fVar.Z;
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        boolean z;
        f fVar = new f(super.onSaveInstanceState());
        if (m()) {
            z = l();
        } else {
            z = this.o1;
        }
        fVar.Z = z;
        return fVar;
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3) {
            this.p1 = true;
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.d1) {
            return super.onTouchEvent(motionEvent);
        }
        this.n1.M(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1 && j(this.e1)) {
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                float f2 = x - this.k1;
                float f3 = y - this.l1;
                int E = this.n1.E();
                if ((f2 * f2) + (f3 * f3) < E * E && this.n1.L(this.e1, (int) x, (int) y)) {
                    d(this.e1, 0);
                }
            }
            return true;
        }
        float x2 = motionEvent.getX();
        float y2 = motionEvent.getY();
        this.k1 = x2;
        this.l1 = y2;
        return true;
    }

    public final boolean p(View view, int i) {
        if (!this.p1 && !u(1.0f, i)) {
            return false;
        }
        this.o1 = true;
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void q(float f2) {
        boolean z;
        int childCount;
        float f3;
        int i;
        boolean k = k();
        d dVar = (d) this.e1.getLayoutParams();
        if (dVar.c) {
            if (k) {
                i = ((ViewGroup.MarginLayoutParams) dVar).rightMargin;
            } else {
                i = ((ViewGroup.MarginLayoutParams) dVar).leftMargin;
            }
            if (i <= 0) {
                z = true;
                childCount = getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    View childAt = getChildAt(i2);
                    if (childAt != this.e1) {
                        int i3 = this.j1;
                        this.g1 = f2;
                        int i4 = ((int) ((1.0f - this.g1) * i3)) - ((int) ((1.0f - f2) * i3));
                        if (k) {
                            i4 = -i4;
                        }
                        childAt.offsetLeftAndRight(i4);
                        if (z) {
                            float f4 = this.g1;
                            if (k) {
                                f3 = f4 - 1.0f;
                            } else {
                                f3 = 1.0f - f4;
                            }
                            e(childAt, f3, this.Z0);
                        }
                    }
                }
            }
        }
        z = false;
        childCount = getChildCount();
        while (i2 < childCount) {
        }
    }

    public void r() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 4) {
                childAt.setVisibility(0);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        boolean z;
        super.requestChildFocus(view, view2);
        if (!isInTouchMode() && !this.d1) {
            if (view == this.e1) {
                z = true;
            } else {
                z = false;
            }
            this.o1 = z;
        }
    }

    @Deprecated
    public void s() {
        c();
    }

    public void setCoveredFadeColor(int i) {
        this.Z0 = i;
    }

    public void setPanelSlideListener(e eVar) {
        this.m1 = eVar;
    }

    public void setParallaxDistance(int i) {
        this.j1 = i;
        requestLayout();
    }

    @Deprecated
    public void setShadowDrawable(Drawable drawable) {
        setShadowDrawableLeft(drawable);
    }

    public void setShadowDrawableLeft(Drawable drawable) {
        this.a1 = drawable;
    }

    public void setShadowDrawableRight(Drawable drawable) {
        this.b1 = drawable;
    }

    @Deprecated
    public void setShadowResource(int i) {
        setShadowDrawable(getResources().getDrawable(i));
    }

    public void setShadowResourceLeft(int i) {
        setShadowDrawableLeft(C10201vM.l(getContext(), i));
    }

    public void setShadowResourceRight(int i) {
        setShadowDrawableRight(C10201vM.l(getContext(), i));
    }

    public void setSliderFadeColor(int i) {
        this.Y0 = i;
    }

    @Deprecated
    public void t() {
        o();
    }

    public boolean u(float f2, int i) {
        int paddingLeft;
        if (!this.d1) {
            return false;
        }
        boolean k = k();
        d dVar = (d) this.e1.getLayoutParams();
        if (k) {
            paddingLeft = (int) (getWidth() - (((getPaddingRight() + ((ViewGroup.MarginLayoutParams) dVar).rightMargin) + (f2 * this.h1)) + this.e1.getWidth()));
        } else {
            paddingLeft = (int) (getPaddingLeft() + ((ViewGroup.MarginLayoutParams) dVar).leftMargin + (f2 * this.h1));
        }
        C7729lH2 c7729lH2 = this.n1;
        View view = this.e1;
        if (!c7729lH2.X(view, paddingLeft, view.getTop())) {
            return false;
        }
        r();
        C6516gH2.u1(this);
        return true;
    }

    public void v(View view) {
        int paddingLeft;
        int width;
        int i;
        int i2;
        int i3;
        int i4;
        View childAt;
        int i5;
        int i6;
        boolean z;
        int i7;
        View view2 = view;
        boolean k = k();
        if (k) {
            paddingLeft = getWidth() - getPaddingRight();
        } else {
            paddingLeft = getPaddingLeft();
        }
        if (k) {
            width = getPaddingLeft();
        } else {
            width = getWidth() - getPaddingRight();
        }
        int paddingTop = getPaddingTop();
        int height = getHeight() - getPaddingBottom();
        if (view2 != null && w(view2)) {
            i = view2.getLeft();
            i2 = view2.getRight();
            i3 = view2.getTop();
            i4 = view2.getBottom();
        } else {
            i = 0;
            i2 = 0;
            i3 = 0;
            i4 = 0;
        }
        int childCount = getChildCount();
        int i8 = 0;
        while (i8 < childCount && (childAt = getChildAt(i8)) != view2) {
            if (childAt.getVisibility() == 8) {
                z = k;
            } else {
                if (k) {
                    i5 = width;
                } else {
                    i5 = paddingLeft;
                }
                int max = Math.max(i5, childAt.getLeft());
                int max2 = Math.max(paddingTop, childAt.getTop());
                if (k) {
                    i6 = paddingLeft;
                } else {
                    i6 = width;
                }
                z = k;
                int min = Math.min(i6, childAt.getRight());
                int min2 = Math.min(height, childAt.getBottom());
                if (max >= i && max2 >= i3 && min <= i2 && min2 <= i4) {
                    i7 = 4;
                } else {
                    i7 = 0;
                }
                childAt.setVisibility(i7);
            }
            i8++;
            view2 = view;
            k = z;
        }
    }

    /* renamed from: o.h92$d */
    /* loaded from: classes.dex */
    public static class d extends ViewGroup.MarginLayoutParams {
        public static final int[] e = {16843137};
        public float a;
        public boolean b;
        public boolean c;
        public Paint d;

        public d() {
            super(-1, -1);
            this.a = 0.0f;
        }

        public d(int i, int i2) {
            super(i, i2);
            this.a = 0.0f;
        }

        public d(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.a = 0.0f;
        }

        public d(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.a = 0.0f;
        }

        public d(d dVar) {
            super((ViewGroup.MarginLayoutParams) dVar);
            this.a = 0.0f;
            this.a = dVar.a;
        }

        public d(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.a = 0.0f;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, e);
            this.a = obtainStyledAttributes.getFloat(0, 0.0f);
            obtainStyledAttributes.recycle();
        }
    }

    public C6727h92(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new d(getContext(), attributeSet);
    }

    public C6727h92(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.Y0 = x1;
        this.p1 = true;
        this.q1 = new Rect();
        this.r1 = new ArrayList<>();
        float f2 = context.getResources().getDisplayMetrics().density;
        this.c1 = (int) ((32.0f * f2) + 0.5f);
        setWillNotDraw(false);
        C6516gH2.I1(this, new a());
        C6516gH2.a2(this, 1);
        C7729lH2 p = C7729lH2.p(this, 0.5f, new c());
        this.n1 = p;
        p.U(f2 * 400.0f);
    }

    /* renamed from: o.h92$g */
    /* loaded from: classes.dex */
    public static class g implements e {
        @Override // o.C6727h92.e
        public void a(View view) {
        }

        @Override // o.C6727h92.e
        public void b(View view) {
        }

        @Override // o.C6727h92.e
        public void c(View view, float f) {
        }
    }
}
