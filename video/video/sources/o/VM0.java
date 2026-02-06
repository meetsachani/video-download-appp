package o;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
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
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.j;

/* loaded from: classes.dex */
public class VM0 extends AppCompatImageView {
    public c b1;
    public boolean c1;
    public Drawable d1;
    public Drawable e1;
    public float f1;
    public float g1;
    public float h1;
    public Path i1;
    public ViewOutlineProvider j1;
    public RectF k1;
    public Drawable[] l1;
    public LayerDrawable m1;
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
            int width = VM0.this.getWidth();
            int height = VM0.this.getHeight();
            outline.setRoundRect(0, 0, width, height, (Math.min(width, height) * VM0.this.g1) / 2.0f);
        }
    }

    /* loaded from: classes.dex */
    public class b extends ViewOutlineProvider {
        public b() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            outline.setRoundRect(0, 0, VM0.this.getWidth(), VM0.this.getHeight(), VM0.this.h1);
        }
    }

    /* loaded from: classes.dex */
    public static class c {
        public float[] a = new float[20];
        public ColorMatrix b = new ColorMatrix();
        public ColorMatrix c = new ColorMatrix();
        public float d = 1.0f;
        public float e = 1.0f;
        public float f = 1.0f;
        public float g = 1.0f;

        public final void a(float f) {
            float[] fArr = this.a;
            fArr[0] = f;
            fArr[1] = 0.0f;
            fArr[2] = 0.0f;
            fArr[3] = 0.0f;
            fArr[4] = 0.0f;
            fArr[5] = 0.0f;
            fArr[6] = f;
            fArr[7] = 0.0f;
            fArr[8] = 0.0f;
            fArr[9] = 0.0f;
            fArr[10] = 0.0f;
            fArr[11] = 0.0f;
            fArr[12] = f;
            fArr[13] = 0.0f;
            fArr[14] = 0.0f;
            fArr[15] = 0.0f;
            fArr[16] = 0.0f;
            fArr[17] = 0.0f;
            fArr[18] = 1.0f;
            fArr[19] = 0.0f;
        }

        public final void b(float f) {
            float f2 = 1.0f - f;
            float f3 = 0.2999f * f2;
            float f4 = 0.587f * f2;
            float f5 = f2 * 0.114f;
            float[] fArr = this.a;
            fArr[0] = f3 + f;
            fArr[1] = f4;
            fArr[2] = f5;
            fArr[3] = 0.0f;
            fArr[4] = 0.0f;
            fArr[5] = f3;
            fArr[6] = f4 + f;
            fArr[7] = f5;
            fArr[8] = 0.0f;
            fArr[9] = 0.0f;
            fArr[10] = f3;
            fArr[11] = f4;
            fArr[12] = f5 + f;
            fArr[13] = 0.0f;
            fArr[14] = 0.0f;
            fArr[15] = 0.0f;
            fArr[16] = 0.0f;
            fArr[17] = 0.0f;
            fArr[18] = 1.0f;
            fArr[19] = 0.0f;
        }

        public void c(ImageView imageView) {
            boolean z;
            this.b.reset();
            float f = this.e;
            boolean z2 = true;
            if (f != 1.0f) {
                b(f);
                this.b.set(this.a);
                z = true;
            } else {
                z = false;
            }
            float f2 = this.f;
            if (f2 != 1.0f) {
                this.c.setScale(f2, f2, f2, 1.0f);
                this.b.postConcat(this.c);
                z = true;
            }
            float f3 = this.g;
            if (f3 != 1.0f) {
                d(f3);
                this.c.set(this.a);
                this.b.postConcat(this.c);
                z = true;
            }
            float f4 = this.d;
            if (f4 != 1.0f) {
                a(f4);
                this.c.set(this.a);
                this.b.postConcat(this.c);
            } else {
                z2 = z;
            }
            if (z2) {
                imageView.setColorFilter(new ColorMatrixColorFilter(this.b));
            } else {
                imageView.clearColorFilter();
            }
        }

        public final void d(float f) {
            float log;
            float f2;
            float f3;
            if (f <= 0.0f) {
                f = 0.01f;
            }
            float f4 = (5000.0f / f) / 100.0f;
            if (f4 > 66.0f) {
                double d = f4 - 60.0f;
                f2 = ((float) Math.pow(d, -0.13320475816726685d)) * 329.69873f;
                log = ((float) Math.pow(d, 0.07551485300064087d)) * 288.12216f;
            } else {
                log = (((float) Math.log(f4)) * 99.4708f) - 161.11957f;
                f2 = 255.0f;
            }
            if (f4 < 66.0f) {
                if (f4 > 19.0f) {
                    f3 = (((float) Math.log(f4 - 10.0f)) * 138.51773f) - 305.0448f;
                } else {
                    f3 = 0.0f;
                }
            } else {
                f3 = 255.0f;
            }
            float min = Math.min(255.0f, Math.max(f2, 0.0f));
            float min2 = Math.min(255.0f, Math.max(log, 0.0f));
            float min3 = Math.min(255.0f, Math.max(f3, 0.0f));
            float min4 = Math.min(255.0f, Math.max(255.0f, 0.0f));
            float min5 = Math.min(255.0f, Math.max((((float) Math.log(50.0f)) * 99.4708f) - 161.11957f, 0.0f));
            float min6 = min3 / Math.min(255.0f, Math.max((((float) Math.log(40.0f)) * 138.51773f) - 305.0448f, 0.0f));
            float[] fArr = this.a;
            fArr[0] = min / min4;
            fArr[1] = 0.0f;
            fArr[2] = 0.0f;
            fArr[3] = 0.0f;
            fArr[4] = 0.0f;
            fArr[5] = 0.0f;
            fArr[6] = min2 / min5;
            fArr[7] = 0.0f;
            fArr[8] = 0.0f;
            fArr[9] = 0.0f;
            fArr[10] = 0.0f;
            fArr[11] = 0.0f;
            fArr[12] = min6;
            fArr[13] = 0.0f;
            fArr[14] = 0.0f;
            fArr[15] = 0.0f;
            fArr[16] = 0.0f;
            fArr[17] = 0.0f;
            fArr[18] = 1.0f;
            fArr[19] = 0.0f;
        }
    }

    public VM0(Context context) {
        super(context);
        this.b1 = new c();
        this.c1 = true;
        this.d1 = null;
        this.e1 = null;
        this.f1 = 0.0f;
        this.g1 = 0.0f;
        this.h1 = Float.NaN;
        this.l1 = new Drawable[2];
        this.n1 = Float.NaN;
        this.o1 = Float.NaN;
        this.p1 = Float.NaN;
        this.q1 = Float.NaN;
        d(context, null);
    }

    private void d(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.c.Y8);
            int indexCount = obtainStyledAttributes.getIndexCount();
            this.d1 = obtainStyledAttributes.getDrawable(j.c.Z8);
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == j.c.d9) {
                    this.f1 = obtainStyledAttributes.getFloat(index, 0.0f);
                } else if (index == j.c.m9) {
                    setWarmth(obtainStyledAttributes.getFloat(index, 0.0f));
                } else if (index == j.c.l9) {
                    setSaturation(obtainStyledAttributes.getFloat(index, 0.0f));
                } else if (index == j.c.c9) {
                    setContrast(obtainStyledAttributes.getFloat(index, 0.0f));
                } else if (index == j.c.b9) {
                    setBrightness(obtainStyledAttributes.getFloat(index, 0.0f));
                } else if (index == j.c.j9) {
                    setRound(obtainStyledAttributes.getDimension(index, 0.0f));
                } else if (index == j.c.k9) {
                    setRoundPercent(obtainStyledAttributes.getFloat(index, 0.0f));
                } else if (index == j.c.i9) {
                    setOverlay(obtainStyledAttributes.getBoolean(index, this.c1));
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
            this.e1 = drawable;
            if (this.d1 != null && drawable != null) {
                Drawable[] drawableArr = this.l1;
                Drawable mutate = getDrawable().mutate();
                this.e1 = mutate;
                drawableArr[0] = mutate;
                this.l1[1] = this.d1.mutate();
                LayerDrawable layerDrawable = new LayerDrawable(this.l1);
                this.m1 = layerDrawable;
                layerDrawable.getDrawable(1).setAlpha((int) (this.f1 * 255.0f));
                if (!this.c1) {
                    this.m1.getDrawable(0).setAlpha((int) ((1.0f - this.f1) * 255.0f));
                }
                super.setImageDrawable(this.m1);
                return;
            }
            Drawable drawable2 = getDrawable();
            this.e1 = drawable2;
            if (drawable2 != null) {
                Drawable[] drawableArr2 = this.l1;
                Drawable mutate2 = drawable2.mutate();
                this.e1 = mutate2;
                drawableArr2[0] = mutate2;
            }
        }
    }

    private void e() {
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

    private void g() {
        if (Float.isNaN(this.n1) && Float.isNaN(this.o1) && Float.isNaN(this.p1) && Float.isNaN(this.q1)) {
            setScaleType(ImageView.ScaleType.FIT_CENTER);
        } else {
            e();
        }
    }

    private void setOverlay(boolean z) {
        this.c1 = z;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
    }

    public float getBrightness() {
        return this.b1.d;
    }

    public float getContrast() {
        return this.b1.f;
    }

    public float getCrossfade() {
        return this.f1;
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
        return this.h1;
    }

    public float getRoundPercent() {
        return this.g1;
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
        e();
    }

    public void setAltImageDrawable(Drawable drawable) {
        Drawable mutate = drawable.mutate();
        this.d1 = mutate;
        Drawable[] drawableArr = this.l1;
        drawableArr[0] = this.e1;
        drawableArr[1] = mutate;
        LayerDrawable layerDrawable = new LayerDrawable(this.l1);
        this.m1 = layerDrawable;
        super.setImageDrawable(layerDrawable);
        setCrossfade(this.f1);
    }

    public void setAltImageResource(int i) {
        Drawable b2 = C3220Ic.b(getContext(), i);
        this.d1 = b2;
        setAltImageDrawable(b2);
    }

    public void setBrightness(float f) {
        c cVar = this.b1;
        cVar.d = f;
        cVar.c(this);
    }

    public void setContrast(float f) {
        c cVar = this.b1;
        cVar.f = f;
        cVar.c(this);
    }

    public void setCrossfade(float f) {
        this.f1 = f;
        if (this.l1 != null) {
            if (!this.c1) {
                this.m1.getDrawable(0).setAlpha((int) ((1.0f - this.f1) * 255.0f));
            }
            this.m1.getDrawable(1).setAlpha((int) (this.f1 * 255.0f));
            super.setImageDrawable(this.m1);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        if (this.d1 != null && drawable != null) {
            Drawable mutate = drawable.mutate();
            this.e1 = mutate;
            Drawable[] drawableArr = this.l1;
            drawableArr[0] = mutate;
            drawableArr[1] = this.d1;
            LayerDrawable layerDrawable = new LayerDrawable(this.l1);
            this.m1 = layerDrawable;
            super.setImageDrawable(layerDrawable);
            setCrossfade(this.f1);
            return;
        }
        super.setImageDrawable(drawable);
    }

    public void setImagePanX(float f) {
        this.n1 = f;
        g();
    }

    public void setImagePanY(float f) {
        this.o1 = f;
        g();
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageResource(int i) {
        if (this.d1 != null) {
            Drawable mutate = C3220Ic.b(getContext(), i).mutate();
            this.e1 = mutate;
            Drawable[] drawableArr = this.l1;
            drawableArr[0] = mutate;
            drawableArr[1] = this.d1;
            LayerDrawable layerDrawable = new LayerDrawable(this.l1);
            this.m1 = layerDrawable;
            super.setImageDrawable(layerDrawable);
            setCrossfade(this.f1);
            return;
        }
        super.setImageResource(i);
    }

    public void setImageRotate(float f) {
        this.q1 = f;
        g();
    }

    public void setImageZoom(float f) {
        this.p1 = f;
        g();
    }

    public void setRound(float f) {
        boolean z;
        if (Float.isNaN(f)) {
            this.h1 = f;
            float f2 = this.g1;
            this.g1 = -1.0f;
            setRoundPercent(f2);
            return;
        }
        if (this.h1 != f) {
            z = true;
        } else {
            z = false;
        }
        this.h1 = f;
        if (f != 0.0f) {
            if (this.i1 == null) {
                this.i1 = new Path();
            }
            if (this.k1 == null) {
                this.k1 = new RectF();
            }
            if (this.j1 == null) {
                b bVar = new b();
                this.j1 = bVar;
                setOutlineProvider(bVar);
            }
            setClipToOutline(true);
            this.k1.set(0.0f, 0.0f, getWidth(), getHeight());
            this.i1.reset();
            Path path = this.i1;
            RectF rectF = this.k1;
            float f3 = this.h1;
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
        if (this.g1 != f) {
            z = true;
        } else {
            z = false;
        }
        this.g1 = f;
        if (f != 0.0f) {
            if (this.i1 == null) {
                this.i1 = new Path();
            }
            if (this.k1 == null) {
                this.k1 = new RectF();
            }
            if (this.j1 == null) {
                a aVar = new a();
                this.j1 = aVar;
                setOutlineProvider(aVar);
            }
            setClipToOutline(true);
            int width = getWidth();
            int height = getHeight();
            float min = (Math.min(width, height) * this.g1) / 2.0f;
            this.k1.set(0.0f, 0.0f, width, height);
            this.i1.reset();
            this.i1.addRoundRect(this.k1, min, min, Path.Direction.CW);
        } else {
            setClipToOutline(false);
        }
        if (z) {
            invalidateOutline();
        }
    }

    public void setSaturation(float f) {
        c cVar = this.b1;
        cVar.e = f;
        cVar.c(this);
    }

    public void setWarmth(float f) {
        c cVar = this.b1;
        cVar.g = f;
        cVar.c(this);
    }

    public VM0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b1 = new c();
        this.c1 = true;
        this.d1 = null;
        this.e1 = null;
        this.f1 = 0.0f;
        this.g1 = 0.0f;
        this.h1 = Float.NaN;
        this.l1 = new Drawable[2];
        this.n1 = Float.NaN;
        this.o1 = Float.NaN;
        this.p1 = Float.NaN;
        this.q1 = Float.NaN;
        d(context, attributeSet);
    }

    public VM0(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.b1 = new c();
        this.c1 = true;
        this.d1 = null;
        this.e1 = null;
        this.f1 = 0.0f;
        this.g1 = 0.0f;
        this.h1 = Float.NaN;
        this.l1 = new Drawable[2];
        this.n1 = Float.NaN;
        this.o1 = Float.NaN;
        this.p1 = Float.NaN;
        this.q1 = Float.NaN;
        d(context, attributeSet);
    }
}
