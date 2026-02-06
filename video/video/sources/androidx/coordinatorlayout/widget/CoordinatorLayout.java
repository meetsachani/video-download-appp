package androidx.coordinatorlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import com.facebook.internal.q0;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import o.C10201vM;
import o.C10559wp1;
import o.C2691Ct1;
import o.C6516gH2;
import o.C9212rH2;
import o.D60;
import o.F30;
import o.FE1;
import o.GL1;
import o.InterfaceC10070up1;
import o.InterfaceC10336vu1;
import o.InterfaceC9827tp1;
import o.J;
import o.JE0;
import o.JP;
import o.RL2;
import o.UE;

/* loaded from: classes.dex */
public class CoordinatorLayout extends ViewGroup implements InterfaceC9827tp1, InterfaceC10070up1 {
    public static final int A1 = 2;
    public static final Comparator<View> B1;
    public static final FE1.a<Rect> C1;
    public static final String s1 = "CoordinatorLayout";
    public static final String t1;
    public static final int u1 = 0;
    public static final int v1 = 1;
    public static final Class<?>[] w1;
    public static final ThreadLocal<Map<String, Constructor<c>>> x1;
    public static final int y1 = 0;
    public static final int z1 = 1;
    public final List<View> Y0;
    public final F30<View> Z0;
    public final List<View> a1;
    public final List<View> b1;
    public Paint c1;
    public final int[] d1;
    public final int[] e1;
    public boolean f1;
    public boolean g1;
    public int[] h1;
    public View i1;
    public View j1;
    public h k1;
    public boolean l1;
    public RL2 m1;
    public boolean n1;
    public Drawable o1;
    public ViewGroup.OnHierarchyChangeListener p1;
    public InterfaceC10336vu1 q1;
    public final C10559wp1 r1;

    /* loaded from: classes.dex */
    public class a implements InterfaceC10336vu1 {
        public a() {
        }

        @Override // o.InterfaceC10336vu1
        public RL2 a(View view, RL2 rl2) {
            return CoordinatorLayout.this.b0(rl2);
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        c getBehavior();
    }

    /* loaded from: classes.dex */
    public static abstract class c<V extends View> {
        public c() {
        }

        public static void M(View view, Object obj) {
            ((g) view.getLayoutParams()).r = obj;
        }

        public static Object l(View view) {
            return ((g) view.getLayoutParams()).r;
        }

        @Deprecated
        public void A(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int i3, int i4, int i5) {
            if (i5 == 0) {
                z(coordinatorLayout, v, view, i, i2, i3, i4);
            }
        }

        public void B(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
            iArr[0] = iArr[0] + i3;
            iArr[1] = iArr[1] + i4;
            A(coordinatorLayout, v, view, i, i2, i3, i4, i5);
        }

        @Deprecated
        public void C(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i) {
        }

        public void D(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i, int i2) {
            if (i2 == 0) {
                C(coordinatorLayout, v, view, view2, i);
            }
        }

        public boolean E(CoordinatorLayout coordinatorLayout, V v, Rect rect, boolean z) {
            return false;
        }

        public void F(CoordinatorLayout coordinatorLayout, V v, Parcelable parcelable) {
        }

        public Parcelable G(CoordinatorLayout coordinatorLayout, V v) {
            return View.BaseSavedState.EMPTY_STATE;
        }

        @Deprecated
        public boolean H(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i) {
            return false;
        }

        public boolean I(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i, int i2) {
            if (i2 == 0) {
                return H(coordinatorLayout, v, view, view2, i);
            }
            return false;
        }

        @Deprecated
        public void J(CoordinatorLayout coordinatorLayout, V v, View view) {
        }

        public void K(CoordinatorLayout coordinatorLayout, V v, View view, int i) {
            if (i == 0) {
                J(coordinatorLayout, v, view);
            }
        }

        public boolean L(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
            return false;
        }

        public boolean h(CoordinatorLayout coordinatorLayout, V v) {
            if (k(coordinatorLayout, v) > 0.0f) {
                return true;
            }
            return false;
        }

        public boolean i(CoordinatorLayout coordinatorLayout, V v, Rect rect) {
            return false;
        }

        public int j(CoordinatorLayout coordinatorLayout, V v) {
            return -16777216;
        }

        public float k(CoordinatorLayout coordinatorLayout, V v) {
            return 0.0f;
        }

        public boolean m(CoordinatorLayout coordinatorLayout, V v, View view) {
            return false;
        }

        public void o(g gVar) {
        }

        public boolean p(CoordinatorLayout coordinatorLayout, V v, View view) {
            return false;
        }

        public void q(CoordinatorLayout coordinatorLayout, V v, View view) {
        }

        public void r() {
        }

        public boolean s(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
            return false;
        }

        public boolean t(CoordinatorLayout coordinatorLayout, V v, int i) {
            return false;
        }

        public boolean u(CoordinatorLayout coordinatorLayout, V v, int i, int i2, int i3, int i4) {
            return false;
        }

        public boolean v(CoordinatorLayout coordinatorLayout, V v, View view, float f, float f2, boolean z) {
            return false;
        }

        public boolean w(CoordinatorLayout coordinatorLayout, V v, View view, float f, float f2) {
            return false;
        }

        @Deprecated
        public void x(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int[] iArr) {
        }

        public void y(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int[] iArr, int i3) {
            if (i3 == 0) {
                x(coordinatorLayout, v, view, i, i2, iArr);
            }
        }

        @Deprecated
        public void z(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int i3, int i4) {
        }

        public c(Context context, AttributeSet attributeSet) {
        }

        public RL2 n(CoordinatorLayout coordinatorLayout, V v, RL2 rl2) {
            return rl2;
        }
    }

    @Retention(RetentionPolicy.RUNTIME)
    @Deprecated
    /* loaded from: classes.dex */
    public @interface d {
        Class<? extends c> value();
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface e {
    }

    /* loaded from: classes.dex */
    public class f implements ViewGroup.OnHierarchyChangeListener {
        public f() {
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewAdded(View view, View view2) {
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = CoordinatorLayout.this.p1;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewAdded(view, view2);
            }
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewRemoved(View view, View view2) {
            CoordinatorLayout.this.M(2);
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = CoordinatorLayout.this.p1;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewRemoved(view, view2);
            }
        }
    }

    /* loaded from: classes.dex */
    public class h implements ViewTreeObserver.OnPreDrawListener {
        public h() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            CoordinatorLayout.this.M(0);
            return true;
        }
    }

    /* loaded from: classes.dex */
    public static class j implements Comparator<View> {
        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(View view, View view2) {
            float K0 = C6516gH2.K0(view);
            float K02 = C6516gH2.K0(view2);
            if (K0 > K02) {
                return -1;
            }
            if (K0 < K02) {
                return 1;
            }
            return 0;
        }
    }

    static {
        String str;
        Package r0 = CoordinatorLayout.class.getPackage();
        if (r0 != null) {
            str = r0.getName();
        } else {
            str = null;
        }
        t1 = str;
        B1 = new j();
        w1 = new Class[]{Context.class, AttributeSet.class};
        x1 = new ThreadLocal<>();
        C1 = new FE1.c(12);
    }

    public CoordinatorLayout(Context context) {
        this(context, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static c P(Context context, AttributeSet attributeSet, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.startsWith(UE.h)) {
            str = context.getPackageName() + str;
        } else if (str.indexOf(46) < 0) {
            String str2 = t1;
            if (!TextUtils.isEmpty(str2)) {
                str = str2 + '.' + str;
            }
        }
        try {
            ThreadLocal<Map<String, Constructor<c>>> threadLocal = x1;
            Map<String, Constructor<c>> map = threadLocal.get();
            if (map == null) {
                map = new HashMap<>();
                threadLocal.set(map);
            }
            Constructor<c> constructor = map.get(str);
            if (constructor == null) {
                constructor = Class.forName(str, false, context.getClassLoader()).getConstructor(w1);
                constructor.setAccessible(true);
                map.put(str, constructor);
            }
            return constructor.newInstance(context, attributeSet);
        } catch (Exception e2) {
            throw new RuntimeException("Could not inflate Behavior subclass " + str, e2);
        }
    }

    public static void T(Rect rect) {
        rect.setEmpty();
        C1.b(rect);
    }

    public static int W(int i2) {
        if (i2 == 0) {
            return 17;
        }
        return i2;
    }

    private static int X(int i2) {
        if ((i2 & 7) == 0) {
            i2 |= JE0.b;
        }
        return (i2 & 112) == 0 ? i2 | 48 : i2;
    }

    public static int Y(int i2) {
        if (i2 == 0) {
            return 8388661;
        }
        return i2;
    }

    public static Rect e() {
        Rect a2 = C1.a();
        if (a2 == null) {
            return new Rect();
        }
        return a2;
    }

    private static int g(int i2, int i3, int i4) {
        return i2 < i3 ? i3 : i2 > i4 ? i4 : i2;
    }

    public final void A(View view, int i2, Rect rect, Rect rect2, g gVar, int i3, int i4) {
        int width;
        int height;
        int d2 = JE0.d(W(gVar.c), i2);
        int d3 = JE0.d(X(gVar.d), i2);
        int i5 = d2 & 7;
        int i6 = d2 & 112;
        int i7 = d3 & 7;
        int i8 = d3 & 112;
        if (i7 != 1) {
            if (i7 != 5) {
                width = rect.left;
            } else {
                width = rect.right;
            }
        } else {
            width = rect.left + (rect.width() / 2);
        }
        if (i8 != 16) {
            if (i8 != 80) {
                height = rect.top;
            } else {
                height = rect.bottom;
            }
        } else {
            height = rect.top + (rect.height() / 2);
        }
        if (i5 != 1) {
            if (i5 != 5) {
                width -= i3;
            }
        } else {
            width -= i3 / 2;
        }
        if (i6 != 16) {
            if (i6 != 80) {
                height -= i4;
            }
        } else {
            height -= i4 / 2;
        }
        rect2.set(width, height, i3 + width, i4 + height);
    }

    public final int B(int i2) {
        int[] iArr = this.h1;
        if (iArr == null) {
            Log.e(s1, "No keylines defined for " + this + " - attempted index lookup " + i2);
            return 0;
        } else if (i2 >= 0 && i2 < iArr.length) {
            return iArr[i2];
        } else {
            Log.e(s1, "Keyline index " + i2 + " out of range for " + this);
            return 0;
        }
    }

    public void C(View view, Rect rect) {
        rect.set(((g) view.getLayoutParams()).h());
    }

    public g D(View view) {
        g gVar = (g) view.getLayoutParams();
        if (!gVar.b) {
            if (view instanceof b) {
                c behavior = ((b) view).getBehavior();
                if (behavior == null) {
                    Log.e(s1, "Attached behavior class is null");
                }
                gVar.q(behavior);
                gVar.b = true;
                return gVar;
            }
            d dVar = null;
            for (Class<?> cls = view.getClass(); cls != null; cls = cls.getSuperclass()) {
                dVar = (d) cls.getAnnotation(d.class);
                if (dVar != null) {
                    break;
                }
            }
            if (dVar != null) {
                try {
                    gVar.q(dVar.value().getDeclaredConstructor(null).newInstance(null));
                } catch (Exception e2) {
                    Log.e(s1, "Default behavior class " + dVar.value().getName() + " could not be instantiated. Did you forget a default constructor?", e2);
                }
            }
            gVar.b = true;
        }
        return gVar;
    }

    public final void E(List<View> list) {
        int i2;
        list.clear();
        boolean isChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i3 = childCount - 1; i3 >= 0; i3--) {
            if (isChildrenDrawingOrderEnabled) {
                i2 = getChildDrawingOrder(childCount, i3);
            } else {
                i2 = i3;
            }
            list.add(getChildAt(i2));
        }
        Comparator<View> comparator = B1;
        if (comparator != null) {
            Collections.sort(list, comparator);
        }
    }

    public final boolean F(View view) {
        return this.Z0.j(view);
    }

    public boolean G(View view, int i2, int i3) {
        Rect e2 = e();
        y(view, e2);
        try {
            return e2.contains(i2, i3);
        } finally {
            T(e2);
        }
    }

    public final void H(View view, int i2) {
        g gVar = (g) view.getLayoutParams();
        Rect e2 = e();
        e2.set(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) gVar).leftMargin, getPaddingTop() + ((ViewGroup.MarginLayoutParams) gVar).topMargin, (getWidth() - getPaddingRight()) - ((ViewGroup.MarginLayoutParams) gVar).rightMargin, (getHeight() - getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) gVar).bottomMargin);
        if (this.m1 != null && C6516gH2.Y(this) && !C6516gH2.Y(view)) {
            e2.left += this.m1.p();
            e2.top += this.m1.r();
            e2.right -= this.m1.q();
            e2.bottom -= this.m1.o();
        }
        Rect e3 = e();
        JE0.b(X(gVar.c), view.getMeasuredWidth(), view.getMeasuredHeight(), e2, e3, i2);
        view.layout(e3.left, e3.top, e3.right, e3.bottom);
        T(e2);
        T(e3);
    }

    public final void I(View view, View view2, int i2) {
        Rect e2 = e();
        Rect e3 = e();
        try {
            y(view2, e2);
            z(view, i2, e2, e3);
            view.layout(e3.left, e3.top, e3.right, e3.bottom);
        } finally {
            T(e2);
            T(e3);
        }
    }

    public final void J(View view, int i2, int i3) {
        int i4;
        g gVar = (g) view.getLayoutParams();
        int d2 = JE0.d(Y(gVar.c), i3);
        int i5 = d2 & 7;
        int i6 = d2 & 112;
        int width = getWidth();
        int height = getHeight();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        if (i3 == 1) {
            i2 = width - i2;
        }
        int B = B(i2) - measuredWidth;
        if (i5 != 1) {
            if (i5 == 5) {
                B += measuredWidth;
            }
        } else {
            B += measuredWidth / 2;
        }
        if (i6 != 16) {
            if (i6 != 80) {
                i4 = 0;
            } else {
                i4 = measuredHeight;
            }
        } else {
            i4 = measuredHeight / 2;
        }
        int max = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) gVar).leftMargin, Math.min(B, ((width - getPaddingRight()) - measuredWidth) - ((ViewGroup.MarginLayoutParams) gVar).rightMargin));
        int max2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) gVar).topMargin, Math.min(i4, ((height - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) gVar).bottomMargin));
        view.layout(max, max2, measuredWidth + max, measuredHeight + max2);
    }

    public final void K(View view, Rect rect, int i2) {
        boolean z;
        boolean z2;
        int width;
        int i3;
        int i4;
        int i5;
        int height;
        int i6;
        int i7;
        int i8;
        if (C6516gH2.a1(view) && view.getWidth() > 0 && view.getHeight() > 0) {
            g gVar = (g) view.getLayoutParams();
            c f2 = gVar.f();
            Rect e2 = e();
            Rect e3 = e();
            e3.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            if (f2 != null && f2.i(this, view, e2)) {
                if (!e3.contains(e2)) {
                    throw new IllegalArgumentException("Rect should be within the child's bounds. Rect:" + e2.toShortString() + " | Bounds:" + e3.toShortString());
                }
            } else {
                e2.set(e3);
            }
            T(e3);
            if (e2.isEmpty()) {
                T(e2);
                return;
            }
            int d2 = JE0.d(gVar.h, i2);
            boolean z3 = true;
            if ((d2 & 48) == 48 && (i7 = (e2.top - ((ViewGroup.MarginLayoutParams) gVar).topMargin) - gVar.j) < (i8 = rect.top)) {
                a0(view, i8 - i7);
                z = true;
            } else {
                z = false;
            }
            if ((d2 & 80) == 80 && (height = ((getHeight() - e2.bottom) - ((ViewGroup.MarginLayoutParams) gVar).bottomMargin) + gVar.j) < (i6 = rect.bottom)) {
                a0(view, height - i6);
                z = true;
            }
            if (!z) {
                a0(view, 0);
            }
            if ((d2 & 3) == 3 && (i4 = (e2.left - ((ViewGroup.MarginLayoutParams) gVar).leftMargin) - gVar.i) < (i5 = rect.left)) {
                Z(view, i5 - i4);
                z2 = true;
            } else {
                z2 = false;
            }
            if ((d2 & 5) == 5 && (width = ((getWidth() - e2.right) - ((ViewGroup.MarginLayoutParams) gVar).rightMargin) + gVar.i) < (i3 = rect.right)) {
                Z(view, width - i3);
            } else {
                z3 = z2;
            }
            if (!z3) {
                Z(view, 0);
            }
            T(e2);
        }
    }

    public void L(View view, int i2) {
        c f2;
        g gVar = (g) view.getLayoutParams();
        if (gVar.k != null) {
            Rect e2 = e();
            Rect e3 = e();
            Rect e4 = e();
            y(gVar.k, e2);
            boolean z = false;
            v(view, false, e3);
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            A(view, i2, e2, e4, gVar, measuredWidth, measuredHeight);
            z = (e4.left == e3.left && e4.top == e3.top) ? true : true;
            h(gVar, e4, measuredWidth, measuredHeight);
            int i3 = e4.left - e3.left;
            int i4 = e4.top - e3.top;
            if (i3 != 0) {
                C6516gH2.j1(view, i3);
            }
            if (i4 != 0) {
                C6516gH2.k1(view, i4);
            }
            if (z && (f2 = gVar.f()) != null) {
                f2.p(this, view, gVar.k);
            }
            T(e2);
            T(e3);
            T(e4);
        }
    }

    public final void M(int i2) {
        boolean z;
        int e0 = C6516gH2.e0(this);
        int size = this.Y0.size();
        Rect e2 = e();
        Rect e3 = e();
        Rect e4 = e();
        for (int i3 = 0; i3 < size; i3++) {
            View view = this.Y0.get(i3);
            g gVar = (g) view.getLayoutParams();
            if (i2 != 0 || view.getVisibility() != 8) {
                for (int i4 = 0; i4 < i3; i4++) {
                    if (gVar.l == this.Y0.get(i4)) {
                        L(view, e0);
                    }
                }
                v(view, true, e3);
                if (gVar.g != 0 && !e3.isEmpty()) {
                    int d2 = JE0.d(gVar.g, e0);
                    int i5 = d2 & 112;
                    if (i5 != 48) {
                        if (i5 == 80) {
                            e2.bottom = Math.max(e2.bottom, getHeight() - e3.top);
                        }
                    } else {
                        e2.top = Math.max(e2.top, e3.bottom);
                    }
                    int i6 = d2 & 7;
                    if (i6 != 3) {
                        if (i6 == 5) {
                            e2.right = Math.max(e2.right, getWidth() - e3.left);
                        }
                    } else {
                        e2.left = Math.max(e2.left, e3.right);
                    }
                }
                if (gVar.h != 0 && view.getVisibility() == 0) {
                    K(view, e2, e0);
                }
                if (i2 != 2) {
                    C(view, e4);
                    if (!e4.equals(e3)) {
                        S(view, e3);
                    }
                }
                for (int i7 = i3 + 1; i7 < size; i7++) {
                    View view2 = this.Y0.get(i7);
                    g gVar2 = (g) view2.getLayoutParams();
                    c f2 = gVar2.f();
                    if (f2 != null && f2.m(this, view2, view)) {
                        if (i2 == 0 && gVar2.g()) {
                            gVar2.l();
                        } else {
                            if (i2 != 2) {
                                z = f2.p(this, view2, view);
                            } else {
                                f2.q(this, view2, view);
                                z = true;
                            }
                            if (i2 == 1) {
                                gVar2.r(z);
                            }
                        }
                    }
                }
            }
        }
        T(e2);
        T(e3);
        T(e4);
    }

    public void N(View view, int i2) {
        g gVar = (g) view.getLayoutParams();
        if (!gVar.a()) {
            View view2 = gVar.k;
            if (view2 != null) {
                I(view, view2, i2);
                return;
            }
            int i3 = gVar.e;
            if (i3 >= 0) {
                J(view, i3, i2);
                return;
            } else {
                H(view, i2);
                return;
            }
        }
        throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
    }

    public void O(View view, int i2, int i3, int i4, int i5) {
        measureChildWithMargins(view, i2, i3, i4, i5);
    }

    public final boolean Q(MotionEvent motionEvent, int i2) {
        int actionMasked = motionEvent.getActionMasked();
        List<View> list = this.a1;
        E(list);
        int size = list.size();
        MotionEvent motionEvent2 = null;
        boolean z = false;
        boolean z2 = false;
        for (int i3 = 0; i3 < size; i3++) {
            View view = list.get(i3);
            g gVar = (g) view.getLayoutParams();
            c f2 = gVar.f();
            if ((z || z2) && actionMasked != 0) {
                if (f2 != null) {
                    if (motionEvent2 == null) {
                        long uptimeMillis = SystemClock.uptimeMillis();
                        motionEvent2 = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                    }
                    if (i2 != 0) {
                        if (i2 == 1) {
                            f2.L(this, view, motionEvent2);
                        }
                    } else {
                        f2.s(this, view, motionEvent2);
                    }
                }
            } else {
                if (!z && f2 != null) {
                    if (i2 != 0) {
                        if (i2 == 1) {
                            z = f2.L(this, view, motionEvent);
                        }
                    } else {
                        z = f2.s(this, view, motionEvent);
                    }
                    if (z) {
                        this.i1 = view;
                    }
                }
                boolean c2 = gVar.c();
                boolean j2 = gVar.j(this, view);
                if (j2 && !c2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (j2 && !z2) {
                    break;
                }
            }
        }
        list.clear();
        return z;
    }

    public final void R() {
        this.Y0.clear();
        this.Z0.c();
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            g D = D(childAt);
            D.d(this, childAt);
            this.Z0.b(childAt);
            for (int i3 = 0; i3 < childCount; i3++) {
                if (i3 != i2) {
                    View childAt2 = getChildAt(i3);
                    if (D.b(this, childAt, childAt2)) {
                        if (!this.Z0.d(childAt2)) {
                            this.Z0.b(childAt2);
                        }
                        this.Z0.a(childAt2, childAt);
                    }
                }
            }
        }
        this.Y0.addAll(this.Z0.i());
        Collections.reverse(this.Y0);
    }

    public void S(View view, Rect rect) {
        ((g) view.getLayoutParams()).s(rect);
    }

    public void U() {
        if (this.g1 && this.k1 != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.k1);
        }
        this.l1 = false;
    }

    public final void V(boolean z) {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            c f2 = ((g) childAt.getLayoutParams()).f();
            if (f2 != null) {
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                if (z) {
                    f2.s(this, childAt, obtain);
                } else {
                    f2.L(this, childAt, obtain);
                }
                obtain.recycle();
            }
        }
        for (int i3 = 0; i3 < childCount; i3++) {
            ((g) getChildAt(i3).getLayoutParams()).n();
        }
        this.i1 = null;
        this.f1 = false;
    }

    public final void Z(View view, int i2) {
        g gVar = (g) view.getLayoutParams();
        int i3 = gVar.i;
        if (i3 != i2) {
            C6516gH2.j1(view, i2 - i3);
            gVar.i = i2;
        }
    }

    public final void a0(View view, int i2) {
        g gVar = (g) view.getLayoutParams();
        int i3 = gVar.j;
        if (i3 != i2) {
            C6516gH2.k1(view, i2 - i3);
            gVar.j = i2;
        }
    }

    public final RL2 b0(RL2 rl2) {
        boolean z;
        if (!C2691Ct1.a(this.m1, rl2)) {
            this.m1 = rl2;
            boolean z2 = false;
            if (rl2 != null && rl2.r() > 0) {
                z = true;
            } else {
                z = false;
            }
            this.n1 = z;
            if (!z && getBackground() == null) {
                z2 = true;
            }
            setWillNotDraw(z2);
            RL2 i2 = i(rl2);
            requestLayout();
            return i2;
        }
        return rl2;
    }

    public final void c0() {
        if (C6516gH2.Y(this)) {
            if (this.q1 == null) {
                this.q1 = new a();
            }
            C6516gH2.l2(this, this.q1);
            setSystemUiVisibility(q0.q1);
            return;
        }
        C6516gH2.l2(this, null);
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if ((layoutParams instanceof g) && super.checkLayoutParams(layoutParams)) {
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j2) {
        g gVar = (g) view.getLayoutParams();
        c cVar = gVar.a;
        if (cVar != null) {
            float k = cVar.k(this, view);
            if (k > 0.0f) {
                if (this.c1 == null) {
                    this.c1 = new Paint();
                }
                this.c1.setColor(gVar.a.j(this, view));
                this.c1.setAlpha(g(Math.round(k * 255.0f), 0, 255));
                int save = canvas.save();
                if (view.isOpaque()) {
                    canvas.clipRect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom(), Region.Op.DIFFERENCE);
                }
                canvas.drawRect(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom(), this.c1);
                canvas.restoreToCount(save);
                return super.drawChild(canvas, view, j2);
            }
        }
        return super.drawChild(canvas, view, j2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        boolean z;
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.o1;
        if (drawable != null && drawable.isStateful()) {
            z = drawable.setState(drawableState);
        } else {
            z = false;
        }
        if (z) {
            invalidate();
        }
    }

    public void f() {
        if (this.g1) {
            if (this.k1 == null) {
                this.k1 = new h();
            }
            getViewTreeObserver().addOnPreDrawListener(this.k1);
        }
        this.l1 = true;
    }

    public final List<View> getDependencySortedChildren() {
        R();
        return Collections.unmodifiableList(this.Y0);
    }

    public final RL2 getLastWindowInsets() {
        return this.m1;
    }

    @Override // android.view.ViewGroup, o.InterfaceC10313vp1
    public int getNestedScrollAxes() {
        return this.r1.a();
    }

    public Drawable getStatusBarBackground() {
        return this.o1;
    }

    @Override // android.view.View
    public int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingTop() + getPaddingBottom());
    }

    @Override // android.view.View
    public int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingLeft() + getPaddingRight());
    }

    public final void h(g gVar, Rect rect, int i2, int i3) {
        int width = getWidth();
        int height = getHeight();
        int max = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) gVar).leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i2) - ((ViewGroup.MarginLayoutParams) gVar).rightMargin));
        int max2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) gVar).topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i3) - ((ViewGroup.MarginLayoutParams) gVar).bottomMargin));
        rect.set(max, max2, i2 + max, i3 + max2);
    }

    public final RL2 i(RL2 rl2) {
        c f2;
        if (rl2.A()) {
            return rl2;
        }
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (C6516gH2.Y(childAt) && (f2 = ((g) childAt.getLayoutParams()).f()) != null) {
                rl2 = f2.n(this, childAt, rl2);
                if (rl2.A()) {
                    return rl2;
                }
            }
        }
        return rl2;
    }

    public void j(View view) {
        List g2 = this.Z0.g(view);
        if (g2 != null && !g2.isEmpty()) {
            for (int i2 = 0; i2 < g2.size(); i2++) {
                View view2 = (View) g2.get(i2);
                c f2 = ((g) view2.getLayoutParams()).f();
                if (f2 != null) {
                    f2.p(this, view2, view);
                }
            }
        }
    }

    public boolean k(View view, View view2) {
        boolean z;
        boolean z2;
        boolean z3 = false;
        if (view.getVisibility() != 0 || view2.getVisibility() != 0) {
            return false;
        }
        Rect e2 = e();
        if (view.getParent() != this) {
            z = true;
        } else {
            z = false;
        }
        v(view, z, e2);
        Rect e3 = e();
        if (view2.getParent() != this) {
            z2 = true;
        } else {
            z2 = false;
        }
        v(view2, z2, e3);
        try {
            if (e2.left <= e3.right && e2.top <= e3.bottom && e2.right >= e3.left) {
                if (e2.bottom >= e3.top) {
                    z3 = true;
                }
            }
            return z3;
        } finally {
            T(e2);
            T(e3);
        }
    }

    public void l() {
        int childCount = getChildCount();
        boolean z = false;
        int i2 = 0;
        while (true) {
            if (i2 >= childCount) {
                break;
            } else if (F(getChildAt(i2))) {
                z = true;
                break;
            } else {
                i2++;
            }
        }
        if (z != this.l1) {
            if (z) {
                f();
            } else {
                U();
            }
        }
    }

    @Override // android.view.ViewGroup
    /* renamed from: m */
    public g generateDefaultLayoutParams() {
        return new g(-2, -2);
    }

    @Override // o.InterfaceC9827tp1
    public void n(View view, View view2, int i2, int i3) {
        c f2;
        View view3;
        View view4;
        int i4;
        int i5;
        this.r1.c(view, view2, i2, i3);
        this.j1 = view2;
        int childCount = getChildCount();
        int i6 = 0;
        while (i6 < childCount) {
            View childAt = getChildAt(i6);
            g gVar = (g) childAt.getLayoutParams();
            if (!gVar.k(i3) || (f2 = gVar.f()) == null) {
                view3 = view;
                view4 = view2;
                i4 = i2;
                i5 = i3;
            } else {
                view3 = view;
                view4 = view2;
                i4 = i2;
                i5 = i3;
                f2.D(this, childAt, view3, view4, i4, i5);
            }
            i6++;
            view = view3;
            view2 = view4;
            i2 = i4;
            i3 = i5;
        }
    }

    @Override // o.InterfaceC9827tp1
    public void o(View view, int i2) {
        this.r1.e(view, i2);
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            g gVar = (g) childAt.getLayoutParams();
            if (gVar.k(i2)) {
                c f2 = gVar.f();
                if (f2 != null) {
                    f2.K(this, childAt, view, i2);
                }
                gVar.m(i2);
                gVar.l();
            }
        }
        this.j1 = null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        V(false);
        if (this.l1) {
            if (this.k1 == null) {
                this.k1 = new h();
            }
            getViewTreeObserver().addOnPreDrawListener(this.k1);
        }
        if (this.m1 == null && C6516gH2.Y(this)) {
            C6516gH2.C1(this);
        }
        this.g1 = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        V(false);
        if (this.l1 && this.k1 != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.k1);
        }
        View view = this.j1;
        if (view != null) {
            onStopNestedScroll(view);
        }
        this.g1 = false;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        int i2;
        super.onDraw(canvas);
        if (this.n1 && this.o1 != null) {
            RL2 rl2 = this.m1;
            if (rl2 != null) {
                i2 = rl2.r();
            } else {
                i2 = 0;
            }
            if (i2 > 0) {
                this.o1.setBounds(0, 0, getWidth(), i2);
                this.o1.draw(canvas);
            }
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            V(true);
        }
        boolean Q = Q(motionEvent, 0);
        if (actionMasked != 1 && actionMasked != 3) {
            return Q;
        }
        V(true);
        return Q;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        c f2;
        int e0 = C6516gH2.e0(this);
        int size = this.Y0.size();
        for (int i6 = 0; i6 < size; i6++) {
            View view = this.Y0.get(i6);
            if (view.getVisibility() != 8 && ((f2 = ((g) view.getLayoutParams()).f()) == null || !f2.t(this, view, e0))) {
                N(view, e0);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x012f  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onMeasure(int i2, int i3) {
        boolean z;
        boolean z2;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        c f2;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        View view;
        int i18;
        int i19;
        int max;
        CoordinatorLayout coordinatorLayout = this;
        coordinatorLayout.R();
        coordinatorLayout.l();
        int paddingLeft = coordinatorLayout.getPaddingLeft();
        int paddingTop = coordinatorLayout.getPaddingTop();
        int paddingRight = coordinatorLayout.getPaddingRight();
        int paddingBottom = coordinatorLayout.getPaddingBottom();
        int e0 = C6516gH2.e0(coordinatorLayout);
        if (e0 == 1) {
            z = true;
        } else {
            z = false;
        }
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i3);
        int size2 = View.MeasureSpec.getSize(i3);
        int i20 = paddingLeft + paddingRight;
        int i21 = paddingTop + paddingBottom;
        int suggestedMinimumWidth = coordinatorLayout.getSuggestedMinimumWidth();
        int suggestedMinimumHeight = coordinatorLayout.getSuggestedMinimumHeight();
        if (coordinatorLayout.m1 != null && C6516gH2.Y(coordinatorLayout)) {
            z2 = true;
        } else {
            z2 = false;
        }
        int size3 = coordinatorLayout.Y0.size();
        int i22 = 0;
        int i23 = 0;
        while (i22 < size3) {
            View view2 = coordinatorLayout.Y0.get(i22);
            int i24 = suggestedMinimumWidth;
            if (view2.getVisibility() == 8) {
                i12 = size3;
                i7 = i22;
                i14 = paddingLeft;
                i10 = e0;
                suggestedMinimumWidth = i24;
                i18 = paddingRight;
            } else {
                g gVar = (g) view2.getLayoutParams();
                int i25 = gVar.e;
                if (i25 >= 0 && mode != 0) {
                    int B = coordinatorLayout.B(i25);
                    int d2 = JE0.d(Y(gVar.c), e0) & 7;
                    i4 = suggestedMinimumHeight;
                    if ((d2 == 3 && !z) || (d2 == 5 && z)) {
                        max = Math.max(0, (size - paddingRight) - B);
                    } else if ((d2 == 5 && !z) || (d2 == 3 && z)) {
                        max = Math.max(0, B - paddingLeft);
                    }
                    int i26 = i22;
                    i6 = max;
                    i5 = i26;
                    if (!z2 && !C6516gH2.Y(view2)) {
                        i7 = i5;
                        i8 = View.MeasureSpec.makeMeasureSpec(size - (coordinatorLayout.m1.p() + coordinatorLayout.m1.q()), mode);
                        i9 = View.MeasureSpec.makeMeasureSpec(size2 - (coordinatorLayout.m1.r() + coordinatorLayout.m1.o()), mode2);
                    } else {
                        i7 = i5;
                        i8 = i2;
                        i9 = i3;
                    }
                    f2 = gVar.f();
                    if (f2 == null) {
                        i12 = size3;
                        int i27 = i8;
                        view = view2;
                        int i28 = i4;
                        i10 = e0;
                        i11 = i28;
                        i14 = paddingLeft;
                        i15 = i24;
                        i18 = paddingRight;
                        i19 = i23;
                        int i29 = i9;
                        boolean u = f2.u(this, view, i27, i6, i29, 0);
                        i17 = i27;
                        i13 = i6;
                        i16 = i29;
                        if (u) {
                            coordinatorLayout = this;
                            suggestedMinimumWidth = Math.max(i15, i20 + view.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) gVar).leftMargin + ((ViewGroup.MarginLayoutParams) gVar).rightMargin);
                            int max2 = Math.max(i11, i21 + view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) gVar).topMargin + ((ViewGroup.MarginLayoutParams) gVar).bottomMargin);
                            i23 = View.combineMeasuredStates(i19, view.getMeasuredState());
                            suggestedMinimumHeight = max2;
                        }
                    } else {
                        int i30 = i4;
                        i10 = e0;
                        i11 = i30;
                        i12 = size3;
                        i13 = i6;
                        i14 = paddingLeft;
                        i15 = i24;
                        i16 = i9;
                        i17 = i8;
                        view = view2;
                        i18 = paddingRight;
                        i19 = i23;
                    }
                    View view3 = view;
                    coordinatorLayout = this;
                    coordinatorLayout.O(view3, i17, i13, i16, 0);
                    view = view3;
                    suggestedMinimumWidth = Math.max(i15, i20 + view.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) gVar).leftMargin + ((ViewGroup.MarginLayoutParams) gVar).rightMargin);
                    int max22 = Math.max(i11, i21 + view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) gVar).topMargin + ((ViewGroup.MarginLayoutParams) gVar).bottomMargin);
                    i23 = View.combineMeasuredStates(i19, view.getMeasuredState());
                    suggestedMinimumHeight = max22;
                } else {
                    i4 = suggestedMinimumHeight;
                }
                i5 = i22;
                i6 = 0;
                if (!z2) {
                }
                i7 = i5;
                i8 = i2;
                i9 = i3;
                f2 = gVar.f();
                if (f2 == null) {
                }
                View view32 = view;
                coordinatorLayout = this;
                coordinatorLayout.O(view32, i17, i13, i16, 0);
                view = view32;
                suggestedMinimumWidth = Math.max(i15, i20 + view.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) gVar).leftMargin + ((ViewGroup.MarginLayoutParams) gVar).rightMargin);
                int max222 = Math.max(i11, i21 + view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) gVar).topMargin + ((ViewGroup.MarginLayoutParams) gVar).bottomMargin);
                i23 = View.combineMeasuredStates(i19, view.getMeasuredState());
                suggestedMinimumHeight = max222;
            }
            i22 = i7 + 1;
            paddingLeft = i14;
            paddingRight = i18;
            e0 = i10;
            size3 = i12;
        }
        int i31 = i23;
        coordinatorLayout.setMeasuredDimension(View.resolveSizeAndState(suggestedMinimumWidth, i2, (-16777216) & i31), View.resolveSizeAndState(suggestedMinimumHeight, i3, i31 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, o.InterfaceC10313vp1
    public boolean onNestedFling(View view, float f2, float f3, boolean z) {
        c f4;
        View view2;
        float f5;
        float f6;
        boolean z2;
        int childCount = getChildCount();
        int i2 = 0;
        boolean z3 = false;
        while (i2 < childCount) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() != 8) {
                g gVar = (g) childAt.getLayoutParams();
                if (gVar.k(0) && (f4 = gVar.f()) != null) {
                    view2 = view;
                    f5 = f2;
                    f6 = f3;
                    z2 = z;
                    z3 |= f4.v(this, childAt, view2, f5, f6, z2);
                    i2++;
                    view = view2;
                    f2 = f5;
                    f3 = f6;
                    z = z2;
                }
            }
            view2 = view;
            f5 = f2;
            f6 = f3;
            z2 = z;
            i2++;
            view = view2;
            f2 = f5;
            f3 = f6;
            z = z2;
        }
        if (z3) {
            M(1);
        }
        return z3;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, o.InterfaceC10313vp1
    public boolean onNestedPreFling(View view, float f2, float f3) {
        c f4;
        View view2;
        float f5;
        float f6;
        int childCount = getChildCount();
        int i2 = 0;
        boolean z = false;
        while (i2 < childCount) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() != 8) {
                g gVar = (g) childAt.getLayoutParams();
                if (gVar.k(0) && (f4 = gVar.f()) != null) {
                    view2 = view;
                    f5 = f2;
                    f6 = f3;
                    z |= f4.w(this, childAt, view2, f5, f6);
                    i2++;
                    view = view2;
                    f2 = f5;
                    f3 = f6;
                }
            }
            view2 = view;
            f5 = f2;
            f6 = f3;
            i2++;
            view = view2;
            f2 = f5;
            f3 = f6;
        }
        return z;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, o.InterfaceC10313vp1
    public void onNestedPreScroll(View view, int i2, int i3, int[] iArr) {
        p(view, i2, i3, iArr, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, o.InterfaceC10313vp1
    public void onNestedScroll(View view, int i2, int i3, int i4, int i5) {
        t(view, i2, i3, i4, i5, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, o.InterfaceC10313vp1
    public void onNestedScrollAccepted(View view, View view2, int i2) {
        n(view, view2, i2, 0);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof i)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        i iVar = (i) parcelable;
        super.onRestoreInstanceState(iVar.a());
        SparseArray<Parcelable> sparseArray = iVar.Z;
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            int id = childAt.getId();
            c f2 = D(childAt).f();
            if (id != -1 && f2 != null && (parcelable2 = sparseArray.get(id)) != null) {
                f2.F(this, childAt, parcelable2);
            }
        }
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        Parcelable G;
        i iVar = new i(super.onSaveInstanceState());
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            int id = childAt.getId();
            c f2 = ((g) childAt.getLayoutParams()).f();
            if (id != -1 && f2 != null && (G = f2.G(this, childAt)) != null) {
                sparseArray.append(id, G);
            }
        }
        iVar.Z = sparseArray;
        return iVar;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, o.InterfaceC10313vp1
    public boolean onStartNestedScroll(View view, View view2, int i2) {
        return u(view, view2, i2, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, o.InterfaceC10313vp1
    public void onStopNestedScroll(View view) {
        o(view, 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0012, code lost:
        if (r3 != false) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004c  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        boolean L;
        MotionEvent motionEvent2;
        int actionMasked = motionEvent.getActionMasked();
        if (this.i1 == null) {
            z = Q(motionEvent, 1);
        } else {
            z = false;
        }
        c f2 = ((g) this.i1.getLayoutParams()).f();
        if (f2 != null) {
            L = f2.L(this, this.i1, motionEvent);
            motionEvent2 = null;
            if (this.i1 != null) {
                L |= super.onTouchEvent(motionEvent);
            } else if (z) {
                long uptimeMillis = SystemClock.uptimeMillis();
                motionEvent2 = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                super.onTouchEvent(motionEvent2);
            }
            if (motionEvent2 != null) {
                motionEvent2.recycle();
            }
            if (actionMasked == 1 && actionMasked != 3) {
                return L;
            }
            V(false);
            return L;
        }
        L = false;
        motionEvent2 = null;
        if (this.i1 != null) {
        }
        if (motionEvent2 != null) {
        }
        if (actionMasked == 1) {
        }
        V(false);
        return L;
    }

    @Override // o.InterfaceC9827tp1
    public void p(View view, int i2, int i3, int[] iArr, int i4) {
        c f2;
        int min;
        int min2;
        int childCount = getChildCount();
        boolean z = false;
        int i5 = 0;
        int i6 = 0;
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if (childAt.getVisibility() != 8) {
                g gVar = (g) childAt.getLayoutParams();
                if (gVar.k(i4) && (f2 = gVar.f()) != null) {
                    int[] iArr2 = this.d1;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    f2.y(this, childAt, view, i2, i3, iArr2, i4);
                    int[] iArr3 = this.d1;
                    if (i2 > 0) {
                        min = Math.max(i5, iArr3[0]);
                    } else {
                        min = Math.min(i5, iArr3[0]);
                    }
                    i5 = min;
                    int[] iArr4 = this.d1;
                    if (i3 > 0) {
                        min2 = Math.max(i6, iArr4[1]);
                    } else {
                        min2 = Math.min(i6, iArr4[1]);
                    }
                    i6 = min2;
                    z = true;
                }
            }
        }
        iArr[0] = i5;
        iArr[1] = i6;
        if (z) {
            M(1);
        }
    }

    @Override // android.view.ViewGroup
    /* renamed from: q */
    public g generateLayoutParams(AttributeSet attributeSet) {
        return new g(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    /* renamed from: r */
    public g generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof g) {
            return new g((g) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new g((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new g(layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        c f2 = ((g) view.getLayoutParams()).f();
        if (f2 != null && f2.E(this, view, rect, z)) {
            return true;
        }
        return super.requestChildRectangleOnScreen(view, rect, z);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        if (z && !this.f1) {
            V(false);
            this.f1 = true;
        }
    }

    @Override // o.InterfaceC10070up1
    public void s(View view, int i2, int i3, int i4, int i5, int i6, int[] iArr) {
        c f2;
        int min;
        int min2;
        int childCount = getChildCount();
        boolean z = false;
        int i7 = 0;
        int i8 = 0;
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = getChildAt(i9);
            if (childAt.getVisibility() != 8) {
                g gVar = (g) childAt.getLayoutParams();
                if (gVar.k(i6) && (f2 = gVar.f()) != null) {
                    int[] iArr2 = this.d1;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    f2.B(this, childAt, view, i2, i3, i4, i5, i6, iArr2);
                    int[] iArr3 = this.d1;
                    if (i4 > 0) {
                        min = Math.max(i7, iArr3[0]);
                    } else {
                        min = Math.min(i7, iArr3[0]);
                    }
                    i7 = min;
                    int[] iArr4 = this.d1;
                    if (i5 > 0) {
                        min2 = Math.max(i8, iArr4[1]);
                    } else {
                        min2 = Math.min(i8, iArr4[1]);
                    }
                    i8 = min2;
                    z = true;
                }
            }
        }
        iArr[0] = iArr[0] + i7;
        iArr[1] = iArr[1] + i8;
        if (z) {
            M(1);
        }
    }

    @Override // android.view.View
    public void setFitsSystemWindows(boolean z) {
        super.setFitsSystemWindows(z);
        c0();
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.p1 = onHierarchyChangeListener;
    }

    public void setStatusBarBackground(Drawable drawable) {
        boolean z;
        Drawable drawable2 = this.o1;
        if (drawable2 != drawable) {
            Drawable drawable3 = null;
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.o1 = drawable3;
            if (drawable3 != null) {
                if (drawable3.isStateful()) {
                    this.o1.setState(getDrawableState());
                }
                D60.m(this.o1, C6516gH2.e0(this));
                Drawable drawable4 = this.o1;
                if (getVisibility() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                drawable4.setVisible(z, false);
                this.o1.setCallback(this);
            }
            C6516gH2.u1(this);
        }
    }

    public void setStatusBarBackgroundColor(int i2) {
        setStatusBarBackground(new ColorDrawable(i2));
    }

    public void setStatusBarBackgroundResource(int i2) {
        Drawable drawable;
        if (i2 != 0) {
            drawable = C10201vM.l(getContext(), i2);
        } else {
            drawable = null;
        }
        setStatusBarBackground(drawable);
    }

    @Override // android.view.View
    public void setVisibility(int i2) {
        boolean z;
        super.setVisibility(i2);
        if (i2 == 0) {
            z = true;
        } else {
            z = false;
        }
        Drawable drawable = this.o1;
        if (drawable != null && drawable.isVisible() != z) {
            this.o1.setVisible(z, false);
        }
    }

    @Override // o.InterfaceC9827tp1
    public void t(View view, int i2, int i3, int i4, int i5, int i6) {
        s(view, i2, i3, i4, i5, 0, this.e1);
    }

    @Override // o.InterfaceC9827tp1
    public boolean u(View view, View view2, int i2, int i3) {
        int childCount = getChildCount();
        boolean z = false;
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() != 8) {
                g gVar = (g) childAt.getLayoutParams();
                c f2 = gVar.f();
                if (f2 != null) {
                    boolean I = f2.I(this, childAt, view, view2, i2, i3);
                    z |= I;
                    gVar.t(i3, I);
                } else {
                    gVar.t(i3, false);
                }
            }
        }
        return z;
    }

    public void v(View view, boolean z, Rect rect) {
        if (!view.isLayoutRequested() && view.getVisibility() != 8) {
            if (z) {
                y(view, rect);
                return;
            } else {
                rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
                return;
            }
        }
        rect.setEmpty();
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && drawable != this.o1) {
            return false;
        }
        return true;
    }

    public List<View> w(View view) {
        List<View> h2 = this.Z0.h(view);
        this.b1.clear();
        if (h2 != null) {
            this.b1.addAll(h2);
        }
        return this.b1;
    }

    public List<View> x(View view) {
        List g2 = this.Z0.g(view);
        this.b1.clear();
        if (g2 != null) {
            this.b1.addAll(g2);
        }
        return this.b1;
    }

    public void y(View view, Rect rect) {
        C9212rH2.a(this, view, rect);
    }

    public void z(View view, int i2, Rect rect, Rect rect2) {
        g gVar = (g) view.getLayoutParams();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        A(view, i2, rect, rect2, gVar, measuredWidth, measuredHeight);
        h(gVar, rect2, measuredWidth, measuredHeight);
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, GL1.a.b);
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        TypedArray obtainStyledAttributes;
        CoordinatorLayout coordinatorLayout;
        Context context2;
        this.Y0 = new ArrayList();
        this.Z0 = new F30<>();
        this.a1 = new ArrayList();
        this.b1 = new ArrayList();
        this.d1 = new int[2];
        this.e1 = new int[2];
        this.r1 = new C10559wp1(this);
        if (i2 == 0) {
            obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, GL1.j.g, 0, GL1.i.h);
        } else {
            obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, GL1.j.g, i2, 0);
        }
        TypedArray typedArray = obtainStyledAttributes;
        if (Build.VERSION.SDK_INT < 29) {
            coordinatorLayout = this;
            context2 = context;
        } else if (i2 == 0) {
            coordinatorLayout = this;
            context2 = context;
            JP.a(coordinatorLayout, context2, GL1.j.g, attributeSet, typedArray, 0, GL1.i.h);
        } else {
            context2 = context;
            coordinatorLayout = this;
            JP.a(coordinatorLayout, context2, GL1.j.g, attributeSet, typedArray, i2, 0);
        }
        int resourceId = typedArray.getResourceId(GL1.j.h, 0);
        if (resourceId != 0) {
            Resources resources = context2.getResources();
            coordinatorLayout.h1 = resources.getIntArray(resourceId);
            float f2 = resources.getDisplayMetrics().density;
            int length = coordinatorLayout.h1.length;
            for (int i3 = 0; i3 < length; i3++) {
                int[] iArr = coordinatorLayout.h1;
                iArr[i3] = (int) (iArr[i3] * f2);
            }
        }
        coordinatorLayout.o1 = typedArray.getDrawable(GL1.j.i);
        typedArray.recycle();
        c0();
        super.setOnHierarchyChangeListener(new f());
        if (C6516gH2.Z(this) == 0) {
            C6516gH2.a2(this, 1);
        }
    }

    /* loaded from: classes.dex */
    public static class i extends J {
        public static final Parcelable.Creator<i> CREATOR = new a();
        public SparseArray<Parcelable> Z;

        /* loaded from: classes.dex */
        public static class a implements Parcelable.ClassLoaderCreator<i> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public i createFromParcel(Parcel parcel) {
                return new i(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b */
            public i createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new i(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c */
            public i[] newArray(int i) {
                return new i[i];
            }
        }

        public i(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            int readInt = parcel.readInt();
            int[] iArr = new int[readInt];
            parcel.readIntArray(iArr);
            Parcelable[] readParcelableArray = parcel.readParcelableArray(classLoader);
            this.Z = new SparseArray<>(readInt);
            for (int i = 0; i < readInt; i++) {
                this.Z.append(iArr[i], readParcelableArray[i]);
            }
        }

        @Override // o.J, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            int i2;
            super.writeToParcel(parcel, i);
            SparseArray<Parcelable> sparseArray = this.Z;
            if (sparseArray != null) {
                i2 = sparseArray.size();
            } else {
                i2 = 0;
            }
            parcel.writeInt(i2);
            int[] iArr = new int[i2];
            Parcelable[] parcelableArr = new Parcelable[i2];
            for (int i3 = 0; i3 < i2; i3++) {
                iArr[i3] = this.Z.keyAt(i3);
                parcelableArr[i3] = this.Z.valueAt(i3);
            }
            parcel.writeIntArray(iArr);
            parcel.writeParcelableArray(parcelableArr, i);
        }

        public i(Parcelable parcelable) {
            super(parcelable);
        }
    }

    /* loaded from: classes.dex */
    public static class g extends ViewGroup.MarginLayoutParams {
        public c a;
        public boolean b;
        public int c;
        public int d;
        public int e;
        public int f;
        public int g;
        public int h;
        public int i;
        public int j;
        public View k;
        public View l;
        public boolean m;
        public boolean n;

        /* renamed from: o  reason: collision with root package name */
        public boolean f28o;
        public boolean p;
        public final Rect q;
        public Object r;

        public g(int i, int i2) {
            super(i, i2);
            this.b = false;
            this.c = 0;
            this.d = 0;
            this.e = -1;
            this.f = -1;
            this.g = 0;
            this.h = 0;
            this.q = new Rect();
        }

        public boolean a() {
            if (this.k == null && this.f != -1) {
                return true;
            }
            return false;
        }

        public boolean b(CoordinatorLayout coordinatorLayout, View view, View view2) {
            if (view2 != this.l && !u(view2, C6516gH2.e0(coordinatorLayout))) {
                c cVar = this.a;
                if (cVar == null || !cVar.m(coordinatorLayout, view, view2)) {
                    return false;
                }
                return true;
            }
            return true;
        }

        public boolean c() {
            if (this.a == null) {
                this.m = false;
            }
            return this.m;
        }

        public View d(CoordinatorLayout coordinatorLayout, View view) {
            if (this.f == -1) {
                this.l = null;
                this.k = null;
                return null;
            }
            if (this.k == null || !v(view, coordinatorLayout)) {
                o(view, coordinatorLayout);
            }
            return this.k;
        }

        public int e() {
            return this.f;
        }

        public c f() {
            return this.a;
        }

        public boolean g() {
            return this.p;
        }

        public Rect h() {
            return this.q;
        }

        public void i() {
            this.l = null;
            this.k = null;
        }

        public boolean j(CoordinatorLayout coordinatorLayout, View view) {
            boolean z;
            boolean z2 = this.m;
            if (z2) {
                return true;
            }
            c cVar = this.a;
            if (cVar != null) {
                z = cVar.h(coordinatorLayout, view);
            } else {
                z = false;
            }
            boolean z3 = z | z2;
            this.m = z3;
            return z3;
        }

        public boolean k(int i) {
            if (i != 0) {
                if (i != 1) {
                    return false;
                }
                return this.f28o;
            }
            return this.n;
        }

        public void l() {
            this.p = false;
        }

        public void m(int i) {
            t(i, false);
        }

        public void n() {
            this.m = false;
        }

        public final void o(View view, CoordinatorLayout coordinatorLayout) {
            View findViewById = coordinatorLayout.findViewById(this.f);
            this.k = findViewById;
            if (findViewById != null) {
                if (findViewById == coordinatorLayout) {
                    if (coordinatorLayout.isInEditMode()) {
                        this.l = null;
                        this.k = null;
                        return;
                    }
                    throw new IllegalStateException("View can not be anchored to the the parent CoordinatorLayout");
                }
                for (ViewParent parent = findViewById.getParent(); parent != coordinatorLayout && parent != null; parent = parent.getParent()) {
                    if (parent == view) {
                        if (coordinatorLayout.isInEditMode()) {
                            this.l = null;
                            this.k = null;
                            return;
                        }
                        throw new IllegalStateException("Anchor must not be a descendant of the anchored view");
                    }
                    if (parent instanceof View) {
                        findViewById = (View) parent;
                    }
                }
                this.l = findViewById;
            } else if (coordinatorLayout.isInEditMode()) {
                this.l = null;
                this.k = null;
            } else {
                throw new IllegalStateException("Could not find CoordinatorLayout descendant view with id " + coordinatorLayout.getResources().getResourceName(this.f) + " to anchor view " + view);
            }
        }

        public void p(int i) {
            i();
            this.f = i;
        }

        public void q(c cVar) {
            c cVar2 = this.a;
            if (cVar2 != cVar) {
                if (cVar2 != null) {
                    cVar2.r();
                }
                this.a = cVar;
                this.r = null;
                this.b = true;
                if (cVar != null) {
                    cVar.o(this);
                }
            }
        }

        public void r(boolean z) {
            this.p = z;
        }

        public void s(Rect rect) {
            this.q.set(rect);
        }

        public void t(int i, boolean z) {
            if (i != 0) {
                if (i != 1) {
                    return;
                }
                this.f28o = z;
                return;
            }
            this.n = z;
        }

        public final boolean u(View view, int i) {
            int d = JE0.d(((g) view.getLayoutParams()).g, i);
            if (d != 0 && (JE0.d(this.h, i) & d) == d) {
                return true;
            }
            return false;
        }

        public final boolean v(View view, CoordinatorLayout coordinatorLayout) {
            if (this.k.getId() != this.f) {
                return false;
            }
            View view2 = this.k;
            for (ViewParent parent = view2.getParent(); parent != coordinatorLayout; parent = parent.getParent()) {
                if (parent != null && parent != view) {
                    if (parent instanceof View) {
                        view2 = (View) parent;
                    }
                } else {
                    this.l = null;
                    this.k = null;
                    return false;
                }
            }
            this.l = view2;
            return true;
        }

        public g(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.b = false;
            this.c = 0;
            this.d = 0;
            this.e = -1;
            this.f = -1;
            this.g = 0;
            this.h = 0;
            this.q = new Rect();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, GL1.j.j);
            this.c = obtainStyledAttributes.getInteger(GL1.j.k, 0);
            this.f = obtainStyledAttributes.getResourceId(GL1.j.l, -1);
            this.d = obtainStyledAttributes.getInteger(GL1.j.m, 0);
            this.e = obtainStyledAttributes.getInteger(GL1.j.q, -1);
            this.g = obtainStyledAttributes.getInt(GL1.j.p, 0);
            this.h = obtainStyledAttributes.getInt(GL1.j.f473o, 0);
            int i = GL1.j.n;
            boolean hasValue = obtainStyledAttributes.hasValue(i);
            this.b = hasValue;
            if (hasValue) {
                this.a = CoordinatorLayout.P(context, attributeSet, obtainStyledAttributes.getString(i));
            }
            obtainStyledAttributes.recycle();
            c cVar = this.a;
            if (cVar != null) {
                cVar.o(this);
            }
        }

        public g(g gVar) {
            super((ViewGroup.MarginLayoutParams) gVar);
            this.b = false;
            this.c = 0;
            this.d = 0;
            this.e = -1;
            this.f = -1;
            this.g = 0;
            this.h = 0;
            this.q = new Rect();
        }

        public g(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.b = false;
            this.c = 0;
            this.d = 0;
            this.e = -1;
            this.f = -1;
            this.g = 0;
            this.h = 0;
            this.q = new Rect();
        }

        public g(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.b = false;
            this.c = 0;
            this.d = 0;
            this.e = -1;
            this.f = -1;
            this.g = 0;
            this.h = 0;
            this.q = new Rect();
        }
    }
}
