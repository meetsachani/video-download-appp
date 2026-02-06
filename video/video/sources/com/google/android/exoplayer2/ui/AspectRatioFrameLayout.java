package com.google.android.exoplayer2.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.exoplayer2.ui.g;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import o.InterfaceC11300zs1;

@Deprecated
/* loaded from: classes2.dex */
public final class AspectRatioFrameLayout extends FrameLayout {
    public static final int c1 = 0;
    public static final int d1 = 1;
    public static final int e1 = 2;
    public static final int f1 = 3;
    public static final int g1 = 4;
    public static final float h1 = 0.01f;
    public final c Y0;
    @InterfaceC11300zs1
    public b Z0;
    public float a1;
    public int b1;

    /* loaded from: classes2.dex */
    public interface b {
        void a(float f, float f2, boolean z);
    }

    /* loaded from: classes2.dex */
    public final class c implements Runnable {
        public float X;
        public float Y;
        public boolean Y0;
        public boolean Z;

        public c() {
        }

        public void a(float f, float f2, boolean z) {
            this.X = f;
            this.Y = f2;
            this.Z = z;
            if (!this.Y0) {
                this.Y0 = true;
                AspectRatioFrameLayout.this.post(this);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            this.Y0 = false;
            if (AspectRatioFrameLayout.this.Z0 == null) {
                return;
            }
            AspectRatioFrameLayout.this.Z0.a(this.X, this.Y, this.Z);
        }
    }

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes2.dex */
    public @interface d {
    }

    public AspectRatioFrameLayout(Context context) {
        this(context, null);
    }

    public int getResizeMode() {
        return this.b1;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        float f;
        float f2;
        super.onMeasure(i, i2);
        if (this.a1 <= 0.0f) {
            return;
        }
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        float f3 = measuredWidth;
        float f4 = measuredHeight;
        float f5 = f3 / f4;
        float f6 = (this.a1 / f5) - 1.0f;
        if (Math.abs(f6) <= 0.01f) {
            this.Y0.a(this.a1, f5, false);
            return;
        }
        int i3 = this.b1;
        if (i3 != 0) {
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 == 4) {
                        if (f6 > 0.0f) {
                            f = this.a1;
                        } else {
                            f2 = this.a1;
                        }
                    }
                } else {
                    f = this.a1;
                }
                measuredWidth = (int) (f4 * f);
            } else {
                f2 = this.a1;
            }
            measuredHeight = (int) (f3 / f2);
        } else if (f6 > 0.0f) {
            f2 = this.a1;
            measuredHeight = (int) (f3 / f2);
        } else {
            f = this.a1;
            measuredWidth = (int) (f4 * f);
        }
        this.Y0.a(this.a1, f5, true);
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824));
    }

    public void setAspectRatio(float f) {
        if (this.a1 != f) {
            this.a1 = f;
            requestLayout();
        }
    }

    public void setAspectRatioListener(@InterfaceC11300zs1 b bVar) {
        this.Z0 = bVar;
    }

    public void setResizeMode(int i) {
        if (this.b1 != i) {
            this.b1 = i;
            requestLayout();
        }
    }

    public AspectRatioFrameLayout(Context context, @InterfaceC11300zs1 AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b1 = 0;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, g.m.a, 0, 0);
            try {
                this.b1 = obtainStyledAttributes.getInt(g.m.b, 0);
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
        this.Y0 = new c();
    }
}
