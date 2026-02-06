package androidx.appcompat.widget;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.widget.b;
import o.AbstractView$OnTouchListenerC8397ny0;
import o.C10861y4;
import o.C2872Ep2;
import o.C5711d11;
import o.C6516gH2;
import o.OL1;
import o.T52;
import o.U4;

/* loaded from: classes.dex */
public class ActivityChooserView extends ViewGroup implements b.a {
    public final f Y0;
    public final g Z0;
    public final View a1;
    public final Drawable b1;
    public final FrameLayout c1;
    public final ImageView d1;
    public final FrameLayout e1;
    public final ImageView f1;
    public final int g1;
    public U4 h1;
    public final DataSetObserver i1;
    public final ViewTreeObserver.OnGlobalLayoutListener j1;
    public C5711d11 k1;
    public PopupWindow.OnDismissListener l1;
    public boolean m1;
    public int n1;
    public boolean o1;
    public int p1;

    /* loaded from: classes.dex */
    public static class InnerLayout extends LinearLayout {
        public static final int[] Y0 = {16842964};

        public InnerLayout(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            C2872Ep2 F = C2872Ep2.F(context, attributeSet, Y0);
            setBackgroundDrawable(F.h(0));
            F.I();
        }
    }

    /* loaded from: classes.dex */
    public class a extends DataSetObserver {
        public a() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            super.onChanged();
            ActivityChooserView.this.Y0.notifyDataSetChanged();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            super.onInvalidated();
            ActivityChooserView.this.Y0.notifyDataSetInvalidated();
        }
    }

    /* loaded from: classes.dex */
    public class b implements ViewTreeObserver.OnGlobalLayoutListener {
        public b() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (ActivityChooserView.this.b()) {
                if (!ActivityChooserView.this.isShown()) {
                    ActivityChooserView.this.getListPopupWindow().dismiss();
                    return;
                }
                ActivityChooserView.this.getListPopupWindow().show();
                U4 u4 = ActivityChooserView.this.h1;
                if (u4 != null) {
                    u4.m(true);
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public class c extends View.AccessibilityDelegate {
        public c() {
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            C10861y4.t2(accessibilityNodeInfo).h1(true);
        }
    }

    /* loaded from: classes.dex */
    public class d extends AbstractView$OnTouchListenerC8397ny0 {
        public d(View view) {
            super(view);
        }

        @Override // o.AbstractView$OnTouchListenerC8397ny0
        public T52 b() {
            return ActivityChooserView.this.getListPopupWindow();
        }

        @Override // o.AbstractView$OnTouchListenerC8397ny0
        public boolean c() {
            ActivityChooserView.this.c();
            return true;
        }

        @Override // o.AbstractView$OnTouchListenerC8397ny0
        public boolean d() {
            ActivityChooserView.this.a();
            return true;
        }
    }

    /* loaded from: classes.dex */
    public class e extends DataSetObserver {
        public e() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            super.onChanged();
            ActivityChooserView.this.e();
        }
    }

    /* loaded from: classes.dex */
    public class f extends BaseAdapter {
        public static final int b1 = Integer.MAX_VALUE;
        public static final int c1 = 4;
        public static final int d1 = 0;
        public static final int e1 = 1;
        public static final int f1 = 3;
        public androidx.appcompat.widget.b X;
        public int Y = 4;
        public boolean Y0;
        public boolean Z;
        public boolean Z0;

        public f() {
        }

        public int a() {
            return this.X.f();
        }

        public androidx.appcompat.widget.b b() {
            return this.X;
        }

        public ResolveInfo c() {
            return this.X.h();
        }

        public int d() {
            return this.X.j();
        }

        public boolean e() {
            return this.Z;
        }

        public int f() {
            int i = this.Y;
            this.Y = Integer.MAX_VALUE;
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
            int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
            int count = getCount();
            int i2 = 0;
            View view = null;
            for (int i3 = 0; i3 < count; i3++) {
                view = getView(i3, view, null);
                view.measure(makeMeasureSpec, makeMeasureSpec2);
                i2 = Math.max(i2, view.getMeasuredWidth());
            }
            this.Y = i;
            return i2;
        }

        public void g(androidx.appcompat.widget.b bVar) {
            androidx.appcompat.widget.b b = ActivityChooserView.this.Y0.b();
            if (b != null && ActivityChooserView.this.isShown()) {
                b.unregisterObserver(ActivityChooserView.this.i1);
            }
            this.X = bVar;
            if (bVar != null && ActivityChooserView.this.isShown()) {
                bVar.registerObserver(ActivityChooserView.this.i1);
            }
            notifyDataSetChanged();
        }

        @Override // android.widget.Adapter
        public int getCount() {
            int f = this.X.f();
            if (!this.Z && this.X.h() != null) {
                f--;
            }
            int min = Math.min(f, this.Y);
            if (this.Z0) {
                return min + 1;
            }
            return min;
        }

        @Override // android.widget.Adapter
        public Object getItem(int i) {
            int itemViewType = getItemViewType(i);
            if (itemViewType != 0) {
                if (itemViewType == 1) {
                    return null;
                }
                throw new IllegalArgumentException();
            }
            if (!this.Z && this.X.h() != null) {
                i++;
            }
            return this.X.e(i);
        }

        @Override // android.widget.Adapter
        public long getItemId(int i) {
            return i;
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public int getItemViewType(int i) {
            if (this.Z0 && i == getCount() - 1) {
                return 1;
            }
            return 0;
        }

        @Override // android.widget.Adapter
        public View getView(int i, View view, ViewGroup viewGroup) {
            int itemViewType = getItemViewType(i);
            if (itemViewType != 0) {
                if (itemViewType == 1) {
                    if (view != null && view.getId() == 1) {
                        return view;
                    }
                    View inflate = LayoutInflater.from(ActivityChooserView.this.getContext()).inflate(OL1.j.h, viewGroup, false);
                    inflate.setId(1);
                    ((TextView) inflate.findViewById(OL1.g.s0)).setText(ActivityChooserView.this.getContext().getString(OL1.k.e));
                    return inflate;
                }
                throw new IllegalArgumentException();
            }
            if (view == null || view.getId() != OL1.g.H) {
                view = LayoutInflater.from(ActivityChooserView.this.getContext()).inflate(OL1.j.h, viewGroup, false);
            }
            PackageManager packageManager = ActivityChooserView.this.getContext().getPackageManager();
            ResolveInfo resolveInfo = (ResolveInfo) getItem(i);
            ((ImageView) view.findViewById(OL1.g.E)).setImageDrawable(resolveInfo.loadIcon(packageManager));
            ((TextView) view.findViewById(OL1.g.s0)).setText(resolveInfo.loadLabel(packageManager));
            if (this.Z && i == 0 && this.Y0) {
                view.setActivated(true);
                return view;
            }
            view.setActivated(false);
            return view;
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public int getViewTypeCount() {
            return 3;
        }

        public void h(int i) {
            if (this.Y != i) {
                this.Y = i;
                notifyDataSetChanged();
            }
        }

        public void i(boolean z, boolean z2) {
            if (this.Z == z && this.Y0 == z2) {
                return;
            }
            this.Z = z;
            this.Y0 = z2;
            notifyDataSetChanged();
        }

        public void j(boolean z) {
            if (this.Z0 != z) {
                this.Z0 = z;
                notifyDataSetChanged();
            }
        }
    }

    /* loaded from: classes.dex */
    public class g implements AdapterView.OnItemClickListener, View.OnClickListener, View.OnLongClickListener, PopupWindow.OnDismissListener {
        public g() {
        }

        public final void a() {
            PopupWindow.OnDismissListener onDismissListener = ActivityChooserView.this.l1;
            if (onDismissListener != null) {
                onDismissListener.onDismiss();
            }
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ActivityChooserView activityChooserView = ActivityChooserView.this;
            if (view == activityChooserView.e1) {
                activityChooserView.a();
                Intent b = ActivityChooserView.this.Y0.b().b(ActivityChooserView.this.Y0.b().g(ActivityChooserView.this.Y0.c()));
                if (b != null) {
                    b.addFlags(524288);
                    ActivityChooserView.this.getContext().startActivity(b);
                }
            } else if (view == activityChooserView.c1) {
                activityChooserView.m1 = false;
                activityChooserView.d(activityChooserView.n1);
            } else {
                throw new IllegalArgumentException();
            }
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public void onDismiss() {
            a();
            U4 u4 = ActivityChooserView.this.h1;
            if (u4 != null) {
                u4.m(false);
            }
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            int itemViewType = ((f) adapterView.getAdapter()).getItemViewType(i);
            if (itemViewType != 0) {
                if (itemViewType == 1) {
                    ActivityChooserView.this.d(Integer.MAX_VALUE);
                    return;
                }
                throw new IllegalArgumentException();
            }
            ActivityChooserView.this.a();
            ActivityChooserView activityChooserView = ActivityChooserView.this;
            if (activityChooserView.m1) {
                if (i > 0) {
                    activityChooserView.Y0.b().r(i);
                    return;
                }
                return;
            }
            if (!activityChooserView.Y0.e()) {
                i++;
            }
            Intent b = ActivityChooserView.this.Y0.b().b(i);
            if (b != null) {
                b.addFlags(524288);
                ActivityChooserView.this.getContext().startActivity(b);
            }
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            ActivityChooserView activityChooserView = ActivityChooserView.this;
            if (view == activityChooserView.e1) {
                if (activityChooserView.Y0.getCount() > 0) {
                    ActivityChooserView activityChooserView2 = ActivityChooserView.this;
                    activityChooserView2.m1 = true;
                    activityChooserView2.d(activityChooserView2.n1);
                }
                return true;
            }
            throw new IllegalArgumentException();
        }
    }

    public ActivityChooserView(Context context) {
        this(context, null);
    }

    public boolean a() {
        if (b()) {
            getListPopupWindow().dismiss();
            ViewTreeObserver viewTreeObserver = getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeGlobalOnLayoutListener(this.j1);
                return true;
            }
            return true;
        }
        return true;
    }

    public boolean b() {
        return getListPopupWindow().b();
    }

    public boolean c() {
        if (b() || !this.o1) {
            return false;
        }
        this.m1 = false;
        d(this.n1);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean, int] */
    public void d(int i) {
        ?? r0;
        if (this.Y0.b() != null) {
            getViewTreeObserver().addOnGlobalLayoutListener(this.j1);
            if (this.e1.getVisibility() == 0) {
                r0 = 1;
            } else {
                r0 = 0;
            }
            int a2 = this.Y0.a();
            if (i != Integer.MAX_VALUE && a2 > i + r0) {
                this.Y0.j(true);
                this.Y0.h(i - 1);
            } else {
                this.Y0.j(false);
                this.Y0.h(i);
            }
            C5711d11 listPopupWindow = getListPopupWindow();
            if (!listPopupWindow.b()) {
                if (!this.m1 && r0 != 0) {
                    this.Y0.i(false, false);
                } else {
                    this.Y0.i(true, r0);
                }
                listPopupWindow.T(Math.min(this.Y0.f(), this.g1));
                listPopupWindow.show();
                U4 u4 = this.h1;
                if (u4 != null) {
                    u4.m(true);
                }
                listPopupWindow.p().setContentDescription(getContext().getString(OL1.k.f));
                listPopupWindow.p().setSelector(new ColorDrawable(0));
                return;
            }
            return;
        }
        throw new IllegalStateException("No data model. Did you call #setDataModel?");
    }

    public void e() {
        if (this.Y0.getCount() > 0) {
            this.c1.setEnabled(true);
        } else {
            this.c1.setEnabled(false);
        }
        int a2 = this.Y0.a();
        int d2 = this.Y0.d();
        if (a2 != 1 && (a2 <= 1 || d2 <= 0)) {
            this.e1.setVisibility(8);
        } else {
            this.e1.setVisibility(0);
            ResolveInfo c2 = this.Y0.c();
            PackageManager packageManager = getContext().getPackageManager();
            this.f1.setImageDrawable(c2.loadIcon(packageManager));
            if (this.p1 != 0) {
                this.e1.setContentDescription(getContext().getString(this.p1, c2.loadLabel(packageManager)));
            }
        }
        if (this.e1.getVisibility() == 0) {
            this.a1.setBackgroundDrawable(this.b1);
        } else {
            this.a1.setBackgroundDrawable(null);
        }
    }

    public androidx.appcompat.widget.b getDataModel() {
        return this.Y0.b();
    }

    public C5711d11 getListPopupWindow() {
        if (this.k1 == null) {
            C5711d11 c5711d11 = new C5711d11(getContext());
            this.k1 = c5711d11;
            c5711d11.n(this.Y0);
            this.k1.R(this);
            this.k1.c0(true);
            this.k1.e0(this.Z0);
            this.k1.d0(this.Z0);
        }
        return this.k1;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        androidx.appcompat.widget.b b2 = this.Y0.b();
        if (b2 != null) {
            b2.registerObserver(this.i1);
        }
        this.o1 = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        androidx.appcompat.widget.b b2 = this.Y0.b();
        if (b2 != null) {
            b2.unregisterObserver(this.i1);
        }
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeGlobalOnLayoutListener(this.j1);
        }
        if (b()) {
            a();
        }
        this.o1 = false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.a1.layout(0, 0, i3 - i, i4 - i2);
        if (!b()) {
            a();
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        View view = this.a1;
        if (this.e1.getVisibility() != 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i2), 1073741824);
        }
        measureChild(view, i, i2);
        setMeasuredDimension(view.getMeasuredWidth(), view.getMeasuredHeight());
    }

    @Override // androidx.appcompat.widget.b.a
    public void setActivityChooserModel(androidx.appcompat.widget.b bVar) {
        this.Y0.g(bVar);
        if (b()) {
            a();
            c();
        }
    }

    public void setDefaultActionButtonContentDescription(int i) {
        this.p1 = i;
    }

    public void setExpandActivityOverflowButtonContentDescription(int i) {
        this.d1.setContentDescription(getContext().getString(i));
    }

    public void setExpandActivityOverflowButtonDrawable(Drawable drawable) {
        this.d1.setImageDrawable(drawable);
    }

    public void setInitialActivityCount(int i) {
        this.n1 = i;
    }

    public void setOnDismissListener(PopupWindow.OnDismissListener onDismissListener) {
        this.l1 = onDismissListener;
    }

    public void setProvider(U4 u4) {
        this.h1 = u4;
    }

    public ActivityChooserView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ActivityChooserView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.i1 = new a();
        this.j1 = new b();
        this.n1 = 4;
        int[] iArr = OL1.m.Q;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, 0);
        C6516gH2.G1(this, context, iArr, attributeSet, obtainStyledAttributes, i, 0);
        this.n1 = obtainStyledAttributes.getInt(OL1.m.S, 4);
        Drawable drawable = obtainStyledAttributes.getDrawable(OL1.m.R);
        obtainStyledAttributes.recycle();
        LayoutInflater.from(getContext()).inflate(OL1.j.g, (ViewGroup) this, true);
        g gVar = new g();
        this.Z0 = gVar;
        View findViewById = findViewById(OL1.g.n);
        this.a1 = findViewById;
        this.b1 = findViewById.getBackground();
        FrameLayout frameLayout = (FrameLayout) findViewById(OL1.g.y);
        this.e1 = frameLayout;
        frameLayout.setOnClickListener(gVar);
        frameLayout.setOnLongClickListener(gVar);
        int i2 = OL1.g.F;
        this.f1 = (ImageView) frameLayout.findViewById(i2);
        FrameLayout frameLayout2 = (FrameLayout) findViewById(OL1.g.A);
        frameLayout2.setOnClickListener(gVar);
        frameLayout2.setAccessibilityDelegate(new c());
        frameLayout2.setOnTouchListener(new d(frameLayout2));
        this.c1 = frameLayout2;
        ImageView imageView = (ImageView) frameLayout2.findViewById(i2);
        this.d1 = imageView;
        imageView.setImageDrawable(drawable);
        f fVar = new f();
        this.Y0 = fVar;
        fVar.registerDataSetObserver(new e());
        Resources resources = context.getResources();
        this.g1 = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(OL1.e.x));
    }
}
