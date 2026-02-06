package com.google.android.exoplayer2.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.exoplayer2.ui.g;
import com.google.android.exoplayer2.ui.l;
import java.util.Collections;
import java.util.Formatter;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArraySet;
import o.C10323vs;
import o.C9542sf;
import o.ES1;
import o.InterfaceC11300zs1;
import o.JF;
import o.TD2;

@Deprecated
/* loaded from: classes2.dex */
public class c extends View implements l {
    public static final int N1 = 4;
    public static final int O1 = 26;
    public static final int P1 = 4;
    public static final int Q1 = 12;
    public static final int R1 = 0;
    public static final int S1 = 16;
    public static final int T1 = -1;
    public static final int U1 = 872415231;
    public static final int V1 = -855638017;
    public static final int W1 = -1;
    public static final int X1 = -1291845888;
    public static final int Y1 = 872414976;
    public static final int Z1 = 0;
    public static final int a2 = 1;
    public static final int b2 = -50;
    public static final int c2 = 3;
    public static final long d2 = 1000;
    public static final int e2 = 20;
    public static final float f2 = 1.0f;
    public static final float g2 = 0.0f;
    public static final String h2 = "android.widget.SeekBar";
    public int A1;
    public Rect B1;
    public ValueAnimator C1;
    public float D1;
    public boolean E1;
    public boolean F1;
    public long G1;
    public long H1;
    public long I1;
    public long J1;
    public int K1;
    @InterfaceC11300zs1
    public long[] L1;
    @InterfaceC11300zs1
    public boolean[] M1;
    public final Rect Y0;
    public final Rect Z0;
    public final Rect a1;
    public final Rect b1;
    public final Paint c1;
    public final Paint d1;
    public final Paint e1;
    public final Paint f1;
    public final Paint g1;
    public final Paint h1;
    @InterfaceC11300zs1
    public final Drawable i1;
    public final int j1;
    public final int k1;
    public final int l1;
    public final int m1;
    public final int n1;
    public final int o1;
    public final int p1;
    public final int q1;
    public final int r1;
    public final StringBuilder s1;
    public final Formatter t1;
    public final Runnable u1;
    public final CopyOnWriteArraySet<l.a> v1;
    public final Point w1;
    public final float x1;
    public int y1;
    public long z1;

    public c(Context context) {
        this(context, null);
    }

    public static /* synthetic */ void d(c cVar, ValueAnimator valueAnimator) {
        cVar.getClass();
        cVar.D1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        cVar.invalidate(cVar.Y0);
    }

    public static int f(float f, int i) {
        return (int) ((i * f) + 0.5f);
    }

    private long getPositionIncrement() {
        long j = this.z1;
        if (j == C10323vs.b) {
            long j2 = this.H1;
            if (j2 == C10323vs.b) {
                return 0L;
            }
            return j2 / this.y1;
        }
        return j;
    }

    private String getProgressText() {
        return TD2.z0(this.s1, this.t1, this.I1);
    }

    private long getScrubberPosition() {
        if (this.Z0.width() > 0 && this.H1 != C10323vs.b) {
            return (this.b1.width() * this.H1) / this.Z0.width();
        }
        return 0L;
    }

    public static int m(float f, int i) {
        return (int) (i / f);
    }

    public static boolean q(Drawable drawable, int i) {
        if (TD2.a >= 23 && drawable.setLayoutDirection(i)) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.exoplayer2.ui.l
    public void a(l.a aVar) {
        this.v1.remove(aVar);
    }

    @Override // com.google.android.exoplayer2.ui.l
    public void b(l.a aVar) {
        C9542sf.g(aVar);
        this.v1.add(aVar);
    }

    @Override // com.google.android.exoplayer2.ui.l
    public void c(@InterfaceC11300zs1 long[] jArr, @InterfaceC11300zs1 boolean[] zArr, int i) {
        boolean z;
        if (i != 0 && (jArr == null || zArr == null)) {
            z = false;
        } else {
            z = true;
        }
        C9542sf.a(z);
        this.K1 = i;
        this.L1 = jArr;
        this.M1 = zArr;
        w();
    }

    @Override // android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        x();
    }

    public final void g(Canvas canvas) {
        int i;
        if (this.H1 <= 0) {
            return;
        }
        Rect rect = this.b1;
        int w = TD2.w(rect.right, rect.left, this.Z0.right);
        int centerY = this.b1.centerY();
        Drawable drawable = this.i1;
        if (drawable == null) {
            if (!this.F1 && !isFocused()) {
                if (isEnabled()) {
                    i = this.n1;
                } else {
                    i = this.o1;
                }
            } else {
                i = this.p1;
            }
            canvas.drawCircle(w, centerY, (int) ((i * this.D1) / 2.0f), this.h1);
            return;
        }
        int intrinsicWidth = ((int) (drawable.getIntrinsicWidth() * this.D1)) / 2;
        int intrinsicHeight = ((int) (this.i1.getIntrinsicHeight() * this.D1)) / 2;
        this.i1.setBounds(w - intrinsicWidth, centerY - intrinsicHeight, w + intrinsicWidth, centerY + intrinsicHeight);
        this.i1.draw(canvas);
    }

    @Override // com.google.android.exoplayer2.ui.l
    public long getPreferredUpdateDelay() {
        int m = m(this.x1, this.Z0.width());
        if (m != 0) {
            long j = this.H1;
            if (j != 0 && j != C10323vs.b) {
                return j / m;
            }
            return Long.MAX_VALUE;
        }
        return Long.MAX_VALUE;
    }

    public final void h(Canvas canvas) {
        Paint paint;
        int height = this.Z0.height();
        int centerY = this.Z0.centerY() - (height / 2);
        int i = height + centerY;
        if (this.H1 <= 0) {
            Rect rect = this.Z0;
            canvas.drawRect(rect.left, centerY, rect.right, i, this.e1);
            return;
        }
        Rect rect2 = this.a1;
        int i2 = rect2.left;
        int i3 = rect2.right;
        int max = Math.max(Math.max(this.Z0.left, i3), this.b1.right);
        int i4 = this.Z0.right;
        if (max < i4) {
            canvas.drawRect(max, centerY, i4, i, this.e1);
        }
        int max2 = Math.max(i2, this.b1.right);
        if (i3 > max2) {
            canvas.drawRect(max2, centerY, i3, i, this.d1);
        }
        if (this.b1.width() > 0) {
            Rect rect3 = this.b1;
            canvas.drawRect(rect3.left, centerY, rect3.right, i, this.c1);
        }
        if (this.K1 != 0) {
            long[] jArr = (long[]) C9542sf.g(this.L1);
            boolean[] zArr = (boolean[]) C9542sf.g(this.M1);
            int i5 = this.m1 / 2;
            for (int i6 = 0; i6 < this.K1; i6++) {
                long x = TD2.x(jArr[i6], 0L, this.H1);
                Rect rect4 = this.Z0;
                int min = rect4.left + Math.min(rect4.width() - this.m1, Math.max(0, ((int) ((this.Z0.width() * x) / this.H1)) - i5));
                if (zArr[i6]) {
                    paint = this.g1;
                } else {
                    paint = this.f1;
                }
                canvas.drawRect(min, centerY, min + this.m1, i, paint);
            }
        }
    }

    public void i(long j) {
        if (this.C1.isStarted()) {
            this.C1.cancel();
        }
        this.C1.setFloatValues(this.D1, 0.0f);
        this.C1.setDuration(j);
        this.C1.start();
    }

    public void j(boolean z) {
        if (this.C1.isStarted()) {
            this.C1.cancel();
        }
        this.E1 = z;
        this.D1 = 0.0f;
        invalidate(this.Y0);
    }

    @Override // android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.i1;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    public final boolean k(float f, float f3) {
        return this.Y0.contains((int) f, (int) f3);
    }

    public final void l(float f) {
        Rect rect = this.b1;
        Rect rect2 = this.Z0;
        rect.right = TD2.w((int) f, rect2.left, rect2.right);
    }

    public final Point n(MotionEvent motionEvent) {
        this.w1.set((int) motionEvent.getX(), (int) motionEvent.getY());
        return this.w1;
    }

    public final boolean o(long j) {
        long j2;
        long j3 = this.H1;
        if (j3 <= 0) {
            return false;
        }
        if (this.F1) {
            j2 = this.G1;
        } else {
            j2 = this.I1;
        }
        long j4 = j2;
        long x = TD2.x(j4 + j, 0L, j3);
        if (x == j4) {
            return false;
        }
        if (!this.F1) {
            u(x);
        } else {
            y(x);
        }
        w();
        return true;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        canvas.save();
        h(canvas);
        g(canvas);
        canvas.restore();
    }

    @Override // android.view.View
    public void onFocusChanged(boolean z, int i, @InterfaceC11300zs1 Rect rect) {
        super.onFocusChanged(z, i, rect);
        if (this.F1 && !z) {
            v(false);
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (accessibilityEvent.getEventType() == 4) {
            accessibilityEvent.getText().add(getProgressText());
        }
        accessibilityEvent.setClassName(h2);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(h2);
        accessibilityNodeInfo.setContentDescription(getProgressText());
        if (this.H1 <= 0) {
            return;
        }
        if (TD2.a >= 21) {
            accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_FORWARD);
            accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_BACKWARD);
            return;
        }
        accessibilityNodeInfo.addAction(4096);
        accessibilityNodeInfo.addAction(8192);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001a  */
    @Override // android.view.View, android.view.KeyEvent.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (isEnabled()) {
            long positionIncrement = getPositionIncrement();
            if (i != 66) {
                switch (i) {
                    case 21:
                        positionIncrement = -positionIncrement;
                        if (o(positionIncrement)) {
                            removeCallbacks(this.u1);
                            postDelayed(this.u1, 1000L);
                            return true;
                        }
                        break;
                    case 22:
                        if (o(positionIncrement)) {
                        }
                        break;
                }
            }
            if (this.F1) {
                v(false);
                return true;
            }
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8 = i3 - i;
        int i9 = i4 - i2;
        int paddingLeft = getPaddingLeft();
        int paddingRight = i8 - getPaddingRight();
        if (this.E1) {
            i5 = 0;
        } else {
            i5 = this.q1;
        }
        if (this.l1 == 1) {
            i6 = (i9 - getPaddingBottom()) - this.k1;
            int i10 = this.j1;
            i7 = ((i9 - getPaddingBottom()) - i10) - Math.max(i5 - (i10 / 2), 0);
        } else {
            i6 = (i9 - this.k1) / 2;
            i7 = (i9 - this.j1) / 2;
        }
        this.Y0.set(paddingLeft, i6, paddingRight, this.k1 + i6);
        Rect rect = this.Z0;
        Rect rect2 = this.Y0;
        rect.set(rect2.left + i5, i7, rect2.right - i5, this.j1 + i7);
        if (TD2.a >= 29) {
            r(i8, i9);
        }
        w();
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (mode == 0) {
            size = this.k1;
        } else if (mode != 1073741824) {
            size = Math.min(this.k1, size);
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i), size);
        x();
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i) {
        Drawable drawable = this.i1;
        if (drawable != null && q(drawable, i)) {
            invalidate();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0025, code lost:
        if (r3 != 3) goto L32;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z = false;
        if (isEnabled() && this.H1 > 0) {
            Point n = n(motionEvent);
            int i = n.x;
            int i2 = n.y;
            int action = motionEvent.getAction();
            if (action != 0) {
                if (action != 1) {
                    if (action == 2) {
                        if (this.F1) {
                            if (i2 < this.r1) {
                                int i3 = this.A1;
                                l(i3 + ((i - i3) / 3));
                            } else {
                                this.A1 = i;
                                l(i);
                            }
                            y(getScrubberPosition());
                            w();
                            invalidate();
                            return true;
                        }
                    }
                }
                if (this.F1) {
                    if (motionEvent.getAction() == 3) {
                        z = true;
                    }
                    v(z);
                    return true;
                }
            } else {
                float f = i;
                if (k(f, i2)) {
                    l(f);
                    u(getScrubberPosition());
                    w();
                    invalidate();
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean p(Drawable drawable) {
        if (TD2.a >= 23 && q(drawable, getLayoutDirection())) {
            return true;
        }
        return false;
    }

    @Override // android.view.View
    public boolean performAccessibilityAction(int i, @InterfaceC11300zs1 Bundle bundle) {
        if (super.performAccessibilityAction(i, bundle)) {
            return true;
        }
        if (this.H1 <= 0) {
            return false;
        }
        if (i == 8192) {
            if (o(-getPositionIncrement())) {
                v(false);
            }
        } else if (i != 4096) {
            return false;
        } else {
            if (o(getPositionIncrement())) {
                v(false);
            }
        }
        sendAccessibilityEvent(4);
        return true;
    }

    @ES1(29)
    public final void r(int i, int i2) {
        Rect rect = this.B1;
        if (rect != null && rect.width() == i && this.B1.height() == i2) {
            return;
        }
        Rect rect2 = new Rect(0, 0, i, i2);
        this.B1 = rect2;
        setSystemGestureExclusionRects(Collections.singletonList(rect2));
    }

    public void s() {
        if (this.C1.isStarted()) {
            this.C1.cancel();
        }
        this.E1 = false;
        this.D1 = 1.0f;
        invalidate(this.Y0);
    }

    public void setAdMarkerColor(@JF int i) {
        this.f1.setColor(i);
        invalidate(this.Y0);
    }

    public void setBufferedColor(@JF int i) {
        this.d1.setColor(i);
        invalidate(this.Y0);
    }

    @Override // com.google.android.exoplayer2.ui.l
    public void setBufferedPosition(long j) {
        if (this.J1 == j) {
            return;
        }
        this.J1 = j;
        w();
    }

    @Override // com.google.android.exoplayer2.ui.l
    public void setDuration(long j) {
        if (this.H1 == j) {
            return;
        }
        this.H1 = j;
        if (this.F1 && j == C10323vs.b) {
            v(true);
        }
        w();
    }

    @Override // android.view.View, com.google.android.exoplayer2.ui.l
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        if (this.F1 && !z) {
            v(true);
        }
    }

    @Override // com.google.android.exoplayer2.ui.l
    public void setKeyCountIncrement(int i) {
        boolean z;
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        C9542sf.a(z);
        this.y1 = i;
        this.z1 = C10323vs.b;
    }

    @Override // com.google.android.exoplayer2.ui.l
    public void setKeyTimeIncrement(long j) {
        boolean z;
        if (j > 0) {
            z = true;
        } else {
            z = false;
        }
        C9542sf.a(z);
        this.y1 = -1;
        this.z1 = j;
    }

    public void setPlayedAdMarkerColor(@JF int i) {
        this.g1.setColor(i);
        invalidate(this.Y0);
    }

    public void setPlayedColor(@JF int i) {
        this.c1.setColor(i);
        invalidate(this.Y0);
    }

    @Override // com.google.android.exoplayer2.ui.l
    public void setPosition(long j) {
        if (this.I1 == j) {
            return;
        }
        this.I1 = j;
        setContentDescription(getProgressText());
        w();
    }

    public void setScrubberColor(@JF int i) {
        this.h1.setColor(i);
        invalidate(this.Y0);
    }

    public void setUnplayedColor(@JF int i) {
        this.e1.setColor(i);
        invalidate(this.Y0);
    }

    public void t(long j) {
        if (this.C1.isStarted()) {
            this.C1.cancel();
        }
        this.E1 = false;
        this.C1.setFloatValues(this.D1, 1.0f);
        this.C1.setDuration(j);
        this.C1.start();
    }

    public final void u(long j) {
        this.G1 = j;
        this.F1 = true;
        setPressed(true);
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
        Iterator<l.a> it = this.v1.iterator();
        while (it.hasNext()) {
            it.next().h0(this, j);
        }
    }

    public final void v(boolean z) {
        removeCallbacks(this.u1);
        this.F1 = false;
        setPressed(false);
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(false);
        }
        invalidate();
        Iterator<l.a> it = this.v1.iterator();
        while (it.hasNext()) {
            it.next().d0(this, this.G1, z);
        }
    }

    public final void w() {
        long j;
        this.a1.set(this.Z0);
        this.b1.set(this.Z0);
        if (this.F1) {
            j = this.G1;
        } else {
            j = this.I1;
        }
        if (this.H1 > 0) {
            Rect rect = this.a1;
            Rect rect2 = this.Z0;
            rect.right = Math.min(rect2.left + ((int) ((this.Z0.width() * this.J1) / this.H1)), rect2.right);
            int width = (int) ((this.Z0.width() * j) / this.H1);
            Rect rect3 = this.b1;
            Rect rect4 = this.Z0;
            rect3.right = Math.min(rect4.left + width, rect4.right);
        } else {
            Rect rect5 = this.a1;
            int i = this.Z0.left;
            rect5.right = i;
            this.b1.right = i;
        }
        invalidate(this.Y0);
    }

    public final void x() {
        Drawable drawable = this.i1;
        if (drawable != null && drawable.isStateful() && this.i1.setState(getDrawableState())) {
            invalidate();
        }
    }

    public final void y(long j) {
        if (this.G1 != j) {
            this.G1 = j;
            Iterator<l.a> it = this.v1.iterator();
            while (it.hasNext()) {
                it.next().y(this, j);
            }
        }
    }

    public c(Context context, @InterfaceC11300zs1 AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public c(Context context, @InterfaceC11300zs1 AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, attributeSet);
    }

    public c(Context context, @InterfaceC11300zs1 AttributeSet attributeSet, int i, @InterfaceC11300zs1 AttributeSet attributeSet2) {
        this(context, attributeSet, i, attributeSet2, 0);
    }

    public c(Context context, @InterfaceC11300zs1 AttributeSet attributeSet, int i, @InterfaceC11300zs1 AttributeSet attributeSet2, int i2) {
        super(context, attributeSet, i);
        this.Y0 = new Rect();
        this.Z0 = new Rect();
        this.a1 = new Rect();
        this.b1 = new Rect();
        Paint paint = new Paint();
        this.c1 = paint;
        Paint paint2 = new Paint();
        this.d1 = paint2;
        Paint paint3 = new Paint();
        this.e1 = paint3;
        Paint paint4 = new Paint();
        this.f1 = paint4;
        Paint paint5 = new Paint();
        this.g1 = paint5;
        Paint paint6 = new Paint();
        this.h1 = paint6;
        paint6.setAntiAlias(true);
        this.v1 = new CopyOnWriteArraySet<>();
        this.w1 = new Point();
        float f = context.getResources().getDisplayMetrics().density;
        this.x1 = f;
        this.r1 = f(f, -50);
        int f3 = f(f, 4);
        int f4 = f(f, 26);
        int f5 = f(f, 4);
        int f6 = f(f, 12);
        int f7 = f(f, 0);
        int f8 = f(f, 16);
        if (attributeSet2 != null) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet2, g.m.l, i, i2);
            try {
                Drawable drawable = obtainStyledAttributes.getDrawable(g.m.w);
                this.i1 = drawable;
                if (drawable != null) {
                    p(drawable);
                    f4 = Math.max(drawable.getMinimumHeight(), f4);
                }
                this.j1 = obtainStyledAttributes.getDimensionPixelSize(g.m.p, f3);
                this.k1 = obtainStyledAttributes.getDimensionPixelSize(g.m.y, f4);
                this.l1 = obtainStyledAttributes.getInt(g.m.f174o, 0);
                this.m1 = obtainStyledAttributes.getDimensionPixelSize(g.m.n, f5);
                this.n1 = obtainStyledAttributes.getDimensionPixelSize(g.m.x, f6);
                this.o1 = obtainStyledAttributes.getDimensionPixelSize(g.m.u, f7);
                this.p1 = obtainStyledAttributes.getDimensionPixelSize(g.m.v, f8);
                int i3 = obtainStyledAttributes.getInt(g.m.s, -1);
                int i4 = obtainStyledAttributes.getInt(g.m.t, -1);
                int i5 = obtainStyledAttributes.getInt(g.m.q, V1);
                int i6 = obtainStyledAttributes.getInt(g.m.z, U1);
                int i7 = obtainStyledAttributes.getInt(g.m.m, X1);
                int i8 = obtainStyledAttributes.getInt(g.m.r, Y1);
                paint.setColor(i3);
                paint6.setColor(i4);
                paint2.setColor(i5);
                paint3.setColor(i6);
                paint4.setColor(i7);
                paint5.setColor(i8);
                obtainStyledAttributes.recycle();
            } catch (Throwable th) {
                obtainStyledAttributes.recycle();
                throw th;
            }
        } else {
            this.j1 = f3;
            this.k1 = f4;
            this.l1 = 0;
            this.m1 = f5;
            this.n1 = f6;
            this.o1 = f7;
            this.p1 = f8;
            paint.setColor(-1);
            paint6.setColor(-1);
            paint2.setColor(V1);
            paint3.setColor(U1);
            paint4.setColor(X1);
            paint5.setColor(Y1);
            this.i1 = null;
        }
        StringBuilder sb = new StringBuilder();
        this.s1 = sb;
        this.t1 = new Formatter(sb, Locale.getDefault());
        this.u1 = new Runnable() { // from class: o.Y00
            @Override // java.lang.Runnable
            public final void run() {
                com.google.android.exoplayer2.ui.c.this.v(false);
            }
        };
        Drawable drawable2 = this.i1;
        if (drawable2 != null) {
            this.q1 = (drawable2.getMinimumWidth() + 1) / 2;
        } else {
            this.q1 = (Math.max(this.o1, Math.max(this.n1, this.p1)) + 1) / 2;
        }
        this.D1 = 1.0f;
        ValueAnimator valueAnimator = new ValueAnimator();
        this.C1 = valueAnimator;
        valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: o.Z00
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                com.google.android.exoplayer2.ui.c.d(com.google.android.exoplayer2.ui.c.this, valueAnimator2);
            }
        });
        this.H1 = C10323vs.b;
        this.z1 = C10323vs.b;
        this.y1 = 20;
        setFocusable(true);
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
    }
}
