package o;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.viewpager.widget.ViewPager;

/* renamed from: o.Nx1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3792Nx1 extends androidx.viewpager.widget.a {
    public static final String G1 = "PagerTabStrip";
    public static final int H1 = 3;
    public static final int I1 = 6;
    public static final int J1 = 16;
    public static final int K1 = 32;
    public static final int L1 = 64;
    public static final int M1 = 1;
    public static final int N1 = 32;
    public boolean A1;
    public int B1;
    public boolean C1;
    public float D1;
    public float E1;
    public int F1;
    public int q1;
    public int r1;
    public int s1;
    public int t1;
    public int u1;
    public int v1;
    public final Paint w1;
    public final Rect x1;
    public int y1;
    public boolean z1;

    /* renamed from: o.Nx1$a */
    /* loaded from: classes.dex */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ViewPager viewPager = C3792Nx1.this.Y0;
            viewPager.setCurrentItem(viewPager.getCurrentItem() - 1);
        }
    }

    /* renamed from: o.Nx1$b */
    /* loaded from: classes.dex */
    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ViewPager viewPager = C3792Nx1.this.Y0;
            viewPager.setCurrentItem(viewPager.getCurrentItem() + 1);
        }
    }

    public C3792Nx1(Context context) {
        this(context, null);
    }

    @Override // androidx.viewpager.widget.a
    public void d(int i, float f, boolean z) {
        Rect rect = this.x1;
        int height = getHeight();
        int left = this.a1.getLeft() - this.v1;
        int right = this.a1.getRight() + this.v1;
        int i2 = height - this.r1;
        rect.set(left, i2, right, height);
        super.d(i, f, z);
        this.y1 = (int) (Math.abs(f - 0.5f) * 2.0f * 255.0f);
        rect.union(this.a1.getLeft() - this.v1, i2, this.a1.getRight() + this.v1, height);
        invalidate(rect);
    }

    public boolean getDrawFullUnderline() {
        return this.z1;
    }

    @Override // androidx.viewpager.widget.a
    public int getMinHeight() {
        return Math.max(super.getMinHeight(), this.u1);
    }

    public int getTabIndicatorColor() {
        return this.q1;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int height = getHeight();
        int left = this.a1.getLeft() - this.v1;
        int right = this.a1.getRight() + this.v1;
        this.w1.setColor((this.y1 << 24) | (this.q1 & C6516gH2.x));
        float f = height;
        canvas.drawRect(left, height - this.r1, right, f, this.w1);
        if (this.z1) {
            this.w1.setColor((this.q1 & C6516gH2.x) | (-16777216));
            canvas.drawRect(getPaddingLeft(), height - this.B1, getWidth() - getPaddingRight(), f, this.w1);
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 0 && this.C1) {
            return false;
        }
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        if (action != 0) {
            if (action != 1) {
                if (action == 2 && (Math.abs(x - this.D1) > this.F1 || Math.abs(y - this.E1) > this.F1)) {
                    this.C1 = true;
                }
            } else if (x < this.a1.getLeft() - this.v1) {
                ViewPager viewPager = this.Y0;
                viewPager.setCurrentItem(viewPager.getCurrentItem() - 1);
            } else if (x > this.a1.getRight() + this.v1) {
                ViewPager viewPager2 = this.Y0;
                viewPager2.setCurrentItem(viewPager2.getCurrentItem() + 1);
            }
        } else {
            this.D1 = x;
            this.E1 = y;
            this.C1 = false;
        }
        return true;
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        boolean z;
        super.setBackgroundColor(i);
        if (!this.A1) {
            if ((i & (-16777216)) == 0) {
                z = true;
            } else {
                z = false;
            }
            this.z1 = z;
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        boolean z;
        super.setBackgroundDrawable(drawable);
        if (!this.A1) {
            if (drawable == null) {
                z = true;
            } else {
                z = false;
            }
            this.z1 = z;
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        boolean z;
        super.setBackgroundResource(i);
        if (!this.A1) {
            if (i == 0) {
                z = true;
            } else {
                z = false;
            }
            this.z1 = z;
        }
    }

    public void setDrawFullUnderline(boolean z) {
        this.z1 = z;
        this.A1 = true;
        invalidate();
    }

    @Override // android.view.View
    public void setPadding(int i, int i2, int i3, int i4) {
        int i5 = this.s1;
        if (i4 < i5) {
            i4 = i5;
        }
        super.setPadding(i, i2, i3, i4);
    }

    public void setTabIndicatorColor(int i) {
        this.q1 = i;
        this.w1.setColor(i);
        invalidate();
    }

    public void setTabIndicatorColorResource(int i) {
        setTabIndicatorColor(C10201vM.g(getContext(), i));
    }

    @Override // androidx.viewpager.widget.a
    public void setTextSpacing(int i) {
        int i2 = this.t1;
        if (i < i2) {
            i = i2;
        }
        super.setTextSpacing(i);
    }

    public C3792Nx1(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Paint paint = new Paint();
        this.w1 = paint;
        this.x1 = new Rect();
        this.y1 = 255;
        this.z1 = false;
        this.A1 = false;
        int i = this.l1;
        this.q1 = i;
        paint.setColor(i);
        float f = context.getResources().getDisplayMetrics().density;
        this.r1 = (int) ((3.0f * f) + 0.5f);
        this.s1 = (int) ((6.0f * f) + 0.5f);
        this.t1 = (int) (64.0f * f);
        this.v1 = (int) ((16.0f * f) + 0.5f);
        this.B1 = (int) ((1.0f * f) + 0.5f);
        this.u1 = (int) ((f * 32.0f) + 0.5f);
        this.F1 = ViewConfiguration.get(context).getScaledTouchSlop();
        setPadding(getPaddingLeft(), getPaddingTop(), getPaddingRight(), getPaddingBottom());
        setTextSpacing(getTextSpacing());
        setWillNotDraw(false);
        this.Z0.setFocusable(true);
        this.Z0.setOnClickListener(new a());
        this.b1.setFocusable(true);
        this.b1.setOnClickListener(new b());
        if (getBackground() == null) {
            this.z1 = true;
        }
    }
}
