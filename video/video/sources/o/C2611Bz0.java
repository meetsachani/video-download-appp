package o;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TabHost;
import android.widget.TabWidget;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import java.util.ArrayList;

@Deprecated
/* renamed from: o.Bz0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2611Bz0 extends TabHost implements TabHost.OnTabChangeListener {
    public final ArrayList<c> Y0;
    public FrameLayout Z0;
    public Context a1;
    public FragmentManager b1;
    public int c1;
    public TabHost.OnTabChangeListener d1;
    public c e1;
    public boolean f1;

    /* renamed from: o.Bz0$a */
    /* loaded from: classes.dex */
    public static class a implements TabHost.TabContentFactory {
        public final Context a;

        public a(Context context) {
            this.a = context;
        }

        @Override // android.widget.TabHost.TabContentFactory
        public View createTabContent(String str) {
            View view = new View(this.a);
            view.setMinimumWidth(0);
            view.setMinimumHeight(0);
            return view;
        }
    }

    /* renamed from: o.Bz0$b */
    /* loaded from: classes.dex */
    public static class b extends View.BaseSavedState {
        public static final Parcelable.Creator<b> CREATOR = new a();
        public String X;

        /* renamed from: o.Bz0$b$a */
        /* loaded from: classes.dex */
        public class a implements Parcelable.Creator<b> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public b createFromParcel(Parcel parcel) {
                return new b(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public b[] newArray(int i) {
                return new b[i];
            }
        }

        public b(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "FragmentTabHost.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " curTab=" + this.X + "}";
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeString(this.X);
        }

        public b(Parcel parcel) {
            super(parcel);
            this.X = parcel.readString();
        }
    }

    /* renamed from: o.Bz0$c */
    /* loaded from: classes.dex */
    public static final class c {
        public final String a;
        public final Class<?> b;
        public final Bundle c;
        public Fragment d;

        public c(String str, Class<?> cls, Bundle bundle) {
            this.a = str;
            this.b = cls;
            this.c = bundle;
        }
    }

    @Deprecated
    public C2611Bz0(Context context) {
        super(context, null);
        this.Y0 = new ArrayList<>();
        f(context, null);
    }

    @Deprecated
    public void a(TabHost.TabSpec tabSpec, Class<?> cls, Bundle bundle) {
        tabSpec.setContent(new a(this.a1));
        String tag = tabSpec.getTag();
        c cVar = new c(tag, cls, bundle);
        if (this.f1) {
            Fragment s0 = this.b1.s0(tag);
            cVar.d = s0;
            if (s0 != null && !s0.w0()) {
                androidx.fragment.app.j u = this.b1.u();
                u.r(cVar.d);
                u.m();
            }
        }
        this.Y0.add(cVar);
        addTab(tabSpec);
    }

    public final androidx.fragment.app.j b(String str, androidx.fragment.app.j jVar) {
        Fragment fragment;
        c e = e(str);
        if (this.e1 != e) {
            if (jVar == null) {
                jVar = this.b1.u();
            }
            c cVar = this.e1;
            if (cVar != null && (fragment = cVar.d) != null) {
                jVar.r(fragment);
            }
            if (e != null) {
                Fragment fragment2 = e.d;
                if (fragment2 == null) {
                    Fragment a2 = this.b1.H0().a(this.a1.getClassLoader(), e.b.getName());
                    e.d = a2;
                    a2.f2(e.c);
                    jVar.c(this.c1, e.d, e.a);
                } else {
                    jVar.l(fragment2);
                }
            }
            this.e1 = e;
        }
        return jVar;
    }

    public final void c() {
        if (this.Z0 == null) {
            FrameLayout frameLayout = (FrameLayout) findViewById(this.c1);
            this.Z0 = frameLayout;
            if (frameLayout == null) {
                throw new IllegalStateException("No tab content FrameLayout found for id " + this.c1);
            }
        }
    }

    public final void d(Context context) {
        if (findViewById(16908307) == null) {
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(1);
            addView(linearLayout, new FrameLayout.LayoutParams(-1, -1));
            TabWidget tabWidget = new TabWidget(context);
            tabWidget.setId(16908307);
            tabWidget.setOrientation(0);
            linearLayout.addView(tabWidget, new LinearLayout.LayoutParams(-1, -2, 0.0f));
            FrameLayout frameLayout = new FrameLayout(context);
            frameLayout.setId(16908305);
            linearLayout.addView(frameLayout, new LinearLayout.LayoutParams(0, 0, 0.0f));
            FrameLayout frameLayout2 = new FrameLayout(context);
            this.Z0 = frameLayout2;
            frameLayout2.setId(this.c1);
            linearLayout.addView(frameLayout2, new LinearLayout.LayoutParams(-1, 0, 1.0f));
        }
    }

    public final c e(String str) {
        int size = this.Y0.size();
        for (int i = 0; i < size; i++) {
            c cVar = this.Y0.get(i);
            if (cVar.a.equals(str)) {
                return cVar;
            }
        }
        return null;
    }

    public final void f(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{16842995}, 0, 0);
        this.c1 = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.recycle();
        super.setOnTabChangedListener(this);
    }

    @Deprecated
    public void g(Context context, FragmentManager fragmentManager) {
        d(context);
        super.setup();
        this.a1 = context;
        this.b1 = fragmentManager;
        c();
    }

    @Deprecated
    public void h(Context context, FragmentManager fragmentManager, int i) {
        d(context);
        super.setup();
        this.a1 = context;
        this.b1 = fragmentManager;
        this.c1 = i;
        c();
        this.Z0.setId(i);
        if (getId() == -1) {
            setId(16908306);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    @Deprecated
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        String currentTabTag = getCurrentTabTag();
        int size = this.Y0.size();
        androidx.fragment.app.j jVar = null;
        for (int i = 0; i < size; i++) {
            c cVar = this.Y0.get(i);
            Fragment s0 = this.b1.s0(cVar.a);
            cVar.d = s0;
            if (s0 != null && !s0.w0()) {
                if (cVar.a.equals(currentTabTag)) {
                    this.e1 = cVar;
                } else {
                    if (jVar == null) {
                        jVar = this.b1.u();
                    }
                    jVar.r(cVar.d);
                }
            }
        }
        this.f1 = true;
        androidx.fragment.app.j b2 = b(currentTabTag, jVar);
        if (b2 != null) {
            b2.m();
            this.b1.n0();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    @Deprecated
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f1 = false;
    }

    @Override // android.view.View
    @Deprecated
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof b)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        b bVar = (b) parcelable;
        super.onRestoreInstanceState(bVar.getSuperState());
        setCurrentTabByTag(bVar.X);
    }

    @Override // android.view.View
    @Deprecated
    public Parcelable onSaveInstanceState() {
        b bVar = new b(super.onSaveInstanceState());
        bVar.X = getCurrentTabTag();
        return bVar;
    }

    @Override // android.widget.TabHost.OnTabChangeListener
    @Deprecated
    public void onTabChanged(String str) {
        androidx.fragment.app.j b2;
        if (this.f1 && (b2 = b(str, null)) != null) {
            b2.m();
        }
        TabHost.OnTabChangeListener onTabChangeListener = this.d1;
        if (onTabChangeListener != null) {
            onTabChangeListener.onTabChanged(str);
        }
    }

    @Override // android.widget.TabHost
    @Deprecated
    public void setOnTabChangedListener(TabHost.OnTabChangeListener onTabChangeListener) {
        this.d1 = onTabChangeListener;
    }

    @Override // android.widget.TabHost
    @Deprecated
    public void setup() {
        throw new IllegalStateException("Must call setup() that takes a Context and FragmentManager");
    }

    @Deprecated
    public C2611Bz0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.Y0 = new ArrayList<>();
        f(context, attributeSet);
    }
}
