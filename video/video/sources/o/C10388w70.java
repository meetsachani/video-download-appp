package o;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import o.OL1;

/* renamed from: o.w70  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C10388w70 extends ListView {
    public static final int l1 = -1;
    public static final int m1 = -1;
    public final Rect Y0;
    public int Z0;
    public int a1;
    public int b1;
    public int c1;
    public int d1;
    public d e1;
    public boolean f1;
    public boolean g1;
    public boolean h1;
    public ZH2 i1;
    public C7907m11 j1;
    public f k1;

    /* renamed from: o.w70$a */
    /* loaded from: classes.dex */
    public static class a {
        public static void a(View view, float f, float f2) {
            view.drawableHotspotChanged(f, f2);
        }
    }

    /* renamed from: o.w70$b */
    /* loaded from: classes.dex */
    public static class b {
        public static Method a;
        public static Method b;
        public static Method c;
        public static boolean d;

        static {
            try {
                Class cls = Integer.TYPE;
                Class cls2 = Boolean.TYPE;
                Class cls3 = Float.TYPE;
                Method declaredMethod = AbsListView.class.getDeclaredMethod("positionSelector", cls, View.class, cls2, cls3, cls3);
                a = declaredMethod;
                declaredMethod.setAccessible(true);
                Method declaredMethod2 = AdapterView.class.getDeclaredMethod("setSelectedPositionInt", cls);
                b = declaredMethod2;
                declaredMethod2.setAccessible(true);
                Method declaredMethod3 = AdapterView.class.getDeclaredMethod("setNextSelectedPositionInt", cls);
                c = declaredMethod3;
                declaredMethod3.setAccessible(true);
                d = true;
            } catch (NoSuchMethodException e) {
                e.printStackTrace();
            }
        }

        public static boolean a() {
            return d;
        }

        public static void b(C10388w70 c10388w70, int i, View view) {
            try {
                a.invoke(c10388w70, Integer.valueOf(i), view, Boolean.FALSE, -1, -1);
                b.invoke(c10388w70, Integer.valueOf(i));
                c.invoke(c10388w70, Integer.valueOf(i));
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e2) {
                e2.printStackTrace();
            }
        }
    }

    /* renamed from: o.w70$c */
    /* loaded from: classes.dex */
    public static class c {
        public static boolean a(AbsListView absListView) {
            return absListView.isSelectedChildViewEnabled();
        }

        public static void b(AbsListView absListView, boolean z) {
            absListView.setSelectedChildViewEnabled(z);
        }
    }

    /* renamed from: o.w70$d */
    /* loaded from: classes.dex */
    public static class d extends C5249b70 {
        public boolean Y;

        public d(Drawable drawable) {
            super(drawable);
            this.Y = true;
        }

        public void c(boolean z) {
            this.Y = z;
        }

        @Override // o.C5249b70, android.graphics.drawable.Drawable
        public void draw(Canvas canvas) {
            if (this.Y) {
                super.draw(canvas);
            }
        }

        @Override // o.C5249b70, android.graphics.drawable.Drawable
        public void setHotspot(float f, float f2) {
            if (this.Y) {
                super.setHotspot(f, f2);
            }
        }

        @Override // o.C5249b70, android.graphics.drawable.Drawable
        public void setHotspotBounds(int i, int i2, int i3, int i4) {
            if (this.Y) {
                super.setHotspotBounds(i, i2, i3, i4);
            }
        }

        @Override // o.C5249b70, android.graphics.drawable.Drawable
        public boolean setState(int[] iArr) {
            if (this.Y) {
                return super.setState(iArr);
            }
            return false;
        }

        @Override // o.C5249b70, android.graphics.drawable.Drawable
        public boolean setVisible(boolean z, boolean z2) {
            if (this.Y) {
                return super.setVisible(z, z2);
            }
            return false;
        }
    }

    /* renamed from: o.w70$e */
    /* loaded from: classes.dex */
    public static class e {
        public static final Field a;

        static {
            Field field = null;
            try {
                field = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
                field.setAccessible(true);
            } catch (NoSuchFieldException e) {
                e.printStackTrace();
            }
            a = field;
        }

        public static boolean a(AbsListView absListView) {
            Field field = a;
            if (field != null) {
                try {
                    return field.getBoolean(absListView);
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                    return false;
                }
            }
            return false;
        }

        public static void b(AbsListView absListView, boolean z) {
            Field field = a;
            if (field != null) {
                try {
                    field.set(absListView, Boolean.valueOf(z));
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /* renamed from: o.w70$f */
    /* loaded from: classes.dex */
    public class f implements Runnable {
        public f() {
        }

        public void a() {
            C10388w70 c10388w70 = C10388w70.this;
            c10388w70.k1 = null;
            c10388w70.removeCallbacks(this);
        }

        public void b() {
            C10388w70.this.post(this);
        }

        @Override // java.lang.Runnable
        public void run() {
            C10388w70 c10388w70 = C10388w70.this;
            c10388w70.k1 = null;
            c10388w70.drawableStateChanged();
        }
    }

    public C10388w70(Context context, boolean z) {
        super(context, null, OL1.b.p1);
        this.Y0 = new Rect();
        this.Z0 = 0;
        this.a1 = 0;
        this.b1 = 0;
        this.c1 = 0;
        this.g1 = z;
        setCacheColorHint(0);
    }

    public final void a() {
        this.h1 = false;
        setPressed(false);
        drawableStateChanged();
        View childAt = getChildAt(this.d1 - getFirstVisiblePosition());
        if (childAt != null) {
            childAt.setPressed(false);
        }
        ZH2 zh2 = this.i1;
        if (zh2 != null) {
            zh2.d();
            this.i1 = null;
        }
    }

    public final void b(View view, int i) {
        performItemClick(view, i, getItemIdAtPosition(i));
    }

    public final void c(Canvas canvas) {
        Drawable selector;
        if (!this.Y0.isEmpty() && (selector = getSelector()) != null) {
            selector.setBounds(this.Y0);
            selector.draw(canvas);
        }
    }

    public int d(int i, boolean z) {
        int min;
        ListAdapter adapter = getAdapter();
        if (adapter != null && !isInTouchMode()) {
            int count = adapter.getCount();
            if (!getAdapter().areAllItemsEnabled()) {
                if (z) {
                    min = Math.max(0, i);
                    while (min < count && !adapter.isEnabled(min)) {
                        min++;
                    }
                } else {
                    min = Math.min(i, count - 1);
                    while (min >= 0 && !adapter.isEnabled(min)) {
                        min--;
                    }
                }
                if (min < 0 || min >= count) {
                    return -1;
                }
                return min;
            } else if (i >= 0 && i < count) {
                return i;
            }
        }
        return -1;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        c(canvas);
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        if (this.k1 != null) {
            return;
        }
        super.drawableStateChanged();
        k(true);
        o();
    }

    public int e(int i, int i2, int i3, int i4, int i5) {
        int makeMeasureSpec;
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        if (adapter == null) {
            return listPaddingTop + listPaddingBottom;
        }
        int i6 = listPaddingTop + listPaddingBottom;
        dividerHeight = (dividerHeight <= 0 || divider == null) ? 0 : 0;
        int count = adapter.getCount();
        int i7 = 0;
        int i8 = 0;
        View view = null;
        for (int i9 = 0; i9 < count; i9++) {
            int itemViewType = adapter.getItemViewType(i9);
            if (itemViewType != i7) {
                view = null;
                i7 = itemViewType;
            }
            view = adapter.getView(i9, view, this);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            int i10 = layoutParams.height;
            if (i10 > 0) {
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i10, 1073741824);
            } else {
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
            }
            view.measure(i, makeMeasureSpec);
            view.forceLayout();
            if (i9 > 0) {
                i6 += dividerHeight;
            }
            i6 += view.getMeasuredHeight();
            if (i6 >= i4) {
                if (i5 >= 0 && i9 > i5 && i8 > 0 && i6 != i4) {
                    return i8;
                }
                return i4;
            }
            if (i5 >= 0 && i9 >= i5) {
                i8 = i6;
            }
        }
        return i6;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x000c, code lost:
        if (r0 != 3) goto L7;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0048 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean f(MotionEvent motionEvent, int i) {
        boolean z;
        boolean z2;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 1) {
            if (actionMasked == 2) {
                z = true;
            }
        } else {
            z = false;
        }
        int findPointerIndex = motionEvent.findPointerIndex(i);
        if (findPointerIndex >= 0) {
            int x = (int) motionEvent.getX(findPointerIndex);
            int y = (int) motionEvent.getY(findPointerIndex);
            int pointToPosition = pointToPosition(x, y);
            if (pointToPosition == -1) {
                z2 = true;
                if (z || z2) {
                    a();
                }
                if (z) {
                    if (this.j1 == null) {
                        this.j1 = new C7907m11(this);
                    }
                    this.j1.y(true);
                    this.j1.onTouch(this, motionEvent);
                    return z;
                }
                C7907m11 c7907m11 = this.j1;
                if (c7907m11 != null) {
                    c7907m11.y(false);
                }
                return z;
            }
            View childAt = getChildAt(pointToPosition - getFirstVisiblePosition());
            j(childAt, pointToPosition, x, y);
            if (actionMasked == 1) {
                b(childAt, pointToPosition);
            }
            z = true;
            z2 = false;
            if (z) {
            }
            a();
            if (z) {
            }
        }
        z2 = false;
        z = false;
        if (z) {
        }
        a();
        if (z) {
        }
    }

    public final void g(int i, View view) {
        Rect rect = this.Y0;
        rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        rect.left -= this.Z0;
        rect.top -= this.a1;
        rect.right += this.b1;
        rect.bottom += this.c1;
        boolean l = l();
        if (view.isEnabled() != l) {
            m(!l);
            if (i != -1) {
                refreshDrawableState();
            }
        }
    }

    public final void h(int i, View view) {
        boolean z;
        Drawable selector = getSelector();
        boolean z2 = true;
        if (selector != null && i != -1) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            selector.setVisible(false, false);
        }
        g(i, view);
        if (z) {
            Rect rect = this.Y0;
            float exactCenterX = rect.exactCenterX();
            float exactCenterY = rect.exactCenterY();
            if (getVisibility() != 0) {
                z2 = false;
            }
            selector.setVisible(z2, false);
            D60.k(selector, exactCenterX, exactCenterY);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean hasFocus() {
        if (!this.g1 && !super.hasFocus()) {
            return false;
        }
        return true;
    }

    @Override // android.view.View
    public boolean hasWindowFocus() {
        if (!this.g1 && !super.hasWindowFocus()) {
            return false;
        }
        return true;
    }

    public final void i(int i, View view, float f2, float f3) {
        h(i, view);
        Drawable selector = getSelector();
        if (selector != null && i != -1) {
            D60.k(selector, f2, f3);
        }
    }

    @Override // android.view.View
    public boolean isFocused() {
        if (!this.g1 && !super.isFocused()) {
            return false;
        }
        return true;
    }

    @Override // android.view.View
    public boolean isInTouchMode() {
        if ((this.g1 && this.f1) || super.isInTouchMode()) {
            return true;
        }
        return false;
    }

    public final void j(View view, int i, float f2, float f3) {
        View childAt;
        this.h1 = true;
        a.a(this, f2, f3);
        if (!isPressed()) {
            setPressed(true);
        }
        layoutChildren();
        int i2 = this.d1;
        if (i2 != -1 && (childAt = getChildAt(i2 - getFirstVisiblePosition())) != null && childAt != view && childAt.isPressed()) {
            childAt.setPressed(false);
        }
        this.d1 = i;
        a.a(view, f2 - view.getLeft(), f3 - view.getTop());
        if (!view.isPressed()) {
            view.setPressed(true);
        }
        i(i, view, f2, f3);
        k(false);
        refreshDrawableState();
    }

    public final void k(boolean z) {
        d dVar = this.e1;
        if (dVar != null) {
            dVar.c(z);
        }
    }

    public final boolean l() {
        if (Build.VERSION.SDK_INT >= 33) {
            return c.a(this);
        }
        return e.a(this);
    }

    public final void m(boolean z) {
        if (Build.VERSION.SDK_INT >= 33) {
            c.b(this, z);
        } else {
            e.b(this, z);
        }
    }

    public final boolean n() {
        return this.h1;
    }

    public final void o() {
        Drawable selector = getSelector();
        if (selector != null && n() && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        this.k1 = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int i = Build.VERSION.SDK_INT;
        if (i < 26) {
            return super.onHoverEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.k1 == null) {
            f fVar = new f();
            this.k1 = fVar;
            fVar.b();
        }
        boolean onHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked != 9 && actionMasked != 7) {
            setSelection(-1);
            return onHoverEvent;
        }
        int pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        if (pointToPosition != -1 && pointToPosition != getSelectedItemPosition()) {
            View childAt = getChildAt(pointToPosition - getFirstVisiblePosition());
            if (childAt.isEnabled()) {
                requestFocus();
                if (i >= 30 && b.a()) {
                    b.b(this, pointToPosition, childAt);
                } else {
                    setSelectionFromTop(pointToPosition, childAt.getTop() - getTop());
                }
            }
            o();
        }
        return onHoverEvent;
    }

    @Override // android.widget.AbsListView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.d1 = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        f fVar = this.k1;
        if (fVar != null) {
            fVar.a();
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setListSelectionHidden(boolean z) {
        this.f1 = z;
    }

    @Override // android.widget.AbsListView
    public void setSelector(Drawable drawable) {
        d dVar;
        if (drawable != null) {
            dVar = new d(drawable);
        } else {
            dVar = null;
        }
        this.e1 = dVar;
        super.setSelector(dVar);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.Z0 = rect.left;
        this.a1 = rect.top;
        this.b1 = rect.right;
        this.c1 = rect.bottom;
    }
}
