package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Layout;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.view.menu.k;
import androidx.appcompat.view.menu.m;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.lifecycle.f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import o.AbstractC4051Qo1;
import o.C10748xc;
import o.C11163zI2;
import o.C11213zV1;
import o.C2872Ep2;
import o.C3220Ic;
import o.C6516gH2;
import o.C8334ni1;
import o.C9097qq2;
import o.C9796th2;
import o.InterfaceC10042ui1;
import o.InterfaceC10728xW;
import o.InterfaceC7587ki1;
import o.J;
import o.JE0;
import o.KZ0;
import o.O4;
import o.OL1;
import o.WE;

/* loaded from: classes.dex */
public class Toolbar extends ViewGroup implements InterfaceC7587ki1 {
    public static final String S1 = "Toolbar";
    public boolean A1;
    public final ArrayList<View> B1;
    public final ArrayList<View> C1;
    public final int[] D1;
    public final C8334ni1 E1;
    public ArrayList<MenuItem> F1;
    public h G1;
    public final ActionMenuView.e H1;
    public androidx.appcompat.widget.g I1;
    public androidx.appcompat.widget.a J1;
    public f K1;
    public j.a L1;
    public e.a M1;
    public boolean N1;
    public OnBackInvokedCallback O1;
    public OnBackInvokedDispatcher P1;
    public boolean Q1;
    public final Runnable R1;
    public ActionMenuView Y0;
    public TextView Z0;
    public TextView a1;
    public ImageButton b1;
    public ImageView c1;
    public Drawable d1;
    public CharSequence e1;
    public ImageButton f1;
    public View g1;
    public Context h1;
    public int i1;
    public int j1;
    public int k1;
    public int l1;
    public int m1;
    public int n1;
    public int o1;
    public int p1;
    public int q1;
    public C11213zV1 r1;
    public int s1;
    public int t1;
    public int u1;
    public CharSequence v1;
    public CharSequence w1;
    public ColorStateList x1;
    public ColorStateList y1;
    public boolean z1;

    /* loaded from: classes.dex */
    public class a implements ActionMenuView.e {
        public a() {
        }

        @Override // androidx.appcompat.widget.ActionMenuView.e
        public boolean onMenuItemClick(MenuItem menuItem) {
            if (Toolbar.this.E1.h(menuItem)) {
                return true;
            }
            h hVar = Toolbar.this.G1;
            if (hVar != null) {
                return hVar.onMenuItemClick(menuItem);
            }
            return false;
        }
    }

    /* loaded from: classes.dex */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Toolbar.this.X();
        }
    }

    /* loaded from: classes.dex */
    public class c implements e.a {
        public c() {
        }

        @Override // androidx.appcompat.view.menu.e.a
        public boolean a(androidx.appcompat.view.menu.e eVar, MenuItem menuItem) {
            e.a aVar = Toolbar.this.M1;
            if (aVar != null && aVar.a(eVar, menuItem)) {
                return true;
            }
            return false;
        }

        @Override // androidx.appcompat.view.menu.e.a
        public void b(androidx.appcompat.view.menu.e eVar) {
            if (!Toolbar.this.Y0.N()) {
                Toolbar.this.E1.i(eVar);
            }
            e.a aVar = Toolbar.this.M1;
            if (aVar != null) {
                aVar.b(eVar);
            }
        }
    }

    /* loaded from: classes.dex */
    public class d implements View.OnClickListener {
        public d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Toolbar.this.e();
        }
    }

    /* loaded from: classes.dex */
    public static class e {
        public static OnBackInvokedDispatcher a(View view) {
            return view.findOnBackInvokedDispatcher();
        }

        public static OnBackInvokedCallback b(final Runnable runnable) {
            Objects.requireNonNull(runnable);
            return new OnBackInvokedCallback() { // from class: o.jq2
                public final void onBackInvoked() {
                    runnable.run();
                }
            };
        }

        public static void c(Object obj, Object obj2) {
            ((OnBackInvokedDispatcher) obj).registerOnBackInvokedCallback(1000000, (OnBackInvokedCallback) obj2);
        }

        public static void d(Object obj, Object obj2) {
            ((OnBackInvokedDispatcher) obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
        }
    }

    /* loaded from: classes.dex */
    public class f implements j {
        public androidx.appcompat.view.menu.e X;
        public androidx.appcompat.view.menu.h Y;

        public f() {
        }

        @Override // androidx.appcompat.view.menu.j
        public void a(androidx.appcompat.view.menu.e eVar, boolean z) {
        }

        @Override // androidx.appcompat.view.menu.j
        public boolean c(androidx.appcompat.view.menu.e eVar, androidx.appcompat.view.menu.h hVar) {
            Toolbar.this.g();
            ViewParent parent = Toolbar.this.f1.getParent();
            Toolbar toolbar = Toolbar.this;
            if (parent != toolbar) {
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(toolbar.f1);
                }
                Toolbar toolbar2 = Toolbar.this;
                toolbar2.addView(toolbar2.f1);
            }
            Toolbar.this.g1 = hVar.getActionView();
            this.Y = hVar;
            ViewParent parent2 = Toolbar.this.g1.getParent();
            Toolbar toolbar3 = Toolbar.this;
            if (parent2 != toolbar3) {
                if (parent2 instanceof ViewGroup) {
                    ((ViewGroup) parent2).removeView(toolbar3.g1);
                }
                g generateDefaultLayoutParams = Toolbar.this.generateDefaultLayoutParams();
                Toolbar toolbar4 = Toolbar.this;
                generateDefaultLayoutParams.a = (toolbar4.l1 & 112) | JE0.b;
                generateDefaultLayoutParams.b = 2;
                toolbar4.g1.setLayoutParams(generateDefaultLayoutParams);
                Toolbar toolbar5 = Toolbar.this;
                toolbar5.addView(toolbar5.g1);
            }
            Toolbar.this.L();
            Toolbar.this.requestLayout();
            hVar.t(true);
            View view = Toolbar.this.g1;
            if (view instanceof WE) {
                ((WE) view).onActionViewExpanded();
            }
            Toolbar.this.Y();
            return true;
        }

        @Override // androidx.appcompat.view.menu.j
        public void d(j.a aVar) {
        }

        @Override // androidx.appcompat.view.menu.j
        public void e(Parcelable parcelable) {
        }

        @Override // androidx.appcompat.view.menu.j
        public boolean f(m mVar) {
            return false;
        }

        @Override // androidx.appcompat.view.menu.j
        public k g(ViewGroup viewGroup) {
            return null;
        }

        @Override // androidx.appcompat.view.menu.j
        public int getId() {
            return 0;
        }

        @Override // androidx.appcompat.view.menu.j
        public Parcelable h() {
            return null;
        }

        @Override // androidx.appcompat.view.menu.j
        public void i(boolean z) {
            if (this.Y != null) {
                androidx.appcompat.view.menu.e eVar = this.X;
                if (eVar != null) {
                    int size = eVar.size();
                    for (int i = 0; i < size; i++) {
                        if (this.X.getItem(i) == this.Y) {
                            return;
                        }
                    }
                }
                k(this.X, this.Y);
            }
        }

        @Override // androidx.appcompat.view.menu.j
        public boolean j() {
            return false;
        }

        @Override // androidx.appcompat.view.menu.j
        public boolean k(androidx.appcompat.view.menu.e eVar, androidx.appcompat.view.menu.h hVar) {
            View view = Toolbar.this.g1;
            if (view instanceof WE) {
                ((WE) view).onActionViewCollapsed();
            }
            Toolbar toolbar = Toolbar.this;
            toolbar.removeView(toolbar.g1);
            Toolbar toolbar2 = Toolbar.this;
            toolbar2.removeView(toolbar2.f1);
            Toolbar toolbar3 = Toolbar.this;
            toolbar3.g1 = null;
            toolbar3.a();
            this.Y = null;
            Toolbar.this.requestLayout();
            hVar.t(false);
            Toolbar.this.Y();
            return true;
        }

        @Override // androidx.appcompat.view.menu.j
        public void l(Context context, androidx.appcompat.view.menu.e eVar) {
            androidx.appcompat.view.menu.h hVar;
            androidx.appcompat.view.menu.e eVar2 = this.X;
            if (eVar2 != null && (hVar = this.Y) != null) {
                eVar2.g(hVar);
            }
            this.X = eVar;
        }
    }

    /* loaded from: classes.dex */
    public interface h {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    /* loaded from: classes.dex */
    public static class i extends J {
        public static final Parcelable.Creator<i> CREATOR = new a();
        public boolean Y0;
        public int Z;

        /* loaded from: classes.dex */
        public class a implements Parcelable.ClassLoaderCreator<i> {
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

        public i(Parcel parcel) {
            this(parcel, null);
        }

        @Override // o.J, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.Z);
            parcel.writeInt(this.Y0 ? 1 : 0);
        }

        public i(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.Z = parcel.readInt();
            this.Y0 = parcel.readInt() != 0;
        }

        public i(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public Toolbar(Context context) {
        this(context, null);
    }

    private ArrayList<MenuItem> getCurrentMenuItems() {
        ArrayList<MenuItem> arrayList = new ArrayList<>();
        Menu menu = getMenu();
        for (int i2 = 0; i2 < menu.size(); i2++) {
            arrayList.add(menu.getItem(i2));
        }
        return arrayList;
    }

    private MenuInflater getMenuInflater() {
        return new C9796th2(getContext());
    }

    public final boolean A(View view) {
        if (view.getParent() != this && !this.C1.contains(view)) {
            return false;
        }
        return true;
    }

    public boolean B() {
        ActionMenuView actionMenuView = this.Y0;
        if (actionMenuView != null && actionMenuView.M()) {
            return true;
        }
        return false;
    }

    @Override // o.InterfaceC7587ki1
    public void C(InterfaceC10042ui1 interfaceC10042ui1) {
        this.E1.j(interfaceC10042ui1);
    }

    public boolean D() {
        ActionMenuView actionMenuView = this.Y0;
        if (actionMenuView != null && actionMenuView.N()) {
            return true;
        }
        return false;
    }

    public boolean E() {
        Layout layout;
        TextView textView = this.Z0;
        if (textView == null || (layout = textView.getLayout()) == null) {
            return false;
        }
        int lineCount = layout.getLineCount();
        for (int i2 = 0; i2 < lineCount; i2++) {
            if (layout.getEllipsisCount(i2) > 0) {
                return true;
            }
        }
        return false;
    }

    public final int F(View view, int i2, int[] iArr, int i3) {
        g gVar = (g) view.getLayoutParams();
        int i4 = ((ViewGroup.MarginLayoutParams) gVar).leftMargin - iArr[0];
        int max = i2 + Math.max(0, i4);
        iArr[0] = Math.max(0, -i4);
        int q = q(view, i3);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max, q, max + measuredWidth, view.getMeasuredHeight() + q);
        return max + measuredWidth + ((ViewGroup.MarginLayoutParams) gVar).rightMargin;
    }

    public final int G(View view, int i2, int[] iArr, int i3) {
        g gVar = (g) view.getLayoutParams();
        int i4 = ((ViewGroup.MarginLayoutParams) gVar).rightMargin - iArr[1];
        int max = i2 - Math.max(0, i4);
        iArr[1] = Math.max(0, -i4);
        int q = q(view, i3);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max - measuredWidth, q, max, view.getMeasuredHeight() + q);
        return max - (measuredWidth + ((ViewGroup.MarginLayoutParams) gVar).leftMargin);
    }

    public final int H(View view, int i2, int i3, int i4, int i5, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i6 = marginLayoutParams.leftMargin - iArr[0];
        int i7 = marginLayoutParams.rightMargin - iArr[1];
        int max = Math.max(0, i6) + Math.max(0, i7);
        iArr[0] = Math.max(0, -i6);
        iArr[1] = Math.max(0, -i7);
        view.measure(ViewGroup.getChildMeasureSpec(i2, getPaddingLeft() + getPaddingRight() + max + i3, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i4, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i5, marginLayoutParams.height));
        return view.getMeasuredWidth() + max;
    }

    public final void I(View view, int i2, int i3, int i4, int i5, int i6) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i2, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i3, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i4, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i5, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i6 >= 0) {
            if (mode != 0) {
                i6 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i6);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i6, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    public final void J() {
        Menu menu = getMenu();
        ArrayList<MenuItem> currentMenuItems = getCurrentMenuItems();
        this.E1.f(menu, getMenuInflater());
        ArrayList<MenuItem> currentMenuItems2 = getCurrentMenuItems();
        currentMenuItems2.removeAll(currentMenuItems);
        this.F1 = currentMenuItems2;
    }

    public final void K() {
        removeCallbacks(this.R1);
        post(this.R1);
    }

    public void L() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (((g) childAt.getLayoutParams()).b != 2 && childAt != this.Y0) {
                removeViewAt(childCount);
                this.C1.add(childAt);
            }
        }
    }

    public void M(int i2, int i3) {
        h();
        this.r1.e(i2, i3);
    }

    @Override // o.InterfaceC7587ki1
    public void N(InterfaceC10042ui1 interfaceC10042ui1) {
        this.E1.c(interfaceC10042ui1);
    }

    public void O(int i2, int i3) {
        h();
        this.r1.g(i2, i3);
    }

    public void P(androidx.appcompat.view.menu.e eVar, androidx.appcompat.widget.a aVar) {
        if (eVar != null || this.Y0 != null) {
            k();
            androidx.appcompat.view.menu.e R = this.Y0.R();
            if (R == eVar) {
                return;
            }
            if (R != null) {
                R.T(this.J1);
                R.T(this.K1);
            }
            if (this.K1 == null) {
                this.K1 = new f();
            }
            aVar.K(true);
            if (eVar != null) {
                eVar.c(aVar, this.h1);
                eVar.c(this.K1, this.h1);
            } else {
                aVar.l(this.h1, null);
                this.K1.l(this.h1, null);
                aVar.i(true);
                this.K1.i(true);
            }
            this.Y0.setPopupTheme(this.i1);
            this.Y0.setPresenter(aVar);
            this.J1 = aVar;
            Y();
        }
    }

    public void Q(j.a aVar, e.a aVar2) {
        this.L1 = aVar;
        this.M1 = aVar2;
        ActionMenuView actionMenuView = this.Y0;
        if (actionMenuView != null) {
            actionMenuView.S(aVar, aVar2);
        }
    }

    public void R(Context context, int i2) {
        this.k1 = i2;
        TextView textView = this.a1;
        if (textView != null) {
            textView.setTextAppearance(context, i2);
        }
    }

    public void S(int i2, int i3, int i4, int i5) {
        this.n1 = i2;
        this.p1 = i3;
        this.o1 = i4;
        this.q1 = i5;
        requestLayout();
    }

    public void T(Context context, int i2) {
        this.j1 = i2;
        TextView textView = this.Z0;
        if (textView != null) {
            textView.setTextAppearance(context, i2);
        }
    }

    public final boolean U() {
        if (!this.N1) {
            return false;
        }
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (W(childAt) && childAt.getMeasuredWidth() > 0 && childAt.getMeasuredHeight() > 0) {
                return false;
            }
        }
        return true;
    }

    @Override // o.InterfaceC7587ki1
    public void V(InterfaceC10042ui1 interfaceC10042ui1, KZ0 kz0, f.b bVar) {
        this.E1.e(interfaceC10042ui1, kz0, bVar);
    }

    public final boolean W(View view) {
        if (view != null && view.getParent() == this && view.getVisibility() != 8) {
            return true;
        }
        return false;
    }

    public boolean X() {
        ActionMenuView actionMenuView = this.Y0;
        if (actionMenuView != null && actionMenuView.T()) {
            return true;
        }
        return false;
    }

    public void Y() {
        boolean z;
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedDispatcher a2 = e.a(this);
            if (w() && a2 != null && isAttachedToWindow() && this.Q1) {
                z = true;
            } else {
                z = false;
            }
            if (z && this.P1 == null) {
                if (this.O1 == null) {
                    this.O1 = e.b(new Runnable() { // from class: o.hq2
                        @Override // java.lang.Runnable
                        public final void run() {
                            Toolbar.this.e();
                        }
                    });
                }
                e.c(a2, this.O1);
                this.P1 = a2;
            } else if (!z && (onBackInvokedDispatcher = this.P1) != null) {
                e.d(onBackInvokedDispatcher, this.O1);
                this.P1 = null;
            }
        }
    }

    public void a() {
        for (int size = this.C1.size() - 1; size >= 0; size--) {
            addView(this.C1.get(size));
        }
        this.C1.clear();
    }

    @Override // o.InterfaceC7587ki1
    public void a0() {
        Iterator<MenuItem> it = this.F1.iterator();
        while (it.hasNext()) {
            getMenu().removeItem(it.next().getItemId());
        }
        J();
    }

    public final void b(List<View> list, int i2) {
        boolean z;
        if (getLayoutDirection() == 1) {
            z = true;
        } else {
            z = false;
        }
        int childCount = getChildCount();
        int d2 = JE0.d(i2, getLayoutDirection());
        list.clear();
        if (z) {
            for (int i3 = childCount - 1; i3 >= 0; i3--) {
                View childAt = getChildAt(i3);
                g gVar = (g) childAt.getLayoutParams();
                if (gVar.b == 0 && W(childAt) && p(gVar.a) == d2) {
                    list.add(childAt);
                }
            }
            return;
        }
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt2 = getChildAt(i4);
            g gVar2 = (g) childAt2.getLayoutParams();
            if (gVar2.b == 0 && W(childAt2) && p(gVar2.a) == d2) {
                list.add(childAt2);
            }
        }
    }

    public final void c(View view, boolean z) {
        g gVar;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            gVar = generateDefaultLayoutParams();
        } else if (!checkLayoutParams(layoutParams)) {
            gVar = generateLayoutParams(layoutParams);
        } else {
            gVar = (g) layoutParams;
        }
        gVar.b = 1;
        if (z && this.g1 != null) {
            view.setLayoutParams(gVar);
            this.C1.add(view);
            return;
        }
        addView(view, gVar);
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (super.checkLayoutParams(layoutParams) && (layoutParams instanceof g)) {
            return true;
        }
        return false;
    }

    public boolean d() {
        ActionMenuView actionMenuView;
        if (getVisibility() == 0 && (actionMenuView = this.Y0) != null && actionMenuView.O()) {
            return true;
        }
        return false;
    }

    public void e() {
        androidx.appcompat.view.menu.h hVar;
        f fVar = this.K1;
        if (fVar == null) {
            hVar = null;
        } else {
            hVar = fVar.Y;
        }
        if (hVar != null) {
            hVar.collapseActionView();
        }
    }

    public void f() {
        ActionMenuView actionMenuView = this.Y0;
        if (actionMenuView != null) {
            actionMenuView.F();
        }
    }

    public void g() {
        if (this.f1 == null) {
            C10748xc c10748xc = new C10748xc(getContext(), null, OL1.b.T3);
            this.f1 = c10748xc;
            c10748xc.setImageDrawable(this.d1);
            this.f1.setContentDescription(this.e1);
            g generateDefaultLayoutParams = generateDefaultLayoutParams();
            generateDefaultLayoutParams.a = (this.l1 & 112) | JE0.b;
            generateDefaultLayoutParams.b = 2;
            this.f1.setLayoutParams(generateDefaultLayoutParams);
            this.f1.setOnClickListener(new d());
        }
    }

    public CharSequence getCollapseContentDescription() {
        ImageButton imageButton = this.f1;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        ImageButton imageButton = this.f1;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        C11213zV1 c11213zV1 = this.r1;
        if (c11213zV1 != null) {
            return c11213zV1.a();
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i2 = this.t1;
        if (i2 != Integer.MIN_VALUE) {
            return i2;
        }
        return getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        C11213zV1 c11213zV1 = this.r1;
        if (c11213zV1 != null) {
            return c11213zV1.b();
        }
        return 0;
    }

    public int getContentInsetRight() {
        C11213zV1 c11213zV1 = this.r1;
        if (c11213zV1 != null) {
            return c11213zV1.c();
        }
        return 0;
    }

    public int getContentInsetStart() {
        C11213zV1 c11213zV1 = this.r1;
        if (c11213zV1 != null) {
            return c11213zV1.d();
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i2 = this.s1;
        if (i2 != Integer.MIN_VALUE) {
            return i2;
        }
        return getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        androidx.appcompat.view.menu.e R;
        ActionMenuView actionMenuView = this.Y0;
        if (actionMenuView != null && (R = actionMenuView.R()) != null && R.hasVisibleItems()) {
            return Math.max(getContentInsetEnd(), Math.max(this.t1, 0));
        }
        return getContentInsetEnd();
    }

    public int getCurrentContentInsetLeft() {
        if (getLayoutDirection() == 1) {
            return getCurrentContentInsetEnd();
        }
        return getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        if (getLayoutDirection() == 1) {
            return getCurrentContentInsetStart();
        }
        return getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        if (getNavigationIcon() != null) {
            return Math.max(getContentInsetStart(), Math.max(this.s1, 0));
        }
        return getContentInsetStart();
    }

    public Drawable getLogo() {
        ImageView imageView = this.c1;
        if (imageView != null) {
            return imageView.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        ImageView imageView = this.c1;
        if (imageView != null) {
            return imageView.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        j();
        return this.Y0.getMenu();
    }

    public View getNavButtonView() {
        return this.b1;
    }

    public CharSequence getNavigationContentDescription() {
        ImageButton imageButton = this.b1;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        ImageButton imageButton = this.b1;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    public androidx.appcompat.widget.a getOuterActionMenuPresenter() {
        return this.J1;
    }

    public Drawable getOverflowIcon() {
        j();
        return this.Y0.getOverflowIcon();
    }

    public Context getPopupContext() {
        return this.h1;
    }

    public int getPopupTheme() {
        return this.i1;
    }

    public CharSequence getSubtitle() {
        return this.w1;
    }

    public final TextView getSubtitleTextView() {
        return this.a1;
    }

    public CharSequence getTitle() {
        return this.v1;
    }

    public int getTitleMarginBottom() {
        return this.q1;
    }

    public int getTitleMarginEnd() {
        return this.o1;
    }

    public int getTitleMarginStart() {
        return this.n1;
    }

    public int getTitleMarginTop() {
        return this.p1;
    }

    public final TextView getTitleTextView() {
        return this.Z0;
    }

    public InterfaceC10728xW getWrapper() {
        if (this.I1 == null) {
            this.I1 = new androidx.appcompat.widget.g(this, true);
        }
        return this.I1;
    }

    public final void h() {
        if (this.r1 == null) {
            this.r1 = new C11213zV1();
        }
    }

    public final void i() {
        if (this.c1 == null) {
            this.c1 = new AppCompatImageView(getContext());
        }
    }

    public final void j() {
        k();
        if (this.Y0.R() == null) {
            androidx.appcompat.view.menu.e eVar = (androidx.appcompat.view.menu.e) this.Y0.getMenu();
            if (this.K1 == null) {
                this.K1 = new f();
            }
            this.Y0.setExpandedActionViewsExclusive(true);
            eVar.c(this.K1, this.h1);
            Y();
        }
    }

    public final void k() {
        if (this.Y0 == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext());
            this.Y0 = actionMenuView;
            actionMenuView.setPopupTheme(this.i1);
            this.Y0.setOnMenuItemClickListener(this.H1);
            this.Y0.S(this.L1, new c());
            g generateDefaultLayoutParams = generateDefaultLayoutParams();
            generateDefaultLayoutParams.a = (this.l1 & 112) | 8388613;
            this.Y0.setLayoutParams(generateDefaultLayoutParams);
            c(this.Y0, false);
        }
    }

    public final void l() {
        if (this.b1 == null) {
            this.b1 = new C10748xc(getContext(), null, OL1.b.T3);
            g generateDefaultLayoutParams = generateDefaultLayoutParams();
            generateDefaultLayoutParams.a = (this.l1 & 112) | JE0.b;
            this.b1.setLayoutParams(generateDefaultLayoutParams);
        }
    }

    @Override // android.view.ViewGroup
    /* renamed from: m */
    public g generateDefaultLayoutParams() {
        return new g(-2, -2);
    }

    @Override // android.view.ViewGroup
    /* renamed from: n */
    public g generateLayoutParams(AttributeSet attributeSet) {
        return new g(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    /* renamed from: o */
    public g generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof g) {
            return new g((g) layoutParams);
        }
        if (layoutParams instanceof O4.b) {
            return new g((O4.b) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new g((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new g(layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Y();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.R1);
        Y();
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.A1 = false;
        }
        if (!this.A1) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.A1 = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.A1 = false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x0297 A[LOOP:0: B:104:0x0295->B:105:0x0297, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:108:0x02b5 A[LOOP:1: B:107:0x02b3->B:108:0x02b5, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:112:0x02dd  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x02ec A[LOOP:2: B:116:0x02ea->B:117:0x02ec, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x021e  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        boolean z2;
        int i6;
        int i7;
        int i8;
        int max;
        boolean W;
        boolean W2;
        boolean z3;
        int i9;
        TextView textView;
        TextView textView2;
        boolean z4;
        int i10;
        int paddingTop;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int size;
        int i18;
        int i19;
        int size2;
        int i20;
        int i21;
        int size3;
        if (getLayoutDirection() == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        int width = getWidth();
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop2 = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int i22 = width - paddingRight;
        int[] iArr = this.D1;
        iArr[1] = 0;
        iArr[0] = 0;
        int j0 = C6516gH2.j0(this);
        if (j0 >= 0) {
            i6 = Math.min(j0, i5 - i3);
        } else {
            i6 = 0;
        }
        if (W(this.b1)) {
            if (z2) {
                i8 = G(this.b1, i22, iArr, i6);
                i7 = paddingLeft;
                if (W(this.f1)) {
                    if (z2) {
                        i8 = G(this.f1, i8, iArr, i6);
                    } else {
                        i7 = F(this.f1, i7, iArr, i6);
                    }
                }
                if (W(this.Y0)) {
                    if (z2) {
                        i7 = F(this.Y0, i7, iArr, i6);
                    } else {
                        i8 = G(this.Y0, i8, iArr, i6);
                    }
                }
                int currentContentInsetLeft = getCurrentContentInsetLeft();
                int currentContentInsetRight = getCurrentContentInsetRight();
                iArr[0] = Math.max(0, currentContentInsetLeft - i7);
                iArr[1] = Math.max(0, currentContentInsetRight - (i22 - i8));
                max = Math.max(i7, currentContentInsetLeft);
                int min = Math.min(i8, i22 - currentContentInsetRight);
                if (W(this.g1)) {
                    if (z2) {
                        min = G(this.g1, min, iArr, i6);
                    } else {
                        max = F(this.g1, max, iArr, i6);
                    }
                }
                if (W(this.c1)) {
                    if (z2) {
                        min = G(this.c1, min, iArr, i6);
                    } else {
                        max = F(this.c1, max, iArr, i6);
                    }
                }
                W = W(this.Z0);
                W2 = W(this.a1);
                if (!W) {
                    g gVar = (g) this.Z0.getLayoutParams();
                    z3 = z2;
                    i9 = ((ViewGroup.MarginLayoutParams) gVar).bottomMargin + ((ViewGroup.MarginLayoutParams) gVar).topMargin + this.Z0.getMeasuredHeight();
                } else {
                    z3 = z2;
                    i9 = 0;
                }
                if (!W2) {
                    g gVar2 = (g) this.a1.getLayoutParams();
                    i9 += ((ViewGroup.MarginLayoutParams) gVar2).topMargin + this.a1.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) gVar2).bottomMargin;
                }
                if (!W || W2) {
                    if (!W) {
                        textView = this.Z0;
                    } else {
                        textView = this.a1;
                    }
                    if (!W2) {
                        textView2 = this.a1;
                    } else {
                        textView2 = this.Z0;
                    }
                    g gVar3 = (g) textView.getLayoutParams();
                    g gVar4 = (g) textView2.getLayoutParams();
                    int i23 = i9;
                    if ((!W && this.Z0.getMeasuredWidth() > 0) || (W2 && this.a1.getMeasuredWidth() > 0)) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    i10 = this.u1 & 112;
                    int i24 = max;
                    if (i10 == 48) {
                        if (i10 != 80) {
                            int i25 = (((height - paddingTop2) - paddingBottom) - i23) / 2;
                            int i26 = ((ViewGroup.MarginLayoutParams) gVar3).topMargin;
                            int i27 = this.p1;
                            if (i25 < i26 + i27) {
                                i25 = i26 + i27;
                            } else {
                                int i28 = (((height - paddingBottom) - i23) - i25) - paddingTop2;
                                int i29 = ((ViewGroup.MarginLayoutParams) gVar3).bottomMargin;
                                int i30 = this.q1;
                                if (i28 < i29 + i30) {
                                    i25 = Math.max(0, i25 - ((((ViewGroup.MarginLayoutParams) gVar4).bottomMargin + i30) - i28));
                                }
                            }
                            paddingTop = paddingTop2 + i25;
                        } else {
                            paddingTop = (((height - paddingBottom) - ((ViewGroup.MarginLayoutParams) gVar4).bottomMargin) - this.q1) - i23;
                        }
                    } else {
                        paddingTop = getPaddingTop() + ((ViewGroup.MarginLayoutParams) gVar3).topMargin + this.p1;
                    }
                    if (!z3) {
                        if (z4) {
                            i15 = this.n1;
                        } else {
                            i15 = 0;
                        }
                        int i31 = i15 - iArr[1];
                        min -= Math.max(0, i31);
                        iArr[1] = Math.max(0, -i31);
                        if (W) {
                            int measuredWidth = min - this.Z0.getMeasuredWidth();
                            int measuredHeight = this.Z0.getMeasuredHeight() + paddingTop;
                            this.Z0.layout(measuredWidth, paddingTop, min, measuredHeight);
                            i16 = measuredWidth - this.o1;
                            paddingTop = measuredHeight + ((ViewGroup.MarginLayoutParams) ((g) this.Z0.getLayoutParams())).bottomMargin;
                        } else {
                            i16 = min;
                        }
                        if (W2) {
                            int i32 = paddingTop + ((ViewGroup.MarginLayoutParams) ((g) this.a1.getLayoutParams())).topMargin;
                            this.a1.layout(min - this.a1.getMeasuredWidth(), i32, min, this.a1.getMeasuredHeight() + i32);
                            i17 = min - this.o1;
                        } else {
                            i17 = min;
                        }
                        if (z4) {
                            min = Math.min(i16, i17);
                        }
                        max = i24;
                    } else {
                        if (z4) {
                            i11 = this.n1;
                        } else {
                            i11 = 0;
                        }
                        i12 = 0;
                        int i33 = i11 - iArr[0];
                        max = i24 + Math.max(0, i33);
                        iArr[0] = Math.max(0, -i33);
                        if (W) {
                            int measuredWidth2 = this.Z0.getMeasuredWidth() + max;
                            int measuredHeight2 = this.Z0.getMeasuredHeight() + paddingTop;
                            this.Z0.layout(max, paddingTop, measuredWidth2, measuredHeight2);
                            i13 = measuredWidth2 + this.o1;
                            paddingTop = measuredHeight2 + ((ViewGroup.MarginLayoutParams) ((g) this.Z0.getLayoutParams())).bottomMargin;
                        } else {
                            i13 = max;
                        }
                        if (W2) {
                            int i34 = paddingTop + ((ViewGroup.MarginLayoutParams) ((g) this.a1.getLayoutParams())).topMargin;
                            int measuredWidth3 = this.a1.getMeasuredWidth() + max;
                            this.a1.layout(max, i34, measuredWidth3, this.a1.getMeasuredHeight() + i34);
                            i14 = measuredWidth3 + this.o1;
                        } else {
                            i14 = max;
                        }
                        if (z4) {
                            max = Math.max(i13, i14);
                        }
                        b(this.B1, 3);
                        size = this.B1.size();
                        i18 = max;
                        for (i19 = i12; i19 < size; i19++) {
                            i18 = F(this.B1.get(i19), i18, iArr, i6);
                        }
                        b(this.B1, 5);
                        size2 = this.B1.size();
                        for (i20 = i12; i20 < size2; i20++) {
                            min = G(this.B1.get(i20), min, iArr, i6);
                        }
                        b(this.B1, 1);
                        int v = v(this.B1, iArr);
                        i21 = (paddingLeft + (((width - paddingLeft) - paddingRight) / 2)) - (v / 2);
                        int i35 = v + i21;
                        if (i21 >= i18) {
                            if (i35 > min) {
                                i18 = i21 - (i35 - min);
                            } else {
                                i18 = i21;
                            }
                        }
                        size3 = this.B1.size();
                        while (i12 < size3) {
                            i18 = F(this.B1.get(i12), i18, iArr, i6);
                            i12++;
                        }
                        this.B1.clear();
                        return;
                    }
                }
                i12 = 0;
                b(this.B1, 3);
                size = this.B1.size();
                i18 = max;
                while (i19 < size) {
                }
                b(this.B1, 5);
                size2 = this.B1.size();
                while (i20 < size2) {
                }
                b(this.B1, 1);
                int v2 = v(this.B1, iArr);
                i21 = (paddingLeft + (((width - paddingLeft) - paddingRight) / 2)) - (v2 / 2);
                int i352 = v2 + i21;
                if (i21 >= i18) {
                }
                size3 = this.B1.size();
                while (i12 < size3) {
                }
                this.B1.clear();
                return;
            }
            i7 = F(this.b1, paddingLeft, iArr, i6);
        } else {
            i7 = paddingLeft;
        }
        i8 = i22;
        if (W(this.f1)) {
        }
        if (W(this.Y0)) {
        }
        int currentContentInsetLeft2 = getCurrentContentInsetLeft();
        int currentContentInsetRight2 = getCurrentContentInsetRight();
        iArr[0] = Math.max(0, currentContentInsetLeft2 - i7);
        iArr[1] = Math.max(0, currentContentInsetRight2 - (i22 - i8));
        max = Math.max(i7, currentContentInsetLeft2);
        int min2 = Math.min(i8, i22 - currentContentInsetRight2);
        if (W(this.g1)) {
        }
        if (W(this.c1)) {
        }
        W = W(this.Z0);
        W2 = W(this.a1);
        if (!W) {
        }
        if (!W2) {
        }
        if (!W) {
        }
        if (!W) {
        }
        if (!W2) {
        }
        g gVar32 = (g) textView.getLayoutParams();
        g gVar42 = (g) textView2.getLayoutParams();
        int i232 = i9;
        if (!W) {
        }
        z4 = false;
        i10 = this.u1 & 112;
        int i242 = max;
        if (i10 == 48) {
        }
        if (!z3) {
        }
    }

    @Override // android.view.View
    public void onMeasure(int i2, int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        int[] iArr;
        int i8;
        int i9;
        int i10;
        int[] iArr2 = this.D1;
        boolean b2 = C11163zI2.b(this);
        int i11 = !b2 ? 1 : 0;
        int i12 = 0;
        if (W(this.b1)) {
            I(this.b1, i2, 0, i3, 0, this.m1);
            i4 = this.b1.getMeasuredWidth() + t(this.b1);
            i5 = Math.max(0, this.b1.getMeasuredHeight() + u(this.b1));
            i6 = View.combineMeasuredStates(0, this.b1.getMeasuredState());
        } else {
            i4 = 0;
            i5 = 0;
            i6 = 0;
        }
        if (W(this.f1)) {
            I(this.f1, i2, 0, i3, 0, this.m1);
            i4 = this.f1.getMeasuredWidth() + t(this.f1);
            i5 = Math.max(i5, this.f1.getMeasuredHeight() + u(this.f1));
            i6 = View.combineMeasuredStates(i6, this.f1.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int max = Math.max(currentContentInsetStart, i4);
        iArr2[b2 ? 1 : 0] = Math.max(0, currentContentInsetStart - i4);
        if (W(this.Y0)) {
            I(this.Y0, i2, max, i3, 0, this.m1);
            i7 = this.Y0.getMeasuredWidth() + t(this.Y0);
            i5 = Math.max(i5, this.Y0.getMeasuredHeight() + u(this.Y0));
            i6 = View.combineMeasuredStates(i6, this.Y0.getMeasuredState());
        } else {
            i7 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int max2 = max + Math.max(currentContentInsetEnd, i7);
        iArr2[i11] = Math.max(0, currentContentInsetEnd - i7);
        if (W(this.g1)) {
            iArr = iArr2;
            max2 += H(this.g1, i2, max2, i3, 0, iArr);
            i5 = Math.max(i5, this.g1.getMeasuredHeight() + u(this.g1));
            i6 = View.combineMeasuredStates(i6, this.g1.getMeasuredState());
        } else {
            iArr = iArr2;
        }
        if (W(this.c1)) {
            max2 += H(this.c1, i2, max2, i3, 0, iArr);
            i5 = Math.max(i5, this.c1.getMeasuredHeight() + u(this.c1));
            i6 = View.combineMeasuredStates(i6, this.c1.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            if (((g) childAt.getLayoutParams()).b == 0 && W(childAt)) {
                max2 += H(childAt, i2, max2, i3, 0, iArr);
                int max3 = Math.max(i5, childAt.getMeasuredHeight() + u(childAt));
                i6 = View.combineMeasuredStates(i6, childAt.getMeasuredState());
                i5 = max3;
            } else {
                max2 = max2;
            }
        }
        int i14 = max2;
        int i15 = this.p1 + this.q1;
        int i16 = this.n1 + this.o1;
        if (W(this.Z0)) {
            H(this.Z0, i2, i14 + i16, i3, i15, iArr);
            int measuredWidth = this.Z0.getMeasuredWidth() + t(this.Z0);
            int measuredHeight = this.Z0.getMeasuredHeight() + u(this.Z0);
            i8 = measuredWidth;
            i9 = View.combineMeasuredStates(i6, this.Z0.getMeasuredState());
            i10 = measuredHeight;
        } else {
            i8 = 0;
            i9 = i6;
            i10 = 0;
        }
        if (W(this.a1)) {
            i8 = Math.max(i8, H(this.a1, i2, i14 + i16, i3, i15 + i10, iArr));
            i10 += this.a1.getMeasuredHeight() + u(this.a1);
            i9 = View.combineMeasuredStates(i9, this.a1.getMeasuredState());
        }
        int max4 = Math.max(i5, i10);
        int paddingLeft = i14 + i8 + getPaddingLeft() + getPaddingRight();
        int paddingTop = max4 + getPaddingTop() + getPaddingBottom();
        int resolveSizeAndState = View.resolveSizeAndState(Math.max(paddingLeft, getSuggestedMinimumWidth()), i2, (-16777216) & i9);
        int resolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingTop, getSuggestedMinimumHeight()), i3, i9 << 16);
        if (!U()) {
            i12 = resolveSizeAndState2;
        }
        setMeasuredDimension(resolveSizeAndState, i12);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        androidx.appcompat.view.menu.e eVar;
        MenuItem findItem;
        if (!(parcelable instanceof i)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        i iVar = (i) parcelable;
        super.onRestoreInstanceState(iVar.a());
        ActionMenuView actionMenuView = this.Y0;
        if (actionMenuView != null) {
            eVar = actionMenuView.R();
        } else {
            eVar = null;
        }
        int i2 = iVar.Z;
        if (i2 != 0 && this.K1 != null && eVar != null && (findItem = eVar.findItem(i2)) != null) {
            findItem.expandActionView();
        }
        if (iVar.Y0) {
            K();
        }
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i2) {
        super.onRtlPropertiesChanged(i2);
        h();
        C11213zV1 c11213zV1 = this.r1;
        boolean z = true;
        if (i2 != 1) {
            z = false;
        }
        c11213zV1.f(z);
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        androidx.appcompat.view.menu.h hVar;
        i iVar = new i(super.onSaveInstanceState());
        f fVar = this.K1;
        if (fVar != null && (hVar = fVar.Y) != null) {
            iVar.Z = hVar.getItemId();
        }
        iVar.Y0 = D();
        return iVar;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.z1 = false;
        }
        if (!this.z1) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.z1 = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.z1 = false;
        }
        return true;
    }

    public final int p(int i2) {
        int layoutDirection = getLayoutDirection();
        int d2 = JE0.d(i2, layoutDirection) & 7;
        if (d2 != 1 && d2 != 3 && d2 != 5) {
            if (layoutDirection != 1) {
                return 3;
            }
            return 5;
        }
        return d2;
    }

    public final int q(View view, int i2) {
        int i3;
        g gVar = (g) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        if (i2 > 0) {
            i3 = (measuredHeight - i2) / 2;
        } else {
            i3 = 0;
        }
        int s = s(gVar.a);
        if (s != 48) {
            if (s != 80) {
                int paddingTop = getPaddingTop();
                int paddingBottom = getPaddingBottom();
                int height = getHeight();
                int i4 = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
                int i5 = ((ViewGroup.MarginLayoutParams) gVar).topMargin;
                if (i4 < i5) {
                    i4 = i5;
                } else {
                    int i6 = (((height - paddingBottom) - measuredHeight) - i4) - paddingTop;
                    int i7 = ((ViewGroup.MarginLayoutParams) gVar).bottomMargin;
                    if (i6 < i7) {
                        i4 = Math.max(0, i4 - (i7 - i6));
                    }
                }
                return paddingTop + i4;
            }
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) gVar).bottomMargin) - i3;
        }
        return getPaddingTop() - i3;
    }

    @Override // o.InterfaceC7587ki1
    public void r(InterfaceC10042ui1 interfaceC10042ui1, KZ0 kz0) {
        this.E1.d(interfaceC10042ui1, kz0);
    }

    public final int s(int i2) {
        int i3 = i2 & 112;
        if (i3 != 16 && i3 != 48 && i3 != 80) {
            return this.u1 & 112;
        }
        return i3;
    }

    public void setBackInvokedCallbackEnabled(boolean z) {
        if (this.Q1 != z) {
            this.Q1 = z;
            Y();
        }
    }

    public void setCollapseContentDescription(int i2) {
        setCollapseContentDescription(i2 != 0 ? getContext().getText(i2) : null);
    }

    public void setCollapseIcon(int i2) {
        setCollapseIcon(C3220Ic.b(getContext(), i2));
    }

    public void setCollapsible(boolean z) {
        this.N1 = z;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i2) {
        if (i2 < 0) {
            i2 = Integer.MIN_VALUE;
        }
        if (i2 != this.t1) {
            this.t1 = i2;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i2) {
        if (i2 < 0) {
            i2 = Integer.MIN_VALUE;
        }
        if (i2 != this.s1) {
            this.s1 = i2;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(int i2) {
        setLogo(C3220Ic.b(getContext(), i2));
    }

    public void setLogoDescription(int i2) {
        setLogoDescription(getContext().getText(i2));
    }

    public void setNavigationContentDescription(int i2) {
        setNavigationContentDescription(i2 != 0 ? getContext().getText(i2) : null);
    }

    public void setNavigationIcon(int i2) {
        setNavigationIcon(C3220Ic.b(getContext(), i2));
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        l();
        this.b1.setOnClickListener(onClickListener);
    }

    public void setOnMenuItemClickListener(h hVar) {
        this.G1 = hVar;
    }

    public void setOverflowIcon(Drawable drawable) {
        j();
        this.Y0.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i2) {
        if (this.i1 != i2) {
            this.i1 = i2;
            if (i2 == 0) {
                this.h1 = getContext();
            } else {
                this.h1 = new ContextThemeWrapper(getContext(), i2);
            }
        }
    }

    public void setSubtitle(int i2) {
        setSubtitle(getContext().getText(i2));
    }

    public void setSubtitleTextColor(int i2) {
        setSubtitleTextColor(ColorStateList.valueOf(i2));
    }

    public void setTitle(int i2) {
        setTitle(getContext().getText(i2));
    }

    public void setTitleMarginBottom(int i2) {
        this.q1 = i2;
        requestLayout();
    }

    public void setTitleMarginEnd(int i2) {
        this.o1 = i2;
        requestLayout();
    }

    public void setTitleMarginStart(int i2) {
        this.n1 = i2;
        requestLayout();
    }

    public void setTitleMarginTop(int i2) {
        this.p1 = i2;
        requestLayout();
    }

    public void setTitleTextColor(int i2) {
        setTitleTextColor(ColorStateList.valueOf(i2));
    }

    public final int t(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.getMarginStart() + marginLayoutParams.getMarginEnd();
    }

    public final int u(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    public final int v(List<View> list, int[] iArr) {
        int i2 = iArr[0];
        int i3 = iArr[1];
        int size = list.size();
        int i4 = 0;
        int i5 = 0;
        while (i4 < size) {
            View view = list.get(i4);
            g gVar = (g) view.getLayoutParams();
            int i6 = ((ViewGroup.MarginLayoutParams) gVar).leftMargin - i2;
            int i7 = ((ViewGroup.MarginLayoutParams) gVar).rightMargin - i3;
            int max = Math.max(0, i6);
            int max2 = Math.max(0, i7);
            int max3 = Math.max(0, -i6);
            int max4 = Math.max(0, -i7);
            i5 += max + view.getMeasuredWidth() + max2;
            i4++;
            i3 = max4;
            i2 = max3;
        }
        return i5;
    }

    public boolean w() {
        f fVar = this.K1;
        if (fVar != null && fVar.Y != null) {
            return true;
        }
        return false;
    }

    public boolean x() {
        ActionMenuView actionMenuView = this.Y0;
        if (actionMenuView != null && actionMenuView.L()) {
            return true;
        }
        return false;
    }

    public void y(int i2) {
        getMenuInflater().inflate(i2, getMenu());
    }

    public boolean z() {
        return this.Q1;
    }

    /* loaded from: classes.dex */
    public static class g extends O4.b {
        public static final int c = 0;
        public static final int d = 1;
        public static final int e = 2;
        public int b;

        public g(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.b = 0;
        }

        public void a(ViewGroup.MarginLayoutParams marginLayoutParams) {
            ((ViewGroup.MarginLayoutParams) this).leftMargin = marginLayoutParams.leftMargin;
            ((ViewGroup.MarginLayoutParams) this).topMargin = marginLayoutParams.topMargin;
            ((ViewGroup.MarginLayoutParams) this).rightMargin = marginLayoutParams.rightMargin;
            ((ViewGroup.MarginLayoutParams) this).bottomMargin = marginLayoutParams.bottomMargin;
        }

        public g(int i, int i2) {
            super(i, i2);
            this.b = 0;
            this.a = AbstractC4051Qo1.o1;
        }

        public g(int i, int i2, int i3) {
            super(i, i2);
            this.b = 0;
            this.a = i3;
        }

        public g(int i) {
            this(-2, -1, i);
        }

        public g(g gVar) {
            super((O4.b) gVar);
            this.b = 0;
            this.b = gVar.b;
        }

        public g(O4.b bVar) {
            super(bVar);
            this.b = 0;
        }

        public g(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.b = 0;
            a(marginLayoutParams);
        }

        public g(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.b = 0;
        }
    }

    public Toolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, OL1.b.U3);
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            g();
        }
        ImageButton imageButton = this.f1;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            g();
            this.f1.setImageDrawable(drawable);
            return;
        }
        ImageButton imageButton = this.f1;
        if (imageButton != null) {
            imageButton.setImageDrawable(this.d1);
        }
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            i();
            if (!A(this.c1)) {
                c(this.c1, true);
            }
        } else {
            ImageView imageView = this.c1;
            if (imageView != null && A(imageView)) {
                removeView(this.c1);
                this.C1.remove(this.c1);
            }
        }
        ImageView imageView2 = this.c1;
        if (imageView2 != null) {
            imageView2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            i();
        }
        ImageView imageView = this.c1;
        if (imageView != null) {
            imageView.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            l();
        }
        ImageButton imageButton = this.b1;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
            C9097qq2.a(this.b1, charSequence);
        }
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            l();
            if (!A(this.b1)) {
                c(this.b1, true);
            }
        } else {
            ImageButton imageButton = this.b1;
            if (imageButton != null && A(imageButton)) {
                removeView(this.b1);
                this.C1.remove(this.b1);
            }
        }
        ImageButton imageButton2 = this.b1;
        if (imageButton2 != null) {
            imageButton2.setImageDrawable(drawable);
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.a1 == null) {
                Context context = getContext();
                AppCompatTextView appCompatTextView = new AppCompatTextView(context);
                this.a1 = appCompatTextView;
                appCompatTextView.setSingleLine();
                this.a1.setEllipsize(TextUtils.TruncateAt.END);
                int i2 = this.k1;
                if (i2 != 0) {
                    this.a1.setTextAppearance(context, i2);
                }
                ColorStateList colorStateList = this.y1;
                if (colorStateList != null) {
                    this.a1.setTextColor(colorStateList);
                }
            }
            if (!A(this.a1)) {
                c(this.a1, true);
            }
        } else {
            TextView textView = this.a1;
            if (textView != null && A(textView)) {
                removeView(this.a1);
                this.C1.remove(this.a1);
            }
        }
        TextView textView2 = this.a1;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.w1 = charSequence;
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this.y1 = colorStateList;
        TextView textView = this.a1;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.Z0 == null) {
                Context context = getContext();
                AppCompatTextView appCompatTextView = new AppCompatTextView(context);
                this.Z0 = appCompatTextView;
                appCompatTextView.setSingleLine();
                this.Z0.setEllipsize(TextUtils.TruncateAt.END);
                int i2 = this.j1;
                if (i2 != 0) {
                    this.Z0.setTextAppearance(context, i2);
                }
                ColorStateList colorStateList = this.x1;
                if (colorStateList != null) {
                    this.Z0.setTextColor(colorStateList);
                }
            }
            if (!A(this.Z0)) {
                c(this.Z0, true);
            }
        } else {
            TextView textView = this.Z0;
            if (textView != null && A(textView)) {
                removeView(this.Z0);
                this.C1.remove(this.Z0);
            }
        }
        TextView textView2 = this.Z0;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.v1 = charSequence;
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
        this.x1 = colorStateList;
        TextView textView = this.Z0;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public Toolbar(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.u1 = AbstractC4051Qo1.o1;
        this.B1 = new ArrayList<>();
        this.C1 = new ArrayList<>();
        this.D1 = new int[2];
        this.E1 = new C8334ni1(new Runnable() { // from class: o.iq2
            @Override // java.lang.Runnable
            public final void run() {
                Toolbar.this.a0();
            }
        });
        this.F1 = new ArrayList<>();
        this.H1 = new a();
        this.R1 = new b();
        Context context2 = getContext();
        int[] iArr = OL1.m.r6;
        C2872Ep2 G = C2872Ep2.G(context2, attributeSet, iArr, i2, 0);
        C6516gH2.G1(this, context, iArr, attributeSet, G.B(), i2, 0);
        this.j1 = G.u(OL1.m.U6, 0);
        this.k1 = G.u(OL1.m.L6, 0);
        this.u1 = G.p(OL1.m.s6, this.u1);
        this.l1 = G.p(OL1.m.u6, 48);
        int f2 = G.f(OL1.m.O6, 0);
        int i3 = OL1.m.T6;
        f2 = G.C(i3) ? G.f(i3, f2) : f2;
        this.q1 = f2;
        this.p1 = f2;
        this.o1 = f2;
        this.n1 = f2;
        int f3 = G.f(OL1.m.R6, -1);
        if (f3 >= 0) {
            this.n1 = f3;
        }
        int f4 = G.f(OL1.m.Q6, -1);
        if (f4 >= 0) {
            this.o1 = f4;
        }
        int f5 = G.f(OL1.m.S6, -1);
        if (f5 >= 0) {
            this.p1 = f5;
        }
        int f6 = G.f(OL1.m.P6, -1);
        if (f6 >= 0) {
            this.q1 = f6;
        }
        this.m1 = G.g(OL1.m.F6, -1);
        int f7 = G.f(OL1.m.B6, Integer.MIN_VALUE);
        int f8 = G.f(OL1.m.x6, Integer.MIN_VALUE);
        int g2 = G.g(OL1.m.z6, 0);
        int g3 = G.g(OL1.m.A6, 0);
        h();
        this.r1.e(g2, g3);
        if (f7 != Integer.MIN_VALUE || f8 != Integer.MIN_VALUE) {
            this.r1.g(f7, f8);
        }
        this.s1 = G.f(OL1.m.C6, Integer.MIN_VALUE);
        this.t1 = G.f(OL1.m.y6, Integer.MIN_VALUE);
        this.d1 = G.h(OL1.m.w6);
        this.e1 = G.x(OL1.m.v6);
        CharSequence x = G.x(OL1.m.N6);
        if (!TextUtils.isEmpty(x)) {
            setTitle(x);
        }
        CharSequence x2 = G.x(OL1.m.K6);
        if (!TextUtils.isEmpty(x2)) {
            setSubtitle(x2);
        }
        this.h1 = getContext();
        setPopupTheme(G.u(OL1.m.J6, 0));
        Drawable h2 = G.h(OL1.m.I6);
        if (h2 != null) {
            setNavigationIcon(h2);
        }
        CharSequence x3 = G.x(OL1.m.H6);
        if (!TextUtils.isEmpty(x3)) {
            setNavigationContentDescription(x3);
        }
        Drawable h3 = G.h(OL1.m.D6);
        if (h3 != null) {
            setLogo(h3);
        }
        CharSequence x4 = G.x(OL1.m.E6);
        if (!TextUtils.isEmpty(x4)) {
            setLogoDescription(x4);
        }
        int i4 = OL1.m.V6;
        if (G.C(i4)) {
            setTitleTextColor(G.d(i4));
        }
        int i5 = OL1.m.M6;
        if (G.C(i5)) {
            setSubtitleTextColor(G.d(i5));
        }
        int i6 = OL1.m.G6;
        if (G.C(i6)) {
            y(G.u(i6, 0));
        }
        G.I();
    }
}
