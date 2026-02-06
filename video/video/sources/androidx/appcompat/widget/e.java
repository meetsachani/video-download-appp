package androidx.appcompat.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewPropertyAnimator;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import androidx.appcompat.widget.d;
import o.AbstractC4051Qo1;
import o.C2872Ep2;
import o.C3611Mc;
import o.C9097qq2;
import o.O4;
import o.OL1;
import o.R4;

/* loaded from: classes.dex */
public class e extends HorizontalScrollView implements AdapterView.OnItemSelectedListener {
    public static final String j1 = "ScrollingTabContainerView";
    public static final Interpolator k1 = new DecelerateInterpolator();
    public static final int l1 = 200;
    public Runnable Y0;
    public c Z0;
    public androidx.appcompat.widget.d a1;
    public Spinner b1;
    public boolean c1;
    public int d1;
    public int e1;
    public int f1;
    public int g1;
    public ViewPropertyAnimator h1;
    public final C0012e i1;

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public final /* synthetic */ View X;

        public a(View view) {
            this.X = view;
        }

        @Override // java.lang.Runnable
        public void run() {
            e.this.smoothScrollTo(this.X.getLeft() - ((e.this.getWidth() - this.X.getWidth()) / 2), 0);
            e.this.Y0 = null;
        }
    }

    /* loaded from: classes.dex */
    public class b extends BaseAdapter {
        public b() {
        }

        @Override // android.widget.Adapter
        public int getCount() {
            return e.this.a1.getChildCount();
        }

        @Override // android.widget.Adapter
        public Object getItem(int i) {
            return ((d) e.this.a1.getChildAt(i)).b();
        }

        @Override // android.widget.Adapter
        public long getItemId(int i) {
            return i;
        }

        @Override // android.widget.Adapter
        public View getView(int i, View view, ViewGroup viewGroup) {
            if (view == null) {
                return e.this.g((O4.f) getItem(i), true);
            }
            ((d) view).a((O4.f) getItem(i));
            return view;
        }
    }

    /* loaded from: classes.dex */
    public class c implements View.OnClickListener {
        public c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            boolean z;
            ((d) view).b().g();
            int childCount = e.this.a1.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = e.this.a1.getChildAt(i);
                if (childAt == view) {
                    z = true;
                } else {
                    z = false;
                }
                childAt.setSelected(z);
            }
        }
    }

    /* loaded from: classes.dex */
    public class d extends LinearLayout {
        public static final String e1 = "androidx.appcompat.app.ActionBar$Tab";
        public final int[] Y0;
        public O4.f Z0;
        public TextView a1;
        public ImageView b1;
        public View c1;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public d(Context context, O4.f fVar, boolean z) {
            super(context, null, r3);
            int i = OL1.b.h;
            int[] iArr = {16842964};
            this.Y0 = iArr;
            this.Z0 = fVar;
            C2872Ep2 G = C2872Ep2.G(context, null, iArr, i, 0);
            if (G.C(0)) {
                setBackgroundDrawable(G.h(0));
            }
            G.I();
            if (z) {
                setGravity(AbstractC4051Qo1.o1);
            }
            c();
        }

        public void a(O4.f fVar) {
            this.Z0 = fVar;
            c();
        }

        public O4.f b() {
            return this.Z0;
        }

        public void c() {
            O4.f fVar = this.Z0;
            View b = fVar.b();
            CharSequence charSequence = null;
            if (b != null) {
                ViewParent parent = b.getParent();
                if (parent != this) {
                    if (parent != null) {
                        ((ViewGroup) parent).removeView(b);
                    }
                    addView(b);
                }
                this.c1 = b;
                TextView textView = this.a1;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                ImageView imageView = this.b1;
                if (imageView != null) {
                    imageView.setVisibility(8);
                    this.b1.setImageDrawable(null);
                    return;
                }
                return;
            }
            View view = this.c1;
            if (view != null) {
                removeView(view);
                this.c1 = null;
            }
            Drawable c = fVar.c();
            CharSequence f = fVar.f();
            if (c != null) {
                if (this.b1 == null) {
                    AppCompatImageView appCompatImageView = new AppCompatImageView(getContext());
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams.gravity = 16;
                    appCompatImageView.setLayoutParams(layoutParams);
                    addView(appCompatImageView, 0);
                    this.b1 = appCompatImageView;
                }
                this.b1.setImageDrawable(c);
                this.b1.setVisibility(0);
            } else {
                ImageView imageView2 = this.b1;
                if (imageView2 != null) {
                    imageView2.setVisibility(8);
                    this.b1.setImageDrawable(null);
                }
            }
            boolean isEmpty = TextUtils.isEmpty(f);
            if (!isEmpty) {
                if (this.a1 == null) {
                    AppCompatTextView appCompatTextView = new AppCompatTextView(getContext(), null, OL1.b.i);
                    appCompatTextView.setEllipsize(TextUtils.TruncateAt.END);
                    LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams2.gravity = 16;
                    appCompatTextView.setLayoutParams(layoutParams2);
                    addView(appCompatTextView);
                    this.a1 = appCompatTextView;
                }
                this.a1.setText(f);
                this.a1.setVisibility(0);
            } else {
                TextView textView2 = this.a1;
                if (textView2 != null) {
                    textView2.setVisibility(8);
                    this.a1.setText((CharSequence) null);
                }
            }
            ImageView imageView3 = this.b1;
            if (imageView3 != null) {
                imageView3.setContentDescription(fVar.a());
            }
            if (isEmpty) {
                charSequence = fVar.a();
            }
            C9097qq2.a(this, charSequence);
        }

        @Override // android.view.View
        public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            accessibilityEvent.setClassName(e1);
        }

        @Override // android.view.View
        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setClassName(e1);
        }

        @Override // android.widget.LinearLayout, android.view.View
        public void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            if (e.this.d1 > 0) {
                int measuredWidth = getMeasuredWidth();
                int i3 = e.this.d1;
                if (measuredWidth > i3) {
                    super.onMeasure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), i2);
                }
            }
        }

        @Override // android.view.View
        public void setSelected(boolean z) {
            boolean z2;
            if (isSelected() != z) {
                z2 = true;
            } else {
                z2 = false;
            }
            super.setSelected(z);
            if (z2 && z) {
                sendAccessibilityEvent(4);
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.e$e  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0012e extends AnimatorListenerAdapter {
        public boolean a = false;
        public int b;

        public C0012e() {
        }

        public C0012e a(ViewPropertyAnimator viewPropertyAnimator, int i) {
            this.b = i;
            e.this.h1 = viewPropertyAnimator;
            return this;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.a = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.a) {
                return;
            }
            e eVar = e.this;
            eVar.h1 = null;
            eVar.setVisibility(this.b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            e.this.setVisibility(0);
            this.a = false;
        }
    }

    public e(Context context) {
        super(context);
        this.i1 = new C0012e();
        setHorizontalScrollBarEnabled(false);
        R4 b2 = R4.b(context);
        setContentHeight(b2.f());
        this.e1 = b2.e();
        androidx.appcompat.widget.d f = f();
        this.a1 = f;
        addView(f, new ViewGroup.LayoutParams(-2, -1));
    }

    public void a(O4.f fVar, int i, boolean z) {
        d g = g(fVar, false);
        this.a1.addView(g, i, new d.b(0, -1, 1.0f));
        Spinner spinner = this.b1;
        if (spinner != null) {
            ((b) spinner.getAdapter()).notifyDataSetChanged();
        }
        if (z) {
            g.setSelected(true);
        }
        if (this.c1) {
            requestLayout();
        }
    }

    public void b(O4.f fVar, boolean z) {
        d g = g(fVar, false);
        this.a1.addView(g, new d.b(0, -1, 1.0f));
        Spinner spinner = this.b1;
        if (spinner != null) {
            ((b) spinner.getAdapter()).notifyDataSetChanged();
        }
        if (z) {
            g.setSelected(true);
        }
        if (this.c1) {
            requestLayout();
        }
    }

    public void c(int i) {
        View childAt = this.a1.getChildAt(i);
        Runnable runnable = this.Y0;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
        a aVar = new a(childAt);
        this.Y0 = aVar;
        post(aVar);
    }

    public void d(int i) {
        ViewPropertyAnimator viewPropertyAnimator = this.h1;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
        if (i == 0) {
            if (getVisibility() != 0) {
                setAlpha(0.0f);
            }
            ViewPropertyAnimator alpha = animate().alpha(1.0f);
            alpha.setDuration(200L);
            alpha.setInterpolator(k1);
            alpha.setListener(this.i1.a(alpha, i));
            alpha.start();
            return;
        }
        ViewPropertyAnimator alpha2 = animate().alpha(0.0f);
        alpha2.setDuration(200L);
        alpha2.setInterpolator(k1);
        alpha2.setListener(this.i1.a(alpha2, i));
        alpha2.start();
    }

    public final Spinner e() {
        C3611Mc c3611Mc = new C3611Mc(getContext(), null, OL1.b.m);
        c3611Mc.setLayoutParams(new d.b(-2, -1));
        c3611Mc.setOnItemSelectedListener(this);
        return c3611Mc;
    }

    public final androidx.appcompat.widget.d f() {
        androidx.appcompat.widget.d dVar = new androidx.appcompat.widget.d(getContext(), null, OL1.b.g);
        dVar.setMeasureWithLargestChildEnabled(true);
        dVar.setGravity(17);
        dVar.setLayoutParams(new d.b(-2, -1));
        return dVar;
    }

    public d g(O4.f fVar, boolean z) {
        d dVar = new d(getContext(), fVar, z);
        if (z) {
            dVar.setBackgroundDrawable(null);
            dVar.setLayoutParams(new AbsListView.LayoutParams(-1, this.f1));
            return dVar;
        }
        dVar.setFocusable(true);
        if (this.Z0 == null) {
            this.Z0 = new c();
        }
        dVar.setOnClickListener(this.Z0);
        return dVar;
    }

    public final boolean h() {
        Spinner spinner = this.b1;
        if (spinner != null && spinner.getParent() == this) {
            return true;
        }
        return false;
    }

    public final void i() {
        if (h()) {
            return;
        }
        if (this.b1 == null) {
            this.b1 = e();
        }
        removeView(this.a1);
        addView(this.b1, new ViewGroup.LayoutParams(-2, -1));
        if (this.b1.getAdapter() == null) {
            this.b1.setAdapter((SpinnerAdapter) new b());
        }
        Runnable runnable = this.Y0;
        if (runnable != null) {
            removeCallbacks(runnable);
            this.Y0 = null;
        }
        this.b1.setSelection(this.g1);
    }

    public final boolean j() {
        if (!h()) {
            return false;
        }
        removeView(this.b1);
        addView(this.a1, new ViewGroup.LayoutParams(-2, -1));
        setTabSelected(this.b1.getSelectedItemPosition());
        return false;
    }

    public void k() {
        this.a1.removeAllViews();
        Spinner spinner = this.b1;
        if (spinner != null) {
            ((b) spinner.getAdapter()).notifyDataSetChanged();
        }
        if (this.c1) {
            requestLayout();
        }
    }

    public void l(int i) {
        this.a1.removeViewAt(i);
        Spinner spinner = this.b1;
        if (spinner != null) {
            ((b) spinner.getAdapter()).notifyDataSetChanged();
        }
        if (this.c1) {
            requestLayout();
        }
    }

    public void m(int i) {
        ((d) this.a1.getChildAt(i)).c();
        Spinner spinner = this.b1;
        if (spinner != null) {
            ((b) spinner.getAdapter()).notifyDataSetChanged();
        }
        if (this.c1) {
            requestLayout();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Runnable runnable = this.Y0;
        if (runnable != null) {
            post(runnable);
        }
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        R4 b2 = R4.b(getContext());
        setContentHeight(b2.f());
        this.e1 = b2.e();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Runnable runnable = this.Y0;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
        ((d) view).b().g();
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        boolean z;
        int mode = View.MeasureSpec.getMode(i);
        if (mode == 1073741824) {
            z = true;
        } else {
            z = false;
        }
        setFillViewport(z);
        int childCount = this.a1.getChildCount();
        if (childCount > 1 && (mode == 1073741824 || mode == Integer.MIN_VALUE)) {
            if (childCount > 2) {
                this.d1 = (int) (View.MeasureSpec.getSize(i) * 0.4f);
            } else {
                this.d1 = View.MeasureSpec.getSize(i) / 2;
            }
            this.d1 = Math.min(this.d1, this.e1);
        } else {
            this.d1 = -1;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.f1, 1073741824);
        if (!z && this.c1) {
            this.a1.measure(0, makeMeasureSpec);
            if (this.a1.getMeasuredWidth() > View.MeasureSpec.getSize(i)) {
                i();
            } else {
                j();
            }
        } else {
            j();
        }
        int measuredWidth = getMeasuredWidth();
        super.onMeasure(i, makeMeasureSpec);
        int measuredWidth2 = getMeasuredWidth();
        if (z && measuredWidth != measuredWidth2) {
            setTabSelected(this.g1);
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onNothingSelected(AdapterView<?> adapterView) {
    }

    public void setAllowCollapse(boolean z) {
        this.c1 = z;
    }

    public void setContentHeight(int i) {
        this.f1 = i;
        requestLayout();
    }

    public void setTabSelected(int i) {
        boolean z;
        this.g1 = i;
        int childCount = this.a1.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = this.a1.getChildAt(i2);
            if (i2 == i) {
                z = true;
            } else {
                z = false;
            }
            childAt.setSelected(z);
            if (z) {
                c(i);
            }
        }
        Spinner spinner = this.b1;
        if (spinner != null && i >= 0) {
            spinner.setSelection(i);
        }
    }
}
