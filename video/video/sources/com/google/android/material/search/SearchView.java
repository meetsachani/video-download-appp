package com.google.android.material.search;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.internal.ClippableRoundedCornerLayout;
import com.google.android.material.internal.TouchObserverFrameLayout;
import com.google.android.material.search.SearchView;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import o.C10920yI2;
import o.C3220Ic;
import o.C4003Qc1;
import o.C4491Vc1;
import o.C4930Zm2;
import o.C5258b91;
import o.C5491c70;
import o.C6516gH2;
import o.C6597gd1;
import o.C7025iN1;
import o.C7608kn2;
import o.C8827pk;
import o.C8854pq2;
import o.C9179r91;
import o.C9246rQ0;
import o.C9523sa0;
import o.C9806tk0;
import o.D60;
import o.DM;
import o.HT1;
import o.InterfaceC10285vi1;
import o.InterfaceC10336vu1;
import o.InterfaceC11300zs1;
import o.InterfaceC3329Je2;
import o.InterfaceC4698Xf2;
import o.InterfaceC5015a91;
import o.InterfaceC5056aJ2;
import o.InterfaceC5670cr1;
import o.J;
import o.JF;
import o.K60;
import o.PK1;
import o.RL2;

/* loaded from: classes3.dex */
public class SearchView extends FrameLayout implements CoordinatorLayout.b, InterfaceC5015a91 {
    public static final long C1 = 100;
    public static final int D1 = C7025iN1.n.Widget_Material3_SearchView;
    @InterfaceC5670cr1
    public d A1;
    public Map<View, Integer> B1;
    public final View Y0;
    public final ClippableRoundedCornerLayout Z0;
    public final View a1;
    public final View b1;
    public final FrameLayout c1;
    public final FrameLayout d1;
    public final MaterialToolbar e1;
    public final Toolbar f1;
    public final TextView g1;
    public final LinearLayout h1;
    public final EditText i1;
    public final ImageButton j1;
    public final View k1;
    public final TouchObserverFrameLayout l1;
    public final boolean m1;
    public final com.google.android.material.search.b n1;
    @InterfaceC5670cr1
    public final C5258b91 o1;
    public final boolean p1;
    public final C9523sa0 q1;
    public final Set<c> r1;
    @InterfaceC11300zs1
    public SearchBar s1;
    public int t1;
    public boolean u1;
    public boolean v1;
    public boolean w1;
    @JF
    public final int x1;
    public boolean y1;
    public boolean z1;

    /* loaded from: classes3.dex */
    public static class Behavior extends CoordinatorLayout.c<SearchView> {
        public Behavior() {
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* renamed from: N */
        public boolean p(@InterfaceC5670cr1 CoordinatorLayout coordinatorLayout, @InterfaceC5670cr1 SearchView searchView, @InterfaceC5670cr1 View view) {
            if (!searchView.D() && (view instanceof SearchBar)) {
                searchView.setupWithSearchBar((SearchBar) view);
                return false;
            }
            return false;
        }

        public Behavior(@InterfaceC5670cr1 Context context, @InterfaceC11300zs1 AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    /* loaded from: classes3.dex */
    public class a implements TextWatcher {
        public a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            int i4;
            ImageButton imageButton = SearchView.this.j1;
            if (charSequence.length() > 0) {
                i4 = 0;
            } else {
                i4 = 8;
            }
            imageButton.setVisibility(i4);
        }
    }

    /* loaded from: classes3.dex */
    public static class b extends J {
        public static final Parcelable.Creator<b> CREATOR = new a();
        public int Y0;
        public String Z;

        /* loaded from: classes3.dex */
        public class a implements Parcelable.ClassLoaderCreator<b> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public b createFromParcel(Parcel parcel) {
                return new b(parcel);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b */
            public b createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new b(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c */
            public b[] newArray(int i) {
                return new b[i];
            }
        }

        public b(Parcel parcel) {
            this(parcel, null);
        }

        @Override // o.J, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeString(this.Z);
            parcel.writeInt(this.Y0);
        }

        public b(Parcel parcel, @InterfaceC11300zs1 ClassLoader classLoader) {
            super(parcel, classLoader);
            this.Z = parcel.readString();
            this.Y0 = parcel.readInt();
        }

        public b(Parcelable parcelable) {
            super(parcelable);
        }
    }

    /* loaded from: classes3.dex */
    public interface c {
        void a(@InterfaceC5670cr1 SearchView searchView, @InterfaceC5670cr1 d dVar, @InterfaceC5670cr1 d dVar2);
    }

    /* loaded from: classes3.dex */
    public enum d {
        HIDING,
        HIDDEN,
        SHOWING,
        SHOWN
    }

    public SearchView(@InterfaceC5670cr1 Context context) {
        this(context, null);
    }

    @InterfaceC11300zs1
    private Window getActivityWindow() {
        Activity a2 = DM.a(getContext());
        if (a2 == null) {
            return null;
        }
        return a2.getWindow();
    }

    private float getOverlayElevation() {
        SearchBar searchBar = this.s1;
        if (searchBar != null) {
            return searchBar.getCompatElevation();
        }
        return getResources().getDimension(C7025iN1.f.m3_searchview_elevation);
    }

    @PK1
    private int getStatusBarHeight() {
        int identifier = getResources().getIdentifier("status_bar_height", "dimen", "android");
        if (identifier > 0) {
            return getResources().getDimensionPixelSize(identifier);
        }
        return 0;
    }

    public static /* synthetic */ RL2 i(ViewGroup.MarginLayoutParams marginLayoutParams, int i, int i2, View view, RL2 rl2) {
        C9246rQ0 f = rl2.f(RL2.p.i() | RL2.p.c());
        marginLayoutParams.leftMargin = i + f.a;
        marginLayoutParams.rightMargin = i2 + f.c;
        return rl2;
    }

    public static /* synthetic */ boolean j(SearchView searchView, View view, MotionEvent motionEvent) {
        if (searchView.x()) {
            searchView.t();
            return false;
        }
        return false;
    }

    public static /* synthetic */ void k(SearchView searchView) {
        searchView.i1.clearFocus();
        C10920yI2.r(searchView.i1, searchView.y1);
    }

    public static /* synthetic */ void l(SearchView searchView) {
        if (searchView.i1.requestFocus()) {
            searchView.i1.sendAccessibilityEvent(8);
        }
        C10920yI2.B(searchView.i1, searchView.y1);
    }

    public static /* synthetic */ void m(SearchView searchView, View view) {
        searchView.u();
        searchView.K();
    }

    public static /* synthetic */ RL2 n(SearchView searchView, View view, RL2 rl2, C10920yI2.f fVar) {
        int i;
        int i2;
        boolean s = C10920yI2.s(searchView.e1);
        if (s) {
            i = fVar.c;
        } else {
            i = fVar.a;
        }
        if (s) {
            i2 = fVar.a;
        } else {
            i2 = fVar.c;
        }
        C9246rQ0 f = rl2.f(RL2.p.i() | RL2.p.c());
        int i3 = i2 + f.c;
        searchView.e1.setPadding(i + f.a, fVar.b, i3, fVar.d);
        return rl2;
    }

    public static /* synthetic */ RL2 o(SearchView searchView, View view, RL2 rl2) {
        boolean z;
        searchView.getClass();
        int i = rl2.f(RL2.p.i() | RL2.p.c()).b;
        searchView.setUpStatusBarSpacer(i);
        if (!searchView.z1) {
            if (i > 0) {
                z = true;
            } else {
                z = false;
            }
            searchView.setStatusBarSpacerEnabledInternal(z);
        }
        return rl2;
    }

    public static /* synthetic */ boolean p(View view, MotionEvent motionEvent) {
        return true;
    }

    private void setStatusBarSpacerEnabledInternal(boolean z) {
        int i;
        View view = this.b1;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        view.setVisibility(i);
    }

    private void setUpBackgroundViewElevationOverlay(float f) {
        C9523sa0 c9523sa0 = this.q1;
        if (c9523sa0 != null && this.a1 != null) {
            this.a1.setBackgroundColor(c9523sa0.e(this.x1, f));
        }
    }

    private void setUpHeaderLayout(int i) {
        if (i != -1) {
            r(LayoutInflater.from(getContext()).inflate(i, (ViewGroup) this.c1, false));
        }
    }

    private void setUpStatusBarSpacer(@PK1 int i) {
        if (this.b1.getLayoutParams().height != i) {
            this.b1.getLayoutParams().height = i;
            this.b1.requestLayout();
        }
    }

    public final boolean A() {
        if (!this.A1.equals(d.HIDDEN) && !this.A1.equals(d.HIDING)) {
            return false;
        }
        return true;
    }

    public boolean B() {
        return this.v1;
    }

    public final boolean C(@InterfaceC5670cr1 Toolbar toolbar) {
        return D60.q(toolbar.getNavigationIcon()) instanceof C5491c70;
    }

    public boolean D() {
        if (this.s1 != null) {
            return true;
        }
        return false;
    }

    public boolean E() {
        if (!this.A1.equals(d.SHOWN) && !this.A1.equals(d.SHOWING)) {
            return false;
        }
        return true;
    }

    @HT1({HT1.a.Y})
    public boolean F() {
        return this.y1;
    }

    public void G() {
        this.c1.removeAllViews();
        this.c1.setVisibility(8);
    }

    public void H(@InterfaceC5670cr1 View view) {
        this.c1.removeView(view);
        if (this.c1.getChildCount() == 0) {
            this.c1.setVisibility(8);
        }
    }

    public void I(@InterfaceC5670cr1 c cVar) {
        this.r1.remove(cVar);
    }

    public void J() {
        this.i1.postDelayed(new Runnable() { // from class: o.pZ1
            @Override // java.lang.Runnable
            public final void run() {
                SearchView.l(SearchView.this);
            }
        }, 100L);
    }

    public void K() {
        if (this.w1) {
            J();
        }
    }

    public final void L(@InterfaceC5670cr1 d dVar, boolean z) {
        if (!this.A1.equals(dVar)) {
            if (z) {
                Z(dVar);
            }
            d dVar2 = this.A1;
            this.A1 = dVar;
            for (c cVar : new LinkedHashSet(this.r1)) {
                cVar.a(this, dVar2, dVar);
            }
            Y(dVar);
            SearchBar searchBar = this.s1;
            if (searchBar != null && dVar == d.HIDDEN) {
                searchBar.sendAccessibilityEvent(8);
            }
        }
    }

    public final void M(boolean z, boolean z2) {
        if (z2) {
            this.e1.setNavigationIcon((Drawable) null);
            return;
        }
        this.e1.setNavigationOnClickListener(new View.OnClickListener() { // from class: o.kZ1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SearchView.this.v();
            }
        });
        if (z) {
            C5491c70 c5491c70 = new C5491c70(getContext());
            c5491c70.p(C9179r91.d(this, C7025iN1.c.colorOnSurface));
            this.e1.setNavigationIcon(c5491c70);
        }
    }

    public final void N() {
        setUpBackgroundViewElevationOverlay(getOverlayElevation());
    }

    public final void O() {
        this.j1.setOnClickListener(new View.OnClickListener() { // from class: o.nZ1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SearchView.m(SearchView.this, view);
            }
        });
        this.i1.addTextChangedListener(new a());
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public final void P() {
        this.l1.setOnTouchListener(new View.OnTouchListener() { // from class: o.vZ1
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return SearchView.j(SearchView.this, view, motionEvent);
            }
        });
    }

    public final void Q() {
        final ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.k1.getLayoutParams();
        final int i = marginLayoutParams.leftMargin;
        final int i2 = marginLayoutParams.rightMargin;
        C6516gH2.l2(this.k1, new InterfaceC10336vu1() { // from class: o.oZ1
            @Override // o.InterfaceC10336vu1
            public final RL2 a(View view, RL2 rl2) {
                return SearchView.i(marginLayoutParams, i, i2, view, rl2);
            }
        });
    }

    public final void R(@InterfaceC4698Xf2 int i, String str, String str2) {
        if (i != -1) {
            C4930Zm2.D(this.i1, i);
        }
        this.i1.setText(str);
        this.i1.setHint(str2);
    }

    public final void S() {
        V();
        Q();
        U();
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public final void T() {
        this.Z0.setOnTouchListener(new View.OnTouchListener() { // from class: o.uZ1
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return SearchView.p(view, motionEvent);
            }
        });
    }

    public final void U() {
        setUpStatusBarSpacer(getStatusBarHeight());
        C6516gH2.l2(this.b1, new InterfaceC10336vu1() { // from class: o.rZ1
            @Override // o.InterfaceC10336vu1
            public final RL2 a(View view, RL2 rl2) {
                return SearchView.o(SearchView.this, view, rl2);
            }
        });
    }

    public final void V() {
        C10920yI2.h(this.e1, new C10920yI2.e() { // from class: o.qZ1
            @Override // o.C10920yI2.e
            public final RL2 a(View view, RL2 rl2, C10920yI2.f fVar) {
                return SearchView.n(SearchView.this, view, rl2, fVar);
            }
        });
    }

    public void W() {
        if (!this.A1.equals(d.SHOWN) && !this.A1.equals(d.SHOWING)) {
            this.n1.i0();
        }
    }

    @SuppressLint({"InlinedApi"})
    public final void X(ViewGroup viewGroup, boolean z) {
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt != this) {
                if (childAt.findViewById(this.Z0.getId()) != null) {
                    X((ViewGroup) childAt, z);
                } else if (!z) {
                    Map<View, Integer> map = this.B1;
                    if (map != null && map.containsKey(childAt)) {
                        childAt.setImportantForAccessibility(this.B1.get(childAt).intValue());
                    }
                } else {
                    this.B1.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                    childAt.setImportantForAccessibility(4);
                }
            }
        }
    }

    public final void Y(@InterfaceC5670cr1 d dVar) {
        if (this.s1 != null && this.p1) {
            if (dVar.equals(d.SHOWN)) {
                this.o1.c();
            } else if (dVar.equals(d.HIDDEN)) {
                this.o1.f();
            }
        }
    }

    public final void Z(@InterfaceC5670cr1 d dVar) {
        if (dVar == d.SHOWN) {
            setModalForAccessibility(true);
        } else if (dVar == d.HIDDEN) {
            setModalForAccessibility(false);
        }
    }

    public final void a0() {
        MaterialToolbar materialToolbar = this.e1;
        if (materialToolbar == null || C(materialToolbar)) {
            return;
        }
        int defaultNavigationIconResource = getDefaultNavigationIconResource();
        if (this.s1 == null) {
            this.e1.setNavigationIcon(defaultNavigationIconResource);
            return;
        }
        Drawable r = D60.r(C3220Ic.b(getContext(), defaultNavigationIconResource).mutate());
        if (this.e1.getNavigationIconTint() != null) {
            r.setTint(this.e1.getNavigationIconTint().intValue());
        }
        D60.m(r, getLayoutDirection());
        this.e1.setNavigationIcon(new C9806tk0(this.s1.getNavigationIcon(), r));
        b0();
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (this.m1) {
            this.l1.addView(view, i, layoutParams);
        } else {
            super.addView(view, i, layoutParams);
        }
    }

    @Override // o.InterfaceC5015a91
    public void b() {
        if (!A() && this.s1 != null && Build.VERSION.SDK_INT >= 34) {
            this.n1.w();
        }
    }

    public final void b0() {
        int i;
        ImageButton e = C8854pq2.e(this.e1);
        if (e != null) {
            if (this.Z0.getVisibility() == 0) {
                i = 1;
            } else {
                i = 0;
            }
            Drawable q = D60.q(e.getDrawable());
            if (q instanceof C5491c70) {
                ((C5491c70) q).s(i);
            }
            if (q instanceof C9806tk0) {
                ((C9806tk0) q).a(i);
            }
        }
    }

    public void c0() {
        Window activityWindow = getActivityWindow();
        if (activityWindow != null) {
            this.t1 = activityWindow.getAttributes().softInputMode;
        }
    }

    @Override // o.InterfaceC5015a91
    public void d(@InterfaceC5670cr1 C8827pk c8827pk) {
        SearchBar searchBar;
        if (!A() && (searchBar = this.s1) != null) {
            if (searchBar != null) {
                searchBar.setPlaceholderText(this.i1.getText().toString());
            }
            this.n1.j0(c8827pk);
        }
    }

    @Override // o.InterfaceC5015a91
    public void e(@InterfaceC5670cr1 C8827pk c8827pk) {
        if (!A() && this.s1 != null && Build.VERSION.SDK_INT >= 34) {
            this.n1.o0(c8827pk);
        }
    }

    @Override // o.InterfaceC5015a91
    public void f() {
        if (A()) {
            return;
        }
        C8827pk b0 = this.n1.b0();
        if (Build.VERSION.SDK_INT >= 34 && this.s1 != null && b0 != null) {
            this.n1.x();
        } else {
            v();
        }
    }

    @InterfaceC5056aJ2
    public C4003Qc1 getBackHelper() {
        return this.n1.z();
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    @InterfaceC5670cr1
    public CoordinatorLayout.c<SearchView> getBehavior() {
        return new Behavior();
    }

    @InterfaceC5670cr1
    public d getCurrentTransitionState() {
        return this.A1;
    }

    @HT1({HT1.a.Y})
    @K60
    public int getDefaultNavigationIconResource() {
        return C7025iN1.g.ic_arrow_back_black_24;
    }

    @InterfaceC5670cr1
    public EditText getEditText() {
        return this.i1;
    }

    @InterfaceC11300zs1
    public CharSequence getHint() {
        return this.i1.getHint();
    }

    @InterfaceC5670cr1
    public TextView getSearchPrefix() {
        return this.g1;
    }

    @InterfaceC11300zs1
    public CharSequence getSearchPrefixText() {
        return this.g1.getText();
    }

    @SuppressLint({"KotlinPropertyAccess"})
    public int getSoftInputMode() {
        return this.t1;
    }

    @InterfaceC5670cr1
    @SuppressLint({"KotlinPropertyAccess"})
    public Editable getText() {
        return this.i1.getText();
    }

    @InterfaceC5670cr1
    public Toolbar getToolbar() {
        return this.e1;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        C4491Vc1.e(this);
        d currentTransitionState = getCurrentTransitionState();
        Z(currentTransitionState);
        Y(currentTransitionState);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setModalForAccessibility(false);
        this.o1.f();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        c0();
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        boolean z;
        if (!(parcelable instanceof b)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        b bVar = (b) parcelable;
        super.onRestoreInstanceState(bVar.a());
        setText(bVar.Z);
        if (bVar.Y0 == 0) {
            z = true;
        } else {
            z = false;
        }
        setVisible(z);
    }

    @Override // android.view.View
    @InterfaceC5670cr1
    public Parcelable onSaveInstanceState() {
        String charSequence;
        b bVar = new b(super.onSaveInstanceState());
        Editable text = getText();
        if (text == null) {
            charSequence = null;
        } else {
            charSequence = text.toString();
        }
        bVar.Z = charSequence;
        bVar.Y0 = this.Z0.getVisibility();
        return bVar;
    }

    public void r(@InterfaceC5670cr1 View view) {
        this.c1.addView(view);
        this.c1.setVisibility(0);
    }

    public void s(@InterfaceC5670cr1 c cVar) {
        this.r1.add(cVar);
    }

    public void setAnimatedNavigationIcon(boolean z) {
        this.u1 = z;
    }

    public void setAutoShowKeyboard(boolean z) {
        this.w1 = z;
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        setUpBackgroundViewElevationOverlay(f);
    }

    public void setHint(@InterfaceC11300zs1 CharSequence charSequence) {
        this.i1.setHint(charSequence);
    }

    public void setMenuItemsAnimated(boolean z) {
        this.v1 = z;
    }

    public void setModalForAccessibility(boolean z) {
        ViewGroup viewGroup = (ViewGroup) getRootView();
        if (z) {
            this.B1 = new HashMap(viewGroup.getChildCount());
        }
        X(viewGroup, z);
        if (!z) {
            this.B1 = null;
        }
    }

    public void setOnMenuItemClickListener(@InterfaceC11300zs1 Toolbar.h hVar) {
        this.e1.setOnMenuItemClickListener(hVar);
    }

    public void setSearchPrefixText(@InterfaceC11300zs1 CharSequence charSequence) {
        int i;
        this.g1.setText(charSequence);
        TextView textView = this.g1;
        if (TextUtils.isEmpty(charSequence)) {
            i = 8;
        } else {
            i = 0;
        }
        textView.setVisibility(i);
    }

    @HT1({HT1.a.Y})
    public void setStatusBarSpacerEnabled(boolean z) {
        this.z1 = true;
        setStatusBarSpacerEnabledInternal(z);
    }

    @SuppressLint({"KotlinPropertyAccess"})
    public void setText(@InterfaceC11300zs1 CharSequence charSequence) {
        this.i1.setText(charSequence);
    }

    public void setToolbarTouchscreenBlocksFocus(boolean z) {
        this.e1.setTouchscreenBlocksFocus(z);
    }

    public void setTransitionState(@InterfaceC5670cr1 d dVar) {
        L(dVar, true);
    }

    @HT1({HT1.a.Y})
    public void setUseWindowInsetsController(boolean z) {
        this.y1 = z;
    }

    public void setVisible(boolean z) {
        boolean z2;
        int i;
        d dVar;
        boolean z3 = true;
        if (this.Z0.getVisibility() == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        ClippableRoundedCornerLayout clippableRoundedCornerLayout = this.Z0;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        clippableRoundedCornerLayout.setVisibility(i);
        b0();
        if (z) {
            dVar = d.SHOWN;
        } else {
            dVar = d.HIDDEN;
        }
        if (z2 == z) {
            z3 = false;
        }
        L(dVar, z3);
    }

    public void setupWithSearchBar(@InterfaceC11300zs1 SearchBar searchBar) {
        this.s1 = searchBar;
        this.n1.g0(searchBar);
        if (searchBar != null) {
            searchBar.setOnClickListener(new View.OnClickListener() { // from class: o.sZ1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    SearchView.this.W();
                }
            });
            if (Build.VERSION.SDK_INT >= 34) {
                try {
                    searchBar.setHandwritingDelegatorCallback(new Runnable() { // from class: o.tZ1
                        @Override // java.lang.Runnable
                        public final void run() {
                            SearchView.this.W();
                        }
                    });
                    this.i1.setIsHandwritingDelegate(true);
                } catch (LinkageError unused) {
                }
            }
        }
        a0();
        N();
        Y(getCurrentTransitionState());
    }

    public void t() {
        this.i1.post(new Runnable() { // from class: o.lZ1
            @Override // java.lang.Runnable
            public final void run() {
                SearchView.k(SearchView.this);
            }
        });
    }

    public void u() {
        this.i1.setText("");
    }

    public void v() {
        if (!this.A1.equals(d.HIDDEN) && !this.A1.equals(d.HIDING)) {
            SearchBar searchBar = this.s1;
            if (searchBar != null && searchBar.isAttachedToWindow()) {
                this.s1.setPlaceholderText(this.i1.getText().toString());
                SearchBar searchBar2 = this.s1;
                final com.google.android.material.search.b bVar = this.n1;
                Objects.requireNonNull(bVar);
                searchBar2.post(new Runnable() { // from class: o.mZ1
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.google.android.material.search.b.this.Y();
                    }
                });
                return;
            }
            this.n1.Y();
        }
    }

    public void w(@InterfaceC10285vi1 int i) {
        this.e1.y(i);
    }

    public boolean x() {
        if (this.t1 == 48) {
            return true;
        }
        return false;
    }

    public boolean y() {
        return this.u1;
    }

    public boolean z() {
        return this.w1;
    }

    public SearchView(@InterfaceC5670cr1 Context context, @InterfaceC11300zs1 AttributeSet attributeSet) {
        this(context, attributeSet, C7025iN1.c.materialSearchViewStyle);
    }

    public void setHint(@InterfaceC3329Je2 int i) {
        this.i1.setHint(i);
    }

    public void setText(@InterfaceC3329Je2 int i) {
        this.i1.setText(i);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public SearchView(@InterfaceC5670cr1 Context context, @InterfaceC11300zs1 AttributeSet attributeSet, int i) {
        super(C6597gd1.d(context, attributeSet, i, r4), attributeSet, i);
        int i2 = D1;
        this.o1 = new C5258b91(this);
        this.r1 = new LinkedHashSet();
        this.t1 = 16;
        this.A1 = d.HIDDEN;
        Context context2 = getContext();
        TypedArray k = C7608kn2.k(context2, attributeSet, C7025iN1.o.ga, i, i2, new int[0]);
        this.x1 = k.getColor(C7025iN1.o.sa, 0);
        int resourceId = k.getResourceId(C7025iN1.o.xa, -1);
        int resourceId2 = k.getResourceId(C7025iN1.o.ha, -1);
        String string = k.getString(C7025iN1.o.ka);
        String string2 = k.getString(C7025iN1.o.la);
        String string3 = k.getString(C7025iN1.o.Fa);
        boolean z = k.getBoolean(C7025iN1.o.Ia, false);
        this.u1 = k.getBoolean(C7025iN1.o.pa, true);
        this.v1 = k.getBoolean(C7025iN1.o.oa, true);
        boolean z2 = k.getBoolean(C7025iN1.o.ya, false);
        this.w1 = k.getBoolean(C7025iN1.o.qa, true);
        this.p1 = k.getBoolean(C7025iN1.o.ra, true);
        k.recycle();
        LayoutInflater.from(context2).inflate(C7025iN1.k.mtrl_search_view, this);
        this.m1 = true;
        this.Y0 = findViewById(C7025iN1.h.open_search_view_scrim);
        this.Z0 = (ClippableRoundedCornerLayout) findViewById(C7025iN1.h.open_search_view_root);
        this.a1 = findViewById(C7025iN1.h.open_search_view_background);
        this.b1 = findViewById(C7025iN1.h.open_search_view_status_bar_spacer);
        this.c1 = (FrameLayout) findViewById(C7025iN1.h.open_search_view_header_container);
        this.d1 = (FrameLayout) findViewById(C7025iN1.h.open_search_view_toolbar_container);
        this.e1 = (MaterialToolbar) findViewById(C7025iN1.h.open_search_view_toolbar);
        this.f1 = (Toolbar) findViewById(C7025iN1.h.open_search_view_dummy_toolbar);
        this.g1 = (TextView) findViewById(C7025iN1.h.open_search_view_search_prefix);
        this.h1 = (LinearLayout) findViewById(C7025iN1.h.open_search_view_text_container);
        this.i1 = (EditText) findViewById(C7025iN1.h.open_search_view_edit_text);
        this.j1 = (ImageButton) findViewById(C7025iN1.h.open_search_view_clear_button);
        this.k1 = findViewById(C7025iN1.h.open_search_view_divider);
        this.l1 = (TouchObserverFrameLayout) findViewById(C7025iN1.h.open_search_view_content_container);
        this.n1 = new com.google.android.material.search.b(this);
        this.q1 = new C9523sa0(context2);
        T();
        N();
        setUpHeaderLayout(resourceId);
        setSearchPrefixText(string3);
        R(resourceId2, string, string2);
        M(z, z2);
        O();
        P();
        S();
    }
}
