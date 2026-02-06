package o;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import java.lang.reflect.Method;
import o.OL1;

/* renamed from: o.d11  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C5711d11 implements T52 {
    public static final String B1 = "ListPopupWindow";
    public static final boolean C1 = false;
    public static final int D1 = 250;
    public static Method E1 = null;
    public static Method F1 = null;
    public static Method G1 = null;
    public static final int H1 = 0;
    public static final int I1 = 1;
    public static final int J1 = -1;
    public static final int K1 = -2;
    public static final int L1 = 0;
    public static final int M1 = 1;
    public static final int N1 = 2;
    public PopupWindow A1;
    public Context X;
    public ListAdapter Y;
    public int Y0;
    public C10388w70 Z;
    public int Z0;
    public int a1;
    public int b1;
    public int c1;
    public boolean d1;
    public boolean e1;
    public boolean f1;
    public int g1;
    public boolean h1;
    public boolean i1;
    public int j1;
    public View k1;
    public int l1;
    public DataSetObserver m1;
    public View n1;
    public Drawable o1;
    public AdapterView.OnItemClickListener p1;
    public AdapterView.OnItemSelectedListener q1;
    public final j r1;
    public final i s1;
    public final h t1;
    public final f u1;
    public Runnable v1;
    public final Handler w1;
    public final Rect x1;
    public Rect y1;
    public boolean z1;

    /* renamed from: o.d11$a */
    /* loaded from: classes.dex */
    public class a extends AbstractView$OnTouchListenerC8397ny0 {
        public a(View view) {
            super(view);
        }

        @Override // o.AbstractView$OnTouchListenerC8397ny0
        /* renamed from: u */
        public C5711d11 b() {
            return C5711d11.this;
        }
    }

    /* renamed from: o.d11$b */
    /* loaded from: classes.dex */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            View u = C5711d11.this.u();
            if (u != null && u.getWindowToken() != null) {
                C5711d11.this.show();
            }
        }
    }

    /* renamed from: o.d11$d */
    /* loaded from: classes.dex */
    public static class d {
        public static int a(PopupWindow popupWindow, View view, int i, boolean z) {
            return popupWindow.getMaxAvailableHeight(view, i, z);
        }
    }

    /* renamed from: o.d11$e */
    /* loaded from: classes.dex */
    public static class e {
        public static void a(PopupWindow popupWindow, Rect rect) {
            popupWindow.setEpicenterBounds(rect);
        }

        public static void b(PopupWindow popupWindow, boolean z) {
            popupWindow.setIsClippedToScreen(z);
        }
    }

    /* renamed from: o.d11$f */
    /* loaded from: classes.dex */
    public class f implements Runnable {
        public f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C5711d11.this.r();
        }
    }

    /* renamed from: o.d11$g */
    /* loaded from: classes.dex */
    public class g extends DataSetObserver {
        public g() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            if (C5711d11.this.b()) {
                C5711d11.this.show();
            }
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            C5711d11.this.dismiss();
        }
    }

    /* renamed from: o.d11$i */
    /* loaded from: classes.dex */
    public class i implements View.OnTouchListener {
        public i() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            PopupWindow popupWindow;
            int action = motionEvent.getAction();
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            if (action == 0 && (popupWindow = C5711d11.this.A1) != null && popupWindow.isShowing() && x >= 0 && x < C5711d11.this.A1.getWidth() && y >= 0 && y < C5711d11.this.A1.getHeight()) {
                C5711d11 c5711d11 = C5711d11.this;
                c5711d11.w1.postDelayed(c5711d11.r1, 250L);
                return false;
            } else if (action == 1) {
                C5711d11 c5711d112 = C5711d11.this;
                c5711d112.w1.removeCallbacks(c5711d112.r1);
                return false;
            } else {
                return false;
            }
        }
    }

    /* renamed from: o.d11$j */
    /* loaded from: classes.dex */
    public class j implements Runnable {
        public j() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C10388w70 c10388w70 = C5711d11.this.Z;
            if (c10388w70 != null && c10388w70.isAttachedToWindow() && C5711d11.this.Z.getCount() > C5711d11.this.Z.getChildCount()) {
                int childCount = C5711d11.this.Z.getChildCount();
                C5711d11 c5711d11 = C5711d11.this;
                if (childCount <= c5711d11.j1) {
                    c5711d11.A1.setInputMethodMode(2);
                    C5711d11.this.show();
                }
            }
        }
    }

    static {
        if (Build.VERSION.SDK_INT <= 28) {
            try {
                E1 = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException unused) {
                Log.i(B1, "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
                G1 = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException unused2) {
                Log.i(B1, "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
    }

    public C5711d11(Context context) {
        this(context, null, OL1.b.Z1);
    }

    public static boolean H(int i2) {
        if (i2 != 66 && i2 != 23) {
            return false;
        }
        return true;
    }

    public int A() {
        return this.l1;
    }

    public Object B() {
        if (!b()) {
            return null;
        }
        return this.Z.getSelectedItem();
    }

    public long C() {
        if (!b()) {
            return Long.MIN_VALUE;
        }
        return this.Z.getSelectedItemId();
    }

    public int D() {
        if (!b()) {
            return -1;
        }
        return this.Z.getSelectedItemPosition();
    }

    public View E() {
        if (!b()) {
            return null;
        }
        return this.Z.getSelectedView();
    }

    public int F() {
        return this.A1.getSoftInputMode();
    }

    public int G() {
        return this.Z0;
    }

    public boolean I() {
        return this.h1;
    }

    public boolean J() {
        if (this.A1.getInputMethodMode() == 2) {
            return true;
        }
        return false;
    }

    public boolean K() {
        return this.z1;
    }

    public boolean L(int i2, KeyEvent keyEvent) {
        int i3;
        int i4;
        if (b() && i2 != 62 && (this.Z.getSelectedItemPosition() >= 0 || !H(i2))) {
            int selectedItemPosition = this.Z.getSelectedItemPosition();
            boolean isAboveAnchor = this.A1.isAboveAnchor();
            ListAdapter listAdapter = this.Y;
            if (listAdapter != null) {
                boolean areAllItemsEnabled = listAdapter.areAllItemsEnabled();
                if (areAllItemsEnabled) {
                    i3 = 0;
                } else {
                    i3 = this.Z.d(0, true);
                }
                if (areAllItemsEnabled) {
                    i4 = listAdapter.getCount() - 1;
                } else {
                    i4 = this.Z.d(listAdapter.getCount() - 1, false);
                }
            } else {
                i3 = Integer.MAX_VALUE;
                i4 = Integer.MIN_VALUE;
            }
            if ((!isAboveAnchor && i2 == 19 && selectedItemPosition <= i3) || (isAboveAnchor && i2 == 20 && selectedItemPosition >= i4)) {
                r();
                this.A1.setInputMethodMode(1);
                show();
                return true;
            }
            this.Z.setListSelectionHidden(false);
            if (this.Z.onKeyDown(i2, keyEvent)) {
                this.A1.setInputMethodMode(2);
                this.Z.requestFocusFromTouch();
                show();
                if (i2 == 19 || i2 == 20 || i2 == 23 || i2 == 66) {
                    return true;
                }
            } else if (!isAboveAnchor && i2 == 20) {
                if (selectedItemPosition == i4) {
                    return true;
                }
            } else if (isAboveAnchor && i2 == 19 && selectedItemPosition == i3) {
                return true;
            }
        }
        return false;
    }

    public boolean M(int i2, KeyEvent keyEvent) {
        if (i2 == 4 && b()) {
            View view = this.n1;
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                KeyEvent.DispatcherState keyDispatcherState = view.getKeyDispatcherState();
                if (keyDispatcherState != null) {
                    keyDispatcherState.startTracking(keyEvent, this);
                }
                return true;
            } else if (keyEvent.getAction() == 1) {
                KeyEvent.DispatcherState keyDispatcherState2 = view.getKeyDispatcherState();
                if (keyDispatcherState2 != null) {
                    keyDispatcherState2.handleUpEvent(keyEvent);
                }
                if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                    dismiss();
                    return true;
                }
                return false;
            } else {
                return false;
            }
        }
        return false;
    }

    public boolean N(int i2, KeyEvent keyEvent) {
        if (b() && this.Z.getSelectedItemPosition() >= 0) {
            boolean onKeyUp = this.Z.onKeyUp(i2, keyEvent);
            if (onKeyUp && H(i2)) {
                dismiss();
            }
            return onKeyUp;
        }
        return false;
    }

    public boolean O(int i2) {
        if (b()) {
            if (this.p1 != null) {
                C10388w70 c10388w70 = this.Z;
                this.p1.onItemClick(c10388w70, c10388w70.getChildAt(i2 - c10388w70.getFirstVisiblePosition()), i2, c10388w70.getAdapter().getItemId(i2));
                return true;
            }
            return true;
        }
        return false;
    }

    public void P() {
        this.w1.post(this.v1);
    }

    public final void Q() {
        View view = this.k1;
        if (view != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.k1);
            }
        }
    }

    public void R(View view) {
        this.n1 = view;
    }

    public void S(int i2) {
        this.A1.setAnimationStyle(i2);
    }

    public void T(int i2) {
        Drawable background = this.A1.getBackground();
        if (background != null) {
            background.getPadding(this.x1);
            Rect rect = this.x1;
            this.Z0 = rect.left + rect.right + i2;
            return;
        }
        m0(i2);
    }

    public void U(boolean z) {
        this.h1 = z;
    }

    public void V(int i2) {
        this.g1 = i2;
    }

    public void W(Rect rect) {
        Rect rect2;
        if (rect != null) {
            rect2 = new Rect(rect);
        } else {
            rect2 = null;
        }
        this.y1 = rect2;
    }

    public void X(boolean z) {
        this.i1 = z;
    }

    public void Y(int i2) {
        if (i2 < 0 && -2 != i2 && -1 != i2) {
            throw new IllegalArgumentException("Invalid height. Must be a positive value, MATCH_PARENT, or WRAP_CONTENT.");
        }
        this.Y0 = i2;
    }

    public void Z(int i2) {
        this.A1.setInputMethodMode(i2);
    }

    public void a(Drawable drawable) {
        this.A1.setBackgroundDrawable(drawable);
    }

    public void a0(int i2) {
        this.j1 = i2;
    }

    @Override // o.T52
    public boolean b() {
        return this.A1.isShowing();
    }

    public void b0(Drawable drawable) {
        this.o1 = drawable;
    }

    public int c() {
        return this.a1;
    }

    public void c0(boolean z) {
        this.z1 = z;
        this.A1.setFocusable(z);
    }

    public void d0(PopupWindow.OnDismissListener onDismissListener) {
        this.A1.setOnDismissListener(onDismissListener);
    }

    @Override // o.T52
    public void dismiss() {
        this.A1.dismiss();
        Q();
        this.A1.setContentView(null);
        this.Z = null;
        this.w1.removeCallbacks(this.r1);
    }

    public void e(int i2) {
        this.a1 = i2;
    }

    public void e0(AdapterView.OnItemClickListener onItemClickListener) {
        this.p1 = onItemClickListener;
    }

    public void f0(AdapterView.OnItemSelectedListener onItemSelectedListener) {
        this.q1 = onItemSelectedListener;
    }

    public Drawable g() {
        return this.A1.getBackground();
    }

    public void g0(boolean z) {
        this.f1 = true;
        this.e1 = z;
    }

    public final void h0(boolean z) {
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = E1;
            if (method != null) {
                try {
                    method.invoke(this.A1, Boolean.valueOf(z));
                    return;
                } catch (Exception unused) {
                    Log.i(B1, "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
                    return;
                }
            }
            return;
        }
        e.b(this.A1, z);
    }

    public void i(int i2) {
        this.b1 = i2;
        this.d1 = true;
    }

    public void i0(int i2) {
        this.l1 = i2;
    }

    public void j0(View view) {
        boolean b2 = b();
        if (b2) {
            Q();
        }
        this.k1 = view;
        if (b2) {
            show();
        }
    }

    public void k0(int i2) {
        C10388w70 c10388w70 = this.Z;
        if (b() && c10388w70 != null) {
            c10388w70.setListSelectionHidden(false);
            c10388w70.setSelection(i2);
            if (c10388w70.getChoiceMode() != 0) {
                c10388w70.setItemChecked(i2, true);
            }
        }
    }

    public int l() {
        if (!this.d1) {
            return 0;
        }
        return this.b1;
    }

    public void l0(int i2) {
        this.A1.setSoftInputMode(i2);
    }

    public void m0(int i2) {
        this.Z0 = i2;
    }

    public void n(ListAdapter listAdapter) {
        DataSetObserver dataSetObserver = this.m1;
        if (dataSetObserver == null) {
            this.m1 = new g();
        } else {
            ListAdapter listAdapter2 = this.Y;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.Y = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.m1);
        }
        C10388w70 c10388w70 = this.Z;
        if (c10388w70 != null) {
            c10388w70.setAdapter(this.Y);
        }
    }

    public void n0(int i2) {
        this.c1 = i2;
    }

    @Override // o.T52
    public ListView p() {
        return this.Z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int q() {
        int i2;
        int i3;
        int makeMeasureSpec;
        int i4;
        boolean z = true;
        if (this.Z == null) {
            Context context = this.X;
            this.v1 = new b();
            C10388w70 t = t(context, !this.z1);
            this.Z = t;
            Drawable drawable = this.o1;
            if (drawable != null) {
                t.setSelector(drawable);
            }
            this.Z.setAdapter(this.Y);
            this.Z.setOnItemClickListener(this.p1);
            this.Z.setFocusable(true);
            this.Z.setFocusableInTouchMode(true);
            this.Z.setOnItemSelectedListener(new c());
            this.Z.setOnScrollListener(this.t1);
            AdapterView.OnItemSelectedListener onItemSelectedListener = this.q1;
            if (onItemSelectedListener != null) {
                this.Z.setOnItemSelectedListener(onItemSelectedListener);
            }
            C10388w70 c10388w70 = this.Z;
            View view = this.k1;
            if (view != null) {
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 0, 1.0f);
                int i5 = this.l1;
                if (i5 != 0) {
                    if (i5 != 1) {
                        Log.e(B1, "Invalid hint position " + this.l1);
                    } else {
                        linearLayout.addView(c10388w70, layoutParams);
                        linearLayout.addView(view);
                    }
                } else {
                    linearLayout.addView(view);
                    linearLayout.addView(c10388w70, layoutParams);
                }
                int i6 = this.Z0;
                if (i6 >= 0) {
                    i4 = Integer.MIN_VALUE;
                } else {
                    i6 = 0;
                    i4 = 0;
                }
                view.measure(View.MeasureSpec.makeMeasureSpec(i6, i4), 0);
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) view.getLayoutParams();
                i2 = view.getMeasuredHeight() + layoutParams2.topMargin + layoutParams2.bottomMargin;
                c10388w70 = linearLayout;
            } else {
                i2 = 0;
            }
            this.A1.setContentView(c10388w70);
        } else {
            ViewGroup viewGroup = (ViewGroup) this.A1.getContentView();
            View view2 = this.k1;
            if (view2 != null) {
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) view2.getLayoutParams();
                i2 = view2.getMeasuredHeight() + layoutParams3.topMargin + layoutParams3.bottomMargin;
            } else {
                i2 = 0;
            }
        }
        Drawable background = this.A1.getBackground();
        if (background != null) {
            background.getPadding(this.x1);
            Rect rect = this.x1;
            int i7 = rect.top;
            i3 = rect.bottom + i7;
            if (!this.d1) {
                this.b1 = -i7;
            }
        } else {
            this.x1.setEmpty();
            i3 = 0;
        }
        if (this.A1.getInputMethodMode() != 2) {
            z = false;
        }
        int z2 = z(u(), this.b1, z);
        if (!this.h1 && this.Y0 != -1) {
            int i8 = this.Z0;
            if (i8 != -2) {
                if (i8 != -1) {
                    makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i8, 1073741824);
                } else {
                    int i9 = this.X.getResources().getDisplayMetrics().widthPixels;
                    Rect rect2 = this.x1;
                    makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i9 - (rect2.left + rect2.right), 1073741824);
                }
            } else {
                int i10 = this.X.getResources().getDisplayMetrics().widthPixels;
                Rect rect3 = this.x1;
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i10 - (rect3.left + rect3.right), Integer.MIN_VALUE);
            }
            int e2 = this.Z.e(makeMeasureSpec, 0, -1, z2 - i2, -1);
            if (e2 > 0) {
                i2 += i3 + this.Z.getPaddingTop() + this.Z.getPaddingBottom();
            }
            return e2 + i2;
        }
        return z2 + i3;
    }

    public void r() {
        C10388w70 c10388w70 = this.Z;
        if (c10388w70 != null) {
            c10388w70.setListSelectionHidden(true);
            c10388w70.requestLayout();
        }
    }

    public View.OnTouchListener s(View view) {
        return new a(view);
    }

    @Override // o.T52
    public void show() {
        int i2;
        int i3;
        int i4;
        int i5;
        int q = q();
        boolean J = J();
        IE1.d(this.A1, this.c1);
        boolean z = true;
        if (this.A1.isShowing()) {
            if (u().isAttachedToWindow()) {
                int i6 = this.Z0;
                if (i6 == -1) {
                    i6 = -1;
                } else if (i6 == -2) {
                    i6 = u().getWidth();
                }
                int i7 = this.Y0;
                if (i7 == -1) {
                    if (!J) {
                        q = -1;
                    }
                    if (J) {
                        PopupWindow popupWindow = this.A1;
                        if (this.Z0 == -1) {
                            i5 = -1;
                        } else {
                            i5 = 0;
                        }
                        popupWindow.setWidth(i5);
                        this.A1.setHeight(0);
                    } else {
                        PopupWindow popupWindow2 = this.A1;
                        if (this.Z0 == -1) {
                            i4 = -1;
                        } else {
                            i4 = 0;
                        }
                        popupWindow2.setWidth(i4);
                        this.A1.setHeight(-1);
                    }
                } else if (i7 != -2) {
                    q = i7;
                }
                PopupWindow popupWindow3 = this.A1;
                if (this.i1 || this.h1) {
                    z = false;
                }
                popupWindow3.setOutsideTouchable(z);
                PopupWindow popupWindow4 = this.A1;
                View u = u();
                int i8 = this.a1;
                int i9 = this.b1;
                if (i6 < 0) {
                    i2 = -1;
                } else {
                    i2 = i6;
                }
                if (q < 0) {
                    i3 = -1;
                } else {
                    i3 = q;
                }
                popupWindow4.update(u, i8, i9, i2, i3);
                return;
            }
            return;
        }
        int i10 = this.Z0;
        if (i10 == -1) {
            i10 = -1;
        } else if (i10 == -2) {
            i10 = u().getWidth();
        }
        int i11 = this.Y0;
        if (i11 == -1) {
            q = -1;
        } else if (i11 != -2) {
            q = i11;
        }
        this.A1.setWidth(i10);
        this.A1.setHeight(q);
        h0(true);
        PopupWindow popupWindow5 = this.A1;
        if (this.i1 || this.h1) {
            z = false;
        }
        popupWindow5.setOutsideTouchable(z);
        this.A1.setTouchInterceptor(this.s1);
        if (this.f1) {
            IE1.c(this.A1, this.e1);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = G1;
            if (method != null) {
                try {
                    method.invoke(this.A1, this.y1);
                } catch (Exception e2) {
                    Log.e(B1, "Could not invoke setEpicenterBounds on PopupWindow", e2);
                }
            }
        } else {
            e.a(this.A1, this.y1);
        }
        IE1.e(this.A1, u(), this.a1, this.b1, this.g1);
        this.Z.setSelection(-1);
        if (!this.z1 || this.Z.isInTouchMode()) {
            r();
        }
        if (!this.z1) {
            this.w1.post(this.u1);
        }
    }

    public C10388w70 t(Context context, boolean z) {
        return new C10388w70(context, z);
    }

    public View u() {
        return this.n1;
    }

    public int v() {
        return this.A1.getAnimationStyle();
    }

    public Rect w() {
        if (this.y1 != null) {
            return new Rect(this.y1);
        }
        return null;
    }

    public int x() {
        return this.Y0;
    }

    public int y() {
        return this.A1.getInputMethodMode();
    }

    public final int z(View view, int i2, boolean z) {
        return d.a(this.A1, view, i2, z);
    }

    public C5711d11(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, OL1.b.Z1);
    }

    public C5711d11(Context context, AttributeSet attributeSet, int i2) {
        this(context, attributeSet, i2, 0);
    }

    public C5711d11(Context context, AttributeSet attributeSet, int i2, int i3) {
        this.Y0 = -2;
        this.Z0 = -2;
        this.c1 = 1002;
        this.g1 = 0;
        this.h1 = false;
        this.i1 = false;
        this.j1 = Integer.MAX_VALUE;
        this.l1 = 0;
        this.r1 = new j();
        this.s1 = new i();
        this.t1 = new h();
        this.u1 = new f();
        this.x1 = new Rect();
        this.X = context;
        this.w1 = new Handler(context.getMainLooper());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, OL1.m.a4, i2, i3);
        this.a1 = obtainStyledAttributes.getDimensionPixelOffset(OL1.m.b4, 0);
        int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(OL1.m.c4, 0);
        this.b1 = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.d1 = true;
        }
        obtainStyledAttributes.recycle();
        C2621Cc c2621Cc = new C2621Cc(context, attributeSet, i2, i3);
        this.A1 = c2621Cc;
        c2621Cc.setInputMethodMode(1);
    }

    /* renamed from: o.d11$c */
    /* loaded from: classes.dex */
    public class c implements AdapterView.OnItemSelectedListener {
        public c() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            C10388w70 c10388w70;
            if (i != -1 && (c10388w70 = C5711d11.this.Z) != null) {
                c10388w70.setListSelectionHidden(false);
            }
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    /* renamed from: o.d11$h */
    /* loaded from: classes.dex */
    public class h implements AbsListView.OnScrollListener {
        public h() {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScrollStateChanged(AbsListView absListView, int i) {
            if (i == 1 && !C5711d11.this.J() && C5711d11.this.A1.getContentView() != null) {
                C5711d11 c5711d11 = C5711d11.this;
                c5711d11.w1.removeCallbacks(c5711d11.r1);
                C5711d11.this.r1.run();
            }
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScroll(AbsListView absListView, int i, int i2, int i3) {
        }
    }
}
