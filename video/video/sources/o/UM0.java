package o;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.widget.ImageView;
import androidx.constraintlayout.widget.j;
import o.VM0;

/* loaded from: classes.dex */
public class UM0 extends C10748xc {
    public VM0.c b1;
    public float c1;
    public float d1;
    public float e1;
    public Path f1;
    public ViewOutlineProvider g1;
    public RectF h1;
    public Drawable[] i1;
    public LayerDrawable j1;
    public boolean k1;
    public Drawable l1;
    public Drawable m1;
    public float n1;
    public float o1;
    public float p1;
    public float q1;

    /* loaded from: classes.dex */
    public class a extends ViewOutlineProvider {
        public a() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            int width = UM0.this.getWidth();
            int height = UM0.this.getHeight();
            outline.setRoundRect(0, 0, width, height, (Math.min(width, height) * UM0.this.d1) / 2.0f);
        }
    }

    /* loaded from: classes.dex */
    public class b extends ViewOutlineProvider {
        public b() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            outline.setRoundRect(0, 0, UM0.this.getWidth(), UM0.this.getHeight(), UM0.this.e1);
        }
    }

    public UM0(Context context) {
        super(context);
        this.b1 = new VM0.c();
        this.c1 = 0.0f;
        this.d1 = 0.0f;
        this.e1 = Float.NaN;
        this.i1 = new Drawable[2];
        this.k1 = true;
        this.l1 = null;
        this.m1 = null;
        this.n1 = Float.NaN;
        this.o1 = Float.NaN;
        this.p1 = Float.NaN;
        this.q1 = Float.NaN;
        c(context, null);
    }

    private void setOverlay(boolean z) {
        this.k1 = z;
    }

    public final void c(Context context, AttributeSet attributeSet) {
        setPadding(0, 0, 0, 0);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.c.Y8);
            int indexCount = obtainStyledAttributes.getIndexCount();
            this.l1 = obtainStyledAttributes.getDrawable(j.c.Z8);
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == j.c.d9) {
                    this.c1 = obtainStyledAttributes.getFloat(index, 0.0f);
                } else if (index == j.c.m9) {
                    setWarmth(obtainStyledAttributes.getFloat(index, 0.0f));
                } else if (index == j.c.l9) {
                    setSaturation(obtainStyledAttributes.getFloat(index, 0.0f));
                } else if (index == j.c.c9) {
                    setContrast(obtainStyledAttributes.getFloat(index, 0.0f));
                } else if (index == j.c.j9) {
                    setRound(obtainStyledAttributes.getDimension(index, 0.0f));
                } else if (index == j.c.k9) {
                    setRoundPercent(obtainStyledAttributes.getFloat(index, 0.0f));
                } else if (index == j.c.i9) {
                    setOverlay(obtainStyledAttributes.getBoolean(index, this.k1));
                } else if (index == j.c.e9) {
                    setImagePanX(obtainStyledAttributes.getFloat(index, this.n1));
                } else if (index == j.c.f9) {
                    setImagePanY(obtainStyledAttributes.getFloat(index, this.o1));
                } else if (index == j.c.g9) {
                    setImageRotate(obtainStyledAttributes.getFloat(index, this.q1));
                } else if (index == j.c.h9) {
                    setImageZoom(obtainStyledAttributes.getFloat(index, this.p1));
                }
            }
            obtainStyledAttributes.recycle();
            Drawable drawable = getDrawable();
            this.m1 = drawable;
            if (this.l1 != null && drawable != null) {
                Drawable[] drawableArr = this.i1;
                Drawable mutate = getDrawable().mutate();
                this.m1 = mutate;
                drawableArr[0] = mutate;
                this.i1[1] = this.l1.mutate();
                LayerDrawable layerDrawable = new LayerDrawable(this.i1);
                this.j1 = layerDrawable;
                layerDrawable.getDrawable(1).setAlpha((int) (this.c1 * 255.0f));
                if (!this.k1) {
                    this.j1.getDrawable(0).setAlpha((int) ((1.0f - this.c1) * 255.0f));
                }
                super.setImageDrawable(this.j1);
                return;
            }
            Drawable drawable2 = getDrawable();
            this.m1 = drawable2;
            if (drawable2 != null) {
                Drawable[] drawableArr2 = this.i1;
                Drawable mutate2 = drawable2.mutate();
                this.m1 = mutate2;
                drawableArr2[0] = mutate2;
            }
        }
    }

    public final void d() {
        float f;
        float f2;
        float f3;
        float f4;
        if (Float.isNaN(this.n1) && Float.isNaN(this.o1) && Float.isNaN(this.p1) && Float.isNaN(this.q1)) {
            return;
        }
        float f5 = 0.0f;
        if (Float.isNaN(this.n1)) {
            f = 0.0f;
        } else {
            f = this.n1;
        }
        if (Float.isNaN(this.o1)) {
            f2 = 0.0f;
        } else {
            f2 = this.o1;
        }
        if (Float.isNaN(this.p1)) {
            f3 = 1.0f;
        } else {
            f3 = this.p1;
        }
        if (!Float.isNaN(this.q1)) {
            f5 = this.q1;
        }
        Matrix matrix = new Matrix();
        matrix.reset();
        float intrinsicWidth = getDrawable().getIntrinsicWidth();
        float intrinsicHeight = getDrawable().getIntrinsicHeight();
        float width = getWidth();
        float height = getHeight();
        if (intrinsicWidth * height < intrinsicHeight * width) {
            f4 = width / intrinsicWidth;
        } else {
            f4 = height / intrinsicHeight;
        }
        float f6 = f3 * f4;
        matrix.postScale(f6, f6);
        float f7 = intrinsicWidth * f6;
        float f8 = f6 * intrinsicHeight;
        matrix.postTranslate((((f * (width - f7)) + width) - f7) * 0.5f, (((f2 * (height - f8)) + height) - f8) * 0.5f);
        matrix.postRotate(f5, width / 2.0f, height / 2.0f);
        setImageMatrix(matrix);
        setScaleType(ImageView.ScaleType.MATRIX);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
    }

    public final void e() {
        if (Float.isNaN(this.n1) && Float.isNaN(this.o1) && Float.isNaN(this.p1) && Float.isNaN(this.q1)) {
            setScaleType(ImageView.ScaleType.FIT_CENTER);
        } else {
            d();
        }
    }

    public float getContrast() {
        return this.b1.f;
    }

    public float getCrossfade() {
        return this.c1;
    }

    public float getImagePanX() {
        return this.n1;
    }

    public float getImagePanY() {
        return this.o1;
    }

    public float getImageRotate() {
        return this.q1;
    }

    public float getImageZoom() {
        return this.p1;
    }

    public float getRound() {
        return this.e1;
    }

    public float getRoundPercent() {
        return this.d1;
    }

    public float getSaturation() {
        return this.b1.e;
    }

    public float getWarmth() {
        return this.b1.g;
    }

    @Override // android.view.View
    public void layout(int i, int i2, int i3, int i4) {
        super.layout(i, i2, i3, i4);
        d();
    }

    public void setAltImageResource(int i) {
        Drawable mutate = C3220Ic.b(getContext(), i).mutate();
        this.l1 = mutate;
        Drawable[] drawableArr = this.i1;
        drawableArr[0] = this.m1;
        drawableArr[1] = mutate;
        LayerDrawable layerDrawable = new LayerDrawable(this.i1);
        this.j1 = layerDrawable;
        super.setImageDrawable(layerDrawable);
        setCrossfade(this.c1);
    }

    public void setBrightness(float f) {
        VM0.c cVar = this.b1;
        cVar.d = f;
        cVar.c(this);
    }

    public void setContrast(float f) {
        VM0.c cVar = this.b1;
        cVar.f = f;
        cVar.c(this);
    }

    public void setCrossfade(float f) {
        this.c1 = f;
        if (this.i1 != null) {
            if (!this.k1) {
                this.j1.getDrawable(0).setAlpha((int) ((1.0f - this.c1) * 255.0f));
            }
            this.j1.getDrawable(1).setAlpha((int) (this.c1 * 255.0f));
            super.setImageDrawable(this.j1);
        }
    }

    @Override // o.C10748xc, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        if (this.l1 != null && drawable != null) {
            Drawable mutate = drawable.mutate();
            this.m1 = mutate;
            Drawable[] drawableArr = this.i1;
            drawableArr[0] = mutate;
            drawableArr[1] = this.l1;
            LayerDrawable layerDrawable = new LayerDrawable(this.i1);
            this.j1 = layerDrawable;
            super.setImageDrawable(layerDrawable);
            setCrossfade(this.c1);
            return;
        }
        super.setImageDrawable(drawable);
    }

    public void setImagePanX(float f) {
        this.n1 = f;
        e();
    }

    public void setImagePanY(float f) {
        this.o1 = f;
        e();
    }

    @Override // o.C10748xc, android.widget.ImageView
    public void setImageResource(int i) {
        if (this.l1 != null) {
            Drawable mutate = C3220Ic.b(getContext(), i).mutate();
            this.m1 = mutate;
            Drawable[] drawableArr = this.i1;
            drawableArr[0] = mutate;
            drawableArr[1] = this.l1;
            LayerDrawable layerDrawable = new LayerDrawable(this.i1);
            this.j1 = layerDrawable;
            super.setImageDrawable(layerDrawable);
            setCrossfade(this.c1);
            return;
        }
        super.setImageResource(i);
    }

    public void setImageRotate(float f) {
        this.q1 = f;
        e();
    }

    public void setImageZoom(float f) {
        this.p1 = f;
        e();
    }

    public void setRound(float f) {
        boolean z;
        if (Float.isNaN(f)) {
            this.e1 = f;
            float f2 = this.d1;
            this.d1 = -1.0f;
            setRoundPercent(f2);
            return;
        }
        if (this.e1 != f) {
            z = true;
        } else {
            z = false;
        }
        this.e1 = f;
        if (f != 0.0f) {
            if (this.f1 == null) {
                this.f1 = new Path();
            }
            if (this.h1 == null) {
                this.h1 = new RectF();
            }
            if (this.g1 == null) {
                b bVar = new b();
                this.g1 = bVar;
                setOutlineProvider(bVar);
            }
            setClipToOutline(true);
            this.h1.set(0.0f, 0.0f, getWidth(), getHeight());
            this.f1.reset();
            Path path = this.f1;
            RectF rectF = this.h1;
            float f3 = this.e1;
            path.addRoundRect(rectF, f3, f3, Path.Direction.CW);
        } else {
            setClipToOutline(false);
        }
        if (z) {
            invalidateOutline();
        }
    }

    public void setRoundPercent(float f) {
        boolean z;
        if (this.d1 != f) {
            z = true;
        } else {
            z = false;
        }
        this.d1 = f;
        if (f != 0.0f) {
            if (this.f1 == null) {
                this.f1 = new Path();
            }
            if (this.h1 == null) {
                this.h1 = new RectF();
            }
            if (this.g1 == null) {
                a aVar = new a();
                this.g1 = aVar;
                setOutlineProvider(aVar);
            }
            setClipToOutline(true);
            int width = getWidth();
            int height = getHeight();
            float min = (Math.min(width, height) * this.d1) / 2.0f;
            this.h1.set(0.0f, 0.0f, width, height);
            this.f1.reset();
            this.f1.addRoundRect(this.h1, min, min, Path.Direction.CW);
        } else {
            setClipToOutline(false);
        }
        if (z) {
            invalidateOutline();
        }
    }

    public void setSaturation(float f) {
        VM0.c cVar = this.b1;
        cVar.e = f;
        cVar.c(this);
    }

    public void setWarmth(float f) {
        VM0.c cVar = this.b1;
        cVar.g = f;
        cVar.c(this);
    }

    public UM0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b1 = new VM0.c();
        this.c1 = 0.0f;
        this.d1 = 0.0f;
        this.e1 = Float.NaN;
        this.i1 = new Drawable[2];
        this.k1 = true;
        this.l1 = null;
        this.m1 = null;
        this.n1 = Float.NaN;
        this.o1 = Float.NaN;
        this.p1 = Float.NaN;
        this.q1 = Float.NaN;
        c(context, attributeSet);
    }

    public UM0(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.b1 = new VM0.c();
        this.c1 = 0.0f;
        this.d1 = 0.0f;
        this.e1 = Float.NaN;
        this.i1 = new Drawable[2];
        this.k1 = true;
        this.l1 = null;
        this.m1 = null;
        this.n1 = Float.NaN;
        this.o1 = Float.NaN;
        this.p1 = Float.NaN;
        this.q1 = Float.NaN;
        c(context, attributeSet);
    }
}
