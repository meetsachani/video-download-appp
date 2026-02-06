package o;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import o.HT1;

@HT1({HT1.a.Y})
/* renamed from: o.Ro  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C4146Ro extends Drawable {
    public static final float q = 1.3333f;
    @InterfaceC5670cr1
    public final Paint b;
    @InterfaceC9397s30
    public float h;
    @JF
    public int i;
    @JF
    public int j;
    @JF
    public int k;
    @JF
    public int l;
    @JF
    public int m;

    /* renamed from: o  reason: collision with root package name */
    public O22 f602o;
    @InterfaceC11300zs1
    public ColorStateList p;
    public final P22 a = P22.l();
    public final Path c = new Path();
    public final Rect d = new Rect();
    public final RectF e = new RectF();
    public final RectF f = new RectF();
    public final b g = new b();
    public boolean n = true;

    /* renamed from: o.Ro$b */
    /* loaded from: classes3.dex */
    public class b extends Drawable.ConstantState {
        public b() {
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        @InterfaceC5670cr1
        public Drawable newDrawable() {
            return C4146Ro.this;
        }
    }

    public C4146Ro(O22 o22) {
        this.f602o = o22;
        Paint paint = new Paint(1);
        this.b = paint;
        paint.setStyle(Paint.Style.STROKE);
    }

    @InterfaceC5670cr1
    public final Shader a() {
        Rect rect = this.d;
        copyBounds(rect);
        float height = this.h / rect.height();
        return new LinearGradient(0.0f, rect.top, 0.0f, rect.bottom, new int[]{C9205rG.v(this.i, this.m), C9205rG.v(this.j, this.m), C9205rG.v(C9205rG.D(this.j, 0), this.m), C9205rG.v(C9205rG.D(this.l, 0), this.m), C9205rG.v(this.l, this.m), C9205rG.v(this.k, this.m)}, new float[]{0.0f, height, 0.5f, 0.5f, 1.0f - height, 1.0f}, Shader.TileMode.CLAMP);
    }

    @InterfaceC5670cr1
    public RectF b() {
        this.f.set(getBounds());
        return this.f;
    }

    public O22 c() {
        return this.f602o;
    }

    public void d(@InterfaceC11300zs1 ColorStateList colorStateList) {
        if (colorStateList != null) {
            this.m = colorStateList.getColorForState(getState(), this.m);
        }
        this.p = colorStateList;
        this.n = true;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@InterfaceC5670cr1 Canvas canvas) {
        if (this.n) {
            this.b.setShader(a());
            this.n = false;
        }
        float strokeWidth = this.b.getStrokeWidth() / 2.0f;
        copyBounds(this.d);
        this.e.set(this.d);
        float min = Math.min(this.f602o.r().a(b()), this.e.width() / 2.0f);
        if (this.f602o.v(b())) {
            this.e.inset(strokeWidth, strokeWidth);
            canvas.drawRoundRect(this.e, min, min, this.b);
        }
    }

    public void e(@InterfaceC9397s30 float f) {
        if (this.h != f) {
            this.h = f;
            this.b.setStrokeWidth(f * 1.3333f);
            this.n = true;
            invalidateSelf();
        }
    }

    public void f(@JF int i, @JF int i2, @JF int i3, @JF int i4) {
        this.i = i;
        this.j = i2;
        this.k = i3;
        this.l = i4;
    }

    public void g(O22 o22) {
        this.f602o = o22;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    @InterfaceC11300zs1
    public Drawable.ConstantState getConstantState() {
        return this.g;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        if (this.h > 0.0f) {
            return -3;
        }
        return -2;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(@InterfaceC5670cr1 Outline outline) {
        if (this.f602o.v(b())) {
            outline.setRoundRect(getBounds(), this.f602o.r().a(b()));
            return;
        }
        copyBounds(this.d);
        this.e.set(this.d);
        this.a.d(this.f602o, 1.0f, this.e, this.c);
        Z60.l(outline, this.c);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(@InterfaceC5670cr1 Rect rect) {
        if (this.f602o.v(b())) {
            int round = Math.round(this.h);
            rect.set(round, round, round, round);
            return true;
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList = this.p;
        if ((colorStateList != null && colorStateList.isStateful()) || super.isStateful()) {
            return true;
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        this.n = true;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        int colorForState;
        ColorStateList colorStateList = this.p;
        if (colorStateList != null && (colorForState = colorStateList.getColorForState(iArr, this.m)) != this.m) {
            this.n = true;
            this.m = colorForState;
        }
        if (this.n) {
            invalidateSelf();
        }
        return this.n;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(@BR0(from = 0, to = 255) int i) {
        this.b.setAlpha(i);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(@InterfaceC11300zs1 ColorFilter colorFilter) {
        this.b.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
