package androidx.viewpager.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.text.method.SingleLineTransformationMethod;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.TextView;
import androidx.viewpager.widget.ViewPager;
import java.lang.ref.WeakReference;
import java.util.Locale;
import o.AbstractC3694Mx1;
import o.C4930Zm2;
import o.C6516gH2;

@ViewPager.e
/* loaded from: classes.dex */
public class a extends ViewGroup {
    public static final int[] m1 = {16842804, 16842901, 16842904, 16842927};
    public static final int[] n1 = {16843660};
    public static final float o1 = 0.6f;
    public static final int p1 = 16;
    public ViewPager Y0;
    public TextView Z0;
    public TextView a1;
    public TextView b1;
    public int c1;
    public float d1;
    public int e1;
    public int f1;
    public boolean g1;
    public boolean h1;
    public final C0052a i1;
    public WeakReference<AbstractC3694Mx1> j1;
    public int k1;
    public int l1;

    /* renamed from: androidx.viewpager.widget.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0052a extends DataSetObserver implements ViewPager.j, ViewPager.i {
        public int a;

        public C0052a() {
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public void a(int i, float f, int i2) {
            if (f > 0.5f) {
                i++;
            }
            a.this.d(i, f, false);
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public void b(int i) {
            this.a = i;
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public void c(int i) {
            if (this.a == 0) {
                a aVar = a.this;
                aVar.c(aVar.Y0.getCurrentItem(), a.this.Y0.getAdapter());
                a aVar2 = a.this;
                float f = aVar2.d1;
                if (f < 0.0f) {
                    f = 0.0f;
                }
                aVar2.d(aVar2.Y0.getCurrentItem(), f, true);
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.i
        public void d(ViewPager viewPager, AbstractC3694Mx1 abstractC3694Mx1, AbstractC3694Mx1 abstractC3694Mx12) {
            a.this.b(abstractC3694Mx1, abstractC3694Mx12);
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            a aVar = a.this;
            aVar.c(aVar.Y0.getCurrentItem(), a.this.Y0.getAdapter());
            a aVar2 = a.this;
            float f = aVar2.d1;
            if (f < 0.0f) {
                f = 0.0f;
            }
            aVar2.d(aVar2.Y0.getCurrentItem(), f, true);
        }
    }

    /* loaded from: classes.dex */
    public static class b extends SingleLineTransformationMethod {
        public Locale X;

        public b(Context context) {
            this.X = context.getResources().getConfiguration().locale;
        }

        @Override // android.text.method.ReplacementTransformationMethod, android.text.method.TransformationMethod
        public CharSequence getTransformation(CharSequence charSequence, View view) {
            CharSequence transformation = super.getTransformation(charSequence, view);
            if (transformation != null) {
                return transformation.toString().toUpperCase(this.X);
            }
            return null;
        }
    }

    public a(Context context) {
        this(context, null);
    }

    private static void setSingleLineAllCaps(TextView textView) {
        textView.setTransformationMethod(new b(textView.getContext()));
    }

    public void a(int i, float f) {
        this.Z0.setTextSize(i, f);
        this.a1.setTextSize(i, f);
        this.b1.setTextSize(i, f);
    }

    public void b(AbstractC3694Mx1 abstractC3694Mx1, AbstractC3694Mx1 abstractC3694Mx12) {
        if (abstractC3694Mx1 != null) {
            abstractC3694Mx1.u(this.i1);
            this.j1 = null;
        }
        if (abstractC3694Mx12 != null) {
            abstractC3694Mx12.m(this.i1);
            this.j1 = new WeakReference<>(abstractC3694Mx12);
        }
        ViewPager viewPager = this.Y0;
        if (viewPager != null) {
            this.c1 = -1;
            this.d1 = -1.0f;
            c(viewPager.getCurrentItem(), abstractC3694Mx12);
            requestLayout();
        }
    }

    public void c(int i, AbstractC3694Mx1 abstractC3694Mx1) {
        int i2;
        CharSequence charSequence;
        CharSequence charSequence2;
        if (abstractC3694Mx1 != null) {
            i2 = abstractC3694Mx1.e();
        } else {
            i2 = 0;
        }
        this.g1 = true;
        CharSequence charSequence3 = null;
        if (i >= 1 && abstractC3694Mx1 != null) {
            charSequence = abstractC3694Mx1.g(i - 1);
        } else {
            charSequence = null;
        }
        this.Z0.setText(charSequence);
        TextView textView = this.a1;
        if (abstractC3694Mx1 != null && i < i2) {
            charSequence2 = abstractC3694Mx1.g(i);
        } else {
            charSequence2 = null;
        }
        textView.setText(charSequence2);
        int i3 = i + 1;
        if (i3 < i2 && abstractC3694Mx1 != null) {
            charSequence3 = abstractC3694Mx1.g(i3);
        }
        this.b1.setText(charSequence3);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.max(0, (int) (((getWidth() - getPaddingLeft()) - getPaddingRight()) * 0.8f)), Integer.MIN_VALUE);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(Math.max(0, (getHeight() - getPaddingTop()) - getPaddingBottom()), Integer.MIN_VALUE);
        this.Z0.measure(makeMeasureSpec, makeMeasureSpec2);
        this.a1.measure(makeMeasureSpec, makeMeasureSpec2);
        this.b1.measure(makeMeasureSpec, makeMeasureSpec2);
        this.c1 = i;
        if (!this.h1) {
            d(i, this.d1, false);
        }
        this.g1 = false;
    }

    public void d(int i, float f, boolean z) {
        int i2;
        int i3;
        int i4;
        int i5;
        if (i != this.c1) {
            c(i, this.Y0.getAdapter());
        } else if (!z && f == this.d1) {
            return;
        }
        this.h1 = true;
        int measuredWidth = this.Z0.getMeasuredWidth();
        int measuredWidth2 = this.a1.getMeasuredWidth();
        int measuredWidth3 = this.b1.getMeasuredWidth();
        int i6 = measuredWidth2 / 2;
        int width = getWidth();
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int i7 = paddingRight + i6;
        int i8 = (width - (paddingLeft + i6)) - i7;
        float f2 = 0.5f + f;
        if (f2 > 1.0f) {
            f2 -= 1.0f;
        }
        int i9 = ((width - i7) - ((int) (i8 * f2))) - i6;
        int i10 = measuredWidth2 + i9;
        int baseline = this.Z0.getBaseline();
        int baseline2 = this.a1.getBaseline();
        int baseline3 = this.b1.getBaseline();
        int max = Math.max(Math.max(baseline, baseline2), baseline3);
        int i11 = max - baseline;
        int i12 = max - baseline2;
        int i13 = max - baseline3;
        int max2 = Math.max(Math.max(this.Z0.getMeasuredHeight() + i11, this.a1.getMeasuredHeight() + i12), this.b1.getMeasuredHeight() + i13);
        int i14 = this.f1 & 112;
        if (i14 != 16) {
            if (i14 != 80) {
                i3 = i11 + paddingTop;
                i4 = i12 + paddingTop;
                i5 = paddingTop + i13;
                TextView textView = this.a1;
                textView.layout(i9, i4, i10, textView.getMeasuredHeight() + i4);
                int min = Math.min(paddingLeft, (i9 - this.e1) - measuredWidth);
                TextView textView2 = this.Z0;
                textView2.layout(min, i3, min + measuredWidth, textView2.getMeasuredHeight() + i3);
                int max3 = Math.max((width - paddingRight) - measuredWidth3, i10 + this.e1);
                TextView textView3 = this.b1;
                textView3.layout(max3, i5, max3 + measuredWidth3, textView3.getMeasuredHeight() + i5);
                this.d1 = f;
                this.h1 = false;
            }
            i2 = (height - paddingBottom) - max2;
        } else {
            i2 = (((height - paddingTop) - paddingBottom) - max2) / 2;
        }
        i3 = i11 + i2;
        i4 = i12 + i2;
        i5 = i2 + i13;
        TextView textView4 = this.a1;
        textView4.layout(i9, i4, i10, textView4.getMeasuredHeight() + i4);
        int min2 = Math.min(paddingLeft, (i9 - this.e1) - measuredWidth);
        TextView textView22 = this.Z0;
        textView22.layout(min2, i3, min2 + measuredWidth, textView22.getMeasuredHeight() + i3);
        int max32 = Math.max((width - paddingRight) - measuredWidth3, i10 + this.e1);
        TextView textView32 = this.b1;
        textView32.layout(max32, i5, max32 + measuredWidth3, textView32.getMeasuredHeight() + i5);
        this.d1 = f;
        this.h1 = false;
    }

    public int getMinHeight() {
        Drawable background = getBackground();
        if (background != null) {
            return background.getIntrinsicHeight();
        }
        return 0;
    }

    public int getTextSpacing() {
        return this.e1;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        AbstractC3694Mx1 abstractC3694Mx1;
        super.onAttachedToWindow();
        ViewParent parent = getParent();
        if (parent instanceof ViewPager) {
            ViewPager viewPager = (ViewPager) parent;
            AbstractC3694Mx1 adapter = viewPager.getAdapter();
            viewPager.V(this.i1);
            viewPager.b(this.i1);
            this.Y0 = viewPager;
            WeakReference<AbstractC3694Mx1> weakReference = this.j1;
            if (weakReference != null) {
                abstractC3694Mx1 = weakReference.get();
            } else {
                abstractC3694Mx1 = null;
            }
            b(abstractC3694Mx1, adapter);
            return;
        }
        throw new IllegalStateException("PagerTitleStrip must be a direct child of a ViewPager.");
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ViewPager viewPager = this.Y0;
        if (viewPager != null) {
            b(viewPager.getAdapter(), null);
            this.Y0.V(null);
            this.Y0.N(this.i1);
            this.Y0 = null;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (this.Y0 != null) {
            float f = this.d1;
            if (f < 0.0f) {
                f = 0.0f;
            }
            d(this.c1, f, true);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int max;
        if (View.MeasureSpec.getMode(i) == 1073741824) {
            int paddingTop = getPaddingTop() + getPaddingBottom();
            int childMeasureSpec = ViewGroup.getChildMeasureSpec(i2, paddingTop, -2);
            int size = View.MeasureSpec.getSize(i);
            int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i, (int) (size * 0.2f), -2);
            this.Z0.measure(childMeasureSpec2, childMeasureSpec);
            this.a1.measure(childMeasureSpec2, childMeasureSpec);
            this.b1.measure(childMeasureSpec2, childMeasureSpec);
            if (View.MeasureSpec.getMode(i2) == 1073741824) {
                max = View.MeasureSpec.getSize(i2);
            } else {
                max = Math.max(getMinHeight(), this.a1.getMeasuredHeight() + paddingTop);
            }
            setMeasuredDimension(size, View.resolveSizeAndState(max, i2, this.a1.getMeasuredState() << 16));
            return;
        }
        throw new IllegalStateException("Must measure with an exact width");
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (!this.g1) {
            super.requestLayout();
        }
    }

    public void setGravity(int i) {
        this.f1 = i;
        requestLayout();
    }

    public void setNonPrimaryAlpha(float f) {
        int i = ((int) (f * 255.0f)) & 255;
        this.k1 = i;
        int i2 = (i << 24) | (this.l1 & C6516gH2.x);
        this.Z0.setTextColor(i2);
        this.b1.setTextColor(i2);
    }

    public void setTextColor(int i) {
        this.l1 = i;
        this.a1.setTextColor(i);
        int i2 = (this.k1 << 24) | (this.l1 & C6516gH2.x);
        this.Z0.setTextColor(i2);
        this.b1.setTextColor(i2);
    }

    public void setTextSpacing(int i) {
        this.e1 = i;
        requestLayout();
    }

    public a(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.c1 = -1;
        this.d1 = -1.0f;
        this.i1 = new C0052a();
        TextView textView = new TextView(context);
        this.Z0 = textView;
        addView(textView);
        TextView textView2 = new TextView(context);
        this.a1 = textView2;
        addView(textView2);
        TextView textView3 = new TextView(context);
        this.b1 = textView3;
        addView(textView3);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, m1);
        boolean z = false;
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            C4930Zm2.D(this.Z0, resourceId);
            C4930Zm2.D(this.a1, resourceId);
            C4930Zm2.D(this.b1, resourceId);
        }
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        if (dimensionPixelSize != 0) {
            a(0, dimensionPixelSize);
        }
        if (obtainStyledAttributes.hasValue(2)) {
            int color = obtainStyledAttributes.getColor(2, 0);
            this.Z0.setTextColor(color);
            this.a1.setTextColor(color);
            this.b1.setTextColor(color);
        }
        this.f1 = obtainStyledAttributes.getInteger(3, 80);
        obtainStyledAttributes.recycle();
        this.l1 = this.a1.getTextColors().getDefaultColor();
        setNonPrimaryAlpha(0.6f);
        TextView textView4 = this.Z0;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView4.setEllipsize(truncateAt);
        this.a1.setEllipsize(truncateAt);
        this.b1.setEllipsize(truncateAt);
        if (resourceId != 0) {
            TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(resourceId, n1);
            z = obtainStyledAttributes2.getBoolean(0, false);
            obtainStyledAttributes2.recycle();
        }
        if (z) {
            setSingleLineAllCaps(this.Z0);
            setSingleLineAllCaps(this.a1);
            setSingleLineAllCaps(this.b1);
        } else {
            this.Z0.setSingleLine();
            this.a1.setSingleLine();
            this.b1.setSingleLine();
        }
        this.e1 = (int) (context.getResources().getDisplayMetrics().density * 16.0f);
    }
}
